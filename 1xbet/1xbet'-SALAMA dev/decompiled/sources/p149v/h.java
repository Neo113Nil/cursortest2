package p149v;

import B.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p136t.c;
import p154w.b;

/* JADX INFO: loaded from: classes.dex */
public final class h extends m {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public e[] f17053e1;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public int f17032H0 = -1;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public int f17033I0 = -1;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public int f17034J0 = -1;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public int f17035K0 = -1;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public int f17036L0 = -1;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public int f17037M0 = -1;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public float f17038N0 = 0.5f;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public float f17039O0 = 0.5f;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public float f17040P0 = 0.5f;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    public float f17041Q0 = 0.5f;

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    public float f17042R0 = 0.5f;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    public float f17043S0 = 0.5f;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f17044T0 = 0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public int f17045U0 = 0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public int f17046V0 = 2;
    public int W0 = 2;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public int f17047X0 = 0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public int f17048Y0 = -1;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int f17049Z0 = 0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public final ArrayList f17050a1 = new ArrayList();

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public e[] f17051b1 = null;
    public e[] c1 = null;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int[] f17052d1 = null;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public int f17054f1 = 0;

    /* JADX WARN: Code duplicated, block: B:398:0x0758  */
    /* JADX WARN: Code duplicated, block: B:400:0x075e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:401:0x0760  */
    /* JADX WARN: Code duplicated, block: B:402:0x0768  */
    /* JADX WARN: Code duplicated, block: B:405:0x076e  */
    /* JADX WARN: Code duplicated, block: B:407:0x0771  */
    /* JADX WARN: Code duplicated, block: B:408:0x0774 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:409:0x0776  */
    /* JADX WARN: Code duplicated, block: B:410:0x077d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:411:0x077f  */
    /* JADX WARN: Code duplicated, block: B:412:0x0781  */
    /* JADX WARN: Code duplicated, block: B:415:0x0790  */
    /* JADX WARN: Code duplicated, block: B:416:0x0792  */
    /* JADX WARN: Code duplicated, block: B:74:0x0112  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149v.m
    public final void V(int i7, int i8, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        g gVar;
        int i16;
        char c3;
        int iMin;
        int i17;
        int i18;
        int iMin2;
        boolean z4;
        int i19;
        d dVar;
        int i20;
        int i21;
        int i22;
        d dVar2;
        e eVar;
        int i23;
        int i24;
        int iCeil;
        int iCeil2;
        Object obj;
        e eVar2;
        int i25;
        d dVar3;
        int i26;
        int i27;
        d dVar4;
        int i28;
        int i29;
        int i30;
        int i31 = this.f17062v0;
        d dVar5 = d.f16919b;
        d dVar6 = d.f16920c;
        if (i31 > 0) {
            e eVar3 = this.f16944V;
            d dVar7 = eVar3 != null ? ((f) eVar3).f17013y0 : null;
            if (dVar7 == null) {
                this.f17067D0 = 0;
                this.f17068E0 = 0;
                this.f17066C0 = false;
                return;
            }
            for (int i32 = 0; i32 < this.f17062v0; i32++) {
                e eVar4 = this.f17061u0[i32];
                if (eVar4 != null && !(eVar4 instanceof i)) {
                    d dVarK = eVar4.k(0);
                    d dVarK2 = eVar4.k(1);
                    if (dVarK != dVar6 || eVar4.f16981r == 1 || dVarK2 != dVar6 || eVar4.f16983s == 1) {
                        if (dVarK == dVar6) {
                            dVarK = dVar5;
                        }
                        if (dVarK2 == dVar6) {
                            dVarK2 = dVar5;
                        }
                        b bVar = this.f17069F0;
                        bVar.f17220a = dVarK;
                        bVar.f17221b = dVarK2;
                        bVar.f17222c = eVar4.r();
                        bVar.f17223d = eVar4.l();
                        dVar7.b(eVar4, bVar);
                        eVar4.P(bVar.f17224e);
                        eVar4.M(bVar.f17225f);
                        eVar4.J(bVar.f17226g);
                    }
                }
            }
        }
        int i33 = this.f17064A0;
        int i34 = this.f17065B0;
        int i35 = this.f17071w0;
        int i36 = this.f17072x0;
        int[] iArr2 = new int[2];
        int i37 = (i8 - i33) - i34;
        int i38 = this.f17049Z0;
        if (i38 == 1) {
            i37 = (i10 - i35) - i36;
        }
        int i39 = i37;
        if (i38 == 0) {
            if (this.f17032H0 == -1) {
                this.f17032H0 = 0;
            }
            if (this.f17033I0 == -1) {
                this.f17033I0 = 0;
            }
        } else {
            if (this.f17032H0 == -1) {
                this.f17032H0 = 0;
            }
            if (this.f17033I0 == -1) {
                this.f17033I0 = 0;
            }
        }
        e[] eVarArr = this.f17061u0;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            i11 = this.f17062v0;
            if (i40 >= i11) {
                break;
            }
            if (this.f17061u0[i40].f16965i0 == 8) {
                i41++;
            }
            i40++;
        }
        if (i41 > 0) {
            eVarArr = new e[i11 - i41];
            int i42 = 0;
            i11 = 0;
            while (i42 < this.f17062v0) {
                e eVar5 = this.f17061u0[i42];
                int[] iArr3 = iArr2;
                int i43 = i36;
                if (eVar5.f16965i0 != 8) {
                    eVarArr[i11] = eVar5;
                    i11++;
                }
                i42++;
                iArr2 = iArr3;
                i36 = i43;
            }
        }
        int[] iArr4 = iArr2;
        int i44 = i36;
        int i45 = i11;
        e[] eVarArr2 = eVarArr;
        this.f17053e1 = eVarArr2;
        this.f17054f1 = i45;
        int i46 = this.f17047X0;
        ArrayList arrayList = this.f17050a1;
        if (i46 == 0) {
            i12 = i35;
            i13 = i34;
            i14 = i33;
            iArr = iArr4;
            i15 = i44;
            int i47 = this.f17049Z0;
            if (i45 != 0) {
                if (arrayList.size() == 0) {
                    gVar = new g(this, i47, this.f16932J, this.f16933K, this.f16934L, this.f16935M, i39);
                    arrayList.add(gVar);
                } else {
                    gVar = (g) arrayList.get(0);
                    gVar.f17017c = 0;
                    gVar.f17016b = null;
                    gVar.f17025l = 0;
                    gVar.f17026m = 0;
                    gVar.f17027n = 0;
                    gVar.f17028o = 0;
                    gVar.f17029p = 0;
                    gVar.f(i47, this.f16932J, this.f16933K, this.f16934L, this.f16935M, this.f17064A0, this.f17071w0, this.f17065B0, this.f17072x0, i39);
                }
                for (int i48 = 0; i48 < i45; i48++) {
                    gVar.a(eVarArr2[i48]);
                }
                i16 = 0;
                iArr[0] = gVar.d();
                c3 = 1;
                iArr[1] = gVar.c();
            }
            iMin = iArr[i16] + i14 + i13;
            i17 = iArr[c3] + i12 + i15;
            if (i7 == 1073741824) {
                if (i7 == Integer.MIN_VALUE) {
                    iMin = Math.min(iMin, i8);
                } else {
                    c3 = c3;
                    i18 = i9;
                    if (i7 != 0) {
                        iMin = i16;
                    }
                }
                if (i18 == 1073741824) {
                    iMin2 = i10;
                } else if (i18 == Integer.MIN_VALUE) {
                    iMin2 = Math.min(i17, i10);
                } else if (i18 == 0) {
                    iMin2 = i17;
                } else {
                    iMin2 = i16;
                }
                this.f17067D0 = iMin;
                this.f17068E0 = iMin2;
                P(iMin);
                M(iMin2);
                if (this.f17062v0 > 0) {
                    z4 = c3;
                } else {
                    z4 = i16;
                }
                this.f17066C0 = z4;
            }
            iMin = i8;
            i18 = i9;
            if (i18 == 1073741824) {
                iMin2 = i10;
            } else if (i18 == Integer.MIN_VALUE) {
                iMin2 = Math.min(i17, i10);
            } else if (i18 == 0) {
                iMin2 = i17;
            } else {
                iMin2 = i16;
            }
            this.f17067D0 = iMin;
            this.f17068E0 = iMin2;
            P(iMin);
            M(iMin2);
            if (this.f17062v0 > 0) {
                z4 = c3;
            } else {
                z4 = i16;
            }
            this.f17066C0 = z4;
        }
        c cVar = this.f16933K;
        c cVar2 = this.f16932J;
        c cVar3 = this.f16934L;
        c cVar4 = this.f16935M;
        if (i46 == 1) {
            c cVar5 = cVar2;
            i12 = i35;
            i13 = i34;
            i14 = i33;
            d dVar8 = dVar5;
            d dVar9 = dVar6;
            iArr = iArr4;
            i15 = i44;
            int i49 = this.f17049Z0;
            if (i45 != 0) {
                arrayList.clear();
                g gVar2 = new g(this, i49, this.f16932J, this.f16933K, this.f16934L, this.f16935M, i39);
                arrayList.add(gVar2);
                if (i49 == 0) {
                    i20 = 0;
                    int i50 = 0;
                    int i51 = 0;
                    while (i51 < i45) {
                        e eVar6 = eVarArr2[i51];
                        int iY = Y(eVar6, i39);
                        d dVar10 = dVar9;
                        if (eVar6.f16943U[0] == dVar10) {
                            i20++;
                        }
                        int i52 = i20;
                        boolean z7 = (i50 == i39 || (this.f17044T0 + i50) + iY > i39) && gVar2.f17016b != null;
                        if (!z7 && i51 > 0 && (i24 = this.f17048Y0) > 0 && i51 % i24 == 0) {
                            z7 = true;
                        }
                        if (z7) {
                            int i53 = i49;
                            dVar2 = dVar8;
                            i22 = i49;
                            eVar = eVar6;
                            dVar9 = dVar10;
                            i23 = i51;
                            gVar2 = new g(this, i53, this.f16932J, this.f16933K, this.f16934L, this.f16935M, i39);
                            gVar2.f17027n = i23;
                            arrayList.add(gVar2);
                        } else {
                            dVar9 = dVar10;
                            i22 = i49;
                            dVar2 = dVar8;
                            eVar = eVar6;
                            i23 = i51;
                            if (i23 > 0) {
                                i50 = this.f17044T0 + iY + i50;
                            }
                            gVar2.a(eVar);
                            i51 = i23 + 1;
                            i20 = i52;
                            dVar8 = dVar2;
                            i49 = i22;
                        }
                        i50 = iY;
                        gVar2.a(eVar);
                        i51 = i23 + 1;
                        i20 = i52;
                        dVar8 = dVar2;
                        i49 = i22;
                    }
                    i19 = i49;
                    dVar = dVar8;
                } else {
                    i19 = i49;
                    dVar = dVar8;
                    i20 = 0;
                    int i54 = 0;
                    int i55 = 0;
                    while (i55 < i45) {
                        e eVar7 = eVarArr2[i55];
                        int iX = X(eVar7, i39);
                        d dVar11 = dVar9;
                        if (eVar7.f16943U[1] == dVar11) {
                            i20++;
                        }
                        int i56 = i20;
                        boolean z8 = (i54 == i39 || (this.f17045U0 + i54) + iX > i39) && gVar2.f17016b != null;
                        if (!z8 && i55 > 0 && (i21 = this.f17048Y0) > 0 && i55 % i21 == 0) {
                            z8 = true;
                        }
                        if (z8) {
                            dVar9 = dVar11;
                            gVar2 = new g(this, i19, this.f16932J, this.f16933K, this.f16934L, this.f16935M, i39);
                            gVar2.f17027n = i55;
                            arrayList.add(gVar2);
                        } else {
                            dVar9 = dVar11;
                            if (i55 > 0) {
                                i54 = this.f17045U0 + iX + i54;
                            }
                            gVar2.a(eVar7);
                            i55++;
                            i20 = i56;
                        }
                        i54 = iX;
                        gVar2.a(eVar7);
                        i55++;
                        i20 = i56;
                    }
                }
                int size = arrayList.size();
                int i57 = this.f17064A0;
                int i58 = this.f17071w0;
                int i59 = this.f17065B0;
                int i60 = this.f17072x0;
                d[] dVarArr = this.f16943U;
                d dVar12 = dVar;
                boolean z9 = dVarArr[0] == dVar12 || dVarArr[1] == dVar12;
                if (i20 > 0 && z9) {
                    for (int i61 = 0; i61 < size; i61++) {
                        g gVar3 = (g) arrayList.get(i61);
                        if (i19 == 0) {
                            gVar3.e(i39 - gVar3.d());
                        } else {
                            gVar3.e(i39 - gVar3.c());
                        }
                    }
                }
                c cVar6 = cVar;
                c cVar7 = cVar3;
                c cVar8 = cVar4;
                int i62 = 0;
                int i63 = 0;
                for (int i64 = 0; i64 < size; i64++) {
                    g gVar4 = (g) arrayList.get(i64);
                    if (i19 == 0) {
                        if (i64 < size - 1) {
                            cVar8 = ((g) arrayList.get(i64 + 1)).f17016b.f16933K;
                            i60 = 0;
                        } else {
                            i60 = this.f17072x0;
                            cVar8 = cVar4;
                        }
                        c cVar9 = gVar4.f17016b.f16935M;
                        gVar4.f(i19, cVar5, cVar6, cVar7, cVar8, i57, i58, i59, i60, i39);
                        int iMax = Math.max(i62, gVar4.d());
                        int iC = gVar4.c() + i63;
                        if (i64 > 0) {
                            iC += this.f17045U0;
                        }
                        i62 = iMax;
                        i63 = iC;
                        cVar6 = cVar9;
                        i58 = 0;
                    } else {
                        if (i64 < size - 1) {
                            cVar7 = ((g) arrayList.get(i64 + 1)).f17016b.f16932J;
                            i59 = 0;
                        } else {
                            i59 = this.f17065B0;
                            cVar7 = cVar3;
                        }
                        c cVar10 = gVar4.f17016b.f16934L;
                        gVar4.f(i19, cVar5, cVar6, cVar7, cVar8, i57, i58, i59, i60, i39);
                        int iD = gVar4.d() + i62;
                        int iMax2 = Math.max(i63, gVar4.c());
                        if (i64 > 0) {
                            iD += this.f17044T0;
                        }
                        i63 = iMax2;
                        cVar5 = cVar10;
                        i62 = iD;
                        i57 = 0;
                    }
                }
                iArr[0] = i62;
                iArr[1] = i63;
            }
        } else if (i46 == 2) {
            i12 = i35;
            i13 = i34;
            i14 = i33;
            iArr = iArr4;
            i15 = i44;
            int i65 = this.f17049Z0;
            if (i65 == 0) {
                int i66 = this.f17048Y0;
                if (i66 <= 0) {
                    int i67 = 0;
                    iCeil2 = 0;
                    for (int i68 = 0; i68 < i45; i68++) {
                        if (i68 > 0) {
                            i67 += this.f17044T0;
                        }
                        e eVar8 = eVarArr2[i68];
                        if (eVar8 != null) {
                            int iY2 = Y(eVar8, i39) + i67;
                            if (iY2 > i39) {
                                break;
                            }
                            iCeil2++;
                            i67 = iY2;
                        }
                    }
                } else {
                    iCeil2 = i66;
                }
                iCeil = 0;
            } else {
                iCeil = this.f17048Y0;
                if (iCeil <= 0) {
                    int i69 = 0;
                    int i70 = 0;
                    for (int i71 = 0; i71 < i45; i71++) {
                        if (i71 > 0) {
                            i69 += this.f17045U0;
                        }
                        e eVar9 = eVarArr2[i71];
                        if (eVar9 != null) {
                            int iX2 = X(eVar9, i39) + i69;
                            if (iX2 > i39) {
                                break;
                            }
                            i70++;
                            i69 = iX2;
                        }
                    }
                    iCeil = i70;
                }
                iCeil2 = 0;
            }
            if (this.f17052d1 == null) {
                this.f17052d1 = new int[2];
            }
            boolean z10 = (iCeil == 0 && i65 == 1) || (iCeil2 == 0 && i65 == 0);
            while (!z10) {
                if (i65 == 0) {
                    iCeil = (int) Math.ceil(i45 / iCeil2);
                } else {
                    iCeil2 = (int) Math.ceil(i45 / iCeil);
                }
                e[] eVarArr3 = this.c1;
                if (eVarArr3 == null || eVarArr3.length < iCeil2) {
                    obj = null;
                    this.c1 = new e[iCeil2];
                } else {
                    obj = null;
                    Arrays.fill(eVarArr3, (Object) null);
                }
                e[] eVarArr4 = this.f17051b1;
                if (eVarArr4 == null || eVarArr4.length < iCeil) {
                    this.f17051b1 = new e[iCeil];
                } else {
                    Arrays.fill(eVarArr4, obj);
                }
                for (int i72 = 0; i72 < iCeil2; i72++) {
                    for (int i73 = 0; i73 < iCeil; i73++) {
                        int i74 = (i73 * iCeil2) + i72;
                        if (i65 == 1) {
                            i74 = (i72 * iCeil) + i73;
                        }
                        if (i74 < eVarArr2.length && (eVar2 = eVarArr2[i74]) != null) {
                            int iY3 = Y(eVar2, i39);
                            e eVar10 = this.c1[i72];
                            if (eVar10 == null || eVar10.r() < iY3) {
                                this.c1[i72] = eVar2;
                            }
                            int iX3 = X(eVar2, i39);
                            e eVar11 = this.f17051b1[i73];
                            if (eVar11 == null || eVar11.l() < iX3) {
                                this.f17051b1[i73] = eVar2;
                            }
                        }
                    }
                }
                int iY4 = 0;
                for (int i75 = 0; i75 < iCeil2; i75++) {
                    e eVar12 = this.c1[i75];
                    if (eVar12 != null) {
                        if (i75 > 0) {
                            iY4 += this.f17044T0;
                        }
                        iY4 = Y(eVar12, i39) + iY4;
                    }
                }
                int iX4 = 0;
                for (int i76 = 0; i76 < iCeil; i76++) {
                    e eVar13 = this.f17051b1[i76];
                    if (eVar13 != null) {
                        if (i76 > 0) {
                            iX4 += this.f17045U0;
                        }
                        iX4 = X(eVar13, i39) + iX4;
                    }
                }
                iArr[0] = iY4;
                iArr[1] = iX4;
                if (i65 == 0) {
                    if (iY4 <= i39 || iCeil2 <= 1) {
                        z10 = true;
                    } else {
                        iCeil2--;
                    }
                } else if (iX4 <= i39 || iCeil <= 1) {
                    z10 = true;
                } else {
                    iCeil--;
                }
            }
            int[] iArr5 = this.f17052d1;
            iArr5[0] = iCeil2;
            iArr5[1] = iCeil;
        } else if (i46 != 3) {
            i12 = i35;
            i13 = i34;
            i14 = i33;
            iArr = iArr4;
            i15 = i44;
        } else {
            int i77 = this.f17049Z0;
            if (i45 == 0) {
                i12 = i35;
                i13 = i34;
                i14 = i33;
                iArr = iArr4;
                i15 = i44;
            } else {
                arrayList.clear();
                c cVar11 = cVar2;
                iArr = iArr4;
                i15 = i44;
                i12 = i35;
                i13 = i34;
                i14 = i33;
                g gVar5 = new g(this, i77, this.f16932J, this.f16933K, this.f16934L, this.f16935M, i39);
                arrayList.add(gVar5);
                if (i77 == 0) {
                    int i78 = 0;
                    i27 = 0;
                    int i79 = 0;
                    int i80 = 0;
                    while (i80 < i45) {
                        int i81 = i78 + 1;
                        e eVar14 = eVarArr2[i80];
                        int i82 = i39;
                        int iY5 = Y(eVar14, i82);
                        if (eVar14.f16943U[0] == dVar6) {
                            i27++;
                        }
                        int i83 = i27;
                        boolean z11 = (i79 == i82 || (this.f17044T0 + i79) + iY5 > i82) && gVar5.f17016b != null;
                        if (!z11 && i80 > 0 && (i30 = this.f17048Y0) > 0 && i81 > i30) {
                            z11 = true;
                        }
                        if (z11) {
                            int i84 = i77;
                            i39 = i82;
                            i29 = i80;
                            g gVar6 = new g(this, i84, this.f16932J, this.f16933K, this.f16934L, this.f16935M, i39);
                            gVar6.f17027n = i29;
                            arrayList.add(gVar6);
                            gVar5 = gVar6;
                            i79 = iY5;
                            i78 = i81;
                        } else {
                            i39 = i82;
                            i29 = i80;
                            i79 = i29 > 0 ? this.f17044T0 + iY5 + i79 : iY5;
                            i78 = 0;
                        }
                        gVar5.a(eVar14);
                        i80 = i29 + 1;
                        i27 = i83;
                        dVar5 = dVar5;
                        i77 = i77;
                    }
                    i25 = i77;
                    dVar3 = dVar5;
                    i26 = i39;
                } else {
                    i25 = i77;
                    dVar3 = dVar5;
                    int i85 = 0;
                    int i86 = 0;
                    int i87 = 0;
                    while (i87 < i45) {
                        e eVar15 = eVarArr2[i87];
                        int i88 = i39;
                        int iX5 = X(eVar15, i88);
                        if (eVar15.f16943U[1] == dVar6) {
                            i85++;
                        }
                        int i89 = i85;
                        boolean z12 = (i86 == i88 || (this.f17045U0 + i86) + iX5 > i88) && gVar5.f17016b != null;
                        if (!z12 && i87 > 0 && (i28 = this.f17048Y0) > 0 && i28 < 0) {
                            z12 = true;
                        }
                        if (z12) {
                            dVar4 = dVar6;
                            g gVar7 = new g(this, i25, this.f16932J, this.f16933K, this.f16934L, this.f16935M, i88);
                            gVar7.f17027n = i87;
                            arrayList.add(gVar7);
                            gVar5 = gVar7;
                        } else {
                            dVar4 = dVar6;
                            if (i87 > 0) {
                                i86 = this.f17045U0 + iX5 + i86;
                            }
                            gVar5.a(eVar15);
                            i87++;
                            i39 = i88;
                            i85 = i89;
                            dVar6 = dVar4;
                        }
                        i86 = iX5;
                        gVar5.a(eVar15);
                        i87++;
                        i39 = i88;
                        i85 = i89;
                        dVar6 = dVar4;
                    }
                    i26 = i39;
                    i27 = i85;
                }
                int size2 = arrayList.size();
                int i90 = this.f17064A0;
                int i91 = this.f17071w0;
                int i92 = this.f17065B0;
                int i93 = this.f17072x0;
                d[] dVarArr2 = this.f16943U;
                d dVar13 = dVar3;
                boolean z13 = dVarArr2[0] == dVar13 || dVarArr2[1] == dVar13;
                if (i27 > 0 && z13) {
                    for (int i94 = 0; i94 < size2; i94++) {
                        g gVar8 = (g) arrayList.get(i94);
                        if (i25 == 0) {
                            gVar8.e(i26 - gVar8.d());
                        } else {
                            gVar8.e(i26 - gVar8.c());
                        }
                    }
                }
                int i95 = i90;
                c cVar12 = cVar;
                c cVar13 = cVar3;
                c cVar14 = cVar4;
                int i96 = 0;
                int i97 = 0;
                for (int i98 = 0; i98 < size2; i98++) {
                    g gVar9 = (g) arrayList.get(i98);
                    if (i25 == 0) {
                        if (i98 < size2 - 1) {
                            cVar14 = ((g) arrayList.get(i98 + 1)).f17016b.f16933K;
                            i93 = 0;
                        } else {
                            i93 = this.f17072x0;
                            cVar14 = cVar4;
                        }
                        c cVar15 = gVar9.f17016b.f16935M;
                        gVar9.f(i25, cVar11, cVar12, cVar13, cVar14, i95, i91, i92, i93, i26);
                        int iMax3 = Math.max(i96, gVar9.d());
                        int iC2 = gVar9.c() + i97;
                        if (i98 > 0) {
                            iC2 += this.f17045U0;
                        }
                        i96 = iMax3;
                        i97 = iC2;
                        cVar12 = cVar15;
                        i91 = 0;
                    } else {
                        if (i98 < size2 - 1) {
                            cVar13 = ((g) arrayList.get(i98 + 1)).f17016b.f16932J;
                            i92 = 0;
                        } else {
                            i92 = this.f17065B0;
                            cVar13 = cVar3;
                        }
                        c cVar16 = gVar9.f17016b.f16934L;
                        gVar9.f(i25, cVar11, cVar12, cVar13, cVar14, i95, i91, i92, i93, i26);
                        int iD2 = gVar9.d() + i96;
                        int iMax4 = Math.max(i97, gVar9.c());
                        if (i98 > 0) {
                            iD2 += this.f17044T0;
                        }
                        i97 = iMax4;
                        cVar11 = cVar16;
                        i96 = iD2;
                        i95 = 0;
                    }
                }
                iArr[0] = i96;
                iArr[1] = i97;
            }
        }
        i16 = 0;
        c3 = 1;
        iMin = iArr[i16] + i14 + i13;
        i17 = iArr[c3] + i12 + i15;
        if (i7 == 1073741824) {
            if (i7 == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i8);
            } else {
                c3 = c3;
                i18 = i9;
                if (i7 != 0) {
                    iMin = i16;
                }
            }
            if (i18 == 1073741824) {
                iMin2 = i10;
            } else if (i18 == Integer.MIN_VALUE) {
                iMin2 = Math.min(i17, i10);
            } else if (i18 == 0) {
                iMin2 = i17;
            } else {
                iMin2 = i16;
            }
            this.f17067D0 = iMin;
            this.f17068E0 = iMin2;
            P(iMin);
            M(iMin2);
            if (this.f17062v0 > 0) {
                z4 = c3;
            } else {
                z4 = i16;
            }
            this.f17066C0 = z4;
        }
        iMin = i8;
        i18 = i9;
        if (i18 == 1073741824) {
            iMin2 = i10;
        } else if (i18 == Integer.MIN_VALUE) {
            iMin2 = Math.min(i17, i10);
        } else if (i18 == 0) {
            iMin2 = i17;
        } else {
            iMin2 = i16;
        }
        this.f17067D0 = iMin;
        this.f17068E0 = iMin2;
        P(iMin);
        M(iMin2);
        if (this.f17062v0 > 0) {
            z4 = c3;
        } else {
            z4 = i16;
        }
        this.f17066C0 = z4;
    }

    public final int X(e eVar, int i7) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.f16943U[1] == d.f16920c) {
            int i8 = eVar.f16983s;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (eVar.f16992z * i7);
                if (i9 != eVar.l()) {
                    eVar.f16960g = true;
                    W(eVar, eVar.f16943U[0], eVar.r(), d.f16918a, i9);
                }
                return i9;
            }
            if (i8 == 1) {
                return eVar.l();
            }
            if (i8 == 3) {
                return (int) ((eVar.r() * eVar.f16947Y) + 0.5f);
            }
        }
        return eVar.l();
    }

    public final int Y(e eVar, int i7) {
        if (eVar == null) {
            return 0;
        }
        if (eVar.f16943U[0] == d.f16920c) {
            int i8 = eVar.f16981r;
            if (i8 == 0) {
                return 0;
            }
            if (i8 == 2) {
                int i9 = (int) (eVar.f16989w * i7);
                if (i9 != eVar.r()) {
                    eVar.f16960g = true;
                    W(eVar, d.f16918a, i9, eVar.f16943U[1], eVar.l());
                }
                return i9;
            }
            if (i8 == 1) {
                return eVar.r();
            }
            if (i8 == 3) {
                return (int) ((eVar.l() * eVar.f16947Y) + 0.5f);
            }
        }
        return eVar.r();
    }

    @Override // p149v.e
    public final void b(c cVar, boolean z4) {
        e eVar;
        float f7;
        int i7;
        super.b(cVar, z4);
        e eVar2 = this.f16944V;
        boolean z7 = eVar2 != null && ((f) eVar2).f17014z0;
        int i8 = this.f17047X0;
        ArrayList arrayList = this.f17050a1;
        if (i8 != 0) {
            if (i8 == 1) {
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    ((g) arrayList.get(i9)).b(i9, z7, i9 == size + (-1));
                    i9++;
                }
            } else if (i8 != 2) {
                if (i8 == 3) {
                    int size2 = arrayList.size();
                    int i10 = 0;
                    while (i10 < size2) {
                        ((g) arrayList.get(i10)).b(i10, z7, i10 == size2 + (-1));
                        i10++;
                    }
                }
            } else if (this.f17052d1 != null && this.c1 != null && this.f17051b1 != null) {
                for (int i11 = 0; i11 < this.f17054f1; i11++) {
                    this.f17053e1[i11].E();
                }
                int[] iArr = this.f17052d1;
                int i12 = iArr[0];
                int i13 = iArr[1];
                float f8 = this.f17038N0;
                e eVar3 = null;
                int i14 = 0;
                while (i14 < i12) {
                    if (z7) {
                        i7 = (i12 - i14) - 1;
                        f7 = 1.0f - this.f17038N0;
                    } else {
                        f7 = f8;
                        i7 = i14;
                    }
                    e eVar4 = this.c1[i7];
                    if (eVar4 != null && eVar4.f16965i0 != 8) {
                        c cVar2 = eVar4.f16932J;
                        if (i14 == 0) {
                            eVar4.f(cVar2, this.f16932J, this.f17064A0);
                            eVar4.f16970l0 = this.f17032H0;
                            eVar4.f16959f0 = f7;
                        }
                        if (i14 == i12 - 1) {
                            eVar4.f(eVar4.f16934L, this.f16934L, this.f17065B0);
                        }
                        if (i14 > 0 && eVar3 != null) {
                            int i15 = this.f17044T0;
                            c cVar3 = eVar3.f16934L;
                            eVar4.f(cVar2, cVar3, i15);
                            eVar3.f(cVar3, cVar2, 0);
                        }
                        eVar3 = eVar4;
                    }
                    i14++;
                    f8 = f7;
                }
                for (int i16 = 0; i16 < i13; i16++) {
                    e eVar5 = this.f17051b1[i16];
                    if (eVar5 != null && eVar5.f16965i0 != 8) {
                        c cVar4 = eVar5.f16933K;
                        if (i16 == 0) {
                            eVar5.f(cVar4, this.f16933K, this.f17071w0);
                            eVar5.f16972m0 = this.f17033I0;
                            eVar5.f16961g0 = this.f17039O0;
                        }
                        if (i16 == i13 - 1) {
                            eVar5.f(eVar5.f16935M, this.f16935M, this.f17072x0);
                        }
                        if (i16 > 0 && eVar3 != null) {
                            int i17 = this.f17045U0;
                            c cVar5 = eVar3.f16935M;
                            eVar5.f(cVar4, cVar5, i17);
                            eVar3.f(cVar5, cVar4, 0);
                        }
                        eVar3 = eVar5;
                    }
                }
                for (int i18 = 0; i18 < i12; i18++) {
                    for (int i19 = 0; i19 < i13; i19++) {
                        int i20 = (i19 * i12) + i18;
                        if (this.f17049Z0 == 1) {
                            i20 = (i18 * i13) + i19;
                        }
                        e[] eVarArr = this.f17053e1;
                        if (i20 < eVarArr.length && (eVar = eVarArr[i20]) != null && eVar.f16965i0 != 8) {
                            e eVar6 = this.c1[i18];
                            e eVar7 = this.f17051b1[i19];
                            if (eVar != eVar6) {
                                eVar.f(eVar.f16932J, eVar6.f16932J, 0);
                                eVar.f(eVar.f16934L, eVar6.f16934L, 0);
                            }
                            if (eVar != eVar7) {
                                eVar.f(eVar.f16933K, eVar7.f16933K, 0);
                                eVar.f(eVar.f16935M, eVar7.f16935M, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((g) arrayList.get(0)).b(0, z7, true);
        }
        this.f17066C0 = false;
    }

    @Override // p149v.j, p149v.e
    public final void g(e eVar, HashMap map) {
        super.g(eVar, map);
        h hVar = (h) eVar;
        this.f17032H0 = hVar.f17032H0;
        this.f17033I0 = hVar.f17033I0;
        this.f17034J0 = hVar.f17034J0;
        this.f17035K0 = hVar.f17035K0;
        this.f17036L0 = hVar.f17036L0;
        this.f17037M0 = hVar.f17037M0;
        this.f17038N0 = hVar.f17038N0;
        this.f17039O0 = hVar.f17039O0;
        this.f17040P0 = hVar.f17040P0;
        this.f17041Q0 = hVar.f17041Q0;
        this.f17042R0 = hVar.f17042R0;
        this.f17043S0 = hVar.f17043S0;
        this.f17044T0 = hVar.f17044T0;
        this.f17045U0 = hVar.f17045U0;
        this.f17046V0 = hVar.f17046V0;
        this.W0 = hVar.W0;
        this.f17047X0 = hVar.f17047X0;
        this.f17048Y0 = hVar.f17048Y0;
        this.f17049Z0 = hVar.f17049Z0;
    }
}
