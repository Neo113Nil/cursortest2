package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0007\u001a\u00020\u00068\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u00101R\u0014\u00103\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u00108"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogTracerAdapter;", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$TracerAPI;", "delegate", "", "bundleWithRumEnabled", "Lcom/datadog/android/trace/internal/DatadogSpanLogger;", "spanLogger", "Lcom/datadog/android/trace/internal/RumContextPropagator;", "rumContextPropagator", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$TracerAPI;ZLcom/datadog/android/trace/internal/DatadogSpanLogger;Lcom/datadog/android/trace/internal/RumContextPropagator;)V", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "Lcom/datadog/android/trace/api/scope/DatadogScope;", "activateSpan", "(Lcom/datadog/android/trace/api/span/DatadogSpan;)Lcom/datadog/android/trace/api/scope/DatadogScope;", "asyncPropagating", "activateSpan$dd_sdk_android_trace_release", "(Lcom/datadog/android/trace/api/span/DatadogSpan;Z)Lcom/datadog/android/trace/api/scope/DatadogScope;", "activeSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/android/trace/api/scope/DatadogScopeListener;", "scopeListener", "", "addScopeListener", "(Lcom/datadog/android/trace/api/scope/DatadogScopeListener;)V", "", "spanName", "Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "buildSpan", "(Ljava/lang/CharSequence;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "instrumentationName", "(Ljava/lang/String;Ljava/lang/CharSequence;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/android/trace/api/propagation/DatadogPropagation;", "propagate", "()Lcom/datadog/android/trace/api/propagation/DatadogPropagation;", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$SpanBuilder;", "p0", "getHighSpeedVideoFpsRangesFor", "(Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$SpanBuilder;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Z", "getBundleWithRumEnabled$dd_sdk_android_trace_release", "()Z", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$TracerAPI;", "getDelegate$dd_sdk_android_trace_release", "()Lcom/datadog/trace/bootstrap/instrumentation/api/AgentTracer$TracerAPI;", "Lcom/datadog/android/trace/internal/RumContextPropagator;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getSdkCore$dd_sdk_android_trace_release", "()Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoSizes", "Lcom/datadog/android/trace/internal/DatadogSpanLogger;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogTracerAdapter implements com.datadog.android.trace.api.tracer.DatadogTracer {
    private final boolean bundleWithRumEnabled;
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI delegate;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.trace.internal.RumContextPropagator getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.trace.internal.DatadogSpanLogger getHighSpeedVideoFpsRanges;
    private final com.datadog.android.api.feature.FeatureSdkCore sdkCore;

    public DatadogTracerAdapter(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI tracerAPI, boolean z, com.datadog.android.trace.internal.DatadogSpanLogger datadogSpanLogger, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tracerAPI, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogSpanLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumContextPropagator, "");
        this.sdkCore = featureSdkCore;
        this.delegate = tracerAPI;
        this.bundleWithRumEnabled = z;
        this.getHighSpeedVideoFpsRanges = datadogSpanLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = rumContextPropagator;
    }

    /* renamed from: getSdkCore$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.api.feature.FeatureSdkCore getSdkCore() {
        return this.sdkCore;
    }

    /* renamed from: getDelegate$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI getDelegate() {
        return this.delegate;
    }

    /* renamed from: getBundleWithRumEnabled$dd_sdk_android_trace_release, reason: from getter */
    public final boolean getBundleWithRumEnabled() {
        return this.bundleWithRumEnabled;
    }

    public /* synthetic */ DatadogTracerAdapter(final com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.TracerAPI tracerAPI, boolean z, com.datadog.android.trace.internal.DatadogSpanLogger datadogSpanLogger, com.datadog.android.trace.internal.RumContextPropagator rumContextPropagator, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, tracerAPI, z, datadogSpanLogger, (i & 16) != 0 ? new com.datadog.android.trace.internal.RumContextPropagator(new kotlin.jvm.functions.Function0<com.datadog.android.api.feature.FeatureSdkCore>() { // from class: com.datadog.android.trace.internal.DatadogTracerAdapter.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.datadog.android.api.feature.FeatureSdkCore invoke() {
                return com.datadog.android.api.feature.FeatureSdkCore.this;
            }

            {
                super(0);
            }
        }) : rumContextPropagator);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder buildSpan(java.lang.String instrumentationName, java.lang.CharSequence spanName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanName, "");
        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder buildSpan = this.delegate.buildSpan(instrumentationName, spanName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildSpan, "");
        return getHighSpeedVideoFpsRangesFor(buildSpan);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder buildSpan(java.lang.CharSequence spanName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanName, "");
        com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder buildSpan = this.delegate.buildSpan(spanName);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buildSpan, "");
        return getHighSpeedVideoFpsRangesFor(buildSpan);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final void addScopeListener(com.datadog.android.trace.api.scope.DatadogScopeListener scopeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeListener, "");
        this.delegate.addScopeListener(new com.datadog.android.trace.internal.DatadogScopeListenerAdapter(scopeListener));
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.propagation.DatadogPropagation propagate() {
        com.datadog.android.api.InternalLogger internalLogger = this.sdkCore.getInternalLogger();
        com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation propagate = this.delegate.propagate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(propagate, "");
        return new com.datadog.android.trace.internal.DatadogPropagationAdapter(internalLogger, propagate);
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.span.DatadogSpan activeSpan() {
        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan activeSpan = this.delegate.activeSpan();
        return activeSpan != null ? new com.datadog.android.trace.internal.DatadogSpanAdapter(activeSpan, this.getHighSpeedVideoFpsRanges) : null;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.scope.DatadogScope activateSpan(com.datadog.android.trace.api.span.DatadogSpan span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        com.datadog.android.trace.internal.DatadogScopeAdapter datadogScopeAdapter = null;
        if ((span instanceof com.datadog.android.trace.internal.DatadogSpanAdapter ? (com.datadog.android.trace.internal.DatadogSpanAdapter) span : null) != null) {
            com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateSpan = this.delegate.activateSpan(((com.datadog.android.trace.internal.DatadogSpanAdapter) span).getDelegate(), com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.INSTRUMENTATION);
            if (activateSpan == null) {
                return null;
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(activateSpan, "");
            datadogScopeAdapter = new com.datadog.android.trace.internal.DatadogScopeAdapter(activateSpan);
        }
        return datadogScopeAdapter;
    }

    public final com.datadog.android.trace.api.scope.DatadogScope activateSpan$dd_sdk_android_trace_release(com.datadog.android.trace.api.span.DatadogSpan span, boolean asyncPropagating) {
        com.datadog.trace.bootstrap.instrumentation.api.AgentScope activateSpan;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        com.datadog.android.trace.internal.DatadogScopeAdapter datadogScopeAdapter = null;
        com.datadog.android.trace.internal.DatadogSpanAdapter datadogSpanAdapter = span instanceof com.datadog.android.trace.internal.DatadogSpanAdapter ? (com.datadog.android.trace.internal.DatadogSpanAdapter) span : null;
        if (datadogSpanAdapter != null && (activateSpan = this.delegate.activateSpan(datadogSpanAdapter.getDelegate(), com.datadog.trace.bootstrap.instrumentation.api.ScopeSource.INSTRUMENTATION, asyncPropagating)) != null) {
            datadogScopeAdapter = new com.datadog.android.trace.internal.DatadogScopeAdapter(activateSpan);
        }
        return datadogScopeAdapter;
    }

    private final com.datadog.android.trace.api.span.DatadogSpanBuilder getHighSpeedVideoFpsRangesFor(com.datadog.trace.bootstrap.instrumentation.api.AgentTracer.SpanBuilder p0) {
        com.datadog.android.trace.internal.DatadogSpanBuilderAdapter datadogSpanBuilderAdapter = new com.datadog.android.trace.internal.DatadogSpanBuilderAdapter(p0, this.getHighSpeedVideoFpsRanges);
        if (this.bundleWithRumEnabled) {
            com.datadog.android.trace.internal.RumContextPropagator.INSTANCE.injectRumContext$dd_sdk_android_trace_release(datadogSpanBuilderAdapter, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return datadogSpanBuilderAdapter;
    }
}
