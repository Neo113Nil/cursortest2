package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class XX {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"oiur5Gbx9Vkb8pNp9gZzU2heRSdk76uI", "KcefTCcuaU05Z9sCY8CUGAfDHno7A6Wv", "bJXbqvk5sb1jFzs2YeQkTjOgq4", "MXk0dIH8gF0Kt4EkqgzdHodGFIc", "5Jwp5xVo7ldrls8e1BLn8Q9HzbIas5MN", "BGKorZg39BSfa4B", "tbwfvdKmgBKRGshTqqnFkMc0Pskkyh5R", "DBfe4K11V"};
    public static final float A02;
    public static final float A03;
    public static final android.util.DisplayMetrics A04;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 101);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{46, 32, 37, com.google.common.base.Ascii.ESC, 38, 46};
    }

    static {
        A02();
        A04 = android.content.res.Resources.getSystem().getDisplayMetrics();
        A02 = A04.density;
        A03 = A04.scaledDensity / 1.3f;
    }

    public static int A00(android.content.Context context) {
        android.view.WindowManager windowManager = (android.view.WindowManager) context.getSystemService(A01(0, 6, 82));
        if (windowManager == null) {
            return 13;
        }
        switch (windowManager.getDefaultDisplay().getOrientation()) {
            case 0:
                return 1;
            case 1:
                return 0;
            case 2:
                if (A01[2].length() != 26) {
                    throw new java.lang.RuntimeException();
                }
                A01[4] = "CVXSSTaTyGD8rGam3jI5MG2HGxoF6OEi";
                return 9;
            case 3:
                return 8;
            default:
                return 13;
        }
    }
}
