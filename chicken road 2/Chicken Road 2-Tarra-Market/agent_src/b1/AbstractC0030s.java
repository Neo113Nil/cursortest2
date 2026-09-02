package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: b1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0030s {

    /* renamed from: c, reason: collision with root package name */
    public static final C0.a f682c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0.a f683d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0.a f684e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0.a f685f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0.a f686g;

    /* renamed from: a, reason: collision with root package name */
    public static final C0.a f680a = new C0.a(28, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final C0.a f681b = new C0.a(28, "CLOSED_EMPTY");

    /* renamed from: h, reason: collision with root package name */
    public static final C0037z f687h = new C0037z(false);

    /* renamed from: i, reason: collision with root package name */
    public static final C0037z f688i = new C0037z(true);

    static {
        int i2 = 28;
        f682c = new C0.a(i2, "COMPLETING_ALREADY");
        f683d = new C0.a(i2, "COMPLETING_WAITING_CHILDREN");
        f684e = new C0.a(i2, "COMPLETING_RETRY");
        f685f = new C0.a(i2, "TOO_LATE_TO_CANCEL");
        f686g = new C0.a(i2, "SEALED");
    }

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0017e b(M0.d dVar) {
        C0017e c0017e;
        C0017e c0017e2;
        if (!(dVar instanceof g1.h)) {
            return new C0017e(dVar, 1);
        }
        g1.h hVar = (g1.h) dVar;
        hVar.getClass();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g1.h.f1149h;
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            C0.a aVar = g1.a.f1139d;
            c0017e = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, aVar);
                c0017e2 = null;
                break;
            }
            if (obj instanceof C0017e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, aVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0017e2 = (C0017e) obj;
                break loop0;
            }
            if (obj != aVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0017e2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0017e.f656g;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0017e2);
            if (!(obj2 instanceof C0022j) || ((C0022j) obj2).f665c == null) {
                C0017e.f655f.set(c0017e2, 536870911);
                atomicReferenceFieldUpdater2.set(c0017e2, C0014b.f652a);
                c0017e = c0017e2;
            } else {
                c0017e2.m();
            }
            if (c0017e != null) {
                return c0017e;
            }
        }
        return new C0017e(dVar, 2);
    }

    public static final void c(M0.i iVar, Throwable th) {
        try {
            c1.b bVar = (c1.b) iVar.i(C0029q.f678a);
            if (bVar != null) {
                bVar.l(iVar, th);
            } else {
                g1.a.e(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                V.a.a(runtimeException, th);
                th = runtimeException;
            }
            g1.a.e(iVar, th);
        }
    }

    public static InterfaceC0036y d(J j2, boolean z2, N n2, int i2) {
        N n3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable th;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        boolean z3 = (i2 & 2) != 0;
        S s2 = (S) j2;
        s2.getClass();
        if (z2) {
            n3 = n2 instanceof L ? (L) n2 : null;
            if (n3 == null) {
                n3 = new I(n2);
            }
        } else {
            n3 = n2;
        }
        n3.f633d = s2;
        while (true) {
            Object x2 = s2.x();
            if (x2 instanceof C0037z) {
                C0037z c0037z = (C0037z) x2;
                if (c0037z.f695a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = S.f646a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(s2, x2, n3)) {
                        if (atomicReferenceFieldUpdater2.get(s2) != x2) {
                            break;
                        }
                    }
                    return n3;
                }
                T t2 = new T();
                G f2 = c0037z.f695a ? t2 : new F(t2);
                do {
                    atomicReferenceFieldUpdater = S.f646a;
                    if (atomicReferenceFieldUpdater.compareAndSet(s2, c0037z, f2)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(s2) == c0037z);
            } else {
                if (!(x2 instanceof G)) {
                    if (z3) {
                        C0023k c0023k = x2 instanceof C0023k ? (C0023k) x2 : null;
                        n2.invoke(c0023k != null ? c0023k.f668a : null);
                    }
                    return U.f648a;
                }
                T d2 = ((G) x2).d();
                if (d2 == null) {
                    kotlin.jvm.internal.j.c(x2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    s2.G((N) x2);
                } else {
                    InterfaceC0036y interfaceC0036y = U.f648a;
                    if (z2 && (x2 instanceof P)) {
                        synchronized (x2) {
                            try {
                                th = ((P) x2).c();
                                if (th != null) {
                                    if ((n2 instanceof C0021i) && !((P) x2).f()) {
                                    }
                                }
                                if (s2.h((G) x2, d2, n3)) {
                                    if (th == null) {
                                        return n3;
                                    }
                                    interfaceC0036y = n3;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z3) {
                            n2.invoke(th);
                        }
                        return interfaceC0036y;
                    }
                    if (s2.h((G) x2, d2, n3)) {
                        return n3;
                    }
                }
            }
        }
    }

    public static final boolean e(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final M0.i f(r rVar, M0.i iVar) {
        M0.i k2;
        M0.i e2 = rVar.e();
        Boolean bool = Boolean.FALSE;
        C0025m c0025m = C0025m.f672g;
        boolean booleanValue = ((Boolean) e2.j(bool, c0025m)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.j(bool, c0025m)).booleanValue();
        if (booleanValue || booleanValue2) {
            M0.j jVar = M0.j.f226a;
            M0.i iVar2 = (M0.i) e2.j(jVar, new C0025m(2, 2));
            Object obj = iVar;
            if (booleanValue2) {
                obj = iVar.j(jVar, C0025m.f671f);
            }
            k2 = iVar2.k((M0.i) obj);
        } else {
            k2 = e2.k(iVar);
        }
        h1.d dVar = AbstractC0035x.f693a;
        return (k2 == dVar || k2.i(M0.e.f225a) != null) ? k2 : k2.k(dVar);
    }

    public static final void g(C0017e c0017e, M0.d dVar, boolean z2) {
        Object obj = C0017e.f656g.get(c0017e);
        Throwable e2 = c0017e.e(obj);
        Object k2 = e2 != null ? V.a.k(e2) : c0017e.g(obj);
        if (!z2) {
            dVar.f(k2);
            return;
        }
        kotlin.jvm.internal.j.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        g1.h hVar = (g1.h) dVar;
        O0.b bVar = hVar.f1151e;
        M0.i iVar = bVar.f277b;
        kotlin.jvm.internal.j.b(iVar);
        Object m2 = g1.a.m(iVar, hVar.f1153g);
        if (m2 != g1.a.f1141f) {
            i(bVar, iVar);
        }
        try {
            bVar.f(k2);
        } finally {
            g1.a.h(iVar, m2);
        }
    }

    public static final String h(M0.d dVar) {
        Object k2;
        if (dVar instanceof g1.h) {
            return dVar.toString();
        }
        try {
            k2 = dVar + '@' + a(dVar);
        } catch (Throwable th) {
            k2 = V.a.k(th);
        }
        if (K0.f.a(k2) != null) {
            k2 = dVar.getClass().getName() + '@' + a(dVar);
        }
        return (String) k2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [O0.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [O0.c] */
    /* JADX WARN: Type inference failed for: r1v2, types: [O0.c] */
    public static final void i(O0.b bVar, M0.i iVar) {
        if (bVar == 0 || iVar.i(b0.f653a) == null) {
            return;
        }
        do {
            bVar = bVar.c();
        } while (bVar != 0);
    }
}
