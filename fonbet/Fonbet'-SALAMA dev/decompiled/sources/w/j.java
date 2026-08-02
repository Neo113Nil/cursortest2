package w;

import java.util.ArrayList;
import v.C1652c;
import v.C1654e;
import v.C1659j;
import v.EnumC1653d;

/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f17238k = new int[2];

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

    /* JADX WARN: Code restructure failed: missing block: B:107:0x024a, code lost:
    
        if (r8 != 1) goto L128;
     */
    @Override // w.InterfaceC1671d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC1671d interfaceC1671d) {
        float f7;
        float f8;
        float f9;
        int i7;
        if (t.e.e(this.j) == 3) {
            C1654e c1654e = this.f17250b;
            l(c1654e.f16926J, c1654e.f16928L, 0);
            return;
        }
        f fVar = this.f17253e;
        boolean z4 = fVar.j;
        EnumC1653d enumC1653d = EnumC1653d.f16914c;
        e eVar = this.f17256h;
        e eVar2 = this.f17257i;
        if (!z4 && this.f17252d == enumC1653d) {
            C1654e c1654e2 = this.f17250b;
            int i8 = c1654e2.f16975r;
            if (i8 == 2) {
                C1654e c1654e3 = c1654e2.f16938V;
                if (c1654e3 != null) {
                    if (c1654e3.f16948d.f17253e.j) {
                        fVar.d((int) ((r3.f17231g * c1654e2.f16983w) + 0.5f));
                    }
                }
            } else if (i8 == 3) {
                int i9 = c1654e2.f16977s;
                if (i9 == 0 || i9 == 3) {
                    l lVar = c1654e2.f16950e;
                    e eVar3 = lVar.f17256h;
                    e eVar4 = lVar.f17257i;
                    boolean z7 = c1654e2.f16926J.f16908f != null;
                    boolean z8 = c1654e2.f16927K.f16908f != null;
                    boolean z9 = c1654e2.f16928L.f16908f != null;
                    boolean z10 = c1654e2.f16929M.f16908f != null;
                    int i10 = c1654e2.f16942Z;
                    if (z7 && z8 && z9 && z10) {
                        float f10 = c1654e2.f16941Y;
                        boolean z11 = eVar3.j;
                        int[] iArr = f17238k;
                        if (z11 && eVar4.j) {
                            if (eVar.f17227c && eVar2.f17227c) {
                                m(iArr, ((e) eVar.f17235l.get(0)).f17231g + eVar.f17230f, ((e) eVar2.f17235l.get(0)).f17231g - eVar2.f17230f, eVar3.f17231g + eVar3.f17230f, eVar4.f17231g - eVar4.f17230f, f10, i10);
                                fVar.d(iArr[0]);
                                this.f17250b.f16950e.f17253e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        boolean z12 = eVar.j;
                        ArrayList arrayList = eVar3.f17235l;
                        if (z12 && eVar2.j) {
                            if (!eVar3.f17227c || !eVar4.f17227c) {
                                return;
                            }
                            m(iArr, eVar.f17231g + eVar.f17230f, eVar2.f17231g - eVar2.f17230f, ((e) arrayList.get(0)).f17231g + eVar3.f17230f, ((e) eVar4.f17235l.get(0)).f17231g - eVar4.f17230f, f10, i10);
                            fVar.d(iArr[0]);
                            this.f17250b.f16950e.f17253e.d(iArr[1]);
                        }
                        if (!eVar.f17227c || !eVar2.f17227c || !eVar3.f17227c || !eVar4.f17227c) {
                            return;
                        }
                        m(iArr, ((e) eVar.f17235l.get(0)).f17231g + eVar.f17230f, ((e) eVar2.f17235l.get(0)).f17231g - eVar2.f17230f, ((e) arrayList.get(0)).f17231g + eVar3.f17230f, ((e) eVar4.f17235l.get(0)).f17231g - eVar4.f17230f, f10, i10);
                        fVar.d(iArr[0]);
                        this.f17250b.f16950e.f17253e.d(iArr[1]);
                    } else if (z7 && z9) {
                        if (!eVar.f17227c || !eVar2.f17227c) {
                            return;
                        }
                        float f11 = c1654e2.f16941Y;
                        int i11 = ((e) eVar.f17235l.get(0)).f17231g + eVar.f17230f;
                        int i12 = ((e) eVar2.f17235l.get(0)).f17231g - eVar2.f17230f;
                        if (i10 == -1 || i10 == 0) {
                            int g3 = g(i12 - i11, 0);
                            int i13 = (int) ((g3 * f11) + 0.5f);
                            int g7 = g(i13, 1);
                            if (i13 != g7) {
                                g3 = (int) ((g7 / f11) + 0.5f);
                            }
                            fVar.d(g3);
                            this.f17250b.f16950e.f17253e.d(g7);
                        } else if (i10 == 1) {
                            int g8 = g(i12 - i11, 0);
                            int i14 = (int) ((g8 / f11) + 0.5f);
                            int g9 = g(i14, 1);
                            if (i14 != g9) {
                                g8 = (int) ((g9 * f11) + 0.5f);
                            }
                            fVar.d(g8);
                            this.f17250b.f16950e.f17253e.d(g9);
                        }
                    } else if (z8 && z10) {
                        if (!eVar3.f17227c || !eVar4.f17227c) {
                            return;
                        }
                        float f12 = c1654e2.f16941Y;
                        int i15 = ((e) eVar3.f17235l.get(0)).f17231g + eVar3.f17230f;
                        int i16 = ((e) eVar4.f17235l.get(0)).f17231g - eVar4.f17230f;
                        if (i10 != -1) {
                            if (i10 == 0) {
                                int g10 = g(i16 - i15, 1);
                                int i17 = (int) ((g10 * f12) + 0.5f);
                                int g11 = g(i17, 0);
                                if (i17 != g11) {
                                    g10 = (int) ((g11 / f12) + 0.5f);
                                }
                                fVar.d(g11);
                                this.f17250b.f16950e.f17253e.d(g10);
                            }
                        }
                        int g12 = g(i16 - i15, 1);
                        int i18 = (int) ((g12 / f12) + 0.5f);
                        int g13 = g(i18, 0);
                        if (i18 != g13) {
                            g12 = (int) ((g13 * f12) + 0.5f);
                        }
                        fVar.d(g13);
                        this.f17250b.f16950e.f17253e.d(g12);
                    }
                } else {
                    int i19 = c1654e2.f16942Z;
                    if (i19 == -1) {
                        f7 = c1654e2.f16950e.f17253e.f17231g;
                        f8 = c1654e2.f16941Y;
                    } else if (i19 == 0) {
                        f9 = c1654e2.f16950e.f17253e.f17231g / c1654e2.f16941Y;
                        i7 = (int) (f9 + 0.5f);
                        fVar.d(i7);
                    } else if (i19 != 1) {
                        i7 = 0;
                        fVar.d(i7);
                    } else {
                        f7 = c1654e2.f16950e.f17253e.f17231g;
                        f8 = c1654e2.f16941Y;
                    }
                    f9 = f7 * f8;
                    i7 = (int) (f9 + 0.5f);
                    fVar.d(i7);
                }
            }
        }
        if (eVar.f17227c && eVar2.f17227c) {
            if (eVar.j && eVar2.j && fVar.j) {
                return;
            }
            if (!fVar.j && this.f17252d == enumC1653d) {
                C1654e c1654e4 = this.f17250b;
                if (c1654e4.f16975r == 0 && !c1654e4.y()) {
                    e eVar5 = (e) eVar.f17235l.get(0);
                    e eVar6 = (e) eVar2.f17235l.get(0);
                    int i20 = eVar5.f17231g + eVar.f17230f;
                    int i21 = eVar6.f17231g + eVar2.f17230f;
                    eVar.d(i20);
                    eVar2.d(i21);
                    fVar.d(i21 - i20);
                    return;
                }
            }
            if (!fVar.j && this.f17252d == enumC1653d && this.f17249a == 1 && eVar.f17235l.size() > 0 && eVar2.f17235l.size() > 0) {
                int min = Math.min((((e) eVar2.f17235l.get(0)).f17231g + eVar2.f17230f) - (((e) eVar.f17235l.get(0)).f17231g + eVar.f17230f), fVar.f17236m);
                C1654e c1654e5 = this.f17250b;
                int i22 = c1654e5.f16982v;
                int max = Math.max(c1654e5.f16981u, min);
                if (i22 > 0) {
                    max = Math.min(i22, max);
                }
                fVar.d(max);
            }
            if (fVar.j) {
                e eVar7 = (e) eVar.f17235l.get(0);
                e eVar8 = (e) eVar2.f17235l.get(0);
                int i23 = eVar7.f17231g;
                int i24 = eVar.f17230f + i23;
                int i25 = eVar8.f17231g;
                int i26 = eVar2.f17230f + i25;
                float f13 = this.f17250b.f16953f0;
                if (eVar7 == eVar8) {
                    f13 = 0.5f;
                } else {
                    i23 = i24;
                    i25 = i26;
                }
                eVar.d((int) ((((i25 - i23) - fVar.f17231g) * f13) + i23 + 0.5f));
                eVar2.d(eVar.f17231g + fVar.f17231g);
            }
        }
    }

    @Override // w.n
    public final void d() {
        C1654e c1654e;
        C1654e c1654e2;
        EnumC1653d enumC1653d;
        C1654e c1654e3;
        C1654e c1654e4;
        EnumC1653d enumC1653d2;
        C1654e c1654e5 = this.f17250b;
        boolean z4 = c1654e5.f16943a;
        f fVar = this.f17253e;
        if (z4) {
            fVar.d(c1654e5.r());
        }
        boolean z7 = fVar.j;
        EnumC1653d enumC1653d3 = EnumC1653d.f16915d;
        EnumC1653d enumC1653d4 = EnumC1653d.f16914c;
        EnumC1653d enumC1653d5 = EnumC1653d.f16912a;
        e eVar = this.f17257i;
        e eVar2 = this.f17256h;
        if (!z7) {
            C1654e c1654e6 = this.f17250b;
            EnumC1653d enumC1653d6 = c1654e6.f16937U[0];
            this.f17252d = enumC1653d6;
            if (enumC1653d6 != enumC1653d4) {
                if (enumC1653d6 == enumC1653d3 && (c1654e4 = c1654e6.f16938V) != null && ((enumC1653d2 = c1654e4.f16937U[0]) == enumC1653d5 || enumC1653d2 == enumC1653d3)) {
                    int r7 = (c1654e4.r() - this.f17250b.f16926J.e()) - this.f17250b.f16928L.e();
                    n.b(eVar2, c1654e4.f16948d.f17256h, this.f17250b.f16926J.e());
                    n.b(eVar, c1654e4.f16948d.f17257i, -this.f17250b.f16928L.e());
                    fVar.d(r7);
                    return;
                }
                if (enumC1653d6 == enumC1653d5) {
                    fVar.d(c1654e6.r());
                }
            }
        } else if (this.f17252d == enumC1653d3 && (c1654e2 = (c1654e = this.f17250b).f16938V) != null && ((enumC1653d = c1654e2.f16937U[0]) == enumC1653d5 || enumC1653d == enumC1653d3)) {
            n.b(eVar2, c1654e2.f16948d.f17256h, c1654e.f16926J.e());
            n.b(eVar, c1654e2.f16948d.f17257i, -this.f17250b.f16928L.e());
            return;
        }
        if (fVar.j) {
            C1654e c1654e7 = this.f17250b;
            if (c1654e7.f16943a) {
                C1652c[] c1652cArr = c1654e7.f16934R;
                C1652c c1652c = c1652cArr[0];
                C1652c c1652c2 = c1652c.f16908f;
                if (c1652c2 != null && c1652cArr[1].f16908f != null) {
                    if (c1654e7.y()) {
                        eVar2.f17230f = this.f17250b.f16934R[0].e();
                        eVar.f17230f = -this.f17250b.f16934R[1].e();
                        return;
                    }
                    e h6 = n.h(this.f17250b.f16934R[0]);
                    if (h6 != null) {
                        n.b(eVar2, h6, this.f17250b.f16934R[0].e());
                    }
                    e h7 = n.h(this.f17250b.f16934R[1]);
                    if (h7 != null) {
                        n.b(eVar, h7, -this.f17250b.f16934R[1].e());
                    }
                    eVar2.f17226b = true;
                    eVar.f17226b = true;
                    return;
                }
                if (c1652c2 != null) {
                    e h8 = n.h(c1652c);
                    if (h8 != null) {
                        n.b(eVar2, h8, this.f17250b.f16934R[0].e());
                        n.b(eVar, eVar2, fVar.f17231g);
                        return;
                    }
                    return;
                }
                C1652c c1652c3 = c1652cArr[1];
                if (c1652c3.f16908f != null) {
                    e h9 = n.h(c1652c3);
                    if (h9 != null) {
                        n.b(eVar, h9, -this.f17250b.f16934R[1].e());
                        n.b(eVar2, eVar, -fVar.f17231g);
                        return;
                    }
                    return;
                }
                if ((c1654e7 instanceof C1659j) || c1654e7.f16938V == null || c1654e7.j(7).f16908f != null) {
                    return;
                }
                C1654e c1654e8 = this.f17250b;
                n.b(eVar2, c1654e8.f16938V.f16948d.f17256h, c1654e8.s());
                n.b(eVar, eVar2, fVar.f17231g);
                return;
            }
        }
        if (this.f17252d == enumC1653d4) {
            C1654e c1654e9 = this.f17250b;
            int i7 = c1654e9.f16975r;
            if (i7 == 2) {
                C1654e c1654e10 = c1654e9.f16938V;
                if (c1654e10 != null) {
                    f fVar2 = c1654e10.f16950e.f17253e;
                    fVar.f17235l.add(fVar2);
                    fVar2.f17234k.add(fVar);
                    fVar.f17226b = true;
                    fVar.f17234k.add(eVar2);
                    fVar.f17234k.add(eVar);
                }
            } else if (i7 == 3) {
                if (c1654e9.f16977s == 3) {
                    eVar2.f17225a = this;
                    eVar.f17225a = this;
                    l lVar = c1654e9.f16950e;
                    lVar.f17256h.f17225a = this;
                    lVar.f17257i.f17225a = this;
                    fVar.f17225a = this;
                    if (c1654e9.z()) {
                        fVar.f17235l.add(this.f17250b.f16950e.f17253e);
                        this.f17250b.f16950e.f17253e.f17234k.add(fVar);
                        l lVar2 = this.f17250b.f16950e;
                        lVar2.f17253e.f17225a = this;
                        fVar.f17235l.add(lVar2.f17256h);
                        fVar.f17235l.add(this.f17250b.f16950e.f17257i);
                        this.f17250b.f16950e.f17256h.f17234k.add(fVar);
                        this.f17250b.f16950e.f17257i.f17234k.add(fVar);
                    } else if (this.f17250b.y()) {
                        this.f17250b.f16950e.f17253e.f17235l.add(fVar);
                        fVar.f17234k.add(this.f17250b.f16950e.f17253e);
                    } else {
                        this.f17250b.f16950e.f17253e.f17235l.add(fVar);
                    }
                } else {
                    f fVar3 = c1654e9.f16950e.f17253e;
                    fVar.f17235l.add(fVar3);
                    fVar3.f17234k.add(fVar);
                    this.f17250b.f16950e.f17256h.f17234k.add(fVar);
                    this.f17250b.f16950e.f17257i.f17234k.add(fVar);
                    fVar.f17226b = true;
                    fVar.f17234k.add(eVar2);
                    fVar.f17234k.add(eVar);
                    eVar2.f17235l.add(fVar);
                    eVar.f17235l.add(fVar);
                }
            }
        }
        C1654e c1654e11 = this.f17250b;
        C1652c[] c1652cArr2 = c1654e11.f16934R;
        C1652c c1652c4 = c1652cArr2[0];
        C1652c c1652c5 = c1652c4.f16908f;
        if (c1652c5 != null && c1652cArr2[1].f16908f != null) {
            if (c1654e11.y()) {
                eVar2.f17230f = this.f17250b.f16934R[0].e();
                eVar.f17230f = -this.f17250b.f16934R[1].e();
                return;
            }
            e h10 = n.h(this.f17250b.f16934R[0]);
            e h11 = n.h(this.f17250b.f16934R[1]);
            if (h10 != null) {
                h10.b(this);
            }
            if (h11 != null) {
                h11.b(this);
            }
            this.j = 4;
            return;
        }
        if (c1652c5 != null) {
            e h12 = n.h(c1652c4);
            if (h12 != null) {
                n.b(eVar2, h12, this.f17250b.f16934R[0].e());
                c(eVar, eVar2, 1, fVar);
                return;
            }
            return;
        }
        C1652c c1652c6 = c1652cArr2[1];
        if (c1652c6.f16908f != null) {
            e h13 = n.h(c1652c6);
            if (h13 != null) {
                n.b(eVar, h13, -this.f17250b.f16934R[1].e());
                c(eVar2, eVar, -1, fVar);
                return;
            }
            return;
        }
        if ((c1654e11 instanceof C1659j) || (c1654e3 = c1654e11.f16938V) == null) {
            return;
        }
        n.b(eVar2, c1654e3.f16948d.f17256h, c1654e11.s());
        c(eVar, eVar2, 1, fVar);
    }

    @Override // w.n
    public final void e() {
        e eVar = this.f17256h;
        if (eVar.j) {
            this.f17250b.f16944a0 = eVar.f17231g;
        }
    }

    @Override // w.n
    public final void f() {
        this.f17251c = null;
        this.f17256h.c();
        this.f17257i.c();
        this.f17253e.c();
        this.f17255g = false;
    }

    @Override // w.n
    public final boolean k() {
        return this.f17252d != EnumC1653d.f16914c || this.f17250b.f16975r == 0;
    }

    public final void n() {
        this.f17255g = false;
        e eVar = this.f17256h;
        eVar.c();
        eVar.j = false;
        e eVar2 = this.f17257i;
        eVar2.c();
        eVar2.j = false;
        this.f17253e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f17250b.f16962k0;
    }
}
