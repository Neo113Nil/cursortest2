package D6;

import i6.InterfaceC1292i;
import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class Z extends Y implements J {

    /* renamed from: c, reason: collision with root package name */
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
    public final O a(long j, E0 e02, InterfaceC1292i interfaceC1292i) {
        Executor executor = this.f1815c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(e02, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) interfaceC1292i.get(B.f1775b);
                if (interfaceC0118e0 != null) {
                    interfaceC0118e0.cancel(cancellationException);
                }
            }
        }
        return scheduledFuture != null ? new N(scheduledFuture) : F.f1788A.a(j, e02, interfaceC1292i);
    }

    @Override // D6.J
    public final void c(long j, C0130m c0130m) {
        Executor executor = this.f1815c;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(new y0(0, this, c0130m), j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e7) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e7);
                InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) c0130m.f1858e.get(B.f1775b);
                if (interfaceC0118e0 != null) {
                    interfaceC0118e0.cancel(cancellationException);
                }
            }
        }
        if (scheduledFuture != null) {
            c0130m.u(new C0127j(scheduledFuture, 0));
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
    public final void d(InterfaceC1292i interfaceC1292i, Runnable runnable) {
        try {
            this.f1815c.execute(runnable);
        } catch (RejectedExecutionException e7) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e7);
            InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) interfaceC1292i.get(B.f1775b);
            if (interfaceC0118e0 != null) {
                interfaceC0118e0.cancel(cancellationException);
            }
            M.f1797b.d(interfaceC1292i, runnable);
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
