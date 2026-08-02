package p4;

import b4.EnumC0510a;
import c4.InterfaceC0543d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: p4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2268h extends C implements InterfaceC2266f, InterfaceC0543d, q0 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f18792p = AtomicIntegerFieldUpdater.newUpdater(C2268h.class, "_decisionAndIndex$volatile");

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18793q = AtomicReferenceFieldUpdater.newUpdater(C2268h.class, Object.class, "_state$volatile");

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f18794r = AtomicReferenceFieldUpdater.newUpdater(C2268h.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: n, reason: collision with root package name */
    public final a4.c f18795n;

    /* renamed from: o, reason: collision with root package name */
    public final a4.h f18796o;

    public C2268h(int i, a4.c cVar) {
        super(i);
        this.f18795n = cVar;
        this.f18796o = cVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C2262b.f18779a;
    }

    public static Object C(g0 g0Var, Object obj, int i, i4.f fVar) {
        if (obj instanceof C2275o) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (fVar != null || (g0Var instanceof C2265e)) {
            return new C2274n(obj, g0Var instanceof C2265e ? (C2265e) g0Var : null, fVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(g0 g0Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + g0Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, i4.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18793q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof g0) {
                Object C5 = C((g0) obj2, obj, i, fVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C5)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!w()) {
                    n();
                }
                o(i);
                return;
            }
            if (obj2 instanceof C2269i) {
                C2269i c2269i = (C2269i) obj2;
                c2269i.getClass();
                if (C2269i.f18797c.compareAndSet(c2269i, 0, 1)) {
                    if (fVar != null) {
                        l(fVar, c2269i.f18812a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final void B(AbstractC2277q abstractC2277q) {
        W3.o oVar = W3.o.f6046a;
        a4.c cVar = this.f18795n;
        u4.f fVar = cVar instanceof u4.f ? (u4.f) cVar : null;
        A(oVar, (fVar != null ? fVar.f20087n : null) == abstractC2277q ? 4 : this.f18742m, null);
    }

    @Override // p4.InterfaceC2266f
    public final H3.g a(Object obj, i4.f fVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18793q;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj2 instanceof g0;
            H3.g gVar = AbstractC2282w.f18826a;
            if (!z3) {
                boolean z5 = obj2 instanceof C2274n;
                return null;
            }
            Object C5 = C((g0) obj2, obj, this.f18742m, fVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!w()) {
                n();
            }
            return gVar;
        }
    }

    @Override // p4.q0
    public final void b(u4.q qVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f18792p;
            i5 = atomicIntegerFieldUpdater.get(this);
            if ((i5 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, ((i5 >> 29) << 29) + i));
        v(qVar);
    }

    @Override // p4.C
    public final void c(CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18793q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof g0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C2275o) {
                return;
            }
            if (!(obj instanceof C2274n)) {
                cancellationException2 = cancellationException;
                C2274n c2274n = new C2274n(obj, (C2265e) null, (i4.f) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2274n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C2274n c2274n2 = (C2274n) obj;
            if (c2274n2.f18809e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C2274n a5 = C2274n.a(c2274n2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    cancellationException2 = cancellationException;
                }
            }
            C2265e c2265e = c2274n2.f18806b;
            if (c2265e != null) {
                k(c2265e, cancellationException);
            }
            i4.f fVar = c2274n2.f18807c;
            if (fVar != null) {
                l(fVar, cancellationException, c2274n2.f18805a);
                return;
            }
            return;
            cancellationException = cancellationException2;
        }
    }

    @Override // p4.C
    public final a4.c d() {
        return this.f18795n;
    }

    @Override // p4.C
    public final Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 != null) {
            return e3;
        }
        return null;
    }

    @Override // p4.C
    public final Object f(Object obj) {
        return obj instanceof C2274n ? ((C2274n) obj).f18805a : obj;
    }

    @Override // p4.InterfaceC2266f
    public final boolean g(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18793q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof g0)) {
                return false;
            }
            C2269i c2269i = new C2269i(this, th, (obj instanceof C2265e) || (obj instanceof u4.q));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2269i)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            g0 g0Var = (g0) obj;
            if (g0Var instanceof C2265e) {
                k((C2265e) obj, th);
            } else if (g0Var instanceof u4.q) {
                m((u4.q) obj, th);
            }
            if (!w()) {
                n();
            }
            o(this.f18742m);
            return true;
        }
    }

    @Override // c4.InterfaceC0543d
    public final InterfaceC0543d getCallerFrame() {
        a4.c cVar = this.f18795n;
        if (cVar instanceof InterfaceC0543d) {
            return (InterfaceC0543d) cVar;
        }
        return null;
    }

    @Override // a4.c
    public final a4.h getContext() {
        return this.f18796o;
    }

    @Override // p4.C
    public final Object i() {
        return f18793q.get(this);
    }

    @Override // p4.InterfaceC2266f
    public final void j(Object obj, i4.f fVar) {
        A(obj, this.f18742m, fVar);
    }

    public final void k(C2265e c2265e, Throwable th) {
        try {
            switch (c2265e.f18786a) {
                case 0:
                    ((i4.c) c2265e.f18787b).c(th);
                    break;
                default:
                    ((E) c2265e.f18787b).a();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC2282w.l(this.f18796o, new D2.e("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void l(i4.f fVar, Throwable th, Object obj) {
        a4.h hVar = this.f18796o;
        try {
            fVar.b(th, obj, hVar);
        } catch (Throwable th2) {
            AbstractC2282w.l(hVar, new D2.e("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void m(u4.q qVar, Throwable th) {
        a4.h hVar = this.f18796o;
        int i = f18792p.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            qVar.g(i, hVar);
        } catch (Throwable th2) {
            AbstractC2282w.l(hVar, new D2.e("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18794r;
        E e3 = (E) atomicReferenceFieldUpdater.get(this);
        if (e3 == null) {
            return;
        }
        e3.a();
        atomicReferenceFieldUpdater.set(this, f0.f18789k);
    }

    public final void o(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i5;
        do {
            atomicIntegerFieldUpdater = f18792p;
            i5 = atomicIntegerFieldUpdater.get(this);
            int i6 = i5 >> 29;
            if (i6 != 0) {
                if (i6 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                a4.c cVar = this.f18795n;
                boolean z3 = i == 4;
                if (!z3 && (cVar instanceof u4.f)) {
                    boolean z5 = i == 1 || i == 2;
                    int i7 = this.f18742m;
                    if (z5 == (i7 == 1 || i7 == 2)) {
                        u4.f fVar = (u4.f) cVar;
                        AbstractC2277q abstractC2277q = fVar.f20087n;
                        a4.h context = fVar.f20088o.getContext();
                        if (abstractC2277q.F(context)) {
                            abstractC2277q.E(context, this);
                            return;
                        }
                        K a5 = k0.a();
                        if (a5.f18754m >= 4294967296L) {
                            a5.I(this);
                            return;
                        }
                        a5.K(true);
                        try {
                            AbstractC2282w.s(this, cVar, true);
                            do {
                            } while (a5.M());
                        } finally {
                            try {
                                return;
                            } finally {
                            }
                        }
                        return;
                    }
                }
                AbstractC2282w.s(this, cVar, z3);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i5, 1073741824 + (536870911 & i5)));
    }

    public Throwable p(b0 b0Var) {
        return b0Var.s();
    }

    public final Object q() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean w5 = w();
        do {
            atomicIntegerFieldUpdater = f18792p;
            i = atomicIntegerFieldUpdater.get(this);
            int i5 = i >> 29;
            if (i5 != 0) {
                if (i5 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (w5) {
                    z();
                }
                Object obj = f18793q.get(this);
                if (obj instanceof C2275o) {
                    throw ((C2275o) obj).f18812a;
                }
                int i6 = this.f18742m;
                if (i6 == 1 || i6 == 2) {
                    U u5 = (U) this.f18796o.l(r.f18819l);
                    if (u5 != null && !u5.b()) {
                        CancellationException s2 = u5.s();
                        c(s2);
                        throw s2;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((E) f18794r.get(this)) == null) {
            s();
        }
        if (w5) {
            z();
        }
        return EnumC0510a.f7289k;
    }

    public final void r() {
        E s2 = s();
        if (s2 == null || (f18793q.get(this) instanceof g0)) {
            return;
        }
        s2.a();
        f18794r.set(this, f0.f18789k);
    }

    @Override // a4.c
    public final void resumeWith(Object obj) {
        Throwable a5 = W3.k.a(obj);
        if (a5 != null) {
            obj = new C2275o(a5, false);
        }
        A(obj, this.f18742m, null);
    }

    public final E s() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u5 = (U) this.f18796o.l(r.f18819l);
        if (u5 == null) {
            return null;
        }
        E m5 = AbstractC2282w.m(u5, true, new C2270j(this, 0));
        do {
            atomicReferenceFieldUpdater = f18794r;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m5)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m5;
    }

    public final void t(i4.c cVar) {
        v(new C2265e(0, cVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(y());
        sb.append('(');
        sb.append(AbstractC2282w.t(this.f18795n));
        sb.append("){");
        Object obj = f18793q.get(this);
        sb.append(obj instanceof g0 ? "Active" : obj instanceof C2269i ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC2282w.i(this));
        return sb.toString();
    }

    @Override // p4.InterfaceC2266f
    public final void u(Object obj) {
        o(this.f18742m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ac, code lost:
    
        x(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00af, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(g0 g0Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f18793q;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C2262b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if ((obj instanceof C2265e) || (obj instanceof u4.q)) {
                break;
            }
            if (obj instanceof C2275o) {
                C2275o c2275o = (C2275o) obj;
                c2275o.getClass();
                if (!C2275o.f18811b.compareAndSet(c2275o, 0, 1)) {
                    x(g0Var, obj);
                    throw null;
                }
                if (obj instanceof C2269i) {
                    if (((C2275o) obj) == null) {
                        c2275o = null;
                    }
                    Throwable th = c2275o != null ? c2275o.f18812a : null;
                    if (g0Var instanceof C2265e) {
                        k((C2265e) g0Var, th);
                        return;
                    } else {
                        m((u4.q) g0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof C2274n)) {
                if (g0Var instanceof u4.q) {
                    return;
                }
                C2274n c2274n = new C2274n(obj, (C2265e) g0Var, (i4.f) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2274n)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C2274n c2274n2 = (C2274n) obj;
            if (c2274n2.f18806b != null) {
                x(g0Var, obj);
                throw null;
            }
            if (g0Var instanceof u4.q) {
                return;
            }
            C2265e c2265e = (C2265e) g0Var;
            Throwable th2 = c2274n2.f18809e;
            if (th2 != null) {
                k(c2265e, th2);
                return;
            }
            C2274n a5 = C2274n.a(c2274n2, c2265e, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a5)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean w() {
        if (this.f18742m != 2) {
            return false;
        }
        a4.c cVar = this.f18795n;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", cVar);
        return u4.f.f20086r.get((u4.f) cVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        a4.c cVar = this.f18795n;
        Throwable th = null;
        u4.f fVar = cVar instanceof u4.f ? (u4.f) cVar : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u4.f.f20086r;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                H3.g gVar = u4.a.f20077c;
                if (obj == gVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, gVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != gVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            n();
            g(th);
        }
    }
}
