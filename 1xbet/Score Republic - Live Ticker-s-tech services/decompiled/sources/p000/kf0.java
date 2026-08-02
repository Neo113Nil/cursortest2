package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class kf0 extends eg0 {

    /* JADX INFO: renamed from: i */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f4363i = AtomicIntegerFieldUpdater.newUpdater(kf0.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* JADX INFO: renamed from: h */
    public final dg0 f4364h;

    public kf0(dg0 dg0Var) {
        this.f4364h = dg0Var;
    }

    @Override // p000.eg0
    /* JADX INFO: renamed from: r */
    public final boolean mo1414r() {
        return true;
    }

    @Override // p000.eg0
    /* JADX INFO: renamed from: s */
    public final void mo1415s(Throwable th) {
        if (f4363i.compareAndSet(this, 0, 1)) {
            this.f4364h.mo170i(th);
        }
    }
}
