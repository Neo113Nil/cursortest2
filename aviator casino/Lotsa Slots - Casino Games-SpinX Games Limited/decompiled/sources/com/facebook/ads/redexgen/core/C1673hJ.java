package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.hJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1673hJ extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1672hI A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass62 A01;

    public C1673hJ(com.facebook.ads.redexgen.core.C1672hI c1672hI, com.facebook.ads.redexgen.core.AnonymousClass62 anonymousClass62) {
        this.A00 = c1672hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
