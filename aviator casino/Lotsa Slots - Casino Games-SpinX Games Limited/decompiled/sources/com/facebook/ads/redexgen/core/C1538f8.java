package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1538f8 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0644Dh A00;

    public C1538f8(com.facebook.ads.redexgen.core.C0644Dh c0644Dh) {
        this.A00 = c0644Dh;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.view.View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
