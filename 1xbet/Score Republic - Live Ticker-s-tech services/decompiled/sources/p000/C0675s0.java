package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: s0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0675s0 extends hn0 {

    /* JADX INFO: renamed from: c */
    public final AtomicReferenceFieldUpdater f6997c;

    /* JADX INFO: renamed from: d */
    public final AtomicReferenceFieldUpdater f6998d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f6999e;

    /* JADX INFO: renamed from: f */
    public final AtomicReferenceFieldUpdater f7000f;

    /* JADX INFO: renamed from: g */
    public final AtomicReferenceFieldUpdater f7001g;

    public C0675s0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f6997c = atomicReferenceFieldUpdater;
        this.f6998d = atomicReferenceFieldUpdater2;
        this.f6999e = atomicReferenceFieldUpdater3;
        this.f7000f = atomicReferenceFieldUpdater4;
        this.f7001g = atomicReferenceFieldUpdater5;
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: d */
    public final boolean mo2324d(AbstractC0786v0 abstractC0786v0, C0638r0 c0638r0, C0638r0 c0638r1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7000f;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0786v0, c0638r0, c0638r1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0786v0) == c0638r0);
        return false;
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: e */
    public final boolean mo2325e(AbstractC0786v0 abstractC0786v0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7001g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0786v0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0786v0) == obj);
        return false;
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: f */
    public final boolean mo2326f(AbstractC0786v0 abstractC0786v0, C0749u0 c0749u0, C0749u0 c0749u1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f6999e;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0786v0, c0749u0, c0749u1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0786v0) == c0749u0);
        return false;
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: l */
    public final void mo2327l(C0749u0 c0749u0, C0749u0 c0749u1) {
        this.f6998d.lazySet(c0749u0, c0749u1);
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: m */
    public final void mo2328m(C0749u0 c0749u0, Thread thread) {
        this.f6997c.lazySet(c0749u0, thread);
    }
}
