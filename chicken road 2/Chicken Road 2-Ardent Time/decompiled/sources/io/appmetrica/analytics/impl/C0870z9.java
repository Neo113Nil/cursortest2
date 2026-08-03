package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.z9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0870z9 implements io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Looper f7179a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.Handler f7180b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.HandlerThreadC0277cb f7181c;

    public C0870z9(java.lang.String str) {
        this(a(str));
    }

    public static io.appmetrica.analytics.impl.HandlerThreadC0277cb a(java.lang.String str) {
        io.appmetrica.analytics.impl.HandlerThreadC0277cb handlerThreadC0277cb = new io.appmetrica.analytics.impl.HandlerThreadC0277cb(str + "-" + io.appmetrica.analytics.impl.ThreadFactoryC0874zd.f7184a.incrementAndGet());
        handlerThreadC0277cb.start();
        return handlerThreadC0277cb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f7180b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(java.lang.Runnable runnable, long j2) {
        this.f7180b.postDelayed(runnable, java.util.concurrent.TimeUnit.MILLISECONDS.toMillis(j2));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final android.os.Handler getHandler() {
        return this.f7180b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final android.os.Looper getLooper() {
        return this.f7179a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z2;
        io.appmetrica.analytics.impl.HandlerThreadC0277cb handlerThreadC0277cb = this.f7181c;
        synchronized (handlerThreadC0277cb) {
            z2 = handlerThreadC0277cb.f5644a;
        }
        return z2;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(java.lang.Runnable runnable) {
        this.f7180b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f7180b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        io.appmetrica.analytics.impl.HandlerThreadC0277cb handlerThreadC0277cb = this.f7181c;
        synchronized (handlerThreadC0277cb) {
            handlerThreadC0277cb.f5644a = false;
            handlerThreadC0277cb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> java.util.concurrent.Future<T> submit(java.util.concurrent.Callable<T> callable) {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        this.f7180b.post(futureTask);
        return futureTask;
    }

    public C0870z9(io.appmetrica.analytics.impl.HandlerThreadC0277cb handlerThreadC0277cb) {
        this(handlerThreadC0277cb, handlerThreadC0277cb.getLooper(), new android.os.Handler(handlerThreadC0277cb.getLooper()));
    }

    public C0870z9(io.appmetrica.analytics.impl.HandlerThreadC0277cb handlerThreadC0277cb, android.os.Looper looper, android.os.Handler handler) {
        this.f7181c = handlerThreadC0277cb;
        this.f7179a = looper;
        this.f7180b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(java.lang.Runnable runnable, long j2, java.util.concurrent.TimeUnit timeUnit) {
        this.f7180b.postDelayed(runnable, timeUnit.toMillis(j2));
    }
}
