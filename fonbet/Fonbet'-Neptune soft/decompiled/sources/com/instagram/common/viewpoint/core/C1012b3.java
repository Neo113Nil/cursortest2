package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1012b3 extends AnimatorListenerAdapter {
    public final /* synthetic */ JU A00;
    public final /* synthetic */ boolean A01;

    public C1012b3(JU ju, boolean z) {
        this.A00 = ju;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1028bJ c1028bJ;
        C0356Cw c0356Cw;
        AbstractC1428hy abstractC1428hy;
        C0356Cw c0356Cw2;
        C0356Cw c0356Cw3;
        LJ lj;
        LJ lj2;
        super.onAnimationEnd(animator);
        c1028bJ = this.A00.A0O;
        c1028bJ.setTranslationY(0.0f);
        this.A00.A0W();
        if (!this.A01) {
            lj = this.A00.A0L;
            if (lj != null) {
                lj2 = this.A00.A0L;
                lj2.destroy();
            }
        }
        c0356Cw = this.A00.A0m;
        if (c0356Cw != null) {
            abstractC1428hy = this.A00.A0H;
            if (!abstractC1428hy.A1a()) {
                c0356Cw3 = this.A00.A0m;
                c0356Cw3.setVisibility(this.A01 ? 8 : 0);
            } else {
                c0356Cw2 = this.A00.A0m;
                c0356Cw2.setVisibility(8);
            }
        }
    }
}
