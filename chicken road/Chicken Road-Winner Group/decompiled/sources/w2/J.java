package w2;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class J extends I implements InterfaceC1245y {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f10472c;

    public J(Executor executor) {
        Method method;
        this.f10472c = executor;
        Method method2 = B2.c.f152a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = B2.c.f152a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // w2.AbstractC1239s
    public final void c(g2.h hVar, Runnable runnable) {
        try {
            this.f10472c.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            P p3 = (P) hVar.k(C1240t.f10525b);
            if (p3 != null) {
                p3.b(cancellationException);
            }
            B.f10463b.c(hVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f10472c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof J) && ((J) obj).f10472c == this.f10472c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f10472c);
    }

    @Override // w2.AbstractC1239s
    public final String toString() {
        return this.f10472c.toString();
    }
}
