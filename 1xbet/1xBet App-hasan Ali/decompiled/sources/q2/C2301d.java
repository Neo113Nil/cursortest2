package q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r3.AbstractC2349a;

/* renamed from: q2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2301d extends AbstractC2349a {

    /* renamed from: n, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18867n;

    /* renamed from: o, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18868o;

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18869p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18870q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f18871r;

    public C2301d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f18867n = atomicReferenceFieldUpdater;
        this.f18868o = atomicReferenceFieldUpdater2;
        this.f18869p = atomicReferenceFieldUpdater3;
        this.f18870q = atomicReferenceFieldUpdater4;
        this.f18871r = atomicReferenceFieldUpdater5;
    }

    @Override // r3.AbstractC2349a
    public final void J(C2304g c2304g, C2304g c2304g2) {
        this.f18868o.lazySet(c2304g, c2304g2);
    }

    @Override // r3.AbstractC2349a
    public final void K(C2304g c2304g, Thread thread) {
        this.f18867n.lazySet(c2304g, thread);
    }

    @Override // r3.AbstractC2349a
    public final boolean o(AbstractC2305h abstractC2305h, C2300c c2300c, C2300c c2300c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18870q;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2305h, c2300c, c2300c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2305h) == c2300c);
        return false;
    }

    @Override // r3.AbstractC2349a
    public final boolean p(AbstractC2305h abstractC2305h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18871r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2305h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2305h) == obj);
        return false;
    }

    @Override // r3.AbstractC2349a
    public final boolean q(AbstractC2305h abstractC2305h, C2304g c2304g, C2304g c2304g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f18869p;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC2305h, c2304g, c2304g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC2305h) == c2304g);
        return false;
    }
}
