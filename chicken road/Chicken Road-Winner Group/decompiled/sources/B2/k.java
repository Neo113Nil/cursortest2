package B2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.AbstractC1242v;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f166a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f167b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f168c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003e, code lost:
    
        r6 = ((B2.q) r6).f178a;
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
        k kVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f167b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(this);
            kVar = kVar2;
            while (true) {
                k kVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f166a;
                    Object obj = atomicReferenceFieldUpdater2.get(kVar);
                    if (obj == this) {
                        if (kVar2 != kVar) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, kVar2, kVar)) {
                                if (atomicReferenceFieldUpdater.get(this) != kVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (h()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof p) {
                        ((p) obj).a(kVar);
                        break;
                    }
                    if (!(obj instanceof q)) {
                        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar;
                        kVar = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar = (k) atomicReferenceFieldUpdater.get(kVar);
                    }
                }
                kVar = kVar3;
            }
        }
        return kVar;
    }

    public final void e(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f167b;
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
            Object obj = f166a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k g() {
        k kVar;
        Object f = f();
        q qVar = f instanceof q ? (q) f : null;
        if (qVar != null && (kVar = qVar.f178a) != null) {
            return kVar;
        }
        kotlin.jvm.internal.j.c(f, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) f;
    }

    public boolean h() {
        return f() instanceof q;
    }

    public String toString() {
        return new j(this, AbstractC1242v.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC1242v.c(this);
    }
}
