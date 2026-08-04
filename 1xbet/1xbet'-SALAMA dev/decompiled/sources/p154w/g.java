package p154w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p149v.c;
import p149v.d;
import p149v.e;
import p149v.f;
import p149v.i;
import p149v.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f17243a = new b();

    public static boolean a(e eVar) {
        d[] dVarArr = eVar.f16943U;
        d dVar = dVarArr[0];
        d dVar2 = dVarArr[1];
        e eVar2 = eVar.f16944V;
        f fVar = eVar2 != null ? (f) eVar2 : null;
        d dVar3 = d.f16918a;
        if (fVar != null) {
            d dVar4 = fVar.f16943U[0];
        }
        if (fVar != null) {
            d dVar5 = fVar.f16943U[1];
        }
        d dVar6 = d.f16920c;
        d dVar7 = d.f16919b;
        boolean z4 = dVar == dVar3 || eVar.B() || dVar == dVar7 || (dVar == dVar6 && eVar.f16981r == 0 && eVar.f16947Y == 0.0f && eVar.u(0)) || (dVar == dVar6 && eVar.f16981r == 1 && eVar.v(0, eVar.r()));
        boolean z7 = dVar2 == dVar3 || eVar.C() || dVar2 == dVar7 || (dVar2 == dVar6 && eVar.f16983s == 0 && eVar.f16947Y == 0.0f && eVar.u(1)) || (dVar2 == dVar6 && eVar.f16983s == 1 && eVar.v(1, eVar.l()));
        if (eVar.f16947Y <= 0.0f || !(z4 || z7)) {
            return z4 && z7;
        }
        return true;
    }

    public static m b(e eVar, int i7, ArrayList arrayList, m mVar) {
        int i8;
        int i9 = i7 == 0 ? eVar.f16984s0 : eVar.f16986t0;
        if (i9 != -1 && (mVar == null || i9 != mVar.f17251b)) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                m mVar2 = (m) arrayList.get(i10);
                if (mVar2.f17251b == i9) {
                    if (mVar != null) {
                        mVar.c(i7, mVar2);
                        arrayList.remove(mVar);
                    }
                    mVar = mVar2;
                    break;
                }
            }
        } else if (i9 != -1) {
            return mVar;
        }
        if (mVar == null) {
            if (eVar instanceof j) {
                j jVar = (j) eVar;
                int i11 = 0;
                while (true) {
                    if (i11 >= jVar.f17062v0) {
                        i8 = -1;
                        break;
                    }
                    e eVar2 = jVar.f17061u0[i11];
                    if ((i7 == 0 && (i8 = eVar2.f16984s0) != -1) || (i7 == 1 && (i8 = eVar2.f16986t0) != -1)) {
                        break;
                    }
                    i11++;
                }
                if (i8 != -1) {
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        m mVar3 = (m) arrayList.get(i12);
                        if (mVar3.f17251b == i8) {
                            mVar = mVar3;
                            break;
                        }
                    }
                }
            }
            if (mVar == null) {
                mVar = new m();
                mVar.f17250a = new ArrayList();
                mVar.f17253d = null;
                mVar.f17254e = -1;
                int i13 = m.f17249f;
                m.f17249f = i13 + 1;
                mVar.f17251b = i13;
                mVar.f17252c = i7;
            }
            arrayList.add(mVar);
        }
        ArrayList arrayList2 = mVar.f17250a;
        if (!arrayList2.contains(eVar)) {
            arrayList2.add(eVar);
            if (eVar instanceof i) {
                i iVar = (i) eVar;
                iVar.f17058x0.c(iVar.f17059y0 == 0 ? 1 : 0, arrayList, mVar);
            }
            int i14 = mVar.f17251b;
            if (i7 == 0) {
                eVar.f16984s0 = i14;
                eVar.f16932J.c(i7, arrayList, mVar);
                eVar.f16934L.c(i7, arrayList, mVar);
            } else {
                eVar.f16986t0 = i14;
                eVar.f16933K.c(i7, arrayList, mVar);
                eVar.f16936N.c(i7, arrayList, mVar);
                eVar.f16935M.c(i7, arrayList, mVar);
            }
            eVar.f16939Q.c(i7, arrayList, mVar);
        }
        return mVar;
    }

    public static void c(int i7, B.d dVar, e eVar, boolean z4) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (eVar.f16971m) {
            return;
        }
        if (!(eVar instanceof f) && eVar.A() && a(eVar)) {
            f.W(eVar, dVar, new b());
        }
        c cVarJ = eVar.j(2);
        c cVarJ2 = eVar.j(4);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet hashSet = cVarJ.f16909a;
        d dVar2 = d.f16920c;
        if (hashSet != null && cVarJ.f16911c) {
            for (Iterator it = hashSet.iterator(); it.hasNext(); it = it) {
                c cVar5 = (c) it.next();
                e eVar2 = cVar5.f16912d;
                int i8 = i7 + 1;
                boolean zA = a(eVar2);
                if (eVar2.A() && zA) {
                    f.W(eVar2, dVar, new b());
                }
                c cVar6 = eVar2.f16932J;
                c cVar7 = eVar2.f16934L;
                boolean z7 = (cVar5 == cVar6 && (cVar4 = cVar7.f16914f) != null && cVar4.f16911c) || (cVar5 == cVar7 && (cVar3 = cVar6.f16914f) != null && cVar3.f16911c);
                d dVar3 = eVar2.f16943U[0];
                if (dVar3 != dVar2 || zA) {
                    if (!eVar2.A()) {
                        if (cVar5 == cVar6 && cVar7.f16914f == null) {
                            int iE = cVar6.e() + iD;
                            eVar2.K(iE, eVar2.r() + iE);
                            c(i8, dVar, eVar2, z4);
                        } else if (cVar5 == cVar7 && cVar6.f16914f == null) {
                            int iE2 = iD - cVar7.e();
                            eVar2.K(iE2 - eVar2.r(), iE2);
                            c(i8, dVar, eVar2, z4);
                        } else if (z7 && !eVar2.y()) {
                            d(i8, dVar, eVar2, z4);
                        }
                    }
                } else if (dVar3 == dVar2 && eVar2.f16988v >= 0 && eVar2.f16987u >= 0 && ((eVar2.f16965i0 == 8 || (eVar2.f16981r == 0 && eVar2.f16947Y == 0.0f)) && !eVar2.y() && !eVar2.f16929G && z7 && !eVar2.y())) {
                    e(i8, eVar, dVar, eVar2, z4);
                }
            }
        }
        if (eVar instanceof i) {
            return;
        }
        HashSet<c> hashSet2 = cVarJ2.f16909a;
        if (hashSet2 != null && cVarJ2.f16911c) {
            for (c cVar8 : hashSet2) {
                e eVar3 = cVar8.f16912d;
                int i9 = i7 + 1;
                boolean zA2 = a(eVar3);
                if (eVar3.A() && zA2) {
                    f.W(eVar3, dVar, new b());
                }
                c cVar9 = eVar3.f16932J;
                c cVar10 = eVar3.f16934L;
                boolean z8 = (cVar8 == cVar9 && (cVar2 = cVar10.f16914f) != null && cVar2.f16911c) || (cVar8 == cVar10 && (cVar = cVar9.f16914f) != null && cVar.f16911c);
                d dVar4 = eVar3.f16943U[0];
                if (dVar4 != dVar2 || zA2) {
                    if (!eVar3.A()) {
                        if (cVar8 == cVar9 && cVar10.f16914f == null) {
                            int iE3 = cVar9.e() + iD2;
                            eVar3.K(iE3, eVar3.r() + iE3);
                            c(i9, dVar, eVar3, z4);
                        } else if (cVar8 == cVar10 && cVar9.f16914f == null) {
                            int iE4 = iD2 - cVar10.e();
                            eVar3.K(iE4 - eVar3.r(), iE4);
                            c(i9, dVar, eVar3, z4);
                        } else if (z8 && !eVar3.y()) {
                            d(i9, dVar, eVar3, z4);
                        }
                    }
                } else if (dVar4 == dVar2 && eVar3.f16988v >= 0 && eVar3.f16987u >= 0) {
                    if (eVar3.f16965i0 != 8) {
                        if (eVar3.f16981r == 0) {
                            if (eVar3.f16947Y == 0.0f) {
                            }
                        }
                    }
                    if (!eVar3.y() && !eVar3.f16929G && z8 && !eVar3.y()) {
                        e(i9, eVar, dVar, eVar3, z4);
                    }
                }
            }
        }
        eVar.f16971m = true;
    }

    public static void d(int i7, B.d dVar, e eVar, boolean z4) {
        float f7 = eVar.f16959f0;
        c cVar = eVar.f16932J;
        int iD = cVar.f16914f.d();
        c cVar2 = eVar.f16934L;
        int iD2 = cVar2.f16914f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f7 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iR = eVar.r();
        int i8 = (iD2 - iD) - iR;
        if (iD > iD2) {
            i8 = (iD - iD2) - iR;
        }
        int i9 = ((int) (i8 > 0 ? (f7 * i8) + 0.5f : f7 * i8)) + iD;
        int i10 = i9 + iR;
        if (iD > iD2) {
            i10 = i9 - iR;
        }
        eVar.K(i9, i10);
        c(i7 + 1, dVar, eVar, z4);
    }

    public static void e(int i7, e eVar, B.d dVar, e eVar2, boolean z4) {
        float f7 = eVar2.f16959f0;
        c cVar = eVar2.f16932J;
        int iE = cVar.e() + cVar.f16914f.d();
        c cVar2 = eVar2.f16934L;
        int iD = cVar2.f16914f.d() - cVar2.e();
        if (iD >= iE) {
            int iR = eVar2.r();
            if (eVar2.f16965i0 != 8) {
                int i8 = eVar2.f16981r;
                if (i8 == 2) {
                    iR = (int) (eVar2.f16959f0 * 0.5f * (eVar instanceof f ? eVar.r() : eVar.f16944V.r()));
                } else if (i8 == 0) {
                    iR = iD - iE;
                }
                iR = Math.max(eVar2.f16987u, iR);
                int i9 = eVar2.f16988v;
                if (i9 > 0) {
                    iR = Math.min(i9, iR);
                }
            }
            int i10 = iE + ((int) ((f7 * ((iD - iE) - iR)) + 0.5f));
            eVar2.K(i10, iR + i10);
            c(i7 + 1, dVar, eVar2, z4);
        }
    }

    public static void f(int i7, B.d dVar, e eVar) {
        float f7 = eVar.f16961g0;
        c cVar = eVar.f16933K;
        int iD = cVar.f16914f.d();
        c cVar2 = eVar.f16935M;
        int iD2 = cVar2.f16914f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f7 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iL = eVar.l();
        int i8 = (iD2 - iD) - iL;
        if (iD > iD2) {
            i8 = (iD - iD2) - iL;
        }
        int i9 = (int) (i8 > 0 ? (f7 * i8) + 0.5f : f7 * i8);
        int i10 = iD + i9;
        int i11 = i10 + iL;
        if (iD > iD2) {
            i10 = iD - i9;
            i11 = i10 - iL;
        }
        eVar.L(i10, i11);
        i(i7 + 1, dVar, eVar);
    }

    public static void g(int i7, e eVar, B.d dVar, e eVar2) {
        float f7 = eVar2.f16961g0;
        c cVar = eVar2.f16933K;
        int iE = cVar.e() + cVar.f16914f.d();
        c cVar2 = eVar2.f16935M;
        int iD = cVar2.f16914f.d() - cVar2.e();
        if (iD >= iE) {
            int iL = eVar2.l();
            if (eVar2.f16965i0 != 8) {
                int i8 = eVar2.f16983s;
                if (i8 == 2) {
                    iL = (int) (f7 * 0.5f * (eVar instanceof f ? eVar.l() : eVar.f16944V.l()));
                } else if (i8 == 0) {
                    iL = iD - iE;
                }
                iL = Math.max(eVar2.f16990x, iL);
                int i9 = eVar2.f16991y;
                if (i9 > 0) {
                    iL = Math.min(i9, iL);
                }
            }
            int i10 = iE + ((int) ((f7 * ((iD - iE) - iL)) + 0.5f));
            eVar2.L(i10, iL + i10);
            i(i7 + 1, dVar, eVar2);
        }
    }

    public static boolean h(d dVar, d dVar2, d dVar3, d dVar4) {
        d dVar5 = d.f16918a;
        d dVar6 = d.f16921d;
        d dVar7 = d.f16919b;
        return (dVar3 == dVar5 || dVar3 == dVar7 || (dVar3 == dVar6 && dVar != dVar7)) || (dVar4 == dVar5 || dVar4 == dVar7 || (dVar4 == dVar6 && dVar2 != dVar7));
    }

    public static void i(int i7, B.d dVar, e eVar) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        c cVar5;
        if (eVar.f16973n) {
            return;
        }
        if (!(eVar instanceof f) && eVar.A() && a(eVar)) {
            f.W(eVar, dVar, new b());
        }
        c cVarJ = eVar.j(3);
        c cVarJ2 = eVar.j(5);
        int iD = cVarJ.d();
        int iD2 = cVarJ2.d();
        HashSet<c> hashSet = cVarJ.f16909a;
        d dVar2 = d.f16920c;
        if (hashSet != null && cVarJ.f16911c) {
            for (c cVar6 : hashSet) {
                e eVar2 = cVar6.f16912d;
                int i8 = i7 + 1;
                boolean zA = a(eVar2);
                if (eVar2.A() && zA) {
                    f.W(eVar2, dVar, new b());
                }
                c cVar7 = eVar2.f16933K;
                c cVar8 = eVar2.f16935M;
                boolean z4 = (cVar6 == cVar7 && (cVar5 = cVar8.f16914f) != null && cVar5.f16911c) || (cVar6 == cVar8 && (cVar4 = cVar7.f16914f) != null && cVar4.f16911c);
                d dVar3 = eVar2.f16943U[1];
                if (dVar3 != dVar2 || zA) {
                    if (!eVar2.A()) {
                        if (cVar6 == cVar7 && cVar8.f16914f == null) {
                            int iE = cVar7.e() + iD;
                            eVar2.L(iE, eVar2.l() + iE);
                            i(i8, dVar, eVar2);
                        } else if (cVar6 == cVar8 && cVar7.f16914f == null) {
                            int iE2 = iD - cVar8.e();
                            eVar2.L(iE2 - eVar2.l(), iE2);
                            i(i8, dVar, eVar2);
                        } else if (z4 && !eVar2.z()) {
                            f(i8, dVar, eVar2);
                        }
                    }
                } else if (dVar3 == dVar2 && eVar2.f16991y >= 0 && eVar2.f16990x >= 0 && (eVar2.f16965i0 == 8 || (eVar2.f16983s == 0 && eVar2.f16947Y == 0.0f))) {
                    if (!eVar2.z() && !eVar2.f16929G && z4 && !eVar2.z()) {
                        g(i8, eVar, dVar, eVar2);
                    }
                }
            }
        }
        if (eVar instanceof i) {
            return;
        }
        HashSet<c> hashSet2 = cVarJ2.f16909a;
        if (hashSet2 != null && cVarJ2.f16911c) {
            for (c cVar9 : hashSet2) {
                e eVar3 = cVar9.f16912d;
                int i9 = i7 + 1;
                boolean zA2 = a(eVar3);
                if (eVar3.A() && zA2) {
                    f.W(eVar3, dVar, new b());
                }
                c cVar10 = eVar3.f16933K;
                c cVar11 = eVar3.f16935M;
                boolean z7 = (cVar9 == cVar10 && (cVar3 = cVar11.f16914f) != null && cVar3.f16911c) || (cVar9 == cVar11 && (cVar2 = cVar10.f16914f) != null && cVar2.f16911c);
                d dVar4 = eVar3.f16943U[1];
                if (dVar4 != dVar2 || zA2) {
                    if (!eVar3.A()) {
                        if (cVar9 == cVar10 && cVar11.f16914f == null) {
                            int iE3 = cVar10.e() + iD2;
                            eVar3.L(iE3, eVar3.l() + iE3);
                            i(i9, dVar, eVar3);
                        } else if (cVar9 == cVar11 && cVar10.f16914f == null) {
                            int iE4 = iD2 - cVar11.e();
                            eVar3.L(iE4 - eVar3.l(), iE4);
                            i(i9, dVar, eVar3);
                        } else if (z7 && !eVar3.z()) {
                            f(i9, dVar, eVar3);
                        }
                    }
                } else if (dVar4 == dVar2 && eVar3.f16991y >= 0 && eVar3.f16990x >= 0) {
                    if (eVar3.f16965i0 != 8) {
                        if (eVar3.f16983s == 0) {
                            if (eVar3.f16947Y == 0.0f) {
                            }
                        }
                    }
                    if (!eVar3.z() && !eVar3.f16929G && z7 && !eVar3.z()) {
                        g(i9, eVar, dVar, eVar3);
                    }
                }
            }
        }
        c cVarJ3 = eVar.j(6);
        if (cVarJ3.f16909a != null && cVarJ3.f16911c) {
            int iD3 = cVarJ3.d();
            for (c cVar12 : cVarJ3.f16909a) {
                e eVar4 = cVar12.f16912d;
                int i10 = i7 + 1;
                boolean zA3 = a(eVar4);
                if (eVar4.A() && zA3) {
                    f.W(eVar4, dVar, new b());
                }
                if (eVar4.f16943U[1] != dVar2 || zA3) {
                    if (!eVar4.A() && cVar12 == (cVar = eVar4.f16936N)) {
                        int iE5 = cVar12.e() + iD3;
                        if (eVar4.f16927E) {
                            int i11 = iE5 - eVar4.c0;
                            int i12 = eVar4.f16946X + i11;
                            eVar4.f16952b0 = i11;
                            eVar4.f16933K.l(i11);
                            eVar4.f16935M.l(i12);
                            cVar.l(iE5);
                            eVar4.f16969l = true;
                        }
                        i(i10, dVar, eVar4);
                    }
                }
            }
        }
        eVar.f16973n = true;
    }
}
