package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u0011\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/core/internal/thread/LoggingScheduledThreadPoolExecutor;", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "", "corePoolSize", "", "executorContext", "Lcom/datadog/android/api/InternalLogger;", "logger", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backPressureStrategy", "<init>", "(ILjava/lang/String;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/core/configuration/BackPressureStrategy;)V", "Ljava/lang/Runnable;", "r", "", "t", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoggingScheduledThreadPoolExecutor extends java.util.concurrent.ScheduledThreadPoolExecutor {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.core.configuration.BackPressureStrategy getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggingScheduledThreadPoolExecutor(int i, final java.lang.String str, final com.datadog.android.api.InternalLogger internalLogger, final com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy) {
        super(i, new com.datadog.android.core.internal.thread.DatadogThreadFactory(str), new java.util.concurrent.RejectedExecutionHandler() { // from class: com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.RejectedExecutionHandler
            public final void rejectedExecution(java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
                com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor.$r8$lambda$YX2jYIuPLcDakXe8l4zqtRfQsr0(com.datadog.android.api.InternalLogger.this, str, backPressureStrategy, runnable, threadPoolExecutor);
            }
        });
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backPressureStrategy, "");
        this.getHighSpeedVideoSizes = internalLogger;
        this.getHighSpeedVideoFpsRanges = backPressureStrategy;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(java.lang.Runnable r, java.lang.Throwable t) {
        super.afterExecute(r, t);
        com.datadog.android.core.internal.thread.ThreadExtKt.loggingAfterExecute(r, t, this.getHighSpeedVideoSizes);
    }

    public static /* synthetic */ void $r8$lambda$YX2jYIuPLcDakXe8l4zqtRfQsr0(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy, final java.lang.Runnable runnable, java.util.concurrent.ThreadPoolExecutor threadPoolExecutor) {
        if (runnable != null) {
            internalLogger.log(com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.thread.LoggingScheduledThreadPoolExecutor$1$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Dropped scheduled item in LoggingScheduledThreadPoolExecutor queue: ".concat(java.lang.String.valueOf(runnable));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) null, false, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("executor.context", str)));
            backPressureStrategy.getOnItemDropped().invoke(runnable);
        }
    }
}
