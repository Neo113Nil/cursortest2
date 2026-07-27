package D4;

import G0.C0051a;
import a.AbstractC0169a;
import f4.AbstractC0432i;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k4.C1219e;
import k4.C1224j;
import k4.InterfaceC1218d;
import k4.InterfaceC1220f;
import k4.InterfaceC1221g;
import k4.InterfaceC1222h;
import k4.InterfaceC1223i;
import l4.EnumC1260a;
import m4.AbstractC1295c;
import t4.InterfaceC1445p;

/* renamed from: D4.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0024y {

    /* renamed from: b, reason: collision with root package name */
    public static final C0051a f549b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0051a f550c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0051a f551d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0051a f552e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0051a f553f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0051a f554g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0051a f555h;

    /* renamed from: a, reason: collision with root package name */
    public static final C0051a f548a = new C0051a("RESUME_TOKEN", 2);

    /* renamed from: i, reason: collision with root package name */
    public static final I f556i = new I(false);

    /* renamed from: j, reason: collision with root package name */
    public static final I f557j = new I(true);

    static {
        int i2 = 2;
        f549b = new C0051a("REMOVED_TASK", i2);
        f550c = new C0051a("CLOSED_EMPTY", i2);
        int i3 = 2;
        f551d = new C0051a("COMPLETING_ALREADY", i3);
        f552e = new C0051a("COMPLETING_WAITING_CHILDREN", i3);
        f553f = new C0051a("COMPLETING_RETRY", i3);
        f554g = new C0051a("TOO_LATE_TO_CANCEL", i3);
        f555h = new C0051a("SEALED", i3);
    }

    public static C0013m a() {
        C0013m c0013m = new C0013m(true);
        c0013m.G(null);
        return c0013m;
    }

    public static final I4.e b(InterfaceC1223i interfaceC1223i) {
        if (interfaceC1223i.o(C0021v.f545b) == null) {
            interfaceC1223i = interfaceC1223i.A(new a0(null));
        }
        return new I4.e(interfaceC1223i);
    }

    public static n0 c() {
        return new n0(null);
    }

    public static final Object d(long j2, InterfaceC1218d interfaceC1218d) {
        f4.v vVar = f4.v.f5689a;
        if (j2 <= 0) {
            return vVar;
        }
        C0007g c0007g = new C0007g(1, B0.f.F(interfaceC1218d));
        c0007g.s();
        if (j2 < Long.MAX_VALUE) {
            g(c0007g.f512e).p(j2, c0007g);
        }
        Object r5 = c0007g.r();
        return r5 == EnumC1260a.f11058a ? r5 : vVar;
    }

    public static final void e(InterfaceC1223i interfaceC1223i) {
        X x5 = (X) interfaceC1223i.o(C0021v.f545b);
        if (x5 != null && !x5.a()) {
            throw ((g0) x5).x();
        }
    }

    public static final InterfaceC1223i f(InterfaceC1223i interfaceC1223i, InterfaceC1223i interfaceC1223i2, boolean z) {
        Boolean bool = Boolean.FALSE;
        r rVar = r.f531g;
        boolean booleanValue = ((Boolean) interfaceC1223i.q(bool, rVar)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC1223i2.q(bool, rVar)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC1223i.A(interfaceC1223i2);
        }
        C1224j c1224j = C1224j.f10720a;
        InterfaceC1223i interfaceC1223i3 = (InterfaceC1223i) interfaceC1223i.q(c1224j, new r(2, 2));
        Object obj = interfaceC1223i2;
        if (booleanValue2) {
            obj = interfaceC1223i2.q(c1224j, r.f530f);
        }
        return interfaceC1223i3.A((InterfaceC1223i) obj);
    }

    public static final B g(InterfaceC1223i interfaceC1223i) {
        InterfaceC1221g o2 = interfaceC1223i.o(C1219e.f10719a);
        B b6 = o2 instanceof B ? (B) o2 : null;
        return b6 == null ? A.f456a : b6;
    }

    public static final String h(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0007g i(InterfaceC1218d interfaceC1218d) {
        C0007g c0007g;
        C0007g c0007g2;
        if (!(interfaceC1218d instanceof I4.h)) {
            return new C0007g(1, interfaceC1218d);
        }
        I4.h hVar = (I4.h) interfaceC1218d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I4.h.f1293h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0051a c0051a = I4.a.f1283d;
            c0007g = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, c0051a);
                c0007g2 = null;
                break;
            }
            if (obj instanceof C0007g) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, c0051a)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0007g2 = (C0007g) obj;
                break loop0;
            }
            if (obj != c0051a && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0007g2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0007g.f509g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0007g2);
            if (!(obj2 instanceof C0015o) || ((C0015o) obj2).f523d == null) {
                C0007g.f508f.set(c0007g2, 536870911);
                atomicReferenceFieldUpdater2.set(c0007g2, C0002b.f488a);
                c0007g = c0007g2;
            } else {
                c0007g2.o();
            }
            if (c0007g != null) {
                return c0007g;
            }
        }
        return new C0007g(2, interfaceC1218d);
    }

    public static final void j(Throwable th, InterfaceC1223i interfaceC1223i) {
        try {
            E4.b bVar = (E4.b) interfaceC1223i.o(C0021v.f544a);
            if (bVar != null) {
                bVar.C(th, interfaceC1223i);
            } else {
                I4.a.e(th, interfaceC1223i);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                K1.b.C(runtimeException, th);
                th = runtimeException;
            }
            I4.a.e(th, interfaceC1223i);
        }
    }

    public static /* synthetic */ G k(X x5, boolean z, b0 b0Var, int i2) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        return ((g0) x5).H(z, (i2 & 2) != 0, b0Var);
    }

    public static final boolean l(InterfaceC0022w interfaceC0022w) {
        X x5 = (X) interfaceC0022w.g().o(C0021v.f545b);
        if (x5 != null) {
            return x5.a();
        }
        return true;
    }

    public static final boolean m(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static m0 n(InterfaceC0022w interfaceC0022w, AbstractC0020u abstractC0020u, int i2, InterfaceC1445p interfaceC1445p, int i3) {
        InterfaceC1223i interfaceC1223i = abstractC0020u;
        if ((i3 & 1) != 0) {
            interfaceC1223i = C1224j.f10720a;
        }
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        InterfaceC1223i f3 = f(interfaceC0022w.g(), interfaceC1223i, true);
        K4.d dVar = E.f459a;
        if (f3 != dVar && f3.o(C1219e.f10719a) == null) {
            f3 = f3.A(dVar);
        }
        if (i2 == 0) {
            throw null;
        }
        m0 h0Var = i2 == 2 ? new h0(f3, interfaceC1445p) : new m0(f3, true);
        h0Var.Y(i2, h0Var, interfaceC1445p);
        return h0Var;
    }

    public static final Object o(Object obj) {
        return obj instanceof C0016p ? e5.g.l(((C0016p) obj).f526a) : obj;
    }

    public static final void p(C0007g c0007g, InterfaceC1218d interfaceC1218d, boolean z) {
        Object obj = C0007g.f509g.get(c0007g);
        Throwable e3 = c0007g.e(obj);
        Object l2 = e3 != null ? e5.g.l(e3) : c0007g.g(obj);
        if (!z) {
            interfaceC1218d.resumeWith(l2);
            return;
        }
        kotlin.jvm.internal.i.c(interfaceC1218d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        I4.h hVar = (I4.h) interfaceC1218d;
        AbstractC1295c abstractC1295c = hVar.f1295e;
        InterfaceC1223i context = abstractC1295c.getContext();
        Object n6 = I4.a.n(context, hVar.f1297g);
        v0 v4 = n6 != I4.a.f1285f ? v(abstractC1295c, context, n6) : null;
        try {
            abstractC1295c.resumeWith(l2);
        } finally {
            if (v4 == null || v4.Z()) {
                I4.a.h(context, n6);
            }
        }
    }

    public static final Object q(InterfaceC1223i interfaceC1223i, InterfaceC1445p interfaceC1445p) {
        O o2;
        InterfaceC1223i f3;
        Thread currentThread = Thread.currentThread();
        InterfaceC1222h interfaceC1222h = C1219e.f10719a;
        InterfaceC1220f interfaceC1220f = (InterfaceC1220f) interfaceC1223i.o(interfaceC1222h);
        C1224j c1224j = C1224j.f10720a;
        if (interfaceC1220f == null) {
            o2 = p0.a();
            f3 = f(c1224j, interfaceC1223i.A(o2), true);
            K4.d dVar = E.f459a;
            if (f3 != dVar && f3.o(interfaceC1222h) == null) {
                f3 = f3.A(dVar);
            }
        } else {
            if (interfaceC1220f instanceof O) {
            }
            o2 = (O) p0.f527a.get();
            f3 = f(c1224j, interfaceC1223i, true);
            K4.d dVar2 = E.f459a;
            if (f3 != dVar2 && f3.o(interfaceC1222h) == null) {
                f3 = f3.A(dVar2);
            }
        }
        C0003c c0003c = new C0003c(f3, currentThread, o2);
        c0003c.Y(1, c0003c, interfaceC1445p);
        O o5 = c0003c.f491e;
        if (o5 != null) {
            int i2 = O.f475f;
            o5.I(false);
        }
        while (!Thread.interrupted()) {
            try {
                long K5 = o5 != null ? o5.K() : Long.MAX_VALUE;
                if (c0003c.I()) {
                    if (o5 != null) {
                        int i3 = O.f475f;
                        o5.F(false);
                    }
                    Object u5 = u(c0003c.D());
                    C0016p c0016p = u5 instanceof C0016p ? (C0016p) u5 : null;
                    if (c0016p == null) {
                        return u5;
                    }
                    throw c0016p.f526a;
                }
                LockSupport.parkNanos(c0003c, K5);
            } catch (Throwable th) {
                if (o5 != null) {
                    int i6 = O.f475f;
                    o5.F(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0003c.n(interruptedException);
        throw interruptedException;
    }

    public static final Object s(s0 s0Var, InterfaceC1445p interfaceC1445p) {
        Object c0016p;
        Object M5;
        s0Var.H(false, true, new H(0, g(s0Var.f1321d.getContext()).y(s0Var.f535e, s0Var, s0Var.f486c)));
        try {
            kotlin.jvm.internal.v.b(2, interfaceC1445p);
            c0016p = interfaceC1445p.invoke(s0Var, s0Var);
        } catch (Throwable th) {
            c0016p = new C0016p(th, false);
        }
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (c0016p == enumC1260a || (M5 = s0Var.M(c0016p)) == f552e) {
            return enumC1260a;
        }
        if (M5 instanceof C0016p) {
            Throwable th2 = ((C0016p) M5).f526a;
            if (!(th2 instanceof r0)) {
                throw th2;
            }
            if (((r0) th2).f533a != s0Var) {
                throw th2;
            }
            if (c0016p instanceof C0016p) {
                throw ((C0016p) c0016p).f526a;
            }
        } else {
            c0016p = u(M5);
        }
        return c0016p;
    }

    public static final String t(InterfaceC1218d interfaceC1218d) {
        Object l2;
        if (interfaceC1218d instanceof I4.h) {
            return interfaceC1218d.toString();
        }
        try {
            l2 = interfaceC1218d + '@' + h(interfaceC1218d);
        } catch (Throwable th) {
            l2 = e5.g.l(th);
        }
        if (AbstractC0432i.a(l2) != null) {
            l2 = interfaceC1218d.getClass().getName() + '@' + h(interfaceC1218d);
        }
        return (String) l2;
    }

    public static final Object u(Object obj) {
        U u5;
        V v4 = obj instanceof V ? (V) obj : null;
        return (v4 == null || (u5 = v4.f482a) == null) ? obj : u5;
    }

    public static final v0 v(InterfaceC1218d interfaceC1218d, InterfaceC1223i interfaceC1223i, Object obj) {
        v0 v0Var = null;
        if (!(interfaceC1218d instanceof m4.d)) {
            return null;
        }
        if (interfaceC1223i.o(w0.f547a) != null) {
            m4.d dVar = (m4.d) interfaceC1218d;
            while (true) {
                if ((dVar instanceof C) || (dVar = dVar.getCallerFrame()) == null) {
                    break;
                }
                if (dVar instanceof v0) {
                    v0Var = (v0) dVar;
                    break;
                }
            }
            if (v0Var != null) {
                v0Var.a0(interfaceC1223i, obj);
            }
        }
        return v0Var;
    }

    public static final Object w(InterfaceC1223i interfaceC1223i, InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        Object u5;
        InterfaceC1223i context = interfaceC1218d.getContext();
        InterfaceC1223i A5 = !((Boolean) interfaceC1223i.q(Boolean.FALSE, r.f531g)).booleanValue() ? context.A(interfaceC1223i) : f(context, interfaceC1223i, false);
        e(A5);
        if (A5 == context) {
            I4.t tVar = new I4.t(interfaceC1218d, A5);
            u5 = AbstractC0169a.G(tVar, tVar, interfaceC1445p);
        } else {
            C1219e c1219e = C1219e.f10719a;
            if (kotlin.jvm.internal.i.a(A5.o(c1219e), context.o(c1219e))) {
                v0 v0Var = new v0(interfaceC1218d, A5);
                InterfaceC1223i interfaceC1223i2 = v0Var.f486c;
                Object n6 = I4.a.n(interfaceC1223i2, null);
                try {
                    Object G5 = AbstractC0169a.G(v0Var, v0Var, interfaceC1445p);
                    I4.a.h(interfaceC1223i2, n6);
                    u5 = G5;
                } catch (Throwable th) {
                    I4.a.h(interfaceC1223i2, n6);
                    throw th;
                }
            } else {
                C c2 = new C(interfaceC1218d, A5);
                K1.b.p0(interfaceC1445p, c2, c2);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C.f457e;
                    int i2 = atomicIntegerFieldUpdater.get(c2);
                    if (i2 != 0) {
                        if (i2 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        u5 = u(c2.D());
                        if (u5 instanceof C0016p) {
                            throw ((C0016p) u5).f526a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(c2, 0, 1)) {
                        u5 = EnumC1260a.f11058a;
                        break;
                    }
                }
            }
        }
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        return u5;
    }

    public static final Object x(long j2, InterfaceC1445p interfaceC1445p, AbstractC1295c abstractC1295c) {
        if (j2 <= 0) {
            throw new r0("Timed out immediately", null);
        }
        Object s2 = s(new s0(j2, abstractC1295c), interfaceC1445p);
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        return s2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(long j2, InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        t0 t0Var;
        int i2;
        kotlin.jvm.internal.s sVar;
        if (interfaceC1218d instanceof t0) {
            t0Var = (t0) interfaceC1218d;
            int i3 = t0Var.f541d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                t0Var.f541d = i3 - Integer.MIN_VALUE;
                Object obj = t0Var.f540c;
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = t0Var.f541d;
                if (i2 != 0) {
                    e5.g.y(obj);
                    if (j2 <= 0) {
                        return null;
                    }
                    kotlin.jvm.internal.s sVar2 = new kotlin.jvm.internal.s();
                    try {
                        t0Var.f538a = interfaceC1445p;
                        t0Var.f539b = sVar2;
                        t0Var.f541d = 1;
                        s0 s0Var = new s0(j2, t0Var);
                        sVar2.f10741a = s0Var;
                        obj = s(s0Var, interfaceC1445p);
                        if (obj == enumC1260a) {
                            return enumC1260a;
                        }
                    } catch (r0 e3) {
                        e = e3;
                        sVar = sVar2;
                        if (e.f533a != sVar.f10741a) {
                            return null;
                        }
                        throw e;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = t0Var.f539b;
                    try {
                        e5.g.y(obj);
                    } catch (r0 e6) {
                        e = e6;
                        if (e.f533a != sVar.f10741a) {
                        }
                    }
                }
                return obj;
            }
        }
        t0Var = new t0(interfaceC1218d);
        Object obj2 = t0Var.f540c;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = t0Var.f541d;
        if (i2 != 0) {
        }
        return obj2;
    }
}
