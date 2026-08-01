package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.j1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3066j1 extends AbstractRunnableC2417Wc {
    public final /* synthetic */ AbstractC3065j0 A00;
    public final /* synthetic */ C2402Vm A01;

    public C3066j1(AbstractC3065j0 abstractC3065j0, C2402Vm c2402Vm) {
        this.A00 = abstractC3065j0;
        this.A01 = c2402Vm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        this.A00.A0B.A0F().A5g(this.A01.A03().getErrorCode(), this.A01.A04());
        if (this.A00.A07 != null) {
            this.A00.A07.A0G(this.A01);
        }
    }
}
