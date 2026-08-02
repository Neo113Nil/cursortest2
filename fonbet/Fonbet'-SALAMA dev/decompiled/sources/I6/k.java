package I6;

import D6.E;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes2.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3740a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3741b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3742c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((I6.r) r6).f3756a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r5.get(r4) == r3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final k d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3741b;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            k kVar2 = kVar;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3740a;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar2);
                    if (obj == this) {
                        if (kVar == kVar2) {
                            return kVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar, kVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != kVar) {
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
                        kVar2 = (k) atomicReferenceFieldUpdater.get(kVar2);
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
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (h()) {
                kVar.d();
                return;
            }
            return;
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
        Object f7 = f();
        r rVar = f7 instanceof r ? (r) f7 : null;
        if (rVar != null && (kVar = rVar.f3756a) != null) {
            return kVar;
        }
        t6.h.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f7;
    }

    public boolean h() {
        return f() instanceof r;
    }

    public String toString() {
        return new j(this, E.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + E.i(this);
    }
}
