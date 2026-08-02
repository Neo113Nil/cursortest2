package org.betup.services.ads.interstitial;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.ironsource.C3664q2;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.betup.services.ads.AdExtensionsKt;
import org.betup.services.ads.AdMobDiagnostics;
import org.betup.services.ads.consent.AdsConsentManager;
import org.betup.utils.AdMobFullscreenSessionGuard;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: GoogleInterstitialAdController.kt */
@Singleton
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lorg/betup/services/ads/interstitial/GoogleInterstitialAdController;", "Lorg/betup/services/ads/interstitial/InterstitialAdController;", "adsConsentManager", "Lorg/betup/services/ads/consent/AdsConsentManager;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/services/ads/consent/AdsConsentManager;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/services/ads/interstitial/InterstitialAdListener;", "interstitialAds", "", "", "Lcom/google/android/libraries/ads/mobile/sdk/interstitial/InterstitialAd;", "loadingAdUnitIds", "", "mainHandler", "Landroid/os/Handler;", "setListener", "", "preload", "activity", "Landroid/app/Activity;", "adUnitId", "isReady", "", C3664q2.v, "clear", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoogleInterstitialAdController implements InterstitialAdController {
    private static final String TAG = "GoogleInterstitialAd";
    private final AdsConsentManager adsConsentManager;
    private final Map<String, InterstitialAd> interstitialAds;
    private InterstitialAdListener listener;
    private final Set<String> loadingAdUnitIds;
    private final Handler mainHandler;
    public static final int $stable = 8;

    @Inject
    public GoogleInterstitialAdController(AdsConsentManager adsConsentManager) {
        Intrinsics.checkNotNullParameter(adsConsentManager, "adsConsentManager");
        this.adsConsentManager = adsConsentManager;
        this.interstitialAds = new LinkedHashMap();
        this.loadingAdUnitIds = new LinkedHashSet();
        this.mainHandler = new Handler(Looper.getMainLooper());
    }

    @Override // org.betup.services.ads.interstitial.InterstitialAdController
    public void setListener(InterstitialAdListener listener) {
        this.listener = listener;
    }

    @Override // org.betup.services.ads.interstitial.InterstitialAdController
    public void preload(Activity activity, final String adUnitId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        if (activity.isFinishing()) {
            return;
        }
        if (!this.adsConsentManager.canRequestAds(activity)) {
            Log.d(TAG, "Skipping interstitial preload — consent not granted");
            return;
        }
        if (!MobileAds.INSTANCE.isInitialized()) {
            Log.d(TAG, "Skipping interstitial preload — GMA Next-Gen not initialized yet");
        } else {
            if (this.interstitialAds.containsKey(adUnitId) || this.loadingAdUnitIds.contains(adUnitId)) {
                return;
            }
            this.loadingAdUnitIds.add(adUnitId);
            AdMobDiagnostics.logRequest$default("interstitial", adUnitId, null, 4, null);
            InterstitialAd.INSTANCE.load(new AdRequest.Builder(adUnitId).build(), new AdLoadCallback<InterstitialAd>() { // from class: org.betup.services.ads.interstitial.GoogleInterstitialAdController$preload$1
                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
                public void onAdLoaded(InterstitialAd ad) {
                    Set set;
                    Map map;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    set = GoogleInterstitialAdController.this.loadingAdUnitIds;
                    if (set.remove(adUnitId)) {
                        map = GoogleInterstitialAdController.this.interstitialAds;
                        map.put(adUnitId, ad);
                        AdMobDiagnostics.logLoaded("interstitial", adUnitId, AdExtensionsKt.mediationAdapterClassName(ad));
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError error) {
                    Set set;
                    Map map;
                    Intrinsics.checkNotNullParameter(error, "error");
                    set = GoogleInterstitialAdController.this.loadingAdUnitIds;
                    if (set.remove(adUnitId)) {
                        map = GoogleInterstitialAdController.this.interstitialAds;
                        map.remove(adUnitId);
                        AdMobDiagnostics.logFailed("interstitial", adUnitId, error.getCode(), error.getMessage(), error.getResponseInfo());
                        Log.w("GoogleInterstitialAd", "Interstitial load failed for " + adUnitId + ": " + error.getMessage());
                    }
                }
            });
        }
    }

    @Override // org.betup.services.ads.interstitial.InterstitialAdController
    public boolean isReady(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.interstitialAds.containsKey(adUnitId);
    }

    @Override // org.betup.services.ads.interstitial.InterstitialAdController
    public boolean show(Activity activity, String adUnitId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        InterstitialAd remove = this.interstitialAds.remove(adUnitId);
        if (remove == null) {
            return false;
        }
        if (activity.isFinishing()) {
            this.interstitialAds.put(adUnitId, remove);
            return false;
        }
        remove.setAdEventCallback(new GoogleInterstitialAdController$show$1(remove, this, adUnitId, activity));
        AdMobFullscreenSessionGuard.enter();
        remove.show(activity);
        return true;
    }

    @Override // org.betup.services.ads.interstitial.InterstitialAdController
    public void clear() {
        this.loadingAdUnitIds.clear();
        this.interstitialAds.clear();
    }
}
