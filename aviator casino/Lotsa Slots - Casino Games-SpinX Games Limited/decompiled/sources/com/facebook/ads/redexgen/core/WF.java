package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public enum WF {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{42, 47, 56, 122, 109, 109, 112, 109, 6, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.FS, 4, com.google.common.base.Ascii.GS};
    }

    static {
        A01();
    }
}
