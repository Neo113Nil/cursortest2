package r0;

import F.AbstractC0010k;
import a.AbstractC0018a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m0.AbstractC0059p;
import m0.AbstractC0062t;
import m0.C0054k;
import m0.C0060q;
import m0.D;
import m0.K;
import m0.T;
import m0.Z;
import m0.a0;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0088a {

    /* renamed from: a, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1155a;

    /* renamed from: b, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1156b;

    /* renamed from: c, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1157c;

    /* renamed from: d, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1158d;

    /* renamed from: e, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1159e;

    /* renamed from: f, reason: collision with root package name */
    public static final io.flutter.plugin.platform.i f1160f;

    static {
        int i2 = 2;
        f1155a = new io.flutter.plugin.platform.i(i2, "NO_DECISION");
        f1156b = new io.flutter.plugin.platform.i(i2, "CLOSED");
        f1157c = new io.flutter.plugin.platform.i(i2, "UNDEFINED");
        f1158d = new io.flutter.plugin.platform.i(i2, "REUSABLE_CLAIMED");
        f1159e = new io.flutter.plugin.platform.i(i2, "CONDITION_FALSE");
        f1160f = new io.flutter.plugin.platform.i(i2, "NO_THREAD_ELEMENTS");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, r0.v] */
    /* JADX WARN: Type inference failed for: r4v2, types: [r0.v] */
    public static final Object a(long j2, o0.k kVar) {
        o0.d dVar = o0.d.f1064j;
        while (true) {
            long j3 = kVar.f1197c;
            if (j3 >= j2 && !kVar.c()) {
                return kVar;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1163a;
            Object obj = atomicReferenceFieldUpdater.get(kVar);
            io.flutter.plugin.platform.i iVar = f1156b;
            if (obj == iVar) {
                return iVar;
            }
            ?? r4 = (v) ((d) obj);
            if (r4 != 0) {
                kVar = r4;
            } else {
                ?? r1 = (v) dVar.g(Long.valueOf(j3 + 1), kVar);
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(kVar, null, r1)) {
                        if (kVar.c()) {
                            kVar.d();
                        }
                        kVar = r1;
                    } else if (atomicReferenceFieldUpdater.get(kVar) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final v b(Object obj) {
        if (obj == f1156b) {
            throw new IllegalStateException("Does not contain segment");
        }
        g0.h.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (v) obj;
    }

    public static final void c(Y.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1166a.iterator();
        while (it.hasNext()) {
            try {
                ((n0.b) it.next()).f(th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    AbstractC0018a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            AbstractC0018a.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean d(Object obj) {
        return obj == f1156b;
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

    public static final void f(Y.i iVar, Object obj) {
        if (obj == f1160f) {
            return;
        }
        if (!(obj instanceof A)) {
            g0.h.c(iVar.c(null, y.f1201e), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            throw new ClassCastException();
        }
        A a2 = (A) obj;
        Z[] zArr = a2.f1154b;
        int length = zArr.length - 1;
        if (length < 0) {
            return;
        }
        Z z2 = zArr[length];
        g0.h.b(null);
        Object obj2 = a2.f1153a[length];
        throw null;
    }

    public static final void g(Y.d dVar, Object obj) {
        if (!(dVar instanceof h)) {
            dVar.k(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = W.d.a(obj);
        Object c0054k = a2 == null ? obj : new C0054k(a2, false);
        AbstractC0059p abstractC0059p = hVar.f1169e;
        a0.b bVar = hVar.f1170f;
        bVar.h();
        Y.i iVar = bVar.f419c;
        if (abstractC0059p.h()) {
            hVar.f1171g = c0054k;
            hVar.f956d = 1;
            AbstractC0059p abstractC0059p2 = hVar.f1169e;
            g0.h.b(iVar);
            abstractC0059p2.f(iVar, hVar);
            return;
        }
        D a3 = a0.a();
        if (a3.f889d >= 4294967296L) {
            hVar.f1171g = c0054k;
            hVar.f956d = 1;
            X.c cVar = a3.f891f;
            if (cVar == null) {
                cVar = new X.c();
                a3.f891f = cVar;
            }
            cVar.addLast(hVar);
            return;
        }
        a3.k(true);
        try {
            g0.h.b(iVar);
            K k2 = (K) iVar.d(C0060q.f943c);
            if (k2 == null || k2.b()) {
                Object obj2 = hVar.f1172h;
                g0.h.b(iVar);
                Object k3 = k(iVar, obj2);
                if (k3 != f1160f) {
                    AbstractC0062t.h(bVar, iVar);
                }
                try {
                    bVar.k(obj);
                } finally {
                    f(iVar, k3);
                }
            } else {
                CancellationException v = ((T) k2).v();
                hVar.b(c0054k, v);
                hVar.k(AbstractC0018a.h(v));
            }
            while (a3.l()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long h(String str, long j2, long j3, long j4) {
        String str2;
        Long l2;
        boolean z2;
        int i2;
        int i3;
        int i4 = x.f1199a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        int length = str2.length();
        if (length != 0) {
            int i5 = 0;
            char charAt = str2.charAt(0);
            long j5 = -9223372036854775807L;
            if (charAt < '0') {
                z2 = true;
                if (length != 1) {
                    if (charAt == '+') {
                        z2 = false;
                        i5 = 1;
                    } else if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i5 = 1;
                    }
                }
            } else {
                z2 = false;
            }
            long j6 = 0;
            long j7 = -256204778801521550L;
            while (i5 < length) {
                int digit = Character.digit((int) str2.charAt(i5), 10);
                if (digit >= 0) {
                    if (j6 >= j7) {
                        i2 = length;
                        i3 = i5;
                    } else if (j7 == -256204778801521550L) {
                        i2 = length;
                        i3 = i5;
                        j7 = j5 / 10;
                        if (j6 < j7) {
                        }
                    }
                    long j8 = j6 * 10;
                    long j9 = digit;
                    if (j8 >= j5 + j9) {
                        j6 = j8 - j9;
                        i5 = i3 + 1;
                        length = i2;
                    }
                }
            }
            l2 = z2 ? Long.valueOf(j6) : Long.valueOf(-j6);
            if (l2 != null) {
                throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
            }
            long longValue = l2.longValue();
            if (j3 <= longValue && longValue <= j4) {
                return longValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
        }
        l2 = null;
        if (l2 != null) {
        }
    }

    public static int i(String str, int i2, int i3) {
        return (int) h(str, i2, 1, (i3 & 8) != 0 ? Integer.MAX_VALUE : 2097150);
    }

    public static final Object j(Y.i iVar) {
        Object c2 = iVar.c(0, y.f1200d);
        g0.h.b(c2);
        return c2;
    }

    public static final Object k(Y.i iVar, Object obj) {
        if (obj == null) {
            obj = j(iVar);
        }
        if (obj == 0) {
            return f1160f;
        }
        if (obj instanceof Integer) {
            return iVar.c(new A(((Number) obj).intValue(), iVar), y.f1202f);
        }
        AbstractC0010k.e(obj);
        throw null;
    }
}
