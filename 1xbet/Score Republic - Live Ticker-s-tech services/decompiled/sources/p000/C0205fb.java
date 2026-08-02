package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: fb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0205fb extends C0143dm {

    /* JADX INFO: renamed from: p0 */
    public C0143dm[] f2366p0;

    /* JADX INFO: renamed from: q0 */
    public int f2367q0;

    /* JADX INFO: renamed from: r0 */
    public int f2368r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f2369s0;

    /* JADX INFO: renamed from: t0 */
    public int f2370t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f2371u0;

    /* JADX INFO: renamed from: N */
    public final void m1755N(int i, aj1 aj1Var, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.f2367q0; i2++) {
            C0143dm c0143dm = this.f2366p0[i2];
            ArrayList arrayList2 = aj1Var.f216a;
            if (!arrayList2.contains(c0143dm)) {
                arrayList2.add(c0143dm);
            }
        }
        for (int i3 = 0; i3 < this.f2367q0; i3++) {
            p80.m3868m(this.f2366p0[i3], i, arrayList, aj1Var);
        }
    }

    /* JADX INFO: renamed from: O */
    public final boolean m1756O() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f2367q0;
            if (i4 >= i) {
                break;
            }
            C0143dm c0143dm = this.f2366p0[i4];
            if ((this.f2369s0 || c0143dm.mo1250c()) && ((((i2 = this.f2368r0) == 0 || i2 == 1) && !c0143dm.mo1270y()) || (((i3 = this.f2368r0) == 2 || i3 == 3) && !c0143dm.mo1271z()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f2367q0; i5++) {
            C0143dm c0143dm2 = this.f2366p0[i5];
            if (this.f2369s0 || c0143dm2.mo1250c()) {
                if (!z2) {
                    int i6 = this.f2368r0;
                    if (i6 == 0) {
                        iMax = c0143dm2.mo1254g(2).m3956c();
                    } else if (i6 == 1) {
                        iMax = c0143dm2.mo1254g(4).m3956c();
                    } else if (i6 == 2) {
                        iMax = c0143dm2.mo1254g(3).m3956c();
                    } else if (i6 == 3) {
                        iMax = c0143dm2.mo1254g(5).m3956c();
                    }
                    z2 = true;
                }
                int i7 = this.f2368r0;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c0143dm2.mo1254g(2).m3956c());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c0143dm2.mo1254g(4).m3956c());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c0143dm2.mo1254g(3).m3956c());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c0143dm2.mo1254g(5).m3956c());
                }
            }
        }
        int i8 = iMax + this.f2370t0;
        int i9 = this.f2368r0;
        if (i9 == 0 || i9 == 1) {
            m1240F(i8, i8);
        } else {
            m1241G(i8, i8);
        }
        this.f2371u0 = true;
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final int m1757P() {
        int i = this.f2368r0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: b */
    public final void mo1249b(gi0 gi0Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        C0585pl[] c0585plArr = this.f1696P;
        C0585pl c0585pl = this.f1688H;
        c0585plArr[0] = c0585pl;
        int i3 = 2;
        C0585pl c0585pl2 = this.f1689I;
        c0585plArr[2] = c0585pl2;
        C0585pl c0585pl3 = this.f1690J;
        c0585plArr[1] = c0585pl3;
        C0585pl c0585pl4 = this.f1691K;
        c0585plArr[3] = c0585pl4;
        for (C0585pl c0585pl5 : c0585plArr) {
            c0585pl5.f6200i = gi0Var.m2090k(c0585pl5);
        }
        int i4 = this.f2368r0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0585pl c0585pl6 = c0585plArr[i4];
        if (!this.f2371u0) {
            m1756O();
        }
        if (this.f2371u0) {
            this.f2371u0 = false;
            int i5 = this.f2368r0;
            if (i5 == 0 || i5 == 1) {
                gi0Var.m2083d(c0585pl.f6200i, this.f1704X);
                gi0Var.m2083d(c0585pl3.f6200i, this.f1704X);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    gi0Var.m2083d(c0585pl2.f6200i, this.f1705Y);
                    gi0Var.m2083d(c0585pl4.f6200i, this.f1705Y);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f2367q0) {
                z2 = false;
                break;
            }
            C0143dm c0143dm = this.f2366p0[i6];
            if ((this.f2369s0 || c0143dm.mo1250c()) && ((((i2 = this.f2368r0) == 0 || i2 == 1) && c0143dm.f1736o0[0] == 3 && c0143dm.f1688H.f6197f != null && c0143dm.f1690J.f6197f != null) || ((i2 == 2 || i2 == 3) && c0143dm.f1736o0[1] == 3 && c0143dm.f1689I.f6197f != null && c0143dm.f1691K.f6197f != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c0585pl.m3958e() || c0585pl3.m3958e();
        boolean z4 = c0585pl2.m3958e() || c0585pl4.m3958e();
        int i7 = !(!z2 && (((i = this.f2368r0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f2367q0) {
            C0143dm c0143dm2 = this.f2366p0[i8];
            if (this.f2369s0 || c0143dm2.mo1250c()) {
                a91 a91VarM2090k = gi0Var.m2090k(c0143dm2.f1696P[this.f2368r0]);
                C0585pl[] c0585plArr2 = c0143dm2.f1696P;
                int i9 = this.f2368r0;
                C0585pl c0585pl7 = c0585plArr2[i9];
                c0585pl7.f6200i = a91VarM2090k;
                C0585pl c0585pl8 = c0585pl7.f6197f;
                int i10 = (c0585pl8 == null || c0585pl8.f6195d != this) ? 0 : c0585pl7.f6198g;
                if (i9 == 0 || i9 == i3) {
                    a91 a91Var = c0585pl6.f6200i;
                    int i11 = this.f2370t0 - i10;
                    C0129d8 c0129d8M2091l = gi0Var.m2091l();
                    a91 a91VarM2092m = gi0Var.m2092m();
                    a91VarM2092m.f87m = 0;
                    c0129d8M2091l.m1132c(a91Var, a91VarM2090k, a91VarM2092m, i11);
                    gi0Var.m2082c(c0129d8M2091l);
                } else {
                    a91 a91Var2 = c0585pl6.f6200i;
                    int i12 = this.f2370t0 + i10;
                    C0129d8 c0129d8M2091l2 = gi0Var.m2091l();
                    a91 a91VarM2092m2 = gi0Var.m2092m();
                    a91VarM2092m2.f87m = 0;
                    c0129d8M2091l2.m1131b(a91Var2, a91VarM2090k, a91VarM2092m2, i12);
                    gi0Var.m2082c(c0129d8M2091l2);
                }
                gi0Var.m2084e(c0585pl6.f6200i, a91VarM2090k, this.f2370t0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f2368r0;
        if (i13 == 0) {
            gi0Var.m2084e(c0585pl3.f6200i, c0585pl.f6200i, 0, 8);
            gi0Var.m2084e(c0585pl.f6200i, this.f1699S.f1690J.f6200i, 0, 4);
            gi0Var.m2084e(c0585pl.f6200i, this.f1699S.f1688H.f6200i, 0, 0);
            return;
        }
        if (i13 == 1) {
            gi0Var.m2084e(c0585pl.f6200i, c0585pl3.f6200i, 0, 8);
            gi0Var.m2084e(c0585pl.f6200i, this.f1699S.f1688H.f6200i, 0, 4);
            gi0Var.m2084e(c0585pl.f6200i, this.f1699S.f1690J.f6200i, 0, 0);
        } else if (i13 == 2) {
            gi0Var.m2084e(c0585pl4.f6200i, c0585pl2.f6200i, 0, 8);
            gi0Var.m2084e(c0585pl2.f6200i, this.f1699S.f1691K.f6200i, 0, 4);
            gi0Var.m2084e(c0585pl2.f6200i, this.f1699S.f1689I.f6200i, 0, 0);
        } else if (i13 == 3) {
            gi0Var.m2084e(c0585pl2.f6200i, c0585pl4.f6200i, 0, 8);
            gi0Var.m2084e(c0585pl2.f6200i, this.f1699S.f1689I.f6200i, 0, 4);
            gi0Var.m2084e(c0585pl2.f6200i, this.f1699S.f1691K.f6200i, 0, 0);
        }
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: c */
    public final boolean mo1250c() {
        return true;
    }

    @Override // p000.C0143dm
    public final String toString() {
        String strM285h = AbstractC0024an.m285h(new StringBuilder("[Barrier] "), this.f1720g0, " {");
        for (int i = 0; i < this.f2367q0; i++) {
            C0143dm c0143dm = this.f2366p0[i];
            if (i > 0) {
                strM285h = strM285h.concat(", ");
            }
            strM285h = strM285h + c0143dm.f1720g0;
        }
        return strM285h.concat("}");
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: y */
    public final boolean mo1270y() {
        return this.f2371u0;
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: z */
    public final boolean mo1271z() {
        return this.f2371u0;
    }
}
