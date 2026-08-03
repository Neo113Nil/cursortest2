package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Pf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnApplyWindowInsetsListenerC0951Pf implements android.view.View.OnApplyWindowInsetsListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.PR A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C0n A01;

    public ViewOnApplyWindowInsetsListenerC0951Pf(com.facebook.ads.redexgen.core.C0n c0n, com.facebook.ads.redexgen.core.PR pr) {
        this.A01 = c0n;
        this.A00 = pr;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        com.facebook.ads.redexgen.core.C0967Py compatInsets = this.A00.ACw(view, com.facebook.ads.redexgen.core.C0967Py.A00(windowInsets));
        return (android.view.WindowInsets) com.facebook.ads.redexgen.core.C0967Py.A01(compatInsets);
    }
}
