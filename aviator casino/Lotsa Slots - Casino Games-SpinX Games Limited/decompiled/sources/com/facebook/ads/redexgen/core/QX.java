package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class QX extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ android.view.ViewPropertyAnimator A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.QZ A02;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C7P A03;

    public QX(com.facebook.ads.redexgen.core.C7P c7p, com.facebook.ads.redexgen.core.QZ qz, android.view.ViewPropertyAnimator viewPropertyAnimator, android.view.View view) {
        this.A03 = c7p;
        this.A02 = qz;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A01.setListener(null);
        this.A00.setAlpha(1.0f);
        this.A00.setTranslationX(0.0f);
        this.A00.setTranslationY(0.0f);
        this.A03.A0W(this.A02.A05, true);
        this.A03.A02.remove(this.A02.A05);
        this.A03.A0b();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
