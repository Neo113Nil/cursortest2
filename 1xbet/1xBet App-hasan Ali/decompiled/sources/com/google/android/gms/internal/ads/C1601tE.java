package com.google.android.gms.internal.ads;

import Q2.C0375o;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

/* renamed from: com.google.android.gms.internal.ads.tE, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1601tE {

    /* renamed from: a, reason: collision with root package name */
    public final Object f15651a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15652b;

    /* renamed from: c, reason: collision with root package name */
    public final NG[] f15653c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f15654d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f15655e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public C1646uE f15656g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f15657h;
    public final boolean[] i;

    /* renamed from: j, reason: collision with root package name */
    public final RF[] f15658j;

    /* renamed from: k, reason: collision with root package name */
    public final C1112iH f15659k;

    /* renamed from: l, reason: collision with root package name */
    public final C1170jo f15660l;

    /* renamed from: m, reason: collision with root package name */
    public C1601tE f15661m;

    /* renamed from: n, reason: collision with root package name */
    public TG f15662n;

    /* renamed from: o, reason: collision with root package name */
    public C1245lH f15663o;

    /* renamed from: p, reason: collision with root package name */
    public long f15664p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.google.android.gms.internal.ads.bG] */
    public C1601tE(RF[] rfArr, long j5, C1112iH c1112iH, C1425pH c1425pH, C1170jo c1170jo, C1646uE c1646uE, C1245lH c1245lH) {
        this.f15658j = rfArr;
        this.f15664p = j5;
        this.f15659k = c1112iH;
        this.f15660l = c1170jo;
        C1603tG c1603tG = c1646uE.f15816a;
        this.f15652b = c1603tG.f15679a;
        this.f15656g = c1646uE;
        this.f15662n = TG.f11645d;
        this.f15663o = c1245lH;
        this.f15653c = new NG[2];
        this.i = new boolean[2];
        c1170jo.getClass();
        int i = JE.f9915k;
        Pair pair = (Pair) c1603tG.f15679a;
        Object obj = pair.first;
        C1603tG a5 = c1603tG.a(pair.second);
        CE ce = (CE) ((HashMap) c1170jo.f14148o).get(obj);
        ce.getClass();
        ((HashSet) c1170jo.f14151r).add(ce);
        BE be = (BE) ((HashMap) c1170jo.f14150q).get(ce);
        if (be != null) {
            be.f7796a.g(be.f7797b);
        }
        ce.f7983c.add(a5);
        C1244lG b3 = ce.f7981a.b(a5, c1425pH, c1646uE.f15817b);
        ((IdentityHashMap) c1170jo.f14147n).put(b3, ce);
        c1170jo.j();
        long j6 = c1646uE.f15819d;
        this.f15651a = j6 != -9223372036854775807L ? new C0798bG(b3, j6) : b3;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    public final long a(C1245lH c1245lH, long j5, boolean z3, boolean[] zArr) {
        RF[] rfArr;
        int i = 0;
        while (true) {
            boolean z5 = true;
            if (i >= c1245lH.f14376k) {
                break;
            }
            if (z3 || !c1245lH.a(this.f15663o, i)) {
                z5 = false;
            }
            this.i[i] = z5;
            i++;
        }
        int i5 = 0;
        while (true) {
            rfArr = this.f15658j;
            if (i5 >= 2) {
                break;
            }
            rfArr[i5].getClass();
            i5++;
        }
        k();
        this.f15663o = c1245lH;
        if (this.f15661m == null) {
            int i6 = 0;
            while (true) {
                C1245lH c1245lH2 = this.f15663o;
                if (i6 >= c1245lH2.f14376k) {
                    break;
                }
                c1245lH2.e(i6);
                InterfaceC1200kH interfaceC1200kH = ((InterfaceC1200kH[]) this.f15663o.f14378m)[i6];
                i6++;
            }
        }
        long c5 = this.f15651a.c((InterfaceC1200kH[]) c1245lH.f14378m, this.i, this.f15653c, zArr, j5);
        for (int i7 = 0; i7 < 2; i7++) {
            rfArr[i7].getClass();
        }
        this.f = false;
        for (int i8 = 0; i8 < 2; i8++) {
            if (this.f15653c[i8] != null) {
                AbstractC1668us.a0(c1245lH.e(i8));
                rfArr[i8].getClass();
                this.f = true;
            } else {
                AbstractC1668us.a0(((InterfaceC1200kH[]) c1245lH.f14378m)[i8] == null);
            }
        }
        return c5;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.android.gms.internal.ads.OG, java.lang.Object] */
    public final long b() {
        if (!this.f15655e) {
            return this.f15656g.f15817b;
        }
        long d5 = this.f ? this.f15651a.d() : Long.MIN_VALUE;
        return d5 == Long.MIN_VALUE ? this.f15656g.f15820e : d5;
    }

    public final long c() {
        return this.f15656g.f15817b + this.f15664p;
    }

    public final TG d() {
        return this.f15662n;
    }

    public final C1245lH e() {
        return this.f15663o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0281, code lost:
    
        if (com.google.android.gms.internal.ads.Zu.f12539a.d(r7.f12656l, r11.f12656l).d(r7.f12655k, r11.f12655k).a() > 0) goto L106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1245lH f(AbstractC0715Xa abstractC0715Xa) {
        RF[] rfArr;
        C0843cH c0843cH;
        int i;
        boolean z3;
        String str;
        int i5;
        int i6;
        InterfaceC1200kH[] interfaceC1200kHArr;
        boolean z5;
        int[][][] iArr;
        boolean z6;
        int[] iArr2;
        int length;
        VG vg;
        int i7;
        int i8;
        C1155jH[] c1155jHArr;
        int i9;
        C1155jH[] c1155jHArr2;
        C1292mb c1292mb;
        P.W w5;
        C1407p[] c1407pArr;
        int i10;
        int[] iArr3;
        TG tg = this.f15662n;
        C1112iH c1112iH = this.f15659k;
        c1112iH.getClass();
        int[] iArr4 = new int[3];
        C1292mb[][] c1292mbArr = new C1292mb[3][];
        int[][][] iArr5 = new int[3][][];
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = tg.f11646a;
            c1292mbArr[i11] = new C1292mb[i12];
            iArr5[i11] = new int[i12][];
        }
        int i13 = 2;
        int[] iArr6 = new int[2];
        int i14 = 0;
        while (true) {
            rfArr = this.f15658j;
            if (i14 >= 2) {
                break;
            }
            rfArr[i14].getClass();
            iArr6[i14] = 8;
            i14++;
        }
        int i15 = 0;
        while (i15 < tg.f11646a) {
            C1292mb a5 = tg.a(i15);
            int i16 = i13;
            int i17 = 0;
            int i18 = 0;
            boolean z7 = true;
            while (true) {
                c1407pArr = a5.f14498d;
                i10 = a5.f14495a;
                if (i17 >= i13) {
                    break;
                }
                RF rf = rfArr[i17];
                TG tg2 = tg;
                int i19 = 0;
                int i20 = 0;
                while (i19 < i10) {
                    int i21 = i19;
                    i20 = Math.max(i20, rf.r(c1407pArr[i21]) & 7);
                    i19 = i21 + 1;
                }
                boolean z8 = iArr4[i17] == 0;
                if (i20 <= i18) {
                    if (i20 == i18 && a5.f14497c == 5 && !z7 && z8) {
                        z7 = true;
                    }
                    i17++;
                    tg = tg2;
                    i13 = 2;
                } else {
                    z7 = z8;
                }
                i18 = i20;
                i16 = i17;
                i17++;
                tg = tg2;
                i13 = 2;
            }
            TG tg3 = tg;
            if (i16 == i13) {
                iArr3 = new int[i10];
            } else {
                RF rf2 = rfArr[i16];
                int[] iArr7 = new int[i10];
                for (int i22 = 0; i22 < i10; i22++) {
                    iArr7[i22] = rf2.r(c1407pArr[i22]);
                }
                iArr3 = iArr7;
            }
            int i23 = iArr4[i16];
            c1292mbArr[i16][i23] = a5;
            iArr5[i16][i23] = iArr3;
            iArr4[i16] = i23 + 1;
            i15++;
            tg = tg3;
            i13 = 2;
        }
        int i24 = i13;
        TG[] tgArr = new TG[i24];
        String[] strArr = new String[i24];
        int[] iArr8 = new int[i24];
        int i25 = 0;
        while (i25 < i24) {
            int i26 = iArr4[i25];
            tgArr[i25] = new TG((C1292mb[]) AbstractC1260lo.f(i26, c1292mbArr[i25]));
            iArr5[i25] = (int[][]) AbstractC1260lo.f(i26, iArr5[i25]);
            strArr[i25] = rfArr[i25].n();
            iArr8[i25] = rfArr[i25].f11390l;
            i25++;
            i24 = 2;
        }
        int i27 = i24;
        C0375o c0375o = new C0375o(iArr8, tgArr, iArr6, iArr5, new TG((C1292mb[]) AbstractC1260lo.f(iArr4[i27], c1292mbArr[i27])), 21);
        synchronized (c1112iH.f13932c) {
            try {
                c0843cH = c1112iH.f;
                if (c0843cH.f12992p && AbstractC1260lo.f14419a >= 32 && (w5 = c1112iH.f13935g) != null) {
                    Looper myLooper = Looper.myLooper();
                    AbstractC1668us.F(myLooper);
                    if (((C0888dH) w5.f4414n) == null && ((Handler) w5.f4413m) == null) {
                        w5.f4414n = new C0888dH(c1112iH);
                        Handler handler = new Handler(myLooper);
                        w5.f4413m = handler;
                        ((Spatializer) w5.f4412l).addOnSpatializerStateChangedListener(new ExecutorC1590t3(handler, 2), (C0888dH) w5.f4414n);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i28 = 2;
        C1155jH[] c1155jHArr3 = new C1155jH[2];
        int i29 = 0;
        int i30 = 0;
        while (true) {
            i = 1;
            if (i30 >= 2) {
                z3 = false;
                break;
            }
            if (((int[]) c0375o.f5042l)[i30] == 2 && ((TG[]) c0375o.f5043m)[i30].f11646a > 0) {
                z3 = true;
                break;
            }
            i30++;
        }
        Pair g5 = C1112iH.g(1, c0375o, iArr5, new P.W(c1112iH, c0843cH, z3, iArr6), new C1589t2(9));
        if (g5 != null) {
            c1155jHArr3[((Integer) g5.second).intValue()] = (C1155jH) g5.first;
        }
        if (g5 == null) {
            str = null;
        } else {
            C1155jH c1155jH = (C1155jH) g5.first;
            str = c1155jH.f14097a.f14498d[c1155jH.f14098b[0]].f14897d;
        }
        Fx fx = new Fx();
        fx.f9145m = c0843cH;
        fx.f9143k = str;
        fx.f9144l = iArr6;
        Pair g6 = C1112iH.g(2, c0375o, iArr5, fx, new C1589t2(8));
        int i31 = 4;
        Pair g7 = g6 == null ? C1112iH.g(4, c0375o, iArr5, new Qs(12, c0843cH), new C1589t2(7)) : null;
        if (g7 != null) {
            c1155jHArr3[((Integer) g7.second).intValue()] = (C1155jH) g7.first;
        } else if (g6 != null) {
            c1155jHArr3[((Integer) g6.second).intValue()] = (C1155jH) g6.first;
        }
        int i32 = 3;
        Pair g8 = C1112iH.g(3, c0375o, iArr5, new C1667ur(14, c0843cH, str, false), new C1589t2(10));
        if (g8 != null) {
            c1155jHArr3[((Integer) g8.second).intValue()] = (C1155jH) g8.first;
        }
        int i33 = 0;
        while (i33 < i28) {
            int i34 = ((int[]) c0375o.f5042l)[i33];
            if (i34 == i28 || i34 == i || i34 == i32 || i34 == i31) {
                c1155jHArr = c1155jHArr3;
                i9 = i29;
            } else {
                TG tg4 = ((TG[]) c0375o.f5043m)[i33];
                int[][] iArr9 = iArr5[i33];
                int i35 = i29;
                i9 = i35;
                int i36 = i9;
                C1292mb c1292mb2 = null;
                C0754aH c0754aH = null;
                while (i35 < tg4.f11646a) {
                    C1292mb a6 = tg4.a(i35);
                    int[] iArr10 = iArr9[i35];
                    int i37 = i9;
                    C0754aH c0754aH2 = c0754aH;
                    while (i37 < a6.f14495a) {
                        if (AbstractC1400ot.p(iArr10[i37], c0843cH.f12993q)) {
                            c1155jHArr2 = c1155jHArr3;
                            C0754aH c0754aH3 = new C0754aH(a6.f14498d[i37], iArr10[i37]);
                            if (c0754aH2 != null) {
                                c1292mb = c1292mb2;
                            }
                            c0754aH2 = c0754aH3;
                            c1292mb2 = a6;
                            i36 = i37;
                            i37++;
                            c1155jHArr3 = c1155jHArr2;
                        } else {
                            c1155jHArr2 = c1155jHArr3;
                            c1292mb = c1292mb2;
                        }
                        c1292mb2 = c1292mb;
                        i37++;
                        c1155jHArr3 = c1155jHArr2;
                    }
                    i35++;
                    c0754aH = c0754aH2;
                }
                c1155jHArr = c1155jHArr3;
                c1155jHArr[i33] = c1292mb2 == null ? null : new C1155jH(c1292mb2, new int[]{i36});
            }
            i33++;
            i29 = i9;
            c1155jHArr3 = c1155jHArr;
            i28 = 2;
            i = 1;
            i31 = 4;
            i32 = 3;
        }
        C1155jH[] c1155jHArr4 = c1155jHArr3;
        int i38 = i29;
        HashMap hashMap = new HashMap();
        while (i29 < 2) {
            TG tg5 = ((TG[]) c0375o.f5043m)[i29];
            for (int i39 = i38; i39 < tg5.f11646a; i39++) {
                if (c0843cH.f16307j.get(tg5.a(i39)) != null) {
                    throw new ClassCastException();
                }
            }
            i29++;
        }
        TG tg6 = (TG) c0375o.f5046p;
        for (int i40 = i38; i40 < tg6.f11646a; i40++) {
            if (c0843cH.f16307j.get(tg6.a(i40)) != null) {
                throw new ClassCastException();
            }
        }
        int i41 = i38;
        while (true) {
            int i42 = 2;
            if (i41 >= 2) {
                int i43 = i38;
                while (i43 < i42) {
                    TG tg7 = ((TG[]) c0375o.f5043m)[i43];
                    Map map = (Map) c0843cH.f12995s.get(i43);
                    if (map != null && map.containsKey(tg7)) {
                        Map map2 = (Map) c0843cH.f12995s.get(i43);
                        if (map2 != null && map2.get(tg7) != null) {
                            throw new ClassCastException();
                        }
                        c1155jHArr4[i43] = null;
                    }
                    i43++;
                    i42 = 2;
                }
                int i44 = i38;
                while (i44 < i42) {
                    int i45 = ((int[]) c0375o.f5042l)[i44];
                    if (c0843cH.f12996t.get(i44) || c0843cH.f16308k.contains(Integer.valueOf(i45))) {
                        c1155jHArr4[i44] = null;
                    }
                    i44++;
                    i42 = 2;
                }
                RE re = c1112iH.i;
                AbstractC1668us.F(c1112iH.f13931b);
                ArrayList arrayList = new ArrayList();
                int i46 = 0;
                int i47 = 0;
                while (true) {
                    i5 = 1;
                    if (i47 >= 2) {
                        break;
                    }
                    C1155jH c1155jH2 = c1155jHArr4[i47];
                    if (c1155jH2 == null || c1155jH2.f14098b.length <= 1) {
                        arrayList.add(null);
                    } else {
                        C0909dv c0909dv = new C0909dv(4);
                        c0909dv.a(new UG(0L, 0L));
                        arrayList.add(c0909dv);
                    }
                    i47++;
                }
                long[][] jArr = new long[2][];
                int i48 = 0;
                while (i48 < 2) {
                    C1155jH c1155jH3 = c1155jHArr4[i48];
                    if (c1155jH3 == null) {
                        jArr[i48] = new long[i46];
                        i8 = i46;
                    } else {
                        i8 = i46;
                        int[] iArr11 = c1155jH3.f14098b;
                        jArr[i48] = new long[iArr11.length];
                        for (int i49 = i8; i49 < iArr11.length; i49++) {
                            long j5 = c1155jH3.f14097a.f14498d[iArr11[i49]].i;
                            long[] jArr2 = jArr[i48];
                            if (j5 == -1) {
                                j5 = 0;
                            }
                            jArr2[i49] = j5;
                        }
                        Arrays.sort(jArr[i48]);
                    }
                    i48++;
                    i46 = i8;
                }
                int i50 = i46;
                int[] iArr12 = new int[2];
                long[] jArr3 = new long[2];
                for (int i51 = i50; i51 < 2; i51++) {
                    long[] jArr4 = jArr[i51];
                    jArr3[i51] = jArr4.length == 0 ? 0L : jArr4[i50];
                }
                VG.e(arrayList, jArr3);
                C1581sv c1581sv = new C1581sv(new TreeMap(C1671uv.f15931l), new Au());
                int i52 = i50;
                for (i6 = 2; i52 < i6; i6 = 2) {
                    int length2 = jArr[i52].length;
                    if (length2 <= i5) {
                        i7 = i5;
                    } else {
                        double[] dArr = new double[length2];
                        i7 = i5;
                        int i53 = i50;
                        while (true) {
                            long[] jArr5 = jArr[i52];
                            double d5 = 0.0d;
                            if (i53 >= jArr5.length) {
                                break;
                            }
                            int i54 = length2;
                            long j6 = jArr5[i53];
                            if (j6 != -1) {
                                d5 = Math.log(j6);
                            }
                            dArr[i53] = d5;
                            i53++;
                            length2 = i54;
                        }
                        int i55 = length2 - 1;
                        double d6 = dArr[i55] - dArr[i50];
                        int i56 = i50;
                        while (i56 < i55) {
                            double d7 = dArr[i56];
                            i56++;
                            Double valueOf = Double.valueOf(d6 == 0.0d ? 1.0d : (((d7 + dArr[i56]) * 0.5d) - dArr[i50]) / d6);
                            Integer valueOf2 = Integer.valueOf(i52);
                            Map map3 = c1581sv.f15613n;
                            RE re2 = re;
                            Collection collection = (Collection) map3.get(valueOf);
                            if (collection == null) {
                                List list = (List) c1581sv.f15615p.mo12a();
                                if (!list.add(valueOf2)) {
                                    throw new AssertionError("New Collection violated the Collection spec");
                                }
                                c1581sv.f15614o++;
                                map3.put(valueOf, list);
                            } else if (collection.add(valueOf2)) {
                                c1581sv.f15614o++;
                            }
                            re = re2;
                        }
                    }
                    i52++;
                    i5 = i7;
                    re = re;
                }
                RE re3 = re;
                Pu pu = c1581sv.f11284l;
                if (pu == null) {
                    pu = new Pu(0, c1581sv);
                    c1581sv.f11284l = pu;
                }
                AbstractC1044gv l5 = AbstractC1044gv.l(pu);
                for (int i57 = i50; i57 < l5.size(); i57++) {
                    int intValue = ((Integer) l5.get(i57)).intValue();
                    int i58 = iArr12[intValue] + 1;
                    iArr12[intValue] = i58;
                    jArr3[intValue] = jArr[intValue][i58];
                    VG.e(arrayList, jArr3);
                }
                for (int i59 = i50; i59 < 2; i59++) {
                    if (arrayList.get(i59) != null) {
                        long j7 = jArr3[i59];
                        jArr3[i59] = j7 + j7;
                    }
                }
                VG.e(arrayList, jArr3);
                AbstractC0952et.q("initialCapacity", 4);
                Object[] objArr = new Object[4];
                int i60 = i50;
                int i61 = i60;
                while (i60 < arrayList.size()) {
                    C0909dv c0909dv2 = (C0909dv) arrayList.get(i60);
                    C1761wv f = c0909dv2 == null ? C1761wv.f16184o : c0909dv2.f();
                    f.getClass();
                    int length3 = objArr.length;
                    int i62 = i61 + 1;
                    int d8 = AbstractC0776av.d(length3, i62);
                    if (d8 > length3) {
                        objArr = Arrays.copyOf(objArr, d8);
                    }
                    objArr[i61] = f;
                    i60++;
                    i61 = i62;
                }
                C1761wv k5 = AbstractC1044gv.k(i61, objArr);
                int i63 = 2;
                InterfaceC1200kH[] interfaceC1200kHArr2 = new InterfaceC1200kH[2];
                int i64 = i38;
                while (i64 < i63) {
                    C1155jH c1155jH4 = c1155jHArr4[i64];
                    if (c1155jH4 != null && (length = (iArr2 = c1155jH4.f14098b).length) != 0) {
                        if (length == 1) {
                            vg = new VG(c1155jH4.f14097a, new int[]{iArr2[i38]});
                        } else {
                            C1292mb c1292mb3 = c1155jH4.f14097a;
                            AbstractC1044gv abstractC1044gv = (AbstractC1044gv) k5.get(i64);
                            re3.getClass();
                            VG vg2 = new VG(c1292mb3, iArr2);
                            AbstractC1044gv.l(abstractC1044gv);
                            vg = vg2;
                        }
                        interfaceC1200kHArr2[i64] = vg;
                    }
                    i64++;
                    i63 = 2;
                }
                KE[] keArr = new KE[i63];
                for (int i65 = i38; i65 < i63; i65++) {
                    keArr[i65] = (c0843cH.f12996t.get(i65) || c0843cH.f16308k.contains(Integer.valueOf(((int[]) c0375o.f5042l)[i65])) || (((int[]) c0375o.f5042l)[i65] != -2 && interfaceC1200kHArr2[i65] == null)) ? null : KE.f10145a;
                }
                Pair create = Pair.create(keArr, interfaceC1200kHArr2);
                InterfaceC1200kH[] interfaceC1200kHArr3 = (InterfaceC1200kH[]) create.second;
                List[] listArr = new List[interfaceC1200kHArr3.length];
                for (int i66 = 0; i66 < interfaceC1200kHArr3.length; i66++) {
                    InterfaceC1200kH interfaceC1200kH = interfaceC1200kHArr3[i66];
                    listArr[i66] = interfaceC1200kH != null ? AbstractC1044gv.n(interfaceC1200kH) : C1761wv.f16184o;
                }
                C0909dv c0909dv3 = new C0909dv(4);
                for (int i67 = 0; i67 < 2; i67++) {
                    TG[] tgArr2 = (TG[]) c0375o.f5043m;
                    TG tg8 = tgArr2[i67];
                    List list2 = listArr[i67];
                    int i68 = 0;
                    while (i68 < tg8.f11646a) {
                        C1292mb a7 = tg8.a(i68);
                        int i69 = tgArr2[i67].a(i68).f14495a;
                        int[] iArr13 = new int[i69];
                        int i70 = 0;
                        int i71 = 0;
                        while (true) {
                            iArr = (int[][][]) c0375o.f5045o;
                            if (i71 >= i69) {
                                break;
                            }
                            List[] listArr2 = listArr;
                            if ((iArr[i67][i68][i71] & 7) == 4) {
                                iArr13[i70] = i71;
                                i70++;
                            }
                            i71++;
                            listArr = listArr2;
                        }
                        List[] listArr3 = listArr;
                        int[] copyOf = Arrays.copyOf(iArr13, i70);
                        String str2 = null;
                        int i72 = 16;
                        int i73 = 0;
                        boolean z9 = false;
                        int i74 = 0;
                        while (i73 < copyOf.length) {
                            String str3 = tgArr2[i67].a(i68).f14498d[copyOf[i73]].f14904m;
                            int i75 = i74 + 1;
                            if (i74 == 0) {
                                str2 = str3;
                            } else {
                                z9 |= !Objects.equals(str2, str3);
                            }
                            i72 = Math.min(i72, iArr[i67][i68][i73] & 24);
                            i73++;
                            i74 = i75;
                        }
                        if (z9) {
                            i72 = Math.min(i72, ((int[]) c0375o.f5044n)[i67]);
                        }
                        boolean z10 = i72 != 0;
                        int i76 = a7.f14495a;
                        int[] iArr14 = new int[i76];
                        boolean[] zArr = new boolean[i76];
                        int i77 = 0;
                        while (i77 < i76) {
                            iArr14[i77] = iArr[i67][i68][i77] & 7;
                            int[][][] iArr15 = iArr;
                            int i78 = i76;
                            int i79 = 0;
                            while (true) {
                                if (i79 >= list2.size()) {
                                    z6 = false;
                                    break;
                                }
                                InterfaceC1200kH interfaceC1200kH2 = (InterfaceC1200kH) list2.get(i79);
                                int i80 = i79;
                                if (interfaceC1200kH2.f().equals(a7) && interfaceC1200kH2.b(i77) != -1) {
                                    z6 = true;
                                    break;
                                }
                                i79 = i80 + 1;
                            }
                            zArr[i77] = z6;
                            i77++;
                            iArr = iArr15;
                            i76 = i78;
                        }
                        c0909dv3.a(new C0682Sc(a7, z10, iArr14, zArr));
                        i68++;
                        listArr = listArr3;
                    }
                }
                int i81 = 0;
                while (true) {
                    TG tg9 = (TG) c0375o.f5046p;
                    if (i81 >= tg9.f11646a) {
                        break;
                    }
                    C1292mb a8 = tg9.a(i81);
                    int i82 = a8.f14495a;
                    int[] iArr16 = new int[i82];
                    Arrays.fill(iArr16, 0);
                    c0909dv3.a(new C0682Sc(a8, false, iArr16, new boolean[i82]));
                    i81++;
                }
                C1245lH c1245lH = new C1245lH((KE[]) create.first, (InterfaceC1200kH[]) create.second, new C0981fd(c0909dv3.f()), c0375o);
                int i83 = 0;
                while (true) {
                    int i84 = c1245lH.f14376k;
                    interfaceC1200kHArr = (InterfaceC1200kH[]) c1245lH.f14378m;
                    if (i83 >= i84) {
                        break;
                    }
                    if (c1245lH.e(i83)) {
                        if (interfaceC1200kHArr[i83] == null) {
                            rfArr[i83].getClass();
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        AbstractC1668us.a0(z5);
                    } else {
                        AbstractC1668us.a0(interfaceC1200kHArr[i83] == null);
                    }
                    i83++;
                }
                for (InterfaceC1200kH interfaceC1200kH3 : interfaceC1200kHArr) {
                }
                return c1245lH;
            }
            if (hashMap.get(Integer.valueOf(((int[]) c0375o.f5042l)[i41])) != null) {
                throw new ClassCastException();
            }
            i41++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    public final void g(AbstractC0715Xa abstractC0715Xa) {
        this.f15655e = true;
        this.f15662n = this.f15651a.g();
        C1245lH f = f(abstractC0715Xa);
        C1646uE c1646uE = this.f15656g;
        long j5 = c1646uE.f15820e;
        long j6 = c1646uE.f15817b;
        if (j5 != -9223372036854775807L && j6 >= j5) {
            j6 = Math.max(0L, j5 - 1);
        }
        long a5 = a(f, j6, false, new boolean[2]);
        long j7 = this.f15664p;
        C1646uE c1646uE2 = this.f15656g;
        long j8 = c1646uE2.f15817b;
        this.f15664p = (j8 - a5) + j7;
        if (a5 != j8) {
            c1646uE2 = new C1646uE(c1646uE2.f15816a, a5, c1646uE2.f15818c, c1646uE2.f15819d, c1646uE2.f15820e, c1646uE2.f, c1646uE2.f15821g, c1646uE2.f15822h);
        }
        this.f15656g = c1646uE2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.sG, java.lang.Object] */
    public final void h() {
        k();
        ?? r02 = this.f15651a;
        try {
            boolean z3 = r02 instanceof C0798bG;
            C1170jo c1170jo = this.f15660l;
            if (z3) {
                c1170jo.d(((C0798bG) r02).f12796k);
            } else {
                c1170jo.d(r02);
            }
        } catch (RuntimeException e3) {
            JB.g("MediaPeriodHolder", "Period release failed.", e3);
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.google.android.gms.internal.ads.OG, java.lang.Object] */
    public final boolean i() {
        if (this.f15655e) {
            return !this.f || this.f15651a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public final boolean j() {
        if (this.f15655e) {
            return i() || b() - this.f15656g.f15817b >= -9223372036854775807L;
        }
        return false;
    }

    public final void k() {
        if (this.f15661m != null) {
            return;
        }
        int i = 0;
        while (true) {
            C1245lH c1245lH = this.f15663o;
            if (i >= c1245lH.f14376k) {
                return;
            }
            c1245lH.e(i);
            InterfaceC1200kH interfaceC1200kH = ((InterfaceC1200kH[]) this.f15663o.f14378m)[i];
            i++;
        }
    }
}
