package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1439dV implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5F A00;

    public C1439dV(com.facebook.ads.redexgen.core.C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek;
        com.facebook.ads.redexgen.core.C0673Ek c0673Ek2;
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        c0673Ek = this.A00.A0b;
        c0673Ek.getLayoutParams().height = num.intValue();
        c0673Ek2 = this.A00.A0b;
        c0673Ek2.requestLayout();
    }
}
