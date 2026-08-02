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
import a.AbstractC0603a;
import f6.C1113f;
import g6.C1157f;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.AbstractC1356c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final W0 f3716a = new W0("NO_DECISION", 1);

    /* renamed from: b, reason: collision with root package name */
    public static final W0 f3717b = new W0("CLOSED", 1);

    /* renamed from: c, reason: collision with root package name */
    public static final W0 f3718c = new W0("UNDEFINED", 1);

    /* renamed from: d, reason: collision with root package name */
    public static final W0 f3719d = new W0("REUSABLE_CLAIMED", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final W0 f3720e = new W0("CONDITION_FALSE", 1);

    /* renamed from: f, reason: collision with root package name */
    public static final W0 f3721f = new W0("NO_THREAD_ELEMENTS", 1);

    public static final W a(Function1 function1, Object obj, W w7) {
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
            W0 w02 = f3717b;
            if (obj == w02) {
                return w02;
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

    public static final void d(InterfaceC1292i interfaceC1292i, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f3727a.iterator();
        while (it.hasNext()) {
            try {
                ((E6.b) it.next()).d(interfaceC1292i, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Q0.a.c(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            Q0.a.c(th, new g(interfaceC1292i));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
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

    public static final void g(InterfaceC1292i interfaceC1292i, Object obj) {
        if (obj == f3721f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object fold = interfaceC1292i.fold(null, x.f3763c);
            t6.h.c(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            AbstractC0486a1.n(fold);
            throw null;
        }
        z zVar = (z) obj;
        B0[] b0Arr = zVar.f3769b;
        int length = b0Arr.length - 1;
        if (length < 0) {
            return;
        }
        B0 b02 = b0Arr[length];
        t6.h.b(null);
        Object obj2 = zVar.f3768a[length];
        throw null;
    }

    public static final void h(InterfaceC1287d interfaceC1287d, Object obj, Function1 function1) {
        if (!(interfaceC1287d instanceof h)) {
            interfaceC1287d.resumeWith(obj);
            return;
        }
        h hVar = (h) interfaceC1287d;
        Throwable a2 = C1113f.a(obj);
        Object c0139w = a2 == null ? function1 != null ? new C0139w(obj, function1) : obj : new C0138v(false, a2);
        AbstractC1356c abstractC1356c = hVar.f3731e;
        abstractC1356c.getContext();
        A a4 = hVar.f3730d;
        if (a4.e()) {
            hVar.f3732f = c0139w;
            hVar.f1795c = 1;
            a4.d(abstractC1356c.getContext(), hVar);
            return;
        }
        X a7 = C0.a();
        if (a7.f1812c >= 4294967296L) {
            hVar.f3732f = c0139w;
            hVar.f1795c = 1;
            C1157f c1157f = a7.f1814e;
            if (c1157f == null) {
                c1157f = new C1157f();
                a7.f1814e = c1157f;
            }
            c1157f.addLast(hVar);
            return;
        }
        a7.h(true);
        try {
            InterfaceC0118e0 interfaceC0118e0 = (InterfaceC0118e0) abstractC1356c.getContext().get(B.f1775b);
            if (interfaceC0118e0 == null || interfaceC0118e0.isActive()) {
                Object obj2 = hVar.f3733x;
                InterfaceC1292i context = abstractC1356c.getContext();
                Object m7 = m(context, obj2);
                G0 w7 = m7 != f3721f ? E.w(abstractC1356c, context, m7) : null;
                try {
                    abstractC1356c.resumeWith(obj);
                } finally {
                    if (w7 == null || w7.R()) {
                        g(context, m7);
                    }
                }
            } else {
                CancellationException cancellationException = interfaceC0118e0.getCancellationException();
                hVar.c(c0139w, cancellationException);
                hVar.resumeWith(AbstractC0603a.h(cancellationException));
            }
            while (a7.j()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final long j(String str, long j, long j3, long j7) {
        String str2;
        int i7 = w.f3761a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long F02 = C6.o.F0(str2);
        if (F02 == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
        }
        long longValue = F02.longValue();
        if (j3 <= longValue && longValue <= j7) {
            return longValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j7 + ", but is '" + longValue + '\'').toString());
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

    public static final Object l(InterfaceC1292i interfaceC1292i) {
        Object fold = interfaceC1292i.fold(0, x.f3762b);
        t6.h.b(fold);
        return fold;
    }

    public static final Object m(InterfaceC1292i interfaceC1292i, Object obj) {
        if (obj == null) {
            obj = l(interfaceC1292i);
        }
        if (obj == 0) {
            return f3721f;
        }
        if (obj instanceof Integer) {
            return interfaceC1292i.fold(new z(((Number) obj).intValue(), interfaceC1292i), x.f3764d);
        }
        AbstractC0486a1.n(obj);
        throw null;
    }
}
