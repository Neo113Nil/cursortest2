package s;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p6.AbstractC1539a;

/* loaded from: classes.dex */
public final class d extends AbstractC1539a {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16069a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16070b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16071c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16072d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f16073e;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f16069a = atomicReferenceFieldUpdater;
        this.f16070b = atomicReferenceFieldUpdater2;
        this.f16071c = atomicReferenceFieldUpdater3;
        this.f16072d = atomicReferenceFieldUpdater4;
        this.f16073e = atomicReferenceFieldUpdater5;
    }

    @Override // p6.AbstractC1539a
    public final boolean b(g gVar, c cVar, c cVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f16072d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, cVar, cVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == cVar);
        return false;
    }

    @Override // p6.AbstractC1539a
    public final boolean c(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f16073e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // p6.AbstractC1539a
    public final boolean d(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f16071c;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // p6.AbstractC1539a
    public final void f(f fVar, f fVar2) {
        this.f16070b.lazySet(fVar, fVar2);
    }

    @Override // p6.AbstractC1539a
    public final void g(f fVar, Thread thread) {
        this.f16069a.lazySet(fVar, thread);
    }
}
