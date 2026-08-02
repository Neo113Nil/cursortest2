package com.datadog.android.api;

@kotlin.Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 %2\u00020\u0001:\u0003%&'J]\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0011Jc\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0018\b\u0002\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\rH&¢\u0006\u0004\b\u0010\u0010\u0014J'\u0010\u0019\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006H&¢\u0006\u0004\b\u0019\u0010\u001aJG\u0010\u001c\u001a\u00020\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u0006\u0010\u0016\u001a\u00020\u00152\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0015H&¢\u0006\u0004\b\u001c\u0010\u001dJ1\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0007H&¢\u0006\u0004\b#\u0010$"}, d2 = {"Lcom/datadog/android/api/InternalLogger;", "", "Lcom/datadog/android/api/InternalLogger$Level;", "level", "Lcom/datadog/android/api/InternalLogger$Target;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lkotlin/Function0;", "", "messageBuilder", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "onlyOnce", "", "additionalProperties", "", "log", "(Lcom/datadog/android/api/InternalLogger$Level;Lcom/datadog/android/api/InternalLogger$Target;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "targets", "(Lcom/datadog/android/api/InternalLogger$Level;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/Throwable;ZLjava/util/Map;)V", "", "samplingRate", "Lcom/datadog/android/internal/telemetry/InternalTelemetryEvent$ApiUsage;", "apiUsageEventBuilder", "logApiUsage", "(FLkotlin/jvm/functions/Function0;)V", "creationSampleRate", "logMetric", "(Lkotlin/jvm/functions/Function0;Ljava/util/Map;FLjava/lang/Float;)V", "callerClass", "Lcom/datadog/android/core/metrics/TelemetryMetricType;", "metric", "operationName", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "startPerformanceMeasure", "(Ljava/lang/String;Lcom/datadog/android/core/metrics/TelemetryMetricType;FLjava/lang/String;)Lcom/datadog/android/core/metrics/PerformanceMetric;", "Companion", "Level", "Target"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface InternalLogger {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.api.InternalLogger.Companion INSTANCE = com.datadog.android.api.InternalLogger.Companion.getHighSpeedVideoFpsRanges;

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Level;", "", "<init>", "(Ljava/lang/String;I)V", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Level {
        VERBOSE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Target;", "", "<init>", "(Ljava/lang/String;I)V", "USER", "MAINTAINER", "TELEMETRY"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum Target {
        USER,
        MAINTAINER,
        TELEMETRY
    }

    void log(com.datadog.android.api.InternalLogger.Level level, com.datadog.android.api.InternalLogger.Target target, kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.lang.Throwable throwable, boolean onlyOnce, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties);

    void log(com.datadog.android.api.InternalLogger.Level level, java.util.List<? extends com.datadog.android.api.InternalLogger.Target> targets, kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.lang.Throwable throwable, boolean onlyOnce, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties);

    void logApiUsage(float samplingRate, kotlin.jvm.functions.Function0<? extends com.datadog.android.internal.telemetry.InternalTelemetryEvent.ApiUsage> apiUsageEventBuilder);

    void logMetric(kotlin.jvm.functions.Function0<java.lang.String> messageBuilder, java.util.Map<java.lang.String, ? extends java.lang.Object> additionalProperties, float samplingRate, java.lang.Float creationSampleRate);

    com.datadog.android.core.metrics.PerformanceMetric startPerformanceMeasure(java.lang.String callerClass, com.datadog.android.core.metrics.TelemetryMetricType metric, float samplingRate, java.lang.String operationName);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void log$default(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.api.InternalLogger.Level level, com.datadog.android.api.InternalLogger.Target target, kotlin.jvm.functions.Function0 function0, java.lang.Throwable th, boolean z, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            internalLogger.log(level, target, (kotlin.jvm.functions.Function0<java.lang.String>) function0, (i & 8) != 0 ? null : th, (i & 16) != 0 ? false : z, (java.util.Map<java.lang.String, ? extends java.lang.Object>) ((i & 32) != 0 ? null : map));
        }

        public static /* synthetic */ void log$default(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.api.InternalLogger.Level level, java.util.List list, kotlin.jvm.functions.Function0 function0, java.lang.Throwable th, boolean z, java.util.Map map, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
            }
            internalLogger.log(level, (java.util.List<? extends com.datadog.android.api.InternalLogger.Target>) list, (kotlin.jvm.functions.Function0<java.lang.String>) function0, (i & 8) != 0 ? null : th, (i & 16) != 0 ? false : z, (java.util.Map<java.lang.String, ? extends java.lang.Object>) ((i & 32) != 0 ? null : map));
        }

        public static /* synthetic */ void logMetric$default(com.datadog.android.api.InternalLogger internalLogger, kotlin.jvm.functions.Function0 function0, java.util.Map map, float f, java.lang.Float f2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logMetric");
            }
            if ((i & 8) != 0) {
                f2 = null;
            }
            internalLogger.logMetric(function0, map, f, f2);
        }

        public static /* synthetic */ void logApiUsage$default(com.datadog.android.api.InternalLogger internalLogger, float f, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logApiUsage");
            }
            if ((i & 1) != 0) {
                f = 15.0f;
            }
            internalLogger.logApiUsage(f, function0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/api/InternalLogger$Companion;", "", "<init>", "()V", "Lcom/datadog/android/api/InternalLogger;", "UNBOUND", "Lcom/datadog/android/api/InternalLogger;", "getUNBOUND", "()Lcom/datadog/android/api/InternalLogger;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.datadog.android.api.InternalLogger.Companion getHighSpeedVideoFpsRanges = new com.datadog.android.api.InternalLogger.Companion();
        private static final com.datadog.android.api.InternalLogger UNBOUND = new com.datadog.android.core.internal.logger.SdkInternalLogger(null, null, null, 6, null);

        private Companion() {
        }

        public final com.datadog.android.api.InternalLogger getUNBOUND() {
            return UNBOUND;
        }
    }
}
