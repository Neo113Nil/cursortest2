package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1369cN extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.KE A00;
    public final /* synthetic */ boolean A01;

    public C1369cN(com.facebook.ads.redexgen.core.KE ke, boolean z) {
        this.A00 = ke;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        com.facebook.ads.redexgen.core.C1385cd c1385cd;
        com.facebook.ads.redexgen.core.DZ dz;
        com.facebook.ads.redexgen.core.AbstractC1801jd abstractC1801jd;
        com.facebook.ads.redexgen.core.DZ dz2;
        com.facebook.ads.redexgen.core.DZ dz3;
        com.facebook.ads.redexgen.core.M3 m3;
        com.facebook.ads.redexgen.core.M3 m32;
        super.onAnimationEnd(animator);
        c1385cd = this.A00.A0K;
        c1385cd.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01) {
            m3 = this.A00.A0I;
            if (m3 != null) {
                m32 = this.A00.A0I;
                m32.destroy();
            }
        }
        dz = this.A00.A0g;
        if (dz != null) {
            abstractC1801jd = this.A00.A0E;
            if (!abstractC1801jd.A1i()) {
                dz3 = this.A00.A0g;
                dz3.setVisibility(this.A01 ? 8 : 0);
            } else {
                dz2 = this.A00.A0g;
                dz2.setVisibility(8);
            }
        }
    }
}
