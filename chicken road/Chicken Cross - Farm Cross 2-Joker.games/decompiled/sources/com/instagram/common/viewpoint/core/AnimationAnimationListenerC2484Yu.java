package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC2484Yu implements Animation.AnimationListener {
    public final /* synthetic */ C2292Re A00;
    public final /* synthetic */ PJ A01;
    public final /* synthetic */ PJ A02;

    public AnimationAnimationListenerC2484Yu(PJ pj, PJ pj2, C2292Re c2292Re) {
        this.A01 = pj;
        this.A02 = pj2;
        this.A00 = c2292Re;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A06 = false;
        YB.A0H(this.A02);
        new Handler().postDelayed(new PQ(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
