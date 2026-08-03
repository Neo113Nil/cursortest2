package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes.dex */
public class InterruptionSafeThread extends java.lang.Thread implements io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f3654a;

    public InterruptionSafeThread() {
        this.f3654a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f3654a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f3654a = false;
        interrupt();
    }

    public InterruptionSafeThread(java.lang.Runnable runnable, java.lang.String str) {
        super(runnable, str);
        this.f3654a = true;
    }

    public InterruptionSafeThread(java.lang.String str) {
        super(str);
        this.f3654a = true;
    }

    public InterruptionSafeThread(java.lang.Runnable runnable) {
        super(runnable);
        this.f3654a = true;
    }
}
