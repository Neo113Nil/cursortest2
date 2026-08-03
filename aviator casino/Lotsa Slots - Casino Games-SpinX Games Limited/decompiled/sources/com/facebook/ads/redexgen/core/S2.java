package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class S2 implements com.facebook.ads.internal.api.NativeAdApi {
    public static java.lang.String[] A02 = {"Qf6uI4y6btMkRXvA96gvAPpQqYMeMLVQ", "xsH0pc0gEvMtYCBpu3k37P2MSYje76", "eIeN", "vYRtnf0lNdhCyq", "4", "0cPKH6qR821KJSq9ovGwsT1tt", "LdRpqMhVSgJGWZUoheR2iPgR57uht61Q", "hYjvJgOs8spNmgMi7B8jHFIGUAKFh9RM"};
    public final com.facebook.ads.NativeAd A00;
    public final com.facebook.ads.internal.api.NativeAdBaseApi A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, java.util.List<android.view.View> list) {
        registerViewForInteraction(view, mediaView, (com.facebook.ads.MediaView) null, list);
    }

    public S2(com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
        com.facebook.ads.redexgen.core.UK.A0L(nativeAdBaseApi).A1i(com.facebook.ads.redexgen.core.EnumC1111Vq.A06);
    }

    public S2(com.facebook.ads.NativeAdBase nativeAdBase, com.facebook.ads.NativeAd nativeAd, com.facebook.ads.internal.api.NativeAdBaseApi nativeAdBaseApi) {
        this.A00 = nativeAd;
        this.A01 = nativeAdBaseApi;
    }

    private com.facebook.ads.redexgen.core.UK A00() {
        return com.facebook.ads.redexgen.core.UK.A0L(this.A01);
    }

    public final int A01() {
        return A00().A10();
    }

    public final java.lang.String A02() {
        return A00().A1L();
    }

    public final java.lang.String A03() {
        return A00().A1M();
    }

    public final java.util.List<com.facebook.ads.NativeAd> A04() {
        if (A00().A1N() == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.facebook.ads.redexgen.core.UK internalNativeAd : A00().A1N()) {
            arrayList.add(new com.facebook.ads.NativeAd(internalNativeAd.A16(), internalNativeAd));
        }
        return arrayList;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final com.facebook.ads.NativeAd.AdCreativeType getAdCreativeType() {
        if (!android.text.TextUtils.isEmpty(A00().A1M())) {
            return com.facebook.ads.NativeAd.AdCreativeType.VIDEO;
        }
        if (A00().A1N() != null && !A00().A1N().isEmpty()) {
            return com.facebook.ads.NativeAd.AdCreativeType.CAROUSEL;
        }
        if (A00().getAdCoverImage() != null && !android.text.TextUtils.isEmpty(A00().getAdCoverImage().getUrl())) {
            com.facebook.ads.NativeAd.AdCreativeType adCreativeType = com.facebook.ads.NativeAd.AdCreativeType.IMAGE;
            if (A02[1].length() == 22) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A02;
            strArr[5] = "KhCZfMyUHPJBMWXSGegcdmWrt";
            strArr[3] = "8FosuavNBsKEQf";
            return adCreativeType;
        }
        return com.facebook.ads.NativeAd.AdCreativeType.UNKNOWN;
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final com.facebook.ads.VideoAutoplayBehavior getVideoAutoplayBehavior() {
        return com.facebook.ads.redexgen.core.EnumC1102Vf.A00(A00().A1D());
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView) {
        registerViewForInteraction(view, mediaView, (com.facebook.ads.MediaView) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView) {
        registerViewForInteraction(view, mediaView, imageView, (java.util.List<android.view.View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, android.widget.ImageView imageView, java.util.List<android.view.View> clickableViews) {
        if (imageView != null) {
            com.facebook.ads.redexgen.core.C1636gi A16 = A00().A16();
            com.facebook.ads.redexgen.core.C1636gi downloadContext = com.facebook.ads.redexgen.core.C1009Rp.A03(imageView.getContext());
            downloadContext.A0L(A16);
            com.facebook.ads.redexgen.core.UK.A0k(A00().getAdIcon(), imageView, downloadContext);
        }
        registerViewForInteraction(view, mediaView, (com.facebook.ads.MediaView) null, clickableViews);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2) {
        registerViewForInteraction(view, mediaView, mediaView2, (java.util.List<android.view.View>) null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdApi
    public final void registerViewForInteraction(android.view.View view, com.facebook.ads.MediaView mediaView, com.facebook.ads.MediaView mediaView2, java.util.List<android.view.View> list) {
        if (mediaView != null) {
            ((com.facebook.ads.redexgen.core.C1666hC) mediaView.getMediaViewApi()).A0W(this.A00);
        }
        if (mediaView2 != null) {
            ((com.facebook.ads.redexgen.core.C1666hC) mediaView2.getMediaViewApi()).A0X(this.A01, false);
        }
        if (list != null) {
            A00().A1V(view, mediaView, list);
            return;
        }
        com.facebook.ads.redexgen.core.UK A00 = A00();
        java.lang.String[] strArr = A02;
        if (strArr[0].charAt(20) == strArr[7].charAt(20)) {
            throw new java.lang.RuntimeException();
        }
        A02[4] = "Y8dslRp9uWVtvGXxjU2U0Td790Xm7bcp";
        A00.A1U(view, mediaView);
    }
}
