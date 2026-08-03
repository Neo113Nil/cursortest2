package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ym, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC1182Ym implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x A00;

    public AnimationAnimationListenerC1182Ym(com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x viewOnClickListenerC04976x) {
        this.A00 = viewOnClickListenerC04976x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        ((com.facebook.ads.redexgen.core.PZ) this.A00).A08.finish(16);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
