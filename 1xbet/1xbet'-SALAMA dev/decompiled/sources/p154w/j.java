package p154w;

import java.util.ArrayList;
import p136t.e;
import p149v.c;
import p149v.d;

/* JADX INFO: loaded from: classes.dex */
public final class j extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f17244k = new int[2];

    public static void m(int[] iArr, int i7, int i8, int i9, int i10, float f7, int i11) {
        int i12 = i8 - i7;
        int i13 = i10 - i9;
        if (i11 != -1) {
            if (i11 == 0) {
                iArr[0] = (int) ((i13 * f7) + 0.5f);
                iArr[1] = i13;
                return;
            } else {
                if (i11 != 1) {
                    return;
                }
                iArr[0] = i12;
                iArr[1] = (int) ((i12 * f7) + 0.5f);
                return;
            }
        }
        int i14 = (int) ((i13 * f7) + 0.5f);
        int i15 = (int) ((i12 / f7) + 0.5f);
        if (i14 <= i12) {
            iArr[0] = i14;
            iArr[1] = i13;
        } else if (i15 <= i13) {
            iArr[0] = i12;
            iArr[1] = i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x026f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0280  */
    @Override // p154w.d
    public final void a(d dVar) {
        int iG;
        int i7;
        int iG2;
        float f7;
        float f8;
        float f9;
        int i8;
        if (e.e(this.j) == 3) {
            p149v.e eVar = this.f17256b;
            l(eVar.f16932J, eVar.f16934L, 0);
            return;
        }
        f fVar = this.f17259e;
        boolean z4 = fVar.j;
        d dVar2 = d.f16920c;
        e eVar2 = this.f17262h;
        e eVar3 = this.f17263i;
        if (!z4 && this.f17258d == dVar2) {
            p149v.e eVar4 = this.f17256b;
            int i9 = eVar4.f16981r;
            if (i9 == 2) {
                p149v.e eVar5 = eVar4.f16944V;
                if (eVar5 != null) {
                    f fVar2 = eVar5.f16954d.f17259e;
                    if (fVar2.j) {
                        fVar.d((int) ((fVar2.f17237g * eVar4.f16989w) + 0.5f));
                    }
                }
            } else if (i9 == 3) {
                int i10 = eVar4.f16983s;
                if (i10 == 0 || i10 == 3) {
                    l lVar = eVar4.f16956e;
                    e eVar6 = lVar.f17262h;
                    e eVar7 = lVar.f17263i;
                    boolean z7 = eVar4.f16932J.f16914f != null;
                    boolean z8 = eVar4.f16933K.f16914f != null;
                    boolean z9 = eVar4.f16934L.f16914f != null;
                    boolean z10 = eVar4.f16935M.f16914f != null;
                    int i11 = eVar4.f16948Z;
                    if (z7 && z8 && z9 && z10) {
                        float f10 = eVar4.f16947Y;
                        boolean z11 = eVar6.j;
                        int[] iArr = f17244k;
                        if (z11 && eVar7.j) {
                            if (eVar2.f17233c && eVar3.f17233c) {
                                m(iArr, ((e) eVar2.f17241l.get(0)).f17237g + eVar2.f17236f, ((e) eVar3.f17241l.get(0)).f17237g - eVar3.f17236f, eVar6.f17237g + eVar6.f17236f, eVar7.f17237g - eVar7.f17236f, f10, i11);
                                fVar.d(iArr[0]);
                                this.f17256b.f16956e.f17259e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z12 = eVar2.j;
                        ArrayList arrayList = eVar6.f17241l;
                        if (z12 && eVar3.j) {
                            if (!eVar6.f17233c || !eVar7.f17233c) {
                                return;
                            }
                            m(iArr, eVar2.f17237g + eVar2.f17236f, eVar3.f17237g - eVar3.f17236f, ((e) arrayList.get(0)).f17237g + eVar6.f17236f, ((e) eVar7.f17241l.get(0)).f17237g - eVar7.f17236f, f10, i11);
                            fVar.d(iArr[0]);
                            this.f17256b.f16956e.f17259e.d(iArr[1]);
                        }
                        if (!eVar2.f17233c || !eVar3.f17233c || !eVar6.f17233c || !eVar7.f17233c) {
                            return;
                        }
                        m(iArr, ((e) eVar2.f17241l.get(0)).f17237g + eVar2.f17236f, ((e) eVar3.f17241l.get(0)).f17237g - eVar3.f17236f, ((e) arrayList.get(0)).f17237g + eVar6.f17236f, ((e) eVar7.f17241l.get(0)).f17237g - eVar7.f17236f, f10, i11);
                        fVar.d(iArr[0]);
                        this.f17256b.f16956e.f17259e.d(iArr[1]);
                    } else if (z7 && z9) {
                        if (!eVar2.f17233c || !eVar3.f17233c) {
                            return;
                        }
                        float f11 = eVar4.f16947Y;
                        int i12 = ((e) eVar2.f17241l.get(0)).f17237g + eVar2.f17236f;
                        int i13 = ((e) eVar3.f17241l.get(0)).f17237g - eVar3.f17236f;
                        if (i11 == -1 || i11 == 0) {
                            int iG3 = g(i13 - i12, 0);
                            int i14 = (int) ((iG3 * f11) + 0.5f);
                            int iG4 = g(i14, 1);
                            if (i14 != iG4) {
                                iG3 = (int) ((iG4 / f11) + 0.5f);
                            }
                            fVar.d(iG3);
                            this.f17256b.f16956e.f17259e.d(iG4);
                        } else if (i11 == 1) {
                            int iG5 = g(i13 - i12, 0);
                            int i15 = (int) ((iG5 / f11) + 0.5f);
                            int iG6 = g(i15, 1);
                            if (i15 != iG6) {
                                iG5 = (int) ((iG6 * f11) + 0.5f);
                            }
                            fVar.d(iG5);
                            this.f17256b.f16956e.f17259e.d(iG6);
                        }
                    } else if (z8 && z10) {
                        if (!eVar6.f17233c || !eVar7.f17233c) {
                            return;
                        }
                        float f12 = eVar4.f16947Y;
                        int i16 = ((e) eVar6.f17241l.get(0)).f17237g + eVar6.f17236f;
                        int i17 = ((e) eVar7.f17241l.get(0)).f17237g - eVar7.f17236f;
                        if (i11 == -1) {
                            iG = g(i17 - i16, 1);
                            i7 = (int) ((iG / f12) + 0.5f);
                            iG2 = g(i7, 0);
                            if (i7 != iG2) {
                                iG = (int) ((iG2 * f12) + 0.5f);
                            }
                            fVar.d(iG2);
                            this.f17256b.f16956e.f17259e.d(iG);
                        } else if (i11 == 0) {
                            int iG7 = g(i17 - i16, 1);
                            int i18 = (int) ((iG7 * f12) + 0.5f);
                            int iG8 = g(i18, 0);
                            if (i18 != iG8) {
                                iG7 = (int) ((iG8 / f12) + 0.5f);
                            }
                            fVar.d(iG8);
                            this.f17256b.f16956e.f17259e.d(iG7);
                        } else if (i11 == 1) {
                            iG = g(i17 - i16, 1);
                            i7 = (int) ((iG / f12) + 0.5f);
                            iG2 = g(i7, 0);
                            if (i7 != iG2) {
                                iG = (int) ((iG2 * f12) + 0.5f);
                            }
                            fVar.d(iG2);
                            this.f17256b.f16956e.f17259e.d(iG);
                        }
                    }
                } else {
                    int i19 = eVar4.f16948Z;
                    if (i19 != -1) {
                        if (i19 == 0) {
                            f9 = eVar4.f16956e.f17259e.f17237g / eVar4.f16947Y;
                            i8 = (int) (f9 + 0.5f);
                        } else if (i19 != 1) {
                            i8 = 0;
                        } else {
                            f7 = eVar4.f16956e.f17259e.f17237g;
                            f8 = eVar4.f16947Y;
                        }
                        fVar.d(i8);
                    } else {
                        f7 = eVar4.f16956e.f17259e.f17237g;
                        f8 = eVar4.f16947Y;
                    }
                    f9 = f7 * f8;
                    i8 = (int) (f9 + 0.5f);
                    fVar.d(i8);
                }
            }
        }
        if (eVar2.f17233c && eVar3.f17233c) {
            if (eVar2.j && eVar3.j && fVar.j) {
                return;
            }
            if (!fVar.j && this.f17258d == dVar2) {
                p149v.e eVar8 = this.f17256b;
                if (eVar8.f16981r == 0 && !eVar8.y()) {
                    e eVar9 = (e) eVar2.f17241l.get(0);
                    e eVar10 = (e) eVar3.f17241l.get(0);
                    int i20 = eVar9.f17237g + eVar2.f17236f;
                    int i21 = eVar10.f17237g + eVar3.f17236f;
                    eVar2.d(i20);
                    eVar3.d(i21);
                    fVar.d(i21 - i20);
                    return;
                }
            }
            if (!fVar.j && this.f17258d == dVar2 && this.f17255a == 1 && eVar2.f17241l.size() > 0 && eVar3.f17241l.size() > 0) {
                int iMin = Math.min((((e) eVar3.f17241l.get(0)).f17237g + eVar3.f17236f) - (((e) eVar2.f17241l.get(0)).f17237g + eVar2.f17236f), fVar.f17242m);
                p149v.e eVar11 = this.f17256b;
                int i22 = eVar11.f16988v;
                int iMax = Math.max(eVar11.f16987u, iMin);
                if (i22 > 0) {
                    iMax = Math.min(i22, iMax);
                }
                fVar.d(iMax);
            }
            if (fVar.j) {
                e eVar12 = (e) eVar2.f17241l.get(0);
                e eVar13 = (e) eVar3.f17241l.get(0);
                int i23 = eVar12.f17237g;
                int i24 = eVar2.f17236f + i23;
                int i25 = eVar13.f17237g;
                int i26 = eVar3.f17236f + i25;
                float f13 = this.f17256b.f16959f0;
                if (eVar12 == eVar13) {
                    f13 = 0.5f;
                } else {
                    i23 = i24;
                    i25 = i26;
                }
                eVar2.d((int) ((((i25 - i23) - fVar.f17237g) * f13) + i23 + 0.5f));
                eVar3.d(eVar2.f17237g + fVar.f17237g);
            }
        }
    }

    @Override // p154w.n
    public final void d() {
        p149v.e eVar;
        p149v.e eVar2;
        d dVar;
        p149v.e eVar3;
        p149v.e eVar4;
        d dVar2;
        p149v.e eVar5 = this.f17256b;
        boolean z4 = eVar5.f16949a;
        f fVar = this.f17259e;
        if (z4) {
            fVar.d(eVar5.r());
        }
        boolean z7 = fVar.j;
        d dVar3 = d.f16921d;
        d dVar4 = d.f16920c;
        d dVar5 = d.f16918a;
        e eVar6 = this.f17263i;
        e eVar7 = this.f17262h;
        if (!z7) {
            p149v.e eVar8 = this.f17256b;
            d dVar6 = eVar8.f16943U[0];
            this.f17258d = dVar6;
            if (dVar6 != dVar4) {
                if (dVar6 == dVar3 && (eVar4 = eVar8.f16944V) != null && ((dVar2 = eVar4.f16943U[0]) == dVar5 || dVar2 == dVar3)) {
                    int iR = (eVar4.r() - this.f17256b.f16932J.e()) - this.f17256b.f16934L.e();
                    n.b(eVar7, eVar4.f16954d.f17262h, this.f17256b.f16932J.e());
                    n.b(eVar6, eVar4.f16954d.f17263i, -this.f17256b.f16934L.e());
                    fVar.d(iR);
                    return;
                }
                if (dVar6 == dVar5) {
                    fVar.d(eVar8.r());
                }
            }
        } else if (this.f17258d == dVar3 && (eVar2 = (eVar = this.f17256b).f16944V) != null && ((dVar = eVar2.f16943U[0]) == dVar5 || dVar == dVar3)) {
            n.b(eVar7, eVar2.f16954d.f17262h, eVar.f16932J.e());
            n.b(eVar6, eVar2.f16954d.f17263i, -this.f17256b.f16934L.e());
            return;
        }
        if (fVar.j) {
            p149v.e eVar9 = this.f17256b;
            if (eVar9.f16949a) {
                c[] cVarArr = eVar9.f16940R;
                c cVar = cVarArr[0];
                c cVar2 = cVar.f16914f;
                if (cVar2 != null && cVarArr[1].f16914f != null) {
                    if (eVar9.y()) {
                        eVar7.f17236f = this.f17256b.f16940R[0].e();
                        eVar6.f17236f = -this.f17256b.f16940R[1].e();
                        return;
                    }
                    e eVarH = n.h(this.f17256b.f16940R[0]);
                    if (eVarH != null) {
                        n.b(eVar7, eVarH, this.f17256b.f16940R[0].e());
                    }
                    e eVarH2 = n.h(this.f17256b.f16940R[1]);
                    if (eVarH2 != null) {
                        n.b(eVar6, eVarH2, -this.f17256b.f16940R[1].e());
                    }
                    eVar7.f17232b = true;
                    eVar6.f17232b = true;
                    return;
                }
                if (cVar2 != null) {
                    e eVarH3 = n.h(cVar);
                    if (eVarH3 != null) {
                        n.b(eVar7, eVarH3, this.f17256b.f16940R[0].e());
                        n.b(eVar6, eVar7, fVar.f17237g);
                        return;
                    }
                    return;
                }
                c cVar3 = cVarArr[1];
                if (cVar3.f16914f != null) {
                    e eVarH4 = n.h(cVar3);
                    if (eVarH4 != null) {
                        n.b(eVar6, eVarH4, -this.f17256b.f16940R[1].e());
                        n.b(eVar7, eVar6, -fVar.f17237g);
                        return;
                    }
                    return;
                }
                if ((eVar9 instanceof p149v.j) || eVar9.f16944V == null || eVar9.j(7).f16914f != null) {
                    return;
                }
                p149v.e eVar10 = this.f17256b;
                n.b(eVar7, eVar10.f16944V.f16954d.f17262h, eVar10.s());
                n.b(eVar6, eVar7, fVar.f17237g);
                return;
            }
        }
        if (this.f17258d == dVar4) {
            p149v.e eVar11 = this.f17256b;
            int i7 = eVar11.f16981r;
            if (i7 == 2) {
                p149v.e eVar12 = eVar11.f16944V;
                if (eVar12 != null) {
                    f fVar2 = eVar12.f16956e.f17259e;
                    fVar.f17241l.add(fVar2);
                    fVar2.f17240k.add(fVar);
                    fVar.f17232b = true;
                    fVar.f17240k.add(eVar7);
                    fVar.f17240k.add(eVar6);
                }
            } else if (i7 == 3) {
                if (eVar11.f16983s == 3) {
                    eVar7.f17231a = this;
                    eVar6.f17231a = this;
                    l lVar = eVar11.f16956e;
                    lVar.f17262h.f17231a = this;
                    lVar.f17263i.f17231a = this;
                    fVar.f17231a = this;
                    if (eVar11.z()) {
                        fVar.f17241l.add(this.f17256b.f16956e.f17259e);
                        this.f17256b.f16956e.f17259e.f17240k.add(fVar);
                        l lVar2 = this.f17256b.f16956e;
                        lVar2.f17259e.f17231a = this;
                        fVar.f17241l.add(lVar2.f17262h);
                        fVar.f17241l.add(this.f17256b.f16956e.f17263i);
                        this.f17256b.f16956e.f17262h.f17240k.add(fVar);
                        this.f17256b.f16956e.f17263i.f17240k.add(fVar);
                    } else if (this.f17256b.y()) {
                        this.f17256b.f16956e.f17259e.f17241l.add(fVar);
                        fVar.f17240k.add(this.f17256b.f16956e.f17259e);
                    } else {
                        this.f17256b.f16956e.f17259e.f17241l.add(fVar);
                    }
                } else {
                    f fVar3 = eVar11.f16956e.f17259e;
                    fVar.f17241l.add(fVar3);
                    fVar3.f17240k.add(fVar);
                    this.f17256b.f16956e.f17262h.f17240k.add(fVar);
                    this.f17256b.f16956e.f17263i.f17240k.add(fVar);
                    fVar.f17232b = true;
                    fVar.f17240k.add(eVar7);
                    fVar.f17240k.add(eVar6);
                    eVar7.f17241l.add(fVar);
                    eVar6.f17241l.add(fVar);
                }
            }
        }
        p149v.e eVar13 = this.f17256b;
        c[] cVarArr2 = eVar13.f16940R;
        c cVar4 = cVarArr2[0];
        c cVar5 = cVar4.f16914f;
        if (cVar5 != null && cVarArr2[1].f16914f != null) {
            if (eVar13.y()) {
                eVar7.f17236f = this.f17256b.f16940R[0].e();
                eVar6.f17236f = -this.f17256b.f16940R[1].e();
                return;
            }
            e eVarH5 = n.h(this.f17256b.f16940R[0]);
            e eVarH6 = n.h(this.f17256b.f16940R[1]);
            if (eVarH5 != null) {
                eVarH5.b(this);
            }
            if (eVarH6 != null) {
                eVarH6.b(this);
            }
            this.j = 4;
            return;
        }
        if (cVar5 != null) {
            e eVarH7 = n.h(cVar4);
            if (eVarH7 != null) {
                n.b(eVar7, eVarH7, this.f17256b.f16940R[0].e());
                c(eVar6, eVar7, 1, fVar);
                return;
            }
            return;
        }
        c cVar6 = cVarArr2[1];
        if (cVar6.f16914f != null) {
            e eVarH8 = n.h(cVar6);
            if (eVarH8 != null) {
                n.b(eVar6, eVarH8, -this.f17256b.f16940R[1].e());
                c(eVar7, eVar6, -1, fVar);
                return;
            }
            return;
        }
        if ((eVar13 instanceof p149v.j) || (eVar3 = eVar13.f16944V) == null) {
            return;
        }
        n.b(eVar7, eVar3.f16954d.f17262h, eVar13.s());
        c(eVar6, eVar7, 1, fVar);
    }

    @Override // p154w.n
    public final void e() {
        e eVar = this.f17262h;
        if (eVar.j) {
            this.f17256b.f16950a0 = eVar.f17237g;
        }
    }

    @Override // p154w.n
    public final void f() {
        this.f17257c = null;
        this.f17262h.c();
        this.f17263i.c();
        this.f17259e.c();
        this.f17261g = false;
    }

    @Override // p154w.n
    public final boolean k() {
        return this.f17258d != d.f16920c || this.f17256b.f16981r == 0;
    }

    public final void n() {
        this.f17261g = false;
        e eVar = this.f17262h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f17263i;
        eVar2.c();
        eVar2.j = false;
        this.f17259e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f17256b.f16968k0;
    }
}
