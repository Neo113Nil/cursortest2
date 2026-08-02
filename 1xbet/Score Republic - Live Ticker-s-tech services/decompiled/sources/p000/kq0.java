package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kq0 extends m80 implements ScheduledFuture, ListenableFuture, Future {

    /* JADX INFO: renamed from: p */
    public final AbstractC0269h0 f4498p;

    /* JADX INFO: renamed from: q */
    public final ScheduledFuture f4499q;

    public kq0(AbstractC0269h0 abstractC0269h0, ScheduledFuture scheduledFuture) {
        super(6);
        this.f4498p = abstractC0269h0;
        this.f4499q = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: c */
    public final void mo995c(Runnable runnable, Executor executor) {
        this.f4498p.mo995c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zM3069q = m3069q(z);
        if (zM3069q) {
            this.f4499q.cancel(z);
        }
        return zM3069q;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4499q.compareTo(delayed);
    }

    @Override // p000.m80
    /* JADX INFO: renamed from: g */
    public final Object mo3068g() {
        return this.f4498p;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f4498p.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4499q.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4498p.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4498p.isDone();
    }

    /* JADX INFO: renamed from: q */
    public final boolean m3069q(boolean z) {
        return this.f4498p.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f4498p.get(j, timeUnit);
    }
}
