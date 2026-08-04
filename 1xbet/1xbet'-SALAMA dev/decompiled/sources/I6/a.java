package I6;

import A1.W;
import D6.A;
import D6.B;
import D6.B0;
import D6.C0;
import D6.C0138v;
import D6.C0139w;
import D6.E;
import D6.G0;
import D6.InterfaceC0118e0;
import D6.X;
import F2.W0;
import W5.AbstractC0486a1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W0 f3716a = new W0("NO_DECISION", 1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final W0 f3717b = new W0("CLOSED", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final W0 f3718c = new W0("UNDEFINED", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final W0 f3719d = new W0("REUSABLE_CLAIMED", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final W0 f3720e = new W0("CONDITION_FALSE", 1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final W0 f3721f = new W0("NO_THREAD_ELEMENTS", 1);

    public static final W a(Function1 function1, Object obj, W w7) throws IllegalAccessException, InvocationTargetException {
        try {
            function1.invoke(obj);
        } catch (Throwable th) {
            if (w7 == null || w7.getCause() == th) {
                return new W("Exception in undelivered element handler for " + obj, th);
            }
            Q0.a.c(w7, th);
        }
        return w7;
    }

    public static final Object b(u uVar, long j, Function2 function2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f3759c >= j && !uVar.c()) {
                return uVar;
            }
            Object obj = d.f3724a.get(uVar);
            W0 w7 = f3717b;
            if (obj == w7) {
                return w7;
            }
            u uVar2 = (u) ((d) obj);
            if (uVar2 == null) {
                uVar2 = (u) function2.invoke(Long.valueOf(uVar.f3759c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = d.f3724a;
                    if (atomicReferenceFieldUpdater.compareAndSet(uVar, null, uVar2)) {
                        if (uVar.c()) {
                            uVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(uVar) == null);
            }
            uVar = uVar2;
        }
    }

    public static final u c(Object obj) {
        if (obj != f3717b) {
            return (u) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void d(p065i6.i iVar, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Throwable runtimeException;
        Iterator it = f.f3727a.iterator();
        while (it.hasNext()) {
            try {
                ((E6.b) it.next()).d(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Q0.a.c(runtimeException, th);
                }
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, runtimeException);
            }
        }
        try {
            Q0.a.c(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread threadCurrentThread2 = Thread.currentThread();
        threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
    }

    public static final boolean e(Object obj) {
        return obj == f3717b;
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

    public static final void g(p065i6.i iVar, Object obj) {
        if (obj == f3721f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object objFold = iVar.fold(null, x.f3763c);
            t6.h.c(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0486a1.n(objFold);
            throw null;
        }
        z zVar = (z) obj;
        B0[] b0Arr = zVar.f3769b;
        int length = b0Arr.length - 1;
        if (length < 0) {
            return;
        }
        B0 b7 = b0Arr[length];
        t6.h.b(null);
        Object obj2 = zVar.f3768a[length];
        throw null;
    }

    public static final void h(p065i6.d dVar, Object obj, Function1 function1) {
        Object c0138v;
        if (!(dVar instanceof h)) {
            dVar.resumeWith(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable thA = p044f6.f.a(obj);
        if (thA == null) {
            c0138v = function1 != null ? new C0139w(obj, function1) : obj;
        } else {
            c0138v = new C0138v(false, thA);
        }
        p077k6.c cVar = hVar.f3731e;
        cVar.getContext();
        A a2 = hVar.f3730d;
        if (a2.e()) {
            hVar.f3732f = c0138v;
            hVar.f1795c = 1;
            a2.d(cVar.getContext(), hVar);
            return;
        }
        X xA = C0.a();
        if (xA.f1812c >= 4294967296L) {
            hVar.f3732f = c0138v;
            hVar.f1795c = 1;
            p050g6.f fVar = xA.f1814e;
            if (fVar == null) {
                fVar = new p050g6.f();
                xA.f1814e = fVar;
            }
            fVar.addLast(hVar);
            return;
        }
        xA.h(true);
        try {
            InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) cVar.getContext().get(B.f1775b);
            if (interfaceC0118e0 == null || interfaceC0118e0.isActive()) {
                Object obj2 = hVar.f3733x;
                p065i6.i context = cVar.getContext();
                Object objM = m(context, obj2);
                G0 g0W = objM != f3721f ? E.w(cVar, context, objM) : null;
                try {
                    cVar.resumeWith(obj);
                    if (g0W == null || g0W.R()) {
                        g(context, objM);
                    }
                } catch (Throwable th) {
                    if (g0W == null || g0W.R()) {
                        g(context, objM);
                    }
                    throw th;
                }
            } else {
                CancellationException cancellationException = interfaceC0118e0.getCancellationException();
                hVar.c(c0138v, cancellationException);
                hVar.resumeWith(p003a.a.h(cancellationException));
            }
            while (xA.j()) {
            }
        } catch (Throwable th2) {
            try {
                hVar.i(th2, null);
            } finally {
                xA.f(true);
            }
        }
    }

    public static final long j(String str, long j, long j3, long j7) {
        String property;
        int i7 = w.f3761a;
        try {
            property = System.getProperty(str);
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return j;
        }
        Long lF0 = C6.o.F0(property);
        if (lF0 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + property + '\'').toString());
        }
        long jLongValue = lF0.longValue();
        if (j3 <= jLongValue && jLongValue <= j7) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j7 + ", but is '" + jLongValue + '\'').toString());
    }

    public static int k(String str, int i7, int i8, int i9, int i10) {
        if ((i10 & 4) != 0) {
            i8 = 1;
        }
        if ((i10 & 8) != 0) {
            i9 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        return (int) j(str, i7, i8, i9);
    }

    public static final Object l(p065i6.i iVar) {
        Object objFold = iVar.fold(0, x.f3762b);
        t6.h.b(objFold);
        return objFold;
    }

    public static final Object m(p065i6.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f3721f;
        }
        if (obj instanceof Integer) {
            return iVar.fold(new z(((Number) obj).intValue(), iVar), x.f3764d);
        }
        AbstractC0486a1.n(obj);
        throw null;
    }
}
