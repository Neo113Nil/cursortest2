package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1304bK implements android.animation.LayoutTransition.TransitionListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1305bL A00;

    public C1304bK(com.facebook.ads.redexgen.core.C1305bL c1305bL) {
        this.A00 = c1305bL;
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void endTransition(android.animation.LayoutTransition layoutTransition, android.view.ViewGroup viewGroup, android.view.View view, int i) {
        ((com.facebook.ads.redexgen.core.AbstractC1299bF) this.A00.A00.A00).A09.setAlpha(1.0f);
        this.A00.A00.A00.A0Q.setAlpha(1.0f);
        this.A00.A00.A00.A0P.setAlpha(1.0f);
    }

    @Override // android.animation.LayoutTransition.TransitionListener
    public final void startTransition(android.animation.LayoutTransition layoutTransition, android.view.ViewGroup viewGroup, android.view.View view, int i) {
    }
}
