package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1553fN implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.DR A01;

    public C1553fN(com.facebook.ads.redexgen.core.DR dr, android.view.View view) {
        this.A01 = dr;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        android.view.ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
        layoutParams.height = intValue;
        this.A00.setLayoutParams(layoutParams);
    }
}
