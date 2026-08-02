package A1;

import E3.AbstractC0158p;
import E3.AbstractC0167z;
import E3.C0156n;
import E3.C0164w;
import E3.C0165x;
import E3.L;
import G4.C0269b;
import android.media.Spatializer;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import c2.C0798d;
import c2.C0815v;
import c2.e0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import t2.C1605a;
import t2.C1606b;
import u2.InterfaceC1629f;
import v2.AbstractC1664a;

/* renamed from: A1.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0028k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f448a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f449b;

    /* renamed from: c, reason: collision with root package name */
    public final c2.W[] f450c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f451d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f452e;

    /* renamed from: f, reason: collision with root package name */
    public C0030l0 f453f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f454g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f455h;

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC0023i[] f456i;
    public final t2.s j;

    /* renamed from: k, reason: collision with root package name */
    public final C0043s0 f457k;

    /* renamed from: l, reason: collision with root package name */
    public C0028k0 f458l;

    /* renamed from: m, reason: collision with root package name */
    public c2.f0 f459m;

    /* renamed from: n, reason: collision with root package name */
    public t2.w f460n;

    /* renamed from: o, reason: collision with root package name */
    public long f461o;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8, types: [c2.d] */
    public C0028k0(AbstractC0023i[] abstractC0023iArr, long j, t2.s sVar, u2.r rVar, C0043s0 c0043s0, C0030l0 c0030l0, t2.w wVar) {
        this.f456i = abstractC0023iArr;
        this.f461o = j;
        this.j = sVar;
        this.f457k = c0043s0;
        c2.D d7 = c0030l0.f467a;
        this.f449b = d7.f10161a;
        this.f453f = c0030l0;
        this.f459m = c2.f0.f10346d;
        this.f460n = wVar;
        this.f450c = new c2.W[abstractC0023iArr.length];
        this.f455h = new boolean[abstractC0023iArr.length];
        c0043s0.getClass();
        Pair pair = (Pair) d7.f10161a;
        Object obj = pair.first;
        c2.D b7 = d7.b(pair.second);
        C0041r0 c0041r0 = (C0041r0) c0043s0.f551a.get(obj);
        c0041r0.getClass();
        ((HashSet) c0043s0.j).add(c0041r0);
        C0040q0 c0040q0 = (C0040q0) ((HashMap) c0043s0.f556f).get(c0041r0);
        if (c0040q0 != null) {
            c0040q0.f532a.d(c0040q0.f533b);
        }
        c0041r0.f546c.add(b7);
        C0815v a2 = c0041r0.f544a.a(b7, rVar, c0030l0.f468b);
        ((IdentityHashMap) c0043s0.f555e).put(a2, c0041r0);
        c0043s0.d();
        long j3 = c0030l0.f470d;
        this.f448a = j3 != -9223372036854775807L ? new C0798d(a2, true, 0L, j3) : a2;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [c2.B, java.lang.Object] */
    public final long a(t2.w wVar, long j, boolean z4, boolean[] zArr) {
        AbstractC0023i[] abstractC0023iArr;
        c2.W[] wArr;
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= wVar.f16443a) {
                break;
            }
            if (z4 || !wVar.a(this.f460n, i7)) {
                z7 = false;
            }
            this.f455h[i7] = z7;
            i7++;
        }
        int i8 = 0;
        while (true) {
            abstractC0023iArr = this.f456i;
            int length = abstractC0023iArr.length;
            wArr = this.f450c;
            if (i8 >= length) {
                break;
            }
            if (abstractC0023iArr[i8].f375a == -2) {
                wArr[i8] = null;
            }
            i8++;
        }
        b();
        this.f460n = wVar;
        c();
        long I7 = this.f448a.I(wVar.f16445c, this.f455h, this.f450c, zArr, j);
        for (int i9 = 0; i9 < abstractC0023iArr.length; i9++) {
            if (abstractC0023iArr[i9].f375a == -2 && this.f460n.b(i9)) {
                wArr[i9] = new c2.r();
            }
        }
        this.f452e = false;
        for (int i10 = 0; i10 < wArr.length; i10++) {
            if (wArr[i10] != null) {
                AbstractC1664a.h(wVar.b(i10));
                if (abstractC0023iArr[i10].f375a != -2) {
                    this.f452e = true;
                }
            } else {
                AbstractC1664a.h(wVar.f16445c[i10] == null);
            }
        }
        return I7;
    }

    public final void b() {
        if (this.f458l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            t2.w wVar = this.f460n;
            if (i7 >= wVar.f16443a) {
                return;
            }
            boolean b7 = wVar.b(i7);
            t2.c cVar = this.f460n.f16445c[i7];
            if (b7 && cVar != null) {
                cVar.b();
            }
            i7++;
        }
    }

    public final void c() {
        if (this.f458l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            t2.w wVar = this.f460n;
            if (i7 >= wVar.f16443a) {
                return;
            }
            boolean b7 = wVar.b(i7);
            t2.c cVar = this.f460n.f16445c[i7];
            if (b7 && cVar != null) {
                cVar.c();
            }
            i7++;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [c2.Y, java.lang.Object] */
    public final long d() {
        if (!this.f451d) {
            return this.f453f.f468b;
        }
        long T6 = this.f452e ? this.f448a.T() : Long.MIN_VALUE;
        return T6 == Long.MIN_VALUE ? this.f453f.f471e : T6;
    }

    public final long e() {
        return this.f453f.f468b + this.f461o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c2.B, java.lang.Object] */
    public final void f() {
        b();
        ?? r02 = this.f448a;
        try {
            boolean z4 = r02 instanceof C0798d;
            C0043s0 c0043s0 = this.f457k;
            if (z4) {
                c0043s0.j(((C0798d) r02).f10316a);
            } else {
                c0043s0.j(r02);
            }
        } catch (RuntimeException e7) {
            AbstractC1664a.l("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0266, code lost:
    
        if (E3.AbstractC0161t.f2068a.c(r8.f16325b, r14.f16325b).c(r8.f16324a, r14.f16324a).e() > 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05c8, code lost:
    
        if (r4 != 2) goto L273;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t2.w g(float f7, R0 r02) {
        final t2.i iVar;
        c2.f0[] f0VarArr;
        int[] iArr;
        int i7;
        final boolean z4;
        String str;
        int i8;
        boolean z7;
        int i9;
        E3.L l7;
        int i10;
        boolean z8;
        int i11;
        t2.c c1606b;
        int i12;
        int[][][] iArr2;
        t2.i iVar2;
        E4.L l8;
        int i13;
        int i14;
        int i15;
        c2.f0[] f0VarArr2;
        int[] iArr3;
        int i16;
        c2.f0 f0Var;
        c2.e0 e0Var;
        D3.j jVar;
        int i17;
        int[] iArr4;
        int i18 = 1;
        t2.s sVar = this.j;
        AbstractC0023i[] abstractC0023iArr = this.f456i;
        c2.f0 f0Var2 = this.f459m;
        sVar.getClass();
        int[] iArr5 = new int[abstractC0023iArr.length + 1];
        int length = abstractC0023iArr.length + 1;
        c2.e0[][] e0VarArr = new c2.e0[length][];
        int[][][] iArr6 = new int[abstractC0023iArr.length + 1][][];
        for (int i19 = 0; i19 < length; i19++) {
            int i20 = f0Var2.f10347a;
            e0VarArr[i19] = new c2.e0[i20];
            iArr6[i19] = new int[i20][];
        }
        int length2 = abstractC0023iArr.length;
        int[] iArr7 = new int[length2];
        for (int i21 = 0; i21 < length2; i21++) {
            iArr7[i21] = abstractC0023iArr[i21].A();
        }
        int i22 = 0;
        while (i22 < f0Var2.f10347a) {
            c2.e0 a2 = f0Var2.a(i22);
            int i23 = a2.f10343c == 5 ? i18 : 0;
            int length3 = abstractC0023iArr.length;
            int i24 = i18;
            int i25 = 0;
            int i26 = 0;
            while (i26 < abstractC0023iArr.length) {
                AbstractC0023i abstractC0023i = abstractC0023iArr[i26];
                c2.f0 f0Var3 = f0Var2;
                int i27 = 0;
                for (int i28 = 0; i28 < a2.f10341a; i28++) {
                    i27 = Math.max(i27, abstractC0023i.z(a2.f10344d[i28]) & 7);
                }
                int i29 = iArr5[i26] == 0 ? 1 : 0;
                if (i27 > i25 || (i27 == i25 && i23 != 0 && i24 == 0 && i29 != 0)) {
                    i25 = i27;
                    i24 = i29;
                    length3 = i26;
                }
                i26++;
                f0Var2 = f0Var3;
            }
            c2.f0 f0Var4 = f0Var2;
            if (length3 == abstractC0023iArr.length) {
                iArr4 = new int[a2.f10341a];
                i17 = 1;
            } else {
                AbstractC0023i abstractC0023i2 = abstractC0023iArr[length3];
                int[] iArr8 = new int[a2.f10341a];
                for (int i30 = 0; i30 < a2.f10341a; i30++) {
                    iArr8[i30] = abstractC0023i2.z(a2.f10344d[i30]);
                }
                i17 = 1;
                iArr4 = iArr8;
            }
            int i31 = iArr5[length3];
            e0VarArr[length3][i31] = a2;
            iArr6[length3][i31] = iArr4;
            iArr5[length3] = i31 + i17;
            i22 += i17;
            i18 = i17;
            f0Var2 = f0Var4;
        }
        c2.f0[] f0VarArr3 = new c2.f0[abstractC0023iArr.length];
        String[] strArr = new String[abstractC0023iArr.length];
        int[] iArr9 = new int[abstractC0023iArr.length];
        for (int i32 = 0; i32 < abstractC0023iArr.length; i32++) {
            int i33 = iArr5[i32];
            f0VarArr3[i32] = new c2.f0((c2.e0[]) v2.t.G(i33, e0VarArr[i32]));
            iArr6[i32] = (int[][]) v2.t.G(i33, iArr6[i32]);
            strArr[i32] = abstractC0023iArr[i32].j();
            iArr9[i32] = abstractC0023iArr[i32].f375a;
        }
        c2.f0 f0Var5 = new c2.f0((c2.e0[]) v2.t.G(iArr5[abstractC0023iArr.length], e0VarArr[abstractC0023iArr.length]));
        E4.L l9 = new E4.L();
        l9.f2142b = iArr9;
        l9.f2143c = f0VarArr3;
        l9.f2145e = iArr6;
        l9.f2144d = iArr7;
        l9.f2146f = f0Var5;
        l9.f2141a = iArr9.length;
        final t2.p pVar = (t2.p) sVar;
        synchronized (pVar.f16385c) {
            try {
                iVar = pVar.f16388f;
                if (iVar.f16351a0 && v2.t.f17153a >= 32 && (jVar = pVar.f16389g) != null) {
                    Looper myLooper = Looper.myLooper();
                    AbstractC1664a.i(myLooper);
                    if (((t2.k) jVar.f1726e) == null && ((Handler) jVar.f1725d) == null) {
                        jVar.f1726e = new t2.k(pVar);
                        Handler handler = new Handler(myLooper);
                        jVar.f1725d = handler;
                        ((Spatializer) jVar.f1723b).addOnSpatializerStateChangedListener(new C1.C(handler), (t2.k) jVar.f1726e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i34 = l9.f2141a;
        t2.q[] qVarArr = new t2.q[i34];
        Pair h6 = t2.p.h(2, l9, iArr6, new B1.c(24, iVar, iArr7), new C0269b(19));
        if (h6 != null) {
            qVarArr[((Integer) h6.second).intValue()] = (t2.q) h6.first;
        }
        int i35 = 0;
        while (true) {
            f0VarArr = (c2.f0[]) l9.f2143c;
            iArr = (int[]) l9.f2142b;
            if (i35 >= l9.f2141a) {
                i7 = 1;
                z4 = false;
                break;
            }
            if (2 == iArr[i35] && f0VarArr[i35].f10347a > 0) {
                z4 = true;
                i7 = 1;
                break;
            }
            i35++;
        }
        Pair h7 = t2.p.h(i7, l9, iArr6, new t2.m() { // from class: t2.d
            @Override // t2.m
            public final L a(int i36, e0 e0Var2, int[] iArr10) {
                p pVar2 = p.this;
                pVar2.getClass();
                e eVar = new e(pVar2);
                C0165x c0165x = AbstractC0167z.f2083b;
                AbstractC0158p.a(4, "initialCapacity");
                Object[] objArr = new Object[4];
                int i37 = 0;
                int i38 = 0;
                while (i37 < e0Var2.f10341a) {
                    f fVar = new f(i36, e0Var2, i37, iVar, iArr10[i37], z4, eVar);
                    int i39 = i38 + 1;
                    if (objArr.length < i39) {
                        objArr = Arrays.copyOf(objArr, C0164w.e(objArr.length, i39));
                    }
                    objArr[i38] = fVar;
                    i37++;
                    i38 = i39;
                }
                return AbstractC0167z.B(i38, objArr);
            }
        }, new C0269b(20));
        if (h7 != null) {
            qVarArr[((Integer) h7.second).intValue()] = (t2.q) h7.first;
        }
        if (h7 == null) {
            str = null;
        } else {
            t2.q qVar = (t2.q) h7.first;
            str = qVar.f16391a.f10344d[qVar.f16392b[0]].f306c;
        }
        int i36 = 3;
        Pair h8 = t2.p.h(3, l9, iArr6, new B1.c(25, iVar, str), new C0269b(21));
        if (h8 != null) {
            qVarArr[((Integer) h8.second).intValue()] = (t2.q) h8.first;
        }
        int i37 = 0;
        while (i37 < i34) {
            int i38 = iArr[i37];
            if (i38 != 2) {
                if (i38 == 1) {
                    f0VarArr2 = f0VarArr;
                    iArr3 = iArr;
                    i16 = 1;
                    i37 += i16;
                    f0VarArr = f0VarArr2;
                    iArr = iArr3;
                    i36 = 3;
                } else if (i38 != i36) {
                    c2.f0 f0Var6 = f0VarArr[i37];
                    int[][] iArr10 = iArr6[i37];
                    c2.e0 e0Var2 = null;
                    t2.g gVar = null;
                    int i39 = 0;
                    int i40 = 0;
                    while (i39 < f0Var6.f10347a) {
                        int[] iArr11 = iArr10[i39];
                        c2.f0[] f0VarArr4 = f0VarArr;
                        int i41 = 0;
                        for (c2.e0 a4 = f0Var6.a(i39); i41 < a4.f10341a; a4 = e0Var) {
                            int[] iArr12 = iArr;
                            if (t2.p.e(iArr11[i41], iVar.f16352b0)) {
                                f0Var = f0Var6;
                                t2.g gVar2 = new t2.g(a4.f10344d[i41], iArr11[i41]);
                                if (gVar != null) {
                                    e0Var = a4;
                                } else {
                                    e0Var = a4;
                                }
                                i40 = i41;
                                gVar = gVar2;
                                e0Var2 = e0Var;
                            } else {
                                f0Var = f0Var6;
                                e0Var = a4;
                            }
                            i41++;
                            iArr = iArr12;
                            f0Var6 = f0Var;
                        }
                        i39++;
                        f0VarArr = f0VarArr4;
                    }
                    f0VarArr2 = f0VarArr;
                    iArr3 = iArr;
                    qVarArr[i37] = e0Var2 == null ? null : new t2.q(0, e0Var2, new int[]{i40});
                    i16 = 1;
                    i37 += i16;
                    f0VarArr = f0VarArr2;
                    iArr = iArr3;
                    i36 = 3;
                }
            }
            f0VarArr2 = f0VarArr;
            iArr3 = iArr;
            i16 = 1;
            i37 += i16;
            f0VarArr = f0VarArr2;
            iArr = iArr3;
            i36 = 3;
        }
        int i42 = l9.f2141a;
        HashMap hashMap = new HashMap();
        int i43 = 0;
        while (true) {
            c2.f0[] f0VarArr5 = (c2.f0[]) l9.f2143c;
            if (i43 >= i42) {
                break;
            }
            t2.p.c(f0VarArr5[i43], iVar, hashMap);
            i43++;
        }
        t2.p.c((c2.f0) l9.f2146f, iVar, hashMap);
        for (int i44 = 0; i44 < i42; i44++) {
        }
        int i45 = l9.f2141a;
        for (int i46 = 0; i46 < i45; i46++) {
            c2.f0 f0Var7 = ((c2.f0[]) l9.f2143c)[i46];
            Map map = (Map) iVar.f16354e0.get(i46);
            if (map != null && map.containsKey(f0Var7)) {
                Map map2 = (Map) iVar.f16354e0.get(i46);
                if (map2 != null) {
                }
                qVarArr[i46] = null;
            }
        }
        for (int i47 = 0; i47 < i34; i47++) {
            int i48 = ((int[]) l9.f2142b)[i47];
            if (iVar.f16355f0.get(i47) || iVar.f16433Q.contains(Integer.valueOf(i48))) {
                qVarArr[i47] = null;
            }
        }
        B4.V v6 = pVar.f16386d;
        InterfaceC1629f interfaceC1629f = pVar.f16395b;
        AbstractC1664a.i(interfaceC1629f);
        v6.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i49 = 0; i49 < qVarArr.length; i49 += i15) {
            t2.q qVar2 = qVarArr[i49];
            if (qVar2 != null) {
                i15 = 1;
                if (qVar2.f16392b.length > 1) {
                    C0164w C3 = AbstractC0167z.C();
                    C3.a(new C1605a(0L, 0L));
                    arrayList.add(C3);
                }
            } else {
                i15 = 1;
            }
            arrayList.add(null);
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i50 = 0;
        while (i50 < qVarArr.length) {
            t2.q qVar3 = qVarArr[i50];
            if (qVar3 == null) {
                jArr[i50] = new long[0];
                i14 = 1;
            } else {
                int[] iArr13 = qVar3.f16392b;
                jArr[i50] = new long[iArr13.length];
                int i51 = 0;
                while (i51 < iArr13.length) {
                    jArr[i50][i51] = qVar3.f16391a.f10344d[iArr13[i51]].f311y;
                    i51++;
                    qVar3 = qVar3;
                    iArr13 = iArr13;
                }
                i14 = 1;
                Arrays.sort(jArr[i50]);
            }
            i50 += i14;
        }
        int[] iArr14 = new int[length4];
        long[] jArr2 = new long[length4];
        for (int i52 = 0; i52 < length4; i52++) {
            long[] jArr3 = jArr[i52];
            jArr2[i52] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        C1606b.m(arrayList, jArr2);
        E3.J j = E3.J.f1999a;
        j.getClass();
        AbstractC0158p.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(j);
        E3.G g3 = new E3.G();
        E3.H h9 = new E3.H();
        p3.f.e(treeMap.isEmpty());
        h9.f1996d = treeMap;
        h9.f1998f = g3;
        int i53 = 0;
        while (i53 < length4) {
            long[] jArr4 = jArr[i53];
            if (jArr4.length <= 1) {
                iVar2 = iVar;
                i12 = length4;
                iArr2 = iArr6;
                l8 = l9;
            } else {
                int length5 = jArr4.length;
                double[] dArr = new double[length5];
                i12 = length4;
                int i54 = 0;
                while (true) {
                    long[] jArr5 = jArr[i53];
                    iArr2 = iArr6;
                    double d7 = 0.0d;
                    if (i54 >= jArr5.length) {
                        break;
                    }
                    t2.i iVar3 = iVar;
                    E4.L l10 = l9;
                    long j3 = jArr5[i54];
                    if (j3 != -1) {
                        d7 = Math.log(j3);
                    }
                    dArr[i54] = d7;
                    i54++;
                    l9 = l10;
                    iArr6 = iArr2;
                    iVar = iVar3;
                }
                iVar2 = iVar;
                l8 = l9;
                int i55 = 1;
                int i56 = length5 - 1;
                double d8 = dArr[i56] - dArr[0];
                int i57 = 0;
                while (i57 < i56) {
                    double d9 = dArr[i57];
                    int i58 = i57 + i55;
                    Double valueOf = Double.valueOf(d8 == 0.0d ? 1.0d : (((d9 + dArr[i58]) * 0.5d) - dArr[0]) / d8);
                    Integer valueOf2 = Integer.valueOf(i53);
                    TreeMap treeMap2 = h9.f1996d;
                    Collection collection = (Collection) treeMap2.get(valueOf);
                    if (collection == null) {
                        List c3 = h9.c();
                        if (!c3.add(valueOf2)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        i13 = 1;
                        h9.f1997e++;
                        treeMap2.put(valueOf, c3);
                    } else {
                        i13 = 1;
                        if (collection.add(valueOf2)) {
                            h9.f1997e++;
                        }
                    }
                    i55 = i13;
                    i57 = i58;
                }
            }
            i53++;
            l9 = l8;
            length4 = i12;
            iArr6 = iArr2;
            iVar = iVar2;
        }
        t2.i iVar4 = iVar;
        int[][][] iArr15 = iArr6;
        E4.L l11 = l9;
        C0156n c0156n = h9.f2064b;
        if (c0156n == null) {
            c0156n = new C0156n(h9);
            h9.f2064b = c0156n;
        }
        AbstractC0167z E7 = AbstractC0167z.E(c0156n);
        for (int i59 = 0; i59 < E7.size(); i59++) {
            int intValue = ((Integer) E7.get(i59)).intValue();
            int i60 = iArr14[intValue] + 1;
            iArr14[intValue] = i60;
            jArr2[intValue] = jArr[intValue][i60];
            C1606b.m(arrayList, jArr2);
        }
        for (int i61 = 0; i61 < qVarArr.length; i61++) {
            if (arrayList.get(i61) != null) {
                jArr2[i61] = jArr2[i61] * 2;
            }
        }
        C1606b.m(arrayList, jArr2);
        C0164w C7 = AbstractC0167z.C();
        for (int i62 = 0; i62 < arrayList.size(); i62++) {
            C0164w c0164w = (C0164w) arrayList.get(i62);
            C7.a(c0164w == null ? E3.L.f2000e : c0164w.d());
        }
        E3.L d10 = C7.d();
        t2.c[] cVarArr = new t2.c[qVarArr.length];
        for (int i63 = 0; i63 < qVarArr.length; i63++) {
            t2.q qVar4 = qVarArr[i63];
            if (qVar4 != null) {
                int[] iArr16 = qVar4.f16392b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        int i64 = iArr16[0];
                        int i65 = qVar4.f16393c;
                        c1606b = new t2.r(qVar4.f16391a, new int[]{i64});
                    } else {
                        long j7 = 25000;
                        c1606b = new C1606b(qVar4.f16391a, iArr16, qVar4.f16393c, interfaceC1629f, 10000, j7, j7, (AbstractC0167z) d10.get(i63));
                    }
                    cVarArr[i63] = c1606b;
                }
            }
        }
        G0[] g0Arr = new G0[i34];
        int i66 = 0;
        while (i66 < i34) {
            t2.i iVar5 = iVar4;
            g0Arr[i66] = (iVar5.f16355f0.get(i66) || iVar5.f16433Q.contains(Integer.valueOf(((int[]) l11.f2142b)[i66])) || (((int[]) l11.f2142b)[i66] != -2 && cVarArr[i66] == null)) ? null : G0.f96b;
            i66++;
            iVar4 = iVar5;
        }
        if (iVar4.c0) {
            int i67 = -1;
            int i68 = -1;
            int i69 = 0;
            while (i69 < l11.f2141a) {
                int i70 = ((int[]) l11.f2142b)[i69];
                t2.c cVar = cVarArr[i69];
                if (i70 == 1) {
                }
                if (cVar != null) {
                    int[][] iArr17 = iArr15[i69];
                    int b7 = ((c2.f0[]) l11.f2143c)[i69].b(cVar.f16296a);
                    int i71 = 0;
                    while (true) {
                        int[] iArr18 = cVar.f16298c;
                        if (i71 >= iArr18.length) {
                            i11 = 1;
                            if (i70 == 1) {
                                i10 = -1;
                                if (i68 != -1) {
                                    z8 = false;
                                    break;
                                }
                                i68 = i69;
                            } else {
                                i10 = -1;
                                if (i67 != -1) {
                                    z8 = false;
                                    break;
                                }
                                i67 = i69;
                            }
                        } else {
                            if ((iArr17[b7][iArr18[i71]] & 32) != 32) {
                                i11 = 1;
                                break;
                            }
                            i71++;
                        }
                    }
                }
                i11 = 1;
                i69 += i11;
            }
            i10 = -1;
            z8 = true;
            if (((i68 == i10 || i67 == i10) ? false : true) & z8) {
                G0 g02 = new G0(true);
                g0Arr[i68] = g02;
                g0Arr[i67] = g02;
            }
        }
        Pair create = Pair.create(g0Arr, cVarArr);
        t2.c[] cVarArr2 = (t2.c[]) create.second;
        List[] listArr = new List[cVarArr2.length];
        for (int i72 = 0; i72 < cVarArr2.length; i72++) {
            t2.c cVar2 = cVarArr2[i72];
            if (cVar2 != null) {
                l7 = AbstractC0167z.I(cVar2);
            } else {
                C0165x c0165x = AbstractC0167z.f2083b;
                l7 = E3.L.f2000e;
            }
            listArr[i72] = l7;
        }
        C0164w c0164w2 = new C0164w();
        for (int i73 = 0; i73 < l11.f2141a; i73++) {
            c2.f0[] f0VarArr6 = (c2.f0[]) l11.f2143c;
            c2.f0 f0Var8 = f0VarArr6[i73];
            List list = listArr[i73];
            int i74 = 0;
            while (i74 < f0Var8.f10347a) {
                c2.e0 a7 = f0Var8.a(i74);
                int i75 = f0VarArr6[i73].a(i74).f10341a;
                int[] iArr19 = new int[i75];
                int i76 = 0;
                int i77 = 0;
                while (i76 < i75) {
                    if ((((int[][][]) l11.f2145e)[i73][i74][i76] & 7) != 4) {
                        i9 = 1;
                    } else {
                        i9 = 1;
                        iArr19[i77] = i76;
                        i77++;
                    }
                    i76 += i9;
                }
                int[] copyOf = Arrays.copyOf(iArr19, i77);
                List[] listArr2 = listArr;
                int i78 = 16;
                String str2 = null;
                int i79 = 0;
                boolean z9 = false;
                int i80 = 0;
                while (i79 < copyOf.length) {
                    c2.f0 f0Var9 = f0Var8;
                    String str3 = f0VarArr6[i73].a(i74).f10344d[copyOf[i79]].f283C;
                    int i81 = i80 + 1;
                    if (i80 == 0) {
                        str2 = str3;
                    } else {
                        z9 = (!v2.t.a(str2, str3)) | z9;
                    }
                    i78 = Math.min(i78, ((int[][][]) l11.f2145e)[i73][i74][i79] & 24);
                    i79++;
                    f0Var8 = f0Var9;
                    i80 = i81;
                }
                c2.f0 f0Var10 = f0Var8;
                if (z9) {
                    i78 = Math.min(i78, ((int[]) l11.f2144d)[i73]);
                }
                boolean z10 = i78 != 0;
                int i82 = a7.f10341a;
                int[] iArr20 = new int[i82];
                boolean[] zArr = new boolean[i82];
                int i83 = 0;
                while (i83 < a7.f10341a) {
                    iArr20[i83] = ((int[][][]) l11.f2145e)[i73][i74][i83] & 7;
                    int i84 = 0;
                    while (true) {
                        if (i84 >= list.size()) {
                            i8 = 1;
                            z7 = false;
                            break;
                        }
                        t2.c cVar3 = (t2.c) list.get(i84);
                        if (cVar3.f16296a.equals(a7) && cVar3.h(i83) != -1) {
                            i8 = 1;
                            z7 = true;
                            break;
                        }
                        i84++;
                    }
                    zArr[i83] = z7;
                    i83 += i8;
                }
                c0164w2.b(new S0(a7, z10, iArr20, zArr));
                i74++;
                listArr = listArr2;
                f0Var8 = f0Var10;
            }
        }
        int i85 = 0;
        while (true) {
            c2.f0 f0Var11 = (c2.f0) l11.f2146f;
            if (i85 >= f0Var11.f10347a) {
                break;
            }
            c2.e0 a8 = f0Var11.a(i85);
            int[] iArr21 = new int[a8.f10341a];
            Arrays.fill(iArr21, 0);
            c0164w2.b(new S0(a8, false, iArr21, new boolean[a8.f10341a]));
            i85++;
        }
        t2.w wVar = new t2.w((G0[]) create.first, (t2.c[]) create.second, new T0(c0164w2.d()), l11);
        for (t2.c cVar4 : wVar.f16445c) {
            if (cVar4 != null) {
                cVar4.k(f7);
            }
        }
        return wVar;
    }

    public final void h() {
        Object obj = this.f448a;
        if (obj instanceof C0798d) {
            long j = this.f453f.f470d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C0798d c0798d = (C0798d) obj;
            c0798d.f10320e = 0L;
            c0798d.f10321f = j;
        }
    }
}
