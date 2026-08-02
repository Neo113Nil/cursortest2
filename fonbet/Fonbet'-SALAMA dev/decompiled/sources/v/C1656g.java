package v;

/* renamed from: v.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1656g {

    /* renamed from: a, reason: collision with root package name */
    public int f17009a;

    /* renamed from: d, reason: collision with root package name */
    public C1652c f17012d;

    /* renamed from: e, reason: collision with root package name */
    public C1652c f17013e;

    /* renamed from: f, reason: collision with root package name */
    public C1652c f17014f;

    /* renamed from: g, reason: collision with root package name */
    public C1652c f17015g;

    /* renamed from: h, reason: collision with root package name */
    public int f17016h;

    /* renamed from: i, reason: collision with root package name */
    public int f17017i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f17018k;

    /* renamed from: q, reason: collision with root package name */
    public int f17024q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1657h f17025r;

    /* renamed from: b, reason: collision with root package name */
    public C1654e f17010b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f17011c = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f17019l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f17020m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f17021n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f17022o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f17023p = 0;

    public C1656g(C1657h c1657h, int i7, C1652c c1652c, C1652c c1652c2, C1652c c1652c3, C1652c c1652c4, int i8) {
        this.f17025r = c1657h;
        this.f17016h = 0;
        this.f17017i = 0;
        this.j = 0;
        this.f17018k = 0;
        this.f17024q = 0;
        this.f17009a = i7;
        this.f17012d = c1652c;
        this.f17013e = c1652c2;
        this.f17014f = c1652c3;
        this.f17015g = c1652c4;
        this.f17016h = c1657h.f17058A0;
        this.f17017i = c1657h.f17065w0;
        this.j = c1657h.f17059B0;
        this.f17018k = c1657h.f17066x0;
        this.f17024q = i8;
    }

    public final void a(C1654e c1654e) {
        int i7 = this.f17009a;
        EnumC1653d enumC1653d = EnumC1653d.f16914c;
        C1657h c1657h = this.f17025r;
        if (i7 == 0) {
            int Y6 = c1657h.Y(c1654e, this.f17024q);
            if (c1654e.f16937U[0] == enumC1653d) {
                this.f17023p++;
                Y6 = 0;
            }
            this.f17019l = Y6 + (c1654e.f16959i0 != 8 ? c1657h.f17038T0 : 0) + this.f17019l;
            int X6 = c1657h.X(c1654e, this.f17024q);
            if (this.f17010b == null || this.f17011c < X6) {
                this.f17010b = c1654e;
                this.f17011c = X6;
                this.f17020m = X6;
            }
        } else {
            int Y7 = c1657h.Y(c1654e, this.f17024q);
            int X7 = c1657h.X(c1654e, this.f17024q);
            if (c1654e.f16937U[1] == enumC1653d) {
                this.f17023p++;
                X7 = 0;
            }
            this.f17020m = X7 + (c1654e.f16959i0 != 8 ? c1657h.f17039U0 : 0) + this.f17020m;
            if (this.f17010b == null || this.f17011c < Y7) {
                this.f17010b = c1654e;
                this.f17011c = Y7;
                this.f17019l = Y7;
            }
        }
        this.f17022o++;
    }

    public final void b(int i7, boolean z4, boolean z7) {
        C1657h c1657h;
        int i8;
        int i9;
        int i10;
        C1654e c1654e;
        int i11;
        char c3;
        int i12;
        float f7;
        float f8;
        int i13;
        float f9;
        int i14;
        int i15 = this.f17022o;
        int i16 = 0;
        while (true) {
            c1657h = this.f17025r;
            if (i16 >= i15 || (i14 = this.f17021n + i16) >= c1657h.f17048f1) {
                break;
            }
            C1654e c1654e2 = c1657h.f17047e1[i14];
            if (c1654e2 != null) {
                c1654e2.E();
            }
            i16++;
        }
        if (i15 == 0 || this.f17010b == null) {
            return;
        }
        boolean z8 = z7 && i7 == 0;
        int i17 = -1;
        int i18 = -1;
        for (int i19 = 0; i19 < i15; i19++) {
            int i20 = this.f17021n + (z4 ? (i15 - 1) - i19 : i19);
            if (i20 >= c1657h.f17048f1) {
                break;
            }
            C1654e c1654e3 = c1657h.f17047e1[i20];
            if (c1654e3 != null && c1654e3.f16959i0 == 0) {
                if (i17 == -1) {
                    i17 = i19;
                }
                i18 = i19;
            }
        }
        if (this.f17009a != 0) {
            C1654e c1654e4 = this.f17010b;
            c1654e4.f16964l0 = c1657h.f17026H0;
            int i21 = this.f17016h;
            if (i7 > 0) {
                i21 += c1657h.f17038T0;
            }
            C1652c c1652c = c1654e4.f16926J;
            C1652c c1652c2 = c1654e4.f16928L;
            if (z4) {
                c1652c2.a(this.f17014f, i21);
                if (z7) {
                    c1652c.a(this.f17012d, this.j);
                }
                if (i7 > 0) {
                    this.f17014f.f16906d.f16926J.a(c1652c2, 0);
                }
            } else {
                c1652c.a(this.f17012d, i21);
                if (z7) {
                    c1652c2.a(this.f17014f, this.j);
                }
                if (i7 > 0) {
                    this.f17012d.f16906d.f16928L.a(c1652c, 0);
                }
            }
            C1654e c1654e5 = null;
            for (int i22 = 0; i22 < i15; i22++) {
                int i23 = this.f17021n + i22;
                if (i23 >= c1657h.f17048f1) {
                    return;
                }
                C1654e c1654e6 = c1657h.f17047e1[i23];
                if (c1654e6 != null) {
                    C1652c c1652c3 = c1654e6.f16927K;
                    if (i22 == 0) {
                        c1654e6.f(c1652c3, this.f17013e, this.f17017i);
                        int i24 = c1657h.f17027I0;
                        float f10 = c1657h.f17033O0;
                        if (this.f17021n == 0) {
                            i10 = c1657h.f17029K0;
                            i8 = i24;
                            i9 = -1;
                            if (i10 != -1) {
                                f10 = c1657h.f17035Q0;
                                c1654e6.f16966m0 = i10;
                                c1654e6.f16955g0 = f10;
                            }
                        } else {
                            i8 = i24;
                            i9 = -1;
                        }
                        if (!z7 || (i10 = c1657h.f17031M0) == i9) {
                            i10 = i8;
                        } else {
                            f10 = c1657h.f17037S0;
                        }
                        c1654e6.f16966m0 = i10;
                        c1654e6.f16955g0 = f10;
                    }
                    if (i22 == i15 - 1) {
                        c1654e6.f(c1654e6.f16929M, this.f17015g, this.f17018k);
                    }
                    if (c1654e5 != null) {
                        int i25 = c1657h.f17039U0;
                        C1652c c1652c4 = c1654e5.f16929M;
                        c1652c3.a(c1652c4, i25);
                        if (i22 == i17) {
                            int i26 = this.f17017i;
                            if (c1652c3.h()) {
                                c1652c3.f16910h = i26;
                            }
                        }
                        c1652c4.a(c1652c3, 0);
                        if (i22 == i18 + 1) {
                            int i27 = this.f17018k;
                            if (c1652c4.h()) {
                                c1652c4.f16910h = i27;
                            }
                        }
                    }
                    if (c1654e6 != c1654e4) {
                        C1652c c1652c5 = c1654e6.f16928L;
                        C1652c c1652c6 = c1654e6.f16926J;
                        if (z4) {
                            int i28 = c1657h.f17040V0;
                            if (i28 == 0) {
                                c1652c5.a(c1652c2, 0);
                            } else if (i28 == 1) {
                                c1652c6.a(c1652c, 0);
                            } else if (i28 == 2) {
                                c1652c6.a(c1652c, 0);
                                c1652c5.a(c1652c2, 0);
                            }
                        } else {
                            int i29 = c1657h.f17040V0;
                            if (i29 == 0) {
                                c1652c6.a(c1652c, 0);
                            } else if (i29 == 1) {
                                c1652c5.a(c1652c2, 0);
                            } else if (i29 == 2) {
                                if (z8) {
                                    c1652c6.a(this.f17012d, this.f17016h);
                                    c1652c5.a(this.f17014f, this.j);
                                } else {
                                    c1652c6.a(c1652c, 0);
                                    c1652c5.a(c1652c2, 0);
                                }
                            }
                            c1654e5 = c1654e6;
                        }
                    }
                    c1654e5 = c1654e6;
                }
            }
            return;
        }
        C1654e c1654e7 = this.f17010b;
        c1654e7.f16966m0 = c1657h.f17027I0;
        int i30 = this.f17017i;
        if (i7 > 0) {
            i30 += c1657h.f17039U0;
        }
        C1652c c1652c7 = this.f17013e;
        C1652c c1652c8 = c1654e7.f16927K;
        c1652c8.a(c1652c7, i30);
        C1652c c1652c9 = c1654e7.f16929M;
        if (z7) {
            c1652c9.a(this.f17015g, this.f17018k);
        }
        if (i7 > 0) {
            this.f17013e.f16906d.f16929M.a(c1652c8, 0);
        }
        if (c1657h.W0 == 3 && !c1654e7.f16921E) {
            for (int i31 = 0; i31 < i15; i31++) {
                int i32 = this.f17021n + (z4 ? (i15 - 1) - i31 : i31);
                if (i32 >= c1657h.f17048f1) {
                    break;
                }
                c1654e = c1657h.f17047e1[i32];
                if (c1654e.f16921E) {
                    break;
                }
            }
        }
        c1654e = c1654e7;
        int i33 = 0;
        C1654e c1654e8 = null;
        while (i33 < i15) {
            int i34 = z4 ? (i15 - 1) - i33 : i33;
            int i35 = this.f17021n + i34;
            if (i35 >= c1657h.f17048f1) {
                return;
            }
            C1654e c1654e9 = c1657h.f17047e1[i35];
            if (c1654e9 == null) {
                i11 = i15;
                c3 = 3;
            } else {
                C1652c c1652c10 = c1654e9.f16926J;
                if (i33 == 0) {
                    c1654e9.f(c1652c10, this.f17012d, this.f17016h);
                }
                if (i34 == 0) {
                    int i36 = c1657h.f17026H0;
                    if (z4) {
                        i12 = i36;
                        f7 = 1.0f - c1657h.f17032N0;
                    } else {
                        i12 = i36;
                        f7 = c1657h.f17032N0;
                    }
                    if (this.f17021n == 0) {
                        int i37 = c1657h.f17028J0;
                        f8 = f7;
                        if (i37 != -1) {
                            f9 = z4 ? 1.0f - c1657h.f17034P0 : c1657h.f17034P0;
                            i13 = i37;
                            c1654e9.f16964l0 = i13;
                            c1654e9.f16953f0 = f9;
                        }
                    } else {
                        f8 = f7;
                    }
                    if (!z7 || (i13 = c1657h.f17030L0) == -1) {
                        i13 = i12;
                        f9 = f8;
                    } else {
                        f9 = z4 ? 1.0f - c1657h.f17036R0 : c1657h.f17036R0;
                    }
                    c1654e9.f16964l0 = i13;
                    c1654e9.f16953f0 = f9;
                }
                if (i33 == i15 - 1) {
                    i11 = i15;
                    c1654e9.f(c1654e9.f16928L, this.f17014f, this.j);
                } else {
                    i11 = i15;
                }
                if (c1654e8 != null) {
                    int i38 = c1657h.f17038T0;
                    C1652c c1652c11 = c1654e8.f16928L;
                    c1652c10.a(c1652c11, i38);
                    if (i33 == i17) {
                        int i39 = this.f17016h;
                        if (c1652c10.h()) {
                            c1652c10.f16910h = i39;
                        }
                    }
                    c1652c11.a(c1652c10, 0);
                    if (i33 == i18 + 1) {
                        int i40 = this.j;
                        if (c1652c11.h()) {
                            c1652c11.f16910h = i40;
                        }
                    }
                }
                if (c1654e9 != c1654e7) {
                    int i41 = c1657h.W0;
                    c3 = 3;
                    if (i41 == 3 && c1654e.f16921E && c1654e9 != c1654e && c1654e9.f16921E) {
                        c1654e9.f16930N.a(c1654e.f16930N, 0);
                    } else {
                        C1652c c1652c12 = c1654e9.f16927K;
                        if (i41 != 0) {
                            C1652c c1652c13 = c1654e9.f16929M;
                            if (i41 == 1) {
                                c1652c13.a(c1652c9, 0);
                            } else if (z8) {
                                c1652c12.a(this.f17013e, this.f17017i);
                                c1652c13.a(this.f17015g, this.f17018k);
                            } else {
                                c1652c12.a(c1652c8, 0);
                                c1652c13.a(c1652c9, 0);
                            }
                        } else {
                            c1652c12.a(c1652c8, 0);
                        }
                    }
                } else {
                    c3 = 3;
                }
                c1654e8 = c1654e9;
            }
            i33++;
            i15 = i11;
        }
    }

    public final int c() {
        return this.f17009a == 1 ? this.f17020m - this.f17025r.f17039U0 : this.f17020m;
    }

    public final int d() {
        return this.f17009a == 0 ? this.f17019l - this.f17025r.f17038T0 : this.f17019l;
    }

    public final void e(int i7) {
        int i8 = this.f17023p;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f17022o;
        int i10 = i7 / i8;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = this.f17021n;
            int i13 = i12 + i11;
            C1657h c1657h = this.f17025r;
            if (i13 >= c1657h.f17048f1) {
                break;
            }
            C1654e c1654e = c1657h.f17047e1[i12 + i11];
            int i14 = this.f17009a;
            EnumC1653d enumC1653d = EnumC1653d.f16912a;
            EnumC1653d enumC1653d2 = EnumC1653d.f16914c;
            if (i14 == 0) {
                if (c1654e != null) {
                    EnumC1653d[] enumC1653dArr = c1654e.f16937U;
                    if (enumC1653dArr[0] == enumC1653d2 && c1654e.f16975r == 0) {
                        c1657h.W(c1654e, enumC1653d, i10, enumC1653dArr[1], c1654e.l());
                    }
                }
            } else if (c1654e != null) {
                EnumC1653d[] enumC1653dArr2 = c1654e.f16937U;
                if (enumC1653dArr2[1] == enumC1653d2 && c1654e.f16977s == 0) {
                    c1657h.W(c1654e, enumC1653dArr2[0], c1654e.r(), enumC1653d, i10);
                }
            }
        }
        this.f17019l = 0;
        this.f17020m = 0;
        this.f17010b = null;
        this.f17011c = 0;
        int i15 = this.f17022o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f17021n + i16;
            C1657h c1657h2 = this.f17025r;
            if (i17 >= c1657h2.f17048f1) {
                return;
            }
            C1654e c1654e2 = c1657h2.f17047e1[i17];
            if (this.f17009a == 0) {
                int r7 = c1654e2.r();
                int i18 = c1657h2.f17038T0;
                if (c1654e2.f16959i0 == 8) {
                    i18 = 0;
                }
                this.f17019l = r7 + i18 + this.f17019l;
                int X6 = c1657h2.X(c1654e2, this.f17024q);
                if (this.f17010b == null || this.f17011c < X6) {
                    this.f17010b = c1654e2;
                    this.f17011c = X6;
                    this.f17020m = X6;
                }
            } else {
                int Y6 = c1657h2.Y(c1654e2, this.f17024q);
                int X7 = c1657h2.X(c1654e2, this.f17024q);
                int i19 = c1657h2.f17039U0;
                if (c1654e2.f16959i0 == 8) {
                    i19 = 0;
                }
                this.f17020m = X7 + i19 + this.f17020m;
                if (this.f17010b == null || this.f17011c < Y6) {
                    this.f17010b = c1654e2;
                    this.f17011c = Y6;
                    this.f17019l = Y6;
                }
            }
        }
    }

    public final void f(int i7, C1652c c1652c, C1652c c1652c2, C1652c c1652c3, C1652c c1652c4, int i8, int i9, int i10, int i11, int i12) {
        this.f17009a = i7;
        this.f17012d = c1652c;
        this.f17013e = c1652c2;
        this.f17014f = c1652c3;
        this.f17015g = c1652c4;
        this.f17016h = i8;
        this.f17017i = i9;
        this.j = i10;
        this.f17018k = i11;
        this.f17024q = i12;
    }
}
