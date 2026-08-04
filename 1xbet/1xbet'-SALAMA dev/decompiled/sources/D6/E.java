package D6;

import F2.W0;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f1778a = new W0("RESUME_TOKEN", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0 f1779b = new W0("REMOVED_TASK", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W0 f1780c = new W0("CLOSED_EMPTY", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W0 f1781d = new W0("COMPLETING_ALREADY", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W0 f1782e = new W0("COMPLETING_WAITING_CHILDREN", 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W0 f1783f = new W0("COMPLETING_RETRY", 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final W0 f1784g = new W0("TOO_LATE_TO_CANCEL", 1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final W0 f1785h = new W0("SEALED", 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Q f1786i = new Q(false);
    public static final Q j = new Q(true);

    public static C0136t a() {
        C0136t c0136t = new C0136t(true);
        c0136t.A(null);
        return c0136t;
    }

    public static final I6.e b(p065i6.i iVar) {
        if (iVar.get(B.f1775b) == null) {
            iVar = iVar.plus(new C0124h0(null));
        }
        return new I6.e(iVar);
    }

    public static I c(C c3, Function2 function2) {
        I i7 = new I(q(c3, p065i6.j.f14074a), true);
        i7.Q(1, i7, function2);
        return i7;
    }

    public static final Object d(H[] hArr, p077k6.i iVar) {
        if (hArr.length == 0) {
            return p050g6.p.f13308a;
        }
        C0117e c0117e = new C0117e(hArr);
        C0130m c0130m = new C0130m(1, P6.b.v(iVar));
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
        Object objR = c0130m.r();
        j6.a aVar = j6.a.f14648a;
        return objR;
    }

    public static final Object e(Function2 function2, p065i6.d dVar) throws Throwable {
        I6.t tVar = new I6.t(dVar, dVar.getContext());
        Object objB0 = p113p3.f.b0(tVar, tVar, function2);
        j6.a aVar = j6.a.f14648a;
        return objB0;
    }

    public static final void f(p065i6.i iVar) {
        InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) iVar.get(B.f1775b);
        if (interfaceC0118e0 != null && !interfaceC0118e0.isActive()) {
            throw interfaceC0118e0.getCancellationException();
        }
    }

    public static final p065i6.i g(p065i6.i iVar, p065i6.i iVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        C0140x c0140x = C0140x.f1887c;
        boolean zBooleanValue = ((Boolean) iVar.fold(bool, c0140x)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.fold(bool, c0140x)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.plus(iVar2);
        }
        p065i6.j jVar = p065i6.j.f14074a;
        p065i6.i iVar3 = (p065i6.i) iVar.fold(jVar, new C0140x(2, 2));
        Object objFold = iVar2;
        if (zBooleanValue2) {
            objFold = iVar2.fold(jVar, C0140x.f1886b);
        }
        return iVar3.plus((p065i6.i) objFold);
    }

    public static final J h(p065i6.i iVar) {
        p065i6.g gVar = iVar.get(p065i6.e.f14073a);
        J j3 = gVar instanceof J ? (J) gVar : null;
        return j3 == null ? G.f1791a : j3;
    }

    public static final String i(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0130m j(p065i6.d dVar) {
        C0130m c0130m;
        C0130m c0130m2;
        if (!(dVar instanceof I6.h)) {
            return new C0130m(1, dVar);
        }
        I6.h hVar = (I6.h) dVar;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = I6.h.f3729y;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            W0 w7 = I6.a.f3719d;
            c0130m = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, w7);
                c0130m2 = null;
                break;
            }
            if (obj instanceof C0130m) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, w7)) {
                        c0130m2 = (C0130m) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == obj);
            } else if (obj != w7 && !(obj instanceof Throwable)) {
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
        return new C0130m(2, dVar);
    }

    public static final void k(p065i6.i iVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        try {
            E6.b bVar = (E6.b) iVar.get(B.f1774a);
            if (bVar != null) {
                bVar.d(iVar, th);
            } else {
                I6.a.d(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                Q0.a.c(runtimeException, th);
                th = runtimeException;
            }
            I6.a.d(iVar, th);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object n(List list, p077k6.c cVar) {
        C0121g c0121g;
        Iterator it;
        if (cVar instanceof C0121g) {
            c0121g = (C0121g) cVar;
            int i7 = c0121g.f1837c;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                c0121g.f1837c = i7 - Integer.MIN_VALUE;
            } else {
                c0121g = new C0121g(cVar);
            }
        } else {
            c0121g = new C0121g(cVar);
        }
        Object obj = c0121g.f1836b;
        j6.a aVar = j6.a.f14648a;
        int i8 = c0121g.f1837c;
        if (i8 == 0) {
            p003a.a.p0(obj);
            it = list.iterator();
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = c0121g.f1835a;
            p003a.a.p0(obj);
        }
        while (it.hasNext()) {
            InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) it.next();
            c0121g.f1835a = it;
            c0121g.f1837c = 1;
            if (interfaceC0118e0.join(c0121g) == aVar) {
                return aVar;
            }
        }
        return p044f6.i.f13014a;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0052 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:19:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object o(D6.InterfaceC0118e0[] r6, p077k6.c r7) {
        /*
            boolean r0 = r7 instanceof D6.C0119f
            if (r0 == 0) goto L13
            r0 = r7
            D6.f r0 = (D6.C0119f) r0
            int r1 = r0.f1833e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1833e = r1
            goto L18
        L13:
            D6.f r0 = new D6.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1832d
            j6.a r1 = j6.a.f14648a
            int r2 = r0.f1833e
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f1831c
            int r2 = r0.f1830b
            java.lang.Object[] r4 = r0.f1829a
            D6.e0[] r4 = (D6.InterfaceC0118e0[]) r4
            p003a.a.p0(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            p003a.a.p0(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f1829a = r7
            r0.f1830b = r2
            r0.f1831c = r6
            r0.f1833e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            f6.i r6 = p044f6.i.f13014a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: D6.E.o(D6.e0[], k6.c):java.lang.Object");
    }

    public static z0 p(C c3, Function2 function2) {
        z0 z0Var = new z0(q(c3, p065i6.j.f14074a), true);
        z0Var.Q(1, z0Var, function2);
        return z0Var;
    }

    public static final p065i6.i q(C c3, p065i6.i iVar) {
        p065i6.i iVarG = g(c3.c(), iVar, true);
        K6.d dVar = M.f1796a;
        return (iVarG == dVar || iVarG.get(p065i6.e.f14073a) != null) ? iVarG : iVarG.plus(dVar);
    }

    public static final Object r(Object obj) {
        return obj instanceof C0138v ? p003a.a.h(((C0138v) obj).f1882a) : obj;
    }

    public static final void s(C0130m c0130m, p065i6.d dVar, boolean z4) {
        Object obj = C0130m.f1855x.get(c0130m);
        Throwable thG = c0130m.g(obj);
        Object objH = thG != null ? p003a.a.h(thG) : c0130m.h(obj);
        if (!z4) {
            dVar.resumeWith(objH);
            return;
        }
        t6.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        I6.h hVar = (I6.h) dVar;
        p077k6.c cVar = hVar.f3731e;
        p065i6.i context = cVar.getContext();
        Object objM = I6.a.m(context, hVar.f3733x);
        G0 g0W = objM != I6.a.f3721f ? w(cVar, context, objM) : null;
        try {
            cVar.resumeWith(objH);
        } finally {
            if (g0W == null || g0W.R()) {
                I6.a.g(context, objM);
            }
        }
    }

    public static Object t(Function2 function2) throws Throwable {
        p065i6.j jVar = p065i6.j.f14074a;
        Thread threadCurrentThread = Thread.currentThread();
        p065i6.e eVar = p065i6.e.f14073a;
        X xA = C0.a();
        p065i6.i iVarG = g(jVar, xA, true);
        K6.d dVar = M.f1796a;
        if (iVarG != dVar && iVarG.get(eVar) == null) {
            iVarG = iVarG.plus(dVar);
        }
        C0123h c0123h = new C0123h(iVarG, threadCurrentThread, xA);
        c0123h.Q(1, c0123h, function2);
        X x4 = c0123h.f1839e;
        if (x4 != null) {
            int i7 = X.f1811f;
            x4.h(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jI = x4 != null ? x4.i() : Long.MAX_VALUE;
                if (!(c0123h.x() instanceof InterfaceC0112b0)) {
                    if (x4 != null) {
                        int i8 = X.f1811f;
                        x4.f(false);
                    }
                    Object objV = v(c0123h.x());
                    C0138v c0138v = objV instanceof C0138v ? (C0138v) objV : null;
                    if (c0138v == null) {
                        return objV;
                    }
                    throw c0138v.f1882a;
                }
                LockSupport.parkNanos(c0123h, jI);
            } catch (Throwable th) {
                if (x4 != null) {
                    int i9 = X.f1811f;
                    x4.f(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        c0123h.k(interruptedException);
        throw interruptedException;
    }

    public static final String u(p065i6.d dVar) {
        Object objH;
        if (dVar instanceof I6.h) {
            return dVar.toString();
        }
        try {
            objH = dVar + '@' + i(dVar);
        } catch (Throwable th) {
            objH = p003a.a.h(th);
        }
        if (p044f6.f.a(objH) != null) {
            objH = dVar.getClass().getName() + '@' + i(dVar);
        }
        return (String) objH;
    }

    public static final Object v(Object obj) {
        InterfaceC0112b0 interfaceC0112b0;
        C0114c0 c0114c0 = obj instanceof C0114c0 ? (C0114c0) obj : null;
        return (c0114c0 == null || (interfaceC0112b0 = c0114c0.f1823a) == null) ? obj : interfaceC0112b0;
    }

    public static final G0 w(p065i6.d dVar, p065i6.i iVar, Object obj) {
        G0 g3 = null;
        if (!(dVar instanceof p077k6.d)) {
            return null;
        }
        if (iVar.get(H0.f1793a) != null) {
            p077k6.d callerFrame = (p077k6.d) dVar;
            while (!(callerFrame instanceof K) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof G0) {
                    g3 = (G0) callerFrame;
                    break;
                }
            }
            if (g3 != null) {
                g3.S(iVar, obj);
            }
        }
        return g3;
    }

    public static final Object x(p065i6.i iVar, Function2 function2, p065i6.d dVar) throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        Object objV;
        p065i6.i context = dVar.getContext();
        p065i6.i iVarPlus = !((Boolean) iVar.fold(Boolean.FALSE, C0140x.f1887c)).booleanValue() ? context.plus(iVar) : g(context, iVar, false);
        f(iVarPlus);
        if (iVarPlus == context) {
            I6.t tVar = new I6.t(dVar, iVarPlus);
            objV = p113p3.f.b0(tVar, tVar, function2);
        } else {
            p065i6.e eVar = p065i6.e.f14073a;
            if (t6.h.a(iVarPlus.get(eVar), context.get(eVar))) {
                G0 g3 = new G0(dVar, iVarPlus);
                p065i6.i iVar2 = g3.f1816c;
                Object objM = I6.a.m(iVar2, null);
                try {
                    Object objB0 = p113p3.f.b0(g3, g3, function2);
                    I6.a.g(iVar2, objM);
                    objV = objB0;
                } catch (Throwable th) {
                    I6.a.g(iVar2, objM);
                    throw th;
                }
            } else {
                K k7 = new K(dVar, iVarPlus);
                p097n3.a.T(function2, k7, k7);
                do {
                    atomicIntegerFieldUpdater = K.f1794e;
                    int i7 = atomicIntegerFieldUpdater.get(k7);
                    if (i7 != 0) {
                        if (i7 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objV = v(k7.x());
                        if (objV instanceof C0138v) {
                            throw ((C0138v) objV).f1882a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(k7, 0, 1));
                objV = j6.a.f14648a;
            }
        }
        j6.a aVar = j6.a.f14648a;
        return objV;
    }

    public static final Object y(long j3, Function2 function2, p077k6.c cVar) throws Throwable {
        Object c0138v;
        Object objD;
        if (j3 <= 0) {
            throw new D0("Timed out immediately", null);
        }
        E0 e7 = new E0(j3, cVar);
        e7.invokeOnCompletion(new P(h(e7.f3757d.getContext()).a(e7.f1787e, e7, e7.f1816c), 0));
        try {
            t6.s.a(2, function2);
            c0138v = function2.invoke(e7, e7);
        } catch (Throwable th) {
            c0138v = new C0138v(false, th);
        }
        Object obj = j6.a.f14648a;
        if (c0138v == obj || (objD = e7.D(c0138v)) == f1782e) {
            return obj;
        }
        if (objD instanceof C0138v) {
            Throwable th2 = ((C0138v) objD).f1882a;
            if (!(th2 instanceof D0) || ((D0) th2).f1777a != e7) {
                throw th2;
            }
            if (c0138v instanceof C0138v) {
                throw ((C0138v) c0138v).f1882a;
            }
        } else {
            c0138v = v(objD);
        }
        return c0138v;
    }
}
