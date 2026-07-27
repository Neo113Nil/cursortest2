package sg.bigo.ads.f;

import sg.bigo.ads.ad.banner.BigoAdView;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.BannerAd;

/* loaded from: classes3.dex */
public final class y implements AdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BigoAdView f12780a;

    public y(BigoAdView bigoAdView) {
        this.f12780a = bigoAdView;
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onAdLoaded(Ad ad) {
        BigoAdView bigoAdView = this.f12780a;
        bigoAdView.b = (BannerAd) ad;
        bigoAdView.a(true);
        BigoAdView bigoAdView2 = this.f12780a;
        AdLoadListener adLoadListener = bigoAdView2.c;
        if (adLoadListener != null) {
            adLoadListener.onAdLoaded(bigoAdView2);
        }
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        AdLoadListener adLoadListener = this.f12780a.c;
        if (adLoadListener != null) {
            adLoadListener.onError(adError);
        }
    }
}
