package com.helpshift.concurrency;

/* loaded from: classes.dex */
public class HSUIThreader implements com.helpshift.concurrency.HSThreader {
    private static final java.lang.String TAG = "HSUIThreader";

    @Override // com.helpshift.concurrency.HSThreader
    public java.util.concurrent.atomic.AtomicBoolean submit(java.lang.Runnable runnable) {
        try {
            com.helpshift.util.SafeWrappedRunnable safeWrappedRunnable = new com.helpshift.util.SafeWrappedRunnable(runnable);
            if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                safeWrappedRunnable.run();
            } else {
                new android.os.Handler(android.os.Looper.getMainLooper()).post(safeWrappedRunnable);
            }
            return safeWrappedRunnable.inProgress;
        } catch (java.lang.Exception e) {
            com.helpshift.log.HSLogger.e(TAG, "Error executing task in UI threader", e);
            return new java.util.concurrent.atomic.AtomicBoolean(false);
        }
    }
}
