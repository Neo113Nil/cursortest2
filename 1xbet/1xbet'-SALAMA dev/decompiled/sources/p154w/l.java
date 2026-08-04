package p154w;

import p136t.e;
import p149v.c;
import p149v.d;
import p149v.j;

/* JADX INFO: loaded from: classes.dex */
public final class l extends n {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f17247k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f17248l;

    @Override // p154w.d
    public final void a(d dVar) {
        float f7;
        float f8;
        float f9;
        int i7;
        if (e.e(this.j) == 3) {
            p149v.e eVar = this.f17256b;
            l(eVar.f16933K, eVar.f16935M, 1);
            return;
        }
        f fVar = this.f17259e;
        boolean z4 = fVar.f17233c;
        d dVar2 = d.f16920c;
        if (z4 && !fVar.j && this.f17258d == dVar2) {
            p149v.e eVar2 = this.f17256b;
            int i8 = eVar2.f16983s;
            if (i8 == 2) {
                p149v.e eVar3 = eVar2.f16944V;
                if (eVar3 != null) {
                    f fVar2 = eVar3.f16956e.f17259e;
                    if (fVar2.j) {
                        fVar.d((int) ((fVar2.f17237g * eVar2.f16992z) + 0.5f));
                    }
                }
            } else if (i8 == 3) {
                f fVar3 = eVar2.f16954d.f17259e;
                if (fVar3.j) {
                    int i9 = eVar2.f16948Z;
                    if (i9 != -1) {
                        if (i9 == 0) {
                            f9 = fVar3.f17237g * eVar2.f16947Y;
                            i7 = (int) (f9 + 0.5f);
                        } else if (i9 != 1) {
                            i7 = 0;
                        } else {
                            f7 = fVar3.f17237g;
                            f8 = eVar2.f16947Y;
                        }
                        fVar.d(i7);
                    } else {
                        f7 = fVar3.f17237g;
                        f8 = eVar2.f16947Y;
                    }
                    f9 = f7 / f8;
                    i7 = (int) (f9 + 0.5f);
                    fVar.d(i7);
                }
            }
        }
        e eVar4 = this.f17262h;
        if (eVar4.f17233c) {
            e eVar5 = this.f17263i;
            if (eVar5.f17233c) {
                if (eVar4.j && eVar5.j && fVar.j) {
                    return;
                }
                if (!fVar.j && this.f17258d == dVar2) {
                    p149v.e eVar6 = this.f17256b;
                    if (eVar6.f16981r == 0 && !eVar6.z()) {
                        e eVar7 = (e) eVar4.f17241l.get(0);
                        e eVar8 = (e) eVar5.f17241l.get(0);
                        int i10 = eVar7.f17237g + eVar4.f17236f;
                        int i11 = eVar8.f17237g + eVar5.f17236f;
                        eVar4.d(i10);
                        eVar5.d(i11);
                        fVar.d(i11 - i10);
                        return;
                    }
                }
                if (!fVar.j && this.f17258d == dVar2 && this.f17255a == 1 && eVar4.f17241l.size() > 0 && eVar5.f17241l.size() > 0) {
                    e eVar9 = (e) eVar4.f17241l.get(0);
                    int i12 = (((e) eVar5.f17241l.get(0)).f17237g + eVar5.f17236f) - (eVar9.f17237g + eVar4.f17236f);
                    int i13 = fVar.f17242m;
                    if (i12 < i13) {
                        fVar.d(i12);
                    } else {
                        fVar.d(i13);
                    }
                }
                if (fVar.j && eVar4.f17241l.size() > 0 && eVar5.f17241l.size() > 0) {
                    e eVar10 = (e) eVar4.f17241l.get(0);
                    e eVar11 = (e) eVar5.f17241l.get(0);
                    int i14 = eVar10.f17237g;
                    int i15 = eVar4.f17236f + i14;
                    int i16 = eVar11.f17237g;
                    int i17 = eVar5.f17236f + i16;
                    float f10 = this.f17256b.f16961g0;
                    if (eVar10 == eVar11) {
                        f10 = 0.5f;
                    } else {
                        i14 = i15;
                        i16 = i17;
                    }
                    eVar4.d((int) ((((i16 - i14) - fVar.f17237g) * f10) + i14 + 0.5f));
                    eVar5.d(eVar4.f17237g + fVar.f17237g);
                }
            }
        }
    }

    @Override // p154w.n
    public final void d() {
        p149v.e eVar;
        p149v.e eVar2;
        p149v.e eVar3;
        p149v.e eVar4;
        p149v.e eVar5 = this.f17256b;
        boolean z4 = eVar5.f16949a;
        f fVar = this.f17259e;
        if (z4) {
            fVar.d(eVar5.l());
        }
        boolean z7 = fVar.j;
        d dVar = d.f16921d;
        d dVar2 = d.f16918a;
        d dVar3 = d.f16920c;
        e eVar6 = this.f17263i;
        e eVar7 = this.f17262h;
        if (!z7) {
            p149v.e eVar8 = this.f17256b;
            this.f17258d = eVar8.f16943U[1];
            if (eVar8.f16927E) {
                this.f17248l = new a(this);
            }
            d dVar4 = this.f17258d;
            if (dVar4 != dVar3) {
                if (dVar4 == dVar && (eVar4 = this.f17256b.f16944V) != null && eVar4.f16943U[1] == dVar2) {
                    int iL = (eVar4.l() - this.f17256b.f16933K.e()) - this.f17256b.f16935M.e();
                    n.b(eVar7, eVar4.f16956e.f17262h, this.f17256b.f16933K.e());
                    n.b(eVar6, eVar4.f16956e.f17263i, -this.f17256b.f16935M.e());
                    fVar.d(iL);
                    return;
                }
                if (dVar4 == dVar2) {
                    fVar.d(this.f17256b.l());
                }
            }
        } else if (this.f17258d == dVar && (eVar2 = (eVar = this.f17256b).f16944V) != null && eVar2.f16943U[1] == dVar2) {
            n.b(eVar7, eVar2.f16956e.f17262h, eVar.f16933K.e());
            n.b(eVar6, eVar2.f16956e.f17263i, -this.f17256b.f16935M.e());
            return;
        }
        boolean z8 = fVar.j;
        e eVar9 = this.f17247k;
        if (z8) {
            p149v.e eVar10 = this.f17256b;
            if (eVar10.f16949a) {
                c[] cVarArr = eVar10.f16940R;
                c cVar = cVarArr[2];
                c cVar2 = cVar.f16914f;
                if (cVar2 != null && cVarArr[3].f16914f != null) {
                    if (eVar10.z()) {
                        eVar7.f17236f = this.f17256b.f16940R[2].e();
                        eVar6.f17236f = -this.f17256b.f16940R[3].e();
                    } else {
                        e eVarH = n.h(this.f17256b.f16940R[2]);
                        if (eVarH != null) {
                            n.b(eVar7, eVarH, this.f17256b.f16940R[2].e());
                        }
                        e eVarH2 = n.h(this.f17256b.f16940R[3]);
                        if (eVarH2 != null) {
                            n.b(eVar6, eVarH2, -this.f17256b.f16940R[3].e());
                        }
                        eVar7.f17232b = true;
                        eVar6.f17232b = true;
                    }
                    p149v.e eVar11 = this.f17256b;
                    if (eVar11.f16927E) {
                        n.b(eVar9, eVar7, eVar11.c0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    e eVarH3 = n.h(cVar);
                    if (eVarH3 != null) {
                        n.b(eVar7, eVarH3, this.f17256b.f16940R[2].e());
                        n.b(eVar6, eVar7, fVar.f17237g);
                        p149v.e eVar12 = this.f17256b;
                        if (eVar12.f16927E) {
                            n.b(eVar9, eVar7, eVar12.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                c cVar3 = cVarArr[3];
                if (cVar3.f16914f != null) {
                    e eVarH4 = n.h(cVar3);
                    if (eVarH4 != null) {
                        n.b(eVar6, eVarH4, -this.f17256b.f16940R[3].e());
                        n.b(eVar7, eVar6, -fVar.f17237g);
                    }
                    p149v.e eVar13 = this.f17256b;
                    if (eVar13.f16927E) {
                        n.b(eVar9, eVar7, eVar13.c0);
                        return;
                    }
                    return;
                }
                c cVar4 = cVarArr[4];
                if (cVar4.f16914f != null) {
                    e eVarH5 = n.h(cVar4);
                    if (eVarH5 != null) {
                        n.b(eVar9, eVarH5, 0);
                        n.b(eVar7, eVar9, -this.f17256b.c0);
                        n.b(eVar6, eVar7, fVar.f17237g);
                        return;
                    }
                    return;
                }
                if ((eVar10 instanceof j) || eVar10.f16944V == null || eVar10.j(7).f16914f != null) {
                    return;
                }
                p149v.e eVar14 = this.f17256b;
                n.b(eVar7, eVar14.f16944V.f16956e.f17262h, eVar14.t());
                n.b(eVar6, eVar7, fVar.f17237g);
                p149v.e eVar15 = this.f17256b;
                if (eVar15.f16927E) {
                    n.b(eVar9, eVar7, eVar15.c0);
                    return;
                }
                return;
            }
        }
        if (z8 || this.f17258d != dVar3) {
            fVar.b(this);
        } else {
            p149v.e eVar16 = this.f17256b;
            int i7 = eVar16.f16983s;
            if (i7 == 2) {
                p149v.e eVar17 = eVar16.f16944V;
                if (eVar17 != null) {
                    f fVar2 = eVar17.f16956e.f17259e;
                    fVar.f17241l.add(fVar2);
                    fVar2.f17240k.add(fVar);
                    fVar.f17232b = true;
                    fVar.f17240k.add(eVar7);
                    fVar.f17240k.add(eVar6);
                }
            } else if (i7 == 3 && !eVar16.z()) {
                p149v.e eVar18 = this.f17256b;
                if (eVar18.f16981r != 3) {
                    f fVar3 = eVar18.f16954d.f17259e;
                    fVar.f17241l.add(fVar3);
                    fVar3.f17240k.add(fVar);
                    fVar.f17232b = true;
                    fVar.f17240k.add(eVar7);
                    fVar.f17240k.add(eVar6);
                }
            }
        }
        p149v.e eVar19 = this.f17256b;
        c[] cVarArr2 = eVar19.f16940R;
        c cVar5 = cVarArr2[2];
        c cVar6 = cVar5.f16914f;
        if (cVar6 != null && cVarArr2[3].f16914f != null) {
            if (eVar19.z()) {
                eVar7.f17236f = this.f17256b.f16940R[2].e();
                eVar6.f17236f = -this.f17256b.f16940R[3].e();
            } else {
                e eVarH6 = n.h(this.f17256b.f16940R[2]);
                e eVarH7 = n.h(this.f17256b.f16940R[3]);
                if (eVarH6 != null) {
                    eVarH6.b(this);
                }
                if (eVarH7 != null) {
                    eVarH7.b(this);
                }
                this.j = 4;
            }
            if (this.f17256b.f16927E) {
                c(eVar9, eVar7, 1, this.f17248l);
            }
        } else if (cVar6 != null) {
            e eVarH8 = n.h(cVar5);
            if (eVarH8 != null) {
                n.b(eVar7, eVarH8, this.f17256b.f16940R[2].e());
                c(eVar6, eVar7, 1, fVar);
                if (this.f17256b.f16927E) {
                    c(eVar9, eVar7, 1, this.f17248l);
                }
                if (this.f17258d == dVar3) {
                    p149v.e eVar20 = this.f17256b;
                    if (eVar20.f16947Y > 0.0f) {
                        j jVar = eVar20.f16954d;
                        if (jVar.f17258d == dVar3) {
                            jVar.f17259e.f17240k.add(fVar);
                            fVar.f17241l.add(this.f17256b.f16954d.f17259e);
                            fVar.f17231a = this;
                        }
                    }
                }
            }
        } else {
            c cVar7 = cVarArr2[3];
            if (cVar7.f16914f != null) {
                e eVarH9 = n.h(cVar7);
                if (eVarH9 != null) {
                    n.b(eVar6, eVarH9, -this.f17256b.f16940R[3].e());
                    c(eVar7, eVar6, -1, fVar);
                    if (this.f17256b.f16927E) {
                        c(eVar9, eVar7, 1, this.f17248l);
                    }
                }
            } else {
                c cVar8 = cVarArr2[4];
                if (cVar8.f16914f != null) {
                    e eVarH10 = n.h(cVar8);
                    if (eVarH10 != null) {
                        n.b(eVar9, eVarH10, 0);
                        c(eVar7, eVar9, -1, this.f17248l);
                        c(eVar6, eVar7, 1, fVar);
                    }
                } else if (!(eVar19 instanceof j) && (eVar3 = eVar19.f16944V) != null) {
                    n.b(eVar7, eVar3.f16956e.f17262h, eVar19.t());
                    c(eVar6, eVar7, 1, fVar);
                    if (this.f17256b.f16927E) {
                        c(eVar9, eVar7, 1, this.f17248l);
                    }
                    if (this.f17258d == dVar3) {
                        p149v.e eVar21 = this.f17256b;
                        if (eVar21.f16947Y > 0.0f) {
                            j jVar2 = eVar21.f16954d;
                            if (jVar2.f17258d == dVar3) {
                                jVar2.f17259e.f17240k.add(fVar);
                                fVar.f17241l.add(this.f17256b.f16954d.f17259e);
                                fVar.f17231a = this;
                            }
                        }
                    }
                }
            }
        }
        if (fVar.f17241l.size() == 0) {
            fVar.f17233c = true;
        }
    }

    @Override // p154w.n
    public final void e() {
        e eVar = this.f17262h;
        if (eVar.j) {
            this.f17256b.f16952b0 = eVar.f17237g;
        }
    }

    @Override // p154w.n
    public final void f() {
        this.f17257c = null;
        this.f17262h.c();
        this.f17263i.c();
        this.f17247k.c();
        this.f17259e.c();
        this.f17261g = false;
    }

    @Override // p154w.n
    public final boolean k() {
        return this.f17258d != d.f16920c || this.f17256b.f16983s == 0;
    }

    public final void m() {
        this.f17261g = false;
        e eVar = this.f17262h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f17263i;
        eVar2.c();
        eVar2.j = false;
        e eVar3 = this.f17247k;
        eVar3.c();
        eVar3.j = false;
        this.f17259e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f17256b.f16968k0;
    }
}
