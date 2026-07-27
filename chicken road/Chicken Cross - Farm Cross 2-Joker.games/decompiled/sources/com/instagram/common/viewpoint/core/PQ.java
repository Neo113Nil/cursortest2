package com.instagram.common.viewpoint.core;

import android.R;

/* loaded from: assets/audience_network/classes2.dex */
public class PQ extends AbstractRunnableC2417Wc {
    public final /* synthetic */ AnimationAnimationListenerC2484Yu A00;

    public PQ(AnimationAnimationListenerC2484Yu animationAnimationListenerC2484Yu) {
        this.A00 = animationAnimationListenerC2484Yu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
