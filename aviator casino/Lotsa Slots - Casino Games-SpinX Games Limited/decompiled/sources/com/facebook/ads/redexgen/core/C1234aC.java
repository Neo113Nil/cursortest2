package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.aC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1234aC extends android.view.ViewOutlineProvider {
    public final /* synthetic */ float A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C1241aJ A01;

    public C1234aC(com.facebook.ads.redexgen.core.C1241aJ c1241aJ, float f) {
        this.A01 = c1241aJ;
        this.A00 = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(android.view.View view, android.graphics.Outline outline) {
        outline.setRoundRect(com.facebook.ads.redexgen.core.XV.A00, com.facebook.ads.redexgen.core.XV.A00, view.getWidth(), view.getHeight(), this.A00);
    }
}
