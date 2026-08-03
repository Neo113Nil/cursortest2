package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1305bL extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.RunnableC1306bM A00;

    public C1305bL(com.facebook.ads.redexgen.core.RunnableC1306bM runnableC1306bM) {
        this.A00 = runnableC1306bM;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.animation.LayoutTransition layoutTransition = new android.animation.LayoutTransition();
        layoutTransition.setDuration(250L);
        layoutTransition.setDuration(3, 0L);
        layoutTransition.addTransitionListener(new com.facebook.ads.redexgen.core.C1304bK(this));
        this.A00.A00.A0M.setLayoutTransition(layoutTransition);
        ((com.facebook.ads.redexgen.core.AbstractC1299bF) this.A00.A00).A09.setVisibility(8);
        this.A00.A00.A0Q.setVisibility(8);
        this.A00.A00.A0P.setVisibility(8);
    }
}
