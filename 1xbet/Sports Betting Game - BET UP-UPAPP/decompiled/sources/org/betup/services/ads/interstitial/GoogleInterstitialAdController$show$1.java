package org.betup.services.ads.interstitial;

import android.app.Activity;
import android.os.Handler;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdEventCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.services.ads.AdExtensionsKt;
import org.betup.services.analytics.AnalyticsHelper;
import org.betup.utils.AdMobFullscreenSessionGuard;

/* compiled from: GoogleInterstitialAdController.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"org/betup/services/ads/interstitial/GoogleInterstitialAdController$show$1", "Lcom/google/android/libraries/ads/mobile/sdk/interstitial/InterstitialAdEventCallback;", "onAdShowedFullScreenContent", "", "onAdDismissedFullScreenContent", "onAdFailedToShowFullScreenContent", "error", "Lcom/google/android/libraries/ads/mobile/sdk/common/FullScreenContentError;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoogleInterstitialAdController$show$1 implements InterstitialAdEventCallback {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ InterstitialAd $ad;
    final /* synthetic */ String $adUnitId;
    final /* synthetic */ GoogleInterstitialAdController this$0;

    GoogleInterstitialAdController$show$1(InterstitialAd interstitialAd, GoogleInterstitialAdController googleInterstitialAdController, String str, Activity activity) {
        this.$ad = interstitialAd;
        this.this$0 = googleInterstitialAdController;
        this.$adUnitId = str;
        this.$activity = activity;
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
    public void onAdShowedFullScreenContent() {
        AnalyticsHelper.INSTANCE.logAdImpression("interstitial", AppLovinMediationProvider.ADMOB, AdExtensionsKt.mediationAdapterClassName(this.$ad));
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
    public void onAdDismissedFullScreenContent() {
        Handler handler;
        AdMobFullscreenSessionGuard.exit();
        handler = this.this$0.mainHandler;
        final GoogleInterstitialAdController googleInterstitialAdController = this.this$0;
        final String str = this.$adUnitId;
        final Activity activity = this.$activity;
        handler.post(new Runnable() { // from class: org.betup.services.ads.interstitial.GoogleInterstitialAdController$show$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                GoogleInterstitialAdController$show$1.onAdDismissedFullScreenContent$lambda$0(GoogleInterstitialAdController.this, str, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdDismissedFullScreenContent$lambda$0(GoogleInterstitialAdController googleInterstitialAdController, String str, Activity activity) {
        InterstitialAdListener interstitialAdListener;
        interstitialAdListener = googleInterstitialAdController.listener;
        if (interstitialAdListener != null) {
            interstitialAdListener.onDismissed(str);
        }
        googleInterstitialAdController.preload(activity, str);
    }

    @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
    public void onAdFailedToShowFullScreenContent(FullScreenContentError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        Log.w("GoogleInterstitialAd", "Interstitial show failed: " + error.getMessage());
        AdMobFullscreenSessionGuard.exit();
        this.this$0.preload(this.$activity, this.$adUnitId);
    }
}
