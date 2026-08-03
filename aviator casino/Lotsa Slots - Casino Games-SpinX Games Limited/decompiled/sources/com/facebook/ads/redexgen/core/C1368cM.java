package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cM, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1368cM implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;

    public C1368cM(com.facebook.ads.redexgen.core.KE ke) {
        this.A00 = ke;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.view.View view;
        android.view.View view2;
        android.view.View view3;
        java.lang.Integer num = (java.lang.Integer) valueAnimator.getAnimatedValue();
        view = this.A00.A09;
        if (view != null) {
            view2 = this.A00.A09;
            view2.getLayoutParams().height = num.intValue();
            view3 = this.A00.A09;
            view3.requestLayout();
        }
    }
}
