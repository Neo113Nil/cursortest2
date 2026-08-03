package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.oU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2085oU {
    public static byte[] A03;
    public final java.lang.Object A00;
    public final java.lang.Object A01;
    public final java.lang.Object A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{com.google.common.base.Ascii.EM, 88, 87, 93, com.google.common.base.Ascii.EM, 85, 73, 113, 104, 112, 109, 116, 104, 97, 36, 97, 106, 112, 118, 109, 97, 119, 36, 115, 109, 112, 108, 36, 119, 101, 105, 97, 36, 111, 97, 125, 62, 36};
    }

    public C2085oU(java.lang.Object key, java.lang.Object value1, java.lang.Object value2) {
        this.A00 = key;
        this.A01 = value1;
        this.A02 = value2;
    }

    public final java.lang.IllegalArgumentException A02() {
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A00(6, 32, 74)).append(this.A00);
        java.lang.String A00 = A00(5, 1, 38);
        return new java.lang.IllegalArgumentException(append.append(A00).append(this.A01).append(A00(0, 5, 119)).append(this.A00).append(A00).append(this.A02).toString());
    }
}
