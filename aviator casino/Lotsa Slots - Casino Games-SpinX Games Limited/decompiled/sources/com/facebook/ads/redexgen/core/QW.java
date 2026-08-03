package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QW extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ android.view.View A02;
    public final /* synthetic */ android.view.ViewPropertyAnimator A03;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7P A04;
    public final /* synthetic */ com.facebook.ads.redexgen.core.RK A05;

    public QW(com.facebook.ads.redexgen.core.C7P c7p, com.facebook.ads.redexgen.core.RK rk, int i, android.view.View view, int i2, android.view.ViewPropertyAnimator viewPropertyAnimator) {
        this.A04 = c7p;
        this.A05 = rk;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A03.setListener(null);
        this.A04.A0U(this.A05);
        this.A04.A04.remove(this.A05);
        this.A04.A0b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
