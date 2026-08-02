package p000;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: je */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0356je implements ListenableFuture {

    /* JADX INFO: renamed from: j */
    public final WeakReference f3910j;

    /* JADX INFO: renamed from: k */
    public final C0320ie f3911k = new C0320ie(this);

    public C0356je(C0283he c0283he) {
        this.f3910j = new WeakReference(c0283he);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    /* JADX INFO: renamed from: c */
    public final void mo995c(Runnable runnable, Executor executor) {
        this.f3911k.mo995c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        C0283he c0283he = (C0283he) this.f3910j.get();
        boolean zCancel = this.f3911k.cancel(z);
        if (zCancel && c0283he != null) {
            c0283he.f3180a = null;
            c0283he.f3181b = null;
            c0283he.f3182c.m5018j(null);
        }
        return zCancel;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f3911k.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f3911k.f7980j instanceof C0564p0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f3911k.isDone();
    }

    public final String toString() {
        return this.f3911k.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f3911k.get(j, timeUnit);
    }
}
