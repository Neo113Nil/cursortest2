package com.instagram.common.viewpoint.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2603bP implements Animator.AnimatorListener {
    public final /* synthetic */ C2605bR A00;

    public C2603bP(C2605bR c2605bR) {
        this.A00 = c2605bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2930gi c2930gi;
        this.A00.A06();
        this.A00.A02 = true;
        c2930gi = this.A00.A07;
        c2930gi.A0F().ADF();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
