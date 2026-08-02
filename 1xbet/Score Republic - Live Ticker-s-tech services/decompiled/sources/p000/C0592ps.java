package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: ps */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0592ps {

    /* JADX INFO: renamed from: a */
    public C0179em f6235a;

    /* JADX INFO: renamed from: b */
    public boolean f6236b;

    /* JADX INFO: renamed from: c */
    public boolean f6237c;

    /* JADX INFO: renamed from: d */
    public C0179em f6238d;

    /* JADX INFO: renamed from: e */
    public ArrayList f6239e;

    /* JADX INFO: renamed from: f */
    public C0770ul f6240f;

    /* JADX INFO: renamed from: g */
    public C0834wb f6241g;

    /* JADX INFO: renamed from: h */
    public ArrayList f6242h;

    /* JADX INFO: renamed from: a */
    public final void m3976a(C0629qs c0629qs, int i, ArrayList arrayList, y31 y31Var) {
        bj1 bj1Var = c0629qs.f6575d;
        y31 y31Var2 = bj1Var.f891c;
        C0629qs c0629qs2 = bj1Var.f897i;
        C0629qs c0629qs3 = bj1Var.f896h;
        if (y31Var2 == null) {
            C0179em c0179em = this.f6235a;
            if (bj1Var == c0179em.f1713d || bj1Var == c0179em.f1715e) {
                return;
            }
            if (y31Var == null) {
                y31Var = new y31();
                y31Var.f9141a = null;
                y31Var.f9142b = new ArrayList();
                y31Var.f9141a = bj1Var;
                arrayList.add(y31Var);
            }
            bj1Var.f891c = y31Var;
            y31Var.f9142b.add(bj1Var);
            ArrayList arrayList2 = c0629qs3.f6582k;
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                InterfaceC0518ns interfaceC0518ns = (InterfaceC0518ns) obj;
                if (interfaceC0518ns instanceof C0629qs) {
                    m3976a((C0629qs) interfaceC0518ns, i, arrayList, y31Var);
                }
            }
            ArrayList arrayList3 = c0629qs2.f6582k;
            int size2 = arrayList3.size();
            int i4 = 0;
            while (i4 < size2) {
                Object obj2 = arrayList3.get(i4);
                i4++;
                InterfaceC0518ns interfaceC0518ns2 = (InterfaceC0518ns) obj2;
                if (interfaceC0518ns2 instanceof C0629qs) {
                    m3976a((C0629qs) interfaceC0518ns2, i, arrayList, y31Var);
                }
            }
            if (i == 1 && (bj1Var instanceof mh1)) {
                ArrayList arrayList4 = ((mh1) bj1Var).f5047k.f6582k;
                int size3 = arrayList4.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj3 = arrayList4.get(i5);
                    i5++;
                    InterfaceC0518ns interfaceC0518ns3 = (InterfaceC0518ns) obj3;
                    if (interfaceC0518ns3 instanceof C0629qs) {
                        m3976a((C0629qs) interfaceC0518ns3, i, arrayList, y31Var);
                    }
                }
            }
            ArrayList arrayList5 = c0629qs3.f6583l;
            int size4 = arrayList5.size();
            int i6 = 0;
            while (i6 < size4) {
                Object obj4 = arrayList5.get(i6);
                i6++;
                m3976a((C0629qs) obj4, i, arrayList, y31Var);
            }
            ArrayList arrayList6 = c0629qs2.f6583l;
            int size5 = arrayList6.size();
            int i7 = 0;
            while (i7 < size5) {
                Object obj5 = arrayList6.get(i7);
                i7++;
                m3976a((C0629qs) obj5, i, arrayList, y31Var);
            }
            if (i == 1 && (bj1Var instanceof mh1)) {
                ArrayList arrayList7 = ((mh1) bj1Var).f5047k.f6583l;
                int size6 = arrayList7.size();
                while (i2 < size6) {
                    Object obj6 = arrayList7.get(i2);
                    i2++;
                    m3976a((C0629qs) obj6, i, arrayList, y31Var);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[PHI: r0
      0x00d1: PHI (r0v22 int) = (r0v20 int), (r0v99 int) binds: [B:68:0x00c9, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    /* JADX INFO: renamed from: b */
    public final void m3977b(C0179em c0179em) {
        int i;
        int i2;
        int iM1260o;
        int iM1256i;
        int i3;
        int iM1256i2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f;
        int i16;
        int i17;
        ArrayList arrayList = c0179em.f2132p0;
        int[] iArr = c0179em.f1736o0;
        int size = arrayList.size();
        char c = 0;
        int i18 = 0;
        while (i18 < size) {
            Object obj = arrayList.get(i18);
            i18++;
            C0143dm c0143dm = (C0143dm) obj;
            int[] iArr2 = c0143dm.f1736o0;
            C0585pl[] c0585plArr = c0143dm.f1696P;
            C0585pl c0585pl = c0143dm.f1691K;
            C0585pl c0585pl2 = c0143dm.f1689I;
            C0585pl c0585pl3 = c0143dm.f1690J;
            C0585pl c0585pl4 = c0143dm.f1688H;
            int i19 = iArr2[c];
            int i20 = iArr2[1];
            c = c;
            if (c0143dm.f1718f0 == 8) {
                c0143dm.f1707a = true;
            } else {
                float f2 = c0143dm.f1744w;
                if (f2 < 1.0f && i19 == 3) {
                    c0143dm.f1739r = 2;
                }
                float f3 = c0143dm.f1747z;
                if (f3 < 1.0f && i20 == 3) {
                    c0143dm.f1740s = 2;
                }
                if (c0143dm.f1702V > 0.0f) {
                    if (i19 == 3) {
                        i17 = 2;
                        if (i20 == 2 || i20 == 1) {
                            i = 3;
                            c0143dm.f1739r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i17 = 2;
                    }
                    if (i20 == i && (i19 == i17 || i19 == 1)) {
                        c0143dm.f1740s = i;
                    } else if (i19 == i && i20 == i) {
                        if (c0143dm.f1739r == 0) {
                            c0143dm.f1739r = i;
                        }
                        if (c0143dm.f1740s == 0) {
                            c0143dm.f1740s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i19 == i && c0143dm.f1739r == 1 && (c0585pl4.f6197f == null || c0585pl3.f6197f == null)) {
                    i19 = 2;
                }
                if (i20 == 3 && c0143dm.f1740s == 1 && (c0585pl2.f6197f == null || c0585pl.f6197f == null)) {
                    i20 = 2;
                }
                gb0 gb0Var = c0143dm.f1713d;
                gb0Var.f892d = i19;
                int i21 = c0143dm.f1739r;
                gb0Var.f889a = i21;
                mh1 mh1Var = c0143dm.f1715e;
                mh1Var.f892d = i20;
                ArrayList arrayList2 = arrayList;
                int i22 = c0143dm.f1740s;
                mh1Var.f889a = i22;
                if (i19 == 4 || i19 == 1) {
                    if (i20 == 4) {
                        i2 = 1;
                    } else if (i20 != 1) {
                        i4 = 2;
                        if (i20 == 2) {
                            i2 = 1;
                        } else {
                            if (i19 != 3) {
                                i5 = i4;
                                i6 = i20;
                                i7 = 1;
                            } else if (i20 == i4 && i20 != 1) {
                                i5 = i4;
                                i8 = 3;
                                i6 = i20;
                                i7 = 1;
                                if (i6 != i8) {
                                    if (i19 == i5 && i19 != i7) {
                                        i12 = i8;
                                        i9 = i19;
                                        i10 = i5;
                                    } else if (i22 == i8) {
                                        if (i19 == i5) {
                                            m3981f(i5, 0, i5, 0, c0143dm);
                                        }
                                        int iM1260o2 = c0143dm.m1260o();
                                        f = c0143dm.f1702V;
                                        if (c0143dm.f1703W == -1) {
                                            f = 1.0f / f;
                                        }
                                        m3981f(i7, iM1260o2, i7, (int) ((iM1260o2 * f) + 0.5f), c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    } else if (i22 == 1) {
                                        m3981f(i19, 0, i5, 0, c0143dm);
                                        c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7 || i15 == 4) {
                                                m3981f(i14, c0143dm.m1260o(), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                                c0143dm.f1707a = true;
                                            } else {
                                                i9 = i14;
                                                i10 = i13;
                                                i12 = 3;
                                            }
                                        } else {
                                            i9 = i14;
                                            if (c0585plArr[2].f6197f != null || c0585plArr[3].f6197f == null) {
                                                m3981f(i13, 0, i6, 0, c0143dm);
                                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                                c0143dm.f1707a = true;
                                            } else {
                                                i10 = i13;
                                            }
                                        }
                                    }
                                    i7 = i7;
                                    i11 = 1;
                                    if (i9 == i12 && i6 == i12) {
                                        if (i21 != i11 || i22 == i11) {
                                            m3981f(i10, 0, i10, 0, c0143dm);
                                            c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                            c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                        } else if (i22 == 2 && i21 == 2 && iArr[c] == i7 && iArr[i11] == i7) {
                                            m3981f(i7, (int) ((f2 * c0179em.m1260o()) + 0.5f), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                            c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                            c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                            c0143dm.f1707a = true;
                                        }
                                    }
                                } else {
                                    i9 = i19;
                                    i10 = i5;
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        m3981f(i10, 0, i10, 0, c0143dm);
                                        c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                        c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                    } else {
                                        m3981f(i10, 0, i10, 0, c0143dm);
                                        c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                        c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                    }
                                }
                            } else if (i21 == 3) {
                                if (i20 == i4) {
                                    m3981f(i4, 0, i4, 0, c0143dm);
                                }
                                int iM1256i3 = c0143dm.m1256i();
                                m3981f(1, (int) ((iM1256i3 * c0143dm.f1702V) + 0.5f), 1, iM1256i3, c0143dm);
                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                c0143dm.f1707a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    m3981f(i5, 0, i20, 0, c0143dm);
                                    c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1 || i16 == 4) {
                                        m3981f(1, (int) ((f2 * c0179em.m1260o()) + 0.5f), i20, c0143dm.m1256i(), c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    } else {
                                        i6 = i20;
                                        i7 = 1;
                                    }
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (c0585plArr[c].f6197f != null || c0585plArr[1].f6197f == null) {
                                        m3981f(i5, 0, i6, 0, c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    }
                                }
                            }
                            i8 = 3;
                            if (i6 != i8) {
                                i9 = i19;
                                i10 = i5;
                            } else if (i19 == i5) {
                                if (i22 == i8) {
                                    if (i19 == i5) {
                                        m3981f(i5, 0, i5, 0, c0143dm);
                                    }
                                    int iM1260o3 = c0143dm.m1260o();
                                    f = c0143dm.f1702V;
                                    if (c0143dm.f1703W == -1) {
                                        f = 1.0f / f;
                                    }
                                    m3981f(i7, iM1260o3, i7, (int) ((iM1260o3 * f) + 0.5f), c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                } else if (i22 == 1) {
                                    m3981f(i19, 0, i5, 0, c0143dm);
                                    c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        m3981f(i14, c0143dm.m1260o(), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    } else {
                                        i9 = i14;
                                        if (c0585plArr[2].f6197f != null) {
                                        }
                                        m3981f(i13, 0, i6, 0, c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    }
                                }
                            } else if (i22 == i8) {
                                if (i19 == i5) {
                                    m3981f(i5, 0, i5, 0, c0143dm);
                                }
                                int iM1260o4 = c0143dm.m1260o();
                                f = c0143dm.f1702V;
                                if (c0143dm.f1703W == -1) {
                                    f = 1.0f / f;
                                }
                                m3981f(i7, iM1260o4, i7, (int) ((iM1260o4 * f) + 0.5f), c0143dm);
                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                c0143dm.f1707a = true;
                            } else if (i22 == 1) {
                                m3981f(i19, 0, i5, 0, c0143dm);
                                c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    m3981f(i14, c0143dm.m1260o(), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                } else {
                                    i9 = i14;
                                    if (c0585plArr[2].f6197f != null) {
                                    }
                                    m3981f(i13, 0, i6, 0, c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                }
                            }
                            i11 = 1;
                            i12 = 3;
                            if (i9 == i12) {
                                if (i21 != i11) {
                                    m3981f(i10, 0, i10, 0, c0143dm);
                                    c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                    c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                } else {
                                    m3981f(i10, 0, i10, 0, c0143dm);
                                    c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                    c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                }
                            }
                        }
                    } else {
                        i2 = 1;
                    }
                    iM1260o = c0143dm.m1260o();
                    if (i19 == 4) {
                        iM1260o = (c0179em.m1260o() - c0585pl4.f6198g) - c0585pl3.f6198g;
                        i19 = i2;
                    }
                    iM1256i = c0143dm.m1256i();
                    if (i20 == 4) {
                        i3 = i2;
                        iM1256i2 = (c0179em.m1256i() - c0585pl2.f6198g) - c0585pl.f6198g;
                    } else {
                        i3 = i20;
                        iM1256i2 = iM1256i;
                    }
                    m3981f(i19, iM1260o, i3, iM1256i2, c0143dm);
                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                    c0143dm.f1707a = true;
                } else {
                    i4 = 2;
                    if (i19 == 2) {
                        if (i20 == 4) {
                            i2 = 1;
                        } else if (i20 != 1) {
                            i4 = 2;
                            if (i20 == 2) {
                                i2 = 1;
                            } else {
                                if (i19 != 3) {
                                    if (i20 == i4) {
                                    }
                                    if (i21 == 3) {
                                        if (i20 == i4) {
                                            m3981f(i4, 0, i4, 0, c0143dm);
                                        }
                                        int iM1256i4 = c0143dm.m1256i();
                                        m3981f(1, (int) ((iM1256i4 * c0143dm.f1702V) + 0.5f), 1, iM1256i4, c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    } else {
                                        i5 = i4;
                                        if (i21 == 1) {
                                            m3981f(i5, 0, i20, 0, c0143dm);
                                            c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                        } else if (i21 == 2) {
                                            i16 = iArr[c];
                                            if (i16 != 1) {
                                            }
                                            m3981f(1, (int) ((f2 * c0179em.m1260o()) + 0.5f), i20, c0143dm.m1256i(), c0143dm);
                                            c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                            c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                            c0143dm.f1707a = true;
                                        } else {
                                            i6 = i20;
                                            i7 = 1;
                                            if (c0585plArr[c].f6197f != null) {
                                            }
                                            m3981f(i5, 0, i6, 0, c0143dm);
                                            c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                            c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                            c0143dm.f1707a = true;
                                        }
                                    }
                                } else {
                                    i5 = i4;
                                    i6 = i20;
                                    i7 = 1;
                                }
                                i8 = 3;
                                if (i6 != i8) {
                                    i9 = i19;
                                    i10 = i5;
                                } else if (i19 == i5) {
                                    if (i22 == i8) {
                                        if (i19 == i5) {
                                            m3981f(i5, 0, i5, 0, c0143dm);
                                        }
                                        int iM1260o5 = c0143dm.m1260o();
                                        f = c0143dm.f1702V;
                                        if (c0143dm.f1703W == -1) {
                                            f = 1.0f / f;
                                        }
                                        m3981f(i7, iM1260o5, i7, (int) ((iM1260o5 * f) + 0.5f), c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    } else if (i22 == 1) {
                                        m3981f(i19, 0, i5, 0, c0143dm);
                                        c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                    } else {
                                        i13 = i5;
                                        i14 = i19;
                                        if (i22 == 2) {
                                            i15 = iArr[1];
                                            if (i15 != i7) {
                                            }
                                            m3981f(i14, c0143dm.m1260o(), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                            c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                            c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                            c0143dm.f1707a = true;
                                        } else {
                                            i9 = i14;
                                            if (c0585plArr[2].f6197f != null) {
                                            }
                                            m3981f(i13, 0, i6, 0, c0143dm);
                                            c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                            c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                            c0143dm.f1707a = true;
                                        }
                                    }
                                } else if (i22 == i8) {
                                    if (i19 == i5) {
                                        m3981f(i5, 0, i5, 0, c0143dm);
                                    }
                                    int iM1260o6 = c0143dm.m1260o();
                                    f = c0143dm.f1702V;
                                    if (c0143dm.f1703W == -1) {
                                        f = 1.0f / f;
                                    }
                                    m3981f(i7, iM1260o6, i7, (int) ((iM1260o6 * f) + 0.5f), c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                } else if (i22 == 1) {
                                    m3981f(i19, 0, i5, 0, c0143dm);
                                    c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                } else {
                                    i13 = i5;
                                    i14 = i19;
                                    if (i22 == 2) {
                                        i15 = iArr[1];
                                        if (i15 != i7) {
                                        }
                                        m3981f(i14, c0143dm.m1260o(), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    } else {
                                        i9 = i14;
                                        if (c0585plArr[2].f6197f != null) {
                                        }
                                        m3981f(i13, 0, i6, 0, c0143dm);
                                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                        c0143dm.f1707a = true;
                                    }
                                }
                                i11 = 1;
                                i12 = 3;
                                if (i9 == i12) {
                                    if (i21 != i11) {
                                        m3981f(i10, 0, i10, 0, c0143dm);
                                        c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                        c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                    } else {
                                        m3981f(i10, 0, i10, 0, c0143dm);
                                        c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                        c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                                    }
                                }
                            }
                        } else {
                            i2 = 1;
                        }
                        iM1260o = c0143dm.m1260o();
                        if (i19 == 4) {
                            iM1260o = (c0179em.m1260o() - c0585pl4.f6198g) - c0585pl3.f6198g;
                            i19 = i2;
                        }
                        iM1256i = c0143dm.m1256i();
                        if (i20 == 4) {
                            i3 = i2;
                            iM1256i2 = (c0179em.m1256i() - c0585pl2.f6198g) - c0585pl.f6198g;
                        } else {
                            i3 = i20;
                            iM1256i2 = iM1256i;
                        }
                        m3981f(i19, iM1260o, i3, iM1256i2, c0143dm);
                        c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                        c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                        c0143dm.f1707a = true;
                    } else {
                        if (i19 != 3) {
                            if (i20 == i4) {
                            }
                            if (i21 == 3) {
                                if (i20 == i4) {
                                    m3981f(i4, 0, i4, 0, c0143dm);
                                }
                                int iM1256i5 = c0143dm.m1256i();
                                m3981f(1, (int) ((iM1256i5 * c0143dm.f1702V) + 0.5f), 1, iM1256i5, c0143dm);
                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                c0143dm.f1707a = true;
                            } else {
                                i5 = i4;
                                if (i21 == 1) {
                                    m3981f(i5, 0, i20, 0, c0143dm);
                                    c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                } else if (i21 == 2) {
                                    i16 = iArr[c];
                                    if (i16 != 1) {
                                    }
                                    m3981f(1, (int) ((f2 * c0179em.m1260o()) + 0.5f), i20, c0143dm.m1256i(), c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                } else {
                                    i6 = i20;
                                    i7 = 1;
                                    if (c0585plArr[c].f6197f != null) {
                                    }
                                    m3981f(i5, 0, i6, 0, c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                }
                            }
                        } else {
                            i5 = i4;
                            i6 = i20;
                            i7 = 1;
                        }
                        i8 = 3;
                        if (i6 != i8) {
                            i9 = i19;
                            i10 = i5;
                        } else if (i19 == i5) {
                            if (i22 == i8) {
                                if (i19 == i5) {
                                    m3981f(i5, 0, i5, 0, c0143dm);
                                }
                                int iM1260o7 = c0143dm.m1260o();
                                f = c0143dm.f1702V;
                                if (c0143dm.f1703W == -1) {
                                    f = 1.0f / f;
                                }
                                m3981f(i7, iM1260o7, i7, (int) ((iM1260o7 * f) + 0.5f), c0143dm);
                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                c0143dm.f1707a = true;
                            } else if (i22 == 1) {
                                m3981f(i19, 0, i5, 0, c0143dm);
                                c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                            } else {
                                i13 = i5;
                                i14 = i19;
                                if (i22 == 2) {
                                    i15 = iArr[1];
                                    if (i15 != i7) {
                                    }
                                    m3981f(i14, c0143dm.m1260o(), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                } else {
                                    i9 = i14;
                                    if (c0585plArr[2].f6197f != null) {
                                    }
                                    m3981f(i13, 0, i6, 0, c0143dm);
                                    c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                    c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                    c0143dm.f1707a = true;
                                }
                            }
                        } else if (i22 == i8) {
                            if (i19 == i5) {
                                m3981f(i5, 0, i5, 0, c0143dm);
                            }
                            int iM1260o8 = c0143dm.m1260o();
                            f = c0143dm.f1702V;
                            if (c0143dm.f1703W == -1) {
                                f = 1.0f / f;
                            }
                            m3981f(i7, iM1260o8, i7, (int) ((iM1260o8 * f) + 0.5f), c0143dm);
                            c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                            c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                            c0143dm.f1707a = true;
                        } else if (i22 == 1) {
                            m3981f(i19, 0, i5, 0, c0143dm);
                            c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                        } else {
                            i13 = i5;
                            i14 = i19;
                            if (i22 == 2) {
                                i15 = iArr[1];
                                if (i15 != i7) {
                                }
                                m3981f(i14, c0143dm.m1260o(), i7, (int) ((f3 * c0179em.m1256i()) + 0.5f), c0143dm);
                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                c0143dm.f1707a = true;
                            } else {
                                i9 = i14;
                                if (c0585plArr[2].f6197f != null) {
                                }
                                m3981f(i13, 0, i6, 0, c0143dm);
                                c0143dm.f1713d.f893e.mo759d(c0143dm.m1260o());
                                c0143dm.f1715e.f893e.mo759d(c0143dm.m1256i());
                                c0143dm.f1707a = true;
                            }
                        }
                        i11 = 1;
                        i12 = 3;
                        if (i9 == i12) {
                            if (i21 != i11) {
                                m3981f(i10, 0, i10, 0, c0143dm);
                                c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                            } else {
                                m3981f(i10, 0, i10, 0, c0143dm);
                                c0143dm.f1713d.f893e.f976m = c0143dm.m1260o();
                                c0143dm.f1715e.f893e.f976m = c0143dm.m1256i();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m3978c() {
        C0179em c0179em = this.f6235a;
        ArrayList arrayList = this.f6242h;
        ArrayList arrayList2 = this.f6239e;
        arrayList2.clear();
        C0179em c0179em2 = this.f6238d;
        c0179em2.f1713d.mo710f();
        c0179em2.f1715e.mo710f();
        arrayList2.add(c0179em2.f1713d);
        arrayList2.add(c0179em2.f1715e);
        ArrayList arrayList3 = c0179em2.f2132p0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            C0143dm c0143dm = (C0143dm) obj;
            if (c0143dm instanceof ea0) {
                fa0 fa0Var = new fa0(c0143dm);
                c0143dm.f1713d.mo710f();
                c0143dm.f1715e.mo710f();
                fa0Var.f894f = ((ea0) c0143dm).f2041t0;
                arrayList2.add(fa0Var);
            } else {
                if (c0143dm.m1267v()) {
                    if (c0143dm.f1709b == null) {
                        c0143dm.f1709b = new C0616qf(c0143dm, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0143dm.f1709b);
                } else {
                    arrayList2.add(c0143dm.f1713d);
                }
                if (c0143dm.m1268w()) {
                    if (c0143dm.f1711c == null) {
                        c0143dm.f1711c = new C0616qf(c0143dm, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0143dm.f1711c);
                } else {
                    arrayList2.add(c0143dm.f1715e);
                }
                if (c0143dm instanceof C0205fb) {
                    arrayList2.add(new fb0(c0143dm));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((bj1) obj2).mo710f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            bj1 bj1Var = (bj1) obj3;
            if (bj1Var.f890b != c0179em2) {
                bj1Var.mo708d();
            }
        }
        arrayList.clear();
        m3980e(c0179em.f1713d, 0, arrayList);
        m3980e(c0179em.f1715e, 1, arrayList);
        this.f6236b = false;
    }

    /* JADX INFO: renamed from: d */
    public final int m3979d(C0179em c0179em, int i) {
        ArrayList arrayList;
        int i2;
        long jMo712j;
        float f;
        long j;
        ArrayList arrayList2 = this.f6242h;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            bj1 bj1Var = ((y31) arrayList2.get(i3)).f9141a;
            if (!(bj1Var instanceof C0616qf) ? !(i != 0 ? (bj1Var instanceof mh1) : (bj1Var instanceof gb0)) : ((C0616qf) bj1Var).f894f != i) {
                C0629qs c0629qs = (i == 0 ? c0179em.f1713d : c0179em.f1715e).f896h;
                C0629qs c0629qs2 = (i == 0 ? c0179em.f1713d : c0179em.f1715e).f897i;
                C0629qs c0629qs3 = bj1Var.f896h;
                C0629qs c0629qs4 = bj1Var.f897i;
                boolean zContains = c0629qs3.f6583l.contains(c0629qs);
                boolean zContains2 = c0629qs4.f6583l.contains(c0629qs2);
                long jMo712j2 = bj1Var.mo712j();
                if (zContains && zContains2) {
                    long jM5722b = y31.m5722b(c0629qs3, j2);
                    arrayList = arrayList2;
                    long jM5721a = y31.m5721a(c0629qs4, j2);
                    long j3 = jM5722b - jMo712j2;
                    int i4 = c0629qs4.f6577f;
                    i2 = i3;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = c0629qs3.f6577f;
                    long j5 = ((-jM5721a) - jMo712j2) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C0143dm c0143dm = bj1Var.f890b;
                    if (i == 0) {
                        f = c0143dm.f1712c0;
                    } else if (i == 1) {
                        f = c0143dm.f1714d0;
                    } else {
                        c0143dm.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j = (long) ((j3 / (1.0f - f)) + (j5 / f));
                    } else {
                        j = 0;
                    }
                    float f2 = j;
                    jMo712j = (((long) c0629qs3.f6577f) + ((((long) ((f2 * f) + 0.5f)) + jMo712j2) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c0629qs4.f6577f);
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (zContains) {
                        jMo712j = Math.max(y31.m5722b(c0629qs3, c0629qs3.f6577f), ((long) c0629qs3.f6577f) + jMo712j2);
                    } else if (zContains2) {
                        jMo712j = Math.max(-y31.m5721a(c0629qs4, c0629qs4.f6577f), ((long) (-c0629qs4.f6577f)) + jMo712j2);
                    } else {
                        jMo712j = (bj1Var.mo712j() + ((long) c0629qs3.f6577f)) - ((long) c0629qs4.f6577f);
                    }
                }
            } else {
                arrayList = arrayList2;
                jMo712j = j2;
                i2 = i3;
            }
            jMax = Math.max(jMax, jMo712j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            j2 = 0;
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: e */
    public final void m3980e(bj1 bj1Var, int i, ArrayList arrayList) {
        C0629qs c0629qs = bj1Var.f896h;
        C0629qs c0629qs2 = bj1Var.f897i;
        ArrayList arrayList2 = c0629qs.f6582k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            InterfaceC0518ns interfaceC0518ns = (InterfaceC0518ns) obj;
            if (interfaceC0518ns instanceof C0629qs) {
                m3976a((C0629qs) interfaceC0518ns, i, arrayList, null);
            } else if (interfaceC0518ns instanceof bj1) {
                m3976a(((bj1) interfaceC0518ns).f896h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = c0629qs2.f6582k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            InterfaceC0518ns interfaceC0518ns2 = (InterfaceC0518ns) obj2;
            if (interfaceC0518ns2 instanceof C0629qs) {
                m3976a((C0629qs) interfaceC0518ns2, i, arrayList, null);
            } else if (interfaceC0518ns2 instanceof bj1) {
                m3976a(((bj1) interfaceC0518ns2).f897i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((mh1) bj1Var).f5047k.f6582k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                InterfaceC0518ns interfaceC0518ns3 = (InterfaceC0518ns) obj3;
                if (interfaceC0518ns3 instanceof C0629qs) {
                    m3976a((C0629qs) interfaceC0518ns3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3981f(int i, int i2, int i3, int i4, C0143dm c0143dm) {
        C0834wb c0834wb = this.f6241g;
        c0834wb.f8494a = i;
        c0834wb.f8495b = i3;
        c0834wb.f8496c = i2;
        c0834wb.f8497d = i4;
        this.f6240f.m4934b(c0143dm, c0834wb);
        c0143dm.m1245K(c0834wb.f8498e);
        c0143dm.m1242H(c0834wb.f8499f);
        c0143dm.f1685E = c0834wb.f8501h;
        int i5 = c0834wb.f8500g;
        c0143dm.f1706Z = i5;
        c0143dm.f1685E = i5 > 0;
    }

    /* JADX INFO: renamed from: g */
    public final void m3982g() {
        C0686sb c0686sb;
        C0592ps c0592ps = this;
        ArrayList arrayList = c0592ps.f6235a.f2132p0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C0143dm c0143dm = (C0143dm) arrayList.get(i);
            if (!c0143dm.f1707a) {
                int[] iArr = c0143dm.f1736o0;
                int i3 = iArr[0];
                int i4 = iArr[1];
                int i5 = c0143dm.f1739r;
                int i6 = c0143dm.f1740s;
                boolean z = i3 == 2 || (i3 == 3 && i5 == 1);
                boolean z2 = i4 == 2 || (i4 == 3 && i6 == 1);
                C0074bt c0074bt = c0143dm.f1713d.f893e;
                boolean z3 = c0074bt.f6581j;
                C0074bt c0074bt2 = c0143dm.f1715e.f893e;
                boolean z4 = c0074bt2.f6581j;
                boolean z5 = z;
                if (z3 && z4) {
                    c0592ps.m3981f(1, c0074bt.f6578g, 1, c0074bt2.f6578g, c0143dm);
                    c0143dm.f1707a = true;
                } else if (z3 && z2) {
                    m3981f(1, c0074bt.f6578g, 2, c0074bt2.f6578g, c0143dm);
                    mh1 mh1Var = c0143dm.f1715e;
                    if (i4 == 3) {
                        mh1Var.f893e.f976m = c0143dm.m1256i();
                    } else {
                        mh1Var.f893e.mo759d(c0143dm.m1256i());
                        c0143dm.f1707a = true;
                    }
                } else if (z4 && z5) {
                    m3981f(2, c0074bt.f6578g, 1, c0074bt2.f6578g, c0143dm);
                    gb0 gb0Var = c0143dm.f1713d;
                    if (i3 == 3) {
                        gb0Var.f893e.f976m = c0143dm.m1260o();
                    } else {
                        gb0Var.f893e.mo759d(c0143dm.m1260o());
                        c0143dm.f1707a = true;
                    }
                }
                if (c0143dm.f1707a && (c0686sb = c0143dm.f1715e.f5048l) != null) {
                    c0686sb.mo759d(c0143dm.f1706Z);
                }
                c0592ps = this;
            }
            i = i2;
        }
    }
}
