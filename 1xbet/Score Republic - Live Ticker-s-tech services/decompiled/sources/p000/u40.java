package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u40 extends b40 {

    /* JADX INFO: renamed from: r */
    public final ListenableFuture f7670r;

    public u40(ListenableFuture listenableFuture) {
        this.f7670r = listenableFuture;
    }

    @Override // p000.AbstractC0269h0, com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: c */
    public final void mo995c(Runnable runnable, Executor executor) {
        this.f7670r.mo995c(runnable, executor);
    }

    @Override // p000.AbstractC0269h0, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f7670r.cancel(z);
    }

    @Override // p000.AbstractC0269h0, java.util.concurrent.Future
    public final Object get() {
        return this.f7670r.get();
    }

    @Override // p000.AbstractC0269h0, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f7670r.isCancelled();
    }

    @Override // p000.AbstractC0269h0, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f7670r.isDone();
    }

    @Override // p000.AbstractC0269h0
    public final String toString() {
        return this.f7670r.toString();
    }

    @Override // p000.AbstractC0269h0, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f7670r.get(j, timeUnit);
    }
}
