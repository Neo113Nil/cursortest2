package f2;

import A1.H0;
import B1.p;
import B4.V;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import c2.I;
import c2.InterfaceC0793A;
import c2.InterfaceC0794B;
import c2.S;
import c2.W;
import c2.X;
import c2.Y;
import c2.e0;
import c2.f0;
import com.google.android.exoplayer2.Format$Builder;
import e2.AbstractC1004a;
import e2.C1009f;
import e2.C1010g;
import e3.C1023h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import u2.InterfaceC1635l;
import u2.InterfaceC1636m;
import u2.L;
import u2.U;
import u2.r;
import v2.AbstractC1664a;
import v2.t;

/* renamed from: f2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1070b implements InterfaceC0794B, X {

    /* renamed from: O, reason: collision with root package name */
    public static final Pattern f12786O = Pattern.compile("CC([1-4])=(.+)");

    /* renamed from: P, reason: collision with root package name */
    public static final Pattern f12787P = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: A, reason: collision with root package name */
    public final f0 f12788A;

    /* renamed from: B, reason: collision with root package name */
    public final C1069a[] f12789B;

    /* renamed from: C, reason: collision with root package name */
    public final V f12790C;

    /* renamed from: D, reason: collision with root package name */
    public final C1082n f12791D;

    /* renamed from: F, reason: collision with root package name */
    public final I f12793F;

    /* renamed from: G, reason: collision with root package name */
    public final B1.m f12794G;

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0793A f12795H;

    /* renamed from: K, reason: collision with root package name */
    public C1023h f12798K;

    /* renamed from: L, reason: collision with root package name */
    public g2.c f12799L;

    /* renamed from: M, reason: collision with root package name */
    public int f12800M;

    /* renamed from: N, reason: collision with root package name */
    public List f12801N;

    /* renamed from: a, reason: collision with root package name */
    public final int f12802a;

    /* renamed from: b, reason: collision with root package name */
    public final u1.c f12803b;

    /* renamed from: c, reason: collision with root package name */
    public final U f12804c;

    /* renamed from: d, reason: collision with root package name */
    public final E1.h f12805d;

    /* renamed from: e, reason: collision with root package name */
    public final M4.e f12806e;

    /* renamed from: f, reason: collision with root package name */
    public final k1.g f12807f;

    /* renamed from: x, reason: collision with root package name */
    public final long f12808x;

    /* renamed from: y, reason: collision with root package name */
    public final L f12809y;

    /* renamed from: z, reason: collision with root package name */
    public final r f12810z;

    /* renamed from: I, reason: collision with root package name */
    public C1010g[] f12796I = new C1010g[0];

    /* renamed from: J, reason: collision with root package name */
    public C1079k[] f12797J = new C1079k[0];

    /* renamed from: E, reason: collision with root package name */
    public final IdentityHashMap f12792E = new IdentityHashMap();

    public C1070b(int i7, g2.c cVar, k1.g gVar, int i8, u1.c cVar2, U u4, E1.h hVar, B1.m mVar, M4.e eVar, I i9, long j, L l7, r rVar, V v6, R4.c cVar3, p pVar) {
        int i10;
        List list;
        int i11;
        int i12;
        A1.X[] xArr;
        A1.X[] d7;
        g2.f a2;
        this.f12802a = i7;
        this.f12799L = cVar;
        this.f12807f = gVar;
        this.f12800M = i8;
        this.f12803b = cVar2;
        this.f12804c = u4;
        this.f12805d = hVar;
        this.f12794G = mVar;
        this.f12806e = eVar;
        this.f12793F = i9;
        this.f12808x = j;
        this.f12809y = l7;
        this.f12810z = rVar;
        this.f12790C = v6;
        this.f12791D = new C1082n(cVar, cVar3, rVar);
        int i13 = 0;
        C1010g[] c1010gArr = this.f12796I;
        v6.getClass();
        this.f12798K = new C1023h(c1010gArr);
        g2.h b7 = cVar.b(i8);
        List list2 = b7.f13145d;
        this.f12801N = list2;
        List list3 = b7.f13144c;
        int size = list3.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i14 = 0; i14 < size; i14++) {
            sparseIntArray.put(((g2.a) list3.get(i14)).f13099a, i14);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i14));
            arrayList.add(arrayList2);
            sparseArray.put(i14, arrayList2);
        }
        int i15 = 0;
        while (i15 < size) {
            g2.a aVar = (g2.a) list3.get(i15);
            g2.f a4 = a("http://dashif.org/guidelines/trickmode", aVar.f13103e);
            List list4 = aVar.f13104f;
            a4 = a4 == null ? a("http://dashif.org/guidelines/trickmode", list4) : a4;
            int i16 = (a4 == null || (i16 = sparseIntArray.get(Integer.parseInt(a4.f13136b), -1)) == -1) ? i15 : i16;
            if (i16 == i15 && (a2 = a("urn:mpeg:dash:adaptation-set-switching:2016", list4)) != null) {
                int i17 = t.f17153a;
                String[] split = a2.f13136b.split(",", -1);
                int length = split.length;
                for (int i18 = i13; i18 < length; i18++) {
                    int i19 = sparseIntArray.get(Integer.parseInt(split[i18]), -1);
                    if (i19 != -1) {
                        i16 = Math.min(i16, i19);
                    }
                }
            }
            if (i16 != i15) {
                List list5 = (List) sparseArray.get(i15);
                List list6 = (List) sparseArray.get(i16);
                list6.addAll(list5);
                sparseArray.put(i15, list6);
                arrayList.remove(list5);
            }
            i15++;
            i13 = 0;
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i20 = 0; i20 < size2; i20++) {
            int[] Z6 = Q0.a.Z((Collection) arrayList.get(i20));
            iArr[i20] = Z6;
            Arrays.sort(Z6);
        }
        boolean[] zArr = new boolean[size2];
        A1.X[][] xArr2 = new A1.X[size2][];
        int i21 = 0;
        int i22 = 0;
        while (i21 < size2) {
            int[] iArr2 = iArr[i21];
            int length2 = iArr2.length;
            int i23 = 0;
            while (true) {
                if (i23 >= length2) {
                    break;
                }
                List list7 = ((g2.a) list3.get(iArr2[i23])).f13101c;
                for (int i24 = 0; i24 < list7.size(); i24++) {
                    if (!((g2.m) list7.get(i24)).f13161d.isEmpty()) {
                        zArr[i21] = true;
                        i22++;
                        break;
                    }
                }
                i23++;
            }
            int[] iArr3 = iArr[i21];
            int length3 = iArr3.length;
            int i25 = 0;
            while (i25 < length3) {
                int i26 = iArr3[i25];
                g2.a aVar2 = (g2.a) list3.get(i26);
                List list8 = ((g2.a) list3.get(i26)).f13102d;
                int[] iArr4 = iArr3;
                int i27 = 0;
                while (i27 < list8.size()) {
                    g2.f fVar = (g2.f) list8.get(i27);
                    int i28 = length3;
                    List list9 = list8;
                    if ("urn:scte:dash:cc:cea-608:2015".equals(fVar.f13135a)) {
                        Format$Builder format$Builder = new Format$Builder();
                        format$Builder.f10537k = "application/cea-608";
                        format$Builder.f10528a = e1.k.g(new StringBuilder(), aVar2.f13099a, ":cea608");
                        d7 = d(fVar, f12786O, new A1.X(format$Builder));
                    } else if ("urn:scte:dash:cc:cea-708:2015".equals(fVar.f13135a)) {
                        Format$Builder format$Builder2 = new Format$Builder();
                        format$Builder2.f10537k = "application/cea-708";
                        format$Builder2.f10528a = e1.k.g(new StringBuilder(), aVar2.f13099a, ":cea708");
                        d7 = d(fVar, f12787P, new A1.X(format$Builder2));
                    } else {
                        i27++;
                        list8 = list9;
                        length3 = i28;
                    }
                    xArr = d7;
                    i12 = 1;
                }
                i25++;
                iArr3 = iArr4;
            }
            i12 = 1;
            xArr = new A1.X[0];
            xArr2[i21] = xArr;
            if (xArr.length != 0) {
                i22 += i12;
            }
            i21 += i12;
        }
        int size3 = list2.size() + i22 + size2;
        e0[] e0VarArr = new e0[size3];
        C1069a[] c1069aArr = new C1069a[size3];
        int i29 = 0;
        int i30 = 0;
        while (i30 < size2) {
            int[] iArr5 = iArr[i30];
            ArrayList arrayList3 = new ArrayList();
            int length4 = iArr5.length;
            int i31 = size2;
            int i32 = 0;
            while (i32 < length4) {
                arrayList3.addAll(((g2.a) list3.get(iArr5[i32])).f13101c);
                i32++;
                iArr = iArr;
            }
            int[][] iArr6 = iArr;
            int size4 = arrayList3.size();
            A1.X[] xArr3 = new A1.X[size4];
            int i33 = 0;
            while (i33 < size4) {
                int i34 = size4;
                A1.X x4 = ((g2.m) arrayList3.get(i33)).f13158a;
                ArrayList arrayList4 = arrayList3;
                int b8 = hVar.b(x4);
                Format$Builder a7 = x4.a();
                a7.f10527D = b8;
                xArr3[i33] = new A1.X(a7);
                i33++;
                size4 = i34;
                arrayList3 = arrayList4;
            }
            g2.a aVar3 = (g2.a) list3.get(iArr5[0]);
            int i35 = aVar3.f13099a;
            String num = i35 != -1 ? Integer.toString(i35) : e1.k.d(i30, "unset:");
            int i36 = i29 + 1;
            if (zArr[i30]) {
                i10 = i36;
                i36 = i29 + 2;
            } else {
                i10 = -1;
            }
            if (xArr2[i30].length != 0) {
                i11 = i36;
                i36++;
                list = list3;
            } else {
                list = list3;
                i11 = -1;
            }
            e0VarArr[i29] = new e0(num, xArr3);
            c1069aArr[i29] = new C1069a(aVar3.f13100b, 0, iArr5, i29, i10, i11, -1);
            int i37 = i10;
            int i38 = -1;
            if (i37 != -1) {
                String e7 = e1.k.e(num, ":emsg");
                Format$Builder format$Builder3 = new Format$Builder();
                format$Builder3.f10528a = e7;
                format$Builder3.f10537k = "application/x-emsg";
                e0VarArr[i37] = new e0(e7, new A1.X(format$Builder3));
                c1069aArr[i37] = new C1069a(5, 1, iArr5, i29, -1, -1, -1);
                i38 = -1;
            }
            if (i11 != i38) {
                e0VarArr[i11] = new e0(e1.k.e(num, ":cc"), xArr2[i30]);
                c1069aArr[i11] = new C1069a(3, 1, iArr5, i29, -1, -1, -1);
            }
            i30++;
            size2 = i31;
            iArr = iArr6;
            i29 = i36;
            list3 = list;
        }
        int i39 = 0;
        while (i39 < list2.size()) {
            g2.g gVar2 = (g2.g) list2.get(i39);
            Format$Builder format$Builder4 = new Format$Builder();
            format$Builder4.f10528a = gVar2.a();
            format$Builder4.f10537k = "application/x-emsg";
            e0VarArr[i29] = new e0(gVar2.a() + ":" + i39, new A1.X(format$Builder4));
            c1069aArr[i29] = new C1069a(5, 2, new int[0], -1, -1, -1, i39);
            i39++;
            i29++;
        }
        Pair create = Pair.create(new f0(e0VarArr), c1069aArr);
        this.f12788A = (f0) create.first;
        this.f12789B = (C1069a[]) create.second;
    }

    public static g2.f a(String str, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            g2.f fVar = (g2.f) list.get(i7);
            if (str.equals(fVar.f13135a)) {
                return fVar;
            }
        }
        return null;
    }

    public static A1.X[] d(g2.f fVar, Pattern pattern, A1.X x4) {
        String str = fVar.f13136b;
        if (str == null) {
            return new A1.X[]{x4};
        }
        int i7 = t.f17153a;
        String[] split = str.split(";", -1);
        A1.X[] xArr = new A1.X[split.length];
        for (int i8 = 0; i8 < split.length; i8++) {
            Matcher matcher = pattern.matcher(split[i8]);
            if (!matcher.matches()) {
                return new A1.X[]{x4};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            Format$Builder a2 = x4.a();
            a2.f10528a = x4.f304a + ":" + parseInt;
            a2.f10526C = parseInt;
            a2.f10530c = matcher.group(2);
            xArr[i8] = new A1.X(a2);
        }
        return xArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v26, types: [int] */
    /* JADX WARN: Type inference failed for: r3v45 */
    /* JADX WARN: Type inference failed for: r3v46 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [int] */
    /* JADX WARN: Type inference failed for: r4v20 */
    @Override // c2.InterfaceC0794B
    public final long I(t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        int i7;
        boolean z4;
        int[] iArr;
        int i8;
        int[] iArr2;
        W[] wArr2;
        ?? r42;
        e0 e0Var;
        e0 e0Var2;
        int i9;
        boolean z7;
        C1081m c1081m;
        boolean z8;
        t2.c[] cVarArr2 = cVarArr;
        W[] wArr3 = wArr;
        int[] iArr3 = new int[cVarArr2.length];
        int i10 = 0;
        while (true) {
            i7 = -1;
            if (i10 >= cVarArr2.length) {
                break;
            }
            t2.c cVar = cVarArr2[i10];
            if (cVar != null) {
                iArr3[i10] = this.f12788A.b(cVar.f16296a);
            } else {
                iArr3[i10] = -1;
            }
            i10++;
        }
        for (int i11 = 0; i11 < cVarArr2.length; i11++) {
            if (cVarArr2[i11] == null || !zArr[i11]) {
                W w7 = wArr3[i11];
                if (w7 instanceof C1010g) {
                    ((C1010g) w7).s(this);
                } else if (w7 instanceof C1009f) {
                    C1009f c1009f = (C1009f) w7;
                    C1010g c1010g = c1009f.f12606e;
                    boolean[] zArr3 = c1010g.f12623d;
                    int i12 = c1009f.f12604c;
                    AbstractC1664a.h(zArr3[i12]);
                    c1010g.f12623d[i12] = false;
                }
                wArr3[i11] = null;
            }
        }
        int i13 = 0;
        while (true) {
            if (i13 >= cVarArr2.length) {
                break;
            }
            W w8 = wArr3[i13];
            if ((w8 instanceof c2.r) || (w8 instanceof C1009f)) {
                int c3 = c(i13, iArr3);
                if (c3 == -1) {
                    z8 = wArr3[i13] instanceof c2.r;
                } else {
                    W w9 = wArr3[i13];
                    z8 = (w9 instanceof C1009f) && ((C1009f) w9).f12602a == wArr3[c3];
                }
                if (!z8) {
                    W w10 = wArr3[i13];
                    if (w10 instanceof C1009f) {
                        C1009f c1009f2 = (C1009f) w10;
                        C1010g c1010g2 = c1009f2.f12606e;
                        boolean[] zArr4 = c1010g2.f12623d;
                        int i14 = c1009f2.f12604c;
                        AbstractC1664a.h(zArr4[i14]);
                        c1010g2.f12623d[i14] = false;
                    }
                    wArr3[i13] = null;
                }
            }
            i13++;
        }
        int i15 = 0;
        while (i15 < cVarArr2.length) {
            t2.c cVar2 = cVarArr2[i15];
            if (cVar2 == null) {
                i8 = i15;
                iArr2 = iArr3;
                wArr2 = wArr3;
            } else {
                W w11 = wArr3[i15];
                if (w11 == null) {
                    zArr2[i15] = z4;
                    C1069a c1069a = this.f12789B[iArr3[i15]];
                    int i16 = c1069a.f12781c;
                    if (i16 == 0) {
                        int i17 = c1069a.f12784f;
                        boolean z9 = i17 != i7 ? z4 : false;
                        if (z9) {
                            e0Var = this.f12788A.a(i17);
                            r42 = z4;
                        } else {
                            r42 = 0;
                            e0Var = null;
                        }
                        int i18 = c1069a.f12785g;
                        boolean z10 = i18 != i7 ? z4 : false;
                        if (z10) {
                            e0Var2 = this.f12788A.a(i18);
                            i9 = r42 + e0Var2.f10341a;
                        } else {
                            e0Var2 = null;
                            i9 = r42;
                        }
                        A1.X[] xArr = new A1.X[i9];
                        int[] iArr4 = new int[i9];
                        if (z9) {
                            xArr[0] = e0Var.f10344d[0];
                            iArr4[0] = 5;
                            z7 = z4;
                        } else {
                            z7 = false;
                        }
                        ArrayList arrayList = new ArrayList();
                        if (z10) {
                            int i19 = 0;
                            ?? r32 = z7;
                            while (i19 < e0Var2.f10341a) {
                                A1.X x4 = e0Var2.f10344d[i19];
                                xArr[r32] = x4;
                                iArr4[r32] = 3;
                                arrayList.add(x4);
                                i19++;
                                r32++;
                            }
                        }
                        if (this.f12799L.f13112d && z9) {
                            C1082n c1082n = this.f12791D;
                            c1081m = new C1081m(c1082n, c1082n.f12891a);
                        } else {
                            c1081m = null;
                        }
                        u1.c cVar3 = this.f12803b;
                        L l7 = this.f12809y;
                        g2.c cVar4 = this.f12799L;
                        int i20 = i15;
                        k1.g gVar = this.f12807f;
                        int[] iArr5 = iArr3;
                        int i21 = this.f12800M;
                        int[] iArr6 = c1069a.f12779a;
                        int i22 = c1069a.f12780b;
                        C1081m c1081m2 = c1081m;
                        long j3 = this.f12808x;
                        U u4 = this.f12804c;
                        InterfaceC1636m a2 = ((InterfaceC1635l) cVar3.f16591b).a();
                        if (u4 != null) {
                            a2.x(u4);
                        }
                        i8 = i20;
                        iArr2 = iArr5;
                        C1010g c1010g3 = new C1010g(c1069a.f12780b, iArr4, xArr, new C1078j(l7, cVar4, gVar, i21, iArr6, cVar2, i22, a2, j3, z9, arrayList, c1081m2), this, this.f12810z, j, this.f12805d, this.f12794G, this.f12806e, this.f12793F);
                        synchronized (this) {
                            this.f12792E.put(c1010g3, c1081m2);
                        }
                        wArr2 = wArr;
                        wArr2[i8] = c1010g3;
                    } else {
                        i8 = i15;
                        iArr2 = iArr3;
                        wArr2 = wArr3;
                        if (i16 == 2) {
                            wArr2[i8] = new C1079k((g2.g) this.f12801N.get(c1069a.f12782d), cVar2.f16296a.f10344d[0], this.f12799L.f13112d);
                        }
                    }
                } else {
                    i8 = i15;
                    iArr2 = iArr3;
                    wArr2 = wArr3;
                    if (w11 instanceof C1010g) {
                        ((C1010g) w11).f12624e.f12872i = cVar2;
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
                C1069a c1069a2 = this.f12789B[iArr[i23]];
                if (c1069a2.f12781c == 1) {
                    int c4 = c(i23, iArr);
                    if (c4 == -1) {
                        wArr4[i23] = new c2.r();
                    } else {
                        C1010g c1010g4 = (C1010g) wArr4[c4];
                        int i24 = c1069a2.f12780b;
                        int i25 = 0;
                        while (true) {
                            c2.V[] vArr = c1010g4.f12611E;
                            if (i25 >= vArr.length) {
                                throw new IllegalStateException();
                            }
                            if (c1010g4.f12621b[i25] == i24) {
                                boolean[] zArr5 = c1010g4.f12623d;
                                AbstractC1664a.h(!zArr5[i25]);
                                zArr5[i25] = true;
                                vArr[i25].z(j, true);
                                wArr4[i23] = new C1009f(c1010g4, c1010g4, vArr[i25], i25);
                                break;
                            }
                            i25++;
                        }
                    }
                    i23++;
                    iArr7 = iArr;
                }
            }
            i23++;
            iArr7 = iArr;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (W w12 : wArr4) {
            if (w12 instanceof C1010g) {
                arrayList2.add((C1010g) w12);
            } else if (w12 instanceof C1079k) {
                arrayList3.add((C1079k) w12);
            }
        }
        C1010g[] c1010gArr = new C1010g[arrayList2.size()];
        this.f12796I = c1010gArr;
        arrayList2.toArray(c1010gArr);
        C1079k[] c1079kArr = new C1079k[arrayList3.size()];
        this.f12797J = c1079kArr;
        arrayList3.toArray(c1079kArr);
        V v6 = this.f12790C;
        C1010g[] c1010gArr2 = this.f12796I;
        v6.getClass();
        this.f12798K = new C1023h(c1010gArr2);
        return j;
    }

    @Override // c2.InterfaceC0794B
    public final long M() {
        return -9223372036854775807L;
    }

    @Override // c2.InterfaceC0794B
    public final f0 P() {
        return this.f12788A;
    }

    @Override // c2.Y
    public final long T() {
        return this.f12798K.T();
    }

    @Override // c2.Y
    public final void Y(long j) {
        this.f12798K.Y(j);
    }

    @Override // c2.X
    public final void b(Y y4) {
        this.f12795H.b(this);
    }

    public final int c(int i7, int[] iArr) {
        int i8 = iArr[i7];
        if (i8 == -1) {
            return -1;
        }
        C1069a[] c1069aArr = this.f12789B;
        int i9 = c1069aArr[i8].f12783e;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i9 && c1069aArr[i11].f12781c == 0) {
                return i10;
            }
        }
        return -1;
    }

    @Override // c2.Y
    public final boolean isLoading() {
        return this.f12798K.isLoading();
    }

    @Override // c2.Y
    public final long k() {
        return this.f12798K.k();
    }

    @Override // c2.InterfaceC0794B
    public final long o(long j, H0 h02) {
        for (C1010g c1010g : this.f12796I) {
            if (c1010g.f12620a == 2) {
                for (C1076h c1076h : c1010g.f12624e.f12871h) {
                    InterfaceC1075g interfaceC1075g = c1076h.f12860d;
                    if (interfaceC1075g != null) {
                        long j3 = c1076h.f12861e;
                        long v6 = interfaceC1075g.v(j3);
                        if (v6 != 0) {
                            InterfaceC1075g interfaceC1075g2 = c1076h.f12860d;
                            long l7 = interfaceC1075g2.l(j, j3);
                            long j7 = c1076h.f12862f;
                            long j8 = l7 + j7;
                            long d7 = c1076h.d(j8);
                            return h02.a(j, d7, (d7 >= j || (v6 != -1 && j8 >= ((interfaceC1075g2.u() + j7) + v6) - 1)) ? d7 : c1076h.d(j8 + 1));
                        }
                    }
                }
                return j;
            }
        }
        return j;
    }

    @Override // c2.InterfaceC0794B
    public final void p(InterfaceC0793A interfaceC0793A, long j) {
        this.f12795H = interfaceC0793A;
        interfaceC0793A.f(this);
    }

    @Override // c2.InterfaceC0794B
    public final void q() {
        this.f12809y.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x004c, code lost:
    
        r12 = null;
     */
    @Override // c2.InterfaceC0794B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long v(long j) {
        int i7;
        AbstractC1004a abstractC1004a;
        boolean z4;
        C1010g[] c1010gArr = this.f12796I;
        int length = c1010gArr.length;
        int i8 = 0;
        while (i8 < length) {
            C1010g c1010g = c1010gArr[i8];
            c1010g.f12617K = j;
            if (c1010g.m()) {
                c1010g.f12616J = j;
                i7 = i8;
            } else {
                int i9 = 0;
                while (true) {
                    if (i9 >= c1010g.f12608B.size()) {
                        i7 = i8;
                        break;
                    }
                    abstractC1004a = (AbstractC1004a) c1010g.f12608B.get(i9);
                    long j3 = abstractC1004a.f12599x;
                    i7 = i8;
                    if (j3 == j && abstractC1004a.f12570B == -9223372036854775807L) {
                        break;
                    }
                    if (j3 > j) {
                        break;
                    }
                    i9++;
                    i8 = i7;
                }
                if (abstractC1004a != null) {
                    c2.V v6 = c1010g.f12610D;
                    int c3 = abstractC1004a.c(0);
                    synchronized (v6) {
                        synchronized (v6) {
                            v6.f10285s = 0;
                            S s7 = v6.f10268a;
                            s7.f10256e = s7.f10255d;
                        }
                    }
                    int i10 = v6.f10283q;
                    if (c3 >= i10 && c3 <= v6.f10282p + i10) {
                        v6.f10286t = Long.MIN_VALUE;
                        v6.f10285s = c3 - i10;
                        z4 = true;
                    }
                    z4 = false;
                } else {
                    z4 = c1010g.f12610D.z(j, j < c1010g.k());
                }
                if (z4) {
                    c1010g.f12618L = c1010g.r(c1010g.f12610D.n(), 0);
                    for (c2.V v7 : c1010g.f12611E) {
                        v7.z(j, true);
                    }
                } else {
                    c1010g.f12616J = j;
                    c1010g.f12619M = false;
                    c1010g.f12608B.clear();
                    c1010g.f12618L = 0;
                    if (c1010g.f12628z.d()) {
                        c1010g.f12610D.h();
                        for (c2.V v8 : c1010g.f12611E) {
                            v8.h();
                        }
                        c1010g.f12628z.a();
                    } else {
                        c1010g.f12628z.f16727c = null;
                        c1010g.f12610D.y(false);
                        for (c2.V v9 : c1010g.f12611E) {
                            v9.y(false);
                        }
                        i8 = i7 + 1;
                    }
                }
            }
            i8 = i7 + 1;
        }
        for (C1079k c1079k : this.f12797J) {
            int b7 = t.b(c1079k.f12878c, j, true);
            c1079k.f12882x = b7;
            c1079k.f12883y = (c1079k.f12879d && b7 == c1079k.f12878c.length) ? j : -9223372036854775807L;
        }
        return j;
    }

    @Override // c2.InterfaceC0794B
    public final void w(long j) {
        long j3;
        for (C1010g c1010g : this.f12796I) {
            if (!c1010g.m()) {
                c2.V v6 = c1010g.f12610D;
                int i7 = v6.f10283q;
                v6.g(j, true);
                c2.V v7 = c1010g.f12610D;
                int i8 = v7.f10283q;
                if (i8 > i7) {
                    synchronized (v7) {
                        j3 = v7.f10282p == 0 ? Long.MIN_VALUE : v7.f10280n[v7.f10284r];
                    }
                    int i9 = 0;
                    while (true) {
                        c2.V[] vArr = c1010g.f12611E;
                        if (i9 >= vArr.length) {
                            break;
                        }
                        vArr[i9].g(j3, c1010g.f12623d[i9]);
                        i9++;
                    }
                }
                int min = Math.min(c1010g.r(i8, 0), c1010g.f12618L);
                if (min > 0) {
                    t.J(c1010g.f12608B, 0, min);
                    c1010g.f12618L -= min;
                }
            }
        }
    }

    @Override // c2.Y
    public final boolean y(long j) {
        return this.f12798K.y(j);
    }
}
