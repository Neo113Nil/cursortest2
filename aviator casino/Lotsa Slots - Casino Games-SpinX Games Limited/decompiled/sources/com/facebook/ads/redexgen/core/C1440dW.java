package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.dW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1440dW extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C5F A00;
    public final /* synthetic */ boolean A01;

    public C1440dW(com.facebook.ads.redexgen.core.C5F c5f, boolean z) {
        this.A00 = c5f;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.facebook.ads.redexgen.core.C1385cd c1385cd;
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.M3 m32;
        super.onAnimationEnd(animator);
        c1385cd = this.A00.A0H;
        c1385cd.setTranslationY(0.0f);
        this.A00.A0V();
        if (!this.A01) {
            m3 = this.A00.A0G;
            if (m3 != null) {
                m32 = this.A00.A0G;
                m32.destroy();
            }
        }
    }
}
