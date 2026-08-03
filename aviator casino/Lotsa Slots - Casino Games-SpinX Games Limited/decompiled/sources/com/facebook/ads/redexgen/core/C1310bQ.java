package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1310bQ implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1311bR A00;

    public C1310bQ(com.facebook.ads.redexgen.core.C1311bR c1311bR) {
        this.A00 = c1311bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.widget.RelativeLayout relativeLayout;
        com.facebook.ads.redexgen.core.C1636gi c1636gi;
        this.A00.A06();
        relativeLayout = this.A00.A05;
        com.facebook.ads.redexgen.core.YB.A0O(relativeLayout, 8);
        c1636gi = this.A00.A07;
        c1636gi.A0F().ADG();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.A00.A01 = true;
    }
}
