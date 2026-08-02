package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1203eA implements Animator.AnimatorListener {
    public final /* synthetic */ CU A00;

    public C1203eA(CU cu) {
        this.A00 = cu;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A09(false);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        this.A00.A01 = EnumC1194e1.A04;
        view = this.A00.A05;
        XP.A0F(view);
        this.A00.A04();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
