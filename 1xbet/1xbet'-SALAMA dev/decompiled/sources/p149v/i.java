package p149v;

import java.util.ArrayList;
import java.util.HashMap;
import p136t.b;
import p136t.c;
import p136t.e;
import p136t.f;

/* JADX INFO: loaded from: classes.dex */
public final class i extends e {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f17055u0 = -1.0f;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f17056v0 = -1;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f17057w0 = -1;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public c f17058x0 = this.f16933K;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f17059y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f17060z0;

    public i() {
        this.f16941S.clear();
        this.f16941S.add(this.f17058x0);
        int length = this.f16940R.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f16940R[i7] = this.f17058x0;
        }
    }

    @Override // p149v.e
    public final boolean B() {
        return this.f17060z0;
    }

    @Override // p149v.e
    public final boolean C() {
        return this.f17060z0;
    }

    @Override // p149v.e
    public final void R(c cVar, boolean z4) {
        if (this.f16944V == null) {
            return;
        }
        c cVar2 = this.f17058x0;
        cVar.getClass();
        int iN = c.n(cVar2);
        if (this.f17059y0 == 1) {
            this.f16950a0 = iN;
            this.f16952b0 = 0;
            M(this.f16944V.l());
            P(0);
            return;
        }
        this.f16950a0 = 0;
        this.f16952b0 = iN;
        P(this.f16944V.r());
        M(0);
    }

    public final void S(int i7) {
        this.f17058x0.l(i7);
        this.f17060z0 = true;
    }

    public final void T(int i7) {
        if (this.f17059y0 == i7) {
            return;
        }
        this.f17059y0 = i7;
        ArrayList arrayList = this.f16941S;
        arrayList.clear();
        if (this.f17059y0 == 1) {
            this.f17058x0 = this.f16932J;
        } else {
            this.f17058x0 = this.f16933K;
        }
        arrayList.add(this.f17058x0);
        c[] cVarArr = this.f16940R;
        int length = cVarArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            cVarArr[i8] = this.f17058x0;
        }
    }

    @Override // p149v.e
    public final void b(c cVar, boolean z4) {
        f fVar = (f) this.f16944V;
        if (fVar == null) {
            return;
        }
        Object objJ = fVar.j(2);
        Object objJ2 = fVar.j(4);
        e eVar = this.f16944V;
        d dVar = d.f16919b;
        boolean z7 = eVar != null && eVar.f16943U[0] == dVar;
        if (this.f17059y0 == 0) {
            objJ = fVar.j(3);
            objJ2 = fVar.j(5);
            e eVar2 = this.f16944V;
            z7 = eVar2 != null && eVar2.f16943U[1] == dVar;
        }
        if (this.f17060z0) {
            c cVar2 = this.f17058x0;
            if (cVar2.f16911c) {
                f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.f17058x0.d());
                if (this.f17056v0 != -1) {
                    if (z7) {
                        cVar.f(cVar.k(objJ2), fVarK, 0, 5);
                    }
                } else if (this.f17057w0 != -1 && z7) {
                    f fVarK2 = cVar.k(objJ2);
                    cVar.f(fVarK, cVar.k(objJ), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.f17060z0 = false;
                return;
            }
        }
        if (this.f17056v0 != -1) {
            f fVarK3 = cVar.k(this.f17058x0);
            cVar.e(fVarK3, cVar.k(objJ), this.f17056v0, 8);
            if (z7) {
                cVar.f(cVar.k(objJ2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f17057w0 != -1) {
            f fVarK4 = cVar.k(this.f17058x0);
            f fVarK5 = cVar.k(objJ2);
            cVar.e(fVarK4, fVarK5, -this.f17057w0, 8);
            if (z7) {
                cVar.f(fVarK4, cVar.k(objJ), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f17055u0 != -1.0f) {
            f fVarK6 = cVar.k(this.f17058x0);
            f fVarK7 = cVar.k(objJ2);
            float f7 = this.f17055u0;
            b bVarL = cVar.l();
            bVarL.f16232d.g(fVarK6, -1.0f);
            bVarL.f16232d.g(fVarK7, f7);
            cVar.c(bVarL);
        }
    }

    @Override // p149v.e
    public final boolean c() {
        return true;
    }

    @Override // p149v.e
    public final void g(e eVar, HashMap map) {
        super.g(eVar, map);
        i iVar = (i) eVar;
        this.f17055u0 = iVar.f17055u0;
        this.f17056v0 = iVar.f17056v0;
        this.f17057w0 = iVar.f17057w0;
        T(iVar.f17059y0);
    }

    @Override // p149v.e
    public final c j(int i7) {
        int iE = e.e(i7);
        if (iE != 1) {
            if (iE != 2) {
                if (iE != 3) {
                    if (iE != 4) {
                        return null;
                    }
                }
            }
            if (this.f17059y0 == 0) {
                return this.f17058x0;
            }
            return null;
        }
        if (this.f17059y0 == 1) {
            return this.f17058x0;
        }
        return null;
    }
}
