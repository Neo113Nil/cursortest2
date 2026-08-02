package com.datadog.android.trace;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b5\u0018\u0000 j2\u00020\u0001:\u0001jB\u0017\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B#\b\u0016\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007¢\u0006\u0004\b\u0005\u0010\u000bB±\u0001\b\u0000\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012 \b\u0002\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00120\u0010\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u0005\u0010 J\r\u0010!\u001a\u00020\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\r¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\r¢\u0006\u0004\b(\u0010)J\u001f\u0010*\u001a\u00020\u00002\u000e\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001bH\u0000¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0000¢\u0006\u0004\b,\u0010\"J/\u0010.\u001a\u00020\u00002\u001e\u0010-\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00120\u0010H\u0000¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b4\u00101J\u0015\u00107\u001a\u00020\u00002\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u00020\u00002\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018¢\u0006\u0004\b9\u0010:J\u0015\u0010;\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b=\u0010>R*\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u001b8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010?\u001a\u0004\b@\u0010A\"\u0004\b*\u0010BR\"\u0010\u001f\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010C\u001a\u0004\bD\u0010&\"\u0004\bE\u0010FR:\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\u00120\u00108\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010G\u001a\u0004\bH\u0010I\"\u0004\b.\u0010JR\"\u0010\u001e\u001a\u00020\u001d8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010\u000e\u001a\u00020\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010C\u001a\u0004\bP\u0010&\"\u0004\bQ\u0010FR$\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010R\u001a\u0004\bS\u0010$\"\u0004\bT\u0010UR\"\u0010\u0015\u001a\u00020\u00148\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR$\u0010\f\u001a\u0004\u0018\u00010\u00038\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\f\u0010R\u001a\u0004\b[\u0010$\"\u0004\b\\\u0010UR(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010b\u001a\u0004\bc\u0010dR\"\u0010\u0017\u001a\u00020\u00168\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010i"}, d2 = {"Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "", "", "", "tracedHosts", "<init>", "(Ljava/util/List;)V", "", "", "Lcom/datadog/android/trace/TracingHeaderType;", "tracedHostsWithHeaderType", "(Ljava/util/Map;)V", "traceOrigin", "", "redacted404ResourceName", "sdkInstanceName", "Lkotlin/Function2;", "Lcom/datadog/android/api/SdkCore;", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "localTracerFactory", "Lcom/datadog/android/trace/TraceContextInjection;", "traceContextInjection", "Lcom/datadog/android/trace/NetworkTracedRequestListener;", "tracedRequestListener", "Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "traceSampler", "Lkotlin/Function0;", "globalTracerProvider", "Lcom/datadog/android/trace/ApmNetworkTracingScope;", "networkTracingScope", "headerPropagationOnly", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/datadog/android/trace/TraceContextInjection;Lcom/datadog/android/trace/NetworkTracedRequestListener;Lcom/datadog/android/core/sampling/Sampler;Lkotlin/jvm/functions/Function0;Lcom/datadog/android/trace/ApmNetworkTracingScope;Z)V", "copy", "()Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "getTraceOrigin", "()Ljava/lang/String;", "isHeaderPropagationOnly", "()Z", "redacted", "set404ResourcesRedacted", "(Z)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setGlobalTracerProvider$dd_sdk_android_trace_release", "(Lkotlin/jvm/functions/Function0;)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setHeaderPropagationOnly", "factory", "setLocalTracerFactory$dd_sdk_android_trace_release", "(Lkotlin/jvm/functions/Function2;)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setSdkInstanceName", "(Ljava/lang/String;)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setTraceContextInjection", "(Lcom/datadog/android/trace/TraceContextInjection;)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setTraceOrigin", "", "sampleRate", "setTraceSampleRate", "(F)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setTraceSampler", "(Lcom/datadog/android/core/sampling/Sampler;)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setTraceScope", "(Lcom/datadog/android/trace/ApmNetworkTracingScope;)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "setTracedRequestListener", "(Lcom/datadog/android/trace/NetworkTracedRequestListener;)Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "Lkotlin/jvm/functions/Function0;", "getGlobalTracerProvider$dd_sdk_android_trace_release", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "Z", "getHeaderPropagationOnly$dd_sdk_android_trace_release", "setHeaderPropagationOnly$dd_sdk_android_trace_release", "(Z)V", "Lkotlin/jvm/functions/Function2;", "getLocalTracerFactory$dd_sdk_android_trace_release", "()Lkotlin/jvm/functions/Function2;", "(Lkotlin/jvm/functions/Function2;)V", "Lcom/datadog/android/trace/ApmNetworkTracingScope;", "getNetworkTracingScope$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/ApmNetworkTracingScope;", "setNetworkTracingScope$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/ApmNetworkTracingScope;)V", "getRedacted404ResourceName$dd_sdk_android_trace_release", "setRedacted404ResourceName$dd_sdk_android_trace_release", "Ljava/lang/String;", "getSdkInstanceName$dd_sdk_android_trace_release", "setSdkInstanceName$dd_sdk_android_trace_release", "(Ljava/lang/String;)V", "Lcom/datadog/android/trace/TraceContextInjection;", "getTraceContextInjection$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/TraceContextInjection;", "setTraceContextInjection$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/TraceContextInjection;)V", "getTraceOrigin$dd_sdk_android_trace_release", "setTraceOrigin$dd_sdk_android_trace_release", "Lcom/datadog/android/core/sampling/Sampler;", "getTraceSampler$dd_sdk_android_trace_release", "()Lcom/datadog/android/core/sampling/Sampler;", "setTraceSampler$dd_sdk_android_trace_release", "(Lcom/datadog/android/core/sampling/Sampler;)V", "Ljava/util/Map;", "getTracedHostsWithHeaderType$dd_sdk_android_trace_release", "()Ljava/util/Map;", "Lcom/datadog/android/trace/NetworkTracedRequestListener;", "getTracedRequestListener$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/NetworkTracedRequestListener;", "setTracedRequestListener$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/NetworkTracedRequestListener;)V", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApmNetworkInstrumentationConfiguration {
    public static final double ALL_IN_SAMPLE_RATE = 100.0d;
    public static final float DEFAULT_TRACE_SAMPLE_RATE = 100.0f;
    public static final java.lang.String NETWORK_REQUESTS_TRACKING_FEATURE_NAME = "Network Requests";
    private kotlin.jvm.functions.Function0<? extends com.datadog.android.trace.api.tracer.DatadogTracer> globalTracerProvider;
    private boolean headerPropagationOnly;
    private kotlin.jvm.functions.Function2<? super com.datadog.android.api.SdkCore, ? super java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, ? extends com.datadog.android.trace.api.tracer.DatadogTracer> localTracerFactory;
    private com.datadog.android.trace.ApmNetworkTracingScope networkTracingScope;
    private boolean redacted404ResourceName;
    private java.lang.String sdkInstanceName;
    private com.datadog.android.trace.TraceContextInjection traceContextInjection;
    private java.lang.String traceOrigin;
    private com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> traceSampler;
    private final java.util.Map<java.lang.String, java.util.Set<com.datadog.android.trace.TracingHeaderType>> tracedHostsWithHeaderType;
    private com.datadog.android.trace.NetworkTracedRequestListener tracedRequestListener;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration.Companion INSTANCE = new com.datadog.android.trace.ApmNetworkInstrumentationConfiguration.Companion(null);
    private static final kotlin.jvm.functions.Function2<com.datadog.android.api.SdkCore, java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, com.datadog.android.trace.api.tracer.DatadogTracer> getHighSpeedVideoSizes = new kotlin.jvm.functions.Function2<com.datadog.android.api.SdkCore, java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, com.datadog.android.trace.api.tracer.DatadogTracer>() { // from class: com.datadog.android.trace.ApmNetworkInstrumentationConfiguration$Companion$DEFAULT_LOCAL_TRACER_FACTORY$1
        @Override // kotlin.jvm.functions.Function2
        /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
        public final com.datadog.android.trace.api.tracer.DatadogTracer invoke(com.datadog.android.api.SdkCore sdkCore, java.util.Set<? extends com.datadog.android.trace.TracingHeaderType> set) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            return com.datadog.android.trace.DatadogTracing.newTracerBuilder(sdkCore).withTracingHeadersTypes(set).withSampleRate(100.0d).build();
        }
    };

    /* JADX WARN: Multi-variable type inference failed */
    public ApmNetworkInstrumentationConfiguration(java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>> map, java.lang.String str, boolean z, java.lang.String str2, kotlin.jvm.functions.Function2<? super com.datadog.android.api.SdkCore, ? super java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, ? extends com.datadog.android.trace.api.tracer.DatadogTracer> function2, com.datadog.android.trace.TraceContextInjection traceContextInjection, com.datadog.android.trace.NetworkTracedRequestListener networkTracedRequestListener, com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> sampler, kotlin.jvm.functions.Function0<? extends com.datadog.android.trace.api.tracer.DatadogTracer> function0, com.datadog.android.trace.ApmNetworkTracingScope apmNetworkTracingScope, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceContextInjection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTracedRequestListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apmNetworkTracingScope, "");
        this.tracedHostsWithHeaderType = map;
        this.traceOrigin = str;
        this.redacted404ResourceName = z;
        this.sdkInstanceName = str2;
        this.localTracerFactory = function2;
        this.traceContextInjection = traceContextInjection;
        this.tracedRequestListener = networkTracedRequestListener;
        this.traceSampler = sampler;
        this.globalTracerProvider = function0;
        this.networkTracingScope = apmNetworkTracingScope;
        this.headerPropagationOnly = z2;
    }

    public final java.util.Map<java.lang.String, java.util.Set<com.datadog.android.trace.TracingHeaderType>> getTracedHostsWithHeaderType$dd_sdk_android_trace_release() {
        return this.tracedHostsWithHeaderType;
    }

    public final java.lang.String getTraceOrigin$dd_sdk_android_trace_release() {
        return this.traceOrigin;
    }

    public final void setTraceOrigin$dd_sdk_android_trace_release(java.lang.String str) {
        this.traceOrigin = str;
    }

    /* renamed from: getRedacted404ResourceName$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getRedacted404ResourceName() {
        return this.redacted404ResourceName;
    }

    public final void setRedacted404ResourceName$dd_sdk_android_trace_release(boolean z) {
        this.redacted404ResourceName = z;
    }

    /* renamed from: getSdkInstanceName$dd_sdk_android_trace_release, reason: from getter */
    public final java.lang.String getSdkInstanceName() {
        return this.sdkInstanceName;
    }

    public final void setSdkInstanceName$dd_sdk_android_trace_release(java.lang.String str) {
        this.sdkInstanceName = str;
    }

    public /* synthetic */ ApmNetworkInstrumentationConfiguration(java.util.Map map, java.lang.String str, boolean z, java.lang.String str2, kotlin.jvm.functions.Function2 function2, com.datadog.android.trace.TraceContextInjection traceContextInjection, com.datadog.android.trace.NetworkTracedRequestListener networkTracedRequestListener, com.datadog.android.core.sampling.Sampler sampler, kotlin.jvm.functions.Function0 function0, com.datadog.android.trace.ApmNetworkTracingScope apmNetworkTracingScope, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? true : z, (i & 8) == 0 ? str2 : null, (i & 16) != 0 ? getHighSpeedVideoSizes : function2, (i & 32) != 0 ? com.datadog.android.trace.TraceContextInjection.SAMPLED : traceContextInjection, (i & 64) != 0 ? new com.datadog.android.trace.NoOpNetworkTracedRequestListener() : networkTracedRequestListener, (i & 128) != 0 ? new com.datadog.android.trace.DeterministicTraceSampler(100.0f) : sampler, (i & 256) != 0 ? new kotlin.jvm.functions.Function0<com.datadog.android.trace.api.tracer.DatadogTracer>() { // from class: com.datadog.android.trace.ApmNetworkInstrumentationConfiguration.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.trace.api.tracer.DatadogTracer invoke() {
                return com.datadog.android.trace.GlobalDatadogTracer.INSTANCE.getOrNull();
            }
        } : function0, (i & 512) != 0 ? com.datadog.android.trace.ApmNetworkTracingScope.EXCLUDE_INTERNAL_REDIRECTS : apmNetworkTracingScope, (i & 1024) != 0 ? false : z2);
    }

    public final kotlin.jvm.functions.Function2<com.datadog.android.api.SdkCore, java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, com.datadog.android.trace.api.tracer.DatadogTracer> getLocalTracerFactory$dd_sdk_android_trace_release() {
        return this.localTracerFactory;
    }

    /* renamed from: setLocalTracerFactory$dd_sdk_android_trace_release, reason: collision with other method in class */
    public final void m10030setLocalTracerFactory$dd_sdk_android_trace_release(kotlin.jvm.functions.Function2<? super com.datadog.android.api.SdkCore, ? super java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, ? extends com.datadog.android.trace.api.tracer.DatadogTracer> function2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        this.localTracerFactory = function2;
    }

    /* renamed from: getTraceContextInjection$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.TraceContextInjection getTraceContextInjection() {
        return this.traceContextInjection;
    }

    public final void setTraceContextInjection$dd_sdk_android_trace_release(com.datadog.android.trace.TraceContextInjection traceContextInjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceContextInjection, "");
        this.traceContextInjection = traceContextInjection;
    }

    /* renamed from: getTracedRequestListener$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.NetworkTracedRequestListener getTracedRequestListener() {
        return this.tracedRequestListener;
    }

    public final void setTracedRequestListener$dd_sdk_android_trace_release(com.datadog.android.trace.NetworkTracedRequestListener networkTracedRequestListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTracedRequestListener, "");
        this.tracedRequestListener = networkTracedRequestListener;
    }

    public final com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> getTraceSampler$dd_sdk_android_trace_release() {
        return this.traceSampler;
    }

    public final void setTraceSampler$dd_sdk_android_trace_release(com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> sampler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        this.traceSampler = sampler;
    }

    public final kotlin.jvm.functions.Function0<com.datadog.android.trace.api.tracer.DatadogTracer> getGlobalTracerProvider$dd_sdk_android_trace_release() {
        return this.globalTracerProvider;
    }

    /* renamed from: setGlobalTracerProvider$dd_sdk_android_trace_release, reason: collision with other method in class */
    public final void m10029setGlobalTracerProvider$dd_sdk_android_trace_release(kotlin.jvm.functions.Function0<? extends com.datadog.android.trace.api.tracer.DatadogTracer> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.globalTracerProvider = function0;
    }

    /* renamed from: getNetworkTracingScope$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.ApmNetworkTracingScope getNetworkTracingScope() {
        return this.networkTracingScope;
    }

    public final void setNetworkTracingScope$dd_sdk_android_trace_release(com.datadog.android.trace.ApmNetworkTracingScope apmNetworkTracingScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apmNetworkTracingScope, "");
        this.networkTracingScope = apmNetworkTracingScope;
    }

    /* renamed from: getHeaderPropagationOnly$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getHeaderPropagationOnly() {
        return this.headerPropagationOnly;
    }

    public final void setHeaderPropagationOnly$dd_sdk_android_trace_release(boolean z) {
        this.headerPropagationOnly = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ApmNetworkInstrumentationConfiguration(java.util.List<java.lang.String> list) {
        this(r0);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.List<java.lang.String> list2 = list;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (java.lang.Object obj : list2) {
            linkedHashMap.put(obj, kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.datadog.android.trace.TracingHeaderType[]{com.datadog.android.trace.TracingHeaderType.DATADOG, com.datadog.android.trace.TracingHeaderType.TRACECONTEXT}));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ApmNetworkInstrumentationConfiguration(java.util.Map<java.lang.String, ? extends java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>> map) {
        this(map, null, false, null, null, null, null, null, null, null, false, org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setTraceOrigin(java.lang.String traceOrigin) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceOrigin, "");
        this.traceOrigin = traceOrigin;
        return this;
    }

    public final java.lang.String getTraceOrigin() {
        return this.traceOrigin;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setSdkInstanceName(java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        this.sdkInstanceName = sdkInstanceName;
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setTracedRequestListener(com.datadog.android.trace.NetworkTracedRequestListener tracedRequestListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracedRequestListener, "");
        this.tracedRequestListener = tracedRequestListener;
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setTraceSampleRate(float sampleRate) {
        this.traceSampler = new com.datadog.android.trace.DeterministicTraceSampler(sampleRate);
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setTraceSampler(com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> traceSampler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceSampler, "");
        this.traceSampler = traceSampler;
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setTraceContextInjection(com.datadog.android.trace.TraceContextInjection traceContextInjection) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceContextInjection, "");
        this.traceContextInjection = traceContextInjection;
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration set404ResourcesRedacted(boolean redacted) {
        this.redacted404ResourceName = redacted;
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setTraceScope(com.datadog.android.trace.ApmNetworkTracingScope networkTracingScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTracingScope, "");
        this.networkTracingScope = networkTracingScope;
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setHeaderPropagationOnly() {
        this.headerPropagationOnly = true;
        return this;
    }

    public final boolean isHeaderPropagationOnly() {
        return this.headerPropagationOnly;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration copy() {
        return new com.datadog.android.trace.ApmNetworkInstrumentationConfiguration(com.datadog.android.trace.ApmNetworkInstrumentationConfiguration.Companion.access$deepCopy(INSTANCE, this.tracedHostsWithHeaderType), this.traceOrigin, this.redacted404ResourceName, this.sdkInstanceName, this.localTracerFactory, this.traceContextInjection, this.tracedRequestListener, this.traceSampler, this.globalTracerProvider, this.networkTracingScope, this.headerPropagationOnly);
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setLocalTracerFactory$dd_sdk_android_trace_release(kotlin.jvm.functions.Function2<? super com.datadog.android.api.SdkCore, ? super java.util.Set<? extends com.datadog.android.trace.TracingHeaderType>, ? extends com.datadog.android.trace.api.tracer.DatadogTracer> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.localTracerFactory = factory;
        return this;
    }

    public final com.datadog.android.trace.ApmNetworkInstrumentationConfiguration setGlobalTracerProvider$dd_sdk_android_trace_release(kotlin.jvm.functions.Function0<? extends com.datadog.android.trace.api.tracer.DatadogTracer> globalTracerProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalTracerProvider, "");
        this.globalTracerProvider = globalTracerProvider;
        return this;
    }

    @kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00110\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration$Companion;", "", "<init>", "()V", "Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;", "", "instrumentationName", "Lcom/datadog/android/trace/internal/ApmNetworkInstrumentation;", "createInstrumentation$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/ApmNetworkInstrumentationConfiguration;Ljava/lang/String;)Lcom/datadog/android/trace/internal/ApmNetworkInstrumentation;", "", "ALL_IN_SAMPLE_RATE", "D", "Lkotlin/Function2;", "Lcom/datadog/android/api/SdkCore;", "", "Lcom/datadog/android/trace/TracingHeaderType;", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function2;", "Camera2StreamConfigurationMap", "", "DEFAULT_TRACE_SAMPLE_RATE", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "NETWORK_REQUESTS_TRACKING_FEATURE_NAME", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.datadog.android.trace.internal.ApmNetworkInstrumentation createInstrumentation$dd_sdk_android_trace_release(com.datadog.android.trace.ApmNetworkInstrumentationConfiguration apmNetworkInstrumentationConfiguration, java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apmNetworkInstrumentationConfiguration, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            java.util.Map<java.lang.String, java.util.Set<com.datadog.android.trace.TracingHeaderType>> tracedHostsWithHeaderType$dd_sdk_android_trace_release = apmNetworkInstrumentationConfiguration.getTracedHostsWithHeaderType$dd_sdk_android_trace_release();
            java.util.List<java.lang.String> sanitizeHosts = new com.datadog.android.core.configuration.HostsSanitizer().sanitizeHosts(kotlin.collections.CollectionsKt.toList(tracedHostsWithHeaderType$dd_sdk_android_trace_release.keySet()), "Network Requests");
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.util.Map.Entry<java.lang.String, java.util.Set<com.datadog.android.trace.TracingHeaderType>> entry : tracedHostsWithHeaderType$dd_sdk_android_trace_release.entrySet()) {
                if (sanitizeHosts.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver defaultFirstPartyHostHeaderTypeResolver = new com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver(linkedHashMap);
            com.datadog.android.trace.internal.net.TracerProvider tracerProvider = new com.datadog.android.trace.internal.net.TracerProvider(apmNetworkInstrumentationConfiguration.getLocalTracerFactory$dd_sdk_android_trace_release(), apmNetworkInstrumentationConfiguration.getGlobalTracerProvider$dd_sdk_android_trace_release());
            boolean headerPropagationOnly = apmNetworkInstrumentationConfiguration.getHeaderPropagationOnly();
            java.lang.String traceOrigin$dd_sdk_android_trace_release = apmNetworkInstrumentationConfiguration.getTraceOrigin$dd_sdk_android_trace_release();
            com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> traceSampler$dd_sdk_android_trace_release = apmNetworkInstrumentationConfiguration.getTraceSampler$dd_sdk_android_trace_release();
            return new com.datadog.android.trace.internal.ApmNetworkInstrumentation(!headerPropagationOnly, apmNetworkInstrumentationConfiguration.getSdkInstanceName(), traceOrigin$dd_sdk_android_trace_release, tracerProvider, apmNetworkInstrumentationConfiguration.getRedacted404ResourceName(), traceSampler$dd_sdk_android_trace_release, apmNetworkInstrumentationConfiguration.getTraceContextInjection(), apmNetworkInstrumentationConfiguration.getTracedRequestListener(), defaultFirstPartyHostHeaderTypeResolver, str, apmNetworkInstrumentationConfiguration.getNetworkTracingScope());
        }

        public static final /* synthetic */ java.util.Map access$deepCopy(com.datadog.android.trace.ApmNetworkInstrumentationConfiguration.Companion companion, java.util.Map map) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map.size()));
            for (java.util.Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), kotlin.collections.CollectionsKt.toSet((java.util.Set) entry.getValue()));
            }
            return linkedHashMap;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
