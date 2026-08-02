package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: tt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0741tt extends x51 {

    /* JADX INFO: renamed from: p */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7588p = AtomicIntegerFieldUpdater.newUpdater(C0741tt.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.x51, p000.ig0
    /* JADX INFO: renamed from: o */
    public final void mo2625o(Object obj) {
        mo2035p(obj);
    }

    @Override // p000.x51, p000.ig0
    /* JADX INFO: renamed from: p */
    public final void mo2035p(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f7588p;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    af0.m195j(d71.m1111f(this.f8793o), j22.m2817z(obj));
                    return;
                } else {
                    C0270h1.m2191g("Already resumed");
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
