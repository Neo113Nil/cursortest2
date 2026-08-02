package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.b2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1011b2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ JU A00;

    public C1011b2(JU ju) {
        this.A00 = ju;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        view = this.A00.A0B;
        view.getLayoutParams().height = num.intValue();
        view2 = this.A00.A0B;
        view2.requestLayout();
    }
}
