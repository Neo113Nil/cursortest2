package p139t2;

import A1.AbstractC0023i;
import A1.X;
import E3.AbstractC0161t;
import E3.J;
import E3.K;
import E3.L;
import E3.T;
import android.text.TextUtils;
import p018c2.e0;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class f extends n implements Comparable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16312A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f16313B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16314C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f16315D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f16316E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f16317F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f16318G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final int f16319H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f16320I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final int f16321J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final int f16322K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final boolean f16323L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final boolean f16324M;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16326f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f16327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f16328y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f16329z;

    public f(int i7, e0 e0Var, int i8, i iVar, int i9, boolean z4, e eVar) {
        int i10;
        int iD;
        int iD2;
        boolean z7;
        super(i7, e0Var, i8);
        this.f16328y = iVar;
        this.f16327x = p.g(this.f16375d.f306c);
        int i11 = 0;
        this.f16329z = p.e(i9, false);
        int i12 = 0;
        while (true) {
            int size = iVar.f16427E.size();
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i12 >= size) {
                iD = 0;
                i12 = Integer.MAX_VALUE;
                break;
            } else {
                iD = p.d(this.f16375d, (String) iVar.f16427E.get(i12), false);
                if (iD > 0) {
                    break;
                } else {
                    i12++;
                }
            }
        }
        this.f16313B = i12;
        this.f16312A = iD;
        this.f16314C = p.b(this.f16375d.f308e, iVar.f16428F);
        X x4 = this.f16375d;
        int i13 = x4.f308e;
        this.f16315D = i13 == 0 || (i13 & 1) != 0;
        this.f16318G = (x4.f307d & 1) != 0;
        int i14 = x4.f296P;
        this.f16319H = i14;
        this.f16320I = x4.f297Q;
        int i15 = x4.f311y;
        this.f16321J = i15;
        this.f16326f = (i15 == -1 || i15 <= iVar.f16430H) && (i14 == -1 || i14 <= iVar.f16429G) && eVar.apply(x4);
        String[] strArrZ = t.z();
        int i16 = 0;
        while (true) {
            if (i16 >= strArrZ.length) {
                iD2 = 0;
                i16 = Integer.MAX_VALUE;
                break;
            } else {
                iD2 = p.d(this.f16375d, strArrZ[i16], false);
                if (iD2 > 0) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        this.f16316E = i16;
        this.f16317F = iD2;
        int i17 = 0;
        while (true) {
            L l7 = iVar.f16431I;
            if (i17 < l7.size()) {
                String str = this.f16375d.f283C;
                if (str != null && str.equals(l7.get(i17))) {
                    i10 = i17;
                    break;
                }
                i17++;
            } else {
                break;
            }
        }
        this.f16322K = i10;
        this.f16323L = AbstractC0023i.g(i9) == 128;
        this.f16324M = AbstractC0023i.h(i9) == 64;
        i iVar2 = this.f16328y;
        if (p.e(i9, iVar2.f16358b0) && ((z7 = this.f16326f) || iVar2.f16352V)) {
            i11 = (!p.e(i9, false) || !z7 || this.f16375d.f311y == -1 || iVar2.f16437O || iVar2.f16436N || (!iVar2.f16359d0 && z4)) ? 1 : 2;
        }
        this.f16325e = i11;
    }

    @Override // p139t2.n
    public final int a() {
        return this.f16325e;
    }

    @Override // p139t2.n
    public final boolean b(n nVar) {
        int i7;
        String str;
        int i8;
        f fVar = (f) nVar;
        i iVar = this.f16328y;
        boolean z4 = iVar.f16355Y;
        X x4 = fVar.f16375d;
        X x7 = this.f16375d;
        if ((z4 || ((i8 = x7.f296P) != -1 && i8 == x4.f296P)) && ((iVar.f16353W || ((str = x7.f283C) != null && TextUtils.equals(str, x4.f283C))) && (iVar.f16354X || ((i7 = x7.f297Q) != -1 && i7 == x4.f297Q)))) {
            if (!iVar.f16356Z) {
                if (this.f16323L != fVar.f16323L || this.f16324M != fVar.f16324M) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z4 = this.f16329z;
        boolean z7 = this.f16326f;
        K kA = (z7 && z4) ? p.f16390i : p.f16390i.a();
        AbstractC0161t abstractC0161tC = AbstractC0161t.f2068a.c(z4, fVar.f16329z);
        Integer numValueOf = Integer.valueOf(this.f16313B);
        Integer numValueOf2 = Integer.valueOf(fVar.f16313B);
        J.f1999a.getClass();
        T t7 = T.f2026a;
        AbstractC0161t abstractC0161tB = abstractC0161tC.b(numValueOf, numValueOf2, t7).a(this.f16312A, fVar.f16312A).a(this.f16314C, fVar.f16314C).c(this.f16318G, fVar.f16318G).c(this.f16315D, fVar.f16315D).b(Integer.valueOf(this.f16316E), Integer.valueOf(fVar.f16316E), t7).a(this.f16317F, fVar.f16317F).c(z7, fVar.f16326f).b(Integer.valueOf(this.f16322K), Integer.valueOf(fVar.f16322K), t7);
        int i7 = this.f16321J;
        Integer numValueOf3 = Integer.valueOf(i7);
        int i8 = fVar.f16321J;
        AbstractC0161t abstractC0161tB2 = abstractC0161tB.b(numValueOf3, Integer.valueOf(i8), this.f16328y.f16436N ? p.f16390i.a() : p.j).c(this.f16323L, fVar.f16323L).c(this.f16324M, fVar.f16324M).b(Integer.valueOf(this.f16319H), Integer.valueOf(fVar.f16319H), kA).b(Integer.valueOf(this.f16320I), Integer.valueOf(fVar.f16320I), kA);
        Integer numValueOf4 = Integer.valueOf(i7);
        Integer numValueOf5 = Integer.valueOf(i8);
        if (!t.a(this.f16327x, fVar.f16327x)) {
            kA = p.j;
        }
        return abstractC0161tB2.b(numValueOf4, numValueOf5, kA).e();
    }
}
