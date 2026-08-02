package De;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.M0;
import xe.Q;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6638a = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6639b = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f6640c = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((De.u) r6).f6651a;
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
    private final o f() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6639b;
            o oVar = (o) atomicReferenceFieldUpdater.get(this);
            o oVar2 = oVar;
            while (true) {
                o oVar3 = null;
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6638a;
                    Object obj = atomicReferenceFieldUpdater2.get(oVar2);
                    if (obj == this) {
                        if (oVar == oVar2) {
                            return oVar2;
                        }
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, oVar, oVar2)) {
                            if (atomicReferenceFieldUpdater.get(this) != oVar) {
                                break;
                            }
                        }
                        return oVar2;
                    }
                    if (k()) {
                        return null;
                    }
                    if (!(obj instanceof u)) {
                        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        oVar3 = oVar2;
                        oVar2 = (o) obj;
                    } else {
                        if (oVar3 != null) {
                            break;
                        }
                        oVar2 = (o) atomicReferenceFieldUpdater.get(oVar2);
                    }
                }
                oVar2 = oVar3;
            }
        }
    }

    private final void g(o oVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6639b;
            o oVar2 = (o) atomicReferenceFieldUpdater.get(oVar);
            if (f6638a.get(this) != oVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(oVar, oVar2, this)) {
                if (atomicReferenceFieldUpdater.get(oVar) != oVar2) {
                    break;
                }
            }
            if (k()) {
                oVar.f();
                return;
            }
            return;
        }
    }

    public final boolean c(@NotNull o oVar, int i11) {
        while (true) {
            o j11 = j();
            if (j11 instanceof m) {
                return (((m) j11).f6637d & i11) == 0 && j11.c(oVar, i11);
            }
            f6639b.set(oVar, j11);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6638a;
            atomicReferenceFieldUpdater.set(oVar, this);
            while (!atomicReferenceFieldUpdater.compareAndSet(j11, this, oVar)) {
                if (atomicReferenceFieldUpdater.get(j11) != this) {
                    break;
                }
            }
            oVar.g(this);
            return true;
        }
    }

    public final void d(@NotNull M0 m02) {
        f6639b.set(m02, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6638a;
        atomicReferenceFieldUpdater.set(m02, this);
        while (atomicReferenceFieldUpdater.get(this) == this) {
            while (!atomicReferenceFieldUpdater.compareAndSet(this, this, m02)) {
                if (atomicReferenceFieldUpdater.get(this) != this) {
                    break;
                }
            }
            m02.g(this);
            return;
        }
    }

    public final void e(int i11) {
        c(new m(i11), i11);
    }

    @NotNull
    public final Object h() {
        return f6638a.get(this);
    }

    @NotNull
    public final o i() {
        o oVar;
        Object obj = f6638a.get(this);
        u uVar = obj instanceof u ? (u) obj : null;
        if (uVar != null && (oVar = uVar.f6651a) != null) {
            return oVar;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (o) obj;
    }

    @NotNull
    public final o j() {
        o f7 = f();
        if (f7 != null) {
            return f7;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6639b;
        Object obj = atomicReferenceFieldUpdater.get(this);
        while (true) {
            o oVar = (o) obj;
            if (!oVar.k()) {
                return oVar;
            }
            obj = atomicReferenceFieldUpdater.get(oVar);
        }
    }

    public boolean k() {
        return f6638a.get(this) instanceof u;
    }

    public final void l() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6638a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof u) {
                o oVar = ((u) obj).f6651a;
                return;
            }
            if (obj == this) {
                return;
            }
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            o oVar2 = (o) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6640c;
            u uVar = (u) atomicReferenceFieldUpdater2.get(oVar2);
            if (uVar == null) {
                uVar = new u(oVar2);
                atomicReferenceFieldUpdater2.set(oVar2, uVar);
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            oVar2.f();
            return;
        }
    }

    @NotNull
    public String toString() {
        return new kotlin.jvm.internal.C(this) { // from class: De.o.a
            @Override // kotlin.jvm.internal.C, kotlin.reflect.n
            public final Object get() {
                return this.receiver.getClass().getSimpleName();
            }
        } + '@' + Q.a(this);
    }
}
