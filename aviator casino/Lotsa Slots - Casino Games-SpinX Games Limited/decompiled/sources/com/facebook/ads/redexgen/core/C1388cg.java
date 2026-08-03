package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1388cg extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0799Ji A00;
    public final /* synthetic */ boolean A01;

    public C1388cg(com.facebook.ads.redexgen.core.C0799Ji c0799Ji, boolean z) {
        this.A00 = c0799Ji;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        boolean z;
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.M3 m32;
        super.onAnimationEnd(animator);
        com.facebook.ads.redexgen.core.C0799Ji c0799Ji = this.A00;
        z = this.A00.A0D;
        c0799Ji.A0t(z, true);
        if (!this.A01) {
            m3 = this.A00.A08;
            if (m3 != null) {
                m32 = this.A00.A08;
                m32.destroy();
            }
        }
    }
}
