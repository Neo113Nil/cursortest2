package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class Y9 extends android.view.ViewOutlineProvider {
    public final /* synthetic */ float A00;

    public Y9(float f) {
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
