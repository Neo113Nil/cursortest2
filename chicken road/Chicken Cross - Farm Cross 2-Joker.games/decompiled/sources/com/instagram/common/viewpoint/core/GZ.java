package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GZ extends AbstractRunnableC2417Wc {
    public final /* synthetic */ C17394x A00;

    public GZ(C17394x c17394x) {
        this.A00 = c17394x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        AbstractC2643c3 abstractC2643c3;
        AbstractC2643c3 abstractC2643c32;
        abstractC2643c3 = this.A00.A00;
        if (abstractC2643c3 != null) {
            abstractC2643c32 = this.A00.A00;
            if (abstractC2643c32.A1N()) {
                ((AbstractC2017Gj) this.A00).A02 = true;
                this.A00.A09.setToolbarActionMode(8);
            }
        }
    }
}
