package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gb0 extends bj1 {

    /* JADX INFO: renamed from: k */
    public static final int[] f2683k = new int[2];

    /* JADX INFO: renamed from: m */
    public static void m2014m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p000.InterfaceC0518ns
    /* JADX INFO: renamed from: a */
    public final void mo1751a(InterfaceC0518ns interfaceC0518ns) {
        float f;
        int iM711g;
        int i;
        int iM711g2;
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC0024an.m292o(this.f898j) == 3) {
            C0143dm c0143dm = this.f890b;
            m714l(c0143dm.f1688H, c0143dm.f1690J, 0);
            return;
        }
        C0074bt c0074bt = this.f893e;
        boolean z = c0074bt.f6581j;
        C0629qs c0629qs = this.f896h;
        C0629qs c0629qs2 = this.f897i;
        if (z || this.f892d != 3) {
            f = 0.5f;
        } else {
            C0143dm c0143dm2 = this.f890b;
            int i3 = c0143dm2.f1739r;
            if (i3 == 2) {
                f = 0.5f;
                C0143dm c0143dm3 = c0143dm2.f1699S;
                if (c0143dm3 != null) {
                    C0074bt c0074bt2 = c0143dm3.f1713d.f893e;
                    if (c0074bt2.f6581j) {
                        c0074bt.mo759d((int) ((c0074bt2.f6578g * c0143dm2.f1744w) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c0143dm2.f1740s;
                if (i4 == 0 || i4 == 3) {
                    mh1 mh1Var = c0143dm2.f1715e;
                    C0629qs c0629qs3 = mh1Var.f896h;
                    C0629qs c0629qs4 = mh1Var.f897i;
                    boolean z2 = c0143dm2.f1688H.f6197f != null;
                    boolean z3 = c0143dm2.f1689I.f6197f != null;
                    boolean z4 = c0143dm2.f1690J.f6197f != null;
                    boolean z5 = c0143dm2.f1691K.f6197f != null;
                    f = 0.5f;
                    int i5 = c0143dm2.f1703W;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c0143dm2.f1702V;
                        boolean z6 = c0629qs3.f6581j;
                        ArrayList arrayList = c0629qs3.f6583l;
                        int[] iArr = f2683k;
                        if (z6 && c0629qs4.f6581j) {
                            if (c0629qs.f6574c && c0629qs2.f6574c) {
                                m2014m(iArr, ((C0629qs) c0629qs.f6583l.get(0)).f6578g + c0629qs.f6577f, ((C0629qs) c0629qs2.f6583l.get(0)).f6578g - c0629qs2.f6577f, c0629qs3.f6578g + c0629qs3.f6577f, c0629qs4.f6578g - c0629qs4.f6577f, f5, i5);
                                c0074bt.mo759d(iArr[0]);
                                this.f890b.f1715e.f893e.mo759d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c0629qs.f6581j && c0629qs2.f6581j) {
                            if (!c0629qs3.f6574c || !c0629qs4.f6574c) {
                                return;
                            }
                            m2014m(iArr, c0629qs.f6578g + c0629qs.f6577f, c0629qs2.f6578g - c0629qs2.f6577f, ((C0629qs) arrayList.get(0)).f6578g + c0629qs3.f6577f, ((C0629qs) c0629qs4.f6583l.get(0)).f6578g - c0629qs4.f6577f, f5, i5);
                            c0074bt.mo759d(iArr[0]);
                            this.f890b.f1715e.f893e.mo759d(iArr[1]);
                        }
                        if (!c0629qs.f6574c || !c0629qs2.f6574c || !c0629qs3.f6574c || !c0629qs4.f6574c) {
                            return;
                        }
                        m2014m(iArr, ((C0629qs) c0629qs.f6583l.get(0)).f6578g + c0629qs.f6577f, ((C0629qs) c0629qs2.f6583l.get(0)).f6578g - c0629qs2.f6577f, ((C0629qs) arrayList.get(0)).f6578g + c0629qs3.f6577f, ((C0629qs) c0629qs4.f6583l.get(0)).f6578g - c0629qs4.f6577f, f5, i5);
                        c0074bt.mo759d(iArr[0]);
                        this.f890b.f1715e.f893e.mo759d(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c0629qs.f6574c || !c0629qs2.f6574c) {
                            return;
                        }
                        float f6 = c0143dm2.f1702V;
                        int i6 = ((C0629qs) c0629qs.f6583l.get(0)).f6578g + c0629qs.f6577f;
                        int i7 = ((C0629qs) c0629qs2.f6583l.get(0)).f6578g - c0629qs2.f6577f;
                        if (i5 == -1 || i5 == 0) {
                            int iM711g3 = m711g(i7 - i6, 0);
                            int i8 = (int) ((iM711g3 * f6) + 0.5f);
                            int iM711g4 = m711g(i8, 1);
                            if (i8 != iM711g4) {
                                iM711g3 = (int) ((iM711g4 / f6) + 0.5f);
                            }
                            c0074bt.mo759d(iM711g3);
                            this.f890b.f1715e.f893e.mo759d(iM711g4);
                        } else if (i5 == 1) {
                            int iM711g5 = m711g(i7 - i6, 0);
                            int i9 = (int) ((iM711g5 / f6) + 0.5f);
                            int iM711g6 = m711g(i9, 1);
                            if (i9 != iM711g6) {
                                iM711g5 = (int) ((iM711g6 * f6) + 0.5f);
                            }
                            c0074bt.mo759d(iM711g5);
                            this.f890b.f1715e.f893e.mo759d(iM711g6);
                        }
                    } else if (z3 && z5) {
                        if (!c0629qs3.f6574c || !c0629qs4.f6574c) {
                            return;
                        }
                        float f7 = c0143dm2.f1702V;
                        int i10 = ((C0629qs) c0629qs3.f6583l.get(0)).f6578g + c0629qs3.f6577f;
                        int i11 = ((C0629qs) c0629qs4.f6583l.get(0)).f6578g - c0629qs4.f6577f;
                        if (i5 == -1) {
                            iM711g = m711g(i11 - i10, 1);
                            i = (int) ((iM711g / f7) + 0.5f);
                            iM711g2 = m711g(i, 0);
                            if (i != iM711g2) {
                                iM711g = (int) ((iM711g2 * f7) + 0.5f);
                            }
                            c0074bt.mo759d(iM711g2);
                            this.f890b.f1715e.f893e.mo759d(iM711g);
                        } else if (i5 == 0) {
                            int iM711g7 = m711g(i11 - i10, 1);
                            int i12 = (int) ((iM711g7 * f7) + 0.5f);
                            int iM711g8 = m711g(i12, 0);
                            if (i12 != iM711g8) {
                                iM711g7 = (int) ((iM711g8 / f7) + 0.5f);
                            }
                            c0074bt.mo759d(iM711g8);
                            this.f890b.f1715e.f893e.mo759d(iM711g7);
                        } else if (i5 == 1) {
                            iM711g = m711g(i11 - i10, 1);
                            i = (int) ((iM711g / f7) + 0.5f);
                            iM711g2 = m711g(i, 0);
                            if (i != iM711g2) {
                                iM711g = (int) ((iM711g2 * f7) + 0.5f);
                            }
                            c0074bt.mo759d(iM711g2);
                            this.f890b.f1715e.f893e.mo759d(iM711g);
                        }
                    }
                } else {
                    int i13 = c0143dm2.f1703W;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = c0143dm2.f1715e.f893e.f6578g / c0143dm2.f1702V;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = c0143dm2.f1715e.f893e.f6578g;
                            f3 = c0143dm2.f1702V;
                        }
                        c0074bt.mo759d(i2);
                        f = 0.5f;
                    } else {
                        f2 = c0143dm2.f1715e.f893e.f6578g;
                        f3 = c0143dm2.f1702V;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c0074bt.mo759d(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = c0629qs.f6574c;
        ArrayList arrayList2 = c0629qs.f6583l;
        if (z7) {
            boolean z8 = c0629qs2.f6574c;
            ArrayList arrayList3 = c0629qs2.f6583l;
            if (z8) {
                if (c0629qs.f6581j && c0629qs2.f6581j && c0074bt.f6581j) {
                    return;
                }
                if (!c0074bt.f6581j && this.f892d == 3) {
                    C0143dm c0143dm4 = this.f890b;
                    if (c0143dm4.f1739r == 0 && !c0143dm4.m1267v()) {
                        C0629qs c0629qs5 = (C0629qs) arrayList2.get(0);
                        C0629qs c0629qs6 = (C0629qs) arrayList3.get(0);
                        int i14 = c0629qs5.f6578g + c0629qs.f6577f;
                        int i15 = c0629qs6.f6578g + c0629qs2.f6577f;
                        c0629qs.mo759d(i14);
                        c0629qs2.mo759d(i15);
                        c0074bt.mo759d(i15 - i14);
                        return;
                    }
                }
                if (!c0074bt.f6581j && this.f892d == 3 && this.f889a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C0629qs) arrayList3.get(0)).f6578g + c0629qs2.f6577f) - (((C0629qs) arrayList2.get(0)).f6578g + c0629qs.f6577f), c0074bt.f976m);
                    C0143dm c0143dm5 = this.f890b;
                    int i16 = c0143dm5.f1743v;
                    int iMax = Math.max(c0143dm5.f1742u, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c0074bt.mo759d(iMax);
                }
                if (c0074bt.f6581j) {
                    C0629qs c0629qs7 = (C0629qs) arrayList2.get(0);
                    C0629qs c0629qs8 = (C0629qs) arrayList3.get(0);
                    int i17 = c0629qs7.f6578g;
                    int i18 = c0629qs.f6577f + i17;
                    int i19 = c0629qs8.f6578g;
                    int i20 = c0629qs2.f6577f + i19;
                    float f8 = this.f890b.f1712c0;
                    if (c0629qs7 == c0629qs8) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c0629qs.mo759d((int) ((((i19 - i17) - c0074bt.f6578g) * f8) + i17 + f));
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
        int i;
        C0143dm c0143dm3;
        C0143dm c0143dm4;
        int i2;
        C0143dm c0143dm5 = this.f890b;
        boolean z = c0143dm5.f1707a;
        C0074bt c0074bt = this.f893e;
        if (z) {
            c0074bt.mo759d(c0143dm5.m1260o());
        }
        boolean z2 = c0074bt.f6581j;
        ArrayList arrayList = c0074bt.f6582k;
        ArrayList arrayList2 = c0074bt.f6583l;
        C0629qs c0629qs = this.f897i;
        C0629qs c0629qs2 = this.f896h;
        if (!z2) {
            C0143dm c0143dm6 = this.f890b;
            int i3 = c0143dm6.f1736o0[0];
            this.f892d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (c0143dm4 = c0143dm6.f1699S) != null && ((i2 = c0143dm4.f1736o0[0]) == 1 || i2 == 4)) {
                    int iM1260o = (c0143dm4.m1260o() - this.f890b.f1688H.m3957d()) - this.f890b.f1690J.m3957d();
                    bj1.m704b(c0629qs2, c0143dm4.f1713d.f896h, this.f890b.f1688H.m3957d());
                    bj1.m704b(c0629qs, c0143dm4.f1713d.f897i, -this.f890b.f1690J.m3957d());
                    c0074bt.mo759d(iM1260o);
                    return;
                }
                if (i3 == 1) {
                    c0074bt.mo759d(c0143dm6.m1260o());
                }
            }
        } else if (this.f892d == 4 && (c0143dm2 = (c0143dm = this.f890b).f1699S) != null && ((i = c0143dm2.f1736o0[0]) == 1 || i == 4)) {
            bj1.m704b(c0629qs2, c0143dm2.f1713d.f896h, c0143dm.f1688H.m3957d());
            bj1.m704b(c0629qs, c0143dm2.f1713d.f897i, -this.f890b.f1690J.m3957d());
            return;
        }
        if (c0074bt.f6581j) {
            C0143dm c0143dm7 = this.f890b;
            if (c0143dm7.f1707a) {
                C0585pl[] c0585plArr = c0143dm7.f1696P;
                C0585pl c0585pl = c0585plArr[0];
                C0585pl c0585pl2 = c0585pl.f6197f;
                if (c0585pl2 != null && c0585plArr[1].f6197f != null) {
                    boolean zM1267v = c0143dm7.m1267v();
                    C0143dm c0143dm8 = this.f890b;
                    if (zM1267v) {
                        c0629qs2.f6577f = c0143dm8.f1696P[0].m3957d();
                        c0629qs.f6577f = -this.f890b.f1696P[1].m3957d();
                        return;
                    }
                    C0629qs c0629qsM705h = bj1.m705h(c0143dm8.f1696P[0]);
                    if (c0629qsM705h != null) {
                        bj1.m704b(c0629qs2, c0629qsM705h, this.f890b.f1696P[0].m3957d());
                    }
                    C0629qs c0629qsM705h2 = bj1.m705h(this.f890b.f1696P[1]);
                    if (c0629qsM705h2 != null) {
                        bj1.m704b(c0629qs, c0629qsM705h2, -this.f890b.f1696P[1].m3957d());
                    }
                    c0629qs2.f6573b = true;
                    c0629qs.f6573b = true;
                    return;
                }
                if (c0585pl2 != null) {
                    C0629qs c0629qsM705h3 = bj1.m705h(c0585pl);
                    if (c0629qsM705h3 != null) {
                        bj1.m704b(c0629qs2, c0629qsM705h3, this.f890b.f1696P[0].m3957d());
                        bj1.m704b(c0629qs, c0629qs2, c0074bt.f6578g);
                        return;
                    }
                    return;
                }
                C0585pl c0585pl3 = c0585plArr[1];
                if (c0585pl3.f6197f != null) {
                    C0629qs c0629qsM705h4 = bj1.m705h(c0585pl3);
                    if (c0629qsM705h4 != null) {
                        bj1.m704b(c0629qs, c0629qsM705h4, -this.f890b.f1696P[1].m3957d());
                        bj1.m704b(c0629qs2, c0629qs, -c0074bt.f6578g);
                        return;
                    }
                    return;
                }
                if ((c0143dm7 instanceof C0205fb) || c0143dm7.f1699S == null || c0143dm7.mo1254g(7).f6197f != null) {
                    return;
                }
                C0143dm c0143dm9 = this.f890b;
                bj1.m704b(c0629qs2, c0143dm9.f1699S.f1713d.f896h, c0143dm9.m1261p());
                bj1.m704b(c0629qs, c0629qs2, c0074bt.f6578g);
                return;
            }
        }
        if (this.f892d == 3) {
            C0143dm c0143dm10 = this.f890b;
            int i4 = c0143dm10.f1739r;
            if (i4 == 2) {
                C0143dm c0143dm11 = c0143dm10.f1699S;
                if (c0143dm11 != null) {
                    C0074bt c0074bt2 = c0143dm11.f1715e.f893e;
                    arrayList2.add(c0074bt2);
                    c0074bt2.f6582k.add(c0074bt);
                    c0074bt.f6573b = true;
                    arrayList.add(c0629qs2);
                    arrayList.add(c0629qs);
                }
            } else if (i4 == 3) {
                if (c0143dm10.f1740s == 3) {
                    c0629qs2.f6572a = this;
                    c0629qs.f6572a = this;
                    mh1 mh1Var = c0143dm10.f1715e;
                    mh1Var.f896h.f6572a = this;
                    mh1Var.f897i.f6572a = this;
                    c0074bt.f6572a = this;
                    if (c0143dm10.m1268w()) {
                        arrayList2.add(this.f890b.f1715e.f893e);
                        this.f890b.f1715e.f893e.f6582k.add(c0074bt);
                        mh1 mh1Var2 = this.f890b.f1715e;
                        mh1Var2.f893e.f6572a = this;
                        arrayList2.add(mh1Var2.f896h);
                        arrayList2.add(this.f890b.f1715e.f897i);
                        this.f890b.f1715e.f896h.f6582k.add(c0074bt);
                        this.f890b.f1715e.f897i.f6582k.add(c0074bt);
                    } else {
                        boolean zM1267v2 = this.f890b.m1267v();
                        C0143dm c0143dm12 = this.f890b;
                        if (zM1267v2) {
                            c0143dm12.f1715e.f893e.f6583l.add(c0074bt);
                            arrayList.add(this.f890b.f1715e.f893e);
                        } else {
                            c0143dm12.f1715e.f893e.f6583l.add(c0074bt);
                        }
                    }
                } else {
                    C0074bt c0074bt3 = c0143dm10.f1715e.f893e;
                    arrayList2.add(c0074bt3);
                    c0074bt3.f6582k.add(c0074bt);
                    this.f890b.f1715e.f896h.f6582k.add(c0074bt);
                    this.f890b.f1715e.f897i.f6582k.add(c0074bt);
                    c0074bt.f6573b = true;
                    arrayList.add(c0629qs2);
                    arrayList.add(c0629qs);
                    c0629qs2.f6583l.add(c0074bt);
                    c0629qs.f6583l.add(c0074bt);
                }
            }
        }
        C0143dm c0143dm13 = this.f890b;
        C0585pl[] c0585plArr2 = c0143dm13.f1696P;
        C0585pl c0585pl4 = c0585plArr2[0];
        C0585pl c0585pl5 = c0585pl4.f6197f;
        if (c0585pl5 != null && c0585plArr2[1].f6197f != null) {
            boolean zM1267v3 = c0143dm13.m1267v();
            C0143dm c0143dm14 = this.f890b;
            if (zM1267v3) {
                c0629qs2.f6577f = c0143dm14.f1696P[0].m3957d();
                c0629qs.f6577f = -this.f890b.f1696P[1].m3957d();
                return;
            }
            C0629qs c0629qsM705h5 = bj1.m705h(c0143dm14.f1696P[0]);
            C0629qs c0629qsM705h6 = bj1.m705h(this.f890b.f1696P[1]);
            if (c0629qsM705h5 != null) {
                c0629qsM705h5.m4136b(this);
            }
            if (c0629qsM705h6 != null) {
                c0629qsM705h6.m4136b(this);
            }
            this.f898j = 4;
            return;
        }
        if (c0585pl5 != null) {
            C0629qs c0629qsM705h7 = bj1.m705h(c0585pl4);
            if (c0629qsM705h7 != null) {
                bj1.m704b(c0629qs2, c0629qsM705h7, this.f890b.f1696P[0].m3957d());
                m707c(c0629qs, c0629qs2, 1, c0074bt);
                return;
            }
            return;
        }
        C0585pl c0585pl6 = c0585plArr2[1];
        if (c0585pl6.f6197f != null) {
            C0629qs c0629qsM705h8 = bj1.m705h(c0585pl6);
            if (c0629qsM705h8 != null) {
                bj1.m704b(c0629qs, c0629qsM705h8, -this.f890b.f1696P[1].m3957d());
                m707c(c0629qs2, c0629qs, -1, c0074bt);
                return;
            }
            return;
        }
        if ((c0143dm13 instanceof C0205fb) || (c0143dm3 = c0143dm13.f1699S) == null) {
            return;
        }
        bj1.m704b(c0629qs2, c0143dm3.f1713d.f896h, c0143dm13.m1261p());
        m707c(c0629qs, c0629qs2, 1, c0074bt);
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: e */
    public final void mo709e() {
        C0629qs c0629qs = this.f896h;
        if (c0629qs.f6581j) {
            this.f890b.f1704X = c0629qs.f6578g;
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: f */
    public final void mo710f() {
        this.f891c = null;
        this.f896h.m4137c();
        this.f897i.m4137c();
        this.f893e.m4137c();
        this.f895g = false;
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: k */
    public final boolean mo713k() {
        return this.f892d != 3 || this.f890b.f1739r == 0;
    }

    /* JADX INFO: renamed from: n */
    public final void m2015n() {
        this.f895g = false;
        C0629qs c0629qs = this.f896h;
        c0629qs.m4137c();
        c0629qs.f6581j = false;
        C0629qs c0629qs2 = this.f897i;
        c0629qs2.m4137c();
        c0629qs2.f6581j = false;
        this.f893e.f6581j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f890b.f1720g0;
    }
}
