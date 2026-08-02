package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* renamed from: kotlinx.coroutines.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1101n0 extends AbstractC1099m0 implements U {
    public final Executor a;

    public C1101n0(Executor executor) {
        this.a = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // kotlinx.coroutines.U
    public final void H(long j, C1100n c1100n) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            P0 p0 = new P0(this, c1100n);
            CoroutineContext coroutineContext = c1100n.e;
            try {
                scheduledFuture = scheduledExecutorService.schedule(p0, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                com.google.common.base.r.b(coroutineContext, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            c1100n.u(new C1092j(scheduledFuture));
        } else {
            P.j.H(j, c1100n);
        }
    }

    @Override // kotlinx.coroutines.AbstractC1099m0
    public final Executor W() {
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.a;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.U
    public final InterfaceC1053e0 d(long j, W0 w0, CoroutineContext coroutineContext) {
        Executor executor = this.a;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(w0, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                com.google.common.base.r.b(coroutineContext, cancellationException);
            }
        }
        return scheduledFuture != null ? new C1051d0(scheduledFuture) : P.j.d(j, w0, coroutineContext);
    }

    @Override // kotlinx.coroutines.I
    public final void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            this.a.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            com.google.common.base.r.b(coroutineContext, cancellationException);
            kotlinx.coroutines.scheduling.c cVar = C1049c0.a;
            kotlinx.coroutines.scheduling.b.a.dispatch(coroutineContext, runnable);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1101n0) && ((C1101n0) obj).a == this.a;
    }

    public final int hashCode() {
        return System.identityHashCode(this.a);
    }

    @Override // kotlinx.coroutines.I
    public final String toString() {
        return this.a.toString();
    }
}
