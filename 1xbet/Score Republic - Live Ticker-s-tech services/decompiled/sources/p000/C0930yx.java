package p000;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* JADX INFO: renamed from: yx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0930yx extends AbstractC0893xx implements InterfaceC0665rr {

    /* JADX INFO: renamed from: l */
    public final Executor f9523l;

    public C0930yx(Executor executor) {
        this.f9523l = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f9523l;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0930yx) && ((C0930yx) obj).f9523l == this.f9523l;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f9523l);
    }

    @Override // p000.AbstractC0292hn
    /* JADX INFO: renamed from: o */
    public final void mo1225o(InterfaceC0180en interfaceC0180en, Runnable runnable) {
        try {
            this.f9523l.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ag0 ag0Var = (ag0) interfaceC0180en.mo1466j(wa0.f8474n);
            if (ag0Var != null) {
                ag0Var.mo204e(cancellationException);
            }
            C0960zq c0960zq = AbstractC0815vt.f8261a;
            ExecutorC0701sq.f7187l.mo1225o(interfaceC0180en, runnable);
        }
    }

    @Override // p000.AbstractC0292hn
    public final String toString() {
        return this.f9523l.toString();
    }
}
