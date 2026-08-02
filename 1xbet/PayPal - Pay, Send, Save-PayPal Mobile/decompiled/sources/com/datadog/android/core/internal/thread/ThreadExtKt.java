package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\"\u0014\u0010\u0010\u001a\u00020\u000f8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Ljava/lang/Runnable;", "task", "", "t", "Lcom/datadog/android/api/InternalLogger;", "logger", "", "loggingAfterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;Lcom/datadog/android/api/InternalLogger;)V", "", "durationMs", "internalLogger", "", "sleepSafe", "(JLcom/datadog/android/api/InternalLogger;)Z", "", "ERROR_UNCAUGHT_EXECUTION_EXCEPTION", "Ljava/lang/String;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadExtKt {
    public static final java.lang.String ERROR_UNCAUGHT_EXECUTION_EXCEPTION = "Uncaught exception during the task execution";

    public static final boolean sleepSafe(long j, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        try {
            try {
                java.lang.Thread.sleep(j);
                return false;
            } catch (java.lang.SecurityException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return "Thread was unable to set its own interrupted state";
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                return true;
            }
        } catch (java.lang.IllegalArgumentException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$sleepSafe$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Thread tried to sleep for a negative amount of time";
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return false;
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            return true;
        }
    }

    public static final void loggingAfterExecute(java.lang.Runnable runnable, java.lang.Throwable th, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        if (th == null && (runnable instanceof java.util.concurrent.Future) && ((java.util.concurrent.Future) runnable).isDone()) {
            try {
                try {
                    ((java.util.concurrent.Future) runnable).get();
                } catch (java.lang.SecurityException e) {
                    com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$1
                        @Override // kotlin.jvm.functions.Function0
                        /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                        public final java.lang.String invoke() {
                            return "Thread was unable to set its own interrupted state";
                        }
                    }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
                }
            } catch (java.lang.InterruptedException unused) {
                java.lang.Thread.currentThread().interrupt();
            } catch (java.util.concurrent.CancellationException e2) {
                th = e2;
            } catch (java.util.concurrent.ExecutionException e3) {
                th = e3.getCause();
            }
        }
        java.lang.Throwable th2 = th;
        if (th2 != null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.USER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.thread.ThreadExtKt$loggingAfterExecute$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.thread.ThreadExtKt.ERROR_UNCAUGHT_EXECUTION_EXCEPTION;
                }
            }, th2, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }
}
