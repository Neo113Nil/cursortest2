package b1;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class E extends D implements InterfaceC0033v {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f626c;

    public E(Executor executor) {
        Method method;
        this.f626c = executor;
        Method method2 = g1.c.f1143a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = g1.c.f1143a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f626c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof E) && ((E) obj).f626c == this.f626c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f626c);
    }

    @Override // b1.AbstractC0028p
    public final void l(M0.i iVar, Runnable runnable) {
        try {
            this.f626c.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            J j2 = (J) iVar.i(C0029q.f679b);
            if (j2 != null) {
                j2.a(cancellationException);
            }
            AbstractC0035x.f694b.l(iVar, runnable);
        }
    }

    @Override // b1.AbstractC0028p
    public final String toString() {
        return this.f626c.toString();
    }
}
