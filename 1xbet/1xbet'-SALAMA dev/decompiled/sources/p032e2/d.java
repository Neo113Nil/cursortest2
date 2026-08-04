package p032e2;

import A1.X;
import E4.y;
import F1.k;
import F1.m;
import F1.s;
import F1.v;
import android.util.SparseArray;
import p151v2.a;

/* JADX INFO: loaded from: classes.dex */
public final class d implements m {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final y f12589A = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X f12592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseArray f12593d = new SparseArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f12594e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public p028d6.k f12595f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f12596x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public s f12597y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public X[] f12598z;

    public d(k kVar, int i7, X x4) {
        this.f12590a = kVar;
        this.f12591b = i7;
        this.f12592c = x4;
    }

    public final void a(p028d6.k kVar, long j, long j3) {
        this.f12595f = kVar;
        this.f12596x = j3;
        boolean z4 = this.f12594e;
        k kVar2 = this.f12590a;
        if (!z4) {
            kVar2.e(this);
            if (j != -9223372036854775807L) {
                kVar2.g(0L, j);
            }
            this.f12594e = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        kVar2.g(0L, j);
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f12593d;
            if (i7 >= sparseArray.size()) {
                return;
            }
            c cVar = (c) sparseArray.valueAt(i7);
            if (kVar == null) {
                cVar.f12587e = cVar.f12585c;
            } else {
                cVar.f12588f = j3;
                v vVarT = kVar.t(cVar.f12583a);
                cVar.f12587e = vVarT;
                X x4 = cVar.f12586d;
                if (x4 != null) {
                    vVarT.a(x4);
                }
            }
            i7++;
        }
    }

    @Override // F1.m
    public final void m(s sVar) {
        this.f12597y = sVar;
    }

    @Override // F1.m
    public final void n() {
        SparseArray sparseArray = this.f12593d;
        X[] xArr = new X[sparseArray.size()];
        for (int i7 = 0; i7 < sparseArray.size(); i7++) {
            X x4 = ((c) sparseArray.valueAt(i7)).f12586d;
            a.i(x4);
            xArr[i7] = x4;
        }
        this.f12598z = xArr;
    }

    @Override // F1.m
    public final v r(int i7, int i8) {
        SparseArray sparseArray = this.f12593d;
        c cVar = (c) sparseArray.get(i7);
        if (cVar == null) {
            a.h(this.f12598z == null);
            cVar = new c(i7, i8, i8 == this.f12591b ? this.f12592c : null);
            p028d6.k kVar = this.f12595f;
            long j = this.f12596x;
            if (kVar == null) {
                cVar.f12587e = cVar.f12585c;
            } else {
                cVar.f12588f = j;
                v vVarT = kVar.t(i8);
                cVar.f12587e = vVarT;
                X x4 = cVar.f12586d;
                if (x4 != null) {
                    vVarT.a(x4);
                }
            }
            sparseArray.put(i7, cVar);
        }
        return cVar;
    }
}
