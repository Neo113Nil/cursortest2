package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes3.dex */
public final class ExecutorUtils {
    private static final long DEFAULT_TERMINATION_TIMEOUT = 2;

    private ExecutorUtils() {
    }

    public static java.util.concurrent.Executor buildSequentialExecutor(java.util.concurrent.Executor executor) {
        return com.google.firebase.concurrent.FirebaseExecutors.newSequentialExecutor(executor);
    }

    public static java.util.concurrent.ExecutorService buildSingleThreadExecutorService(java.lang.String str) {
        java.util.concurrent.ExecutorService newSingleThreadExecutor = newSingleThreadExecutor(getNamedThreadFactory(str), new java.util.concurrent.ThreadPoolExecutor.DiscardPolicy());
        addDelayedShutdownHook(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    public static java.util.concurrent.ScheduledExecutorService buildSingleThreadScheduledExecutorService(java.lang.String str) {
        java.util.concurrent.ScheduledExecutorService newSingleThreadScheduledExecutor = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(getNamedThreadFactory(str));
        addDelayedShutdownHook(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    public static java.util.concurrent.ThreadFactory getNamedThreadFactory(final java.lang.String str) {
        final java.util.concurrent.atomic.AtomicLong atomicLong = new java.util.concurrent.atomic.AtomicLong(1L);
        return new java.util.concurrent.ThreadFactory() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1
            @Override // java.util.concurrent.ThreadFactory
            public java.lang.Thread newThread(final java.lang.Runnable runnable) {
                java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(new com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.1.1
                    @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
                    public void onRun() {
                        runnable.run();
                    }
                });
                newThread.setName(str + atomicLong.getAndIncrement());
                return newThread;
            }
        };
    }

    private static java.util.concurrent.ExecutorService newSingleThreadExecutor(java.util.concurrent.ThreadFactory threadFactory, java.util.concurrent.RejectedExecutionHandler rejectedExecutionHandler) {
        return java.util.concurrent.Executors.unconfigurableExecutorService(new java.util.concurrent.ThreadPoolExecutor(1, 1, 0L, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    private static void addDelayedShutdownHook(java.lang.String str, java.util.concurrent.ExecutorService executorService) {
        addDelayedShutdownHook(str, executorService, 2L, java.util.concurrent.TimeUnit.SECONDS);
    }

    private static void addDelayedShutdownHook(final java.lang.String str, final java.util.concurrent.ExecutorService executorService, final long j, final java.util.concurrent.TimeUnit timeUnit) {
        java.lang.Runtime.getRuntime().addShutdownHook(new java.lang.Thread(new com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable() { // from class: com.google.firebase.crashlytics.internal.common.ExecutorUtils.2
            @Override // com.google.firebase.crashlytics.internal.common.BackgroundPriorityRunnable
            public void onRun() {
                try {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d("Executing shutdown hook for " + str);
                    executorService.shutdown();
                    if (executorService.awaitTermination(j, timeUnit)) {
                        return;
                    }
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d(str + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    executorService.shutdownNow();
                } catch (java.lang.InterruptedException unused) {
                    com.google.firebase.crashlytics.internal.Logger.getLogger().d(java.lang.String.format(java.util.Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", str));
                    executorService.shutdownNow();
                }
            }
        }, "Crashlytics Shutdown Hook for " + str));
    }
}
