package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1770iz extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1823jz A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.O8 A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C05097j A02;

    public C1770iz(com.facebook.ads.redexgen.core.C05097j c05097j, com.facebook.ads.redexgen.core.O8 o8, com.facebook.ads.redexgen.core.C1823jz c1823jz) {
        this.A02 = c05097j;
        this.A01 = o8;
        this.A00 = c1823jz;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        com.facebook.ads.redexgen.core.C1108Vm A00 = com.facebook.ads.redexgen.core.C1108Vm.A00(com.facebook.ads.internal.protocol.AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
