package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1288fY extends AbstractRunnableC0840Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C0696Qc A02;

    public C1288fY(RS rs, C0696Qc c0696Qc, Drawable drawable) {
        this.A01 = rs;
        this.A02 = c0696Qc;
        this.A00 = drawable;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
