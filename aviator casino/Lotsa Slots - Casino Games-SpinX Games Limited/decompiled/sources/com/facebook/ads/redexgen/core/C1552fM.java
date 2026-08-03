package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1552fM implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.DR A00;

    public C1552fM(com.facebook.ads.redexgen.core.DR dr) {
        this.A00 = dr;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        android.animation.ValueAnimator valueAnimator;
        android.animation.ValueAnimator valueAnimator2;
        this.A00.A08(false);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view;
        android.animation.ValueAnimator valueAnimator;
        android.animation.ValueAnimator valueAnimator2;
        this.A00.A02 = com.facebook.ads.redexgen.core.EnumC1549fJ.A04;
        view = this.A00.A05;
        com.facebook.ads.redexgen.core.YB.A0H(view);
        valueAnimator = this.A00.A01;
        if (valueAnimator != null) {
            valueAnimator2 = this.A00.A01;
            valueAnimator2.removeAllListeners();
            this.A00.A01 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
