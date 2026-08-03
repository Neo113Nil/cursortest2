package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1558fS implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.DA A00;

    public C1558fS(com.facebook.ads.redexgen.core.DA da) {
        this.A00 = da;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view;
        this.A00.A01 = com.facebook.ads.redexgen.core.EnumC1549fJ.A04;
        view = this.A00.A05;
        com.facebook.ads.redexgen.core.YB.A0H(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
