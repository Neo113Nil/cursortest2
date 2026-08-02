package Dc;

import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9653a;

/* renamed from: Dc.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC2850a extends AtomicReference<Future<?>> implements InterfaceC8487b {

    /* renamed from: c, reason: collision with root package name */
    protected static final FutureTask<Void> f6318c;

    /* renamed from: d, reason: collision with root package name */
    protected static final FutureTask<Void> f6319d;

    /* renamed from: a, reason: collision with root package name */
    protected final Runnable f6320a;

    /* renamed from: b, reason: collision with root package name */
    protected Thread f6321b;

    static {
        Runnable runnable = C9653a.f98522b;
        f6318c = new FutureTask<>(runnable, null);
        f6319d = new FutureTask<>(runnable, null);
    }

    AbstractC2850a(Runnable runnable) {
        this.f6320a = runnable;
    }

    public final void a(Future<?> future) {
        Future<?> future2;
        do {
            future2 = get();
            if (future2 == f6318c) {
                return;
            }
            if (future2 == f6319d) {
                future.cancel(this.f6321b != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        FutureTask<Void> futureTask;
        Future<?> future = get();
        if (future == f6318c || future == (futureTask = f6319d) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f6321b != Thread.currentThread());
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        Future<?> future = get();
        return future == f6318c || future == f6319d;
    }
}
