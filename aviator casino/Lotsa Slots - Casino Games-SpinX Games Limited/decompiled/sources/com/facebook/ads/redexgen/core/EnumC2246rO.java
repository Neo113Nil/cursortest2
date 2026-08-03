package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.rO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2246rO {
    A02,
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
        A00 = new byte[]{79, 68, 87, 68, 83, 94, 83, 68, 70, 72, 82, 85, 68, 83, 68, 69, 115, 100, 102, 104, 114, 117, 100, 115, 100, 101, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.DC2, 8, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, 9, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.US};
    }

    static {
        A01();
    }
}
