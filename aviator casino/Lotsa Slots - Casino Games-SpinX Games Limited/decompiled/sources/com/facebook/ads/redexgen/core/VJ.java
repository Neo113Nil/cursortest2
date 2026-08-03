package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class VJ implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.VH A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.VI A01;

    public VJ(com.facebook.ads.redexgen.core.VI vi, com.facebook.ads.redexgen.core.VH vh) {
        this.A01 = vi;
        this.A00 = vh;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
