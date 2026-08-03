package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public enum OD {
    A02,
    A06,
    A05,
    A07,
    A08,
    A03,
    A04;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{5, com.google.common.base.Ascii.DC4, 3, 7, com.google.common.base.Ascii.DC2, 3, 2, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.SI, 8, com.google.common.base.Ascii.SO, 19, 5, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, 10, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.GS, 0, com.google.common.base.Ascii.GS, 101, 102, 104, 109, 108, 109, 53, 54, 56, kotlin.io.encoding.Base64.padSymbol, 48, 55, 62, 46, 53, 50, 42, 52, 51, 58, com.google.common.base.Ascii.FS, 7, 0, com.google.common.base.Ascii.CAN, 1};
    }

    static {
        A01();
    }
}
