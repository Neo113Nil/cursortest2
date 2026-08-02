package androidx.work.impl;

/* loaded from: classes.dex */
public class DefaultRunnableScheduler implements androidx.work.RunnableScheduler {
    private final android.os.Handler getHighResolutionOutputSizeshNQ4ISI = androidx.core.os.HandlerCompat.createAsync(android.os.Looper.getMainLooper());

    public android.os.Handler getHandler() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.work.RunnableScheduler
    public void scheduleWithDelay(long j, java.lang.Runnable runnable) {
        this.getHighResolutionOutputSizeshNQ4ISI.postDelayed(runnable, j);
    }

    @Override // androidx.work.RunnableScheduler
    public void cancel(java.lang.Runnable runnable) {
        this.getHighResolutionOutputSizeshNQ4ISI.removeCallbacks(runnable);
    }
}
