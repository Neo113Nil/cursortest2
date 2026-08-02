package w1;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class H0 extends ThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F0 f17391a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(F0 f02, TimeUnit timeUnit, PriorityBlockingQueue priorityBlockingQueue) {
        super(0, 5, 5000L, timeUnit, priorityBlockingQueue);
        this.f17391a = f02;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        N0 h6 = F0.h(runnable);
        if (h6 == null) {
            return;
        }
        synchronized (((HashMap) this.f17391a.f17375d)) {
            ((HashMap) this.f17391a.f17375d).remove(h6);
        }
        this.f17391a.n(h6);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    public final void beforeExecute(Thread thread, Runnable runnable) {
        super.beforeExecute(thread, runnable);
        F0.h(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        G0 g02 = new G0(runnable, obj);
        synchronized (((HashMap) this.f17391a.f17375d)) {
            ((HashMap) this.f17391a.f17375d).put((N0) runnable, g02);
        }
        return g02;
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final RunnableFuture newTaskFor(Callable callable) {
        throw new UnsupportedOperationException("Callable not supported");
    }
}
