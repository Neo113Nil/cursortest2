package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GX extends com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc {
    public final /* synthetic */ com.facebook.ads.redexgen.core.InterfaceC1458dp A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1459dq A01;

    public GX(com.facebook.ads.redexgen.core.C1459dq c1459dq, com.facebook.ads.redexgen.core.InterfaceC1458dp interfaceC1458dp) {
        this.A01 = c1459dq;
        this.A00 = interfaceC1458dp;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC1123Wc
    public final void A07() {
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new android.view.animation.AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new com.facebook.ads.redexgen.core.GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
