package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AV extends com.facebook.ads.redexgen.core.AbstractC2171pt {
    public static byte[] A01;
    public static final com.facebook.ads.redexgen.core.AnonymousClass23<com.facebook.ads.redexgen.core.AV> A02;
    public static final java.lang.String A03;
    public final float A00;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 75);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{com.google.common.base.Ascii.SYN, 3, com.google.common.base.Ascii.DC4, 5, 3, 8, com.google.common.base.Ascii.DC2, 70, com.google.common.base.Ascii.VT, 19, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 70, 4, 3, 70, com.google.common.base.Ascii.SI, 8, 70, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 3, 70, com.google.common.base.Ascii.DC4, 7, 8, 1, 3, 70, 9, 0, 70, kotlin.io.encoding.Base64.padSymbol, 86, 74, 70, 87, 86, 86, 59};
    }

    static {
        A03();
        A03 = com.facebook.ads.redexgen.core.C5C.A0h(1);
        A02 = new com.facebook.ads.redexgen.core.AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.q1
            @Override // com.facebook.ads.redexgen.core.AnonymousClass23
            public final com.facebook.ads.redexgen.core.AnonymousClass24 A6f(android.os.Bundle bundle) {
                com.facebook.ads.redexgen.core.AV A00;
                A00 = com.facebook.ads.redexgen.core.AV.A00(bundle);
                return A00;
            }
        };
    }

    public AV() {
        this.A00 = -1.0f;
    }

    public AV(float f) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A09(f >= 0.0f && f <= 100.0f, A02(0, 40, 45));
        this.A00 = f;
    }

    public static com.facebook.ads.redexgen.core.AV A00(android.os.Bundle bundle) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A07(bundle.getInt(com.facebook.ads.redexgen.core.AbstractC2171pt.A02, -1) == 1);
        float f = bundle.getFloat(A03, -1.0f);
        return f == -1.0f ? new com.facebook.ads.redexgen.core.AV() : new com.facebook.ads.redexgen.core.AV(f);
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.facebook.ads.redexgen.core.AV) && this.A00 == ((com.facebook.ads.redexgen.core.AV) obj).A00;
    }

    public final int hashCode() {
        return com.facebook.ads.redexgen.core.CB.A00(java.lang.Float.valueOf(this.A00));
    }
}
