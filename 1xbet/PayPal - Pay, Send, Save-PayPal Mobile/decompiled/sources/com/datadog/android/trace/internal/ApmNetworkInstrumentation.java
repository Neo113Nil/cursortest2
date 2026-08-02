package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 _2\u00020\u0001:\u0001_Bm\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u001d\u0010%\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0015\u0010)\u001a\u00020 2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020 2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020 *\u00020\u001a2\b\u0010/\u001a\u0004\u0018\u00010#2\b\u00100\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b1\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u00105R\u001a\u0010\u000e\u001a\u00020\r8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b:\u0010;R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8G¢\u0006\u0006\u001a\u0004\b>\u0010?R\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010\t\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\bF\u00105R\u0014\u0010I\u001a\u00020G8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010HR\u0013\u0010M\u001a\u0004\u0018\u00010J8G¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010O\u001a\u00020N8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010E\u001a\u0004\bS\u0010TR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010E\u001a\u0004\bU\u0010TR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\f\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\u0010\u001a\u00020\u000f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\bZ\u0010[R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\\\u001a\u0004\b]\u0010^"}, d2 = {"Lcom/datadog/android/trace/internal/ApmNetworkInstrumentation;", "", "", "canSendSpan", "", "sdkInstanceName", "traceOrigin", "Lcom/datadog/android/trace/internal/net/TracerProvider;", "tracerProvider", "redacted404ResourceName", "Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "traceSampler", "Lcom/datadog/android/trace/TraceContextInjection;", "injectionType", "Lcom/datadog/android/trace/NetworkTracedRequestListener;", "tracedRequestListener", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "localFirstPartyHostHeaderTypeResolver", "networkingLibraryName", "Lcom/datadog/android/trace/ApmNetworkTracingScope;", "networkTracingScope", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Lcom/datadog/android/trace/internal/net/TracerProvider;ZLcom/datadog/android/core/sampling/Sampler;Lcom/datadog/android/trace/TraceContextInjection;Lcom/datadog/android/trace/NetworkTracedRequestListener;Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;Ljava/lang/String;Lcom/datadog/android/trace/ApmNetworkTracingScope;)V", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "request", "Lcom/datadog/android/trace/internal/net/RequestTracingState;", "onRequest", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;)Lcom/datadog/android/trace/internal/net/RequestTracingState;", "requestTracingState", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onResponseFailed", "(Lcom/datadog/android/trace/internal/net/RequestTracingState;Ljava/lang/Throwable;)V", "Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;", "response", "onResponseSucceeded", "(Lcom/datadog/android/trace/internal/net/RequestTracingState;Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;)V", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;", "requestBuilder", "removeTracingHeaders", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfoBuilder;)V", "Lkotlin/Function0;", "messageBuilder", "reportInstrumentationError", "(Lkotlin/jvm/functions/Function0;)V", "p0", "p1", "getHighSpeedVideoFpsRangesFor", "(Lcom/datadog/android/trace/internal/net/RequestTracingState;Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;Ljava/lang/Throwable;)V", "Z", "getCanSendSpan$dd_sdk_android_trace_release", "()Z", "Lcom/datadog/android/trace/TraceContextInjection;", "getInjectionType$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/TraceContextInjection;", "Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "getLocalFirstPartyHostHeaderTypeResolver$dd_sdk_android_trace_release", "()Lcom/datadog/android/core/internal/net/DefaultFirstPartyHostHeaderTypeResolver;", "", "Lcom/datadog/android/trace/TracingHeaderType;", "getLocalHeaderTypes", "()Ljava/util/Set;", "localHeaderTypes", "Lcom/datadog/android/trace/ApmNetworkTracingScope;", "getNetworkTracingScope", "()Lcom/datadog/android/trace/ApmNetworkTracingScope;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "getRedacted404ResourceName$dd_sdk_android_trace_release", "Lcom/datadog/android/trace/internal/RumContextPropagator;", "Lcom/datadog/android/trace/internal/RumContextPropagator;", "Camera2StreamConfigurationMap", "", "getSampleRate", "()Ljava/lang/Float;", "sampleRate", "Lcom/datadog/android/core/SdkReference;", "sdkCoreReference", "Lcom/datadog/android/core/SdkReference;", "getSdkCoreReference", "()Lcom/datadog/android/core/SdkReference;", "getSdkInstanceName$dd_sdk_android_trace_release", "()Ljava/lang/String;", "getTraceOrigin", "Lcom/datadog/android/core/sampling/Sampler;", "getTraceSampler$dd_sdk_android_trace_release", "()Lcom/datadog/android/core/sampling/Sampler;", "Lcom/datadog/android/trace/NetworkTracedRequestListener;", "getTracedRequestListener$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/NetworkTracedRequestListener;", "Lcom/datadog/android/trace/internal/net/TracerProvider;", "getTracerProvider$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/internal/net/TracerProvider;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ApmNetworkInstrumentation {
    public static final java.lang.String AGENT_PSR_ATTRIBUTE = "_dd.agent_psr";
    public static final double ALL_IN_SAMPLE_RATE = 100.0d;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.trace.internal.ApmNetworkInstrumentation.Companion INSTANCE = new com.datadog.android.trace.internal.ApmNetworkInstrumentation.Companion(null);
    public static final java.lang.String ERROR_REQUEST_INFO_IS_NOT_MUTABLE = "HttpRequestInfo is not mutable. Your requests won't be traced.";
    public static final java.lang.String ERROR_STACK_OVERFLOW = "StackOverflowError detected in TracedRequestListener. This is likely caused by retrying the same request within the onRequestIntercepted callback, leading to infinite recursion.";
    public static final java.lang.String RESOURCE_NAME_404 = "404";
    public static final java.lang.String SPAN_NAME = "%s.request";
    public static final char URL_QUERY_PARAMS_BLOCK_SEPARATOR = '?';
    public static final java.lang.String WARNING_TRACING_NO_HOSTS = "You added a ApmNetworkInstrumentation to your %s instrumentation, but you did not specify any first party hosts. Your requests won't be traced.\nTo set a list of known hosts, you can use the Configuration.Builder.setFirstPartyHosts() method.";
    public static final float ZERO_SAMPLE_RATE = 0.0f;
    private final boolean canSendSpan;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.trace.internal.RumContextPropagator Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoSizes;
    private final com.datadog.android.trace.TraceContextInjection injectionType;
    private final com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver localFirstPartyHostHeaderTypeResolver;
    private final com.datadog.android.trace.ApmNetworkTracingScope networkTracingScope;
    private final boolean redacted404ResourceName;
    private final com.datadog.android.core.SdkReference sdkCoreReference;
    private final java.lang.String sdkInstanceName;
    private final java.lang.String traceOrigin;
    private final com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> traceSampler;
    private final com.datadog.android.trace.NetworkTracedRequestListener tracedRequestListener;
    private final com.datadog.android.trace.internal.net.TracerProvider tracerProvider;

    public ApmNetworkInstrumentation(boolean z, java.lang.String str, java.lang.String str2, com.datadog.android.trace.internal.net.TracerProvider tracerProvider, boolean z2, com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> sampler, com.datadog.android.trace.TraceContextInjection traceContextInjection, com.datadog.android.trace.NetworkTracedRequestListener networkTracedRequestListener, com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver defaultFirstPartyHostHeaderTypeResolver, java.lang.String str3, com.datadog.android.trace.ApmNetworkTracingScope apmNetworkTracingScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracerProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sampler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(traceContextInjection, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTracedRequestListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultFirstPartyHostHeaderTypeResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apmNetworkTracingScope, "");
        this.canSendSpan = z;
        this.sdkInstanceName = str;
        this.traceOrigin = str2;
        this.tracerProvider = tracerProvider;
        this.redacted404ResourceName = z2;
        this.traceSampler = sampler;
        this.injectionType = traceContextInjection;
        this.tracedRequestListener = networkTracedRequestListener;
        this.localFirstPartyHostHeaderTypeResolver = defaultFirstPartyHostHeaderTypeResolver;
        this.getHighSpeedVideoSizes = str3;
        this.networkTracingScope = apmNetworkTracingScope;
        this.Camera2StreamConfigurationMap = new com.datadog.android.trace.internal.RumContextPropagator(new kotlin.jvm.functions.Function0<com.datadog.android.api.feature.FeatureSdkCore>() { // from class: com.datadog.android.trace.internal.ApmNetworkInstrumentation$rumContextPropagator$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.api.feature.FeatureSdkCore invoke() {
                return com.datadog.android.trace.internal.ApmNetworkInstrumentation.access$getInternalSdkCore(com.datadog.android.trace.internal.ApmNetworkInstrumentation.this);
            }

            {
                super(0);
            }
        });
        this.sdkCoreReference = new com.datadog.android.core.SdkReference(str, new kotlin.jvm.functions.Function1<com.datadog.android.api.SdkCore, kotlin.Unit>() { // from class: com.datadog.android.trace.internal.ApmNetworkInstrumentation$sdkCoreReference$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.datadog.android.api.SdkCore sdkCore) {
                getHighSpeedVideoSizes(sdkCore);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(com.datadog.android.api.SdkCore sdkCore) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkCore, "");
                com.datadog.android.core.InternalSdkCore internalSdkCore = (com.datadog.android.core.InternalSdkCore) sdkCore;
                if (com.datadog.android.trace.internal.ApmNetworkInstrumentation.this.getLocalFirstPartyHostHeaderTypeResolver().isEmpty() && internalSdkCore.getFirstPartyHostResolver().isEmpty()) {
                    com.datadog.android.api.InternalLogger internalLogger = internalSdkCore.getInternalLogger();
                    com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
                    final com.datadog.android.trace.internal.ApmNetworkInstrumentation apmNetworkInstrumentation = com.datadog.android.trace.internal.ApmNetworkInstrumentation.this;
                    com.datadog.android.api.InternalLoggerKt.logToUser(internalLogger, level, true, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.ApmNetworkInstrumentation$sdkCoreReference$1.1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            java.lang.String str4;
                            java.util.Locale locale = java.util.Locale.US;
                            str4 = com.datadog.android.trace.internal.ApmNetworkInstrumentation.this.getHighSpeedVideoSizes;
                            java.lang.String format = java.lang.String.format(locale, com.datadog.android.trace.internal.ApmNetworkInstrumentation.WARNING_TRACING_NO_HOSTS, java.util.Arrays.copyOf(new java.lang.Object[]{str4}, 1));
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
                            return format;
                        }

                        {
                            super(0);
                        }
                    });
                }
            }

            {
                super(1);
            }
        });
    }

    /* renamed from: getCanSendSpan$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getCanSendSpan() {
        return this.canSendSpan;
    }

    /* renamed from: getSdkInstanceName$dd_sdk_android_trace_release, reason: from getter */
    public final java.lang.String getSdkInstanceName() {
        return this.sdkInstanceName;
    }

    public final java.lang.String getTraceOrigin() {
        return this.traceOrigin;
    }

    /* renamed from: getTracerProvider$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.internal.net.TracerProvider getTracerProvider() {
        return this.tracerProvider;
    }

    /* renamed from: getRedacted404ResourceName$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getRedacted404ResourceName() {
        return this.redacted404ResourceName;
    }

    public final com.datadog.android.core.sampling.Sampler<com.datadog.android.trace.api.span.DatadogSpan> getTraceSampler$dd_sdk_android_trace_release() {
        return this.traceSampler;
    }

    /* renamed from: getInjectionType$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.TraceContextInjection getInjectionType() {
        return this.injectionType;
    }

    /* renamed from: getTracedRequestListener$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.NetworkTracedRequestListener getTracedRequestListener() {
        return this.tracedRequestListener;
    }

    /* renamed from: getLocalFirstPartyHostHeaderTypeResolver$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver getLocalFirstPartyHostHeaderTypeResolver() {
        return this.localFirstPartyHostHeaderTypeResolver;
    }

    public /* synthetic */ ApmNetworkInstrumentation(boolean z, java.lang.String str, java.lang.String str2, com.datadog.android.trace.internal.net.TracerProvider tracerProvider, boolean z2, com.datadog.android.core.sampling.Sampler sampler, com.datadog.android.trace.TraceContextInjection traceContextInjection, com.datadog.android.trace.NetworkTracedRequestListener networkTracedRequestListener, com.datadog.android.core.internal.net.DefaultFirstPartyHostHeaderTypeResolver defaultFirstPartyHostHeaderTypeResolver, java.lang.String str3, com.datadog.android.trace.ApmNetworkTracingScope apmNetworkTracingScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, str2, tracerProvider, z2, sampler, traceContextInjection, networkTracedRequestListener, defaultFirstPartyHostHeaderTypeResolver, str3, (i & 1024) != 0 ? com.datadog.android.trace.ApmNetworkTracingScope.ALL : apmNetworkTracingScope);
    }

    public final com.datadog.android.trace.ApmNetworkTracingScope getNetworkTracingScope() {
        return this.networkTracingScope;
    }

    public final com.datadog.android.core.SdkReference getSdkCoreReference() {
        return this.sdkCoreReference;
    }

    public final java.lang.Float getSampleRate() {
        return this.traceSampler.getSampleRate();
    }

    public final java.util.Set<com.datadog.android.trace.TracingHeaderType> getLocalHeaderTypes() {
        return this.localFirstPartyHostHeaderTypeResolver.getAllHeaderTypes();
    }

    public final com.datadog.android.trace.internal.net.RequestTracingState onRequest(com.datadog.android.api.instrumentation.network.HttpRequestInfo request) {
        com.datadog.android.api.InternalLogger unbound;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        final java.lang.String url = request.getUrl();
        com.datadog.android.api.SdkCore sdkCore = this.sdkCoreReference.get();
        if ((sdkCore instanceof com.datadog.android.core.InternalSdkCore ? (com.datadog.android.core.InternalSdkCore) sdkCore : null) == null) {
            com.datadog.android.api.InternalLoggerKt.logToUser$default(com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND(), com.datadog.android.api.InternalLogger.Level.INFO, false, new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.ApmNetworkInstrumentation$getSdkCoreOrNull$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String concat;
                    java.lang.String str;
                    com.datadog.android.trace.internal.ApmNetworkInstrumentation apmNetworkInstrumentation = com.datadog.android.trace.internal.ApmNetworkInstrumentation.this;
                    java.lang.String str2 = url;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    if (apmNetworkInstrumentation.getSdkInstanceName() == null) {
                        concat = "Default SDK instance";
                    } else {
                        concat = "SDK instance with name=".concat(java.lang.String.valueOf(apmNetworkInstrumentation.getSdkInstanceName()));
                    }
                    sb.append(concat);
                    sb.append(" for ");
                    str = apmNetworkInstrumentation.getHighSpeedVideoSizes;
                    sb.append(str);
                    sb.append(" instrumentation is not found");
                    if (str2 != null) {
                        sb.append(", skipping tracking of request with url=");
                        sb.append(str2);
                    }
                    java.lang.String obj = sb.toString();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                    return obj;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, 2, null);
        }
        com.datadog.android.api.SdkCore sdkCore2 = this.sdkCoreReference.get();
        com.datadog.android.core.InternalSdkCore internalSdkCore = sdkCore2 instanceof com.datadog.android.core.InternalSdkCore ? (com.datadog.android.core.InternalSdkCore) sdkCore2 : null;
        com.datadog.android.trace.internal.ApmNetworkInstrumentation.Companion companion = INSTANCE;
        if (internalSdkCore == null || (unbound = internalSdkCore.getInternalLogger()) == null) {
            unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        }
        com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder access$newBuilder = com.datadog.android.trace.internal.ApmNetworkInstrumentation.Companion.access$newBuilder(companion, request, unbound);
        if (access$newBuilder == null) {
            return null;
        }
        if (internalSdkCore == null) {
            return new com.datadog.android.trace.internal.net.RequestTracingState(access$newBuilder, false, null, null, 14, null);
        }
        com.datadog.android.trace.api.tracer.DatadogTracer provideTracer = this.tracerProvider.provideTracer(internalSdkCore, getLocalHeaderTypes(), this.getHighSpeedVideoSizes);
        if (provideTracer == null || (!internalSdkCore.getFirstPartyHostResolver().isFirstPartyUrl(request.getUrl()) && !this.localFirstPartyHostHeaderTypeResolver.isFirstPartyUrl(request.getUrl()))) {
            return new com.datadog.android.trace.internal.net.RequestTracingState(access$newBuilder, false, null, null, 14, null);
        }
        com.datadog.android.trace.api.span.DatadogSpan buildSpan = com.datadog.android.trace.internal.net.ApmNetworkInstrumentationExtKt.buildSpan(provideTracer, request, this.getHighSpeedVideoSizes, this.traceOrigin);
        boolean sample = com.datadog.android.trace.internal.net.ApmNetworkInstrumentationExtKt.sample(com.datadog.android.trace.internal.RumContextPropagator.INSTANCE.extractRumContext(buildSpan, this.Camera2StreamConfigurationMap, true), request, this.traceSampler);
        if (buildSpan.getIsRootSpan()) {
            com.datadog.android.trace.internal.net.ApmNetworkInstrumentationExtKt.applyPriority(buildSpan, sample, this.traceSampler);
        }
        try {
            java.lang.String url2 = request.getUrl();
            java.util.Set<com.datadog.android.trace.TracingHeaderType> headerTypesForUrl = this.localFirstPartyHostHeaderTypeResolver.headerTypesForUrl(url2);
            if (headerTypesForUrl.isEmpty()) {
                headerTypesForUrl = internalSdkCore.getFirstPartyHostResolver().headerTypesForUrl(url2);
            }
            java.util.Set<com.datadog.android.trace.TracingHeaderType> set = headerTypesForUrl;
            if (sample) {
                com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.getPropagationHelper().propagateSampledHeaders(access$newBuilder, provideTracer, buildSpan, set);
            } else {
                com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.getPropagationHelper().propagateNotSampledHeaders(access$newBuilder, provideTracer, buildSpan, set, this.injectionType, this.traceOrigin);
            }
        } catch (java.lang.IllegalStateException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalSdkCore.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.ApmNetworkInstrumentation$onRequest$tracedRequestInfoBuilder$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    java.lang.String str;
                    str = com.datadog.android.trace.internal.ApmNetworkInstrumentation.this.getHighSpeedVideoSizes;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to update intercepted ");
                    sb.append(str);
                    sb.append(" request");
                    return sb.toString();
                }

                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
        return new com.datadog.android.trace.internal.net.RequestTracingState(access$newBuilder, sample, buildSpan, this.traceSampler.getSampleRate());
    }

    public final void onResponseSucceeded(com.datadog.android.trace.internal.net.RequestTracingState requestTracingState, com.datadog.android.api.instrumentation.network.HttpResponseInfo response) {
        com.datadog.android.trace.api.span.DatadogSpan span;
        com.datadog.android.trace.api.span.DatadogSpan span2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTracingState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
        if (requestTracingState.isSampled()) {
            com.datadog.android.trace.api.span.DatadogSpan span3 = requestTracingState.getSpan();
            if (span3 != null) {
                span3.setTag("http.status_code", (java.lang.Number) java.lang.Integer.valueOf(response.getStatusCode()));
            }
            int statusCode = response.getStatusCode();
            if (400 <= statusCode && statusCode < 500 && (span2 = requestTracingState.getSpan()) != null) {
                span2.setError(java.lang.Boolean.TRUE);
            }
            if (response.getStatusCode() == 404 && this.redacted404ResourceName && (span = requestTracingState.getSpan()) != null) {
                span.setResourceName("404");
            }
        }
        getHighSpeedVideoFpsRangesFor(requestTracingState, response, null);
        com.datadog.android.trace.api.span.DatadogSpan span4 = requestTracingState.getSpan();
        if (span4 != null) {
            com.datadog.android.trace.internal.net.ApmNetworkInstrumentationExtKt.finishRumAware(span4, requestTracingState.isSampled(), this.canSendSpan);
        }
    }

    public final void onResponseFailed(com.datadog.android.trace.internal.net.RequestTracingState requestTracingState, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestTracingState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        if (requestTracingState.isSampled()) {
            com.datadog.android.trace.api.span.DatadogSpan span = requestTracingState.getSpan();
            if (span != null) {
                span.setError(java.lang.Boolean.TRUE);
            }
            com.datadog.android.trace.api.span.DatadogSpan span2 = requestTracingState.getSpan();
            if (span2 != null) {
                span2.setTag(com.datadog.android.trace.api.DatadogTracingConstants.Tags.KEY_ERROR_MSG, throwable.getMessage());
            }
            com.datadog.android.trace.api.span.DatadogSpan span3 = requestTracingState.getSpan();
            if (span3 != null) {
                span3.setTag("error.type", throwable.getClass().getName());
            }
            com.datadog.android.trace.api.span.DatadogSpan span4 = requestTracingState.getSpan();
            if (span4 != null) {
                span4.setTag("error.stack", com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(throwable));
            }
        }
        getHighSpeedVideoFpsRangesFor(requestTracingState, null, throwable);
        com.datadog.android.trace.api.span.DatadogSpan span5 = requestTracingState.getSpan();
        if (span5 != null) {
            com.datadog.android.trace.internal.net.ApmNetworkInstrumentationExtKt.finishRumAware(span5, requestTracingState.isSampled(), this.canSendSpan);
        }
    }

    public final void removeTracingHeaders(com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder requestBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestBuilder, "");
        com.datadog.android.trace.internal.DatadogTracingToolkit.INSTANCE.getPropagationHelper().removeAllTracingHeaders(requestBuilder);
    }

    private final void getHighSpeedVideoFpsRangesFor(com.datadog.android.trace.internal.net.RequestTracingState requestTracingState, com.datadog.android.api.instrumentation.network.HttpResponseInfo httpResponseInfo, java.lang.Throwable th) {
        com.datadog.android.api.InternalLogger internalLogger;
        if (requestTracingState.getSpan() == null) {
            return;
        }
        final com.datadog.android.api.instrumentation.network.HttpRequestInfo build = requestTracingState.getTracedRequestInfoBuilder().build();
        try {
            this.tracedRequestListener.onRequestIntercepted(build, requestTracingState.getSpan(), httpResponseInfo, th);
        } catch (java.lang.StackOverflowError e) {
            com.datadog.android.api.SdkCore sdkCore = this.sdkCoreReference.get();
            com.datadog.android.core.InternalSdkCore internalSdkCore = sdkCore instanceof com.datadog.android.core.InternalSdkCore ? (com.datadog.android.core.InternalSdkCore) sdkCore : null;
            if (internalSdkCore != null && (internalLogger = internalSdkCore.getInternalLogger()) != null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.ApmNetworkInstrumentation$onRequestIntercepted$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        java.lang.String method = com.datadog.android.api.instrumentation.network.HttpRequestInfo.this.getMethod();
                        java.lang.String url = com.datadog.android.api.instrumentation.network.HttpRequestInfo.this.getUrl();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("StackOverflowError detected in TracedRequestListener. This is likely caused by retrying the same request within the onRequestIntercepted callback, leading to infinite recursion.\nRequest: ");
                        sb.append(method);
                        sb.append(io.ktor.sse.ServerSentEventKt.COLON);
                        sb.append(url);
                        return sb.toString();
                    }

                    {
                        super(0);
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
            throw e;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/trace/internal/ApmNetworkInstrumentation$Companion;", "", "<init>", "()V", "", "AGENT_PSR_ATTRIBUTE", "Ljava/lang/String;", "", "ALL_IN_SAMPLE_RATE", "D", "ERROR_REQUEST_INFO_IS_NOT_MUTABLE", "ERROR_STACK_OVERFLOW", "RESOURCE_NAME_404", "SPAN_NAME", "", "URL_QUERY_PARAMS_BLOCK_SEPARATOR", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "WARNING_TRACING_NO_HOSTS", "", "ZERO_SAMPLE_RATE", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static final /* synthetic */ com.datadog.android.api.instrumentation.network.HttpRequestInfoBuilder access$newBuilder(com.datadog.android.trace.internal.ApmNetworkInstrumentation.Companion companion, com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, com.datadog.android.api.InternalLogger internalLogger) {
            if (httpRequestInfo instanceof com.datadog.android.api.instrumentation.network.MutableHttpRequestInfo) {
                return ((com.datadog.android.api.instrumentation.network.MutableHttpRequestInfo) httpRequestInfo).newBuilder();
            }
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.ApmNetworkInstrumentation$Companion$newBuilder$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.trace.internal.ApmNetworkInstrumentation.ERROR_REQUEST_INFO_IS_NOT_MUTABLE;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return null;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ com.datadog.android.core.InternalSdkCore access$getInternalSdkCore(com.datadog.android.trace.internal.ApmNetworkInstrumentation apmNetworkInstrumentation) {
        com.datadog.android.api.SdkCore sdkCore = apmNetworkInstrumentation.sdkCoreReference.get();
        if (sdkCore instanceof com.datadog.android.core.InternalSdkCore) {
            return (com.datadog.android.core.InternalSdkCore) sdkCore;
        }
        return null;
    }

    public final void reportInstrumentationError(kotlin.jvm.functions.Function0<java.lang.String> messageBuilder) {
        com.datadog.android.api.InternalLogger internalLogger;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBuilder, "");
        com.datadog.android.api.SdkCore sdkCore = this.sdkCoreReference.get();
        com.datadog.android.core.InternalSdkCore internalSdkCore = sdkCore instanceof com.datadog.android.core.InternalSdkCore ? (com.datadog.android.core.InternalSdkCore) sdkCore : null;
        if (internalSdkCore == null || (internalLogger = internalSdkCore.getInternalLogger()) == null) {
            return;
        }
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) messageBuilder, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
    }
}
