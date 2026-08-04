package D0;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p154w.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Serializable f1621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f1624h;

    public void a(p154w.e eVar, int i7, ArrayList arrayList, p154w.k kVar) {
        n nVar = eVar.f17234d;
        if (nVar.f17257c == null) {
            p149v.f fVar = (p149v.f) this.f1619c;
            if (nVar == fVar.f16954d || nVar == fVar.f16956e) {
                return;
            }
            if (kVar == null) {
                kVar = new p154w.k();
                kVar.f17245a = null;
                kVar.f17246b = new ArrayList();
                kVar.f17245a = nVar;
                arrayList.add(kVar);
            }
            nVar.f17257c = kVar;
            kVar.f17246b.add(nVar);
            p154w.e eVar2 = nVar.f17262h;
            for (p154w.d dVar : eVar2.f17240k) {
                if (dVar instanceof p154w.e) {
                    a((p154w.e) dVar, i7, arrayList, kVar);
                }
            }
            p154w.e eVar3 = nVar.f17263i;
            for (p154w.d dVar2 : eVar3.f17240k) {
                if (dVar2 instanceof p154w.e) {
                    a((p154w.e) dVar2, i7, arrayList, kVar);
                }
            }
            if (i7 == 1 && (nVar instanceof p154w.l)) {
                for (p154w.d dVar3 : ((p154w.l) nVar).f17247k.f17240k) {
                    if (dVar3 instanceof p154w.e) {
                        a((p154w.e) dVar3, i7, arrayList, kVar);
                    }
                }
            }
            Iterator it = eVar2.f17241l.iterator();
            while (it.hasNext()) {
                a((p154w.e) it.next(), i7, arrayList, kVar);
            }
            Iterator it2 = eVar3.f17241l.iterator();
            while (it2.hasNext()) {
                a((p154w.e) it2.next(), i7, arrayList, kVar);
            }
            if (i7 == 1 && (nVar instanceof p154w.l)) {
                Iterator it3 = ((p154w.l) nVar).f17247k.f17241l.iterator();
                while (it3.hasNext()) {
                    a((p154w.e) it3.next(), i7, arrayList, kVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x025d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:114:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0183  */
    /* JADX WARN: Code duplicated, block: B:86:0x0185 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x018b  */
    public void b(p149v.f fVar) {
        int iR;
        int iL;
        p149v.d dVar;
        Iterator it = fVar.f17009u0.iterator();
        while (it.hasNext()) {
            p149v.e eVar = (p149v.e) it.next();
            p149v.d[] dVarArr = eVar.f16943U;
            p149v.d dVar2 = dVarArr[0];
            p149v.d dVar3 = dVarArr[1];
            if (eVar.f16965i0 == 8) {
                eVar.f16949a = true;
            } else {
                float f7 = eVar.f16989w;
                p149v.d dVar4 = p149v.d.f16920c;
                if (f7 < 1.0f && dVar2 == dVar4) {
                    eVar.f16981r = 2;
                }
                float f8 = eVar.f16992z;
                if (f8 < 1.0f && dVar3 == dVar4) {
                    eVar.f16983s = 2;
                }
                float f9 = eVar.f16947Y;
                p149v.d dVar5 = p149v.d.f16919b;
                p149v.d dVar6 = p149v.d.f16918a;
                if (f9 > 0.0f) {
                    if (dVar2 == dVar4 && (dVar3 == dVar5 || dVar3 == dVar6)) {
                        eVar.f16981r = 3;
                    } else if (dVar3 == dVar4 && (dVar2 == dVar5 || dVar2 == dVar6)) {
                        eVar.f16983s = 3;
                    } else if (dVar2 == dVar4 && dVar3 == dVar4) {
                        if (eVar.f16981r == 0) {
                            eVar.f16981r = 3;
                        }
                        if (eVar.f16983s == 0) {
                            eVar.f16983s = 3;
                        }
                    }
                }
                p149v.c cVar = eVar.f16934L;
                p149v.c cVar2 = eVar.f16932J;
                if (dVar2 == dVar4 && eVar.f16981r == 1 && (cVar2.f16914f == null || cVar.f16914f == null)) {
                    dVar2 = dVar5;
                }
                p149v.c cVar3 = eVar.f16935M;
                p149v.c cVar4 = eVar.f16933K;
                p149v.d dVar7 = (dVar3 == dVar4 && eVar.f16983s == 1 && (cVar4.f16914f == null || cVar3.f16914f == null)) ? dVar5 : dVar3;
                p154w.j jVar = eVar.f16954d;
                jVar.f17258d = dVar2;
                int i7 = eVar.f16981r;
                jVar.f17255a = i7;
                p154w.l lVar = eVar.f16956e;
                lVar.f17258d = dVar7;
                Iterator it2 = it;
                int i8 = eVar.f16983s;
                lVar.f17255a = i8;
                p149v.d dVar8 = p149v.d.f16921d;
                if ((dVar2 == dVar8 || dVar2 == dVar6 || dVar2 == dVar5) && (dVar7 == dVar8 || dVar7 == dVar6 || dVar7 == dVar5)) {
                    int iR2 = eVar.r();
                    if (dVar2 == dVar8) {
                        iR = (fVar.r() - cVar2.f16915g) - cVar.f16915g;
                        dVar2 = dVar6;
                    } else {
                        iR = iR2;
                    }
                    int iL2 = eVar.l();
                    if (dVar7 == dVar8) {
                        iL = (fVar.l() - cVar4.f16915g) - cVar3.f16915g;
                        dVar = dVar6;
                    } else {
                        iL = iL2;
                        dVar = dVar7;
                    }
                    f(eVar, dVar2, iR, dVar, iL);
                    eVar.f16954d.f17259e.d(eVar.r());
                    eVar.f16956e.f17259e.d(eVar.l());
                    eVar.f16949a = true;
                } else {
                    p149v.c[] cVarArr = eVar.f16940R;
                    if (dVar2 == dVar4 && (dVar7 == dVar5 || dVar7 == dVar6)) {
                        if (i7 == 3) {
                            if (dVar7 == dVar5) {
                                f(eVar, dVar5, 0, dVar5, 0);
                            }
                            int iL3 = eVar.l();
                            f(eVar, dVar6, (int) ((iL3 * eVar.f16947Y) + 0.5f), dVar6, iL3);
                            eVar.f16954d.f17259e.d(eVar.r());
                            eVar.f16956e.f17259e.d(eVar.l());
                            eVar.f16949a = true;
                        } else if (i7 == 1) {
                            f(eVar, dVar5, 0, dVar7, 0);
                            eVar.f16954d.f17259e.f17242m = eVar.r();
                        } else if (i7 == 2) {
                            p149v.d dVar9 = fVar.f16943U[0];
                            if (dVar9 == dVar6 || dVar9 == dVar8) {
                                f(eVar, dVar6, (int) ((f7 * fVar.r()) + 0.5f), dVar7, eVar.l());
                                eVar.f16954d.f17259e.d(eVar.r());
                                eVar.f16956e.f17259e.d(eVar.l());
                                eVar.f16949a = true;
                            } else if (dVar7 == dVar4) {
                                if (dVar2 == dVar4) {
                                    if (i7 != 1) {
                                        f(eVar, dVar5, 0, dVar5, 0);
                                        eVar.f16954d.f17259e.f17242m = eVar.r();
                                        eVar.f16956e.f17259e.f17242m = eVar.l();
                                    } else {
                                        f(eVar, dVar5, 0, dVar5, 0);
                                        eVar.f16954d.f17259e.f17242m = eVar.r();
                                        eVar.f16956e.f17259e.f17242m = eVar.l();
                                    }
                                }
                            } else if (dVar2 == dVar4) {
                                if (i7 != 1) {
                                    f(eVar, dVar5, 0, dVar5, 0);
                                    eVar.f16954d.f17259e.f17242m = eVar.r();
                                    eVar.f16956e.f17259e.f17242m = eVar.l();
                                } else {
                                    f(eVar, dVar5, 0, dVar5, 0);
                                    eVar.f16954d.f17259e.f17242m = eVar.r();
                                    eVar.f16956e.f17259e.f17242m = eVar.l();
                                }
                            }
                        } else if (cVarArr[0].f16914f == null || cVarArr[1].f16914f == null) {
                            f(eVar, dVar5, 0, dVar7, 0);
                            eVar.f16954d.f17259e.d(eVar.r());
                            eVar.f16956e.f17259e.d(eVar.l());
                            eVar.f16949a = true;
                        } else if (dVar7 == dVar4) {
                            if (dVar2 == dVar4) {
                                if (i7 != 1) {
                                    f(eVar, dVar5, 0, dVar5, 0);
                                    eVar.f16954d.f17259e.f17242m = eVar.r();
                                    eVar.f16956e.f17259e.f17242m = eVar.l();
                                } else {
                                    f(eVar, dVar5, 0, dVar5, 0);
                                    eVar.f16954d.f17259e.f17242m = eVar.r();
                                    eVar.f16956e.f17259e.f17242m = eVar.l();
                                }
                            }
                        } else if (dVar2 == dVar4) {
                            if (i7 != 1) {
                                f(eVar, dVar5, 0, dVar5, 0);
                                eVar.f16954d.f17259e.f17242m = eVar.r();
                                eVar.f16956e.f17259e.f17242m = eVar.l();
                            } else {
                                f(eVar, dVar5, 0, dVar5, 0);
                                eVar.f16954d.f17259e.f17242m = eVar.r();
                                eVar.f16956e.f17259e.f17242m = eVar.l();
                            }
                        }
                    } else if (dVar7 == dVar4 || !(dVar2 == dVar5 || dVar2 == dVar6)) {
                        if (dVar2 == dVar4 && dVar7 == dVar4) {
                            if (i7 != 1 || i8 == 1) {
                                f(eVar, dVar5, 0, dVar5, 0);
                                eVar.f16954d.f17259e.f17242m = eVar.r();
                                eVar.f16956e.f17259e.f17242m = eVar.l();
                            } else if (i8 == 2 && i7 == 2) {
                                p149v.d[] dVarArr2 = fVar.f16943U;
                                if (dVarArr2[0] == dVar6 && dVarArr2[1] == dVar6) {
                                    f(eVar, dVar6, (int) ((f7 * fVar.r()) + 0.5f), dVar6, (int) ((f8 * fVar.l()) + 0.5f));
                                    eVar.f16954d.f17259e.d(eVar.r());
                                    eVar.f16956e.f17259e.d(eVar.l());
                                    eVar.f16949a = true;
                                }
                            }
                        }
                    } else if (i8 == 3) {
                        if (dVar2 == dVar5) {
                            f(eVar, dVar5, 0, dVar5, 0);
                        }
                        int iR3 = eVar.r();
                        float f10 = eVar.f16947Y;
                        if (eVar.f16948Z == -1) {
                            f10 = 1.0f / f10;
                        }
                        f(eVar, dVar6, iR3, dVar6, (int) ((iR3 * f10) + 0.5f));
                        eVar.f16954d.f17259e.d(eVar.r());
                        eVar.f16956e.f17259e.d(eVar.l());
                        eVar.f16949a = true;
                    } else if (i8 == 1) {
                        f(eVar, dVar2, 0, dVar5, 0);
                        eVar.f16956e.f17259e.f17242m = eVar.l();
                    } else if (i8 == 2) {
                        p149v.d dVar10 = fVar.f16943U[1];
                        if (dVar10 == dVar6 || dVar10 == dVar8) {
                            f(eVar, dVar2, eVar.r(), dVar6, (int) ((f8 * fVar.l()) + 0.5f));
                            eVar.f16954d.f17259e.d(eVar.r());
                            eVar.f16956e.f17259e.d(eVar.l());
                            eVar.f16949a = true;
                        } else if (dVar2 == dVar4) {
                            if (i7 != 1) {
                                f(eVar, dVar5, 0, dVar5, 0);
                                eVar.f16954d.f17259e.f17242m = eVar.r();
                                eVar.f16956e.f17259e.f17242m = eVar.l();
                            } else {
                                f(eVar, dVar5, 0, dVar5, 0);
                                eVar.f16954d.f17259e.f17242m = eVar.r();
                                eVar.f16956e.f17259e.f17242m = eVar.l();
                            }
                        }
                    } else if (cVarArr[2].f16914f == null || cVarArr[3].f16914f == null) {
                        f(eVar, dVar5, 0, dVar7, 0);
                        eVar.f16954d.f17259e.d(eVar.r());
                        eVar.f16956e.f17259e.d(eVar.l());
                        eVar.f16949a = true;
                    } else if (dVar2 == dVar4) {
                        if (i7 != 1) {
                            f(eVar, dVar5, 0, dVar5, 0);
                            eVar.f16954d.f17259e.f17242m = eVar.r();
                            eVar.f16956e.f17259e.f17242m = eVar.l();
                        } else {
                            f(eVar, dVar5, 0, dVar5, 0);
                            eVar.f16954d.f17259e.f17242m = eVar.r();
                            eVar.f16956e.f17259e.f17242m = eVar.l();
                        }
                    }
                }
                it = it2;
            }
        }
    }

    public void c() {
        ArrayList<n> arrayList = (ArrayList) this.f1621e;
        arrayList.clear();
        p149v.f fVar = (p149v.f) this.f1620d;
        fVar.f16954d.f();
        fVar.f16956e.f();
        arrayList.add(fVar.f16954d);
        arrayList.add(fVar.f16956e);
        HashSet hashSet = null;
        for (p149v.e eVar : fVar.f17009u0) {
            if (eVar instanceof p149v.i) {
                p154w.h hVar = new p154w.h(eVar);
                eVar.f16954d.f();
                eVar.f16956e.f();
                hVar.f17260f = ((p149v.i) eVar).f17059y0;
                arrayList.add(hVar);
            } else {
                if (eVar.y()) {
                    if (eVar.f16951b == null) {
                        eVar.f16951b = new p154w.c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f16951b);
                } else {
                    arrayList.add(eVar.f16954d);
                }
                if (eVar.z()) {
                    if (eVar.f16953c == null) {
                        eVar.f16953c = new p154w.c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f16953c);
                } else {
                    arrayList.add(eVar.f16956e);
                }
                if (eVar instanceof p149v.j) {
                    arrayList.add(new p154w.i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
        for (n nVar : arrayList) {
            if (nVar.f17256b != fVar) {
                nVar.d();
            }
        }
        ArrayList arrayList2 = (ArrayList) this.f1624h;
        arrayList2.clear();
        p149v.f fVar2 = (p149v.f) this.f1619c;
        e(fVar2.f16954d, 0, arrayList2);
        e(fVar2.f16956e, 1, arrayList2);
        this.f1617a = false;
    }

    public int d(p149v.f fVar, int i7) {
        ArrayList arrayList;
        int i8;
        int i9;
        long j;
        float f7;
        long j3;
        ArrayList arrayList2 = (ArrayList) this.f1624h;
        int size = arrayList2.size();
        int i10 = 0;
        long jMax = 0;
        while (i10 < size) {
            n nVar = ((p154w.k) arrayList2.get(i10)).f17245a;
            if (!(nVar instanceof p154w.c) ? !(i7 != 0 ? (nVar instanceof p154w.l) : (nVar instanceof p154w.j)) : ((p154w.c) nVar).f17260f != i7) {
                p154w.e eVar = (i7 == 0 ? fVar.f16954d : fVar.f16956e).f17262h;
                p154w.e eVar2 = (i7 == 0 ? fVar.f16954d : fVar.f16956e).f17263i;
                boolean zContains = nVar.f17262h.f17241l.contains(eVar);
                p154w.e eVar3 = nVar.f17263i;
                boolean zContains2 = eVar3.f17241l.contains(eVar2);
                long j7 = nVar.j();
                p154w.e eVar4 = nVar.f17262h;
                if (zContains && zContains2) {
                    long jB = p154w.k.b(eVar4, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i8 = size;
                    long jA = p154w.k.a(eVar3, 0L);
                    long j8 = jB - j7;
                    int i11 = eVar3.f17236f;
                    arrayList = arrayList3;
                    i9 = i10;
                    if (j8 >= (-i11)) {
                        j8 += (long) i11;
                    }
                    long j9 = (-jA) - j7;
                    long j10 = eVar4.f17236f;
                    long j11 = j9 - j10;
                    if (j11 >= j10) {
                        j11 -= j10;
                    }
                    p149v.e eVar5 = nVar.f17256b;
                    if (i7 == 0) {
                        f7 = eVar5.f16959f0;
                    } else if (i7 == 1) {
                        f7 = eVar5.f16961g0;
                    } else {
                        eVar5.getClass();
                        f7 = -1.0f;
                    }
                    if (f7 > 0.0f) {
                        j3 = (long) ((j8 / (1.0f - f7)) + (j11 / f7));
                    } else {
                        j3 = 0;
                    }
                    float f8 = j3;
                    j = (((long) eVar4.f17236f) + ((((long) ((f8 * f7) + 0.5f)) + j7) + ((long) (((1.0f - f7) * f8) + 0.5f)))) - ((long) eVar3.f17236f);
                } else {
                    arrayList = arrayList2;
                    i8 = size;
                    i9 = i10;
                    if (zContains) {
                        j = Math.max(p154w.k.b(eVar4, eVar4.f17236f), ((long) eVar4.f17236f) + j7);
                    } else if (zContains2) {
                        j = Math.max(-p154w.k.a(eVar3, eVar3.f17236f), ((long) (-eVar3.f17236f)) + j7);
                    } else {
                        j = (nVar.j() + ((long) eVar4.f17236f)) - ((long) eVar3.f17236f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i8 = size;
                i9 = i10;
                j = 0;
            }
            jMax = Math.max(jMax, j);
            i10 = i9 + 1;
            size = i8;
            arrayList2 = arrayList;
        }
        return (int) jMax;
    }

    public void e(n nVar, int i7, ArrayList arrayList) {
        p154w.e eVar;
        Iterator it = nVar.f17262h.f17240k.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            eVar = nVar.f17263i;
            if (!zHasNext) {
                break;
            }
            p154w.d dVar = (p154w.d) it.next();
            if (dVar instanceof p154w.e) {
                a((p154w.e) dVar, i7, arrayList, null);
            } else if (dVar instanceof n) {
                a(((n) dVar).f17262h, i7, arrayList, null);
            }
        }
        for (p154w.d dVar2 : eVar.f17240k) {
            if (dVar2 instanceof p154w.e) {
                a((p154w.e) dVar2, i7, arrayList, null);
            } else if (dVar2 instanceof n) {
                a(((n) dVar2).f17263i, i7, arrayList, null);
            }
        }
        if (i7 == 1) {
            for (p154w.d dVar3 : ((p154w.l) nVar).f17247k.f17240k) {
                if (dVar3 instanceof p154w.e) {
                    a((p154w.e) dVar3, i7, arrayList, null);
                }
            }
        }
    }

    public void f(p149v.e eVar, p149v.d dVar, int i7, p149v.d dVar2, int i8) {
        p154w.b bVar = (p154w.b) this.f1623g;
        bVar.f17220a = dVar;
        bVar.f17221b = dVar2;
        bVar.f17222c = i7;
        bVar.f17223d = i8;
        ((B.d) this.f1622f).b(eVar, bVar);
        eVar.P(bVar.f17224e);
        eVar.M(bVar.f17225f);
        eVar.f16927E = bVar.f17227h;
        eVar.J(bVar.f17226g);
    }

    public void g() {
        p154w.a aVar;
        for (p149v.e eVar : ((p149v.f) this.f1619c).f17009u0) {
            if (!eVar.f16949a) {
                p149v.d[] dVarArr = eVar.f16943U;
                boolean z4 = false;
                p149v.d dVar = dVarArr[0];
                p149v.d dVar2 = dVarArr[1];
                int i7 = eVar.f16981r;
                int i8 = eVar.f16983s;
                p149v.d dVar3 = p149v.d.f16919b;
                p149v.d dVar4 = p149v.d.f16920c;
                boolean z7 = dVar == dVar3 || (dVar == dVar4 && i7 == 1);
                if (dVar2 == dVar3 || (dVar2 == dVar4 && i8 == 1)) {
                    z4 = true;
                }
                p154w.f fVar = eVar.f16954d.f17259e;
                boolean z8 = fVar.j;
                p154w.f fVar2 = eVar.f16956e.f17259e;
                boolean z9 = fVar2.j;
                p149v.d dVar5 = p149v.d.f16918a;
                if (z8 && z9) {
                    f(eVar, dVar5, fVar.f17237g, dVar5, fVar2.f17237g);
                    eVar.f16949a = true;
                } else if (z8 && z4) {
                    f(eVar, dVar5, fVar.f17237g, dVar3, fVar2.f17237g);
                    if (dVar2 == dVar4) {
                        eVar.f16956e.f17259e.f17242m = eVar.l();
                    } else {
                        eVar.f16956e.f17259e.d(eVar.l());
                        eVar.f16949a = true;
                    }
                } else if (z9 && z7) {
                    f(eVar, dVar3, fVar.f17237g, dVar5, fVar2.f17237g);
                    if (dVar == dVar4) {
                        eVar.f16954d.f17259e.f17242m = eVar.r();
                    } else {
                        eVar.f16954d.f17259e.d(eVar.r());
                        eVar.f16949a = true;
                    }
                }
                if (eVar.f16949a && (aVar = eVar.f16956e.f17248l) != null) {
                    aVar.d(eVar.c0);
                }
            }
        }
    }
}
