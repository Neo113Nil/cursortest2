package o1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n3.AbstractC1464a;

/* renamed from: o1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1495e extends AbstractC1464a {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15554g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15555h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15556i;
    public final AtomicReferenceFieldUpdater j;

    /* renamed from: k, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f15557k;

    public C1495e(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f15554g = atomicReferenceFieldUpdater;
        this.f15555h = atomicReferenceFieldUpdater2;
        this.f15556i = atomicReferenceFieldUpdater3;
        this.j = atomicReferenceFieldUpdater4;
        this.f15557k = atomicReferenceFieldUpdater5;
    }

    @Override // n3.AbstractC1464a
    public final void N(C1498h c1498h, C1498h c1498h2) {
        this.f15555h.lazySet(c1498h, c1498h2);
    }

    @Override // n3.AbstractC1464a
    public final void O(C1498h c1498h, Thread thread) {
        this.f15554g.lazySet(c1498h, thread);
    }

    @Override // n3.AbstractC1464a
    public final boolean f(AbstractC1499i abstractC1499i, C1494d c1494d, C1494d c1494d2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.j;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1499i, c1494d, c1494d2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1499i) == c1494d);
        return false;
    }

    @Override // n3.AbstractC1464a
    public final boolean g(AbstractC1499i abstractC1499i, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15557k;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1499i, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1499i) == obj);
        return false;
    }

    @Override // n3.AbstractC1464a
    public final boolean h(AbstractC1499i abstractC1499i, C1498h c1498h, C1498h c1498h2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f15556i;
            if (atomicReferenceFieldUpdater.compareAndSet(abstractC1499i, c1498h, c1498h2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC1499i) == c1498h);
        return false;
    }
}
