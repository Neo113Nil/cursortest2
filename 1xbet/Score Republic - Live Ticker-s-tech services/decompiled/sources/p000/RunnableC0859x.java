package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: renamed from: x */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0859x implements Runnable {

    /* JADX INFO: renamed from: j */
    public final AbstractC0269h0 f8725j;

    /* JADX INFO: renamed from: k */
    public final ListenableFuture f8726k;

    public RunnableC0859x(AbstractC0269h0 abstractC0269h0, ListenableFuture listenableFuture) {
        this.f8725j = abstractC0269h0;
        this.f8726k = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f8725j.f2977j != this) {
            return;
        }
        if (AbstractC0269h0.f2975o.mo1541d(this.f8725j, this, AbstractC0269h0.m2173h(this.f8726k))) {
            AbstractC0269h0.m2170e(this.f8725j, false);
        }
    }
}
