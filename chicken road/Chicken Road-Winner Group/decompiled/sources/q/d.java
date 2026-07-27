package q;

import a.AbstractC0086a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class d extends AbstractC0086a {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10244b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10245c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10246d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f10247e;
    public final AtomicReferenceFieldUpdater f;

    public d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f10244b = atomicReferenceFieldUpdater;
        this.f10245c = atomicReferenceFieldUpdater2;
        this.f10246d = atomicReferenceFieldUpdater3;
        this.f10247e = atomicReferenceFieldUpdater4;
        this.f = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0086a
    public final void K(f fVar, f fVar2) {
        this.f10245c.lazySet(fVar, fVar2);
    }

    @Override // a.AbstractC0086a
    public final void L(f fVar, Thread thread) {
        this.f10244b.lazySet(fVar, thread);
    }

    @Override // a.AbstractC0086a
    public final boolean e(g gVar, C1169c c1169c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1169c c1169c2 = C1169c.f10242b;
        do {
            atomicReferenceFieldUpdater = this.f10247e;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c1169c, c1169c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c1169c);
        return false;
    }

    @Override // a.AbstractC0086a
    public final boolean f(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0086a
    public final boolean g(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f10246d;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }
}
