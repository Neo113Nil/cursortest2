package s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends K1.b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f11733a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f11734b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f11735c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f11736d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f11737e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f11733a = atomicReferenceFieldUpdater;
        this.f11734b = atomicReferenceFieldUpdater2;
        this.f11735c = atomicReferenceFieldUpdater3;
        this.f11736d = atomicReferenceFieldUpdater4;
        this.f11737e = atomicReferenceFieldUpdater5;
    }

    @Override // K1.b
    public final boolean F(g gVar, C1411c c1411c, C1411c c1411c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f11736d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c1411c, c1411c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c1411c);
        return false;
    }

    @Override // K1.b
    public final boolean H(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f11737e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // K1.b
    public final boolean J(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f11735c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // K1.b
    public final void c0(f fVar, f fVar2) {
        this.f11734b.lazySet(fVar, fVar2);
    }

    @Override // K1.b
    public final void e0(f fVar, Thread thread) {
        this.f11733a.lazySet(fVar, thread);
    }
}
