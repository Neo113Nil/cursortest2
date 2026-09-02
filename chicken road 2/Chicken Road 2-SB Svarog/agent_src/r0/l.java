package r0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.AbstractC0062t;

/* loaded from: classes.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1181b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_next");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1182c = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_prev");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1183d = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((r0.s) r6).f1194a;
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
    public final l h() {
        l lVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1182c;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(this);
            lVar = lVar2;
            while (true) {
                l lVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1181b;
                    Object obj = atomicReferenceFieldUpdater2.get(lVar);
                    if (obj == this) {
                        if (lVar2 != lVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar2, lVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != lVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (m()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof r) {
                        ((r) obj).a(lVar);
                        break;
                    }
                    if (!(obj instanceof s)) {
                        g0.h.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        lVar3 = lVar;
                        lVar = (l) obj;
                    } else {
                        if (lVar3 != null) {
                            break;
                        }
                        lVar = (l) atomicReferenceFieldUpdater.get(lVar);
                    }
                }
                lVar = lVar3;
            }
        }
        return lVar;
    }

    public final void j(l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1182c;
            l lVar2 = (l) atomicReferenceFieldUpdater.get(lVar);
            if (k() != lVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(lVar, lVar2, this)) {
                if (atomicReferenceFieldUpdater.get(lVar) != lVar2) {
                    break;
                }
            }
            if (m()) {
                lVar.h();
                return;
            }
            return;
        }
    }

    public final Object k() {
        while (true) {
            Object obj = f1181b.get(this);
            if (!(obj instanceof r)) {
                return obj;
            }
            ((r) obj).a(this);
        }
    }

    public final l l() {
        l lVar;
        Object k2 = k();
        s sVar = k2 instanceof s ? (s) k2 : null;
        if (sVar != null && (lVar = sVar.f1194a) != null) {
            return lVar;
        }
        g0.h.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (l) k2;
    }

    public boolean m() {
        return k() instanceof s;
    }

    public String toString() {
        return new k(this) + '@' + AbstractC0062t.a(this);
    }
}
