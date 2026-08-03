package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1297bD {
    A05(0),
    A04(1),
    A03(2);

    public static byte[] A01;
    public int A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 120);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{78, 67, 76, 70, 81, 65, 67, 82, 71, 56, 39, 58, 60, 58, 41, 33, 60, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 19, 6, 0, 10, 5, 10, 6, 7};
    }

    static {
        A02();
    }

    EnumC1297bD(int i) {
        this.A00 = i;
    }

    public static com.facebook.ads.redexgen.core.EnumC1297bD A00(int i) {
        for (com.facebook.ads.redexgen.core.EnumC1297bD enumC1297bD : values()) {
            if (enumC1297bD.A00 == i) {
                return enumC1297bD;
            }
        }
        return A04;
    }

    public final int A04() {
        return this.A00;
    }
}
