package p032e2;

import A1.X;
import B.v;
import B1.m;
import C0.C0083b;
import E1.h;
import E3.AbstractC0167z;
import F1.f;
import F1.s;
import H2.o;
import M4.e;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p018c2.C0756b;
import p018c2.C0774u;
import p018c2.C0779z;
import p018c2.V;
import p018c2.W;
import p018c2.Y;
import p028d6.k;
import p040f2.b;
import p040f2.i;
import p040f2.j;
import p040f2.n;
import p139t2.c;
import p146u2.D;
import p146u2.F;
import p146u2.H;
import p146u2.I;
import p146u2.InterfaceC0954m;
import p146u2.K;
import p146u2.r;
import p151v2.a;
import p151v2.t;
import p155w1.C1009l0;
import p155w1.C1010l1;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements W, Y, F, I {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f12614B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final List f12615C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final V f12616D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final V[] f12617E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final k f12618F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public e f12619G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public X f12620H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public b f12621I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f12622J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f12623K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public int f12624L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f12625M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f12627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X[] f12628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean[] f12629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f12630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f12631f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p018c2.I f12632x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e f12633y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final K f12634z = new K("ChunkSampleStream");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final B3.g f12613A = new B3.g(4);

    public g(int i7, int[] iArr, X[] xArr, j jVar, b bVar, r rVar, long j, h hVar, m mVar, e eVar, p018c2.I i8) {
        this.f12626a = i7;
        this.f12627b = iArr;
        this.f12628c = xArr;
        this.f12630e = jVar;
        this.f12631f = bVar;
        this.f12632x = i8;
        this.f12633y = eVar;
        ArrayList arrayList = new ArrayList();
        this.f12614B = arrayList;
        this.f12615C = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f12617E = new V[length];
        this.f12629d = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        V[] vArr = new V[i9];
        hVar.getClass();
        V v6 = new V(rVar, hVar, mVar);
        this.f12616D = v6;
        int i10 = 0;
        iArr2[0] = i7;
        vArr[0] = v6;
        while (i10 < length) {
            V v7 = new V(rVar, null, null);
            this.f12617E[i10] = v7;
            int i11 = i10 + 1;
            vArr[i11] = v7;
            iArr2[i11] = this.f12627b[i10];
            i10 = i11;
        }
        this.f12618F = new k(1, iArr2, vArr);
        this.f12622J = j;
        this.f12623K = j;
    }

    @Override // p018c2.Y
    public final long T() {
        long j;
        if (this.f12625M) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.f12622J;
        }
        long jMax = this.f12623K;
        a aVarH = h();
        if (!aVarH.b()) {
            ArrayList arrayList = this.f12614B;
            aVarH = arrayList.size() > 1 ? (a) arrayList.get(arrayList.size() - 2) : null;
        }
        if (aVarH != null) {
            jMax = Math.max(jMax, aVarH.f12606y);
        }
        V v6 = this.f12616D;
        synchronized (v6) {
            j = v6.f10288v;
        }
        return Math.max(jMax, j);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    @Override // p018c2.Y
    public final void Y(long j) {
        int size;
        K k7 = this.f12634z;
        if (k7.b() || m()) {
            return;
        }
        boolean zD = k7.d();
        j jVar = this.f12630e;
        ArrayList arrayList = this.f12614B;
        if (zD) {
            e eVar = this.f12619G;
            eVar.getClass();
            if (eVar instanceof a) {
                j(arrayList.size() - 1);
                return;
            }
            return;
        }
        C0756b c0756b = jVar.f12880l;
        List list = this.f12615C;
        if (c0756b == null) {
            c cVar = jVar.f12878i;
            if (cVar.f16304c.length < 2) {
                size = list.size();
            } else {
                size = cVar.d(j, list);
            }
        } else {
            size = list.size();
        }
        if (size < arrayList.size()) {
            a.h(!k7.d());
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
            long j3 = h().f12606y;
            a aVarF = f(size);
            if (arrayList.isEmpty()) {
                this.f12622J = this.f12623K;
            }
            this.f12625M = false;
            p018c2.I i7 = this.f12632x;
            i7.m(new C0779z(1, this.f12626a, null, 3, null, i7.a(aVarF.f12605x), i7.a(j3)));
        }
    }

    @Override // p146u2.I
    public final void a() {
        V v6 = this.f12616D;
        v6.y(true);
        C1010l1 c1010l1 = v6.f10275h;
        if (c1010l1 != null) {
            c1010l1.F(v6.f10272e);
            v6.f10275h = null;
            v6.f10274g = null;
        }
        for (V v7 : this.f12617E) {
            v7.y(true);
            C1010l1 c1010l2 = v7.f10275h;
            if (c1010l2 != null) {
                c1010l2.F(v7.f10272e);
                v7.f10275h = null;
                v7.f10274g = null;
            }
        }
        for (p040f2.h hVar : this.f12630e.f12877h) {
            d dVar = hVar.f12863a;
            if (dVar != null) {
                dVar.f12590a.release();
            }
        }
        b bVar = this.f12621I;
        if (bVar != null) {
            synchronized (bVar) {
                p040f2.m mVar = (p040f2.m) bVar.f12798E.remove(this);
                if (mVar != null) {
                    V v8 = mVar.f12892a;
                    v8.y(true);
                    C1010l1 c1010l3 = v8.f10275h;
                    if (c1010l3 != null) {
                        c1010l3.F(v8.f10272e);
                        v8.f10275h = null;
                        v8.f10274g = null;
                    }
                }
            }
        }
    }

    @Override // p018c2.W
    public final boolean b() {
        return !m() && this.f12616D.s(this.f12625M);
    }

    @Override // p018c2.W
    public final void c() throws E1.c, C0756b {
        K k7 = this.f12634z;
        k7.c();
        this.f12616D.u();
        if (k7.d()) {
            return;
        }
        j jVar = this.f12630e;
        C0756b c0756b = jVar.f12880l;
        if (c0756b != null) {
            throw c0756b;
        }
        jVar.f12870a.c();
    }

    @Override // p018c2.W
    public final int d(long j) {
        if (m()) {
            return 0;
        }
        V v6 = this.f12616D;
        int iP = v6.p(j, this.f12625M);
        v6.A(iP);
        n();
        return iP;
    }

    @Override // p018c2.W
    public final int e(V0 v6, D1.h hVar, int i7) {
        if (m()) {
            return -3;
        }
        V v7 = this.f12616D;
        n();
        return v7.x(v6, hVar, i7, this.f12625M);
    }

    public final a f(int i7) {
        ArrayList arrayList = this.f12614B;
        a aVar = (a) arrayList.get(i7);
        t.J(arrayList, i7, arrayList.size());
        this.f12624L = Math.max(this.f12624L, arrayList.size());
        int i8 = 0;
        this.f12616D.j(aVar.c(0));
        while (true) {
            V[] vArr = this.f12617E;
            if (i8 >= vArr.length) {
                return aVar;
            }
            V v6 = vArr[i8];
            i8++;
            v6.j(aVar.c(i8));
        }
    }

    @Override // p146u2.F
    public final void g(H h6, long j, long j3) {
        e eVar = (e) h6;
        this.f12619G = null;
        j jVar = this.f12630e;
        if (eVar instanceof i) {
            int i7 = jVar.f12878i.i(((i) eVar).f12602d);
            p040f2.h[] hVarArr = jVar.f12877h;
            p040f2.h hVar = hVarArr[i7];
            if (hVar.f12866d == null) {
                d dVar = hVar.f12863a;
                s sVar = dVar.f12597y;
                f fVar = sVar instanceof f ? (f) sVar : null;
                if (fVar != null) {
                    g2.m mVar = hVar.f12864b;
                    hVarArr[i7] = new p040f2.h(hVar.f12867e, mVar, hVar.f12865c, dVar, hVar.f12868f, new C0083b(fVar, mVar.f13166c, 8));
                }
            }
        }
        p040f2.m mVar2 = jVar.f12876g;
        if (mVar2 != null) {
            long j7 = mVar2.f12895d;
            if (j7 == -9223372036854775807L || eVar.f12606y > j7) {
                mVar2.f12895d = eVar.f12606y;
            }
            mVar2.f12896e.f12903x = true;
        }
        long j8 = eVar.f12599a;
        Uri uri = eVar.f12607z.f16761c;
        C0774u c0774u = new C0774u();
        this.f12633y.getClass();
        this.f12632x.f(c0774u, eVar.f12601c, this.f12626a, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y);
        this.f12631f.b(this);
    }

    public final a h() {
        ArrayList arrayList = this.f12614B;
        return (a) arrayList.get(arrayList.size() - 1);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0227  */
    /* JADX WARN: Code duplicated, block: B:102:0x022b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0235  */
    /* JADX WARN: Code duplicated, block: B:105:0x0237  */
    /* JADX WARN: Code duplicated, block: B:108:0x0241  */
    /* JADX WARN: Code duplicated, block: B:109:0x0246  */
    /* JADX WARN: Code duplicated, block: B:111:0x024b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0257  */
    /* JADX WARN: Code duplicated, block: B:115:0x025e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0269  */
    /* JADX WARN: Code duplicated, block: B:118:0x0270  */
    /* JADX WARN: Code duplicated, block: B:121:0x029b  */
    /* JADX WARN: Code duplicated, block: B:125:0x0143 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x0103  */
    /* JADX WARN: Code duplicated, block: B:55:0x011d  */
    /* JADX WARN: Code duplicated, block: B:60:0x0139  */
    /* JADX WARN: Code duplicated, block: B:62:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0152 A[LOOP:1: B:65:0x014c->B:67:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x017a A[LOOP:2: B:69:0x0174->B:71:0x017a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:84:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:89:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:95:0x0209  */
    /* JADX WARN: Code duplicated, block: B:99:0x0225 A[DONT_INVERT] */
    @Override // p146u2.F
    public final Q1.e i(H h6, IOException iOException, int i7) {
        boolean z4;
        X x4;
        ArrayList arrayList;
        int i8;
        p072k1.g gVar;
        g2.b bVarP;
        g2.b bVar;
        c cVar;
        AbstractC0167z abstractC0167z;
        long jElapsedRealtime;
        int length;
        e eVar;
        C0774u c0774u;
        int i9;
        int i10;
        HashSet hashSet;
        int i11;
        o oVar;
        HashSet hashSet2;
        ArrayList arrayListE;
        int i12;
        Q1.e eVarT;
        int i13;
        long j;
        long jElapsedRealtime2;
        String str;
        HashMap map;
        long jMax;
        int i14;
        Integer numValueOf;
        HashMap map2;
        boolean zA;
        Q1.e eVar2;
        boolean zA2;
        long jV;
        boolean z7;
        e eVar3 = (e) h6;
        long j3 = eVar3.f12607z.f16760b;
        boolean z8 = eVar3 instanceof a;
        ArrayList arrayList2 = this.f12614B;
        int size = arrayList2.size() - 1;
        boolean z9 = (j3 != 0 && z8 && j(size)) ? false : true;
        Uri uri = eVar3.f12607z.f16761c;
        C0774u c0774u2 = new C0774u();
        long j7 = eVar3.f12605x;
        t.N(j7);
        t.N(eVar3.f12606y);
        v vVar = new v(iOException, i7, 11);
        j jVar = this.f12630e;
        e eVar4 = this.f12633y;
        if (z9) {
            p040f2.m mVar = jVar.f12876g;
            if (mVar != null) {
                long j8 = mVar.f12895d;
                boolean z10 = j8 != -9223372036854775807L && j8 < j7;
                n nVar = mVar.f12896e;
                if (nVar.f12902f.f13118d) {
                    if (!nVar.f12904y) {
                        if (!z10) {
                            z4 = jVar.j.f13118d;
                            x4 = eVar3.f12602d;
                            p040f2.h[] hVarArr = jVar.f12877h;
                            if (z4 && (eVar3 instanceof j) && (iOException instanceof D) && ((D) iOException).f16715d == 404) {
                                p040f2.h hVar = hVarArr[jVar.f12878i.i(x4)];
                                i8 = size;
                                long jV2 = hVar.f12866d.v(hVar.f12867e);
                                if (jV2 == -1 || jV2 == 0) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (((j) eVar3).a() > ((hVar.f12866d.u() + hVar.f12868f) + jV2) - 1) {
                                        jVar.f12881m = true;
                                    }
                                    eVar = eVar3;
                                    c0774u = c0774u2;
                                    zA = true;
                                }
                            } else {
                                arrayList = arrayList2;
                                i8 = size;
                            }
                            p040f2.h hVar2 = hVarArr[jVar.f12878i.i(x4)];
                            AbstractC0167z abstractC0167z2 = hVar2.f12864b.f13165b;
                            gVar = jVar.f12871b;
                            bVarP = gVar.P(abstractC0167z2);
                            bVar = hVar2.f12865c;
                            if (bVarP != null || bVar.equals(bVarP)) {
                                cVar = jVar.f12878i;
                                abstractC0167z = hVar2.f12864b.f13165b;
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                length = cVar.f16304c.length;
                                eVar = eVar3;
                                c0774u = c0774u2;
                                i9 = 0;
                                for (i10 = 0; i10 < length; i10++) {
                                    if (cVar.j(i10, jElapsedRealtime)) {
                                        i9++;
                                    }
                                }
                                hashSet = new HashSet();
                                for (i11 = 0; i11 < abstractC0167z.size(); i11++) {
                                    hashSet.add(Integer.valueOf(((g2.b) abstractC0167z.get(i11)).f13113c));
                                }
                                int size2 = hashSet.size();
                                hashSet2 = new HashSet();
                                arrayListE = gVar.e(abstractC0167z);
                                for (i12 = 0; i12 < arrayListE.size(); i12++) {
                                    hashSet2.add(Integer.valueOf(((g2.b) arrayListE.get(i12)).f13113c));
                                }
                                oVar = new o(size2, size2 - hashSet2.size(), length, i9);
                                if (oVar.a(2) || oVar.a(1)) {
                                    eVar4.getClass();
                                    eVarT = e.t(oVar, vVar);
                                    if (eVarT != null) {
                                        i13 = eVarT.f5785a;
                                        if (oVar.a(i13)) {
                                            j = eVarT.f5786b;
                                            if (i13 == 2) {
                                                c cVar2 = jVar.f12878i;
                                                zA = cVar2.a(cVar2.i(x4), j);
                                            } else if (i13 == 1) {
                                                jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                                str = bVar.f13112b;
                                                map = (HashMap) gVar.f14680a;
                                                if (map.containsKey(str)) {
                                                    Long l7 = (Long) map.get(str);
                                                    int i15 = t.f17159a;
                                                    jMax = Math.max(jElapsedRealtime2, l7.longValue());
                                                } else {
                                                    jMax = jElapsedRealtime2;
                                                }
                                                map.put(str, Long.valueOf(jMax));
                                                i14 = bVar.f13113c;
                                                if (i14 != Integer.MIN_VALUE) {
                                                    numValueOf = Integer.valueOf(i14);
                                                    map2 = (HashMap) gVar.f14681b;
                                                    if (map2.containsKey(numValueOf)) {
                                                        Long l8 = (Long) map2.get(numValueOf);
                                                        int i16 = t.f17159a;
                                                        jElapsedRealtime2 = Math.max(jElapsedRealtime2, l8.longValue());
                                                    }
                                                    map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                eVar = eVar3;
                                c0774u = c0774u2;
                            }
                            zA = true;
                        } else if (nVar.f12903x) {
                            nVar.f12904y = true;
                            nVar.f12903x = false;
                            p040f2.f fVar = (p040f2.f) nVar.f12898b.f6064b;
                            fVar.f12833D.removeCallbacks(fVar.f12859w);
                            fVar.t();
                        }
                    }
                    eVar = eVar3;
                    c0774u = c0774u2;
                    arrayList = arrayList2;
                    i8 = size;
                    zA = true;
                } else {
                    z4 = jVar.j.f13118d;
                    x4 = eVar3.f12602d;
                    p040f2.h[] hVarArr2 = jVar.f12877h;
                    if (z4) {
                        arrayList = arrayList2;
                        i8 = size;
                        p040f2.h hVar3 = hVarArr2[jVar.f12878i.i(x4)];
                        AbstractC0167z abstractC0167z3 = hVar3.f12864b.f13165b;
                        gVar = jVar.f12871b;
                        bVarP = gVar.P(abstractC0167z3);
                        bVar = hVar3.f12865c;
                        if (bVarP != null) {
                        }
                        cVar = jVar.f12878i;
                        abstractC0167z = hVar3.f12864b.f13165b;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        length = cVar.f16304c.length;
                        eVar = eVar3;
                        c0774u = c0774u2;
                        i9 = 0;
                        while (i10 < length) {
                            if (cVar.j(i10, jElapsedRealtime)) {
                                i9++;
                            }
                        }
                        hashSet = new HashSet();
                        while (i11 < abstractC0167z.size()) {
                            hashSet.add(Integer.valueOf(((g2.b) abstractC0167z.get(i11)).f13113c));
                        }
                        int size3 = hashSet.size();
                        hashSet2 = new HashSet();
                        arrayListE = gVar.e(abstractC0167z);
                        while (i12 < arrayListE.size()) {
                            hashSet2.add(Integer.valueOf(((g2.b) arrayListE.get(i12)).f13113c));
                        }
                        oVar = new o(size3, size3 - hashSet2.size(), length, i9);
                        if (oVar.a(2)) {
                            eVar4.getClass();
                            eVarT = e.t(oVar, vVar);
                            if (eVarT != null) {
                                i13 = eVarT.f5785a;
                                if (oVar.a(i13)) {
                                    j = eVarT.f5786b;
                                    if (i13 == 2) {
                                        c cVar3 = jVar.f12878i;
                                        zA = cVar3.a(cVar3.i(x4), j);
                                    } else if (i13 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = bVar.f13112b;
                                        map = (HashMap) gVar.f14680a;
                                        if (map.containsKey(str)) {
                                            Long l9 = (Long) map.get(str);
                                            int i17 = t.f17159a;
                                            jMax = Math.max(jElapsedRealtime2, l9.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i14 = bVar.f13113c;
                                        if (i14 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i14);
                                            map2 = (HashMap) gVar.f14681b;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l10 = (Long) map2.get(numValueOf);
                                                int i18 = t.f17159a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l10.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zA = true;
                                    }
                                }
                            }
                        } else {
                            eVar4.getClass();
                            eVarT = e.t(oVar, vVar);
                            if (eVarT != null) {
                                i13 = eVarT.f5785a;
                                if (oVar.a(i13)) {
                                    j = eVarT.f5786b;
                                    if (i13 == 2) {
                                        c cVar4 = jVar.f12878i;
                                        zA = cVar4.a(cVar4.i(x4), j);
                                    } else if (i13 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = bVar.f13112b;
                                        map = (HashMap) gVar.f14680a;
                                        if (map.containsKey(str)) {
                                            Long l11 = (Long) map.get(str);
                                            int i19 = t.f17159a;
                                            jMax = Math.max(jElapsedRealtime2, l11.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i14 = bVar.f13113c;
                                        if (i14 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i14);
                                            map2 = (HashMap) gVar.f14681b;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l12 = (Long) map2.get(numValueOf);
                                                int i110 = t.f17159a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l12.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zA = true;
                                    }
                                }
                            }
                        }
                    } else {
                        arrayList = arrayList2;
                        i8 = size;
                        p040f2.h hVar4 = hVarArr2[jVar.f12878i.i(x4)];
                        AbstractC0167z abstractC0167z4 = hVar4.f12864b.f13165b;
                        gVar = jVar.f12871b;
                        bVarP = gVar.P(abstractC0167z4);
                        bVar = hVar4.f12865c;
                        if (bVarP != null) {
                        }
                        cVar = jVar.f12878i;
                        abstractC0167z = hVar4.f12864b.f13165b;
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        length = cVar.f16304c.length;
                        eVar = eVar3;
                        c0774u = c0774u2;
                        i9 = 0;
                        while (i10 < length) {
                            if (cVar.j(i10, jElapsedRealtime)) {
                                i9++;
                            }
                        }
                        hashSet = new HashSet();
                        while (i11 < abstractC0167z.size()) {
                            hashSet.add(Integer.valueOf(((g2.b) abstractC0167z.get(i11)).f13113c));
                        }
                        int size4 = hashSet.size();
                        hashSet2 = new HashSet();
                        arrayListE = gVar.e(abstractC0167z);
                        while (i12 < arrayListE.size()) {
                            hashSet2.add(Integer.valueOf(((g2.b) arrayListE.get(i12)).f13113c));
                        }
                        oVar = new o(size4, size4 - hashSet2.size(), length, i9);
                        if (oVar.a(2)) {
                            eVar4.getClass();
                            eVarT = e.t(oVar, vVar);
                            if (eVarT != null) {
                                i13 = eVarT.f5785a;
                                if (oVar.a(i13)) {
                                    j = eVarT.f5786b;
                                    if (i13 == 2) {
                                        c cVar5 = jVar.f12878i;
                                        zA = cVar5.a(cVar5.i(x4), j);
                                    } else if (i13 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = bVar.f13112b;
                                        map = (HashMap) gVar.f14680a;
                                        if (map.containsKey(str)) {
                                            Long l13 = (Long) map.get(str);
                                            int i111 = t.f17159a;
                                            jMax = Math.max(jElapsedRealtime2, l13.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i14 = bVar.f13113c;
                                        if (i14 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i14);
                                            map2 = (HashMap) gVar.f14681b;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l14 = (Long) map2.get(numValueOf);
                                                int i112 = t.f17159a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l14.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zA = true;
                                    }
                                }
                            }
                        } else {
                            eVar4.getClass();
                            eVarT = e.t(oVar, vVar);
                            if (eVarT != null) {
                                i13 = eVarT.f5785a;
                                if (oVar.a(i13)) {
                                    j = eVarT.f5786b;
                                    if (i13 == 2) {
                                        c cVar6 = jVar.f12878i;
                                        zA = cVar6.a(cVar6.i(x4), j);
                                    } else if (i13 == 1) {
                                        jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                        str = bVar.f13112b;
                                        map = (HashMap) gVar.f14680a;
                                        if (map.containsKey(str)) {
                                            Long l15 = (Long) map.get(str);
                                            int i113 = t.f17159a;
                                            jMax = Math.max(jElapsedRealtime2, l15.longValue());
                                        } else {
                                            jMax = jElapsedRealtime2;
                                        }
                                        map.put(str, Long.valueOf(jMax));
                                        i14 = bVar.f13113c;
                                        if (i14 != Integer.MIN_VALUE) {
                                            numValueOf = Integer.valueOf(i14);
                                            map2 = (HashMap) gVar.f14681b;
                                            if (map2.containsKey(numValueOf)) {
                                                Long l16 = (Long) map2.get(numValueOf);
                                                int i114 = t.f17159a;
                                                jElapsedRealtime2 = Math.max(jElapsedRealtime2, l16.longValue());
                                            }
                                            map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                        }
                                        zA = true;
                                    }
                                }
                            }
                        }
                    }
                    eVar = eVar3;
                    c0774u = c0774u2;
                    zA = true;
                }
            } else {
                z4 = jVar.j.f13118d;
                x4 = eVar3.f12602d;
                p040f2.h[] hVarArr3 = jVar.f12877h;
                if (z4) {
                    arrayList = arrayList2;
                    i8 = size;
                    p040f2.h hVar5 = hVarArr3[jVar.f12878i.i(x4)];
                    AbstractC0167z abstractC0167z5 = hVar5.f12864b.f13165b;
                    gVar = jVar.f12871b;
                    bVarP = gVar.P(abstractC0167z5);
                    bVar = hVar5.f12865c;
                    if (bVarP != null) {
                    }
                    cVar = jVar.f12878i;
                    abstractC0167z = hVar5.f12864b.f13165b;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    length = cVar.f16304c.length;
                    eVar = eVar3;
                    c0774u = c0774u2;
                    i9 = 0;
                    while (i10 < length) {
                        if (cVar.j(i10, jElapsedRealtime)) {
                            i9++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i11 < abstractC0167z.size()) {
                        hashSet.add(Integer.valueOf(((g2.b) abstractC0167z.get(i11)).f13113c));
                    }
                    int size5 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListE = gVar.e(abstractC0167z);
                    while (i12 < arrayListE.size()) {
                        hashSet2.add(Integer.valueOf(((g2.b) arrayListE.get(i12)).f13113c));
                    }
                    oVar = new o(size5, size5 - hashSet2.size(), length, i9);
                    if (oVar.a(2)) {
                        eVar4.getClass();
                        eVarT = e.t(oVar, vVar);
                        if (eVarT != null) {
                            i13 = eVarT.f5785a;
                            if (oVar.a(i13)) {
                                j = eVarT.f5786b;
                                if (i13 == 2) {
                                    c cVar7 = jVar.f12878i;
                                    zA = cVar7.a(cVar7.i(x4), j);
                                } else if (i13 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = bVar.f13112b;
                                    map = (HashMap) gVar.f14680a;
                                    if (map.containsKey(str)) {
                                        Long l17 = (Long) map.get(str);
                                        int i115 = t.f17159a;
                                        jMax = Math.max(jElapsedRealtime2, l17.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i14 = bVar.f13113c;
                                    if (i14 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i14);
                                        map2 = (HashMap) gVar.f14681b;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l18 = (Long) map2.get(numValueOf);
                                            int i116 = t.f17159a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l18.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zA = true;
                                }
                            }
                        }
                    } else {
                        eVar4.getClass();
                        eVarT = e.t(oVar, vVar);
                        if (eVarT != null) {
                            i13 = eVarT.f5785a;
                            if (oVar.a(i13)) {
                                j = eVarT.f5786b;
                                if (i13 == 2) {
                                    c cVar8 = jVar.f12878i;
                                    zA = cVar8.a(cVar8.i(x4), j);
                                } else if (i13 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = bVar.f13112b;
                                    map = (HashMap) gVar.f14680a;
                                    if (map.containsKey(str)) {
                                        Long l19 = (Long) map.get(str);
                                        int i117 = t.f17159a;
                                        jMax = Math.max(jElapsedRealtime2, l19.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i14 = bVar.f13113c;
                                    if (i14 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i14);
                                        map2 = (HashMap) gVar.f14681b;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l110 = (Long) map2.get(numValueOf);
                                            int i118 = t.f17159a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l110.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zA = true;
                                }
                            }
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    i8 = size;
                    p040f2.h hVar6 = hVarArr3[jVar.f12878i.i(x4)];
                    AbstractC0167z abstractC0167z6 = hVar6.f12864b.f13165b;
                    gVar = jVar.f12871b;
                    bVarP = gVar.P(abstractC0167z6);
                    bVar = hVar6.f12865c;
                    if (bVarP != null) {
                    }
                    cVar = jVar.f12878i;
                    abstractC0167z = hVar6.f12864b.f13165b;
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    length = cVar.f16304c.length;
                    eVar = eVar3;
                    c0774u = c0774u2;
                    i9 = 0;
                    while (i10 < length) {
                        if (cVar.j(i10, jElapsedRealtime)) {
                            i9++;
                        }
                    }
                    hashSet = new HashSet();
                    while (i11 < abstractC0167z.size()) {
                        hashSet.add(Integer.valueOf(((g2.b) abstractC0167z.get(i11)).f13113c));
                    }
                    int size6 = hashSet.size();
                    hashSet2 = new HashSet();
                    arrayListE = gVar.e(abstractC0167z);
                    while (i12 < arrayListE.size()) {
                        hashSet2.add(Integer.valueOf(((g2.b) arrayListE.get(i12)).f13113c));
                    }
                    oVar = new o(size6, size6 - hashSet2.size(), length, i9);
                    if (oVar.a(2)) {
                        eVar4.getClass();
                        eVarT = e.t(oVar, vVar);
                        if (eVarT != null) {
                            i13 = eVarT.f5785a;
                            if (oVar.a(i13)) {
                                j = eVarT.f5786b;
                                if (i13 == 2) {
                                    c cVar9 = jVar.f12878i;
                                    zA = cVar9.a(cVar9.i(x4), j);
                                } else if (i13 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = bVar.f13112b;
                                    map = (HashMap) gVar.f14680a;
                                    if (map.containsKey(str)) {
                                        Long l111 = (Long) map.get(str);
                                        int i119 = t.f17159a;
                                        jMax = Math.max(jElapsedRealtime2, l111.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i14 = bVar.f13113c;
                                    if (i14 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i14);
                                        map2 = (HashMap) gVar.f14681b;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l112 = (Long) map2.get(numValueOf);
                                            int i1110 = t.f17159a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l112.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zA = true;
                                }
                            }
                        }
                    } else {
                        eVar4.getClass();
                        eVarT = e.t(oVar, vVar);
                        if (eVarT != null) {
                            i13 = eVarT.f5785a;
                            if (oVar.a(i13)) {
                                j = eVarT.f5786b;
                                if (i13 == 2) {
                                    c cVar10 = jVar.f12878i;
                                    zA = cVar10.a(cVar10.i(x4), j);
                                } else if (i13 == 1) {
                                    jElapsedRealtime2 = SystemClock.elapsedRealtime() + j;
                                    str = bVar.f13112b;
                                    map = (HashMap) gVar.f14680a;
                                    if (map.containsKey(str)) {
                                        Long l113 = (Long) map.get(str);
                                        int i1111 = t.f17159a;
                                        jMax = Math.max(jElapsedRealtime2, l113.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    i14 = bVar.f13113c;
                                    if (i14 != Integer.MIN_VALUE) {
                                        numValueOf = Integer.valueOf(i14);
                                        map2 = (HashMap) gVar.f14681b;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l114 = (Long) map2.get(numValueOf);
                                            int i1112 = t.f17159a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l114.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                    zA = true;
                                }
                            }
                        }
                    }
                }
                eVar = eVar3;
                c0774u = c0774u2;
                zA = true;
            }
            if (!zA) {
                if (z9) {
                    this = this;
                    if (z8) {
                        eVar = eVar;
                        if (this.f(i8) == eVar) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        a.h(z7);
                        if (arrayList.isEmpty()) {
                            this.f12622J = this.f12623K;
                        }
                    } else {
                        eVar = eVar;
                    }
                    eVar2 = K.f16729e;
                } else {
                    Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                }
                if (eVar2 == null) {
                    eVar4.getClass();
                    jV = e.v(vVar);
                    if (jV != -9223372036854775807L) {
                        eVar2 = new Q1.e(jV, 0, false);
                    } else {
                        eVar2 = K.f16730f;
                    }
                }
                Q1.e eVar5 = eVar2;
                zA2 = eVar5.a();
                this.f12632x.h(c0774u, eVar.f12601c, this.f12626a, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y, iOException, !zA2);
                if (!zA2) {
                    this.f12619G = null;
                    eVar4.getClass();
                    this.f12631f.b(this);
                }
                return eVar5;
            }
            eVar2 = null;
            if (eVar2 == null) {
                eVar4.getClass();
                jV = e.v(vVar);
                if (jV != -9223372036854775807L) {
                    eVar2 = new Q1.e(jV, 0, false);
                } else {
                    eVar2 = K.f16730f;
                }
            }
            Q1.e eVar6 = eVar2;
            zA2 = eVar6.a();
            this.f12632x.h(c0774u, eVar.f12601c, this.f12626a, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y, iOException, !zA2);
            if (!zA2) {
                this.f12619G = null;
                eVar4.getClass();
                this.f12631f.b(this);
            }
            return eVar6;
        }
        eVar = eVar3;
        c0774u = c0774u2;
        arrayList = arrayList2;
        i8 = size;
        zA = false;
        if (!zA) {
            if (z9) {
                this = this;
                if (z8) {
                    eVar = eVar;
                    if (this.f(i8) == eVar) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    a.h(z7);
                    if (arrayList.isEmpty()) {
                        this.f12622J = this.f12623K;
                    }
                } else {
                    eVar = eVar;
                }
                eVar2 = K.f16729e;
            } else {
                Log.w("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            }
            if (eVar2 == null) {
                eVar4.getClass();
                jV = e.v(vVar);
                if (jV != -9223372036854775807L) {
                    eVar2 = new Q1.e(jV, 0, false);
                } else {
                    eVar2 = K.f16730f;
                }
            }
            Q1.e eVar7 = eVar2;
            zA2 = eVar7.a();
            this.f12632x.h(c0774u, eVar.f12601c, this.f12626a, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y, iOException, !zA2);
            if (!zA2) {
                this.f12619G = null;
                eVar4.getClass();
                this.f12631f.b(this);
            }
            return eVar7;
        }
        eVar2 = null;
        if (eVar2 == null) {
            eVar4.getClass();
            jV = e.v(vVar);
            if (jV != -9223372036854775807L) {
                eVar2 = new Q1.e(jV, 0, false);
            } else {
                eVar2 = K.f16730f;
            }
        }
        Q1.e eVar8 = eVar2;
        zA2 = eVar8.a();
        this.f12632x.h(c0774u, eVar.f12601c, this.f12626a, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y, iOException, !zA2);
        if (!zA2) {
            this.f12619G = null;
            eVar4.getClass();
            this.f12631f.b(this);
        }
        return eVar8;
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        return this.f12634z.d();
    }

    public final boolean j(int i7) {
        int iN;
        a aVar = (a) this.f12614B.get(i7);
        if (this.f12616D.n() > aVar.c(0)) {
            return true;
        }
        int i8 = 0;
        do {
            V[] vArr = this.f12617E;
            if (i8 >= vArr.length) {
                return false;
            }
            iN = vArr[i8].n();
            i8++;
        } while (iN <= aVar.c(i8));
        return true;
    }

    @Override // p018c2.Y
    public final long k() {
        if (m()) {
            return this.f12622J;
        }
        if (this.f12625M) {
            return Long.MIN_VALUE;
        }
        return h().f12606y;
    }

    @Override // p146u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        e eVar = (e) h6;
        this.f12619G = null;
        long j7 = eVar.f12599a;
        Uri uri = eVar.f12607z.f16761c;
        C0774u c0774u = new C0774u();
        this.f12633y.getClass();
        this.f12632x.d(c0774u, eVar.f12601c, this.f12626a, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y);
        if (z4) {
            return;
        }
        if (m()) {
            this.f12616D.y(false);
            for (V v6 : this.f12617E) {
                v6.y(false);
            }
        } else if (eVar instanceof a) {
            ArrayList arrayList = this.f12614B;
            f(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f12622J = this.f12623K;
            }
        }
        this.f12631f.b(this);
    }

    public final boolean m() {
        return this.f12622J != -9223372036854775807L;
    }

    public final void n() {
        int iR = r(this.f12616D.n(), this.f12624L - 1);
        while (true) {
            int i7 = this.f12624L;
            if (i7 > iR) {
                return;
            }
            this.f12624L = i7 + 1;
            a aVar = (a) this.f12614B.get(i7);
            X x4 = aVar.f12602d;
            if (!x4.equals(this.f12620H)) {
                this.f12632x.b(this.f12626a, x4, aVar.f12603e, aVar.f12604f, aVar.f12605x);
            }
            this.f12620H = x4;
        }
    }

    public final int r(int i7, int i8) {
        ArrayList arrayList;
        do {
            i8++;
            arrayList = this.f12614B;
            if (i8 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((a) arrayList.get(i8)).c(0) <= i7);
        return i8 - 1;
    }

    public final void s(b bVar) {
        this.f12621I = bVar;
        V v6 = this.f12616D;
        v6.h();
        C1010l1 c1010l1 = v6.f10275h;
        if (c1010l1 != null) {
            c1010l1.F(v6.f10272e);
            v6.f10275h = null;
            v6.f10274g = null;
        }
        for (V v7 : this.f12617E) {
            v7.h();
            C1010l1 c1010l2 = v7.f10275h;
            if (c1010l2 != null) {
                c1010l2.F(v7.f10272e);
                v7.f10275h = null;
                v7.f10274g = null;
            }
        }
        this.f12634z.e(this);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x025f  */
    /* JADX WARN: Code duplicated, block: B:101:0x0261  */
    /* JADX WARN: Code duplicated, block: B:104:0x026c  */
    /* JADX WARN: Code duplicated, block: B:105:0x026f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0280  */
    /* JADX WARN: Code duplicated, block: B:109:0x0289  */
    /* JADX WARN: Code duplicated, block: B:112:0x029c  */
    /* JADX WARN: Code duplicated, block: B:113:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:118:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:98:0x0259  */
    @Override // p018c2.Y
    public final boolean y(long j) {
        long j3;
        List listEmptyList;
        K k7;
        p040f2.h[] hVarArr;
        boolean z4;
        long j7;
        long jMax;
        long j8;
        boolean z7;
        long j9;
        long j10;
        long jB;
        long jK;
        long j11;
        B3.g gVar;
        X x4;
        Object hVar;
        boolean z8;
        List list;
        long j12;
        int i7;
        boolean z9;
        if (!this.f12625M) {
            K k8 = this.f12634z;
            if (!k8.d() && !k8.b()) {
                boolean zM = m();
                if (zM) {
                    listEmptyList = Collections.emptyList();
                    j3 = this.f12622J;
                } else {
                    j3 = h().f12606y;
                    listEmptyList = this.f12615C;
                }
                j jVar = this.f12630e;
                C0756b c0756b = jVar.f12880l;
                B3.g gVar2 = this.f12613A;
                if (c0756b != null) {
                    k7 = k8;
                    z4 = zM;
                    gVar = gVar2;
                } else {
                    long j13 = j3 - j;
                    long jE = t.E(jVar.j.b(jVar.f12879k).f13149b) + t.E(jVar.j.f13115a) + j3;
                    p040f2.m mVar = jVar.f12876g;
                    if (mVar != null) {
                        n nVar = mVar.f12896e;
                        g2.c cVar = nVar.f12902f;
                        if (!cVar.f13118d) {
                            k7 = k8;
                            z9 = false;
                        } else if (nVar.f12904y) {
                            k7 = k8;
                            z9 = true;
                        } else {
                            k7 = k8;
                            Map.Entry entryCeilingEntry = nVar.f12901e.ceilingEntry(Long.valueOf(cVar.f13122h));
                            R4.c cVar2 = nVar.f12898b;
                            if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jE) {
                                z9 = false;
                            } else {
                                long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                                p040f2.f fVar = (p040f2.f) cVar2.f6064b;
                                long j14 = fVar.f12843N;
                                if (j14 == -9223372036854775807L || j14 < jLongValue) {
                                    fVar.f12843N = jLongValue;
                                }
                                z9 = true;
                            }
                            if (z9 && nVar.f12903x) {
                                nVar.f12904y = true;
                                nVar.f12903x = false;
                                p040f2.f fVar2 = (p040f2.f) cVar2.f6064b;
                                fVar2.f12833D.removeCallbacks(fVar2.f12859w);
                                fVar2.t();
                            }
                        }
                        if (z9) {
                            z4 = zM;
                            gVar = gVar2;
                        }
                    } else {
                        k7 = k8;
                    }
                    long jE2 = t.E(t.u(jVar.f12875f));
                    g2.c cVar3 = jVar.j;
                    long j15 = cVar3.f13115a;
                    long jE3 = j15 == -9223372036854775807L ? -9223372036854775807L : jE2 - t.E(j15 + cVar3.b(jVar.f12879k).f13149b);
                    j jVar2 = listEmptyList.isEmpty() ? null : (j) listEmptyList.get(listEmptyList.size() - 1);
                    int length = jVar.f12878i.f16304c.length;
                    k[] kVarArr = new k[length];
                    int i8 = 0;
                    while (true) {
                        hVarArr = jVar.f12877h;
                        if (i8 >= length) {
                            break;
                        }
                        p040f2.h hVar2 = hVarArr[i8];
                        p040f2.g gVar3 = hVar2.f12866d;
                        C1009l0 c1009l0 = k.f12646s;
                        if (gVar3 == null) {
                            kVarArr[i8] = c1009l0;
                            z8 = zM;
                            list = listEmptyList;
                            j12 = j13;
                            i7 = length;
                        } else {
                            z8 = zM;
                            list = listEmptyList;
                            long j16 = hVar2.f12867e;
                            long jF = gVar3.f(j16, jE2);
                            j12 = j13;
                            i7 = length;
                            long j17 = hVar2.f12868f;
                            long j18 = jF + j17;
                            long jB2 = hVar2.b(jE2);
                            long jA = jVar2 != null ? jVar2.a() : t.k(hVar2.f12866d.l(j3, j16) + j17, j18, jB2);
                            if (jA < j18) {
                                kVarArr[i8] = c1009l0;
                            } else {
                                kVarArr[i8] = new i(jVar.b(i8), jA, jB2);
                            }
                        }
                        i8++;
                        length = i7;
                        zM = z8;
                        listEmptyList = list;
                        j13 = j12;
                    }
                    z4 = zM;
                    List list2 = listEmptyList;
                    long j19 = j13;
                    long j20 = 0;
                    if (jVar.j.f13118d) {
                        p040f2.h hVar3 = hVarArr[0];
                        if (hVar3.f12866d.v(hVar3.f12867e) == 0) {
                            j7 = -9223372036854775807L;
                            jMax = -9223372036854775807L;
                        } else {
                            long jC = hVarArr[0].c(hVarArr[0].b(jE2));
                            g2.c cVar4 = jVar.j;
                            long j21 = cVar4.f13115a;
                            j7 = -9223372036854775807L;
                            long jE4 = j21 == -9223372036854775807L ? -9223372036854775807L : jE2 - t.E(j21 + cVar4.b(jVar.f12879k).f13149b);
                            j20 = 0;
                            jMax = Math.max(0L, Math.min(jE4, jC) - j);
                        }
                    } else {
                        j7 = -9223372036854775807L;
                        jMax = -9223372036854775807L;
                    }
                    long j22 = j7;
                    jVar.f12878i.l(j19, jMax, list2, kVarArr);
                    p040f2.h hVarB = jVar.b(jVar.f12878i.e());
                    p040f2.g gVar4 = hVarB.f12866d;
                    g2.b bVar = hVarB.f12865c;
                    d dVar = hVarB.f12863a;
                    g2.m mVar2 = hVarB.f12864b;
                    if (dVar == null) {
                        j8 = hVarB.f12867e;
                        if (j8 != j22) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (gVar4.v(j8) == 0) {
                            gVar2.f1063b = z7;
                        } else {
                            long jF2 = gVar4.f(j8, jE2);
                            j9 = hVarB.f12868f;
                            j10 = jF2 + j9;
                            jB = hVarB.b(jE2);
                            if (jVar2 != null) {
                                jK = jVar2.a();
                            } else {
                                jK = t.k(gVar4.l(j3, j8) + j9, j10, jB);
                            }
                            long j23 = j3;
                            j11 = jK;
                            if (j11 < j10) {
                                jVar.f12880l = new C0756b();
                            } else if (j11 <= jB || (jVar.f12881m && j11 >= jB)) {
                                gVar = gVar2;
                                gVar.f1063b = z7;
                            } else if (!z7 || hVarB.d(j11) < j8) {
                                int iMin = (int) Math.min(1, (jB - j11) + 1);
                                if (j8 != j22) {
                                    for (int i9 = 1; iMin > i9 && hVarB.d((((long) iMin) + j11) - 1) >= j8; i9 = 1) {
                                        iMin--;
                                    }
                                }
                                long j24 = list2.isEmpty() ? j23 : -9223372036854775807L;
                                c cVar5 = jVar.f12878i;
                                X x7 = cVar5.f16305d[cVar5.e()];
                                int iG = jVar.f12878i.g();
                                Object objF = jVar.f12878i.f();
                                long jD = hVarB.d(j11);
                                g2.j jVarI = gVar4.i(j11 - j9);
                                InterfaceC0954m interfaceC0954m = jVar.f12874e;
                                if (dVar == null) {
                                    hVar = new l(interfaceC0954m, Y4.D.f(mVar2, bVar.f13111a, jVarI, gVar4.s() || (jE3 > (-9223372036854775807L) ? 1 : (jE3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (hVarB.c(j11) > jE3 ? 1 : (hVarB.c(j11) == jE3 ? 0 : -1)) <= 0 ? 0 : 8), x7, iG, objF, jD, hVarB.c(j11), j11, jVar.f12873d, x7);
                                    gVar = gVar2;
                                } else {
                                    int i10 = 1;
                                    int i11 = 1;
                                    while (true) {
                                        if (i10 >= iMin) {
                                            x4 = x7;
                                            break;
                                        }
                                        int i12 = iMin;
                                        x4 = x7;
                                        g2.j jVarA = jVarI.a(gVar4.i((((long) i10) + j11) - j9), bVar.f13111a);
                                        if (jVarA == null) {
                                            break;
                                        }
                                        i11++;
                                        i10++;
                                        x7 = x4;
                                        jVarI = jVarA;
                                        iMin = i12;
                                    }
                                    long j25 = (((long) i11) + j11) - 1;
                                    long jC2 = hVarB.c(j25);
                                    hVar = new h(interfaceC0954m, Y4.D.f(mVar2, bVar.f13111a, jVarI, gVar4.s() || (jE3 > (-9223372036854775807L) ? 1 : (jE3 == (-9223372036854775807L) ? 0 : -1)) == 0 || (hVarB.c(j25) > jE3 ? 1 : (hVarB.c(j25) == jE3 ? 0 : -1)) <= 0 ? 0 : 8), x4, iG, objF, jD, jC2, j24, (j8 == j22 || j8 > jC2) ? -9223372036854775807L : j8, j11, i11, -mVar2.f13166c, hVarB.f12863a);
                                    gVar = gVar2;
                                }
                                gVar.f1064c = hVar;
                            } else {
                                gVar2.f1063b = true;
                            }
                        }
                        gVar = gVar2;
                    } else {
                        g2.j jVar3 = dVar.f12598z == null ? mVar2.f13168e : null;
                        g2.j jVarD = gVar4 == null ? mVar2.d() : null;
                        if (jVar3 == null && jVarD == null) {
                            j8 = hVarB.f12867e;
                            if (j8 != j22) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (gVar4.v(j8) == 0) {
                                gVar2.f1063b = z7;
                            } else {
                                long jF3 = gVar4.f(j8, jE2);
                                j9 = hVarB.f12868f;
                                j10 = jF3 + j9;
                                jB = hVarB.b(jE2);
                                if (jVar2 != null) {
                                    jK = jVar2.a();
                                } else {
                                    jK = t.k(gVar4.l(j3, j8) + j9, j10, jB);
                                }
                                long j26 = j3;
                                j11 = jK;
                                if (j11 < j10) {
                                    jVar.f12880l = new C0756b();
                                } else if (j11 <= jB) {
                                    gVar = gVar2;
                                    gVar.f1063b = z7;
                                } else {
                                    gVar = gVar2;
                                    gVar.f1063b = z7;
                                }
                            }
                        } else {
                            c cVar6 = jVar.f12878i;
                            X x8 = cVar6.f16305d[cVar6.e()];
                            int iG2 = jVar.f12878i.g();
                            Object objF2 = jVar.f12878i.f();
                            if (jVar3 != null) {
                                g2.j jVarA2 = jVar3.a(jVarD, bVar.f13111a);
                                if (jVarA2 != null) {
                                    jVar3 = jVarA2;
                                }
                            } else {
                                jVar3 = jVarD;
                            }
                            gVar2.f1064c = new i(jVar.f12874e, Y4.D.f(mVar2, bVar.f13111a, jVar3, 0), x8, iG2, objF2, hVarB.f12863a);
                        }
                        gVar = gVar2;
                    }
                }
                boolean z10 = gVar.f1063b;
                e eVar = (e) gVar.f1064c;
                gVar.f1064c = null;
                gVar.f1063b = false;
                if (z10) {
                    this.f12622J = -9223372036854775807L;
                    this.f12625M = true;
                    return true;
                }
                if (eVar == null) {
                    return false;
                }
                this.f12619G = eVar;
                boolean z11 = eVar instanceof a;
                k kVar = this.f12618F;
                if (z11) {
                    a aVar = (a) eVar;
                    if (z4) {
                        long j27 = this.f12622J;
                        if (aVar.f12605x != j27) {
                            this.f12616D.f10286t = j27;
                            for (V v6 : this.f12617E) {
                                v6.f10286t = this.f12622J;
                            }
                        }
                        this.f12622J = -9223372036854775807L;
                    }
                    aVar.f12578D = kVar;
                    V[] vArr = (V[]) kVar.f12448c;
                    int[] iArr = new int[vArr.length];
                    for (int i13 = 0; i13 < vArr.length; i13++) {
                        V v7 = vArr[i13];
                        iArr[i13] = v7.f10283q + v7.f10282p;
                    }
                    aVar.f12579E = iArr;
                    this.f12614B.add(aVar);
                } else if (eVar instanceof i) {
                    ((i) eVar).f12642B = kVar;
                }
                k7.f(eVar, this, this.f12633y.u(eVar.f12601c));
                this.f12632x.k(new C0774u(eVar.f12600b), eVar.f12601c, this.f12626a, eVar.f12602d, eVar.f12603e, eVar.f12604f, eVar.f12605x, eVar.f12606y);
                return true;
            }
        }
        return false;
    }
}
