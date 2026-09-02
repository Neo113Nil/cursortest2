package g1;

import b1.AbstractC0028p;
import b1.AbstractC0030s;
import b1.C;
import b1.C0023k;
import b1.C0024l;
import b1.C0029q;
import b1.J;
import b1.S;
import b1.Y;
import b1.Z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final C0.a f1138c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0.a f1139d;

    /* renamed from: a, reason: collision with root package name */
    public static final C0.a f1136a = new C0.a(28, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final C0.a f1137b = new C0.a(28, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final C0.a f1140e = new C0.a(28, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final C0.a f1141f = new C0.a(28, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 28;
        f1138c = new C0.a(i2, "UNDEFINED");
        f1139d = new C0.a(i2, "REUSABLE_CLAIMED");
    }

    public static final void a(U0.l lVar, Object obj, M0.i iVar) {
        H.a b2 = b(lVar, obj, null);
        if (b2 != null) {
            AbstractC0030s.c(iVar, b2);
        }
    }

    public static final H.a b(U0.l lVar, Object obj, H.a aVar) {
        try {
            lVar.invoke(obj);
        } catch (Throwable th) {
            if (aVar == null || aVar.getCause() == th) {
                return new H.a("Exception in undelivered element handler for " + obj, th);
            }
            V.a.a(aVar, th);
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [g1.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [g1.u] */
    public static final Object c(long j2, d1.k kVar) {
        d1.d dVar = d1.d.f915a;
        while (true) {
            long j3 = kVar.f1179c;
            if (j3 >= j2 && !kVar.c()) {
                return kVar;
            }
            Object obj = d.f1144a.get(kVar);
            C0.a aVar = f1137b;
            if (obj == aVar) {
                return aVar;
            }
            ?? r3 = (u) ((d) obj);
            if (r3 != 0) {
                kVar = r3;
            } else {
                ?? r12 = (u) dVar.invoke(Long.valueOf(j3 + 1), kVar);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f1144a;
                    if (atomicReferenceFieldUpdater.compareAndSet(kVar, null, r12)) {
                        if (kVar.c()) {
                            kVar.d();
                        }
                        kVar = r12;
                    } else if (atomicReferenceFieldUpdater.get(kVar) != null) {
                        break;
                    }
                }
            }
        }
    }

    public static final u d(Object obj) {
        if (obj == f1137b) {
            throw new IllegalStateException("Does not contain segment");
        }
        kotlin.jvm.internal.j.c(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (u) obj;
    }

    public static final void e(M0.i iVar, Throwable th) {
        Throwable runtimeException;
        Iterator it = f.f1147a.iterator();
        while (it.hasNext()) {
            try {
                ((c1.b) it.next()).l(iVar, th);
            } catch (Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                    V.a.a(runtimeException, th);
                }
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            V.a.a(th, new g(iVar));
        } catch (Throwable unused) {
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean f(Object obj) {
        return obj == f1137b;
    }

    public static final Object g(Object obj, Object obj2) {
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

    public static final void h(M0.i iVar, Object obj) {
        if (obj == f1141f) {
            return;
        }
        if (!(obj instanceof z)) {
            kotlin.jvm.internal.j.c(iVar.j(null, x.f1183g), "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            throw new ClassCastException();
        }
        z zVar = (z) obj;
        Y[] yArr = zVar.f1188b;
        int length = yArr.length - 1;
        if (length < 0) {
            return;
        }
        Y y2 = yArr[length];
        kotlin.jvm.internal.j.b(null);
        Object obj2 = zVar.f1187a[length];
        throw null;
    }

    public static final void i(M0.d dVar, Object obj, U0.l lVar) {
        if (!(dVar instanceof h)) {
            dVar.f(obj);
            return;
        }
        h hVar = (h) dVar;
        Throwable a2 = K0.f.a(obj);
        Object c0024l = a2 == null ? lVar != null ? new C0024l(obj, lVar) : obj : new C0023k(a2, false);
        AbstractC0028p abstractC0028p = hVar.f1150d;
        O0.b bVar = hVar.f1151e;
        bVar.getContext();
        boolean m2 = abstractC0028p.m();
        M0.i iVar = bVar.f277b;
        if (m2) {
            hVar.f1152f = c0024l;
            hVar.f692c = 1;
            kotlin.jvm.internal.j.b(iVar);
            hVar.f1150d.l(iVar, hVar);
            return;
        }
        C a3 = Z.a();
        if (a3.f623c >= 4294967296L) {
            hVar.f1152f = c0024l;
            hVar.f692c = 1;
            L0.b bVar2 = a3.f625e;
            if (bVar2 == null) {
                bVar2 = new L0.b();
                a3.f625e = bVar2;
            }
            bVar2.addLast(hVar);
            return;
        }
        a3.p(true);
        try {
            kotlin.jvm.internal.j.b(iVar);
            J j2 = (J) iVar.i(C0029q.f679b);
            if (j2 == null || j2.b()) {
                Object obj2 = hVar.f1153g;
                kotlin.jvm.internal.j.b(iVar);
                Object m3 = m(iVar, obj2);
                if (m3 != f1141f) {
                    AbstractC0030s.i(bVar, iVar);
                }
                try {
                    bVar.f(obj);
                } finally {
                    h(iVar, m3);
                }
            } else {
                CancellationException u2 = ((S) j2).u();
                hVar.b(c0024l, u2);
                hVar.f(V.a.k(u2));
            }
            while (a3.q()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(String str, long j2, long j3, long j4) {
        String str2;
        int i2;
        String str3;
        Long valueOf;
        int i3;
        int i4 = w.f1181a;
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
                if (length != 1) {
                    if (charAt == '+') {
                        i2 = 0;
                        i5 = 1;
                        long j6 = 0;
                        long j7 = -256204778801521550L;
                        while (i5 < length) {
                            int digit = Character.digit((int) str2.charAt(i5), 10);
                            if (digit >= 0) {
                                if (j6 >= j7) {
                                    str3 = str2;
                                    i3 = length;
                                } else if (j7 == -256204778801521550L) {
                                    str3 = str2;
                                    i3 = length;
                                    j7 = j5 / 10;
                                    if (j6 < j7) {
                                        valueOf = null;
                                        break;
                                    }
                                }
                                long j8 = j6 * 10;
                                long j9 = digit;
                                if (j8 < j5 + j9) {
                                    valueOf = null;
                                    break;
                                }
                                j6 = j8 - j9;
                                i5++;
                                length = i3;
                                str2 = str3;
                            }
                        }
                        str3 = str2;
                        if (i2 == 0) {
                            j6 = -j6;
                        }
                        valueOf = Long.valueOf(j6);
                        if (valueOf == null) {
                            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str3 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue && longValue <= j4) {
                            return longValue;
                        }
                        throw new IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j4 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j5 = Long.MIN_VALUE;
                        i5 = 1;
                    }
                }
            }
            i2 = i5;
            long j62 = 0;
            long j72 = -256204778801521550L;
            while (i5 < length) {
            }
            str3 = str2;
            if (i2 == 0) {
            }
            valueOf = Long.valueOf(j62);
            if (valueOf == null) {
            }
        }
        str3 = str2;
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int k(String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) j(str, i2, i3, i4);
    }

    public static final Object l(M0.i iVar) {
        Object j2 = iVar.j(0, x.f1182f);
        kotlin.jvm.internal.j.b(j2);
        return j2;
    }

    public static final Object m(M0.i iVar, Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f1141f;
        }
        if (obj instanceof Integer) {
            return iVar.j(new z(((Number) obj).intValue(), iVar), x.f1184h);
        }
        C0.g.j(obj);
        throw null;
    }
}
