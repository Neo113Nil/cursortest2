package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k4.AbstractC2036a;

/* renamed from: b1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0504e extends AbstractC2036a {

    /* renamed from: p, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7192p;

    /* renamed from: q, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7193q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7194r;

    /* renamed from: s, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7195s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f7196t;

    public C0504e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f7192p = atomicReferenceFieldUpdater;
        this.f7193q = atomicReferenceFieldUpdater2;
        this.f7194r = atomicReferenceFieldUpdater3;
        this.f7195s = atomicReferenceFieldUpdater4;
        this.f7196t = atomicReferenceFieldUpdater5;
    }

    @Override // k4.AbstractC2036a
    public final void Q(C0506g c0506g, C0506g c0506g2) {
        this.f7193q.lazySet(c0506g, c0506g2);
    }

    @Override // k4.AbstractC2036a
    public final void R(C0506g c0506g, Thread thread) {
        this.f7192p.lazySet(c0506g, thread);
    }

    @Override // k4.AbstractC2036a
    public final boolean k(AbstractC0507h abstractC0507h, C0503d c0503d, C0503d c0503d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7195s;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0507h, c0503d, c0503d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0507h) == c0503d);
        return false;
    }

    @Override // k4.AbstractC2036a
    public final boolean l(AbstractC0507h abstractC0507h, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7196t;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0507h, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0507h) == obj);
        return false;
    }

    @Override // k4.AbstractC2036a
    public final boolean m(AbstractC0507h abstractC0507h, C0506g c0506g, C0506g c0506g2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f7194r;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC0507h, c0506g, c0506g2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC0507h) == c0506g);
        return false;
    }
}
