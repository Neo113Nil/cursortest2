package sg.bigo.ads.api;

import sg.bigo.ads.api.NativeBannerAdLoader;

/* loaded from: classes3.dex */
public final class b implements AdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NativeBannerAdLoader.Builder f12686a;

    public b(NativeBannerAdLoader.Builder builder) {
        this.f12686a = builder;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad) {
        AdLoadListener adLoadListener;
        AdLoadListener adLoadListener2;
        Ad ad2;
        AdLoadListener adLoadListener3;
        if (ad instanceof NativeAd) {
            adLoadListener3 = this.f12686a.mNativeAdLoader;
            if (adLoadListener3 != null) {
                adLoadListener2 = this.f12686a.mNativeAdLoader;
                ad2 = (NativeAd) ad;
                adLoadListener2.onAdLoaded(ad2);
            }
        }
        if (ad instanceof BannerAd) {
            adLoadListener = this.f12686a.mBannerAdLoader;
            if (adLoadListener != null) {
                adLoadListener2 = this.f12686a.mBannerAdLoader;
                ad2 = (BannerAd) ad;
                adLoadListener2.onAdLoaded(ad2);
            }
        }
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        AdLoadListener adLoadListener;
        AdLoadListener adLoadListener2;
        AdLoadListener adLoadListener3;
        adLoadListener = this.f12686a.mNativeAdLoader;
        if (adLoadListener != null) {
            adLoadListener3 = this.f12686a.mNativeAdLoader;
        } else {
            adLoadListener2 = this.f12686a.mBannerAdLoader;
            if (adLoadListener2 == null) {
                return;
            } else {
                adLoadListener3 = this.f12686a.mBannerAdLoader;
            }
        }
        adLoadListener3.onError(adError);
    }
}
