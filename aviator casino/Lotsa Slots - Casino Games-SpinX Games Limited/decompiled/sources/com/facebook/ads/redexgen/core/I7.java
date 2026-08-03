package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class I7 extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public static byte[] A02;
    public static java.lang.String[] A03 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5S A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C4A A01;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 72);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{51, 4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC4, 3, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 81, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 5, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.GS, 8};
    }

    static {
        A01();
    }

    public I7(com.facebook.ads.redexgen.core.C5S c5s, com.facebook.ads.redexgen.core.C4A c4a) {
        this.A00 = c5s;
        this.A01 = c4a;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
        c0673Ek = this.A00.A0S;
        if (c0673Ek.getState() == com.facebook.ads.redexgen.core.EnumC1578fm.A02) {
            c0673Ek2 = this.A00.A0S;
            int currentPositionInMillis = c0673Ek2.getCurrentPositionInMillis();
            if (A03[2].length() != 8) {
                throw new java.lang.RuntimeException();
            }
            A03[7] = "iv52OwD8pgB4ao6bV3eWAeQD9PjHFRbz";
            if (currentPositionInMillis == A00()) {
                this.A00.A0S(A00(0, 22, 57));
            }
        }
    }
}
