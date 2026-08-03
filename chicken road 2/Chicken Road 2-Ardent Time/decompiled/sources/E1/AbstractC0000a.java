package E1;

/* renamed from: E1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0000a {

    /* renamed from: c, reason: collision with root package name */
    public static final C.j f263c;

    /* renamed from: d, reason: collision with root package name */
    public static final C.j f264d;

    /* renamed from: a, reason: collision with root package name */
    public static final C.j f261a = new C.j(3, "NO_DECISION");

    /* renamed from: b, reason: collision with root package name */
    public static final C.j f262b = new C.j(3, "CLOSED");

    /* renamed from: e, reason: collision with root package name */
    public static final C.j f265e = new C.j(3, "CONDITION_FALSE");

    /* renamed from: f, reason: collision with root package name */
    public static final C.j f266f = new C.j(3, "NO_THREAD_ELEMENTS");

    static {
        int i2 = 3;
        f263c = new C.j(i2, "UNDEFINED");
        f264d = new C.j(i2, "REUSABLE_CLAIMED");
    }

    public static final E1.A a(s1.l lVar, java.lang.Object obj, E1.A a2) {
        try {
            lVar.invoke(obj);
        } catch (java.lang.Throwable th) {
            if (a2 == null || a2.getCause() == th) {
                return new E1.A("Exception in undelivered element handler for " + obj, th);
            }
            Q1.d.b(a2, th);
        }
        return a2;
    }

    public static final java.lang.Object b(E1.u uVar, long j2, s1.p pVar) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        while (true) {
            if (uVar.f303c >= j2 && !uVar.c()) {
                return uVar;
            }
            java.lang.Object obj = E1.d.f269a.get(uVar);
            C.j jVar = f262b;
            if (obj == jVar) {
                return jVar;
            }
            E1.u uVar2 = (E1.u) ((E1.d) obj);
            if (uVar2 == null) {
                uVar2 = (E1.u) pVar.invoke(java.lang.Long.valueOf(uVar.f303c + 1), uVar);
                do {
                    atomicReferenceFieldUpdater = E1.d.f269a;
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

    public static final E1.u c(java.lang.Object obj) {
        if (obj != f262b) {
            return (E1.u) obj;
        }
        throw new java.lang.IllegalStateException("Does not contain segment");
    }

    public static final void d(java.lang.Throwable th, k1.i iVar) {
        java.lang.Throwable runtimeException;
        java.util.Iterator it = E1.f.f272a.iterator();
        while (it.hasNext()) {
            try {
                ((A1.b) it.next()).l(th, iVar);
            } catch (java.lang.Throwable th2) {
                if (th == th2) {
                    runtimeException = th;
                } else {
                    runtimeException = new java.lang.RuntimeException("Exception while trying to handle coroutine exception", th2);
                    Q1.d.b(runtimeException, th);
                }
                java.lang.Thread currentThread = java.lang.Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, runtimeException);
            }
        }
        try {
            Q1.d.b(th, new E1.g(iVar));
        } catch (java.lang.Throwable unused) {
        }
        java.lang.Thread currentThread2 = java.lang.Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final boolean e(java.lang.Object obj) {
        return obj == f262b;
    }

    public static final java.lang.Object f(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof java.util.ArrayList) {
            ((java.util.ArrayList) obj).add(obj2);
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void g(k1.i iVar, java.lang.Object obj) {
        if (obj == f266f) {
            return;
        }
        if (!(obj instanceof E1.z)) {
            java.lang.Object k2 = iVar.k(null, E1.x.f307g);
            kotlin.jvm.internal.i.c(k2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            B1.a.m(k2);
            throw null;
        }
        E1.z zVar = (E1.z) obj;
        z1.g0[] g0VarArr = zVar.f312b;
        int length = g0VarArr.length - 1;
        if (length < 0) {
            return;
        }
        z1.g0 g0Var = g0VarArr[length];
        kotlin.jvm.internal.i.b(null);
        java.lang.Object obj2 = zVar.f311a[length];
        throw null;
    }

    public static final void h(k1.d dVar, java.lang.Object obj, s1.l lVar) {
        if (!(dVar instanceof E1.h)) {
            dVar.l(obj);
            return;
        }
        E1.h hVar = (E1.h) dVar;
        java.lang.Throwable a2 = h1.AbstractC0174f.a(obj);
        java.lang.Object c1062o = a2 == null ? lVar != null ? new z1.C1062o(obj, lVar) : obj : new z1.C1061n(a2, false);
        m1.AbstractC0931b abstractC0931b = hVar.f276e;
        abstractC0931b.getContext();
        z1.AbstractC1065s abstractC1065s = hVar.f275d;
        if (abstractC1065s.n()) {
            hVar.f277f = c1062o;
            hVar.f8520c = 1;
            abstractC1065s.l(abstractC0931b.getContext(), hVar);
            return;
        }
        z1.H a3 = z1.h0.a();
        if (a3.f8529c >= 4294967296L) {
            hVar.f277f = c1062o;
            hVar.f8520c = 1;
            i1.C0188g c0188g = a3.f8531e;
            if (c0188g == null) {
                c0188g = new i1.C0188g();
                a3.f8531e = c0188g;
            }
            c0188g.addLast(hVar);
            return;
        }
        a3.q(true);
        try {
            z1.P p2 = (z1.P) abstractC0931b.getContext().m(z1.C1066t.f8592b);
            if (p2 == null || p2.b()) {
                java.lang.Object obj2 = hVar.f278g;
                k1.i context = abstractC0931b.getContext();
                java.lang.Object m2 = m(context, obj2);
                z1.j0 m3 = m2 != f266f ? z1.AbstractC1068v.m(abstractC0931b, context, m2) : null;
                try {
                    abstractC0931b.l(obj);
                } finally {
                    if (m3 == null || m3.W()) {
                        g(context, m2);
                    }
                }
            } else {
                java.util.concurrent.CancellationException z2 = ((z1.Z) p2).z();
                hVar.b(c1062o, z2);
                hVar.l(a.AbstractC0059a.i(z2));
            }
            while (a3.s()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long j(java.lang.String str, long j2, long j3, long j4) {
        java.lang.String str2;
        int i2;
        java.lang.Long valueOf;
        long j5;
        int i3 = E1.w.f305a;
        try {
            str2 = java.lang.System.getProperty(str);
        } catch (java.lang.SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j2;
        }
        u0.AbstractC0995a.b(10);
        int length = str2.length();
        if (length != 0) {
            int i4 = 0;
            char charAt = str2.charAt(0);
            long j6 = -9223372036854775807L;
            if (kotlin.jvm.internal.i.f(charAt, 48) < 0) {
                if (length != 1) {
                    if (charAt == '+') {
                        i2 = 0;
                        i4 = 1;
                        long j7 = 0;
                        long j8 = -256204778801521550L;
                        while (i4 < length) {
                            int digit = java.lang.Character.digit((int) str2.charAt(i4), 10);
                            if (digit >= 0) {
                                if (j7 < j8) {
                                    if (j8 == -256204778801521550L) {
                                        j8 = j6 / 10;
                                        if (j7 < j8) {
                                        }
                                    }
                                }
                                long j9 = j7 * 10;
                                long j10 = digit;
                                if (j9 >= j6 + j10) {
                                    j7 = j9 - j10;
                                    i4++;
                                }
                            }
                        }
                        valueOf = i2 == 0 ? java.lang.Long.valueOf(j7) : java.lang.Long.valueOf(-j7);
                        if (valueOf == null) {
                            throw new java.lang.IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
                        }
                        long longValue = valueOf.longValue();
                        if (j3 <= longValue) {
                            j5 = j4;
                            if (longValue <= j5) {
                                return longValue;
                            }
                        } else {
                            j5 = j4;
                        }
                        throw new java.lang.IllegalStateException(("System property '" + str + "' should be in range " + j3 + ".." + j5 + ", but is '" + longValue + '\'').toString());
                    }
                    if (charAt == '-') {
                        j6 = Long.MIN_VALUE;
                        i4 = 1;
                    }
                }
            }
            i2 = i4;
            long j72 = 0;
            long j82 = -256204778801521550L;
            while (i4 < length) {
            }
            valueOf = i2 == 0 ? java.lang.Long.valueOf(j72) : java.lang.Long.valueOf(-j72);
            if (valueOf == null) {
            }
        }
        valueOf = null;
        if (valueOf == null) {
        }
    }

    public static int k(java.lang.String str, int i2, int i3, int i4, int i5) {
        if ((i5 & 4) != 0) {
            i3 = 1;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return (int) j(str, i2, i3, i4);
    }

    public static final java.lang.Object l(k1.i iVar) {
        java.lang.Object k2 = iVar.k(0, E1.x.f306f);
        kotlin.jvm.internal.i.b(k2);
        return k2;
    }

    public static final java.lang.Object m(k1.i iVar, java.lang.Object obj) {
        if (obj == null) {
            obj = l(iVar);
        }
        if (obj == 0) {
            return f266f;
        }
        if (obj instanceof java.lang.Integer) {
            return iVar.k(new E1.z(((java.lang.Number) obj).intValue(), iVar), E1.x.f308h);
        }
        B1.a.m(obj);
        throw null;
    }
}
