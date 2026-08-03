package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class S6 implements com.facebook.ads.internal.api.NativeAdsManagerApi {
    public static java.lang.String[] A0B = {"gDYqLx0JK9708AoJnxJgyKqjnvDR", "XqufOA6aif4bGdY", "Su6jQEbJiG4f8aKvZwQ5GnKoGxisXaGJ", "amq5QC2giq7rrMPed26NLD1vQWHXorDG", "da4TAb4G8iALXV3W79mvavYrQ", "laLk", "uFxB7CH2AwGOjVY1RRN9", "Lrv7"};
    public static final java.lang.String A0C = com.facebook.ads.NativeAdsManager.class.getSimpleName();
    public com.facebook.ads.NativeAd.NativeOptions A01;
    public com.facebook.ads.NativeAdsManager.Listener A02;
    public com.facebook.ads.redexgen.core.C1765iu A03;
    public java.lang.String A04;
    public final int A07;
    public final com.facebook.ads.redexgen.core.C1636gi A08;
    public final java.lang.String A09;
    public final java.util.List<com.facebook.ads.NativeAd> A0A;
    public int A00 = -1;
    public boolean A05 = false;
    public boolean A06 = false;

    public S6(android.content.Context context, java.lang.String str, int i) {
        this.A08 = com.facebook.ads.redexgen.core.C1009Rp.A03(context);
        this.A09 = str;
        this.A07 = java.lang.Math.max(i, 0);
        this.A0A = new java.util.ArrayList(i);
    }

    public final com.facebook.ads.NativeAdsManager.Listener A00() {
        return this.A02;
    }

    public final com.facebook.ads.redexgen.core.C1765iu A01() {
        return this.A03;
    }

    public final void A02() {
        this.A0A.clear();
    }

    public final void A03(int i) {
        this.A00 = i;
    }

    public final void A04(com.facebook.ads.NativeAd nativeAd) {
        this.A0A.add(nativeAd);
    }

    public final void A05(boolean z) {
        this.A05 = z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A06 = true;
        if (this.A03 != null) {
            this.A03.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A0A.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A05;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(com.facebook.ads.NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(com.facebook.ads.NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        com.facebook.ads.redexgen.core.EnumC1111Vq enumC1111Vq = com.facebook.ads.redexgen.core.EnumC1111Vq.A06;
        int i = this.A07;
        com.facebook.ads.redexgen.core.C1765iu c1765iu = this.A03;
        this.A03 = new com.facebook.ads.redexgen.core.C1765iu(this.A08, this.A09, enumC1111Vq, null, i);
        if (this.A06) {
            this.A03.A06();
        }
        this.A03.A09(this.A04);
        this.A03.A08(new com.facebook.ads.redexgen.core.C1659h5(this, this.A08, mediaCacheFlag, this.A01));
        this.A03.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final com.facebook.ads.NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final com.facebook.ads.NativeAd nextNativeAd(com.facebook.ads.NativeAdListener nativeAdListener) {
        if (this.A0A.size() == 0) {
            if (A0B[0].length() != 28) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A0B;
            strArr[6] = "mJMTRUXqz4crzwTyllZM";
            strArr[4] = "KHUxr2V0BkfXxoUOzUh0cEJhB";
            return null;
        }
        int i = this.A00;
        this.A00 = i + 1;
        java.util.List<com.facebook.ads.NativeAd> list = this.A0A;
        int pos = this.A0A.size();
        com.facebook.ads.NativeAd nativeAd = list.get(i % pos);
        if (nativeAdListener != null) {
            ((com.facebook.ads.redexgen.core.UK) nativeAd.getInternalNativeAd()).A1b(nativeAd, nativeAdListener);
        }
        int pos2 = this.A0A.size();
        if (i >= pos2) {
            return new com.facebook.ads.NativeAd(this.A08, nativeAd, this.A01);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(java.lang.String str) {
        this.A04 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(com.facebook.ads.NativeAdsManager.Listener listener) {
        this.A02 = listener;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setNativeOption(com.facebook.ads.NativeAd.NativeOptions nativeOptions) {
        this.A01 = nativeOptions;
    }
}
