package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QU extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ android.view.ViewPropertyAnimator A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7P A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.RK A03;

    public QU(com.facebook.ads.redexgen.core.C7P c7p, com.facebook.ads.redexgen.core.RK rk, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.A02 = c7p;
        this.A03 = rk;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A01.setListener(null);
        this.A00.setAlpha(1.0f);
        this.A02.A0V(this.A03);
        this.A02.A06.remove(this.A03);
        this.A02.A0b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
