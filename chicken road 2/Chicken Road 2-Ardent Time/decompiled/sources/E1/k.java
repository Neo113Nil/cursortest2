package E1;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f284a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.k.class, java.lang.Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f285b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.k.class, java.lang.Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f286c = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(E1.k.class, java.lang.Object.class, "_removedRef");
    private volatile java.lang.Object _next = this;
    private volatile java.lang.Object _prev = this;
    private volatile java.lang.Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((E1.r) r6).f300a;
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
    public final E1.k e() {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f285b;
            E1.k kVar = (E1.k) atomicReferenceFieldUpdater.get(this);
            E1.k kVar2 = kVar;
            while (true) {
                E1.k kVar3 = null;
                while (true) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f284a;
                    java.lang.Object obj = atomicReferenceFieldUpdater2.get(kVar2);
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
                    if (i()) {
                        return null;
                    }
                    if (obj == null) {
                        return kVar2;
                    }
                    if (obj instanceof E1.q) {
                        ((E1.q) obj).a(kVar2);
                        break;
                    }
                    if (!(obj instanceof E1.r)) {
                        kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar2;
                        kVar2 = (E1.k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar2 = (E1.k) atomicReferenceFieldUpdater.get(kVar2);
                    }
                }
                kVar2 = kVar3;
            }
        }
    }

    public final void f(E1.k kVar) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f285b;
            E1.k kVar2 = (E1.k) atomicReferenceFieldUpdater.get(kVar);
            if (g() != kVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                if (atomicReferenceFieldUpdater.get(kVar) != kVar2) {
                    break;
                }
            }
            if (i()) {
                kVar.e();
                return;
            }
            return;
        }
    }

    public final java.lang.Object g() {
        while (true) {
            java.lang.Object obj = f284a.get(this);
            if (!(obj instanceof E1.q)) {
                return obj;
            }
            ((E1.q) obj).a(this);
        }
    }

    public final E1.k h() {
        E1.k kVar;
        java.lang.Object g2 = g();
        E1.r rVar = g2 instanceof E1.r ? (E1.r) g2 : null;
        if (rVar != null && (kVar = rVar.f300a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.i.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (E1.k) g2;
    }

    public boolean i() {
        return g() instanceof E1.r;
    }

    public java.lang.String toString() {
        return new E1.j(this, z1.AbstractC1068v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + z1.AbstractC1068v.b(this);
    }
}
