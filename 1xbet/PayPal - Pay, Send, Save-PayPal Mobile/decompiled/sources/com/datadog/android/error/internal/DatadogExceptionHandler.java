package com.datadog.android.error.internal;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001e\u0010\u000f\u001a\f\u0012\b\u0012\u0006*\u00020\u00040\u00040\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b"}, d2 = {"Lcom/datadog/android/error/internal/DatadogExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Landroid/content/Context;", "appContext", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Landroid/content/Context;)V", "", "register", "()V", "", "Ljava/lang/Thread;", "", "Ljava/lang/StackTraceElement;", "Camera2StreamConfigurationMap", "()Ljava/util/Map;", "t", "", "e", "uncaughtException", "(Ljava/lang/Thread;Ljava/lang/Throwable;)V", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/ref/WeakReference;", "getHighSpeedVideoFpsRanges", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatadogExceptionHandler implements java.lang.Thread.UncaughtExceptionHandler {
    public static final java.lang.String EXECUTOR_NOT_IDLED_WARNING_MESSAGE = "Datadog SDK is in an unexpected state due to an ongoing crash. Some events could be lost.";
    public static final java.lang.String LOGGER_NAME = "crash";
    public static final long MAX_WAIT_FOR_IDLE_TIME_IN_MS = 100;
    public static final java.lang.String MESSAGE = "Application crash detected";
    public static final java.lang.String MISSING_LOGS_FEATURE_INFO = "Logs feature is not registered, won't report crash as log.";
    public static final java.lang.String MISSING_RUM_FEATURE_INFO = "RUM feature is not registered, won't report crash as RUM event.";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoSizes;
    private java.lang.Thread.UncaughtExceptionHandler getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<android.content.Context> Camera2StreamConfigurationMap;

    public DatadogExceptionHandler(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = featureSdkCore;
        this.Camera2StreamConfigurationMap = new java.lang.ref.WeakReference<>(context);
    }

    public final void register() {
        this.getHighSpeedVideoFpsRanges = java.lang.Thread.getDefaultUncaughtExceptionHandler();
        java.lang.Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private final java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> Camera2StreamConfigurationMap() {
        try {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allStackTraces, "");
            return allStackTraces;
        } catch (java.lang.Throwable th) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$safeGetAllStacktraces$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to get all threads dump";
                }
            }, th, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return kotlin.collections.MapsKt.emptyMap();
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread t, java.lang.Throwable e) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e, "");
        java.lang.String name2 = t.getName();
        java.lang.Thread.State state = t.getState();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state, "");
        java.lang.String asString = com.datadog.android.internal.utils.ThreadExtKt.asString(state);
        java.lang.String loggableStackTrace = com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(e);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new com.datadog.android.core.feature.event.ThreadDump(name2, asString, loggableStackTrace, true));
        java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : Camera2StreamConfigurationMap.entrySet()) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), t)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((java.lang.StackTraceElement[]) entry2.getValue()).length != 0) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        java.util.LinkedHashMap linkedHashMap3 = linkedHashMap2;
        java.util.ArrayList arrayList = new java.util.ArrayList(linkedHashMap3.size());
        for (java.util.Map.Entry entry3 : linkedHashMap3.entrySet()) {
            java.lang.Thread thread = (java.lang.Thread) entry3.getKey();
            java.lang.StackTraceElement[] stackTraceElementArr = (java.lang.StackTraceElement[]) entry3.getValue();
            java.lang.String name3 = thread.getName();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
            java.lang.Thread.State state2 = thread.getState();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state2, "");
            arrayList.add(new com.datadog.android.core.feature.event.ThreadDump(name3, com.datadog.android.internal.utils.ThreadExtKt.asString(state2), com.datadog.android.internal.utils.ThreadExtKt.loggableStackTrace(stackTraceElementArr), false));
        }
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) mutableListOf, (java.lang.Iterable) arrayList);
        com.datadog.android.api.feature.FeatureScope feature = this.getHighSpeedVideoSizes.getFeature("rum");
        if (feature == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.INFO, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.error.internal.DatadogExceptionHandler.MISSING_RUM_FEATURE_INFO;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        } else {
            java.lang.String message = e.getMessage();
            java.lang.String str = message;
            if (str == null || kotlin.text.StringsKt.isBlank(str)) {
                java.lang.String canonicalName = e.getClass().getCanonicalName();
                if (canonicalName == null) {
                    canonicalName = e.getClass().getSimpleName();
                }
                message = "Application crash detected: ".concat(java.lang.String.valueOf(canonicalName));
            }
            feature.sendEvent(new com.datadog.android.core.feature.event.JvmCrash.Rum(e, message, plus));
        }
        com.datadog.android.api.feature.FeatureSdkCore featureSdkCore = this.getHighSpeedVideoSizes;
        if (featureSdkCore instanceof com.datadog.android.core.InternalSdkCore) {
            java.util.concurrent.ExecutorService persistenceExecutorService = ((com.datadog.android.core.InternalSdkCore) featureSdkCore).getPersistenceExecutorService();
            java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = persistenceExecutorService instanceof java.util.concurrent.ThreadPoolExecutor ? (java.util.concurrent.ThreadPoolExecutor) persistenceExecutorService : null;
            if (threadPoolExecutor != null && !com.datadog.android.core.internal.thread.ThreadPoolExecutorExtKt.waitToIdle(threadPoolExecutor, 100L, this.getHighSpeedVideoSizes.getInternalLogger(), this.getHighSpeedVideoSizes.getTimeProvider())) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.error.internal.DatadogExceptionHandler$uncaughtException$2
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.error.internal.DatadogExceptionHandler.EXECUTOR_NOT_IDLED_WARNING_MESSAGE;
                    }
                }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            }
        }
        android.content.Context context = this.Camera2StreamConfigurationMap.get();
        if (context != null && androidx.work.WorkManager.isInitialized()) {
            com.datadog.android.core.internal.utils.WorkManagerUtilsKt.triggerUploadWorker(context, this.getHighSpeedVideoSizes.getName(), this.getHighSpeedVideoSizes.getInternalLogger());
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.getHighSpeedVideoFpsRanges;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t, e);
        }
    }
}
