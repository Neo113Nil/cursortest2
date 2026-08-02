package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a+\u0010\n\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Ljava/util/concurrent/ThreadPoolExecutor;", "", "isIdle", "(Ljava/util/concurrent/ThreadPoolExecutor;)Z", "", "timeoutInMs", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "waitToIdle", "(Ljava/util/concurrent/ThreadPoolExecutor;JLcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/time/TimeProvider;)Z", "MAX_SLEEP_DURATION_IN_MS", "J"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThreadPoolExecutorExtKt {
    public static final long MAX_SLEEP_DURATION_IN_MS = 10;

    public static final boolean waitToIdle(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor, long j, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.time.TimeProvider timeProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        long deviceElapsedTimeNanos = timeProvider.getDeviceElapsedTimeNanos();
        long nanos = java.util.concurrent.TimeUnit.MILLISECONDS.toNanos(j);
        long coerceIn = kotlin.ranges.RangesKt.coerceIn(j, 0L, 10L);
        while (!isIdle(threadPoolExecutor)) {
            boolean sleepSafe = com.datadog.android.core.internal.thread.ThreadExtKt.sleepSafe(coerceIn, internalLogger);
            if (timeProvider.getDeviceElapsedTimeNanos() - deviceElapsedTimeNanos >= nanos || sleepSafe) {
                return isIdle(threadPoolExecutor);
            }
        }
        return true;
    }

    public static final boolean isIdle(java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadPoolExecutor, "");
        return threadPoolExecutor.getTaskCount() - threadPoolExecutor.getCompletedTaskCount() <= 0;
    }
}
