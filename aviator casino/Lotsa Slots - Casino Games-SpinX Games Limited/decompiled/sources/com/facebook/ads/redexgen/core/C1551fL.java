package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1551fL implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.DR A00;

    public C1551fL(com.facebook.ads.redexgen.core.DR dr) {
        this.A00 = dr;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.A00.A07(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A01 = null;
        this.A00.A02 = com.facebook.ads.redexgen.core.EnumC1549fJ.A02;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
