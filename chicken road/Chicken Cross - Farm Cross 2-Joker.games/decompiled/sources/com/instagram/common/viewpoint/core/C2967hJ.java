package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2967hJ extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C2966hI A00;
    public final /* synthetic */ AnonymousClass62 A01;

    public C2967hJ(C2966hI c2966hI, AnonymousClass62 anonymousClass62) {
        this.A00 = c2966hI;
        this.A01 = anonymousClass62;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1G());
        this.A00.A02.A1o(true, true);
    }
}
