package t0;

import com.google.android.gms.internal.ads.Zk;
import h0.C1988b;
import java.util.ArrayList;
import java.util.List;
import r.AbstractC2339q;
import r.C2316B;
import r.C2338p;
import s.AbstractC2351a;
import x0.InterfaceC2637x;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.e0;
import z0.s0;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2411h extends i {

    /* renamed from: c, reason: collision with root package name */
    public final b0.o f19477c;

    /* renamed from: d, reason: collision with root package name */
    public final Zk f19478d;

    /* renamed from: e, reason: collision with root package name */
    public final C2338p f19479e;
    public e0 f;

    /* renamed from: g, reason: collision with root package name */
    public j f19480g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19481h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f19482j;

    public C2411h(b0.o oVar) {
        this.f19477c = oVar;
        Zk zk = new Zk();
        zk.f12513b = new long[2];
        this.f19478d = zk;
        this.f19479e = new C2338p(2);
        this.i = true;
        this.f19482j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r5v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r5v34, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    @Override // t0.i
    public final boolean a(C2338p c2338p, InterfaceC2637x interfaceC2637x, D3.l lVar, boolean z3) {
        C2338p c2338p2;
        Zk zk;
        Object obj;
        boolean z5;
        boolean z6;
        j jVar;
        int i;
        int i5;
        boolean z7;
        int i6;
        boolean z8;
        int i7;
        InterfaceC2637x interfaceC2637x2 = interfaceC2637x;
        boolean a5 = super.a(c2338p, interfaceC2637x, lVar, z3);
        AbstractC2756m abstractC2756m = this.f19477c;
        boolean z9 = true;
        if (abstractC2756m.f7175x) {
            ?? r8 = 0;
            while (abstractC2756m != 0) {
                if (abstractC2756m instanceof s0) {
                    this.f = AbstractC2749f.t((s0) abstractC2756m, 16);
                } else if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                    b0.o oVar = abstractC2756m.f21839z;
                    int i8 = 0;
                    abstractC2756m = abstractC2756m;
                    r8 = r8;
                    while (oVar != null) {
                        if ((oVar.f7164m & 16) != 0) {
                            i8++;
                            r8 = r8;
                            if (i8 == 1) {
                                abstractC2756m = oVar;
                            } else {
                                if (r8 == 0) {
                                    r8 = new R.e(new b0.o[16]);
                                }
                                if (abstractC2756m != 0) {
                                    r8.c(abstractC2756m);
                                    abstractC2756m = 0;
                                }
                                r8.c(oVar);
                            }
                        }
                        oVar = oVar.f7167p;
                        abstractC2756m = abstractC2756m;
                        r8 = r8;
                    }
                    if (i8 == 1) {
                    }
                }
                abstractC2756m = AbstractC2749f.f(r8);
            }
            if (this.f != null) {
                int j5 = c2338p.j();
                int i9 = 0;
                while (true) {
                    c2338p2 = this.f19479e;
                    zk = this.f19478d;
                    if (i9 >= j5) {
                        break;
                    }
                    long e3 = c2338p.e(i9);
                    s sVar = (s) c2338p.k(i9);
                    if (zk.b(e3)) {
                        boolean z10 = z9;
                        long j6 = sVar.f19505g;
                        if ((((j6 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            long j7 = sVar.f19502c;
                            if ((((j7 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                z8 = z10;
                                List list = sVar.f19508k;
                                List list2 = X3.v.f6090k;
                                if (list == null) {
                                    list = list2;
                                }
                                ArrayList arrayList = new ArrayList(list.size());
                                List list3 = sVar.f19508k;
                                if (list3 == null) {
                                    list3 = list2;
                                }
                                z7 = a5;
                                int size = list3.size();
                                i6 = j5;
                                int i10 = 0;
                                while (i10 < size) {
                                    int i11 = size;
                                    C2406c c2406c = (C2406c) list3.get(i10);
                                    long j8 = e3;
                                    long j9 = c2406c.f19463b;
                                    if ((((j9 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                        i7 = i10;
                                        e0 e0Var = this.f;
                                        kotlin.jvm.internal.l.c(e0Var);
                                        arrayList.add(new C2406c(c2406c.f19462a, e0Var.R0(interfaceC2637x2, j9), c2406c.f19464c));
                                    } else {
                                        i7 = i10;
                                    }
                                    i10 = i7 + 1;
                                    size = i11;
                                    e3 = j8;
                                }
                                long j10 = e3;
                                e0 e0Var2 = this.f;
                                kotlin.jvm.internal.l.c(e0Var2);
                                long R02 = e0Var2.R0(interfaceC2637x2, j6);
                                e0 e0Var3 = this.f;
                                kotlin.jvm.internal.l.c(e0Var3);
                                s sVar2 = new s(sVar.f19500a, sVar.f19501b, e0Var3.R0(interfaceC2637x2, j7), sVar.f19503d, sVar.f19504e, sVar.f, R02, sVar.f19506h, sVar.i, arrayList, sVar.f19507j, sVar.f19509l);
                                s sVar3 = sVar.f19512o;
                                if (sVar3 == null) {
                                    sVar3 = sVar;
                                }
                                sVar2.f19512o = sVar3;
                                s sVar4 = sVar.f19512o;
                                if (sVar4 != null) {
                                    sVar = sVar4;
                                }
                                sVar2.f19512o = sVar;
                                c2338p2.g(j10, sVar2);
                            }
                        }
                        z7 = a5;
                        i6 = j5;
                        z8 = z10;
                    } else {
                        z7 = a5;
                        i6 = j5;
                        z8 = z9;
                    }
                    i9++;
                    interfaceC2637x2 = interfaceC2637x;
                    z9 = z8;
                    a5 = z7;
                    j5 = i6;
                }
                boolean z11 = a5;
                boolean z12 = z9;
                if (c2338p2.j() == 0) {
                    zk.f12512a = 0;
                    this.f19483a.h();
                    return z12;
                }
                int i12 = zk.f12512a;
                while (true) {
                    i12--;
                    if (-1 >= i12) {
                        break;
                    }
                    long j11 = zk.f12513b[i12];
                    if (c2338p.f19029k) {
                        int i13 = c2338p.f19032n;
                        long[] jArr = c2338p.f19030l;
                        Object[] objArr = c2338p.f19031m;
                        int i14 = 0;
                        for (int i15 = 0; i15 < i13; i15++) {
                            Object obj2 = objArr[i15];
                            if (obj2 != AbstractC2339q.f19033a) {
                                if (i15 != i14) {
                                    jArr[i14] = jArr[i15];
                                    objArr[i14] = obj2;
                                    objArr[i15] = null;
                                }
                                i14++;
                            }
                        }
                        c2338p.f19029k = false;
                        c2338p.f19032n = i14;
                    }
                    if (AbstractC2351a.b(c2338p.f19030l, c2338p.f19032n, j11) < 0 && i12 < (i5 = zk.f12512a)) {
                        int i16 = i5 - 1;
                        int i17 = i12;
                        while (i17 < i16) {
                            long[] jArr2 = zk.f12513b;
                            int i18 = i17 + 1;
                            jArr2[i17] = jArr2[i18];
                            i17 = i18;
                        }
                        zk.f12512a--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(c2338p2.j());
                int j12 = c2338p2.j();
                for (int i19 = 0; i19 < j12; i19++) {
                    arrayList2.add(c2338p2.k(i19));
                }
                j jVar2 = new j(arrayList2, lVar);
                int size2 = arrayList2.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size2) {
                        obj = null;
                        break;
                    }
                    obj = arrayList2.get(i20);
                    if (lVar.a(((s) obj).f19500a)) {
                        break;
                    }
                    i20++;
                }
                s sVar5 = (s) obj;
                if (sVar5 != null) {
                    boolean z13 = sVar5.f19503d;
                    if (z3) {
                        z5 = false;
                        if (!this.i && (z13 || sVar5.f19506h)) {
                            e0 e0Var4 = this.f;
                            kotlin.jvm.internal.l.c(e0Var4);
                            long j13 = e0Var4.f20975m;
                            long j14 = sVar5.f19502c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j14 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j14 & 4294967295L));
                            int i21 = (int) (j13 >> 32);
                            this.i = !((intBitsToFloat2 > ((float) ((int) (j13 & 4294967295L))) ? z12 : false) | (intBitsToFloat2 < 0.0f ? z12 : false) | (intBitsToFloat > ((float) i21) ? z12 : false) | (intBitsToFloat < 0.0f ? z12 : false));
                        }
                    } else {
                        z5 = false;
                        this.i = false;
                    }
                    boolean z14 = this.i;
                    boolean z15 = this.f19481h;
                    if (z14 == z15 || !((i = jVar2.f19488d) == 3 || i == 4 || i == 5)) {
                        int i22 = jVar2.f19488d;
                        if (i22 == 4 && z15 && !this.f19482j) {
                            jVar2.f19488d = 3;
                        } else if (i22 == 5 && z14 && z13) {
                            jVar2.f19488d = 3;
                        }
                    } else {
                        jVar2.f19488d = z14 ? 4 : 5;
                    }
                } else {
                    z5 = false;
                }
                if (!z11 && jVar2.f19488d == 3 && (jVar = this.f19480g) != null) {
                    ?? r1 = jVar.f19485a;
                    int size3 = r1.size();
                    ?? r42 = jVar2.f19485a;
                    if (size3 == r42.size()) {
                        int size4 = r42.size();
                        for (?? r5 = z5; r5 < size4; r5++) {
                            if (C1988b.b(((s) r1.get(r5)).f19502c, ((s) r42.get(r5)).f19502c)) {
                            }
                        }
                        z6 = z5;
                        this.f19480g = jVar2;
                        return z6;
                    }
                }
                z6 = z12;
                this.f19480g = jVar2;
                return z6;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // t0.i
    public final void b(D3.l lVar) {
        super.b(lVar);
        j jVar = this.f19480g;
        if (jVar == null) {
            return;
        }
        this.f19481h = this.i;
        ?? r1 = jVar.f19485a;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            s sVar = (s) r1.get(i);
            boolean z3 = sVar.f19503d;
            long j5 = sVar.f19500a;
            boolean a5 = lVar.a(j5);
            boolean z5 = this.i;
            if ((!z3 && !a5) || (!z3 && !z5)) {
                this.f19478d.c(j5);
            }
        }
        this.i = false;
        this.f19482j = jVar.f19488d == 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [R.e] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [R.e] */
    public final void c() {
        R.e eVar = this.f19483a;
        Object[] objArr = eVar.f5106k;
        int i = eVar.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2411h) objArr[i5]).c();
        }
        AbstractC2756m abstractC2756m = this.f19477c;
        ?? r32 = 0;
        while (abstractC2756m != 0) {
            if (abstractC2756m instanceof s0) {
                ((s0) abstractC2756m).W();
            } else if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                b0.o oVar = abstractC2756m.f21839z;
                int i6 = 0;
                abstractC2756m = abstractC2756m;
                r32 = r32;
                while (oVar != null) {
                    if ((oVar.f7164m & 16) != 0) {
                        i6++;
                        r32 = r32;
                        if (i6 == 1) {
                            abstractC2756m = oVar;
                        } else {
                            if (r32 == 0) {
                                r32 = new R.e(new b0.o[16]);
                            }
                            if (abstractC2756m != 0) {
                                r32.c(abstractC2756m);
                                abstractC2756m = 0;
                            }
                            r32.c(oVar);
                        }
                    }
                    oVar = oVar.f7167p;
                    abstractC2756m = abstractC2756m;
                    r32 = r32;
                }
                if (i6 == 1) {
                }
            }
            abstractC2756m = AbstractC2749f.f(r32);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0092 A[LOOP:0: B:8:0x0090->B:9:0x0092, LOOP_END] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(D3.l lVar) {
        int i;
        int i5;
        C2338p c2338p = this.f19479e;
        boolean z3 = true;
        if (!(c2338p.j() == 0)) {
            b0.o oVar = this.f19477c;
            if (oVar.f7175x) {
                j jVar = this.f19480g;
                kotlin.jvm.internal.l.c(jVar);
                e0 e0Var = this.f;
                kotlin.jvm.internal.l.c(e0Var);
                long j5 = e0Var.f20975m;
                AbstractC2756m abstractC2756m = oVar;
                ?? r9 = 0;
                while (abstractC2756m != 0) {
                    if (abstractC2756m instanceof s0) {
                        ((s0) abstractC2756m).v(jVar, k.f19491m, j5);
                    } else if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                        b0.o oVar2 = abstractC2756m.f21839z;
                        int i6 = 0;
                        abstractC2756m = abstractC2756m;
                        r9 = r9;
                        while (oVar2 != null) {
                            if ((oVar2.f7164m & 16) != 0) {
                                i6++;
                                r9 = r9;
                                if (i6 == 1) {
                                    abstractC2756m = oVar2;
                                } else {
                                    if (r9 == 0) {
                                        r9 = new R.e(new b0.o[16]);
                                    }
                                    if (abstractC2756m != 0) {
                                        r9.c(abstractC2756m);
                                        abstractC2756m = 0;
                                    }
                                    r9.c(oVar2);
                                }
                            }
                            oVar2 = oVar2.f7167p;
                            abstractC2756m = abstractC2756m;
                            r9 = r9;
                        }
                        if (i6 == 1) {
                        }
                    }
                    abstractC2756m = AbstractC2749f.f(r9);
                }
                if (oVar.f7175x) {
                    R.e eVar = this.f19483a;
                    Object[] objArr = eVar.f5106k;
                    int i7 = eVar.f5108m;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((C2411h) objArr[i8]).d(lVar);
                    }
                }
                b(lVar);
                i = c2338p.f19032n;
                Object[] objArr2 = c2338p.f19031m;
                for (i5 = 0; i5 < i; i5++) {
                    objArr2[i5] = null;
                }
                c2338p.f19032n = 0;
                c2338p.f19029k = false;
                this.f = null;
                return z3;
            }
        }
        z3 = false;
        b(lVar);
        i = c2338p.f19032n;
        Object[] objArr22 = c2338p.f19031m;
        while (i5 < i) {
        }
        c2338p.f19032n = 0;
        c2338p.f19029k = false;
        this.f = null;
        return z3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r0v5, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v5, types: [R.e] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean e(D3.l lVar, boolean z3) {
        if (!(this.f19479e.j() == 0)) {
            AbstractC2756m abstractC2756m = this.f19477c;
            if (abstractC2756m.f7175x) {
                j jVar = this.f19480g;
                kotlin.jvm.internal.l.c(jVar);
                e0 e0Var = this.f;
                kotlin.jvm.internal.l.c(e0Var);
                long j5 = e0Var.f20975m;
                AbstractC2756m abstractC2756m2 = abstractC2756m;
                ?? r8 = 0;
                while (abstractC2756m2 != 0) {
                    if (abstractC2756m2 instanceof s0) {
                        ((s0) abstractC2756m2).v(jVar, k.f19489k, j5);
                    } else if ((abstractC2756m2.f7164m & 16) != 0 && (abstractC2756m2 instanceof AbstractC2756m)) {
                        b0.o oVar = abstractC2756m2.f21839z;
                        int i = 0;
                        abstractC2756m2 = abstractC2756m2;
                        r8 = r8;
                        while (oVar != null) {
                            if ((oVar.f7164m & 16) != 0) {
                                i++;
                                r8 = r8;
                                if (i == 1) {
                                    abstractC2756m2 = oVar;
                                } else {
                                    if (r8 == 0) {
                                        r8 = new R.e(new b0.o[16]);
                                    }
                                    if (abstractC2756m2 != 0) {
                                        r8.c(abstractC2756m2);
                                        abstractC2756m2 = 0;
                                    }
                                    r8.c(oVar);
                                }
                            }
                            oVar = oVar.f7167p;
                            abstractC2756m2 = abstractC2756m2;
                            r8 = r8;
                        }
                        if (i == 1) {
                        }
                    }
                    abstractC2756m2 = AbstractC2749f.f(r8);
                }
                if (abstractC2756m.f7175x) {
                    R.e eVar = this.f19483a;
                    Object[] objArr = eVar.f5106k;
                    int i5 = eVar.f5108m;
                    for (int i6 = 0; i6 < i5; i6++) {
                        C2411h c2411h = (C2411h) objArr[i6];
                        kotlin.jvm.internal.l.c(this.f);
                        c2411h.e(lVar, z3);
                    }
                }
                if (abstractC2756m.f7175x) {
                    ?? r14 = 0;
                    while (abstractC2756m != 0) {
                        if (abstractC2756m instanceof s0) {
                            ((s0) abstractC2756m).v(jVar, k.f19490l, j5);
                        } else if ((abstractC2756m.f7164m & 16) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                            b0.o oVar2 = abstractC2756m.f21839z;
                            int i7 = 0;
                            abstractC2756m = abstractC2756m;
                            r14 = r14;
                            while (oVar2 != null) {
                                if ((oVar2.f7164m & 16) != 0) {
                                    i7++;
                                    r14 = r14;
                                    if (i7 == 1) {
                                        abstractC2756m = oVar2;
                                    } else {
                                        if (r14 == 0) {
                                            r14 = new R.e(new b0.o[16]);
                                        }
                                        if (abstractC2756m != 0) {
                                            r14.c(abstractC2756m);
                                            abstractC2756m = 0;
                                        }
                                        r14.c(oVar2);
                                    }
                                }
                                oVar2 = oVar2.f7167p;
                                abstractC2756m = abstractC2756m;
                                r14 = r14;
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC2756m = AbstractC2749f.f(r14);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j5, C2316B c2316b) {
        Zk zk = this.f19478d;
        if (zk.b(j5) && c2316b.f(this) < 0) {
            zk.c(j5);
            this.f19479e.i(j5);
        }
        R.e eVar = this.f19483a;
        Object[] objArr = eVar.f5106k;
        int i = eVar.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            ((C2411h) objArr[i5]).f(j5, c2316b);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.f19477c + ", children=" + this.f19483a + ", pointerIds=" + this.f19478d + ')';
    }
}
