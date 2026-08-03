package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QZ {
    public static byte[] A06;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public com.facebook.ads.redexgen.core.RK A04;
    public com.facebook.ads.redexgen.core.RK A05;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 67);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{118, 122, 60, 40, 53, 55, 2, 103, com.google.common.base.Ascii.SO, 2, 68, 80, 77, 79, 123, com.google.common.base.Ascii.US, 76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, com.google.common.base.Ascii.SO, 5, com.google.common.base.Ascii.ETB, 40, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.FF, 4, 5, com.google.common.base.Ascii.DC2, 93, 86, 90, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.NAK, 34, 71, 71, 75, com.google.common.base.Ascii.US, 4, 50, 86, 109, 70, 79, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 73, 75, 103, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 65, 85, 65, 66, 74, 102, 65, 66, 74, 75, 92, 19};
    }

    public QZ(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.RK rk2) {
        this.A05 = rk;
        this.A04 = rk2;
    }

    public QZ(com.facebook.ads.redexgen.core.RK rk, com.facebook.ads.redexgen.core.RK rk2, int i, int i2, int i3, int i4) {
        this(rk, rk2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
    }

    public final java.lang.String toString() {
        return A00(40, 21, 109) + this.A05 + A00(16, 12, 35) + this.A04 + A00(0, 8, 25) + this.A00 + A00(8, 8, 97) + this.A01 + A00(28, 6, 57) + this.A02 + A00(34, 6, 40) + this.A03 + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ;
    }
}
