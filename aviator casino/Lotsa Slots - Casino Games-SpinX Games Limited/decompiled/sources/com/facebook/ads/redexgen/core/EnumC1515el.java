package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.el, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1515el {
    A06(101),
    A09(102),
    A0A(103),
    A07(104),
    A08(105),
    A05(106),
    A04(107),
    A03(108);

    public static byte[] A01;
    public final int A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 118);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-67, -52, -59, -40, -63, -46, -69, -53, -62, -67, -40, -56, -57, -40, -67, -66, -52, -51, -53, -56, -46, -20, -5, -12, 7, -16, 1, -22, -6, -15, -20, 7, -5, -13, -15, -8, -66, -51, -60, -60, -53, -69, -54, -67, -67, -58, -41, -50, -63, -68, -67, -57, -41, -50, -63, -67, -49, -41, -57, -58, -41, -68, -67, -53, -52, -54, -57, -47, 2, 7, com.google.common.base.Ascii.CR, -2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 2, com.google.common.base.Ascii.CR, 2, -6, 5, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, 2, -3, -2, 8, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, 2, -2, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, -3, -2, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 8, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DLE, 7, com.google.common.base.Ascii.EM, 33, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, 6, 7, 17, 33, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, 7, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, 3, com.google.common.base.Ascii.SO, 33, com.google.common.base.Ascii.DLE, 9, com.google.common.base.Ascii.SYN, 33, 4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.SYN, 17, com.google.common.base.Ascii.DLE, 7, -2, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SI, 2, -3, -2, 8, com.google.common.base.Ascii.CAN, 2, 7, com.google.common.base.Ascii.CR, -2, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, 2, com.google.common.base.Ascii.CR, 2, -6, 5, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.CR, 8, 8, 5, -5, -6, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.CAN, -4, 5, 8, com.google.common.base.Ascii.FF, -2, com.google.common.base.Ascii.CAN, -4, 5, 2, -4, 4, -2, -3, -35, -48, -30, -52, -35, -49, -48, -49, -22, -31, -44, -49, -48, -38, -22, -33, -38, -38, -41, -51, -52, -35, -22, -50, -41, -38, -34, -48, -22, -50, -41, -44, -50, -42, -48, -49, -39, -47, -49, -42, -27, -42, -46, -37, -51, -49, -44};
    }

    static {
        A01();
    }

    EnumC1515el(int i) {
        this.A00 = i;
    }

    public final int A03() {
        return this.A00;
    }
}
