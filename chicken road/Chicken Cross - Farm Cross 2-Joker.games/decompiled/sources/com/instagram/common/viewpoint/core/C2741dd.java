package com.instagram.common.viewpoint.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2741dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass55 A00;

    public C2741dd(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
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
