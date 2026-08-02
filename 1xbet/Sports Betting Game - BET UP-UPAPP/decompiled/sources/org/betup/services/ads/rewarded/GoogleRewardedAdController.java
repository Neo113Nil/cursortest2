package org.betup.services.ads.rewarded;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.rewarded.OnUserEarnedRewardListener;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardItem;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAdEventCallback;
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

/* compiled from: GoogleRewardedAdController.kt */
@Singleton
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 32\u00020\u0001:\u00013B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\nH\u0016J\u0010\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\nH\u0016J\u0010\u0010\"\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\nH\u0016J\b\u0010#\u001a\u00020\u000fH\u0016J \u0010$\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\n2\u0006\u0010%\u001a\u00020\nH\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\nH\u0002J\b\u0010'\u001a\u00020\u001dH\u0002J\b\u0010(\u001a\u00020\u001dH\u0002J\"\u0010)\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010*\u001a\u00020\u000fH\u0002J\b\u0010+\u001a\u00020\u001dH\u0002J\b\u0010,\u001a\u00020\u001dH\u0002JL\u0010-\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\u00162\u0006\u0010.\u001a\u00020\u000f2\b\b\u0002\u0010*\u001a\u00020\u000f2\b\b\u0002\u0010/\u001a\u00020\u000f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n2\b\b\u0002\u00101\u001a\u00020\u000fH\u0002J\b\u00102\u001a\u00020\u001dH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064"}, d2 = {"Lorg/betup/services/ads/rewarded/GoogleRewardedAdController;", "Lorg/betup/services/ads/rewarded/RewardedAdController;", "adsConsentManager", "Lorg/betup/services/ads/consent/AdsConsentManager;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/services/ads/consent/AdsConsentManager;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lorg/betup/services/ads/rewarded/RewardedAdListener;", "rewardedAds", "", "", "Lcom/google/android/libraries/ads/mobile/sdk/rewarded/RewardedAd;", "loadingAdUnitIds", "", "userEarnedRewardForCurrentShow", "", "showingAdUnitId", "rewardPresentationActive", "fullscreenAdVisible", "showSessionAlive", "pendingDismissAdUnitId", "pendingDismissActivity", "Landroid/app/Activity;", "mainHandler", "Landroid/os/Handler;", "dispatchDismissRunnable", "Ljava/lang/Runnable;", "endShowSessionRunnable", "setListener", "", "preload", "activity", "adUnitId", "isReady", "isLoading", "isShowing", C3664q2.v, "logicalPlacement", "onUserEarnedRewardEvent", "rearmPresentationIfNeeded", "dispatchPendingDismiss", "finishRewardPresentation", "earned", "scheduleShowSessionEnd", "endShowSessionIfIdle", "endRewardPresentation", "notifyDismiss", "notifyShowFailed", "errorMessage", "keepShowSessionAlive", "clear", VastTagName.COMPANION, "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GoogleRewardedAdController implements RewardedAdController {
    private static final long INTER_CREATIVE_GAP_MS = 600;
    private static final long POD_REARM_TAIL_MS = 20000;
    private static final String TAG = "GoogleRewardedAd";
    private final AdsConsentManager adsConsentManager;
    private final Runnable dispatchDismissRunnable;
    private final Runnable endShowSessionRunnable;
    private boolean fullscreenAdVisible;
    private RewardedAdListener listener;
    private final Set<String> loadingAdUnitIds;
    private final Handler mainHandler;
    private Activity pendingDismissActivity;
    private String pendingDismissAdUnitId;
    private boolean rewardPresentationActive;
    private final Map<String, RewardedAd> rewardedAds;
    private boolean showSessionAlive;
    private String showingAdUnitId;
    private boolean userEarnedRewardForCurrentShow;
    public static final int $stable = 8;

    @Inject
    public GoogleRewardedAdController(AdsConsentManager adsConsentManager) {
        Intrinsics.checkNotNullParameter(adsConsentManager, "adsConsentManager");
        this.adsConsentManager = adsConsentManager;
        this.rewardedAds = new LinkedHashMap();
        this.loadingAdUnitIds = new LinkedHashSet();
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.dispatchDismissRunnable = new Runnable() { // from class: org.betup.services.ads.rewarded.GoogleRewardedAdController$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                GoogleRewardedAdController.this.dispatchPendingDismiss();
            }
        };
        this.endShowSessionRunnable = new Runnable() { // from class: org.betup.services.ads.rewarded.GoogleRewardedAdController$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                GoogleRewardedAdController.this.endShowSessionIfIdle();
            }
        };
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdController
    public void setListener(RewardedAdListener listener) {
        this.listener = listener;
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdController
    public void preload(Activity activity, final String adUnitId) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        if (activity.isFinishing()) {
            return;
        }
        if (!this.adsConsentManager.canRequestAds(activity)) {
            Log.d(TAG, "Skipping rewarded preload — consent not granted");
            return;
        }
        if (!MobileAds.INSTANCE.isInitialized()) {
            Log.d(TAG, "Skipping rewarded preload — GMA Next-Gen not initialized yet");
        } else {
            if (this.rewardedAds.containsKey(adUnitId) || this.loadingAdUnitIds.contains(adUnitId)) {
                return;
            }
            this.loadingAdUnitIds.add(adUnitId);
            AdMobDiagnostics.logRequest$default("rewarded", adUnitId, null, 4, null);
            RewardedAd.INSTANCE.load(new AdRequest.Builder(adUnitId).build(), new AdLoadCallback<RewardedAd>() { // from class: org.betup.services.ads.rewarded.GoogleRewardedAdController$preload$1
                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
                public void onAdLoaded(RewardedAd ad) {
                    Set set;
                    Map map;
                    RewardedAdListener rewardedAdListener;
                    Intrinsics.checkNotNullParameter(ad, "ad");
                    set = GoogleRewardedAdController.this.loadingAdUnitIds;
                    if (set.remove(adUnitId)) {
                        map = GoogleRewardedAdController.this.rewardedAds;
                        map.put(adUnitId, ad);
                        AdMobDiagnostics.logLoaded("rewarded", adUnitId, AdExtensionsKt.mediationAdapterClassName(ad));
                        rewardedAdListener = GoogleRewardedAdController.this.listener;
                        if (rewardedAdListener != null) {
                            rewardedAdListener.onAdLoaded(adUnitId);
                        }
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError error) {
                    Set set;
                    Map map;
                    RewardedAdListener rewardedAdListener;
                    Intrinsics.checkNotNullParameter(error, "error");
                    set = GoogleRewardedAdController.this.loadingAdUnitIds;
                    if (set.remove(adUnitId)) {
                        map = GoogleRewardedAdController.this.rewardedAds;
                        map.remove(adUnitId);
                        AdMobDiagnostics.logFailed("rewarded", adUnitId, error.getCode(), error.getMessage(), error.getResponseInfo());
                        Log.w("GoogleRewardedAd", "Rewarded load failed for " + adUnitId + ": " + error.getMessage());
                        rewardedAdListener = GoogleRewardedAdController.this.listener;
                        if (rewardedAdListener != null) {
                            rewardedAdListener.onAdFailedToLoad(adUnitId, error.getMessage());
                        }
                    }
                }
            });
        }
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdController
    public boolean isReady(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.rewardedAds.containsKey(adUnitId);
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdController
    public boolean isLoading(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.loadingAdUnitIds.contains(adUnitId);
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdController
    /* renamed from: isShowing, reason: from getter */
    public boolean getRewardPresentationActive() {
        return this.rewardPresentationActive;
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdController
    public void show(final Activity activity, final String adUnitId, final String logicalPlacement) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(logicalPlacement, "logicalPlacement");
        final RewardedAd remove = this.rewardedAds.remove(adUnitId);
        if (remove == null) {
            Log.w(TAG, "Rewarded show requested but ad not loaded for " + adUnitId);
            RewardedAdListener rewardedAdListener = this.listener;
            if (rewardedAdListener != null) {
                rewardedAdListener.onAdFailedToShow(adUnitId, "not_loaded");
                return;
            }
            return;
        }
        if (activity.isFinishing()) {
            this.rewardedAds.put(adUnitId, remove);
            return;
        }
        AdMobDiagnostics.logRequest("rewarded", adUnitId, logicalPlacement);
        this.showingAdUnitId = adUnitId;
        this.rewardPresentationActive = true;
        this.showSessionAlive = true;
        this.fullscreenAdVisible = false;
        this.userEarnedRewardForCurrentShow = false;
        this.pendingDismissAdUnitId = null;
        this.pendingDismissActivity = null;
        this.mainHandler.removeCallbacks(this.dispatchDismissRunnable);
        this.mainHandler.removeCallbacks(this.endShowSessionRunnable);
        remove.setAdEventCallback(new RewardedAdEventCallback() { // from class: org.betup.services.ads.rewarded.GoogleRewardedAdController$show$1
            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
            public void onAdShowedFullScreenContent() {
                Handler handler;
                Runnable runnable;
                Handler handler2;
                Runnable runnable2;
                RewardedAdListener rewardedAdListener2;
                GoogleRewardedAdController.this.rearmPresentationIfNeeded();
                GoogleRewardedAdController.this.fullscreenAdVisible = true;
                handler = GoogleRewardedAdController.this.mainHandler;
                runnable = GoogleRewardedAdController.this.dispatchDismissRunnable;
                handler.removeCallbacks(runnable);
                handler2 = GoogleRewardedAdController.this.mainHandler;
                runnable2 = GoogleRewardedAdController.this.endShowSessionRunnable;
                handler2.removeCallbacks(runnable2);
                GoogleRewardedAdController.this.pendingDismissAdUnitId = null;
                GoogleRewardedAdController.this.pendingDismissActivity = null;
                rewardedAdListener2 = GoogleRewardedAdController.this.listener;
                if (rewardedAdListener2 != null) {
                    rewardedAdListener2.onAdShown(adUnitId, AdExtensionsKt.mediationAdapterClassName(remove));
                }
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
            public void onAdFailedToShowFullScreenContent(FullScreenContentError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Log.w("GoogleRewardedAd", "Rewarded show failed for " + logicalPlacement + ": " + error.getMessage());
                GoogleRewardedAdController.endRewardPresentation$default(GoogleRewardedAdController.this, adUnitId, activity, false, false, true, error.getMessage(), false, 8, null);
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
            public void onAdDismissedFullScreenContent() {
                Handler handler;
                Runnable runnable;
                Handler handler2;
                Runnable runnable2;
                GoogleRewardedAdController.this.fullscreenAdVisible = false;
                GoogleRewardedAdController.this.showingAdUnitId = null;
                GoogleRewardedAdController.this.pendingDismissAdUnitId = adUnitId;
                GoogleRewardedAdController.this.pendingDismissActivity = activity;
                handler = GoogleRewardedAdController.this.mainHandler;
                runnable = GoogleRewardedAdController.this.dispatchDismissRunnable;
                handler.removeCallbacks(runnable);
                handler2 = GoogleRewardedAdController.this.mainHandler;
                runnable2 = GoogleRewardedAdController.this.dispatchDismissRunnable;
                handler2.postDelayed(runnable2, 600L);
            }
        });
        try {
            AdMobFullscreenSessionGuard.enter();
            remove.show(activity, new OnUserEarnedRewardListener() { // from class: org.betup.services.ads.rewarded.GoogleRewardedAdController$$ExternalSyntheticLambda0
                @Override // com.google.android.libraries.ads.mobile.sdk.rewarded.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    GoogleRewardedAdController.show$lambda$3(GoogleRewardedAdController.this, adUnitId, rewardItem);
                }
            });
        } catch (Exception e) {
            Log.e(TAG, "Rewarded show threw for " + logicalPlacement, e);
            String message = e.getMessage();
            if (message == null) {
                message = "show_failed";
            }
            endRewardPresentation$default(this, adUnitId, activity, false, false, true, message, false, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$3(final GoogleRewardedAdController googleRewardedAdController, final String str, RewardItem it) {
        Intrinsics.checkNotNullParameter(it, "it");
        googleRewardedAdController.mainHandler.post(new Runnable() { // from class: org.betup.services.ads.rewarded.GoogleRewardedAdController$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                GoogleRewardedAdController.this.onUserEarnedRewardEvent(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUserEarnedRewardEvent(String adUnitId) {
        this.userEarnedRewardForCurrentShow = true;
        RewardedAdListener rewardedAdListener = this.listener;
        if (rewardedAdListener != null) {
            rewardedAdListener.onUserEarnedReward(adUnitId);
        }
        if (this.rewardPresentationActive && !this.fullscreenAdVisible) {
            this.mainHandler.removeCallbacks(this.dispatchDismissRunnable);
            this.pendingDismissAdUnitId = adUnitId;
            this.mainHandler.postDelayed(this.dispatchDismissRunnable, INTER_CREATIVE_GAP_MS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void rearmPresentationIfNeeded() {
        if (this.rewardPresentationActive || !this.showSessionAlive) {
            return;
        }
        Log.w(TAG, "Re-arming rewarded presentation for next mediation pod creative");
        this.rewardPresentationActive = true;
        AdMobFullscreenSessionGuard.enter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchPendingDismiss() {
        String str;
        if (!this.rewardPresentationActive || this.fullscreenAdVisible || (str = this.pendingDismissAdUnitId) == null) {
            return;
        }
        finishRewardPresentation(str, this.pendingDismissActivity, this.userEarnedRewardForCurrentShow);
    }

    private final void finishRewardPresentation(String adUnitId, Activity activity, boolean earned) {
        if (this.rewardPresentationActive) {
            this.pendingDismissAdUnitId = null;
            this.pendingDismissActivity = null;
            endRewardPresentation$default(this, adUnitId, activity, true, earned, false, null, true, 48, null);
            scheduleShowSessionEnd();
        }
    }

    private final void scheduleShowSessionEnd() {
        this.mainHandler.removeCallbacks(this.endShowSessionRunnable);
        this.mainHandler.postDelayed(this.endShowSessionRunnable, 20000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endShowSessionIfIdle() {
        if (this.rewardPresentationActive) {
            return;
        }
        this.showSessionAlive = false;
        this.userEarnedRewardForCurrentShow = false;
    }

    static /* synthetic */ void endRewardPresentation$default(GoogleRewardedAdController googleRewardedAdController, String str, Activity activity, boolean z, boolean z2, boolean z3, String str2, boolean z4, int i, Object obj) {
        googleRewardedAdController.endRewardPresentation(str, activity, z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z4);
    }

    private final void endRewardPresentation(String adUnitId, Activity activity, boolean notifyDismiss, boolean earned, boolean notifyShowFailed, String errorMessage, boolean keepShowSessionAlive) {
        RewardedAdListener rewardedAdListener;
        this.mainHandler.removeCallbacks(this.dispatchDismissRunnable);
        this.pendingDismissAdUnitId = null;
        this.pendingDismissActivity = null;
        boolean z = this.rewardPresentationActive;
        this.rewardPresentationActive = false;
        this.fullscreenAdVisible = false;
        this.showingAdUnitId = null;
        if (!keepShowSessionAlive) {
            this.mainHandler.removeCallbacks(this.endShowSessionRunnable);
            this.showSessionAlive = false;
            this.userEarnedRewardForCurrentShow = false;
        }
        if (z) {
            AdMobFullscreenSessionGuard.exit();
        }
        if (notifyShowFailed) {
            RewardedAdListener rewardedAdListener2 = this.listener;
            if (rewardedAdListener2 != null) {
                if (errorMessage == null) {
                    errorMessage = "show_failed";
                }
                rewardedAdListener2.onAdFailedToShow(adUnitId, errorMessage);
            }
        } else if (notifyDismiss && (rewardedAdListener = this.listener) != null) {
            rewardedAdListener.onAdDismissed(adUnitId, earned);
        }
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        preload(activity, adUnitId);
    }

    @Override // org.betup.services.ads.rewarded.RewardedAdController
    public void clear() {
        this.mainHandler.removeCallbacks(this.dispatchDismissRunnable);
        this.mainHandler.removeCallbacks(this.endShowSessionRunnable);
        this.pendingDismissAdUnitId = null;
        this.pendingDismissActivity = null;
        this.loadingAdUnitIds.clear();
        this.rewardedAds.clear();
        this.rewardPresentationActive = false;
        this.showSessionAlive = false;
        this.fullscreenAdVisible = false;
        this.showingAdUnitId = null;
        this.userEarnedRewardForCurrentShow = false;
    }
}
