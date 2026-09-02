package z1;

/* loaded from: classes.dex */
public class Z implements z1.P, z1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8555a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.Z.class, java.lang.Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater f8556b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(z1.Z.class, java.lang.Object.class, "_parentHandle");
    private volatile java.lang.Object _parentHandle;
    private volatile java.lang.Object _state;

    public Z(boolean z2) {
        this._state = z2 ? z1.AbstractC1068v.f8601i : z1.AbstractC1068v.f8600h;
    }

    public static z1.C1057j L(E1.k kVar) {
        while (kVar.i()) {
            E1.k e2 = kVar.e();
            if (e2 == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E1.k.f285b;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (E1.k) obj;
                    if (!kVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = e2;
            }
        }
        while (true) {
            kVar = kVar.h();
            if (!kVar.i()) {
                if (kVar instanceof z1.C1057j) {
                    return (z1.C1057j) kVar;
                }
                if (kVar instanceof z1.a0) {
                    return null;
                }
            }
        }
    }

    public static java.lang.String R(java.lang.Object obj) {
        if (!(obj instanceof z1.X)) {
            return obj instanceof z1.L ? ((z1.L) obj).b() ? "Active" : "New" : obj instanceof z1.C1061n ? "Cancelled" : "Completed";
        }
        z1.X x2 = (z1.X) obj;
        return x2.e() ? "Cancelling" : x2.f() ? "Completing" : "Active";
    }

    public boolean A() {
        return true;
    }

    public boolean B() {
        return this instanceof z1.C1059l;
    }

    public final z1.a0 C(z1.L l2) {
        z1.a0 d2 = l2.d();
        if (d2 != null) {
            return d2;
        }
        if (l2 instanceof z1.E) {
            return new z1.a0();
        }
        if (l2 instanceof z1.U) {
            P((z1.U) l2);
            return null;
        }
        throw new java.lang.IllegalStateException(("State should have list: " + l2).toString());
    }

    public final java.lang.Object D() {
        while (true) {
            java.lang.Object obj = f8555a.get(this);
            if (!(obj instanceof E1.q)) {
                return obj;
            }
            ((E1.q) obj).a(this);
        }
    }

    public boolean E(java.lang.Throwable th) {
        return false;
    }

    public final void G(z1.P p2) {
        int Q2;
        z1.b0 b0Var = z1.b0.f8559a;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8556b;
        if (p2 == null) {
            atomicReferenceFieldUpdater.set(this, b0Var);
            return;
        }
        z1.Z z2 = (z1.Z) p2;
        do {
            Q2 = z2.Q(z2.D());
            if (Q2 == 0) {
                break;
            }
        } while (Q2 != 1);
        z1.InterfaceC1056i interfaceC1056i = (z1.InterfaceC1056i) z1.AbstractC1068v.e(z2, true, new z1.C1057j(this), 2);
        atomicReferenceFieldUpdater.set(this, interfaceC1056i);
        if (D() instanceof z1.L) {
            return;
        }
        interfaceC1056i.a();
        atomicReferenceFieldUpdater.set(this, b0Var);
    }

    public final z1.C H(boolean z2, boolean z3, s1.l lVar) {
        z1.U u2;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Throwable th;
        if (z2) {
            u2 = lVar instanceof z1.S ? (z1.S) lVar : null;
            if (u2 == null) {
                u2 = new z1.N(lVar);
            }
        } else {
            u2 = lVar instanceof z1.U ? (z1.U) lVar : null;
            if (u2 == null) {
                u2 = new z1.O(0, lVar);
            }
        }
        u2.f8541d = this;
        while (true) {
            java.lang.Object D2 = D();
            if (D2 instanceof z1.E) {
                z1.E e2 = (z1.E) D2;
                if (e2.f8524a) {
                    java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8555a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, D2, u2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != D2) {
                            break;
                        }
                    }
                    return u2;
                }
                z1.a0 a0Var = new z1.a0();
                java.lang.Object k2 = e2.f8524a ? a0Var : new z1.K(a0Var);
                do {
                    atomicReferenceFieldUpdater = f8555a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, e2, k2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == e2);
            } else {
                if (!(D2 instanceof z1.L)) {
                    if (z3) {
                        z1.C1061n c1061n = D2 instanceof z1.C1061n ? (z1.C1061n) D2 : null;
                        lVar.invoke(c1061n != null ? c1061n.f8581a : null);
                    }
                    return z1.b0.f8559a;
                }
                z1.a0 d2 = ((z1.L) D2).d();
                if (d2 == null) {
                    kotlin.jvm.internal.i.c(D2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    P((z1.U) D2);
                } else {
                    z1.C c2 = z1.b0.f8559a;
                    if (z2 && (D2 instanceof z1.X)) {
                        synchronized (D2) {
                            try {
                                th = ((z1.X) D2).c();
                                if (th != null) {
                                    if ((lVar instanceof z1.C1057j) && !((z1.X) D2).f()) {
                                    }
                                }
                                if (o((z1.L) D2, d2, u2)) {
                                    if (th == null) {
                                        return u2;
                                    }
                                    c2 = u2;
                                }
                            } catch (java.lang.Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            lVar.invoke(th);
                        }
                        return c2;
                    }
                    if (o((z1.L) D2, d2, u2)) {
                        return u2;
                    }
                }
            }
        }
    }

    public boolean I() {
        return this instanceof z1.C1050c;
    }

    public final boolean J(java.lang.Object obj) {
        java.lang.Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == z1.AbstractC1068v.f8595c) {
                return false;
            }
            if (S2 == z1.AbstractC1068v.f8596d) {
                return true;
            }
        } while (S2 == z1.AbstractC1068v.f8597e);
        p(S2);
        return true;
    }

    public final java.lang.Object K(java.lang.Object obj) {
        java.lang.Object S2;
        do {
            S2 = S(D(), obj);
            if (S2 == z1.AbstractC1068v.f8595c) {
                java.lang.String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                z1.C1061n c1061n = obj instanceof z1.C1061n ? (z1.C1061n) obj : null;
                throw new java.lang.IllegalStateException(str, c1061n != null ? c1061n.f8581a : null);
            }
        } while (S2 == z1.AbstractC1068v.f8597e);
        return S2;
    }

    public final void M(z1.a0 a0Var, java.lang.Throwable th) {
        java.lang.Object g2 = a0Var.g();
        kotlin.jvm.internal.i.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        E1.A a2 = null;
        for (E1.k kVar = (E1.k) g2; !kVar.equals(a0Var); kVar = kVar.h()) {
            if (kVar instanceof z1.S) {
                z1.U u2 = (z1.U) kVar;
                try {
                    u2.k(th);
                } catch (java.lang.Throwable th2) {
                    if (a2 != null) {
                        Q1.d.b(a2, th2);
                    } else {
                        a2 = new E1.A("Exception in completion handler " + u2 + " for " + this, th2);
                    }
                }
            }
        }
        if (a2 != null) {
            F(a2);
        }
        t(th);
    }

    public final void P(z1.U u2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        z1.a0 a0Var = new z1.a0();
        u2.getClass();
        E1.k.f285b.lazySet(a0Var, u2);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E1.k.f284a;
        atomicReferenceFieldUpdater2.lazySet(a0Var, u2);
        loop0: while (true) {
            if (u2.g() == u2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(u2, u2, a0Var)) {
                    if (atomicReferenceFieldUpdater2.get(u2) != u2) {
                        break;
                    }
                }
                a0Var.f(u2);
                break loop0;
            }
            break;
        }
        E1.k h2 = u2.h();
        do {
            atomicReferenceFieldUpdater = f8555a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, u2, h2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == u2);
    }

    public final int Q(java.lang.Object obj) {
        boolean z2 = obj instanceof z1.E;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8555a;
        if (z2) {
            if (((z1.E) obj).f8524a) {
                return 0;
            }
            z1.E e2 = z1.AbstractC1068v.f8601i;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e2)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof z1.K)) {
            return 0;
        }
        z1.a0 a0Var = ((z1.K) obj).f8533a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, a0Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final java.lang.Object S(java.lang.Object obj, java.lang.Object obj2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof z1.L)) {
            return z1.AbstractC1068v.f8595c;
        }
        if (((obj instanceof z1.E) || (obj instanceof z1.U)) && !(obj instanceof z1.C1057j) && !(obj2 instanceof z1.C1061n)) {
            z1.L l2 = (z1.L) obj;
            java.lang.Object m2 = obj2 instanceof z1.L ? new z1.M((z1.L) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f8555a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, m2)) {
                    N(obj2);
                    w(l2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == l2);
            return z1.AbstractC1068v.f8597e;
        }
        z1.L l3 = (z1.L) obj;
        z1.a0 C2 = C(l3);
        if (C2 == null) {
            return z1.AbstractC1068v.f8597e;
        }
        z1.C1057j c1057j = null;
        z1.X x2 = l3 instanceof z1.X ? (z1.X) l3 : null;
        if (x2 == null) {
            x2 = new z1.X(C2, null);
        }
        synchronized (x2) {
            if (x2.f()) {
                return z1.AbstractC1068v.f8595c;
            }
            z1.X.f8547b.set(x2, 1);
            if (x2 != l3) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8555a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, l3, x2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != l3) {
                        return z1.AbstractC1068v.f8597e;
                    }
                }
            }
            boolean e2 = x2.e();
            z1.C1061n c1061n = obj2 instanceof z1.C1061n ? (z1.C1061n) obj2 : null;
            if (c1061n != null) {
                x2.a(c1061n.f8581a);
            }
            java.lang.Throwable c2 = x2.c();
            if (e2) {
                c2 = null;
            }
            if (c2 != null) {
                M(C2, c2);
            }
            z1.C1057j c1057j2 = l3 instanceof z1.C1057j ? (z1.C1057j) l3 : null;
            if (c1057j2 == null) {
                z1.a0 d2 = l3.d();
                if (d2 != null) {
                    c1057j = L(d2);
                }
            } else {
                c1057j = c1057j2;
            }
            if (c1057j != null) {
                while (z1.AbstractC1068v.e(c1057j.f8572e, false, new z1.W(this, x2, c1057j, obj2), 1) == z1.b0.f8559a) {
                    c1057j = L(c1057j);
                    if (c1057j == null) {
                    }
                }
                return z1.AbstractC1068v.f8596d;
            }
            return y(x2, obj2);
        }
    }

    @Override // z1.P, B1.s
    public void a(java.util.concurrent.CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new z1.Q(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // z1.P
    public boolean b() {
        java.lang.Object D2 = D();
        return (D2 instanceof z1.L) && ((z1.L) D2).b();
    }

    @Override // k1.i
    public final k1.i g(k1.i context) {
        kotlin.jvm.internal.i.e(context, "context");
        return context == k1.j.f7951a ? this : (k1.i) context.k(this, new k1.C0922b(1));
    }

    @Override // k1.g
    public final k1.h getKey() {
        return z1.C1066t.f8592b;
    }

    @Override // k1.i
    public final k1.i j(k1.h hVar) {
        return a.AbstractC0059a.t(this, hVar);
    }

    @Override // k1.i
    public final java.lang.Object k(java.lang.Object obj, s1.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // k1.i
    public final k1.g m(k1.h hVar) {
        return a.AbstractC0059a.p(this, hVar);
    }

    public final boolean o(z1.L l2, z1.a0 a0Var, z1.U u2) {
        char c2;
        z1.Y y2 = new z1.Y(u2, this, l2);
        do {
            E1.k e2 = a0Var.e();
            if (e2 == null) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E1.k.f285b;
                java.lang.Object obj = atomicReferenceFieldUpdater.get(a0Var);
                while (true) {
                    e2 = (E1.k) obj;
                    if (!e2.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(e2);
                }
            }
            E1.k.f285b.lazySet(u2, e2);
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = E1.k.f284a;
            atomicReferenceFieldUpdater2.lazySet(u2, a0Var);
            y2.f8552c = a0Var;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(e2, a0Var, y2)) {
                    c2 = y2.a(e2) == null ? (char) 1 : (char) 2;
                } else if (atomicReferenceFieldUpdater2.get(e2) != a0Var) {
                    c2 = 0;
                    break;
                }
            }
            if (c2 == 1) {
                return true;
            }
        } while (c2 != 2);
        return false;
    }

    public void q(java.lang.Object obj) {
        p(obj);
    }

    public final boolean r(java.lang.Object obj) {
        C.j jVar;
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        java.lang.Object obj2 = z1.AbstractC1068v.f8595c;
        if (B()) {
            do {
                java.lang.Object D2 = D();
                if (!(D2 instanceof z1.L) || ((D2 instanceof z1.X) && ((z1.X) D2).f())) {
                    obj2 = z1.AbstractC1068v.f8595c;
                    break;
                }
                obj2 = S(D2, new z1.C1061n(x(obj), false));
            } while (obj2 == z1.AbstractC1068v.f8597e);
            if (obj2 == z1.AbstractC1068v.f8596d) {
                return true;
            }
        }
        if (obj2 == z1.AbstractC1068v.f8595c) {
            java.lang.Throwable th = null;
            loop1: while (true) {
                java.lang.Object D3 = D();
                if (!(D3 instanceof z1.X)) {
                    if (!(D3 instanceof z1.L)) {
                        jVar = z1.AbstractC1068v.f8598f;
                        break;
                    }
                    if (th == null) {
                        th = x(obj);
                    }
                    z1.L l2 = (z1.L) D3;
                    if (l2.b()) {
                        z1.a0 C2 = C(l2);
                        if (C2 == null) {
                            continue;
                        } else {
                            z1.X x2 = new z1.X(C2, th);
                            do {
                                atomicReferenceFieldUpdater = f8555a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, l2, x2)) {
                                    M(C2, th);
                                    jVar = z1.AbstractC1068v.f8595c;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == l2);
                        }
                    } else {
                        java.lang.Object S2 = S(D3, new z1.C1061n(th, false));
                        if (S2 == z1.AbstractC1068v.f8595c) {
                            throw new java.lang.IllegalStateException(("Cannot happen in " + D3).toString());
                        }
                        if (S2 != z1.AbstractC1068v.f8597e) {
                            obj2 = S2;
                            break;
                        }
                    }
                } else {
                    synchronized (D3) {
                        try {
                            z1.X x3 = (z1.X) D3;
                            x3.getClass();
                            if (z1.X.f8549d.get(x3) == z1.AbstractC1068v.f8599g) {
                                jVar = z1.AbstractC1068v.f8598f;
                            } else {
                                boolean e2 = ((z1.X) D3).e();
                                if (th == null) {
                                    th = x(obj);
                                }
                                ((z1.X) D3).a(th);
                                java.lang.Throwable c2 = e2 ? null : ((z1.X) D3).c();
                                if (c2 != null) {
                                    M(((z1.X) D3).f8550a, c2);
                                }
                                jVar = z1.AbstractC1068v.f8595c;
                            }
                        } catch (java.lang.Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
            obj2 = jVar;
        }
        if (obj2 != z1.AbstractC1068v.f8595c && obj2 != z1.AbstractC1068v.f8596d) {
            if (obj2 == z1.AbstractC1068v.f8598f) {
                return false;
            }
            p(obj2);
        }
        return true;
    }

    public void s(java.util.concurrent.CancellationException cancellationException) {
        r(cancellationException);
    }

    public final boolean t(java.lang.Throwable th) {
        if (I()) {
            return true;
        }
        boolean z2 = th instanceof java.util.concurrent.CancellationException;
        z1.InterfaceC1056i interfaceC1056i = (z1.InterfaceC1056i) f8556b.get(this);
        return (interfaceC1056i == null || interfaceC1056i == z1.b0.f8559a) ? z2 : interfaceC1056i.c(th) || z2;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + R(D()) + '}');
        sb.append('@');
        sb.append(z1.AbstractC1068v.b(this));
        return sb.toString();
    }

    public java.lang.String u() {
        return "Job was cancelled";
    }

    public boolean v(java.lang.Throwable th) {
        if (th instanceof java.util.concurrent.CancellationException) {
            return true;
        }
        return r(th) && A();
    }

    public final void w(z1.L l2, java.lang.Object obj) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8556b;
        z1.InterfaceC1056i interfaceC1056i = (z1.InterfaceC1056i) atomicReferenceFieldUpdater.get(this);
        if (interfaceC1056i != null) {
            interfaceC1056i.a();
            atomicReferenceFieldUpdater.set(this, z1.b0.f8559a);
        }
        E1.A a2 = null;
        z1.C1061n c1061n = obj instanceof z1.C1061n ? (z1.C1061n) obj : null;
        java.lang.Throwable th = c1061n != null ? c1061n.f8581a : null;
        if (l2 instanceof z1.U) {
            try {
                ((z1.U) l2).k(th);
                return;
            } catch (java.lang.Throwable th2) {
                F(new E1.A("Exception in completion handler " + l2 + " for " + this, th2));
                return;
            }
        }
        z1.a0 d2 = l2.d();
        if (d2 != null) {
            java.lang.Object g2 = d2.g();
            kotlin.jvm.internal.i.c(g2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (E1.k kVar = (E1.k) g2; !kVar.equals(d2); kVar = kVar.h()) {
                if (kVar instanceof z1.U) {
                    z1.U u2 = (z1.U) kVar;
                    try {
                        u2.k(th);
                    } catch (java.lang.Throwable th3) {
                        if (a2 != null) {
                            Q1.d.b(a2, th3);
                        } else {
                            a2 = new E1.A("Exception in completion handler " + u2 + " for " + this, th3);
                        }
                    }
                }
            }
            if (a2 != null) {
                F(a2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final java.lang.Throwable x(java.lang.Object obj) {
        java.util.concurrent.CancellationException cancellationException;
        if (obj instanceof java.lang.Throwable) {
            return (java.lang.Throwable) obj;
        }
        z1.Z z2 = (z1.Z) ((z1.d0) obj);
        java.lang.Object D2 = z2.D();
        if (D2 instanceof z1.X) {
            cancellationException = ((z1.X) D2).c();
        } else if (D2 instanceof z1.C1061n) {
            cancellationException = ((z1.C1061n) D2).f8581a;
        } else {
            if (D2 instanceof z1.L) {
                throw new java.lang.IllegalStateException(("Cannot be cancelling child in this state: " + D2).toString());
            }
            cancellationException = null;
        }
        java.util.concurrent.CancellationException cancellationException2 = cancellationException instanceof java.util.concurrent.CancellationException ? cancellationException : null;
        if (cancellationException2 == null) {
            cancellationException2 = new z1.Q("Parent job is ".concat(R(D2)), cancellationException, z2);
        }
        return cancellationException2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.Object y(z1.X x2, java.lang.Object obj) {
        java.lang.Throwable th = null;
        z1.C1061n c1061n = obj instanceof z1.C1061n ? (z1.C1061n) obj : null;
        java.lang.Throwable th2 = c1061n != null ? c1061n.f8581a : null;
        synchronized (x2) {
            x2.e();
            java.util.ArrayList<java.lang.Throwable> g2 = x2.g(th2);
            if (!g2.isEmpty()) {
                java.util.Iterator it = g2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (!(((java.lang.Throwable) next) instanceof java.util.concurrent.CancellationException)) {
                        th = next;
                        break;
                    }
                }
                th = th;
                if (th == null) {
                    th = (java.lang.Throwable) g2.get(0);
                }
            } else if (x2.e()) {
                th = new z1.Q(u(), null, this);
            }
            if (th != null && g2.size() > 1) {
                java.util.Set newSetFromMap = java.util.Collections.newSetFromMap(new java.util.IdentityHashMap(g2.size()));
                for (java.lang.Throwable th3 : g2) {
                    if (th3 != th && th3 != th && !(th3 instanceof java.util.concurrent.CancellationException) && newSetFromMap.add(th3)) {
                        Q1.d.b(th, th3);
                    }
                }
            }
        }
        if (th != null && th != th2) {
            obj = new z1.C1061n(th, false);
        }
        if (th != null && (t(th) || E(th))) {
            kotlin.jvm.internal.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            z1.C1061n.f8580b.compareAndSet((z1.C1061n) obj, 0, 1);
        }
        N(obj);
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8555a;
        java.lang.Object m2 = obj instanceof z1.L ? new z1.M((z1.L) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, x2, m2) && atomicReferenceFieldUpdater.get(this) == x2) {
        }
        w(x2, obj);
        return obj;
    }

    public final java.util.concurrent.CancellationException z() {
        java.util.concurrent.CancellationException cancellationException;
        java.lang.Object D2 = D();
        if (!(D2 instanceof z1.X)) {
            if (D2 instanceof z1.L) {
                throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(D2 instanceof z1.C1061n)) {
                return new z1.Q(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            java.lang.Throwable th = ((z1.C1061n) D2).f8581a;
            cancellationException = th instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) th : null;
            return cancellationException == null ? new z1.Q(u(), th, this) : cancellationException;
        }
        java.lang.Throwable c2 = ((z1.X) D2).c();
        if (c2 == null) {
            throw new java.lang.IllegalStateException(("Job is still new or active: " + this).toString());
        }
        java.lang.String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof java.util.concurrent.CancellationException ? (java.util.concurrent.CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = u();
        }
        return new z1.Q(concat, c2, this);
    }

    public void O() {
    }

    public void F(E1.A a2) {
        throw a2;
    }

    public void N(java.lang.Object obj) {
    }

    public void p(java.lang.Object obj) {
    }
}
