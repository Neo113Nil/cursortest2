package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2733dV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5F A00;

    public C2733dV(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C1967Ek c1967Ek;
        C1967Ek c1967Ek2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        c1967Ek = this.A00.A0b;
        c1967Ek.getLayoutParams().height = num.intValue();
        c1967Ek2 = this.A00.A0b;
        c1967Ek2.requestLayout();
    }
}
