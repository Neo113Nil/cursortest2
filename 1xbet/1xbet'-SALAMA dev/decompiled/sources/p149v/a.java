package p149v;

import java.util.HashMap;
import p031e1.k;
import p136t.b;
import p136t.c;
import p136t.e;
import p136t.f;

/* JADX INFO: loaded from: classes.dex */
public final class a extends j {

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f16889w0 = 0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f16890x0 = true;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f16891y0 = 0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public boolean f16892z0 = false;

    @Override // p149v.e
    public final boolean B() {
        return this.f16892z0;
    }

    @Override // p149v.e
    public final boolean C() {
        return this.f16892z0;
    }

    public final boolean V() {
        int i7;
        int i8;
        int i9;
        boolean z4 = true;
        int i10 = 0;
        while (true) {
            i7 = this.f17062v0;
            if (i10 >= i7) {
                break;
            }
            e eVar = this.f17061u0[i10];
            if ((this.f16890x0 || eVar.c()) && ((((i8 = this.f16889w0) == 0 || i8 == 1) && !eVar.B()) || (((i9 = this.f16889w0) == 2 || i9 == 3) && !eVar.C()))) {
                z4 = false;
            }
            i10++;
        }
        if (!z4 || i7 <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z7 = false;
        for (int i11 = 0; i11 < this.f17062v0; i11++) {
            e eVar2 = this.f17061u0[i11];
            if (this.f16890x0 || eVar2.c()) {
                if (!z7) {
                    int i12 = this.f16889w0;
                    if (i12 == 0) {
                        iMax = eVar2.j(2).d();
                    } else if (i12 == 1) {
                        iMax = eVar2.j(4).d();
                    } else if (i12 == 2) {
                        iMax = eVar2.j(3).d();
                    } else if (i12 == 3) {
                        iMax = eVar2.j(5).d();
                    }
                    z7 = true;
                }
                int i13 = this.f16889w0;
                if (i13 == 0) {
                    iMax = Math.min(iMax, eVar2.j(2).d());
                } else if (i13 == 1) {
                    iMax = Math.max(iMax, eVar2.j(4).d());
                } else if (i13 == 2) {
                    iMax = Math.min(iMax, eVar2.j(3).d());
                } else if (i13 == 3) {
                    iMax = Math.max(iMax, eVar2.j(5).d());
                }
            }
        }
        int i14 = iMax + this.f16891y0;
        int i15 = this.f16889w0;
        if (i15 == 0 || i15 == 1) {
            K(i14, i14);
        } else {
            L(i14, i14);
        }
        this.f16892z0 = true;
        return true;
    }

    public final int W() {
        int i7 = this.f16889w0;
        if (i7 == 0 || i7 == 1) {
            return 0;
        }
        return (i7 == 2 || i7 == 3) ? 1 : -1;
    }

    @Override // p149v.e
    public final void b(c cVar, boolean z4) {
        boolean z7;
        int i7;
        c[] cVarArr = this.f16940R;
        c cVar2 = this.f16932J;
        cVarArr[0] = cVar2;
        c cVar3 = this.f16933K;
        int i8 = 2;
        cVarArr[2] = cVar3;
        c cVar4 = this.f16934L;
        cVarArr[1] = cVar4;
        c cVar5 = this.f16935M;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.f16917i = cVar.k(cVar6);
        }
        int i9 = this.f16889w0;
        if (i9 < 0 || i9 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i9];
        if (!this.f16892z0) {
            V();
        }
        if (this.f16892z0) {
            this.f16892z0 = false;
            int i10 = this.f16889w0;
            if (i10 == 0 || i10 == 1) {
                cVar.d(cVar2.f16917i, this.f16950a0);
                cVar.d(cVar4.f16917i, this.f16950a0);
                return;
            } else {
                if (i10 == 2 || i10 == 3) {
                    cVar.d(cVar3.f16917i, this.f16952b0);
                    cVar.d(cVar5.f16917i, this.f16952b0);
                    return;
                }
                return;
            }
        }
        int i11 = 0;
        while (true) {
            if (i11 >= this.f17062v0) {
                z7 = false;
                break;
            }
            e eVar = this.f17061u0[i11];
            if (this.f16890x0 || eVar.c()) {
                int i12 = this.f16889w0;
                d dVar = d.f16920c;
                if (((i12 == 0 || i12 == 1) && eVar.f16943U[0] == dVar && eVar.f16932J.f16914f != null && eVar.f16934L.f16914f != null) || ((i12 == 2 || i12 == 3) && eVar.f16943U[1] == dVar && eVar.f16933K.f16914f != null && eVar.f16935M.f16914f != null)) {
                    z7 = true;
                    break;
                }
            }
            i11++;
        }
        boolean z8 = cVar2.g() || cVar4.g();
        boolean z9 = cVar3.g() || cVar5.g();
        int i13 = (z7 || !(((i7 = this.f16889w0) == 0 && z8) || ((i7 == 2 && z9) || ((i7 == 1 && z8) || (i7 == 3 && z9))))) ? 4 : 5;
        int i14 = 0;
        while (i14 < this.f17062v0) {
            e eVar2 = this.f17061u0[i14];
            if (this.f16890x0 || eVar2.c()) {
                f fVarK = cVar.k(eVar2.f16940R[this.f16889w0]);
                int i15 = this.f16889w0;
                c cVar8 = eVar2.f16940R[i15];
                cVar8.f16917i = fVarK;
                c cVar9 = cVar8.f16914f;
                int i16 = (cVar9 == null || cVar9.f16912d != this) ? 0 : cVar8.f16915g;
                if (i15 == 0 || i15 == i8) {
                    f fVar = cVar7.f16917i;
                    int i17 = this.f16891y0 - i16;
                    b bVarL = cVar.l();
                    f fVarM = cVar.m();
                    fVarM.f16261d = 0;
                    bVarL.c(fVar, fVarK, fVarM, i17);
                    cVar.c(bVarL);
                } else {
                    f fVar2 = cVar7.f16917i;
                    int i18 = this.f16891y0 + i16;
                    b bVarL2 = cVar.l();
                    f fVarM2 = cVar.m();
                    fVarM2.f16261d = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i18);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.f16917i, fVarK, this.f16891y0 + i16, i13);
            }
            i14++;
            i8 = 2;
        }
        int i19 = this.f16889w0;
        if (i19 == 0) {
            cVar.e(cVar4.f16917i, cVar2.f16917i, 0, 8);
            cVar.e(cVar2.f16917i, this.f16944V.f16934L.f16917i, 0, 4);
            cVar.e(cVar2.f16917i, this.f16944V.f16932J.f16917i, 0, 0);
            return;
        }
        if (i19 == 1) {
            cVar.e(cVar2.f16917i, cVar4.f16917i, 0, 8);
            cVar.e(cVar2.f16917i, this.f16944V.f16932J.f16917i, 0, 4);
            cVar.e(cVar2.f16917i, this.f16944V.f16934L.f16917i, 0, 0);
        } else if (i19 == 2) {
            cVar.e(cVar5.f16917i, cVar3.f16917i, 0, 8);
            cVar.e(cVar3.f16917i, this.f16944V.f16935M.f16917i, 0, 4);
            cVar.e(cVar3.f16917i, this.f16944V.f16933K.f16917i, 0, 0);
        } else if (i19 == 3) {
            cVar.e(cVar3.f16917i, cVar5.f16917i, 0, 8);
            cVar.e(cVar3.f16917i, this.f16944V.f16933K.f16917i, 0, 4);
            cVar.e(cVar3.f16917i, this.f16944V.f16935M.f16917i, 0, 0);
        }
    }

    @Override // p149v.e
    public final boolean c() {
        return true;
    }

    @Override // p149v.j, p149v.e
    public final void g(e eVar, HashMap map) {
        super.g(eVar, map);
        a aVar = (a) eVar;
        this.f16889w0 = aVar.f16889w0;
        this.f16890x0 = aVar.f16890x0;
        this.f16891y0 = aVar.f16891y0;
    }

    @Override // p149v.e
    public final String toString() {
        String strI = k.i(new StringBuilder("[Barrier] "), this.f16968k0, " {");
        for (int i7 = 0; i7 < this.f17062v0; i7++) {
            e eVar = this.f17061u0[i7];
            if (i7 > 0) {
                strI = k.e(strI, ", ");
            }
            StringBuilder sbC = e.c(strI);
            sbC.append(eVar.f16968k0);
            strI = sbC.toString();
        }
        return k.e(strI, "}");
    }
}
