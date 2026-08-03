package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1238aG implements android.animation.Animator.AnimatorListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1241aJ A00;

    public C1238aG(com.facebook.ads.redexgen.core.C1241aJ c1241aJ) {
        this.A00 = c1241aJ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.A00.A04 = false;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        com.facebook.ads.redexgen.core.EnumC1247aP enumC1247aP;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        android.widget.ImageView imageView3;
        enumC1247aP = this.A00.A0H;
        if (enumC1247aP == com.facebook.ads.redexgen.core.EnumC1247aP.A04) {
            imageView2 = this.A00.A01;
            imageView2.setPadding(com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0S, com.facebook.ads.redexgen.core.XV.A00);
            imageView3 = this.A00.A01;
            imageView3.setVisibility(0);
            return;
        }
        imageView = this.A00.A01;
        imageView.setPadding(com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A0I, com.facebook.ads.redexgen.core.XV.A00);
    }
}
