package io.appmetrica.analytics.coreutils.internal.executors;

/* loaded from: classes.dex */
public abstract class SafeRunnable implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public void run() {
        try {
            runSafety();
        } catch (java.lang.Throwable unused) {
        }
    }

    public abstract void runSafety();
}
