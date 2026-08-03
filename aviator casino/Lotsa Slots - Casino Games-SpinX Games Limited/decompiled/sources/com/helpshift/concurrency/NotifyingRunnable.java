package com.helpshift.concurrency;

/* loaded from: classes.dex */
public class NotifyingRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = "NotifyingRunnable";
    private final java.lang.Runnable runnable;
    private final java.lang.Object syncLock = new java.lang.Object();
    private final java.util.concurrent.atomic.AtomicBoolean isFinished = new java.util.concurrent.atomic.AtomicBoolean(false);

    public NotifyingRunnable(java.lang.Runnable runnable) {
        this.runnable = runnable;
    }

    public void waitForCompletion() {
        synchronized (this.syncLock) {
            while (!this.isFinished.get()) {
                try {
                    this.syncLock.wait();
                } catch (java.lang.InterruptedException e) {
                    com.helpshift.log.HSLogger.d(TAG, "Exception in NotifyingRunnable", e);
                    java.lang.Thread.currentThread().interrupt();
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.syncLock) {
            try {
                this.runnable.run();
            } finally {
                this.isFinished.set(true);
                this.syncLock.notifyAll();
            }
        }
    }
}
