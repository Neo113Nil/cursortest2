package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class PQ extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnimationAnimationListenerC1190Yu A00;

    public PQ(com.facebook.ads.redexgen.core.AnimationAnimationListenerC1190Yu animationAnimationListenerC1190Yu) {
        this.A00 = animationAnimationListenerC1190Yu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
