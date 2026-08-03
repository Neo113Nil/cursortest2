package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1554fO extends android.animation.AnimatorListenerAdapter {
    public static java.lang.String[] A01 = {"TrZNDxp7XgPrLwMeMcKKV4LE6uuIfYVU", "ULEyXJCc47teQ6YZ0eXPV0V7C", "At5pbwNHr2LiheLI", "DEC0Eom9qK7OI0oKL1WQ5oYEbz9lc5Gt", "Go2f3K9Z", "jmF0Wp1VVfzp13IVqL", "AKLTgtcpjio1lTTBDL2vrOjYxOjCOJfp", "yZ5UHZcmQhcxGg9JLD5yPnSTYa225zYb"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.DQ A00;

    public C1554fO(com.facebook.ads.redexgen.core.DQ dq) {
        this.A00 = dq;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        boolean z;
        android.view.View view;
        android.view.ViewPropertyAnimator viewPropertyAnimator;
        android.view.ViewPropertyAnimator viewPropertyAnimator2;
        android.view.View view2;
        z = this.A00.A04;
        if (z) {
            view2 = this.A00.A03;
            com.facebook.ads.redexgen.core.YB.A0H(view2);
        }
        com.facebook.ads.redexgen.core.DQ dq = this.A00;
        if (A01[5].length() == 4) {
            throw new java.lang.RuntimeException();
        }
        A01[2] = "6jsFEd17ts6f8PQH6w";
        view = dq.A03;
        view.setAlpha(0.0f);
        this.A00.A01 = com.facebook.ads.redexgen.core.EnumC1549fJ.A04;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.ViewPropertyAnimator viewPropertyAnimator;
        android.view.ViewPropertyAnimator viewPropertyAnimator2;
        this.A00.A01 = com.facebook.ads.redexgen.core.EnumC1549fJ.A02;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }
}
