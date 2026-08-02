package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y61 extends AbstractC0875xf {

    /* JADX INFO: renamed from: i */
    public final AtomicIntegerFieldUpdater f9188i;

    public y61(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f9188i = atomicIntegerFieldUpdater;
    }

    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: n */
    public final boolean mo5657n(a71 a71Var) {
        return this.f9188i.compareAndSet(a71Var, 0, -1);
    }

    @Override // p000.AbstractC0875xf
    /* JADX INFO: renamed from: o */
    public final void mo5658o(a71 a71Var) {
        this.f9188i.set(a71Var, 0);
    }
}
