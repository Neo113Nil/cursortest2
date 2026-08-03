package z1;

/* renamed from: z1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1068v {

    /* renamed from: c, reason: collision with root package name */
    public static final C.j f8595c;

    /* renamed from: d, reason: collision with root package name */
    public static final C.j f8596d;

    /* renamed from: e, reason: collision with root package name */
    public static final C.j f8597e;

    /* renamed from: f, reason: collision with root package name */
    public static final C.j f8598f;

    /* renamed from: g, reason: collision with root package name */
    public static final C.j f8599g;

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f8593a = new C.j(3, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final C.j f8594b = new C.j(3, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final z1.E f8600h = new z1.E(false);

    /* renamed from: i, reason: collision with root package name */
    public static final z1.E f8601i = new z1.E(true);

    static {
        int i2 = 3;
        f8595c = new C.j(i2, "COMPLETING_ALREADY");
        f8596d = new C.j(i2, "COMPLETING_WAITING_CHILDREN");
        f8597e = new C.j(i2, "COMPLETING_RETRY");
        f8598f = new C.j(i2, "TOO_LATE_TO_CANCEL");
        f8599g = new C.j(i2, "SEALED");
    }

    public static final k1.i a(k1.i iVar, k1.i iVar2, boolean z2) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        z1.C1063p c1063p = z1.C1063p.f8585g;
        boolean booleanValue = ((java.lang.Boolean) iVar.k(bool, c1063p)).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) iVar2.k(bool, c1063p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return iVar.g(iVar2);
        }
        k1.j jVar = k1.j.f7951a;
        k1.i iVar3 = (k1.i) iVar.k(jVar, new z1.C1063p(2, 2));
        java.lang.Object obj = iVar2;
        if (booleanValue2) {
            obj = iVar2.k(jVar, z1.C1063p.f8584f);
        }
        return iVar3.g((k1.i) obj);
    }

    public static final java.lang.String b(java.lang.Object obj) {
        return java.lang.Integer.toHexString(java.lang.System.identityHashCode(obj));
    }

    public static final z1.C1053f c(k1.d dVar) {
        z1.C1053f c1053f;
        z1.C1053f c1053f2;
        if (!(dVar instanceof E1.h)) {
            return new z1.C1053f(1, dVar);
        }
        E1.h hVar = (E1.h) dVar;
        loop0: while (true) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E1.h.f274h;
            java.lang.Object obj = atomicReferenceFieldUpdater.get(hVar);
            C.j jVar = E1.AbstractC0000a.f264d;
            c1053f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, jVar);
                c1053f2 = null;
                break;
            }
            if (obj instanceof z1.C1053f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, jVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c1053f2 = (z1.C1053f) obj;
                break loop0;
            }
            if (obj != jVar && !(obj instanceof java.lang.Throwable)) {
                throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1053f2 != null) {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = z1.C1053f.f8564g;
            java.lang.Object obj2 = atomicReferenceFieldUpdater2.get(c1053f2);
            if (!(obj2 instanceof z1.C1060m) || ((z1.C1060m) obj2).f8578d == null) {
                z1.C1053f.f8563f.set(c1053f2, 536870911);
                atomicReferenceFieldUpdater2.set(c1053f2, z1.C1049b.f8558a);
                c1053f = c1053f2;
            } else {
                c1053f2.q();
            }
            if (c1053f != null) {
                return c1053f;
            }
        }
        return new z1.C1053f(2, dVar);
    }

    public static final void d(java.lang.Throwable th, k1.i iVar) {
        try {
            A1.b bVar = (A1.b) iVar.m(z1.C1066t.f8591a);
            if (bVar != null) {
                bVar.l(th, iVar);
            } else {
                E1.AbstractC0000a.d(th, iVar);
            }
        } catch (java.lang.Throwable th2) {
            if (th != th2) {
                java.lang.RuntimeException runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                Q1.d.b(runtimeException, th);
                th = runtimeException;
            }
            E1.AbstractC0000a.d(th, iVar);
        }
    }

    public static /* synthetic */ z1.C e(z1.P p2, boolean z2, z1.U u2, int i2) {
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        return ((z1.Z) p2).H(z2, (i2 & 2) != 0, u2);
    }

    public static final boolean f(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static z1.e0 g(z1.InterfaceC1067u interfaceC1067u, s1.p pVar) {
        k1.i a2 = a(interfaceC1067u.i(), k1.j.f7951a, true);
        G1.d dVar = z1.B.f8521a;
        if (a2 != dVar && a2.m(k1.e.f7950a) == null) {
            a2 = a2.g(dVar);
        }
        z1.e0 e0Var = new z1.e0(a2, true);
        e0Var.V(1, e0Var, pVar);
        return e0Var;
    }

    public static final java.lang.Object h(java.lang.Object obj) {
        return obj instanceof z1.C1061n ? a.AbstractC0059a.i(((z1.C1061n) obj).f8581a) : obj;
    }

    public static final void i(z1.C1053f c1053f, k1.d dVar, boolean z2) {
        java.lang.Object obj = z1.C1053f.f8564g.get(c1053f);
        java.lang.Throwable g2 = c1053f.g(obj);
        java.lang.Object i2 = g2 != null ? a.AbstractC0059a.i(g2) : c1053f.h(obj);
        if (!z2) {
            dVar.l(i2);
            return;
        }
        kotlin.jvm.internal.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        E1.h hVar = (E1.h) dVar;
        m1.AbstractC0931b abstractC0931b = hVar.f276e;
        k1.i context = abstractC0931b.getContext();
        java.lang.Object m2 = E1.AbstractC0000a.m(context, hVar.f278g);
        z1.j0 m3 = m2 != E1.AbstractC0000a.f266f ? m(abstractC0931b, context, m2) : null;
        try {
            abstractC0931b.l(i2);
        } finally {
            if (m3 == null || m3.W()) {
                E1.AbstractC0000a.g(context, m2);
            }
        }
    }

    public static java.lang.Object j(s1.p pVar) {
        k1.j jVar = k1.j.f7951a;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        k1.e eVar = k1.e.f7950a;
        z1.H a2 = z1.h0.a();
        k1.i a3 = a(jVar, a2, true);
        G1.d dVar = z1.B.f8521a;
        if (a3 != dVar && a3.m(eVar) == null) {
            a3 = a3.g(dVar);
        }
        z1.C1050c c1050c = new z1.C1050c(a3, currentThread, a2);
        c1050c.V(1, c1050c, pVar);
        z1.H h2 = c1050c.f8561e;
        if (h2 != null) {
            int i2 = z1.H.f8528f;
            h2.q(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long r2 = h2 != null ? h2.r() : Long.MAX_VALUE;
                if (!(c1050c.D() instanceof z1.L)) {
                    if (h2 != null) {
                        int i3 = z1.H.f8528f;
                        h2.o(false);
                    }
                    java.lang.Object l2 = l(c1050c.D());
                    z1.C1061n c1061n = l2 instanceof z1.C1061n ? (z1.C1061n) l2 : null;
                    if (c1061n == null) {
                        return l2;
                    }
                    throw c1061n.f8581a;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(c1050c, r2);
            } catch (java.lang.Throwable th) {
                if (h2 != null) {
                    int i4 = z1.H.f8528f;
                    h2.o(false);
                }
                throw th;
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        c1050c.r(interruptedException);
        throw interruptedException;
    }

    public static final java.lang.String k(k1.d dVar) {
        java.lang.Object i2;
        if (dVar instanceof E1.h) {
            return dVar.toString();
        }
        try {
            i2 = dVar + '@' + b(dVar);
        } catch (java.lang.Throwable th) {
            i2 = a.AbstractC0059a.i(th);
        }
        if (h1.AbstractC0174f.a(i2) != null) {
            i2 = dVar.getClass().getName() + '@' + b(dVar);
        }
        return (java.lang.String) i2;
    }

    public static final java.lang.Object l(java.lang.Object obj) {
        z1.L l2;
        z1.M m2 = obj instanceof z1.M ? (z1.M) obj : null;
        return (m2 == null || (l2 = m2.f8534a) == null) ? obj : l2;
    }

    public static final z1.j0 m(k1.d dVar, k1.i iVar, java.lang.Object obj) {
        z1.j0 j0Var = null;
        if (!(dVar instanceof m1.InterfaceC0932c)) {
            return null;
        }
        if (iVar.m(z1.k0.f8574a) != null) {
            m1.InterfaceC0932c interfaceC0932c = (m1.InterfaceC0932c) dVar;
            while (true) {
                if ((interfaceC0932c instanceof z1.C1072z) || (interfaceC0932c = interfaceC0932c.f()) == null) {
                    break;
                }
                if (interfaceC0932c instanceof z1.j0) {
                    j0Var = (z1.j0) interfaceC0932c;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.X(iVar, obj);
            }
        }
        return j0Var;
    }

    public static final java.lang.Object n(k1.i iVar, s1.p pVar, m1.AbstractC0935f abstractC0935f) {
        java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        k1.i iVar2 = abstractC0935f.f8076b;
        kotlin.jvm.internal.i.b(iVar2);
        k1.i g2 = !((java.lang.Boolean) iVar.k(java.lang.Boolean.FALSE, z1.C1063p.f8585g)).booleanValue() ? iVar2.g(iVar) : a(iVar2, iVar, false);
        z1.P p2 = (z1.P) g2.m(z1.C1066t.f8592b);
        if (p2 != null && !p2.b()) {
            throw ((z1.Z) p2).z();
        }
        if (g2 == iVar2) {
            E1.t tVar = new E1.t(abstractC0935f, g2);
            return Q1.d.B(tVar, tVar, pVar);
        }
        k1.e eVar = k1.e.f7950a;
        if (kotlin.jvm.internal.i.a(g2.m(eVar), iVar2.m(eVar))) {
            z1.j0 j0Var = new z1.j0(g2, abstractC0935f);
            k1.i iVar3 = j0Var.f8557c;
            java.lang.Object m2 = E1.AbstractC0000a.m(iVar3, null);
            try {
                return Q1.d.B(j0Var, j0Var, pVar);
            } finally {
                E1.AbstractC0000a.g(iVar3, m2);
            }
        }
        z1.C1072z c1072z = new z1.C1072z(abstractC0935f, g2);
        u0.AbstractC0995a.B(pVar, c1072z, c1072z);
        do {
            atomicIntegerFieldUpdater = z1.C1072z.f8605e;
            int i2 = atomicIntegerFieldUpdater.get(c1072z);
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("Already suspended");
                }
                java.lang.Object l2 = l(c1072z.D());
                if (l2 instanceof z1.C1061n) {
                    throw ((z1.C1061n) l2).f8581a;
                }
                return l2;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c1072z, 0, 1));
        return l1.EnumC0927a.f8017a;
    }
}
