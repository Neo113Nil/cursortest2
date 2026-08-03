package z1;

/* renamed from: z1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1053f extends z1.A implements z1.InterfaceC1052e, m1.InterfaceC0932c, z1.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f8563f = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(z1.C1053f.class, "_decisionAndIndex");

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8564g = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.C1053f.class, java.lang.Object.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8565h = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.C1053f.class, java.lang.Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;

    /* renamed from: d, reason: collision with root package name */
    public final k1.d f8566d;

    /* renamed from: e, reason: collision with root package name */
    public final k1.i f8567e;

    public C1053f(int i2, k1.d dVar) {
        super(i2);
        this.f8566d = dVar;
        this.f8567e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = z1.C1049b.f8558a;
    }

    public static java.lang.Object C(z1.c0 c0Var, java.lang.Object obj, int i2, s1.l lVar) {
        if ((obj instanceof z1.C1061n) || !z1.AbstractC1068v.f(i2)) {
            return obj;
        }
        if (lVar != null || (c0Var instanceof z1.D)) {
            return new z1.C1060m(obj, c0Var instanceof z1.D ? (z1.D) c0Var : null, lVar, (java.util.concurrent.CancellationException) null, 16);
        }
        return obj;
    }

    public static void y(z1.c0 c0Var, java.lang.Object obj) {
        throw new java.lang.IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0Var + ", already has " + obj).toString());
    }

    public final void A() {
        k1.d dVar = this.f8566d;
        java.lang.Throwable th = null;
        E1.h hVar = dVar instanceof E1.h ? (E1.h) dVar : null;
        if (hVar != null) {
            loop0: while (true) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E1.h.f274h;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(hVar);
                C.j jVar = E1.AbstractC0000a.f264d;
                if (obj == jVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, jVar, this)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != jVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof java.lang.Throwable)) {
                        throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new java.lang.IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (java.lang.Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            q();
            p(th);
        }
    }

    public final void B(java.lang.Object obj, int i2, s1.l lVar) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8564g;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z1.c0) {
                java.lang.Object C2 = C((z1.c0) obj2, obj, i2, lVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!x()) {
                    q();
                }
                r(i2);
                return;
            }
            if (obj2 instanceof z1.C1054g) {
                z1.C1054g c1054g = (z1.C1054g) obj2;
                c1054g.getClass();
                if (z1.C1054g.f8568c.compareAndSet(c1054g, 0, 1)) {
                    if (lVar != null) {
                        m(lVar, c1054g.f8581a);
                        return;
                    }
                    return;
                }
            }
            throw new java.lang.IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    @Override // z1.l0
    public final void a(E1.u uVar, int i2) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f8563f;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new java.lang.IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        w(uVar);
    }

    @Override // z1.A
    public final void b(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8564g;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof z1.c0) {
                throw new java.lang.IllegalStateException("Not completed");
            }
            if (obj2 instanceof z1.C1061n) {
                return;
            }
            if (!(obj2 instanceof z1.C1060m)) {
                z1.C1060m c1060m = new z1.C1060m(obj2, (z1.D) null, (s1.l) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c1060m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            z1.C1060m c1060m2 = (z1.C1060m) obj2;
            if (c1060m2.f8579e != null) {
                throw new java.lang.IllegalStateException("Must be called at most once");
            }
            z1.C1060m a2 = z1.C1060m.a(c1060m2, null, cancellationException, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            z1.D d2 = c1060m2.f8576b;
            if (d2 != null) {
                k(d2, cancellationException);
            }
            s1.l lVar = c1060m2.f8577c;
            if (lVar != null) {
                m(lVar, cancellationException);
                return;
            }
            return;
        }
    }

    @Override // z1.InterfaceC1052e
    public final C.j c(java.lang.Object obj, s1.l lVar) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8564g;
            java.lang.Object obj2 = atomicReferenceFieldUpdater.get(this);
            boolean z2 = obj2 instanceof z1.c0;
            C.j jVar = z1.AbstractC1068v.f8593a;
            if (!z2) {
                boolean z3 = obj2 instanceof z1.C1060m;
                return null;
            }
            java.lang.Object C2 = C((z1.c0) obj2, obj, this.f8520c, lVar);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, C2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (x()) {
                return jVar;
            }
            q();
            return jVar;
        }
    }

    @Override // z1.InterfaceC1052e
    public final void d(java.lang.Object obj, s1.l lVar) {
        B(obj, this.f8520c, lVar);
    }

    @Override // z1.A
    public final k1.d e() {
        return this.f8566d;
    }

    @Override // m1.InterfaceC0932c
    public final m1.InterfaceC0932c f() {
        k1.d dVar = this.f8566d;
        if (dVar instanceof m1.InterfaceC0932c) {
            return (m1.InterfaceC0932c) dVar;
        }
        return null;
    }

    @Override // z1.A
    public final java.lang.Throwable g(java.lang.Object obj) {
        java.lang.Throwable g2 = super.g(obj);
        if (g2 != null) {
            return g2;
        }
        return null;
    }

    @Override // k1.d
    public final k1.i getContext() {
        return this.f8567e;
    }

    @Override // z1.A
    public final java.lang.Object h(java.lang.Object obj) {
        return obj instanceof z1.C1060m ? ((z1.C1060m) obj).f8575a : obj;
    }

    @Override // z1.A
    public final java.lang.Object j() {
        return f8564g.get(this);
    }

    public final void k(z1.D d2, java.lang.Throwable th) {
        try {
            d2.a(th);
        } catch (java.lang.Throwable th2) {
            z1.AbstractC1068v.d(new E1.A("Exception in invokeOnCancellation handler for " + this, th2), this.f8567e);
        }
    }

    @Override // k1.d
    public final void l(java.lang.Object obj) {
        java.lang.Throwable a2 = h1.AbstractC0174f.a(obj);
        if (a2 != null) {
            obj = new z1.C1061n(a2, false);
        }
        B(obj, this.f8520c, null);
    }

    public final void m(s1.l lVar, java.lang.Throwable th) {
        try {
            lVar.invoke(th);
        } catch (java.lang.Throwable th2) {
            z1.AbstractC1068v.d(new E1.A("Exception in resume onCancellation handler for " + this, th2), this.f8567e);
        }
    }

    @Override // z1.InterfaceC1052e
    public final void n(java.lang.Object obj) {
        r(this.f8520c);
    }

    public final void o(E1.u uVar, java.lang.Throwable th) {
        k1.i iVar = this.f8567e;
        int i2 = f8563f.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new java.lang.IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            uVar.g(i2, iVar);
        } catch (java.lang.Throwable th2) {
            z1.AbstractC1068v.d(new E1.A("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final void p(java.lang.Throwable th) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8564g;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z1.c0) {
                z1.C1054g c1054g = new z1.C1054g(this, th, (obj instanceof z1.D) || (obj instanceof E1.u));
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1054g)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                z1.c0 c0Var = (z1.c0) obj;
                if (c0Var instanceof z1.D) {
                    k((z1.D) obj, th);
                } else if (c0Var instanceof E1.u) {
                    o((E1.u) obj, th);
                }
                if (!x()) {
                    q();
                }
                r(this.f8520c);
                return;
            }
            return;
        }
    }

    public final void q() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8565h;
        z1.C c2 = (z1.C) atomicReferenceFieldUpdater.get(this);
        if (c2 == null) {
            return;
        }
        c2.a();
        atomicReferenceFieldUpdater.set(this, z1.b0.f8559a);
    }

    public final void r(int i2) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f8563f;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new java.lang.IllegalStateException("Already resumed");
                }
                boolean z2 = i2 == 4;
                k1.d dVar = this.f8566d;
                if (z2 || !(dVar instanceof E1.h) || z1.AbstractC1068v.f(i2) != z1.AbstractC1068v.f(this.f8520c)) {
                    z1.AbstractC1068v.i(this, dVar, z2);
                    return;
                }
                z1.AbstractC1065s abstractC1065s = ((E1.h) dVar).f275d;
                k1.i context = ((E1.h) dVar).f276e.getContext();
                if (abstractC1065s.n()) {
                    abstractC1065s.l(context, this);
                    return;
                }
                z1.H a2 = z1.h0.a();
                if (a2.f8529c >= 4294967296L) {
                    i1.C0188g c0188g = a2.f8531e;
                    if (c0188g == null) {
                        c0188g = new i1.C0188g();
                        a2.f8531e = c0188g;
                    }
                    c0188g.addLast(this);
                    return;
                }
                a2.q(true);
                try {
                    z1.AbstractC1068v.i(this, dVar, true);
                    do {
                    } while (a2.s());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public java.lang.Throwable s(z1.Z z2) {
        return z2.z();
    }

    public final java.lang.Object t() {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean x2 = x();
        do {
            atomicIntegerFieldUpdater = f8563f;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended");
                }
                if (x2) {
                    A();
                }
                java.lang.Object obj = f8564g.get(this);
                if (obj instanceof z1.C1061n) {
                    throw ((z1.C1061n) obj).f8581a;
                }
                if (z1.AbstractC1068v.f(this.f8520c)) {
                    z1.P p2 = (z1.P) this.f8567e.m(z1.C1066t.f8592b);
                    if (p2 != null && !p2.b()) {
                        java.util.concurrent.CancellationException z2 = ((z1.Z) p2).z();
                        b(obj, z2);
                        throw z2;
                    }
                }
                return h(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((z1.C) f8565h.get(this)) == null) {
            v();
        }
        if (x2) {
            A();
        }
        return l1.EnumC0927a.f8017a;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(z());
        sb.append('(');
        sb.append(z1.AbstractC1068v.k(this.f8566d));
        sb.append("){");
        java.lang.Object obj = f8564g.get(this);
        sb.append(obj instanceof z1.c0 ? "Active" : obj instanceof z1.C1054g ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(z1.AbstractC1068v.b(this));
        return sb.toString();
    }

    public final void u() {
        z1.C v2 = v();
        if (v2 == null || (f8564g.get(this) instanceof z1.c0)) {
            return;
        }
        v2.a();
        f8565h.set(this, z1.b0.f8559a);
    }

    public final z1.C v() {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        z1.P p2 = (z1.P) this.f8567e.m(z1.C1066t.f8592b);
        if (p2 == null) {
            return null;
        }
        z1.C e2 = z1.AbstractC1068v.e(p2, true, new z1.C1055h(this), 2);
        do {
            atomicReferenceFieldUpdater = f8565h;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, e2)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return e2;
    }

    public final void w(z1.c0 c0Var) {
        while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8564g;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof z1.C1049b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof z1.D ? true : obj instanceof E1.u) {
                y(c0Var, obj);
                throw null;
            }
            if (obj instanceof z1.C1061n) {
                z1.C1061n c1061n = (z1.C1061n) obj;
                c1061n.getClass();
                if (!z1.C1061n.f8580b.compareAndSet(c1061n, 0, 1)) {
                    y(c0Var, obj);
                    throw null;
                }
                if (obj instanceof z1.C1054g) {
                    if (!(obj instanceof z1.C1061n)) {
                        c1061n = null;
                    }
                    java.lang.Throwable th = c1061n != null ? c1061n.f8581a : null;
                    if (c0Var instanceof z1.D) {
                        k((z1.D) c0Var, th);
                        return;
                    } else {
                        kotlin.jvm.internal.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                        o((E1.u) c0Var, th);
                        return;
                    }
                }
                return;
            }
            if (!(obj instanceof z1.C1060m)) {
                if (c0Var instanceof E1.u) {
                    return;
                }
                kotlin.jvm.internal.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                z1.C1060m c1060m = new z1.C1060m(obj, (z1.D) c0Var, (s1.l) null, (java.util.concurrent.CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1060m)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            z1.C1060m c1060m2 = (z1.C1060m) obj;
            if (c1060m2.f8576b != null) {
                y(c0Var, obj);
                throw null;
            }
            if (c0Var instanceof E1.u) {
                return;
            }
            kotlin.jvm.internal.i.c(c0Var, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
            z1.D d2 = (z1.D) c0Var;
            java.lang.Throwable th2 = c1060m2.f8579e;
            if (th2 != null) {
                k(d2, th2);
                return;
            }
            z1.C1060m a2 = z1.C1060m.a(c1060m2, d2, null, 29);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean x() {
        if (this.f8520c == 2) {
            k1.d dVar = this.f8566d;
            kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (E1.h.f274h.get((E1.h) dVar) != null) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String z() {
        return "CancellableContinuation";
    }
}
