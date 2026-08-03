package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1559fT implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ android.view.View A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.DA A01;

    public C1559fT(com.facebook.ads.redexgen.core.DA da, android.view.View view) {
        this.A01 = da;
        this.A00 = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int value = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        this.A00.setTranslationY(value);
    }
}
