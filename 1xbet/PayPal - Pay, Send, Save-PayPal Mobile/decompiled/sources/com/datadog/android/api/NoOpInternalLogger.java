package com.datadog.android.api;

@kotlin.Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J]\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0017J%\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJE\u0010\u001f\u001a\u00020\u00122\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J1\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010!\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\tH\u0016¢\u0006\u0004\b&\u0010'"}, d2 = {"Lcom/datadog/android/api/NoOpInternalLogger;", "Lcom/datadog/android/api/InternalLogger;", "<init>", "()V", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "Lcom/datadog/android/api/InternalLogger$Target;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lkotlin/Function0;", "", "messageBuilder", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onlyOnce", "", "", "additionalProperties", "", "log", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "targets", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "samplingRate", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "apiUsageEventBuilder", "logApiUsage", "(FLkotlin/jvm/functions/Function0;)V", "creationSampleRate", "logMetric", "(Lkotlin/jvm/functions/Function0;Ljava/util/Map;FLjava/lang/Float;)V", "callerClass", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "metric", "operationName", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "startPerformanceMeasure", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)Lcom/datadog/android/core/metrics/PerformanceMetric;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpInternalLogger implements com.datadog.android.api.InternalLogger {
    @Override // com.datadog.android.api.InternalLogger
    public final com.datadog.android.core.metrics.PerformanceMetric startPerformanceMeasure(java.lang.String callerClass, com.datadog.android.core.metrics.TelemetryMetricType metric, float samplingRate, java.lang.String operationName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callerClass, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metric, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationName, "");
        return null;
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void logMetric(kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties, float samplingRate, java.lang.Float creationSampleRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBuilder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalProperties, "");
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void logApiUsage(float samplingRate, kotlin.jvm.functions.Function0<? extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage> apiUsageEventBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(apiUsageEventBuilder, "");
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void log(com.datadog.android.api.InternalLogger.Level level, java.util.List<? extends com.datadog.android.api.InternalLogger.Target> targets, kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.lang.Throwable throwable, boolean onlyOnce, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targets, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBuilder, "");
    }

    @Override // com.datadog.android.api.InternalLogger
    public final void log(com.datadog.android.api.InternalLogger.Level level, com.datadog.android.api.InternalLogger.Target target, kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.lang.Throwable throwable, boolean onlyOnce, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(level, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(target, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageBuilder, "");
    }
}
