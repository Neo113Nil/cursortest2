package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnAttachStateChangeListenerC1253aV implements android.view.View.OnAttachStateChangeListener {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1254aW A00;

    public ViewOnAttachStateChangeListenerC1253aV(com.facebook.ads.redexgen.core.C1254aW c1254aW) {
        this.A00 = c1254aW;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        android.widget.ImageView imageView;
        this.A00.A09();
        imageView = this.A00.A03;
        imageView.setOnClickListener(null);
    }
}
