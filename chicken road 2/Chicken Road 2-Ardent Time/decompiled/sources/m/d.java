package m;

/* loaded from: classes.dex */
public final class d extends Q1.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8024a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8025b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8026c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8027d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8028e;

    public d(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f8024a = atomicReferenceFieldUpdater;
        this.f8025b = atomicReferenceFieldUpdater2;
        this.f8026c = atomicReferenceFieldUpdater3;
        this.f8027d = atomicReferenceFieldUpdater4;
        this.f8028e = atomicReferenceFieldUpdater5;
    }

    @Override // Q1.d
    public final boolean d(m.g gVar, m.c cVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m.c cVar2 = m.c.f8022b;
        do {
            atomicReferenceFieldUpdater = this.f8027d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // Q1.d
    public final boolean e(m.g gVar, java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8028e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // Q1.d
    public final boolean f(m.g gVar, m.f fVar, m.f fVar2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f8026c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // Q1.d
    public final void w(m.f fVar, m.f fVar2) {
        this.f8025b.lazySet(fVar, fVar2);
    }

    @Override // Q1.d
    public final void x(m.f fVar, java.lang.Thread thread) {
        this.f8024a.lazySet(fVar, thread);
    }
}
