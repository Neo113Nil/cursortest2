package U5;

import java.io.Serializable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p155w1.P2;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Serializable f6569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Serializable f6570d;

    public p0(Executor executor, int i7) {
        this.f6567a = 1;
        this.f6570d = new LinkedBlockingQueue();
        if (!(i7 > 0)) {
            throw new IllegalArgumentException("concurrency must be positive.");
        }
        this.f6568b = executor;
        this.f6569c = new Semaphore(i7, true);
    }

    public void a() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        do {
            AtomicReference atomicReference = (AtomicReference) this.f6570d;
            Thread threadCurrentThread = Thread.currentThread();
            while (!atomicReference.compareAndSet(null, threadCurrentThread)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            while (true) {
                concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f6569c;
                try {
                    Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        ((Thread.UncaughtExceptionHandler) this.f6568b).uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    atomicReference.set(null);
                    throw th2;
                }
            }
            atomicReference.set(null);
        } while (!concurrentLinkedQueue.isEmpty());
    }

    public void c(Runnable runnable) {
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) this.f6569c;
        p113p3.f.k(runnable, "runnable is null");
        concurrentLinkedQueue.add(runnable);
    }

    public void d() {
        while (true) {
            Semaphore semaphore = (Semaphore) this.f6569c;
            if (!semaphore.tryAcquire()) {
                return;
            }
            Runnable runnable = (Runnable) ((LinkedBlockingQueue) this.f6570d).poll();
            if (runnable == null) {
                semaphore.release();
                return;
            } else {
                ((Executor) this.f6568b).execute(new K5.a(15, this, runnable));
            }
        }
    }

    public P2 e(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        P2.F f7 = new P2.F(runnable);
        return new P2(f7, scheduledExecutorService.schedule(new H2.q(6, this, f7, runnable, false), j, timeUnit));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f6567a) {
            case 0:
                c(runnable);
                a();
                break;
            default:
                ((LinkedBlockingQueue) this.f6570d).offer(runnable);
                d();
                break;
        }
    }

    public void f() {
        p113p3.f.q("Not called from the SynchronizationContext", Thread.currentThread() == ((AtomicReference) this.f6570d).get());
    }

    public p0(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f6567a = 0;
        this.f6569c = new ConcurrentLinkedQueue();
        this.f6570d = new AtomicReference();
        this.f6568b = uncaughtExceptionHandler;
    }
}
