package Dc;

import Kc.C3493a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;
import nc.InterfaceC8487b;
import sc.C9653a;

/* loaded from: classes9.dex */
final class e implements Callable<Void>, InterfaceC8487b {

    /* renamed from: f, reason: collision with root package name */
    static final FutureTask<Void> f6351f = new FutureTask<>(C9653a.f98522b, null);

    /* renamed from: a, reason: collision with root package name */
    final Runnable f6352a;

    /* renamed from: d, reason: collision with root package name */
    final ExecutorService f6355d;

    /* renamed from: e, reason: collision with root package name */
    Thread f6356e;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReference<Future<?>> f6354c = new AtomicReference<>();

    /* renamed from: b, reason: collision with root package name */
    final AtomicReference<Future<?>> f6353b = new AtomicReference<>();

    e(Runnable runnable, ExecutorService executorService) {
        this.f6352a = runnable;
        this.f6355d = executorService;
    }

    final void a(Future<?> future) {
        while (true) {
            AtomicReference<Future<?>> atomicReference = this.f6354c;
            Future<?> future2 = atomicReference.get();
            if (future2 == f6351f) {
                future.cancel(this.f6356e != Thread.currentThread());
                return;
            }
            while (!atomicReference.compareAndSet(future2, future)) {
                if (atomicReference.get() != future2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        this.f6356e = Thread.currentThread();
        try {
            this.f6352a.run();
            Future<?> submit = this.f6355d.submit(this);
            loop0: while (true) {
                AtomicReference<Future<?>> atomicReference = this.f6353b;
                Future<?> future = atomicReference.get();
                if (future != f6351f) {
                    while (!atomicReference.compareAndSet(future, submit)) {
                        if (atomicReference.get() != future) {
                            break;
                        }
                    }
                    break loop0;
                }
                submit.cancel(this.f6356e != Thread.currentThread());
            }
            this.f6356e = null;
        } catch (Throwable th2) {
            this.f6356e = null;
            C3493a.f(th2);
        }
        return null;
    }

    @Override // nc.InterfaceC8487b
    public final void dispose() {
        AtomicReference<Future<?>> atomicReference = this.f6354c;
        FutureTask<Void> futureTask = f6351f;
        Future<?> andSet = atomicReference.getAndSet(futureTask);
        if (andSet != null && andSet != futureTask) {
            andSet.cancel(this.f6356e != Thread.currentThread());
        }
        Future<?> andSet2 = this.f6353b.getAndSet(futureTask);
        if (andSet2 == null || andSet2 == futureTask) {
            return;
        }
        andSet2.cancel(this.f6356e != Thread.currentThread());
    }

    @Override // nc.InterfaceC8487b
    public final boolean isDisposed() {
        return this.f6354c.get() == f6351f;
    }
}
