package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public enum XJ {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{99, 100, 99, 126, 99, 107, 102, 99, 112, 111, 110, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC2, 1, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, 2, 9, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, 2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.FF, 19, com.google.common.base.Ascii.DC2};
    }

    static {
        A01();
    }
}
