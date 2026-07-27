package D4;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k4.InterfaceC1223i;

/* loaded from: classes.dex */
public final class Q extends P implements B {

    /* renamed from: c, reason: collision with root package name */
    public final Executor f479c;

    public Q(Executor executor) {
        Method method;
        this.f479c = executor;
        Method method2 = I4.c.f1287a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = I4.c.f1287a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // D4.AbstractC0020u
    public final void C(InterfaceC1223i interfaceC1223i, Runnable runnable) {
        try {
            this.f479c.execute(runnable);
        } catch (RejectedExecutionException e3) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e3);
            X x5 = (X) interfaceC1223i.o(C0021v.f545b);
            if (x5 != null) {
                x5.b(cancellationException);
            }
            E.f461c.C(interfaceC1223i, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f479c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Q) && ((Q) obj).f479c == this.f479c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f479c);
    }

    @Override // D4.B
    public final void p(long j2, C0007g c0007g) {
        Executor executor = this.f479c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new A0.a(this, c0007g, 5, false), j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                X x5 = (X) c0007g.f512e.o(C0021v.f545b);
                if (x5 != null) {
                    x5.b(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0007g.u(new C0005e(0, scheduledFuture));
        } else {
            RunnableC0025z.f560j.p(j2, c0007g);
        }
    }

    @Override // D4.AbstractC0020u
    public final String toString() {
        return this.f479c.toString();
    }

    @Override // D4.B
    public final G y(long j2, s0 s0Var, InterfaceC1223i interfaceC1223i) {
        Executor executor = this.f479c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(s0Var, j2, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e3) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e3);
                X x5 = (X) interfaceC1223i.o(C0021v.f545b);
                if (x5 != null) {
                    x5.b(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new F(scheduledFuture) : RunnableC0025z.f560j.y(j2, s0Var, interfaceC1223i);
    }
}
