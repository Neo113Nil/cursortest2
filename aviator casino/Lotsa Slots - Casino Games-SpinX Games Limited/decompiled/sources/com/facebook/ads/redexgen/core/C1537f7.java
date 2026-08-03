package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.f7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1537f7 extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C04003c A00;

    public C1537f7(com.facebook.ads.redexgen.core.C04003c c04003c) {
        this.A00 = c04003c;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        android.os.Handler handler;
        handler = this.A00.A00.A04;
        handler.postDelayed(new com.facebook.ads.redexgen.core.C0645Di(this), 2000L);
    }
}
