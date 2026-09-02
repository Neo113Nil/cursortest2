package g;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends V.a {

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1055c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1056d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1057e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1058f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f1059g;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f1055c = atomicReferenceFieldUpdater;
        this.f1056d = atomicReferenceFieldUpdater2;
        this.f1057e = atomicReferenceFieldUpdater3;
        this.f1058f = atomicReferenceFieldUpdater4;
        this.f1059g = atomicReferenceFieldUpdater5;
    }

    @Override // V.a
    public final boolean f(g gVar, c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        c cVar2 = c.f1053b;
        do {
            atomicReferenceFieldUpdater = this.f1058f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // V.a
    public final boolean g(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1059g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // V.a
    public final boolean h(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f1057e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // V.a
    public final void v(f fVar, f fVar2) {
        this.f1056d.lazySet(fVar, fVar2);
    }

    @Override // V.a
    public final void w(f fVar, Thread thread) {
        this.f1055c.lazySet(fVar, thread);
    }
}
