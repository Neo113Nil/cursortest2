package p149v;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17015a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f17018d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f17019e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f17020f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f17021g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f17022h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f17023i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f17024k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f17030q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f17031r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f17016b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17017c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f17025l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f17026m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f17027n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f17028o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f17029p = 0;

    public g(h hVar, int i7, c cVar, c cVar2, c cVar3, c cVar4, int i8) {
        this.f17031r = hVar;
        this.f17022h = 0;
        this.f17023i = 0;
        this.j = 0;
        this.f17024k = 0;
        this.f17030q = 0;
        this.f17015a = i7;
        this.f17018d = cVar;
        this.f17019e = cVar2;
        this.f17020f = cVar3;
        this.f17021g = cVar4;
        this.f17022h = hVar.f17064A0;
        this.f17023i = hVar.f17071w0;
        this.j = hVar.f17065B0;
        this.f17024k = hVar.f17072x0;
        this.f17030q = i8;
    }

    public final void a(e eVar) {
        int i7 = this.f17015a;
        d dVar = d.f16920c;
        h hVar = this.f17031r;
        if (i7 == 0) {
            int iY = hVar.Y(eVar, this.f17030q);
            if (eVar.f16943U[0] == dVar) {
                this.f17029p++;
                iY = 0;
            }
            this.f17025l = iY + (eVar.f16965i0 != 8 ? hVar.f17044T0 : 0) + this.f17025l;
            int iX = hVar.X(eVar, this.f17030q);
            if (this.f17016b == null || this.f17017c < iX) {
                this.f17016b = eVar;
                this.f17017c = iX;
                this.f17026m = iX;
            }
        } else {
            int iY2 = hVar.Y(eVar, this.f17030q);
            int iX2 = hVar.X(eVar, this.f17030q);
            if (eVar.f16943U[1] == dVar) {
                this.f17029p++;
                iX2 = 0;
            }
            this.f17026m = iX2 + (eVar.f16965i0 != 8 ? hVar.f17045U0 : 0) + this.f17026m;
            if (this.f17016b == null || this.f17017c < iY2) {
                this.f17016b = eVar;
                this.f17017c = iY2;
                this.f17025l = iY2;
            }
        }
        this.f17028o++;
    }

    public final void b(int i7, boolean z4, boolean z7) {
        h hVar;
        int i8;
        int i9;
        e eVar;
        char c3;
        int i10;
        float f7;
        int i11;
        int i12;
        int i13 = this.f17028o;
        int i14 = 0;
        while (true) {
            hVar = this.f17031r;
            if (i14 >= i13 || (i12 = this.f17027n + i14) >= hVar.f17054f1) {
                break;
            }
            e eVar2 = hVar.f17053e1[i12];
            if (eVar2 != null) {
                eVar2.E();
            }
            i14++;
        }
        if (i13 == 0 || this.f17016b == null) {
            return;
        }
        boolean z8 = z7 && i7 == 0;
        int i15 = -1;
        int i16 = -1;
        for (int i17 = 0; i17 < i13; i17++) {
            int i18 = this.f17027n + (z4 ? (i13 - 1) - i17 : i17);
            if (i18 >= hVar.f17054f1) {
                break;
            }
            e eVar3 = hVar.f17053e1[i18];
            if (eVar3 != null && eVar3.f16965i0 == 0) {
                if (i15 == -1) {
                    i15 = i17;
                }
                i16 = i17;
            }
        }
        if (this.f17015a != 0) {
            e eVar4 = this.f17016b;
            eVar4.f16970l0 = hVar.f17032H0;
            int i19 = this.f17022h;
            if (i7 > 0) {
                i19 += hVar.f17044T0;
            }
            c cVar = eVar4.f16932J;
            c cVar2 = eVar4.f16934L;
            if (z4) {
                cVar2.a(this.f17020f, i19);
                if (z7) {
                    cVar.a(this.f17018d, this.j);
                }
                if (i7 > 0) {
                    this.f17020f.f16912d.f16932J.a(cVar2, 0);
                }
            } else {
                cVar.a(this.f17018d, i19);
                if (z7) {
                    cVar2.a(this.f17020f, this.j);
                }
                if (i7 > 0) {
                    this.f17018d.f16912d.f16934L.a(cVar, 0);
                }
            }
            e eVar5 = null;
            for (int i20 = 0; i20 < i13; i20++) {
                int i21 = this.f17027n + i20;
                if (i21 >= hVar.f17054f1) {
                    return;
                }
                e eVar6 = hVar.f17053e1[i21];
                if (eVar6 != null) {
                    c cVar3 = eVar6.f16933K;
                    if (i20 == 0) {
                        eVar6.f(cVar3, this.f17019e, this.f17023i);
                        int i22 = hVar.f17033I0;
                        float f8 = hVar.f17039O0;
                        if (this.f17027n == 0) {
                            i9 = hVar.f17035K0;
                            i8 = -1;
                            if (i9 != -1) {
                                f8 = hVar.f17041Q0;
                            }
                            eVar6.f16972m0 = i9;
                            eVar6.f16961g0 = f8;
                        } else {
                            i8 = -1;
                        }
                        if (!z7 || (i9 = hVar.f17037M0) == i8) {
                            i9 = i22;
                        } else {
                            f8 = hVar.f17043S0;
                        }
                        eVar6.f16972m0 = i9;
                        eVar6.f16961g0 = f8;
                    }
                    if (i20 == i13 - 1) {
                        eVar6.f(eVar6.f16935M, this.f17021g, this.f17024k);
                    }
                    if (eVar5 != null) {
                        int i23 = hVar.f17045U0;
                        c cVar4 = eVar5.f16935M;
                        cVar3.a(cVar4, i23);
                        if (i20 == i15) {
                            int i24 = this.f17023i;
                            if (cVar3.h()) {
                                cVar3.f16916h = i24;
                            }
                        }
                        cVar4.a(cVar3, 0);
                        if (i20 == i16 + 1) {
                            int i25 = this.f17024k;
                            if (cVar4.h()) {
                                cVar4.f16916h = i25;
                            }
                        }
                    }
                    if (eVar6 != eVar4) {
                        c cVar5 = eVar6.f16934L;
                        c cVar6 = eVar6.f16932J;
                        if (z4) {
                            int i26 = hVar.f17046V0;
                            if (i26 == 0) {
                                cVar5.a(cVar2, 0);
                            } else if (i26 == 1) {
                                cVar6.a(cVar, 0);
                            } else if (i26 == 2) {
                                cVar6.a(cVar, 0);
                                cVar5.a(cVar2, 0);
                            }
                        } else {
                            int i27 = hVar.f17046V0;
                            if (i27 == 0) {
                                cVar6.a(cVar, 0);
                            } else if (i27 == 1) {
                                cVar5.a(cVar2, 0);
                            } else if (i27 == 2) {
                                if (z8) {
                                    cVar6.a(this.f17018d, this.f17022h);
                                    cVar5.a(this.f17020f, this.j);
                                } else {
                                    cVar6.a(cVar, 0);
                                    cVar5.a(cVar2, 0);
                                }
                            }
                        }
                    }
                    eVar5 = eVar6;
                }
            }
            return;
        }
        e eVar7 = this.f17016b;
        eVar7.f16972m0 = hVar.f17033I0;
        int i28 = this.f17023i;
        if (i7 > 0) {
            i28 += hVar.f17045U0;
        }
        c cVar7 = this.f17019e;
        c cVar8 = eVar7.f16933K;
        cVar8.a(cVar7, i28);
        c cVar9 = eVar7.f16935M;
        if (z7) {
            cVar9.a(this.f17021g, this.f17024k);
        }
        if (i7 > 0) {
            this.f17019e.f16912d.f16935M.a(cVar8, 0);
        }
        if (hVar.W0 != 3 || eVar7.f16927E) {
            eVar = eVar7;
            break;
        }
        int i29 = 0;
        while (true) {
            if (i29 < i13) {
                int i30 = this.f17027n + (z4 ? (i13 - 1) - i29 : i29);
                if (i30 < hVar.f17054f1) {
                    eVar = hVar.f17053e1[i30];
                    if (eVar.f16927E) {
                        break;
                    } else {
                        i29++;
                    }
                }
            }
            eVar = eVar7;
            break;
        }
        int i31 = 0;
        e eVar8 = null;
        while (i31 < i13) {
            int i32 = z4 ? (i13 - 1) - i31 : i31;
            int i33 = this.f17027n + i32;
            if (i33 >= hVar.f17054f1) {
                return;
            }
            e eVar9 = hVar.f17053e1[i33];
            if (eVar9 == null) {
                i13 = i13;
                c3 = 3;
            } else {
                c cVar10 = eVar9.f16932J;
                if (i31 == 0) {
                    eVar9.f(cVar10, this.f17018d, this.f17022h);
                }
                if (i32 == 0) {
                    int i34 = hVar.f17032H0;
                    float f9 = z4 ? 1.0f - hVar.f17038N0 : hVar.f17038N0;
                    if (this.f17027n == 0 && (i11 = hVar.f17034J0) != -1) {
                        f7 = z4 ? 1.0f - hVar.f17040P0 : hVar.f17040P0;
                        i10 = i11;
                    } else if (!z7 || (i10 = hVar.f17036L0) == -1) {
                        i10 = i34;
                        f7 = f9;
                    } else {
                        f7 = z4 ? 1.0f - hVar.f17042R0 : hVar.f17042R0;
                    }
                    eVar9.f16970l0 = i10;
                    eVar9.f16959f0 = f7;
                }
                if (i31 == i13 - 1) {
                    eVar9.f(eVar9.f16934L, this.f17020f, this.j);
                }
                if (eVar8 != null) {
                    int i35 = hVar.f17044T0;
                    c cVar11 = eVar8.f16934L;
                    cVar10.a(cVar11, i35);
                    if (i31 == i15) {
                        int i36 = this.f17022h;
                        if (cVar10.h()) {
                            cVar10.f16916h = i36;
                        }
                    }
                    cVar11.a(cVar10, 0);
                    if (i31 == i16 + 1) {
                        int i37 = this.j;
                        if (cVar11.h()) {
                            cVar11.f16916h = i37;
                        }
                    }
                }
                if (eVar9 != eVar7) {
                    int i38 = hVar.W0;
                    c3 = 3;
                    if (i38 == 3 && eVar.f16927E && eVar9 != eVar && eVar9.f16927E) {
                        eVar9.f16936N.a(eVar.f16936N, 0);
                    } else {
                        c cVar12 = eVar9.f16933K;
                        if (i38 != 0) {
                            c cVar13 = eVar9.f16935M;
                            if (i38 == 1) {
                                cVar13.a(cVar9, 0);
                            } else if (z8) {
                                cVar12.a(this.f17019e, this.f17023i);
                                cVar13.a(this.f17021g, this.f17024k);
                            } else {
                                cVar12.a(cVar8, 0);
                                cVar13.a(cVar9, 0);
                            }
                        } else {
                            cVar12.a(cVar8, 0);
                        }
                    }
                } else {
                    c3 = 3;
                }
                eVar8 = eVar9;
            }
            i31++;
            i13 = i13;
        }
    }

    public final int c() {
        return this.f17015a == 1 ? this.f17026m - this.f17031r.f17045U0 : this.f17026m;
    }

    public final int d() {
        return this.f17015a == 0 ? this.f17025l - this.f17031r.f17044T0 : this.f17025l;
    }

    public final void e(int i7) {
        int i8 = this.f17029p;
        if (i8 == 0) {
            return;
        }
        int i9 = this.f17028o;
        int i10 = i7 / i8;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = this.f17027n;
            int i13 = i12 + i11;
            h hVar = this.f17031r;
            if (i13 >= hVar.f17054f1) {
                break;
            }
            e eVar = hVar.f17053e1[i12 + i11];
            int i14 = this.f17015a;
            d dVar = d.f16918a;
            d dVar2 = d.f16920c;
            if (i14 == 0) {
                if (eVar != null) {
                    d[] dVarArr = eVar.f16943U;
                    if (dVarArr[0] == dVar2 && eVar.f16981r == 0) {
                        hVar.W(eVar, dVar, i10, dVarArr[1], eVar.l());
                    }
                }
            } else if (eVar != null) {
                d[] dVarArr2 = eVar.f16943U;
                if (dVarArr2[1] == dVar2 && eVar.f16983s == 0) {
                    hVar.W(eVar, dVarArr2[0], eVar.r(), dVar, i10);
                }
            }
        }
        this.f17025l = 0;
        this.f17026m = 0;
        this.f17016b = null;
        this.f17017c = 0;
        int i15 = this.f17028o;
        for (int i16 = 0; i16 < i15; i16++) {
            int i17 = this.f17027n + i16;
            h hVar2 = this.f17031r;
            if (i17 >= hVar2.f17054f1) {
                return;
            }
            e eVar2 = hVar2.f17053e1[i17];
            if (this.f17015a == 0) {
                int iR = eVar2.r();
                int i18 = hVar2.f17044T0;
                if (eVar2.f16965i0 == 8) {
                    i18 = 0;
                }
                this.f17025l = iR + i18 + this.f17025l;
                int iX = hVar2.X(eVar2, this.f17030q);
                if (this.f17016b == null || this.f17017c < iX) {
                    this.f17016b = eVar2;
                    this.f17017c = iX;
                    this.f17026m = iX;
                }
            } else {
                int iY = hVar2.Y(eVar2, this.f17030q);
                int iX2 = hVar2.X(eVar2, this.f17030q);
                int i19 = hVar2.f17045U0;
                if (eVar2.f16965i0 == 8) {
                    i19 = 0;
                }
                this.f17026m = iX2 + i19 + this.f17026m;
                if (this.f17016b == null || this.f17017c < iY) {
                    this.f17016b = eVar2;
                    this.f17017c = iY;
                    this.f17025l = iY;
                }
            }
        }
    }

    public final void f(int i7, c cVar, c cVar2, c cVar3, c cVar4, int i8, int i9, int i10, int i11, int i12) {
        this.f17015a = i7;
        this.f17018d = cVar;
        this.f17019e = cVar2;
        this.f17020f = cVar3;
        this.f17021g = cVar4;
        this.f17022h = i8;
        this.f17023i = i9;
        this.j = i10;
        this.f17024k = i11;
        this.f17030q = i12;
    }
}
