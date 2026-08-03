package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.en, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1517en extends android.view.ViewOutlineProvider {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1520eq A00;

    public C1517en(com.facebook.ads.redexgen.core.C1520eq c1520eq) {
        this.A00 = c1520eq;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 8.0f);
    }
}
