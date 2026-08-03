package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class AG implements com.facebook.ads.redexgen.core.InterfaceC2132pF {
    public static java.lang.String[] A04 = {"DnWOFrWNtrruVDlZPcn7mSzqB1u3fyA1", "4khCAmOyD7V9Z9fo", "Y1he90jrlOSSnjRb2RN33xbae", "sN3uyyiAo7qwm0FA39xGDer", "C", "MIilbOvYRfmfRo2RH", "W4KUp4d37G5W3qTHHFYFOJnsXzg3Y9", "7BjcD7lz4UoePoP5n6bqbpOg1qjeNk3c"};
    public long A00;
    public android.net.Uri A01 = android.net.Uri.EMPTY;
    public java.util.Map<java.lang.String, java.util.List<java.lang.String>> A02 = java.util.Collections.emptyMap();
    public final com.facebook.ads.redexgen.core.InterfaceC2132pF A03;

    public AG(com.facebook.ads.redexgen.core.InterfaceC2132pF interfaceC2132pF) {
        this.A03 = (com.facebook.ads.redexgen.core.InterfaceC2132pF) com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC2132pF);
    }

    public final long A00() {
        return this.A00;
    }

    public final android.net.Uri A01() {
        return this.A01;
    }

    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A02() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void A43(com.facebook.ads.redexgen.core.InterfaceC04675t interfaceC04675t) {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(interfaceC04675t);
        this.A03.A43(interfaceC04675t);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final java.util.Map<java.lang.String, java.util.List<java.lang.String>> A8t() {
        return this.A03.A8t();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final android.net.Uri A9P() {
        return this.A03.A9P();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final long AGi(com.facebook.ads.redexgen.core.C04565i c04565i) throws java.io.IOException {
        this.A01 = c04565i.A06;
        this.A02 = java.util.Collections.emptyMap();
        long AGi = this.A03.AGi(c04565i);
        this.A01 = (android.net.Uri) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A9P());
        this.A02 = A8t();
        return AGi;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2132pF
    public final void close() throws java.io.IOException {
        this.A03.close();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC03762c
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int read = this.A03.read(bArr, i, i2);
        if (read != -1) {
            long j = this.A00;
            long j2 = read;
            java.lang.String[] strArr = A04;
            java.lang.String str = strArr[2];
            java.lang.String str2 = strArr[1];
            int length = str.length();
            int bytesRead = str2.length();
            if (length == bytesRead) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A04;
            strArr2[2] = "l8Xa62wp4MYShhMptlDz52jvD";
            strArr2[1] = "PdriuKYg1yn0hjm9";
            this.A00 = j + j2;
        }
        return read;
    }
}
