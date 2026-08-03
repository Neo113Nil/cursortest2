package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0828Kl extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC1321bb A00;

    public C0828Kl(com.facebook.ads.redexgen.core.AbstractC1321bb abstractC1321bb) {
        this.A00 = abstractC1321bb;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        java.lang.Runnable runnable;
        int i;
        this.A00.setPressed(false);
        com.facebook.ads.redexgen.core.AbstractC1321bb abstractC1321bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC1321bb.postOnAnimationDelayed(runnable, i);
    }
}
