package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 l2\u00020\u0001:\u0001lBa\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00172\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00172\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0086@¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u001d2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+J-\u00100\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J-\u00100\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b0\u00104Ji\u0010>\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u00105\u001a\u00020\u00042\u0018\u00108\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000407062\b\u0010/\u001a\u0004\u0018\u00010\u000b2\u0006\u00109\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\u00112\u0006\u0010=\u001a\u00020<2\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b>\u0010?J=\u0010E\u001a\u00020$2\u0006\u0010@\u001a\u00020(2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0016\u0010D\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u000107H\u0002¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u001d¢\u0006\u0004\bG\u0010!J\u0015\u0010H\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bH\u0010IJ\u0017\u0010L\u001a\u00020\u00112\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u001dH\u0086@¢\u0006\u0004\bN\u0010#R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010OR\u0014\u0010Q\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010SR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010TR\u001c\u0010V\u001a\b\u0012\u0004\u0012\u00020$0U8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0018\u0010Y\u001a\u0006*\u00020X0X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010[R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\\R \u0010_\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010aR\"\u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020^0]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010`R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010OR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010gR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k"}, d2 = {"Lcom/statsig/androidsdk/StatsigLogger;", "", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "", "sdkKey", com.visa.cbp.getTicketMetaData$6672$values.values.ReplenishRequest, "Lcom/statsig/androidsdk/StatsigMetadata;", "statsigMetadata", "Lcom/statsig/androidsdk/StatsigNetwork;", "statsigNetwork", "Lcom/statsig/androidsdk/StatsigUser;", "statsigUser", "Lcom/statsig/androidsdk/Diagnostics;", "diagnostics", "", "fallbackUrls", "", "loggingEnabled", "Lcom/google/gson/Gson;", "gson", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Ljava/lang/String;Ljava/lang/String;Lcom/statsig/androidsdk/StatsigMetadata;Lcom/statsig/androidsdk/StatsigNetwork;Lcom/statsig/androidsdk/StatsigUser;Lcom/statsig/androidsdk/Diagnostics;Ljava/util/List;ZLcom/google/gson/Gson;)V", "", "metadata", "isManual", "addManualFlag", "(Ljava/util/Map;Z)Ljava/util/Map;", "configName", "", "addNonExposedCheck", "(Ljava/lang/String;)V", "addNonExposedChecksEvent", "()V", "flush", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/LogEvent;", "event", "log", "(Lcom/statsig/androidsdk/LogEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/statsig/androidsdk/ContextType;", "overrideContext", "logDiagnostics", "(Lcom/statsig/androidsdk/ContextType;)V", "name", "Lcom/statsig/androidsdk/DynamicConfig;", "config", "user", "logExposure", "(Ljava/lang/String;Lcom/statsig/androidsdk/DynamicConfig;Lcom/statsig/androidsdk/StatsigUser;Z)V", "Lcom/statsig/androidsdk/FeatureGate;", "gate", "(Ljava/lang/String;Lcom/statsig/androidsdk/FeatureGate;Lcom/statsig/androidsdk/StatsigUser;Z)V", "ruleID", "", "", "secondaryExposures", "allocatedExperiment", "parameterName", "isExplicitParameter", "Lcom/statsig/androidsdk/EvaluationDetails;", "details", "logLayerExposure", "(Ljava/lang/String;Ljava/lang/String;[Ljava/util/Map;Lcom/statsig/androidsdk/StatsigUser;Ljava/lang/String;Ljava/lang/String;ZLcom/statsig/androidsdk/EvaluationDetails;Z)V", "context", "", "Lcom/statsig/androidsdk/Marker;", "markers", "statsigOptions", "makeDiagnosticsEvent", "(Lcom/statsig/androidsdk/ContextType;Ljava/util/Collection;Ljava/util/Map;)Lcom/statsig/androidsdk/LogEvent;", "onUpdateUser", "setLoggingEnabled", "(Z)V", "Lcom/statsig/androidsdk/ExposureKey;", "key", "shouldLogExposure", "(Lcom/statsig/androidsdk/ExposureKey;)Z", "shutdown", "Ljava/lang/String;", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "coroutineDispatcherProvider", "Lcom/statsig/androidsdk/CoroutineDispatcherProvider;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/statsig/androidsdk/Diagnostics;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "events", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/util/List;", "Lcom/google/gson/Gson;", "Ljava/util/concurrent/ConcurrentHashMap;", "", "loggedExposures", "Ljava/util/concurrent/ConcurrentHashMap;", "Z", "nonExposedChecks", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "singleThreadDispatcher", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "Lcom/statsig/androidsdk/StatsigMetadata;", "Lcom/statsig/androidsdk/StatsigNetwork;", "Lcom/statsig/androidsdk/StatsigUser;", "Lkotlinx/coroutines/Job;", "timer", "Lkotlinx/coroutines/Job;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsigLogger {
    private static final com.statsig.androidsdk.StatsigLogger.Companion Companion = new com.statsig.androidsdk.StatsigLogger.Companion(null);
    private static final java.lang.String TAG = "statsig::StatsigLogger";
    private final java.lang.String api;
    private final com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider;
    private final kotlinx.coroutines.CoroutineScope coroutineScope;
    private final com.statsig.androidsdk.Diagnostics diagnostics;
    private java.util.concurrent.ConcurrentLinkedQueue<com.statsig.androidsdk.LogEvent> events;
    private final java.util.concurrent.ExecutorService executor;
    private final java.util.List<java.lang.String> fallbackUrls;
    private final com.google.gson.Gson gson;
    private final java.util.concurrent.ConcurrentHashMap<com.statsig.androidsdk.ExposureKey, java.lang.Long> loggedExposures;
    private boolean loggingEnabled;
    private java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> nonExposedChecks;
    private final java.lang.String sdkKey;
    private final kotlinx.coroutines.ExecutorCoroutineDispatcher singleThreadDispatcher;
    private final com.statsig.androidsdk.StatsigMetadata statsigMetadata;
    private final com.statsig.androidsdk.StatsigNetwork statsigNetwork;
    private final com.statsig.androidsdk.StatsigUser statsigUser;
    private final kotlinx.coroutines.Job timer;

    public StatsigLogger(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, java.lang.String str2, com.statsig.androidsdk.StatsigMetadata statsigMetadata, com.statsig.androidsdk.StatsigNetwork statsigNetwork, com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.Diagnostics diagnostics, java.util.List<java.lang.String> list, boolean z, com.google.gson.Gson gson) {
        kotlinx.coroutines.Job launch$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigNetwork, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statsigUser, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(diagnostics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gson, "");
        this.coroutineScope = coroutineScope;
        this.sdkKey = str;
        this.api = str2;
        this.statsigMetadata = statsigMetadata;
        this.statsigNetwork = statsigNetwork;
        this.statsigUser = statsigUser;
        this.diagnostics = diagnostics;
        this.fallbackUrls = list;
        this.loggingEnabled = z;
        this.gson = gson;
        java.util.concurrent.ExecutorService newSingleThreadExecutor = java.util.concurrent.Executors.newSingleThreadExecutor();
        this.executor = newSingleThreadExecutor;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "");
        this.singleThreadDispatcher = kotlinx.coroutines.ExecutorsKt.from(newSingleThreadExecutor);
        com.statsig.androidsdk.CoroutineDispatcherProvider coroutineDispatcherProvider = new com.statsig.androidsdk.CoroutineDispatcherProvider(null, null, null, 7, null);
        this.coroutineDispatcherProvider = coroutineDispatcherProvider;
        launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, coroutineDispatcherProvider.getIo(), null, new com.statsig.androidsdk.StatsigLogger$timer$1(this, null), 2, null);
        this.timer = launch$default;
        this.events = new java.util.concurrent.ConcurrentLinkedQueue<>();
        this.loggedExposures = new java.util.concurrent.ConcurrentHashMap<>();
        this.nonExposedChecks = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public /* synthetic */ StatsigLogger(kotlinx.coroutines.CoroutineScope coroutineScope, java.lang.String str, java.lang.String str2, com.statsig.androidsdk.StatsigMetadata statsigMetadata, com.statsig.androidsdk.StatsigNetwork statsigNetwork, com.statsig.androidsdk.StatsigUser statsigUser, com.statsig.androidsdk.Diagnostics diagnostics, java.util.List list, boolean z, com.google.gson.Gson gson, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, str, str2, statsigMetadata, statsigNetwork, statsigUser, diagnostics, (i & 128) != 0 ? null : list, z, gson);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/statsig/androidsdk/StatsigLogger$Companion;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes5.dex */
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.Object log(com.statsig.androidsdk.LogEvent logEvent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.singleThreadDispatcher, new com.statsig.androidsdk.StatsigLogger$log$2(this, logEvent, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public final void onUpdateUser() {
        this.loggedExposures.clear();
    }

    public final java.lang.Object flush(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(this.singleThreadDispatcher, new com.statsig.androidsdk.StatsigLogger$flush$2(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    public final void logExposure(java.lang.String name2, com.statsig.androidsdk.FeatureGate gate, com.statsig.androidsdk.StatsigUser user, boolean isManual) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        if (shouldLogExposure(new com.statsig.androidsdk.ExposureKey.Gate(name2, gate.getRule(), gate.getDetails().getReason(), gate.getValue()))) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new com.statsig.androidsdk.StatsigLogger$logExposure$1(user, name2, gate, this, isManual, null), 2, null);
        }
    }

    public final void logExposure(java.lang.String name2, com.statsig.androidsdk.DynamicConfig config, com.statsig.androidsdk.StatsigUser user, boolean isManual) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        if (shouldLogExposure(new com.statsig.androidsdk.ExposureKey.Config(name2, config.getRule(), config.getDetails().getReason()))) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new com.statsig.androidsdk.StatsigLogger$logExposure$2(user, name2, config, this, isManual, null), 2, null);
        }
    }

    public final void logLayerExposure(java.lang.String configName, java.lang.String ruleID, java.util.Map<java.lang.String, java.lang.String>[] secondaryExposures, com.statsig.androidsdk.StatsigUser user, java.lang.String allocatedExperiment, java.lang.String parameterName, boolean isExplicitParameter, com.statsig.androidsdk.EvaluationDetails details, boolean isManual) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ruleID, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secondaryExposures, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allocatedExperiment, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parameterName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(details, "");
        if (shouldLogExposure(new com.statsig.androidsdk.ExposureKey.Layer(configName, ruleID, allocatedExperiment, parameterName, isExplicitParameter, details.getReason()))) {
            java.util.Map<java.lang.String, java.lang.String> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("config", configName), kotlin.TuplesKt.to("ruleID", ruleID), kotlin.TuplesKt.to("allocatedExperiment", allocatedExperiment), kotlin.TuplesKt.to("parameterName", parameterName), kotlin.TuplesKt.to("isExplicitParameter", java.lang.String.valueOf(isExplicitParameter)), kotlin.TuplesKt.to("reason", details.getReason().toString()), kotlin.TuplesKt.to("time", java.lang.String.valueOf(details.getTime())));
            addManualFlag(mutableMapOf, isManual);
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new com.statsig.androidsdk.StatsigLogger$logLayerExposure$1(user, mutableMapOf, secondaryExposures, this, null), 2, null);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:25|26))(2:27|(1:29)(1:30))|10|11|12|(1:14)|15|16|(1:18)|19|20))|31|6|(0)(0)|10|11|12|(0)|15|16|(0)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r5 = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(r5));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: all -> 0x006d, TryCatch #0 {all -> 0x006d, blocks: (B:12:0x0050, B:14:0x0061, B:15:0x0066), top: B:11:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object shutdown(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.statsig.androidsdk.StatsigLogger$shutdown$1 statsigLogger$shutdown$1;
        int i;
        com.statsig.androidsdk.StatsigLogger statsigLogger;
        java.lang.Object m23436constructorimpl;
        if (continuation instanceof com.statsig.androidsdk.StatsigLogger$shutdown$1) {
            statsigLogger$shutdown$1 = (com.statsig.androidsdk.StatsigLogger$shutdown$1) continuation;
            if ((statsigLogger$shutdown$1.label & Integer.MIN_VALUE) != 0) {
                statsigLogger$shutdown$1.label -= 2147483648;
                java.lang.Object obj = statsigLogger$shutdown$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = statsigLogger$shutdown$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(this.timer, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                    statsigLogger$shutdown$1.L$0 = this;
                    statsigLogger$shutdown$1.label = 1;
                    if (flush(statsigLogger$shutdown$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    statsigLogger = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    statsigLogger = (com.statsig.androidsdk.StatsigLogger) statsigLogger$shutdown$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                statsigLogger.executor.shutdown();
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                com.statsig.androidsdk.StatsigLogger statsigLogger2 = statsigLogger;
                if (!statsigLogger.executor.awaitTermination(3L, java.util.concurrent.TimeUnit.SECONDS)) {
                    statsigLogger.executor.shutdownNow();
                }
                m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
                if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                    statsigLogger.executor.shutdownNow();
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        statsigLogger$shutdown$1 = new com.statsig.androidsdk.StatsigLogger$shutdown$1(this, continuation);
        java.lang.Object obj2 = statsigLogger$shutdown$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = statsigLogger$shutdown$1.label;
        if (i != 0) {
        }
        statsigLogger.executor.shutdown();
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        com.statsig.androidsdk.StatsigLogger statsigLogger22 = statsigLogger;
        if (!statsigLogger.executor.awaitTermination(3L, java.util.concurrent.TimeUnit.SECONDS)) {
        }
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.Unit.INSTANCE);
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ void logDiagnostics$default(com.statsig.androidsdk.StatsigLogger statsigLogger, com.statsig.androidsdk.ContextType contextType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            contextType = null;
        }
        statsigLogger.logDiagnostics(contextType);
    }

    public final void logDiagnostics(com.statsig.androidsdk.ContextType overrideContext) {
        if (overrideContext == null) {
            overrideContext = this.diagnostics.getDiagnosticsContext();
        }
        java.util.Queue<com.statsig.androidsdk.Marker> markers = this.diagnostics.getMarkers(overrideContext);
        if (markers.isEmpty()) {
            return;
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, this.singleThreadDispatcher, null, new com.statsig.androidsdk.StatsigLogger$logDiagnostics$1(this, makeDiagnosticsEvent(overrideContext, markers, overrideContext == com.statsig.androidsdk.ContextType.INITIALIZE ? this.diagnostics.getStatsigOptionsLoggingCopy() : null), null), 2, null);
        com.statsig.androidsdk.Diagnostics.clearContext$default(this.diagnostics, null, 1, null);
    }

    public final void setLoggingEnabled(boolean loggingEnabled) {
        this.loggingEnabled = loggingEnabled;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.Map<java.lang.String, java.lang.String> addManualFlag(java.util.Map<java.lang.String, java.lang.String> metadata, boolean isManual) {
        if (isManual) {
            metadata.put("isManualExposure", "true");
        }
        return metadata;
    }

    private final boolean shouldLogExposure(com.statsig.androidsdk.ExposureKey key) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.Long l = this.loggedExposures.get(key);
        if (l != null && elapsedRealtime - l.longValue() < androidx.work.multiprocess.RemoteWorkManager.DEFAULT_SESSION_TIMEOUT_MILLIS) {
            return false;
        }
        this.loggedExposures.put(key, java.lang.Long.valueOf(elapsedRealtime));
        return true;
    }

    public final void addNonExposedCheck(java.lang.String configName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configName, "");
        java.lang.Long l = this.nonExposedChecks.get(configName);
        if (l == null) {
            l = 0L;
        }
        this.nonExposedChecks.put(configName, java.lang.Long.valueOf(l.longValue() + 1));
    }

    private final com.statsig.androidsdk.LogEvent makeDiagnosticsEvent(com.statsig.androidsdk.ContextType context, java.util.Collection<com.statsig.androidsdk.Marker> markers, java.util.Map<java.lang.String, ? extends java.lang.Object> statsigOptions) {
        com.statsig.androidsdk.LogEvent logEvent = new com.statsig.androidsdk.LogEvent(com.statsig.androidsdk.StatsigLoggerKt.DIAGNOSTICS_EVENT);
        logEvent.setUser(this.statsigUser);
        java.lang.String lowerCase = context.toString().toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        logEvent.setMetadata(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("context", lowerCase), kotlin.TuplesKt.to("markers", this.gson.toJson(markers)), kotlin.TuplesKt.to("statsigOptions", this.gson.toJson(statsigOptions))));
        return logEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addNonExposedChecksEvent() {
        if (this.nonExposedChecks.isEmpty()) {
            return;
        }
        com.statsig.androidsdk.LogEvent logEvent = new com.statsig.androidsdk.LogEvent(com.statsig.androidsdk.StatsigLoggerKt.NON_EXPOSED_CHECKS_EVENT);
        logEvent.setMetadata(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("checks", this.gson.toJson(this.nonExposedChecks))));
        this.events.add(logEvent);
        this.nonExposedChecks.clear();
    }
}
