package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC1190Yu implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0998Re A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PJ A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.PJ A02;

    public AnimationAnimationListenerC1190Yu(com.facebook.ads.redexgen.core.PJ pj, com.facebook.ads.redexgen.core.PJ pj2, com.facebook.ads.redexgen.core.C0998Re c0998Re) {
        this.A01 = pj;
        this.A02 = pj2;
        this.A00 = c0998Re;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        this.A01.A06 = false;
        com.facebook.ads.redexgen.core.YB.A0H(this.A02);
        new android.os.Handler().postDelayed(new com.facebook.ads.redexgen.core.PQ(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
