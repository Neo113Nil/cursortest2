package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class S4 implements com.facebook.ads.internal.api.NativeAdViewApi {
    public static android.view.View A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new com.facebook.ads.NativeAdViewAttributes();
        }
        com.facebook.ads.redexgen.core.C1100Vd c1100Vd = (com.facebook.ads.redexgen.core.C1100Vd) nativeAdViewAttributes.getInternalAttributes();
        com.facebook.ads.redexgen.core.UK internalNativeAd = com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd());
        internalNativeAd.A1h(com.facebook.ads.redexgen.core.EnumC1101Ve.A00(type.getEnumCode()));
        internalNativeAd.A1g(c1100Vd);
        com.facebook.ads.redexgen.core.C7C c7c = new com.facebook.ads.redexgen.core.C7C();
        com.facebook.ads.NativeAdLayout mediumRectTemplateLayout = new com.facebook.ads.NativeAdLayout(c1636gi, c7c);
        c7c.A08(mediumRectTemplateLayout, c1636gi, nativeAd, c1100Vd);
        mediumRectTemplateLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, (int) (com.facebook.ads.redexgen.core.XX.A02 * type.getHeight())));
        return mediumRectTemplateLayout;
    }

    public static android.view.View A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        if (nativeAdViewAttributes == null) {
            nativeAdViewAttributes = new com.facebook.ads.NativeAdViewAttributes();
        }
        com.facebook.ads.redexgen.core.UK A0L = com.facebook.ads.redexgen.core.UK.A0L(nativeAd.getInternalNativeAd());
        com.facebook.ads.redexgen.core.C1100Vd c1100Vd = (com.facebook.ads.redexgen.core.C1100Vd) nativeAdViewAttributes.getInternalAttributes();
        A0L.A1h(com.facebook.ads.redexgen.core.EnumC1101Ve.A0B);
        A0L.A1g(c1100Vd);
        com.facebook.ads.redexgen.core.C7C c7c = new com.facebook.ads.redexgen.core.C7C();
        com.facebook.ads.NativeAdLayout nativeAdLayout = new com.facebook.ads.NativeAdLayout(c1636gi, c7c);
        c7c.A08(nativeAdLayout, c1636gi, nativeAd, c1100Vd);
        return nativeAdLayout;
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd) {
        return render(context, nativeAd, (com.facebook.ads.NativeAdViewAttributes) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type) {
        return render(context, nativeAd, type, null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdView.Type type, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        try {
            return A00(com.facebook.ads.redexgen.core.C1009Rp.A03(context), nativeAd, type, nativeAdViewAttributes);
        } catch (java.lang.Throwable th) {
            return com.facebook.ads.redexgen.core.Z4.A00(com.facebook.ads.redexgen.core.C1009Rp.A03(context), th);
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdViewApi
    public final android.view.View render(android.content.Context context, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.NativeAdViewAttributes nativeAdViewAttributes) {
        com.facebook.ads.redexgen.core.C1636gi contextWrapper;
        try {
            if (context instanceof com.facebook.ads.redexgen.core.C1636gi) {
                contextWrapper = (com.facebook.ads.redexgen.core.C1636gi) context;
            } else {
                contextWrapper = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
            }
            return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
        } catch (java.lang.Throwable th) {
            return com.facebook.ads.redexgen.core.Z4.A00(com.facebook.ads.redexgen.core.C1009Rp.A03(context), th);
        }
    }
}
