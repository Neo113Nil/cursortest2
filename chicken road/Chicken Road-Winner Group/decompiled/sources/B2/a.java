package B2;

import d2.AbstractC0276f;
import e2.C0289d;
import g2.InterfaceC0319c;
import i2.AbstractC0343b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import w2.AbstractC1239s;
import w2.AbstractC1242v;
import w2.C1235n;
import w2.C1240t;
import w2.H;
import w2.P;
import w2.Z;
import w2.g0;
import w2.h0;
import w2.j0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final v f146a = new v("NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final v f147b = new v("CLOSED");

    /* renamed from: c, reason: collision with root package name */
    public static final v f148c = new v("UNDEFINED");

    /* renamed from: d, reason: collision with root package name */
    public static final v f149d = new v("REUSABLE_CLAIMED");

    /* renamed from: e, reason: collision with root package name */
    public static final v f150e = new v("CONDITION_FALSE");
    public static final v f = new v("NO_THREAD_ELEMENTS");

    public static final Object a(t tVar, long j3, o2.p pVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (tVar.f181c >= j3 && !tVar.c()) {
                return tVar;
            }
            Object obj = d.f153a.get(tVar);
            v vVar = f147b;
            if (obj == vVar) {
                return vVar;
            }
            t tVar2 = (t) ((d) obj);
            if (tVar2 == null) {
                tVar2 = (t) pVar.invoke(Long.valueOf(tVar.f181c + 1), tVar);
                do {
                    atomicReferenceFieldUpdater = d.f153a;
                    if (atomicReferenceFieldUpdater.compareAndSet(tVar, null, tVar2)) {
                        if (tVar.c()) {
                            tVar.d();
                        }
                    }
                } while (atomicReferenceFieldUpdater.get(tVar) == null);
            }
            tVar = tVar2;
        }
    }

    public static final t b(Object obj) {
        if (obj != f147b) {
            return (t) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final void c(g2.h hVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f156a.iterator();
        while (it.hasNext()) {
            try {
                ((x2.b) it.next()).c(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    F2.b.d(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            F2.b.d(th, new g(hVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f147b;
    }

    public static final Object e(Object obj, Object obj2) {
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

    public static final void f(g2.h hVar, Object obj) {
        if (obj == f) {
            return;
        }
        if (!(obj instanceof z)) {
            Object i3 = hVar.i(null, x.f186g);
            kotlin.jvm.internal.j.c(i3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            B0.c.n(i3);
            throw null;
        }
        z zVar = (z) obj;
        g0[] g0VarArr = zVar.f191b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        g0 g0Var = g0VarArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = zVar.f190a[length];
        throw null;
    }

    public static final void g(InterfaceC0319c interfaceC0319c, Object obj) {
        if (!(interfaceC0319c instanceof h)) {
            interfaceC0319c.e(obj);
            return;
        }
        h hVar = (h) interfaceC0319c;
        Throwable a3 = AbstractC0276f.a(obj);
        Object c1235n = a3 == null ? obj : new C1235n(a3, false);
        AbstractC0343b abstractC0343b = hVar.f160e;
        abstractC0343b.getContext();
        AbstractC1239s abstractC1239s = hVar.f159d;
        if (abstractC1239s.d()) {
            hVar.f = c1235n;
            hVar.f10461c = 1;
            abstractC1239s.c(abstractC0343b.getContext(), hVar);
            return;
        }
        H a4 = h0.a();
        if (a4.f10469c >= 4294967296L) {
            hVar.f = c1235n;
            hVar.f10461c = 1;
            C0289d c0289d = a4.f10471e;
            if (c0289d == null) {
                c0289d = new C0289d();
                a4.f10471e = c0289d;
            }
            c0289d.addLast(hVar);
            return;
        }
        a4.j(true);
        try {
            P p3 = (P) abstractC0343b.getContext().k(C1240t.f10525b);
            if (p3 == null || p3.a()) {
                Object obj2 = hVar.f161g;
                g2.h context = abstractC0343b.getContext();
                Object l3 = l(context, obj2);
                j0 m3 = l3 != f ? AbstractC1242v.m(abstractC0343b, context, l3) : null;
                try {
                    abstractC0343b.e(obj);
                } finally {
                    if (m3 == null || m3.V()) {
                        f(context, l3);
                    }
                }
            } else {
                CancellationException y = ((Z) p3).y();
                hVar.b(c1235n, y);
                hVar.e(X0.a.n(y));
            }
            while (a4.m()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long i(String str, long j3, long j4, long j5) {
        String str2;
        Long l3;
        int i3;
        int i4;
        int i5;
        int i6 = w.f185a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j3;
        }
        int length = str2.length();
        if (length != 0) {
            int i7 = 0;
            char charAt = str2.charAt(0);
            long j6 = -9223372036854775807L;
            if ((charAt < '0' ? (char) 65535 : charAt == '0' ? (char) 0 : (char) 1) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i3 = 0;
                        i7 = 1;
                        boolean z3 = true;
                        long j7 = 0;
                        long j8 = -256204778801521550L;
                        while (i7 < length) {
                            boolean z4 = z3;
                            int digit = Character.digit((int) str2.charAt(i7), 10);
                            if (digit >= 0) {
                                if (j7 >= j8) {
                                    i4 = length;
                                    i5 = i7;
                                } else if (j8 == -256204778801521550L) {
                                    i4 = length;
                                    i5 = i7;
                                    j8 = j6 / 10;
                                    if (j7 < j8) {
                                    }
                                }
                                long j9 = j7 * 10;
                                long j10 = digit;
                                if (j9 >= j6 + j10) {
                                    j7 = j9 - j10;
                                    i7 = i5 + 1;
                                    z3 = z4;
                                    length = i4;
                                }
                            }
                        }
                        if (i3 == 0) {
                            j7 = -j7;
                        }
                        l3 = Long.valueOf(j7);
                        if (l3 == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = l3.longValue();
                        if (j4 <= longValue && longValue <= j5) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j4 + ".." + j5 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i7 = 1;
                    }
                }
            }
            i3 = i7;
            boolean z32 = true;
            long j72 = 0;
            long j82 = -256204778801521550L;
            while (i7 < length) {
            }
            if (i3 == 0) {
            }
            l3 = Long.valueOf(j72);
            if (l3 == null) {
            }
        }
        l3 = null;
        if (l3 == null) {
        }
    }

    public static int j(int i3, int i4, String str) {
        return (int) i(str, i3, 1, (i4 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object k(g2.h hVar) {
        Object i3 = hVar.i(0, x.f);
        kotlin.jvm.internal.j.b(i3);
        return i3;
    }

    public static final Object l(g2.h hVar, Object obj) {
        if (obj == null) {
            obj = k(hVar);
        }
        if (obj == 0) {
            return f;
        }
        if (obj instanceof Integer) {
            return hVar.i(new z(((Number) obj).intValue(), hVar), x.f187h);
        }
        B0.c.n(obj);
        throw null;
    }
}
