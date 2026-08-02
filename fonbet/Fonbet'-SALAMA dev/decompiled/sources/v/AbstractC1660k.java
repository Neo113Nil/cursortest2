package v;

import java.util.ArrayList;

/* renamed from: v.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1660k {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f17057a = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:159:0x0294, code lost:
    
        if (r2.f16906d == r9) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0114, code lost:
    
        if (r5.f16906d == r13) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x044c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06b6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x06cd  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06d6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x070c A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0598 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(C1655f c1655f, t.c cVar, ArrayList arrayList, int i7) {
        int i8;
        C1651b[] c1651bArr;
        int i9;
        int i10;
        int i11;
        boolean z4;
        boolean z7;
        float f7;
        C1654e c1654e;
        boolean z8;
        boolean z9;
        C1652c[] c1652cArr;
        C1651b[] c1651bArr2;
        ArrayList arrayList2;
        int i12;
        C1654e c1654e2;
        int i13;
        C1652c c1652c;
        C1652c c1652c2;
        int i14;
        C1654e c1654e3;
        int i15;
        int i16;
        C1654e c1654e4;
        t.f fVar;
        t.f fVar2;
        C1652c c1652c3;
        C1652c c1652c4;
        t.f fVar3;
        C1654e c1654e5;
        C1654e c1654e6;
        C1654e c1654e7;
        C1652c c1652c5;
        int i17;
        C1652c[] c1652cArr2;
        C1652c c1652c6;
        t.f fVar4;
        t.f fVar5;
        int size;
        int i18;
        ArrayList arrayList3;
        int i19;
        float f8;
        C1654e c1654e8;
        boolean z10;
        C1651b[] c1651bArr3;
        boolean z11;
        C1654e c1654e9;
        C1651b c1651b;
        C1654e c1654e10;
        C1654e c1654e11;
        int i20;
        int i21;
        int i22;
        int i23;
        C1654e c1654e12;
        C1652c c1652c7;
        C1654e c1654e13;
        C1655f c1655f2 = c1655f;
        ArrayList arrayList4 = arrayList;
        if (i7 == 0) {
            i8 = c1655f2.f16990D0;
            c1651bArr = c1655f2.f16993G0;
            i9 = 0;
        } else {
            i8 = c1655f2.f16991E0;
            c1651bArr = c1655f2.f16992F0;
            i9 = 2;
        }
        int i24 = 0;
        while (i24 < i8) {
            C1651b c1651b2 = c1651bArr[i24];
            boolean z12 = c1651b2.f16902q;
            EnumC1653d enumC1653d = EnumC1653d.f16914c;
            C1654e c1654e14 = c1651b2.f16887a;
            int i25 = 1;
            int i26 = 8;
            if (z12) {
                i10 = i24;
                i11 = i8;
                z4 = true;
            } else {
                int i27 = c1651b2.f16897l;
                int i28 = i27 * 2;
                C1654e c1654e15 = c1654e14;
                C1654e c1654e16 = c1654e15;
                boolean z13 = false;
                while (!z13) {
                    c1651b2.f16895i += i25;
                    c1654e15.f16972p0[i27] = null;
                    c1654e15.f16970o0[i27] = null;
                    int i29 = c1654e15.f16959i0;
                    C1652c[] c1652cArr3 = c1654e15.f16934R;
                    if (i29 != i26) {
                        c1654e15.k(i27);
                        c1652cArr3[i28].e();
                        int i30 = i28 + 1;
                        c1652cArr3[i30].e();
                        c1652cArr3[i28].e();
                        c1652cArr3[i30].e();
                        if (c1651b2.f16888b == null) {
                            c1651b2.f16888b = c1654e15;
                        }
                        c1651b2.f16890d = c1654e15;
                        EnumC1653d enumC1653d2 = c1654e15.f16937U[i27];
                        if (enumC1653d2 == enumC1653d) {
                            int i31 = c1654e15.f16979t[i27];
                            if (i31 == 0 || i31 == 3 || i31 == 2) {
                                c1651b2.j++;
                                float f9 = c1654e15.f16968n0[i27];
                                if (f9 > 0.0f) {
                                    i22 = i24;
                                    c1651b2.f16896k += f9;
                                } else {
                                    i22 = i24;
                                }
                                i23 = i8;
                                if (c1654e15.f16959i0 != 8 && enumC1653d2 == enumC1653d && (i31 == 0 || i31 == 3)) {
                                    if (f9 < 0.0f) {
                                        c1651b2.f16899n = true;
                                    } else {
                                        c1651b2.f16900o = true;
                                    }
                                    if (c1651b2.f16894h == null) {
                                        c1651b2.f16894h = new ArrayList();
                                    }
                                    c1651b2.f16894h.add(c1654e15);
                                }
                                if (c1651b2.f16892f == null) {
                                    c1651b2.f16892f = c1654e15;
                                }
                                C1654e c1654e17 = c1651b2.f16893g;
                                if (c1654e17 != null) {
                                    c1654e17.f16970o0[i27] = c1654e15;
                                }
                                c1651b2.f16893g = c1654e15;
                            } else {
                                i22 = i24;
                                i23 = i8;
                            }
                            if (i27 == 0) {
                                if (c1654e15.f16975r == 0 && c1654e15.f16981u == 0) {
                                    int i32 = c1654e15.f16982v;
                                }
                            } else if (c1654e15.f16977s == 0 && c1654e15.f16984x == 0) {
                                int i33 = c1654e15.f16985y;
                            }
                            c1654e12 = c1654e16;
                            if (c1654e12 != c1654e15) {
                                c1654e12.f16972p0[i27] = c1654e15;
                            }
                            c1652c7 = c1652cArr3[i28 + 1].f16908f;
                            if (c1652c7 != null) {
                                c1654e13 = c1652c7.f16906d;
                                C1652c c1652c8 = c1654e13.f16934R[i28].f16908f;
                                if (c1652c8 != null) {
                                }
                            }
                            c1654e13 = null;
                            if (c1654e13 != null) {
                                c1654e13 = c1654e15;
                                z13 = true;
                            }
                            c1654e16 = c1654e15;
                            i24 = i22;
                            i8 = i23;
                            i26 = 8;
                            c1654e15 = c1654e13;
                            i25 = 1;
                        }
                    }
                    i22 = i24;
                    i23 = i8;
                    c1654e12 = c1654e16;
                    if (c1654e12 != c1654e15) {
                    }
                    c1652c7 = c1652cArr3[i28 + 1].f16908f;
                    if (c1652c7 != null) {
                    }
                    c1654e13 = null;
                    if (c1654e13 != null) {
                    }
                    c1654e16 = c1654e15;
                    i24 = i22;
                    i8 = i23;
                    i26 = 8;
                    c1654e15 = c1654e13;
                    i25 = 1;
                }
                i10 = i24;
                i11 = i8;
                C1654e c1654e18 = c1651b2.f16888b;
                if (c1654e18 != null) {
                    c1654e18.f16934R[i28].e();
                }
                C1654e c1654e19 = c1651b2.f16890d;
                if (c1654e19 != null) {
                    c1654e19.f16934R[i28 + 1].e();
                }
                c1651b2.f16889c = c1654e15;
                if (i27 == 0 && c1651b2.f16898m) {
                    c1651b2.f16891e = c1654e15;
                } else {
                    c1651b2.f16891e = c1654e14;
                }
                c1651b2.f16901p = c1651b2.f16900o && c1651b2.f16899n;
                z4 = true;
            }
            c1651b2.f16902q = z4;
            if (arrayList4 == null || arrayList4.contains(c1654e14)) {
                C1654e c1654e20 = c1651b2.f16889c;
                C1654e c1654e21 = c1651b2.f16888b;
                C1654e c1654e22 = c1651b2.f16890d;
                C1654e c1654e23 = c1651b2.f16891e;
                float f10 = c1651b2.f16896k;
                boolean z14 = c1655f2.f16937U[i7] == EnumC1653d.f16913b;
                if (i7 == 0) {
                    int i34 = c1654e23.f16964l0;
                    boolean z15 = i34 == 0;
                    if (i34 == 1) {
                        z9 = true;
                        i21 = 2;
                    } else {
                        i21 = 2;
                        z9 = false;
                    }
                    z7 = i34 == i21;
                    f7 = f10;
                    c1654e = c1654e14;
                    z8 = z15;
                } else {
                    int i35 = c1654e23.f16966m0;
                    boolean z16 = i35 == 0;
                    boolean z17 = i35 == 1;
                    z7 = i35 == 2;
                    f7 = f10;
                    c1654e = c1654e14;
                    z8 = z16;
                    z9 = z17;
                }
                boolean z18 = false;
                while (true) {
                    c1652cArr = c1655f2.f16934R;
                    if (z18) {
                        break;
                    }
                    C1652c c1652c9 = c1654e.f16934R[i9];
                    int i36 = z7 ? 1 : 4;
                    int e7 = c1652c9.e();
                    boolean z19 = z18;
                    if (c1654e.f16937U[i7] == enumC1653d && c1654e.f16979t[i7] == 0) {
                        c1651bArr3 = c1651bArr;
                        z11 = true;
                    } else {
                        c1651bArr3 = c1651bArr;
                        z11 = false;
                    }
                    C1652c c1652c10 = c1652c9.f16908f;
                    if (c1652c10 != null && c1654e != c1654e14) {
                        e7 = c1652c10.e() + e7;
                    }
                    int i37 = e7;
                    if (!z7 || c1654e == c1654e14 || c1654e == c1654e21) {
                        c1654e9 = c1654e23;
                    } else {
                        c1654e9 = c1654e23;
                        i36 = 8;
                    }
                    C1652c c1652c11 = c1652c9.f16908f;
                    if (c1652c11 != null) {
                        if (c1654e == c1654e21) {
                            c1654e10 = c1654e14;
                            c1651b = c1651b2;
                            cVar.f(c1652c9.f16911i, c1652c11.f16911i, i37, 6);
                        } else {
                            c1651b = c1651b2;
                            c1654e10 = c1654e14;
                            cVar.f(c1652c9.f16911i, c1652c11.f16911i, i37, 8);
                        }
                        if (z11 && !z7) {
                            i36 = 5;
                        }
                        cVar.e(c1652c9.f16911i, c1652c9.f16908f.f16911i, i37, (c1654e == c1654e21 && z7 && c1654e.f16936T[i7]) ? 5 : i36);
                    } else {
                        c1651b = c1651b2;
                        c1654e10 = c1654e14;
                    }
                    C1652c[] c1652cArr4 = c1654e.f16934R;
                    if (z14) {
                        if (c1654e.f16959i0 == 8 || c1654e.f16937U[i7] != enumC1653d) {
                            i20 = 0;
                        } else {
                            i20 = 0;
                            cVar.f(c1652cArr4[i9 + 1].f16911i, c1652cArr4[i9].f16911i, 0, 5);
                        }
                        cVar.f(c1652cArr4[i9].f16911i, c1652cArr[i9].f16911i, i20, 8);
                    }
                    C1652c c1652c12 = c1652cArr4[i9 + 1].f16908f;
                    if (c1652c12 != null) {
                        c1654e11 = c1652c12.f16906d;
                        C1652c c1652c13 = c1654e11.f16934R[i9].f16908f;
                        if (c1652c13 != null) {
                        }
                    }
                    c1654e11 = null;
                    if (c1654e11 != null) {
                        c1654e = c1654e11;
                        z18 = z19;
                    } else {
                        z18 = true;
                    }
                    c1654e23 = c1654e9;
                    c1651bArr = c1651bArr3;
                    c1654e14 = c1654e10;
                    c1651b2 = c1651b;
                }
                C1651b c1651b3 = c1651b2;
                C1654e c1654e24 = c1654e23;
                C1654e c1654e25 = c1654e14;
                c1651bArr2 = c1651bArr;
                if (c1654e22 != null) {
                    int i38 = i9 + 1;
                    if (c1654e20.f16934R[i38].f16908f != null) {
                        C1652c c1652c14 = c1654e22.f16934R[i38];
                        if (c1654e22.f16937U[i7] == enumC1653d && c1654e22.f16979t[i7] == 0 && !z7) {
                            C1652c c1652c15 = c1652c14.f16908f;
                            if (c1652c15.f16906d == c1655f2) {
                                cVar.e(c1652c14.f16911i, c1652c15.f16911i, -c1652c14.e(), 5);
                                cVar.g(c1652c14.f16911i, c1654e20.f16934R[i38].f16908f.f16911i, -c1652c14.e(), 6);
                                if (z14) {
                                    int i39 = i9 + 1;
                                    t.f fVar6 = c1652cArr[i39].f16911i;
                                    C1652c c1652c16 = c1654e20.f16934R[i39];
                                    cVar.f(fVar6, c1652c16.f16911i, c1652c16.e(), 8);
                                }
                                arrayList2 = c1651b3.f16894h;
                                if (arrayList2 != null && (size = arrayList2.size()) > 1) {
                                    float f11 = (c1651b3.f16899n || c1651b3.f16901p) ? f7 : c1651b3.j;
                                    C1654e c1654e26 = null;
                                    float f12 = 0.0f;
                                    i18 = 0;
                                    while (i18 < size) {
                                        C1654e c1654e27 = (C1654e) arrayList2.get(i18);
                                        float f13 = c1654e27.f16968n0[i7];
                                        C1652c[] c1652cArr5 = c1654e27.f16934R;
                                        if (f13 < 0.0f) {
                                            if (c1651b3.f16901p) {
                                                t.f fVar7 = c1652cArr5[i9 + 1].f16911i;
                                                t.f fVar8 = c1652cArr5[i9].f16911i;
                                                z10 = false;
                                                cVar.e(fVar7, fVar8, 0, 4);
                                                arrayList3 = arrayList2;
                                                i19 = size;
                                                i18++;
                                                size = i19;
                                                arrayList2 = arrayList3;
                                            } else {
                                                f13 = 1.0f;
                                            }
                                        }
                                        if (f13 == 0.0f) {
                                            t.f fVar9 = c1652cArr5[i9 + 1].f16911i;
                                            t.f fVar10 = c1652cArr5[i9].f16911i;
                                            z10 = false;
                                            cVar.e(fVar9, fVar10, 0, 8);
                                            arrayList3 = arrayList2;
                                            i19 = size;
                                            i18++;
                                            size = i19;
                                            arrayList2 = arrayList3;
                                        } else {
                                            if (c1654e26 != null) {
                                                C1652c[] c1652cArr6 = c1654e26.f16934R;
                                                t.f fVar11 = c1652cArr6[i9].f16911i;
                                                int i40 = i9 + 1;
                                                t.f fVar12 = c1652cArr6[i40].f16911i;
                                                arrayList3 = arrayList2;
                                                t.f fVar13 = c1652cArr5[i9].f16911i;
                                                t.f fVar14 = c1652cArr5[i40].f16911i;
                                                i19 = size;
                                                t.b l7 = cVar.l();
                                                c1654e8 = c1654e27;
                                                l7.f16224b = 0.0f;
                                                if (f11 == 0.0f || f12 == f13) {
                                                    f8 = f13;
                                                    l7.f16226d.g(fVar11, 1.0f);
                                                    l7.f16226d.g(fVar12, -1.0f);
                                                    l7.f16226d.g(fVar14, 1.0f);
                                                    l7.f16226d.g(fVar13, -1.0f);
                                                } else {
                                                    if (f12 == 0.0f) {
                                                        l7.f16226d.g(fVar11, 1.0f);
                                                        l7.f16226d.g(fVar12, -1.0f);
                                                    } else if (f13 == 0.0f) {
                                                        l7.f16226d.g(fVar13, 1.0f);
                                                        l7.f16226d.g(fVar14, -1.0f);
                                                    } else {
                                                        float f14 = (f12 / f11) / (f13 / f11);
                                                        f8 = f13;
                                                        l7.f16226d.g(fVar11, 1.0f);
                                                        l7.f16226d.g(fVar12, -1.0f);
                                                        l7.f16226d.g(fVar14, f14);
                                                        l7.f16226d.g(fVar13, -f14);
                                                    }
                                                    f8 = f13;
                                                }
                                                cVar.c(l7);
                                            } else {
                                                arrayList3 = arrayList2;
                                                i19 = size;
                                                f8 = f13;
                                                c1654e8 = c1654e27;
                                            }
                                            f12 = f8;
                                            c1654e26 = c1654e8;
                                            i18++;
                                            size = i19;
                                            arrayList2 = arrayList3;
                                        }
                                    }
                                }
                                if (c1654e21 == null && (c1654e21 == c1654e22 || z7)) {
                                    C1652c c1652c17 = c1654e25.f16934R[i9];
                                    int i41 = i9 + 1;
                                    C1652c c1652c18 = c1654e20.f16934R[i41];
                                    C1652c c1652c19 = c1652c17.f16908f;
                                    t.f fVar15 = c1652c19 != null ? c1652c19.f16911i : null;
                                    C1652c c1652c20 = c1652c18.f16908f;
                                    t.f fVar16 = c1652c20 != null ? c1652c20.f16911i : null;
                                    C1652c c1652c21 = c1654e21.f16934R[i9];
                                    if (c1654e22 != null) {
                                        c1652c18 = c1654e22.f16934R[i41];
                                    }
                                    if (fVar15 == null || fVar16 == null) {
                                        i12 = i10;
                                    } else {
                                        i12 = i10;
                                        cVar.b(c1652c21.f16911i, fVar15, c1652c21.e(), i7 == 0 ? c1654e24.f16953f0 : c1654e24.f16955g0, fVar16, c1652c18.f16911i, c1652c18.e(), 7);
                                    }
                                } else {
                                    i12 = i10;
                                    if (z8 || c1654e21 == null) {
                                        int i42 = 8;
                                        if (z9 && c1654e21 != null) {
                                            int i43 = c1651b3.j;
                                            boolean z20 = i43 <= 0 && c1651b3.f16895i == i43;
                                            C1654e c1654e28 = c1654e21;
                                            c1654e2 = c1654e28;
                                            while (c1654e2 != null) {
                                                C1654e c1654e29 = c1654e2.f16972p0[i7];
                                                while (c1654e29 != null && c1654e29.f16959i0 == i42) {
                                                    c1654e29 = c1654e29.f16972p0[i7];
                                                }
                                                if (c1654e2 == c1654e21 || c1654e2 == c1654e22 || c1654e29 == null) {
                                                    c1654e3 = c1654e28;
                                                    i15 = i12;
                                                    i16 = i42;
                                                } else {
                                                    C1654e c1654e30 = c1654e29 == c1654e22 ? null : c1654e29;
                                                    C1652c[] c1652cArr7 = c1654e2.f16934R;
                                                    C1652c c1652c22 = c1652cArr7[i9];
                                                    t.f fVar17 = c1652c22.f16911i;
                                                    int i44 = i9 + 1;
                                                    t.f fVar18 = c1654e28.f16934R[i44].f16911i;
                                                    int e8 = c1652c22.e();
                                                    int e9 = c1652cArr7[i44].e();
                                                    if (c1654e30 != null) {
                                                        c1652c3 = c1654e30.f16934R[i9];
                                                        fVar = c1652c3.f16911i;
                                                        c1654e4 = c1654e30;
                                                        C1652c c1652c23 = c1652c3.f16908f;
                                                        fVar2 = c1652c23 != null ? c1652c23.f16911i : null;
                                                    } else {
                                                        c1654e4 = c1654e30;
                                                        C1652c c1652c24 = c1654e22.f16934R[i9];
                                                        fVar = c1652c24 != null ? c1652c24.f16911i : null;
                                                        fVar2 = c1652cArr7[i44].f16911i;
                                                        c1652c3 = c1652c24;
                                                    }
                                                    int e10 = c1652c3 != null ? c1652c3.e() + e9 : e9;
                                                    int e11 = c1654e28.f16934R[i44].e() + e8;
                                                    int i45 = z20 ? 8 : 4;
                                                    if (fVar17 == null || fVar18 == null || fVar == null || fVar2 == null) {
                                                        c1654e3 = c1654e28;
                                                        i15 = i12;
                                                        i16 = 8;
                                                    } else {
                                                        c1654e3 = c1654e28;
                                                        int i46 = e10;
                                                        i15 = i12;
                                                        i16 = 8;
                                                        cVar.b(fVar17, fVar18, e11, 0.5f, fVar, fVar2, i46, i45);
                                                    }
                                                    c1654e29 = c1654e4;
                                                }
                                                c1654e28 = c1654e2.f16959i0 != i16 ? c1654e2 : c1654e3;
                                                c1654e2 = c1654e29;
                                                i42 = i16;
                                                i12 = i15;
                                            }
                                            i13 = i12;
                                            C1652c c1652c25 = c1654e21.f16934R[i9];
                                            c1652c = c1654e25.f16934R[i9].f16908f;
                                            int i47 = i9 + 1;
                                            C1652c c1652c26 = c1654e22.f16934R[i47];
                                            c1652c2 = c1654e20.f16934R[i47].f16908f;
                                            if (c1652c != null) {
                                                if (c1654e21 != c1654e22) {
                                                    cVar.e(c1652c25.f16911i, c1652c.f16911i, c1652c25.e(), 5);
                                                } else if (c1652c2 != null) {
                                                    i14 = 5;
                                                    cVar.b(c1652c25.f16911i, c1652c.f16911i, c1652c25.e(), 0.5f, c1652c26.f16911i, c1652c2.f16911i, c1652c26.e(), 5);
                                                    if (c1652c2 != null && c1654e21 != c1654e22) {
                                                        cVar.e(c1652c26.f16911i, c1652c2.f16911i, -c1652c26.e(), i14);
                                                    }
                                                    if ((!z8 || z9) && c1654e21 != null && c1654e21 != c1654e22) {
                                                        C1652c[] c1652cArr8 = c1654e21.f16934R;
                                                        c1652c5 = c1652cArr8[i9];
                                                        if (c1654e22 == null) {
                                                            c1654e22 = c1654e21;
                                                        }
                                                        i17 = i9 + 1;
                                                        c1652cArr2 = c1654e22.f16934R;
                                                        c1652c6 = c1652cArr2[i17];
                                                        C1652c c1652c27 = c1652c5.f16908f;
                                                        fVar4 = c1652c27 == null ? c1652c27.f16911i : null;
                                                        C1652c c1652c28 = c1652c6.f16908f;
                                                        fVar5 = c1652c28 == null ? c1652c28.f16911i : null;
                                                        if (c1654e20 != c1654e22) {
                                                            C1652c c1652c29 = c1654e20.f16934R[i17].f16908f;
                                                            fVar5 = c1652c29 != null ? c1652c29.f16911i : null;
                                                        }
                                                        if (c1654e21 == c1654e22) {
                                                            c1652c6 = c1652cArr8[i17];
                                                        }
                                                        if (fVar4 != null && fVar5 != null) {
                                                            cVar.b(c1652c5.f16911i, fVar4, c1652c5.e(), 0.5f, fVar5, c1652c6.f16911i, c1652cArr2[i17].e(), 5);
                                                        }
                                                    }
                                                }
                                            }
                                            i14 = 5;
                                            if (c1652c2 != null) {
                                                cVar.e(c1652c26.f16911i, c1652c2.f16911i, -c1652c26.e(), i14);
                                            }
                                            if (!z8) {
                                            }
                                            C1652c[] c1652cArr82 = c1654e21.f16934R;
                                            c1652c5 = c1652cArr82[i9];
                                            if (c1654e22 == null) {
                                            }
                                            i17 = i9 + 1;
                                            c1652cArr2 = c1654e22.f16934R;
                                            c1652c6 = c1652cArr2[i17];
                                            C1652c c1652c272 = c1652c5.f16908f;
                                            if (c1652c272 == null) {
                                            }
                                            C1652c c1652c282 = c1652c6.f16908f;
                                            if (c1652c282 == null) {
                                            }
                                            if (c1654e20 != c1654e22) {
                                            }
                                            if (c1654e21 == c1654e22) {
                                            }
                                            if (fVar4 != null) {
                                                cVar.b(c1652c5.f16911i, fVar4, c1652c5.e(), 0.5f, fVar5, c1652c6.f16911i, c1652cArr2[i17].e(), 5);
                                            }
                                        }
                                    } else {
                                        int i48 = c1651b3.j;
                                        boolean z21 = i48 > 0 && c1651b3.f16895i == i48;
                                        C1654e c1654e31 = c1654e21;
                                        for (C1654e c1654e32 = c1654e31; c1654e32 != null; c1654e32 = c1654e6) {
                                            C1654e c1654e33 = c1654e32.f16972p0[i7];
                                            while (c1654e33 != null && c1654e33.f16959i0 == 8) {
                                                c1654e33 = c1654e33.f16972p0[i7];
                                            }
                                            if (c1654e33 != null || c1654e32 == c1654e22) {
                                                C1652c[] c1652cArr9 = c1654e32.f16934R;
                                                C1652c c1652c30 = c1652cArr9[i9];
                                                t.f fVar19 = c1652c30.f16911i;
                                                C1652c c1652c31 = c1652c30.f16908f;
                                                t.f fVar20 = c1652c31 != null ? c1652c31.f16911i : null;
                                                if (c1654e31 != c1654e32) {
                                                    fVar20 = c1654e31.f16934R[i9 + 1].f16911i;
                                                } else if (c1654e32 == c1654e21) {
                                                    C1652c c1652c32 = c1654e25.f16934R[i9].f16908f;
                                                    fVar20 = c1652c32 != null ? c1652c32.f16911i : null;
                                                }
                                                int e12 = c1652c30.e();
                                                int i49 = i9 + 1;
                                                int e13 = c1652cArr9[i49].e();
                                                if (c1654e33 != null) {
                                                    c1652c4 = c1654e33.f16934R[i9];
                                                    fVar3 = c1652c4.f16911i;
                                                } else {
                                                    c1652c4 = c1654e20.f16934R[i49].f16908f;
                                                    fVar3 = c1652c4 != null ? c1652c4.f16911i : null;
                                                }
                                                t.f fVar21 = c1652cArr9[i49].f16911i;
                                                if (c1652c4 != null) {
                                                    e13 = c1652c4.e() + e13;
                                                }
                                                int e14 = c1654e31.f16934R[i49].e() + e12;
                                                if (fVar19 != null && fVar20 != null && fVar3 != null && fVar21 != null) {
                                                    if (c1654e32 == c1654e21) {
                                                        e14 = c1654e21.f16934R[i9].e();
                                                    }
                                                    if (c1654e32 == c1654e22) {
                                                        e13 = c1654e22.f16934R[i49].e();
                                                    }
                                                    t.f fVar22 = fVar20;
                                                    int i50 = e14;
                                                    t.f fVar23 = fVar3;
                                                    c1654e5 = c1654e31;
                                                    int i51 = e13;
                                                    c1654e6 = c1654e33;
                                                    c1654e7 = c1654e32;
                                                    cVar.b(fVar19, fVar22, i50, 0.5f, fVar23, fVar21, i51, z21 ? 8 : 5);
                                                    c1654e31 = c1654e7.f16959i0 == 8 ? c1654e7 : c1654e5;
                                                }
                                            }
                                            c1654e6 = c1654e33;
                                            c1654e5 = c1654e31;
                                            c1654e7 = c1654e32;
                                            if (c1654e7.f16959i0 == 8) {
                                            }
                                        }
                                    }
                                }
                                i13 = i12;
                                if (!z8) {
                                }
                                C1652c[] c1652cArr822 = c1654e21.f16934R;
                                c1652c5 = c1652cArr822[i9];
                                if (c1654e22 == null) {
                                }
                                i17 = i9 + 1;
                                c1652cArr2 = c1654e22.f16934R;
                                c1652c6 = c1652cArr2[i17];
                                C1652c c1652c2722 = c1652c5.f16908f;
                                if (c1652c2722 == null) {
                                }
                                C1652c c1652c2822 = c1652c6.f16908f;
                                if (c1652c2822 == null) {
                                }
                                if (c1654e20 != c1654e22) {
                                }
                                if (c1654e21 == c1654e22) {
                                }
                                if (fVar4 != null) {
                                }
                            }
                        }
                        if (z7) {
                            C1652c c1652c33 = c1652c14.f16908f;
                            if (c1652c33.f16906d == c1655f2) {
                                cVar.e(c1652c14.f16911i, c1652c33.f16911i, -c1652c14.e(), 4);
                            }
                        }
                        cVar.g(c1652c14.f16911i, c1654e20.f16934R[i38].f16908f.f16911i, -c1652c14.e(), 6);
                        if (z14) {
                        }
                        arrayList2 = c1651b3.f16894h;
                        if (arrayList2 != null) {
                            if (c1651b3.f16899n) {
                            }
                            C1654e c1654e262 = null;
                            float f122 = 0.0f;
                            i18 = 0;
                            while (i18 < size) {
                            }
                        }
                        if (c1654e21 == null) {
                        }
                        i12 = i10;
                        if (z8) {
                        }
                        int i422 = 8;
                        if (z9) {
                            int i432 = c1651b3.j;
                            if (i432 <= 0) {
                            }
                            C1654e c1654e282 = c1654e21;
                            c1654e2 = c1654e282;
                            while (c1654e2 != null) {
                            }
                            i13 = i12;
                            C1652c c1652c252 = c1654e21.f16934R[i9];
                            c1652c = c1654e25.f16934R[i9].f16908f;
                            int i472 = i9 + 1;
                            C1652c c1652c262 = c1654e22.f16934R[i472];
                            c1652c2 = c1654e20.f16934R[i472].f16908f;
                            if (c1652c != null) {
                            }
                            i14 = 5;
                            if (c1652c2 != null) {
                            }
                            if (!z8) {
                            }
                            C1652c[] c1652cArr8222 = c1654e21.f16934R;
                            c1652c5 = c1652cArr8222[i9];
                            if (c1654e22 == null) {
                            }
                            i17 = i9 + 1;
                            c1652cArr2 = c1654e22.f16934R;
                            c1652c6 = c1652cArr2[i17];
                            C1652c c1652c27222 = c1652c5.f16908f;
                            if (c1652c27222 == null) {
                            }
                            C1652c c1652c28222 = c1652c6.f16908f;
                            if (c1652c28222 == null) {
                            }
                            if (c1654e20 != c1654e22) {
                            }
                            if (c1654e21 == c1654e22) {
                            }
                            if (fVar4 != null) {
                            }
                        }
                        i13 = i12;
                        if (!z8) {
                        }
                        C1652c[] c1652cArr82222 = c1654e21.f16934R;
                        c1652c5 = c1652cArr82222[i9];
                        if (c1654e22 == null) {
                        }
                        i17 = i9 + 1;
                        c1652cArr2 = c1654e22.f16934R;
                        c1652c6 = c1652cArr2[i17];
                        C1652c c1652c272222 = c1652c5.f16908f;
                        if (c1652c272222 == null) {
                        }
                        C1652c c1652c282222 = c1652c6.f16908f;
                        if (c1652c282222 == null) {
                        }
                        if (c1654e20 != c1654e22) {
                        }
                        if (c1654e21 == c1654e22) {
                        }
                        if (fVar4 != null) {
                        }
                    }
                }
                if (z14) {
                }
                arrayList2 = c1651b3.f16894h;
                if (arrayList2 != null) {
                }
                if (c1654e21 == null) {
                }
                i12 = i10;
                if (z8) {
                }
                int i4222 = 8;
                if (z9) {
                }
                i13 = i12;
                if (!z8) {
                }
                C1652c[] c1652cArr822222 = c1654e21.f16934R;
                c1652c5 = c1652cArr822222[i9];
                if (c1654e22 == null) {
                }
                i17 = i9 + 1;
                c1652cArr2 = c1654e22.f16934R;
                c1652c6 = c1652cArr2[i17];
                C1652c c1652c2722222 = c1652c5.f16908f;
                if (c1652c2722222 == null) {
                }
                C1652c c1652c2822222 = c1652c6.f16908f;
                if (c1652c2822222 == null) {
                }
                if (c1654e20 != c1654e22) {
                }
                if (c1654e21 == c1654e22) {
                }
                if (fVar4 != null) {
                }
            } else {
                c1651bArr2 = c1651bArr;
                i13 = i10;
            }
            i24 = i13 + 1;
            c1655f2 = c1655f;
            arrayList4 = arrayList;
            i8 = i11;
            c1651bArr = c1651bArr2;
        }
    }

    public static void b(C1655f c1655f, t.c cVar, C1654e c1654e) {
        c1654e.f16969o = -1;
        c1654e.f16971p = -1;
        EnumC1653d enumC1653d = c1655f.f16937U[0];
        EnumC1653d enumC1653d2 = EnumC1653d.f16913b;
        EnumC1653d enumC1653d3 = EnumC1653d.f16915d;
        if (enumC1653d != enumC1653d2 && c1654e.f16937U[0] == enumC1653d3) {
            C1652c c1652c = c1654e.f16926J;
            int i7 = c1652c.f16909g;
            int r7 = c1655f.r();
            C1652c c1652c2 = c1654e.f16928L;
            int i8 = r7 - c1652c2.f16909g;
            c1652c.f16911i = cVar.k(c1652c);
            c1652c2.f16911i = cVar.k(c1652c2);
            cVar.d(c1652c.f16911i, i7);
            cVar.d(c1652c2.f16911i, i8);
            c1654e.f16969o = 2;
            c1654e.f16944a0 = i7;
            int i9 = i8 - i7;
            c1654e.f16939W = i9;
            int i10 = c1654e.f16949d0;
            if (i9 < i10) {
                c1654e.f16939W = i10;
            }
        }
        if (c1655f.f16937U[1] == enumC1653d2 || c1654e.f16937U[1] != enumC1653d3) {
            return;
        }
        C1652c c1652c3 = c1654e.f16927K;
        int i11 = c1652c3.f16909g;
        int l7 = c1655f.l();
        C1652c c1652c4 = c1654e.f16929M;
        int i12 = l7 - c1652c4.f16909g;
        c1652c3.f16911i = cVar.k(c1652c3);
        c1652c4.f16911i = cVar.k(c1652c4);
        cVar.d(c1652c3.f16911i, i11);
        cVar.d(c1652c4.f16911i, i12);
        if (c1654e.c0 > 0 || c1654e.f16959i0 == 8) {
            C1652c c1652c5 = c1654e.f16930N;
            c1652c5.f16911i = cVar.k(c1652c5);
            cVar.d(c1652c5.f16911i, c1654e.c0 + i11);
        }
        c1654e.f16971p = 2;
        c1654e.f16946b0 = i11;
        int i13 = i12 - i11;
        c1654e.f16940X = i13;
        int i14 = c1654e.f16951e0;
        if (i13 < i14) {
            c1654e.f16940X = i14;
        }
    }

    public static final boolean c(int i7, int i8) {
        return (i7 & i8) == i8;
    }
}
