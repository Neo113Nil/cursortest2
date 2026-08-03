package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1622gU {
    A03(A01(37, 3, 126)),
    A04(A01(40, 7, 55));

    public static byte[] A01;
    public java.lang.String A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 117);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{48, 50, 58, 108, 75, 83, 68, 73, 76, 65, 5, 86, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 83, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 87, 5, 87, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 86, 85, 74, 75, 86, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.US, 5, 0, 86, 51, 40, 45, 40, 41, 49, 40, 106, 104, 96, 55, 44, 41, 44, 45, 53, 44};
    }

    static {
        A02();
    }

    EnumC1622gU(java.lang.String str) {
        this.A00 = str;
    }

    public static com.facebook.ads.redexgen.core.EnumC1622gU A00(java.lang.String str) {
        for (com.facebook.ads.redexgen.core.EnumC1622gU enumC1622gU : values()) {
            if (enumC1622gU.A00.equals(str)) {
                return enumC1622gU;
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A01(3, 27, 80), str));
    }
}
