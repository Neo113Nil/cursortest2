package p4;

import a4.AbstractC0470a;
import b4.EnumC0510a;
import c4.AbstractC0542c;
import c4.InterfaceC0543d;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import q4.C2313c;
import r0.AbstractC2346c;
import t3.AbstractC2425d;

/* renamed from: p4.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2282w {

    /* renamed from: b, reason: collision with root package name */
    public static final H3.g f18827b;

    /* renamed from: c, reason: collision with root package name */
    public static final H3.g f18828c;

    /* renamed from: d, reason: collision with root package name */
    public static final H3.g f18829d;

    /* renamed from: e, reason: collision with root package name */
    public static final H3.g f18830e;
    public static final H3.g f;

    /* renamed from: g, reason: collision with root package name */
    public static final H3.g f18831g;

    /* renamed from: h, reason: collision with root package name */
    public static final H3.g f18832h;

    /* renamed from: a, reason: collision with root package name */
    public static final H3.g f18826a = new H3.g("RESUME_TOKEN", 5);
    public static final F i = new F(false);

    /* renamed from: j, reason: collision with root package name */
    public static final F f18833j = new F(true);

    static {
        int i5 = 5;
        f18827b = new H3.g("REMOVED_TASK", i5);
        f18828c = new H3.g("CLOSED_EMPTY", i5);
        int i6 = 5;
        f18829d = new H3.g("COMPLETING_ALREADY", i6);
        f18830e = new H3.g("COMPLETING_WAITING_CHILDREN", i6);
        f = new H3.g("COMPLETING_RETRY", i6);
        f18831g = new H3.g("TOO_LATE_TO_CANCEL", i6);
        f18832h = new H3.g("SEALED", i6);
    }

    public static final u4.c a(a4.h hVar) {
        if (hVar.l(r.f18819l) == null) {
            hVar = hVar.m(new W(null));
        }
        return new u4.c(hVar);
    }

    public static i0 b() {
        return new i0(null);
    }

    public static C2285z c(InterfaceC2280u interfaceC2280u, C2313c c2313c, i4.e eVar, int i5) {
        boolean z3 = true;
        a4.h hVar = c2313c;
        if ((i5 & 1) != 0) {
            hVar = a4.i.f6649k;
        }
        EnumC2281v enumC2281v = EnumC2281v.f18821k;
        C2285z c2285z = new C2285z(q(interfaceC2280u, hVar), z3, 0);
        c2285z.e0(enumC2281v, c2285z, eVar);
        return c2285z;
    }

    public static final void d(InterfaceC2280u interfaceC2280u, CancellationException cancellationException) {
        U u5 = (U) interfaceC2280u.i().l(r.f18819l);
        if (u5 != null) {
            u5.d(cancellationException);
        } else {
            throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + interfaceC2280u).toString());
        }
    }

    public static final Object e(i4.e eVar, a4.c cVar) {
        u4.p pVar = new u4.p(cVar, cVar.getContext());
        return v.q0.d(pVar, pVar, eVar);
    }

    public static final Object f(long j5, AbstractC0542c abstractC0542c) {
        W3.o oVar = W3.o.f6046a;
        if (j5 > 0) {
            C2268h c2268h = new C2268h(1, AbstractC2346c.v(abstractC0542c));
            c2268h.r();
            if (j5 < Long.MAX_VALUE) {
                a4.f l5 = c2268h.f18796o.l(a4.d.f6648k);
                InterfaceC2259A interfaceC2259A = l5 instanceof InterfaceC2259A ? (InterfaceC2259A) l5 : null;
                if (interfaceC2259A == null) {
                    interfaceC2259A = AbstractC2284y.f18836a;
                }
                interfaceC2259A.i(j5, c2268h);
            }
            Object q5 = c2268h.q();
            if (q5 == EnumC0510a.f7289k) {
                return q5;
            }
        }
        return oVar;
    }

    public static final void g(a4.h hVar) {
        U u5 = (U) hVar.l(r.f18819l);
        if (u5 != null && !u5.b()) {
            throw u5.s();
        }
    }

    public static final a4.h h(a4.h hVar, a4.h hVar2, boolean z3) {
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) hVar.A(new S3.L(9), bool)).booleanValue();
        boolean booleanValue2 = ((Boolean) hVar2.A(new S3.L(9), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return hVar.m(hVar2);
        }
        a4.i iVar = a4.i.f6649k;
        a4.h hVar3 = (a4.h) hVar.A(new S3.L(7), iVar);
        Object obj = hVar2;
        if (booleanValue2) {
            obj = hVar2.A(new S3.L(8), iVar);
        }
        return hVar3.m((a4.h) obj);
    }

    public static final String i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final U j(a4.h hVar) {
        U u5 = (U) hVar.l(r.f18819l);
        if (u5 != null) {
            return u5;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + hVar).toString());
    }

    public static final C2268h k(a4.c cVar) {
        C2268h c2268h;
        C2268h c2268h2;
        if (!(cVar instanceof u4.f)) {
            return new C2268h(1, cVar);
        }
        u4.f fVar = (u4.f) cVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = u4.f.f20086r;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            H3.g gVar = u4.a.f20077c;
            c2268h = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, gVar);
                c2268h2 = null;
                break;
            }
            if (obj instanceof C2268h) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, gVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c2268h2 = (C2268h) obj;
                break loop0;
            }
            if (obj != gVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c2268h2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C2268h.f18793q;
            Object obj2 = atomicReferenceFieldUpdater2.get(c2268h2);
            if (!(obj2 instanceof C2274n) || ((C2274n) obj2).f18808d == null) {
                C2268h.f18792p.set(c2268h2, 536870911);
                atomicReferenceFieldUpdater2.set(c2268h2, C2262b.f18779a);
                c2268h = c2268h2;
            } else {
                c2268h2.n();
            }
            if (c2268h != null) {
                return c2268h;
            }
        }
        return new C2268h(2, cVar);
    }

    public static final void l(a4.h hVar, Throwable th) {
        try {
            InterfaceC2278s interfaceC2278s = (InterfaceC2278s) hVar.l(r.f18818k);
            if (interfaceC2278s != null) {
                interfaceC2278s.k(hVar, th);
            } else {
                u4.a.d(hVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC2425d.j(runtimeException, th);
                th = runtimeException;
            }
            u4.a.d(hVar, th);
        }
    }

    public static final E m(U u5, boolean z3, X x5) {
        if (u5 instanceof b0) {
            return ((b0) u5).O(z3, x5);
        }
        return u5.f(x5.k(), z3, new E.q0(1, x5, X.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 3));
    }

    public static final boolean n(a4.h hVar) {
        U u5 = (U) hVar.l(r.f18819l);
        if (u5 != null) {
            return u5.b();
        }
        return true;
    }

    public static final boolean o(InterfaceC2280u interfaceC2280u) {
        U u5 = (U) interfaceC2280u.i().l(r.f18819l);
        if (u5 != null) {
            return u5.b();
        }
        return true;
    }

    public static C2285z p(InterfaceC2280u interfaceC2280u, AbstractC0470a abstractC0470a, i4.e eVar, int i5) {
        EnumC2281v enumC2281v = EnumC2281v.f18824n;
        a4.h hVar = abstractC0470a;
        if ((i5 & 1) != 0) {
            hVar = a4.i.f6649k;
        }
        if ((i5 & 2) != 0) {
            enumC2281v = EnumC2281v.f18821k;
        }
        a4.h q5 = q(interfaceC2280u, hVar);
        C2285z c0Var = enumC2281v == EnumC2281v.f18822l ? new c0(q5, eVar) : new C2285z(q5, true, 1);
        c0Var.e0(enumC2281v, c0Var, eVar);
        return c0Var;
    }

    public static final a4.h q(InterfaceC2280u interfaceC2280u, a4.h hVar) {
        a4.h h3 = h(interfaceC2280u.i(), hVar, true);
        w4.e eVar = D.f18743a;
        return (h3 == eVar || h3.l(a4.d.f6648k) != null) ? h3 : h3.m(eVar);
    }

    public static final Object r(Object obj) {
        return obj instanceof C2275o ? G4.l.p(((C2275o) obj).f18812a) : obj;
    }

    public static final void s(C2268h c2268h, a4.c cVar, boolean z3) {
        Object obj = C2268h.f18793q.get(c2268h);
        Throwable e3 = c2268h.e(obj);
        Object p5 = e3 != null ? G4.l.p(e3) : c2268h.f(obj);
        if (!z3) {
            cVar.resumeWith(p5);
            return;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", cVar);
        u4.f fVar = (u4.f) cVar;
        AbstractC0542c abstractC0542c = fVar.f20088o;
        a4.h context = abstractC0542c.getContext();
        Object l5 = u4.a.l(context, fVar.f20090q);
        o0 v4 = l5 != u4.a.f20078d ? v(abstractC0542c, context, l5) : null;
        try {
            abstractC0542c.resumeWith(p5);
            if (v4 == null || v4.f0()) {
                u4.a.g(context, l5);
            }
        } catch (Throwable th) {
            if (v4 == null || v4.f0()) {
                u4.a.g(context, l5);
            }
            throw th;
        }
    }

    public static final String t(a4.c cVar) {
        Object p5;
        if (cVar instanceof u4.f) {
            return ((u4.f) cVar).toString();
        }
        try {
            p5 = cVar + '@' + i(cVar);
        } catch (Throwable th) {
            p5 = G4.l.p(th);
        }
        if (W3.k.a(p5) != null) {
            p5 = cVar.getClass().getName() + '@' + i(cVar);
        }
        return (String) p5;
    }

    public static final Object u(Object obj) {
        O o5;
        P p5 = obj instanceof P ? (P) obj : null;
        return (p5 == null || (o5 = p5.f18759a) == null) ? obj : o5;
    }

    public static final o0 v(a4.c cVar, a4.h hVar, Object obj) {
        o0 o0Var = null;
        if ((cVar instanceof InterfaceC0543d) && hVar.l(p0.f18816k) != null) {
            InterfaceC0543d interfaceC0543d = (InterfaceC0543d) cVar;
            while (true) {
                if ((interfaceC0543d instanceof C2260B) || (interfaceC0543d = interfaceC0543d.getCallerFrame()) == null) {
                    break;
                }
                if (interfaceC0543d instanceof o0) {
                    o0Var = (o0) interfaceC0543d;
                    break;
                }
            }
            if (o0Var != null) {
                o0Var.g0(hVar, obj);
            }
        }
        return o0Var;
    }

    public static final Object w(a4.h hVar, i4.e eVar, a4.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        a4.h context = cVar.getContext();
        a4.h m5 = !((Boolean) hVar.A(new S3.L(9), Boolean.FALSE)).booleanValue() ? context.m(hVar) : h(context, hVar, false);
        g(m5);
        if (m5 == context) {
            u4.p pVar = new u4.p(cVar, m5);
            return v.q0.d(pVar, pVar, eVar);
        }
        a4.d dVar = a4.d.f6648k;
        if (kotlin.jvm.internal.l.a(m5.l(dVar), context.l(dVar))) {
            o0 o0Var = new o0(cVar, m5);
            a4.h hVar2 = o0Var.f18774m;
            Object l5 = u4.a.l(hVar2, null);
            try {
                return v.q0.d(o0Var, o0Var, eVar);
            } finally {
                u4.a.g(hVar2, l5);
            }
        }
        C2260B c2260b = new C2260B(cVar, m5);
        try {
            u4.a.h(AbstractC2346c.v(AbstractC2346c.j(c2260b, c2260b, eVar)), W3.o.f6046a);
            do {
                atomicIntegerFieldUpdater = C2260B.f18741o;
                int i5 = atomicIntegerFieldUpdater.get(c2260b);
                if (i5 != 0) {
                    if (i5 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object u5 = u(b0.f18780k.get(c2260b));
                    if (u5 instanceof C2275o) {
                        throw ((C2275o) u5).f18812a;
                    }
                    return u5;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c2260b, 0, 1));
            return EnumC0510a.f7289k;
        } catch (Throwable th) {
            c2260b.resumeWith(G4.l.p(th));
            throw th;
        }
    }
}
