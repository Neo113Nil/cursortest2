package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1489eK {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 71);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-102, -110, -106, -107, -110, -108, -45, -30, -30, -47, -32, -45, -33, -41, -10, -9, 8, -5, -11, -9, -15, -1, 1, -10, -9, -2, -39, -36, -48, -50, -39, -46, -65, -61, 38, 42, com.google.common.base.Ascii.SYN, 45, com.google.common.base.Ascii.FS, 41, -10, -25, -8, -6, -12, -21, -8, -27, -21, -12, -22, -10, -11, -17, -12, -6, -31, -35, -46, -22, -46, -45, -35, -42, -48, -33, -46, -34, -42, -56, -72, -57, -70, -70, -61, -76, -67, -70, -66, -68, -67, -55, com.google.common.base.Ascii.SYN, 6, com.google.common.base.Ascii.NAK, 8, 8, 17, 2, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FF, 7, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.VT, -19, -34, -27, -39, -16, -33, -20, -19, -29, -23, -24, -1, -15, -1, -1, -11, -5, -6, -21, -11, -16};
    }

    public static java.util.Map<java.lang.String, java.lang.String> A01(com.facebook.ads.redexgen.core.T8 t8, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.facebook.ads.redexgen.core.C1059To c1059To = new com.facebook.ads.redexgen.core.C1059To(t8);
        int i = t8.getResources().getDisplayMetrics().widthPixels;
        int i2 = t8.getResources().getDisplayMetrics().heightPixels;
        hashMap.put(A00(105, 10, 69), t8.A09().A02());
        hashMap.put(A00(56, 13, 42), str2);
        hashMap.put(A00(40, 16, 63), str);
        hashMap.put(A00(14, 12, 75), java.lang.String.valueOf(c1059To.A09()));
        hashMap.put(A00(82, 12, 92), java.lang.String.valueOf((int) (i / com.facebook.ads.redexgen.core.XX.A02)));
        hashMap.put(A00(69, 13, 14), java.lang.String.valueOf((int) (i2 / com.facebook.ads.redexgen.core.XX.A02)));
        hashMap.put(A00(32, 2, 9), t8.A05().A9S());
        hashMap.put(A00(34, 6, 112), com.facebook.ads.redexgen.core.C1059To.A04);
        hashMap.put(A00(26, 6, 38), java.util.Locale.getDefault().toString());
        hashMap.put(A00(94, 11, 51), A00(0, 6, 29));
        hashMap.put(A00(6, 8, 43), c1059To.A05());
        return hashMap;
    }
}
