package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1921lc implements com.facebook.ads.redexgen.core.InterfaceC0800Jj {
    public final com.facebook.ads.redexgen.core.KM A00;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> A01;
    public final java.util.Map<java.lang.String, java.lang.String> A02;
    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KN> A03;
    public final long[] A04;

    public C1921lc(com.facebook.ads.redexgen.core.KM km, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KT> map, java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.KN> map2, java.util.Map<java.lang.String, java.lang.String> imageMap) {
        this.A00 = km;
        this.A03 = map2;
        this.A02 = imageMap;
        this.A01 = map != null ? java.util.Collections.unmodifiableMap(map) : java.util.Collections.emptyMap();
        this.A04 = km.A0G();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final java.util.List<com.facebook.ads.redexgen.core.C2146pT> A7X(long j) {
        return this.A00.A0E(j, this.A01, this.A03, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final long A83(int i) {
        return this.A04[i];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A84() {
        return this.A04.length;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0800Jj
    public final int A8a(long j) {
        int A0K = com.facebook.ads.redexgen.core.C5C.A0K(this.A04, j, false, false);
        int index = this.A04.length;
        if (A0K < index) {
            return A0K;
        }
        return -1;
    }
}
