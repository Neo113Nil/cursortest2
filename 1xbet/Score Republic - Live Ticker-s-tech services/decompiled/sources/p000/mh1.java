package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class mh1 extends bj1 {

    /* JADX INFO: renamed from: k */
    public C0629qs f5047k;

    /* JADX INFO: renamed from: l */
    public C0686sb f5048l;

    @Override // p000.InterfaceC0518ns
    /* JADX INFO: renamed from: a */
    public final void mo1751a(InterfaceC0518ns interfaceC0518ns) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC0024an.m292o(this.f898j) == 3) {
            C0143dm c0143dm = this.f890b;
            m714l(c0143dm.f1689I, c0143dm.f1691K, 1);
            return;
        }
        C0074bt c0074bt = this.f893e;
        if (c0074bt.f6574c && !c0074bt.f6581j && this.f892d == 3) {
            C0143dm c0143dm2 = this.f890b;
            int i2 = c0143dm2.f1740s;
            if (i2 == 2) {
                C0143dm c0143dm3 = c0143dm2.f1699S;
                if (c0143dm3 != null) {
                    C0074bt c0074bt2 = c0143dm3.f1715e.f893e;
                    if (c0074bt2.f6581j) {
                        c0074bt.mo759d((int) ((c0074bt2.f6578g * c0143dm2.f1747z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C0074bt c0074bt3 = c0143dm2.f1713d.f893e;
                if (c0074bt3.f6581j) {
                    int i3 = c0143dm2.f1703W;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c0074bt3.f6578g * c0143dm2.f1702V;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c0074bt3.f6578g;
                            f2 = c0143dm2.f1702V;
                        }
                        c0074bt.mo759d(i);
                    } else {
                        f = c0074bt3.f6578g;
                        f2 = c0143dm2.f1702V;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c0074bt.mo759d(i);
                }
            }
        }
        C0629qs c0629qs = this.f896h;
        boolean z = c0629qs.f6574c;
        ArrayList arrayList = c0629qs.f6583l;
        if (z) {
            C0629qs c0629qs2 = this.f897i;
            boolean z2 = c0629qs2.f6574c;
            ArrayList arrayList2 = c0629qs2.f6583l;
            if (z2) {
                if (c0629qs.f6581j && c0629qs2.f6581j && c0074bt.f6581j) {
                    return;
                }
                if (!c0074bt.f6581j && this.f892d == 3) {
                    C0143dm c0143dm4 = this.f890b;
                    if (c0143dm4.f1739r == 0 && !c0143dm4.m1268w()) {
                        C0629qs c0629qs3 = (C0629qs) arrayList.get(0);
                        C0629qs c0629qs4 = (C0629qs) arrayList2.get(0);
                        int i4 = c0629qs3.f6578g + c0629qs.f6577f;
                        int i5 = c0629qs4.f6578g + c0629qs2.f6577f;
                        c0629qs.mo759d(i4);
                        c0629qs2.mo759d(i5);
                        c0074bt.mo759d(i5 - i4);
                        return;
                    }
                }
                if (!c0074bt.f6581j && this.f892d == 3 && this.f889a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0629qs c0629qs5 = (C0629qs) arrayList.get(0);
                    int i6 = (((C0629qs) arrayList2.get(0)).f6578g + c0629qs2.f6577f) - (c0629qs5.f6578g + c0629qs.f6577f);
                    int i7 = c0074bt.f976m;
                    if (i6 < i7) {
                        c0074bt.mo759d(i6);
                    } else {
                        c0074bt.mo759d(i7);
                    }
                }
                if (c0074bt.f6581j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C0629qs c0629qs6 = (C0629qs) arrayList.get(0);
                    C0629qs c0629qs7 = (C0629qs) arrayList2.get(0);
                    int i8 = c0629qs6.f6578g;
                    int i9 = c0629qs.f6577f + i8;
                    int i10 = c0629qs7.f6578g;
                    int i11 = c0629qs2.f6577f + i10;
                    float f4 = this.f890b.f1714d0;
                    if (c0629qs6 == c0629qs7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c0629qs.mo759d((int) ((((i10 - i8) - c0074bt.f6578g) * f4) + i8 + 0.5f));
                    c0629qs2.mo759d(c0629qs.f6578g + c0074bt.f6578g);
                }
            }
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: d */
    public final void mo708d() {
        C0143dm c0143dm;
        C0143dm c0143dm2;
        C0143dm c0143dm3;
        C0143dm c0143dm4;
        C0629qs c0629qs = this.f5047k;
        C0143dm c0143dm5 = this.f890b;
        boolean z = c0143dm5.f1707a;
        C0074bt c0074bt = this.f893e;
        if (z) {
            c0074bt.mo759d(c0143dm5.m1256i());
        }
        boolean z2 = c0074bt.f6581j;
        ArrayList arrayList = c0074bt.f6582k;
        ArrayList arrayList2 = c0074bt.f6583l;
        C0629qs c0629qs2 = this.f897i;
        C0629qs c0629qs3 = this.f896h;
        if (!z2) {
            C0143dm c0143dm6 = this.f890b;
            this.f892d = c0143dm6.f1736o0[1];
            if (c0143dm6.f1685E) {
                this.f5048l = new C0686sb(this);
            }
            int i = this.f892d;
            if (i != 3) {
                if (i == 4 && (c0143dm4 = this.f890b.f1699S) != null && c0143dm4.f1736o0[1] == 1) {
                    int iM1256i = (c0143dm4.m1256i() - this.f890b.f1689I.m3957d()) - this.f890b.f1691K.m3957d();
                    bj1.m704b(c0629qs3, c0143dm4.f1715e.f896h, this.f890b.f1689I.m3957d());
                    bj1.m704b(c0629qs2, c0143dm4.f1715e.f897i, -this.f890b.f1691K.m3957d());
                    c0074bt.mo759d(iM1256i);
                    return;
                }
                if (i == 1) {
                    c0074bt.mo759d(this.f890b.m1256i());
                }
            }
        } else if (this.f892d == 4 && (c0143dm2 = (c0143dm = this.f890b).f1699S) != null && c0143dm2.f1736o0[1] == 1) {
            bj1.m704b(c0629qs3, c0143dm2.f1715e.f896h, c0143dm.f1689I.m3957d());
            bj1.m704b(c0629qs2, c0143dm2.f1715e.f897i, -this.f890b.f1691K.m3957d());
            return;
        }
        boolean z3 = c0074bt.f6581j;
        if (z3) {
            C0143dm c0143dm7 = this.f890b;
            if (c0143dm7.f1707a) {
                C0585pl[] c0585plArr = c0143dm7.f1696P;
                C0585pl c0585pl = c0585plArr[2];
                C0585pl c0585pl2 = c0585pl.f6197f;
                if (c0585pl2 != null && c0585plArr[3].f6197f != null) {
                    boolean zM1268w = c0143dm7.m1268w();
                    C0143dm c0143dm8 = this.f890b;
                    if (zM1268w) {
                        c0629qs3.f6577f = c0143dm8.f1696P[2].m3957d();
                        c0629qs2.f6577f = -this.f890b.f1696P[3].m3957d();
                    } else {
                        C0629qs c0629qsM705h = bj1.m705h(c0143dm8.f1696P[2]);
                        if (c0629qsM705h != null) {
                            bj1.m704b(c0629qs3, c0629qsM705h, this.f890b.f1696P[2].m3957d());
                        }
                        C0629qs c0629qsM705h2 = bj1.m705h(this.f890b.f1696P[3]);
                        if (c0629qsM705h2 != null) {
                            bj1.m704b(c0629qs2, c0629qsM705h2, -this.f890b.f1696P[3].m3957d());
                        }
                        c0629qs3.f6573b = true;
                        c0629qs2.f6573b = true;
                    }
                    C0143dm c0143dm9 = this.f890b;
                    if (c0143dm9.f1685E) {
                        bj1.m704b(c0629qs, c0629qs3, c0143dm9.f1706Z);
                        return;
                    }
                    return;
                }
                if (c0585pl2 != null) {
                    C0629qs c0629qsM705h3 = bj1.m705h(c0585pl);
                    if (c0629qsM705h3 != null) {
                        bj1.m704b(c0629qs3, c0629qsM705h3, this.f890b.f1696P[2].m3957d());
                        bj1.m704b(c0629qs2, c0629qs3, c0074bt.f6578g);
                        C0143dm c0143dm10 = this.f890b;
                        if (c0143dm10.f1685E) {
                            bj1.m704b(c0629qs, c0629qs3, c0143dm10.f1706Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0585pl c0585pl3 = c0585plArr[3];
                if (c0585pl3.f6197f != null) {
                    C0629qs c0629qsM705h4 = bj1.m705h(c0585pl3);
                    if (c0629qsM705h4 != null) {
                        bj1.m704b(c0629qs2, c0629qsM705h4, -this.f890b.f1696P[3].m3957d());
                        bj1.m704b(c0629qs3, c0629qs2, -c0074bt.f6578g);
                    }
                    C0143dm c0143dm11 = this.f890b;
                    if (c0143dm11.f1685E) {
                        bj1.m704b(c0629qs, c0629qs3, c0143dm11.f1706Z);
                        return;
                    }
                    return;
                }
                C0585pl c0585pl4 = c0585plArr[4];
                if (c0585pl4.f6197f != null) {
                    C0629qs c0629qsM705h5 = bj1.m705h(c0585pl4);
                    if (c0629qsM705h5 != null) {
                        bj1.m704b(c0629qs, c0629qsM705h5, 0);
                        bj1.m704b(c0629qs3, c0629qs, -this.f890b.f1706Z);
                        bj1.m704b(c0629qs2, c0629qs3, c0074bt.f6578g);
                        return;
                    }
                    return;
                }
                if ((c0143dm7 instanceof C0205fb) || c0143dm7.f1699S == null || c0143dm7.mo1254g(7).f6197f != null) {
                    return;
                }
                C0143dm c0143dm12 = this.f890b;
                bj1.m704b(c0629qs3, c0143dm12.f1699S.f1715e.f896h, c0143dm12.m1262q());
                bj1.m704b(c0629qs2, c0629qs3, c0074bt.f6578g);
                C0143dm c0143dm13 = this.f890b;
                if (c0143dm13.f1685E) {
                    bj1.m704b(c0629qs, c0629qs3, c0143dm13.f1706Z);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f892d != 3) {
            c0074bt.m4136b(this);
        } else {
            C0143dm c0143dm14 = this.f890b;
            int i2 = c0143dm14.f1740s;
            if (i2 == 2) {
                C0143dm c0143dm15 = c0143dm14.f1699S;
                if (c0143dm15 != null) {
                    C0074bt c0074bt2 = c0143dm15.f1715e.f893e;
                    arrayList2.add(c0074bt2);
                    c0074bt2.f6582k.add(c0074bt);
                    c0074bt.f6573b = true;
                    arrayList.add(c0629qs3);
                    arrayList.add(c0629qs2);
                }
            } else if (i2 == 3 && !c0143dm14.m1268w()) {
                C0143dm c0143dm16 = this.f890b;
                if (c0143dm16.f1739r != 3) {
                    C0074bt c0074bt3 = c0143dm16.f1713d.f893e;
                    arrayList2.add(c0074bt3);
                    c0074bt3.f6582k.add(c0074bt);
                    c0074bt.f6573b = true;
                    arrayList.add(c0629qs3);
                    arrayList.add(c0629qs2);
                }
            }
        }
        C0143dm c0143dm17 = this.f890b;
        C0585pl[] c0585plArr2 = c0143dm17.f1696P;
        C0585pl c0585pl5 = c0585plArr2[2];
        C0585pl c0585pl6 = c0585pl5.f6197f;
        if (c0585pl6 != null && c0585plArr2[3].f6197f != null) {
            boolean zM1268w2 = c0143dm17.m1268w();
            C0143dm c0143dm18 = this.f890b;
            if (zM1268w2) {
                c0629qs3.f6577f = c0143dm18.f1696P[2].m3957d();
                c0629qs2.f6577f = -this.f890b.f1696P[3].m3957d();
            } else {
                C0629qs c0629qsM705h6 = bj1.m705h(c0143dm18.f1696P[2]);
                C0629qs c0629qsM705h7 = bj1.m705h(this.f890b.f1696P[3]);
                if (c0629qsM705h6 != null) {
                    c0629qsM705h6.m4136b(this);
                }
                if (c0629qsM705h7 != null) {
                    c0629qsM705h7.m4136b(this);
                }
                this.f898j = 4;
            }
            if (this.f890b.f1685E) {
                m707c(c0629qs, c0629qs3, 1, this.f5048l);
            }
        } else if (c0585pl6 != null) {
            C0629qs c0629qsM705h8 = bj1.m705h(c0585pl5);
            if (c0629qsM705h8 != null) {
                bj1.m704b(c0629qs3, c0629qsM705h8, this.f890b.f1696P[2].m3957d());
                m707c(c0629qs2, c0629qs3, 1, c0074bt);
                if (this.f890b.f1685E) {
                    m707c(c0629qs, c0629qs3, 1, this.f5048l);
                }
                if (this.f892d == 3) {
                    C0143dm c0143dm19 = this.f890b;
                    if (c0143dm19.f1702V > 0.0f) {
                        gb0 gb0Var = c0143dm19.f1713d;
                        if (gb0Var.f892d == 3) {
                            gb0Var.f893e.f6582k.add(c0074bt);
                            arrayList2.add(this.f890b.f1713d.f893e);
                            c0074bt.f6572a = this;
                        }
                    }
                }
            }
        } else {
            C0585pl c0585pl7 = c0585plArr2[3];
            if (c0585pl7.f6197f != null) {
                C0629qs c0629qsM705h9 = bj1.m705h(c0585pl7);
                if (c0629qsM705h9 != null) {
                    bj1.m704b(c0629qs2, c0629qsM705h9, -this.f890b.f1696P[3].m3957d());
                    m707c(c0629qs3, c0629qs2, -1, c0074bt);
                    if (this.f890b.f1685E) {
                        m707c(c0629qs, c0629qs3, 1, this.f5048l);
                    }
                }
            } else {
                C0585pl c0585pl8 = c0585plArr2[4];
                if (c0585pl8.f6197f != null) {
                    C0629qs c0629qsM705h10 = bj1.m705h(c0585pl8);
                    if (c0629qsM705h10 != null) {
                        bj1.m704b(c0629qs, c0629qsM705h10, 0);
                        m707c(c0629qs3, c0629qs, -1, this.f5048l);
                        m707c(c0629qs2, c0629qs3, 1, c0074bt);
                    }
                } else if (!(c0143dm17 instanceof C0205fb) && (c0143dm3 = c0143dm17.f1699S) != null) {
                    bj1.m704b(c0629qs3, c0143dm3.f1715e.f896h, c0143dm17.m1262q());
                    m707c(c0629qs2, c0629qs3, 1, c0074bt);
                    if (this.f890b.f1685E) {
                        m707c(c0629qs, c0629qs3, 1, this.f5048l);
                    }
                    if (this.f892d == 3) {
                        C0143dm c0143dm20 = this.f890b;
                        if (c0143dm20.f1702V > 0.0f) {
                            gb0 gb0Var2 = c0143dm20.f1713d;
                            if (gb0Var2.f892d == 3) {
                                gb0Var2.f893e.f6582k.add(c0074bt);
                                arrayList2.add(this.f890b.f1713d.f893e);
                                c0074bt.f6572a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c0074bt.f6574c = true;
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: e */
    public final void mo709e() {
        C0629qs c0629qs = this.f896h;
        if (c0629qs.f6581j) {
            this.f890b.f1705Y = c0629qs.f6578g;
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: f */
    public final void mo710f() {
        this.f891c = null;
        this.f896h.m4137c();
        this.f897i.m4137c();
        this.f5047k.m4137c();
        this.f893e.m4137c();
        this.f895g = false;
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: k */
    public final boolean mo713k() {
        return this.f892d != 3 || this.f890b.f1740s == 0;
    }

    /* JADX INFO: renamed from: m */
    public final void m3385m() {
        this.f895g = false;
        C0629qs c0629qs = this.f896h;
        c0629qs.m4137c();
        c0629qs.f6581j = false;
        C0629qs c0629qs2 = this.f897i;
        c0629qs2.m4137c();
        c0629qs2.f6581j = false;
        C0629qs c0629qs3 = this.f5047k;
        c0629qs3.m4137c();
        c0629qs3.f6581j = false;
        this.f893e.f6581j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f890b.f1720g0;
    }
}
