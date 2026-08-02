package com.datadog.android.core.internal.thread;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001 B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001b\u001a\u00020\u00112\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/datadog/android/core/internal/thread/BackPressureExecutorService;", "Ljava/util/concurrent/ThreadPoolExecutor;", "Lcom/datadog/android/core/thread/FlushableExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "logger", "", "executorContext", "Lcom/datadog/android/core/configuration/BackPressureStrategy;", "backpressureStrategy", "Lcom/datadog/android/internal/time/TimeProvider;", "timeProvider", "<init>", "(Lcom/datadog/android/api/InternalLogger;Ljava/lang/String;Lcom/datadog/android/core/configuration/BackPressureStrategy;Lcom/datadog/android/internal/time/TimeProvider;)V", "Ljava/lang/Runnable;", "r", "", "t", "", "afterExecute", "(Ljava/lang/Runnable;Ljava/lang/Throwable;)V", "", "destination", "drainTo", "(Ljava/util/Collection;)V", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "p0", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/RuntimeException;)V", "Lcom/datadog/android/api/InternalLogger;", "getLogger", "()Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BackPressureExecutorService extends java.util.concurrent.ThreadPoolExecutor implements com.datadog.android.core.thread.FlushableExecutorService {
    private final com.datadog.android.api.InternalLogger logger;
    private static final long Camera2StreamConfigurationMap = java.util.concurrent.TimeUnit.SECONDS.toMillis(5);

    public final com.datadog.android.api.InternalLogger getLogger() {
        return this.logger;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackPressureExecutorService(com.datadog.android.api.InternalLogger internalLogger, java.lang.String str, com.datadog.android.core.configuration.BackPressureStrategy backPressureStrategy, com.datadog.android.internal.time.TimeProvider timeProvider) {
        super(1, 1, Camera2StreamConfigurationMap, java.util.concurrent.TimeUnit.MILLISECONDS, new com.datadog.android.core.internal.thread.BackPressuredBlockingQueue(internalLogger, str, backPressureStrategy, timeProvider), new com.datadog.android.core.internal.thread.DatadogThreadFactory(str));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backPressureStrategy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeProvider, "");
        this.logger = internalLogger;
    }

    @Override // com.datadog.android.core.thread.FlushableExecutorService
    public final void drainTo(java.util.Collection<java.lang.Runnable> destination) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        try {
            getQueue().drainTo(destination);
        } catch (java.lang.ClassCastException e) {
            getHighSpeedVideoFpsRangesFor(e);
        } catch (java.lang.IllegalArgumentException e2) {
            getHighSpeedVideoFpsRangesFor(e2);
        } catch (java.lang.NullPointerException e3) {
            getHighSpeedVideoFpsRangesFor(e3);
        } catch (java.lang.UnsupportedOperationException e4) {
            getHighSpeedVideoFpsRangesFor(e4);
        }
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(java.lang.Runnable r, java.lang.Throwable t) {
        super.afterExecute(r, t);
        com.datadog.android.core.internal.thread.ThreadExtKt.loggingAfterExecute(r, t, this.logger);
    }

    private final void getHighSpeedVideoFpsRangesFor(java.lang.RuntimeException p0) {
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.logger, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.thread.BackPressureExecutorService$onDrainException$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return "Unable to drain BackPressureExecutorService queue";
            }
        }, (java.lang.Throwable) p0, false, (java.util.Map) null, 48, (java.lang.Object) null);
    }
}
