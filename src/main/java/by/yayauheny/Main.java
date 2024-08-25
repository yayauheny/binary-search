package by.yayauheny;

public class Main {
    public static void main(String[] args) {
        int result = search(new int[]{1, 3, 5, 6, 9}, 99);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}