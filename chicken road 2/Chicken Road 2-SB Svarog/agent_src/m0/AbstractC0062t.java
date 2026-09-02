package m0;

import a.AbstractC0018a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import r0.AbstractC0088a;

/* renamed from: m0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0062t {

    /* renamed from: a, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f944a = new io.flutter.plugin.platform.i(2, "RESUME_TOKEN");

    /* renamed from: b, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f945b = new io.flutter.plugin.platform.i(2, "CLOSED_EMPTY");

    /* renamed from: c, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f946c = new io.flutter.plugin.platform.i(2, "COMPLETING_ALREADY");

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f947d = new io.flutter.plugin.platform.i(2, "COMPLETING_WAITING_CHILDREN");

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f948e = new io.flutter.plugin.platform.i(2, "COMPLETING_RETRY");

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f949f = new io.flutter.plugin.platform.i(2, "TOO_LATE_TO_CANCEL");

    /* renamed from: g, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f950g = new io.flutter.plugin.platform.i(2, "SEALED");

    /* renamed from: h, reason: collision with root package name */
    public static final A f951h = new A(false);

    /* renamed from: i, reason: collision with root package name */
    public static final A f952i = new A(true);

    public static final String a(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0048e b(Y.d dVar) {
        C0048e c0048e;
        C0048e c0048e2;
        if (!(dVar instanceof r0.h)) {
            return new C0048e(dVar, 1);
        }
        r0.h hVar = (r0.h) dVar;
        hVar.getClass();
        io.flutter.plugin.platform.i iVar = AbstractC0088a.f1158d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = r0.h.f1168i;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            c0048e = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, iVar);
                c0048e2 = null;
                break;
            }
            if (obj instanceof C0048e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, iVar)) {
                    if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                        break;
                    }
                }
                c0048e2 = (C0048e) obj;
                break loop0;
            }
            if (obj != iVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0048e2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0048e.f922h;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0048e2);
            if (!(obj2 instanceof C0053j) || ((C0053j) obj2).f931c == null) {
                C0048e.f921g.set(c0048e2, 536870911);
                atomicReferenceFieldUpdater2.set(c0048e2, C0045b.f917a);
                c0048e = c0048e2;
            } else {
                c0048e2.n();
            }
            if (c0048e != null) {
                return c0048e;
            }
        }
        return new C0048e(dVar, 2);
    }

    public static final void c(Y.i iVar, Throwable th) {
        try {
            n0.b bVar = (n0.b) iVar.d(C0060q.f942b);
            if (bVar != null) {
                bVar.f(th);
            } else {
                AbstractC0088a.c(iVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC0018a.a(runtimeException, th);
                th = runtimeException;
            }
            AbstractC0088a.c(iVar, th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC0068z d(K k2, O o2, int i2) {
        O o3;
        Throwable th;
        boolean z2 = (i2 & 1) == 0;
        boolean z3 = (i2 & 2) != 0;
        T t2 = (T) k2;
        t2.getClass();
        if (z2) {
            o3 = o2 instanceof M ? (M) o2 : null;
            if (o3 == null) {
                o3 = new J(o2);
            }
        } else {
            o3 = o2;
        }
        o3.f899e = t2;
        loop0: while (true) {
            Object y2 = t2.y();
            if (y2 instanceof A) {
                A a2 = (A) y2;
                if (a2.f885b) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f912b;
                    while (!atomicReferenceFieldUpdater.compareAndSet(t2, y2, o3)) {
                        if (atomicReferenceFieldUpdater.get(t2) != y2) {
                            break;
                        }
                    }
                    break loop0;
                }
                U u2 = new U();
                Object g2 = a2.f885b ? u2 : new G(u2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = T.f912b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(t2, a2, g2) && atomicReferenceFieldUpdater2.get(t2) == a2) {
                }
            } else {
                if (!(y2 instanceof H)) {
                    if (z3) {
                        C0054k c0054k = y2 instanceof C0054k ? (C0054k) y2 : null;
                        o2.i(c0054k != null ? c0054k.f934a : null);
                    }
                    return V.f914b;
                }
                U f2 = ((H) y2).f();
                if (f2 == null) {
                    g0.h.c(y2, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    t2.H((O) y2);
                } else {
                    InterfaceC0068z interfaceC0068z = V.f914b;
                    if (z2 && (y2 instanceof Q)) {
                        synchronized (y2) {
                            try {
                                th = ((Q) y2).c();
                                if (th != null) {
                                    if ((o2 instanceof C0052i) && !((Q) y2).e()) {
                                    }
                                }
                                if (t2.l((H) y2, f2, o3)) {
                                    if (th == null) {
                                        return o3;
                                    }
                                    interfaceC0068z = o3;
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
                            o2.i(th);
                        }
                        return interfaceC0068z;
                    }
                    if (t2.l((H) y2, f2, o3)) {
                        break;
                    }
                }
            }
        }
    }

    public static final Y.i e(r rVar, Y.i iVar) {
        Y.i g2;
        Y.i j2 = rVar.j();
        Boolean bool = Boolean.FALSE;
        C0056m c0056m = C0056m.f936e;
        boolean booleanValue = ((Boolean) j2.c(bool, c0056m)).booleanValue();
        boolean booleanValue2 = ((Boolean) iVar.c(bool, c0056m)).booleanValue();
        if (booleanValue || booleanValue2) {
            C0056m c0056m2 = new C0056m(2, 2);
            Y.j jVar = Y.j.f410b;
            Y.i iVar2 = (Y.i) j2.c(jVar, c0056m2);
            Object obj = iVar;
            if (booleanValue2) {
                obj = iVar.c(jVar, C0056m.f935d);
            }
            g2 = iVar2.g((Y.i) obj);
        } else {
            g2 = j2.g(iVar);
        }
        s0.d dVar = AbstractC0067y.f957a;
        return (g2 == dVar || g2.d(Y.e.f409b) != null) ? g2 : g2.g(dVar);
    }

    public static final void f(C0048e c0048e, Y.d dVar, boolean z2) {
        Object obj = C0048e.f922h.get(c0048e);
        Throwable d2 = c0048e.d(obj);
        Object h2 = d2 != null ? AbstractC0018a.h(d2) : c0048e.e(obj);
        if (!z2) {
            dVar.k(h2);
            return;
        }
        g0.h.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        r0.h hVar = (r0.h) dVar;
        a0.b bVar = hVar.f1170f;
        Object obj2 = hVar.f1172h;
        Y.i iVar = bVar.f419c;
        g0.h.b(iVar);
        Object k2 = AbstractC0088a.k(iVar, obj2);
        if (k2 != AbstractC0088a.f1160f) {
            h(bVar, iVar);
        }
        try {
            bVar.k(h2);
        } finally {
            AbstractC0088a.f(iVar, k2);
        }
    }

    public static final String g(Y.d dVar) {
        Object h2;
        if (dVar instanceof r0.h) {
            return dVar.toString();
        }
        try {
            h2 = dVar + '@' + a(dVar);
        } catch (Throwable th) {
            h2 = AbstractC0018a.h(th);
        }
        if (W.d.a(h2) != null) {
            h2 = dVar.getClass().getName() + '@' + a(dVar);
        }
        return (String) h2;
    }

    public static final void h(Y.d dVar, Y.i iVar) {
        if ((dVar instanceof a0.c) && iVar.d(c0.f920b) != null) {
            a0.c cVar = (a0.c) dVar;
            do {
                cVar = cVar.f();
            } while (cVar != null);
        }
    }
}
