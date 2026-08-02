package p000;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0345j3 extends wm1 {

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f3800d;

    /* JADX INFO: renamed from: e */
    public final AtomicIntegerFieldUpdater f3801e;

    public C0345j3(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f3800d = atomicReferenceFieldUpdater;
        this.f3801e = atomicIntegerFieldUpdater;
    }

    @Override // p000.wm1
    /* JADX INFO: renamed from: b */
    public final void mo2818b(C0915yi c0915yi, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f3800d;
            if (atomicReferenceFieldUpdater.compareAndSet(c0915yi, null, set)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(c0915yi) == null);
    }

    @Override // p000.wm1
    /* JADX INFO: renamed from: e */
    public final int mo2819e(C0915yi c0915yi) {
        return this.f3801e.decrementAndGet(c0915yi);
    }
}
