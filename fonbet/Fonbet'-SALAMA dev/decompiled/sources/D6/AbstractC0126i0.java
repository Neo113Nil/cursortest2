package D6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;

/* renamed from: D6.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0126i0 extends I6.k implements O, InterfaceC0112b0, Function1 {

    /* renamed from: d, reason: collision with root package name */
    public s0 f1842d;

    @Override // D6.InterfaceC0112b0
    public final u0 c() {
        return null;
    }

    @Override // D6.O
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        s0 i7 = i();
        while (true) {
            Object x4 = i7.x();
            if (x4 instanceof AbstractC0126i0) {
                if (x4 != this) {
                    return;
                }
                Q q7 = E.j;
                do {
                    atomicReferenceFieldUpdater2 = s0.f1874a;
                    if (atomicReferenceFieldUpdater2.compareAndSet(i7, x4, q7)) {
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(i7) == x4);
            } else {
                if (!(x4 instanceof InterfaceC0112b0) || ((InterfaceC0112b0) x4).c() == null) {
                    return;
                }
                while (true) {
                    Object f7 = f();
                    if (f7 instanceof I6.r) {
                        I6.k kVar = ((I6.r) f7).f3756a;
                        return;
                    }
                    if (f7 == this) {
                        return;
                    }
                    t6.h.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                    I6.k kVar2 = (I6.k) f7;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = I6.k.f3742c;
                    I6.r rVar = (I6.r) atomicReferenceFieldUpdater3.get(kVar2);
                    if (rVar == null) {
                        rVar = new I6.r(kVar2);
                        atomicReferenceFieldUpdater3.lazySet(kVar2, rVar);
                    }
                    do {
                        atomicReferenceFieldUpdater = I6.k.f3740a;
                        if (atomicReferenceFieldUpdater.compareAndSet(this, f7, rVar)) {
                            kVar2.d();
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == f7);
                }
            }
        }
    }

    public InterfaceC0118e0 getParent() {
        return i();
    }

    public final s0 i() {
        s0 s0Var = this.f1842d;
        if (s0Var != null) {
            return s0Var;
        }
        t6.h.h("job");
        throw null;
    }

    @Override // D6.InterfaceC0112b0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override // I6.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + E.i(this) + "[job@" + E.i(i()) + ']';
    }
}
