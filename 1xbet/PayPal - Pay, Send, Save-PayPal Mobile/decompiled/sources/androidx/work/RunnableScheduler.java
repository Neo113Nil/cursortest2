package androidx.work;

/* loaded from: classes.dex */
public interface RunnableScheduler {
    void cancel(java.lang.Runnable runnable);

    void scheduleWithDelay(long j, java.lang.Runnable runnable);
}
