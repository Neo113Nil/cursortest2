package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AI implements com.facebook.ads.redexgen.core.InterfaceC2132pF {
    public static byte[] A00;
    public static final com.facebook.ads.redexgen.core.C5Y A01;
    public static final com.facebook.ads.redexgen.core.AI A02;

    public static /* synthetic */ com.facebook.ads.redexgen.core.AI A00() {
        return new com.facebook.ads.redexgen.core.AI();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 126);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{com.google.common.base.Ascii.ETB, 43, 38, 36, 34, 47, 40, 43, 35, 34, 53, 3, 38, 51, 38, com.google.common.base.Ascii.DC4, 40, 50, 53, 36, 34, 103, 36, 38, 41, 41, 40, 51, 103, 37, 34, 103, 40, 55, 34, 41, 34, 35};
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final /* synthetic */ java.util.Map A8t() {
        return com.facebook.ads.redexgen.core.C5X.A00(this);
    }

    static {
        A02();
        A02 = new com.facebook.ads.redexgen.core.AI();
        A01 = new com.facebook.ads.redexgen.core.C5Y() { // from class: com.facebook.ads.redexgen.X.p4
            @Override // com.facebook.ads.redexgen.core.C5Y
            public final com.facebook.ads.redexgen.core.InterfaceC2132pF A5I() {
                return com.facebook.ads.redexgen.core.AI.A00();
            }
        };
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        throw new java.io.IOException(A01(0, 38, 57));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) {
        throw new java.lang.UnsupportedOperationException();
    }
}
