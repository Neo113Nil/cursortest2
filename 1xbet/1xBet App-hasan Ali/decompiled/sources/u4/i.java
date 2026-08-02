package u4;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public class i {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20098k = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20099l = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20100m = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(i iVar, int i) {
        while (true) {
            i f = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20099l;
            if (f == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    f = (i) obj;
                    if (!f.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(f);
                }
            }
            if (f instanceof h) {
                return (((h) f).f20097n & i) == 0 && f.e(iVar, i);
            }
            atomicReferenceFieldUpdater.set(iVar, f);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20098k;
            atomicReferenceFieldUpdater2.set(iVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(f, this, iVar)) {
                if (atomicReferenceFieldUpdater2.get(f) != this) {
                    break;
                }
            }
            iVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((u4.n) r6).f20110a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20099l;
            i iVar = (i) atomicReferenceFieldUpdater.get(this);
            i iVar2 = iVar;
            while (true) {
                i iVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f20098k;
                    Object obj = atomicReferenceFieldUpdater2.get(iVar2);
                    if (obj == this) {
                        if (iVar == iVar2) {
                            return iVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, iVar, iVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != iVar) {
                                break;
                            }
                        }
                        return iVar2;
                    }
                    if (i()) {
                        return null;
                    }
                    if (!(obj instanceof n)) {
                        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
                        iVar3 = iVar2;
                        iVar2 = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar2 = (i) atomicReferenceFieldUpdater.get(iVar2);
                    }
                }
                iVar2 = iVar3;
            }
        }
    }

    public final void g(i iVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20099l;
            i iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (f20098k.get(this) != iVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this)) {
                if (atomicReferenceFieldUpdater.get(iVar) != iVar2) {
                    break;
                }
            }
            if (i()) {
                iVar.f();
                return;
            }
            return;
        }
    }

    public final i h() {
        i iVar;
        Object obj = f20098k.get(this);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (iVar = nVar.f20110a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        return (i) obj;
    }

    public boolean i() {
        return f20098k.get(this) instanceof n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 2;
        sb.append(new A.l(1, i, AbstractC2282w.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;"));
        sb.append('@');
        sb.append(AbstractC2282w.i(this));
        return sb.toString();
    }
}
