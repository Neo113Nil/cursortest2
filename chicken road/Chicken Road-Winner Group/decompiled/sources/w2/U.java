package w2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class U extends B2.k implements C, L, o2.l {

    /* renamed from: d, reason: collision with root package name */
    public Z f10479d;

    @Override // w2.L
    public final boolean a() {
        return true;
    }

    @Override // w2.L
    public final a0 c() {
        return null;
    }

    @Override // w2.C
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Z i3 = i();
        while (true) {
            Object C2 = i3.C();
            if (C2 instanceof U) {
                if (C2 != this) {
                    return;
                }
                E e3 = AbstractC1242v.f10533i;
                do {
                    atomicReferenceFieldUpdater2 = Z.f10492a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(i3, C2, e3)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(i3) == C2);
            } else {
                if (!(C2 instanceof L) || ((L) C2).c() == null) {
                    return;
                }
                while (true) {
                    Object f = f();
                    if (f instanceof B2.q) {
                        B2.k kVar = ((B2.q) f).f178a;
                        return;
                    }
                    if (f == this) {
                        return;
                    }
                    kotlin.jvm.internal.j.c(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    B2.k kVar2 = (B2.k) f;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = B2.k.f168c;
                    B2.q qVar = (B2.q) atomicReferenceFieldUpdater3.get(kVar2);
                    if (qVar == null) {
                        qVar = new B2.q(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, qVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = B2.k.f166a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, f, qVar)) {
                            kVar2.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == f);
                }
            }
        }
    }

    public P getParent() {
        return i();
    }

    public final Z i() {
        Z z3 = this.f10479d;
        if (z3 != null) {
            return z3;
        }
        kotlin.jvm.internal.j.g("job");
        throw null;
    }

    public abstract void j(Throwable th);

    @Override // B2.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC1242v.c(this) + "[job@" + AbstractC1242v.c(i()) + ']';
    }
}
