package m0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class O extends r0.l implements InterfaceC0068z, H, f0.l {

    /* renamed from: e, reason: collision with root package name */
    public T f899e;

    @Override // m0.H
    public final boolean b() {
        return true;
    }

    @Override // m0.InterfaceC0068z
    public final void c() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        T n2 = n();
        while (true) {
            Object y2 = n2.y();
            if (y2 instanceof O) {
                if (y2 != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T.f912b;
                A a2 = AbstractC0062t.f952i;
                while (!atomicReferenceFieldUpdater2.compareAndSet(n2, y2, a2)) {
                    if (atomicReferenceFieldUpdater2.get(n2) != y2) {
                        break;
                    }
                }
                return;
            }
            if (!(y2 instanceof H) || ((H) y2).f() == null) {
                return;
            }
            while (true) {
                Object k2 = k();
                if (k2 instanceof r0.s) {
                    r0.l lVar = ((r0.s) k2).f1194a;
                    return;
                }
                if (k2 == this) {
                    return;
                }
                g0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                r0.l lVar2 = (r0.l) k2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = r0.l.f1183d;
                r0.s sVar = (r0.s) atomicReferenceFieldUpdater3.get(lVar2);
                if (sVar == null) {
                    sVar = new r0.s(lVar2);
                    atomicReferenceFieldUpdater3.lazySet(lVar2, sVar);
                }
                do {
                    atomicReferenceFieldUpdater = r0.l.f1181b;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, k2, sVar)) {
                        lVar2.h();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == k2);
            }
        }
    }

    @Override // m0.H
    public final U f() {
        return null;
    }

    public final T n() {
        T t2 = this.f899e;
        if (t2 != null) {
            return t2;
        }
        C.c cVar = new C.c("lateinit property job has not been initialized");
        g0.h.f(cVar, g0.h.class.getName());
        throw cVar;
    }

    public abstract void o(Throwable th);

    @Override // r0.l
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0062t.a(this) + "[job@" + AbstractC0062t.a(n()) + ']';
    }
}
