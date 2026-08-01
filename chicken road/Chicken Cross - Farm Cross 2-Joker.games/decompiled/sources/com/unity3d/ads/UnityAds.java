package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4593pg;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.di.ServiceKey;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.misc.Utilities;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: UnityAds.kt */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004EFGHB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J&\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J$\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\rH\u0007J.\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\u001c\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0007J&\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J&\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J0\u0010\u0017\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0007J\u0012\u0010$\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010$\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J&\u0010$\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010(2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0012\u0010+\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010,H\u0007J\u0018\u0010+\u001a\u00020\u00052\u0006\u0010-\u001a\u00020.2\u0006\u0010%\u001a\u00020,H\u0007J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010-\u001a\u00020/2\u0006\u0010%\u001a\u000200H\u0007R\u001a\u0010\u000e\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0013\u001a\u00020\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\r8F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b \u0010\u0003\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010#R\u001c\u0010)\u001a\u0004\u0018\u00010\t8FX\u0087\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0003\u001a\u0004\b+\u0010\u0016R&\u00101\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b2\u0010\u0003\u001a\u0004\b3\u0010\u0016\"\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\b7\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\b>\u0010\u0003\u001a\u0004\b?\u00109\"\u0004\b@\u0010;R(\u0010A\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010<\u0012\u0004\bB\u0010\u0003\u001a\u0004\bC\u00109\"\u0004\bD\u0010;¨\u0006I"}, d2 = {"Lcom/unity3d/ads/UnityAds;", "", "<init>", "()V", "initialize", "", "context", "Landroid/content/Context;", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "testMode", "", "isInitialized", "isInitialized$annotations", "()Z", "isSupported", "isSupported$annotations", "version", "getVersion$annotations", C4593pg.b, "()Ljava/lang/String;", "show", "activity", "Landroid/app/Activity;", "placementId", "showListener", "Lcom/unity3d/ads/IUnityAdsShowListener;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/unity3d/ads/UnityAdsShowOptions;", "debugMode", "getDebugMode$annotations", "getDebugMode", "setDebugMode", "(Z)V", "load", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsLoadListener;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "token", "getToken$annotations", "getToken", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "configuration", "Lcom/unity3d/ads/TokenConfiguration;", "Lcom/unity3d/ads/InitializationConfiguration;", "Lcom/unity3d/ads/InitializationListener;", "userIdentifier", "getUserIdentifier$annotations", "getUserIdentifier", "setUserIdentifier", "(Ljava/lang/String;)V", "userConsent", "getUserConsent$annotations", "getUserConsent", "()Ljava/lang/Boolean;", "setUserConsent", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "userOptOut", "getUserOptOut$annotations", "getUserOptOut", "setUserOptOut", "nonBehavioral", "getNonBehavioral$annotations", "getNonBehavioral", "setNonBehavioral", "UnityAdsShowCompletionState", "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowError", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();
    private static Boolean nonBehavioral;
    private static Boolean userConsent;
    private static String userIdentifier;
    private static Boolean userOptOut;

    @Deprecated(message = "Use logLevel in InitializationConfiguration instead.")
    @JvmStatic
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getNonBehavioral$annotations() {
    }

    @Deprecated(message = "Use getToken(TokenConfiguration, IUnityAdsTokenListener) instead")
    @JvmStatic
    public static /* synthetic */ void getToken$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getUserConsent$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getUserIdentifier$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getUserOptOut$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    @Deprecated(message = "isSupported always returns true and will be removed in a future version.")
    @JvmStatic
    public static /* synthetic */ void isSupported$annotations() {
    }

    private UnityAds() {
    }

    @Deprecated(message = "Use initialize(InitializationConfiguration, InitializationListener) instead")
    @JvmStatic
    public static final void initialize(Context context, String gameId) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "Use initialize(InitializationConfiguration, InitializationListener) instead")
    @JvmStatic
    public static final void initialize(Context context, String gameId, final IUnityAdsInitializationListener initializationListener) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener.this, m8082exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    @Deprecated(message = "Use initialize(InitializationConfiguration, InitializationListener) instead")
    @JvmStatic
    public static final void initialize(Context context, String gameId, boolean testMode) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "Use initialize(InitializationConfiguration, InitializationListener) instead")
    @JvmStatic
    public static final void initialize(Context context, String gameId, boolean testMode, final IUnityAdsInitializationListener initializationListener) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener.this, m8082exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener iUnityAdsInitializationListener, Throwable th) {
        iUnityAdsInitializationListener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + th.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion(...)");
        return version;
    }

    @Deprecated(message = "Use InterstitialAd or RewardedAd show APIs instead")
    @JvmStatic
    public static final void show(Activity activity, String placementId) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), null);
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "Use InterstitialAd or RewardedAd show APIs instead")
    @JvmStatic
    public static final void show(Activity activity, String placementId, IUnityAdsShowListener showListener) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), showListener);
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "Use InterstitialAd or RewardedAd show APIs instead")
    @JvmStatic
    public static final void show(Activity activity, String placementId, UnityAdsShowOptions options) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "Use InterstitialAd or RewardedAd show APIs instead")
    @JvmStatic
    public static final void show(Activity activity, final String placementId, UnityAdsShowOptions options, final IUnityAdsShowListener showListener) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null || showListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener.this, placementId, m8082exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener iUnityAdsShowListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsShowListener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + th.getMessage());
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final void setDebugMode(boolean z) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().setDebugMode(z);
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "Use InterstitialAd.load() or RewardedAd.load() instead")
    @JvmStatic
    public static final void load(String placementId) {
        try {
            Result.Companion companion = Result.INSTANCE;
            load(placementId, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId2) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            });
            Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "Use InterstitialAd.load() or RewardedAd.load() instead")
    @JvmStatic
    public static final void load(String placementId, IUnityAdsLoadListener listener) {
        load(placementId, new UnityAdsLoadOptions(), listener);
    }

    @Deprecated(message = "Use InterstitialAd.load() or RewardedAd.load() instead")
    @JvmStatic
    public static final void load(final String placementId, UnityAdsLoadOptions loadOptions, final IUnityAdsLoadListener listener) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (loadOptions == null) {
                loadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(placementId, loadOptions, listener);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(m8079constructorimpl);
        if (m8082exceptionOrNullimpl == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener.this, placementId, m8082exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener iUnityAdsLoadListener, String str, Throwable th) {
        if (str == null) {
            str = "unknown";
        }
        iUnityAdsLoadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + th.getMessage());
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    @Deprecated(message = "Use getToken(TokenConfiguration, IUnityAdsTokenListener) instead")
    @JvmStatic
    public static final void getToken(final IUnityAdsTokenListener listener) {
        Object m8079constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().getToken(listener);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                IUnityAdsTokenListener.this.onUnityAdsTokenReady(null);
            }
        });
    }

    @JvmStatic
    public static final void getToken(TokenConfiguration configuration, final IUnityAdsTokenListener listener) {
        Object m8079constructorimpl;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            m8079constructorimpl = Result.m8079constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m8079constructorimpl = Result.m8079constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m8082exceptionOrNullimpl(m8079constructorimpl) != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    IUnityAdsTokenListener.this.onUnityAdsTokenReady(null);
                }
            });
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "<init>", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsShowCompletionState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnityAdsShowCompletionState[] $VALUES;
        public static final UnityAdsShowCompletionState SKIPPED = new UnityAdsShowCompletionState("SKIPPED", 0);
        public static final UnityAdsShowCompletionState COMPLETED = new UnityAdsShowCompletionState("COMPLETED", 1);

        private static final /* synthetic */ UnityAdsShowCompletionState[] $values() {
            return new UnityAdsShowCompletionState[]{SKIPPED, COMPLETED};
        }

        public static EnumEntries<UnityAdsShowCompletionState> getEntries() {
            return $ENTRIES;
        }

        private UnityAdsShowCompletionState(String str, int i) {
        }

        static {
            UnityAdsShowCompletionState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static UnityAdsShowCompletionState valueOf(String str) {
            return (UnityAdsShowCompletionState) Enum.valueOf(UnityAdsShowCompletionState.class, str);
        }

        public static UnityAdsShowCompletionState[] values() {
            return (UnityAdsShowCompletionState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "<init>", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsInitializationError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnityAdsInitializationError[] $VALUES;
        public static final UnityAdsInitializationError INTERNAL_ERROR = new UnityAdsInitializationError("INTERNAL_ERROR", 0);
        public static final UnityAdsInitializationError INVALID_ARGUMENT = new UnityAdsInitializationError("INVALID_ARGUMENT", 1);
        public static final UnityAdsInitializationError AD_BLOCKER_DETECTED = new UnityAdsInitializationError("AD_BLOCKER_DETECTED", 2);

        private static final /* synthetic */ UnityAdsInitializationError[] $values() {
            return new UnityAdsInitializationError[]{INTERNAL_ERROR, INVALID_ARGUMENT, AD_BLOCKER_DETECTED};
        }

        public static EnumEntries<UnityAdsInitializationError> getEntries() {
            return $ENTRIES;
        }

        private UnityAdsInitializationError(String str, int i) {
        }

        static {
            UnityAdsInitializationError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static UnityAdsInitializationError valueOf(String str) {
            return (UnityAdsInitializationError) Enum.valueOf(UnityAdsInitializationError.class, str);
        }

        public static UnityAdsInitializationError[] values() {
            return (UnityAdsInitializationError[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsLoadError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnityAdsLoadError[] $VALUES;
        public static final UnityAdsLoadError INITIALIZE_FAILED = new UnityAdsLoadError("INITIALIZE_FAILED", 0);
        public static final UnityAdsLoadError INTERNAL_ERROR = new UnityAdsLoadError("INTERNAL_ERROR", 1);
        public static final UnityAdsLoadError INVALID_ARGUMENT = new UnityAdsLoadError("INVALID_ARGUMENT", 2);
        public static final UnityAdsLoadError NO_FILL = new UnityAdsLoadError("NO_FILL", 3);
        public static final UnityAdsLoadError TIMEOUT = new UnityAdsLoadError("TIMEOUT", 4);

        private static final /* synthetic */ UnityAdsLoadError[] $values() {
            return new UnityAdsLoadError[]{INITIALIZE_FAILED, INTERNAL_ERROR, INVALID_ARGUMENT, NO_FILL, TIMEOUT};
        }

        public static EnumEntries<UnityAdsLoadError> getEntries() {
            return $ENTRIES;
        }

        private UnityAdsLoadError(String str, int i) {
        }

        static {
            UnityAdsLoadError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static UnityAdsLoadError valueOf(String str) {
            return (UnityAdsLoadError) Enum.valueOf(UnityAdsLoadError.class, str);
        }

        public static UnityAdsLoadError[] values() {
            return (UnityAdsLoadError[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UnityAds.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", "TIMEOUT", "EXPIRED", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnityAdsShowError {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UnityAdsShowError[] $VALUES;
        public static final UnityAdsShowError NOT_INITIALIZED = new UnityAdsShowError("NOT_INITIALIZED", 0);
        public static final UnityAdsShowError NOT_READY = new UnityAdsShowError("NOT_READY", 1);
        public static final UnityAdsShowError VIDEO_PLAYER_ERROR = new UnityAdsShowError("VIDEO_PLAYER_ERROR", 2);
        public static final UnityAdsShowError INVALID_ARGUMENT = new UnityAdsShowError("INVALID_ARGUMENT", 3);
        public static final UnityAdsShowError NO_CONNECTION = new UnityAdsShowError("NO_CONNECTION", 4);
        public static final UnityAdsShowError ALREADY_SHOWING = new UnityAdsShowError("ALREADY_SHOWING", 5);
        public static final UnityAdsShowError INTERNAL_ERROR = new UnityAdsShowError("INTERNAL_ERROR", 6);
        public static final UnityAdsShowError TIMEOUT = new UnityAdsShowError("TIMEOUT", 7);
        public static final UnityAdsShowError EXPIRED = new UnityAdsShowError("EXPIRED", 8);

        private static final /* synthetic */ UnityAdsShowError[] $values() {
            return new UnityAdsShowError[]{NOT_INITIALIZED, NOT_READY, VIDEO_PLAYER_ERROR, INVALID_ARGUMENT, NO_CONNECTION, ALREADY_SHOWING, INTERNAL_ERROR, TIMEOUT, EXPIRED};
        }

        public static EnumEntries<UnityAdsShowError> getEntries() {
            return $ENTRIES;
        }

        private UnityAdsShowError(String str, int i) {
        }

        static {
            UnityAdsShowError[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static UnityAdsShowError valueOf(String str) {
            return (UnityAdsShowError) Enum.valueOf(UnityAdsShowError.class, str);
        }

        public static UnityAdsShowError[] values() {
            return (UnityAdsShowError[]) $VALUES.clone();
        }
    }

    @JvmStatic
    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), null, null, new UnityAds$initialize$7(configuration, listener, null), 3, null);
    }

    public static final String getUserIdentifier() {
        return userIdentifier;
    }

    public static final void setUserIdentifier(String str) {
        userIdentifier = str;
    }

    public static final Boolean getUserConsent() {
        return userConsent;
    }

    public static final void setUserConsent(Boolean bool) {
        userConsent = bool;
    }

    public static final Boolean getUserOptOut() {
        return userOptOut;
    }

    public static final void setUserOptOut(Boolean bool) {
        userOptOut = bool;
    }

    public static final Boolean getNonBehavioral() {
        return nonBehavioral;
    }

    public static final void setNonBehavioral(Boolean bool) {
        nonBehavioral = bool;
    }
}
