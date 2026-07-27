package w2;

import a.AbstractC0086a;
import d2.AbstractC0276f;
import g2.C0320d;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import i2.InterfaceC0344c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* renamed from: w2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1242v {

    /* renamed from: a, reason: collision with root package name */
    public static final B2.v f10526a = new B2.v("RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final B2.v f10527b = new B2.v("CLOSED_EMPTY");

    /* renamed from: c, reason: collision with root package name */
    public static final B2.v f10528c = new B2.v("COMPLETING_ALREADY");

    /* renamed from: d, reason: collision with root package name */
    public static final B2.v f10529d = new B2.v("COMPLETING_WAITING_CHILDREN");

    /* renamed from: e, reason: collision with root package name */
    public static final B2.v f10530e = new B2.v("COMPLETING_RETRY");
    public static final B2.v f = new B2.v("TOO_LATE_TO_CANCEL");

    /* renamed from: g, reason: collision with root package name */
    public static final B2.v f10531g = new B2.v("SEALED");

    /* renamed from: h, reason: collision with root package name */
    public static final E f10532h = new E(false);

    /* renamed from: i, reason: collision with root package name */
    public static final E f10533i = new E(true);

    public static final B2.e a(g2.h hVar) {
        if (hVar.k(C1240t.f10525b) == null) {
            hVar = hVar.h(new T());
        }
        return new B2.e(hVar);
    }

    public static final g2.h b(g2.h hVar, g2.h hVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        C1237p c1237p = C1237p.f10518g;
        boolean booleanValue = ((Boolean) hVar.i(bool, c1237p)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.i(bool, c1237p)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.h(hVar2);
        }
        g2.i iVar = g2.i.f4981a;
        g2.h hVar3 = (g2.h) hVar.i(iVar, new C1237p(2, 2));
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.i(iVar, C1237p.f);
        }
        return hVar3.h((g2.h) obj);
    }

    public static final String c(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C1227f d(InterfaceC0319c interfaceC0319c) {
        C1227f c1227f;
        C1227f c1227f2;
        if (!(interfaceC0319c instanceof B2.h)) {
            return new C1227f(1, interfaceC0319c);
        }
        B2.h hVar = (B2.h) interfaceC0319c;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B2.h.f158h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            B2.v vVar = B2.a.f149d;
            c1227f = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, vVar);
                c1227f2 = null;
                break;
            }
            if (obj instanceof C1227f) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, vVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c1227f2 = (C1227f) obj;
                break loop0;
            }
            if (obj != vVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c1227f2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1227f.f10500g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c1227f2);
            if (!(obj2 instanceof C1234m) || ((C1234m) obj2).f10514d == null) {
                C1227f.f.set(c1227f2, 536870911);
                atomicReferenceFieldUpdater2.set(c1227f2, C1223b.f10495a);
                c1227f = c1227f2;
            } else {
                c1227f2.p();
            }
            if (c1227f != null) {
                return c1227f;
            }
        }
        return new C1227f(2, interfaceC0319c);
    }

    public static final void e(g2.h hVar, Throwable th) {
        try {
            x2.b bVar = (x2.b) hVar.k(C1240t.f10524a);
            if (bVar != null) {
                bVar.c(th);
            } else {
                B2.a.c(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                F2.b.d(runtimeException, th);
                th = runtimeException;
            }
            B2.a.c(hVar, th);
        }
    }

    public static e0 g(InterfaceC1241u interfaceC1241u, AbstractC1239s abstractC1239s, o2.p pVar, int i3) {
        g2.h hVar = abstractC1239s;
        if ((i3 & 1) != 0) {
            hVar = g2.i.f4981a;
        }
        g2.h b3 = b(interfaceC1241u.d(), hVar, true);
        D2.d dVar = B.f10462a;
        if (b3 != dVar && b3.k(C0320d.f4980a) == null) {
            b3 = b3.h(dVar);
        }
        e0 e0Var = new e0(b3, true);
        e0Var.U(1, e0Var, pVar);
        return e0Var;
    }

    public static final Object h(Object obj) {
        return obj instanceof C1235n ? X0.a.n(((C1235n) obj).f10517a) : obj;
    }

    public static final void i(C1227f c1227f, InterfaceC0319c interfaceC0319c, boolean z3) {
        Object obj = C1227f.f10500g.get(c1227f);
        Throwable g3 = c1227f.g(obj);
        Object n3 = g3 != null ? X0.a.n(g3) : c1227f.h(obj);
        if (!z3) {
            interfaceC0319c.e(n3);
            return;
        }
        kotlin.jvm.internal.j.c(interfaceC0319c, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        B2.h hVar = (B2.h) interfaceC0319c;
        AbstractC0343b abstractC0343b = hVar.f160e;
        g2.h context = abstractC0343b.getContext();
        Object l3 = B2.a.l(context, hVar.f161g);
        j0 m3 = l3 != B2.a.f ? m(abstractC0343b, context, l3) : null;
        try {
            abstractC0343b.e(n3);
            if (m3 == null || m3.V()) {
                B2.a.f(context, l3);
            }
        } catch (Throwable th) {
            if (m3 == null || m3.V()) {
                B2.a.f(context, l3);
            }
            throw th;
        }
    }

    public static Object j(o2.p pVar) {
        g2.h hVar;
        Thread currentThread = Thread.currentThread();
        C0320d c0320d = C0320d.f4980a;
        H a3 = h0.a();
        boolean booleanValue = ((Boolean) a3.i(Boolean.FALSE, C1237p.f10518g)).booleanValue();
        if (booleanValue) {
            g2.i iVar = g2.i.f4981a;
            hVar = (g2.h) (booleanValue ? a3.i(iVar, C1237p.f) : a3);
            iVar.h(hVar);
        } else {
            hVar = a3;
        }
        D2.d dVar = B.f10462a;
        if (hVar != dVar && hVar.k(c0320d) == null) {
            hVar = hVar.h(dVar);
        }
        C1224c c1224c = new C1224c(hVar, currentThread, a3);
        c1224c.U(1, c1224c, pVar);
        H h3 = c1224c.f10498e;
        if (h3 != null) {
            int i3 = H.f;
            h3.j(false);
        }
        while (!Thread.interrupted()) {
            try {
                long l3 = h3 != null ? h3.l() : Long.MAX_VALUE;
                if (!(c1224c.C() instanceof L)) {
                    if (h3 != null) {
                        int i4 = H.f;
                        h3.e(false);
                    }
                    Object l4 = l(c1224c.C());
                    C1235n c1235n = l4 instanceof C1235n ? (C1235n) l4 : null;
                    if (c1235n == null) {
                        return l4;
                    }
                    throw c1235n.f10517a;
                }
                LockSupport.parkNanos(c1224c, l3);
            } catch (Throwable th) {
                if (h3 != null) {
                    int i5 = H.f;
                    h3.e(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c1224c.q(interruptedException);
        throw interruptedException;
    }

    public static final String k(InterfaceC0319c interfaceC0319c) {
        Object n3;
        if (interfaceC0319c instanceof B2.h) {
            return interfaceC0319c.toString();
        }
        try {
            n3 = interfaceC0319c + '@' + c(interfaceC0319c);
        } catch (Throwable th) {
            n3 = X0.a.n(th);
        }
        if (AbstractC0276f.a(n3) != null) {
            n3 = interfaceC0319c.getClass().getName() + '@' + c(interfaceC0319c);
        }
        return (String) n3;
    }

    public static final Object l(Object obj) {
        L l3;
        M m3 = obj instanceof M ? (M) obj : null;
        return (m3 == null || (l3 = m3.f10474a) == null) ? obj : l3;
    }

    public static final j0 m(InterfaceC0319c interfaceC0319c, g2.h hVar, Object obj) {
        j0 j0Var = null;
        if ((interfaceC0319c instanceof InterfaceC0344c) && hVar.k(k0.f10510a) != null) {
            InterfaceC0344c interfaceC0344c = (InterfaceC0344c) interfaceC0319c;
            while (true) {
                if ((interfaceC0344c instanceof C1246z) || (interfaceC0344c = interfaceC0344c.c()) == null) {
                    break;
                }
                if (interfaceC0344c instanceof j0) {
                    j0Var = (j0) interfaceC0344c;
                    break;
                }
            }
            if (j0Var != null) {
                j0Var.W(hVar, obj);
            }
        }
        return j0Var;
    }

    public static final Object n(g2.h hVar, o2.p pVar, i2.g gVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        g2.h hVar2 = gVar.f5029b;
        kotlin.jvm.internal.j.b(hVar2);
        g2.h h3 = !((Boolean) hVar.i(Boolean.FALSE, C1237p.f10518g)).booleanValue() ? hVar2.h(hVar) : b(hVar2, hVar, false);
        P p3 = (P) h3.k(C1240t.f10525b);
        if (p3 != null && !p3.a()) {
            throw ((Z) p3).y();
        }
        if (h3 == hVar2) {
            B2.s sVar = new B2.s(gVar, h3);
            return AbstractC0086a.Z(sVar, sVar, pVar);
        }
        C0320d c0320d = C0320d.f4980a;
        if (kotlin.jvm.internal.j.a(h3.k(c0320d), hVar2.k(c0320d))) {
            j0 j0Var = new j0(h3, gVar);
            g2.h hVar3 = j0Var.f10494c;
            Object l3 = B2.a.l(hVar3, null);
            try {
                return AbstractC0086a.Z(j0Var, j0Var, pVar);
            } finally {
                B2.a.f(hVar3, l3);
            }
        }
        C1246z c1246z = new C1246z(gVar, h3);
        X0.a.K(pVar, c1246z, c1246z);
        do {
            atomicIntegerFieldUpdater = C1246z.f10537e;
            int i3 = atomicIntegerFieldUpdater.get(c1246z);
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object l4 = l(c1246z.C());
                if (l4 instanceof C1235n) {
                    throw ((C1235n) l4).f10517a;
                }
                return l4;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(c1246z, 0, 1));
        return EnumC0326a.f4994a;
    }
}
