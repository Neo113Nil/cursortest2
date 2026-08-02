package w;

import java.util.ArrayList;
import java.util.Iterator;
import v.C1652c;
import v.C1654e;
import v.C1655f;
import v.EnumC1653d;

/* renamed from: w.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1670c extends n {

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f17223k;

    /* renamed from: l, reason: collision with root package name */
    public int f17224l;

    public C1670c(C1654e c1654e, int i7) {
        super(c1654e);
        C1654e c1654e2;
        this.f17223k = new ArrayList();
        this.f17254f = i7;
        C1654e c1654e3 = this.f17250b;
        C1654e n2 = c1654e3.n(i7);
        while (true) {
            C1654e c1654e4 = n2;
            c1654e2 = c1654e3;
            c1654e3 = c1654e4;
            if (c1654e3 == null) {
                break;
            } else {
                n2 = c1654e3.n(this.f17254f);
            }
        }
        this.f17250b = c1654e2;
        int i8 = this.f17254f;
        n nVar = i8 == 0 ? c1654e2.f16948d : i8 == 1 ? c1654e2.f16950e : null;
        ArrayList arrayList = this.f17223k;
        arrayList.add(nVar);
        C1654e m7 = c1654e2.m(this.f17254f);
        while (m7 != null) {
            int i9 = this.f17254f;
            arrayList.add(i9 == 0 ? m7.f16948d : i9 == 1 ? m7.f16950e : null);
            m7 = m7.m(this.f17254f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            n nVar2 = (n) it.next();
            int i10 = this.f17254f;
            if (i10 == 0) {
                nVar2.f17250b.f16945b = this;
            } else if (i10 == 1) {
                nVar2.f17250b.f16947c = this;
            }
        }
        if (this.f17254f == 0 && ((C1655f) this.f17250b.f16938V).f17008z0 && arrayList.size() > 1) {
            this.f17250b = ((n) arrayList.get(arrayList.size() - 1)).f17250b;
        }
        this.f17224l = this.f17254f == 0 ? this.f17250b.f16964l0 : this.f17250b.f16966m0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:293:0x03d0, code lost:
    
        r3 = r3 - r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    @Override // w.InterfaceC1671d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(InterfaceC1671d interfaceC1671d) {
        int i7;
        EnumC1653d enumC1653d;
        ArrayList arrayList;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f7;
        boolean z4;
        EnumC1653d enumC1653d2;
        ArrayList arrayList2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        EnumC1653d enumC1653d3;
        int i19;
        int i20;
        EnumC1653d enumC1653d4;
        int i21;
        int i22;
        int i23;
        float f8;
        int i24;
        int i25;
        boolean z7;
        int i26;
        int i27;
        e eVar = this.f17256h;
        if (!eVar.j) {
            return;
        }
        e eVar2 = this.f17257i;
        if (!eVar2.j) {
            return;
        }
        C1654e c1654e = this.f17250b.f16938V;
        boolean z8 = c1654e instanceof C1655f ? ((C1655f) c1654e).f17008z0 : false;
        int i28 = eVar2.f17231g - eVar.f17231g;
        ArrayList arrayList3 = this.f17223k;
        int size = arrayList3.size();
        int i29 = 0;
        while (true) {
            i7 = -1;
            if (i29 >= size) {
                i29 = -1;
                break;
            } else if (((n) arrayList3.get(i29)).f17250b.f16959i0 != 8) {
                break;
            } else {
                i29++;
            }
        }
        int i30 = size - 1;
        int i31 = i30;
        while (true) {
            if (i31 < 0) {
                break;
            }
            if (((n) arrayList3.get(i31)).f17250b.f16959i0 != 8) {
                i7 = i31;
                break;
            }
            i31--;
        }
        int i32 = 0;
        while (true) {
            enumC1653d = EnumC1653d.f16914c;
            if (i32 >= 2) {
                arrayList = arrayList3;
                i8 = size;
                i9 = i29;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                f7 = 0.0f;
                break;
            }
            int i33 = 0;
            i12 = 0;
            i24 = 0;
            i25 = 0;
            f7 = 0.0f;
            while (i33 < size) {
                n nVar = (n) arrayList3.get(i33);
                C1654e c1654e2 = nVar.f17250b;
                ArrayList arrayList4 = arrayList3;
                int i34 = size;
                if (c1654e2.f16959i0 == 8) {
                    i26 = i29;
                } else {
                    i25++;
                    if (i33 > 0 && i33 >= i29) {
                        i12 += nVar.f17256h.f17230f;
                    }
                    f fVar = nVar.f17253e;
                    int i35 = fVar.f17231g;
                    boolean z9 = nVar.f17252d != enumC1653d;
                    if (z9) {
                        int i36 = this.f17254f;
                        z7 = z9;
                        if (i36 == 0 && !c1654e2.f16948d.f17253e.j) {
                            return;
                        }
                        if (i36 == 1 && !c1654e2.f16950e.f17253e.j) {
                            return;
                        } else {
                            i26 = i29;
                        }
                    } else {
                        z7 = z9;
                        i26 = i29;
                        if (nVar.f17249a == 1 && i32 == 0) {
                            i27 = fVar.f17236m;
                            i24++;
                        } else if (fVar.j) {
                            i27 = i35;
                        }
                        z7 = true;
                        if (z7) {
                            i24++;
                            float f9 = c1654e2.f16968n0[this.f17254f];
                            if (f9 >= 0.0f) {
                                f7 += f9;
                            }
                        } else {
                            i12 += i27;
                        }
                        if (i33 < i30 && i33 < i7) {
                            i12 += -nVar.f17257i.f17230f;
                        }
                    }
                    i27 = i35;
                    if (z7) {
                    }
                    if (i33 < i30) {
                        i12 += -nVar.f17257i.f17230f;
                    }
                }
                i33++;
                arrayList3 = arrayList4;
                size = i34;
                i29 = i26;
            }
            arrayList = arrayList3;
            i8 = size;
            i9 = i29;
            if (i12 < i28 || i24 == 0) {
                break;
            }
            i32++;
            arrayList3 = arrayList;
            size = i8;
            i29 = i9;
        }
        i10 = i24;
        i11 = i25;
        int i37 = eVar.f17231g;
        if (z8) {
            i37 = eVar2.f17231g;
        }
        if (i12 > i28) {
            i37 = z8 ? i37 + ((int) (((i12 - i28) / 2.0f) + 0.5f)) : i37 - ((int) (((i12 - i28) / 2.0f) + 0.5f));
        }
        if (i10 > 0) {
            float f10 = i28 - i12;
            int i38 = (int) ((f10 / i10) + 0.5f);
            i13 = i8;
            int i39 = 0;
            int i40 = 0;
            while (i39 < i13) {
                ArrayList arrayList5 = arrayList;
                int i41 = i38;
                n nVar2 = (n) arrayList5.get(i39);
                int i42 = i12;
                C1654e c1654e3 = nVar2.f17250b;
                int i43 = i37;
                boolean z10 = z8;
                if (c1654e3.f16959i0 != 8 && nVar2.f17252d == enumC1653d) {
                    f fVar2 = nVar2.f17253e;
                    if (!fVar2.j) {
                        if (f7 > 0.0f) {
                            enumC1653d4 = enumC1653d;
                            i21 = (int) (((c1654e3.f16968n0[this.f17254f] * f10) / f7) + 0.5f);
                        } else {
                            enumC1653d4 = enumC1653d;
                            i21 = i41;
                        }
                        if (this.f17254f == 0) {
                            i22 = c1654e3.f16982v;
                            i23 = c1654e3.f16981u;
                        } else {
                            i22 = c1654e3.f16985y;
                            i23 = c1654e3.f16984x;
                        }
                        f8 = f10;
                        int max = Math.max(i23, nVar2.f17249a == 1 ? Math.min(i21, fVar2.f17236m) : i21);
                        if (i22 > 0) {
                            max = Math.min(i22, max);
                        }
                        if (max != i21) {
                            i40++;
                            i21 = max;
                        }
                        fVar2.d(i21);
                        i39++;
                        i12 = i42;
                        i38 = i41;
                        i37 = i43;
                        z8 = z10;
                        enumC1653d = enumC1653d4;
                        f10 = f8;
                        arrayList = arrayList5;
                    }
                }
                f8 = f10;
                enumC1653d4 = enumC1653d;
                i39++;
                i12 = i42;
                i38 = i41;
                i37 = i43;
                z8 = z10;
                enumC1653d = enumC1653d4;
                f10 = f8;
                arrayList = arrayList5;
            }
            i16 = i37;
            z4 = z8;
            enumC1653d2 = enumC1653d;
            int i44 = i12;
            arrayList2 = arrayList;
            if (i40 > 0) {
                i10 -= i40;
                int i45 = 0;
                i12 = 0;
                while (i45 < i13) {
                    n nVar3 = (n) arrayList2.get(i45);
                    if (nVar3.f17250b.f16959i0 == 8) {
                        i20 = i9;
                    } else {
                        i20 = i9;
                        if (i45 > 0 && i45 >= i20) {
                            i12 += nVar3.f17256h.f17230f;
                        }
                        i12 += nVar3.f17253e.f17231g;
                        if (i45 < i30 && i45 < i7) {
                            i12 += -nVar3.f17257i.f17230f;
                        }
                    }
                    i45++;
                    i9 = i20;
                }
                i14 = i9;
            } else {
                i14 = i9;
                i12 = i44;
            }
            i15 = 2;
            if (this.f17224l == 2 && i40 == 0) {
                i17 = 0;
                this.f17224l = 0;
                if (i12 > i28) {
                    this.f17224l = i15;
                }
                if (i11 > 0 && i10 == 0 && i14 == i7) {
                    this.f17224l = i15;
                }
                i18 = this.f17224l;
                if (i18 != 1) {
                    int i46 = i11 > 1 ? (i28 - i12) / (i11 - 1) : i11 == 1 ? (i28 - i12) / 2 : i17;
                    if (i10 > 0) {
                        i46 = i17;
                    }
                    int i47 = i17;
                    int i48 = i16;
                    while (i47 < i13) {
                        n nVar4 = (n) arrayList2.get(z4 ? i13 - (i47 + 1) : i47);
                        int i49 = nVar4.f17250b.f16959i0;
                        e eVar3 = nVar4.f17257i;
                        e eVar4 = nVar4.f17256h;
                        if (i49 == 8) {
                            eVar4.d(i48);
                            eVar3.d(i48);
                            i19 = i46;
                            enumC1653d3 = enumC1653d2;
                        } else {
                            if (i47 > 0) {
                                i48 = z4 ? i48 - i46 : i48 + i46;
                            }
                            if (i47 > 0 && i47 >= i14) {
                                i48 = z4 ? i48 - eVar4.f17230f : i48 + eVar4.f17230f;
                            }
                            if (z4) {
                                eVar3.d(i48);
                            } else {
                                eVar4.d(i48);
                            }
                            f fVar3 = nVar4.f17253e;
                            int i50 = fVar3.f17231g;
                            enumC1653d3 = enumC1653d2;
                            if (nVar4.f17252d == enumC1653d3) {
                                i19 = i46;
                                if (nVar4.f17249a == 1) {
                                    i50 = fVar3.f17236m;
                                }
                            } else {
                                i19 = i46;
                            }
                            i48 = z4 ? i48 - i50 : i48 + i50;
                            if (z4) {
                                eVar4.d(i48);
                            } else {
                                eVar3.d(i48);
                            }
                            nVar4.f17255g = true;
                            if (i47 < i30 && i47 < i7) {
                                i48 = z4 ? i48 - (-eVar3.f17230f) : i48 + (-eVar3.f17230f);
                            }
                        }
                        i47++;
                        i46 = i19;
                        enumC1653d2 = enumC1653d3;
                    }
                    return;
                }
                EnumC1653d enumC1653d5 = enumC1653d2;
                if (i18 == 0) {
                    int i51 = (i28 - i12) / (i11 + 1);
                    if (i10 > 0) {
                        i51 = i17;
                    }
                    int i52 = i16;
                    for (int i53 = i17; i53 < i13; i53++) {
                        n nVar5 = (n) arrayList2.get(z4 ? i13 - (i53 + 1) : i53);
                        int i54 = nVar5.f17250b.f16959i0;
                        e eVar5 = nVar5.f17257i;
                        e eVar6 = nVar5.f17256h;
                        if (i54 == 8) {
                            eVar6.d(i52);
                            eVar5.d(i52);
                        } else {
                            int i55 = z4 ? i52 - i51 : i52 + i51;
                            if (i53 > 0 && i53 >= i14) {
                                i55 = z4 ? i55 - eVar6.f17230f : i55 + eVar6.f17230f;
                            }
                            if (z4) {
                                eVar5.d(i55);
                            } else {
                                eVar6.d(i55);
                            }
                            f fVar4 = nVar5.f17253e;
                            int i56 = fVar4.f17231g;
                            if (nVar5.f17252d == enumC1653d5 && nVar5.f17249a == 1) {
                                i56 = Math.min(i56, fVar4.f17236m);
                            }
                            i52 = z4 ? i55 - i56 : i55 + i56;
                            if (z4) {
                                eVar6.d(i52);
                            } else {
                                eVar5.d(i52);
                            }
                            if (i53 < i30 && i53 < i7) {
                                i52 = z4 ? i52 - (-eVar5.f17230f) : i52 + (-eVar5.f17230f);
                            }
                        }
                    }
                    return;
                }
                if (i18 == 2) {
                    float f11 = this.f17254f == 0 ? this.f17250b.f16953f0 : this.f17250b.f16955g0;
                    if (z4) {
                        f11 = 1.0f - f11;
                    }
                    int i57 = (int) (((i28 - i12) * f11) + 0.5f);
                    if (i57 < 0 || i10 > 0) {
                        i57 = i17;
                    }
                    int i58 = z4 ? i16 - i57 : i16 + i57;
                    for (int i59 = i17; i59 < i13; i59++) {
                        n nVar6 = (n) arrayList2.get(z4 ? i13 - (i59 + 1) : i59);
                        int i60 = nVar6.f17250b.f16959i0;
                        e eVar7 = nVar6.f17257i;
                        e eVar8 = nVar6.f17256h;
                        if (i60 == 8) {
                            eVar8.d(i58);
                            eVar7.d(i58);
                        } else {
                            if (i59 > 0 && i59 >= i14) {
                                i58 = z4 ? i58 - eVar8.f17230f : i58 + eVar8.f17230f;
                            }
                            if (z4) {
                                eVar7.d(i58);
                            } else {
                                eVar8.d(i58);
                            }
                            f fVar5 = nVar6.f17253e;
                            int i61 = fVar5.f17231g;
                            if (nVar6.f17252d == enumC1653d5 && nVar6.f17249a == 1) {
                                i61 = fVar5.f17236m;
                            }
                            i58 += i61;
                            if (z4) {
                                eVar8.d(i58);
                            } else {
                                eVar7.d(i58);
                            }
                            if (i59 < i30 && i59 < i7) {
                                i58 = z4 ? i58 - (-eVar7.f17230f) : i58 + (-eVar7.f17230f);
                            }
                        }
                    }
                    return;
                }
                return;
            }
        } else {
            z4 = z8;
            enumC1653d2 = enumC1653d;
            arrayList2 = arrayList;
            i13 = i8;
            i14 = i9;
            i15 = 2;
            i16 = i37;
        }
        i17 = 0;
        if (i12 > i28) {
        }
        if (i11 > 0) {
            this.f17224l = i15;
        }
        i18 = this.f17224l;
        if (i18 != 1) {
        }
    }

    @Override // w.n
    public final void d() {
        ArrayList arrayList = this.f17223k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((n) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C1654e c1654e = ((n) arrayList.get(0)).f17250b;
        C1654e c1654e2 = ((n) arrayList.get(size - 1)).f17250b;
        int i7 = this.f17254f;
        e eVar = this.f17257i;
        e eVar2 = this.f17256h;
        if (i7 == 0) {
            C1652c c1652c = c1654e.f16926J;
            C1652c c1652c2 = c1654e2.f16928L;
            e i8 = n.i(c1652c, 0);
            int e7 = c1652c.e();
            C1654e m7 = m();
            if (m7 != null) {
                e7 = m7.f16926J.e();
            }
            if (i8 != null) {
                n.b(eVar2, i8, e7);
            }
            e i9 = n.i(c1652c2, 0);
            int e8 = c1652c2.e();
            C1654e n2 = n();
            if (n2 != null) {
                e8 = n2.f16928L.e();
            }
            if (i9 != null) {
                n.b(eVar, i9, -e8);
            }
        } else {
            C1652c c1652c3 = c1654e.f16927K;
            C1652c c1652c4 = c1654e2.f16929M;
            e i10 = n.i(c1652c3, 1);
            int e9 = c1652c3.e();
            C1654e m8 = m();
            if (m8 != null) {
                e9 = m8.f16927K.e();
            }
            if (i10 != null) {
                n.b(eVar2, i10, e9);
            }
            e i11 = n.i(c1652c4, 1);
            int e10 = c1652c4.e();
            C1654e n7 = n();
            if (n7 != null) {
                e10 = n7.f16929M.e();
            }
            if (i11 != null) {
                n.b(eVar, i11, -e10);
            }
        }
        eVar2.f17225a = this;
        eVar.f17225a = this;
    }

    @Override // w.n
    public final void e() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17223k;
            if (i7 >= arrayList.size()) {
                return;
            }
            ((n) arrayList.get(i7)).e();
            i7++;
        }
    }

    @Override // w.n
    public final void f() {
        this.f17251c = null;
        Iterator it = this.f17223k.iterator();
        while (it.hasNext()) {
            ((n) it.next()).f();
        }
    }

    @Override // w.n
    public final long j() {
        ArrayList arrayList = this.f17223k;
        int size = arrayList.size();
        long j = 0;
        for (int i7 = 0; i7 < size; i7++) {
            j = r5.f17257i.f17230f + ((n) arrayList.get(i7)).j() + j + r5.f17256h.f17230f;
        }
        return j;
    }

    @Override // w.n
    public final boolean k() {
        ArrayList arrayList = this.f17223k;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (!((n) arrayList.get(i7)).k()) {
                return false;
            }
        }
        return true;
    }

    public final C1654e m() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f17223k;
            if (i7 >= arrayList.size()) {
                return null;
            }
            C1654e c1654e = ((n) arrayList.get(i7)).f17250b;
            if (c1654e.f16959i0 != 8) {
                return c1654e;
            }
            i7++;
        }
    }

    public final C1654e n() {
        ArrayList arrayList = this.f17223k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1654e c1654e = ((n) arrayList.get(size)).f17250b;
            if (c1654e.f16959i0 != 8) {
                return c1654e;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.f17254f == 0 ? "horizontal : " : "vertical : ");
        Iterator it = this.f17223k.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            sb.append("<");
            sb.append(nVar);
            sb.append("> ");
        }
        return sb.toString();
    }
}
