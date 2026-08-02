package p000;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 implements Executor {

    /* JADX INFO: renamed from: j */
    public final Thread.UncaughtExceptionHandler f2694j;

    /* JADX INFO: renamed from: k */
    public final ConcurrentLinkedQueue f2695k = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: l */
    public final AtomicReference f2696l = new AtomicReference();

    public gc1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f2694j = uncaughtExceptionHandler;
    }

    /* JADX INFO: renamed from: a */
    public final void m2025a() {
        AtomicReference atomicReference;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f2695k;
        do {
            Thread threadCurrentThread = Thread.currentThread();
            do {
                atomicReference = this.f2696l;
                if (atomicReference.compareAndSet(null, threadCurrentThread)) {
                    while (true) {
                        try {
                            Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
                            if (runnable == null) {
                                break;
                            }
                            try {
                                runnable.run();
                            } catch (Throwable th) {
                                this.f2694j.uncaughtException(Thread.currentThread(), th);
                            }
                        } catch (Throwable th2) {
                            atomicReference.set(null);
                            throw th2;
                        }
                    }
                    atomicReference.set(null);
                }
            } while (atomicReference.get() == null);
            return;
        } while (!concurrentLinkedQueue.isEmpty());
    }

    /* JADX INFO: renamed from: b */
    public final void m2026b(Runnable runnable) {
        a90.m127k(runnable, "runnable is null");
        this.f2695k.add(runnable);
    }

    /* JADX INFO: renamed from: c */
    public final a81 m2027c(Runnable runnable, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        fc1 fc1Var = new fc1(runnable);
        return new a81(fc1Var, scheduledExecutorService.schedule(new RunnableC0702sr(this, fc1Var, runnable, 7), j, timeUnit));
    }

    /* JADX INFO: renamed from: d */
    public final void m2028d() {
        a90.m132p("Not called from the SynchronizationContext", Thread.currentThread() == this.f2696l.get());
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m2026b(runnable);
        m2025a();
    }
}
