package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1555fP extends android.animation.AnimatorListenerAdapter {
    public static java.lang.String[] A01 = {"GafIPb7LWAiViAmPwlKEWLDLjss8g6Ws", "GmgIBltz4NMSrZrLjhCSQUR2lVK3nFE3", "EM6stZgjBHDzdWE7fS4BkrJy", "N0axt6y48e2BEk8smmzy4ee5", "dltbLtM4ojsXN2KUcmFBCOrEHNkSvQMG", "uja4KtsxSl5i0Xy4u8CYRakEDe0zRqlk", "vzw9JeJO1xcQXP0eAZjCAk8tucW9kQEs", "5sufJRWLYSrz8Qvpedy6kGMFzpd6V4cT"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.DQ A00;

    public C1555fP(com.facebook.ads.redexgen.core.DQ dq) {
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
            com.facebook.ads.redexgen.core.YB.A0L(view2);
        }
        view = this.A00.A03;
        view.setAlpha(1.0f);
        this.A00.A01 = com.facebook.ads.redexgen.core.EnumC1549fJ.A02;
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            java.lang.String[] strArr = A01;
            if (strArr[2].length() != strArr[3].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[7] = "SL0VqGGoYjOg4No5xWkpM0ju1xWwOnF6";
            this.A00.A00 = null;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        boolean z;
        android.view.ViewPropertyAnimator viewPropertyAnimator;
        android.view.ViewPropertyAnimator viewPropertyAnimator2;
        android.view.View view;
        z = this.A00.A04;
        if (z) {
            view = this.A00.A03;
            com.facebook.ads.redexgen.core.YB.A0H(view);
        }
        this.A00.A01 = com.facebook.ads.redexgen.core.EnumC1549fJ.A04;
        java.lang.String[] strArr = A01;
        if (strArr[4].charAt(13) == strArr[1].charAt(13)) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "UFxXeO2yYsCLDJeld9s6oynUImAPkk9q";
        viewPropertyAnimator = this.A00.A00;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator2 = this.A00.A00;
            viewPropertyAnimator2.setListener(null);
            this.A00.A00 = null;
        }
    }
}
