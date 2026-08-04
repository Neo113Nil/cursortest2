package p155w1;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class H0 extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f17397a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(F0 f7, TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue) {
        super(0, 5, 5000L, timeUnit, priorityBlockingQueue);
        this.f17397a = f7;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        N0 n0H = F0.h(runnable);
        if (n0H == null) {
            return;
        }
        synchronized (((HashMap) this.f17397a.f17381d)) {
            ((HashMap) this.f17397a.f17381d).remove(n0H);
        }
        this.f17397a.n(n0H);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        F0.h(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        G0 g3 = new G0(runnable, obj);
        synchronized (((HashMap) this.f17397a.f17381d)) {
            ((HashMap) this.f17397a.f17381d).put((N0) runnable, g3);
        }
        return g3;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        throw new UnsupportedOperationException("Callable not supported");
    }
}
