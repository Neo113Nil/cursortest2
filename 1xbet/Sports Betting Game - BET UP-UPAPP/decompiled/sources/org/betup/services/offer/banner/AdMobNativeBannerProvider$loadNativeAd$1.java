package org.betup.services.offer.banner;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.services.analytics.AnalyticsHelper;

/* compiled from: AdMobNativeBannerProvider.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"org/betup/services/offer/banner/AdMobNativeBannerProvider$loadNativeAd$1", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAdLoaderCallback;", "onNativeAdLoaded", "", "ad", "Lcom/google/android/libraries/ads/mobile/sdk/nativead/NativeAd;", "onAdFailedToLoad", "error", "Lcom/google/android/libraries/ads/mobile/sdk/common/LoadAdError;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdMobNativeBannerProvider$loadNativeAd$1 implements NativeAdLoaderCallback {
    final /* synthetic */ AdMobNativeBannerProvider this$0;

    AdMobNativeBannerProvider$loadNativeAd$1(AdMobNativeBannerProvider adMobNativeBannerProvider) {
        this.this$0 = adMobNativeBannerProvider;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback
    public void onNativeAdLoaded(final NativeAd ad) {
        Handler handler;
        Intrinsics.checkNotNullParameter(ad, "ad");
        handler = this.this$0.mainHandler;
        final AdMobNativeBannerProvider adMobNativeBannerProvider = this.this$0;
        handler.post(new Runnable() { // from class: org.betup.services.offer.banner.AdMobNativeBannerProvider$loadNativeAd$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                AdMobNativeBannerProvider$loadNativeAd$1.onNativeAdLoaded$lambda$0(AdMobNativeBannerProvider.this, ad);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onNativeAdLoaded$lambda$0(AdMobNativeBannerProvider adMobNativeBannerProvider, NativeAd nativeAd) {
        Activity activity;
        NativeAd nativeAd2;
        View view;
        BannerController bannerController;
        activity = adMobNativeBannerProvider.context;
        if (!activity.isFinishing()) {
            nativeAd2 = adMobNativeBannerProvider.nativeAd;
            if (nativeAd2 != null) {
                nativeAd2.destroy();
            }
            adMobNativeBannerProvider.nativeAd = nativeAd;
            nativeAd.setAdEventCallback(new NativeAdEventCallback() { // from class: org.betup.services.offer.banner.AdMobNativeBannerProvider$loadNativeAd$1$onNativeAdLoaded$1$1
                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public void onAdImpression() {
                    AnalyticsHelper.INSTANCE.logAdImpression("native", AppLovinMediationProvider.ADMOB, null);
                }
            });
            adMobNativeBannerProvider.isRequestingAds = false;
            adMobNativeBannerProvider.isError = false;
            view = adMobNativeBannerProvider.pendingView;
            if (view != null) {
                bannerController = adMobNativeBannerProvider.bannerController;
                adMobNativeBannerProvider.fillView(bannerController, view);
                adMobNativeBannerProvider.pendingView = null;
                return;
            }
            return;
        }
        nativeAd.destroy();
        adMobNativeBannerProvider.isRequestingAds = false;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback
    public void onAdFailedToLoad(final LoadAdError error) {
        Handler handler;
        Intrinsics.checkNotNullParameter(error, "error");
        handler = this.this$0.mainHandler;
        final AdMobNativeBannerProvider adMobNativeBannerProvider = this.this$0;
        handler.post(new Runnable() { // from class: org.betup.services.offer.banner.AdMobNativeBannerProvider$loadNativeAd$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                AdMobNativeBannerProvider$loadNativeAd$1.onAdFailedToLoad$lambda$1(AdMobNativeBannerProvider.this, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdFailedToLoad$lambda$1(AdMobNativeBannerProvider adMobNativeBannerProvider, LoadAdError loadAdError) {
        View view;
        BannerController bannerController;
        adMobNativeBannerProvider.isRequestingAds = false;
        adMobNativeBannerProvider.isError = true;
        Log.w("AdMobNativeBanner", "Native ad load failed: " + loadAdError.getMessage());
        view = adMobNativeBannerProvider.pendingView;
        if (view != null) {
            bannerController = adMobNativeBannerProvider.bannerController;
            if (bannerController != null) {
                bannerController.hideBanner();
            }
            adMobNativeBannerProvider.pendingView = null;
        }
    }
}
