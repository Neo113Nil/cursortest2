package I6;

import D6.E;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3740a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3741b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3742c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final k d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3741b;
            k kVar = (k) atomicReferenceFieldUpdater2.get(this);
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f3740a;
                    obj = atomicReferenceFieldUpdater.get(kVar2);
                    if (obj == this) {
                        if (kVar == kVar2) {
                            return kVar2;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, kVar, kVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != kVar) {
                                break;
                            }
                        }
                        return kVar2;
                    }
                    if (h()) {
                        return null;
                    }
                    if (obj == null) {
                        return kVar2;
                    }
                    if (obj instanceof q) {
                        ((q) obj).a(kVar2);
                        break;
                    }
                    if (!(obj instanceof r)) {
                        t6.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar2;
                        kVar2 = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (k) atomicReferenceFieldUpdater2.get(kVar2);
                    }
                }
                k kVar4 = ((r) obj).f3756a;
                while (!atomicReferenceFieldUpdater.compareAndSet(kVar3, kVar2, kVar4)) {
                    if (atomicReferenceFieldUpdater.get(kVar3) != kVar2) {
                        break;
                    }
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3741b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (f() != kVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                    if (h()) {
                        kVar.d();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(kVar) == kVar2);
        }
    }

    public final Object f() {
        while (true) {
            Object obj = f3740a.get(this);
            if (!(obj instanceof q)) {
                return obj;
            }
            ((q) obj).a(this);
        }
    }

    public final k g() {
        k kVar;
        Object objF = f();
        r rVar = objF instanceof r ? (r) objF : null;
        if (rVar != null && (kVar = rVar.f3756a) != null) {
            return kVar;
        }
        t6.h.c(objF, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) objF;
    }

    public boolean h() {
        return f() instanceof r;
    }

    public String toString() {
        return new j(this, E.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + E.i(this);
    }
}
