package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC1181Yl implements android.view.animation.Animation.AnimationListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x A00;

    public AnimationAnimationListenerC1181Yl(com.facebook.ads.redexgen.core.ViewOnClickListenerC04976x viewOnClickListenerC04976x) {
        this.A00 = viewOnClickListenerC04976x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        int i;
        android.os.Handler handler;
        java.lang.Runnable runnable;
        int i2;
        this.A00.A06();
        i = this.A00.A04;
        if (i > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i2 = this.A00.A04;
            handler.postDelayed(runnable, i2);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
    }
}
