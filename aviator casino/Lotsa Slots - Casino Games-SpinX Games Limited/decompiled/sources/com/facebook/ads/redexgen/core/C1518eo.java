package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1518eo extends android.view.ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1520eq A01;

    public C1518eo(com.facebook.ads.redexgen.core.C1520eq c1520eq, float f) {
        this.A01 = c1520eq;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.A00);
    }
}
