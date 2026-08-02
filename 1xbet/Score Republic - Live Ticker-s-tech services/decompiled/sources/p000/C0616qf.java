package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: qf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0616qf extends bj1 {

    /* JADX INFO: renamed from: k */
    public final ArrayList f6483k;

    /* JADX INFO: renamed from: l */
    public int f6484l;

    public C0616qf(C0143dm c0143dm, int i) {
        C0143dm c0143dm2;
        super(c0143dm);
        ArrayList arrayList = new ArrayList();
        this.f6483k = arrayList;
        this.f894f = i;
        C0143dm c0143dm3 = this.f890b;
        C0143dm c0143dmM1258k = c0143dm3.m1258k(i);
        while (true) {
            c0143dm2 = c0143dm3;
            c0143dm3 = c0143dmM1258k;
            if (c0143dm3 == null) {
                break;
            } else {
                c0143dmM1258k = c0143dm3.m1258k(this.f894f);
            }
        }
        this.f890b = c0143dm2;
        int i2 = this.f894f;
        arrayList.add(i2 == 0 ? c0143dm2.f1713d : i2 == 1 ? c0143dm2.f1715e : null);
        C0143dm c0143dmM1257j = c0143dm2.m1257j(this.f894f);
        while (c0143dmM1257j != null) {
            int i3 = this.f894f;
            arrayList.add(i3 == 0 ? c0143dmM1257j.f1713d : i3 == 1 ? c0143dmM1257j.f1715e : null);
            c0143dmM1257j = c0143dmM1257j.m1257j(this.f894f);
        }
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            bj1 bj1Var = (bj1) obj;
            int i5 = this.f894f;
            if (i5 == 0) {
                bj1Var.f890b.f1709b = this;
            } else if (i5 == 1) {
                bj1Var.f890b.f1711c = this;
            }
        }
        if (this.f894f == 0 && ((C0179em) this.f890b.f1699S).f2137u0 && arrayList.size() > 1) {
            this.f890b = ((bj1) arrayList.get(arrayList.size() - 1)).f890b;
        }
        int i6 = this.f894f;
        C0143dm c0143dm4 = this.f890b;
        this.f6484l = i6 == 0 ? c0143dm4.f1722h0 : c0143dm4.f1724i0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // p000.InterfaceC0518ns
    /* JADX INFO: renamed from: a */
    public final void mo1751a(InterfaceC0518ns interfaceC0518ns) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f3;
        C0629qs c0629qs = this.f896h;
        if (c0629qs.f6581j) {
            C0629qs c0629qs2 = this.f897i;
            if (c0629qs2.f6581j) {
                C0143dm c0143dm = this.f890b.f1699S;
                boolean z2 = c0143dm instanceof C0179em ? ((C0179em) c0143dm).f2137u0 : false;
                int i13 = c0629qs2.f6578g - c0629qs.f6578g;
                ArrayList arrayList = this.f6483k;
                int size = arrayList.size();
                int i14 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i14 >= size) {
                        i14 = -1;
                        break;
                    } else if (((bj1) arrayList.get(i14)).f890b.f1718f0 != 8) {
                        break;
                    } else {
                        i14++;
                    }
                }
                int i15 = size - 1;
                for (int i16 = i15; i16 >= 0; i16--) {
                    if (((bj1) arrayList.get(i16)).f890b.f1718f0 != 8) {
                        i = i16;
                        break;
                    }
                }
                int i17 = 0;
                while (true) {
                    if (i17 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i18 = 0;
                    i5 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    while (i18 < size) {
                        bj1 bj1Var = (bj1) arrayList.get(i18);
                        C0143dm c0143dm2 = bj1Var.f890b;
                        boolean z3 = z2;
                        if (c0143dm2.f1718f0 == i2) {
                            i11 = i17;
                        } else {
                            i20++;
                            if (i18 > 0 && i18 >= i14) {
                                i5 += bj1Var.f896h.f6577f;
                            }
                            C0074bt c0074bt = bj1Var.f893e;
                            int i21 = c0074bt.f6578g;
                            i11 = i17;
                            boolean z4 = bj1Var.f892d != 3;
                            if (z4) {
                                int i22 = this.f894f;
                                if (i22 == 0 && !c0143dm2.f1713d.f893e.f6581j) {
                                    return;
                                }
                                if (i22 == 1 && !c0143dm2.f1715e.f893e.f6581j) {
                                    return;
                                }
                            } else {
                                if (bj1Var.f889a == 1 && i11 == 0) {
                                    i12 = c0074bt.f976m;
                                    i19++;
                                } else {
                                    if (c0074bt.f6581j) {
                                        i12 = i21;
                                    }
                                    if (z4) {
                                        i5 += i12;
                                    } else {
                                        i19++;
                                        f3 = c0143dm2.f1726j0[this.f894f];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i18 >= i15 && i18 < i) {
                                        i5 += -bj1Var.f897i.f6577f;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i19++;
                                    f3 = c0143dm2.f1726j0[this.f894f];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i12;
                                }
                                if (i18 >= i15) {
                                }
                            }
                            i12 = i21;
                            if (z4) {
                                i19++;
                                f3 = c0143dm2.f1726j0[this.f894f];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i12;
                            }
                            if (i18 >= i15) {
                            }
                        }
                        i18++;
                        z2 = z3;
                        i17 = i11;
                        i2 = 8;
                    }
                    z = z2;
                    int i23 = i17;
                    if (i5 < i13 || i19 == 0) {
                        i3 = i19;
                        i4 = i20;
                        break;
                    } else {
                        i17 = i23 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i24 = c0629qs.f6578g;
                if (z) {
                    i24 = c0629qs2.f6578g;
                }
                float f4 = 0.5f;
                if (i5 > i13) {
                    i24 = z ? i24 + ((int) (((i5 - i13) / 2.0f) + 0.5f)) : i24 - ((int) (((i5 - i13) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i13 - i5;
                    int i25 = (int) ((f5 / i3) + 0.5f);
                    int i26 = 0;
                    int i27 = 0;
                    while (i26 < size) {
                        float f6 = f4;
                        bj1 bj1Var2 = (bj1) arrayList.get(i26);
                        int i28 = i24;
                        C0143dm c0143dm3 = bj1Var2.f890b;
                        int i29 = i3;
                        C0074bt c0074bt2 = bj1Var2.f893e;
                        float f7 = f5;
                        int i30 = i25;
                        if (c0143dm3.f1718f0 != 8 && bj1Var2.f892d == 3 && !c0074bt2.f6581j) {
                            int i31 = f > 0.0f ? (int) (((c0143dm3.f1726j0[this.f894f] * f7) / f) + f6) : i30;
                            if (this.f894f == 0) {
                                i9 = c0143dm3.f1743v;
                                i10 = c0143dm3.f1742u;
                            } else {
                                i9 = c0143dm3.f1746y;
                                i10 = c0143dm3.f1745x;
                            }
                            int iMax = Math.max(i10, bj1Var2.f889a == 1 ? Math.min(i31, c0074bt2.f976m) : i31);
                            if (i9 > 0) {
                                iMax = Math.min(i9, iMax);
                            }
                            if (iMax != i31) {
                                i27++;
                                i31 = iMax;
                            }
                            c0074bt2.mo759d(i31);
                        }
                        i26++;
                        i24 = i28;
                        f4 = f6;
                        i3 = i29;
                        f5 = f7;
                        i25 = i30;
                    }
                    i6 = i24;
                    f2 = f4;
                    int i32 = i3;
                    if (i27 > 0) {
                        i3 = i32 - i27;
                        i5 = 0;
                        for (int i33 = 0; i33 < size; i33++) {
                            bj1 bj1Var3 = (bj1) arrayList.get(i33);
                            if (bj1Var3.f890b.f1718f0 != 8) {
                                if (i33 > 0 && i33 >= i14) {
                                    i5 += bj1Var3.f896h.f6577f;
                                }
                                i5 += bj1Var3.f893e.f6578g;
                                if (i33 < i15 && i33 < i) {
                                    i5 += -bj1Var3.f897i.f6577f;
                                }
                            }
                        }
                    } else {
                        i3 = i32;
                    }
                    i8 = 2;
                    if (this.f6484l == 2 && i27 == 0) {
                        i7 = 0;
                        this.f6484l = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i24;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i13) {
                    this.f6484l = i8;
                }
                if (i4 > 0 && i3 == 0 && i14 == i) {
                    this.f6484l = i8;
                }
                int i34 = this.f6484l;
                if (i34 == 1) {
                    int i35 = i4 > 1 ? (i13 - i5) / (i4 - 1) : i4 == 1 ? (i13 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i35 = i7;
                    }
                    int i36 = i6;
                    for (int i37 = i7; i37 < size; i37++) {
                        bj1 bj1Var4 = (bj1) arrayList.get(z ? size - (i37 + 1) : i37);
                        C0143dm c0143dm4 = bj1Var4.f890b;
                        C0629qs c0629qs3 = bj1Var4.f897i;
                        C0629qs c0629qs4 = bj1Var4.f896h;
                        if (c0143dm4.f1718f0 == 8) {
                            c0629qs4.mo759d(i36);
                            c0629qs3.mo759d(i36);
                        } else {
                            if (i37 > 0) {
                                i36 = z ? i36 - i35 : i36 + i35;
                            }
                            if (i37 > 0 && i37 >= i14) {
                                i36 = z ? i36 - c0629qs4.f6577f : i36 + c0629qs4.f6577f;
                            }
                            if (z) {
                                c0629qs3.mo759d(i36);
                            } else {
                                c0629qs4.mo759d(i36);
                            }
                            C0074bt c0074bt3 = bj1Var4.f893e;
                            int i38 = c0074bt3.f6578g;
                            if (bj1Var4.f892d == 3 && bj1Var4.f889a == 1) {
                                i38 = c0074bt3.f976m;
                            }
                            i36 = z ? i36 - i38 : i36 + i38;
                            if (z) {
                                c0629qs4.mo759d(i36);
                            } else {
                                c0629qs3.mo759d(i36);
                            }
                            bj1Var4.f895g = true;
                            if (i37 < i15 && i37 < i) {
                                i36 = z ? i36 - (-c0629qs3.f6577f) : i36 + (-c0629qs3.f6577f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 0) {
                    int i39 = (i13 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i39 = i7;
                    }
                    int i40 = i6;
                    for (int i41 = i7; i41 < size; i41++) {
                        bj1 bj1Var5 = (bj1) arrayList.get(z ? size - (i41 + 1) : i41);
                        C0143dm c0143dm5 = bj1Var5.f890b;
                        C0629qs c0629qs5 = bj1Var5.f897i;
                        C0629qs c0629qs6 = bj1Var5.f896h;
                        if (c0143dm5.f1718f0 == 8) {
                            c0629qs6.mo759d(i40);
                            c0629qs5.mo759d(i40);
                        } else {
                            int i42 = z ? i40 - i39 : i40 + i39;
                            if (i41 > 0 && i41 >= i14) {
                                i42 = z ? i42 - c0629qs6.f6577f : i42 + c0629qs6.f6577f;
                            }
                            if (z) {
                                c0629qs5.mo759d(i42);
                            } else {
                                c0629qs6.mo759d(i42);
                            }
                            C0074bt c0074bt4 = bj1Var5.f893e;
                            int iMin = c0074bt4.f6578g;
                            if (bj1Var5.f892d == 3 && bj1Var5.f889a == 1) {
                                iMin = Math.min(iMin, c0074bt4.f976m);
                            }
                            i40 = z ? i42 - iMin : i42 + iMin;
                            if (z) {
                                c0629qs6.mo759d(i40);
                            } else {
                                c0629qs5.mo759d(i40);
                            }
                            if (i41 < i15 && i41 < i) {
                                i40 = z ? i40 - (-c0629qs5.f6577f) : i40 + (-c0629qs5.f6577f);
                            }
                        }
                    }
                    return;
                }
                if (i34 == 2) {
                    int i43 = this.f894f;
                    C0143dm c0143dm6 = this.f890b;
                    float f8 = i43 == 0 ? c0143dm6.f1712c0 : c0143dm6.f1714d0;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i13 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        bj1 bj1Var6 = (bj1) arrayList.get(z ? size - (i46 + 1) : i46);
                        C0143dm c0143dm7 = bj1Var6.f890b;
                        C0629qs c0629qs7 = bj1Var6.f897i;
                        C0629qs c0629qs8 = bj1Var6.f896h;
                        if (c0143dm7.f1718f0 == 8) {
                            c0629qs8.mo759d(i45);
                            c0629qs7.mo759d(i45);
                        } else {
                            if (i46 > 0 && i46 >= i14) {
                                i45 = z ? i45 - c0629qs8.f6577f : i45 + c0629qs8.f6577f;
                            }
                            if (z) {
                                c0629qs7.mo759d(i45);
                            } else {
                                c0629qs8.mo759d(i45);
                            }
                            C0074bt c0074bt5 = bj1Var6.f893e;
                            int i47 = c0074bt5.f6578g;
                            if (bj1Var6.f892d == 3 && bj1Var6.f889a == 1) {
                                i47 = c0074bt5.f976m;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                c0629qs8.mo759d(i45);
                            } else {
                                c0629qs7.mo759d(i45);
                            }
                            if (i46 < i15 && i46 < i) {
                                i45 = z ? i45 - (-c0629qs7.f6577f) : i45 + (-c0629qs7.f6577f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: d */
    public final void mo708d() {
        ArrayList arrayList = this.f6483k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bj1) obj).mo708d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        C0143dm c0143dm = ((bj1) arrayList.get(0)).f890b;
        C0143dm c0143dm2 = ((bj1) arrayList.get(size2 - 1)).f890b;
        int i2 = this.f894f;
        C0629qs c0629qs = this.f897i;
        C0629qs c0629qs2 = this.f896h;
        if (i2 == 0) {
            C0585pl c0585pl = c0143dm.f1688H;
            C0585pl c0585pl2 = c0143dm2.f1690J;
            C0629qs c0629qsM706i = bj1.m706i(c0585pl, 0);
            int iM3957d = c0585pl.m3957d();
            C0143dm c0143dmM4092m = m4092m();
            if (c0143dmM4092m != null) {
                iM3957d = c0143dmM4092m.f1688H.m3957d();
            }
            if (c0629qsM706i != null) {
                bj1.m704b(c0629qs2, c0629qsM706i, iM3957d);
            }
            C0629qs c0629qsM706i2 = bj1.m706i(c0585pl2, 0);
            int iM3957d2 = c0585pl2.m3957d();
            C0143dm c0143dmM4093n = m4093n();
            if (c0143dmM4093n != null) {
                iM3957d2 = c0143dmM4093n.f1690J.m3957d();
            }
            if (c0629qsM706i2 != null) {
                bj1.m704b(c0629qs, c0629qsM706i2, -iM3957d2);
            }
        } else {
            C0585pl c0585pl3 = c0143dm.f1689I;
            C0585pl c0585pl4 = c0143dm2.f1691K;
            C0629qs c0629qsM706i3 = bj1.m706i(c0585pl3, 1);
            int iM3957d3 = c0585pl3.m3957d();
            C0143dm c0143dmM4092m2 = m4092m();
            if (c0143dmM4092m2 != null) {
                iM3957d3 = c0143dmM4092m2.f1689I.m3957d();
            }
            if (c0629qsM706i3 != null) {
                bj1.m704b(c0629qs2, c0629qsM706i3, iM3957d3);
            }
            C0629qs c0629qsM706i4 = bj1.m706i(c0585pl4, 1);
            int iM3957d4 = c0585pl4.m3957d();
            C0143dm c0143dmM4093n2 = m4093n();
            if (c0143dmM4093n2 != null) {
                iM3957d4 = c0143dmM4093n2.f1691K.m3957d();
            }
            if (c0629qsM706i4 != null) {
                bj1.m704b(c0629qs, c0629qsM706i4, -iM3957d4);
            }
        }
        c0629qs2.f6572a = this;
        c0629qs.f6572a = this;
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: e */
    public final void mo709e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6483k;
            if (i >= arrayList.size()) {
                return;
            }
            ((bj1) arrayList.get(i)).mo709e();
            i++;
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: f */
    public final void mo710f() {
        this.f891c = null;
        ArrayList arrayList = this.f6483k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((bj1) obj).mo710f();
        }
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: j */
    public final long mo712j() {
        ArrayList arrayList = this.f6483k;
        int size = arrayList.size();
        long jMo712j = 0;
        for (int i = 0; i < size; i++) {
            bj1 bj1Var = (bj1) arrayList.get(i);
            jMo712j = ((long) bj1Var.f897i.f6577f) + bj1Var.mo712j() + jMo712j + ((long) bj1Var.f896h.f6577f);
        }
        return jMo712j;
    }

    @Override // p000.bj1
    /* JADX INFO: renamed from: k */
    public final boolean mo713k() {
        ArrayList arrayList = this.f6483k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((bj1) arrayList.get(i)).mo713k()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final C0143dm m4092m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f6483k;
            if (i >= arrayList.size()) {
                return null;
            }
            C0143dm c0143dm = ((bj1) arrayList.get(i)).f890b;
            if (c0143dm.f1718f0 != 8) {
                return c0143dm;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: n */
    public final C0143dm m4093n() {
        ArrayList arrayList = this.f6483k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0143dm c0143dm = ((bj1) arrayList.get(size)).f890b;
            if (c0143dm.f1718f0 != 8) {
                return c0143dm;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f894f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f6483k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((bj1) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
