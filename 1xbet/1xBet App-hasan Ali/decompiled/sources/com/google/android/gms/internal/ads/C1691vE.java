package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.vE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691vE {

    /* renamed from: c, reason: collision with root package name */
    public final SE f15989c;

    /* renamed from: d, reason: collision with root package name */
    public final C1439pn f15990d;

    /* renamed from: e, reason: collision with root package name */
    public long f15991e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15992g;

    /* renamed from: h, reason: collision with root package name */
    public C1601tE f15993h;
    public C1601tE i;

    /* renamed from: j, reason: collision with root package name */
    public C1601tE f15994j;

    /* renamed from: k, reason: collision with root package name */
    public C1601tE f15995k;

    /* renamed from: l, reason: collision with root package name */
    public int f15996l;

    /* renamed from: m, reason: collision with root package name */
    public Object f15997m;

    /* renamed from: n, reason: collision with root package name */
    public long f15998n;

    /* renamed from: p, reason: collision with root package name */
    public final Hq f16000p;

    /* renamed from: a, reason: collision with root package name */
    public final C1785xa f15987a = new C1785xa();

    /* renamed from: b, reason: collision with root package name */
    public final C0603Ha f15988b = new C0603Ha();

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f15999o = new ArrayList();

    public C1691vE(SE se, C1439pn c1439pn, Hq hq, ZD zd) {
        this.f15989c = se;
        this.f15990d = c1439pn;
        this.f16000p = hq;
    }

    public static C1603tG f(AbstractC0715Xa abstractC0715Xa, Object obj, long j5, C0603Ha c0603Ha, C1785xa c1785xa) {
        abstractC0715Xa.n(obj, c1785xa);
        abstractC0715Xa.e(c1785xa.f16290c, c0603Ha, 0L);
        abstractC0715Xa.a(obj);
        c1785xa.f.getClass();
        abstractC0715Xa.n(obj, c1785xa);
        c1785xa.f.a(-1);
        int i = C0736a.f;
        return new C1603tG(-1, j5, obj);
    }

    public final boolean A(AbstractC0715Xa abstractC0715Xa, int i) {
        this.f = i;
        return j(abstractC0715Xa);
    }

    public final boolean B(AbstractC0715Xa abstractC0715Xa, boolean z3) {
        this.f15992g = z3;
        return j(abstractC0715Xa);
    }

    public final long a(Object obj) {
        for (int i = 0; i < this.f15999o.size(); i++) {
            C1601tE c1601tE = (C1601tE) this.f15999o.get(i);
            if (c1601tE.f15652b.equals(obj)) {
                return c1601tE.f15656g.f15816a.f15682d;
            }
        }
        return -1L;
    }

    public final C1646uE b(AbstractC0715Xa abstractC0715Xa, C1601tE c1601tE, long j5) {
        int i;
        AbstractC0715Xa abstractC0715Xa2;
        long j6;
        C1785xa c1785xa;
        long j7;
        int i5;
        Object obj;
        long j8;
        long j9;
        long j10;
        long a5;
        C1646uE c1646uE = c1601tE.f15656g;
        long j11 = (c1601tE.f15664p + c1646uE.f15820e) - j5;
        boolean z3 = c1646uE.f;
        C1785xa c1785xa2 = this.f15987a;
        long j12 = c1646uE.f15818c;
        C1603tG c1603tG = c1646uE.f15816a;
        if (z3) {
            int i6 = abstractC0715Xa.i(abstractC0715Xa.a(c1603tG.f15679a), this.f15987a, this.f15988b, this.f, this.f15992g);
            if (i6 != -1) {
                int i7 = abstractC0715Xa.d(i6, c1785xa2, true).f16290c;
                Object obj2 = c1785xa2.f16289b;
                obj2.getClass();
                if (abstractC0715Xa.e(i7, this.f15988b, 0L).f9405k == i6) {
                    Pair m5 = abstractC0715Xa.m(this.f15988b, this.f15987a, i7, -9223372036854775807L, Math.max(0L, j11));
                    if (m5 != null) {
                        Object obj3 = m5.first;
                        long longValue = ((Long) m5.second).longValue();
                        C1601tE c1601tE2 = c1601tE.f15661m;
                        if (c1601tE2 == null || !c1601tE2.f15652b.equals(obj3)) {
                            a5 = a(obj3);
                            if (a5 == -1) {
                                a5 = this.f15991e;
                                this.f15991e = 1 + a5;
                            }
                        } else {
                            a5 = c1601tE2.f15656g.f15816a.f15682d;
                        }
                        j9 = -9223372036854775807L;
                        j10 = longValue;
                        obj = obj3;
                        j8 = a5;
                    }
                } else {
                    obj = obj2;
                    j8 = c1603tG.f15682d;
                    j9 = 0;
                    j10 = 0;
                }
                C1603tG f = f(abstractC0715Xa, obj, j8, this.f15988b, this.f15987a);
                if (j9 != -9223372036854775807L && j12 != -9223372036854775807L) {
                    abstractC0715Xa.n(c1603tG.f15679a, c1785xa2).f.getClass();
                    c1785xa2.f.getClass();
                }
                return c(abstractC0715Xa, f, j9, j10);
            }
            return null;
        }
        abstractC0715Xa.n(c1603tG.f15679a, c1785xa2);
        boolean b3 = c1603tG.b();
        Object obj4 = c1603tG.f15679a;
        if (!b3) {
            int i8 = c1603tG.f15683e;
            if (i8 != -1) {
                c1785xa2.f.getClass();
                if (i8 == -1) {
                    c1785xa2.f.a(-1);
                    int i9 = C0736a.f;
                }
            }
            C0736a a6 = c1785xa2.f.a(i8);
            int i10 = 0;
            while (true) {
                int[] iArr = a6.f12552d;
                if (i10 >= iArr.length || (i = iArr[i10]) == 0 || i == 1) {
                    break;
                }
                i10++;
            }
            c1785xa2.c(i8);
            if (i10 != c1785xa2.f.a(i8).f12549a) {
                return d(abstractC0715Xa, c1603tG.f15679a, c1603tG.f15683e, i10, c1646uE.f15820e, c1603tG.f15682d);
            }
            abstractC0715Xa.n(obj4, c1785xa2);
            c1785xa2.f.a(i8).getClass();
            c1785xa2.f.a(i8).getClass();
            return e(abstractC0715Xa, c1603tG.f15679a, 0L, c1646uE.f15820e, c1603tG.f15682d);
        }
        C0832c6 c0832c6 = c1785xa2.f;
        int i11 = c1603tG.f15680b;
        if (c0832c6.a(i11).f12549a == -1) {
            return null;
        }
        C0736a a7 = c1785xa2.f.a(i11);
        int i12 = c1603tG.f15681c;
        do {
            i12++;
            int[] iArr2 = a7.f12552d;
            if (i12 >= iArr2.length || (i5 = iArr2[i12]) == 0) {
                break;
            }
        } while (i5 != 1);
        if (i12 < 0) {
            return d(abstractC0715Xa, c1603tG.f15679a, i11, i12, c1646uE.f15818c, c1603tG.f15682d);
        }
        if (j12 == -9223372036854775807L) {
            int i13 = c1785xa2.f16290c;
            long max = Math.max(0L, j11);
            abstractC0715Xa2 = abstractC0715Xa;
            c1785xa = c1785xa2;
            j6 = 0;
            Pair m6 = abstractC0715Xa2.m(this.f15988b, c1785xa, i13, -9223372036854775807L, max);
            if (m6 == null) {
                return null;
            }
            j7 = ((Long) m6.second).longValue();
        } else {
            abstractC0715Xa2 = abstractC0715Xa;
            j6 = 0;
            c1785xa = c1785xa2;
            j7 = j12;
        }
        abstractC0715Xa2.n(obj4, c1785xa);
        C0832c6 c0832c62 = c1785xa.f;
        int i14 = c1603tG.f15680b;
        c0832c62.a(i14).getClass();
        c1785xa.f.a(i14).getClass();
        return e(abstractC0715Xa2, c1603tG.f15679a, Math.max(j6, j7), c1646uE.f15818c, c1603tG.f15682d);
    }

    public final C1646uE c(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG, long j5, long j6) {
        abstractC0715Xa.n(c1603tG.f15679a, this.f15987a);
        return c1603tG.b() ? d(abstractC0715Xa, c1603tG.f15679a, c1603tG.f15680b, c1603tG.f15681c, j5, c1603tG.f15682d) : e(abstractC0715Xa, c1603tG.f15679a, j6, j5, c1603tG.f15682d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r4.f.getClass();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1646uE d(AbstractC0715Xa abstractC0715Xa, Object obj, int i, int i5, long j5, long j6) {
        int i6;
        C1603tG c1603tG = new C1603tG(obj, i, i5, j6, -1);
        C1785xa c1785xa = this.f15987a;
        long a5 = abstractC0715Xa.n(obj, c1785xa).a(i, i5);
        C0736a a6 = c1785xa.f.a(i);
        int i7 = 0;
        while (true) {
            int[] iArr = a6.f12552d;
            if (i7 >= iArr.length || (i6 = iArr[i7]) == 0 || i6 == 1) {
                break;
            }
            i7++;
        }
        c1785xa.c(i);
        long j7 = 0;
        if (a5 != -9223372036854775807L && a5 <= 0) {
            j7 = Math.max(0L, (-1) + a5);
        }
        return new C1646uE(c1603tG, j7, j5, -9223372036854775807L, a5, false, false, false);
    }

    public final C1646uE e(AbstractC0715Xa abstractC0715Xa, Object obj, long j5, long j6, long j7) {
        C1785xa c1785xa = this.f15987a;
        abstractC0715Xa.n(obj, c1785xa);
        c1785xa.getClass();
        c1785xa.f.getClass();
        C1603tG c1603tG = new C1603tG(-1, j7, obj);
        boolean z3 = !c1603tG.b();
        boolean i = i(abstractC0715Xa, c1603tG);
        boolean h3 = h(abstractC0715Xa, c1603tG, z3);
        long j8 = c1785xa.f16291d;
        return new C1646uE(c1603tG, (j8 == -9223372036854775807L || j5 < j8) ? j5 : Math.max(0L, (-1) + j8), j6, -9223372036854775807L, j8, z3, i, h3);
    }

    public final void g() {
        C0909dv c0909dv = new C0909dv(4);
        for (C1601tE c1601tE = this.f15993h; c1601tE != null; c1601tE = c1601tE.f15661m) {
            c0909dv.a(c1601tE.f15656g.f15816a);
        }
        C1601tE c1601tE2 = this.i;
        this.f15990d.b(new RunnableC1362o(this, c0909dv, c1601tE2 == null ? null : c1601tE2.f15656g.f15816a, 9));
    }

    public final boolean h(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG, boolean z3) {
        int a5 = abstractC0715Xa.a(c1603tG.f15679a);
        if (!abstractC0715Xa.e(abstractC0715Xa.d(a5, this.f15987a, false).f16290c, this.f15988b, 0L).f9402g) {
            if (abstractC0715Xa.i(a5, this.f15987a, this.f15988b, this.f, this.f15992g) == -1 && z3) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(AbstractC0715Xa abstractC0715Xa, C1603tG c1603tG) {
        if (!c1603tG.b() && c1603tG.f15683e == -1) {
            Object obj = c1603tG.f15679a;
            if (abstractC0715Xa.e(abstractC0715Xa.n(obj, this.f15987a).f16290c, this.f15988b, 0L).f9406l == abstractC0715Xa.a(obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(AbstractC0715Xa abstractC0715Xa) {
        AbstractC0715Xa abstractC0715Xa2;
        C1601tE c1601tE;
        C1601tE c1601tE2 = this.f15993h;
        if (c1601tE2 == null) {
            return true;
        }
        int a5 = abstractC0715Xa.a(c1601tE2.f15652b);
        while (true) {
            abstractC0715Xa2 = abstractC0715Xa;
            a5 = abstractC0715Xa2.i(a5, this.f15987a, this.f15988b, this.f, this.f15992g);
            while (true) {
                c1601tE = c1601tE2.f15661m;
                if (c1601tE == null || c1601tE2.f15656g.f) {
                    break;
                }
                c1601tE2 = c1601tE;
            }
            if (a5 == -1 || c1601tE == null || abstractC0715Xa2.a(c1601tE.f15652b) != a5) {
                break;
            }
            c1601tE2 = c1601tE;
            abstractC0715Xa = abstractC0715Xa2;
        }
        boolean x5 = x(c1601tE2);
        c1601tE2.f15656g = r(abstractC0715Xa2, c1601tE2.f15656g);
        return !x5;
    }

    public final C1601tE k() {
        C1601tE c1601tE = this.f15993h;
        if (c1601tE == null) {
            return null;
        }
        if (c1601tE == this.i) {
            this.i = c1601tE.f15661m;
        }
        c1601tE.h();
        int i = this.f15996l - 1;
        this.f15996l = i;
        if (i == 0) {
            this.f15994j = null;
            C1601tE c1601tE2 = this.f15993h;
            this.f15997m = c1601tE2.f15652b;
            this.f15998n = c1601tE2.f15656g.f15816a.f15682d;
        }
        this.f15993h = this.f15993h.f15661m;
        g();
        return this.f15993h;
    }

    public final C1601tE l() {
        C1601tE c1601tE = this.i;
        AbstractC1668us.F(c1601tE);
        this.i = c1601tE.f15661m;
        g();
        C1601tE c1601tE2 = this.i;
        AbstractC1668us.F(c1601tE2);
        return c1601tE2;
    }

    public final C1601tE m(C1646uE c1646uE) {
        C1601tE c1601tE;
        C1601tE c1601tE2 = this.f15994j;
        long j5 = c1646uE.f15817b;
        long j6 = c1601tE2 == null ? 1000000000000L : (c1601tE2.f15664p + c1601tE2.f15656g.f15820e) - j5;
        int i = 0;
        while (true) {
            if (i >= this.f15999o.size()) {
                c1601tE = null;
                break;
            }
            C1646uE c1646uE2 = ((C1601tE) this.f15999o.get(i)).f15656g;
            long j7 = c1646uE2.f15820e;
            if ((j7 == -9223372036854775807L || j7 == c1646uE.f15820e) && c1646uE2.f15817b == j5 && c1646uE2.f15816a.equals(c1646uE.f15816a)) {
                c1601tE = (C1601tE) this.f15999o.remove(i);
                break;
            }
            i++;
        }
        if (c1601tE == null) {
            C1332nE c1332nE = (C1332nE) this.f16000p.f9491l;
            C1425pH k5 = c1332nE.f14634p.k();
            c1332nE.f14626a0.getClass();
            c1601tE = new C1601tE(c1332nE.f14630l, j6, c1332nE.f14632n, k5, c1332nE.f14603B, c1646uE, c1332nE.f14633o);
        } else {
            c1601tE.f15656g = c1646uE;
            c1601tE.f15664p = j6;
        }
        C1601tE c1601tE3 = this.f15994j;
        if (c1601tE3 == null) {
            this.f15993h = c1601tE;
            this.i = c1601tE;
        } else if (c1601tE != c1601tE3.f15661m) {
            c1601tE3.k();
            c1601tE3.f15661m = c1601tE;
        }
        this.f15997m = null;
        this.f15994j = c1601tE;
        this.f15996l++;
        g();
        return c1601tE;
    }

    public final C1601tE n() {
        return this.f15993h;
    }

    public final C1601tE o(InterfaceC1558sG interfaceC1558sG) {
        for (int i = 0; i < this.f15999o.size(); i++) {
            C1601tE c1601tE = (C1601tE) this.f15999o.get(i);
            if (c1601tE.f15651a == interfaceC1558sG) {
                return c1601tE;
            }
        }
        return null;
    }

    public final C1601tE p() {
        return this.i;
    }

    public final C1646uE q(long j5, EE ee) {
        C1601tE c1601tE = this.f15994j;
        return c1601tE == null ? c(ee.f8476a, ee.f8477b, ee.f8478c, ee.f8491r) : b(ee.f8476a, c1601tE, j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1646uE r(AbstractC0715Xa abstractC0715Xa, C1646uE c1646uE) {
        long j5;
        long j6;
        long j7;
        C1603tG c1603tG = c1646uE.f15816a;
        boolean b3 = c1603tG.b();
        int i = c1603tG.f15683e;
        boolean z3 = !b3 && i == -1;
        boolean i5 = i(abstractC0715Xa, c1603tG);
        boolean h3 = h(abstractC0715Xa, c1603tG, z3);
        Object obj = c1603tG.f15679a;
        C1785xa c1785xa = this.f15987a;
        abstractC0715Xa.n(obj, c1785xa);
        long j8 = 0;
        if (c1603tG.b() || i == -1) {
            j5 = -9223372036854775807L;
        } else {
            c1785xa.f.a(i).getClass();
            j5 = 0;
        }
        boolean b5 = c1603tG.b();
        int i6 = c1603tG.f15680b;
        if (b5) {
            j6 = c1785xa.a(i6, c1603tG.f15681c);
        } else {
            if (j5 != -9223372036854775807L) {
                j7 = 0;
                if (!c1603tG.b()) {
                    c1785xa.c(i6);
                } else if (i != -1) {
                    c1785xa.c(i);
                }
                return new C1646uE(c1603tG, c1646uE.f15817b, c1646uE.f15818c, j8, j7, z3, i5, h3);
            }
            j6 = c1785xa.f16291d;
        }
        j7 = j6;
        j8 = j5;
        if (!c1603tG.b()) {
        }
        return new C1646uE(c1603tG, c1646uE.f15817b, c1646uE.f15818c, j8, j7, z3, i5, h3);
    }

    public final C1603tG s(AbstractC0715Xa abstractC0715Xa, Object obj) {
        long a5;
        int a6;
        C1785xa c1785xa = this.f15987a;
        int i = abstractC0715Xa.n(obj, c1785xa).f16290c;
        Object obj2 = this.f15997m;
        if (obj2 == null || (a6 = abstractC0715Xa.a(obj2)) == -1 || abstractC0715Xa.d(a6, c1785xa, false).f16290c != i) {
            C1601tE c1601tE = this.f15993h;
            while (true) {
                if (c1601tE == null) {
                    C1601tE c1601tE2 = this.f15993h;
                    while (true) {
                        if (c1601tE2 != null) {
                            int a7 = abstractC0715Xa.a(c1601tE2.f15652b);
                            if (a7 != -1 && abstractC0715Xa.d(a7, c1785xa, false).f16290c == i) {
                                a5 = c1601tE2.f15656g.f15816a.f15682d;
                                break;
                            }
                            c1601tE2 = c1601tE2.f15661m;
                        } else {
                            a5 = a(obj);
                            if (a5 == -1) {
                                a5 = this.f15991e;
                                this.f15991e = 1 + a5;
                                if (this.f15993h == null) {
                                    this.f15997m = obj;
                                    this.f15998n = a5;
                                }
                            }
                        }
                    }
                } else {
                    if (c1601tE.f15652b.equals(obj)) {
                        a5 = c1601tE.f15656g.f15816a.f15682d;
                        break;
                    }
                    c1601tE = c1601tE.f15661m;
                }
            }
        } else {
            a5 = this.f15998n;
        }
        long j5 = a5;
        abstractC0715Xa.n(obj, c1785xa);
        int i5 = c1785xa.f16290c;
        C0603Ha c0603Ha = this.f15988b;
        abstractC0715Xa.e(i5, c0603Ha, 0L);
        for (int a8 = abstractC0715Xa.a(obj); a8 >= c0603Ha.f9405k; a8--) {
            abstractC0715Xa.d(a8, c1785xa, true);
            c1785xa.f.getClass();
            c1785xa.f.a(-1);
            int i6 = C0736a.f;
        }
        return f(abstractC0715Xa, obj, j5, c0603Ha, this.f15987a);
    }

    public final void t() {
        if (this.f15996l == 0) {
            return;
        }
        C1601tE c1601tE = this.f15993h;
        AbstractC1668us.F(c1601tE);
        this.f15997m = c1601tE.f15652b;
        this.f15998n = c1601tE.f15656g.f15816a.f15682d;
        while (c1601tE != null) {
            c1601tE.h();
            c1601tE = c1601tE.f15661m;
        }
        this.f15993h = null;
        this.f15994j = null;
        this.i = null;
        this.f15996l = 0;
        g();
    }

    public final void u() {
        C1601tE c1601tE = this.f15995k;
        if (c1601tE == null || c1601tE.j()) {
            this.f15995k = null;
            for (int i = 0; i < this.f15999o.size(); i++) {
                C1601tE c1601tE2 = (C1601tE) this.f15999o.get(i);
                if (!c1601tE2.j()) {
                    this.f15995k = c1601tE2;
                    return;
                }
            }
        }
    }

    public final void v() {
        if (this.f15999o.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f15999o.size(); i++) {
            ((C1601tE) this.f15999o.get(i)).h();
        }
        this.f15999o = arrayList;
        this.f15995k = null;
        u();
    }

    public final void w(ZD zd) {
        zd.getClass();
        v();
    }

    public final boolean x(C1601tE c1601tE) {
        AbstractC1668us.F(c1601tE);
        int i = 0;
        if (c1601tE.equals(this.f15994j)) {
            return false;
        }
        this.f15994j = c1601tE;
        boolean z3 = false;
        while (true) {
            c1601tE = c1601tE.f15661m;
            if (c1601tE == null) {
                break;
            }
            if (c1601tE == this.i) {
                this.i = this.f15993h;
                z3 = true;
            }
            c1601tE.h();
            this.f15996l--;
        }
        C1601tE c1601tE2 = this.f15994j;
        c1601tE2.getClass();
        if (c1601tE2.f15661m != null) {
            c1601tE2.k();
            c1601tE2.f15661m = null;
            while (true) {
                C1245lH c1245lH = c1601tE2.f15663o;
                if (i >= c1245lH.f14376k) {
                    break;
                }
                c1245lH.e(i);
                InterfaceC1200kH interfaceC1200kH = ((InterfaceC1200kH[]) c1601tE2.f15663o.f14378m)[i];
                i++;
            }
        }
        g();
        return z3;
    }

    public final boolean y() {
        C1601tE c1601tE = this.f15994j;
        if (c1601tE != null) {
            return !c1601tE.f15656g.f15822h && c1601tE.i() && this.f15994j.f15656g.f15820e != -9223372036854775807L && this.f15996l < 100;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (x(r3) != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0022, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z(AbstractC0715Xa abstractC0715Xa, long j5, long j6) {
        C1646uE c1646uE;
        C1646uE c1646uE2;
        boolean z3;
        boolean z5;
        C1601tE c1601tE = this.f15993h;
        C1601tE c1601tE2 = null;
        while (true) {
            if (c1601tE == null) {
                break;
            }
            C1646uE c1646uE3 = c1601tE.f15656g;
            if (c1601tE2 == null) {
                c1646uE = r(abstractC0715Xa, c1646uE3);
            } else {
                C1646uE b3 = b(abstractC0715Xa, c1601tE2, j5);
                if (b3 == null) {
                    if (!x(c1601tE2)) {
                        break;
                    }
                    return false;
                }
                if (c1646uE3.f15817b != b3.f15817b || !c1646uE3.f15816a.equals(b3.f15816a)) {
                    break;
                }
                c1646uE = b3;
            }
            long j7 = c1646uE.f15818c;
            long j8 = c1646uE3.f15818c;
            if (j8 == j7) {
                c1646uE2 = c1646uE;
                z3 = false;
                z5 = true;
            } else {
                z3 = false;
                z5 = true;
                c1646uE2 = new C1646uE(c1646uE.f15816a, c1646uE.f15817b, j8, c1646uE.f15819d, c1646uE.f15820e, c1646uE.f, c1646uE.f15821g, c1646uE.f15822h);
            }
            c1601tE.f15656g = c1646uE2;
            long j9 = c1646uE3.f15820e;
            if (j9 != -9223372036854775807L) {
                long j10 = c1646uE.f15820e;
                if (j9 != j10) {
                    Object obj = c1601tE.f15651a;
                    if (obj instanceof C0798bG) {
                        long j11 = c1646uE2.f15819d;
                        if (j11 == -9223372036854775807L) {
                            j11 = Long.MIN_VALUE;
                        }
                        ((C0798bG) obj).f12800o = j11;
                    }
                    return (x(c1601tE) || ((c1601tE != this.i || ((j6 > Long.MIN_VALUE ? 1 : (j6 == Long.MIN_VALUE ? 0 : -1)) != 0 && (j6 > ((j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1601tE.f15664p + j10) ? 1 : (j6 == ((j10 > (-9223372036854775807L) ? 1 : (j10 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : c1601tE.f15664p + j10) ? 0 : -1)) < 0)) ? z3 : z5)) ? z3 : z5;
                }
            }
            c1601tE2 = c1601tE;
            c1601tE = c1601tE.f15661m;
        }
    }
}
