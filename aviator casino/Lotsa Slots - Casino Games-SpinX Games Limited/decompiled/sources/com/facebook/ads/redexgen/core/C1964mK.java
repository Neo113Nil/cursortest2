package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1964mK implements com.facebook.ads.redexgen.core.InterfaceC0776Ik {
    public final /* synthetic */ com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor A00;

    public C1964mK(com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final void A4i(int i, int i2, com.facebook.ads.redexgen.core.InterfaceC1987ms interfaceC1987ms) throws java.io.IOException {
        this.A00.A0U(i, i2, interfaceC1987ms);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final void A6N(int i) throws com.facebook.ads.redexgen.core.C3K {
        this.A00.A0S(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final void A6a(int i, double d) throws com.facebook.ads.redexgen.core.C3K {
        this.A00.A0T(i, d);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final int A7u(int i) {
        return this.A00.A0R(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final void AAH(int i, long j) throws com.facebook.ads.redexgen.core.C3K {
        this.A00.A0V(i, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final boolean AAW(int i) {
        return this.A00.A0Y(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final void AK9(int i, long j, long j2) throws com.facebook.ads.redexgen.core.C3K {
        this.A00.A0W(i, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0776Ik
    public final void AKK(int i, java.lang.String str) throws com.facebook.ads.redexgen.core.C3K {
        this.A00.A0X(i, str);
    }
}
