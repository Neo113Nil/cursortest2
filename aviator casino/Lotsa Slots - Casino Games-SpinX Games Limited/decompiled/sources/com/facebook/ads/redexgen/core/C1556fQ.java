package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1556fQ implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.DB A02;

    public C1556fQ(com.facebook.ads.redexgen.core.DB db, int i, int i2) {
        this.A02 = db;
        this.A01 = i;
        this.A00 = i2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        android.animation.ValueAnimator valueAnimator;
        android.animation.ValueAnimator valueAnimator2;
        this.A02.A07(this.A00, this.A01, false);
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        int i;
        com.facebook.ads.redexgen.core.EnumC1549fJ enumC1549fJ;
        android.animation.ValueAnimator valueAnimator;
        android.animation.ValueAnimator valueAnimator2;
        com.facebook.ads.redexgen.core.DB db = this.A02;
        int i2 = this.A01;
        i = this.A02.A04;
        if (i2 == i) {
            enumC1549fJ = com.facebook.ads.redexgen.core.EnumC1549fJ.A02;
        } else {
            enumC1549fJ = com.facebook.ads.redexgen.core.EnumC1549fJ.A04;
        }
        db.A01 = enumC1549fJ;
        valueAnimator = this.A02.A00;
        if (valueAnimator != null) {
            valueAnimator2 = this.A02.A00;
            valueAnimator2.removeAllListeners();
            this.A02.A00 = null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
    }
}
