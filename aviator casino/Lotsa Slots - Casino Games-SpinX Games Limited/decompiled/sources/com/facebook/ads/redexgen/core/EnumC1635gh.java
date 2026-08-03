package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public enum EnumC1635gh {
    A03(A01(35, 4, 16)),
    A04(A01(39, 4, 41));

    public static byte[] A01;
    public java.lang.String A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 24);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{125, 110, 119, 119, 99, 68, 92, 75, 70, 67, 78, 10, 89, 79, 88, 92, 79, 88, 10, 88, 79, 89, 90, 69, 68, 89, 79, com.google.common.base.Ascii.DLE, 10, com.google.common.base.Ascii.SI, 89, 40, 38, 38, 51, 110, 125, 100, 100, 90, 84, 84, 65};
    }

    static {
        A02();
    }

    EnumC1635gh(java.lang.String str) {
        this.A00 = str;
    }

    public static com.facebook.ads.redexgen.core.EnumC1635gh A00(java.lang.String str) {
        for (com.facebook.ads.redexgen.core.EnumC1635gh enumC1635gh : values()) {
            if (enumC1635gh.A00.equals(str)) {
                return enumC1635gh;
            }
        }
        throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, A01(4, 27, 50), str));
    }
}
