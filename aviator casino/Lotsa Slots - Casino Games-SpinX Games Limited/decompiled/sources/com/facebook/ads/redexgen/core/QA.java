package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QA extends com.facebook.ads.redexgen.core.YA {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ android.view.animation.ScaleAnimation A01;

    public QA(android.view.View view, android.view.animation.ScaleAnimation scaleAnimation) {
        this.A00 = view;
        this.A01 = scaleAnimation;
    }

    @Override // com.facebook.ads.redexgen.core.YA, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        this.A00.startAnimation(this.A01);
    }
}
