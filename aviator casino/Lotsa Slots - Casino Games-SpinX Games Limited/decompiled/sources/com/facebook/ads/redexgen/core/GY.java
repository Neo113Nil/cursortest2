package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class GY extends com.facebook.ads.redexgen.core.YA {
    public final /* synthetic */ com.facebook.ads.redexgen.core.GX A00;

    public GY(com.facebook.ads.redexgen.core.GX gx) {
        this.A00 = gx;
    }

    @Override // com.facebook.ads.redexgen.core.YA, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        com.facebook.ads.redexgen.core.YB.A0H(this.A00.A01);
        this.A00.A00.AEL();
    }
}
