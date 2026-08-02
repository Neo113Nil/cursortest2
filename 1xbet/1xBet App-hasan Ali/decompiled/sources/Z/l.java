package Z;

import B.K;
import B.L;
import P.H;
import S3.C0416t;
import java.util.HashMap;
import r.C2322H;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final C0416t f6206a = new C0416t(10);

    /* renamed from: b, reason: collision with root package name */
    public static final v3.e f6207b = new v3.e(12);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6208c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static j f6209d;

    /* renamed from: e, reason: collision with root package name */
    public static long f6210e;
    public static final L f;

    /* renamed from: g, reason: collision with root package name */
    public static final K f6211g;

    /* renamed from: h, reason: collision with root package name */
    public static Object f6212h;
    public static Object i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f6213j;

    /* renamed from: k, reason: collision with root package name */
    public static final X.a f6214k;

    static {
        j jVar = j.f6198o;
        f6209d = jVar;
        long j5 = 1;
        f6210e = j5 + j5;
        L l5 = new L();
        l5.f642c = new long[16];
        l5.f643d = new int[16];
        int[] iArr = new int[16];
        int i5 = 0;
        while (i5 < 16) {
            int i6 = i5 + 1;
            iArr[i5] = i6;
            i5 = i6;
        }
        l5.f644e = iArr;
        f = l5;
        K k5 = new K(5);
        k5.f638c = new int[16];
        k5.f639d = new X.m[16];
        f6211g = k5;
        X3.v vVar = X3.v.f6090k;
        f6212h = vVar;
        i = vVar;
        long j6 = f6210e;
        f6210e = j5 + j6;
        a aVar = new a(j6, jVar, null, new C0416t(9));
        f6209d = f6209d.g(aVar.f6188b);
        f6213j = aVar;
        f6214k = new X.a(0);
    }

    public static final void a() {
        f(f6206a);
    }

    public static final i4.c b(i4.c cVar, i4.c cVar2) {
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new k(cVar, cVar2, 1);
    }

    public static final HashMap c(long j5, b bVar, j jVar) {
        long[] jArr;
        j jVar2;
        long[] jArr2;
        j jVar3;
        int i5;
        w t5;
        long j6 = j5;
        C2322H x5 = bVar.x();
        if (x5 != null) {
            j f5 = bVar.d().g(bVar.g()).f(bVar.f6179j);
            Object[] objArr = x5.f18934b;
            long[] jArr3 = x5.f18933a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j7 = jArr3[i6];
                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i7 = 8;
                        int i8 = 8 - ((~(i6 - length)) >>> 31);
                        int i9 = 0;
                        while (i9 < i8) {
                            if ((j7 & 255) < 128) {
                                u uVar = (u) objArr[(i6 << 3) + i9];
                                w c5 = uVar.c();
                                jArr2 = jArr3;
                                i5 = i7;
                                w t6 = t(c5, j6, jVar);
                                if (t6 == null || (t5 = t(c5, j6, f5)) == null || t6.equals(t5)) {
                                    jVar3 = f5;
                                } else {
                                    jVar3 = f5;
                                    w t7 = t(c5, bVar.g(), bVar.d());
                                    if (t7 == null) {
                                        s();
                                        throw null;
                                    }
                                    w f6 = uVar.f(t5, t6, t7);
                                    if (f6 == null) {
                                        return null;
                                    }
                                    if (hashMap == null) {
                                        hashMap = new HashMap();
                                    }
                                    hashMap.put(t6, f6);
                                    hashMap = hashMap;
                                }
                            } else {
                                jArr2 = jArr3;
                                jVar3 = f5;
                                i5 = i7;
                            }
                            j7 >>= i5;
                            i9++;
                            j6 = j5;
                            i7 = i5;
                            jArr3 = jArr2;
                            f5 = jVar3;
                        }
                        jArr = jArr3;
                        jVar2 = f5;
                        if (i8 != i7) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        jVar2 = f5;
                    }
                    if (i6 == length) {
                        return hashMap;
                    }
                    i6++;
                    j6 = j5;
                    jArr3 = jArr;
                    f5 = jVar2;
                }
            }
        }
        return null;
    }

    public static final void d(f fVar) {
        long j5;
        if (f6209d.e(fVar.g())) {
            return;
        }
        StringBuilder sb = new StringBuilder("Snapshot is not open: snapshotId=");
        sb.append(fVar.g());
        sb.append(", disposed=");
        sb.append(fVar.f6189c);
        sb.append(", applied=");
        b bVar = fVar instanceof b ? (b) fVar : null;
        sb.append(bVar != null ? Boolean.valueOf(bVar.f6182m) : "read-only");
        sb.append(", lowestPin=");
        synchronized (f6208c) {
            L l5 = f;
            j5 = l5.f640a > 0 ? ((long[]) l5.f642c)[0] : -1L;
        }
        sb.append(j5);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final j e(j jVar, long j5, long j6) {
        while (kotlin.jvm.internal.l.h(j5, j6) < 0) {
            jVar = jVar.g(j5);
            j5++;
        }
        return jVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final Object f(i4.c cVar) {
        C2322H c2322h;
        Object w5;
        a aVar = f6213j;
        synchronized (f6208c) {
            try {
                c2322h = aVar.f6178h;
                if (c2322h != null) {
                    f6214k.addAndGet(1);
                }
                w5 = w(aVar, cVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c2322h != null) {
            try {
                ?? r42 = f6212h;
                int size = r42.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((i4.e) r42.get(i5)).invoke(new R.h(c2322h), aVar);
                }
            } finally {
                f6214k.addAndGet(-1);
            }
        }
        synchronized (f6208c) {
            g();
            if (c2322h != null) {
                Object[] objArr = c2322h.f18934b;
                long[] jArr = c2322h.f18933a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j5 = jArr[i6];
                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            for (int i8 = 0; i8 < i7; i8++) {
                                if ((255 & j5) < 128) {
                                    r((u) objArr[(i6 << 3) + i8]);
                                }
                                j5 >>= 8;
                            }
                            if (i7 != 8) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                    }
                }
            }
        }
        return w5;
    }

    public static final void g() {
        K k5 = f6211g;
        int i5 = k5.f637b;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            X.m mVar = ((X.m[]) k5.f639d)[i6];
            Object obj = mVar != null ? mVar.get() : null;
            if (obj != null && q((u) obj)) {
                if (i7 != i6) {
                    ((X.m[]) k5.f639d)[i7] = mVar;
                    int[] iArr = (int[]) k5.f638c;
                    iArr[i7] = iArr[i6];
                }
                i7++;
            }
            i6++;
        }
        for (int i8 = i7; i8 < i5; i8++) {
            ((X.m[]) k5.f639d)[i8] = null;
            ((int[]) k5.f638c)[i8] = 0;
        }
        if (i7 != i5) {
            k5.f637b = i7;
        }
    }

    public static final f h(f fVar, i4.c cVar, boolean z3) {
        boolean z5 = fVar instanceof b;
        if (z5 || fVar == null) {
            return new y(z5 ? (b) fVar : null, cVar, null, false, z3);
        }
        return new z(fVar, cVar, false, z3);
    }

    public static final w i(w wVar) {
        w t5;
        f k5 = k();
        w t6 = t(wVar, k5.g(), k5.d());
        if (t6 != null) {
            return t6;
        }
        synchronized (f6208c) {
            f k6 = k();
            t5 = t(wVar, k6.g(), k6.d());
        }
        if (t5 != null) {
            return t5;
        }
        s();
        throw null;
    }

    public static final w j(w wVar, f fVar) {
        w t5;
        w t6 = t(wVar, fVar.g(), fVar.d());
        if (t6 != null) {
            return t6;
        }
        synchronized (f6208c) {
            t5 = t(wVar, fVar.g(), fVar.d());
        }
        if (t5 != null) {
            return t5;
        }
        s();
        throw null;
    }

    public static final f k() {
        f fVar = (f) f6207b.u();
        return fVar == null ? f6213j : fVar;
    }

    public static final i4.c l(i4.c cVar, i4.c cVar2, boolean z3) {
        if (!z3) {
            cVar2 = null;
        }
        return (cVar == null || cVar2 == null || cVar == cVar2) ? cVar == null ? cVar2 : cVar : new k(cVar, cVar2, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r4 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final w m(w wVar, u uVar) {
        w c5 = uVar.c();
        long j5 = f6210e;
        L l5 = f;
        if (l5.f640a > 0) {
            j5 = ((long[]) l5.f642c)[0];
        }
        long j6 = j5 - 1;
        j jVar = j.f6198o;
        w wVar2 = null;
        w wVar3 = null;
        while (true) {
            if (c5 == null) {
                break;
            }
            long j7 = c5.f6242a;
            if (j7 == 0) {
                break;
            }
            if (j7 != 0 && kotlin.jvm.internal.l.h(j7, j6) <= 0 && !jVar.e(j7)) {
                if (wVar3 == null) {
                    wVar3 = c5;
                } else if (kotlin.jvm.internal.l.h(c5.f6242a, wVar3.f6242a) >= 0) {
                    wVar2 = wVar3;
                }
            }
            c5 = c5.f6243b;
        }
        if (wVar2 != null) {
            wVar2.f6242a = Long.MAX_VALUE;
            return wVar2;
        }
        w b3 = wVar.b(Long.MAX_VALUE);
        b3.f6243b = uVar.c();
        uVar.e(b3);
        return b3;
    }

    public static final w n(w wVar, H h3, f fVar) {
        w m5;
        synchronized (f6208c) {
            m5 = m(wVar, h3);
            m5.a(wVar);
            m5.f6242a = fVar.g();
        }
        return m5;
    }

    public static final void o(f fVar, u uVar) {
        fVar.t(fVar.h() + 1);
        i4.c i5 = fVar.i();
        if (i5 != null) {
            i5.c(uVar);
        }
    }

    public static final w p(w wVar, v vVar, f fVar, w wVar2) {
        w m5;
        if (fVar.f()) {
            fVar.n(vVar);
        }
        long g5 = fVar.g();
        if (wVar2.f6242a == g5) {
            return wVar2;
        }
        synchronized (f6208c) {
            m5 = m(wVar, vVar);
        }
        m5.f6242a = g5;
        if (wVar2.f6242a != 1) {
            fVar.n(vVar);
        }
        return m5;
    }

    public static final boolean q(u uVar) {
        w wVar;
        long j5 = f6210e;
        L l5 = f;
        if (l5.f640a > 0) {
            j5 = ((long[]) l5.f642c)[0];
        }
        w wVar2 = null;
        w wVar3 = null;
        int i5 = 0;
        for (w c5 = uVar.c(); c5 != null; c5 = c5.f6243b) {
            long j6 = c5.f6242a;
            if (j6 != 0) {
                if (kotlin.jvm.internal.l.h(j6, j5) >= 0) {
                    i5++;
                } else if (wVar2 == null) {
                    i5++;
                    wVar2 = c5;
                } else {
                    if (kotlin.jvm.internal.l.h(c5.f6242a, wVar2.f6242a) < 0) {
                        wVar = wVar2;
                        wVar2 = c5;
                    } else {
                        wVar = c5;
                    }
                    if (wVar3 == null) {
                        wVar3 = uVar.c();
                        w wVar4 = wVar3;
                        while (true) {
                            if (wVar3 == null) {
                                wVar3 = wVar4;
                                break;
                            }
                            if (kotlin.jvm.internal.l.h(wVar3.f6242a, j5) >= 0) {
                                break;
                            }
                            if (kotlin.jvm.internal.l.h(wVar4.f6242a, wVar3.f6242a) < 0) {
                                wVar4 = wVar3;
                            }
                            wVar3 = wVar3.f6243b;
                        }
                    }
                    wVar2.f6242a = 0L;
                    wVar2.a(wVar3);
                    wVar2 = wVar;
                }
            }
        }
        return i5 > 1;
    }

    public static final void r(u uVar) {
        if (q(uVar)) {
            K k5 = f6211g;
            int i5 = k5.f637b;
            int identityHashCode = System.identityHashCode(uVar);
            int i6 = -1;
            if (i5 > 0) {
                int i7 = k5.f637b - 1;
                int i8 = 0;
                while (true) {
                    if (i8 > i7) {
                        i6 = -(i8 + 1);
                        break;
                    }
                    int i9 = (i8 + i7) >>> 1;
                    int i10 = ((int[]) k5.f638c)[i9];
                    if (i10 < identityHashCode) {
                        i8 = i9 + 1;
                    } else if (i10 > identityHashCode) {
                        i7 = i9 - 1;
                    } else {
                        X.m mVar = ((X.m[]) k5.f639d)[i9];
                        if (uVar != (mVar != null ? mVar.get() : null)) {
                            for (int i11 = i9 - 1; -1 < i11 && ((int[]) k5.f638c)[i11] == identityHashCode; i11--) {
                                X.m mVar2 = ((X.m[]) k5.f639d)[i11];
                                if ((mVar2 != null ? mVar2.get() : null) == uVar) {
                                    i6 = i11;
                                    break;
                                }
                            }
                            i9++;
                            int i12 = k5.f637b;
                            while (true) {
                                if (i9 >= i12) {
                                    i6 = -(k5.f637b + 1);
                                    break;
                                } else {
                                    if (((int[]) k5.f638c)[i9] != identityHashCode) {
                                        i6 = -(i9 + 1);
                                        break;
                                    }
                                    X.m mVar3 = ((X.m[]) k5.f639d)[i9];
                                    if ((mVar3 != null ? mVar3.get() : null) == uVar) {
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                            }
                        }
                        i6 = i9;
                    }
                }
                if (i6 >= 0) {
                    return;
                }
            }
            int i13 = -(i6 + 1);
            X.m[] mVarArr = (X.m[]) k5.f639d;
            int length = mVarArr.length;
            if (i5 == length) {
                int i14 = length * 2;
                X.m[] mVarArr2 = new X.m[i14];
                int[] iArr = new int[i14];
                int i15 = i13 + 1;
                System.arraycopy(mVarArr, i13, mVarArr2, i15, i5 - i13);
                System.arraycopy((X.m[]) k5.f639d, 0, mVarArr2, 0, i13);
                X3.l.s0(i15, i13, i5, (int[]) k5.f638c, iArr);
                X3.l.x0(0, i13, 6, (int[]) k5.f638c, iArr);
                k5.f639d = mVarArr2;
                k5.f638c = iArr;
            } else {
                int i16 = i13 + 1;
                System.arraycopy(mVarArr, i13, mVarArr, i16, i5 - i13);
                int[] iArr2 = (int[]) k5.f638c;
                X3.l.s0(i16, i13, i5, iArr2, iArr2);
            }
            ((X.m[]) k5.f639d)[i13] = new X.m(uVar);
            ((int[]) k5.f638c)[i13] = identityHashCode;
            k5.f637b++;
        }
    }

    public static final void s() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final w t(w wVar, long j5, j jVar) {
        w wVar2 = null;
        while (wVar != null) {
            long j6 = wVar.f6242a;
            if (j6 != 0 && kotlin.jvm.internal.l.h(j6, j5) <= 0 && !jVar.e(j6) && (wVar2 == null || kotlin.jvm.internal.l.h(wVar2.f6242a, wVar.f6242a) < 0)) {
                wVar2 = wVar;
            }
            wVar = wVar.f6243b;
        }
        if (wVar2 != null) {
            return wVar2;
        }
        return null;
    }

    public static final w u(w wVar, u uVar) {
        w t5;
        f k5 = k();
        i4.c e3 = k5.e();
        if (e3 != null) {
            e3.c(uVar);
        }
        w t6 = t(wVar, k5.g(), k5.d());
        if (t6 != null) {
            return t6;
        }
        synchronized (f6208c) {
            f k6 = k();
            w c5 = uVar.c();
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable", c5);
            t5 = t(c5, k6.g(), k6.d());
            if (t5 == null) {
                s();
                throw null;
            }
        }
        return t5;
    }

    public static final void v(int i5) {
        L l5 = f;
        int i6 = ((int[]) l5.f644e)[i5];
        l5.b(i6, l5.f640a - 1);
        l5.f640a--;
        long[] jArr = (long[]) l5.f642c;
        long j5 = jArr[i6];
        int i7 = i6;
        while (i7 > 0) {
            int i8 = ((i7 + 1) >> 1) - 1;
            if (kotlin.jvm.internal.l.h(jArr[i8], j5) <= 0) {
                break;
            }
            l5.b(i8, i7);
            i7 = i8;
        }
        long[] jArr2 = (long[]) l5.f642c;
        int i9 = l5.f640a >> 1;
        while (i6 < i9) {
            int i10 = (i6 + 1) << 1;
            int i11 = i10 - 1;
            if (i10 < l5.f640a && kotlin.jvm.internal.l.h(jArr2[i10], jArr2[i11]) < 0) {
                if (kotlin.jvm.internal.l.h(jArr2[i10], jArr2[i6]) >= 0) {
                    break;
                }
                l5.b(i10, i6);
                i6 = i10;
            } else {
                if (kotlin.jvm.internal.l.h(jArr2[i11], jArr2[i6]) >= 0) {
                    break;
                }
                l5.b(i11, i6);
                i6 = i11;
            }
        }
        ((int[]) l5.f644e)[i5] = l5.f641b;
        l5.f641b = i5;
    }

    public static final Object w(a aVar, i4.c cVar) {
        long j5 = aVar.f6188b;
        Object c5 = cVar.c(f6209d.d(j5));
        long j6 = f6210e;
        f6210e = 1 + j6;
        j d5 = f6209d.d(j5);
        f6209d = d5;
        aVar.f6188b = j6;
        aVar.f6187a = d5;
        aVar.f6177g = 0;
        aVar.f6178h = null;
        aVar.o();
        f6209d = f6209d.g(j6);
        return c5;
    }

    public static final w x(w wVar, u uVar, f fVar) {
        w t5;
        if (fVar.f()) {
            fVar.n(uVar);
        }
        long g5 = fVar.g();
        w t6 = t(wVar, g5, fVar.d());
        if (t6 == null) {
            s();
            throw null;
        }
        if (t6.f6242a == fVar.g()) {
            return t6;
        }
        synchronized (f6208c) {
            t5 = t(uVar.c(), g5, fVar.d());
            if (t5 == null) {
                s();
                throw null;
            }
            if (t5.f6242a != g5) {
                w m5 = m(t5, uVar);
                m5.a(t5);
                m5.f6242a = fVar.g();
                t5 = m5;
            }
        }
        if (t6.f6242a != 1) {
            fVar.n(uVar);
        }
        return t5;
    }
}
