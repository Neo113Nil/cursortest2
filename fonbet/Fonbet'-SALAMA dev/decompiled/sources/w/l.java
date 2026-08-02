package w;

import v.C1652c;
import v.C1654e;
import v.C1659j;
import v.EnumC1653d;

/* loaded from: classes.dex */
public final class l extends n {

    /* renamed from: k, reason: collision with root package name */
    public e f17241k;

    /* renamed from: l, reason: collision with root package name */
    public C1668a f17242l;

    @Override // w.InterfaceC1671d
    public final void a(InterfaceC1671d interfaceC1671d) {
        float f7;
        float f8;
        float f9;
        int i7;
        if (t.e.e(this.j) == 3) {
            C1654e c1654e = this.f17250b;
            l(c1654e.f16927K, c1654e.f16929M, 1);
            return;
        }
        f fVar = this.f17253e;
        boolean z4 = fVar.f17227c;
        EnumC1653d enumC1653d = EnumC1653d.f16914c;
        if (z4 && !fVar.j && this.f17252d == enumC1653d) {
            C1654e c1654e2 = this.f17250b;
            int i8 = c1654e2.f16977s;
            if (i8 == 2) {
                C1654e c1654e3 = c1654e2.f16938V;
                if (c1654e3 != null) {
                    if (c1654e3.f16950e.f17253e.j) {
                        fVar.d((int) ((r1.f17231g * c1654e2.f16986z) + 0.5f));
                    }
                }
            } else if (i8 == 3) {
                f fVar2 = c1654e2.f16948d.f17253e;
                if (fVar2.j) {
                    int i9 = c1654e2.f16942Z;
                    if (i9 == -1) {
                        f7 = fVar2.f17231g;
                        f8 = c1654e2.f16941Y;
                    } else if (i9 == 0) {
                        f9 = fVar2.f17231g * c1654e2.f16941Y;
                        i7 = (int) (f9 + 0.5f);
                        fVar.d(i7);
                    } else if (i9 != 1) {
                        i7 = 0;
                        fVar.d(i7);
                    } else {
                        f7 = fVar2.f17231g;
                        f8 = c1654e2.f16941Y;
                    }
                    f9 = f7 / f8;
                    i7 = (int) (f9 + 0.5f);
                    fVar.d(i7);
                }
            }
        }
        e eVar = this.f17256h;
        if (eVar.f17227c) {
            e eVar2 = this.f17257i;
            if (eVar2.f17227c) {
                if (eVar.j && eVar2.j && fVar.j) {
                    return;
                }
                if (!fVar.j && this.f17252d == enumC1653d) {
                    C1654e c1654e4 = this.f17250b;
                    if (c1654e4.f16975r == 0 && !c1654e4.z()) {
                        e eVar3 = (e) eVar.f17235l.get(0);
                        e eVar4 = (e) eVar2.f17235l.get(0);
                        int i10 = eVar3.f17231g + eVar.f17230f;
                        int i11 = eVar4.f17231g + eVar2.f17230f;
                        eVar.d(i10);
                        eVar2.d(i11);
                        fVar.d(i11 - i10);
                        return;
                    }
                }
                if (!fVar.j && this.f17252d == enumC1653d && this.f17249a == 1 && eVar.f17235l.size() > 0 && eVar2.f17235l.size() > 0) {
                    e eVar5 = (e) eVar.f17235l.get(0);
                    int i12 = (((e) eVar2.f17235l.get(0)).f17231g + eVar2.f17230f) - (eVar5.f17231g + eVar.f17230f);
                    int i13 = fVar.f17236m;
                    if (i12 < i13) {
                        fVar.d(i12);
                    } else {
                        fVar.d(i13);
                    }
                }
                if (fVar.j && eVar.f17235l.size() > 0 && eVar2.f17235l.size() > 0) {
                    e eVar6 = (e) eVar.f17235l.get(0);
                    e eVar7 = (e) eVar2.f17235l.get(0);
                    int i14 = eVar6.f17231g;
                    int i15 = eVar.f17230f + i14;
                    int i16 = eVar7.f17231g;
                    int i17 = eVar2.f17230f + i16;
                    float f10 = this.f17250b.f16955g0;
                    if (eVar6 == eVar7) {
                        f10 = 0.5f;
                    } else {
                        i14 = i15;
                        i16 = i17;
                    }
                    eVar.d((int) ((((i16 - i14) - fVar.f17231g) * f10) + i14 + 0.5f));
                    eVar2.d(eVar.f17231g + fVar.f17231g);
                }
            }
        }
    }

    @Override // w.n
    public final void d() {
        C1654e c1654e;
        C1654e c1654e2;
        C1654e c1654e3;
        C1654e c1654e4;
        C1654e c1654e5 = this.f17250b;
        boolean z4 = c1654e5.f16943a;
        f fVar = this.f17253e;
        if (z4) {
            fVar.d(c1654e5.l());
        }
        boolean z7 = fVar.j;
        EnumC1653d enumC1653d = EnumC1653d.f16915d;
        EnumC1653d enumC1653d2 = EnumC1653d.f16912a;
        EnumC1653d enumC1653d3 = EnumC1653d.f16914c;
        e eVar = this.f17257i;
        e eVar2 = this.f17256h;
        if (!z7) {
            C1654e c1654e6 = this.f17250b;
            this.f17252d = c1654e6.f16937U[1];
            if (c1654e6.f16921E) {
                this.f17242l = new C1668a(this);
            }
            EnumC1653d enumC1653d4 = this.f17252d;
            if (enumC1653d4 != enumC1653d3) {
                if (enumC1653d4 == enumC1653d && (c1654e4 = this.f17250b.f16938V) != null && c1654e4.f16937U[1] == enumC1653d2) {
                    int l7 = (c1654e4.l() - this.f17250b.f16927K.e()) - this.f17250b.f16929M.e();
                    n.b(eVar2, c1654e4.f16950e.f17256h, this.f17250b.f16927K.e());
                    n.b(eVar, c1654e4.f16950e.f17257i, -this.f17250b.f16929M.e());
                    fVar.d(l7);
                    return;
                }
                if (enumC1653d4 == enumC1653d2) {
                    fVar.d(this.f17250b.l());
                }
            }
        } else if (this.f17252d == enumC1653d && (c1654e2 = (c1654e = this.f17250b).f16938V) != null && c1654e2.f16937U[1] == enumC1653d2) {
            n.b(eVar2, c1654e2.f16950e.f17256h, c1654e.f16927K.e());
            n.b(eVar, c1654e2.f16950e.f17257i, -this.f17250b.f16929M.e());
            return;
        }
        boolean z8 = fVar.j;
        e eVar3 = this.f17241k;
        if (z8) {
            C1654e c1654e7 = this.f17250b;
            if (c1654e7.f16943a) {
                C1652c[] c1652cArr = c1654e7.f16934R;
                C1652c c1652c = c1652cArr[2];
                C1652c c1652c2 = c1652c.f16908f;
                if (c1652c2 != null && c1652cArr[3].f16908f != null) {
                    if (c1654e7.z()) {
                        eVar2.f17230f = this.f17250b.f16934R[2].e();
                        eVar.f17230f = -this.f17250b.f16934R[3].e();
                    } else {
                        e h6 = n.h(this.f17250b.f16934R[2]);
                        if (h6 != null) {
                            n.b(eVar2, h6, this.f17250b.f16934R[2].e());
                        }
                        e h7 = n.h(this.f17250b.f16934R[3]);
                        if (h7 != null) {
                            n.b(eVar, h7, -this.f17250b.f16934R[3].e());
                        }
                        eVar2.f17226b = true;
                        eVar.f17226b = true;
                    }
                    C1654e c1654e8 = this.f17250b;
                    if (c1654e8.f16921E) {
                        n.b(eVar3, eVar2, c1654e8.c0);
                        return;
                    }
                    return;
                }
                if (c1652c2 != null) {
                    e h8 = n.h(c1652c);
                    if (h8 != null) {
                        n.b(eVar2, h8, this.f17250b.f16934R[2].e());
                        n.b(eVar, eVar2, fVar.f17231g);
                        C1654e c1654e9 = this.f17250b;
                        if (c1654e9.f16921E) {
                            n.b(eVar3, eVar2, c1654e9.c0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C1652c c1652c3 = c1652cArr[3];
                if (c1652c3.f16908f != null) {
                    e h9 = n.h(c1652c3);
                    if (h9 != null) {
                        n.b(eVar, h9, -this.f17250b.f16934R[3].e());
                        n.b(eVar2, eVar, -fVar.f17231g);
                    }
                    C1654e c1654e10 = this.f17250b;
                    if (c1654e10.f16921E) {
                        n.b(eVar3, eVar2, c1654e10.c0);
                        return;
                    }
                    return;
                }
                C1652c c1652c4 = c1652cArr[4];
                if (c1652c4.f16908f != null) {
                    e h10 = n.h(c1652c4);
                    if (h10 != null) {
                        n.b(eVar3, h10, 0);
                        n.b(eVar2, eVar3, -this.f17250b.c0);
                        n.b(eVar, eVar2, fVar.f17231g);
                        return;
                    }
                    return;
                }
                if ((c1654e7 instanceof C1659j) || c1654e7.f16938V == null || c1654e7.j(7).f16908f != null) {
                    return;
                }
                C1654e c1654e11 = this.f17250b;
                n.b(eVar2, c1654e11.f16938V.f16950e.f17256h, c1654e11.t());
                n.b(eVar, eVar2, fVar.f17231g);
                C1654e c1654e12 = this.f17250b;
                if (c1654e12.f16921E) {
                    n.b(eVar3, eVar2, c1654e12.c0);
                    return;
                }
                return;
            }
        }
        if (z8 || this.f17252d != enumC1653d3) {
            fVar.b(this);
        } else {
            C1654e c1654e13 = this.f17250b;
            int i7 = c1654e13.f16977s;
            if (i7 == 2) {
                C1654e c1654e14 = c1654e13.f16938V;
                if (c1654e14 != null) {
                    f fVar2 = c1654e14.f16950e.f17253e;
                    fVar.f17235l.add(fVar2);
                    fVar2.f17234k.add(fVar);
                    fVar.f17226b = true;
                    fVar.f17234k.add(eVar2);
                    fVar.f17234k.add(eVar);
                }
            } else if (i7 == 3 && !c1654e13.z()) {
                C1654e c1654e15 = this.f17250b;
                if (c1654e15.f16975r != 3) {
                    f fVar3 = c1654e15.f16948d.f17253e;
                    fVar.f17235l.add(fVar3);
                    fVar3.f17234k.add(fVar);
                    fVar.f17226b = true;
                    fVar.f17234k.add(eVar2);
                    fVar.f17234k.add(eVar);
                }
            }
        }
        C1654e c1654e16 = this.f17250b;
        C1652c[] c1652cArr2 = c1654e16.f16934R;
        C1652c c1652c5 = c1652cArr2[2];
        C1652c c1652c6 = c1652c5.f16908f;
        if (c1652c6 != null && c1652cArr2[3].f16908f != null) {
            if (c1654e16.z()) {
                eVar2.f17230f = this.f17250b.f16934R[2].e();
                eVar.f17230f = -this.f17250b.f16934R[3].e();
            } else {
                e h11 = n.h(this.f17250b.f16934R[2]);
                e h12 = n.h(this.f17250b.f16934R[3]);
                if (h11 != null) {
                    h11.b(this);
                }
                if (h12 != null) {
                    h12.b(this);
                }
                this.j = 4;
            }
            if (this.f17250b.f16921E) {
                c(eVar3, eVar2, 1, this.f17242l);
            }
        } else if (c1652c6 != null) {
            e h13 = n.h(c1652c5);
            if (h13 != null) {
                n.b(eVar2, h13, this.f17250b.f16934R[2].e());
                c(eVar, eVar2, 1, fVar);
                if (this.f17250b.f16921E) {
                    c(eVar3, eVar2, 1, this.f17242l);
                }
                if (this.f17252d == enumC1653d3) {
                    C1654e c1654e17 = this.f17250b;
                    if (c1654e17.f16941Y > 0.0f) {
                        j jVar = c1654e17.f16948d;
                        if (jVar.f17252d == enumC1653d3) {
                            jVar.f17253e.f17234k.add(fVar);
                            fVar.f17235l.add(this.f17250b.f16948d.f17253e);
                            fVar.f17225a = this;
                        }
                    }
                }
            }
        } else {
            C1652c c1652c7 = c1652cArr2[3];
            if (c1652c7.f16908f != null) {
                e h14 = n.h(c1652c7);
                if (h14 != null) {
                    n.b(eVar, h14, -this.f17250b.f16934R[3].e());
                    c(eVar2, eVar, -1, fVar);
                    if (this.f17250b.f16921E) {
                        c(eVar3, eVar2, 1, this.f17242l);
                    }
                }
            } else {
                C1652c c1652c8 = c1652cArr2[4];
                if (c1652c8.f16908f != null) {
                    e h15 = n.h(c1652c8);
                    if (h15 != null) {
                        n.b(eVar3, h15, 0);
                        c(eVar2, eVar3, -1, this.f17242l);
                        c(eVar, eVar2, 1, fVar);
                    }
                } else if (!(c1654e16 instanceof C1659j) && (c1654e3 = c1654e16.f16938V) != null) {
                    n.b(eVar2, c1654e3.f16950e.f17256h, c1654e16.t());
                    c(eVar, eVar2, 1, fVar);
                    if (this.f17250b.f16921E) {
                        c(eVar3, eVar2, 1, this.f17242l);
                    }
                    if (this.f17252d == enumC1653d3) {
                        C1654e c1654e18 = this.f17250b;
                        if (c1654e18.f16941Y > 0.0f) {
                            j jVar2 = c1654e18.f16948d;
                            if (jVar2.f17252d == enumC1653d3) {
                                jVar2.f17253e.f17234k.add(fVar);
                                fVar.f17235l.add(this.f17250b.f16948d.f17253e);
                                fVar.f17225a = this;
                            }
                        }
                    }
                }
            }
        }
        if (fVar.f17235l.size() == 0) {
            fVar.f17227c = true;
        }
    }

    @Override // w.n
    public final void e() {
        e eVar = this.f17256h;
        if (eVar.j) {
            this.f17250b.f16946b0 = eVar.f17231g;
        }
    }

    @Override // w.n
    public final void f() {
        this.f17251c = null;
        this.f17256h.c();
        this.f17257i.c();
        this.f17241k.c();
        this.f17253e.c();
        this.f17255g = false;
    }

    @Override // w.n
    public final boolean k() {
        return this.f17252d != EnumC1653d.f16914c || this.f17250b.f16977s == 0;
    }

    public final void m() {
        this.f17255g = false;
        e eVar = this.f17256h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f17257i;
        eVar2.c();
        eVar2.j = false;
        e eVar3 = this.f17241k;
        eVar3.c();
        eVar3.j = false;
        this.f17253e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f17250b.f16962k0;
    }
}
