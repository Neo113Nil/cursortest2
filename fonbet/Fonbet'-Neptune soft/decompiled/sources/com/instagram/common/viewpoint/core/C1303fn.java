package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.fn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1303fn extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C1302fm A00;
    public final /* synthetic */ C5G A01;

    public C1303fn(C1302fm c1302fm, C5G c5g) {
        this.A00 = c1302fm;
        this.A01 = c5g;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        this.A01.setAdViewabilityChecker(this.A00.A02.A1B());
        this.A00.A02.A1f(true, true);
    }
}
