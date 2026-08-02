package org.betup.services.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationConfig;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationStatus;
import com.google.android.libraries.ads.mobile.sdk.initialization.OnAdapterInitializationCompleteListener;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.betup.R;
import org.betup.services.ads.consent.AdsConsentManager;
import org.betup.services.ads.interstitial.InterstitialAdController;
import org.betup.services.ads.rewarded.RewardedAdController;
import org.betup.services.offer.PromoService;
import org.betup.services.user.UserService;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: MobileAdsInitializer.kt */
@Singleton
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/betup/services/ads/MobileAdsInitializer;", "", "userService", "Lorg/betup/services/user/UserService;", "adsConsentManager", "Lorg/betup/services/ads/consent/AdsConsentManager;", "rewardedAdController", "Lorg/betup/services/ads/rewarded/RewardedAdController;", "interstitialAdController", "Lorg/betup/services/ads/interstitial/InterstitialAdController;", "adUnitRegistry", "Lorg/betup/services/ads/AdUnitRegistry;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/services/user/UserService;Lorg/betup/services/ads/consent/AdsConsentManager;Lorg/betup/services/ads/rewarded/RewardedAdController;Lorg/betup/services/ads/interstitial/InterstitialAdController;Lorg/betup/services/ads/AdUnitRegistry;)V", "isInitialized", "", "initScheduled", "initExecutor", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "init", "activity", "Landroid/app/Activity;", "completedListener", "Lorg/betup/services/ads/MobileAdsInitializer$OnAdInitializeCompletedListener;", "preloadAllAdUnits", "", "OnAdInitializeCompletedListener", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MobileAdsInitializer {
    private static final long INIT_DELAY_MS = 200;
    private static final String TAG = "MobileAdsInitializer";
    private final AdUnitRegistry adUnitRegistry;
    private final AdsConsentManager adsConsentManager;
    private final ExecutorService initExecutor;
    private boolean initScheduled;
    private final InterstitialAdController interstitialAdController;
    private boolean isInitialized;
    private final RewardedAdController rewardedAdController;
    private final UserService userService;
    public static final int $stable = 8;

    /* compiled from: MobileAdsInitializer.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lorg/betup/services/ads/MobileAdsInitializer$OnAdInitializeCompletedListener;", "", "onAdInitialized", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnAdInitializeCompletedListener {
        void onAdInitialized();
    }

    @Inject
    public MobileAdsInitializer(UserService userService, AdsConsentManager adsConsentManager, RewardedAdController rewardedAdController, InterstitialAdController interstitialAdController, AdUnitRegistry adUnitRegistry) {
        Intrinsics.checkNotNullParameter(userService, "userService");
        Intrinsics.checkNotNullParameter(adsConsentManager, "adsConsentManager");
        Intrinsics.checkNotNullParameter(rewardedAdController, "rewardedAdController");
        Intrinsics.checkNotNullParameter(interstitialAdController, "interstitialAdController");
        Intrinsics.checkNotNullParameter(adUnitRegistry, "adUnitRegistry");
        this.userService = userService;
        this.adsConsentManager = adsConsentManager;
        this.rewardedAdController = rewardedAdController;
        this.interstitialAdController = interstitialAdController;
        this.adUnitRegistry = adUnitRegistry;
        this.initExecutor = Executors.newSingleThreadExecutor();
    }

    public final boolean init(final Activity activity, final OnAdInitializeCompletedListener completedListener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.isInitialized || this.initScheduled || !this.userService.isRegistered()) {
            return false;
        }
        this.initScheduled = true;
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: org.betup.services.ads.MobileAdsInitializer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                MobileAdsInitializer.init$lambda$4(activity, this, completedListener);
            }
        }, INIT_DELAY_MS);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4(final Activity activity, final MobileAdsInitializer mobileAdsInitializer, final OnAdInitializeCompletedListener onAdInitializeCompletedListener) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            mobileAdsInitializer.initScheduled = false;
        } else {
            mobileAdsInitializer.adsConsentManager.gatherConsentIfRequired(activity, new Function0() { // from class: org.betup.services.ads.MobileAdsInitializer$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit init$lambda$4$lambda$3;
                    init$lambda$4$lambda$3 = MobileAdsInitializer.init$lambda$4$lambda$3(activity, mobileAdsInitializer, onAdInitializeCompletedListener);
                    return init$lambda$4$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit init$lambda$4$lambda$3(final Activity activity, final MobileAdsInitializer mobileAdsInitializer, final OnAdInitializeCompletedListener onAdInitializeCompletedListener) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            mobileAdsInitializer.initScheduled = false;
            return Unit.INSTANCE;
        }
        if (!mobileAdsInitializer.adsConsentManager.canRequestAds(activity)) {
            Log.w(TAG, "Skipping GMA Next-Gen init — consent not granted yet");
            mobileAdsInitializer.initScheduled = false;
            return Unit.INSTANCE;
        }
        final String string = activity.getString(R.string.admob_id);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        mobileAdsInitializer.initExecutor.execute(new Runnable() { // from class: org.betup.services.ads.MobileAdsInitializer$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                MobileAdsInitializer.init$lambda$4$lambda$3$lambda$2(activity, string, mobileAdsInitializer, onAdInitializeCompletedListener);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4$lambda$3$lambda$2(final Activity activity, String str, final MobileAdsInitializer mobileAdsInitializer, final OnAdInitializeCompletedListener onAdInitializeCompletedListener) {
        MobileAds.INSTANCE.initialize(activity, new InitializationConfig.Builder(str).build(), new OnAdapterInitializationCompleteListener() { // from class: org.betup.services.ads.MobileAdsInitializer$$ExternalSyntheticLambda1
            @Override // com.google.android.libraries.ads.mobile.sdk.initialization.OnAdapterInitializationCompleteListener
            public final void onAdapterInitializationComplete(InitializationStatus initializationStatus) {
                MobileAdsInitializer.init$lambda$4$lambda$3$lambda$2$lambda$1(activity, mobileAdsInitializer, onAdInitializeCompletedListener, initializationStatus);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4$lambda$3$lambda$2$lambda$1(final Activity activity, final MobileAdsInitializer mobileAdsInitializer, final OnAdInitializeCompletedListener onAdInitializeCompletedListener, InitializationStatus it) {
        Intrinsics.checkNotNullParameter(it, "it");
        activity.runOnUiThread(new Runnable() { // from class: org.betup.services.ads.MobileAdsInitializer$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                MobileAdsInitializer.init$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(activity, mobileAdsInitializer, onAdInitializeCompletedListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4$lambda$3$lambda$2$lambda$1$lambda$0(Activity activity, MobileAdsInitializer mobileAdsInitializer, OnAdInitializeCompletedListener onAdInitializeCompletedListener) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            mobileAdsInitializer.initScheduled = false;
            return;
        }
        mobileAdsInitializer.isInitialized = true;
        mobileAdsInitializer.initScheduled = false;
        mobileAdsInitializer.preloadAllAdUnits(activity);
        if (onAdInitializeCompletedListener != null) {
            onAdInitializeCompletedListener.onAdInitialized();
        }
        Log.d(TAG, "GMA Next-Gen SDK initialized");
    }

    /* renamed from: isInitialized, reason: from getter */
    public final boolean getIsInitialized() {
        return this.isInitialized;
    }

    private final void preloadAllAdUnits(Activity activity) {
        if (!this.adsConsentManager.canRequestAds(activity)) {
            Log.w(TAG, "Skipping ad preload — consent not granted");
            return;
        }
        Iterator<T> it = this.adUnitRegistry.rewardedPreloadPlacements().iterator();
        while (it.hasNext()) {
            this.rewardedAdController.preload(activity, this.adUnitRegistry.rewardedUnit((PromoService.PromoPlacement) it.next()));
        }
        Iterator<T> it2 = this.adUnitRegistry.interstitialPreloadPlacements().iterator();
        while (it2.hasNext()) {
            this.interstitialAdController.preload(activity, this.adUnitRegistry.interstitialUnit((PromoService.PromoPlacement) it2.next()));
        }
    }
}
