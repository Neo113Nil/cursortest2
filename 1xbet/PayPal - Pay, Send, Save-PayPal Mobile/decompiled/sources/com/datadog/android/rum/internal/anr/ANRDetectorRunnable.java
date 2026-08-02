package com.datadog.android.rum.internal.anr;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0015\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001d"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable;", "Ljava/lang/Runnable;", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "sdkCore", "Landroid/os/Handler;", "handler", "", "anrThresholdMs", "anrTestDelayMs", "<init>", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Landroid/os/Handler;JJ)V", "", "run", "()V", "", "Ljava/lang/Thread;", "", "Ljava/lang/StackTraceElement;", "getHighSpeedVideoFpsRangesFor", "()Ljava/util/Map;", "stop", "getHighResolutionOutputSizeshNQ4ISI", "J", "getHighSpeedVideoFpsRanges", "Camera2StreamConfigurationMap", "Landroid/os/Handler;", "getHighSpeedVideoSizes", "Lcom/datadog/android/api/feature/FeatureSdkCore;", "", "Z", "Companion", "CallbackRunnable"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ANRDetectorRunnable implements java.lang.Runnable {
    public static final java.lang.String ANR_MESSAGE = "Application Not Responding";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private volatile boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final android.os.Handler getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.api.feature.FeatureSdkCore getHighSpeedVideoFpsRangesFor;

    public ANRDetectorRunnable(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, android.os.Handler handler, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
        this.getHighSpeedVideoFpsRangesFor = featureSdkCore;
        this.getHighSpeedVideoSizes = handler;
        this.Camera2StreamConfigurationMap = j;
        this.getHighSpeedVideoFpsRanges = j2;
    }

    public /* synthetic */ ANRDetectorRunnable(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, android.os.Handler handler, long j, long j2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(featureSdkCore, handler, (i & 4) != 0 ? 5000L : j, (i & 8) != 0 ? 500L : j2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        while (!java.lang.Thread.currentThread().isInterrupted() && !this.getHighResolutionOutputSizeshNQ4ISI) {
            try {
                java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
                if (!this.getHighSpeedVideoSizes.post(new com.datadog.android.rum.internal.anr.ANRDetectorRunnable.CallbackRunnable(countDownLatch))) {
                    return;
                }
                if (!countDownLatch.await(this.Camera2StreamConfigurationMap, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                    java.lang.Thread thread = this.getHighSpeedVideoSizes.getLooper().getThread();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(thread, "");
                    com.datadog.android.rum.internal.anr.ANRException aNRException = new com.datadog.android.rum.internal.anr.ANRException(thread);
                    java.lang.String name2 = thread.getName();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
                    java.lang.Thread.State state = thread.getState();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state, "");
                    com.datadog.android.rum.internal.anr.ANRException aNRException2 = aNRException;
                    java.util.List mutableListOf = kotlin.collections.CollectionsKt.mutableListOf(new com.datadog.android.core.feature.event.ThreadDump(name2, com.datadog.android.internal.utils.ThreadExtKt.asString(state), com.datadog.android.internal.utils.ThrowableExtKt.loggableStackTrace(aNRException2), false));
                    java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
                    java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                    for (java.util.Map.Entry<java.lang.Thread, java.lang.StackTraceElement[]> entry : highSpeedVideoFpsRangesFor.entrySet()) {
                        if (!kotlin.jvm.internal.Intrinsics.areEqual(entry.getKey(), thread)) {
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
                    java.util.Iterator it = linkedHashMap3.entrySet().iterator();
                    while (it.hasNext()) {
                        java.lang.Thread thread2 = (java.lang.Thread) ((java.util.Map.Entry) it.next()).getKey();
                        java.lang.String name3 = thread2.getName();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name3, "");
                        java.lang.Thread.State state2 = thread2.getState();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(state2, "");
                        java.lang.String asString = com.datadog.android.internal.utils.ThreadExtKt.asString(state2);
                        java.lang.StackTraceElement[] stackTrace = thread2.getStackTrace();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(stackTrace, "");
                        arrayList.add(new com.datadog.android.core.feature.event.ThreadDump(name3, asString, com.datadog.android.internal.utils.ThreadExtKt.loggableStackTrace(stackTrace), false));
                    }
                    com.datadog.android.rum.GlobalRumMonitor.get(this.getHighSpeedVideoFpsRangesFor).addError(ANR_MESSAGE, com.datadog.android.rum.RumErrorSource.SOURCE, aNRException2, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.datadog.android.rum.RumAttributes.INTERNAL_ALL_THREADS, kotlin.collections.CollectionsKt.plus((java.util.Collection) mutableListOf, (java.lang.Iterable) arrayList))));
                    try {
                        countDownLatch.await();
                    } catch (java.lang.InterruptedException e) {
                        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.anr.ANRDetectorRunnable$waitForAnrResolution$1
                            @Override // kotlin.jvm.functions.Function0
                            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                            public final java.lang.String invoke() {
                                return "Interrupted while waiting for ANR resolution.";
                            }
                        }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                        try {
                            java.lang.Thread.currentThread().interrupt();
                        } catch (java.lang.SecurityException e2) {
                            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.anr.ANRDetectorRunnable$waitForAnrResolution$2
                                @Override // kotlin.jvm.functions.Function0
                                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                                public final java.lang.String invoke() {
                                    return "Failed to restore interrupted state during ANR resolution.";
                                }
                            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
                        }
                    }
                }
                long j = this.getHighSpeedVideoFpsRanges;
                if (j > 0) {
                    java.lang.Thread.sleep(j);
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
                return;
            }
        }
    }

    public final void stop() {
        this.getHighResolutionOutputSizeshNQ4ISI = true;
    }

    private final java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> getHighSpeedVideoFpsRangesFor() {
        try {
            java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> allStackTraces = java.lang.Thread.getAllStackTraces();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(allStackTraces, "");
            return allStackTraces;
        } catch (java.lang.Throwable th) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor.getInternalLogger(), com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.rum.internal.anr.ANRDetectorRunnable$safeGetAllStacktraces$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to get all stack traces.";
                }
            }, th, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return kotlin.collections.MapsKt.emptyMap();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/datadog/android/rum/internal/anr/ANRDetectorRunnable$CallbackRunnable;", "Ljava/lang/Runnable;", "Ljava/util/concurrent/CountDownLatch;", "callbackDone", "<init>", "(Ljava/util/concurrent/CountDownLatch;)V", "", "run", "()V", "getHighSpeedVideoFpsRanges", "Ljava/util/concurrent/CountDownLatch;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class CallbackRunnable implements java.lang.Runnable {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final java.util.concurrent.CountDownLatch getHighResolutionOutputSizeshNQ4ISI;

        public CallbackRunnable(java.util.concurrent.CountDownLatch countDownLatch) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countDownLatch, "");
            this.getHighResolutionOutputSizeshNQ4ISI = countDownLatch;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.getHighResolutionOutputSizeshNQ4ISI.countDown();
        }
    }
}
