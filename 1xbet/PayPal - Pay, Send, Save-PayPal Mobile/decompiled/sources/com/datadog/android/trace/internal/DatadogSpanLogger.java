package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\f\u001a\u00020\u000b2\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u0007\u0012\u0002\b\u00030\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0014J)\u0010\u0010\u001a\u00020\u000b2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00152\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\rJ\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u0011J+\u0010\u0018\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\rR\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0019"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogSpanLogger;", "", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;)V", "", "", "p0", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "p1", "", "getHighSpeedVideoFpsRangesFor", "(Ljava/util/Map;Lcom/datadog/android/trace/api/span/DatadogSpan;)V", "message", "span", "log", "(Ljava/lang/String;Lcom/datadog/android/trace/api/span/DatadogSpan;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "(Ljava/lang/Throwable;Lcom/datadog/android/trace/api/span/DatadogSpan;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, "logErrorMessage", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogSpanLogger {
    public static final java.lang.String DEFAULT_EVENT_MESSAGE = "Span event";
    public static final java.lang.String MISSING_LOG_FEATURE_INFO = "Requested to write span log, but Logs feature is not registered.";
    public static final java.lang.String TRACE_LOGGER_NAME = "trace";

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoFpsRanges;

    public DatadogSpanLogger(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        this.getHighSpeedVideoFpsRanges = featureSdkCore;
    }

    public final void log(java.lang.String message, com.datadog.android.trace.api.span.DatadogSpan span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        java.util.Map<java.lang.String, java.lang.Object> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("event", message));
        getHighSpeedVideoFpsRangesFor(mutableMapOf, span);
        Camera2StreamConfigurationMap(mutableMapOf, span);
    }

    public final void logErrorMessage(java.lang.String message, com.datadog.android.trace.api.span.DatadogSpan span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        java.util.Map<java.lang.String, java.lang.Object> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to("message", message), kotlin.TuplesKt.to("status", 6));
        getHighSpeedVideoFpsRangesFor(mutableMapOf, span);
        Camera2StreamConfigurationMap(mutableMapOf, span);
    }

    public final void log(java.lang.Throwable throwable, com.datadog.android.trace.api.span.DatadogSpan span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        java.util.Map<java.lang.String, java.lang.Object> mutableMapOf = kotlin.collections.MapsKt.mutableMapOf(kotlin.TuplesKt.to(com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.ERROR_OBJECT, throwable));
        getHighSpeedVideoFpsRangesFor(mutableMapOf, span);
        Camera2StreamConfigurationMap(mutableMapOf, span);
    }

    public final void log(java.util.Map<java.lang.String, ? extends java.lang.Object> attributes, com.datadog.android.trace.api.span.DatadogSpan span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attributes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        getHighSpeedVideoFpsRangesFor(kotlin.collections.MapsKt.toMutableMap(attributes), span);
        Camera2StreamConfigurationMap(kotlin.collections.MapsKt.toMutableMap(attributes), span);
    }

    private static void getHighSpeedVideoFpsRangesFor(java.util.Map<java.lang.String, ?> p0, com.datadog.android.trace.api.span.DatadogSpan p1) {
        java.lang.String name2;
        java.lang.Class<?> cls;
        java.lang.String loggableStackTrace;
        java.lang.String obj;
        java.lang.Object remove = p0.remove(com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.ERROR_OBJECT);
        java.lang.String str = null;
        java.lang.Throwable th = remove instanceof java.lang.Throwable ? (java.lang.Throwable) remove : null;
        java.lang.Object remove2 = p0.remove("error.kind");
        if (remove2 == null || (name2 = remove2.toString()) == null) {
            name2 = (th == null || (cls = th.getClass()) == null) ? null : cls.getName();
        }
        if (name2 != null) {
            java.lang.Object remove3 = p0.remove(com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK);
            java.lang.Object obj2 = p0.get("message");
            if (remove3 == null || (loggableStackTrace = remove3.toString()) == null) {
                loggableStackTrace = th != null ? com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(th) : null;
            }
            if (obj2 != null && (obj = obj2.toString()) != null) {
                str = obj;
            } else if (th != null) {
                str = th.getMessage();
            }
            p1.setError(java.lang.Boolean.TRUE);
            p1.setTag("error.type", name2);
            p1.setTag(com.datadog.android.trace.api.DatadogTracingConstants.Tags.KEY_ERROR_MSG, str);
            p1.setTag("error.stack", loggableStackTrace);
        }
    }

    private final void Camera2StreamConfigurationMap(java.util.Map<java.lang.String, java.lang.Object> p0, com.datadog.android.trace.api.span.DatadogSpan p1) {
        java.lang.String str;
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoFpsRanges.getFeature("logs");
        if (feature == null || p0.isEmpty()) {
            if (feature == null) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.trace.internal.DatadogSpanLogger$sendLogEvent$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.trace.internal.DatadogSpanLogger.MISSING_LOG_FEATURE_INFO;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
                return;
            }
            return;
        }
        java.lang.Object remove = p0.remove("message");
        if (remove == null || (str = remove.toString()) == null) {
            str = DEFAULT_EVENT_MESSAGE;
        }
        java.lang.Object remove2 = p0.remove("status");
        if (remove2 == null) {
            remove2 = 2;
        }
        p0.put(com.datadog.android.log.LogAttributes.DD_TRACE_ID, p1.context().getTraceId().toHexString());
        p0.put(com.datadog.android.log.LogAttributes.DD_SPAN_ID, java.lang.String.valueOf(p1.context().getSpanId()));
        long deviceTimestampMillis = this.getHighSpeedVideoFpsRanges.getTimeProvider().getDeviceTimestampMillis();
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        createMapBuilder.put("type", "span_log");
        createMapBuilder.put("loggerName", "trace");
        createMapBuilder.put("message", str);
        createMapBuilder.put(com.datadog.android.rum.internal.RumFeature.EVENT_ATTRIBUTES_PROPERTY, p0);
        createMapBuilder.put("timestamp", java.lang.Long.valueOf(deviceTimestampMillis));
        createMapBuilder.put("logStatus", remove2);
        feature.sendEvent(kotlin.collections.MapsKt.build(createMapBuilder));
    }
}
