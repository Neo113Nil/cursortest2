package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public enum SW {
    A08,
    A04,
    A02,
    A06,
    A07,
    A05,
    A03,
    A09;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 122);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{10, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, 9, com.google.common.base.Ascii.SUB, -32, -51, -32, -6, -17, -32, -18, -17, 57, 53, 39, 52, -54, -53, -37, -61, -55, -49, 41, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 35, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.SUB, 43, 32, 38, 37, 39, com.google.common.base.Ascii.EM, 38, 42, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.FS, 17, 10, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.CR, 40, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US};
    }

    static {
        A01();
    }
}
