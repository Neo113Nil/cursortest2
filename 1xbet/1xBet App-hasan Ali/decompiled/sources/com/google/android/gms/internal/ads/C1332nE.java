package com.google.android.gms.internal.ads;

import A.C0001a;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.nE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1332nE implements Handler.Callback, InterfaceC1513rG, FE {

    /* renamed from: d0, reason: collision with root package name */
    public static final long f14601d0 = AbstractC1260lo.v(10000);

    /* renamed from: A, reason: collision with root package name */
    public final C1691vE f14602A;

    /* renamed from: B, reason: collision with root package name */
    public final C1170jo f14603B;

    /* renamed from: C, reason: collision with root package name */
    public final long f14604C;

    /* renamed from: D, reason: collision with root package name */
    public final ZE f14605D;

    /* renamed from: E, reason: collision with root package name */
    public final SE f14606E;

    /* renamed from: F, reason: collision with root package name */
    public final C1439pn f14607F;

    /* renamed from: G, reason: collision with root package name */
    public LE f14608G;

    /* renamed from: H, reason: collision with root package name */
    public EE f14609H;

    /* renamed from: I, reason: collision with root package name */
    public T2 f14610I;
    public boolean J;

    /* renamed from: L, reason: collision with root package name */
    public boolean f14611L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f14612M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f14614O;

    /* renamed from: R, reason: collision with root package name */
    public boolean f14617R;

    /* renamed from: S, reason: collision with root package name */
    public int f14618S;

    /* renamed from: T, reason: collision with root package name */
    public C1287mE f14619T;

    /* renamed from: U, reason: collision with root package name */
    public long f14620U;

    /* renamed from: V, reason: collision with root package name */
    public long f14621V;

    /* renamed from: W, reason: collision with root package name */
    public int f14622W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f14623X;

    /* renamed from: Y, reason: collision with root package name */
    public XD f14624Y;

    /* renamed from: a0, reason: collision with root package name */
    public ZD f14626a0;

    /* renamed from: b0, reason: collision with root package name */
    public final Ps f14627b0;

    /* renamed from: c0, reason: collision with root package name */
    public final UD f14628c0;

    /* renamed from: k, reason: collision with root package name */
    public final C0001a[] f14629k;

    /* renamed from: l, reason: collision with root package name */
    public final RF[] f14630l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean[] f14631m;

    /* renamed from: n, reason: collision with root package name */
    public final C1112iH f14632n;

    /* renamed from: o, reason: collision with root package name */
    public final C1245lH f14633o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1422pE f14634p;

    /* renamed from: q, reason: collision with root package name */
    public final C1514rH f14635q;

    /* renamed from: r, reason: collision with root package name */
    public final C1439pn f14636r;

    /* renamed from: s, reason: collision with root package name */
    public final C0901dm f14637s;

    /* renamed from: t, reason: collision with root package name */
    public final Looper f14638t;

    /* renamed from: u, reason: collision with root package name */
    public final C0603Ha f14639u;

    /* renamed from: v, reason: collision with root package name */
    public final C1785xa f14640v;

    /* renamed from: w, reason: collision with root package name */
    public final long f14641w;

    /* renamed from: x, reason: collision with root package name */
    public final Fp f14642x;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f14643y;

    /* renamed from: z, reason: collision with root package name */
    public final Nm f14644z;

    /* renamed from: P, reason: collision with root package name */
    public int f14615P = 0;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f14616Q = false;
    public boolean K = false;

    /* renamed from: Z, reason: collision with root package name */
    public long f14625Z = -9223372036854775807L;

    /* renamed from: N, reason: collision with root package name */
    public long f14613N = -9223372036854775807L;

    public C1332nE(RF[] rfArr, C1112iH c1112iH, C1245lH c1245lH, InterfaceC1422pE interfaceC1422pE, C1514rH c1514rH, SE se, LE le, UD ud, long j5, Looper looper, Nm nm, Ps ps, ZE ze, ZD zd) {
        this.f14627b0 = ps;
        this.f14632n = c1112iH;
        this.f14633o = c1245lH;
        this.f14634p = interfaceC1422pE;
        this.f14635q = c1514rH;
        this.f14608G = le;
        this.f14628c0 = ud;
        this.f14604C = j5;
        this.f14644z = nm;
        this.f14605D = ze;
        this.f14626a0 = zd;
        this.f14606E = se;
        this.f14641w = interfaceC1422pE.d();
        C1291ma c1291ma = AbstractC0715Xa.f12197a;
        EE g5 = EE.g(c1245lH);
        this.f14609H = g5;
        this.f14610I = new T2(g5);
        int length = rfArr.length;
        this.f14630l = new RF[2];
        this.f14631m = new boolean[2];
        c1112iH.getClass();
        this.f14629k = new C0001a[2];
        for (int i = 0; i < 2; i++) {
            RF rf = rfArr[i];
            rf.f11396o = i;
            rf.f11398p = ze;
            rf.f11400q = nm;
            this.f14630l[i] = rf;
            synchronized (rf.f11388k) {
                rf.f11349A = c1112iH;
            }
            C0001a[] c0001aArr = this.f14629k;
            RF rf2 = rfArr[i];
            C0001a c0001a = new C0001a();
            c0001a.f33c = rf2;
            c0001a.f31a = i;
            c0001a.f32b = false;
            c0001aArr[i] = c0001a;
        }
        this.f14642x = new Fp(this);
        this.f14643y = new ArrayList();
        this.f14639u = new C0603Ha();
        this.f14640v = new C1785xa();
        c1112iH.f13930a = this;
        c1112iH.f13931b = c1514rH;
        this.f14623X = true;
        C1439pn a5 = nm.a(looper, null);
        this.f14607F = a5;
        this.f14602A = new C1691vE(se, a5, new Hq(10, this), zd);
        this.f14603B = new C1170jo(this, se, a5, ze);
        C0901dm c0901dm = new C0901dm();
        this.f14637s = c0901dm;
        Looper c5 = c0901dm.c();
        this.f14638t = c5;
        this.f14636r = nm.a(c5, this);
    }

    public static final void J(HE he) {
        synchronized (he) {
        }
        try {
            he.f9338a.c(he.f9339b, he.f9340c);
        } finally {
            he.a(true);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.OG, com.google.android.gms.internal.ads.sG, java.lang.Object] */
    public static final boolean K(C1601tE c1601tE) {
        if (c1601tE != null) {
            try {
                ?? r1 = c1601tE.f15651a;
                if (c1601tE.f15655e) {
                    NG[] ngArr = c1601tE.f15653c;
                    for (int i = 0; i < 2; i++) {
                        NG ng = ngArr[i];
                        if (ng != null) {
                            ng.j();
                        }
                    }
                } else {
                    r1.k();
                }
                if ((!c1601tE.f15655e ? 0L : r1.i()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static int L(C0603Ha c0603Ha, C1785xa c1785xa, int i, boolean z3, Object obj, AbstractC0715Xa abstractC0715Xa, AbstractC0715Xa abstractC0715Xa2) {
        C0603Ha c0603Ha2 = c0603Ha;
        AbstractC0715Xa abstractC0715Xa3 = abstractC0715Xa;
        Object obj2 = abstractC0715Xa3.e(abstractC0715Xa3.n(obj, c1785xa).f16290c, c0603Ha, 0L).f9397a;
        for (int i5 = 0; i5 < abstractC0715Xa2.c(); i5++) {
            if (abstractC0715Xa2.e(i5, c0603Ha, 0L).f9397a.equals(obj2)) {
                return i5;
            }
        }
        int a5 = abstractC0715Xa3.a(obj);
        int b3 = abstractC0715Xa3.b();
        int i6 = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= b3 || i6 != -1) {
                break;
            }
            AbstractC0715Xa abstractC0715Xa4 = abstractC0715Xa3;
            int i8 = abstractC0715Xa4.i(a5, c1785xa, c0603Ha2, i, z3);
            if (i8 == -1) {
                i6 = -1;
                break;
            }
            i6 = abstractC0715Xa2.a(abstractC0715Xa4.f(i8));
            i7++;
            abstractC0715Xa3 = abstractC0715Xa4;
            a5 = i8;
            c0603Ha2 = c0603Ha;
        }
        if (i6 == -1) {
            return -1;
        }
        return abstractC0715Xa2.d(i6, c1785xa, false).f16290c;
    }

    public static Pair R(AbstractC0715Xa abstractC0715Xa, C1287mE c1287mE, int i, boolean z3, C0603Ha c0603Ha, C1785xa c1785xa) {
        AbstractC0715Xa abstractC0715Xa2 = c1287mE.f14487a;
        if (abstractC0715Xa.o()) {
            return null;
        }
        AbstractC0715Xa abstractC0715Xa3 = true == abstractC0715Xa2.o() ? abstractC0715Xa : abstractC0715Xa2;
        try {
            Pair l5 = abstractC0715Xa3.l(c0603Ha, c1785xa, c1287mE.f14488b, c1287mE.f14489c);
            if (!abstractC0715Xa.equals(abstractC0715Xa3)) {
                if (abstractC0715Xa.a(l5.first) == -1) {
                    int L5 = L(c0603Ha, c1785xa, i, z3, l5.first, abstractC0715Xa3, abstractC0715Xa);
                    if (L5 != -1) {
                        return abstractC0715Xa.l(c0603Ha, c1785xa, L5, -9223372036854775807L);
                    }
                    return null;
                }
                if (abstractC0715Xa3.n(l5.first, c1785xa).f16292e && abstractC0715Xa3.e(c1785xa.f16290c, c0603Ha, 0L).f9405k == abstractC0715Xa3.a(l5.first)) {
                    return abstractC0715Xa.l(c0603Ha, c1785xa, abstractC0715Xa.n(l5.first, c1785xa).f16290c, c1287mE.f14489c);
                }
            }
            return l5;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [com.google.android.gms.internal.ads.OG, java.lang.Object] */
    public final void A() {
        C1601tE c1601tE = this.f14602A.f15994j;
        boolean z3 = this.f14614O || (c1601tE != null && c1601tE.f15651a.r());
        EE ee = this.f14609H;
        if (z3 != ee.f8481g) {
            this.f14609H = new EE(ee.f8476a, ee.f8477b, ee.f8478c, ee.f8479d, ee.f8480e, ee.f, z3, ee.f8482h, ee.i, ee.f8483j, ee.f8484k, ee.f8485l, ee.f8486m, ee.f8487n, ee.f8488o, ee.f8489p, ee.f8490q, ee.f8491r, ee.f8492s);
        }
    }

    public final void B(TG tg, C1245lH c1245lH) {
        C1601tE c1601tE = this.f14602A.f15994j;
        c1601tE.getClass();
        long O5 = O(c1601tE.b());
        long j5 = I(this.f14609H.f8476a, c1601tE.f15656g.f15816a) ? this.f14628c0.f11756h : -9223372036854775807L;
        AbstractC0715Xa abstractC0715Xa = this.f14609H.f8476a;
        float f = this.f14642x.i().f12280a;
        boolean z3 = this.f14609H.f8485l;
        this.f14634p.f(new C1377oE(this.f14605D, O5, f, this.f14612M, j5), (InterfaceC1200kH[]) c1245lH.f14378m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v21, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    public final void C() {
        long j5;
        boolean z3;
        char c5;
        long j6;
        long j7;
        long max;
        C1601tE c1601tE = this.f14602A.f15993h;
        if (c1601tE == null) {
            return;
        }
        long j8 = c1601tE.f15655e ? c1601tE.f15651a.j() : -9223372036854775807L;
        if (j8 != -9223372036854775807L) {
            if (!c1601tE.i()) {
                this.f14602A.x(c1601tE);
                e(false);
                i();
            }
            r(j8);
            if (j8 != this.f14609H.f8491r) {
                EE ee = this.f14609H;
                j5 = -9223372036854775807L;
                this.f14609H = a(ee.f8477b, j8, ee.f8478c, j8, true, 5);
            } else {
                j5 = -9223372036854775807L;
            }
        } else {
            j5 = -9223372036854775807L;
            Fp fp = this.f14642x;
            Object[] objArr = c1601tE != this.f14602A.i;
            RF rf = (RF) fp.f9125o;
            NE ne = (NE) fp.f9123m;
            if (rf == null || rf.p() || ((objArr == true && ((RF) fp.f9125o).f11402r != 2) || (!((RF) fp.f9125o).q() && (objArr == true || ((RF) fp.f9125o).m())))) {
                fp.f9121k = true;
                if (fp.f9122l && !ne.f10784k) {
                    ne.f10786m = SystemClock.elapsedRealtime();
                    ne.f10784k = true;
                }
            } else {
                InterfaceC1556sE interfaceC1556sE = (InterfaceC1556sE) fp.f9126p;
                interfaceC1556sE.getClass();
                long a5 = interfaceC1556sE.a();
                if (fp.f9121k) {
                    if (a5 >= ne.a()) {
                        fp.f9121k = false;
                        if (fp.f9122l && !ne.f10784k) {
                            ne.f10786m = SystemClock.elapsedRealtime();
                            ne.f10784k = true;
                        }
                    } else if (ne.f10784k) {
                        ne.c(ne.a());
                        ne.f10784k = false;
                    }
                }
                ne.c(a5);
                Y7 i = interfaceC1556sE.i();
                if (!i.equals(ne.f10787n)) {
                    ne.b(i);
                    ((C1332nE) fp.f9124n).f14636r.a(16, i).a();
                }
            }
            long a6 = fp.a();
            this.f14620U = a6;
            long j9 = a6 - c1601tE.f15664p;
            long j10 = this.f14609H.f8491r;
            if (!this.f14643y.isEmpty() && !this.f14609H.f8477b.b()) {
                if (this.f14623X) {
                    this.f14623X = false;
                }
                EE ee2 = this.f14609H;
                ee2.f8476a.a(ee2.f8477b.f15679a);
                int min = Math.min(this.f14622W, this.f14643y.size());
                if (min > 0 && this.f14643y.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f14643y.size() && this.f14643y.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f14622W = min;
            }
            if (this.f14642x.h()) {
                boolean z5 = !this.f14610I.f11617c;
                EE ee3 = this.f14609H;
                this.f14609H = a(ee3.f8477b, j9, ee3.f8478c, j9, z5, 6);
            } else {
                EE ee4 = this.f14609H;
                ee4.f8491r = j9;
                ee4.f8492s = SystemClock.elapsedRealtime();
            }
        }
        this.f14609H.f8489p = this.f14602A.f15994j.b();
        EE ee5 = this.f14609H;
        ee5.f8490q = O(ee5.f8489p);
        EE ee6 = this.f14609H;
        if (ee6.f8485l && ee6.f8480e == 3 && I(ee6.f8476a, ee6.f8477b)) {
            EE ee7 = this.f14609H;
            float f = 1.0f;
            if (ee7.f8488o.f12280a == 1.0f) {
                UD ud = this.f14628c0;
                long N5 = N(ee7.f8476a, ee7.f8477b.f15679a, ee7.f8491r);
                long j11 = this.f14609H.f8490q;
                if (ud.f11752c != j5) {
                    long j12 = N5 - j11;
                    long j13 = ud.f11758k;
                    if (j13 == j5) {
                        ud.f11758k = j12;
                        ud.f11759l = 0L;
                        c5 = 2;
                        z3 = false;
                    } else {
                        c5 = 2;
                        z3 = false;
                        ud.f11758k = Math.max(j12, (long) ((j12 * 9.999871E-4f) + (j13 * 0.999f)));
                        ud.f11759l = (long) ((Math.abs(j12 - r11) * 9.999871E-4f) + (ud.f11759l * 0.999f));
                    }
                    if (ud.f11757j != j5) {
                        j6 = 1000;
                        if (SystemClock.elapsedRealtime() - ud.f11757j < 1000) {
                            f = ud.i;
                        }
                    } else {
                        j6 = 1000;
                    }
                    ud.f11757j = SystemClock.elapsedRealtime();
                    long j14 = (ud.f11759l * 3) + ud.f11758k;
                    if (ud.f11756h > j14) {
                        long s2 = AbstractC1260lo.s(j6);
                        float f5 = ud.i - 1.0f;
                        long j15 = ud.f11754e;
                        j7 = N5;
                        float f6 = s2;
                        long j16 = ud.f11756h - (((long) (f5 * f6)) + ((long) (0.029999971f * f6)));
                        long[] jArr = new long[3];
                        jArr[z3 ? 1 : 0] = j14;
                        jArr[1] = j15;
                        jArr[c5] = j16;
                        max = jArr[z3 ? 1 : 0];
                        for (int i5 = 1; i5 < 3; i5++) {
                            long j17 = jArr[i5];
                            if (j17 > max) {
                                max = j17;
                            }
                        }
                        ud.f11756h = max;
                    } else {
                        j7 = N5;
                        max = Math.max(ud.f11756h, Math.min(j7 - ((long) (Math.max(0.0f, ud.i - 1.0f) / 1.0E-7f)), j14));
                        ud.f11756h = max;
                        long j18 = ud.f11755g;
                        if (j18 != j5 && max > j18) {
                            ud.f11756h = j18;
                            max = j18;
                        }
                    }
                    long j19 = j7 - max;
                    if (Math.abs(j19) < ud.f11750a) {
                        ud.i = 1.0f;
                        f = 1.0f;
                    } else {
                        f = Math.max(0.97f, Math.min((j19 * 1.0E-7f) + 1.0f, 1.03f));
                        ud.i = f;
                    }
                } else {
                    z3 = false;
                }
                if (this.f14642x.i().f12280a != f) {
                    Y7 y7 = new Y7(f, this.f14609H.f8488o.f12281b);
                    this.f14636r.f15040a.removeMessages(16);
                    this.f14642x.b(y7);
                    boolean z6 = z3;
                    g(this.f14609H.f8488o, this.f14642x.i().f12280a, z6, z6);
                }
            }
        }
    }

    public final void D(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG, AbstractC0715Xa abstractC0715Xa2, C1603tG c1603tG2, long j5, boolean z3) {
        if (!I(abstractC0715Xa, c1603tG)) {
            Y7 y7 = c1603tG.b() ? Y7.f12279d : this.f14609H.f8488o;
            Fp fp = this.f14642x;
            if (fp.i().equals(y7)) {
                return;
            }
            this.f14636r.f15040a.removeMessages(16);
            fp.b(y7);
            g(this.f14609H.f8488o, y7.f12280a, false, false);
            return;
        }
        Object obj = c1603tG.f15679a;
        C1785xa c1785xa = this.f14640v;
        int i = abstractC0715Xa.n(obj, c1785xa).f16290c;
        C0603Ha c0603Ha = this.f14639u;
        abstractC0715Xa.e(i, c0603Ha, 0L);
        C1052h2 c1052h2 = c0603Ha.f9403h;
        int i5 = AbstractC1260lo.f14419a;
        UD ud = this.f14628c0;
        ud.getClass();
        c1052h2.getClass();
        long s2 = AbstractC1260lo.s(-9223372036854775807L);
        ud.f11752c = s2;
        ud.f = s2;
        ud.f11755g = s2;
        ud.c();
        if (j5 != -9223372036854775807L) {
            ud.f11753d = N(abstractC0715Xa, obj, j5);
            ud.c();
            return;
        }
        if (!Objects.equals(!abstractC0715Xa2.o() ? abstractC0715Xa2.e(abstractC0715Xa2.n(c1603tG2.f15679a, c1785xa).f16290c, c0603Ha, 0L).f9397a : null, c0603Ha.f9397a) || z3) {
            ud.f11753d = -9223372036854775807L;
            ud.c();
        }
    }

    public final void E(boolean z3, boolean z5) {
        this.f14612M = z3;
        long j5 = -9223372036854775807L;
        if (z3 && !z5) {
            j5 = SystemClock.elapsedRealtime();
        }
        this.f14613N = j5;
    }

    public final synchronized void F(InterfaceC1805xu interfaceC1805xu, long j5) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j5;
        boolean z3 = false;
        while (!((Boolean) interfaceC1805xu.mo12a()).booleanValue() && j5 > 0) {
            try {
                wait(j5);
            } catch (InterruptedException unused) {
                z3 = true;
            }
            j5 = elapsedRealtime - SystemClock.elapsedRealtime();
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
    }

    public final boolean G() {
        C1601tE c1601tE = this.f14602A.f15993h;
        long j5 = c1601tE.f15656g.f15820e;
        if (c1601tE.f15655e) {
            return j5 == -9223372036854775807L || this.f14609H.f8491r < j5 || !H();
        }
        return false;
    }

    public final boolean H() {
        EE ee = this.f14609H;
        return ee.f8485l && ee.f8487n == 0;
    }

    public final boolean I(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG) {
        if (c1603tG.b() || abstractC0715Xa.o()) {
            return false;
        }
        int i = abstractC0715Xa.n(c1603tG.f15679a, this.f14640v).f16290c;
        C0603Ha c0603Ha = this.f14639u;
        abstractC0715Xa.e(i, c0603Ha, 0L);
        return c0603Ha.b() && c0603Ha.f9402g && c0603Ha.f9400d != -9223372036854775807L;
    }

    public final synchronized boolean M() {
        if (!this.J && this.f14638t.getThread().isAlive()) {
            this.f14636r.c(7);
            F(new Qs(7, this), this.f14604C);
            return this.J;
        }
        return true;
    }

    public final long N(AbstractC0715Xa abstractC0715Xa, Object obj, long j5) {
        int i = abstractC0715Xa.n(obj, this.f14640v).f16290c;
        C0603Ha c0603Ha = this.f14639u;
        abstractC0715Xa.e(i, c0603Ha, 0L);
        if (c0603Ha.f9400d == -9223372036854775807L || !c0603Ha.b() || !c0603Ha.f9402g) {
            return -9223372036854775807L;
        }
        long j6 = c0603Ha.f9401e;
        return AbstractC1260lo.s((j6 == -9223372036854775807L ? System.currentTimeMillis() : j6 + SystemClock.elapsedRealtime()) - c0603Ha.f9400d) - j5;
    }

    public final long O(long j5) {
        C1601tE c1601tE = this.f14602A.f15994j;
        if (c1601tE == null) {
            return 0L;
        }
        return Math.max(0L, j5 - (this.f14620U - c1601tE.f15664p));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    public final long P(C1603tG c1603tG, long j5, boolean z3, boolean z5) {
        long j6;
        long j7;
        C1601tE c1601tE;
        z();
        E(false, true);
        if (z5 || this.f14609H.f8480e == 3) {
            w(2);
        }
        C1691vE c1691vE = this.f14602A;
        C1601tE c1601tE2 = c1691vE.f15993h;
        C1601tE c1601tE3 = c1601tE2;
        while (c1601tE3 != null && !c1603tG.equals(c1601tE3.f15656g.f15816a)) {
            c1601tE3 = c1601tE3.f15661m;
        }
        if (z3 || c1601tE2 != c1601tE3 || (c1601tE3 != null && j5 + c1601tE3.f15664p < 0)) {
            for (int i = 0; i < 2; i++) {
                b(i);
            }
            if (c1601tE3 != null) {
                while (c1691vE.f15993h != c1601tE3) {
                    c1691vE.k();
                }
                c1691vE.x(c1601tE3);
                c1601tE3.f15664p = 1000000000000L;
                c(new boolean[2], c1691vE.i.c());
            }
        }
        if (c1601tE3 != null) {
            c1691vE.x(c1601tE3);
            if (c1601tE3.f15655e) {
                C1601tE c1601tE4 = c1601tE3;
                j7 = j5;
                if (c1601tE4.f) {
                    ?? r1 = c1601tE4.f15651a;
                    j6 = r1.b(j7);
                    r1.e(j6 - this.f14641w);
                    r(j6);
                    i();
                }
            } else {
                C1646uE c1646uE = c1601tE3.f15656g;
                if (j5 == c1646uE.f15817b) {
                    c1601tE = c1601tE3;
                    j7 = j5;
                } else {
                    c1601tE = c1601tE3;
                    j7 = j5;
                    c1646uE = new C1646uE(c1646uE.f15816a, j7, c1646uE.f15818c, c1646uE.f15819d, c1646uE.f15820e, c1646uE.f, c1646uE.f15821g, c1646uE.f15822h);
                }
                c1601tE.f15656g = c1646uE;
            }
            j6 = j7;
            r(j6);
            i();
        } else {
            c1691vE.t();
            r(j5);
            j6 = j5;
        }
        e(false);
        this.f14636r.c(2);
        return j6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        r4.f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Pair Q(AbstractC0715Xa abstractC0715Xa) {
        int i;
        long j5 = 0;
        if (abstractC0715Xa.o()) {
            return Pair.create(EE.f8475t, 0L);
        }
        Pair l5 = abstractC0715Xa.l(this.f14639u, this.f14640v, abstractC0715Xa.g(this.f14616Q), -9223372036854775807L);
        C1603tG s2 = this.f14602A.s(abstractC0715Xa, l5.first);
        long longValue = ((Long) l5.second).longValue();
        if (s2.b()) {
            Object obj = s2.f15679a;
            C1785xa c1785xa = this.f14640v;
            abstractC0715Xa.n(obj, c1785xa);
            C0736a a5 = c1785xa.f.a(-1);
            int i5 = 0;
            while (true) {
                int[] iArr = a5.f12552d;
                if (i5 >= iArr.length || (i = iArr[i5]) == 0 || i == 1) {
                    break;
                }
                i5++;
            }
        } else {
            j5 = longValue;
        }
        return Pair.create(s2, Long.valueOf(j5));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final EE a(C1603tG c1603tG, long j5, long j6, long j7, boolean z3, int i) {
        TG tg;
        C1245lH c1245lH;
        List list;
        C1761wv c1761wv;
        TG tg2;
        C1245lH c1245lH2;
        C1601tE c1601tE;
        int i5;
        this.f14623X = (!this.f14623X && j5 == this.f14609H.f8491r && c1603tG.equals(this.f14609H.f8477b)) ? false : true;
        q();
        EE ee = this.f14609H;
        TG tg3 = ee.f8482h;
        C1245lH c1245lH3 = ee.i;
        List list2 = ee.f8483j;
        if (this.f14603B.f14144k) {
            C1601tE c1601tE2 = this.f14602A.f15993h;
            TG tg4 = c1601tE2 == null ? TG.f11645d : c1601tE2.f15662n;
            C1245lH c1245lH4 = c1601tE2 == null ? this.f14633o : c1601tE2.f15663o;
            InterfaceC1200kH[] interfaceC1200kHArr = (InterfaceC1200kH[]) c1245lH4.f14378m;
            C0909dv c0909dv = new C0909dv(4);
            boolean z5 = false;
            for (InterfaceC1200kH interfaceC1200kH : interfaceC1200kHArr) {
                if (interfaceC1200kH != null) {
                    C5 c5 = interfaceC1200kH.x(0).f14902k;
                    if (c5 == null) {
                        c0909dv.a(new C5(-9223372036854775807L, new InterfaceC1592t5[0]));
                    } else {
                        c0909dv.a(c5);
                        z5 = true;
                    }
                }
            }
            int i6 = 1;
            if (z5) {
                c1761wv = c0909dv.f();
            } else {
                C0954ev c0954ev = AbstractC1044gv.f13676l;
                c1761wv = C1761wv.f16184o;
            }
            C1761wv c1761wv2 = c1761wv;
            if (c1601tE2 != null) {
                C1646uE c1646uE = c1601tE2.f15656g;
                long j8 = c1646uE.f15818c;
                if (j8 != j6) {
                    if (j6 == j8) {
                        tg2 = tg4;
                        c1245lH2 = c1245lH4;
                    } else {
                        tg2 = tg4;
                        c1245lH2 = c1245lH4;
                        c1646uE = new C1646uE(c1646uE.f15816a, c1646uE.f15817b, j6, c1646uE.f15819d, c1646uE.f15820e, c1646uE.f, c1646uE.f15821g, c1646uE.f15822h);
                    }
                    c1601tE2.f15656g = c1646uE;
                    c1601tE = this.f14602A.f15993h;
                    if (c1601tE != null) {
                        C1245lH c1245lH5 = c1601tE.f15663o;
                        int i7 = 0;
                        while (i7 < 2) {
                            if (c1245lH5.e(i7)) {
                                i5 = i6;
                                if (((RF) this.f14629k[i7].f33c).f11390l != i5) {
                                    break;
                                }
                                ((KE[]) c1245lH5.f14377l)[i7].getClass();
                            } else {
                                i5 = i6;
                            }
                            i7 += i5;
                            i6 = i5;
                        }
                    }
                    list = c1761wv2;
                    tg = tg2;
                    c1245lH = c1245lH2;
                }
            }
            tg2 = tg4;
            c1245lH2 = c1245lH4;
            c1601tE = this.f14602A.f15993h;
            if (c1601tE != null) {
            }
            list = c1761wv2;
            tg = tg2;
            c1245lH = c1245lH2;
        } else {
            if (!c1603tG.equals(ee.f8477b)) {
                c1245lH3 = this.f14633o;
                tg3 = TG.f11645d;
                list2 = C1761wv.f16184o;
            }
            tg = tg3;
            c1245lH = c1245lH3;
            list = list2;
        }
        if (z3) {
            T2 t22 = this.f14610I;
            if (!t22.f11617c || t22.f11618d == 5) {
                t22.f11615a = true;
                t22.f11617c = true;
                t22.f11618d = i;
            } else {
                AbstractC1668us.S(i == 5);
            }
        }
        EE ee2 = this.f14609H;
        return ee2.b(c1603tG, j5, j6, j7, O(ee2.f8489p), tg, c1245lH, list);
    }

    public final void b(int i) {
        C0001a[] c0001aArr = this.f14629k;
        int a5 = c0001aArr[i].a();
        RF rf = (RF) c0001aArr[i].f33c;
        if (C0001a.l(rf)) {
            Fp fp = this.f14642x;
            if (rf == ((RF) fp.f9125o)) {
                fp.f9126p = null;
                fp.f9125o = null;
                fp.f9121k = true;
            }
            int i5 = rf.f11402r;
            if (i5 == 2) {
                AbstractC1668us.a0(i5 == 2);
                rf.f11402r = 1;
                rf.g();
            }
            AbstractC1668us.a0(rf.f11402r == 1);
            C1667ur c1667ur = rf.f11392m;
            c1667ur.f15915m = null;
            c1667ur.f15914l = null;
            rf.f11402r = 0;
            rf.f11404s = null;
            rf.f11406t = null;
            rf.f11414x = false;
            rf.j0();
        }
        m(i, false);
        this.f14618S -= a5;
    }

    public final void c(boolean[] zArr, long j5) {
        int i;
        C0001a[] c0001aArr;
        int i5;
        int i6;
        InterfaceC1556sE interfaceC1556sE;
        C1691vE c1691vE = this.f14602A;
        C1601tE c1601tE = c1691vE.i;
        C1245lH c1245lH = c1601tE.f15663o;
        int i7 = 0;
        while (true) {
            i = 2;
            c0001aArr = this.f14629k;
            if (i7 >= 2) {
                break;
            }
            if (!c1245lH.e(i7)) {
                c0001aArr[i7].f();
            }
            i7++;
        }
        int i8 = 0;
        while (i8 < i) {
            if (c1245lH.e(i8)) {
                boolean z3 = zArr[i8];
                C1601tE c1601tE2 = c1691vE.i;
                C0001a c0001a = c0001aArr[i8];
                if (c0001a.a() <= 0) {
                    boolean z5 = c1601tE2 == c1691vE.f15993h;
                    C1245lH c1245lH2 = c1601tE2.f15663o;
                    KE ke = ((KE[]) c1245lH2.f14377l)[i8];
                    InterfaceC1200kH interfaceC1200kH = ((InterfaceC1200kH[]) c1245lH2.f14378m)[i8];
                    int j6 = interfaceC1200kH != null ? interfaceC1200kH.j() : 0;
                    C1407p[] c1407pArr = new C1407p[j6];
                    for (int i9 = 0; i9 < j6; i9++) {
                        c1407pArr[i9] = interfaceC1200kH.x(i9);
                    }
                    boolean z6 = H() && this.f14609H.f8480e == 3;
                    boolean z7 = !z3 && z6;
                    this.f14618S++;
                    NG ng = c1601tE2.f15653c[i8];
                    boolean z8 = z6;
                    long j7 = c1601tE2.f15664p;
                    C1646uE c1646uE = c1601tE2.f15656g;
                    c0001a.f32b = true;
                    RF rf = (RF) c0001a.f33c;
                    AbstractC1668us.a0(rf.f11402r == 0);
                    rf.f11394n = ke;
                    rf.f11402r = 1;
                    rf.k0(z7, z5);
                    boolean z9 = z5;
                    rf.k(c1407pArr, ng, j5, j7, c1646uE.f15816a);
                    rf.f11414x = false;
                    rf.f11410v = j5;
                    rf.f11412w = j5;
                    rf.l0(j5, z7);
                    Fp fp = this.f14642x;
                    fp.getClass();
                    InterfaceC1556sE f02 = rf.f0();
                    if (f02 != null && f02 != (interfaceC1556sE = (InterfaceC1556sE) fp.f9126p)) {
                        if (interfaceC1556sE != null) {
                            throw new XD(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        fp.f9126p = f02;
                        fp.f9125o = rf;
                        ((C1602tF) f02).b(((NE) fp.f9123m).f10787n);
                    }
                    rf.c(11, new C1152jE());
                    if (z8 && z9 && (i6 = rf.f11402r) == 1) {
                        AbstractC1668us.a0(i6 == 1);
                        i5 = 2;
                        rf.f11402r = 2;
                        rf.f();
                    } else {
                        i5 = 2;
                    }
                    i8++;
                    i = i5;
                }
            }
            i5 = i;
            i8++;
            i = i5;
        }
        c1601tE.f15657h = true;
    }

    public final void d(int i, IOException iOException) {
        XD xd = new XD(0, iOException, i);
        C1601tE c1601tE = this.f14602A.f15993h;
        if (c1601tE != null) {
            xd = xd.a(c1601tE.f15656g.f15816a);
        }
        JB.g("ExoPlayerImplInternal", "Playback error", xd);
        y(false, false);
        this.f14609H = this.f14609H.d(xd);
    }

    public final void e(boolean z3) {
        C1601tE c1601tE = this.f14602A.f15994j;
        C1603tG c1603tG = c1601tE == null ? this.f14609H.f8477b : c1601tE.f15656g.f15816a;
        boolean equals = this.f14609H.f8484k.equals(c1603tG);
        if (!equals) {
            this.f14609H = this.f14609H.a(c1603tG);
        }
        EE ee = this.f14609H;
        ee.f8489p = c1601tE == null ? ee.f8491r : c1601tE.b();
        EE ee2 = this.f14609H;
        ee2.f8490q = O(ee2.f8489p);
        if ((!equals || z3) && c1601tE != null && c1601tE.f15655e) {
            B(c1601tE.f15662n, c1601tE.f15663o);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x0210, code lost:
    
        r4.f.getClass();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x035b  */
    /* JADX WARN: Type inference failed for: r2v47, types: [com.google.android.gms.internal.ads.vE] */
    /* JADX WARN: Type inference failed for: r4v44 */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v57 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31, types: [int] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v37, types: [com.google.android.gms.internal.ads.Xa] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(AbstractC0715Xa abstractC0715Xa, boolean z3) {
        long j5;
        boolean z5;
        C1603tG c1603tG;
        C1785xa c1785xa;
        boolean z6;
        long j6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j7;
        int i;
        int i5;
        Object obj;
        int i6;
        boolean z10;
        AbstractC0715Xa abstractC0715Xa2;
        long j8;
        C1785xa c1785xa2;
        Object obj2;
        long j9;
        C1603tG s2;
        boolean z11;
        long j10;
        boolean z12;
        boolean z13;
        long j11;
        boolean z14;
        int i7;
        int i8;
        boolean z15;
        boolean z16;
        boolean z17;
        int i9;
        int i10;
        int i11;
        long j12;
        C1287mE c1287mE;
        AbstractC0715Xa abstractC0715Xa3;
        int i12;
        C1603tG c1603tG2;
        Object obj3;
        int i13;
        boolean z18;
        long j13;
        int i14;
        int i15;
        AbstractC0715Xa abstractC0715Xa4;
        AbstractC0715Xa abstractC0715Xa5;
        long j14;
        long j15;
        int i16;
        Object obj4;
        long j16;
        AbstractC0715Xa abstractC0715Xa6;
        C1603tG c1603tG3;
        long j17;
        int i17;
        EE ee = this.f14609H;
        C1287mE c1287mE2 = this.f14619T;
        int i18 = this.f14615P;
        boolean z19 = this.f14616Q;
        if (abstractC0715Xa.o()) {
            abstractC0715Xa2 = abstractC0715Xa;
            s2 = EE.f8475t;
            z12 = true;
            z14 = false;
            z13 = false;
            j11 = 0;
            j10 = -9223372036854775807L;
            z6 = false;
            j5 = -9223372036854775807L;
        } else {
            C1785xa c1785xa3 = this.f14640v;
            C1603tG c1603tG4 = ee.f8477b;
            Object obj5 = c1603tG4.f15679a;
            AbstractC0715Xa abstractC0715Xa7 = ee.f8476a;
            if (abstractC0715Xa7.o()) {
                j5 = -9223372036854775807L;
            } else {
                j5 = -9223372036854775807L;
                if (!abstractC0715Xa7.n(c1603tG4.f15679a, c1785xa3).f16292e) {
                    z5 = false;
                    long j18 = (!ee.f8477b.b() || z5) ? ee.f8478c : ee.f8491r;
                    Object obj6 = obj5;
                    C0603Ha c0603Ha = this.f14639u;
                    if (c1287mE2 == null) {
                        c1603tG = c1603tG4;
                        Pair R4 = R(abstractC0715Xa, c1287mE2, i18, z19, c0603Ha, c1785xa3);
                        if (R4 == null) {
                            i8 = abstractC0715Xa.g(z19);
                            j7 = j18;
                            z15 = false;
                            z16 = false;
                            z17 = true;
                        } else {
                            if (c1287mE2.f14489c == j5) {
                                i8 = abstractC0715Xa.n(R4.first, c1785xa3).f16290c;
                                j7 = j18;
                                z15 = false;
                            } else {
                                Object obj7 = R4.first;
                                j7 = ((Long) R4.second).longValue();
                                obj6 = obj7;
                                i8 = -1;
                                z15 = true;
                            }
                            z16 = ee.f8480e == 4;
                            z17 = false;
                        }
                        z7 = z17;
                        j6 = j18;
                        i = i8;
                        c1785xa = c1785xa3;
                        z9 = z15;
                        z8 = z16;
                        i5 = -1;
                        z6 = false;
                    } else {
                        c1603tG = c1603tG4;
                        if (ee.f8476a.o()) {
                            i = abstractC0715Xa.g(z19);
                            c1785xa = c1785xa3;
                            j7 = j18;
                            j6 = j7;
                            i5 = -1;
                            z7 = false;
                            z6 = false;
                            z8 = false;
                            z9 = false;
                        } else if (abstractC0715Xa.a(obj6) == -1) {
                            c1785xa = c1785xa3;
                            z6 = false;
                            int L5 = L(c0603Ha, c1785xa, i18, z19, obj6, ee.f8476a, abstractC0715Xa);
                            c0603Ha = c0603Ha;
                            obj6 = obj6;
                            if (L5 == -1) {
                                i6 = abstractC0715Xa.g(z19);
                                z10 = true;
                            } else {
                                i6 = L5;
                                z10 = false;
                            }
                            i = i6;
                            j6 = j18;
                            z8 = false;
                            z9 = false;
                            i5 = -1;
                            z7 = z10;
                            j7 = j6;
                        } else {
                            c1785xa = c1785xa3;
                            z6 = false;
                            if (j18 == j5) {
                                i = abstractC0715Xa.n(obj6, c1785xa).f16290c;
                                j7 = j18;
                                j6 = j7;
                                z7 = false;
                                z8 = false;
                                z9 = false;
                                i5 = -1;
                            } else if (z5) {
                                ee.f8476a.n(c1603tG.f15679a, c1785xa);
                                j6 = j18;
                                if (ee.f8476a.e(c1785xa.f16290c, c0603Ha, 0L).f9405k == ee.f8476a.a(c1603tG.f15679a)) {
                                    Pair l5 = abstractC0715Xa.l(c0603Ha, c1785xa, abstractC0715Xa.n(obj6, c1785xa).f16290c, j6);
                                    c0603Ha = c0603Ha;
                                    c1785xa = c1785xa;
                                    obj = l5.first;
                                    j7 = ((Long) l5.second).longValue();
                                } else {
                                    obj = obj6;
                                    j7 = j6;
                                }
                                obj6 = obj;
                                z7 = false;
                                z8 = false;
                                i = -1;
                                i5 = -1;
                                z9 = true;
                            } else {
                                j6 = j18;
                                z7 = false;
                                z8 = false;
                                z9 = false;
                                j7 = j6;
                                i = -1;
                                i5 = -1;
                            }
                        }
                    }
                    if (i == i5) {
                        c1785xa2 = c1785xa;
                        int i19 = i;
                        abstractC0715Xa2 = abstractC0715Xa;
                        Pair l6 = abstractC0715Xa2.l(c0603Ha, c1785xa2, i19, -9223372036854775807L);
                        Object obj8 = l6.first;
                        j8 = ((Long) l6.second).longValue();
                        obj2 = obj8;
                        j9 = j5;
                    } else {
                        abstractC0715Xa2 = abstractC0715Xa;
                        j8 = j7;
                        c1785xa2 = c1785xa;
                        obj2 = obj6;
                        j9 = j8;
                    }
                    s2 = this.f14602A.s(abstractC0715Xa2, obj2);
                    z11 = (c1603tG.f15679a.equals(obj2) || c1603tG.b() || s2.b()) ? z6 : true;
                    C1785xa n5 = abstractC0715Xa2.n(obj2, c1785xa2);
                    if (!z5 && j6 == j9 && c1603tG.f15679a.equals(s2.f15679a)) {
                        if (c1603tG.b()) {
                            n5.c(c1603tG.f15680b);
                        }
                        if (s2.b()) {
                            n5.c(-1);
                        }
                    }
                    if (true == z11) {
                        s2 = c1603tG;
                    }
                    if (s2.b()) {
                        if (s2.equals(c1603tG)) {
                            j8 = ee.f8491r;
                        } else {
                            abstractC0715Xa2.n(s2.f15679a, c1785xa2);
                            int i20 = s2.f15681c;
                            C0736a a5 = c1785xa2.f.a(s2.f15680b);
                            ?? r5 = z6;
                            while (true) {
                                int[] iArr = a5.f12552d;
                                if (r5 >= iArr.length || (i7 = iArr[r5]) == 0 || i7 == 1) {
                                    break;
                                } else {
                                    r5++;
                                }
                            }
                            j8 = 0;
                        }
                    }
                    j10 = j9;
                    z12 = z7;
                    z13 = z9;
                    j11 = j8;
                    z14 = z8;
                }
            }
            z5 = true;
            if (ee.f8477b.b()) {
            }
            Object obj62 = obj5;
            C0603Ha c0603Ha2 = this.f14639u;
            if (c1287mE2 == null) {
            }
            if (i == i5) {
            }
            s2 = this.f14602A.s(abstractC0715Xa2, obj2);
            if (c1603tG.f15679a.equals(obj2)) {
            }
            C1785xa n52 = abstractC0715Xa2.n(obj2, c1785xa2);
            if (!z5) {
                if (c1603tG.b()) {
                }
                if (s2.b()) {
                }
            }
            if (true == z11) {
            }
            if (s2.b()) {
            }
            j10 = j9;
            z12 = z7;
            z13 = z9;
            j11 = j8;
            z14 = z8;
        }
        boolean z20 = (this.f14609H.f8477b.equals(s2) && j11 == this.f14609H.f8491r) ? z6 : true;
        if (z12) {
            try {
                if (this.f14609H.f8480e != 1) {
                    i9 = 4;
                    i10 = 4;
                    try {
                        w(4);
                    } catch (Throwable th) {
                        th = th;
                        i11 = i9;
                        j12 = j10;
                        c1287mE = null;
                        abstractC0715Xa3 = abstractC0715Xa2;
                        c1603tG2 = s2;
                        i12 = 2;
                        EE ee2 = this.f14609H;
                        AbstractC0715Xa abstractC0715Xa8 = ee2.f8476a;
                        C1603tG c1603tG5 = ee2.f8477b;
                        C1603tG c1603tG6 = c1603tG2;
                        D(abstractC0715Xa3, c1603tG6, abstractC0715Xa8, c1603tG5, true != z13 ? j5 : j11, false);
                        if (z20 && j12 == this.f14609H.f8478c) {
                            i15 = i12;
                        } else {
                            EE ee3 = this.f14609H;
                            obj3 = ee3.f8477b.f15679a;
                            AbstractC0715Xa abstractC0715Xa9 = ee3.f8476a;
                            if (z20 || !z3 || abstractC0715Xa9.o() || abstractC0715Xa9.n(obj3, this.f14640v).f16292e) {
                                i13 = i12;
                                z18 = z6;
                            } else {
                                i13 = i12;
                                z18 = true;
                            }
                            long j19 = this.f14609H.f8479d;
                            if (abstractC0715Xa3.a(obj3) == -1) {
                                j13 = j11;
                                i14 = i11;
                            } else {
                                j13 = j11;
                                i14 = 3;
                            }
                            i15 = i13;
                            this.f14609H = a(c1603tG6, j13, j12, j19, z18, i14);
                        }
                        q();
                        s(abstractC0715Xa3, this.f14609H.f8476a);
                        this.f14609H = this.f14609H.f(abstractC0715Xa3);
                        if (!abstractC0715Xa3.o()) {
                            this.f14619T = c1287mE;
                        }
                        e(z6);
                        this.f14636r.c(i15);
                        throw th;
                    }
                } else {
                    i10 = 4;
                }
                p(z6, z6, z6, true);
                i9 = i10;
            } catch (Throwable th2) {
                th = th2;
                i9 = 4;
                i11 = i9;
                j12 = j10;
                c1287mE = null;
                abstractC0715Xa3 = abstractC0715Xa2;
                c1603tG2 = s2;
                i12 = 2;
                EE ee22 = this.f14609H;
                AbstractC0715Xa abstractC0715Xa82 = ee22.f8476a;
                C1603tG c1603tG52 = ee22.f8477b;
                C1603tG c1603tG62 = c1603tG2;
                D(abstractC0715Xa3, c1603tG62, abstractC0715Xa82, c1603tG52, true != z13 ? j5 : j11, false);
                if (z20) {
                }
                EE ee32 = this.f14609H;
                obj3 = ee32.f8477b.f15679a;
                AbstractC0715Xa abstractC0715Xa92 = ee32.f8476a;
                if (z20) {
                }
                i13 = i12;
                z18 = z6;
                long j192 = this.f14609H.f8479d;
                if (abstractC0715Xa3.a(obj3) == -1) {
                }
                i15 = i13;
                this.f14609H = a(c1603tG62, j13, j12, j192, z18, i14);
                q();
                s(abstractC0715Xa3, this.f14609H.f8476a);
                this.f14609H = this.f14609H.f(abstractC0715Xa3);
                if (!abstractC0715Xa3.o()) {
                }
                e(z6);
                this.f14636r.c(i15);
                throw th;
            }
        } else {
            i9 = 4;
        }
        C0001a[] c0001aArr = this.f14629k;
        ?? r7 = i9;
        for (?? r52 = z6; r52 < 2; r52++) {
            try {
                RF rf = (RF) c0001aArr[r52].f33c;
                if (!Objects.equals(rf.f11418z, abstractC0715Xa2)) {
                    rf.f11418z = abstractC0715Xa2;
                }
                r7 = 4;
            } catch (Throwable th3) {
                th = th3;
                j12 = j10;
                c1287mE = null;
                i11 = 4;
                abstractC0715Xa3 = abstractC0715Xa2;
                c1603tG2 = s2;
                i12 = 2;
                EE ee222 = this.f14609H;
                AbstractC0715Xa abstractC0715Xa822 = ee222.f8476a;
                C1603tG c1603tG522 = ee222.f8477b;
                C1603tG c1603tG622 = c1603tG2;
                D(abstractC0715Xa3, c1603tG622, abstractC0715Xa822, c1603tG522, true != z13 ? j5 : j11, false);
                if (z20) {
                }
                EE ee322 = this.f14609H;
                obj3 = ee322.f8477b.f15679a;
                AbstractC0715Xa abstractC0715Xa922 = ee322.f8476a;
                if (z20) {
                }
                i13 = i12;
                z18 = z6;
                long j1922 = this.f14609H.f8479d;
                if (abstractC0715Xa3.a(obj3) == -1) {
                }
                i15 = i13;
                this.f14609H = a(c1603tG622, j13, j12, j1922, z18, i14);
                q();
                s(abstractC0715Xa3, this.f14609H.f8476a);
                this.f14609H = this.f14609H.f(abstractC0715Xa3);
                if (!abstractC0715Xa3.o()) {
                }
                e(z6);
                this.f14636r.c(i15);
                throw th;
            }
        }
        try {
            if (z20) {
                r7 = abstractC0715Xa2;
                i11 = 4;
                if (!r7.o()) {
                    try {
                        for (C1601tE c1601tE = this.f14602A.f15993h; c1601tE != null; c1601tE = c1601tE.f15661m) {
                            if (c1601tE.f15656g.f15816a.equals(s2)) {
                                C1646uE r6 = this.f14602A.r(r7, c1601tE.f15656g);
                                c1601tE.f15656g = r6;
                                Object obj9 = c1601tE.f15651a;
                                if (obj9 instanceof C0798bG) {
                                    long j20 = r6.f15819d;
                                    if (j20 == j5) {
                                        j20 = Long.MIN_VALUE;
                                    }
                                    ((C0798bG) obj9).f12800o = j20;
                                }
                            }
                        }
                        C1691vE c1691vE = this.f14602A;
                        c1603tG2 = s2;
                        long j21 = j11;
                        try {
                            j11 = P(c1603tG2, j21, c1691vE.f15993h != c1691vE.i ? true : z6, z14);
                            EE ee4 = this.f14609H;
                            C1603tG c1603tG7 = c1603tG2;
                            D(abstractC0715Xa, c1603tG7, ee4.f8476a, ee4.f8477b, true == z13 ? j5 : j11, false);
                            if (z20 && j10 == this.f14609H.f8478c) {
                                abstractC0715Xa6 = abstractC0715Xa;
                            } else {
                                EE ee5 = this.f14609H;
                                obj4 = ee5.f8477b.f15679a;
                                AbstractC0715Xa abstractC0715Xa10 = ee5.f8476a;
                                boolean z21 = (z20 || !z3 || abstractC0715Xa10.o() || abstractC0715Xa10.n(obj4, this.f14640v).f16292e) ? z6 : true;
                                long j22 = this.f14609H.f8479d;
                                if (abstractC0715Xa.a(obj4) != -1) {
                                    j16 = j10;
                                    abstractC0715Xa6 = abstractC0715Xa;
                                    c1603tG3 = c1603tG7;
                                    j17 = j11;
                                    i17 = i11;
                                } else {
                                    j16 = j10;
                                    abstractC0715Xa6 = abstractC0715Xa;
                                    c1603tG3 = c1603tG7;
                                    j17 = j11;
                                    i17 = 3;
                                }
                                this.f14609H = a(c1603tG3, j17, j16, j22, z21, i17);
                            }
                            q();
                            s(abstractC0715Xa6, this.f14609H.f8476a);
                            this.f14609H = this.f14609H.f(abstractC0715Xa6);
                            if (!abstractC0715Xa6.o()) {
                                this.f14619T = null;
                            }
                            e(z6);
                            this.f14636r.c(2);
                        } catch (Throwable th4) {
                            th = th4;
                            j11 = j21;
                            abstractC0715Xa4 = r7;
                            j12 = j10;
                            i12 = 2;
                            c1287mE = null;
                            abstractC0715Xa3 = abstractC0715Xa4;
                            EE ee2222 = this.f14609H;
                            AbstractC0715Xa abstractC0715Xa8222 = ee2222.f8476a;
                            C1603tG c1603tG5222 = ee2222.f8477b;
                            C1603tG c1603tG6222 = c1603tG2;
                            D(abstractC0715Xa3, c1603tG6222, abstractC0715Xa8222, c1603tG5222, true != z13 ? j5 : j11, false);
                            if (z20) {
                            }
                            EE ee3222 = this.f14609H;
                            obj3 = ee3222.f8477b.f15679a;
                            AbstractC0715Xa abstractC0715Xa9222 = ee3222.f8476a;
                            if (z20) {
                            }
                            i13 = i12;
                            z18 = z6;
                            long j19222 = this.f14609H.f8479d;
                            if (abstractC0715Xa3.a(obj3) == -1) {
                            }
                            i15 = i13;
                            this.f14609H = a(c1603tG6222, j13, j12, j19222, z18, i14);
                            q();
                            s(abstractC0715Xa3, this.f14609H.f8476a);
                            this.f14609H = this.f14609H.f(abstractC0715Xa3);
                            if (!abstractC0715Xa3.o()) {
                            }
                            e(z6);
                            this.f14636r.c(i15);
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        c1603tG2 = s2;
                        abstractC0715Xa4 = r7;
                        j12 = j10;
                        i12 = 2;
                        c1287mE = null;
                        abstractC0715Xa3 = abstractC0715Xa4;
                        EE ee22222 = this.f14609H;
                        AbstractC0715Xa abstractC0715Xa82222 = ee22222.f8476a;
                        C1603tG c1603tG52222 = ee22222.f8477b;
                        C1603tG c1603tG62222 = c1603tG2;
                        D(abstractC0715Xa3, c1603tG62222, abstractC0715Xa82222, c1603tG52222, true != z13 ? j5 : j11, false);
                        if (z20) {
                        }
                        EE ee32222 = this.f14609H;
                        obj3 = ee32222.f8477b.f15679a;
                        AbstractC0715Xa abstractC0715Xa92222 = ee32222.f8476a;
                        if (z20) {
                        }
                        i13 = i12;
                        z18 = z6;
                        long j192222 = this.f14609H.f8479d;
                        if (abstractC0715Xa3.a(obj3) == -1) {
                        }
                        i15 = i13;
                        this.f14609H = a(c1603tG62222, j13, j12, j192222, z18, i14);
                        q();
                        s(abstractC0715Xa3, this.f14609H.f8476a);
                        this.f14609H = this.f14609H.f(abstractC0715Xa3);
                        if (!abstractC0715Xa3.o()) {
                        }
                        e(z6);
                        this.f14636r.c(i15);
                        throw th;
                    }
                }
            } else {
                try {
                    C1691vE c1691vE2 = this.f14602A;
                    long j23 = this.f14620U;
                    C1601tE c1601tE2 = c1691vE2.i;
                    if (c1601tE2 == null) {
                        abstractC0715Xa5 = abstractC0715Xa;
                        j15 = j23;
                        j14 = 0;
                    } else {
                        long j24 = c1601tE2.f15664p;
                        if (c1601tE2.f15655e) {
                            long j25 = j24;
                            ?? r42 = z6;
                            while (true) {
                                try {
                                    C0001a[] c0001aArr2 = this.f14629k;
                                    if (r42 >= 2) {
                                        abstractC0715Xa5 = abstractC0715Xa;
                                        j14 = j25;
                                        break;
                                    }
                                    if (c0001aArr2[r42].k(c1601tE2)) {
                                        C0001a c0001a = this.f14629k[r42];
                                        AbstractC1668us.a0(c0001a.k(c1601tE2));
                                        i16 = r42;
                                        long j26 = ((RF) c0001a.f33c).f11412w;
                                        if (j26 == Long.MIN_VALUE) {
                                            abstractC0715Xa5 = abstractC0715Xa;
                                            j14 = Long.MIN_VALUE;
                                            break;
                                        }
                                        j25 = Math.max(j26, j25);
                                    } else {
                                        i16 = r42;
                                    }
                                    r42 = i16 + 1;
                                } catch (Throwable th6) {
                                    th = th6;
                                    c1603tG2 = s2;
                                    j12 = j10;
                                    i12 = 2;
                                    c1287mE = null;
                                    i11 = 4;
                                    abstractC0715Xa3 = abstractC0715Xa;
                                    EE ee222222 = this.f14609H;
                                    AbstractC0715Xa abstractC0715Xa822222 = ee222222.f8476a;
                                    C1603tG c1603tG522222 = ee222222.f8477b;
                                    C1603tG c1603tG622222 = c1603tG2;
                                    D(abstractC0715Xa3, c1603tG622222, abstractC0715Xa822222, c1603tG522222, true != z13 ? j5 : j11, false);
                                    if (z20) {
                                    }
                                    EE ee322222 = this.f14609H;
                                    obj3 = ee322222.f8477b.f15679a;
                                    AbstractC0715Xa abstractC0715Xa922222 = ee322222.f8476a;
                                    if (z20) {
                                    }
                                    i13 = i12;
                                    z18 = z6;
                                    long j1922222 = this.f14609H.f8479d;
                                    if (abstractC0715Xa3.a(obj3) == -1) {
                                    }
                                    i15 = i13;
                                    this.f14609H = a(c1603tG622222, j13, j12, j1922222, z18, i14);
                                    q();
                                    s(abstractC0715Xa3, this.f14609H.f8476a);
                                    this.f14609H = this.f14609H.f(abstractC0715Xa3);
                                    if (!abstractC0715Xa3.o()) {
                                    }
                                    e(z6);
                                    this.f14636r.c(i15);
                                    throw th;
                                }
                            }
                        } else {
                            abstractC0715Xa5 = abstractC0715Xa;
                            j14 = j24;
                        }
                        j15 = j23;
                    }
                    i11 = 4;
                    try {
                        if (!c1691vE2.z(abstractC0715Xa5, j15, j14)) {
                            u(z6);
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        r7 = abstractC0715Xa5;
                        c1603tG2 = s2;
                        abstractC0715Xa4 = r7;
                        j12 = j10;
                        i12 = 2;
                        c1287mE = null;
                        abstractC0715Xa3 = abstractC0715Xa4;
                        EE ee2222222 = this.f14609H;
                        AbstractC0715Xa abstractC0715Xa8222222 = ee2222222.f8476a;
                        C1603tG c1603tG5222222 = ee2222222.f8477b;
                        C1603tG c1603tG6222222 = c1603tG2;
                        D(abstractC0715Xa3, c1603tG6222222, abstractC0715Xa8222222, c1603tG5222222, true != z13 ? j5 : j11, false);
                        if (z20) {
                        }
                        EE ee3222222 = this.f14609H;
                        obj3 = ee3222222.f8477b.f15679a;
                        AbstractC0715Xa abstractC0715Xa9222222 = ee3222222.f8476a;
                        if (z20) {
                        }
                        i13 = i12;
                        z18 = z6;
                        long j19222222 = this.f14609H.f8479d;
                        if (abstractC0715Xa3.a(obj3) == -1) {
                        }
                        i15 = i13;
                        this.f14609H = a(c1603tG6222222, j13, j12, j19222222, z18, i14);
                        q();
                        s(abstractC0715Xa3, this.f14609H.f8476a);
                        this.f14609H = this.f14609H.f(abstractC0715Xa3);
                        if (!abstractC0715Xa3.o()) {
                        }
                        e(z6);
                        this.f14636r.c(i15);
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    r7 = abstractC0715Xa;
                    i11 = 4;
                }
            }
            c1603tG2 = s2;
            EE ee42 = this.f14609H;
            C1603tG c1603tG72 = c1603tG2;
            D(abstractC0715Xa, c1603tG72, ee42.f8476a, ee42.f8477b, true == z13 ? j5 : j11, false);
            if (z20) {
            }
            EE ee52 = this.f14609H;
            obj4 = ee52.f8477b.f15679a;
            AbstractC0715Xa abstractC0715Xa102 = ee52.f8476a;
            if (z20) {
            }
            long j222 = this.f14609H.f8479d;
            if (abstractC0715Xa.a(obj4) != -1) {
            }
            this.f14609H = a(c1603tG3, j17, j16, j222, z21, i17);
            q();
            s(abstractC0715Xa6, this.f14609H.f8476a);
            this.f14609H = this.f14609H.f(abstractC0715Xa6);
            if (!abstractC0715Xa6.o()) {
            }
            e(z6);
            this.f14636r.c(2);
        } catch (Throwable th9) {
            th = th9;
        }
    }

    public final void g(Y7 y7, float f, boolean z3, boolean z5) {
        Y7 y72;
        int i;
        if (z3) {
            if (z5) {
                this.f14610I.a(1);
            }
            EE ee = this.f14609H;
            EE ee2 = new EE(ee.f8476a, ee.f8477b, ee.f8478c, ee.f8479d, ee.f8480e, ee.f, ee.f8481g, ee.f8482h, ee.i, ee.f8483j, ee.f8484k, ee.f8485l, ee.f8486m, ee.f8487n, y7, ee.f8489p, ee.f8490q, ee.f8491r, ee.f8492s);
            y72 = y7;
            this.f14609H = ee2;
        } else {
            y72 = y7;
        }
        float f5 = y72.f12280a;
        C1601tE c1601tE = this.f14602A.f15993h;
        while (true) {
            i = 0;
            if (c1601tE == null) {
                break;
            }
            InterfaceC1200kH[] interfaceC1200kHArr = (InterfaceC1200kH[]) c1601tE.f15663o.f14378m;
            int length = interfaceC1200kHArr.length;
            while (i < length) {
                InterfaceC1200kH interfaceC1200kH = interfaceC1200kHArr[i];
                i++;
            }
            c1601tE = c1601tE.f15661m;
        }
        C0001a[] c0001aArr = this.f14629k;
        while (i < 2) {
            C0001a c0001a = c0001aArr[i];
            ((RF) c0001a.f33c).l(f, y72.f12280a);
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final /* bridge */ /* synthetic */ void h(OG og) {
        this.f14636r.a(9, (InterfaceC1558sG) og).a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:324:0x0988, code lost:
    
        if (r3 != false) goto L527;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x09c6, code lost:
    
        if (r4 == false) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x042a, code lost:
    
        r1.f14640v.f.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0714 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, xv -> 0x0030, B7 -> 0x0033, xF -> 0x0036, XD -> 0x0039, TryCatch #8 {RuntimeException -> 0x002a, blocks: (B:3:0x0008, B:4:0x000f, B:7:0x0013, B:9:0x0022, B:12:0x003e, B:19:0x004b, B:23:0x004c, B:26:0x0066, B:27:0x0079, B:28:0x0089, B:29:0x00a0, B:30:0x00a7, B:31:0x00ae, B:34:0x00b5, B:36:0x00be, B:38:0x00cc, B:40:0x00d4, B:41:0x00df, B:42:0x00f3, B:43:0x010b, B:44:0x0115, B:45:0x0116, B:47:0x0125, B:48:0x012d, B:49:0x013a, B:51:0x0147, B:52:0x015d, B:53:0x016c, B:54:0x0177, B:56:0x0187, B:57:0x0193, B:58:0x01a5, B:60:0x01af, B:63:0x01ba, B:64:0x01c1, B:65:0x01cc, B:68:0x01d3, B:70:0x01db, B:72:0x01df, B:74:0x01e4, B:76:0x01ec, B:78:0x01ef, B:82:0x01f4, B:90:0x0200, B:92:0x0201, B:95:0x0208, B:97:0x0216, B:98:0x0219, B:100:0x021e, B:102:0x022e, B:103:0x0231, B:104:0x0236, B:105:0x023b, B:107:0x0245, B:111:0x024e, B:113:0x0252, B:116:0x0259, B:118:0x0260, B:120:0x0268, B:121:0x026d, B:123:0x0271, B:127:0x027a, B:130:0x027f, B:132:0x0289, B:137:0x0294, B:139:0x0298, B:140:0x02a7, B:142:0x02ba, B:143:0x02e1, B:144:0x02e6, B:145:0x02e7, B:147:0x02ed, B:149:0x0308, B:153:0x0311, B:510:0x0339, B:511:0x033e, B:519:0x0348, B:156:0x0359, B:157:0x035e, B:158:0x0366, B:534:0x0385, B:537:0x03ae, B:545:0x0503, B:546:0x04bb, B:612:0x04b7, B:580:0x051b, B:581:0x0523, B:622:0x03d8, B:625:0x03f3, B:627:0x03f7, B:629:0x0405, B:630:0x0419, B:632:0x041e, B:635:0x0425, B:639:0x042a, B:643:0x0437, B:159:0x0529, B:161:0x0545, B:163:0x0551, B:165:0x0559, B:168:0x0560, B:170:0x0567, B:172:0x056f, B:174:0x0577, B:176:0x0583, B:178:0x058d, B:179:0x05a9, B:181:0x05b1, B:182:0x05b6, B:183:0x0598, B:185:0x059c, B:186:0x05ba, B:188:0x05be, B:189:0x05cf, B:192:0x06ee, B:194:0x06f6, B:196:0x06fe, B:199:0x0704, B:200:0x0710, B:202:0x0714, B:204:0x071c, B:209:0x0728, B:211:0x0730, B:213:0x0738, B:214:0x073e, B:216:0x0743, B:218:0x074c, B:221:0x0766, B:223:0x076c, B:208:0x0771, B:230:0x0776, B:232:0x0784, B:276:0x0837, B:277:0x083c, B:282:0x0847, B:284:0x084f, B:285:0x0854, B:287:0x0860, B:288:0x0879, B:290:0x087d, B:292:0x0885, B:294:0x08b3, B:295:0x088a, B:297:0x0893, B:300:0x08a0, B:305:0x08b0, B:311:0x08bd, B:313:0x08c3, B:317:0x08d0, B:319:0x08fa, B:321:0x0900, B:323:0x0904, B:325:0x098a, B:327:0x0997, B:329:0x09a8, B:330:0x09b1, B:331:0x09fb, B:334:0x0a02, B:336:0x0a06, B:338:0x0a0e, B:340:0x0a11, B:343:0x0a14, B:345:0x0a1a, B:347:0x0a23, B:349:0x0a2d, B:351:0x0a33, B:352:0x0a52, B:354:0x0a58, B:357:0x0a61, B:360:0x0a7a, B:364:0x0a73, B:366:0x0a77, B:368:0x0a3a, B:371:0x0a48, B:372:0x0a4f, B:373:0x0a50, B:376:0x090e, B:378:0x0912, B:380:0x0926, B:381:0x0931, B:383:0x093b, B:386:0x0944, B:388:0x094e, B:393:0x0959, B:397:0x09b5, B:399:0x09bb, B:401:0x09bf, B:404:0x09c8, B:406:0x09d7, B:408:0x09df, B:410:0x09eb, B:412:0x09f0, B:414:0x09f3, B:415:0x09f8, B:417:0x08d8, B:419:0x08dc, B:420:0x08e7, B:422:0x08ed, B:424:0x08b6, B:234:0x078d, B:236:0x0791, B:238:0x0799, B:240:0x079d, B:242:0x07a7, B:245:0x07ad, B:246:0x07b0, B:248:0x07b8, B:250:0x07ca, B:252:0x07d3, B:254:0x07db, B:257:0x07e7, B:259:0x080e, B:260:0x0811, B:262:0x081e, B:264:0x0824, B:266:0x082b, B:273:0x0836, B:430:0x05dc, B:432:0x05e0, B:434:0x05e9, B:437:0x05f4, B:439:0x05f8, B:441:0x0600, B:444:0x0603, B:446:0x0609, B:448:0x0613, B:450:0x0649, B:452:0x0653, B:454:0x065b, B:456:0x0667, B:458:0x066d, B:462:0x0680, B:464:0x068a, B:466:0x0696, B:468:0x06ab, B:472:0x06b1, B:471:0x06bf, B:479:0x06c6, B:481:0x06cc, B:484:0x06d1, B:486:0x06d5, B:490:0x06eb, B:491:0x06de, B:493:0x06e4, B:497:0x05cc, B:499:0x0a7f, B:502:0x0a86, B:523:0x0349, B:524:0x034e, B:528:0x0355, B:532:0x0358), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0774 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07ad A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, xv -> 0x0030, B7 -> 0x0033, xF -> 0x0036, XD -> 0x0039, TryCatch #8 {RuntimeException -> 0x002a, blocks: (B:3:0x0008, B:4:0x000f, B:7:0x0013, B:9:0x0022, B:12:0x003e, B:19:0x004b, B:23:0x004c, B:26:0x0066, B:27:0x0079, B:28:0x0089, B:29:0x00a0, B:30:0x00a7, B:31:0x00ae, B:34:0x00b5, B:36:0x00be, B:38:0x00cc, B:40:0x00d4, B:41:0x00df, B:42:0x00f3, B:43:0x010b, B:44:0x0115, B:45:0x0116, B:47:0x0125, B:48:0x012d, B:49:0x013a, B:51:0x0147, B:52:0x015d, B:53:0x016c, B:54:0x0177, B:56:0x0187, B:57:0x0193, B:58:0x01a5, B:60:0x01af, B:63:0x01ba, B:64:0x01c1, B:65:0x01cc, B:68:0x01d3, B:70:0x01db, B:72:0x01df, B:74:0x01e4, B:76:0x01ec, B:78:0x01ef, B:82:0x01f4, B:90:0x0200, B:92:0x0201, B:95:0x0208, B:97:0x0216, B:98:0x0219, B:100:0x021e, B:102:0x022e, B:103:0x0231, B:104:0x0236, B:105:0x023b, B:107:0x0245, B:111:0x024e, B:113:0x0252, B:116:0x0259, B:118:0x0260, B:120:0x0268, B:121:0x026d, B:123:0x0271, B:127:0x027a, B:130:0x027f, B:132:0x0289, B:137:0x0294, B:139:0x0298, B:140:0x02a7, B:142:0x02ba, B:143:0x02e1, B:144:0x02e6, B:145:0x02e7, B:147:0x02ed, B:149:0x0308, B:153:0x0311, B:510:0x0339, B:511:0x033e, B:519:0x0348, B:156:0x0359, B:157:0x035e, B:158:0x0366, B:534:0x0385, B:537:0x03ae, B:545:0x0503, B:546:0x04bb, B:612:0x04b7, B:580:0x051b, B:581:0x0523, B:622:0x03d8, B:625:0x03f3, B:627:0x03f7, B:629:0x0405, B:630:0x0419, B:632:0x041e, B:635:0x0425, B:639:0x042a, B:643:0x0437, B:159:0x0529, B:161:0x0545, B:163:0x0551, B:165:0x0559, B:168:0x0560, B:170:0x0567, B:172:0x056f, B:174:0x0577, B:176:0x0583, B:178:0x058d, B:179:0x05a9, B:181:0x05b1, B:182:0x05b6, B:183:0x0598, B:185:0x059c, B:186:0x05ba, B:188:0x05be, B:189:0x05cf, B:192:0x06ee, B:194:0x06f6, B:196:0x06fe, B:199:0x0704, B:200:0x0710, B:202:0x0714, B:204:0x071c, B:209:0x0728, B:211:0x0730, B:213:0x0738, B:214:0x073e, B:216:0x0743, B:218:0x074c, B:221:0x0766, B:223:0x076c, B:208:0x0771, B:230:0x0776, B:232:0x0784, B:276:0x0837, B:277:0x083c, B:282:0x0847, B:284:0x084f, B:285:0x0854, B:287:0x0860, B:288:0x0879, B:290:0x087d, B:292:0x0885, B:294:0x08b3, B:295:0x088a, B:297:0x0893, B:300:0x08a0, B:305:0x08b0, B:311:0x08bd, B:313:0x08c3, B:317:0x08d0, B:319:0x08fa, B:321:0x0900, B:323:0x0904, B:325:0x098a, B:327:0x0997, B:329:0x09a8, B:330:0x09b1, B:331:0x09fb, B:334:0x0a02, B:336:0x0a06, B:338:0x0a0e, B:340:0x0a11, B:343:0x0a14, B:345:0x0a1a, B:347:0x0a23, B:349:0x0a2d, B:351:0x0a33, B:352:0x0a52, B:354:0x0a58, B:357:0x0a61, B:360:0x0a7a, B:364:0x0a73, B:366:0x0a77, B:368:0x0a3a, B:371:0x0a48, B:372:0x0a4f, B:373:0x0a50, B:376:0x090e, B:378:0x0912, B:380:0x0926, B:381:0x0931, B:383:0x093b, B:386:0x0944, B:388:0x094e, B:393:0x0959, B:397:0x09b5, B:399:0x09bb, B:401:0x09bf, B:404:0x09c8, B:406:0x09d7, B:408:0x09df, B:410:0x09eb, B:412:0x09f0, B:414:0x09f3, B:415:0x09f8, B:417:0x08d8, B:419:0x08dc, B:420:0x08e7, B:422:0x08ed, B:424:0x08b6, B:234:0x078d, B:236:0x0791, B:238:0x0799, B:240:0x079d, B:242:0x07a7, B:245:0x07ad, B:246:0x07b0, B:248:0x07b8, B:250:0x07ca, B:252:0x07d3, B:254:0x07db, B:257:0x07e7, B:259:0x080e, B:260:0x0811, B:262:0x081e, B:264:0x0824, B:266:0x082b, B:273:0x0836, B:430:0x05dc, B:432:0x05e0, B:434:0x05e9, B:437:0x05f4, B:439:0x05f8, B:441:0x0600, B:444:0x0603, B:446:0x0609, B:448:0x0613, B:450:0x0649, B:452:0x0653, B:454:0x065b, B:456:0x0667, B:458:0x066d, B:462:0x0680, B:464:0x068a, B:466:0x0696, B:468:0x06ab, B:472:0x06b1, B:471:0x06bf, B:479:0x06c6, B:481:0x06cc, B:484:0x06d1, B:486:0x06d5, B:490:0x06eb, B:491:0x06de, B:493:0x06e4, B:497:0x05cc, B:499:0x0a7f, B:502:0x0a86, B:523:0x0349, B:524:0x034e, B:528:0x0355, B:532:0x0358), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x07b8 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, xv -> 0x0030, B7 -> 0x0033, xF -> 0x0036, XD -> 0x0039, TryCatch #8 {RuntimeException -> 0x002a, blocks: (B:3:0x0008, B:4:0x000f, B:7:0x0013, B:9:0x0022, B:12:0x003e, B:19:0x004b, B:23:0x004c, B:26:0x0066, B:27:0x0079, B:28:0x0089, B:29:0x00a0, B:30:0x00a7, B:31:0x00ae, B:34:0x00b5, B:36:0x00be, B:38:0x00cc, B:40:0x00d4, B:41:0x00df, B:42:0x00f3, B:43:0x010b, B:44:0x0115, B:45:0x0116, B:47:0x0125, B:48:0x012d, B:49:0x013a, B:51:0x0147, B:52:0x015d, B:53:0x016c, B:54:0x0177, B:56:0x0187, B:57:0x0193, B:58:0x01a5, B:60:0x01af, B:63:0x01ba, B:64:0x01c1, B:65:0x01cc, B:68:0x01d3, B:70:0x01db, B:72:0x01df, B:74:0x01e4, B:76:0x01ec, B:78:0x01ef, B:82:0x01f4, B:90:0x0200, B:92:0x0201, B:95:0x0208, B:97:0x0216, B:98:0x0219, B:100:0x021e, B:102:0x022e, B:103:0x0231, B:104:0x0236, B:105:0x023b, B:107:0x0245, B:111:0x024e, B:113:0x0252, B:116:0x0259, B:118:0x0260, B:120:0x0268, B:121:0x026d, B:123:0x0271, B:127:0x027a, B:130:0x027f, B:132:0x0289, B:137:0x0294, B:139:0x0298, B:140:0x02a7, B:142:0x02ba, B:143:0x02e1, B:144:0x02e6, B:145:0x02e7, B:147:0x02ed, B:149:0x0308, B:153:0x0311, B:510:0x0339, B:511:0x033e, B:519:0x0348, B:156:0x0359, B:157:0x035e, B:158:0x0366, B:534:0x0385, B:537:0x03ae, B:545:0x0503, B:546:0x04bb, B:612:0x04b7, B:580:0x051b, B:581:0x0523, B:622:0x03d8, B:625:0x03f3, B:627:0x03f7, B:629:0x0405, B:630:0x0419, B:632:0x041e, B:635:0x0425, B:639:0x042a, B:643:0x0437, B:159:0x0529, B:161:0x0545, B:163:0x0551, B:165:0x0559, B:168:0x0560, B:170:0x0567, B:172:0x056f, B:174:0x0577, B:176:0x0583, B:178:0x058d, B:179:0x05a9, B:181:0x05b1, B:182:0x05b6, B:183:0x0598, B:185:0x059c, B:186:0x05ba, B:188:0x05be, B:189:0x05cf, B:192:0x06ee, B:194:0x06f6, B:196:0x06fe, B:199:0x0704, B:200:0x0710, B:202:0x0714, B:204:0x071c, B:209:0x0728, B:211:0x0730, B:213:0x0738, B:214:0x073e, B:216:0x0743, B:218:0x074c, B:221:0x0766, B:223:0x076c, B:208:0x0771, B:230:0x0776, B:232:0x0784, B:276:0x0837, B:277:0x083c, B:282:0x0847, B:284:0x084f, B:285:0x0854, B:287:0x0860, B:288:0x0879, B:290:0x087d, B:292:0x0885, B:294:0x08b3, B:295:0x088a, B:297:0x0893, B:300:0x08a0, B:305:0x08b0, B:311:0x08bd, B:313:0x08c3, B:317:0x08d0, B:319:0x08fa, B:321:0x0900, B:323:0x0904, B:325:0x098a, B:327:0x0997, B:329:0x09a8, B:330:0x09b1, B:331:0x09fb, B:334:0x0a02, B:336:0x0a06, B:338:0x0a0e, B:340:0x0a11, B:343:0x0a14, B:345:0x0a1a, B:347:0x0a23, B:349:0x0a2d, B:351:0x0a33, B:352:0x0a52, B:354:0x0a58, B:357:0x0a61, B:360:0x0a7a, B:364:0x0a73, B:366:0x0a77, B:368:0x0a3a, B:371:0x0a48, B:372:0x0a4f, B:373:0x0a50, B:376:0x090e, B:378:0x0912, B:380:0x0926, B:381:0x0931, B:383:0x093b, B:386:0x0944, B:388:0x094e, B:393:0x0959, B:397:0x09b5, B:399:0x09bb, B:401:0x09bf, B:404:0x09c8, B:406:0x09d7, B:408:0x09df, B:410:0x09eb, B:412:0x09f0, B:414:0x09f3, B:415:0x09f8, B:417:0x08d8, B:419:0x08dc, B:420:0x08e7, B:422:0x08ed, B:424:0x08b6, B:234:0x078d, B:236:0x0791, B:238:0x0799, B:240:0x079d, B:242:0x07a7, B:245:0x07ad, B:246:0x07b0, B:248:0x07b8, B:250:0x07ca, B:252:0x07d3, B:254:0x07db, B:257:0x07e7, B:259:0x080e, B:260:0x0811, B:262:0x081e, B:264:0x0824, B:266:0x082b, B:273:0x0836, B:430:0x05dc, B:432:0x05e0, B:434:0x05e9, B:437:0x05f4, B:439:0x05f8, B:441:0x0600, B:444:0x0603, B:446:0x0609, B:448:0x0613, B:450:0x0649, B:452:0x0653, B:454:0x065b, B:456:0x0667, B:458:0x066d, B:462:0x0680, B:464:0x068a, B:466:0x0696, B:468:0x06ab, B:472:0x06b1, B:471:0x06bf, B:479:0x06c6, B:481:0x06cc, B:484:0x06d1, B:486:0x06d5, B:490:0x06eb, B:491:0x06de, B:493:0x06e4, B:497:0x05cc, B:499:0x0a7f, B:502:0x0a86, B:523:0x0349, B:524:0x034e, B:528:0x0355, B:532:0x0358), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:259:0x080e A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, xv -> 0x0030, B7 -> 0x0033, xF -> 0x0036, XD -> 0x0039, TryCatch #8 {RuntimeException -> 0x002a, blocks: (B:3:0x0008, B:4:0x000f, B:7:0x0013, B:9:0x0022, B:12:0x003e, B:19:0x004b, B:23:0x004c, B:26:0x0066, B:27:0x0079, B:28:0x0089, B:29:0x00a0, B:30:0x00a7, B:31:0x00ae, B:34:0x00b5, B:36:0x00be, B:38:0x00cc, B:40:0x00d4, B:41:0x00df, B:42:0x00f3, B:43:0x010b, B:44:0x0115, B:45:0x0116, B:47:0x0125, B:48:0x012d, B:49:0x013a, B:51:0x0147, B:52:0x015d, B:53:0x016c, B:54:0x0177, B:56:0x0187, B:57:0x0193, B:58:0x01a5, B:60:0x01af, B:63:0x01ba, B:64:0x01c1, B:65:0x01cc, B:68:0x01d3, B:70:0x01db, B:72:0x01df, B:74:0x01e4, B:76:0x01ec, B:78:0x01ef, B:82:0x01f4, B:90:0x0200, B:92:0x0201, B:95:0x0208, B:97:0x0216, B:98:0x0219, B:100:0x021e, B:102:0x022e, B:103:0x0231, B:104:0x0236, B:105:0x023b, B:107:0x0245, B:111:0x024e, B:113:0x0252, B:116:0x0259, B:118:0x0260, B:120:0x0268, B:121:0x026d, B:123:0x0271, B:127:0x027a, B:130:0x027f, B:132:0x0289, B:137:0x0294, B:139:0x0298, B:140:0x02a7, B:142:0x02ba, B:143:0x02e1, B:144:0x02e6, B:145:0x02e7, B:147:0x02ed, B:149:0x0308, B:153:0x0311, B:510:0x0339, B:511:0x033e, B:519:0x0348, B:156:0x0359, B:157:0x035e, B:158:0x0366, B:534:0x0385, B:537:0x03ae, B:545:0x0503, B:546:0x04bb, B:612:0x04b7, B:580:0x051b, B:581:0x0523, B:622:0x03d8, B:625:0x03f3, B:627:0x03f7, B:629:0x0405, B:630:0x0419, B:632:0x041e, B:635:0x0425, B:639:0x042a, B:643:0x0437, B:159:0x0529, B:161:0x0545, B:163:0x0551, B:165:0x0559, B:168:0x0560, B:170:0x0567, B:172:0x056f, B:174:0x0577, B:176:0x0583, B:178:0x058d, B:179:0x05a9, B:181:0x05b1, B:182:0x05b6, B:183:0x0598, B:185:0x059c, B:186:0x05ba, B:188:0x05be, B:189:0x05cf, B:192:0x06ee, B:194:0x06f6, B:196:0x06fe, B:199:0x0704, B:200:0x0710, B:202:0x0714, B:204:0x071c, B:209:0x0728, B:211:0x0730, B:213:0x0738, B:214:0x073e, B:216:0x0743, B:218:0x074c, B:221:0x0766, B:223:0x076c, B:208:0x0771, B:230:0x0776, B:232:0x0784, B:276:0x0837, B:277:0x083c, B:282:0x0847, B:284:0x084f, B:285:0x0854, B:287:0x0860, B:288:0x0879, B:290:0x087d, B:292:0x0885, B:294:0x08b3, B:295:0x088a, B:297:0x0893, B:300:0x08a0, B:305:0x08b0, B:311:0x08bd, B:313:0x08c3, B:317:0x08d0, B:319:0x08fa, B:321:0x0900, B:323:0x0904, B:325:0x098a, B:327:0x0997, B:329:0x09a8, B:330:0x09b1, B:331:0x09fb, B:334:0x0a02, B:336:0x0a06, B:338:0x0a0e, B:340:0x0a11, B:343:0x0a14, B:345:0x0a1a, B:347:0x0a23, B:349:0x0a2d, B:351:0x0a33, B:352:0x0a52, B:354:0x0a58, B:357:0x0a61, B:360:0x0a7a, B:364:0x0a73, B:366:0x0a77, B:368:0x0a3a, B:371:0x0a48, B:372:0x0a4f, B:373:0x0a50, B:376:0x090e, B:378:0x0912, B:380:0x0926, B:381:0x0931, B:383:0x093b, B:386:0x0944, B:388:0x094e, B:393:0x0959, B:397:0x09b5, B:399:0x09bb, B:401:0x09bf, B:404:0x09c8, B:406:0x09d7, B:408:0x09df, B:410:0x09eb, B:412:0x09f0, B:414:0x09f3, B:415:0x09f8, B:417:0x08d8, B:419:0x08dc, B:420:0x08e7, B:422:0x08ed, B:424:0x08b6, B:234:0x078d, B:236:0x0791, B:238:0x0799, B:240:0x079d, B:242:0x07a7, B:245:0x07ad, B:246:0x07b0, B:248:0x07b8, B:250:0x07ca, B:252:0x07d3, B:254:0x07db, B:257:0x07e7, B:259:0x080e, B:260:0x0811, B:262:0x081e, B:264:0x0824, B:266:0x082b, B:273:0x0836, B:430:0x05dc, B:432:0x05e0, B:434:0x05e9, B:437:0x05f4, B:439:0x05f8, B:441:0x0600, B:444:0x0603, B:446:0x0609, B:448:0x0613, B:450:0x0649, B:452:0x0653, B:454:0x065b, B:456:0x0667, B:458:0x066d, B:462:0x0680, B:464:0x068a, B:466:0x0696, B:468:0x06ab, B:472:0x06b1, B:471:0x06bf, B:479:0x06c6, B:481:0x06cc, B:484:0x06d1, B:486:0x06d5, B:490:0x06eb, B:491:0x06de, B:493:0x06e4, B:497:0x05cc, B:499:0x0a7f, B:502:0x0a86, B:523:0x0349, B:524:0x034e, B:528:0x0355, B:532:0x0358), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x081e A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, xv -> 0x0030, B7 -> 0x0033, xF -> 0x0036, XD -> 0x0039, TryCatch #8 {RuntimeException -> 0x002a, blocks: (B:3:0x0008, B:4:0x000f, B:7:0x0013, B:9:0x0022, B:12:0x003e, B:19:0x004b, B:23:0x004c, B:26:0x0066, B:27:0x0079, B:28:0x0089, B:29:0x00a0, B:30:0x00a7, B:31:0x00ae, B:34:0x00b5, B:36:0x00be, B:38:0x00cc, B:40:0x00d4, B:41:0x00df, B:42:0x00f3, B:43:0x010b, B:44:0x0115, B:45:0x0116, B:47:0x0125, B:48:0x012d, B:49:0x013a, B:51:0x0147, B:52:0x015d, B:53:0x016c, B:54:0x0177, B:56:0x0187, B:57:0x0193, B:58:0x01a5, B:60:0x01af, B:63:0x01ba, B:64:0x01c1, B:65:0x01cc, B:68:0x01d3, B:70:0x01db, B:72:0x01df, B:74:0x01e4, B:76:0x01ec, B:78:0x01ef, B:82:0x01f4, B:90:0x0200, B:92:0x0201, B:95:0x0208, B:97:0x0216, B:98:0x0219, B:100:0x021e, B:102:0x022e, B:103:0x0231, B:104:0x0236, B:105:0x023b, B:107:0x0245, B:111:0x024e, B:113:0x0252, B:116:0x0259, B:118:0x0260, B:120:0x0268, B:121:0x026d, B:123:0x0271, B:127:0x027a, B:130:0x027f, B:132:0x0289, B:137:0x0294, B:139:0x0298, B:140:0x02a7, B:142:0x02ba, B:143:0x02e1, B:144:0x02e6, B:145:0x02e7, B:147:0x02ed, B:149:0x0308, B:153:0x0311, B:510:0x0339, B:511:0x033e, B:519:0x0348, B:156:0x0359, B:157:0x035e, B:158:0x0366, B:534:0x0385, B:537:0x03ae, B:545:0x0503, B:546:0x04bb, B:612:0x04b7, B:580:0x051b, B:581:0x0523, B:622:0x03d8, B:625:0x03f3, B:627:0x03f7, B:629:0x0405, B:630:0x0419, B:632:0x041e, B:635:0x0425, B:639:0x042a, B:643:0x0437, B:159:0x0529, B:161:0x0545, B:163:0x0551, B:165:0x0559, B:168:0x0560, B:170:0x0567, B:172:0x056f, B:174:0x0577, B:176:0x0583, B:178:0x058d, B:179:0x05a9, B:181:0x05b1, B:182:0x05b6, B:183:0x0598, B:185:0x059c, B:186:0x05ba, B:188:0x05be, B:189:0x05cf, B:192:0x06ee, B:194:0x06f6, B:196:0x06fe, B:199:0x0704, B:200:0x0710, B:202:0x0714, B:204:0x071c, B:209:0x0728, B:211:0x0730, B:213:0x0738, B:214:0x073e, B:216:0x0743, B:218:0x074c, B:221:0x0766, B:223:0x076c, B:208:0x0771, B:230:0x0776, B:232:0x0784, B:276:0x0837, B:277:0x083c, B:282:0x0847, B:284:0x084f, B:285:0x0854, B:287:0x0860, B:288:0x0879, B:290:0x087d, B:292:0x0885, B:294:0x08b3, B:295:0x088a, B:297:0x0893, B:300:0x08a0, B:305:0x08b0, B:311:0x08bd, B:313:0x08c3, B:317:0x08d0, B:319:0x08fa, B:321:0x0900, B:323:0x0904, B:325:0x098a, B:327:0x0997, B:329:0x09a8, B:330:0x09b1, B:331:0x09fb, B:334:0x0a02, B:336:0x0a06, B:338:0x0a0e, B:340:0x0a11, B:343:0x0a14, B:345:0x0a1a, B:347:0x0a23, B:349:0x0a2d, B:351:0x0a33, B:352:0x0a52, B:354:0x0a58, B:357:0x0a61, B:360:0x0a7a, B:364:0x0a73, B:366:0x0a77, B:368:0x0a3a, B:371:0x0a48, B:372:0x0a4f, B:373:0x0a50, B:376:0x090e, B:378:0x0912, B:380:0x0926, B:381:0x0931, B:383:0x093b, B:386:0x0944, B:388:0x094e, B:393:0x0959, B:397:0x09b5, B:399:0x09bb, B:401:0x09bf, B:404:0x09c8, B:406:0x09d7, B:408:0x09df, B:410:0x09eb, B:412:0x09f0, B:414:0x09f3, B:415:0x09f8, B:417:0x08d8, B:419:0x08dc, B:420:0x08e7, B:422:0x08ed, B:424:0x08b6, B:234:0x078d, B:236:0x0791, B:238:0x0799, B:240:0x079d, B:242:0x07a7, B:245:0x07ad, B:246:0x07b0, B:248:0x07b8, B:250:0x07ca, B:252:0x07d3, B:254:0x07db, B:257:0x07e7, B:259:0x080e, B:260:0x0811, B:262:0x081e, B:264:0x0824, B:266:0x082b, B:273:0x0836, B:430:0x05dc, B:432:0x05e0, B:434:0x05e9, B:437:0x05f4, B:439:0x05f8, B:441:0x0600, B:444:0x0603, B:446:0x0609, B:448:0x0613, B:450:0x0649, B:452:0x0653, B:454:0x065b, B:456:0x0667, B:458:0x066d, B:462:0x0680, B:464:0x068a, B:466:0x0696, B:468:0x06ab, B:472:0x06b1, B:471:0x06bf, B:479:0x06c6, B:481:0x06cc, B:484:0x06d1, B:486:0x06d5, B:490:0x06eb, B:491:0x06de, B:493:0x06e4, B:497:0x05cc, B:499:0x0a7f, B:502:0x0a86, B:523:0x0349, B:524:0x034e, B:528:0x0355, B:532:0x0358), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0836 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0a01  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0a58 A[Catch: RuntimeException -> 0x002a, IOException -> 0x002d, xv -> 0x0030, B7 -> 0x0033, xF -> 0x0036, XD -> 0x0039, TryCatch #8 {RuntimeException -> 0x002a, blocks: (B:3:0x0008, B:4:0x000f, B:7:0x0013, B:9:0x0022, B:12:0x003e, B:19:0x004b, B:23:0x004c, B:26:0x0066, B:27:0x0079, B:28:0x0089, B:29:0x00a0, B:30:0x00a7, B:31:0x00ae, B:34:0x00b5, B:36:0x00be, B:38:0x00cc, B:40:0x00d4, B:41:0x00df, B:42:0x00f3, B:43:0x010b, B:44:0x0115, B:45:0x0116, B:47:0x0125, B:48:0x012d, B:49:0x013a, B:51:0x0147, B:52:0x015d, B:53:0x016c, B:54:0x0177, B:56:0x0187, B:57:0x0193, B:58:0x01a5, B:60:0x01af, B:63:0x01ba, B:64:0x01c1, B:65:0x01cc, B:68:0x01d3, B:70:0x01db, B:72:0x01df, B:74:0x01e4, B:76:0x01ec, B:78:0x01ef, B:82:0x01f4, B:90:0x0200, B:92:0x0201, B:95:0x0208, B:97:0x0216, B:98:0x0219, B:100:0x021e, B:102:0x022e, B:103:0x0231, B:104:0x0236, B:105:0x023b, B:107:0x0245, B:111:0x024e, B:113:0x0252, B:116:0x0259, B:118:0x0260, B:120:0x0268, B:121:0x026d, B:123:0x0271, B:127:0x027a, B:130:0x027f, B:132:0x0289, B:137:0x0294, B:139:0x0298, B:140:0x02a7, B:142:0x02ba, B:143:0x02e1, B:144:0x02e6, B:145:0x02e7, B:147:0x02ed, B:149:0x0308, B:153:0x0311, B:510:0x0339, B:511:0x033e, B:519:0x0348, B:156:0x0359, B:157:0x035e, B:158:0x0366, B:534:0x0385, B:537:0x03ae, B:545:0x0503, B:546:0x04bb, B:612:0x04b7, B:580:0x051b, B:581:0x0523, B:622:0x03d8, B:625:0x03f3, B:627:0x03f7, B:629:0x0405, B:630:0x0419, B:632:0x041e, B:635:0x0425, B:639:0x042a, B:643:0x0437, B:159:0x0529, B:161:0x0545, B:163:0x0551, B:165:0x0559, B:168:0x0560, B:170:0x0567, B:172:0x056f, B:174:0x0577, B:176:0x0583, B:178:0x058d, B:179:0x05a9, B:181:0x05b1, B:182:0x05b6, B:183:0x0598, B:185:0x059c, B:186:0x05ba, B:188:0x05be, B:189:0x05cf, B:192:0x06ee, B:194:0x06f6, B:196:0x06fe, B:199:0x0704, B:200:0x0710, B:202:0x0714, B:204:0x071c, B:209:0x0728, B:211:0x0730, B:213:0x0738, B:214:0x073e, B:216:0x0743, B:218:0x074c, B:221:0x0766, B:223:0x076c, B:208:0x0771, B:230:0x0776, B:232:0x0784, B:276:0x0837, B:277:0x083c, B:282:0x0847, B:284:0x084f, B:285:0x0854, B:287:0x0860, B:288:0x0879, B:290:0x087d, B:292:0x0885, B:294:0x08b3, B:295:0x088a, B:297:0x0893, B:300:0x08a0, B:305:0x08b0, B:311:0x08bd, B:313:0x08c3, B:317:0x08d0, B:319:0x08fa, B:321:0x0900, B:323:0x0904, B:325:0x098a, B:327:0x0997, B:329:0x09a8, B:330:0x09b1, B:331:0x09fb, B:334:0x0a02, B:336:0x0a06, B:338:0x0a0e, B:340:0x0a11, B:343:0x0a14, B:345:0x0a1a, B:347:0x0a23, B:349:0x0a2d, B:351:0x0a33, B:352:0x0a52, B:354:0x0a58, B:357:0x0a61, B:360:0x0a7a, B:364:0x0a73, B:366:0x0a77, B:368:0x0a3a, B:371:0x0a48, B:372:0x0a4f, B:373:0x0a50, B:376:0x090e, B:378:0x0912, B:380:0x0926, B:381:0x0931, B:383:0x093b, B:386:0x0944, B:388:0x094e, B:393:0x0959, B:397:0x09b5, B:399:0x09bb, B:401:0x09bf, B:404:0x09c8, B:406:0x09d7, B:408:0x09df, B:410:0x09eb, B:412:0x09f0, B:414:0x09f3, B:415:0x09f8, B:417:0x08d8, B:419:0x08dc, B:420:0x08e7, B:422:0x08ed, B:424:0x08b6, B:234:0x078d, B:236:0x0791, B:238:0x0799, B:240:0x079d, B:242:0x07a7, B:245:0x07ad, B:246:0x07b0, B:248:0x07b8, B:250:0x07ca, B:252:0x07d3, B:254:0x07db, B:257:0x07e7, B:259:0x080e, B:260:0x0811, B:262:0x081e, B:264:0x0824, B:266:0x082b, B:273:0x0836, B:430:0x05dc, B:432:0x05e0, B:434:0x05e9, B:437:0x05f4, B:439:0x05f8, B:441:0x0600, B:444:0x0603, B:446:0x0609, B:448:0x0613, B:450:0x0649, B:452:0x0653, B:454:0x065b, B:456:0x0667, B:458:0x066d, B:462:0x0680, B:464:0x068a, B:466:0x0696, B:468:0x06ab, B:472:0x06b1, B:471:0x06bf, B:479:0x06c6, B:481:0x06cc, B:484:0x06d1, B:486:0x06d5, B:490:0x06eb, B:491:0x06de, B:493:0x06e4, B:497:0x05cc, B:499:0x0a7f, B:502:0x0a86, B:523:0x0349, B:524:0x034e, B:528:0x0355, B:532:0x0358), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0a6c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0a6d A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v109, types: [com.google.android.gms.internal.ads.OG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v143, types: [com.google.android.gms.internal.ads.OG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v109, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v161, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v97, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        boolean z3;
        int i;
        C1601tE p5;
        C1287mE c1287mE;
        Pair R4;
        long j5;
        C1603tG c1603tG;
        boolean z5;
        long j6;
        long j7;
        int i5;
        boolean z6;
        C1603tG c1603tG2;
        long j8;
        boolean z7;
        long j9;
        long j10;
        EE ee;
        int i6;
        EE a5;
        long P5;
        boolean z8;
        EE ee2;
        C1603tG c1603tG3;
        AbstractC0715Xa abstractC0715Xa;
        long j11;
        C1603tG c1603tG4;
        long j12;
        boolean z9;
        int i7;
        int i8;
        boolean z10;
        boolean z11;
        long j13;
        int i9;
        boolean g5;
        long j14;
        C1601tE p6;
        boolean z12;
        C1601tE n5;
        C1601tE c1601tE;
        C1601tE k5;
        char c5;
        boolean z13;
        int i10;
        int i11;
        C1646uE q5;
        long j15;
        C1332nE c1332nE = this;
        try {
            try {
                try {
                } catch (RuntimeException e3) {
                    XD xd = new XD(2, e3, ((e3 instanceof IllegalStateException) || (e3 instanceof IllegalArgumentException)) ? 1004 : 1000);
                    JB.g("ExoPlayerImplInternal", "Playback error", xd);
                    c1332nE.y(true, false);
                    c1332nE.f14609H = c1332nE.f14609H.d(xd);
                }
            } catch (XD e5) {
                e = e5;
            }
        } catch (B7 e6) {
            c1332nE.d(e6.f7769l == 1 ? true != e6.f7768k ? 3003 : 3001 : 1000, e6);
        } catch (C1782xF e7) {
            c1332nE.d(e7.f16280k, e7);
        } catch (C1806xv e8) {
            c1332nE.d(e8.f16348k, e8);
        } catch (IOException e9) {
            c1332nE.d(2000, e9);
        }
        switch (message.what) {
            case 1:
                boolean z14 = message.arg1 != 0;
                int i12 = message.arg2;
                c1332nE.v(i12 >> 4, i12 & 15, z14, true);
                z3 = true;
                c1332nE.k();
                return z3;
            case 2:
                long uptimeMillis = SystemClock.uptimeMillis();
                c1332nE.f14636r.f15040a.removeMessages(2);
                if (c1332nE.f14609H.f8476a.o() || !c1332nE.f14603B.e()) {
                    i7 = 3;
                    i8 = 4;
                } else {
                    C1691vE c1691vE = c1332nE.f14602A;
                    long j16 = c1332nE.f14620U;
                    C1601tE c1601tE2 = c1691vE.f15994j;
                    if (c1601tE2 != null) {
                        AbstractC1668us.a0(c1601tE2.f15661m == null);
                        if (c1601tE2.f15655e) {
                            c1601tE2.f15651a.a(j16 - c1601tE2.f15664p);
                        }
                    }
                    if (c1332nE.f14602A.y() && (q5 = c1332nE.f14602A.q(c1332nE.f14620U, c1332nE.f14609H)) != null) {
                        C1601tE m5 = c1332nE.f14602A.m(q5);
                        if (!m5.f15654d) {
                            long j17 = q5.f15817b;
                            m5.f15654d = true;
                            m5.f15651a.f(c1332nE, j17);
                        } else if (m5.f15655e) {
                            c1332nE.f14636r.a(8, m5.f15651a).a();
                        }
                        if (c1332nE.f14602A.n() == m5) {
                            c1332nE.r(q5.f15817b);
                        }
                        c1332nE.e(false);
                    }
                    if (c1332nE.f14614O) {
                        c1332nE.f14614O = K(c1332nE.f14602A.f15994j);
                        c1332nE.A();
                    } else {
                        c1332nE.i();
                    }
                    C1601tE p7 = c1332nE.f14602A.p();
                    if (p7 != null) {
                        if (p7.f15661m == null || c1332nE.f14611L) {
                            i7 = 3;
                            j14 = -9223372036854775807L;
                            if (p7.f15656g.f15822h || c1332nE.f14611L) {
                                int i13 = 0;
                                while (true) {
                                    C0001a[] c0001aArr = c1332nE.f14629k;
                                    if (i13 < 2) {
                                        C0001a c0001a = c0001aArr[i13];
                                        if (c0001a.k(p7) && c0001a.j()) {
                                            ((RF) c0001a.f33c).f11414x = true;
                                        }
                                        i13++;
                                    }
                                }
                            }
                        } else {
                            C1601tE p8 = c1332nE.f14602A.p();
                            if (p8.f15655e) {
                                int i14 = 0;
                                while (true) {
                                    C0001a[] c0001aArr2 = c1332nE.f14629k;
                                    if (i14 >= 2) {
                                        C1601tE c1601tE3 = p7.f15661m;
                                        if (c1601tE3.f15655e || c1332nE.f14620U >= c1601tE3.c()) {
                                            C1245lH e10 = p7.e();
                                            C1601tE l5 = c1332nE.f14602A.l();
                                            C1245lH e11 = l5.e();
                                            AbstractC0715Xa abstractC0715Xa2 = c1332nE.f14609H.f8476a;
                                            j14 = -9223372036854775807L;
                                            c1332nE.D(abstractC0715Xa2, l5.f15656g.f15816a, abstractC0715Xa2, p7.f15656g.f15816a, -9223372036854775807L, false);
                                            if (!l5.f15655e || l5.f15651a.j() == -9223372036854775807L) {
                                                for (int i15 = 0; i15 < 2; i15++) {
                                                    boolean e12 = e10.e(i15);
                                                    boolean e13 = e11.e(i15);
                                                    if (e12 && !((RF) c1332nE.f14629k[i15].f33c).f11414x) {
                                                        c1332nE.f14630l[i15].getClass();
                                                        KE ke = ((KE[]) e10.f14377l)[i15];
                                                        KE ke2 = ((KE[]) e11.f14377l)[i15];
                                                        if (!e13 || !ke2.equals(ke)) {
                                                            C0001a c0001a2 = c1332nE.f14629k[i15];
                                                            l5.c();
                                                            ((RF) c0001a2.f33c).f11414x = true;
                                                        }
                                                    }
                                                }
                                            } else {
                                                l5.c();
                                                C0001a[] c0001aArr3 = c1332nE.f14629k;
                                                for (int i16 = 0; i16 < 2; i16++) {
                                                    ((RF) c0001aArr3[i16].f33c).f11414x = true;
                                                }
                                                if (!l5.i()) {
                                                    c1332nE.f14602A.x(l5);
                                                    c1332nE.e(false);
                                                    c1332nE.i();
                                                }
                                            }
                                            i7 = 3;
                                        }
                                    } else if (c0001aArr2[i14].i(p8)) {
                                        i14++;
                                    }
                                }
                            } else {
                                j14 = -9223372036854775807L;
                                i7 = 3;
                            }
                        }
                        p6 = c1332nE.f14602A.p();
                        if (p6 != null && c1332nE.f14602A.n() != p6 && !p6.f15657h) {
                            C1601tE p9 = c1332nE.f14602A.p();
                            C1245lH e14 = p9.e();
                            boolean z15 = false;
                            i11 = 0;
                            while (true) {
                                C0001a[] c0001aArr4 = c1332nE.f14629k;
                                if (i11 >= 2) {
                                    C0001a c0001a3 = c0001aArr4[i11];
                                    if (c0001a3.a() != 0) {
                                        boolean k6 = c0001a3.k(p9);
                                        if (!e14.e(i11) || !k6) {
                                            RF rf = (RF) c0001a3.f33c;
                                            if (!rf.f11414x) {
                                                InterfaceC1200kH interfaceC1200kH = ((InterfaceC1200kH[]) e14.f14378m)[i11];
                                                int j18 = interfaceC1200kH != null ? interfaceC1200kH.j() : 0;
                                                C1407p[] c1407pArr = new C1407p[j18];
                                                for (int i17 = 0; i17 < j18; i17++) {
                                                    c1407pArr[i17] = interfaceC1200kH.x(i17);
                                                }
                                                c0001a3.e(c1407pArr, p9.f15653c[i11], p9.c(), p9.f15664p, p9.f15656g.f15816a);
                                            } else if (rf.p()) {
                                                c1332nE.b(i11);
                                            } else {
                                                z15 = true;
                                            }
                                        }
                                    }
                                    i11++;
                                } else if (!z15) {
                                    c1332nE.c(new boolean[2], c1332nE.f14602A.i.c());
                                }
                            }
                        }
                        z12 = false;
                        while (c1332nE.H() && !c1332nE.f14611L && (n5 = c1332nE.f14602A.n()) != null && (c1601tE = n5.f15661m) != null && c1332nE.f14620U >= c1601tE.c() && c1601tE.f15657h) {
                            if (z12) {
                                c1332nE.k();
                            }
                            k5 = c1332nE.f14602A.k();
                            if (k5 != null) {
                                throw null;
                            }
                            if (c1332nE.f14609H.f8477b.f15679a.equals(k5.f15656g.f15816a.f15679a)) {
                                C1603tG c1603tG5 = c1332nE.f14609H.f8477b;
                                c5 = 65535;
                                if (c1603tG5.f15680b == -1) {
                                    C1603tG c1603tG6 = k5.f15656g.f15816a;
                                    if (c1603tG6.f15680b == -1 && c1603tG5.f15683e != c1603tG6.f15683e) {
                                        z13 = true;
                                        C1646uE c1646uE = k5.f15656g;
                                        boolean z16 = z13;
                                        C1603tG c1603tG7 = c1646uE.f15816a;
                                        long j19 = c1646uE.f15817b;
                                        c1332nE.f14609H = c1332nE.a(c1603tG7, j19, c1646uE.f15818c, j19, !z16, 0);
                                        c1332nE.q();
                                        c1332nE.C();
                                        if (c1332nE.f14609H.f8480e == i7) {
                                            c1332nE.x();
                                        }
                                        C1245lH e15 = c1332nE.f14602A.n().e();
                                        for (i10 = 0; i10 < 2; i10++) {
                                            if (e15.e(i10)) {
                                                c1332nE.f14629k[i10].b();
                                            }
                                        }
                                        z12 = true;
                                        j14 = -9223372036854775807L;
                                    }
                                }
                            } else {
                                c5 = 65535;
                            }
                            z13 = false;
                            C1646uE c1646uE2 = k5.f15656g;
                            boolean z162 = z13;
                            C1603tG c1603tG72 = c1646uE2.f15816a;
                            long j192 = c1646uE2.f15817b;
                            c1332nE.f14609H = c1332nE.a(c1603tG72, j192, c1646uE2.f15818c, j192, !z162, 0);
                            c1332nE.q();
                            c1332nE.C();
                            if (c1332nE.f14609H.f8480e == i7) {
                            }
                            C1245lH e152 = c1332nE.f14602A.n().e();
                            while (i10 < 2) {
                            }
                            z12 = true;
                            j14 = -9223372036854775807L;
                        }
                        i8 = 4;
                        c1332nE.f14626a0.getClass();
                    }
                    i7 = 3;
                    j14 = -9223372036854775807L;
                    p6 = c1332nE.f14602A.p();
                    if (p6 != null) {
                        C1601tE p92 = c1332nE.f14602A.p();
                        C1245lH e142 = p92.e();
                        boolean z152 = false;
                        i11 = 0;
                        while (true) {
                            C0001a[] c0001aArr42 = c1332nE.f14629k;
                            if (i11 >= 2) {
                            }
                            i11++;
                        }
                    }
                    z12 = false;
                    while (c1332nE.H()) {
                        if (z12) {
                        }
                        k5 = c1332nE.f14602A.k();
                        if (k5 != null) {
                        }
                    }
                    i8 = 4;
                    c1332nE.f14626a0.getClass();
                }
                int i18 = c1332nE.f14609H.f8480e;
                if (i18 != 1 && i18 != i8) {
                    C1601tE n6 = c1332nE.f14602A.n();
                    if (n6 == null) {
                        c1332nE.t(uptimeMillis);
                    } else {
                        Trace.beginSection("doSomeWork");
                        c1332nE.C();
                        if (n6.f15655e) {
                            c1332nE.f14621V = AbstractC1260lo.s(SystemClock.elapsedRealtime());
                            n6.f15651a.e(c1332nE.f14609H.f8491r - c1332nE.f14641w);
                            z10 = true;
                            z11 = true;
                            int i19 = 0;
                            while (true) {
                                C0001a[] c0001aArr5 = c1332nE.f14629k;
                                if (i19 < 2) {
                                    C0001a c0001a4 = c0001aArr5[i19];
                                    if (c0001a4.a() == 0) {
                                        c1332nE.m(i19, false);
                                    } else {
                                        c0001a4.d(c1332nE.f14620U, c1332nE.f14621V);
                                        z10 = z10 && ((RF) c0001a4.f33c).p();
                                        boolean h3 = c0001a4.h(n6);
                                        c1332nE.m(i19, h3);
                                        z11 = z11 && h3;
                                        if (!h3) {
                                            c1332nE.l(i19);
                                        }
                                    }
                                    i19++;
                                }
                            }
                        } else {
                            n6.f15651a.k();
                            z10 = true;
                            z11 = true;
                        }
                        long j20 = n6.f15656g.f15820e;
                        if (z10 && n6.f15655e) {
                            j13 = -9223372036854775807L;
                            if (j20 == -9223372036854775807L || j20 <= c1332nE.f14609H.f8491r) {
                                if (c1332nE.f14611L) {
                                    c1332nE.f14611L = false;
                                    c1332nE.v(c1332nE.f14609H.f8487n, 5, false, false);
                                }
                                if (n6.f15656g.f15822h) {
                                    c1332nE.w(i8);
                                    c1332nE.z();
                                    if (c1332nE.f14609H.f8480e == 2) {
                                        int i20 = 0;
                                        while (true) {
                                            C0001a[] c0001aArr6 = c1332nE.f14629k;
                                            if (i20 < 2) {
                                                if (c0001aArr6[i20].k(n6)) {
                                                    c1332nE.l(i20);
                                                }
                                                i20++;
                                            } else {
                                                EE ee3 = c1332nE.f14609H;
                                                if (!ee3.f8481g && ee3.f8490q < 500000 && K(c1332nE.f14602A.f15994j)) {
                                                    if (c1332nE.f14625Z == j13) {
                                                        c1332nE.f14625Z = SystemClock.elapsedRealtime();
                                                    } else if (SystemClock.elapsedRealtime() - c1332nE.f14625Z >= 4000) {
                                                        throw new IllegalStateException("Playback stuck buffering and not loading");
                                                    }
                                                    boolean z17 = !c1332nE.H() && c1332nE.f14609H.f8480e == i7;
                                                    c1332nE.f14609H.getClass();
                                                    i9 = c1332nE.f14609H.f8480e;
                                                    if (i9 != i8 && (z17 || i9 == 2 || (i9 == i7 && c1332nE.f14618S != 0))) {
                                                        c1332nE.t(uptimeMillis);
                                                    }
                                                    Trace.endSection();
                                                }
                                            }
                                        }
                                    }
                                    c1332nE.f14625Z = j13;
                                    if (c1332nE.H()) {
                                    }
                                    c1332nE.f14609H.getClass();
                                    i9 = c1332nE.f14609H.f8480e;
                                    if (i9 != i8) {
                                        c1332nE.t(uptimeMillis);
                                    }
                                    Trace.endSection();
                                }
                            }
                        } else {
                            j13 = -9223372036854775807L;
                        }
                        EE ee4 = c1332nE.f14609H;
                        if (ee4.f8480e == 2) {
                            if (c1332nE.f14618S == 0) {
                                g5 = c1332nE.G();
                                break;
                            } else if (z11) {
                                if (ee4.f8481g) {
                                    long a6 = c1332nE.I(c1332nE.f14609H.f8476a, c1332nE.f14602A.n().f15656g.f15816a) ? c1332nE.f14628c0.a() : j13;
                                    C1601tE c1601tE4 = c1332nE.f14602A.f15994j;
                                    boolean z18 = c1601tE4.i() && c1601tE4.f15656g.f15822h;
                                    boolean z19 = c1601tE4.f15656g.f15816a.b() && !c1601tE4.f15655e;
                                    if (!z18 && !z19) {
                                        long O5 = c1332nE.O(c1601tE4.b());
                                        InterfaceC1422pE interfaceC1422pE = c1332nE.f14634p;
                                        ZE ze = c1332nE.f14605D;
                                        AbstractC0715Xa abstractC0715Xa3 = c1332nE.f14609H.f8476a;
                                        float f = c1332nE.f14642x.i().f12280a;
                                        boolean z20 = c1332nE.f14609H.f8485l;
                                        g5 = interfaceC1422pE.g(new C1377oE(ze, O5, f, c1332nE.f14612M, a6));
                                        break;
                                    }
                                }
                                c1332nE.w(i7);
                                c1332nE.f14624Y = null;
                                if (c1332nE.H()) {
                                    c1332nE.E(false, false);
                                    Fp fp = c1332nE.f14642x;
                                    fp.f9122l = true;
                                    NE ne = (NE) fp.f9123m;
                                    if (!ne.f10784k) {
                                        ne.f10786m = SystemClock.elapsedRealtime();
                                        ne.f10784k = true;
                                    }
                                    c1332nE.x();
                                }
                                if (c1332nE.f14609H.f8480e == 2) {
                                }
                                c1332nE.f14625Z = j13;
                                if (c1332nE.H()) {
                                }
                                c1332nE.f14609H.getClass();
                                i9 = c1332nE.f14609H.f8480e;
                                if (i9 != i8) {
                                }
                                Trace.endSection();
                            }
                        }
                        if (c1332nE.f14609H.f8480e == i7) {
                            if (c1332nE.f14618S == 0) {
                                if (!c1332nE.G()) {
                                    c1332nE.E(c1332nE.H(), false);
                                    c1332nE.w(2);
                                    if (c1332nE.f14612M) {
                                        for (C1601tE n7 = c1332nE.f14602A.n(); n7 != null; n7 = n7.f15661m) {
                                            for (InterfaceC1200kH interfaceC1200kH2 : (InterfaceC1200kH[]) n7.e().f14378m) {
                                            }
                                        }
                                        c1332nE.f14628c0.b();
                                    }
                                    c1332nE.z();
                                }
                            }
                        }
                        if (c1332nE.f14609H.f8480e == 2) {
                        }
                        c1332nE.f14625Z = j13;
                        if (c1332nE.H()) {
                        }
                        c1332nE.f14609H.getClass();
                        i9 = c1332nE.f14609H.f8480e;
                        if (i9 != i8) {
                        }
                        Trace.endSection();
                    }
                }
                z3 = true;
                c1332nE.k();
                return z3;
            case 3:
                try {
                    c1287mE = (C1287mE) message.obj;
                    c1332nE.f14610I.a(1);
                    R4 = R(c1332nE.f14609H.f8476a, c1287mE, c1332nE.f14615P, c1332nE.f14616Q, c1332nE.f14639u, c1332nE.f14640v);
                    if (R4 == null) {
                        Pair Q5 = c1332nE.Q(c1332nE.f14609H.f8476a);
                        c1603tG = (C1603tG) Q5.first;
                        long longValue = ((Long) Q5.second).longValue();
                        z5 = !c1332nE.f14609H.f8476a.o();
                        j6 = longValue;
                        j7 = -9223372036854775807L;
                        j5 = 0;
                    } else {
                        Object obj = R4.first;
                        long longValue2 = ((Long) R4.second).longValue();
                        j5 = 0;
                        long j21 = c1287mE.f14489c == -9223372036854775807L ? -9223372036854775807L : longValue2;
                        C1603tG s2 = c1332nE.f14602A.s(c1332nE.f14609H.f8476a, obj);
                        if (s2.b()) {
                            c1332nE.f14609H.f8476a.n(s2.f15679a, c1332nE.f14640v);
                            C0736a a7 = c1332nE.f14640v.f.a(-1);
                            while (true) {
                                int[] iArr = a7.f12552d;
                                int i21 = (i21 >= iArr.length || (i5 = iArr[i21]) == 0 || i5 == 1) ? 0 : i21 + 1;
                            }
                            c1603tG = s2;
                            j7 = j21;
                            z5 = true;
                            j6 = 0;
                        } else {
                            c1603tG = s2;
                            z5 = c1287mE.f14489c == -9223372036854775807L;
                            long j22 = j21;
                            j6 = longValue2;
                            j7 = j22;
                        }
                    }
                } catch (XD e16) {
                    e = e16;
                    if (e.f12159m == 1 && (p5 = c1332nE.f14602A.p()) != null) {
                        e = e.a(p5.f15656g.f15816a);
                    }
                    if (e.f12165s && (c1332nE.f14624Y == null || (i = e.f10130k) == 5004 || i == 5003)) {
                        JB.n("ExoPlayerImplInternal", "Recoverable renderer error", e);
                        XD xd2 = c1332nE.f14624Y;
                        if (xd2 != null) {
                            xd2.addSuppressed(e);
                            e = c1332nE.f14624Y;
                        } else {
                            c1332nE.f14624Y = e;
                        }
                        C1439pn c1439pn = c1332nE.f14636r;
                        Vm a8 = c1439pn.a(25, e);
                        Message message2 = a8.f11938a;
                        message2.getClass();
                        c1439pn.f15040a.sendMessageAtFrontOfQueue(message2);
                        a8.f11938a = null;
                        C1439pn.d(a8);
                        z3 = true;
                        c1332nE.k();
                        return z3;
                    }
                    XD xd3 = c1332nE.f14624Y;
                    if (xd3 != null) {
                        xd3.addSuppressed(e);
                        e = c1332nE.f14624Y;
                    }
                    JB.g("ExoPlayerImplInternal", "Playback error", e);
                    if (e.f12159m == 1) {
                        C1691vE c1691vE2 = c1332nE.f14602A;
                        if (c1691vE2.n() != c1691vE2.p()) {
                            while (true) {
                                C1691vE c1691vE3 = c1332nE.f14602A;
                                if (c1691vE3.n() != c1691vE3.p()) {
                                    c1332nE.f14602A.k();
                                } else {
                                    C1601tE n8 = c1332nE.f14602A.n();
                                    n8.getClass();
                                    c1332nE.k();
                                    C1646uE c1646uE3 = n8.f15656g;
                                    C1603tG c1603tG8 = c1646uE3.f15816a;
                                    long j23 = c1646uE3.f15817b;
                                    c1332nE.f14609H = c1332nE.a(c1603tG8, j23, c1646uE3.f15818c, j23, true, 0);
                                }
                            }
                        }
                    }
                    z3 = true;
                    c1332nE.y(true, false);
                    c1332nE.f14609H = c1332nE.f14609H.d(e);
                    c1332nE.k();
                    return z3;
                }
                try {
                    if (c1332nE.f14609H.f8476a.o()) {
                        c1332nE.f14619T = c1287mE;
                    } else if (R4 == null) {
                        if (c1332nE.f14609H.f8480e != 1) {
                            c1332nE.w(4);
                        }
                        c1332nE.p(false, true, false, true);
                    } else {
                        try {
                            try {
                                try {
                                    try {
                                        if (c1603tG.equals(c1332nE.f14609H.f8477b)) {
                                            try {
                                                C1601tE n9 = c1332nE.f14602A.n();
                                                long l6 = (n9 == null || !n9.f15655e || j6 == j5) ? j6 : n9.f15651a.l(j6, c1332nE.f14608G);
                                                if (AbstractC1260lo.v(l6) != AbstractC1260lo.v(c1332nE.f14609H.f8491r) || ((i6 = (ee = c1332nE.f14609H).f8480e) != 2 && i6 != 3)) {
                                                    z6 = z5;
                                                    j9 = j7;
                                                    c1603tG2 = c1603tG;
                                                    j10 = l6;
                                                }
                                                long j24 = ee.f8491r;
                                                a5 = c1332nE.a(c1603tG, j24, j7, j24, z5, 2);
                                                c1332nE.f14609H = a5;
                                                z3 = true;
                                                c1332nE.k();
                                                return z3;
                                            } catch (Throwable th) {
                                                th = th;
                                                z6 = z5;
                                                c1603tG2 = c1603tG;
                                                j8 = j6;
                                                z7 = z6;
                                                c1332nE.f14609H = c1332nE.a(c1603tG2, j8, j7, j8, z7, 2);
                                                throw th;
                                            }
                                        }
                                        z6 = z5;
                                        j9 = j7;
                                        c1603tG2 = c1603tG;
                                        j10 = j6;
                                        c1332nE.D(abstractC0715Xa, c1603tG3, abstractC0715Xa, ee2.f8477b, j11, true);
                                        c1603tG4 = c1603tG3;
                                        j7 = j11;
                                        j12 = P5;
                                        z9 = z8;
                                        c1332nE = this;
                                        a5 = c1332nE.a(c1603tG4, j12, j7, j12, z9, 2);
                                        c1332nE.f14609H = a5;
                                        z3 = true;
                                        c1332nE.k();
                                        return z3;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c1603tG2 = c1603tG3;
                                        j7 = j11;
                                        j8 = P5;
                                        z7 = z8;
                                        c1332nE.f14609H = c1332nE.a(c1603tG2, j8, j7, j8, z7, 2);
                                        throw th;
                                    }
                                    abstractC0715Xa = ee2.f8476a;
                                    j11 = j9;
                                } catch (Throwable th3) {
                                    th = th3;
                                    c1603tG2 = c1603tG3;
                                    j7 = j9;
                                    j8 = P5;
                                    z7 = z8;
                                    c1332nE.f14609H = c1332nE.a(c1603tG2, j8, j7, j8, z7, 2);
                                    throw th;
                                }
                                ee2 = c1332nE.f14609H;
                                c1603tG3 = c1603tG2;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                            boolean z21 = c1332nE.f14609H.f8480e == 4;
                            C1691vE c1691vE4 = c1332nE.f14602A;
                            P5 = c1332nE.P(c1603tG2, j10, c1691vE4.f15993h != c1691vE4.i, z21);
                            z8 = z6 | (j6 != P5);
                        } catch (Throwable th5) {
                            th = th5;
                            j7 = j9;
                            j8 = j6;
                            z7 = z6;
                            c1332nE.f14609H = c1332nE.a(c1603tG2, j8, j7, j8, z7, 2);
                            throw th;
                        }
                    }
                    z9 = z5;
                    j12 = j6;
                    c1603tG4 = c1603tG;
                    c1332nE = this;
                    a5 = c1332nE.a(c1603tG4, j12, j7, j12, z9, 2);
                    c1332nE.f14609H = a5;
                    z3 = true;
                    c1332nE.k();
                    return z3;
                } catch (Throwable th6) {
                    th = th6;
                    z6 = z5;
                }
                break;
            case 4:
                Y7 y7 = (Y7) message.obj;
                c1332nE.f14636r.f15040a.removeMessages(16);
                c1332nE.f14642x.b(y7);
                Y7 i22 = c1332nE.f14642x.i();
                c1332nE.g(i22, i22.f12280a, true, true);
                z3 = true;
                c1332nE.k();
                return z3;
            case 5:
                c1332nE.f14608G = (LE) message.obj;
                z3 = true;
                c1332nE.k();
                return z3;
            case 6:
                c1332nE.y(false, true);
                z3 = true;
                c1332nE.k();
                return z3;
            case 7:
                try {
                    c1332nE.p(true, false, true, false);
                    for (int i23 = 0; i23 < 2; i23++) {
                        c1332nE.f14630l[i23].h0();
                        c1332nE.f14629k[i23].c();
                    }
                    c1332nE.f14634p.h(c1332nE.f14605D);
                    c1332nE.w(1);
                    c1332nE.f14637s.g();
                    synchronized (this) {
                        c1332nE.J = true;
                        c1332nE.notifyAll();
                    }
                    return true;
                } catch (Throwable th7) {
                    c1332nE.f14637s.g();
                    synchronized (this) {
                        c1332nE.J = true;
                        c1332nE.notifyAll();
                        throw th7;
                    }
                }
            case 8:
                InterfaceC1558sG interfaceC1558sG = (InterfaceC1558sG) message.obj;
                C1691vE c1691vE5 = c1332nE.f14602A;
                C1601tE c1601tE5 = c1691vE5.f15994j;
                if (!(c1601tE5 != null && c1601tE5.f15651a == interfaceC1558sG)) {
                    C1601tE o5 = c1691vE5.o(interfaceC1558sG);
                    if (o5 != null) {
                        AbstractC1668us.a0(!o5.f15655e);
                        float f5 = c1332nE.f14642x.i().f12280a;
                        o5.g(c1332nE.f14609H.f8476a);
                        C1601tE c1601tE6 = c1332nE.f14602A.f15995k;
                        if (c1601tE6 != null && c1601tE6.f15651a == interfaceC1558sG) {
                            c1332nE.j();
                        }
                    }
                } else {
                    if (c1601tE5 == null) {
                        throw null;
                    }
                    if (!c1601tE5.f15655e) {
                        float f6 = c1332nE.f14642x.i().f12280a;
                        c1601tE5.g(c1332nE.f14609H.f8476a);
                    }
                    c1332nE.B(c1601tE5.d(), c1601tE5.e());
                    if (c1601tE5 == c1332nE.f14602A.n()) {
                        c1332nE.r(c1601tE5.f15656g.f15817b);
                        c1332nE.c(new boolean[2], c1332nE.f14602A.i.c());
                        EE ee5 = c1332nE.f14609H;
                        C1603tG c1603tG9 = ee5.f8477b;
                        long j25 = c1601tE5.f15656g.f15817b;
                        c1332nE.f14609H = c1332nE.a(c1603tG9, j25, ee5.f8478c, j25, false, 5);
                    }
                    c1332nE.i();
                }
                z3 = true;
                c1332nE.k();
                return z3;
            case 9:
                InterfaceC1558sG interfaceC1558sG2 = (InterfaceC1558sG) message.obj;
                C1691vE c1691vE6 = c1332nE.f14602A;
                C1601tE c1601tE7 = c1691vE6.f15994j;
                if (c1601tE7 != null && c1601tE7.f15651a == interfaceC1558sG2) {
                    long j26 = c1332nE.f14620U;
                    if (c1601tE7 != null) {
                        AbstractC1668us.a0(c1601tE7.f15661m == null);
                        if (c1601tE7.f15655e) {
                            c1601tE7.f15651a.a(j26 - c1601tE7.f15664p);
                        }
                    }
                    c1332nE.i();
                } else {
                    C1601tE c1601tE8 = c1691vE6.f15995k;
                    if (c1601tE8 != null && c1601tE8.f15651a == interfaceC1558sG2) {
                        c1332nE.j();
                    }
                }
                z3 = true;
                c1332nE.k();
                return z3;
            case 10:
                c1332nE.o();
                z3 = true;
                c1332nE.k();
                return z3;
            case 11:
                int i24 = message.arg1;
                c1332nE.f14615P = i24;
                if (!c1332nE.f14602A.A(c1332nE.f14609H.f8476a, i24)) {
                    c1332nE.u(true);
                }
                c1332nE.e(false);
                z3 = true;
                c1332nE.k();
                return z3;
            case 12:
                boolean z22 = message.arg1 != 0;
                c1332nE.f14616Q = z22;
                if (!c1332nE.f14602A.B(c1332nE.f14609H.f8476a, z22)) {
                    c1332nE.u(true);
                }
                c1332nE.e(false);
                z3 = true;
                c1332nE.k();
                return z3;
            case 13:
                boolean z23 = message.arg1 != 0;
                AtomicBoolean atomicBoolean = (AtomicBoolean) message.obj;
                if (c1332nE.f14617R != z23) {
                    c1332nE.f14617R = z23;
                    if (!z23) {
                        C0001a[] c0001aArr7 = c1332nE.f14629k;
                        for (int i25 = 0; i25 < 2; i25++) {
                            C0001a c0001a5 = c0001aArr7[i25];
                            if (c0001a5.a() == 0) {
                                c0001a5.f();
                            }
                        }
                    }
                }
                if (atomicBoolean != null) {
                    synchronized (this) {
                        atomicBoolean.set(true);
                        c1332nE.notifyAll();
                    }
                }
                z3 = true;
                c1332nE.k();
                return z3;
            case 14:
                HE he = (HE) message.obj;
                if (he.f9341d == c1332nE.f14638t) {
                    J(he);
                    int i26 = c1332nE.f14609H.f8480e;
                    if (i26 == 3 || i26 == 2) {
                        c1332nE.f14636r.c(2);
                    }
                } else {
                    c1332nE.f14636r.a(15, he).a();
                }
                z3 = true;
                c1332nE.k();
                return z3;
            case 15:
                HE he2 = (HE) message.obj;
                Looper looper = he2.f9341d;
                if (looper.getThread().isAlive()) {
                    c1332nE.f14644z.a(looper, null).b(new RunnableC1303mm(18, he2));
                } else {
                    JB.l("TAG", "Trying to send message on a dead thread.");
                    he2.a(false);
                }
                z3 = true;
                c1332nE.k();
                return z3;
            case 16:
                Y7 y72 = (Y7) message.obj;
                c1332nE.g(y72, y72.f12280a, true, false);
                z3 = true;
                c1332nE.k();
                return z3;
            case 17:
                C1197kE c1197kE = (C1197kE) message.obj;
                c1332nE.f14610I.a(1);
                if (c1197kE.f14230b != -1) {
                    JE je = new JE(c1197kE.f14229a, c1197kE.f14232d);
                    int i27 = c1197kE.f14230b;
                    j15 = c1197kE.f14231c;
                    c1332nE.f14619T = new C1287mE(je, i27, j15);
                }
                c1332nE.f(c1332nE.f14603B.h(c1197kE.f14229a, c1197kE.f14232d), false);
                z3 = true;
                c1332nE.k();
                return z3;
            case 18:
                C1197kE c1197kE2 = (C1197kE) message.obj;
                int i28 = message.arg1;
                c1332nE.f14610I.a(1);
                C1170jo c1170jo = c1332nE.f14603B;
                if (i28 == -1) {
                    i28 = ((ArrayList) c1170jo.f14146m).size();
                }
                c1332nE.f(c1170jo.f(i28, c1197kE2.f14229a, c1197kE2.f14232d), false);
                z3 = true;
                c1332nE.k();
                return z3;
            case 19:
                L1.a.t(message.obj);
                c1332nE.f14610I.a(1);
                throw null;
            case 20:
                int i29 = message.arg1;
                int i30 = message.arg2;
                PG pg = (PG) message.obj;
                c1332nE.f14610I.a(1);
                c1332nE.f(c1332nE.f14603B.g(i29, i30, pg), false);
                z3 = true;
                c1332nE.k();
                return z3;
            case C1639u7.zzm /* 21 */:
                PG pg2 = (PG) message.obj;
                c1332nE.f14610I.a(1);
                c1332nE.f(c1332nE.f14603B.i(pg2), false);
                z3 = true;
                c1332nE.k();
                return z3;
            case 22:
                c1332nE.f(c1332nE.f14603B.a(), true);
                z3 = true;
                c1332nE.k();
                return z3;
            case 23:
                c1332nE.K = message.arg1 != 0;
                c1332nE.q();
                if (c1332nE.f14611L && c1332nE.f14602A.p() != c1332nE.f14602A.n()) {
                    c1332nE.u(true);
                    c1332nE.e(false);
                }
                z3 = true;
                c1332nE.k();
                return z3;
            case 24:
            default:
                return false;
            case 25:
                c1332nE.o();
                c1332nE.u(true);
                z3 = true;
                c1332nE.k();
                return z3;
            case 26:
                c1332nE.o();
                c1332nE.u(true);
                z3 = true;
                c1332nE.k();
                return z3;
            case 27:
                int i31 = message.arg1;
                int i32 = message.arg2;
                List list = (List) message.obj;
                c1332nE.f14610I.a(1);
                c1332nE.f(c1332nE.f14603B.b(i31, i32, list), false);
                z3 = true;
                c1332nE.k();
                return z3;
            case 28:
                ZD zd = (ZD) message.obj;
                c1332nE.f14626a0 = zd;
                C1691vE c1691vE7 = c1332nE.f14602A;
                AbstractC0715Xa abstractC0715Xa4 = c1332nE.f14609H.f8476a;
                c1691vE7.w(zd);
                z3 = true;
                c1332nE.k();
                return z3;
            case 29:
                c1332nE.f14610I.a(1);
                c1332nE.p(false, false, false, true);
                c1332nE.f14634p.b(c1332nE.f14605D);
                c1332nE.w(true != c1332nE.f14609H.f8476a.o() ? 2 : 4);
                C1170jo c1170jo2 = c1332nE.f14603B;
                C1514rH c1514rH = c1332nE.f14635q;
                c1514rH.getClass();
                c1170jo2.c(c1514rH);
                c1332nE.f14636r.c(2);
                z3 = true;
                c1332nE.k();
                return z3;
            case 30:
                Pair pair = (Pair) message.obj;
                Object obj2 = pair.first;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) pair.second;
                C0001a[] c0001aArr8 = c1332nE.f14629k;
                for (int i33 = 0; i33 < 2; i33++) {
                    c0001aArr8[i33].g(obj2);
                }
                if (atomicBoolean2 != null) {
                    synchronized (this) {
                        atomicBoolean2.set(true);
                        c1332nE.notifyAll();
                    }
                }
                z3 = true;
                c1332nE.k();
                return z3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00dc  */
    /* JADX WARN: Type inference failed for: r1v16, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [com.google.android.gms.internal.ads.OG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.google.android.gms.internal.ads.OG, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        boolean a5;
        boolean z3;
        long j5 = -9223372036854775807L;
        if (K(this.f14602A.f15994j)) {
            C1601tE c1601tE = this.f14602A.f15994j;
            long O5 = O(!c1601tE.f15655e ? 0L : c1601tE.f15651a.i());
            C1601tE c1601tE2 = this.f14602A.f15993h;
            long j6 = I(this.f14609H.f8476a, c1601tE.f15656g.f15816a) ? this.f14628c0.f11756h : -9223372036854775807L;
            ZE ze = this.f14605D;
            AbstractC0715Xa abstractC0715Xa = this.f14609H.f8476a;
            float f = this.f14642x.i().f12280a;
            boolean z5 = this.f14609H.f8485l;
            C1377oE c1377oE = new C1377oE(ze, O5, f, this.f14612M, j6);
            a5 = this.f14634p.a(c1377oE);
            C1601tE c1601tE3 = this.f14602A.f15993h;
            if (!a5 && c1601tE3.f15655e && O5 < 500000 && this.f14641w > 0) {
                c1601tE3.f15651a.e(this.f14609H.f8491r);
                a5 = this.f14634p.a(c1377oE);
            }
        } else {
            a5 = false;
        }
        this.f14614O = a5;
        if (a5) {
            C1601tE c1601tE4 = this.f14602A.f15994j;
            c1601tE4.getClass();
            C1467qE c1467qE = new C1467qE();
            c1467qE.f15113a = this.f14620U - c1601tE4.f15664p;
            float f5 = this.f14642x.i().f12280a;
            AbstractC1668us.S(f5 > 0.0f || f5 == -3.4028235E38f);
            c1467qE.f15114b = f5;
            long j7 = this.f14613N;
            if (j7 >= 0) {
                j5 = j7;
            } else if (j7 != -9223372036854775807L) {
                z3 = false;
                j5 = j7;
                AbstractC1668us.S(z3);
                c1467qE.f15115c = j5;
                C1511rE c1511rE = new C1511rE(c1467qE);
                AbstractC1668us.a0(c1601tE4.f15661m == null);
                c1601tE4.f15651a.m(c1511rE);
            }
            z3 = true;
            AbstractC1668us.S(z3);
            c1467qE.f15115c = j5;
            C1511rE c1511rE2 = new C1511rE(c1467qE);
            AbstractC1668us.a0(c1601tE4.f15661m == null);
            c1601tE4.f15651a.m(c1511rE2);
        }
        A();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.OG, com.google.android.gms.internal.ads.sG, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        boolean z3;
        C1691vE c1691vE = this.f14602A;
        c1691vE.u();
        C1601tE c1601tE = c1691vE.f15995k;
        if (c1601tE != null) {
            if (!c1601tE.f15654d || c1601tE.f15655e) {
                ?? r1 = c1601tE.f15651a;
                if (r1.r()) {
                    return;
                }
                AbstractC0715Xa abstractC0715Xa = this.f14609H.f8476a;
                if (c1601tE.f15655e) {
                    r1.d();
                }
                if (this.f14634p.e()) {
                    if (!c1601tE.f15654d) {
                        C1646uE c1646uE = c1601tE.f15656g;
                        c1601tE.f15654d = true;
                        r1.f(this, c1646uE.f15817b);
                        return;
                    }
                    C1467qE c1467qE = new C1467qE();
                    c1467qE.f15113a = this.f14620U - c1601tE.f15664p;
                    float f = this.f14642x.i().f12280a;
                    AbstractC1668us.S(f > 0.0f || f == -3.4028235E38f);
                    c1467qE.f15114b = f;
                    long j5 = this.f14613N;
                    if (j5 < 0) {
                        if (j5 != -9223372036854775807L) {
                            z3 = false;
                            AbstractC1668us.S(z3);
                            c1467qE.f15115c = j5;
                            C1511rE c1511rE = new C1511rE(c1467qE);
                            AbstractC1668us.a0(c1601tE.f15661m == null);
                            r1.m(c1511rE);
                        }
                        j5 = -9223372036854775807L;
                    }
                    z3 = true;
                    AbstractC1668us.S(z3);
                    c1467qE.f15115c = j5;
                    C1511rE c1511rE2 = new C1511rE(c1467qE);
                    AbstractC1668us.a0(c1601tE.f15661m == null);
                    r1.m(c1511rE2);
                }
            }
        }
    }

    public final void k() {
        T2 t22 = this.f14610I;
        EE ee = this.f14609H;
        boolean z3 = t22.f11615a | (((EE) t22.f11619e) != ee);
        t22.f11615a = z3;
        t22.f11619e = ee;
        if (z3) {
            C1109iE c1109iE = (C1109iE) this.f14627b0.f11130k;
            c1109iE.getClass();
            c1109iE.f13919t.b(new RunnableC1081hn(14, c1109iE, t22));
            this.f14610I = new T2(this.f14609H);
        }
    }

    public final void l(int i) {
        C0001a c0001a = this.f14629k[i];
        try {
            NG ng = ((RF) c0001a.f33c).f11404s;
            ng.getClass();
            ng.j();
        } catch (IOException | RuntimeException e3) {
            int i5 = ((RF) c0001a.f33c).f11390l;
            throw e3;
        }
    }

    public final void m(int i, boolean z3) {
        boolean[] zArr = this.f14631m;
        if (zArr[i] != z3) {
            zArr[i] = z3;
            this.f14607F.b(new RunnableC0920e5(this, i, z3));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1513rG
    public final void n(InterfaceC1558sG interfaceC1558sG) {
        this.f14636r.a(8, interfaceC1558sG).a();
    }

    public final void o() {
        int i;
        int i5;
        float f = this.f14642x.i().f12280a;
        C1691vE c1691vE = this.f14602A;
        C1601tE c1601tE = c1691vE.f15993h;
        C1601tE c1601tE2 = c1691vE.i;
        C1245lH c1245lH = null;
        C1601tE c1601tE3 = c1601tE;
        boolean z3 = true;
        while (c1601tE3 != null && c1601tE3.f15655e) {
            C1245lH f5 = c1601tE3.f(this.f14609H.f8476a);
            C1245lH c1245lH2 = c1601tE3 == this.f14602A.f15993h ? f5 : c1245lH;
            C1245lH c1245lH3 = c1601tE3.f15663o;
            boolean z5 = false;
            if (c1245lH3 != null) {
                if (((InterfaceC1200kH[]) c1245lH3.f14378m).length == ((InterfaceC1200kH[]) f5.f14378m).length) {
                    for (int i6 = 0; i6 < ((InterfaceC1200kH[]) f5.f14378m).length; i6++) {
                        if (f5.a(c1245lH3, i6)) {
                        }
                    }
                    if (c1601tE3 != c1601tE2) {
                        z5 = true;
                    }
                    z3 &= z5;
                    c1601tE3 = c1601tE3.f15661m;
                    c1245lH = c1245lH2;
                }
            }
            if (z3) {
                C1691vE c1691vE2 = this.f14602A;
                C1601tE c1601tE4 = c1691vE2.f15993h;
                boolean x5 = c1691vE2.x(c1601tE4);
                boolean[] zArr = new boolean[2];
                c1245lH2.getClass();
                long a5 = c1601tE4.a(c1245lH2, this.f14609H.f8491r, x5, zArr);
                EE ee = this.f14609H;
                boolean z6 = (ee.f8480e == 4 || a5 == ee.f8491r) ? false : true;
                EE ee2 = this.f14609H;
                i5 = 2;
                i = 4;
                this.f14609H = a(ee2.f8477b, a5, ee2.f8478c, ee2.f8479d, z6, 5);
                if (z6) {
                    r(a5);
                }
                boolean[] zArr2 = new boolean[2];
                int i7 = 0;
                while (true) {
                    C0001a[] c0001aArr = this.f14629k;
                    if (i7 >= 2) {
                        break;
                    }
                    int a6 = c0001aArr[i7].a();
                    zArr2[i7] = 1 == a6;
                    if (a6 != 0) {
                        if (!this.f14629k[i7].k(c1601tE4)) {
                            b(i7);
                        } else if (zArr[i7]) {
                            C0001a c0001a = this.f14629k[i7];
                            long j5 = this.f14620U;
                            RF rf = (RF) c0001a.f33c;
                            if (C0001a.l(rf)) {
                                rf.f11414x = false;
                                rf.f11410v = j5;
                                rf.f11412w = j5;
                                rf.l0(j5, false);
                            }
                        }
                    }
                    i7++;
                }
                c(zArr2, this.f14620U);
            } else {
                i = 4;
                i5 = 2;
                this.f14602A.x(c1601tE3);
                if (c1601tE3.f15655e) {
                    c1601tE3.a(f5, Math.max(c1601tE3.f15656g.f15817b, this.f14620U - c1601tE3.f15664p), false, new boolean[2]);
                }
            }
            e(true);
            if (this.f14609H.f8480e != i) {
                i();
                C();
                this.f14636r.c(i5);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z3, boolean z5, boolean z6, boolean z7) {
        long j5;
        boolean z8;
        AbstractC0715Xa abstractC0715Xa;
        C1603tG c1603tG;
        AbstractC0715Xa abstractC0715Xa2;
        List list;
        boolean z9 = true;
        this.f14636r.f15040a.removeMessages(2);
        this.f14624Y = null;
        E(false, true);
        Fp fp = this.f14642x;
        fp.f9122l = false;
        NE ne = (NE) fp.f9123m;
        if (ne.f10784k) {
            ne.c(ne.a());
            ne.f10784k = false;
        }
        this.f14620U = 1000000000000L;
        for (int i = 0; i < 2; i++) {
            try {
                b(i);
            } catch (RuntimeException e3) {
                JB.g("ExoPlayerImplInternal", "Disable failed.", e3);
            }
        }
        if (z3) {
            C0001a[] c0001aArr = this.f14629k;
            for (int i5 = 0; i5 < 2; i5++) {
                try {
                    c0001aArr[i5].f();
                } catch (RuntimeException e5) {
                    JB.g("ExoPlayerImplInternal", "Reset failed.", e5);
                }
            }
        }
        this.f14618S = 0;
        EE ee = this.f14609H;
        C1603tG c1603tG2 = ee.f8477b;
        long j6 = ee.f8491r;
        if (!this.f14609H.f8477b.b()) {
            EE ee2 = this.f14609H;
            C1785xa c1785xa = this.f14640v;
            C1603tG c1603tG3 = ee2.f8477b;
            AbstractC0715Xa abstractC0715Xa3 = ee2.f8476a;
            if (!abstractC0715Xa3.o() && !abstractC0715Xa3.n(c1603tG3.f15679a, c1785xa).f16292e) {
                j5 = this.f14609H.f8491r;
                if (z5) {
                    this.f14619T = null;
                    Pair Q5 = Q(this.f14609H.f8476a);
                    c1603tG2 = (C1603tG) Q5.first;
                    j6 = ((Long) Q5.second).longValue();
                    j5 = -9223372036854775807L;
                    if (!c1603tG2.equals(this.f14609H.f8477b)) {
                        z8 = true;
                        long j7 = j6;
                        long j8 = j5;
                        this.f14602A.t();
                        this.f14614O = false;
                        abstractC0715Xa = this.f14609H.f8476a;
                        if (z6 || !(abstractC0715Xa instanceof JE)) {
                            c1603tG = c1603tG2;
                            abstractC0715Xa2 = abstractC0715Xa;
                        } else {
                            JE je = (JE) abstractC0715Xa;
                            PG pg = (PG) this.f14603B.f14155v;
                            AbstractC0715Xa[] abstractC0715XaArr = je.f9921h;
                            AbstractC0715Xa[] abstractC0715XaArr2 = new AbstractC0715Xa[abstractC0715XaArr.length];
                            int i6 = 0;
                            while (i6 < abstractC0715XaArr.length) {
                                abstractC0715XaArr2[i6] = new IE(abstractC0715XaArr[i6]);
                                i6++;
                                z9 = z9;
                            }
                            JE je2 = new JE(abstractC0715XaArr2, je.i, pg);
                            if (c1603tG2.f15680b != -1) {
                                je2.n(c1603tG2.f15679a, this.f14640v);
                                C1785xa c1785xa2 = this.f14640v;
                                C0603Ha c0603Ha = this.f14639u;
                                je2.e(c1785xa2.f16290c, c0603Ha, 0L);
                                if (c0603Ha.b()) {
                                    abstractC0715Xa2 = je2;
                                    c1603tG = new C1603tG(c1603tG2.f15679a, c1603tG2.f15682d);
                                }
                            }
                            abstractC0715Xa2 = je2;
                            c1603tG = c1603tG2;
                        }
                        EE ee3 = this.f14609H;
                        int i7 = ee3.f8480e;
                        XD xd = z7 ? null : ee3.f;
                        TG tg = z8 ? TG.f11645d : ee3.f8482h;
                        C1245lH c1245lH = z8 ? this.f14633o : ee3.i;
                        if (z8) {
                            C0954ev c0954ev = AbstractC1044gv.f13676l;
                            list = C1761wv.f16184o;
                        } else {
                            list = ee3.f8483j;
                        }
                        this.f14609H = new EE(abstractC0715Xa2, c1603tG, j8, j7, i7, xd, false, tg, c1245lH, list, c1603tG, ee3.f8485l, ee3.f8486m, ee3.f8487n, ee3.f8488o, j7, 0L, j7, 0L);
                        if (z6) {
                            this.f14602A.v();
                            C1170jo c1170jo = this.f14603B;
                            HashMap hashMap = (HashMap) c1170jo.f14150q;
                            for (BE be : hashMap.values()) {
                                try {
                                    be.f7796a.l(be.f7797b);
                                } catch (RuntimeException e6) {
                                    JB.g("MediaSourceList", "Failed to release child source.", e6);
                                }
                                ZF zf = be.f7796a;
                                AE ae = be.f7798c;
                                zf.o(ae);
                                be.f7796a.n(ae);
                            }
                            hashMap.clear();
                            ((HashSet) c1170jo.f14151r).clear();
                            c1170jo.f14144k = false;
                            return;
                        }
                        return;
                    }
                }
                z8 = false;
                long j72 = j6;
                long j82 = j5;
                this.f14602A.t();
                this.f14614O = false;
                abstractC0715Xa = this.f14609H.f8476a;
                if (z6) {
                }
                c1603tG = c1603tG2;
                abstractC0715Xa2 = abstractC0715Xa;
                EE ee32 = this.f14609H;
                int i72 = ee32.f8480e;
                XD xd2 = z7 ? null : ee32.f;
                TG tg2 = z8 ? TG.f11645d : ee32.f8482h;
                C1245lH c1245lH2 = z8 ? this.f14633o : ee32.i;
                if (z8) {
                }
                this.f14609H = new EE(abstractC0715Xa2, c1603tG, j82, j72, i72, xd2, false, tg2, c1245lH2, list, c1603tG, ee32.f8485l, ee32.f8486m, ee32.f8487n, ee32.f8488o, j72, 0L, j72, 0L);
                if (z6) {
                }
            }
        }
        j5 = this.f14609H.f8478c;
        if (z5) {
        }
        z8 = false;
        long j722 = j6;
        long j822 = j5;
        this.f14602A.t();
        this.f14614O = false;
        abstractC0715Xa = this.f14609H.f8476a;
        if (z6) {
        }
        c1603tG = c1603tG2;
        abstractC0715Xa2 = abstractC0715Xa;
        EE ee322 = this.f14609H;
        int i722 = ee322.f8480e;
        XD xd22 = z7 ? null : ee322.f;
        TG tg22 = z8 ? TG.f11645d : ee322.f8482h;
        C1245lH c1245lH22 = z8 ? this.f14633o : ee322.i;
        if (z8) {
        }
        this.f14609H = new EE(abstractC0715Xa2, c1603tG, j822, j722, i722, xd22, false, tg22, c1245lH22, list, c1603tG, ee322.f8485l, ee322.f8486m, ee322.f8487n, ee322.f8488o, j722, 0L, j722, 0L);
        if (z6) {
        }
    }

    public final void q() {
        C1601tE c1601tE = this.f14602A.f15993h;
        boolean z3 = false;
        if (c1601tE != null && c1601tE.f15656g.f15821g && this.K) {
            z3 = true;
        }
        this.f14611L = z3;
    }

    public final void r(long j5) {
        C1601tE c1601tE = this.f14602A.f15993h;
        long j6 = j5 + (c1601tE == null ? 1000000000000L : c1601tE.f15664p);
        this.f14620U = j6;
        ((NE) this.f14642x.f9123m).c(j6);
        for (int i = 0; i < 2; i++) {
            C0001a c0001a = this.f14629k[i];
            long j7 = this.f14620U;
            RF rf = (RF) c0001a.f33c;
            if (C0001a.l(rf)) {
                rf.f11414x = false;
                rf.f11410v = j7;
                rf.f11412w = j7;
                rf.l0(j7, false);
            }
        }
        for (C1601tE c1601tE2 = r0.f15993h; c1601tE2 != null; c1601tE2 = c1601tE2.f15661m) {
            for (InterfaceC1200kH interfaceC1200kH : (InterfaceC1200kH[]) c1601tE2.f15663o.f14378m) {
            }
        }
    }

    public final void s(AbstractC0715Xa abstractC0715Xa, AbstractC0715Xa abstractC0715Xa2) {
        if (abstractC0715Xa.o() && abstractC0715Xa2.o()) {
            return;
        }
        ArrayList arrayList = this.f14643y;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            arrayList.get(size).getClass();
            throw new ClassCastException();
        }
    }

    public final void t(long j5) {
        this.f14636r.f15040a.sendEmptyMessageAtTime(2, j5 + ((this.f14609H.f8480e != 3 || H()) ? f14601d0 : 1000L));
    }

    public final void u(boolean z3) {
        C1603tG c1603tG = this.f14602A.f15993h.f15656g.f15816a;
        long P5 = P(c1603tG, this.f14609H.f8491r, true, false);
        if (P5 != this.f14609H.f8491r) {
            EE ee = this.f14609H;
            this.f14609H = a(c1603tG, P5, ee.f8478c, ee.f8479d, z3, 5);
        }
    }

    public final void v(int i, int i5, boolean z3, boolean z5) {
        this.f14610I.a(z5 ? 1 : 0);
        this.f14609H = this.f14609H.c(i5, i, z3);
        E(false, false);
        for (C1601tE c1601tE = this.f14602A.f15993h; c1601tE != null; c1601tE = c1601tE.f15661m) {
            for (InterfaceC1200kH interfaceC1200kH : (InterfaceC1200kH[]) c1601tE.f15663o.f14378m) {
            }
        }
        if (!H()) {
            z();
            C();
            return;
        }
        int i6 = this.f14609H.f8480e;
        C1439pn c1439pn = this.f14636r;
        if (i6 != 3) {
            if (i6 == 2) {
                c1439pn.c(2);
                return;
            }
            return;
        }
        Fp fp = this.f14642x;
        fp.f9122l = true;
        NE ne = (NE) fp.f9123m;
        if (!ne.f10784k) {
            ne.f10786m = SystemClock.elapsedRealtime();
            ne.f10784k = true;
        }
        x();
        c1439pn.c(2);
    }

    public final void w(int i) {
        EE ee = this.f14609H;
        if (ee.f8480e != i) {
            if (i != 2) {
                this.f14625Z = -9223372036854775807L;
            }
            this.f14609H = ee.e(i);
        }
    }

    public final void x() {
        C1601tE c1601tE = this.f14602A.f15993h;
        if (c1601tE == null) {
            return;
        }
        C1245lH c1245lH = c1601tE.f15663o;
        for (int i = 0; i < 2; i++) {
            if (c1245lH.e(i)) {
                RF rf = (RF) this.f14629k[i].f33c;
                int i5 = rf.f11402r;
                if (i5 == 1) {
                    AbstractC1668us.a0(i5 == 1);
                    rf.f11402r = 2;
                    rf.f();
                }
            }
        }
    }

    public final void y(boolean z3, boolean z5) {
        p(z3 || !this.f14617R, false, true, false);
        this.f14610I.a(z5 ? 1 : 0);
        this.f14634p.c(this.f14605D);
        w(1);
    }

    public final void z() {
        int i;
        Fp fp = this.f14642x;
        fp.f9122l = false;
        NE ne = (NE) fp.f9123m;
        if (ne.f10784k) {
            ne.c(ne.a());
            ne.f10784k = false;
        }
        for (int i5 = 0; i5 < 2; i5++) {
            RF rf = (RF) this.f14629k[i5].f33c;
            if (C0001a.l(rf) && (i = rf.f11402r) == 2) {
                AbstractC1668us.a0(i == 2);
                rf.f11402r = 1;
                rf.g();
            }
        }
    }
}
