package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\r\b\u0000\u0018\u0000 E2\u00020\u0001:\u0001EB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010 J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u0004H\u0016¢\u0006\u0004\b+\u0010,J\u001d\u00100\u001a\u00020\u00002\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-H\u0016¢\u0006\u0004\b0\u00101R\u0016\u00104\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010:\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00109R\u0016\u00105\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010;R\u0018\u00102\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010<R\u0014\u0010?\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010@\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u00103R\u0016\u0010B\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010AR\u0016\u0010=\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010;R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020.0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010D"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "Lcom/datadog/android/trace/api/tracer/DatadogTracerBuilder;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "", "serviceName", "Lcom/datadog/trace/core/CoreTracer$CoreTracerBuilder;", "delegate", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Ljava/lang/String;Lcom/datadog/trace/core/CoreTracer$CoreTracerBuilder;)V", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "build", "()Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "Ljava/util/Properties;", "properties$dd_sdk_android_trace_release", "()Ljava/util/Properties;", "", "enabled", "setBundleWithRumEnabled", "(Z)Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "Lcom/datadog/trace/api/IdGenerationStrategy;", "strategy", "setCustomIdGenerationStrategy$dd_sdk_android_trace_release", "(Lcom/datadog/trace/api/IdGenerationStrategy;)Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "", "setSdkV2Compatible$dd_sdk_android_trace_release", "()V", "traceId128BitGenerationEnabled", "setTraceId128BitGenerationEnabled$dd_sdk_android_trace_release", "", "traceRateLimit", "setTraceRateLimit", "(I)Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "partialFlushMinSpans", "withPartialFlushMinSpans", "", "sampleRate", "withSampleRate", "(D)Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "withServiceName", "(Ljava/lang/String;)Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "withTag", "(Ljava/lang/String;Ljava/lang/String;)Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracingHeadersTypes", "withTracingHeadersTypes", "(Ljava/util/Set;)Lcom/datadog/android/trace/internal/DatadogTracerBuilderAdapter;", "getHighSpeedVideoFpsRangesFor", "Z", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/trace/core/CoreTracer$CoreTracerBuilder;", "Camera2StreamConfigurationMap", "", "Ljava/util/Map;", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Ljava/lang/Double;", "getInputSizeshNQ4ISI", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getOutputMinFrameDuration", "getInputFormats", "Ljava/lang/String;", "getHighSpeedVideoSizesFor", "getOutputFormats", "Ljava/util/Set;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogTracerBuilderAdapter implements com.datadog.android.trace.api.tracer.DatadogTracerBuilder {
    public static final int DEFAULT_PARTIAL_MIN_FLUSH = 5;
    public static final double DEFAULT_SAMPLE_RATE = 100.0d;
    public static final boolean DEFAULT_URL_AS_RESOURCE_NAME = false;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.trace.core.CoreTracer.CoreTracerBuilder Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private java.lang.Double getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private int getInputSizeshNQ4ISI;
    private boolean getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getOutputMinFrameDuration;
    private java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> getOutputFormats;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private java.lang.String getHighSpeedVideoSizesFor;

    public DatadogTracerBuilderAdapter(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, java.lang.String str, com.datadog.trace.core.CoreTracer.CoreTracerBuilder coreTracerBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coreTracerBuilder, "");
        this.getOutputMinFrameDuration = featureSdkCore;
        this.getHighSpeedVideoSizesFor = str;
        this.Camera2StreamConfigurationMap = coreTracerBuilder;
        this.getHighSpeedVideoSizes = true;
        this.getInputSizeshNQ4ISI = Integer.MAX_VALUE;
        this.getHighResolutionOutputSizeshNQ4ISI = 5;
        this.getHighSpeedVideoFpsRanges = new java.util.LinkedHashMap();
        this.getOutputFormats = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.datadog.android.trace.TracingHeaderType[]{com.datadog.android.trace.TracingHeaderType.DATADOG, com.datadog.android.trace.TracingHeaderType.TRACECONTEXT});
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final /* bridge */ /* synthetic */ com.datadog.android.trace.api.tracer.DatadogTracerBuilder withTracingHeadersTypes(java.util.Set set) {
        return withTracingHeadersTypes((java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>) set);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.api.tracer.DatadogTracer build() {
        com.datadog.trace.core.CoreTracer build = this.Camera2StreamConfigurationMap.withProperties(properties$dd_sdk_android_trace_release()).build();
        com.datadog.android.trace.internal.DatadogSpanLogger datadogSpanLogger = new com.datadog.android.trace.internal.DatadogSpanLogger(this.getOutputMinFrameDuration);
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getOutputMinFrameDuration;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        com.datadog.android.trace.internal.DatadogTracerAdapter datadogTracerAdapter = new com.datadog.android.trace.internal.DatadogTracerAdapter(featureSdkCore, build, this.getHighSpeedVideoSizes, datadogSpanLogger, null, 16, null);
        com.datadog.android.trace.internal.DatadogTracerAdapter datadogTracerAdapter2 = datadogTracerAdapter;
        datadogTracerAdapter.addScopeListener(new com.datadog.android.trace.internal.TracePropagationScopeListener(this.getOutputMinFrameDuration, datadogTracerAdapter2));
        return datadogTracerAdapter2;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter withServiceName(java.lang.String serviceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceName, "");
        this.getHighSpeedVideoSizesFor = serviceName;
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter withTracingHeadersTypes(java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> tracingHeadersTypes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracingHeadersTypes, "");
        this.getOutputFormats = tracingHeadersTypes;
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter withSampleRate(double sampleRate) {
        this.getHighSpeedVideoFpsRangesFor = java.lang.Double.valueOf(sampleRate);
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter withPartialFlushMinSpans(int partialFlushMinSpans) {
        this.getHighResolutionOutputSizeshNQ4ISI = partialFlushMinSpans;
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter withTag(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.put(key, value);
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter setBundleWithRumEnabled(boolean enabled) {
        this.getHighSpeedVideoSizes = enabled;
        return this;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracerBuilder
    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter setTraceRateLimit(int traceRateLimit) {
        this.getInputSizeshNQ4ISI = traceRateLimit;
        return this;
    }

    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter setTraceId128BitGenerationEnabled$dd_sdk_android_trace_release(boolean traceId128BitGenerationEnabled) {
        com.datadog.trace.api.IdGenerationStrategy fromName = com.datadog.trace.api.IdGenerationStrategy.fromName("SECURE_RANDOM", traceId128BitGenerationEnabled);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromName, "");
        return setCustomIdGenerationStrategy$dd_sdk_android_trace_release(fromName);
    }

    public final void setSdkV2Compatible$dd_sdk_android_trace_release() {
        this.getInputFormats = true;
    }

    public final com.datadog.android.trace.internal.DatadogTracerBuilderAdapter setCustomIdGenerationStrategy$dd_sdk_android_trace_release(com.datadog.trace.api.IdGenerationStrategy strategy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strategy, "");
        this.Camera2StreamConfigurationMap.idGenerationStrategy(strategy);
        return this;
    }

    public final java.util.Properties properties$dd_sdk_android_trace_release() {
        java.util.Properties properties = new java.util.Properties();
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(this.getOutputFormats, ",", null, null, 0, null, null, 62, null);
        properties.setProperty("propagation.style.extract", joinToString$default);
        properties.setProperty("propagation.style.inject", joinToString$default);
        properties.setProperty("service.name", this.getHighSpeedVideoSizesFor);
        properties.setProperty("trace.rate.limit", java.lang.String.valueOf(this.getInputSizeshNQ4ISI));
        properties.setProperty("trace.partial.flush.min.spans", java.lang.String.valueOf(this.getHighResolutionOutputSizeshNQ4ISI));
        properties.setProperty(com.datadog.android.trace.api.DatadogTracingConstants.TracerConfig.URL_AS_RESOURCE_NAME, "false");
        properties.setProperty("v2.compatibility.enabled", java.lang.String.valueOf(this.getInputFormats));
        java.lang.Double d = this.getHighSpeedVideoFpsRangesFor;
        if (d != null) {
            properties.setProperty("trace.sample.rate", java.lang.String.valueOf(d.doubleValue() / 100.0d));
        }
        java.util.Map<java.lang.String, java.lang.String> map = this.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            java.lang.String key = entry.getKey();
            java.lang.String value = entry.getValue();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append((java.lang.Object) key);
            sb.append(io.ktor.sse.ServerSentEventKt.COLON);
            sb.append((java.lang.Object) value);
            arrayList.add(sb.toString());
        }
        properties.setProperty("tags", kotlin.collections.CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null));
        return properties;
    }
}
