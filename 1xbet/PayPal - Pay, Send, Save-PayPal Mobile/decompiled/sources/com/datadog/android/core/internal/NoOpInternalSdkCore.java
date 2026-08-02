package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001:\n\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000b\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u0003J(\u0010\u0014\u001a\u00020\u00132\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0002\b\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0003J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u0004\u0018\u00010$2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\"H\u0016¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u001f2\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010)J-\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u001aH\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020*H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b:\u0010;J7\u0010>\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\b>\u0010?J\u0019\u0010B\u001a\u00020\b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010D\u001a\u00020\b2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bD\u00109J\u001f\u0010G\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJA\u0010N\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u00052\b\u0010=\u001a\u0004\u0018\u00010\u00052\b\u0010M\u001a\u0004\u0018\u00010\u00052\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0016¢\u0006\u0004\bN\u0010OJA\u0010R\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u00052\u0006\u0010+\u001a\u00020*2 \u0010Q\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060P\u0012\u0004\u0012\u00020\b0\u000fH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010V\u001a\u00020\b2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0017\u0010Z\u001a\u00020\b2\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020T8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020T8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b_\u0010]R\u0014\u0010d\u001a\u00020a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010h\u001a\u00020e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020*8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u00101R\u0016\u0010l\u001a\u0004\u0018\u00010T8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010kR\u0016\u0010p\u001a\u0004\u0018\u00010m8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001a\u0010=\u001a\u00020\u00058\u0017X\u0097D¢\u0006\f\n\u0004\b=\u0010q\u001a\u0004\br\u0010sR\u0014\u0010w\u001a\u00020t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bu\u0010vR\u0016\u0010{\u001a\u0004\u0018\u00010x8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0014\u0010}\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010sR\u001d\u0010\u007f\u001a\u00020~8\u0017X\u0097\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0083\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0089\u0001\u001a\u00020I8WX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore;", "Lcom/datadog/android/core/InternalSdkCore;", "<init>", "()V", "", "", "", "extraInfo", "", "addAccountExtraInfo", "(Ljava/util/Map;)V", "addUserProperties", "clearAccountInfo", "clearAllData", "clearUserInfo", "Lkotlin/Function1;", "Lokhttp3/OkHttpClient$Builder;", "Lkotlin/ExtensionFunctionType;", "block", "Lokhttp3/Call$Factory;", "createOkHttpCallFactory", "(Lkotlin/jvm/functions/Function1;)Lokhttp3/Call$Factory;", "executorContext", "Ljava/util/concurrent/ScheduledExecutorService;", "createScheduledExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ScheduledExecutorService;", "Ljava/util/concurrent/ExecutorService;", "createSingleThreadExecutorService", "(Ljava/lang/String;)Ljava/util/concurrent/ExecutorService;", "deleteLastViewEvent", "", "Lcom/datadog/android/api/feature/FeatureScope;", "getAllFeatures", "()Ljava/util/List;", "", "withFeatureContexts", "Lcom/datadog/android/api/context/DatadogContext;", "getDatadogContext", "(Ljava/util/Set;)Lcom/datadog/android/api/context/DatadogContext;", "featureName", "getFeature", "(Ljava/lang/String;)Lcom/datadog/android/api/feature/FeatureScope;", "", "useContextThread", "getFeatureContext", "(Ljava/lang/String;Z)Ljava/util/Map;", "getPersistenceExecutorService", "()Ljava/util/concurrent/ExecutorService;", "isCoreActive", "()Z", "Lcom/datadog/android/api/feature/Feature;", "feature", "registerFeature", "(Lcom/datadog/android/api/feature/Feature;)V", "Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeContextUpdateReceiver", "(Lcom/datadog/android/api/feature/FeatureContextUpdateReceiver;)V", "removeEventReceiver", "(Ljava/lang/String;)V", "id", "name", "setAccountInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Ljava/util/UUID;", "anonymousId", "setAnonymousId", "(Ljava/util/UUID;)V", "setContextUpdateReceiver", "Lcom/datadog/android/api/feature/FeatureEventReceiver;", "receiver", "setEventReceiver", "(Ljava/lang/String;Lcom/datadog/android/api/feature/FeatureEventReceiver;)V", "Lcom/datadog/android/privacy/TrackingConsent;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.TRACKING_CONSENT_KEY, "setTrackingConsent", "(Lcom/datadog/android/privacy/TrackingConsent;)V", "email", "setUserInfo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "", "updateCallback", "updateFeatureContext", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "", "anrTimestamp", "writeLastFatalAnrSent", "(J)V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "writeLastViewEvent", "([B)V", "getAppStartTimeNs", "()J", "appStartTimeNs", "getAppUptimeNs", "appUptimeNs", "Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "getFirstPartyHostResolver", "()Lcom/datadog/android/core/internal/net/FirstPartyHostHeaderTypeResolver;", "firstPartyHostResolver", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger", "()Lcom/datadog/android/api/InternalLogger;", "internalLogger", "isDeveloperModeEnabled", "getLastFatalAnrSent", "()Ljava/lang/Long;", "lastFatalAnrSent", "Lcom/google/gson/JsonObject;", "getLastViewEvent", "()Lcom/google/gson/JsonObject;", "lastViewEvent", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/datadog/android/api/context/NetworkInfo;", "getNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "networkInfo", "Ljava/io/File;", "getRootStorageDir", "()Ljava/io/File;", "rootStorageDir", "getService", "service", "Lcom/datadog/android/api/context/TimeInfo;", "time", "Lcom/datadog/android/api/context/TimeInfo;", "getTime", "()Lcom/datadog/android/api/context/TimeInfo;", "Lcom/datadog/android/internal/time/TimeProvider;", "getTimeProvider", "()Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "getTrackingConsent", "()Lcom/datadog/android/privacy/TrackingConsent;", "trackingConsent", "NoOpCall", "NoOpCallFactory", "NoOpExecutorService", "NoOpScheduledExecutorService", "NoOpScheduledFuture"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpInternalSdkCore implements com.datadog.android.core.InternalSdkCore {
    public static final com.datadog.android.core.internal.NoOpInternalSdkCore INSTANCE;
    private static final java.lang.String name;
    private static final com.datadog.android.api.context.TimeInfo time;

    @Override // com.datadog.android.api.SdkCore
    public final void clearAccountInfo() {
    }

    @Override // com.datadog.android.api.SdkCore
    public final void clearAllData() {
    }

    @Override // com.datadog.android.api.SdkCore
    public final void clearUserInfo() {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void deleteLastViewEvent() {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final long getAppStartTimeNs() {
        return 0L;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final long getAppUptimeNs() {
        return 0L;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final java.lang.Long getLastFatalAnrSent() {
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final com.google.gson.JsonObject getLastViewEvent() {
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final java.io.File getRootStorageDir() {
        return null;
    }

    @Override // com.datadog.android.api.SdkCore
    public final boolean isCoreActive() {
        return false;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    /* renamed from: isDeveloperModeEnabled */
    public final boolean getIsDeveloperModeEnabled() {
        return false;
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final void setAnonymousId(java.util.UUID anonymousId) {
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void writeLastFatalAnrSent(long anrTimestamp) {
    }

    private NoOpInternalSdkCore() {
    }

    static {
        com.datadog.android.core.internal.NoOpInternalSdkCore noOpInternalSdkCore = new com.datadog.android.core.internal.NoOpInternalSdkCore();
        INSTANCE = noOpInternalSdkCore;
        name = "no-op";
        long deviceTimestampMillis = noOpInternalSdkCore.getTimeProvider().getDeviceTimestampMillis();
        time = com.datadog.android.api.context.TimeInfo.INSTANCE.getEMPTY$dd_sdk_android_core_release().copy(java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(deviceTimestampMillis), java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(deviceTimestampMillis), 0L, 0L);
    }

    @Override // com.datadog.android.api.SdkCore
    public final java.lang.String getName() {
        return name;
    }

    @Override // com.datadog.android.api.SdkCore
    public final com.datadog.android.api.context.TimeInfo getTime() {
        return time;
    }

    @Override // com.datadog.android.api.SdkCore
    public final java.lang.String getService() {
        return "";
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return new com.datadog.android.core.internal.logger.SdkInternalLogger(this, null, null, 6, null);
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final com.datadog.android.internal.time.TimeProvider getTimeProvider() {
        return new com.datadog.android.internal.time.DefaultTimeProvider();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final com.datadog.android.api.context.NetworkInfo getNetworkInfo() {
        return new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final com.datadog.android.privacy.TrackingConsent getTrackingConsent() {
        return com.datadog.android.privacy.TrackingConsent.NOT_GRANTED;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final com.datadog.android.core.internal.net.FirstPartyHostHeaderTypeResolver getFirstPartyHostResolver() {
        return new com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver(kotlin.collections.MapsKt.emptyMap());
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final java.util.Map<java.lang.String, java.lang.Object> getFeatureContext(java.lang.String featureName, boolean useContextThread) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        return kotlin.collections.MapsKt.emptyMap();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final java.util.concurrent.ExecutorService createSingleThreadExecutorService(java.lang.String executorContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorContext, "");
        return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpExecutorService();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final java.util.concurrent.ScheduledExecutorService createScheduledExecutorService(java.lang.String executorContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorContext, "");
        return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpScheduledExecutorService();
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final okhttp3.Call.Factory createOkHttpCallFactory(kotlin.jvm.functions.Function1<? super okhttp3.OkHttpClient.Builder, kotlin.Unit> block) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
        return com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpCallFactory.INSTANCE;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final java.util.concurrent.ExecutorService getPersistenceExecutorService() {
        return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpExecutorService();
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final java.util.List<com.datadog.android.api.feature.FeatureScope> getAllFeatures() {
        return kotlin.collections.CollectionsKt.emptyList();
    }

    @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0018J/\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b#\u0010$J/\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u000b2\u0006\u0010%\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010&J-\u0010#\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00102\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0016¢\u0006\u0004\b#\u0010'"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpExecutorService;", "Ljava/util/concurrent/ExecutorService;", "<init>", "()V", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "T", "", "Ljava/util/concurrent/Callable;", "tasks", "", "Ljava/util/concurrent/Future;", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "()Z", "isTerminated", "shutdown", "shutdownNow", "()Ljava/util/List;", "task", "submit", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class NoOpExecutorService implements java.util.concurrent.ExecutorService {
        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) {
            return true;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable command) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final java.util.concurrent.Future<?> submit(java.lang.Runnable task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final java.util.List<java.lang.Runnable> shutdownNow() {
            return new java.util.ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) {
            return new java.util.ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) {
            return new java.util.ArrayList();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ9\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0018J/\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0016\u0010\u0013\u001a\u0012\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0018\u00010\u00112\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ/\u0010!\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010\"J=\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010#2\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b!\u0010%J7\u0010(\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b(\u0010)J7\u0010*\u001a\u0006\u0012\u0002\b\u00030 2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b*\u0010)J\u000f\u0010+\u001a\u00020\rH\u0016¢\u0006\u0004\b+\u0010\u0003J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0014H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00152\b\u0010.\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b/\u00100J/\u0010/\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00102\b\u0010.\u001a\u0004\u0018\u00010\u000b2\u0006\u00101\u001a\u00028\u0000H\u0016¢\u0006\u0004\b/\u00102J-\u0010/\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u00102\u000e\u0010.\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012H\u0016¢\u0006\u0004\b/\u00103"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpScheduledExecutorService;", "Ljava/util/concurrent/ScheduledExecutorService;", "<init>", "()V", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "", "awaitTermination", "(JLjava/util/concurrent/TimeUnit;)Z", "Ljava/lang/Runnable;", "command", "", "execute", "(Ljava/lang/Runnable;)V", "T", "", "Ljava/util/concurrent/Callable;", "tasks", "", "Ljava/util/concurrent/Future;", "invokeAll", "(Ljava/util/Collection;)Ljava/util/List;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/util/List;", "invokeAny", "(Ljava/util/Collection;)Ljava/lang/Object;", "(Ljava/util/Collection;JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "isShutdown", "()Z", "isTerminated", "delay", "Ljava/util/concurrent/ScheduledFuture;", "schedule", "(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "V", "callable", "(Ljava/util/concurrent/Callable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "initialDelay", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "scheduleAtFixedRate", "(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;", "scheduleWithFixedDelay", "shutdown", "shutdownNow", "()Ljava/util/List;", "task", "submit", "(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;", "result", "(Ljava/lang/Runnable;Ljava/lang/Object;)Ljava/util/concurrent/Future;", "(Ljava/util/concurrent/Callable;)Ljava/util/concurrent/Future;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class NoOpScheduledExecutorService implements java.util.concurrent.ScheduledExecutorService {
        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long timeout, java.util.concurrent.TimeUnit unit) {
            return true;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(java.lang.Runnable command) {
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> T invokeAny(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return true;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final java.util.concurrent.Future<?> submit(java.lang.Runnable task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.concurrent.Future<T> submit(java.lang.Runnable task, T result) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> task) {
            return null;
        }

        @Override // java.util.concurrent.ExecutorService
        public final java.util.List<java.lang.Runnable> shutdownNow() {
            return new java.util.ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks) {
            return new java.util.ArrayList();
        }

        @Override // java.util.concurrent.ExecutorService
        public final <T> java.util.List<java.util.concurrent.Future<T>> invokeAll(java.util.Collection<? extends java.util.concurrent.Callable<T>> tasks, long timeout, java.util.concurrent.TimeUnit unit) {
            return new java.util.ArrayList();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final <V> java.util.concurrent.ScheduledFuture<V> schedule(java.util.concurrent.Callable<V> callable, long delay, java.util.concurrent.TimeUnit unit) {
            return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpScheduledFuture();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final java.util.concurrent.ScheduledFuture<?> schedule(java.lang.Runnable command, long delay, java.util.concurrent.TimeUnit unit) {
            return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpScheduledFuture();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final java.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(java.lang.Runnable command, long initialDelay, long period, java.util.concurrent.TimeUnit unit) {
            return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpScheduledFuture();
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        public final java.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(java.lang.Runnable command, long initialDelay, long delay, java.util.concurrent.TimeUnit unit) {
            return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpScheduledFuture();
        }
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpScheduledFuture;", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityTypeConstants.ORDER_PREFIX_PAYMENT, "Ljava/util/concurrent/ScheduledFuture;", "<init>", "()V", "", "mayInterruptIfRunning", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Z)Z", "Ljava/util/concurrent/Delayed;", "other", "", "compareTo", "(Ljava/util/concurrent/Delayed;)I", "get", "()Ljava/lang/Object;", "", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "Ljava/util/concurrent/TimeUnit;", "unit", "(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;", "getDelay", "(Ljava/util/concurrent/TimeUnit;)J", "isCancelled", "()Z", "isDone"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class NoOpScheduledFuture<O> implements java.util.concurrent.ScheduledFuture<O> {
        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean mayInterruptIfRunning) {
            return false;
        }

        @Override // java.lang.Comparable
        public final int compareTo(java.util.concurrent.Delayed other) {
            return 0;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(java.util.concurrent.TimeUnit unit) {
            return 0L;
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return false;
        }

        @Override // java.util.concurrent.Future
        public final O get() {
            throw new java.util.concurrent.ExecutionException("Unsupported", new java.lang.UnsupportedOperationException());
        }

        @Override // java.util.concurrent.Future
        public final O get(long timeout, java.util.concurrent.TimeUnit unit) {
            throw new java.util.concurrent.ExecutionException("Unsupported", new java.lang.UnsupportedOperationException());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpCallFactory;", "Lokhttp3/Call$Factory;", "<init>", "()V", "Lokhttp3/Request;", "request", "Lokhttp3/Call;", "newCall", "(Lokhttp3/Request;)Lokhttp3/Call;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class NoOpCallFactory implements okhttp3.Call.Factory {
        public static final com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpCallFactory INSTANCE = new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpCallFactory();

        private NoOpCallFactory() {
        }

        @Override // okhttp3.Call.Factory
        public final okhttp3.Call newCall(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpCall(request);
        }
    }

    @kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/datadog/android/core/internal/NoOpInternalSdkCore$NoOpCall;", "Lokhttp3/Call;", "Lokhttp3/Request;", "originalRequest", "<init>", "(Lokhttp3/Request;)V", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "()V", "clone", "()Lokhttp3/Call;", "Lokhttp3/Callback;", "responseCallback", "enqueue", "(Lokhttp3/Callback;)V", "Lokhttp3/Response;", "execute", "()Lokhttp3/Response;", "", "isCanceled", "()Z", "isExecuted", "request", "()Lokhttp3/Request;", "Lokio/Timeout;", com.datadog.trace.bootstrap.instrumentation.api.InstrumentationTags.TIMEOUT, "()Lokio/Timeout;", "getHighSpeedVideoFpsRangesFor", "Lokhttp3/Request;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class NoOpCall implements okhttp3.Call {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final okhttp3.Request getHighSpeedVideoSizes;

        @Override // okhttp3.Call
        public final void cancel() {
        }

        @Override // okhttp3.Call
        /* renamed from: isCanceled */
        public final boolean getCanceled() {
            return false;
        }

        @Override // okhttp3.Call
        public final boolean isExecuted() {
            return false;
        }

        public NoOpCall(okhttp3.Request request) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
            this.getHighSpeedVideoSizes = request;
        }

        @Override // okhttp3.Call
        public final okhttp3.Call clone() {
            return new com.datadog.android.core.internal.NoOpInternalSdkCore.NoOpCall(this.getHighSpeedVideoSizes);
        }

        @Override // okhttp3.Call
        public final okhttp3.Response execute() {
            return new okhttp3.Response.Builder().request(this.getHighSpeedVideoSizes).protocol(okhttp3.Protocol.HTTP_1_1).message(com.paypal.oslo.feature.p2p.ui.common.error.NetworkErrorConfigKt.NetworkErrorOkButton).build();
        }

        @Override // okhttp3.Call
        /* renamed from: request, reason: from getter */
        public final okhttp3.Request getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // okhttp3.Call
        public final okio.Timeout timeout() {
            return okio.Timeout.NONE;
        }

        @Override // okhttp3.Call
        public final void enqueue(okhttp3.Callback responseCallback) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCallback, "");
        }
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final void writeLastViewEvent(byte[] data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final void updateFeatureContext(java.lang.String featureName, boolean useContextThread, kotlin.jvm.functions.Function1<? super java.util.Map<java.lang.String, java.lang.Object>, kotlin.Unit> updateCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(updateCallback, "");
    }

    @Override // com.datadog.android.api.SdkCore
    public final void setUserInfo(java.lang.String id, java.lang.String name2, java.lang.String email, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
    }

    @Override // com.datadog.android.api.SdkCore
    public final void setTrackingConsent(com.datadog.android.privacy.TrackingConsent consent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consent, "");
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final void setEventReceiver(java.lang.String featureName, com.datadog.android.api.feature.FeatureEventReceiver receiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(receiver, "");
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final void setContextUpdateReceiver(com.datadog.android.api.feature.FeatureContextUpdateReceiver listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }

    @Override // com.datadog.android.api.SdkCore
    public final void setAccountInfo(java.lang.String id, java.lang.String name2, java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final void removeEventReceiver(java.lang.String featureName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final void removeContextUpdateReceiver(com.datadog.android.api.feature.FeatureContextUpdateReceiver listener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "");
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final void registerFeature(com.datadog.android.api.feature.Feature feature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(feature, "");
    }

    @Override // com.datadog.android.api.feature.FeatureSdkCore
    public final com.datadog.android.api.feature.FeatureScope getFeature(java.lang.String featureName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureName, "");
        return null;
    }

    @Override // com.datadog.android.core.InternalSdkCore
    public final com.datadog.android.api.context.DatadogContext getDatadogContext(java.util.Set<java.lang.String> withFeatureContexts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(withFeatureContexts, "");
        return null;
    }

    @Override // com.datadog.android.api.SdkCore
    public final void addUserProperties(java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
    }

    @Override // com.datadog.android.api.SdkCore
    public final void addAccountExtraInfo(java.util.Map<java.lang.String, ? extends java.lang.Object> extraInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extraInfo, "");
    }
}
