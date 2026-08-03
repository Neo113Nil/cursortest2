package com.unity3d.services;

/* compiled from: UnityServices.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007R*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\f\u001a\u00020\u00048\u0006X\u0087D¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0002\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/unity3d/services/UnityServices;", "", "()V", "debugMode", "", "getDebugMode$annotations", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "isInitialized", "isInitialized$annotations", "isSupported", "isSupported$annotations", "version", "", "getVersion$annotations", "getVersion", "()Ljava/lang/String;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase.initializeMethodName, "", "context", "Landroid/content/Context;", com.unity3d.ads.core.domain.AndroidGetAdPlayerContext.KEY_GAME_ID, "testMode", "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "UnityServicesError", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnityServices {
    public static final com.unity3d.services.UnityServices INSTANCE = new com.unity3d.services.UnityServices();
    private static final boolean isSupported = true;

    /* compiled from: UnityServices.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/services/UnityServices$UnityServicesError;", "", "(Ljava/lang/String;I)V", "INVALID_ARGUMENT", "INIT_SANITY_CHECK_FAIL", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UnityServicesError {
        INVALID_ARGUMENT,
        INIT_SANITY_CHECK_FAIL
    }

    @kotlin.jvm.JvmStatic
    public static /* synthetic */ void getDebugMode$annotations() {
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

    private UnityServices() {
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void initialize(android.content.Context context, java.lang.String gameId, boolean testMode, com.unity3d.ads.IUnityAdsInitializationListener initializationListener) {
        synchronized (com.unity3d.services.UnityServices.class) {
            com.unity3d.services.core.log.DeviceLog.entered();
            com.unity3d.services.core.properties.SdkProperties.addInitializationListener(initializationListener);
            com.unity3d.services.core.properties.SdkProperties.setTestMode(testMode);
            com.unity3d.services.core.properties.SdkProperties.setDebugMode(com.unity3d.services.core.properties.SdkProperties.getDebugMode());
            com.unity3d.services.core.lifecycle.CachedLifecycle.register();
            com.unity3d.services.UnityAdsSDK.initialize$default(new com.unity3d.services.UnityAdsSDK(null, 1, null), gameId, null, 2, null);
        }
    }

    public static final boolean isSupported() {
        return isSupported;
    }

    public static final boolean isInitialized() {
        return com.unity3d.services.core.properties.SdkProperties.isInitialized();
    }

    public static final java.lang.String getVersion() {
        java.lang.String versionName = com.unity3d.services.core.properties.SdkProperties.getVersionName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionName, "getVersionName()");
        return versionName;
    }

    public static final boolean getDebugMode() {
        return com.unity3d.services.core.properties.SdkProperties.getDebugMode();
    }

    public static final void setDebugMode(boolean z) {
        com.unity3d.services.core.properties.SdkProperties.setDebugMode(z);
    }
}
