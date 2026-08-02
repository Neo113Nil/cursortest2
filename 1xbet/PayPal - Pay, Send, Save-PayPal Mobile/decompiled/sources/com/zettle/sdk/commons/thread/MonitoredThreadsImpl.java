package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00070\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/commons/thread/MonitoredThreadsImpl;", "Lcom/zettle/sdk/commons/thread/MonitoredThreads;", "Lcom/zettle/sdk/commons/thread/ChainedUncaughtExceptionHandler;", "p0", "<init>", "(Lcom/zettle/sdk/commons/thread/ChainedUncaughtExceptionHandler;)V", "Ljava/lang/Thread$UncaughtExceptionHandler;", "", "addExceptionHandler", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "", "Lkotlin/Function1;", "Landroid/os/Looper;", "p1", "Landroid/os/HandlerThread;", "handlerThread", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Landroid/os/HandlerThread;", "", "Lkotlin/Function0;", "p2", "Ljava/lang/Thread;", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.THREAD_NAME, "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Thread;", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/concurrent/atomic/AtomicInteger;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/commons/thread/ChainedUncaughtExceptionHandler;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
final class MonitoredThreadsImpl implements com.zettle.sdk.commons.thread.MonitoredThreads {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.atomic.AtomicInteger getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.thread.ChainedUncaughtExceptionHandler getHighSpeedVideoFpsRanges;

    public MonitoredThreadsImpl(com.zettle.sdk.commons.thread.ChainedUncaughtExceptionHandler chainedUncaughtExceptionHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chainedUncaughtExceptionHandler, "");
        this.getHighSpeedVideoFpsRanges = chainedUncaughtExceptionHandler;
        this.getHighSpeedVideoSizes = new java.util.concurrent.atomic.AtomicInteger(0);
    }

    @Override // com.zettle.sdk.commons.thread.MonitoredThreads
    public final void addExceptionHandler(java.lang.Thread.UncaughtExceptionHandler p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighSpeedVideoFpsRanges.chain(p0);
    }

    @Override // com.zettle.sdk.commons.thread.MonitoredThreads
    public final android.os.HandlerThread handlerThread(java.lang.String p0, kotlin.jvm.functions.Function1<? super android.os.Looper, kotlin.Unit> p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        int incrementAndGet = this.getHighSpeedVideoSizes.incrementAndGet();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Zettle-");
        sb.append(incrementAndGet);
        sb.append("-");
        sb.append(p0);
        com.zettle.sdk.commons.thread.HandlerThreadWithCallback handlerThreadWithCallback = new com.zettle.sdk.commons.thread.HandlerThreadWithCallback(sb.toString(), p1);
        handlerThreadWithCallback.setUncaughtExceptionHandler(this.getHighSpeedVideoFpsRanges);
        return handlerThreadWithCallback;
    }

    @Override // com.zettle.sdk.commons.thread.MonitoredThreads
    public final java.lang.Thread thread(java.lang.String p0, boolean p1, final kotlin.jvm.functions.Function0<kotlin.Unit> p2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p2, "");
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.zettle.sdk.commons.thread.MonitoredThreadsImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.zettle.sdk.commons.thread.MonitoredThreadsImpl.getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0.this);
            }
        };
        int incrementAndGet = this.getHighSpeedVideoSizes.incrementAndGet();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Zettle-");
        sb.append(incrementAndGet);
        sb.append("-");
        sb.append(p0);
        java.lang.Thread thread = new java.lang.Thread(runnable, sb.toString());
        thread.setDaemon(p1);
        thread.setUncaughtExceptionHandler(this.getHighSpeedVideoFpsRanges);
        return thread;
    }

    public static /* synthetic */ void getHighSpeedVideoFpsRangesFor(kotlin.jvm.functions.Function0 function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        function0.invoke();
    }
}
