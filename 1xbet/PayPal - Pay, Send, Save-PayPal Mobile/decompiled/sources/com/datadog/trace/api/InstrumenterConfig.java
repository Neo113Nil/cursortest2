package com.datadog.trace.api;

/* loaded from: classes3.dex */
public class InstrumenterConfig {
    private static final com.datadog.trace.api.InstrumenterConfig getHighSpeedVideoSizes = new com.datadog.trace.api.InstrumenterConfig(com.datadog.trace.bootstrap.config.provider.ConfigProvider.getInstance());
    private final boolean ArtificialStackFrames;
    private final java.util.List<java.lang.String> Camera2StreamConfigurationMap;
    private final boolean CoroutineDebuggingKt;
    private final java.util.List<java.lang.String> _BOUNDARY;
    private final boolean _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> f2925a;
    private final java.lang.Boolean accessartificialFrame;
    private final java.lang.String b;
    private final java.util.Set<java.lang.String> c;
    private final boolean coroutineBoundary;
    private final boolean coroutineCreation;
    private final boolean getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final com.datadog.trace.bootstrap.config.provider.ConfigProvider getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizesFor;
    private final java.util.List<java.lang.String> getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private final java.lang.String getOutputSizes;
    private final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> getOutputSizeshNQ4ISI;
    private final boolean getOutputStallDuration;
    private final boolean getOutputStallDurationlomOqCM;
    private final java.lang.String getValidOutputFormatsForInputhNQ4ISI;
    private final int isOutputSupportedFor;
    private final boolean isOutputSupportedForhNQ4ISI;
    private final boolean kernelVersion;
    private final boolean toString;
    private final com.datadog.trace.api.ResolverCacheConfig unwrapAs;

    private InstrumenterConfig() {
        this(com.datadog.trace.bootstrap.config.provider.ConfigProvider.createDefault());
    }

    InstrumenterConfig(com.datadog.trace.bootstrap.config.provider.ConfigProvider configProvider) {
        this.getHighResolutionOutputSizeshNQ4ISI = configProvider;
        this.getHighSpeedVideoSizesFor = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.INTEGRATIONS_ENABLED, true, new java.lang.String[0]);
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_ENABLED, true, new java.lang.String[0]);
        this.kernelVersion = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_OTEL_ENABLED, false, new java.lang.String[0]);
        this.getOutputStallDuration = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_128_BIT_TRACEID_LOGGING_ENABLED, false, new java.lang.String[0]);
        this.getOutputStallDurationlomOqCM = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_ENABLED, false, new java.lang.String[0]);
        this.coroutineCreation = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.TELEMETRY_ENABLED, true, new java.lang.String[0]);
        this._CREATION = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_EXECUTORS_ALL, false, new java.lang.String[0]);
        this._BOUNDARY = com.datadog.trace.util.CollectionUtils.tryMakeImmutableList(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_EXECUTORS));
        this.c = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_THREAD_POOL_EXECUTORS_EXCLUDE));
        this.getOutputSizes = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.JDBC_PREPARED_STATEMENT_CLASS_NAME, "", new java.lang.String[0]);
        this.getOutputMinFrameDurationlomOqCM = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.JDBC_CONNECTION_CLASS_NAME, "", new java.lang.String[0]);
        this.getOutputFormats = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.HTTP_URL_CONNECTION_CLASS_NAME, "", new java.lang.String[0]);
        this.getHighSpeedVideoFpsRangesFor = configProvider.getBoolean(com.datadog.trace.api.config.ProfilingConfig.PROFILING_DIRECT_ALLOCATION_ENABLED, false, new java.lang.String[0]);
        this.Camera2StreamConfigurationMap = com.datadog.trace.util.CollectionUtils.tryMakeImmutableList(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_CLASSES_EXCLUDE));
        this.getInputSizeshNQ4ISI = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_CLASSES_EXCLUDE_FILE);
        this.getHighSpeedVideoFpsRanges = com.datadog.trace.util.CollectionUtils.tryMakeImmutableSet(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_CLASSLOADERS_EXCLUDE));
        this.getInputFormats = com.datadog.trace.util.CollectionUtils.tryMakeImmutableList(configProvider.getList(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_CODESOURCES_EXCLUDE));
        this.unwrapAs = (com.datadog.trace.api.ResolverCacheConfig) configProvider.getEnum(com.datadog.trace.api.config.TraceInstrumentationConfig.RESOLVER_CACHE_CONFIG, com.datadog.trace.api.ResolverCacheConfig.class, com.datadog.trace.api.ResolverCacheConfig.MEMOS);
        this.getValidOutputFormatsForInputhNQ4ISI = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.RESOLVER_CACHE_DIR);
        this.toString = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.RESOLVER_NAMES_ARE_UNIQUE, false, new java.lang.String[0]);
        this.isOutputSupportedForhNQ4ISI = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.RESOLVER_USE_LOADCLASS, true, new java.lang.String[0]);
        this.accessartificialFrame = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.RESOLVER_USE_URL_CACHES);
        this.isOutputSupportedFor = configProvider.getInteger(com.datadog.trace.api.config.TraceInstrumentationConfig.RESOLVER_RESET_INTERVAL, 300, new java.lang.String[0]);
        this.CoroutineDebuggingKt = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.RUNTIME_CONTEXT_FIELD_INJECTION, true, new java.lang.String[0]);
        this.coroutineBoundary = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.SERIALVERSIONUID_FIELD_INJECTION, true, new java.lang.String[0]);
        this.b = configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_ANNOTATIONS, com.datadog.trace.api.ConfigDefaults.getOutputMinFrameDuration, new java.lang.String[0]);
        this.ArtificialStackFrames = configProvider.getBoolean(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_ANNOTATION_ASYNC, false, new java.lang.String[0]);
        this.f2925a = com.datadog.trace.api.MethodFilterConfigParser.parse(configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.TRACE_METHODS, com.datadog.trace.api.ConfigDefaults.getInputSizeshNQ4ISI, new java.lang.String[0]));
        this.getOutputSizeshNQ4ISI = com.datadog.trace.api.MethodFilterConfigParser.parse(configProvider.getString(com.datadog.trace.api.config.TraceInstrumentationConfig.MEASURE_METHODS, "", new java.lang.String[0]));
        this.getOutputMinFrameDuration = configProvider.getBoolean(com.datadog.trace.api.config.GeneralConfig.INTERNAL_EXIT_ON_FAILURE, false, new java.lang.String[0]);
    }

    public boolean isIntegrationsEnabled() {
        return this.getHighSpeedVideoSizesFor;
    }

    public boolean isIntegrationEnabled(java.lang.Iterable<java.lang.String> iterable, boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEnabled(iterable, "integration.", ".enabled", z);
    }

    public boolean isIntegrationShortcutMatchingEnabled(java.lang.Iterable<java.lang.String> iterable, boolean z) {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEnabled(iterable, "integration.", ".matching.shortcut.enabled", z);
    }

    public boolean isTraceEnabled() {
        return this.getARTIFICIAL_FRAME_PACKAGE_NAME;
    }

    public boolean isTraceOtelEnabled() {
        return this.kernelVersion;
    }

    public boolean isLogs128bTraceIdEnabled() {
        return this.getOutputStallDuration;
    }

    public boolean isProfilingEnabled() {
        return this.getOutputStallDurationlomOqCM;
    }

    public boolean isTelemetryEnabled() {
        return this.coroutineCreation;
    }

    public boolean isTraceExecutorsAll() {
        return this._CREATION;
    }

    public java.util.List<java.lang.String> getTraceExecutors() {
        return this._BOUNDARY;
    }

    public java.util.Set<java.lang.String> getTraceThreadPoolExecutorsExclude() {
        return this.c;
    }

    public java.lang.String getJdbcPreparedStatementClassName() {
        return this.getOutputSizes;
    }

    public java.lang.String getJdbcConnectionClassName() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public java.lang.String getHttpURLConnectionClassName() {
        return this.getOutputFormats;
    }

    public boolean isDirectAllocationProfilingEnabled() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.List<java.lang.String> getExcludedClasses() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getExcludedClassesFile() {
        return this.getInputSizeshNQ4ISI;
    }

    public java.util.Set<java.lang.String> getExcludedClassLoaders() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.util.List<java.lang.String> getExcludedCodeSources() {
        return this.getInputFormats;
    }

    public int getResolverNoMatchesSize() {
        return this.unwrapAs.noMatchesSize();
    }

    public boolean isResolverMemoizingEnabled() {
        return this.unwrapAs.memoPoolSize() > 0;
    }

    public int getResolverMemoPoolSize() {
        return this.unwrapAs.memoPoolSize();
    }

    public boolean isResolverOutliningEnabled() {
        return this.unwrapAs.outlinePoolSize() > 0;
    }

    public int getResolverOutlinePoolSize() {
        return this.unwrapAs.outlinePoolSize();
    }

    public int getResolverTypePoolSize() {
        return this.unwrapAs.typePoolSize();
    }

    public java.lang.String getResolverCacheDir() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public boolean isResolverNamesAreUnique() {
        return this.toString;
    }

    public boolean isResolverUseLoadClass() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public java.lang.Boolean isResolverUseUrlCaches() {
        return this.accessartificialFrame;
    }

    public int getResolverResetInterval() {
        return this.isOutputSupportedFor;
    }

    public boolean isRuntimeContextFieldInjection() {
        return this.CoroutineDebuggingKt;
    }

    public boolean isSerialVersionUIDFieldInjection() {
        return this.coroutineBoundary;
    }

    public java.lang.String getTraceAnnotations() {
        return this.b;
    }

    public boolean isTraceAnnotationAsync() {
        return this.ArtificialStackFrames;
    }

    public java.util.Map<java.lang.String, java.util.Set<java.lang.String>> getTraceMethods() {
        return this.f2925a;
    }

    public boolean isMethodMeasured(java.lang.reflect.Method method) {
        if (this.getOutputSizeshNQ4ISI.isEmpty()) {
            return false;
        }
        java.util.Set<java.lang.String> set = this.getOutputSizeshNQ4ISI.get(method.getDeclaringClass().getName());
        return set != null && (set.contains(method.getName()) || set.contains("*"));
    }

    public boolean isInternalExitOnFailure() {
        return this.getOutputMinFrameDuration;
    }

    public static com.datadog.trace.api.InstrumenterConfig get() {
        return getHighSpeedVideoSizes;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InstrumenterConfig{integrationsEnabled=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", traceEnabled=");
        sb.append(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
        sb.append(", traceOtelEnabled=");
        sb.append(this.kernelVersion);
        sb.append(", logs128bTraceIdEnabled=");
        sb.append(this.getOutputStallDuration);
        sb.append(", profilingEnabled=");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(", telemetryEnabled=");
        sb.append(this.coroutineCreation);
        sb.append(", traceExecutorsAll=");
        sb.append(this._CREATION);
        sb.append(", traceExecutors=");
        sb.append(this._BOUNDARY);
        sb.append(", jdbcPreparedStatementClassName='");
        sb.append(this.getOutputSizes);
        sb.append("', jdbcConnectionClassName='");
        sb.append(this.getOutputMinFrameDurationlomOqCM);
        sb.append("', httpURLConnectionClassName='");
        sb.append(this.getOutputFormats);
        sb.append("', excludedClasses=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", excludedClassesFile=");
        sb.append(this.getInputSizeshNQ4ISI);
        sb.append(", excludedClassLoaders=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", excludedCodeSources=");
        sb.append(this.getInputFormats);
        sb.append(", resolverCacheConfig=");
        sb.append(this.unwrapAs);
        sb.append(", resolverCacheDir=");
        sb.append(this.getValidOutputFormatsForInputhNQ4ISI);
        sb.append(", resolverNamesAreUnique=");
        sb.append(this.toString);
        sb.append(", resolverUseLoadClass=");
        sb.append(this.isOutputSupportedForhNQ4ISI);
        sb.append(", resolverUseUrlCaches=");
        sb.append(this.accessartificialFrame);
        sb.append(", resolverResetInterval=");
        sb.append(this.isOutputSupportedFor);
        sb.append(", runtimeContextFieldInjection=");
        sb.append(this.CoroutineDebuggingKt);
        sb.append(", serialVersionUIDFieldInjection=");
        sb.append(this.coroutineBoundary);
        sb.append(", traceAnnotations='");
        sb.append(this.b);
        sb.append("', traceAnnotationAsync=");
        sb.append(this.ArtificialStackFrames);
        sb.append(", traceMethods='");
        sb.append(this.f2925a);
        sb.append("', measureMethods= '");
        sb.append(this.getOutputSizeshNQ4ISI);
        sb.append("', internalExitOnFailure=");
        sb.append(this.getOutputMinFrameDuration);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
