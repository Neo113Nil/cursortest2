package m0;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* loaded from: classes.dex */
public final class F extends E implements InterfaceC0065w {

    /* renamed from: d, reason: collision with root package name */
    public final Executor f892d;

    public F(Executor executor) {
        Method method;
        this.f892d = executor;
        Method method2 = r0.c.f1162a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = r0.c.f1162a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f892d;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof F) && ((F) obj).f892d == this.f892d;
    }

    @Override // m0.AbstractC0059p
    public final void f(Y.i iVar, Runnable runnable) {
        try {
            this.f892d.execute(runnable);
        } catch (RejectedExecutionException e2) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e2);
            K k2 = (K) iVar.d(C0060q.f943c);
            if (k2 != null) {
                k2.a(cancellationException);
            }
            AbstractC0067y.f958b.f(iVar, runnable);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f892d);
    }

    @Override // m0.AbstractC0059p
    public final String toString() {
        return this.f892d.toString();
    }
}
