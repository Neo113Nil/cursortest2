package com.instagram.common.viewpoint.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC2417Wc {
    public final /* synthetic */ InterfaceC2752dp A00;
    public final /* synthetic */ C2753dq A01;

    public GX(C2753dq c2753dq, InterfaceC2752dp interfaceC2752dp) {
        this.A01 = c2753dq;
        this.A00 = interfaceC2752dp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC2417Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
