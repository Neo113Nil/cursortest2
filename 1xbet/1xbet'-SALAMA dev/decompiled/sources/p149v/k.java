package p149v;

import java.util.ArrayList;
import p136t.b;
import p136t.c;
import p136t.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f17063a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:186:0x0296  */
    /* JADX WARN: Code duplicated, block: B:203:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:205:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:207:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:209:0x030f  */
    /* JADX WARN: Code duplicated, block: B:301:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:410:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:413:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:414:0x06d0  */
    /* JADX WARN: Code duplicated, block: B:417:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:418:0x06d9  */
    /* JADX WARN: Code duplicated, block: B:420:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:422:0x06e5  */
    /* JADX WARN: Code duplicated, block: B:425:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:427:0x06f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:437:0x070c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    public static void a(f fVar, c cVar, ArrayList arrayList, int i7) {
        int i8;
        b[] bVarArr;
        int i9;
        int i10;
        int i11;
        boolean z4;
        boolean z7;
        boolean z8;
        boolean z9;
        c[] cVarArr;
        b[] bVarArr2;
        int i12;
        int i13;
        int i14;
        e eVar;
        f fVar2;
        f fVar3;
        c cVar2;
        c cVar3;
        f fVar4;
        e eVar2;
        c[] cVarArr2;
        int i15;
        c cVar4;
        c cVar5;
        f fVar5;
        c cVar6;
        f fVar6;
        int size;
        boolean z10;
        c cVar7;
        e eVar3;
        int i16;
        int i17;
        e eVar4;
        f fVar7 = fVar;
        if (i7 == 0) {
            i8 = fVar7.f16996D0;
            bVarArr = fVar7.f16999G0;
            i9 = 0;
        } else {
            i8 = fVar7.f16997E0;
            bVarArr = fVar7.f16998F0;
            i9 = 2;
        }
        int i18 = 0;
        while (i18 < i8) {
            b bVar = bVarArr[i18];
            boolean z11 = bVar.f16908q;
            d dVar = d.f16920c;
            e eVar5 = bVar.f16893a;
            int i19 = 1;
            int i20 = 8;
            if (z11) {
                i10 = i18;
                i11 = i8;
                z4 = true;
            } else {
                int i21 = bVar.f16903l;
                int i22 = i21 * 2;
                e eVar6 = eVar5;
                e eVar7 = eVar6;
                boolean z12 = false;
                while (!z12) {
                    bVar.f16901i += i19;
                    eVar6.f16978p0[i21] = null;
                    eVar6.f16976o0[i21] = null;
                    int i23 = eVar6.f16965i0;
                    c[] cVarArr3 = eVar6.f16940R;
                    if (i23 != i20) {
                        eVar6.k(i21);
                        cVarArr3[i22].e();
                        int i24 = i22 + 1;
                        cVarArr3[i24].e();
                        cVarArr3[i22].e();
                        cVarArr3[i24].e();
                        if (bVar.f16894b == null) {
                            bVar.f16894b = eVar6;
                        }
                        bVar.f16896d = eVar6;
                        d dVar2 = eVar6.f16943U[i21];
                        if (dVar2 == dVar) {
                            int i25 = eVar6.f16985t[i21];
                            if (i25 == 0 || i25 == 3 || i25 == 2) {
                                bVar.j++;
                                float f7 = eVar6.f16974n0[i21];
                                if (f7 > 0.0f) {
                                    bVar.f16902k += f7;
                                }
                                if (eVar6.f16965i0 != 8 && dVar2 == dVar && (i25 == 0 || i25 == 3)) {
                                    if (f7 < 0.0f) {
                                        bVar.f16905n = true;
                                    } else {
                                        bVar.f16906o = true;
                                    }
                                    if (bVar.f16900h == null) {
                                        bVar.f16900h = new ArrayList();
                                    }
                                    bVar.f16900h.add(eVar6);
                                }
                                if (bVar.f16898f == null) {
                                    bVar.f16898f = eVar6;
                                }
                                e eVar8 = bVar.f16899g;
                                if (eVar8 != null) {
                                    eVar8.f16976o0[i21] = eVar6;
                                }
                                bVar.f16899g = eVar6;
                            } else {
                                i18 = i18;
                            }
                            if (i21 == 0) {
                                if (eVar6.f16981r == 0 && eVar6.f16987u == 0) {
                                    int i26 = eVar6.f16988v;
                                }
                            } else if (eVar6.f16983s == 0 && eVar6.f16990x == 0) {
                                int i27 = eVar6.f16991y;
                            }
                        } else {
                            i18 = i18;
                            i8 = i8;
                        }
                    } else {
                        i18 = i18;
                        i8 = i8;
                    }
                    e eVar9 = eVar7;
                    if (eVar9 != eVar6) {
                        eVar9.f16978p0[i21] = eVar6;
                    }
                    c cVar8 = cVarArr3[i22 + 1].f16914f;
                    if (cVar8 != null) {
                        eVar4 = cVar8.f16912d;
                        c cVar9 = eVar4.f16940R[i22].f16914f;
                        if (cVar9 == null || cVar9.f16912d != eVar6) {
                            eVar4 = null;
                        }
                    } else {
                        eVar4 = null;
                    }
                    if (eVar4 == null) {
                        eVar4 = eVar6;
                        z12 = true;
                    }
                    eVar7 = eVar6;
                    i18 = i18;
                    i8 = i8;
                    i20 = 8;
                    eVar6 = eVar4;
                    i19 = 1;
                }
                i10 = i18;
                i11 = i8;
                e eVar10 = bVar.f16894b;
                if (eVar10 != null) {
                    eVar10.f16940R[i22].e();
                }
                e eVar11 = bVar.f16896d;
                if (eVar11 != null) {
                    eVar11.f16940R[i22 + 1].e();
                }
                bVar.f16895c = eVar6;
                if (i21 == 0 && bVar.f16904m) {
                    bVar.f16897e = eVar6;
                } else {
                    bVar.f16897e = eVar5;
                }
                bVar.f16907p = bVar.f16906o && bVar.f16905n;
                z4 = true;
            }
            bVar.f16908q = z4;
            if (arrayList == 0 || arrayList.contains(eVar5)) {
                e eVar12 = bVar.f16895c;
                e eVar13 = bVar.f16894b;
                e eVar14 = bVar.f16896d;
                e eVar15 = bVar.f16897e;
                float f8 = bVar.f16902k;
                boolean z13 = fVar7.f16943U[i7] == d.f16919b;
                if (i7 == 0) {
                    int i28 = eVar15.f16970l0;
                    boolean z14 = i28 == 0;
                    if (i28 == 1) {
                        z9 = true;
                        i17 = 2;
                    } else {
                        i17 = 2;
                        z9 = false;
                    }
                    z7 = i28 == i17;
                    z8 = z14;
                } else {
                    int i29 = eVar15.f16972m0;
                    boolean z15 = i29 == 0;
                    boolean z16 = i29 == 1;
                    z7 = i29 == 2;
                    z8 = z15;
                    z9 = z16;
                }
                boolean z17 = false;
                while (true) {
                    cVarArr = fVar7.f16940R;
                    if (z17) {
                        break;
                    }
                    c cVar10 = eVar5.f16940R[i9];
                    int i30 = z7 ? 1 : 4;
                    int iE = cVar10.e();
                    boolean z18 = z17;
                    boolean z19 = eVar5.f16943U[i7] == dVar && eVar5.f16985t[i7] == 0;
                    c cVar11 = cVar10.f16914f;
                    if (cVar11 != null && eVar5 != eVar5) {
                        iE = cVar11.e() + iE;
                    }
                    int i31 = iE;
                    if (z7 && eVar5 != eVar5 && eVar5 != eVar13) {
                        i30 = 8;
                    }
                    c cVar12 = cVar10.f16914f;
                    if (cVar12 != null) {
                        if (eVar5 == eVar13) {
                            cVar.f(cVar10.f16917i, cVar12.f16917i, i31, 6);
                        } else {
                            cVar.f(cVar10.f16917i, cVar12.f16917i, i31, 8);
                        }
                        if (z19 && !z7) {
                            i30 = 5;
                        }
                        cVar.e(cVar10.f16917i, cVar10.f16914f.f16917i, i31, (eVar5 == eVar13 && z7 && eVar5.f16942T[i7]) ? 5 : i30);
                    } else {
                        bVar = bVar;
                        eVar5 = eVar5;
                    }
                    c[] cVarArr4 = eVar5.f16940R;
                    if (z13) {
                        if (eVar5.f16965i0 == 8 || eVar5.f16943U[i7] != dVar) {
                            i16 = 0;
                        } else {
                            i16 = 0;
                            cVar.f(cVarArr4[i9 + 1].f16917i, cVarArr4[i9].f16917i, 0, 5);
                        }
                        cVar.f(cVarArr4[i9].f16917i, cVarArr[i9].f16917i, i16, 8);
                    }
                    c cVar13 = cVarArr4[i9 + 1].f16914f;
                    if (cVar13 != null) {
                        eVar3 = cVar13.f16912d;
                        c cVar14 = eVar3.f16940R[i9].f16914f;
                        if (cVar14 == null || cVar14.f16912d != eVar5) {
                            eVar3 = null;
                        }
                    } else {
                        eVar3 = null;
                    }
                    if (eVar3 != null) {
                        eVar5 = eVar3;
                        z17 = z18;
                    } else {
                        z17 = true;
                    }
                    eVar15 = eVar15;
                    bVarArr = bVarArr;
                    eVar5 = eVar5;
                    bVar = bVar;
                }
                b bVar2 = bVar;
                e eVar16 = eVar15;
                e eVar17 = eVar5;
                bVarArr2 = bVarArr;
                if (eVar14 != null) {
                    int i32 = i9 + 1;
                    if (eVar12.f16940R[i32].f16914f != null) {
                        c cVar15 = eVar14.f16940R[i32];
                        if (eVar14.f16943U[i7] == dVar && eVar14.f16985t[i7] == 0 && !z7) {
                            c cVar16 = cVar15.f16914f;
                            if (cVar16.f16912d == fVar7) {
                                cVar.e(cVar15.f16917i, cVar16.f16917i, -cVar15.e(), 5);
                            } else if (z7) {
                                cVar7 = cVar15.f16914f;
                                if (cVar7.f16912d == fVar7) {
                                    cVar.e(cVar15.f16917i, cVar7.f16917i, -cVar15.e(), 4);
                                }
                            }
                        } else if (z7) {
                            cVar7 = cVar15.f16914f;
                            if (cVar7.f16912d == fVar7) {
                                cVar.e(cVar15.f16917i, cVar7.f16917i, -cVar15.e(), 4);
                            }
                        }
                        cVar.g(cVar15.f16917i, eVar12.f16940R[i32].f16914f.f16917i, -cVar15.e(), 6);
                    }
                }
                if (z13) {
                    int i33 = i9 + 1;
                    f fVar8 = cVarArr[i33].f16917i;
                    c cVar17 = eVar12.f16940R[i33];
                    cVar.f(fVar8, cVar17.f16917i, cVar17.e(), 8);
                }
                ArrayList arrayList2 = bVar2.f16900h;
                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                    float f9 = (!bVar2.f16905n || bVar2.f16907p) ? f8 : bVar2.j;
                    e eVar18 = null;
                    float f10 = 0.0f;
                    int i34 = 0;
                    while (i34 < size) {
                        e eVar19 = (e) arrayList2.get(i34);
                        float f11 = eVar19.f16974n0[i7];
                        c[] cVarArr5 = eVar19.f16940R;
                        if (f11 < 0.0f) {
                            if (bVar2.f16907p) {
                                f fVar9 = cVarArr5[i9 + 1].f16917i;
                                f fVar10 = cVarArr5[i9].f16917i;
                                z10 = false;
                                cVar.e(fVar9, fVar10, 0, 4);
                            } else {
                                f11 = 1.0f;
                            }
                            arrayList2 = arrayList2;
                            size = size;
                            i34++;
                            size = size;
                            arrayList2 = arrayList2;
                        }
                        if (f11 == 0.0f) {
                            f fVar11 = cVarArr5[i9 + 1].f16917i;
                            f fVar12 = cVarArr5[i9].f16917i;
                            z10 = false;
                            cVar.e(fVar11, fVar12, 0, 8);
                            arrayList2 = arrayList2;
                            size = size;
                        } else {
                            if (eVar18 != null) {
                                c[] cVarArr6 = eVar18.f16940R;
                                f fVar13 = cVarArr6[i9].f16917i;
                                int i35 = i9 + 1;
                                f fVar14 = cVarArr6[i35].f16917i;
                                f fVar15 = cVarArr5[i9].f16917i;
                                f fVar16 = cVarArr5[i35].f16917i;
                                b bVarL = cVar.l();
                                bVarL.f16230b = 0.0f;
                                if (f9 == 0.0f || f10 == f11) {
                                    bVarL.f16232d.g(fVar13, 1.0f);
                                    bVarL.f16232d.g(fVar14, -1.0f);
                                    bVarL.f16232d.g(fVar16, 1.0f);
                                    bVarL.f16232d.g(fVar15, -1.0f);
                                } else if (f10 == 0.0f) {
                                    bVarL.f16232d.g(fVar13, 1.0f);
                                    bVarL.f16232d.g(fVar14, -1.0f);
                                } else if (f11 == 0.0f) {
                                    bVarL.f16232d.g(fVar15, 1.0f);
                                    bVarL.f16232d.g(fVar16, -1.0f);
                                } else {
                                    float f12 = (f10 / f9) / (f11 / f9);
                                    bVarL.f16232d.g(fVar13, 1.0f);
                                    bVarL.f16232d.g(fVar14, -1.0f);
                                    bVarL.f16232d.g(fVar16, f12);
                                    bVarL.f16232d.g(fVar15, -f12);
                                }
                                cVar.c(bVarL);
                            } else {
                                f11 = f11;
                            }
                            f10 = f11;
                            eVar18 = eVar19;
                        }
                        i34++;
                        size = size;
                        arrayList2 = arrayList2;
                    }
                }
                if (eVar13 == null || !(eVar13 == eVar14 || z7)) {
                    i12 = i10;
                    if (!z8 || eVar13 == null) {
                        int i36 = 8;
                        if (z9 && eVar13 != null) {
                            int i37 = bVar2.j;
                            boolean z20 = i37 > 0 && bVar2.f16901i == i37;
                            e eVar20 = eVar13;
                            e eVar21 = eVar20;
                            while (eVar21 != null) {
                                e eVar22 = eVar21.f16978p0[i7];
                                while (eVar22 != null && eVar22.f16965i0 == i36) {
                                    eVar22 = eVar22.f16978p0[i7];
                                }
                                if (eVar21 == eVar13 || eVar21 == eVar14 || eVar22 == null) {
                                    eVar20 = eVar20;
                                    i12 = i12;
                                    i14 = i36;
                                } else {
                                    e eVar23 = eVar22 == eVar14 ? null : eVar22;
                                    c[] cVarArr7 = eVar21.f16940R;
                                    c cVar18 = cVarArr7[i9];
                                    f fVar17 = cVar18.f16917i;
                                    int i38 = i9 + 1;
                                    f fVar18 = eVar20.f16940R[i38].f16917i;
                                    int iE2 = cVar18.e();
                                    int iE3 = cVarArr7[i38].e();
                                    if (eVar23 != null) {
                                        cVar2 = eVar23.f16940R[i9];
                                        fVar2 = cVar2.f16917i;
                                        eVar = eVar23;
                                        c cVar19 = cVar2.f16914f;
                                        fVar3 = cVar19 != null ? cVar19.f16917i : null;
                                    } else {
                                        eVar = eVar23;
                                        c cVar20 = eVar14.f16940R[i9];
                                        fVar2 = cVar20 != null ? cVar20.f16917i : null;
                                        fVar3 = cVarArr7[i38].f16917i;
                                        cVar2 = cVar20;
                                    }
                                    int iE4 = cVar2 != null ? cVar2.e() + iE3 : iE3;
                                    int iE5 = eVar20.f16940R[i38].e() + iE2;
                                    int i39 = z20 ? 8 : 4;
                                    if (fVar17 == null || fVar18 == null || fVar2 == null || fVar3 == null) {
                                        i14 = 8;
                                    } else {
                                        i14 = 8;
                                        cVar.b(fVar17, fVar18, iE5, 0.5f, fVar2, fVar3, iE4, i39);
                                    }
                                    eVar22 = eVar;
                                }
                                eVar20 = eVar21.f16965i0 != i14 ? eVar21 : eVar20;
                                eVar21 = eVar22;
                                i36 = i14;
                                i12 = i12;
                            }
                            i13 = i12;
                            c cVar21 = eVar13.f16940R[i9];
                            c cVar22 = eVar17.f16940R[i9].f16914f;
                            int i40 = i9 + 1;
                            c cVar23 = eVar14.f16940R[i40];
                            c cVar24 = eVar12.f16940R[i40].f16914f;
                            if (cVar22 != null) {
                                if (eVar13 != eVar14) {
                                    cVar.e(cVar21.f16917i, cVar22.f16917i, cVar21.e(), 5);
                                } else if (cVar24 != null) {
                                    cVar.b(cVar21.f16917i, cVar22.f16917i, cVar21.e(), 0.5f, cVar23.f16917i, cVar24.f16917i, cVar23.e(), 5);
                                }
                            }
                            if (cVar24 != null && eVar13 != eVar14) {
                                cVar.e(cVar23.f16917i, cVar24.f16917i, -cVar23.e(), 5);
                            }
                        }
                        if ((z8 || z9) && eVar13 != null && eVar13 != eVar14) {
                            cVarArr2 = eVar13.f16940R;
                            c cVar25 = cVarArr2[i9];
                            if (eVar14 == null) {
                                eVar14 = eVar13;
                            }
                            i15 = i9 + 1;
                            c[] cVarArr8 = eVar14.f16940R;
                            cVar4 = cVarArr8[i15];
                            cVar5 = cVar25.f16914f;
                            if (cVar5 != null) {
                                fVar5 = cVar5.f16917i;
                            } else {
                                fVar5 = null;
                            }
                            cVar6 = cVar4.f16914f;
                            if (cVar6 != null) {
                                fVar6 = cVar6.f16917i;
                            } else {
                                fVar6 = null;
                            }
                            if (eVar12 != eVar14) {
                                c cVar26 = eVar12.f16940R[i15].f16914f;
                                fVar6 = cVar26 != null ? cVar26.f16917i : null;
                            }
                            if (eVar13 == eVar14) {
                                cVar4 = cVarArr2[i15];
                            }
                            if (fVar5 == null && fVar6 != null) {
                                cVar.b(cVar25.f16917i, fVar5, cVar25.e(), 0.5f, fVar6, cVar4.f16917i, cVarArr8[i15].e(), 5);
                            }
                        }
                    } else {
                        int i41 = bVar2.j;
                        boolean z21 = i41 > 0 && bVar2.f16901i == i41;
                        e eVar24 = eVar13;
                        e eVar25 = eVar24;
                        while (eVar25 != null) {
                            e eVar26 = eVar25.f16978p0[i7];
                            while (eVar26 != null && eVar26.f16965i0 == 8) {
                                eVar26 = eVar26.f16978p0[i7];
                            }
                            if (eVar26 != null || eVar25 == eVar14) {
                                c[] cVarArr9 = eVar25.f16940R;
                                c cVar27 = cVarArr9[i9];
                                f fVar19 = cVar27.f16917i;
                                c cVar28 = cVar27.f16914f;
                                f fVar20 = cVar28 != null ? cVar28.f16917i : null;
                                if (eVar24 != eVar25) {
                                    fVar20 = eVar24.f16940R[i9 + 1].f16917i;
                                } else if (eVar25 == eVar13) {
                                    c cVar29 = eVar17.f16940R[i9].f16914f;
                                    fVar20 = cVar29 != null ? cVar29.f16917i : null;
                                }
                                int iE6 = cVar27.e();
                                int i42 = i9 + 1;
                                int iE7 = cVarArr9[i42].e();
                                if (eVar26 != null) {
                                    cVar3 = eVar26.f16940R[i9];
                                    fVar4 = cVar3.f16917i;
                                } else {
                                    cVar3 = eVar12.f16940R[i42].f16914f;
                                    fVar4 = cVar3 != null ? cVar3.f16917i : null;
                                }
                                f fVar21 = cVarArr9[i42].f16917i;
                                if (cVar3 != null) {
                                    iE7 = cVar3.e() + iE7;
                                }
                                int iE8 = eVar24.f16940R[i42].e() + iE6;
                                if (fVar19 == null || fVar20 == null || fVar4 == null || fVar21 == null) {
                                    eVar2 = eVar26;
                                } else {
                                    if (eVar25 == eVar13) {
                                        iE8 = eVar13.f16940R[i9].e();
                                    }
                                    if (eVar25 == eVar14) {
                                        iE7 = eVar14.f16940R[i42].e();
                                    }
                                    int i43 = iE7;
                                    eVar2 = eVar26;
                                    cVar.b(fVar19, fVar20, iE8, 0.5f, fVar4, fVar21, i43, z21 ? 8 : 5);
                                }
                            } else {
                                eVar2 = eVar26;
                            }
                            eVar24 = eVar25.f16965i0 != 8 ? eVar25 : eVar24;
                            eVar25 = eVar2;
                        }
                    }
                } else {
                    c cVar30 = eVar17.f16940R[i9];
                    int i44 = i9 + 1;
                    c cVar31 = eVar12.f16940R[i44];
                    c cVar32 = cVar30.f16914f;
                    f fVar22 = cVar32 != null ? cVar32.f16917i : null;
                    c cVar33 = cVar31.f16914f;
                    f fVar23 = cVar33 != null ? cVar33.f16917i : null;
                    c cVar34 = eVar13.f16940R[i9];
                    if (eVar14 != null) {
                        cVar31 = eVar14.f16940R[i44];
                    }
                    if (fVar22 == null || fVar23 == null) {
                        i12 = i10;
                    } else {
                        i12 = i10;
                        cVar.b(cVar34.f16917i, fVar22, cVar34.e(), i7 == 0 ? eVar16.f16959f0 : eVar16.f16961g0, fVar23, cVar31.f16917i, cVar31.e(), 7);
                    }
                }
                i13 = i12;
                if (z8) {
                    cVarArr2 = eVar13.f16940R;
                    c cVar210 = cVarArr2[i9];
                    if (eVar14 == null) {
                        eVar14 = eVar13;
                    }
                    i15 = i9 + 1;
                    c[] cVarArr10 = eVar14.f16940R;
                    cVar4 = cVarArr10[i15];
                    cVar5 = cVar210.f16914f;
                    if (cVar5 != null) {
                        fVar5 = cVar5.f16917i;
                    } else {
                        fVar5 = null;
                    }
                    cVar6 = cVar4.f16914f;
                    if (cVar6 != null) {
                        fVar6 = cVar6.f16917i;
                    } else {
                        fVar6 = null;
                    }
                    if (eVar12 != eVar14) {
                        c cVar211 = eVar12.f16940R[i15].f16914f;
                        fVar6 = cVar211 != null ? cVar211.f16917i : null;
                    }
                    if (eVar13 == eVar14) {
                        cVar4 = cVarArr2[i15];
                    }
                    if (fVar5 == null) {
                    }
                } else {
                    cVarArr2 = eVar13.f16940R;
                    c cVar212 = cVarArr2[i9];
                    if (eVar14 == null) {
                        eVar14 = eVar13;
                    }
                    i15 = i9 + 1;
                    c[] cVarArr11 = eVar14.f16940R;
                    cVar4 = cVarArr11[i15];
                    cVar5 = cVar212.f16914f;
                    if (cVar5 != null) {
                        fVar5 = cVar5.f16917i;
                    } else {
                        fVar5 = null;
                    }
                    cVar6 = cVar4.f16914f;
                    if (cVar6 != null) {
                        fVar6 = cVar6.f16917i;
                    } else {
                        fVar6 = null;
                    }
                    if (eVar12 != eVar14) {
                        c cVar213 = eVar12.f16940R[i15].f16914f;
                        fVar6 = cVar213 != null ? cVar213.f16917i : null;
                    }
                    if (eVar13 == eVar14) {
                        cVar4 = cVarArr2[i15];
                    }
                    if (fVar5 == null) {
                    }
                }
            } else {
                bVarArr2 = bVarArr;
                i13 = i10;
            }
            i18 = i13 + 1;
            fVar7 = fVar;
            i8 = i11;
            bVarArr = bVarArr2;
        }
    }

    public static void b(f fVar, c cVar, e eVar) {
        eVar.f16975o = -1;
        eVar.f16977p = -1;
        d dVar = fVar.f16943U[0];
        d dVar2 = d.f16919b;
        d dVar3 = d.f16921d;
        if (dVar != dVar2 && eVar.f16943U[0] == dVar3) {
            c cVar2 = eVar.f16932J;
            int i7 = cVar2.f16915g;
            int iR = fVar.r();
            c cVar3 = eVar.f16934L;
            int i8 = iR - cVar3.f16915g;
            cVar2.f16917i = cVar.k(cVar2);
            cVar3.f16917i = cVar.k(cVar3);
            cVar.d(cVar2.f16917i, i7);
            cVar.d(cVar3.f16917i, i8);
            eVar.f16975o = 2;
            eVar.f16950a0 = i7;
            int i9 = i8 - i7;
            eVar.f16945W = i9;
            int i10 = eVar.f16955d0;
            if (i9 < i10) {
                eVar.f16945W = i10;
            }
        }
        if (fVar.f16943U[1] == dVar2 || eVar.f16943U[1] != dVar3) {
            return;
        }
        c cVar4 = eVar.f16933K;
        int i11 = cVar4.f16915g;
        int iL = fVar.l();
        c cVar5 = eVar.f16935M;
        int i12 = iL - cVar5.f16915g;
        cVar4.f16917i = cVar.k(cVar4);
        cVar5.f16917i = cVar.k(cVar5);
        cVar.d(cVar4.f16917i, i11);
        cVar.d(cVar5.f16917i, i12);
        if (eVar.c0 > 0 || eVar.f16965i0 == 8) {
            c cVar6 = eVar.f16936N;
            cVar6.f16917i = cVar.k(cVar6);
            cVar.d(cVar6.f16917i, eVar.c0 + i11);
        }
        eVar.f16977p = 2;
        eVar.f16952b0 = i11;
        int i13 = i12 - i11;
        eVar.f16946X = i13;
        int i14 = eVar.f16957e0;
        if (i13 < i14) {
            eVar.f16946X = i14;
        }
    }

    public static final boolean c(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
