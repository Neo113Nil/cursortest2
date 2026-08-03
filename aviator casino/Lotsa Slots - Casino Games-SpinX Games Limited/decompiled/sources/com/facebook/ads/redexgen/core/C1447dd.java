package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1447dd implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AnonymousClass55 A00;

    public C1447dd(com.facebook.ads.redexgen.core.AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
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
