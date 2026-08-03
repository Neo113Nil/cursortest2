package com.helpshift.util;

/* loaded from: classes5.dex */
public class SafeWrappedRunnable implements java.lang.Runnable {
    private static final java.lang.String TAG = "SfeWrpRnnble";
    public final java.util.concurrent.atomic.AtomicBoolean inProgress = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.lang.Runnable runnable;

    public SafeWrappedRunnable(java.lang.Runnable runnable) {
        this.runnable = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                this.inProgress.compareAndSet(false, true);
                this.runnable.run();
            } catch (java.lang.Exception e) {
                com.helpshift.log.HSLogger.e(TAG, "Error running operation", e);
            }
        } finally {
            this.inProgress.compareAndSet(true, false);
        }
    }
}
