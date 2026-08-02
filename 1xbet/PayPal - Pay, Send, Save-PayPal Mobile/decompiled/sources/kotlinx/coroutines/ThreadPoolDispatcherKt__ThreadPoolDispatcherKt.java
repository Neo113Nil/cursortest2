package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "p0", "", "p1", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "newFixedThreadPoolContext", "(ILjava/lang/String;)Lkotlinx/coroutines/ExecutorCoroutineDispatcher;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/ThreadPoolDispatcherKt")
/* loaded from: classes17.dex */
final /* synthetic */ class ThreadPoolDispatcherKt__ThreadPoolDispatcherKt {
    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(final int i, final java.lang.String str) {
        if (i <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected at least one thread, but ");
            sb.append(i);
            sb.append(" specified");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        final java.util.concurrent.atomic.AtomicInteger atomicInteger = new java.util.concurrent.atomic.AtomicInteger();
        return kotlinx.coroutines.ExecutorsKt.from(java.util.concurrent.Executors.unconfigurableExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(i, new java.util.concurrent.ThreadFactory() { // from class: kotlinx.coroutines.ThreadPoolDispatcherKt__ThreadPoolDispatcherKt$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.ThreadFactory
            public final java.lang.Thread newThread(java.lang.Runnable runnable) {
                return kotlinx.coroutines.ThreadPoolDispatcherKt__ThreadPoolDispatcherKt.getHighResolutionOutputSizeshNQ4ISI(i, str, atomicInteger, runnable);
            }
        })));
    }

    public static /* synthetic */ java.lang.Thread getHighResolutionOutputSizeshNQ4ISI(int i, java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.Runnable runnable) {
        if (i != 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            sb.append('-');
            sb.append(atomicInteger.incrementAndGet());
            str = sb.toString();
        }
        java.lang.Thread thread = new java.lang.Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
