package com.helpshift.concurrency;

/* loaded from: classes.dex */
public class HSThreadingService {
    private final com.helpshift.concurrency.HSThreader hsuiThreader;
    private final com.helpshift.concurrency.HSThreader networkService;
    private final com.helpshift.concurrency.HSThreader serialQueue;
    private final java.lang.Object syncLock = new java.lang.Object();

    static /* synthetic */ void lambda$awaitForSyncExecution$0() {
    }

    public HSThreadingService(com.helpshift.concurrency.HSThreader hSThreader, com.helpshift.concurrency.HSThreader hSThreader2, com.helpshift.concurrency.HSThreader hSThreader3) {
        this.networkService = hSThreader;
        this.serialQueue = hSThreader2;
        this.hsuiThreader = hSThreader3;
    }

    public com.helpshift.concurrency.HSThreader getNetworkService() {
        return this.networkService;
    }

    public void runSerial(java.lang.Runnable runnable) {
        this.serialQueue.submit(runnable);
    }

    public void runSync(java.lang.Runnable runnable) {
        com.helpshift.concurrency.NotifyingRunnable notifyingRunnable = new com.helpshift.concurrency.NotifyingRunnable(runnable);
        synchronized (this.syncLock) {
            runSerial(notifyingRunnable);
            notifyingRunnable.waitForCompletion();
        }
    }

    public void awaitForSyncExecution() {
        runSync(new java.lang.Runnable() { // from class: com.helpshift.concurrency.HSThreadingService$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.concurrency.HSThreadingService.lambda$awaitForSyncExecution$0();
            }
        });
    }

    /* renamed from: lambda$runOnUIThread$1$com-helpshift-concurrency-HSThreadingService, reason: not valid java name */
    /* synthetic */ void m5651xdbcf99c6(java.lang.Runnable runnable) {
        this.hsuiThreader.submit(runnable);
    }

    public void runOnUIThread(final java.lang.Runnable runnable) {
        this.serialQueue.submit(new java.lang.Runnable() { // from class: com.helpshift.concurrency.HSThreadingService$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.helpshift.concurrency.HSThreadingService.this.m5651xdbcf99c6(runnable);
            }
        });
    }
}
