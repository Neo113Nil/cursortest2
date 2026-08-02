package p4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class X extends u4.i implements E, O {

    /* renamed from: n, reason: collision with root package name */
    public b0 f18768n;

    @Override // p4.E
    public final void a() {
        b0 j5 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b0.f18780k;
            Object obj = atomicReferenceFieldUpdater.get(j5);
            if (obj instanceof X) {
                if (obj != this) {
                    return;
                }
                F f = AbstractC2282w.f18833j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j5, obj, f)) {
                    if (atomicReferenceFieldUpdater.get(j5) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof O) || ((O) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u4.i.f20098k;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof u4.n) {
                    u4.i iVar = ((u4.n) obj2).f20110a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
                u4.i iVar2 = (u4.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = u4.i.f20100m;
                u4.n nVar = (u4.n) atomicReferenceFieldUpdater3.get(iVar2);
                if (nVar == null) {
                    nVar = new u4.n(iVar2);
                    atomicReferenceFieldUpdater3.set(iVar2, nVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                iVar2.f();
                return;
            }
        }
    }

    @Override // p4.O
    public final boolean b() {
        return true;
    }

    @Override // p4.O
    public final d0 d() {
        return null;
    }

    public U getParent() {
        return j();
    }

    public final b0 j() {
        b0 b0Var = this.f18768n;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.l.k("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // u4.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC2282w.i(this) + "[job@" + AbstractC2282w.i(j()) + ']';
    }
}
