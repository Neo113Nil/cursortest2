package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c51 extends AtomicReference implements Callable, InterfaceC0187eu {

    /* JADX INFO: renamed from: l */
    public static final FutureTask f1144l;

    /* JADX INFO: renamed from: m */
    public static final FutureTask f1145m;

    /* JADX INFO: renamed from: j */
    public final Runnable f1146j;

    /* JADX INFO: renamed from: k */
    public Thread f1147k;

    static {
        RunnableC0393ke runnableC0393ke = t22.f7258c;
        f1144l = new FutureTask(runnableC0393ke, null);
        f1145m = new FutureTask(runnableC0393ke, null);
    }

    public c51(Runnable runnable) {
        this.f1146j = runnable;
    }

    /* JADX INFO: renamed from: a */
    public final void m885a(Future future) {
        Future future2;
        do {
            future2 = (Future) get();
            if (future2 == f1144l) {
                return;
            }
            if (future2 == f1145m) {
                future.cancel(this.f1147k != Thread.currentThread());
                return;
            }
        } while (!compareAndSet(future2, future));
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        FutureTask futureTask;
        Future future = (Future) get();
        if (future == f1144l || future == (futureTask = f1145m) || !compareAndSet(future, futureTask) || future == null) {
            return;
        }
        future.cancel(this.f1147k != Thread.currentThread());
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        FutureTask futureTask = f1144l;
        this.f1147k = Thread.currentThread();
        try {
            this.f1146j.run();
            return null;
        } finally {
            lazySet(futureTask);
            this.f1147k = null;
        }
    }
}
