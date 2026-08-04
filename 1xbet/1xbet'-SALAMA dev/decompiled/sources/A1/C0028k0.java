package A1;

import E3.AbstractC0158p;
import E3.AbstractC0161t;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import p018c2.C0758d;
import p018c2.e0;
import p146u2.InterfaceC0947f;

/* JADX INFO: renamed from: A1.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0028k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p018c2.W[] f450c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f451d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f452e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C0030l0 f453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f454g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f455h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AbstractC0023i[] f456i;
    public final p139t2.s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0043s0 f457k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C0028k0 f458l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p018c2.f0 f459m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p139t2.w f460n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f461o;

    public C0028k0(AbstractC0023i[] abstractC0023iArr, long j, p139t2.s sVar, p146u2.r rVar, C0043s0 c0043s0, C0030l0 c0030l0, p139t2.w wVar) {
        this.f456i = abstractC0023iArr;
        this.f461o = j;
        this.j = sVar;
        this.f457k = c0043s0;
        p018c2.D d7 = c0030l0.f467a;
        this.f449b = d7.f10161a;
        this.f453f = c0030l0;
        this.f459m = p018c2.f0.f10346d;
        this.f460n = wVar;
        this.f450c = new p018c2.W[abstractC0023iArr.length];
        this.f455h = new boolean[abstractC0023iArr.length];
        c0043s0.getClass();
        Pair pair = (Pair) d7.f10161a;
        Object obj = pair.first;
        p018c2.D dB = d7.b(pair.second);
        C0041r0 c0041r0 = (C0041r0) c0043s0.f551a.get(obj);
        c0041r0.getClass();
        ((HashSet) c0043s0.j).add(c0041r0);
        C0040q0 c0040q0 = (C0040q0) ((HashMap) c0043s0.f556f).get(c0041r0);
        if (c0040q0 != null) {
            c0040q0.f532a.d(c0040q0.f533b);
        }
        c0041r0.f546c.add(dB);
        p018c2.B bA = c0041r0.f544a.a(dB, rVar, c0030l0.f468b);
        ((IdentityHashMap) c0043s0.f555e).put(bA, c0041r0);
        c0043s0.d();
        long j3 = c0030l0.f470d;
        this.f448a = j3 != -9223372036854775807L ? new C0758d(bA, true, 0L, j3) : bA;
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [c2.B, java.lang.Object] */
    public final long a(p139t2.w wVar, long j, boolean z4, boolean[] zArr) {
        AbstractC0023i[] abstractC0023iArr;
        p018c2.W[] wArr;
        int i7 = 0;
        while (true) {
            boolean z7 = true;
            if (i7 >= wVar.f16449a) {
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
        long jI = this.f448a.I(wVar.f16451c, this.f455h, this.f450c, zArr, j);
        for (int i9 = 0; i9 < abstractC0023iArr.length; i9++) {
            if (abstractC0023iArr[i9].f375a == -2 && this.f460n.b(i9)) {
                wArr[i9] = new p018c2.r();
            }
        }
        this.f452e = false;
        for (int i10 = 0; i10 < wArr.length; i10++) {
            if (wArr[i10] != null) {
                p151v2.a.h(wVar.b(i10));
                if (abstractC0023iArr[i10].f375a != -2) {
                    this.f452e = true;
                }
            } else {
                p151v2.a.h(wVar.f16451c[i10] == null);
            }
        }
        return jI;
    }

    public final void b() {
        if (this.f458l != null) {
            return;
        }
        int i7 = 0;
        while (true) {
            p139t2.w wVar = this.f460n;
            if (i7 >= wVar.f16449a) {
                return;
            }
            boolean zB = wVar.b(i7);
            p139t2.c cVar = this.f460n.f16451c[i7];
            if (zB && cVar != null) {
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
            p139t2.w wVar = this.f460n;
            if (i7 >= wVar.f16449a) {
                return;
            }
            boolean zB = wVar.b(i7);
            p139t2.c cVar = this.f460n.f16451c[i7];
            if (zB && cVar != null) {
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
        long jT = this.f452e ? this.f448a.T() : Long.MIN_VALUE;
        return jT == Long.MIN_VALUE ? this.f453f.f471e : jT;
    }

    public final long e() {
        return this.f453f.f468b + this.f461o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [c2.B, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void f() {
        b();
        ?? r7 = this.f448a;
        try {
            boolean z4 = r7 instanceof C0758d;
            C0043s0 c0043s0 = this.f457k;
            if (z4) {
                c0043s0.j(((C0758d) r7).f10316a);
            } else {
                c0043s0.j(r7);
            }
        } catch (RuntimeException e7) {
            p151v2.a.l("MediaPeriodHolder", "Period release failed.", e7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:273:0x05cb  */
    public final p139t2.w g(float f7, R0 r7) {
        final p139t2.i iVar;
        p018c2.f0[] f0VarArr;
        int[] iArr;
        int i7;
        final boolean z4;
        String str;
        int i8;
        boolean z7;
        int i9;
        E3.L lI;
        int i10;
        boolean z8;
        int i11;
        p139t2.c bVar;
        int[][][] iArr2;
        p139t2.i iVar2;
        E4.L l7;
        int i12;
        int i13;
        int i14;
        p018c2.f0[] f0VarArr2;
        int[] iArr3;
        int i15;
        p018c2.f0 f0Var;
        p018c2.e0 e0Var;
        D3.j jVar;
        int i16;
        int[] iArr4;
        int i17 = 1;
        p139t2.s sVar = this.j;
        AbstractC0023i[] abstractC0023iArr = this.f456i;
        p018c2.f0 f0Var2 = this.f459m;
        sVar.getClass();
        int[] iArr5 = new int[abstractC0023iArr.length + 1];
        int length = abstractC0023iArr.length + 1;
        p018c2.e0[][] e0VarArr = new p018c2.e0[length][];
        int[][][] iArr6 = new int[abstractC0023iArr.length + 1][][];
        for (int i18 = 0; i18 < length; i18++) {
            int i19 = f0Var2.f10347a;
            e0VarArr[i18] = new p018c2.e0[i19];
            iArr6[i18] = new int[i19][];
        }
        int length2 = abstractC0023iArr.length;
        int[] iArr7 = new int[length2];
        for (int i20 = 0; i20 < length2; i20++) {
            iArr7[i20] = abstractC0023iArr[i20].A();
        }
        int i21 = 0;
        while (i21 < f0Var2.f10347a) {
            p018c2.e0 e0VarA = f0Var2.a(i21);
            int i22 = e0VarA.f10343c == 5 ? i17 : 0;
            int length3 = abstractC0023iArr.length;
            int i23 = i17;
            int i24 = 0;
            int i25 = 0;
            while (i25 < abstractC0023iArr.length) {
                AbstractC0023i abstractC0023i = abstractC0023iArr[i25];
                p018c2.f0 f0Var3 = f0Var2;
                int iMax = 0;
                for (int i26 = 0; i26 < e0VarA.f10341a; i26++) {
                    iMax = Math.max(iMax, abstractC0023i.z(e0VarA.f10344d[i26]) & 7);
                }
                int i27 = iArr5[i25] == 0 ? 1 : 0;
                if (iMax > i24 || (iMax == i24 && i22 != 0 && i23 == 0 && i27 != 0)) {
                    i24 = iMax;
                    i23 = i27;
                    length3 = i25;
                }
                i25++;
                f0Var2 = f0Var3;
            }
            p018c2.f0 f0Var4 = f0Var2;
            if (length3 == abstractC0023iArr.length) {
                iArr4 = new int[e0VarA.f10341a];
                i16 = 1;
            } else {
                AbstractC0023i abstractC0023i2 = abstractC0023iArr[length3];
                int[] iArr8 = new int[e0VarA.f10341a];
                for (int i28 = 0; i28 < e0VarA.f10341a; i28++) {
                    iArr8[i28] = abstractC0023i2.z(e0VarA.f10344d[i28]);
                }
                i16 = 1;
                iArr4 = iArr8;
            }
            int i29 = iArr5[length3];
            e0VarArr[length3][i29] = e0VarA;
            iArr6[length3][i29] = iArr4;
            iArr5[length3] = i29 + i16;
            i21 += i16;
            i17 = i16;
            f0Var2 = f0Var4;
        }
        p018c2.f0[] f0VarArr3 = new p018c2.f0[abstractC0023iArr.length];
        String[] strArr = new String[abstractC0023iArr.length];
        int[] iArr9 = new int[abstractC0023iArr.length];
        for (int i30 = 0; i30 < abstractC0023iArr.length; i30++) {
            int i31 = iArr5[i30];
            f0VarArr3[i30] = new p018c2.f0((p018c2.e0[]) p151v2.t.G(i31, e0VarArr[i30]));
            iArr6[i30] = (int[][]) p151v2.t.G(i31, iArr6[i30]);
            strArr[i30] = abstractC0023iArr[i30].j();
            iArr9[i30] = abstractC0023iArr[i30].f375a;
        }
        p018c2.f0 f0Var5 = new p018c2.f0((p018c2.e0[]) p151v2.t.G(iArr5[abstractC0023iArr.length], e0VarArr[abstractC0023iArr.length]));
        E4.L l8 = new E4.L();
        l8.f2142b = iArr9;
        l8.f2143c = f0VarArr3;
        l8.f2145e = iArr6;
        l8.f2144d = iArr7;
        l8.f2146f = f0Var5;
        l8.f2141a = iArr9.length;
        final p139t2.p pVar = (p139t2.p) sVar;
        synchronized (pVar.f16391c) {
            try {
                iVar = pVar.f16394f;
                if (iVar.f16357a0 && p151v2.t.f17159a >= 32 && (jVar = pVar.f16395g) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    p151v2.a.i(looperMyLooper);
                    if (((p139t2.k) jVar.f1726e) == null && ((Handler) jVar.f1725d) == null) {
                        jVar.f1726e = new p139t2.k(pVar);
                        Handler handler = new Handler(looperMyLooper);
                        jVar.f1725d = handler;
                        ((Spatializer) jVar.f1723b).addOnSpatializerStateChangedListener(new C1.C(handler), (p139t2.k) jVar.f1726e);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int i32 = l8.f2141a;
        p139t2.q[] qVarArr = new p139t2.q[i32];
        Pair pairH = p139t2.p.h(2, l8, iArr6, new B1.c(24, iVar, iArr7), new C0269b(19));
        if (pairH != null) {
            qVarArr[((Integer) pairH.second).intValue()] = (p139t2.q) pairH.first;
        }
        int i33 = 0;
        while (true) {
            f0VarArr = (p018c2.f0[]) l8.f2143c;
            iArr = (int[]) l8.f2142b;
            if (i33 >= l8.f2141a) {
                i7 = 1;
                z4 = false;
                break;
            }
            if (2 == iArr[i33] && f0VarArr[i33].f10347a > 0) {
                z4 = true;
                i7 = 1;
                break;
            }
            i33++;
        }
        Pair pairH2 = p139t2.p.h(i7, l8, iArr6, new p139t2.m() { // from class: t2.d
            @Override // p139t2.m
            public final L a(int i34, e0 e0Var2, int[] iArr10) {
                p pVar2 = pVar;
                pVar2.getClass();
                e eVar = new e(pVar2);
                C0165x c0165x = AbstractC0167z.f2083b;
                AbstractC0158p.a(4, "initialCapacity");
                Object[] objArrCopyOf = new Object[4];
                int i35 = 0;
                int i36 = 0;
                while (i35 < e0Var2.f10341a) {
                    f fVar = new f(i34, e0Var2, i35, iVar, iArr10[i35], z4, eVar);
                    int i37 = i36 + 1;
                    if (objArrCopyOf.length < i37) {
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, C0164w.e(objArrCopyOf.length, i37));
                    }
                    objArrCopyOf[i36] = fVar;
                    i35++;
                    i36 = i37;
                }
                return AbstractC0167z.B(i36, objArrCopyOf);
            }
        }, new C0269b(20));
        if (pairH2 != null) {
            qVarArr[((Integer) pairH2.second).intValue()] = (p139t2.q) pairH2.first;
        }
        if (pairH2 == null) {
            str = null;
        } else {
            p139t2.q qVar = (p139t2.q) pairH2.first;
            str = qVar.f16397a.f10344d[qVar.f16398b[0]].f306c;
        }
        int i34 = 3;
        Pair pairH3 = p139t2.p.h(3, l8, iArr6, new B1.c(25, iVar, str), new C0269b(21));
        if (pairH3 != null) {
            qVarArr[((Integer) pairH3.second).intValue()] = (p139t2.q) pairH3.first;
        }
        int i35 = 0;
        while (i35 < i32) {
            int i36 = iArr[i35];
            if (i36 == 2) {
                f0VarArr2 = f0VarArr;
                iArr3 = iArr;
                i15 = 1;
            } else if (i36 != 1) {
                if (i36 != i34) {
                    p018c2.f0 f0Var6 = f0VarArr[i35];
                    int[][] iArr10 = iArr6[i35];
                    p018c2.e0 e0Var2 = null;
                    p139t2.g gVar = null;
                    int i37 = 0;
                    int i38 = 0;
                    while (i37 < f0Var6.f10347a) {
                        int[] iArr11 = iArr10[i37];
                        p018c2.f0[] f0VarArr4 = f0VarArr;
                        int i39 = 0;
                        for (p018c2.e0 e0VarA2 = f0Var6.a(i37); i39 < e0VarA2.f10341a; e0VarA2 = e0Var) {
                            int[] iArr12 = iArr;
                            if (p139t2.p.e(iArr11[i39], iVar.f16358b0)) {
                                f0Var = f0Var6;
                                p139t2.g gVar2 = new p139t2.g(e0VarA2.f10344d[i39], iArr11[i39]);
                                if (gVar != null) {
                                    e0Var = e0VarA2;
                                    if (AbstractC0161t.f2068a.c(gVar2.f16331b, gVar.f16331b).c(gVar2.f16330a, gVar.f16330a).e() > 0) {
                                    }
                                } else {
                                    e0Var = e0VarA2;
                                }
                                i38 = i39;
                                gVar = gVar2;
                                e0Var2 = e0Var;
                            } else {
                                f0Var = f0Var6;
                                e0Var = e0VarA2;
                            }
                            i39++;
                            iArr = iArr12;
                            f0Var6 = f0Var;
                        }
                        i37++;
                        f0VarArr = f0VarArr4;
                    }
                    f0VarArr2 = f0VarArr;
                    iArr3 = iArr;
                    qVarArr[i35] = e0Var2 == null ? null : new p139t2.q(0, e0Var2, new int[]{i38});
                } else {
                    f0VarArr2 = f0VarArr;
                    iArr3 = iArr;
                }
                i15 = 1;
            } else {
                f0VarArr2 = f0VarArr;
                iArr3 = iArr;
                i15 = 1;
            }
            i35 += i15;
            f0VarArr = f0VarArr2;
            iArr = iArr3;
            i34 = 3;
        }
        int i40 = l8.f2141a;
        HashMap map = new HashMap();
        int i41 = 0;
        while (true) {
            p018c2.f0[] f0VarArr5 = (p018c2.f0[]) l8.f2143c;
            if (i41 >= i40) {
                break;
            }
            p139t2.p.c(f0VarArr5[i41], iVar, map);
            i41++;
        }
        p139t2.p.c((p018c2.f0) l8.f2146f, iVar, map);
        for (int i42 = 0; i42 < i40; i42++) {
        }
        int i43 = l8.f2141a;
        for (int i44 = 0; i44 < i43; i44++) {
            p018c2.f0 f0Var7 = ((p018c2.f0[]) l8.f2143c)[i44];
            Map map2 = (Map) iVar.f16360e0.get(i44);
            if (map2 != null && map2.containsKey(f0Var7)) {
                Map map3 = (Map) iVar.f16360e0.get(i44);
                if (map3 != null) {
                }
                qVarArr[i44] = null;
            }
        }
        for (int i45 = 0; i45 < i32; i45++) {
            int i46 = ((int[]) l8.f2142b)[i45];
            if (iVar.f16361f0.get(i45) || iVar.f16439Q.contains(Integer.valueOf(i46))) {
                qVarArr[i45] = null;
            }
        }
        B4.V v6 = pVar.f16392d;
        InterfaceC0947f interfaceC0947f = pVar.f16401b;
        p151v2.a.i(interfaceC0947f);
        v6.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i47 = 0; i47 < qVarArr.length; i47 += i14) {
            p139t2.q qVar2 = qVarArr[i47];
            if (qVar2 != null) {
                i14 = 1;
                if (qVar2.f16398b.length > 1) {
                    C0164w c0164wC = AbstractC0167z.C();
                    c0164wC.a(new p139t2.a(0L, 0L));
                    arrayList.add(c0164wC);
                }
            } else {
                i14 = 1;
            }
            arrayList.add(null);
        }
        int length4 = qVarArr.length;
        long[][] jArr = new long[length4][];
        int i48 = 0;
        while (i48 < qVarArr.length) {
            p139t2.q qVar3 = qVarArr[i48];
            if (qVar3 == null) {
                jArr[i48] = new long[0];
                i13 = 1;
            } else {
                int[] iArr13 = qVar3.f16398b;
                jArr[i48] = new long[iArr13.length];
                int i49 = 0;
                while (i49 < iArr13.length) {
                    jArr[i48][i49] = qVar3.f16397a.f10344d[iArr13[i49]].f311y;
                    i49++;
                    qVar3 = qVar3;
                    iArr13 = iArr13;
                }
                i13 = 1;
                Arrays.sort(jArr[i48]);
            }
            i48 += i13;
        }
        int[] iArr14 = new int[length4];
        long[] jArr2 = new long[length4];
        for (int i50 = 0; i50 < length4; i50++) {
            long[] jArr3 = jArr[i50];
            jArr2[i50] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        p139t2.b.m(arrayList, jArr2);
        E3.J j = E3.J.f1999a;
        j.getClass();
        AbstractC0158p.a(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap(j);
        E3.G g3 = new E3.G();
        E3.H h6 = new E3.H();
        p113p3.f.e(treeMap.isEmpty());
        h6.f1996d = treeMap;
        h6.f1998f = g3;
        int i51 = 0;
        while (i51 < length4) {
            long[] jArr4 = jArr[i51];
            if (jArr4.length <= 1) {
                iVar2 = iVar;
                iArr2 = iArr6;
                l7 = l8;
            } else {
                int length5 = jArr4.length;
                double[] dArr = new double[length5];
                int i52 = 0;
                while (true) {
                    long[] jArr5 = jArr[i51];
                    iArr2 = iArr6;
                    double dLog = 0.0d;
                    if (i52 >= jArr5.length) {
                        break;
                    }
                    p139t2.i iVar3 = iVar;
                    E4.L l9 = l8;
                    long j3 = jArr5[i52];
                    if (j3 != -1) {
                        dLog = Math.log(j3);
                    }
                    dArr[i52] = dLog;
                    i52++;
                    l8 = l9;
                    iArr6 = iArr2;
                    iVar = iVar3;
                }
                iVar2 = iVar;
                l7 = l8;
                int i53 = 1;
                int i54 = length5 - 1;
                double d7 = dArr[i54] - dArr[0];
                int i55 = 0;
                while (i55 < i54) {
                    double d8 = dArr[i55];
                    int i56 = i55 + i53;
                    Double dValueOf = Double.valueOf(d7 == 0.0d ? 1.0d : (((d8 + dArr[i56]) * 0.5d) - dArr[0]) / d7);
                    Integer numValueOf = Integer.valueOf(i51);
                    TreeMap treeMap2 = h6.f1996d;
                    Collection collection = (Collection) treeMap2.get(dValueOf);
                    if (collection == null) {
                        List listC = h6.c();
                        if (!listC.add(numValueOf)) {
                            throw new AssertionError("New Collection violated the Collection spec");
                        }
                        i12 = 1;
                        h6.f1997e++;
                        treeMap2.put(dValueOf, listC);
                    } else {
                        i12 = 1;
                        if (collection.add(numValueOf)) {
                            h6.f1997e++;
                        }
                    }
                    i53 = i12;
                    i55 = i56;
                }
            }
            i51++;
            l8 = l7;
            length4 = length4;
            iArr6 = iArr2;
            iVar = iVar2;
        }
        p139t2.i iVar4 = iVar;
        int[][][] iArr15 = iArr6;
        E4.L l10 = l8;
        C0156n c0156n = h6.f2064b;
        if (c0156n == null) {
            c0156n = new C0156n(h6);
            h6.f2064b = c0156n;
        }
        AbstractC0167z abstractC0167zE = AbstractC0167z.E(c0156n);
        for (int i57 = 0; i57 < abstractC0167zE.size(); i57++) {
            int iIntValue = ((Integer) abstractC0167zE.get(i57)).intValue();
            int i58 = iArr14[iIntValue] + 1;
            iArr14[iIntValue] = i58;
            jArr2[iIntValue] = jArr[iIntValue][i58];
            p139t2.b.m(arrayList, jArr2);
        }
        for (int i59 = 0; i59 < qVarArr.length; i59++) {
            if (arrayList.get(i59) != null) {
                jArr2[i59] = jArr2[i59] * 2;
            }
        }
        p139t2.b.m(arrayList, jArr2);
        C0164w c0164wC2 = AbstractC0167z.C();
        for (int i60 = 0; i60 < arrayList.size(); i60++) {
            C0164w c0164w = (C0164w) arrayList.get(i60);
            c0164wC2.a(c0164w == null ? E3.L.f2000e : c0164w.d());
        }
        E3.L lD = c0164wC2.d();
        p139t2.c[] cVarArr = new p139t2.c[qVarArr.length];
        for (int i61 = 0; i61 < qVarArr.length; i61++) {
            p139t2.q qVar4 = qVarArr[i61];
            if (qVar4 != null) {
                int[] iArr16 = qVar4.f16398b;
                if (iArr16.length != 0) {
                    if (iArr16.length == 1) {
                        int i62 = iArr16[0];
                        int i63 = qVar4.f16399c;
                        bVar = new p139t2.r(qVar4.f16397a, new int[]{i62});
                    } else {
                        long j7 = 25000;
                        bVar = new p139t2.b(qVar4.f16397a, iArr16, qVar4.f16399c, interfaceC0947f, 10000, j7, j7, (AbstractC0167z) lD.get(i61));
                    }
                    cVarArr[i61] = bVar;
                }
            }
        }
        G0[] g0Arr = new G0[i32];
        int i64 = 0;
        while (i64 < i32) {
            p139t2.i iVar5 = iVar4;
            g0Arr[i64] = (iVar5.f16361f0.get(i64) || iVar5.f16439Q.contains(Integer.valueOf(((int[]) l10.f2142b)[i64])) || (((int[]) l10.f2142b)[i64] != -2 && cVarArr[i64] == null)) ? null : G0.f96b;
            i64++;
            iVar4 = iVar5;
        }
        if (iVar4.c0) {
            int i65 = -1;
            int i66 = -1;
            int i67 = 0;
            while (true) {
                if (i67 >= l10.f2141a) {
                    i10 = -1;
                    z8 = true;
                    break;
                }
                int i68 = ((int[]) l10.f2142b)[i67];
                p139t2.c cVar = cVarArr[i67];
                if (i68 != 1 && i68 != 2) {
                    i11 = 1;
                } else if (cVar != null) {
                    int[][] iArr17 = iArr15[i67];
                    int iB = ((p018c2.f0[]) l10.f2143c)[i67].b(cVar.f16302a);
                    int i69 = 0;
                    while (true) {
                        int[] iArr18 = cVar.f16304c;
                        if (i69 >= iArr18.length) {
                            i11 = 1;
                            if (i68 != 1) {
                                i10 = -1;
                                if (i65 == -1) {
                                    i65 = i67;
                                    break;
                                }
                                z8 = false;
                                break;
                            }
                            i10 = -1;
                            if (i66 == -1) {
                                i66 = i67;
                                break;
                            }
                            z8 = false;
                            break;
                        }
                        if ((iArr17[iB][iArr18[i69]] & 32) != 32) {
                            i11 = 1;
                            break;
                        }
                        i69++;
                    }
                } else {
                    i11 = 1;
                }
                i67 += i11;
            }
            if (((i66 == i10 || i65 == i10) ? false : true) & z8) {
                G0 g7 = new G0(true);
                g0Arr[i66] = g7;
                g0Arr[i65] = g7;
            }
        }
        Pair pairCreate = Pair.create(g0Arr, cVarArr);
        p139t2.c[] cVarArr2 = (p139t2.c[]) pairCreate.second;
        List[] listArr = new List[cVarArr2.length];
        for (int i70 = 0; i70 < cVarArr2.length; i70++) {
            p139t2.c cVar2 = cVarArr2[i70];
            if (cVar2 != null) {
                lI = AbstractC0167z.I(cVar2);
            } else {
                C0165x c0165x = AbstractC0167z.f2083b;
                lI = E3.L.f2000e;
            }
            listArr[i70] = lI;
        }
        C0164w c0164w2 = new C0164w();
        for (int i71 = 0; i71 < l10.f2141a; i71++) {
            p018c2.f0[] f0VarArr6 = (p018c2.f0[]) l10.f2143c;
            p018c2.f0 f0Var8 = f0VarArr6[i71];
            List list = listArr[i71];
            int i72 = 0;
            while (i72 < f0Var8.f10347a) {
                p018c2.e0 e0VarA3 = f0Var8.a(i72);
                int i73 = f0VarArr6[i71].a(i72).f10341a;
                int[] iArr19 = new int[i73];
                int i74 = 0;
                int i75 = 0;
                while (i74 < i73) {
                    if ((((int[][][]) l10.f2145e)[i71][i72][i74] & 7) != 4) {
                        i9 = 1;
                    } else {
                        i9 = 1;
                        iArr19[i75] = i74;
                        i75++;
                    }
                    i74 += i9;
                }
                int[] iArrCopyOf = Arrays.copyOf(iArr19, i75);
                List[] listArr2 = listArr;
                int iMin = 16;
                String str2 = null;
                int i76 = 0;
                boolean z9 = false;
                int i77 = 0;
                while (i76 < iArrCopyOf.length) {
                    p018c2.f0 f0Var9 = f0Var8;
                    String str3 = f0VarArr6[i71].a(i72).f10344d[iArrCopyOf[i76]].f283C;
                    int i78 = i77 + 1;
                    if (i77 == 0) {
                        str2 = str3;
                    } else {
                        z9 = (!p151v2.t.a(str2, str3)) | z9;
                    }
                    iMin = Math.min(iMin, ((int[][][]) l10.f2145e)[i71][i72][i76] & 24);
                    i76++;
                    f0Var8 = f0Var9;
                    i77 = i78;
                }
                p018c2.f0 f0Var10 = f0Var8;
                if (z9) {
                    iMin = Math.min(iMin, ((int[]) l10.f2144d)[i71]);
                }
                boolean z10 = iMin != 0;
                int i79 = e0VarA3.f10341a;
                int[] iArr20 = new int[i79];
                boolean[] zArr = new boolean[i79];
                int i80 = 0;
                while (i80 < e0VarA3.f10341a) {
                    iArr20[i80] = ((int[][][]) l10.f2145e)[i71][i72][i80] & 7;
                    int i81 = 0;
                    while (true) {
                        if (i81 >= list.size()) {
                            i8 = 1;
                            z7 = false;
                            break;
                        }
                        p139t2.c cVar3 = (p139t2.c) list.get(i81);
                        if (cVar3.f16302a.equals(e0VarA3) && cVar3.h(i80) != -1) {
                            i8 = 1;
                            z7 = true;
                            break;
                        }
                        i81++;
                    }
                    zArr[i80] = z7;
                    i80 += i8;
                }
                c0164w2.b(new S0(e0VarA3, z10, iArr20, zArr));
                i72++;
                listArr = listArr2;
                f0Var8 = f0Var10;
            }
        }
        int i82 = 0;
        while (true) {
            p018c2.f0 f0Var11 = (p018c2.f0) l10.f2146f;
            if (i82 >= f0Var11.f10347a) {
                break;
            }
            p018c2.e0 e0VarA4 = f0Var11.a(i82);
            int[] iArr21 = new int[e0VarA4.f10341a];
            Arrays.fill(iArr21, 0);
            c0164w2.b(new S0(e0VarA4, false, iArr21, new boolean[e0VarA4.f10341a]));
            i82++;
        }
        p139t2.w wVar = new p139t2.w((G0[]) pairCreate.first, (p139t2.c[]) pairCreate.second, new T0(c0164w2.d()), l10);
        for (p139t2.c cVar4 : wVar.f16451c) {
            if (cVar4 != null) {
                cVar4.k(f7);
            }
        }
        return wVar;
    }

    public final void h() {
        Object obj = this.f448a;
        if (obj instanceof C0758d) {
            long j = this.f453f.f470d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            C0758d c0758d = (C0758d) obj;
            c0758d.f10320e = 0L;
            c0758d.f10321f = j;
        }
    }
}
