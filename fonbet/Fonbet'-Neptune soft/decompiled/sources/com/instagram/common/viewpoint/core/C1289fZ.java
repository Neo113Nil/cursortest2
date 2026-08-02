package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.fZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1289fZ implements RQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C0696Qc A02;

    public C1289fZ(RS rs, ImageView imageView, C0696Qc c0696Qc) {
        this.A01 = rs;
        this.A00 = imageView;
        this.A02 = c0696Qc;
    }

    @Override // com.instagram.common.viewpoint.core.RQ
    public final void ADU(Drawable drawable) {
        C0696Qc.A0f(drawable, this.A00);
        this.A02.A1K(drawable);
    }
}
