package D6;

import F2.W0;
import a.AbstractC0603a;
import f6.C1113f;
import f6.C1116i;
import g6.C1167p;
import i6.C1288e;
import i6.C1293j;
import i6.InterfaceC1287d;
import i6.InterfaceC1290g;
import i6.InterfaceC1292i;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import k6.AbstractC1356c;
import k6.AbstractC1362i;
import k6.InterfaceC1357d;
import kotlin.jvm.functions.Function2;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f1778a = new W0("RESUME_TOKEN", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final W0 f1779b = new W0("REMOVED_TASK", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final W0 f1780c = new W0("CLOSED_EMPTY", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final W0 f1781d = new W0("COMPLETING_ALREADY", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final W0 f1782e = new W0("COMPLETING_WAITING_CHILDREN", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final W0 f1783f = new W0("COMPLETING_RETRY", 1);

    /* renamed from: g, reason: collision with root package name */
    public static final W0 f1784g = new W0("TOO_LATE_TO_CANCEL", 1);

    /* renamed from: h, reason: collision with root package name */
    public static final W0 f1785h = new W0("SEALED", 1);

    /* renamed from: i, reason: collision with root package name */
    public static final Q f1786i = new Q(false);
    public static final Q j = new Q(true);

    public static C0136t a() {
        C0136t c0136t = new C0136t(true);
        c0136t.A(null);
        return c0136t;
    }

    public static final I6.e b(InterfaceC1292i interfaceC1292i) {
        if (interfaceC1292i.get(B.f1775b) == null) {
            interfaceC1292i = interfaceC1292i.plus(new C0124h0(null));
        }
        return new I6.e(interfaceC1292i);
    }

    public static I c(C c3, Function2 function2) {
        I i7 = new I(q(c3, C1293j.f14068a), true);
        i7.Q(1, i7, function2);
        return i7;
    }

    public static final Object d(H[] hArr, AbstractC1362i abstractC1362i) {
        if (hArr.length == 0) {
            return C1167p.f13302a;
        }
        C0117e c0117e = new C0117e(hArr);
        C0130m c0130m = new C0130m(1, P6.b.v(abstractC1362i));
        c0130m.s();
        int length = hArr.length;
        C0113c[] c0113cArr = new C0113c[length];
        for (int i7 = 0; i7 < length; i7++) {
            H h6 = hArr[i7];
            h6.start();
            C0113c c0113c = new C0113c(c0117e, c0130m);
            c0113c.f1821f = h6.invokeOnCompletion(c0113c);
            c0113cArr[i7] = c0113c;
        }
        C0115d c0115d = new C0115d(c0113cArr);
        for (int i8 = 0; i8 < length; i8++) {
            C0113c c0113c2 = c0113cArr[i8];
            c0113c2.getClass();
            C0113c.f1819y.set(c0113c2, c0115d);
        }
        if (C0130m.f1855x.get(c0130m) instanceof w0) {
            c0130m.u(c0115d);
        } else {
            c0115d.c();
        }
        Object r7 = c0130m.r();
        j6.a aVar = j6.a.f14642a;
        return r7;
    }

    public static final Object e(Function2 function2, InterfaceC1287d interfaceC1287d) {
        I6.t tVar = new I6.t(interfaceC1287d, interfaceC1287d.getContext());
        Object b02 = p3.f.b0(tVar, tVar, function2);
        j6.a aVar = j6.a.f14642a;
        return b02;
    }

    public static final void f(InterfaceC1292i interfaceC1292i) {
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) interfaceC1292i.get(B.f1775b);
        if (interfaceC0118e0 != null && !interfaceC0118e0.isActive()) {
            throw interfaceC0118e0.getCancellationException();
        }
    }

    public static final InterfaceC1292i g(InterfaceC1292i interfaceC1292i, InterfaceC1292i interfaceC1292i2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        C0140x c0140x = C0140x.f1887c;
        boolean booleanValue = ((Boolean) interfaceC1292i.fold(bool, c0140x)).booleanValue();
        boolean booleanValue2 = ((Boolean) interfaceC1292i2.fold(bool, c0140x)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return interfaceC1292i.plus(interfaceC1292i2);
        }
        C1293j c1293j = C1293j.f14068a;
        InterfaceC1292i interfaceC1292i3 = (InterfaceC1292i) interfaceC1292i.fold(c1293j, new C0140x(2, 2));
        Object obj = interfaceC1292i2;
        if (booleanValue2) {
            obj = interfaceC1292i2.fold(c1293j, C0140x.f1886b);
        }
        return interfaceC1292i3.plus((InterfaceC1292i) obj);
    }

    public static final J h(InterfaceC1292i interfaceC1292i) {
        InterfaceC1290g interfaceC1290g = interfaceC1292i.get(C1288e.f14067a);
        J j3 = interfaceC1290g instanceof J ? (J) interfaceC1290g : null;
        return j3 == null ? G.f1791a : j3;
    }

    public static final String i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0130m j(InterfaceC1287d interfaceC1287d) {
        C0130m c0130m;
        C0130m c0130m2;
        if (!(interfaceC1287d instanceof I6.h)) {
            return new C0130m(1, interfaceC1287d);
        }
        I6.h hVar = (I6.h) interfaceC1287d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.h.f3729y;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            W0 w02 = I6.a.f3719d;
            c0130m = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, w02);
                c0130m2 = null;
                break;
            }
            if (obj instanceof C0130m) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, w02)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0130m2 = (C0130m) obj;
                break loop0;
            }
            if (obj != w02 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0130m2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0130m.f1855x;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0130m2);
            if (!(obj2 instanceof C0137u) || ((C0137u) obj2).f1879d == null) {
                C0130m.f1854f.set(c0130m2, 536870911);
                atomicReferenceFieldUpdater2.set(c0130m2, C0111b.f1818a);
                c0130m = c0130m2;
            } else {
                c0130m2.o();
            }
            if (c0130m != null) {
                return c0130m;
            }
        }
        return new C0130m(2, interfaceC1287d);
    }

    public static final void k(InterfaceC1292i interfaceC1292i, Throwable th) {
        try {
            E6.b bVar = (E6.b) interfaceC1292i.get(B.f1774a);
            if (bVar != null) {
                bVar.d(interfaceC1292i, th);
            } else {
                I6.a.d(interfaceC1292i, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                Q0.a.c(runtimeException, th);
                th = runtimeException;
            }
            I6.a.d(interfaceC1292i, th);
        }
    }

    public static /* synthetic */ O l(InterfaceC0118e0 interfaceC0118e0, boolean z4, AbstractC0126i0 abstractC0126i0, int i7) {
        if ((i7 & 1) != 0) {
            z4 = false;
        }
        return interfaceC0118e0.invokeOnCompletion(z4, (i7 & 2) != 0, abstractC0126i0);
    }

    public static final boolean m(int i7) {
        return i7 == 1 || i7 == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(List list, AbstractC1356c abstractC1356c) {
        C0121g c0121g;
        int i7;
        Iterator it;
        if (abstractC1356c instanceof C0121g) {
            c0121g = (C0121g) abstractC1356c;
            int i8 = c0121g.f1837c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0121g.f1837c = i8 - Integer.MIN_VALUE;
                Object obj = c0121g.f1836b;
                j6.a aVar = j6.a.f14642a;
                i7 = c0121g.f1837c;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    it = list.iterator();
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = c0121g.f1835a;
                    AbstractC0603a.p0(obj);
                }
                while (it.hasNext()) {
                    InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) it.next();
                    c0121g.f1835a = it;
                    c0121g.f1837c = 1;
                    if (interfaceC0118e0.join(c0121g) == aVar) {
                        return aVar;
                    }
                }
                return C1116i.f13008a;
            }
        }
        c0121g = new C0121g(abstractC1356c);
        Object obj2 = c0121g.f1836b;
        j6.a aVar2 = j6.a.f14642a;
        i7 = c0121g.f1837c;
        if (i7 != 0) {
        }
        while (it.hasNext()) {
        }
        return C1116i.f13008a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(InterfaceC0118e0[] interfaceC0118e0Arr, AbstractC1356c abstractC1356c) {
        C0119f c0119f;
        int i7;
        int i8;
        InterfaceC0118e0[] interfaceC0118e0Arr2;
        int length;
        if (abstractC1356c instanceof C0119f) {
            c0119f = (C0119f) abstractC1356c;
            int i9 = c0119f.f1833e;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c0119f.f1833e = i9 - Integer.MIN_VALUE;
                Object obj = c0119f.f1832d;
                j6.a aVar = j6.a.f14642a;
                i7 = c0119f.f1833e;
                if (i7 != 0) {
                    AbstractC0603a.p0(obj);
                    i8 = 0;
                    interfaceC0118e0Arr2 = interfaceC0118e0Arr;
                    length = interfaceC0118e0Arr.length;
                    if (i8 < length) {
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    length = c0119f.f1831c;
                    i8 = c0119f.f1830b;
                    InterfaceC0118e0[] interfaceC0118e0Arr3 = (InterfaceC0118e0[]) c0119f.f1829a;
                    AbstractC0603a.p0(obj);
                    interfaceC0118e0Arr2 = interfaceC0118e0Arr3;
                    i8++;
                    if (i8 < length) {
                        InterfaceC0118e0 interfaceC0118e0 = interfaceC0118e0Arr2[i8];
                        c0119f.f1829a = interfaceC0118e0Arr2;
                        c0119f.f1830b = i8;
                        c0119f.f1831c = length;
                        c0119f.f1833e = 1;
                        if (interfaceC0118e0.join(c0119f) == aVar) {
                            return aVar;
                        }
                        i8++;
                        if (i8 < length) {
                            return C1116i.f13008a;
                        }
                    }
                }
            }
        }
        c0119f = new C0119f(abstractC1356c);
        Object obj2 = c0119f.f1832d;
        j6.a aVar2 = j6.a.f14642a;
        i7 = c0119f.f1833e;
        if (i7 != 0) {
        }
    }

    public static z0 p(C c3, Function2 function2) {
        z0 z0Var = new z0(q(c3, C1293j.f14068a), true);
        z0Var.Q(1, z0Var, function2);
        return z0Var;
    }

    public static final InterfaceC1292i q(C c3, InterfaceC1292i interfaceC1292i) {
        InterfaceC1292i g3 = g(c3.c(), interfaceC1292i, true);
        K6.d dVar = M.f1796a;
        return (g3 == dVar || g3.get(C1288e.f14067a) != null) ? g3 : g3.plus(dVar);
    }

    public static final Object r(Object obj) {
        return obj instanceof C0138v ? AbstractC0603a.h(((C0138v) obj).f1882a) : obj;
    }

    public static final void s(C0130m c0130m, InterfaceC1287d interfaceC1287d, boolean z4) {
        Object obj = C0130m.f1855x.get(c0130m);
        Throwable g3 = c0130m.g(obj);
        Object h6 = g3 != null ? AbstractC0603a.h(g3) : c0130m.h(obj);
        if (!z4) {
            interfaceC1287d.resumeWith(h6);
            return;
        }
        t6.h.c(interfaceC1287d, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        I6.h hVar = (I6.h) interfaceC1287d;
        AbstractC1356c abstractC1356c = hVar.f3731e;
        InterfaceC1292i context = abstractC1356c.getContext();
        Object m7 = I6.a.m(context, hVar.f3733x);
        G0 w7 = m7 != I6.a.f3721f ? w(abstractC1356c, context, m7) : null;
        try {
            abstractC1356c.resumeWith(h6);
        } finally {
            if (w7 == null || w7.R()) {
                I6.a.g(context, m7);
            }
        }
    }

    public static Object t(Function2 function2) {
        C1293j c1293j = C1293j.f14068a;
        Thread currentThread = Thread.currentThread();
        C1288e c1288e = C1288e.f14067a;
        X a2 = C0.a();
        InterfaceC1292i g3 = g(c1293j, a2, true);
        K6.d dVar = M.f1796a;
        if (g3 != dVar && g3.get(c1288e) == null) {
            g3 = g3.plus(dVar);
        }
        C0123h c0123h = new C0123h(g3, currentThread, a2);
        c0123h.Q(1, c0123h, function2);
        X x4 = c0123h.f1839e;
        if (x4 != null) {
            int i7 = X.f1811f;
            x4.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long i8 = x4 != null ? x4.i() : Long.MAX_VALUE;
                if (!(c0123h.x() instanceof InterfaceC0112b0)) {
                    if (x4 != null) {
                        int i9 = X.f1811f;
                        x4.f(false);
                    }
                    Object v6 = v(c0123h.x());
                    C0138v c0138v = v6 instanceof C0138v ? (C0138v) v6 : null;
                    if (c0138v == null) {
                        return v6;
                    }
                    throw c0138v.f1882a;
                }
                LockSupport.parkNanos(c0123h, i8);
            } catch (Throwable th) {
                if (x4 != null) {
                    int i10 = X.f1811f;
                    x4.f(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0123h.k(interruptedException);
        throw interruptedException;
    }

    public static final String u(InterfaceC1287d interfaceC1287d) {
        Object h6;
        if (interfaceC1287d instanceof I6.h) {
            return interfaceC1287d.toString();
        }
        try {
            h6 = interfaceC1287d + '@' + i(interfaceC1287d);
        } catch (Throwable th) {
            h6 = AbstractC0603a.h(th);
        }
        if (C1113f.a(h6) != null) {
            h6 = interfaceC1287d.getClass().getName() + '@' + i(interfaceC1287d);
        }
        return (String) h6;
    }

    public static final Object v(Object obj) {
        InterfaceC0112b0 interfaceC0112b0;
        C0114c0 c0114c0 = obj instanceof C0114c0 ? (C0114c0) obj : null;
        return (c0114c0 == null || (interfaceC0112b0 = c0114c0.f1823a) == null) ? obj : interfaceC0112b0;
    }

    public static final G0 w(InterfaceC1287d interfaceC1287d, InterfaceC1292i interfaceC1292i, Object obj) {
        G0 g02 = null;
        if (!(interfaceC1287d instanceof InterfaceC1357d)) {
            return null;
        }
        if (interfaceC1292i.get(H0.f1793a) != null) {
            InterfaceC1357d interfaceC1357d = (InterfaceC1357d) interfaceC1287d;
            while (true) {
                if ((interfaceC1357d instanceof K) || (interfaceC1357d = interfaceC1357d.getCallerFrame()) == null) {
                    break;
                }
                if (interfaceC1357d instanceof G0) {
                    g02 = (G0) interfaceC1357d;
                    break;
                }
            }
            if (g02 != null) {
                g02.S(interfaceC1292i, obj);
            }
        }
        return g02;
    }

    public static final Object x(InterfaceC1292i interfaceC1292i, Function2 function2, InterfaceC1287d interfaceC1287d) {
        Object v6;
        InterfaceC1292i context = interfaceC1287d.getContext();
        InterfaceC1292i plus = !((Boolean) interfaceC1292i.fold(Boolean.FALSE, C0140x.f1887c)).booleanValue() ? context.plus(interfaceC1292i) : g(context, interfaceC1292i, false);
        f(plus);
        if (plus == context) {
            I6.t tVar = new I6.t(interfaceC1287d, plus);
            v6 = p3.f.b0(tVar, tVar, function2);
        } else {
            C1288e c1288e = C1288e.f14067a;
            if (t6.h.a(plus.get(c1288e), context.get(c1288e))) {
                G0 g02 = new G0(interfaceC1287d, plus);
                InterfaceC1292i interfaceC1292i2 = g02.f1816c;
                Object m7 = I6.a.m(interfaceC1292i2, null);
                try {
                    Object b02 = p3.f.b0(g02, g02, function2);
                    I6.a.g(interfaceC1292i2, m7);
                    v6 = b02;
                } catch (Throwable th) {
                    I6.a.g(interfaceC1292i2, m7);
                    throw th;
                }
            } else {
                K k7 = new K(interfaceC1287d, plus);
                AbstractC1464a.T(function2, k7, k7);
                while (true) {
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = K.f1794e;
                    int i7 = atomicIntegerFieldUpdater.get(k7);
                    if (i7 != 0) {
                        if (i7 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        v6 = v(k7.x());
                        if (v6 instanceof C0138v) {
                            throw ((C0138v) v6).f1882a;
                        }
                    } else if (atomicIntegerFieldUpdater.compareAndSet(k7, 0, 1)) {
                        v6 = j6.a.f14642a;
                        break;
                    }
                }
            }
        }
        j6.a aVar = j6.a.f14642a;
        return v6;
    }

    public static final Object y(long j3, Function2 function2, AbstractC1356c abstractC1356c) {
        Object c0138v;
        Object D7;
        if (j3 <= 0) {
            throw new D0("Timed out immediately", null);
        }
        E0 e02 = new E0(j3, abstractC1356c);
        e02.invokeOnCompletion(new P(h(e02.f3757d.getContext()).a(e02.f1787e, e02, e02.f1816c), 0));
        try {
            t6.s.a(2, function2);
            c0138v = function2.invoke(e02, e02);
        } catch (Throwable th) {
            c0138v = new C0138v(false, th);
        }
        Object obj = j6.a.f14642a;
        if (c0138v == obj || (D7 = e02.D(c0138v)) == f1782e) {
            return obj;
        }
        if (D7 instanceof C0138v) {
            Throwable th2 = ((C0138v) D7).f1882a;
            if (!(th2 instanceof D0)) {
                throw th2;
            }
            if (((D0) th2).f1777a != e02) {
                throw th2;
            }
            if (c0138v instanceof C0138v) {
                throw ((C0138v) c0138v).f1882a;
            }
        } else {
            c0138v = v(D7);
        }
        return c0138v;
    }
}
