package com.helpshift.concurrency;

/* loaded from: classes.dex */
public class HSWorkerThreader implements com.helpshift.concurrency.HSThreader {
    private static final java.lang.String TAG = "HSThreader";
    private final java.util.concurrent.ExecutorService executorService;

    public HSWorkerThreader(java.util.concurrent.ExecutorService executorService) {
        this.executorService = executorService;
    }

    @Override // com.helpshift.concurrency.HSThreader
    public java.util.concurrent.atomic.AtomicBoolean submit(java.lang.Runnable runnable) {
        try {
            com.helpshift.util.SafeWrappedRunnable safeWrappedRunnable = new com.helpshift.util.SafeWrappedRunnable(runnable);
            this.executorService.submit(safeWrappedRunnable);
            return safeWrappedRunnable.inProgress;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error while submitting request.", e);
            return new java.util.concurrent.atomic.AtomicBoolean(false);
        }
    }
}
