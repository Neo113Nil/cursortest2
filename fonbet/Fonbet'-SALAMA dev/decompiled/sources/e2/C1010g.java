package e2;

import A1.X;
import B.v;
import B1.m;
import C0.C0083b;
import E3.AbstractC0167z;
import F1.s;
import H2.o;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import c2.C0796b;
import c2.C0814u;
import c2.C0819z;
import c2.V;
import c2.W;
import c2.Y;
import d6.C0977k;
import f2.C1070b;
import f2.C1074f;
import f2.C1076h;
import f2.C1077i;
import f2.C1078j;
import f2.C1081m;
import f2.C1082n;
import f2.InterfaceC1075g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import u2.D;
import u2.F;
import u2.H;
import u2.I;
import u2.InterfaceC1636m;
import u2.K;
import u2.r;
import v2.AbstractC1664a;
import v2.t;
import w1.C1718l0;
import w1.C1719l1;
import w1.V0;

/* renamed from: e2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1010g implements W, Y, F, I {

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f12608B;

    /* renamed from: C, reason: collision with root package name */
    public final List f12609C;

    /* renamed from: D, reason: collision with root package name */
    public final V f12610D;

    /* renamed from: E, reason: collision with root package name */
    public final V[] f12611E;

    /* renamed from: F, reason: collision with root package name */
    public final C0977k f12612F;

    /* renamed from: G, reason: collision with root package name */
    public AbstractC1008e f12613G;

    /* renamed from: H, reason: collision with root package name */
    public X f12614H;

    /* renamed from: I, reason: collision with root package name */
    public C1070b f12615I;

    /* renamed from: J, reason: collision with root package name */
    public long f12616J;

    /* renamed from: K, reason: collision with root package name */
    public long f12617K;

    /* renamed from: L, reason: collision with root package name */
    public int f12618L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f12619M;

    /* renamed from: a, reason: collision with root package name */
    public final int f12620a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f12621b;

    /* renamed from: c, reason: collision with root package name */
    public final X[] f12622c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f12623d;

    /* renamed from: e, reason: collision with root package name */
    public final C1078j f12624e;

    /* renamed from: f, reason: collision with root package name */
    public final C1070b f12625f;

    /* renamed from: x, reason: collision with root package name */
    public final c2.I f12626x;

    /* renamed from: y, reason: collision with root package name */
    public final M4.e f12627y;

    /* renamed from: z, reason: collision with root package name */
    public final K f12628z = new K("ChunkSampleStream");

    /* renamed from: A, reason: collision with root package name */
    public final B3.g f12607A = new B3.g(4);

    public C1010g(int i7, int[] iArr, X[] xArr, C1078j c1078j, C1070b c1070b, r rVar, long j, E1.h hVar, m mVar, M4.e eVar, c2.I i8) {
        this.f12620a = i7;
        this.f12621b = iArr;
        this.f12622c = xArr;
        this.f12624e = c1078j;
        this.f12625f = c1070b;
        this.f12626x = i8;
        this.f12627y = eVar;
        ArrayList arrayList = new ArrayList();
        this.f12608B = arrayList;
        this.f12609C = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12611E = new V[length];
        this.f12623d = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        V[] vArr = new V[i9];
        hVar.getClass();
        V v6 = new V(rVar, hVar, mVar);
        this.f12610D = v6;
        int i10 = 0;
        iArr2[0] = i7;
        vArr[0] = v6;
        while (i10 < length) {
            V v7 = new V(rVar, null, null);
            this.f12611E[i10] = v7;
            int i11 = i10 + 1;
            vArr[i11] = v7;
            iArr2[i11] = this.f12621b[i10];
            i10 = i11;
        }
        this.f12612F = new C0977k(1, iArr2, vArr);
        this.f12616J = j;
        this.f12617K = j;
    }

    @Override // c2.Y
    public final long T() {
        long j;
        if (this.f12619M) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.f12616J;
        }
        long j3 = this.f12617K;
        AbstractC1004a h6 = h();
        if (!h6.b()) {
            ArrayList arrayList = this.f12608B;
            h6 = arrayList.size() > 1 ? (AbstractC1004a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (h6 != null) {
            j3 = Math.max(j3, h6.f12600y);
        }
        V v6 = this.f12610D;
        synchronized (v6) {
            j = v6.f10288v;
        }
        return Math.max(j3, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // c2.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Y(long j) {
        int size;
        K k7 = this.f12628z;
        if (k7.b() || m()) {
            return;
        }
        boolean d7 = k7.d();
        C1078j c1078j = this.f12624e;
        ArrayList arrayList = this.f12608B;
        if (d7) {
            AbstractC1008e abstractC1008e = this.f12613G;
            abstractC1008e.getClass();
            if (abstractC1008e instanceof AbstractC1004a) {
                j(arrayList.size() - 1);
                return;
            }
            return;
        }
        C0796b c0796b = c1078j.f12874l;
        List list = this.f12609C;
        if (c0796b == null) {
            t2.c cVar = c1078j.f12872i;
            if (cVar.f16298c.length >= 2) {
                size = cVar.d(j, list);
                if (size >= arrayList.size()) {
                    AbstractC1664a.h(!k7.d());
                    int size2 = arrayList.size();
                    while (true) {
                        if (size >= size2) {
                            size = -1;
                            break;
                        } else if (!j(size)) {
                            break;
                        } else {
                            size++;
                        }
                    }
                    if (size == -1) {
                        return;
                    }
                    long j3 = h().f12600y;
                    AbstractC1004a f7 = f(size);
                    if (arrayList.isEmpty()) {
                        this.f12616J = this.f12617K;
                    }
                    this.f12619M = false;
                    c2.I i7 = this.f12626x;
                    i7.m(new C0819z(1, this.f12620a, null, 3, null, i7.a(f7.f12599x), i7.a(j3)));
                    return;
                }
                return;
            }
        }
        size = list.size();
        if (size >= arrayList.size()) {
        }
    }

    @Override // u2.I
    public final void a() {
        V v6 = this.f12610D;
        v6.y(true);
        C1719l1 c1719l1 = v6.f10275h;
        if (c1719l1 != null) {
            c1719l1.F(v6.f10272e);
            v6.f10275h = null;
            v6.f10274g = null;
        }
        for (V v7 : this.f12611E) {
            v7.y(true);
            C1719l1 c1719l12 = v7.f10275h;
            if (c1719l12 != null) {
                c1719l12.F(v7.f10272e);
                v7.f10275h = null;
                v7.f10274g = null;
            }
        }
        for (C1076h c1076h : this.f12624e.f12871h) {
            C1007d c1007d = c1076h.f12857a;
            if (c1007d != null) {
                c1007d.f12584a.release();
            }
        }
        C1070b c1070b = this.f12615I;
        if (c1070b != null) {
            synchronized (c1070b) {
                C1081m c1081m = (C1081m) c1070b.f12792E.remove(this);
                if (c1081m != null) {
                    V v8 = c1081m.f12886a;
                    v8.y(true);
                    C1719l1 c1719l13 = v8.f10275h;
                    if (c1719l13 != null) {
                        c1719l13.F(v8.f10272e);
                        v8.f10275h = null;
                        v8.f10274g = null;
                    }
                }
            }
        }
    }

    @Override // c2.W
    public final boolean b() {
        return !m() && this.f12610D.s(this.f12619M);
    }

    @Override // c2.W
    public final void c() {
        K k7 = this.f12628z;
        k7.c();
        this.f12610D.u();
        if (k7.d()) {
            return;
        }
        C1078j c1078j = this.f12624e;
        C0796b c0796b = c1078j.f12874l;
        if (c0796b != null) {
            throw c0796b;
        }
        c1078j.f12864a.c();
    }

    @Override // c2.W
    public final int d(long j) {
        if (m()) {
            return 0;
        }
        V v6 = this.f12610D;
        int p5 = v6.p(j, this.f12619M);
        v6.A(p5);
        n();
        return p5;
    }

    @Override // c2.W
    public final int e(V0 v02, D1.h hVar, int i7) {
        if (m()) {
            return -3;
        }
        V v6 = this.f12610D;
        n();
        return v6.x(v02, hVar, i7, this.f12619M);
    }

    public final AbstractC1004a f(int i7) {
        ArrayList arrayList = this.f12608B;
        AbstractC1004a abstractC1004a = (AbstractC1004a) arrayList.get(i7);
        t.J(arrayList, i7, arrayList.size());
        this.f12618L = Math.max(this.f12618L, arrayList.size());
        int i8 = 0;
        this.f12610D.j(abstractC1004a.c(0));
        while (true) {
            V[] vArr = this.f12611E;
            if (i8 >= vArr.length) {
                return abstractC1004a;
            }
            V v6 = vArr[i8];
            i8++;
            v6.j(abstractC1004a.c(i8));
        }
    }

    @Override // u2.F
    public final void g(H h6, long j, long j3) {
        AbstractC1008e abstractC1008e = (AbstractC1008e) h6;
        this.f12613G = null;
        C1078j c1078j = this.f12624e;
        if (abstractC1008e instanceof C1012i) {
            int i7 = c1078j.f12872i.i(((C1012i) abstractC1008e).f12596d);
            C1076h[] c1076hArr = c1078j.f12871h;
            C1076h c1076h = c1076hArr[i7];
            if (c1076h.f12860d == null) {
                C1007d c1007d = c1076h.f12857a;
                s sVar = c1007d.f12591y;
                F1.f fVar = sVar instanceof F1.f ? (F1.f) sVar : null;
                if (fVar != null) {
                    g2.m mVar = c1076h.f12858b;
                    c1076hArr[i7] = new C1076h(c1076h.f12861e, mVar, c1076h.f12859c, c1007d, c1076h.f12862f, new C0083b(fVar, mVar.f13160c, 8));
                }
            }
        }
        C1081m c1081m = c1078j.f12870g;
        if (c1081m != null) {
            long j7 = c1081m.f12889d;
            if (j7 == -9223372036854775807L || abstractC1008e.f12600y > j7) {
                c1081m.f12889d = abstractC1008e.f12600y;
            }
            c1081m.f12890e.f12897x = true;
        }
        long j8 = abstractC1008e.f12593a;
        Uri uri = abstractC1008e.f12601z.f16755c;
        C0814u c0814u = new C0814u();
        this.f12627y.getClass();
        this.f12626x.f(c0814u, abstractC1008e.f12595c, this.f12620a, abstractC1008e.f12596d, abstractC1008e.f12597e, abstractC1008e.f12598f, abstractC1008e.f12599x, abstractC1008e.f12600y);
        this.f12625f.b(this);
    }

    public final AbstractC1004a h() {
        return (AbstractC1004a) this.f12608B.get(r0.size() - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0257  */
    @Override // u2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q1.e i(H h6, IOException iOException, int i7) {
        ArrayList arrayList;
        int i8;
        AbstractC1008e abstractC1008e;
        C0814u c0814u;
        long j;
        boolean a2;
        C1010g c1010g;
        AbstractC1008e abstractC1008e2;
        Q1.e eVar;
        boolean a4;
        AbstractC1008e abstractC1008e3 = (AbstractC1008e) h6;
        long j3 = abstractC1008e3.f12601z.f16754b;
        boolean z4 = abstractC1008e3 instanceof AbstractC1004a;
        ArrayList arrayList2 = this.f12608B;
        int size = arrayList2.size() - 1;
        boolean z7 = (j3 != 0 && z4 && j(size)) ? false : true;
        Uri uri = abstractC1008e3.f12601z.f16755c;
        C0814u c0814u2 = new C0814u();
        long j7 = abstractC1008e3.f12599x;
        t.N(j7);
        t.N(abstractC1008e3.f12600y);
        v vVar = new v(iOException, i7, 11);
        C1078j c1078j = this.f12624e;
        M4.e eVar2 = this.f12627y;
        if (z7) {
            C1081m c1081m = c1078j.f12870g;
            if (c1081m != null) {
                long j8 = c1081m.f12889d;
                boolean z8 = j8 != -9223372036854775807L && j8 < j7;
                C1082n c1082n = c1081m.f12890e;
                if (c1082n.f12896f.f13112d) {
                    if (!c1082n.f12898y) {
                        if (z8) {
                            if (c1082n.f12897x) {
                                c1082n.f12898y = true;
                                c1082n.f12897x = false;
                                C1074f c1074f = (C1074f) c1082n.f12892b.f6064b;
                                c1074f.f12827D.removeCallbacks(c1074f.f12853w);
                                c1074f.t();
                            }
                        }
                    }
                    abstractC1008e = abstractC1008e3;
                    c0814u = c0814u2;
                    arrayList = arrayList2;
                    i8 = size;
                    a2 = true;
                    if (a2) {
                        c1010g = this;
                        abstractC1008e2 = abstractC1008e;
                    } else {
                        if (z7) {
                            c1010g = this;
                            if (z4) {
                                abstractC1008e2 = abstractC1008e;
                                AbstractC1664a.h(c1010g.f(i8) == abstractC1008e2);
                                if (arrayList.isEmpty()) {
                                    c1010g.f12616J = c1010g.f12617K;
                                }
                            } else {
                                abstractC1008e2 = abstractC1008e;
                            }
                            eVar = K.f16723e;
                            if (eVar == null) {
                                eVar2.getClass();
                                long v6 = M4.e.v(vVar);
                                eVar = v6 != -9223372036854775807L ? new Q1.e(v6, 0, false) : K.f16724f;
                            }
                            Q1.e eVar3 = eVar;
                            a4 = eVar3.a();
                            c1010g.f12626x.h(c0814u, abstractC1008e2.f12595c, c1010g.f12620a, abstractC1008e2.f12596d, abstractC1008e2.f12597e, abstractC1008e2.f12598f, abstractC1008e2.f12599x, abstractC1008e2.f12600y, iOException, !a4);
                            if (!a4) {
                                c1010g.f12613G = null;
                                eVar2.getClass();
                                c1010g.f12625f.b(c1010g);
                            }
                            return eVar3;
                        }
                        c1010g = this;
                        abstractC1008e2 = abstractC1008e;
                        Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    }
                    eVar = null;
                    if (eVar == null) {
                    }
                    Q1.e eVar32 = eVar;
                    a4 = eVar32.a();
                    c1010g.f12626x.h(c0814u, abstractC1008e2.f12595c, c1010g.f12620a, abstractC1008e2.f12596d, abstractC1008e2.f12597e, abstractC1008e2.f12598f, abstractC1008e2.f12599x, abstractC1008e2.f12600y, iOException, !a4);
                    if (!a4) {
                    }
                    return eVar32;
                }
            }
            boolean z9 = c1078j.j.f13112d;
            X x4 = abstractC1008e3.f12596d;
            C1076h[] c1076hArr = c1078j.f12871h;
            if (!z9 && (abstractC1008e3 instanceof AbstractC1013j) && (iOException instanceof D) && ((D) iOException).f16709d == 404) {
                C1076h c1076h = c1076hArr[c1078j.f12872i.i(x4)];
                i8 = size;
                long v7 = c1076h.f12860d.v(c1076h.f12861e);
                if (v7 == -1 || v7 == 0) {
                    arrayList = arrayList2;
                } else {
                    arrayList = arrayList2;
                    if (((AbstractC1013j) abstractC1008e3).a() > ((c1076h.f12860d.u() + c1076h.f12862f) + v7) - 1) {
                        c1078j.f12875m = true;
                        abstractC1008e = abstractC1008e3;
                        c0814u = c0814u2;
                        a2 = true;
                        if (a2) {
                        }
                        eVar = null;
                        if (eVar == null) {
                        }
                        Q1.e eVar322 = eVar;
                        a4 = eVar322.a();
                        c1010g.f12626x.h(c0814u, abstractC1008e2.f12595c, c1010g.f12620a, abstractC1008e2.f12596d, abstractC1008e2.f12597e, abstractC1008e2.f12598f, abstractC1008e2.f12599x, abstractC1008e2.f12600y, iOException, !a4);
                        if (!a4) {
                        }
                        return eVar322;
                    }
                }
            } else {
                arrayList = arrayList2;
                i8 = size;
            }
            C1076h c1076h2 = c1076hArr[c1078j.f12872i.i(x4)];
            AbstractC0167z abstractC0167z = c1076h2.f12858b.f13159b;
            k1.g gVar = c1078j.f12865b;
            g2.b P7 = gVar.P(abstractC0167z);
            g2.b bVar = c1076h2.f12859c;
            if (P7 == null || bVar.equals(P7)) {
                t2.c cVar = c1078j.f12872i;
                AbstractC0167z abstractC0167z2 = c1076h2.f12858b.f13159b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int length = cVar.f16298c.length;
                abstractC1008e = abstractC1008e3;
                c0814u = c0814u2;
                int i9 = 0;
                for (int i10 = 0; i10 < length; i10++) {
                    if (cVar.j(i10, elapsedRealtime)) {
                        i9++;
                    }
                }
                HashSet hashSet = new HashSet();
                for (int i11 = 0; i11 < abstractC0167z2.size(); i11++) {
                    hashSet.add(Integer.valueOf(((g2.b) abstractC0167z2.get(i11)).f13107c));
                }
                int size2 = hashSet.size();
                HashSet hashSet2 = new HashSet();
                ArrayList e7 = gVar.e(abstractC0167z2);
                for (int i12 = 0; i12 < e7.size(); i12++) {
                    hashSet2.add(Integer.valueOf(((g2.b) e7.get(i12)).f13107c));
                }
                o oVar = new o(size2, size2 - hashSet2.size(), length, i9);
                if (oVar.a(2) || oVar.a(1)) {
                    eVar2.getClass();
                    Q1.e t7 = M4.e.t(oVar, vVar);
                    if (t7 != null) {
                        int i13 = t7.f5785a;
                        if (oVar.a(i13)) {
                            long j9 = t7.f5786b;
                            if (i13 == 2) {
                                t2.c cVar2 = c1078j.f12872i;
                                a2 = cVar2.a(cVar2.i(x4), j9);
                                if (a2) {
                                }
                                eVar = null;
                                if (eVar == null) {
                                }
                                Q1.e eVar3222 = eVar;
                                a4 = eVar3222.a();
                                c1010g.f12626x.h(c0814u, abstractC1008e2.f12595c, c1010g.f12620a, abstractC1008e2.f12596d, abstractC1008e2.f12597e, abstractC1008e2.f12598f, abstractC1008e2.f12599x, abstractC1008e2.f12600y, iOException, !a4);
                                if (!a4) {
                                }
                                return eVar3222;
                            }
                            if (i13 == 1) {
                                long elapsedRealtime2 = SystemClock.elapsedRealtime() + j9;
                                String str = bVar.f13106b;
                                HashMap hashMap = (HashMap) gVar.f14674a;
                                if (hashMap.containsKey(str)) {
                                    Long l7 = (Long) hashMap.get(str);
                                    int i14 = t.f17153a;
                                    j = Math.max(elapsedRealtime2, l7.longValue());
                                } else {
                                    j = elapsedRealtime2;
                                }
                                hashMap.put(str, Long.valueOf(j));
                                int i15 = bVar.f13107c;
                                if (i15 != Integer.MIN_VALUE) {
                                    Integer valueOf = Integer.valueOf(i15);
                                    HashMap hashMap2 = (HashMap) gVar.f14675b;
                                    if (hashMap2.containsKey(valueOf)) {
                                        Long l8 = (Long) hashMap2.get(valueOf);
                                        int i16 = t.f17153a;
                                        elapsedRealtime2 = Math.max(elapsedRealtime2, l8.longValue());
                                    }
                                    hashMap2.put(valueOf, Long.valueOf(elapsedRealtime2));
                                }
                                a2 = true;
                                if (a2) {
                                }
                                eVar = null;
                                if (eVar == null) {
                                }
                                Q1.e eVar32222 = eVar;
                                a4 = eVar32222.a();
                                c1010g.f12626x.h(c0814u, abstractC1008e2.f12595c, c1010g.f12620a, abstractC1008e2.f12596d, abstractC1008e2.f12597e, abstractC1008e2.f12598f, abstractC1008e2.f12599x, abstractC1008e2.f12600y, iOException, !a4);
                                if (!a4) {
                                }
                                return eVar32222;
                            }
                        }
                    }
                }
            }
            abstractC1008e = abstractC1008e3;
            c0814u = c0814u2;
            a2 = true;
            if (a2) {
            }
            eVar = null;
            if (eVar == null) {
            }
            Q1.e eVar322222 = eVar;
            a4 = eVar322222.a();
            c1010g.f12626x.h(c0814u, abstractC1008e2.f12595c, c1010g.f12620a, abstractC1008e2.f12596d, abstractC1008e2.f12597e, abstractC1008e2.f12598f, abstractC1008e2.f12599x, abstractC1008e2.f12600y, iOException, !a4);
            if (!a4) {
            }
            return eVar322222;
        }
        abstractC1008e = abstractC1008e3;
        c0814u = c0814u2;
        arrayList = arrayList2;
        i8 = size;
        a2 = false;
        if (a2) {
        }
        eVar = null;
        if (eVar == null) {
        }
        Q1.e eVar3222222 = eVar;
        a4 = eVar3222222.a();
        c1010g.f12626x.h(c0814u, abstractC1008e2.f12595c, c1010g.f12620a, abstractC1008e2.f12596d, abstractC1008e2.f12597e, abstractC1008e2.f12598f, abstractC1008e2.f12599x, abstractC1008e2.f12600y, iOException, !a4);
        if (!a4) {
        }
        return eVar3222222;
    }

    @Override // c2.Y
    public final boolean isLoading() {
        return this.f12628z.d();
    }

    public final boolean j(int i7) {
        int n2;
        AbstractC1004a abstractC1004a = (AbstractC1004a) this.f12608B.get(i7);
        if (this.f12610D.n() > abstractC1004a.c(0)) {
            return true;
        }
        int i8 = 0;
        do {
            V[] vArr = this.f12611E;
            if (i8 >= vArr.length) {
                return false;
            }
            n2 = vArr[i8].n();
            i8++;
        } while (n2 <= abstractC1004a.c(i8));
        return true;
    }

    @Override // c2.Y
    public final long k() {
        if (m()) {
            return this.f12616J;
        }
        if (this.f12619M) {
            return Long.MIN_VALUE;
        }
        return h().f12600y;
    }

    @Override // u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        AbstractC1008e abstractC1008e = (AbstractC1008e) h6;
        this.f12613G = null;
        long j7 = abstractC1008e.f12593a;
        Uri uri = abstractC1008e.f12601z.f16755c;
        C0814u c0814u = new C0814u();
        this.f12627y.getClass();
        this.f12626x.d(c0814u, abstractC1008e.f12595c, this.f12620a, abstractC1008e.f12596d, abstractC1008e.f12597e, abstractC1008e.f12598f, abstractC1008e.f12599x, abstractC1008e.f12600y);
        if (z4) {
            return;
        }
        if (m()) {
            this.f12610D.y(false);
            for (V v6 : this.f12611E) {
                v6.y(false);
            }
        } else if (abstractC1008e instanceof AbstractC1004a) {
            ArrayList arrayList = this.f12608B;
            f(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f12616J = this.f12617K;
            }
        }
        this.f12625f.b(this);
    }

    public final boolean m() {
        return this.f12616J != -9223372036854775807L;
    }

    public final void n() {
        int r7 = r(this.f12610D.n(), this.f12618L - 1);
        while (true) {
            int i7 = this.f12618L;
            if (i7 > r7) {
                return;
            }
            this.f12618L = i7 + 1;
            AbstractC1004a abstractC1004a = (AbstractC1004a) this.f12608B.get(i7);
            X x4 = abstractC1004a.f12596d;
            if (!x4.equals(this.f12614H)) {
                this.f12626x.b(this.f12620a, x4, abstractC1004a.f12597e, abstractC1004a.f12598f, abstractC1004a.f12599x);
            }
            this.f12614H = x4;
        }
    }

    public final int r(int i7, int i8) {
        ArrayList arrayList;
        do {
            i8++;
            arrayList = this.f12608B;
            if (i8 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC1004a) arrayList.get(i8)).c(0) <= i7);
        return i8 - 1;
    }

    public final void s(C1070b c1070b) {
        this.f12615I = c1070b;
        V v6 = this.f12610D;
        v6.h();
        C1719l1 c1719l1 = v6.f10275h;
        if (c1719l1 != null) {
            c1719l1.F(v6.f10272e);
            v6.f10275h = null;
            v6.f10274g = null;
        }
        for (V v7 : this.f12611E) {
            v7.h();
            C1719l1 c1719l12 = v7.f10275h;
            if (c1719l12 != null) {
                c1719l12.F(v7.f10272e);
                v7.f10275h = null;
                v7.f10274g = null;
            }
        }
        this.f12628z.e(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0206  */
    @Override // c2.Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(long j) {
        long j3;
        List list;
        K k7;
        C1076h[] c1076hArr;
        boolean z4;
        long j7;
        long j8;
        InterfaceC1075g interfaceC1075g;
        C1007d c1007d;
        long j9;
        B3.g gVar;
        X x4;
        Object c1011h;
        g2.b bVar;
        int i7;
        boolean z7;
        List list2;
        long j10;
        int i8;
        boolean z8;
        if (!this.f12619M) {
            K k8 = this.f12628z;
            if (!k8.d() && !k8.b()) {
                boolean m7 = m();
                if (m7) {
                    list = Collections.emptyList();
                    j3 = this.f12616J;
                } else {
                    j3 = h().f12600y;
                    list = this.f12609C;
                }
                C1078j c1078j = this.f12624e;
                C0796b c0796b = c1078j.f12874l;
                B3.g gVar2 = this.f12607A;
                if (c0796b != null) {
                    k7 = k8;
                    z4 = m7;
                    gVar = gVar2;
                } else {
                    long j11 = j3 - j;
                    long E7 = t.E(c1078j.j.b(c1078j.f12873k).f13143b) + t.E(c1078j.j.f13109a) + j3;
                    C1081m c1081m = c1078j.f12870g;
                    if (c1081m != null) {
                        C1082n c1082n = c1081m.f12890e;
                        g2.c cVar = c1082n.f12896f;
                        if (!cVar.f13112d) {
                            k7 = k8;
                            z8 = false;
                        } else if (c1082n.f12898y) {
                            k7 = k8;
                            z8 = true;
                        } else {
                            k7 = k8;
                            Map.Entry ceilingEntry = c1082n.f12895e.ceilingEntry(Long.valueOf(cVar.f13116h));
                            R4.c cVar2 = c1082n.f12892b;
                            if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= E7) {
                                z8 = false;
                            } else {
                                long longValue = ((Long) ceilingEntry.getKey()).longValue();
                                C1074f c1074f = (C1074f) cVar2.f6064b;
                                long j12 = c1074f.f12837N;
                                if (j12 == -9223372036854775807L || j12 < longValue) {
                                    c1074f.f12837N = longValue;
                                }
                                z8 = true;
                            }
                            if (z8 && c1082n.f12897x) {
                                c1082n.f12898y = true;
                                c1082n.f12897x = false;
                                C1074f c1074f2 = (C1074f) cVar2.f6064b;
                                c1074f2.f12827D.removeCallbacks(c1074f2.f12853w);
                                c1074f2.t();
                            }
                        }
                        if (z8) {
                            z4 = m7;
                            gVar = gVar2;
                        }
                    } else {
                        k7 = k8;
                    }
                    long E8 = t.E(t.u(c1078j.f12869f));
                    g2.c cVar3 = c1078j.j;
                    long j13 = cVar3.f13109a;
                    long E9 = j13 == -9223372036854775807L ? -9223372036854775807L : E8 - t.E(j13 + cVar3.b(c1078j.f12873k).f13143b);
                    AbstractC1013j abstractC1013j = list.isEmpty() ? null : (AbstractC1013j) list.get(list.size() - 1);
                    int length = c1078j.f12872i.f16298c.length;
                    InterfaceC1014k[] interfaceC1014kArr = new InterfaceC1014k[length];
                    int i9 = 0;
                    while (true) {
                        c1076hArr = c1078j.f12871h;
                        if (i9 >= length) {
                            break;
                        }
                        C1076h c1076h = c1076hArr[i9];
                        InterfaceC1075g interfaceC1075g2 = c1076h.f12860d;
                        C1718l0 c1718l0 = InterfaceC1014k.f12640s;
                        if (interfaceC1075g2 == null) {
                            interfaceC1014kArr[i9] = c1718l0;
                            z7 = m7;
                            list2 = list;
                            j10 = j11;
                            i8 = length;
                        } else {
                            z7 = m7;
                            list2 = list;
                            long j14 = c1076h.f12861e;
                            long f7 = interfaceC1075g2.f(j14, E8);
                            j10 = j11;
                            i8 = length;
                            long j15 = c1076h.f12862f;
                            long j16 = f7 + j15;
                            long b7 = c1076h.b(E8);
                            long a2 = abstractC1013j != null ? abstractC1013j.a() : t.k(c1076h.f12860d.l(j3, j14) + j15, j16, b7);
                            if (a2 < j16) {
                                interfaceC1014kArr[i9] = c1718l0;
                            } else {
                                interfaceC1014kArr[i9] = new C1077i(c1078j.b(i9), a2, b7);
                            }
                        }
                        i9++;
                        length = i8;
                        m7 = z7;
                        list = list2;
                        j11 = j10;
                    }
                    z4 = m7;
                    List list3 = list;
                    long j17 = j11;
                    long j18 = 0;
                    if (c1078j.j.f13112d) {
                        C1076h c1076h2 = c1076hArr[0];
                        if (c1076h2.f12860d.v(c1076h2.f12861e) != 0) {
                            long c3 = c1076hArr[0].c(c1076hArr[0].b(E8));
                            g2.c cVar4 = c1078j.j;
                            long j19 = cVar4.f13109a;
                            j7 = -9223372036854775807L;
                            long E10 = j19 == -9223372036854775807L ? -9223372036854775807L : E8 - t.E(j19 + cVar4.b(c1078j.f12873k).f13143b);
                            j18 = 0;
                            j8 = Math.max(0L, Math.min(E10, c3) - j);
                            long j20 = j7;
                            c1078j.f12872i.l(j17, j8, list3, interfaceC1014kArr);
                            C1076h b8 = c1078j.b(c1078j.f12872i.e());
                            interfaceC1075g = b8.f12860d;
                            g2.b bVar2 = b8.f12859c;
                            c1007d = b8.f12857a;
                            g2.m mVar = b8.f12858b;
                            if (c1007d != null) {
                                g2.j jVar = c1007d.f12592z == null ? mVar.f13162e : null;
                                g2.j d7 = interfaceC1075g == null ? mVar.d() : null;
                                if (jVar != null || d7 != null) {
                                    t2.c cVar5 = c1078j.f12872i;
                                    X x7 = cVar5.f16299d[cVar5.e()];
                                    int g3 = c1078j.f12872i.g();
                                    Object f8 = c1078j.f12872i.f();
                                    if (jVar != null) {
                                        g2.j a4 = jVar.a(d7, bVar2.f13105a);
                                        if (a4 != null) {
                                            jVar = a4;
                                        }
                                    } else {
                                        jVar = d7;
                                    }
                                    gVar2.f1064c = new C1012i(c1078j.f12868e, Y4.D.f(mVar, bVar2.f13105a, jVar, 0), x7, g3, f8, b8.f12857a);
                                    gVar = gVar2;
                                }
                            }
                            j9 = b8.f12861e;
                            boolean z9 = j9 == j20;
                            if (interfaceC1075g.v(j9) != 0) {
                                gVar2.f1063b = z9;
                            } else {
                                long f9 = interfaceC1075g.f(j9, E8);
                                long j21 = b8.f12862f;
                                long j22 = f9 + j21;
                                long b9 = b8.b(E8);
                                long j23 = j3;
                                long a7 = abstractC1013j != null ? abstractC1013j.a() : t.k(interfaceC1075g.l(j3, j9) + j21, j22, b9);
                                if (a7 < j22) {
                                    c1078j.f12874l = new C0796b();
                                } else if (a7 > b9 || (c1078j.f12875m && a7 >= b9)) {
                                    gVar = gVar2;
                                    gVar.f1063b = z9;
                                } else if (!z9 || b8.d(a7) < j9) {
                                    int min = (int) Math.min(1, (b9 - a7) + 1);
                                    if (j9 != j20) {
                                        for (int i10 = 1; min > i10 && b8.d((min + a7) - 1) >= j9; i10 = 1) {
                                            min--;
                                        }
                                    }
                                    long j24 = list3.isEmpty() ? j23 : -9223372036854775807L;
                                    t2.c cVar6 = c1078j.f12872i;
                                    X x8 = cVar6.f16299d[cVar6.e()];
                                    int g7 = c1078j.f12872i.g();
                                    Object f10 = c1078j.f12872i.f();
                                    long d8 = b8.d(a7);
                                    g2.j i11 = interfaceC1075g.i(a7 - j21);
                                    InterfaceC1636m interfaceC1636m = c1078j.f12868e;
                                    if (c1007d == null) {
                                        long c4 = b8.c(a7);
                                        if (interfaceC1075g.s() || E9 == -9223372036854775807L || b8.c(a7) <= E9) {
                                            bVar = bVar2;
                                            i7 = 0;
                                        } else {
                                            bVar = bVar2;
                                            i7 = 8;
                                        }
                                        c1011h = new C1015l(interfaceC1636m, Y4.D.f(mVar, bVar.f13105a, i11, i7), x8, g7, f10, d8, c4, a7, c1078j.f12867d, x8);
                                        gVar = gVar2;
                                    } else {
                                        int i12 = 1;
                                        int i13 = 1;
                                        while (true) {
                                            if (i12 >= min) {
                                                x4 = x8;
                                                break;
                                            }
                                            int i14 = min;
                                            x4 = x8;
                                            g2.j a8 = i11.a(interfaceC1075g.i((i12 + a7) - j21), bVar2.f13105a);
                                            if (a8 == null) {
                                                break;
                                            }
                                            i13++;
                                            i12++;
                                            x8 = x4;
                                            i11 = a8;
                                            min = i14;
                                        }
                                        long j25 = (i13 + a7) - 1;
                                        long c7 = b8.c(j25);
                                        c1011h = new C1011h(interfaceC1636m, Y4.D.f(mVar, bVar2.f13105a, i11, interfaceC1075g.s() || (E9 > (-9223372036854775807L) ? 1 : (E9 == (-9223372036854775807L) ? 0 : -1)) == 0 || (b8.c(j25) > E9 ? 1 : (b8.c(j25) == E9 ? 0 : -1)) <= 0 ? 0 : 8), x4, g7, f10, d8, c7, j24, (j9 == j20 || j9 > c7) ? -9223372036854775807L : j9, a7, i13, -mVar.f13160c, b8.f12857a);
                                        gVar = gVar2;
                                    }
                                    gVar.f1064c = c1011h;
                                } else {
                                    gVar2.f1063b = true;
                                }
                            }
                            gVar = gVar2;
                        }
                    }
                    j7 = -9223372036854775807L;
                    j8 = -9223372036854775807L;
                    long j202 = j7;
                    c1078j.f12872i.l(j17, j8, list3, interfaceC1014kArr);
                    C1076h b82 = c1078j.b(c1078j.f12872i.e());
                    interfaceC1075g = b82.f12860d;
                    g2.b bVar22 = b82.f12859c;
                    c1007d = b82.f12857a;
                    g2.m mVar2 = b82.f12858b;
                    if (c1007d != null) {
                    }
                    j9 = b82.f12861e;
                    if (j9 == j202) {
                    }
                    if (interfaceC1075g.v(j9) != 0) {
                    }
                    gVar = gVar2;
                }
                boolean z10 = gVar.f1063b;
                AbstractC1008e abstractC1008e = (AbstractC1008e) gVar.f1064c;
                gVar.f1064c = null;
                gVar.f1063b = false;
                if (z10) {
                    this.f12616J = -9223372036854775807L;
                    this.f12619M = true;
                    return true;
                }
                if (abstractC1008e == null) {
                    return false;
                }
                this.f12613G = abstractC1008e;
                boolean z11 = abstractC1008e instanceof AbstractC1004a;
                C0977k c0977k = this.f12612F;
                if (z11) {
                    AbstractC1004a abstractC1004a = (AbstractC1004a) abstractC1008e;
                    if (z4) {
                        long j26 = this.f12616J;
                        if (abstractC1004a.f12599x != j26) {
                            this.f12610D.f10286t = j26;
                            for (V v6 : this.f12611E) {
                                v6.f10286t = this.f12616J;
                            }
                        }
                        this.f12616J = -9223372036854775807L;
                    }
                    abstractC1004a.f12572D = c0977k;
                    V[] vArr = (V[]) c0977k.f12442c;
                    int[] iArr = new int[vArr.length];
                    for (int i15 = 0; i15 < vArr.length; i15++) {
                        V v7 = vArr[i15];
                        iArr[i15] = v7.f10283q + v7.f10282p;
                    }
                    abstractC1004a.f12573E = iArr;
                    this.f12608B.add(abstractC1004a);
                } else if (abstractC1008e instanceof C1012i) {
                    ((C1012i) abstractC1008e).f12636B = c0977k;
                }
                k7.f(abstractC1008e, this, this.f12627y.u(abstractC1008e.f12595c));
                this.f12626x.k(new C0814u(abstractC1008e.f12594b), abstractC1008e.f12595c, this.f12620a, abstractC1008e.f12596d, abstractC1008e.f12597e, abstractC1008e.f12598f, abstractC1008e.f12599x, abstractC1008e.f12600y);
                return true;
            }
        }
        return false;
    }
}
