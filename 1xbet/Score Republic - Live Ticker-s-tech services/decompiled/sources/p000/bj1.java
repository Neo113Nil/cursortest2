package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bj1 implements InterfaceC0518ns {

    /* JADX INFO: renamed from: a */
    public int f889a;

    /* JADX INFO: renamed from: b */
    public C0143dm f890b;

    /* JADX INFO: renamed from: c */
    public y31 f891c;

    /* JADX INFO: renamed from: d */
    public int f892d;

    /* JADX INFO: renamed from: e */
    public final C0074bt f893e = new C0074bt(this);

    /* JADX INFO: renamed from: f */
    public int f894f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f895g = false;

    /* JADX INFO: renamed from: h */
    public final C0629qs f896h = new C0629qs(this);

    /* JADX INFO: renamed from: i */
    public final C0629qs f897i = new C0629qs(this);

    /* JADX INFO: renamed from: j */
    public int f898j = 1;

    public bj1(C0143dm c0143dm) {
        this.f890b = c0143dm;
    }

    /* JADX INFO: renamed from: b */
    public static void m704b(C0629qs c0629qs, C0629qs c0629qs2, int i) {
        c0629qs.f6583l.add(c0629qs2);
        c0629qs.f6577f = i;
        c0629qs2.f6582k.add(c0629qs);
    }

    /* JADX INFO: renamed from: h */
    public static C0629qs m705h(C0585pl c0585pl) {
        C0585pl c0585pl2 = c0585pl.f6197f;
        if (c0585pl2 == null) {
            return null;
        }
        C0143dm c0143dm = c0585pl2.f6195d;
        int iM292o = AbstractC0024an.m292o(c0585pl2.f6196e);
        if (iM292o == 1) {
            return c0143dm.f1713d.f896h;
        }
        if (iM292o == 2) {
            return c0143dm.f1715e.f896h;
        }
        if (iM292o == 3) {
            return c0143dm.f1713d.f897i;
        }
        if (iM292o == 4) {
            return c0143dm.f1715e.f897i;
        }
        if (iM292o != 5) {
            return null;
        }
        return c0143dm.f1715e.f5047k;
    }

    /* JADX INFO: renamed from: i */
    public static C0629qs m706i(C0585pl c0585pl, int i) {
        C0585pl c0585pl2 = c0585pl.f6197f;
        if (c0585pl2 == null) {
            return null;
        }
        C0143dm c0143dm = c0585pl2.f6195d;
        bj1 bj1Var = i == 0 ? c0143dm.f1713d : c0143dm.f1715e;
        int iM292o = AbstractC0024an.m292o(c0585pl2.f6196e);
        if (iM292o == 1 || iM292o == 2) {
            return bj1Var.f896h;
        }
        if (iM292o == 3 || iM292o == 4) {
            return bj1Var.f897i;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m707c(C0629qs c0629qs, C0629qs c0629qs2, int i, C0074bt c0074bt) {
        c0629qs.f6583l.add(c0629qs2);
        c0629qs.f6583l.add(this.f893e);
        c0629qs.f6579h = i;
        c0629qs.f6580i = c0074bt;
        c0629qs2.f6582k.add(c0629qs);
        c0074bt.f6582k.add(c0629qs);
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo708d();

    /* JADX INFO: renamed from: e */
    public abstract void mo709e();

    /* JADX INFO: renamed from: f */
    public abstract void mo710f();

    /* JADX INFO: renamed from: g */
    public final int m711g(int i, int i2) {
        C0143dm c0143dm = this.f890b;
        if (i2 == 0) {
            int i3 = c0143dm.f1743v;
            int iMax = Math.max(c0143dm.f1742u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            int i4 = c0143dm.f1746y;
            int iMax2 = Math.max(c0143dm.f1745x, i);
            if (i4 > 0) {
                iMax2 = Math.min(i4, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: j */
    public long mo712j() {
        C0074bt c0074bt = this.f893e;
        if (c0074bt.f6581j) {
            return c0074bt.f6578g;
        }
        return 0L;
    }

    /* JADX INFO: renamed from: k */
    public abstract boolean mo713k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0064  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    /* JADX INFO: renamed from: l */
    public final void m714l(C0585pl c0585pl, C0585pl c0585pl2, int i) {
        C0074bt c0074bt;
        float f;
        int i2;
        int i3;
        C0629qs c0629qsM705h = m705h(c0585pl);
        C0629qs c0629qsM705h2 = m705h(c0585pl2);
        if (c0629qsM705h.f6581j && c0629qsM705h2.f6581j) {
            int iM3957d = c0585pl.m3957d() + c0629qsM705h.f6578g;
            int iM3957d2 = c0629qsM705h2.f6578g - c0585pl2.m3957d();
            int i4 = iM3957d2 - iM3957d;
            C0074bt c0074bt2 = this.f893e;
            if (!c0074bt2.f6581j && this.f892d == 3) {
                int i5 = this.f889a;
                if (i5 == 0) {
                    c0074bt2.mo759d(m711g(i4, i));
                } else if (i5 == 1) {
                    c0074bt2.mo759d(Math.min(m711g(c0074bt2.f976m, i), i4));
                } else if (i5 == 2) {
                    C0143dm c0143dm = this.f890b;
                    C0143dm c0143dm2 = c0143dm.f1699S;
                    if (c0143dm2 != null) {
                        C0074bt c0074bt3 = (i == 0 ? c0143dm2.f1713d : c0143dm2.f1715e).f893e;
                        if (c0074bt3.f6581j) {
                            c0074bt2.mo759d(m711g((int) ((c0074bt3.f6578g * (i == 0 ? c0143dm.f1744w : c0143dm.f1747z)) + 0.5f), i));
                        }
                    }
                } else if (i5 == 3) {
                    C0143dm c0143dm3 = this.f890b;
                    bj1 bj1Var = c0143dm3.f1713d;
                    if (bj1Var.f892d == 3 && bj1Var.f889a == 3) {
                        mh1 mh1Var = c0143dm3.f1715e;
                        if (mh1Var.f892d != 3 || mh1Var.f889a != 3) {
                            if (i == 0) {
                                bj1Var = c0143dm3.f1715e;
                            }
                            c0074bt = bj1Var.f893e;
                            if (c0074bt.f6581j) {
                                f = c0143dm3.f1702V;
                                i2 = c0074bt.f6578g;
                                if (i == 1) {
                                    i3 = (int) ((i2 / f) + 0.5f);
                                } else {
                                    i3 = (int) ((f * i2) + 0.5f);
                                }
                                c0074bt2.mo759d(i3);
                            }
                        }
                    } else {
                        if (i == 0) {
                            bj1Var = c0143dm3.f1715e;
                        }
                        c0074bt = bj1Var.f893e;
                        if (c0074bt.f6581j) {
                            f = c0143dm3.f1702V;
                            i2 = c0074bt.f6578g;
                            if (i == 1) {
                                i3 = (int) ((i2 / f) + 0.5f);
                            } else {
                                i3 = (int) ((f * i2) + 0.5f);
                            }
                            c0074bt2.mo759d(i3);
                        }
                    }
                }
            }
            if (c0074bt2.f6581j) {
                int i6 = c0074bt2.f6578g;
                C0629qs c0629qs = this.f897i;
                C0629qs c0629qs2 = this.f896h;
                if (i6 == i4) {
                    c0629qs2.mo759d(iM3957d);
                    c0629qs.mo759d(iM3957d2);
                    return;
                }
                C0143dm c0143dm4 = this.f890b;
                float f2 = i == 0 ? c0143dm4.f1712c0 : c0143dm4.f1714d0;
                if (c0629qsM705h == c0629qsM705h2) {
                    iM3957d = c0629qsM705h.f6578g;
                    iM3957d2 = c0629qsM705h2.f6578g;
                    f2 = 0.5f;
                }
                c0629qs2.mo759d((int) ((((iM3957d2 - iM3957d) - i6) * f2) + iM3957d + 0.5f));
                c0629qs.mo759d(c0629qs2.f6578g + c0074bt2.f6578g);
            }
        }
    }
}
