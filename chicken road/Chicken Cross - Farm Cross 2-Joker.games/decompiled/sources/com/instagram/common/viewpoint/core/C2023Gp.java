package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2023Gp implements InterfaceC2469Yf {
    public final /* synthetic */ AbstractC2017Gj A00;

    public C2023Gp(AbstractC2017Gj abstractC2017Gj) {
        this.A00 = abstractC2017Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2469Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
