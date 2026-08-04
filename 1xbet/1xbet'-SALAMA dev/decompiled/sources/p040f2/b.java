package p040f2;

import A1.H0;
import B1.m;
import B1.p;
import B4.V;
import M4.e;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.Format$Builder;
import g2.a;
import g2.c;
import g2.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p018c2.A;
import p018c2.B;
import p018c2.I;
import p018c2.S;
import p018c2.W;
import p018c2.X;
import p018c2.Y;
import p018c2.e0;
import p018c2.f0;
import p031e1.k;
import p033e3.h;
import p072k1.g;
import p146u2.InterfaceC0953l;
import p146u2.InterfaceC0954m;
import p146u2.L;
import p146u2.U;
import p146u2.r;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class b implements B, X {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Pattern f12792O = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final Pattern f12793P = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final f0 f12794A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final a[] f12795B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final V f12796C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final n f12797D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final I f12799F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final m f12800G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public A f12801H;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public h f12804K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public c f12805L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f12806M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public List f12807N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p145u1.c f12809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U f12810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1.h f12811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f12812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f12813f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12814x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final L f12815y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final r f12816z;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p032e2.g[] f12802I = new p032e2.g[0];

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public k[] f12803J = new k[0];

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final IdentityHashMap f12798E = new IdentityHashMap();

    public b(int i7, c cVar, g gVar, int i8, p145u1.c cVar2, U u4, E1.h hVar, m mVar, e eVar, I i9, long j, L l7, r rVar, V v6, R4.c cVar3, p pVar) {
        int i10;
        int i11;
        int i12;
        A1.X[] xArr;
        A1.X[] xArrD;
        f fVarA;
        this.f12808a = i7;
        this.f12805L = cVar;
        this.f12813f = gVar;
        this.f12806M = i8;
        this.f12809b = cVar2;
        this.f12810c = u4;
        this.f12811d = hVar;
        this.f12800G = mVar;
        this.f12812e = eVar;
        this.f12799F = i9;
        this.f12814x = j;
        this.f12815y = l7;
        this.f12816z = rVar;
        this.f12796C = v6;
        this.f12797D = new n(cVar, cVar3, rVar);
        int i13 = 0;
        p032e2.g[] gVarArr = this.f12802I;
        v6.getClass();
        this.f12804K = new h(gVarArr);
        g2.h hVarB = cVar.b(i8);
        List list = hVarB.f13151d;
        this.f12807N = list;
        List list2 = hVarB.f13150c;
        int size = list2.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((a) list2.get(i14)).f13105a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            a aVar = (a) list2.get(i15);
            f fVarA2 = a("http://dashif.org/guidelines/trickmode", aVar.f13109e);
            List list3 = aVar.f13110f;
            fVarA2 = fVarA2 == null ? a("http://dashif.org/guidelines/trickmode", list3) : fVarA2;
            int iMin = (fVarA2 == null || (iMin = sparseIntArray.get(Integer.parseInt(fVarA2.f13142b), -1)) == -1) ? i15 : iMin;
            if (iMin == i15 && (fVarA = a("urn:mpeg:dash:adaptation-set-switching:2016", list3)) != null) {
                int i16 = t.f17159a;
                String[] strArrSplit = fVarA.f13142b.split(",", -1);
                int length = strArrSplit.length;
                for (int i17 = i13; i17 < length; i17++) {
                    int i18 = sparseIntArray.get(Integer.parseInt(strArrSplit[i17]), -1);
                    if (i18 != -1) {
                        iMin = Math.min(iMin, i18);
                    }
                }
            }
            if (iMin != i15) {
                List list4 = (List) sparseArray.get(i15);
                List list5 = (List) sparseArray.get(iMin);
                list5.addAll(list4);
                sparseArray.put(i15, list5);
                arrayList.remove(list4);
            }
            i15++;
            i13 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i19 = 0; i19 < size2; i19++) {
            int[] iArrZ = Q0.a.Z((Collection) arrayList.get(i19));
            iArr[i19] = iArrZ;
            Arrays.sort(iArrZ);
        }
        boolean[] zArr = new boolean[size2];
        A1.X[][] xArr2 = new A1.X[size2][];
        int i20 = 0;
        int i21 = 0;
        while (i20 < size2) {
            for (int i22 : iArr[i20]) {
                List list6 = ((a) list2.get(i22)).f13107c;
                for (int i23 = 0; i23 < list6.size(); i23++) {
                    if (!((g2.m) list6.get(i23)).f13167d.isEmpty()) {
                        zArr[i20] = true;
                        i21++;
                        break;
                    }
                }
            }
            int[] iArr2 = iArr[i20];
            int length2 = iArr2.length;
            int i24 = 0;
            while (true) {
                if (i24 >= length2) {
                    i12 = 1;
                    xArr = new A1.X[0];
                    break;
                }
                int i25 = iArr2[i24];
                a aVar2 = (a) list2.get(i25);
                List list7 = ((a) list2.get(i25)).f13108d;
                int[] iArr3 = iArr2;
                int i26 = 0;
                while (true) {
                    if (i26 < list7.size()) {
                        f fVar = (f) list7.get(i26);
                        int i27 = length2;
                        List list8 = list7;
                        if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f13141a)) {
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10537k = "application/cea-608";
                            format$Builder.f10528a = k.g(new StringBuilder(), aVar2.f13105a, ":cea608");
                            xArrD = d(fVar, f12792O, new A1.X(format$Builder));
                        } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f13141a)) {
                            Format$Builder format$Builder2 = new Format$Builder();
                            format$Builder2.f10537k = "application/cea-708";
                            format$Builder2.f10528a = k.g(new StringBuilder(), aVar2.f13105a, ":cea708");
                            xArrD = d(fVar, f12793P, new A1.X(format$Builder2));
                        } else {
                            i26++;
                            list7 = list8;
                            length2 = i27;
                        }
                        xArr = xArrD;
                        i12 = 1;
                        break;
                    }
                    i24++;
                    iArr2 = iArr3;
                }
            }
            xArr2[i20] = xArr;
            if (xArr.length != 0) {
                i21 += i12;
            }
            i20 += i12;
        }
        int size3 = list.size() + i21 + size2;
        e0[] e0VarArr = new e0[size3];
        a[] aVarArr = new a[size3];
        int i28 = 0;
        int i29 = 0;
        while (i29 < size2) {
            int[] iArr4 = iArr[i29];
            ArrayList arrayList3 = new ArrayList();
            int length3 = iArr4.length;
            int i30 = size2;
            int i31 = 0;
            while (i31 < length3) {
                arrayList3.addAll(((a) list2.get(iArr4[i31])).f13107c);
                i31++;
                iArr = iArr;
            }
            int[][] iArr5 = iArr;
            int size4 = arrayList3.size();
            A1.X[] xArr3 = new A1.X[size4];
            int i32 = 0;
            while (i32 < size4) {
                int i33 = size4;
                A1.X x4 = ((g2.m) arrayList3.get(i32)).f13164a;
                ArrayList arrayList4 = arrayList3;
                int iB = hVar.b(x4);
                Format$Builder format$BuilderA = x4.a();
                format$BuilderA.f10527D = iB;
                xArr3[i32] = new A1.X(format$BuilderA);
                i32++;
                size4 = i33;
                arrayList3 = arrayList4;
            }
            a aVar3 = (a) list2.get(iArr4[0]);
            int i34 = aVar3.f13105a;
            String string = i34 != -1 ? Integer.toString(i34) : k.d(i29, "unset:");
            int i35 = i28 + 1;
            if (zArr[i29]) {
                i10 = i35;
                i35 = i28 + 2;
            } else {
                i10 = -1;
            }
            if (xArr2[i29].length != 0) {
                i11 = i35;
                i35++;
            } else {
                i11 = -1;
            }
            e0VarArr[i28] = new e0(string, xArr3);
            aVarArr[i28] = new a(aVar3.f13106b, 0, iArr4, i28, i10, i11, -1);
            int i36 = i10;
            int i37 = -1;
            if (i36 != -1) {
                String strE = k.e(string, ":emsg");
                Format$Builder format$Builder3 = new Format$Builder();
                format$Builder3.f10528a = strE;
                format$Builder3.f10537k = "application/x-emsg";
                e0VarArr[i36] = new e0(strE, new A1.X(format$Builder3));
                aVarArr[i36] = new a(5, 1, iArr4, i28, -1, -1, -1);
                i37 = -1;
            }
            if (i11 != i37) {
                e0VarArr[i11] = new e0(k.e(string, ":cc"), xArr2[i29]);
                aVarArr[i11] = new a(3, 1, iArr4, i28, -1, -1, -1);
            }
            i29++;
            size2 = i30;
            iArr = iArr5;
            i28 = i35;
            list2 = list2;
        }
        int i38 = 0;
        while (i38 < list.size()) {
            g2.g gVar2 = (g2.g) list.get(i38);
            Format$Builder format$Builder4 = new Format$Builder();
            format$Builder4.f10528a = gVar2.a();
            format$Builder4.f10537k = "application/x-emsg";
            e0VarArr[i28] = new e0(gVar2.a() + ":" + i38, new A1.X(format$Builder4));
            aVarArr[i28] = new a(5, 2, new int[0], -1, -1, -1, i38);
            i38++;
            i28++;
        }
        Pair pairCreate = Pair.create(new f0(e0VarArr), aVarArr);
        this.f12794A = (f0) pairCreate.first;
        this.f12795B = (a[]) pairCreate.second;
    }

    public static f a(String str, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            f fVar = (f) list.get(i7);
            if (str.equals(fVar.f13141a)) {
                return fVar;
            }
        }
        return null;
    }

    public static A1.X[] d(f fVar, Pattern pattern, A1.X x4) {
        String str = fVar.f13142b;
        if (str == null) {
            return new A1.X[]{x4};
        }
        int i7 = t.f17159a;
        String[] strArrSplit = str.split(";", -1);
        A1.X[] xArr = new A1.X[strArrSplit.length];
        for (int i8 = 0; i8 < strArrSplit.length; i8++) {
            Matcher matcher = pattern.matcher(strArrSplit[i8]);
            if (!matcher.matches()) {
                return new A1.X[]{x4};
            }
            int i9 = Integer.parseInt(matcher.group(1));
            Format$Builder format$BuilderA = x4.a();
            format$BuilderA.f10528a = x4.f304a + ":" + i9;
            format$BuilderA.f10526C = i9;
            format$BuilderA.f10530c = matcher.group(2);
            xArr[i8] = new A1.X(format$BuilderA);
        }
        return xArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v15, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    @Override // p018c2.B
    public final long I(p139t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        int i7;
        boolean z4;
        int[] iArr;
        int i8;
        int[] iArr2;
        W[] wArr2;
        ?? r7;
        e0 e0VarA;
        e0 e0VarA2;
        int i9;
        boolean z7;
        m mVar;
        boolean z8;
        p139t2.c[] cVarArr2 = cVarArr;
        W[] wArr3 = wArr;
        int[] iArr3 = new int[cVarArr2.length];
        int i10 = 0;
        while (true) {
            i7 = -1;
            if (i10 >= cVarArr2.length) {
                break;
            }
            p139t2.c cVar = cVarArr2[i10];
            if (cVar != null) {
                iArr3[i10] = this.f12794A.b(cVar.f16302a);
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        for (int i11 = 0; i11 < cVarArr2.length; i11++) {
            if (cVarArr2[i11] == null || !zArr[i11]) {
                W w7 = wArr3[i11];
                if (w7 instanceof p032e2.g) {
                    ((p032e2.g) w7).s(this);
                } else if (w7 instanceof p032e2.f) {
                    p032e2.f fVar = (p032e2.f) w7;
                    p032e2.g gVar = fVar.f12612e;
                    boolean[] zArr3 = gVar.f12629d;
                    int i12 = fVar.f12610c;
                    p151v2.a.h(zArr3[i12]);
                    gVar.f12629d[i12] = false;
                }
                wArr3[i11] = null;
            }
        }
        int i13 = 0;
        while (true) {
            z4 = true;
            if (i13 >= cVarArr2.length) {
                break;
            }
            W w8 = wArr3[i13];
            if ((w8 instanceof p018c2.r) || (w8 instanceof p032e2.f)) {
                int iC = c(i13, iArr3);
                if (iC == -1) {
                    z8 = wArr3[i13] instanceof p018c2.r;
                } else {
                    W w9 = wArr3[i13];
                    z8 = (w9 instanceof p032e2.f) && ((p032e2.f) w9).f12608a == wArr3[iC];
                }
                if (!z8) {
                    W w10 = wArr3[i13];
                    if (w10 instanceof p032e2.f) {
                        p032e2.f fVar2 = (p032e2.f) w10;
                        p032e2.g gVar2 = fVar2.f12612e;
                        boolean[] zArr4 = gVar2.f12629d;
                        int i14 = fVar2.f12610c;
                        p151v2.a.h(zArr4[i14]);
                        gVar2.f12629d[i14] = false;
                    }
                    wArr3[i13] = null;
                }
            }
            i13++;
        }
        int i15 = 0;
        while (i15 < cVarArr2.length) {
            p139t2.c cVar2 = cVarArr2[i15];
            if (cVar2 == null) {
                i8 = i15;
                iArr2 = iArr3;
                wArr2 = wArr3;
            } else {
                W w11 = wArr3[i15];
                if (w11 == null) {
                    zArr2[i15] = z4;
                    a aVar = this.f12795B[iArr3[i15]];
                    int i16 = aVar.f12787c;
                    if (i16 == 0) {
                        int i17 = aVar.f12790f;
                        boolean z9 = i17 != i7 ? z4 : false;
                        if (z9) {
                            e0VarA = this.f12794A.a(i17);
                            r7 = z4;
                        } else {
                            r7 = 0;
                            e0VarA = null;
                        }
                        int i18 = aVar.f12791g;
                        boolean z10 = i18 != i7 ? z4 : false;
                        if (z10) {
                            e0VarA2 = this.f12794A.a(i18);
                            i9 = r7 + e0VarA2.f10341a;
                        } else {
                            e0VarA2 = null;
                            i9 = r7;
                        }
                        A1.X[] xArr = new A1.X[i9];
                        int[] iArr4 = new int[i9];
                        if (z9) {
                            xArr[0] = e0VarA.f10344d[0];
                            iArr4[0] = 5;
                            z7 = z4;
                        } else {
                            z7 = false;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z10) {
                            int i19 = 0;
                            ?? r8 = z7;
                            while (i19 < e0VarA2.f10341a) {
                                A1.X x4 = e0VarA2.f10344d[i19];
                                xArr[r8] = x4;
                                iArr4[r8] = 3;
                                arrayList.add(x4);
                                i19++;
                                r8++;
                            }
                        }
                        if (this.f12805L.f13118d && z9) {
                            n nVar = this.f12797D;
                            mVar = new m(nVar, nVar.f12897a);
                        } else {
                            mVar = null;
                        }
                        p145u1.c cVar3 = this.f12809b;
                        L l7 = this.f12815y;
                        c cVar4 = this.f12805L;
                        int i20 = i15;
                        g gVar3 = this.f12813f;
                        int[] iArr5 = iArr3;
                        int i21 = this.f12806M;
                        int[] iArr6 = aVar.f12785a;
                        int i22 = aVar.f12786b;
                        m mVar2 = mVar;
                        long j3 = this.f12814x;
                        U u4 = this.f12810c;
                        InterfaceC0954m interfaceC0954mA = ((InterfaceC0953l) cVar3.f16597b).a();
                        if (u4 != null) {
                            interfaceC0954mA.x(u4);
                        }
                        i8 = i20;
                        iArr2 = iArr5;
                        p032e2.g gVar4 = new p032e2.g(aVar.f12786b, iArr4, xArr, new j(l7, cVar4, gVar3, i21, iArr6, cVar2, i22, interfaceC0954mA, j3, z9, arrayList, mVar2), this, this.f12816z, j, this.f12811d, this.f12800G, this.f12812e, this.f12799F);
                        synchronized (this) {
                            this.f12798E.put(gVar4, mVar2);
                        }
                        wArr2 = wArr;
                        wArr2[i8] = gVar4;
                    } else {
                        i8 = i15;
                        iArr2 = iArr3;
                        wArr2 = wArr3;
                        if (i16 == 2) {
                            wArr2[i8] = new k((g2.g) this.f12807N.get(aVar.f12788d), cVar2.f16302a.f10344d[0], this.f12805L.f13118d);
                        }
                    }
                } else {
                    i8 = i15;
                    iArr2 = iArr3;
                    wArr2 = wArr3;
                    if (w11 instanceof p032e2.g) {
                        ((p032e2.g) w11).f12630e.f12878i = cVar2;
                    }
                }
            }
            i15 = i8 + 1;
            wArr3 = wArr2;
            iArr3 = iArr2;
            z4 = true;
            i7 = -1;
            cVarArr2 = cVarArr;
        }
        int[] iArr7 = iArr3;
        W[] wArr4 = wArr3;
        int i23 = 0;
        while (i23 < cVarArr.length) {
            if (wArr4[i23] != null || cVarArr[i23] == null) {
                iArr = iArr7;
            } else {
                iArr = iArr7;
                a aVar2 = this.f12795B[iArr[i23]];
                if (aVar2.f12787c == 1) {
                    int iC2 = c(i23, iArr);
                    if (iC2 == -1) {
                        wArr4[i23] = new p018c2.r();
                    } else {
                        p032e2.g gVar5 = (p032e2.g) wArr4[iC2];
                        int i24 = aVar2.f12786b;
                        int i25 = 0;
                        while (true) {
                            p018c2.V[] vArr = gVar5.f12617E;
                            if (i25 >= vArr.length) {
                                throw new IllegalStateException();
                            }
                            if (gVar5.f12627b[i25] == i24) {
                                boolean[] zArr5 = gVar5.f12629d;
                                p151v2.a.h(!zArr5[i25]);
                                zArr5[i25] = true;
                                vArr[i25].z(j, true);
                                wArr4[i23] = new p032e2.f(gVar5, gVar5, vArr[i25], i25);
                                break;
                            }
                            i25++;
                        }
                    }
                }
                i23++;
                iArr7 = iArr;
            }
            i23++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (W w12 : wArr4) {
            if (w12 instanceof p032e2.g) {
                arrayList2.add((p032e2.g) w12);
            } else if (w12 instanceof k) {
                arrayList3.add((k) w12);
            }
        }
        p032e2.g[] gVarArr = new p032e2.g[arrayList2.size()];
        this.f12802I = gVarArr;
        arrayList2.toArray(gVarArr);
        k[] kVarArr = new k[arrayList3.size()];
        this.f12803J = kVarArr;
        arrayList3.toArray(kVarArr);
        V v6 = this.f12796C;
        p032e2.g[] gVarArr2 = this.f12802I;
        v6.getClass();
        this.f12804K = new h(gVarArr2);
        return j;
    }

    @Override // p018c2.B
    public final long M() {
        return -9223372036854775807L;
    }

    @Override // p018c2.B
    public final f0 P() {
        return this.f12794A;
    }

    @Override // p018c2.Y
    public final long T() {
        return this.f12804K.T();
    }

    @Override // p018c2.Y
    public final void Y(long j) {
        this.f12804K.Y(j);
    }

    @Override // p018c2.X
    public final void b(Y y4) {
        this.f12801H.b(this);
    }

    public final int c(int i7, int[] iArr) {
        int i8 = iArr[i7];
        if (i8 == -1) {
            return -1;
        }
        a[] aVarArr = this.f12795B;
        int i9 = aVarArr[i8].f12789e;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i9 && aVarArr[i11].f12787c == 0) {
                return i10;
            }
        }
        return -1;
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        return this.f12804K.isLoading();
    }

    @Override // p018c2.Y
    public final long k() {
        return this.f12804K.k();
    }

    @Override // p018c2.B
    public final long o(long j, H0 h6) {
        for (p032e2.g gVar : this.f12802I) {
            if (gVar.f12626a == 2) {
                for (h hVar : gVar.f12630e.f12877h) {
                    g gVar2 = hVar.f12866d;
                    if (gVar2 != null) {
                        long j3 = hVar.f12867e;
                        long jV = gVar2.v(j3);
                        if (jV != 0) {
                            g gVar3 = hVar.f12866d;
                            long jL = gVar3.l(j, j3);
                            long j7 = hVar.f12868f;
                            long j8 = jL + j7;
                            long jD = hVar.d(j8);
                            return h6.a(j, jD, (jD >= j || (jV != -1 && j8 >= ((gVar3.u() + j7) + jV) - 1)) ? jD : hVar.d(j8 + 1));
                        }
                    }
                }
                return j;
            }
        }
        return j;
    }

    @Override // p018c2.B
    public final void p(A a2, long j) {
        this.f12801H = a2;
        a2.f(this);
    }

    @Override // p018c2.B
    public final void q() {
        this.f12815y.c();
    }

    @Override // p018c2.B
    public final long v(long j) {
        int i7;
        p032e2.a aVar;
        boolean z4;
        p032e2.g[] gVarArr = this.f12802I;
        int length = gVarArr.length;
        int i8 = 0;
        while (i8 < length) {
            p032e2.g gVar = gVarArr[i8];
            gVar.f12623K = j;
            if (gVar.m()) {
                gVar.f12622J = j;
                i7 = i8;
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 < gVar.f12614B.size()) {
                        aVar = (p032e2.a) gVar.f12614B.get(i9);
                        long j3 = aVar.f12605x;
                        i7 = i8;
                        if (j3 == j && aVar.f12576B == -9223372036854775807L) {
                            break;
                        }
                        if (j3 <= j) {
                            i9++;
                            i8 = i7;
                        }
                    } else {
                        i7 = i8;
                    }
                    aVar = null;
                    break;
                }
                if (aVar != null) {
                    p018c2.V v6 = gVar.f12616D;
                    int iC = aVar.c(0);
                    synchronized (v6) {
                        synchronized (v6) {
                            v6.f10285s = 0;
                            S s7 = v6.f10268a;
                            s7.f10256e = s7.f10255d;
                        }
                    }
                    int i10 = v6.f10283q;
                    if (iC < i10 || iC > v6.f10282p + i10) {
                        z4 = false;
                    } else {
                        v6.f10286t = Long.MIN_VALUE;
                        v6.f10285s = iC - i10;
                        z4 = true;
                    }
                } else {
                    z4 = gVar.f12616D.z(j, j < gVar.k());
                }
                if (z4) {
                    gVar.f12624L = gVar.r(gVar.f12616D.n(), 0);
                    for (p018c2.V v7 : gVar.f12617E) {
                        v7.z(j, true);
                    }
                } else {
                    gVar.f12622J = j;
                    gVar.f12625M = false;
                    gVar.f12614B.clear();
                    gVar.f12624L = 0;
                    if (gVar.f12634z.d()) {
                        gVar.f12616D.h();
                        for (p018c2.V v8 : gVar.f12617E) {
                            v8.h();
                        }
                        gVar.f12634z.a();
                    } else {
                        gVar.f12634z.f16733c = null;
                        gVar.f12616D.y(false);
                        for (p018c2.V v9 : gVar.f12617E) {
                            v9.y(false);
                        }
                    }
                    i8 = i7 + 1;
                }
            }
            i8 = i7 + 1;
        }
        for (k kVar : this.f12803J) {
            int iB = t.b(kVar.f12884c, j, true);
            kVar.f12888x = iB;
            kVar.f12889y = (kVar.f12885d && iB == kVar.f12884c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // p018c2.B
    public final void w(long j) {
        long j3;
        for (p032e2.g gVar : this.f12802I) {
            if (!gVar.m()) {
                p018c2.V v6 = gVar.f12616D;
                int i7 = v6.f10283q;
                v6.g(j, true);
                p018c2.V v7 = gVar.f12616D;
                int i8 = v7.f10283q;
                if (i8 > i7) {
                    synchronized (v7) {
                        j3 = v7.f10282p == 0 ? Long.MIN_VALUE : v7.f10280n[v7.f10284r];
                    }
                    int i9 = 0;
                    while (true) {
                        p018c2.V[] vArr = gVar.f12617E;
                        if (i9 >= vArr.length) {
                            break;
                        }
                        vArr[i9].g(j3, gVar.f12629d[i9]);
                        i9++;
                    }
                }
                int iMin = Math.min(gVar.r(i8, 0), gVar.f12624L);
                if (iMin > 0) {
                    t.J(gVar.f12614B, 0, iMin);
                    gVar.f12624L -= iMin;
                }
            }
        }
    }

    @Override // p018c2.Y
    public final boolean y(long j) {
        return this.f12804K.y(j);
    }
}
