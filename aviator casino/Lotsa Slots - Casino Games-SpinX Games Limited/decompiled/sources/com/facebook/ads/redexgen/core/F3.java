package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class F3 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"hxRtgXLlXZBZOOikVlBghnrqRk8D", "kooIKi1fx1Hb2qPm3oF2lCQrgWRqeUq9", "tAS3MHwJkliRqJEhDeJC9YibHYE", "z1PlvRauaFfgQg02R7fRgUIUzlYZ", "X9uQKTEyJl", "tATbEztK", "lnp2iYjILHnNLb0EhQTEEhT3vvCpm0GE", "ASuPVfTQk0HiiSTBHvF2"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[1].charAt(21) == strArr[6].charAt(21)) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "l0wMWtKaafBi6h";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
            i4++;
        }
    }

    public static void A01() {
        A00 = new byte[]{-18, -31, -24, -31, -35, -17, -31, -32};
    }

    static {
        A01();
    }

    public static /* synthetic */ boolean A02(com.facebook.ads.redexgen.core.F3 f3) {
        throw new java.lang.NullPointerException(A00(0, 8, 28));
    }
}
