package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ft, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0431Ft extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C4H A00;

    public C0431Ft(C4H c4h) {
        this.A00 = c4h;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        AbstractC0987ae abstractC0987ae;
        AbstractC0987ae abstractC0987ae2;
        abstractC0987ae = this.A00.A00;
        if (abstractC0987ae != null) {
            abstractC0987ae2 = this.A00.A00;
            if (abstractC0987ae2.A1L()) {
                ((G2) this.A00).A01 = true;
                this.A00.A08.setToolbarActionMode(8);
            }
        }
    }
}
