package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ux, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1094Ux {
    A02,
    A03;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 55);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-80, -77, -91, -88, -83, -78, -85, 4, -9, -13, -10, com.google.common.base.Ascii.VT};
    }

    static {
        A01();
    }
}
