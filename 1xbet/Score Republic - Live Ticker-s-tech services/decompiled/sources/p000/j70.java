package p000;

import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class j70 extends AbstractC0001a0 implements Runnable {

    /* JADX INFO: renamed from: q */
    public ListenableFuture f3832q;

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: b */
    public final void mo549b() {
        this.f3832q = null;
    }

    @Override // p000.AbstractC0269h0
    /* JADX INFO: renamed from: j */
    public final String mo550j() {
        ListenableFuture listenableFuture = this.f3832q;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f3832q;
        if (listenableFuture != null) {
            m2179n(listenableFuture);
        }
    }
}
