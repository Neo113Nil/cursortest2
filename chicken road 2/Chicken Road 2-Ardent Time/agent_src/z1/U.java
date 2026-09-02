package z1;

/* loaded from: classes.dex */
public abstract class U extends E1.k implements z1.C, z1.L, s1.l {

    /* renamed from: d, reason: collision with root package name */
    public z1.Z f8541d;

    @Override // z1.C
    public final void a() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        z1.Z j2 = j();
        while (true) {
            java.lang.Object D2 = j2.D();
            if (D2 instanceof z1.U) {
                if (D2 != this) {
                    return;
                }
                z1.E e2 = z1.AbstractC1068v.f8601i;
                do {
                    atomicReferenceFieldUpdater2 = z1.Z.f8555a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(j2, D2, e2)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(j2) == D2);
            } else {
                if (!(D2 instanceof z1.L) || ((z1.L) D2).d() == null) {
                    return;
                }
                while (true) {
                    java.lang.Object g2 = g();
                    if (g2 instanceof E1.r) {
                        E1.k kVar = ((E1.r) g2).f300a;
                        return;
                    }
                    if (g2 == this) {
                        return;
                    }
                    kotlin.jvm.internal.i.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    E1.k kVar2 = (E1.k) g2;
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = E1.k.f286c;
                    E1.r rVar = (E1.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new E1.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = E1.k.f284a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, g2, rVar)) {
                            kVar2.e();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == g2);
                }
            }
        }
    }

    @Override // z1.L
    public final boolean b() {
        return true;
    }

    @Override // z1.L
    public final z1.a0 d() {
        return null;
    }

    public z1.P getParent() {
        return j();
    }

    public final z1.Z j() {
        z1.Z z2 = this.f8541d;
        if (z2 != null) {
            return z2;
        }
        kotlin.jvm.internal.i.i("job");
        throw null;
    }

    public abstract void k(java.lang.Throwable th);

    @Override // E1.k
    public final java.lang.String toString() {
        return getClass().getSimpleName() + '@' + z1.AbstractC1068v.b(this) + "[job@" + z1.AbstractC1068v.b(j()) + ']';
    }
}
