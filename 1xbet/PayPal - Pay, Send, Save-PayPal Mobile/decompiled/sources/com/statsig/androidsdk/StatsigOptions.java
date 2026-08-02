package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bE\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001BÚ\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\u001b\b\u0002\u0010\u001b\u001a\u0015\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\u001a\b\u0002\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0005\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010)\u001a\u00020\u0005\u0012\b\b\u0002\u0010*\u001a\u00020\u0005¢\u0006\u0004\b+\u0010,J\u001b\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010-¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0000¢\u0006\u0004\b0\u0010/J\u001d\u00103\u001a\u00020\u001a2\u0006\u00101\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104J\u0015\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u0015\u00107\u001a\u00020\u001a2\u0006\u00109\u001a\u00020\u0002¢\u0006\u0004\b7\u0010:J\u001d\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0000¢\u0006\u0004\b;\u0010/R\"\u0010\u0003\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010:R\"\u0010\u000f\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR4\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00020!8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010\u0006\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010\u0007\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0007\u0010J\u0012\u0004\bQ\u0010R\u001a\u0004\bO\u0010L\"\u0004\bP\u0010NR$\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010#\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010J\u001a\u0004\bX\u0010L\"\u0004\bY\u0010NR\"\u0010\b\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010J\u001a\u0004\bZ\u0010L\"\u0004\b[\u0010NR\"\u0010\r\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010J\u001a\u0004\b\\\u0010L\"\u0004\b]\u0010NR$\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010-8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010\u0004\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010<\u001a\u0004\be\u0010>\"\u0004\bf\u0010:R\"\u0010\f\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010\n\u001a\u00020\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010q\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\"\u0010\u0015\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010J\u001a\u0004\bv\u0010L\"\u0004\bw\u0010NR0\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010_\u001a\u0004\bx\u0010/\"\u0004\by\u0010zR*\u0010|\u001a\n\u0012\u0004\u0012\u00020{\u0018\u00010\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b|\u0010q\u001a\u0004\b}\u0010s\"\u0004\b~\u0010uR(\u0010(\u001a\u0004\u0018\u00010'8\u0007@\u0007X\u0087\u000e¢\u0006\u0016\n\u0004\b(\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R$\u0010\u0011\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b\u0011\u0010J\u001a\u0005\b\u0084\u0001\u0010L\"\u0005\b\u0085\u0001\u0010NR,\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001c8\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001e\u0010q\u001a\u0005\b\u0086\u0001\u0010s\"\u0005\b\u0087\u0001\u0010uR$\u0010)\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b)\u0010J\u001a\u0005\b\u0088\u0001\u0010L\"\u0005\b\u0089\u0001\u0010NR)\u0010&\u001a\u0004\u0018\u00010%8\u0007@\u0007X\u0087\u000e¢\u0006\u0017\n\u0005\b&\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R$\u0010$\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b$\u0010J\u001a\u0005\b\u008f\u0001\u0010L\"\u0005\b\u0090\u0001\u0010NR&\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b\u0010\u0010<\u001a\u0005\b\u0091\u0001\u0010>\"\u0005\b\u0092\u0001\u0010:R7\u0010\u001b\u001a\u0015\u0012\t\u0012\u00070\u0018¢\u0006\u0002\b\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178\u0007@\u0007X\u0087\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010`\u001a\u0005\b\u0093\u0001\u0010b\"\u0005\b\u0094\u0001\u0010d"}, d2 = {"Lcom/statsig/androidsdk/StatsigOptions;", "Lcom/statsig/androidsdk/StatsigRuntimeMutableOptions;", "", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "eventLoggingAPI", "", "disableCurrentActivityLogging", "disableDiagnosticsLogging", "disableLoggingCompression", "", "initTimeoutMs", "", "initRetryLimit", "enableAutoValueUpdate", "", "autoValueUpdateIntervalMinutes", "overrideStableID", "loadCacheAsync", "", "", "initializeValues", "initializeOffline", "disableHashing", "Lkotlin/Function1;", "Lcom/statsig/androidsdk/StatsigUser;", "Lkotlin/ParameterName;", "", "userObjectValidator", "", "initializeFallbackUrls", "logEventFallbackUrls", "Lcom/statsig/androidsdk/BaseConfig;", "evaluationCallback", "Lkotlin/Function2;", "customCacheKey", "disableLogEventRetries", "optOutNonSdkMetadata", "Lcom/statsig/androidsdk/OnDeviceEvalAdapter;", "onDeviceEvalAdapter", "Lcom/statsig/androidsdk/IStatsigLifetimeCallback;", "lifetimeCallback", "logNetworkMetadata", "loggingEnabled", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZJIZDLjava/lang/String;ZLjava/util/Map;ZLjava/lang/Boolean;Lkotlin/jvm/functions/Function1;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ZZLcom/statsig/androidsdk/OnDeviceEvalAdapter;Lcom/statsig/androidsdk/IStatsigLifetimeCallback;ZZ)V", "", "getEnvironment", "()Ljava/util/Map;", "getLoggingCopy$android_sdk_release", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "setEnvironmentParameter", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/statsig/androidsdk/Tier;", "tier", "setTier", "(Lcom/statsig/androidsdk/Tier;)V", "tierName", "(Ljava/lang/String;)V", "toMap$android_sdk_release", "Ljava/lang/String;", "getApi", "()Ljava/lang/String;", "setApi", "D", "getAutoValueUpdateIntervalMinutes", "()D", "setAutoValueUpdateIntervalMinutes", "(D)V", "Lkotlin/jvm/functions/Function2;", "getCustomCacheKey", "()Lkotlin/jvm/functions/Function2;", "setCustomCacheKey", "(Lkotlin/jvm/functions/Function2;)V", "Z", "getDisableCurrentActivityLogging", "()Z", "setDisableCurrentActivityLogging", "(Z)V", "getDisableDiagnosticsLogging", "setDisableDiagnosticsLogging", "getDisableDiagnosticsLogging$annotations", "()V", "Ljava/lang/Boolean;", "getDisableHashing", "()Ljava/lang/Boolean;", "setDisableHashing", "(Ljava/lang/Boolean;)V", "getDisableLogEventRetries", "setDisableLogEventRetries", "getDisableLoggingCompression", "setDisableLoggingCompression", "getEnableAutoValueUpdate", "setEnableAutoValueUpdate", "environment", "Ljava/util/Map;", "Lkotlin/jvm/functions/Function1;", "getEvaluationCallback", "()Lkotlin/jvm/functions/Function1;", "setEvaluationCallback", "(Lkotlin/jvm/functions/Function1;)V", "getEventLoggingAPI", "setEventLoggingAPI", com.visa.cbp.getEncExpo.warmup, "getInitRetryLimit", "()I", "setInitRetryLimit", "(I)V", "J", "getInitTimeoutMs", "()J", "setInitTimeoutMs", "(J)V", "Ljava/util/List;", "getInitializeFallbackUrls", "()Ljava/util/List;", "setInitializeFallbackUrls", "(Ljava/util/List;)V", "getInitializeOffline", "setInitializeOffline", "getInitializeValues", "setInitializeValues", "(Ljava/util/Map;)V", "Lokhttp3/Interceptor;", "interceptors", "getInterceptors", "setInterceptors", "Lcom/statsig/androidsdk/IStatsigLifetimeCallback;", "getLifetimeCallback", "()Lcom/statsig/androidsdk/IStatsigLifetimeCallback;", "setLifetimeCallback", "(Lcom/statsig/androidsdk/IStatsigLifetimeCallback;)V", "getLoadCacheAsync", "setLoadCacheAsync", "getLogEventFallbackUrls", "setLogEventFallbackUrls", "getLogNetworkMetadata", "setLogNetworkMetadata", "Lcom/statsig/androidsdk/OnDeviceEvalAdapter;", "getOnDeviceEvalAdapter", "()Lcom/statsig/androidsdk/OnDeviceEvalAdapter;", "setOnDeviceEvalAdapter", "(Lcom/statsig/androidsdk/OnDeviceEvalAdapter;)V", "getOptOutNonSdkMetadata", "setOptOutNonSdkMetadata", "getOverrideStableID", "setOverrideStableID", "getUserObjectValidator", "setUserObjectValidator"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsigOptions extends com.statsig.androidsdk.StatsigRuntimeMutableOptions {

    @com.google.gson.annotations.SerializedName(com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest)
    private java.lang.String api;

    @com.google.gson.annotations.SerializedName("autoValueUpdateIntervalMinutes")
    private double autoValueUpdateIntervalMinutes;
    private kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.statsig.androidsdk.StatsigUser, java.lang.String> customCacheKey;

    @com.google.gson.annotations.SerializedName("disableCurrentActivityLogging")
    private boolean disableCurrentActivityLogging;

    @com.google.gson.annotations.SerializedName("disableDiagnosticsLogging")
    private boolean disableDiagnosticsLogging;

    @com.google.gson.annotations.SerializedName("disableHashing")
    private java.lang.Boolean disableHashing;
    private boolean disableLogEventRetries;

    @com.google.gson.annotations.SerializedName("disableLoggingCompression")
    private boolean disableLoggingCompression;

    @com.google.gson.annotations.SerializedName("enableAutoValueUpdate")
    private boolean enableAutoValueUpdate;
    private java.util.Map<java.lang.String, java.lang.String> environment;
    private kotlin.jvm.functions.Function1<? super com.statsig.androidsdk.BaseConfig, kotlin.Unit> evaluationCallback;

    @com.google.gson.annotations.SerializedName("eventLoggingAPI")
    private java.lang.String eventLoggingAPI;

    @com.google.gson.annotations.SerializedName("initRetryLimit")
    private int initRetryLimit;

    @com.google.gson.annotations.SerializedName("initTimeoutMs")
    private long initTimeoutMs;

    @com.google.gson.annotations.SerializedName("initializeFallbackUrls")
    private java.util.List<java.lang.String> initializeFallbackUrls;

    @com.google.gson.annotations.SerializedName("initializeOffline")
    private boolean initializeOffline;

    @com.google.gson.annotations.SerializedName("initializeValues")
    private java.util.Map<java.lang.String, ? extends java.lang.Object> initializeValues;
    private transient java.util.List<? extends okhttp3.Interceptor> interceptors;
    private com.statsig.androidsdk.IStatsigLifetimeCallback lifetimeCallback;

    @com.google.gson.annotations.SerializedName("loadCacheAsync")
    private boolean loadCacheAsync;

    @com.google.gson.annotations.SerializedName("logEventFallbackUrls")
    private java.util.List<java.lang.String> logEventFallbackUrls;
    private boolean logNetworkMetadata;
    private com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter;
    private boolean optOutNonSdkMetadata;

    @com.google.gson.annotations.SerializedName("overrideStableID")
    private java.lang.String overrideStableID;

    @com.google.gson.annotations.SerializedName("userObjectValidator")
    private kotlin.jvm.functions.Function1<? super com.statsig.androidsdk.StatsigUser, kotlin.Unit> userObjectValidator;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "WARNING: This property is no longer supported and currently has no effects.")
    public static /* synthetic */ void getDisableDiagnosticsLogging$annotations() {
    }

    public /* synthetic */ StatsigOptions(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, long j, int i, boolean z4, double d, java.lang.String str3, boolean z5, java.util.Map map, boolean z6, java.lang.Boolean bool, kotlin.jvm.functions.Function1 function1, java.util.List list, java.util.List list2, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function2 function2, boolean z7, boolean z8, com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter, com.statsig.androidsdk.IStatsigLifetimeCallback iStatsigLifetimeCallback, boolean z9, boolean z10, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? com.statsig.androidsdk.StatsigOptionsKt.DEFAULT_INIT_API : str, (i2 & 2) != 0 ? com.statsig.androidsdk.StatsigOptionsKt.DEFAULT_EVENT_API : str2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? 5000L : j, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? false : z4, (i2 & 256) != 0 ? 1.0d : d, (i2 & 512) != 0 ? null : str3, (i2 & 1024) != 0 ? false : z5, (i2 & 2048) != 0 ? null : map, (i2 & 4096) != 0 ? false : z6, (i2 & 8192) != 0 ? java.lang.Boolean.FALSE : bool, (i2 & 16384) != 0 ? null : function1, (i2 & 32768) != 0 ? null : list, (i2 & 65536) != 0 ? null : list2, (i2 & 131072) != 0 ? null : function12, (i2 & 262144) != 0 ? new kotlin.jvm.functions.Function2<java.lang.String, com.statsig.androidsdk.StatsigUser, java.lang.String>() { // from class: com.statsig.androidsdk.StatsigOptions.1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.String invoke(java.lang.String str4, com.statsig.androidsdk.StatsigUser statsigUser) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigUser, "");
                java.lang.String cacheKey = statsigUser.getCacheKey();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cacheKey);
                sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                sb.append(str4);
                return sb.toString();
            }
        } : function2, (i2 & 524288) != 0 ? false : z7, (i2 & 1048576) != 0 ? false : z8, (i2 & 2097152) != 0 ? null : onDeviceEvalAdapter, (i2 & 4194304) != 0 ? null : iStatsigLifetimeCallback, (i2 & 8388608) != 0 ? false : z9, (i2 & 16777216) != 0 ? true : z10);
    }

    public final java.lang.String getApi() {
        return this.api;
    }

    public final void setApi(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.api = str;
    }

    public final java.lang.String getEventLoggingAPI() {
        return this.eventLoggingAPI;
    }

    public final void setEventLoggingAPI(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.eventLoggingAPI = str;
    }

    public final boolean getDisableCurrentActivityLogging() {
        return this.disableCurrentActivityLogging;
    }

    public final void setDisableCurrentActivityLogging(boolean z) {
        this.disableCurrentActivityLogging = z;
    }

    public final boolean getDisableDiagnosticsLogging() {
        return this.disableDiagnosticsLogging;
    }

    public final void setDisableDiagnosticsLogging(boolean z) {
        this.disableDiagnosticsLogging = z;
    }

    public final boolean getDisableLoggingCompression() {
        return this.disableLoggingCompression;
    }

    public final void setDisableLoggingCompression(boolean z) {
        this.disableLoggingCompression = z;
    }

    public final long getInitTimeoutMs() {
        return this.initTimeoutMs;
    }

    public final void setInitTimeoutMs(long j) {
        this.initTimeoutMs = j;
    }

    public final int getInitRetryLimit() {
        return this.initRetryLimit;
    }

    public final void setInitRetryLimit(int i) {
        this.initRetryLimit = i;
    }

    public final boolean getEnableAutoValueUpdate() {
        return this.enableAutoValueUpdate;
    }

    public final void setEnableAutoValueUpdate(boolean z) {
        this.enableAutoValueUpdate = z;
    }

    public final java.lang.String getOverrideStableID() {
        return this.overrideStableID;
    }

    public final void setOverrideStableID(java.lang.String str) {
        this.overrideStableID = str;
    }

    public final boolean getLoadCacheAsync() {
        return this.loadCacheAsync;
    }

    public final void setLoadCacheAsync(boolean z) {
        this.loadCacheAsync = z;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getInitializeValues() {
        return this.initializeValues;
    }

    public final void setInitializeValues(java.util.Map<java.lang.String, ? extends java.lang.Object> map) {
        this.initializeValues = map;
    }

    public final boolean getInitializeOffline() {
        return this.initializeOffline;
    }

    public final void setInitializeOffline(boolean z) {
        this.initializeOffline = z;
    }

    public final java.lang.Boolean getDisableHashing() {
        return this.disableHashing;
    }

    public final void setDisableHashing(java.lang.Boolean bool) {
        this.disableHashing = bool;
    }

    public final kotlin.jvm.functions.Function1<com.statsig.androidsdk.StatsigUser, kotlin.Unit> getUserObjectValidator() {
        return this.userObjectValidator;
    }

    public final void setUserObjectValidator(kotlin.jvm.functions.Function1<? super com.statsig.androidsdk.StatsigUser, kotlin.Unit> function1) {
        this.userObjectValidator = function1;
    }

    public final java.util.List<java.lang.String> getInitializeFallbackUrls() {
        return this.initializeFallbackUrls;
    }

    public final void setInitializeFallbackUrls(java.util.List<java.lang.String> list) {
        this.initializeFallbackUrls = list;
    }

    public final java.util.List<java.lang.String> getLogEventFallbackUrls() {
        return this.logEventFallbackUrls;
    }

    public final void setLogEventFallbackUrls(java.util.List<java.lang.String> list) {
        this.logEventFallbackUrls = list;
    }

    public final kotlin.jvm.functions.Function1<com.statsig.androidsdk.BaseConfig, kotlin.Unit> getEvaluationCallback() {
        return this.evaluationCallback;
    }

    public final void setEvaluationCallback(kotlin.jvm.functions.Function1<? super com.statsig.androidsdk.BaseConfig, kotlin.Unit> function1) {
        this.evaluationCallback = function1;
    }

    public final kotlin.jvm.functions.Function2<java.lang.String, com.statsig.androidsdk.StatsigUser, java.lang.String> getCustomCacheKey() {
        return this.customCacheKey;
    }

    public final void setCustomCacheKey(kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.statsig.androidsdk.StatsigUser, java.lang.String> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.customCacheKey = function2;
    }

    public final boolean getDisableLogEventRetries() {
        return this.disableLogEventRetries;
    }

    public final void setDisableLogEventRetries(boolean z) {
        this.disableLogEventRetries = z;
    }

    public final boolean getOptOutNonSdkMetadata() {
        return this.optOutNonSdkMetadata;
    }

    public final void setOptOutNonSdkMetadata(boolean z) {
        this.optOutNonSdkMetadata = z;
    }

    public final com.statsig.androidsdk.OnDeviceEvalAdapter getOnDeviceEvalAdapter() {
        return this.onDeviceEvalAdapter;
    }

    public final void setOnDeviceEvalAdapter(com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter) {
        this.onDeviceEvalAdapter = onDeviceEvalAdapter;
    }

    public final com.statsig.androidsdk.IStatsigLifetimeCallback getLifetimeCallback() {
        return this.lifetimeCallback;
    }

    public final void setLifetimeCallback(com.statsig.androidsdk.IStatsigLifetimeCallback iStatsigLifetimeCallback) {
        this.lifetimeCallback = iStatsigLifetimeCallback;
    }

    public final boolean getLogNetworkMetadata() {
        return this.logNetworkMetadata;
    }

    public final void setLogNetworkMetadata(boolean z) {
        this.logNetworkMetadata = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsigOptions(java.lang.String str, java.lang.String str2, boolean z, boolean z2, boolean z3, long j, int i, boolean z4, double d, java.lang.String str3, boolean z5, java.util.Map<java.lang.String, ? extends java.lang.Object> map, boolean z6, java.lang.Boolean bool, kotlin.jvm.functions.Function1<? super com.statsig.androidsdk.StatsigUser, kotlin.Unit> function1, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2, kotlin.jvm.functions.Function1<? super com.statsig.androidsdk.BaseConfig, kotlin.Unit> function12, kotlin.jvm.functions.Function2<? super java.lang.String, ? super com.statsig.androidsdk.StatsigUser, java.lang.String> function2, boolean z7, boolean z8, com.statsig.androidsdk.OnDeviceEvalAdapter onDeviceEvalAdapter, com.statsig.androidsdk.IStatsigLifetimeCallback iStatsigLifetimeCallback, boolean z9, boolean z10) {
        super(z10);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.api = str;
        this.eventLoggingAPI = str2;
        this.disableCurrentActivityLogging = z;
        this.disableDiagnosticsLogging = z2;
        this.disableLoggingCompression = z3;
        this.initTimeoutMs = j;
        this.initRetryLimit = i;
        this.enableAutoValueUpdate = z4;
        this.overrideStableID = str3;
        this.loadCacheAsync = z5;
        this.initializeValues = map;
        this.initializeOffline = z6;
        this.disableHashing = bool;
        this.userObjectValidator = function1;
        this.initializeFallbackUrls = list;
        this.logEventFallbackUrls = list2;
        this.evaluationCallback = function12;
        this.customCacheKey = function2;
        this.disableLogEventRetries = z7;
        this.optOutNonSdkMetadata = z8;
        this.onDeviceEvalAdapter = onDeviceEvalAdapter;
        this.lifetimeCallback = iStatsigLifetimeCallback;
        this.logNetworkMetadata = z9;
        this.autoValueUpdateIntervalMinutes = kotlin.ranges.RangesKt.coerceAtLeast(d, 1.0d);
    }

    public final double getAutoValueUpdateIntervalMinutes() {
        return this.autoValueUpdateIntervalMinutes;
    }

    public final void setAutoValueUpdateIntervalMinutes(double d) {
        this.autoValueUpdateIntervalMinutes = d;
    }

    public final java.util.List<okhttp3.Interceptor> getInterceptors() {
        return this.interceptors;
    }

    public final void setInterceptors(java.util.List<? extends okhttp3.Interceptor> list) {
        this.interceptors = list;
    }

    public final void setTier(com.statsig.androidsdk.Tier tier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tier, "");
        setTier(tier.toString());
    }

    public final void setTier(java.lang.String tierName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tierName, "");
        java.lang.String lowerCase = tierName.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        setEnvironmentParameter("tier", lowerCase);
    }

    public final void setEnvironmentParameter(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        java.util.Map<java.lang.String, java.lang.String> map = this.environment;
        if (map == null) {
            this.environment = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(key, value));
        } else {
            map.put(key, value);
        }
    }

    public final java.util.Map<java.lang.String, java.lang.String> getEnvironment() {
        return this.environment;
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toMap$android_sdk_release() {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, this.api), kotlin.TuplesKt.to("disableCurrentActivityLogging", java.lang.Boolean.valueOf(this.disableCurrentActivityLogging)), kotlin.TuplesKt.to("disableDiagnosticsLogging", java.lang.Boolean.valueOf(this.disableDiagnosticsLogging)), kotlin.TuplesKt.to("initTimeoutMs", java.lang.Long.valueOf(this.initTimeoutMs)), kotlin.TuplesKt.to("enableAutoValueUpdate", java.lang.Boolean.valueOf(this.enableAutoValueUpdate)), kotlin.TuplesKt.to("autoValueUpdateIntervalMinutes", java.lang.Double.valueOf(this.autoValueUpdateIntervalMinutes)), kotlin.TuplesKt.to("overrideStableID", this.overrideStableID), kotlin.TuplesKt.to("loadCacheAsync", java.lang.Boolean.valueOf(this.loadCacheAsync)), kotlin.TuplesKt.to("initializeValues", this.initializeValues), kotlin.TuplesKt.to("disableHashing", this.disableHashing), kotlin.TuplesKt.to("environment", this.environment));
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getLoggingCopy$android_sdk_release() {
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, this.api), kotlin.TuplesKt.to("eventLoggingApi", this.eventLoggingAPI), kotlin.TuplesKt.to("disableCurrentActivityLogging", java.lang.Boolean.valueOf(this.disableCurrentActivityLogging)), kotlin.TuplesKt.to("disableDiagnosticsLogging", java.lang.Boolean.valueOf(this.disableDiagnosticsLogging)), kotlin.TuplesKt.to("initTimeoutMs", java.lang.Long.valueOf(this.initTimeoutMs)), kotlin.TuplesKt.to("enableAutoValueUpdate", java.lang.Boolean.valueOf(this.enableAutoValueUpdate)), kotlin.TuplesKt.to("autoValueUpdateIntervalMinutes", java.lang.Double.valueOf(this.autoValueUpdateIntervalMinutes)), kotlin.TuplesKt.to("overrideStableID", this.overrideStableID), kotlin.TuplesKt.to("loadCacheAsync", java.lang.Boolean.valueOf(this.loadCacheAsync)), kotlin.TuplesKt.to("initializeValues", "SET"), kotlin.TuplesKt.to("disableHashing", this.disableHashing), kotlin.TuplesKt.to("environment", this.environment), kotlin.TuplesKt.to("initializeFallbackUrls", this.initializeFallbackUrls), kotlin.TuplesKt.to("logEventFallbackUrls", this.logEventFallbackUrls), kotlin.TuplesKt.to("disableLogEventRetries", java.lang.Boolean.valueOf(this.disableLogEventRetries)), kotlin.TuplesKt.to("initRetryLimit", java.lang.Integer.valueOf(this.initRetryLimit)), kotlin.TuplesKt.to("initializeOffline", java.lang.Boolean.valueOf(this.initializeOffline)), kotlin.TuplesKt.to("loggingEnabled", java.lang.Boolean.valueOf(getLoggingEnabled())));
    }

    public StatsigOptions() {
        this(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, null, false, false, 33554431, null);
    }
}
