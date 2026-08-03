package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1658h4 implements com.facebook.ads.redexgen.core.S8 {
    public final /* synthetic */ android.widget.ImageView A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.SA A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.UK A02;

    public C1658h4(com.facebook.ads.redexgen.core.SA sa, android.widget.ImageView imageView, com.facebook.ads.redexgen.core.UK uk) {
        this.A01 = sa;
        this.A00 = imageView;
        this.A02 = uk;
    }

    @Override // com.facebook.ads.redexgen.core.S8
    public final void AE8(android.graphics.drawable.Drawable drawable) {
        com.facebook.ads.redexgen.core.UK.A0f(drawable, this.A00);
        this.A02.A1P(drawable);
    }
}
