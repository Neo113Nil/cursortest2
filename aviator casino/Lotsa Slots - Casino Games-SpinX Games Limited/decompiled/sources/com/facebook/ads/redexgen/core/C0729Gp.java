package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0729Gp implements com.facebook.ads.redexgen.core.InterfaceC1175Yf {
    public final /* synthetic */ com.facebook.ads.redexgen.core.AbstractC0723Gj A00;

    public C0729Gp(com.facebook.ads.redexgen.core.AbstractC0723Gj abstractC0723Gj) {
        this.A00 = abstractC0723Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1175Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
