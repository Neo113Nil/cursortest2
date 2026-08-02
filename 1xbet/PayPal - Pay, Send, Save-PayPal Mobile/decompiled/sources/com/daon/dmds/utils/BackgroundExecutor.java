package com.daon.dmds.utils;

/* loaded from: classes7.dex */
public class BackgroundExecutor {
    protected static final java.util.concurrent.ExecutorService executorService = java.util.concurrent.Executors.newCachedThreadPool(new java.util.concurrent.ThreadFactory() { // from class: com.daon.dmds.utils.BackgroundExecutor$$ExternalSyntheticLambda0
        @Override // java.util.concurrent.ThreadFactory
        public final java.lang.Thread newThread(java.lang.Runnable runnable) {
            return com.daon.dmds.utils.BackgroundExecutor.Camera2StreamConfigurationMap(runnable);
        }
    });

    static /* synthetic */ java.lang.Thread Camera2StreamConfigurationMap(java.lang.Runnable runnable) {
        java.lang.Thread newThread = java.util.concurrent.Executors.defaultThreadFactory().newThread(runnable);
        newThread.setDaemon(true);
        return newThread;
    }

    public static void shutdownAndAwaitTermination() {
        java.util.concurrent.ExecutorService executorService2 = executorService;
        executorService2.shutdown();
        try {
            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
            if (executorService2.awaitTermination(60L, timeUnit)) {
                return;
            }
            executorService2.shutdownNow();
            if (executorService2.awaitTermination(60L, timeUnit)) {
                return;
            }
            java.lang.System.err.println("Pool did not terminate");
        } catch (java.lang.InterruptedException unused) {
            executorService.shutdownNow();
            java.lang.Thread.currentThread().interrupt();
        }
    }

    public static <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        return executorService.submit(callable);
    }

    public static <T> java.util.List<java.util.concurrent.Future<T>> submitAll(java.util.List<java.util.concurrent.Callable<T>> list) throws java.lang.InterruptedException {
        return executorService.invokeAll(list);
    }

    public static <T> T submitAndWait(java.util.concurrent.Callable<T> callable) throws java.lang.Exception {
        return executorService.submit(callable).get();
    }

    public static <T> T submitAny(java.util.List<java.util.concurrent.Callable<T>> list) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        return (T) executorService.invokeAny(list);
    }

    public static java.util.concurrent.Future<?> submit(java.lang.Runnable runnable) {
        return executorService.submit(runnable);
    }
}
