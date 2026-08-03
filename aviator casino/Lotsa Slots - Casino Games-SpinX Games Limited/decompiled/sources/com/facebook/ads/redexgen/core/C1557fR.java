package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1557fR implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.DA A00;

    public C1557fR(com.facebook.ads.redexgen.core.DA da) {
        this.A00 = da;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.A00.A08(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A00 = null;
        this.A00.A01 = com.facebook.ads.redexgen.core.EnumC1549fJ.A02;
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
