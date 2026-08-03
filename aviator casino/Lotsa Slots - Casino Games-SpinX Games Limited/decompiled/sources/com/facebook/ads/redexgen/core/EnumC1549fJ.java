package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1549fJ {
    A03,
    A02,
    A05,
    A04;

    public static byte[] A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{com.google.common.base.Ascii.FS, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.FS, 9, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.EM, 107, 100, 99, 103, 107, 126, 99, 100, 109, 107, 124, 111, 124, 107, 106, 124, 102, 120, 119, 112, 116, 120, 109, 124, 125, 91, 76, 95, 76, 91, 90, 76, 86, 72, 71, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 68, 72, 93, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 71, 78};
    }

    static {
        A01();
    }
}
