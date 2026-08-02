package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class B0 extends kotlinx.coroutines.internal.m implements InterfaceC1053e0, InterfaceC1110s0 {
    public C0 d;

    @Override // kotlinx.coroutines.InterfaceC1110s0
    public final I0 b() {
        return null;
    }

    @Override // kotlinx.coroutines.InterfaceC1053e0
    public final void dispose() {
        C0 h = h();
        h.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0.a;
            Object obj = atomicReferenceFieldUpdater.get(h);
            if (obj instanceof B0) {
                if (obj != this) {
                    return;
                }
                while (!atomicReferenceFieldUpdater.compareAndSet(h, obj, F0.g)) {
                    if (atomicReferenceFieldUpdater.get(h) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1110s0) || ((InterfaceC1110s0) obj).b() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = kotlinx.coroutines.internal.m.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof kotlinx.coroutines.internal.r) {
                    kotlinx.coroutines.internal.m mVar = ((kotlinx.coroutines.internal.r) obj2).a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                kotlinx.coroutines.internal.m mVar2 = (kotlinx.coroutines.internal.m) obj2;
                mVar2.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = kotlinx.coroutines.internal.m.c;
                kotlinx.coroutines.internal.r rVar = (kotlinx.coroutines.internal.r) atomicReferenceFieldUpdater3.get(mVar2);
                if (rVar == null) {
                    rVar = new kotlinx.coroutines.internal.r(mVar2);
                    atomicReferenceFieldUpdater3.set(mVar2, rVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, rVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                mVar2.d();
                return;
            }
        }
    }

    public InterfaceC1120x0 getParent() {
        return h();
    }

    public final C0 h() {
        C0 c0 = this.d;
        if (c0 != null) {
            return c0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("job");
        return null;
    }

    public abstract boolean i();

    @Override // kotlinx.coroutines.InterfaceC1110s0
    public final boolean isActive() {
        return true;
    }

    public abstract void j(Throwable th);

    @Override // kotlinx.coroutines.internal.m
    public final String toString() {
        return getClass().getSimpleName() + '@' + O.a(this) + "[job@" + O.a(h()) + ']';
    }
}
