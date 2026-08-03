package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.qy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC2227qy {
    A02,
    A05,
    A03,
    A04;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 89);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.SO, 3, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.FS, 88, 84, 76, 87, 80, 59, 48, 35, 48, 39, 109, 118, 115, 118, 119, 111, 118};
    }

    static {
        A01();
    }
}
