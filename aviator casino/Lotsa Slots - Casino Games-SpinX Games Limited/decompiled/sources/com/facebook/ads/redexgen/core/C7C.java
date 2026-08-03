package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C7C extends com.facebook.ads.redexgen.core.C1665hB {
    public com.facebook.ads.redexgen.core.InterfaceC1508ee A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A08(com.facebook.ads.NativeAdLayout nativeAdLayout, com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.redexgen.core.C1100Vd c1100Vd) {
        com.facebook.ads.redexgen.core.C1330bk c1330bk = new com.facebook.ads.redexgen.core.C1330bk(c1636gi);
        com.facebook.ads.MediaView mediaView = new com.facebook.ads.MediaView(c1636gi);
        com.facebook.ads.AdOptionsView adOptionsView = new com.facebook.ads.AdOptionsView(c1636gi, nativeAd, nativeAdLayout);
        c1100Vd.A09(adOptionsView, 28);
        this.A00 = new com.facebook.ads.redexgen.core.F2(c1636gi, nativeAd, c1100Vd, com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd()).A1C(), c1330bk, mediaView, adOptionsView);
        com.facebook.ads.redexgen.core.YB.A0N(nativeAdLayout, c1100Vd.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c1330bk, this.A00.getViewsForInteraction());
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
