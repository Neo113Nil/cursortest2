package com.datadog.android.core.internal.metrics;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\b\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001$B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u001c8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/core/internal/metrics/MethodCalledTelemetry;", "Lcom/datadog/android/core/metrics/PerformanceMetric;", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "", "operationName", "callerClass", "", "creationSampleRate", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Ljava/lang/String;FLcom/datadog/android/internal/time/TimeProvider;)V", "", "isSuccessful", "", "stopAndSend", "(Z)V", "Ljava/lang/String;", "getCallerClass$dd_sdk_android_core_release", "()Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "getCreationSampleRate$dd_sdk_android_core_release", "()F", "Lcom/datadog/android/api/InternalLogger;", "getInternalLogger$dd_sdk_android_core_release", "()Lcom/datadog/android/api/InternalLogger;", "getOperationName$dd_sdk_android_core_release", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.KEY_START_TIME, "J", "getStartTime$dd_sdk_android_core_release", "()J", "Lcom/datadog/android/internal/time/TimeProvider;", "getTimeProvider$dd_sdk_android_core_release", "()Lcom/datadog/android/internal/time/TimeProvider;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MethodCalledTelemetry implements com.datadog.android.core.metrics.PerformanceMetric {
    public static final java.lang.String CALLER_CLASS = "caller_class";
    public static final java.lang.String EXECUTION_TIME = "execution_time";
    public static final java.lang.String IS_SUCCESSFUL = "is_successful";
    public static final java.lang.String METHOD_CALLED_METRIC_NAME = "[Mobile Metric] Method Called";
    public static final java.lang.String METRIC_TYPE_VALUE = "method called";
    public static final java.lang.String OPERATION_NAME = "operation_name";
    private final java.lang.String callerClass;
    private final float creationSampleRate;
    private final com.datadog.android.api.InternalLogger internalLogger;
    private final java.lang.String operationName;
    private final long startTime;
    private final com.datadog.android.internal.time.TimeProvider timeProvider;

    public MethodCalledTelemetry(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, java.lang.String str2, float f, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.internalLogger = internalLogger;
        this.operationName = str;
        this.callerClass = str2;
        this.creationSampleRate = f;
        this.timeProvider = timeProvider;
        this.startTime = timeProvider.getDeviceElapsedTimeNanos();
    }

    /* renamed from: getInternalLogger$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.api.InternalLogger getInternalLogger() {
        return this.internalLogger;
    }

    /* renamed from: getOperationName$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getOperationName() {
        return this.operationName;
    }

    /* renamed from: getCallerClass$dd_sdk_android_core_release, reason: from getter */
    public final java.lang.String getCallerClass() {
        return this.callerClass;
    }

    /* renamed from: getCreationSampleRate$dd_sdk_android_core_release, reason: from getter */
    public final float getCreationSampleRate() {
        return this.creationSampleRate;
    }

    /* renamed from: getTimeProvider$dd_sdk_android_core_release, reason: from getter */
    public final com.datadog.android.internal.time.TimeProvider getTimeProvider() {
        return this.timeProvider;
    }

    /* renamed from: getStartTime$dd_sdk_android_core_release, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    @Override // com.datadog.android.core.metrics.PerformanceMetric
    public final void stopAndSend(boolean isSuccessful) {
        long deviceElapsedTimeNanos = this.timeProvider.getDeviceElapsedTimeNanos();
        long j = this.startTime;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(EXECUTION_TIME, java.lang.Long.valueOf(deviceElapsedTimeNanos - j));
        linkedHashMap.put("operation_name", this.operationName);
        linkedHashMap.put(CALLER_CLASS, this.callerClass);
        linkedHashMap.put(IS_SUCCESSFUL, java.lang.Boolean.valueOf(isSuccessful));
        linkedHashMap.put("metric_type", METRIC_TYPE_VALUE);
        this.internalLogger.logMetric(new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.metrics.MethodCalledTelemetry$stopAndSend$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.core.internal.metrics.MethodCalledTelemetry.METHOD_CALLED_METRIC_NAME;
            }
        }, linkedHashMap, com.datadog.android.core.metrics.MethodCallSamplingRate.ALL.getRate(), java.lang.Float.valueOf(this.creationSampleRate));
    }
}
