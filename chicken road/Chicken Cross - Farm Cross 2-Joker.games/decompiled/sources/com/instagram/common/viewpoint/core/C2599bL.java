package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;

/* renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2599bL extends AnimatorListenerAdapter {
    public final /* synthetic */ RunnableC2600bM A00;

    public C2599bL(RunnableC2600bM runnableC2600bM) {
        this.A00 = runnableC2600bM;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(250L);
        layoutTransition.setDuration(3, 0L);
        layoutTransition.addTransitionListener(new C2598bK(this));
        this.A00.A00.A0M.setLayoutTransition(layoutTransition);
        ((AbstractC2593bF) this.A00.A00).A09.setVisibility(8);
        this.A00.A00.A0Q.setVisibility(8);
        this.A00.A00.A0P.setVisibility(8);
    }
}
