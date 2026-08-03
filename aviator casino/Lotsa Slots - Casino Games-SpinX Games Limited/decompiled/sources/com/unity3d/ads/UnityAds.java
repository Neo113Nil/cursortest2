package com.unity3d.ads;

/* compiled from: UnityAds.kt */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004./01B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0011\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0007J\u0018\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001c\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J$\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\u0004H\u0007J.\u0010\u001b\u001a\u00020\u00162\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010!\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0007J\u0012\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0007J\u001c\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010$H\u0007J&\u0010\"\u001a\u00020\u00162\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010\u0017\u001a\u0004\u0018\u00010$H\u0007J\u001c\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000fH\u0007J&\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010*\u001a\u0004\u0018\u00010+H\u0007J&\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010-H\u0007J0\u0010'\u001a\u00020\u00162\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010#\u001a\u0004\u0018\u00010\u000f2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010*\u001a\u0004\u0018\u00010+H\u0007R*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0012¨\u00062"}, d2 = {"Lcom/unity3d/ads/UnityAds;", "", "()V", "debugMode", "", "getDebugMode$annotations", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "isInitialized", "isInitialized$annotations", "isSupported", "isSupported$annotations", "token", "", "getToken$annotations", "getToken", "()Ljava/lang/String;", "version", "getVersion$annotations", "getVersion", "", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/ads/IUnityAdsTokenListener;", "configuration", "Lcom/unity3d/ads/TokenConfiguration;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "context", "Landroid/content/Context;", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "testMode", "load", "placementId", "Lcom/unity3d/ads/IUnityAdsLoadListener;", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", com.ironsource.C3232q2.v, "activity", "Landroid/app/Activity;", "showListener", "Lcom/unity3d/ads/IUnityAdsShowListener;", "options", "Lcom/unity3d/ads/UnityAdsShowOptions;", "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowCompletionState", "UnityAdsShowError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UnityAds {
    public static final com.unity3d.ads.UnityAds INSTANCE = new com.unity3d.ads.UnityAds();

    /* compiled from: UnityAds.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* compiled from: UnityAds.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* compiled from: UnityAds.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* compiled from: UnityAds.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", "TIMEOUT", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getToken$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void isSupported$annotations() {
    }

    private UnityAds() {
    }

    @kotlin.jvm.JvmStatic
    public static final void initialize(android.content.Context context, java.lang.String gameId) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void initialize(android.content.Context context, java.lang.String gameId, final com.unity3d.ads.IUnityAdsInitializationListener initializationListener) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        final java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null || initializationListener == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.UnityAds.initialize$lambda$4$lambda$3$lambda$2(com.unity3d.ads.IUnityAdsInitializationListener.this, m10801exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(com.unity3d.ads.IUnityAdsInitializationListener listener, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    @kotlin.jvm.JvmStatic
    public static final void initialize(android.content.Context context, java.lang.String gameId, boolean testMode) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void initialize(android.content.Context context, java.lang.String gameId, boolean testMode, final com.unity3d.ads.IUnityAdsInitializationListener initializationListener) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        final java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null || initializationListener == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.UnityAds.initialize$lambda$9$lambda$8$lambda$7(com.unity3d.ads.IUnityAdsInitializationListener.this, m10801exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(com.unity3d.ads.IUnityAdsInitializationListener listener, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(com.unity3d.ads.UnityAds.UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    public static final boolean isInitialized() {
        return com.unity3d.services.ads.UnityAdsImplementation.getInstance().isInitialized();
    }

    public static final boolean isSupported() {
        return com.unity3d.services.ads.UnityAdsImplementation.getInstance().isSupported();
    }

    public static final java.lang.String getVersion() {
        java.lang.String version = com.unity3d.services.ads.UnityAdsImplementation.getInstance().getVersion();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(version, "getInstance().version");
        return version;
    }

    @kotlin.Deprecated(message = "")
    @kotlin.jvm.JvmStatic
    public static final void show(android.app.Activity activity, java.lang.String placementId) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().show(activity, placementId, new com.unity3d.ads.UnityAdsShowOptions(), null);
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void show(android.app.Activity activity, java.lang.String placementId, com.unity3d.ads.IUnityAdsShowListener showListener) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().show(activity, placementId, new com.unity3d.ads.UnityAdsShowOptions(), showListener);
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    @kotlin.Deprecated(message = "")
    @kotlin.jvm.JvmStatic
    public static final void show(android.app.Activity activity, java.lang.String placementId, com.unity3d.ads.UnityAdsShowOptions options) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void show(android.app.Activity activity, final java.lang.String placementId, com.unity3d.ads.UnityAdsShowOptions options, final com.unity3d.ads.IUnityAdsShowListener showListener) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        final java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null || showListener == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.UnityAds.show$lambda$16$lambda$15$lambda$14(com.unity3d.ads.IUnityAdsShowListener.this, placementId, m10801exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(com.unity3d.ads.IUnityAdsShowListener listener, java.lang.String str, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        listener.onUnityAdsShowFailure(str, com.unity3d.ads.UnityAds.UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + exception.getMessage());
    }

    public static final boolean getDebugMode() {
        return com.unity3d.services.ads.UnityAdsImplementation.getInstance().getDebugMode();
    }

    public static final void setDebugMode(boolean z) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().setDebugMode(z);
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    @kotlin.Deprecated(message = "")
    @kotlin.jvm.JvmStatic
    public static final void load(java.lang.String placementId) {
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            load(placementId, new com.unity3d.ads.IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(java.lang.String placementId2) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(java.lang.String placementId2, com.unity3d.ads.UnityAds.UnityAdsLoadError error, java.lang.String message) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "error");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
                }
            });
            kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void load(final java.lang.String placementId, final com.unity3d.ads.IUnityAdsLoadListener listener) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().load(placementId, new com.unity3d.ads.UnityAdsLoadOptions(), listener);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        final java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null || listener == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.UnityAds.load$lambda$22$lambda$21$lambda$20(com.unity3d.ads.IUnityAdsLoadListener.this, placementId, m10801exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(com.unity3d.ads.IUnityAdsLoadListener loadListener, java.lang.String str, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "$loadListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    @kotlin.jvm.JvmStatic
    public static final void load(final java.lang.String placementId, com.unity3d.ads.UnityAdsLoadOptions loadOptions, final com.unity3d.ads.IUnityAdsLoadListener listener) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.IUnityAds unityAdsImplementation = com.unity3d.services.ads.UnityAdsImplementation.getInstance();
            if (loadOptions == null) {
                loadOptions = new com.unity3d.ads.UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(placementId, loadOptions, listener);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        final java.lang.Throwable m10801exceptionOrNullimpl = kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl);
        if (m10801exceptionOrNullimpl == null || listener == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.UnityAds.load$lambda$26$lambda$25$lambda$24(com.unity3d.ads.IUnityAdsLoadListener.this, placementId, m10801exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$26$lambda$25$lambda$24(com.unity3d.ads.IUnityAdsLoadListener loadListener, java.lang.String str, java.lang.Throwable exception) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadListener, "$loadListener");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    public static final java.lang.String getToken() {
        return com.unity3d.services.ads.UnityAdsImplementation.getInstance().getToken();
    }

    @kotlin.jvm.JvmStatic
    public static final void getToken(final com.unity3d.ads.IUnityAdsTokenListener listener) {
        java.lang.Object m10798constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().getToken(listener);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) == null || listener == null) {
            return;
        }
        com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.unity3d.ads.UnityAds.getToken$lambda$30$lambda$29$lambda$28(com.unity3d.ads.IUnityAdsTokenListener.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$30$lambda$29$lambda$28(com.unity3d.ads.IUnityAdsTokenListener tokenListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenListener, "$tokenListener");
        tokenListener.onUnityAdsTokenReady(null);
    }

    @kotlin.jvm.JvmStatic
    public static final void getToken(com.unity3d.ads.TokenConfiguration configuration, final com.unity3d.ads.IUnityAdsTokenListener listener) {
        java.lang.Object m10798constructorimpl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.unity3d.services.ads.UnityAdsImplementation.getInstance().getToken(configuration, listener);
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10801exceptionOrNullimpl(m10798constructorimpl) != null) {
            com.unity3d.services.core.misc.Utilities.wrapCustomerListener(new java.lang.Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    com.unity3d.ads.UnityAds.getToken$lambda$33$lambda$32(com.unity3d.ads.IUnityAdsTokenListener.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$33$lambda$32(com.unity3d.ads.IUnityAdsTokenListener listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onUnityAdsTokenReady(null);
    }
}
