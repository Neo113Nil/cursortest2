package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class SB implements com.facebook.ads.internal.api.NativeBannerAdViewApi {
    /* JADX WARN: Type inference failed for: r1v1, types: [com.facebook.ads.internal.api.NativeAdLayoutApi, com.facebook.ads.redexgen.X.7L] */
    public static android.view.View A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new com.facebook.ads.NativeAdViewAttributes();
        }
        com.facebook.ads.redexgen.core.UK.A0L(nativeBannerAd.getInternalNativeAd()).A1h(com.facebook.ads.redexgen.core.EnumC1101Ve.A00(type.getEnumCode()));
        ?? r1 = new com.facebook.ads.redexgen.core.C1665hB() { // from class: com.facebook.ads.redexgen.X.7L
            public com.facebook.ads.redexgen.core.InterfaceC1508ee A00;

            /* JADX WARN: Failed to parse debug info
            java.lang.ArrayIndexOutOfBoundsException
             */
            public final void A08(com.facebook.ads.redexgen.core.C1636gi c1636gi2, com.facebook.ads.NativeBannerAd nativeBannerAd2, com.facebook.ads.redexgen.core.C1100Vd c1100Vd, com.facebook.ads.NativeAdLayout nativeAdLayout) {
                com.facebook.ads.MediaView mediaView = new com.facebook.ads.MediaView(nativeAdLayout.getContext());
                com.facebook.ads.AdOptionsView adOptionsView = new com.facebook.ads.AdOptionsView(nativeAdLayout.getContext(), nativeBannerAd2, nativeAdLayout);
                c1100Vd.A09(adOptionsView, 20);
                com.facebook.ads.redexgen.core.UK A0L = com.facebook.ads.redexgen.core.UK.A0L(nativeBannerAd2.getInternalNativeAd());
                com.facebook.ads.redexgen.core.EnumC1101Ve A1C = A0L.A1C();
                A0L.A1m(true);
                this.A00 = new com.facebook.ads.redexgen.core.F7(c1636gi2, nativeBannerAd2, c1100Vd, A1C, mediaView, adOptionsView, A0L.A1F());
                com.facebook.ads.redexgen.core.YB.A0N(nativeAdLayout, c1100Vd.A00());
                nativeBannerAd2.registerViewForInteraction(nativeAdLayout, mediaView, this.A00.getViewsForInteraction());
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 17;
                nativeAdLayout.addView(this.A00.getView(), layoutParams);
            }

            @Override // com.facebook.ads.redexgen.core.C1006Rm, com.facebook.ads.internal.api.AdComponentViewParentApi
            public final void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.A00.unregisterView();
            }
        };
        com.facebook.ads.NativeAdLayout nativeAdLayout = new com.facebook.ads.NativeAdLayout(c1636gi, (com.facebook.ads.internal.api.NativeAdLayoutApi) r1);
        r1.A08(c1636gi, nativeBannerAd, (com.facebook.ads.redexgen.core.C1100Vd) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
        nativeAdLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (int) (com.facebook.ads.redexgen.core.XX.A02 * type.getHeight())));
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
    public final android.view.View render(android.content.Context context, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type) {
        return render(context, nativeBannerAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
    public final android.view.View render(android.content.Context context, com.facebook.ads.NativeBannerAd nativeBannerAd, com.facebook.ads.NativeBannerAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(com.facebook.ads.redexgen.core.C1009Rp.A03(context), nativeBannerAd, type, nativeAdViewAttributes);
        } catch (java.lang.Throwable th) {
            return com.facebook.ads.redexgen.core.Z4.A00(com.facebook.ads.redexgen.core.C1009Rp.A03(context), th);
        }
    }
}
