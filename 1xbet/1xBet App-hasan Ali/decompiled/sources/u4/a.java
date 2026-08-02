package u4;

import S3.L;
import c4.AbstractC0542c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.AbstractC2107A;
import o4.AbstractC2234l;
import p4.AbstractC2277q;
import p4.AbstractC2282w;
import p4.C2275o;
import p4.InterfaceC2278s;
import p4.K;
import p4.U;
import p4.j0;
import p4.k0;
import p4.o0;
import t3.AbstractC2425d;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public static final H3.g f20076b;

    /* renamed from: c, reason: collision with root package name */
    public static final H3.g f20077c;

    /* renamed from: a, reason: collision with root package name */
    public static final H3.g f20075a = new H3.g("CLOSED", 5);

    /* renamed from: d, reason: collision with root package name */
    public static final H3.g f20078d = new H3.g("NO_THREAD_ELEMENTS", 5);

    /* renamed from: e, reason: collision with root package name */
    public static final L f20079e = new L(11);
    public static final L f = new L(12);

    /* renamed from: g, reason: collision with root package name */
    public static final L f20080g = new L(13);

    static {
        int i = 5;
        f20076b = new H3.g("UNDEFINED", i);
        f20077c = new H3.g("REUSABLE_CLAIMED", i);
    }

    public static final void a(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(AbstractC2107A.q("Expected positive parallelism level, but got ", i).toString());
        }
    }

    public static final Object b(q qVar, long j5, i4.e eVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (qVar.f20113c >= j5 && !qVar.c()) {
                return qVar;
            }
            Object obj = b.f20081a.get(qVar);
            H3.g gVar = f20075a;
            if (obj == gVar) {
                return gVar;
            }
            q qVar2 = (q) ((b) obj);
            if (qVar2 == null) {
                qVar2 = (q) eVar.invoke(Long.valueOf(qVar.f20113c + 1), qVar);
                do {
                    atomicReferenceFieldUpdater = b.f20081a;
                    if (atomicReferenceFieldUpdater.compareAndSet(qVar, null, qVar2)) {
                        if (qVar.c()) {
                            qVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(qVar) == null);
            }
            qVar = qVar2;
        }
    }

    public static final q c(Object obj) {
        if (obj != f20075a) {
            return (q) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(a4.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = d.f20084a.iterator();
        while (it.hasNext()) {
            try {
                ((InterfaceC2278s) it.next()).k(hVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC2425d.j(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC2425d.j(th, new e(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f20075a;
    }

    public static final Object f(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(a4.h hVar, Object obj) {
        if (obj == f20078d) {
            return;
        }
        if (!(obj instanceof u)) {
            Object A3 = hVar.A(f, null);
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>", A3);
            L1.a.t(A3);
            throw null;
        }
        u uVar = (u) obj;
        j0[] j0VarArr = uVar.f20119b;
        int length = j0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        j0 j0Var = j0VarArr[length];
        kotlin.jvm.internal.l.c(null);
        Object obj2 = uVar.f20118a[length];
        throw null;
    }

    public static final void h(a4.c cVar, Object obj) {
        if (!(cVar instanceof f)) {
            cVar.resumeWith(obj);
            return;
        }
        f fVar = (f) cVar;
        Throwable a5 = W3.k.a(obj);
        Object c2275o = a5 == null ? obj : new C2275o(a5, false);
        AbstractC2277q abstractC2277q = fVar.f20087n;
        AbstractC0542c abstractC0542c = fVar.f20088o;
        if (abstractC2277q.F(abstractC0542c.getContext())) {
            fVar.f20089p = c2275o;
            fVar.f18742m = 1;
            abstractC2277q.E(abstractC0542c.getContext(), fVar);
            return;
        }
        K a6 = k0.a();
        if (a6.f18754m >= 4294967296L) {
            fVar.f20089p = c2275o;
            fVar.f18742m = 1;
            a6.I(fVar);
            return;
        }
        a6.K(true);
        try {
            U u5 = (U) abstractC0542c.getContext().l(p4.r.f18819l);
            if (u5 == null || u5.b()) {
                Object obj2 = fVar.f20090q;
                a4.h context = abstractC0542c.getContext();
                Object l5 = l(context, obj2);
                o0 v4 = l5 != f20078d ? AbstractC2282w.v(abstractC0542c, context, l5) : null;
                try {
                    abstractC0542c.resumeWith(obj);
                } finally {
                    if (v4 == null || v4.f0()) {
                        g(context, l5);
                    }
                }
            } else {
                fVar.resumeWith(G4.l.p(u5.s()));
            }
            while (a6.M()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long i(String str, long j5, long j6, long j7) {
        String str2;
        int i = s.f20115a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j5;
        }
        Long z02 = AbstractC2234l.z0(str2);
        if (z02 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = z02.longValue();
        if (j6 <= longValue && longValue <= j7) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j6 + ".." + j7 + ", but is '" + longValue + '\'').toString());
    }

    public static int j(int i, int i5, String str) {
        return (int) i(str, i, 1, (i5 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(a4.h hVar) {
        Object A3 = hVar.A(f20079e, 0);
        kotlin.jvm.internal.l.c(A3);
        return A3;
    }

    public static final Object l(a4.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f20078d;
        }
        if (obj instanceof Integer) {
            return hVar.A(f20080g, new u(((Number) obj).intValue(), hVar));
        }
        L1.a.t(obj);
        throw null;
    }
}
