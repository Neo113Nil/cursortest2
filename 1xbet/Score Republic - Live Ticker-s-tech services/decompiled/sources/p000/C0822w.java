package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: w */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0822w extends kd0 {

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceFieldUpdater f8311e;

    /* JADX INFO: renamed from: f */
    public final AtomicReferenceFieldUpdater f8312f;

    /* JADX INFO: renamed from: g */
    public final AtomicReferenceFieldUpdater f8313g;

    /* JADX INFO: renamed from: h */
    public final AtomicReferenceFieldUpdater f8314h;

    /* JADX INFO: renamed from: i */
    public final AtomicReferenceFieldUpdater f8315i;

    public C0822w(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8311e = atomicReferenceFieldUpdater;
        this.f8312f = atomicReferenceFieldUpdater2;
        this.f8313g = atomicReferenceFieldUpdater3;
        this.f8314h = atomicReferenceFieldUpdater4;
        this.f8315i = atomicReferenceFieldUpdater5;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: c */
    public final boolean mo1540c(AbstractC0269h0 abstractC0269h0, C0785v c0785v, C0785v c0785v2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8314h;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0269h0, c0785v, c0785v2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0269h0) == c0785v);
        return false;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: d */
    public final boolean mo1541d(AbstractC0269h0 abstractC0269h0, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8315i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0269h0, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0269h0) == obj);
        return false;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: e */
    public final boolean mo1542e(AbstractC0269h0 abstractC0269h0, C0231g0 c0231g0, C0231g0 c0231g1) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8313g;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0269h0, c0231g0, c0231g1)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0269h0) == c0231g0);
        return false;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: g */
    public final C0785v mo1543g(AbstractC0269h0 abstractC0269h0) {
        return (C0785v) this.f8314h.getAndSet(abstractC0269h0, C0785v.f7972d);
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: h */
    public final C0231g0 mo1544h(AbstractC0269h0 abstractC0269h0) {
        return (C0231g0) this.f8313g.getAndSet(abstractC0269h0, C0231g0.f2566c);
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: k */
    public final void mo1545k(C0231g0 c0231g0, C0231g0 c0231g1) {
        this.f8312f.lazySet(c0231g0, c0231g1);
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: l */
    public final void mo1546l(C0231g0 c0231g0, Thread thread) {
        this.f8311e.lazySet(c0231g0, thread);
    }
}
