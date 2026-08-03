package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AH implements com.facebook.ads.redexgen.core.InterfaceC2132pF {
    public static byte[] A03;
    public final int A00;
    public final com.facebook.ads.redexgen.core.AbstractC04013d A01;
    public final com.facebook.ads.redexgen.core.InterfaceC2132pF A02;

    static {
        A01();
    }

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{1, 3, 0, -12, -10, -10, -11, -32, 3, -27, -7, 3, 0, 8};
    }

    public AH(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF, com.facebook.ads.redexgen.core.AbstractC04013d abstractC04013d, int i) {
        this.A02 = (com.facebook.ads.redexgen.core.InterfaceC2132pF) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC2132pF);
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(abstractC04013d);
        this.A01 = null;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC04675t);
        this.A02.A43(interfaceC04675t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A8t() {
        return this.A02.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        return this.A02.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        throw new java.lang.NullPointerException(A00(0, 14, 104));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() throws java.io.IOException {
        this.A02.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        throw new java.lang.NullPointerException(A00(0, 14, 104));
    }
}
