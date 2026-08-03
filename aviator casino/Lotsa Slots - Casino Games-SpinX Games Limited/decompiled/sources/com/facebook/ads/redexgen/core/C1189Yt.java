package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1189Yt extends com.facebook.ads.internal.api.AdNativeComponentView {
    public static final int A01 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 1.0f);
    public final android.widget.ImageView A00;

    public C1189Yt(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        super(c1636gi);
        this.A00 = new com.facebook.ads.redexgen.core.ZI(c1636gi);
        this.A00.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        com.facebook.ads.redexgen.core.EnumC1146Xc.A04(this.A00, com.facebook.ads.redexgen.core.EnumC1146Xc.A0B);
        addView(this.A00, new android.view.ViewGroup.LayoutParams(-1, -1));
        com.facebook.ads.redexgen.core.YB.A0N(this.A00, -2130706433);
        setPadding(A01, A01, A01, A01);
    }

    @Override // com.facebook.ads.internal.api.AdNativeComponentView
    public android.view.View getAdContentsView() {
        return this.A00;
    }

    public android.widget.ImageView getImageCardView() {
        return this.A00;
    }
}
