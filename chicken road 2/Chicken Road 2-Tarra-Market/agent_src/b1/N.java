package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class N extends g1.k implements InterfaceC0036y, G, U0.l {

    /* renamed from: d, reason: collision with root package name */
    public S f633d;

    @Override // b1.InterfaceC0036y
    public final void a() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        S j2 = j();
        while (true) {
            Object x2 = j2.x();
            if (x2 instanceof N) {
                if (x2 != this) {
                    return;
                }
                C0037z c0037z = AbstractC0030s.f688i;
                do {
                    atomicReferenceFieldUpdater2 = S.f646a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(j2, x2, c0037z)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(j2) == x2);
            } else {
                if (!(x2 instanceof G) || ((G) x2).d() == null) {
                    return;
                }
                while (true) {
                    Object g2 = g();
                    if (g2 instanceof g1.r) {
                        g1.k kVar = ((g1.r) g2).f1176a;
                        return;
                    }
                    if (g2 == this) {
                        return;
                    }
                    kotlin.jvm.internal.j.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    g1.k kVar2 = (g1.k) g2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = g1.k.f1162c;
                    g1.r rVar = (g1.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new g1.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = g1.k.f1160a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, g2, rVar)) {
                            kVar2.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == g2);
                }
            }
        }
    }

    @Override // b1.G
    public final boolean b() {
        return true;
    }

    @Override // b1.G
    public final T d() {
        return null;
    }

    public final S j() {
        S s2 = this.f633d;
        if (s2 != null) {
            return s2;
        }
        kotlin.jvm.internal.j.g("job");
        throw null;
    }

    public abstract void k(Throwable th);

    @Override // g1.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0030s.a(this) + "[job@" + AbstractC0030s.a(j()) + ']';
    }
}
