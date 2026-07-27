package io.appmetrica.analytics.coreapi.internal.executors;

/* loaded from: classes.dex */
public class InterruptionSafeThread extends Thread implements IInterruptionSafeThread {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f5338a;

    public InterruptionSafeThread() {
        this.f5338a = true;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized boolean isRunning() {
        return this.f5338a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public synchronized void stopRunning() {
        this.f5338a = false;
        interrupt();
    }

    public InterruptionSafeThread(Runnable runnable, String str) {
        super(runnable, str);
        this.f5338a = true;
    }

    public InterruptionSafeThread(String str) {
        super(str);
        this.f5338a = true;
    }

    public InterruptionSafeThread(Runnable runnable) {
        super(runnable);
        this.f5338a = true;
    }
}
