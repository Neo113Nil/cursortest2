package com.google.android.gms.internal.ads;

import a.AbstractC0444a;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import k0.C2023c;
import n.AbstractC2107A;
import r.C2342u;
import r.C2343v;
import u.AbstractC2445P;
import u.AbstractC2470q;
import u.C2471s;
import u.InterfaceC2477y;

/* renamed from: com.google.android.gms.internal.ads.Dh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0580Dh implements u.D0 {

    /* renamed from: k, reason: collision with root package name */
    public final int f8326k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f8327l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f8328m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f8329n;

    /* renamed from: o, reason: collision with root package name */
    public Serializable f8330o;

    /* renamed from: p, reason: collision with root package name */
    public Serializable f8331p;

    /* renamed from: q, reason: collision with root package name */
    public Object f8332q;

    /* renamed from: r, reason: collision with root package name */
    public Object f8333r;

    /* renamed from: s, reason: collision with root package name */
    public Object f8334s;

    /* renamed from: t, reason: collision with root package name */
    public Object f8335t;

    /* renamed from: u, reason: collision with root package name */
    public Object f8336u;

    /* renamed from: v, reason: collision with root package name */
    public Object f8337v;

    /* renamed from: w, reason: collision with root package name */
    public Object f8338w;

    public C0580Dh(Gr gr, U2.a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, AD ad, T2.I i, String str2, Op op, Wq wq, Ci ci, int i5) {
        this.f8327l = gr;
        this.f8328m = aVar;
        this.f8329n = applicationInfo;
        this.f8330o = str;
        this.f8332q = arrayList;
        this.f8333r = packageInfo;
        this.f8334s = ad;
        this.f8331p = str2;
        this.f8335t = op;
        this.f8336u = i;
        this.f8337v = wq;
        this.f8338w = ci;
        this.f8326k = i5;
    }

    public int a(int i) {
        int i5;
        C2342u c2342u = (C2342u) this.f8327l;
        int i6 = c2342u.f19051b;
        int i7 = 0;
        if (i6 < 0) {
            AbstractC2445P.a("fromIndex(0) > toIndex(" + i6 + ')');
        }
        if (i6 > c2342u.f19051b) {
            throw new IndexOutOfBoundsException(AbstractC2107A.q("Index out of range: ", i6));
        }
        int i8 = i6 - 1;
        while (true) {
            if (i7 <= i8) {
                i5 = (i7 + i8) >>> 1;
                int c5 = c2342u.c(i5);
                if (c5 >= i) {
                    if (c5 <= i) {
                        break;
                    }
                    i8 = i5 - 1;
                } else {
                    i7 = i5 + 1;
                }
            } else {
                i5 = -(i7 + 1);
                break;
            }
        }
        return i5 < -1 ? -(i5 + 2) : i5;
    }

    @Override // u.C0
    public /* synthetic */ boolean b() {
        return false;
    }

    public float c(int i, int i5, boolean z3) {
        InterfaceC2477y interfaceC2477y;
        float f;
        C2342u c2342u = (C2342u) this.f8327l;
        if (i >= c2342u.f19051b - 1) {
            f = i5;
        } else {
            int c5 = c2342u.c(i);
            int c6 = c2342u.c(i + 1);
            if (i5 == c5) {
                f = c5;
            } else {
                int i6 = c6 - c5;
                u.F0 f02 = (u.F0) ((C2343v) this.f8328m).b(c5);
                if (f02 == null || (interfaceC2477y = f02.f19671b) == null) {
                    interfaceC2477y = (A0.o1) this.f8329n;
                }
                float f5 = i6;
                float a5 = interfaceC2477y.a((i5 - c5) / f5);
                if (z3) {
                    return a5;
                }
                f = (f5 * a5) + c5;
            }
        }
        return f / 1000;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [float[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [int[], java.io.Serializable] */
    public void d(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        float[] fArr;
        float[] fArr2;
        boolean z3 = ((C2023c) this.f8338w) != null;
        AbstractC2470q abstractC2470q4 = (AbstractC2470q) this.f8332q;
        C2343v c2343v = (C2343v) this.f8328m;
        C2342u c2342u = (C2342u) this.f8327l;
        if (abstractC2470q4 == null) {
            this.f8332q = abstractC2470q.c();
            this.f8333r = abstractC2470q3.c();
            int i = c2342u.f19051b;
            ?? r22 = new float[i];
            for (int i5 = 0; i5 < i; i5++) {
                r22[i5] = c2342u.c(i5) / 1000;
            }
            this.f8331p = r22;
            int i6 = c2342u.f19051b;
            ?? r23 = new int[i6];
            for (int i7 = 0; i7 < i6; i7++) {
                r23[i7] = 0;
            }
            this.f8330o = r23;
        }
        if (z3) {
            if (((C2023c) this.f8338w) != null) {
                AbstractC2470q abstractC2470q5 = (AbstractC2470q) this.f8334s;
                if (abstractC2470q5 == null) {
                    kotlin.jvm.internal.l.k("lastInitialValue");
                    throw null;
                }
                if (abstractC2470q5.equals(abstractC2470q)) {
                    AbstractC2470q abstractC2470q6 = (AbstractC2470q) this.f8335t;
                    if (abstractC2470q6 == null) {
                        kotlin.jvm.internal.l.k("lastTargetValue");
                        throw null;
                    }
                    if (abstractC2470q6.equals(abstractC2470q2)) {
                        return;
                    }
                }
            }
            this.f8334s = abstractC2470q;
            this.f8335t = abstractC2470q2;
            int b3 = abstractC2470q.b() + (abstractC2470q.b() % 2);
            this.f8336u = new float[b3];
            this.f8337v = new float[b3];
            int i8 = c2342u.f19051b;
            float[][] fArr3 = new float[i8][];
            for (int i9 = 0; i9 < i8; i9++) {
                int c5 = c2342u.c(i9);
                if (c5 != 0) {
                    if (c5 != this.f8326k) {
                        fArr = new float[b3];
                        Object b5 = c2343v.b(c5);
                        kotlin.jvm.internal.l.c(b5);
                        u.F0 f02 = (u.F0) b5;
                        for (int i10 = 0; i10 < b3; i10++) {
                            fArr[i10] = f02.f19670a.a(i10);
                        }
                    } else if (c2343v.a(c5)) {
                        fArr = new float[b3];
                        Object b6 = c2343v.b(c5);
                        kotlin.jvm.internal.l.c(b6);
                        u.F0 f03 = (u.F0) b6;
                        for (int i11 = 0; i11 < b3; i11++) {
                            fArr[i11] = f03.f19670a.a(i11);
                        }
                    } else {
                        fArr2 = new float[b3];
                        for (int i12 = 0; i12 < b3; i12++) {
                            fArr2[i12] = abstractC2470q2.a(i12);
                        }
                    }
                    fArr2 = fArr;
                } else if (c2343v.a(c5)) {
                    fArr = new float[b3];
                    Object b7 = c2343v.b(c5);
                    kotlin.jvm.internal.l.c(b7);
                    u.F0 f04 = (u.F0) b7;
                    for (int i13 = 0; i13 < b3; i13++) {
                        fArr[i13] = f04.f19670a.a(i13);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[b3];
                    for (int i14 = 0; i14 < b3; i14++) {
                        fArr2[i14] = abstractC2470q.a(i14);
                    }
                }
                fArr3[i9] = fArr2;
            }
            int[] iArr = (int[]) this.f8330o;
            if (iArr == null) {
                kotlin.jvm.internal.l.k("modes");
                throw null;
            }
            float[] fArr4 = (float[]) this.f8331p;
            if (fArr4 == null) {
                kotlin.jvm.internal.l.k("times");
                throw null;
            }
            this.f8338w = new C2023c(iArr, fArr4, fArr3);
        }
    }

    public Cr e(Bundle bundle) {
        ((Ci) this.f8338w).i();
        return new C1324n6((Gr) this.f8327l, Dr.f8388l, null, Gr.f9278d, Collections.EMPTY_LIST, ((Op) this.f8335t).a(new C0572Ch(new Bundle(), new Bundle()), bundle, this.f8326k == 2)).a();
    }

    public Cr f() {
        int i = 0;
        Bundle bundle = new Bundle();
        if (((Boolean) Q2.r.f5053d.f5056c.a(F7.f8805b2)).booleanValue()) {
            Bundle bundle2 = ((Wq) this.f8337v).f12111s;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        Cr e3 = e(bundle);
        Dr dr = Dr.f8389m;
        E3.a[] aVarArr = {e3, (E3.a) ((AD) this.f8334s).d()};
        Gr gr = (Gr) this.f8327l;
        gr.getClass();
        List asList = Arrays.asList(aVarArr);
        CallableC0564Bh callableC0564Bh = new CallableC0564Bh(this, e3, bundle, i);
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        asList.getClass();
        AbstractC1044gv l5 = AbstractC1044gv.l(asList);
        CallableC1819y7 callableC1819y7 = new CallableC1819y7(6);
        C0606Hd c0606Hd = AbstractC0613Id.f9544g;
        Dw dw = new Dw(l5, true, false);
        dw.f8420z = new Cw(dw, callableC1819y7, c0606Hd);
        dw.w();
        Dw dw2 = new Dw(l5, true, false);
        dw2.f8420z = new Cw(dw2, callableC0564Bh, gr.f9279a);
        dw2.w();
        return new C1324n6(gr, dr, null, dw, asList, dw2).a();
    }

    @Override // u.C0
    public AbstractC2470q g(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        int i;
        Throwable th;
        int i5;
        boolean z3;
        int i6;
        AbstractC2470q abstractC2470q4 = abstractC2470q;
        AbstractC2470q abstractC2470q5 = abstractC2470q2;
        boolean z5 = true;
        int i7 = 0;
        int i8 = this.f8326k;
        int u5 = (int) AbstractC0444a.u((j5 / 1000000) - 0, 0L, i8);
        C2343v c2343v = (C2343v) this.f8328m;
        if (c2343v.a(u5)) {
            Object b3 = c2343v.b(u5);
            kotlin.jvm.internal.l.c(b3);
            return ((u.F0) b3).f19670a;
        }
        if (u5 >= i8) {
            return abstractC2470q5;
        }
        if (u5 <= 0) {
            return abstractC2470q4;
        }
        d(abstractC2470q4, abstractC2470q5, abstractC2470q3);
        if (((C2023c) this.f8338w) == null) {
            int a5 = a(u5);
            float c5 = c(a5, u5, true);
            C2342u c2342u = (C2342u) this.f8327l;
            int c6 = c2342u.c(a5);
            if (c2343v.a(c6)) {
                Object b5 = c2343v.b(c6);
                kotlin.jvm.internal.l.c(b5);
                abstractC2470q4 = ((u.F0) b5).f19670a;
            }
            int c7 = c2342u.c(a5 + 1);
            if (c2343v.a(c7)) {
                Object b6 = c2343v.b(c7);
                kotlin.jvm.internal.l.c(b6);
                abstractC2470q5 = ((u.F0) b6).f19670a;
            }
            AbstractC2470q abstractC2470q6 = (AbstractC2470q) this.f8332q;
            if (abstractC2470q6 == null) {
                kotlin.jvm.internal.l.k("valueVector");
                throw null;
            }
            int b7 = abstractC2470q6.b();
            for (int i9 = 0; i9 < b7; i9++) {
                AbstractC2470q abstractC2470q7 = (AbstractC2470q) this.f8332q;
                if (abstractC2470q7 == null) {
                    kotlin.jvm.internal.l.k("valueVector");
                    throw null;
                }
                float a6 = abstractC2470q4.a(i9);
                float a7 = abstractC2470q5.a(i9);
                u.A0 a02 = u.B0.f19645a;
                abstractC2470q7.e(i9, (a7 * c5) + ((1 - c5) * a6));
            }
            AbstractC2470q abstractC2470q8 = (AbstractC2470q) this.f8332q;
            if (abstractC2470q8 != null) {
                return abstractC2470q8;
            }
            kotlin.jvm.internal.l.k("valueVector");
            throw null;
        }
        float c8 = c(a(u5), u5, false);
        C2023c c2023c = (C2023c) this.f8338w;
        if (c2023c == null) {
            kotlin.jvm.internal.l.k("arcSpline");
            throw null;
        }
        float[] fArr = (float[]) this.f8336u;
        if (fArr == null) {
            kotlin.jvm.internal.l.k("posArray");
            throw null;
        }
        C2471s[][] c2471sArr = (C2471s[][]) c2023c.f17544l;
        float f = c2471sArr[0][0].f19915a;
        if (c8 >= f && c8 <= c2471sArr[c2471sArr.length - 1][0].f19916b) {
            int length = c2471sArr.length;
            int i10 = 0;
            boolean z6 = false;
            while (true) {
                if (i10 >= length) {
                    i = i7;
                    th = null;
                    break;
                }
                int i11 = i7;
                int i12 = i11;
                while (i11 < fArr.length) {
                    C2471s c2471s = c2471sArr[i10][i12];
                    if (c8 <= c2471s.f19916b) {
                        if (c2471s.f19930r) {
                            float f5 = c2471s.f19915a;
                            i6 = i7;
                            float f6 = c2471s.f19923k;
                            float f7 = c2471s.f19919e;
                            z3 = z5;
                            float f8 = c2471s.f19917c;
                            fArr[i11] = ((f7 - f8) * (c8 - f5) * f6) + f8;
                            float f9 = (c8 - f5) * f6;
                            float f10 = c2471s.f;
                            float f11 = c2471s.f19918d;
                            fArr[i11 + 1] = ((f10 - f11) * f9) + f11;
                        } else {
                            z3 = z5;
                            i6 = i7;
                            c2471s.c(c8);
                            C2471s c2471s2 = c2471sArr[i10][i12];
                            fArr[i11] = (c2471s2.f19924l * c2471s2.f19921h) + c2471s2.f19926n;
                            fArr[i11 + 1] = (c2471s2.f19925m * c2471s2.i) + c2471s2.f19927o;
                        }
                        z6 = z3;
                    } else {
                        z3 = z5;
                        i6 = i7;
                    }
                    i11 += 2;
                    i12++;
                    i7 = i6;
                    z5 = z3;
                }
                boolean z7 = z5;
                i = i7;
                th = null;
                if (z6) {
                    break;
                }
                i10++;
                i7 = i;
                z5 = z7;
            }
        } else {
            i = 0;
            th = null;
            if (c8 > c2471sArr[c2471sArr.length - 1][0].f19916b) {
                i5 = c2471sArr.length - 1;
                f = c2471sArr[c2471sArr.length - 1][0].f19916b;
            } else {
                i5 = 0;
            }
            float f12 = c8 - f;
            int i13 = 0;
            int i14 = 0;
            while (i13 < fArr.length) {
                C2471s c2471s3 = c2471sArr[i5][i14];
                if (c2471s3.f19930r) {
                    float f13 = c2471s3.f19915a;
                    float f14 = c2471s3.f19923k;
                    float f15 = c2471s3.f19919e;
                    float f16 = c2471s3.f19917c;
                    fArr[i13] = (c2471s3.f19926n * f12) + ((f15 - f16) * (f - f13) * f14) + f16;
                    float f17 = (f - f13) * f14;
                    float f18 = c2471s3.f;
                    float f19 = c2471s3.f19918d;
                    fArr[i13 + 1] = (c2471s3.f19927o * f12) + ((f18 - f19) * f17) + f19;
                } else {
                    c2471s3.c(f);
                    C2471s c2471s4 = c2471sArr[i5][i14];
                    fArr[i13] = (c2471s4.a() * f12) + (c2471s4.f19924l * c2471s4.f19921h) + c2471s4.f19926n;
                    C2471s c2471s5 = c2471sArr[i5][i14];
                    fArr[i13 + 1] = (c2471s5.b() * f12) + (c2471s5.f19925m * c2471s5.i) + c2471s5.f19927o;
                }
                i13 += 2;
                i14++;
            }
        }
        float[] fArr2 = (float[]) this.f8336u;
        if (fArr2 == null) {
            kotlin.jvm.internal.l.k("posArray");
            throw th;
        }
        int length2 = fArr2.length;
        for (int i15 = i; i15 < length2; i15++) {
            AbstractC2470q abstractC2470q9 = (AbstractC2470q) this.f8332q;
            if (abstractC2470q9 == null) {
                kotlin.jvm.internal.l.k("valueVector");
                throw th;
            }
            float[] fArr3 = (float[]) this.f8336u;
            if (fArr3 == null) {
                kotlin.jvm.internal.l.k("posArray");
                throw th;
            }
            abstractC2470q9.e(i15, fArr3[i15]);
        }
        AbstractC2470q abstractC2470q10 = (AbstractC2470q) this.f8332q;
        if (abstractC2470q10 != null) {
            return abstractC2470q10;
        }
        kotlin.jvm.internal.l.k("valueVector");
        throw th;
    }

    @Override // u.D0
    public int l() {
        return 0;
    }

    @Override // u.C0
    public long m(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return n() * 1000000;
    }

    @Override // u.D0
    public int n() {
        return this.f8326k;
    }

    @Override // u.C0
    public AbstractC2470q p(long j5, AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        int i = 0;
        long u5 = AbstractC0444a.u((j5 / 1000000) - 0, 0L, this.f8326k);
        if (u5 < 0) {
            return abstractC2470q3;
        }
        d(abstractC2470q, abstractC2470q2, abstractC2470q3);
        if (((C2023c) this.f8338w) == null) {
            AbstractC2470q g5 = g((u5 - 1) * 1000000, abstractC2470q, abstractC2470q2, abstractC2470q3);
            AbstractC2470q g6 = g(u5 * 1000000, abstractC2470q, abstractC2470q2, abstractC2470q3);
            int b3 = g5.b();
            while (i < b3) {
                AbstractC2470q abstractC2470q4 = (AbstractC2470q) this.f8333r;
                if (abstractC2470q4 == null) {
                    kotlin.jvm.internal.l.k("velocityVector");
                    throw null;
                }
                abstractC2470q4.e(i, (g5.a(i) - g6.a(i)) * 1000.0f);
                i++;
            }
            AbstractC2470q abstractC2470q5 = (AbstractC2470q) this.f8333r;
            if (abstractC2470q5 != null) {
                return abstractC2470q5;
            }
            kotlin.jvm.internal.l.k("velocityVector");
            throw null;
        }
        int i5 = (int) u5;
        float c5 = c(a(i5), i5, false);
        C2023c c2023c = (C2023c) this.f8338w;
        if (c2023c == null) {
            kotlin.jvm.internal.l.k("arcSpline");
            throw null;
        }
        float[] fArr = (float[]) this.f8337v;
        if (fArr == null) {
            kotlin.jvm.internal.l.k("slopeArray");
            throw null;
        }
        C2471s[][] c2471sArr = (C2471s[][]) c2023c.f17544l;
        float f = c2471sArr[0][0].f19915a;
        if (c5 < f) {
            c5 = f;
        } else if (c5 > c2471sArr[c2471sArr.length - 1][0].f19916b) {
            c5 = c2471sArr[c2471sArr.length - 1][0].f19916b;
        }
        int length = c2471sArr.length;
        boolean z3 = false;
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = 0;
            int i8 = 0;
            while (i7 < fArr.length) {
                C2471s c2471s = c2471sArr[i6][i8];
                if (c5 <= c2471s.f19916b) {
                    if (c2471s.f19930r) {
                        fArr[i7] = c2471s.f19926n;
                        fArr[i7 + 1] = c2471s.f19927o;
                    } else {
                        c2471s.c(c5);
                        fArr[i7] = c2471sArr[i6][i8].a();
                        fArr[i7 + 1] = c2471sArr[i6][i8].b();
                    }
                    z3 = true;
                }
                i7 += 2;
                i8++;
            }
            if (z3) {
                break;
            }
        }
        float[] fArr2 = (float[]) this.f8337v;
        if (fArr2 == null) {
            kotlin.jvm.internal.l.k("slopeArray");
            throw null;
        }
        int length2 = fArr2.length;
        while (i < length2) {
            AbstractC2470q abstractC2470q6 = (AbstractC2470q) this.f8333r;
            if (abstractC2470q6 == null) {
                kotlin.jvm.internal.l.k("velocityVector");
                throw null;
            }
            float[] fArr3 = (float[]) this.f8337v;
            if (fArr3 == null) {
                kotlin.jvm.internal.l.k("slopeArray");
                throw null;
            }
            abstractC2470q6.e(i, fArr3[i]);
            i++;
        }
        AbstractC2470q abstractC2470q7 = (AbstractC2470q) this.f8333r;
        if (abstractC2470q7 != null) {
            return abstractC2470q7;
        }
        kotlin.jvm.internal.l.k("velocityVector");
        throw null;
    }

    @Override // u.C0
    public AbstractC2470q r(AbstractC2470q abstractC2470q, AbstractC2470q abstractC2470q2, AbstractC2470q abstractC2470q3) {
        return p(m(abstractC2470q, abstractC2470q2, abstractC2470q3), abstractC2470q, abstractC2470q2, abstractC2470q3);
    }

    public C0580Dh(C2342u c2342u, C2343v c2343v, int i, A0.o1 o1Var) {
        this.f8327l = c2342u;
        this.f8328m = c2343v;
        this.f8326k = i;
        this.f8329n = o1Var;
    }
}
