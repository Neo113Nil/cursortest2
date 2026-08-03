package com.vungle.ads.internal;

/* compiled from: ConfigManager.kt */
@kotlin.Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u0007J\u0006\u0010\u001d\u001a\u00020\u001eJ\u0017\u0010\u001f\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b!J\r\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$J\u0006\u0010%\u001a\u00020\u0007J8\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020(2!\u0010)\u001a\u001d\u0012\u0013\u0012\u00110\u001e¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020#0*H\u0000¢\u0006\u0002\b.J\u0006\u0010/\u001a\u00020\u001eJ\u0006\u00100\u001a\u00020\fJ\u0006\u00101\u001a\u00020\fJ\u0018\u00102\u001a\u0004\u0018\u00010\u000f2\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\fJ\u0006\u00106\u001a\u00020\u0004J\u0006\u00107\u001a\u00020\u0007J\u0006\u00108\u001a\u00020\fJ\u0006\u00109\u001a\u00020\fJ\b\u0010:\u001a\u0004\u0018\u00010\fJ\b\u0010;\u001a\u0004\u0018\u00010\fJ\b\u0010<\u001a\u0004\u0018\u00010\fJ\u0006\u0010=\u001a\u00020\fJ\b\u0010>\u001a\u0004\u0018\u00010\fJ\u0006\u0010?\u001a\u00020\u001eJ\u0006\u0010@\u001a\u00020\u0004J\u0006\u0010A\u001a\u00020\u001eJ\u0006\u0010B\u001a\u00020\fJ\u0012\u0010C\u001a\u0004\u0018\u00010\u001b2\b\u0010D\u001a\u0004\u0018\u00010\fJ\b\u0010E\u001a\u0004\u0018\u00010\fJ\u0006\u0010F\u001a\u00020\u0007J\u0006\u0010G\u001a\u00020\u0007J\b\u0010H\u001a\u0004\u0018\u00010IJ3\u0010J\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010K\u001a\u00020\u001e2\n\b\u0002\u0010L\u001a\u0004\u0018\u00010MH\u0000¢\u0006\u0002\bNJ\u0006\u0010O\u001a\u00020\u001eJ\u0006\u0010P\u001a\u00020\u001eJ\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aJ\u0006\u0010Q\u001a\u00020\u001eJ\u0015\u0010R\u001a\u00020#2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0002\bSJ\u0006\u0010T\u001a\u00020\u001eJ\u0006\u0010U\u001a\u00020\u001eJ\u0016\u0010V\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u00103\u001a\u000204J\u001d\u0010W\u001a\u00020#2\u0006\u0010'\u001a\u00020(2\u0006\u0010X\u001a\u00020\fH\u0001¢\u0006\u0002\bYJ\u0017\u0010Z\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0002\b[J\u0019\u0010\\\u001a\u00020\u001e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\b]R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006^²\u0006\n\u0010_\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u00103\u001a\u000204X\u008a\u0084\u0002²\u0006\n\u0010_\u001a\u00020`X\u008a\u0084\u0002²\u0006\n\u0010a\u001a\u00020bX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "()V", "CONFIG_ALL_DATA", "", "CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY", "CONFIG_LAST_VALIDATE_TS_DEFAULT", "", "CONFIG_NOT_AVAILABLE", "DEFAULT_SESSION_TIMEOUT_SECONDS", "DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS", "TAG", "", "applicationId", com.helpshift.proactive.InAppViewConstants.CONFIG, "Lcom/vungle/ads/internal/model/ConfigPayload;", "configExt", "endpoints", "Lcom/vungle/ads/internal/model/ConfigPayload$Endpoints;", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "json$delegate", "Lkotlin/Lazy;", com.ironsource.C3225pd.c, "", "Lcom/vungle/ads/internal/model/Placement;", "afterClickDuration", "allowAutoRedirects", "", "checkConfigPayload", "configPayload", "checkConfigPayload$vungle_ads_release", "clearConfig", "", "clearConfig$vungle_ads_release", "configLastValidatedTimestamp", "fetchConfigAsync", "context", "Landroid/content/Context;", "onComplete", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "result", "fetchConfigAsync$vungle_ads_release", "fpdEnabled", "getAdsEndpoint", "getCSBEndpoint", "getCachedConfig", "filePreferences", "Lcom/vungle/ads/internal/persistence/FilePreferences;", com.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.APP_ID, "getCleverCacheDiskPercentage", "getCleverCacheDiskSize", "getConfigExtension", "getErrorLoggingEndpoint", "getGDPRButtonAccept", "getGDPRButtonDeny", "getGDPRConsentMessage", "getGDPRConsentMessageVersion", "getGDPRConsentTitle", "getGDPRIsCountryDataProtected", "getLogLevel", "getMetricsEnabled", "getMetricsEndpoint", "getPlacement", "id", "getRiEndpoint", "getSessionTimeout", "getSignalsSessionTimeout", "getTcfStatus", "Lcom/vungle/ads/internal/model/ConfigPayload$IABSettings$TcfStatus;", "initWithConfig", "fromCachedConfig", "metric", "Lcom/vungle/ads/SingleValueMetric;", "initWithConfig$vungle_ads_release", "isReportIncentivizedEnabled", "otEnabled", "rtaDebuggingEnabled", "setAppId", "setAppId$vungle_ads_release", "shouldDisableAdId", "signalsDisabled", "updateCachedConfig", "updateConfigExtension", "ext", "updateConfigExtension$vungle_ads_release", "validateConfig", "validateConfig$vungle_ads_release", "validateEndpoints", "validateEndpoints$vungle_ads_release", "vungle-ads_release", "vungleApiClient", "Lcom/vungle/ads/internal/network/VungleApiClient;", "sdkExecutors", "Lcom/vungle/ads/internal/executor/Executors;"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigManager {
    private static final int CONFIG_ALL_DATA = 2;
    private static final int CONFIG_LAST_VALIDATED_TIMESTAMP_ONLY = 1;
    public static final long CONFIG_LAST_VALIDATE_TS_DEFAULT = -1;
    private static final int CONFIG_NOT_AVAILABLE = 0;
    private static final int DEFAULT_SESSION_TIMEOUT_SECONDS = 900;
    private static final int DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS = 1800;
    public static final java.lang.String TAG = "ConfigManager";
    private static java.lang.String applicationId;
    private static com.vungle.ads.internal.model.ConfigPayload config;
    private static java.lang.String configExt;
    private static com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints;
    private static java.util.List<com.vungle.ads.internal.model.Placement> placements;
    public static final com.vungle.ads.internal.ConfigManager INSTANCE = new com.vungle.ads.internal.ConfigManager();

    /* renamed from: json$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy json = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.json.Json>() { // from class: com.vungle.ads.internal.ConfigManager$json$2
        @Override // kotlin.jvm.functions.Function0
        public final kotlinx.serialization.json.Json invoke() {
            return kotlinx.serialization.json.JsonKt.Json$default(null, new kotlin.jvm.functions.Function1<kotlinx.serialization.json.JsonBuilder, kotlin.Unit>() { // from class: com.vungle.ads.internal.ConfigManager$json$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(kotlinx.serialization.json.JsonBuilder jsonBuilder) {
                    invoke2(jsonBuilder);
                    return kotlin.Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(kotlinx.serialization.json.JsonBuilder Json) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(Json, "$this$Json");
                    Json.setIgnoreUnknownKeys(true);
                    Json.setEncodeDefaults(true);
                    Json.setExplicitNulls(false);
                }
            }, 1, null);
        }
    });

    private ConfigManager() {
    }

    private final kotlinx.serialization.json.Json getJson() {
        return (kotlinx.serialization.json.Json) json.getValue();
    }

    public final void setAppId$vungle_ads_release(java.lang.String applicationId2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationId2, "applicationId");
        applicationId = applicationId2;
    }

    /* renamed from: fetchConfigAsync$lambda-0, reason: not valid java name */
    private static final com.vungle.ads.internal.network.VungleApiClient m10406fetchConfigAsync$lambda0(kotlin.Lazy<com.vungle.ads.internal.network.VungleApiClient> lazy) {
        return lazy.getValue();
    }

    public final void fetchConfigAsync$vungle_ads_release(final android.content.Context context, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onComplete) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        try {
            com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.ConfigPayload> config2 = m10406fetchConfigAsync$lambda0(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.network.VungleApiClient invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.VungleApiClient.class);
                }
            })).config();
            if (config2 != null) {
                config2.enqueue(new com.vungle.ads.internal.network.Callback<com.vungle.ads.internal.model.ConfigPayload>() { // from class: com.vungle.ads.internal.ConfigManager$fetchConfigAsync$1
                    @Override // com.vungle.ads.internal.network.Callback
                    public void onResponse(com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.ConfigPayload> call, com.vungle.ads.internal.network.Response<com.vungle.ads.internal.model.ConfigPayload> response) {
                        if (response == null || !response.isSuccessful() || response.body() == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("config API: ");
                            sb.append(response != null ? java.lang.Integer.valueOf(response.code()) : null);
                            new com.vungle.ads.APIFailedStatusCodeError(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
                            onComplete.invoke(false);
                            return;
                        }
                        com.vungle.ads.internal.ConfigManager.INSTANCE.initWithConfig$vungle_ads_release(context, response.body(), false, new com.vungle.ads.SingleValueMetric(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType.CONFIG_LOADED_FROM_INIT));
                        onComplete.invoke(true);
                    }

                    @Override // com.vungle.ads.internal.network.Callback
                    public void onFailure(com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.ConfigPayload> call, java.lang.Throwable t) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Error while fetching config: ");
                        sb.append(t != null ? t.getMessage() : null);
                        new com.vungle.ads.NetworkUnreachable(sb.toString()).logErrorNoReturnValue$vungle_ads_release();
                        onComplete.invoke(false);
                    }
                });
            }
        } catch (java.lang.Throwable th) {
            if ((th instanceof java.net.UnknownHostException) || (th instanceof java.lang.SecurityException)) {
                new com.vungle.ads.NetworkUnreachable("Config unknown: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new com.vungle.ads.NetworkUnreachable("Config: " + th.getMessage()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(false);
        }
    }

    public final void updateConfigExtension$vungle_ads_release(final android.content.Context context, java.lang.String ext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ext, "ext");
        configExt = ext;
        com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
        m10410updateConfigExtension$lambda1(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.persistence.FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$updateConfigExtension$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final com.vungle.ads.internal.persistence.FilePreferences invoke() {
                return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.persistence.FilePreferences.class);
            }
        })).put(com.vungle.ads.internal.model.Cookie.CONFIG_EXTENSION, ext).apply();
    }

    /* renamed from: updateConfigExtension$lambda-1, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.FilePreferences m10410updateConfigExtension$lambda1(kotlin.Lazy<com.vungle.ads.internal.persistence.FilePreferences> lazy) {
        return lazy.getValue();
    }

    public static /* synthetic */ void initWithConfig$vungle_ads_release$default(com.vungle.ads.internal.ConfigManager configManager, android.content.Context context, com.vungle.ads.internal.model.ConfigPayload configPayload, boolean z, com.vungle.ads.SingleValueMetric singleValueMetric, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            singleValueMetric = null;
        }
        configManager.initWithConfig$vungle_ads_release(context, configPayload, z, singleValueMetric);
    }

    /* renamed from: initWithConfig$lambda-2, reason: not valid java name */
    private static final com.vungle.ads.internal.persistence.FilePreferences m10407initWithConfig$lambda2(kotlin.Lazy<com.vungle.ads.internal.persistence.FilePreferences> lazy) {
        return lazy.getValue();
    }

    public final synchronized void initWithConfig$vungle_ads_release(final android.content.Context context, com.vungle.ads.internal.model.ConfigPayload config2, boolean fromCachedConfig, com.vungle.ads.SingleValueMetric metric) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        try {
            com.vungle.ads.ServiceLocator.Companion companion = com.vungle.ads.ServiceLocator.INSTANCE;
            kotlin.Lazy lazy = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.persistence.FilePreferences>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.persistence.FilePreferences invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.persistence.FilePreferences.class);
                }
            });
            int checkConfigPayload$vungle_ads_release = checkConfigPayload$vungle_ads_release(config2);
            if (checkConfigPayload$vungle_ads_release == 0) {
                com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Config is not available.");
                return;
            }
            if (checkConfigPayload$vungle_ads_release == 1) {
                if (!fromCachedConfig && config2 != null) {
                    java.lang.Long configLastValidatedTimestamp = config2.getConfigLastValidatedTimestamp();
                    long longValue = configLastValidatedTimestamp != null ? configLastValidatedTimestamp.longValue() : -1L;
                    com.vungle.ads.internal.model.ConfigPayload configPayload = config;
                    if (configPayload != null) {
                        configPayload.setConfigLastValidatedTimestamp(java.lang.Long.valueOf(longValue));
                    }
                    com.vungle.ads.internal.model.ConfigPayload configPayload2 = config;
                    if (configPayload2 != null) {
                        INSTANCE.updateCachedConfig(configPayload2, m10407initWithConfig$lambda2(lazy));
                    }
                }
                return;
            }
            config = config2;
            endpoints = config2 != null ? config2.getEndpoints() : null;
            placements = config2 != null ? config2.getPlacements() : null;
            int logLevel = getLogLevel();
            boolean metricsEnabled = getMetricsEnabled();
            com.vungle.ads.ServiceLocator.Companion companion2 = com.vungle.ads.ServiceLocator.INSTANCE;
            kotlin.Lazy lazy2 = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.network.VungleApiClient>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.network.VungleApiClient, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.network.VungleApiClient invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.network.VungleApiClient.class);
                }
            });
            com.vungle.ads.ServiceLocator.Companion companion3 = com.vungle.ads.ServiceLocator.INSTANCE;
            com.vungle.ads.AnalyticsClient.INSTANCE.initOrUpdate$vungle_ads_release(m10408initWithConfig$lambda4(lazy2), m10409initWithConfig$lambda5(kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.SYNCHRONIZED, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<com.vungle.ads.internal.executor.Executors>() { // from class: com.vungle.ads.internal.ConfigManager$initWithConfig$$inlined$inject$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.executor.Executors, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function0
                public final com.vungle.ads.internal.executor.Executors invoke() {
                    return com.vungle.ads.ServiceLocator.INSTANCE.getInstance(context).getService(com.vungle.ads.internal.executor.Executors.class);
                }
            })).getLOGGER_EXECUTOR(), logLevel, metricsEnabled);
            if (!fromCachedConfig && config2 != null) {
                updateCachedConfig(config2, m10407initWithConfig$lambda2(lazy));
                java.lang.String configExtension = config2.getConfigExtension();
                if (configExtension != null) {
                    INSTANCE.updateConfigExtension$vungle_ads_release(context, configExtension);
                }
            }
            if (metric != null) {
                com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release$default(com.vungle.ads.AnalyticsClient.INSTANCE, metric, (com.vungle.ads.internal.util.LogEntry) null, (java.lang.String) null, 6, (java.lang.Object) null);
            }
            com.vungle.ads.internal.privacy.PrivacyManager.INSTANCE.updateDisableAdId(shouldDisableAdId());
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error while validating config: " + e.getMessage());
        }
    }

    /* renamed from: initWithConfig$lambda-4, reason: not valid java name */
    private static final com.vungle.ads.internal.network.VungleApiClient m10408initWithConfig$lambda4(kotlin.Lazy<com.vungle.ads.internal.network.VungleApiClient> lazy) {
        return lazy.getValue();
    }

    /* renamed from: initWithConfig$lambda-5, reason: not valid java name */
    private static final com.vungle.ads.internal.executor.Executors m10409initWithConfig$lambda5(kotlin.Lazy<? extends com.vungle.ads.internal.executor.Executors> lazy) {
        return lazy.getValue();
    }

    public final java.util.List<com.vungle.ads.internal.model.Placement> placements() {
        return placements;
    }

    public final com.vungle.ads.internal.model.Placement getPlacement(java.lang.String id) {
        java.util.List<com.vungle.ads.internal.model.Placement> list = placements;
        java.lang.Object obj = null;
        if (list == null) {
            return null;
        }
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.vungle.ads.internal.model.Placement) next).getReferenceId(), id)) {
                obj = next;
                break;
            }
        }
        return (com.vungle.ads.internal.model.Placement) obj;
    }

    public final java.lang.String getAdsEndpoint() {
        com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints2 = endpoints;
        java.lang.String str = null;
        java.lang.String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        java.lang.String str2 = adsEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = adsEndpoint;
        }
        return str == null ? com.vungle.ads.internal.Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    public final java.lang.String getRiEndpoint() {
        com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final java.lang.String getCSBEndpoint() {
        com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints2 = endpoints;
        java.lang.String str = null;
        java.lang.String csbEndpoint = endpoints2 != null ? endpoints2.getCsbEndpoint() : null;
        java.lang.String str2 = csbEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = csbEndpoint;
        }
        return str == null ? com.vungle.ads.internal.Constants.DEFAULT_CSB_ENDPOINT : str;
    }

    public final java.lang.String getGDPRConsentMessage() {
        com.vungle.ads.internal.model.ConfigPayload.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.ConfigPayload.GDPRSettings gdpr;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentMessage();
    }

    public final java.lang.String getGDPRConsentTitle() {
        com.vungle.ads.internal.model.ConfigPayload.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.ConfigPayload.GDPRSettings gdpr;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getConsentTitle();
    }

    public final java.lang.String getGDPRButtonAccept() {
        com.vungle.ads.internal.model.ConfigPayload.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.ConfigPayload.GDPRSettings gdpr;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonAccept();
    }

    public final java.lang.String getGDPRButtonDeny() {
        com.vungle.ads.internal.model.ConfigPayload.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.ConfigPayload.GDPRSettings gdpr;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null) {
            return null;
        }
        return gdpr.getButtonDeny();
    }

    public final java.lang.String getGDPRConsentMessageVersion() {
        com.vungle.ads.internal.model.ConfigPayload.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.ConfigPayload.GDPRSettings gdpr;
        java.lang.String consentMessageVersion;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        return (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) ? "" : consentMessageVersion;
    }

    public final boolean getGDPRIsCountryDataProtected() {
        com.vungle.ads.internal.model.ConfigPayload.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.ConfigPayload.GDPRSettings gdpr;
        java.lang.Boolean isCountryDataProtected;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (gdpr = userPrivacy.getGdpr()) == null || (isCountryDataProtected = gdpr.isCountryDataProtected()) == null) {
            return false;
        }
        return isCountryDataProtected.booleanValue();
    }

    public final com.vungle.ads.internal.model.ConfigPayload.IABSettings.TcfStatus getTcfStatus() {
        com.vungle.ads.internal.model.ConfigPayload.UserPrivacy userPrivacy;
        com.vungle.ads.internal.model.ConfigPayload.IABSettings iab;
        com.vungle.ads.internal.model.ConfigPayload.IABSettings.TcfStatus.Companion companion = com.vungle.ads.internal.model.ConfigPayload.IABSettings.TcfStatus.INSTANCE;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        return companion.fromRawValue((configPayload == null || (userPrivacy = configPayload.getUserPrivacy()) == null || (iab = userPrivacy.getIab()) == null) ? null : iab.getTcfStatus());
    }

    public final boolean shouldDisableAdId() {
        java.lang.Boolean disableAdId;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (disableAdId = configPayload.getDisableAdId()) == null) {
            return true;
        }
        return disableAdId.booleanValue();
    }

    public final boolean isReportIncentivizedEnabled() {
        java.lang.Boolean isReportIncentivizedEnabled;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (isReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) == null) {
            return false;
        }
        return isReportIncentivizedEnabled.booleanValue();
    }

    public final java.lang.String getConfigExtension() {
        java.lang.String str = configExt;
        return str == null ? "" : str;
    }

    public final long configLastValidatedTimestamp() {
        java.lang.Long configLastValidatedTimestamp;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp()) == null) {
            return -1L;
        }
        return configLastValidatedTimestamp.longValue();
    }

    public final java.lang.String getMetricsEndpoint() {
        com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints2 = endpoints;
        java.lang.String str = null;
        java.lang.String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        java.lang.String str2 = metricsEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = metricsEndpoint;
        }
        return str == null ? com.vungle.ads.internal.Constants.DEFAULT_METRICS_ENDPOINT : str;
    }

    public final java.lang.String getErrorLoggingEndpoint() {
        com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints2 = endpoints;
        java.lang.String str = null;
        java.lang.String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        java.lang.String str2 = errorLogsEndpoint;
        if (str2 != null && str2.length() != 0) {
            str = errorLogsEndpoint;
        }
        return str == null ? com.vungle.ads.internal.Constants.DEFAULT_ERROR_LOGS_ENDPOINT : str;
    }

    public final boolean getMetricsEnabled() {
        com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings logMetricsSettings;
        java.lang.Boolean metricsEnabled;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (metricsEnabled = logMetricsSettings.getMetricsEnabled()) == null) {
            return false;
        }
        return metricsEnabled.booleanValue();
    }

    public final int getLogLevel() {
        com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings logMetricsSettings;
        java.lang.Integer errorLogLevel;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        return (configPayload == null || (logMetricsSettings = configPayload.getLogMetricsSettings()) == null || (errorLogLevel = logMetricsSettings.getErrorLogLevel()) == null) ? com.vungle.ads.AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel() : errorLogLevel.intValue();
    }

    public final long getSessionTimeout() {
        java.lang.Integer sessionTimeout;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        return ((configPayload == null || (sessionTimeout = configPayload.getSessionTimeout()) == null) ? 900 : sessionTimeout.intValue()) * 1000;
    }

    public final long getSignalsSessionTimeout() {
        java.lang.Integer signalSessionTimeout;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        return ((configPayload == null || (signalSessionTimeout = configPayload.getSignalSessionTimeout()) == null) ? DEFAULT_SIGNALS_SESSION_TIMEOUT_SECONDS : signalSessionTimeout.intValue()) * 1000;
    }

    public final boolean rtaDebuggingEnabled() {
        java.lang.Boolean rtaDebugging;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (rtaDebugging = configPayload.getRtaDebugging()) == null) {
            return false;
        }
        return rtaDebugging.booleanValue();
    }

    public final boolean otEnabled() {
        java.lang.Boolean enableOT;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (enableOT = configPayload.getEnableOT()) == null) {
            return true;
        }
        return enableOT.booleanValue();
    }

    public final boolean signalsDisabled() {
        java.lang.Boolean signalsDisabled;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (signalsDisabled = configPayload.getSignalsDisabled()) == null) {
            return false;
        }
        return signalsDisabled.booleanValue();
    }

    public final boolean fpdEnabled() {
        java.lang.Boolean fpdEnabled;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (fpdEnabled = configPayload.getFpdEnabled()) == null) {
            return true;
        }
        return fpdEnabled.booleanValue();
    }

    public final boolean allowAutoRedirects() {
        com.vungle.ads.internal.model.ConfigPayload.AutoRedirect autoRedirect;
        java.lang.Boolean allowAutoRedirect;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (allowAutoRedirect = autoRedirect.getAllowAutoRedirect()) == null) {
            return false;
        }
        return allowAutoRedirect.booleanValue();
    }

    public final long afterClickDuration() {
        com.vungle.ads.internal.model.ConfigPayload.AutoRedirect autoRedirect;
        java.lang.Long afterClickDuration;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (autoRedirect = configPayload.getAutoRedirect()) == null || (afterClickDuration = autoRedirect.getAfterClickDuration()) == null) {
            return Long.MAX_VALUE;
        }
        return afterClickDuration.longValue();
    }

    public final int checkConfigPayload$vungle_ads_release(com.vungle.ads.internal.model.ConfigPayload configPayload) {
        if (configPayload == null || configPayload.getConfigLastValidatedTimestamp() == null) {
            return 0;
        }
        java.lang.Long configLastValidatedTimestamp = configPayload.getConfigLastValidatedTimestamp();
        if (configLastValidatedTimestamp != null && configLastValidatedTimestamp.longValue() == -1) {
            return 0;
        }
        return configPayload.getEndpoints() == null ? 1 : 2;
    }

    public final boolean validateConfig$vungle_ads_release(com.vungle.ads.internal.model.ConfigPayload configPayload) {
        return ((configPayload != null ? configPayload.getEndpoints() : null) == null || !validateEndpoints$vungle_ads_release(configPayload.getEndpoints()) || configPayload.getPlacements() == null) ? false : true;
    }

    public static /* synthetic */ boolean validateEndpoints$vungle_ads_release$default(com.vungle.ads.internal.ConfigManager configManager, com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            endpoints2 = endpoints;
        }
        return configManager.validateEndpoints$vungle_ads_release(endpoints2);
    }

    public final boolean validateEndpoints$vungle_ads_release(com.vungle.ads.internal.model.ConfigPayload.Endpoints endpoints2) {
        boolean z;
        java.lang.String adsEndpoint = endpoints2 != null ? endpoints2.getAdsEndpoint() : null;
        if (adsEndpoint == null || adsEndpoint.length() == 0) {
            new com.vungle.ads.InvalidEndpointError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT, "The ads endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
            z = false;
        } else {
            z = true;
        }
        java.lang.String riEndpoint = endpoints2 != null ? endpoints2.getRiEndpoint() : null;
        if (riEndpoint == null || riEndpoint.length() == 0) {
            new com.vungle.ads.InvalidEndpointError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_RI_ENDPOINT, "The ri endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        java.lang.String metricsEndpoint = endpoints2 != null ? endpoints2.getMetricsEndpoint() : null;
        if (metricsEndpoint == null || metricsEndpoint.length() == 0) {
            new com.vungle.ads.InvalidEndpointError(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT, "The metrics endpoint was not provided in the config.").logErrorNoReturnValue$vungle_ads_release();
        }
        java.lang.String errorLogsEndpoint = endpoints2 != null ? endpoints2.getErrorLogsEndpoint() : null;
        if (errorLogsEndpoint == null || errorLogsEndpoint.length() == 0) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z;
    }

    public final long getCleverCacheDiskSize() {
        com.vungle.ads.internal.model.ConfigPayload.CleverCache cleverCache;
        java.lang.Long diskSize;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskSize = cleverCache.getDiskSize()) == null) {
            return 1048576000L;
        }
        long j = 1024;
        return diskSize.longValue() * j * j;
    }

    public final int getCleverCacheDiskPercentage() {
        com.vungle.ads.internal.model.ConfigPayload.CleverCache cleverCache;
        java.lang.Integer diskPercentage;
        com.vungle.ads.internal.model.ConfigPayload configPayload = config;
        if (configPayload == null || (cleverCache = configPayload.getCleverCache()) == null || (diskPercentage = cleverCache.getDiskPercentage()) == null) {
            return 3;
        }
        return diskPercentage.intValue();
    }

    public final com.vungle.ads.internal.model.ConfigPayload getCachedConfig(com.vungle.ads.internal.persistence.FilePreferences filePreferences, java.lang.String appId) {
        java.lang.Long refreshTime;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appId, "appId");
        try {
            java.lang.String string = filePreferences.getString(com.vungle.ads.internal.model.Cookie.CONFIG_APP_ID);
            java.lang.String str = string;
            if (str != null && str.length() != 0 && kotlin.text.StringsKt.equals(string, appId, true)) {
                java.lang.String string2 = filePreferences.getString(com.vungle.ads.internal.model.Cookie.CONFIG_RESPONSE);
                if (string2 == null) {
                    return null;
                }
                long j = filePreferences.getLong(com.vungle.ads.internal.model.Cookie.CONFIG_UPDATE_TIME, 0L);
                kotlinx.serialization.json.Json json2 = INSTANCE.getJson();
                kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.ConfigPayload.class));
                kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                com.vungle.ads.internal.model.ConfigPayload configPayload = (com.vungle.ads.internal.model.ConfigPayload) json2.decodeFromString(serializer, string2);
                com.vungle.ads.internal.model.ConfigPayload.ConfigSettings configSettings = configPayload.getConfigSettings();
                if (((configSettings == null || (refreshTime = configSettings.getRefreshTime()) == null) ? -1L : refreshTime.longValue()) + j < java.lang.System.currentTimeMillis()) {
                    com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "cache config expired. re-config");
                    return null;
                }
                com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "use cache config.");
                return configPayload;
            }
            com.vungle.ads.internal.util.Logger.INSTANCE.w(TAG, "app id mismatch, re-config");
            return null;
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Error while parsing cached config: " + e.getMessage());
            return null;
        }
    }

    public final void updateCachedConfig(com.vungle.ads.internal.model.ConfigPayload config2, com.vungle.ads.internal.persistence.FilePreferences filePreferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config2, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        try {
            java.lang.String str = applicationId;
            if (str == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("applicationId");
                str = null;
            }
            filePreferences.put(com.vungle.ads.internal.model.Cookie.CONFIG_APP_ID, str);
            filePreferences.put(com.vungle.ads.internal.model.Cookie.CONFIG_UPDATE_TIME, java.lang.System.currentTimeMillis());
            kotlinx.serialization.json.Json json2 = getJson();
            kotlinx.serialization.KSerializer<java.lang.Object> serializer = kotlinx.serialization.SerializersKt.serializer(json2.getSerializersModule(), kotlin.jvm.internal.Reflection.typeOf(com.vungle.ads.internal.model.ConfigPayload.class));
            kotlin.jvm.internal.Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.put(com.vungle.ads.internal.model.Cookie.CONFIG_RESPONSE, json2.encodeToString(serializer, config2));
            filePreferences.apply();
        } catch (java.lang.Exception e) {
            com.vungle.ads.internal.util.Logger.INSTANCE.e(TAG, "Exception: " + e.getMessage() + " for updating cached config");
        }
    }

    public final void clearConfig$vungle_ads_release() {
        endpoints = null;
        placements = null;
        config = null;
    }
}
