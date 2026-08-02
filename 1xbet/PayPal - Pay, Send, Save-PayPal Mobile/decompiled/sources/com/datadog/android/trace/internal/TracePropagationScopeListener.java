package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/datadog/android/trace/internal/TracePropagationScopeListener;", "Lcom/datadog/android/trace/api/scope/DatadogScopeListener;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "datadogTracer", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/trace/api/tracer/DatadogTracer;)V", "", "afterScopeActivated", "()V", "afterScopeClosed", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "Camera2StreamConfigurationMap"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TracePropagationScopeListener implements com.datadog.android.trace.api.scope.DatadogScopeListener {
    private final com.datadog.android.trace.api.tracer.DatadogTracer getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore Camera2StreamConfigurationMap;

    public TracePropagationScopeListener(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogTracer, "");
        this.Camera2StreamConfigurationMap = featureSdkCore;
        this.getHighSpeedVideoFpsRanges = datadogTracer;
    }

    @Override // com.datadog.android.trace.api.scope.DatadogScopeListener
    public final void afterScopeActivated() {
        com.datadog.android.trace.api.span.DatadogSpan activeSpan = this.getHighSpeedVideoFpsRanges.activeSpan();
        com.datadog.android.trace.api.span.DatadogSpanContext context = activeSpan != null ? activeSpan.context() : null;
        if (context != null) {
            com.datadog.android.trace.internal.FeatureSdkCoreExtKt.addActiveTraceToContext(this.Camera2StreamConfigurationMap, context.getTraceId().toHexString(), java.lang.String.valueOf(context.getSpanId()));
        }
    }

    @Override // com.datadog.android.trace.api.scope.DatadogScopeListener
    public final void afterScopeClosed() {
        com.datadog.android.trace.internal.FeatureSdkCoreExtKt.removeActiveTraceFromContext(this.Camera2StreamConfigurationMap);
    }
}
