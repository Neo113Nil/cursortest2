package D6;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Z extends Y implements J {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f1815c;

    public Z(Executor executor) {
        Method method;
        this.f1815c = executor;
        Method method2 = I6.c.f3723a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = I6.c.f3723a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // D6.J
    public final O a(long j, E0 e7, p065i6.i iVar) {
        Executor executor = this.f1815c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(e7, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e8) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e8);
                InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) iVar.get(B.f1775b);
                if (interfaceC0118e0 != null) {
                    interfaceC0118e0.cancel(cancellationException);
                }
            }
        }
        return scheduledFutureSchedule != null ? new N(scheduledFutureSchedule) : F.f1788A.a(j, e7, iVar);
    }

    @Override // D6.J
    public final void c(long j, C0130m c0130m) {
        Executor executor = this.f1815c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(new y0(0, this, c0130m), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c0130m.f1858e.get(B.f1775b);
                if (interfaceC0118e0 != null) {
                    interfaceC0118e0.cancel(cancellationException);
                }
            }
        }
        if (scheduledFutureSchedule != null) {
            c0130m.u(new C0127j(scheduledFutureSchedule, 0));
        } else {
            F.f1788A.c(j, c0130m);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f1815c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // D6.A
    public final void d(p065i6.i iVar, Runnable runnable) {
        try {
            this.f1815c.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) iVar.get(B.f1775b);
            if (interfaceC0118e0 != null) {
                interfaceC0118e0.cancel(cancellationException);
            }
            M.f1797b.d(iVar, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Z) && ((Z) obj).f1815c == this.f1815c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f1815c);
    }

    @Override // D6.A
    public final String toString() {
        return this.f1815c.toString();
    }
}
