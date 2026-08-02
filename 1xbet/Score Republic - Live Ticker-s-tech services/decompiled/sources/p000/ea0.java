package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ea0 extends C0143dm {

    /* JADX INFO: renamed from: p0 */
    public float f2037p0 = -1.0f;

    /* JADX INFO: renamed from: q0 */
    public int f2038q0 = -1;

    /* JADX INFO: renamed from: r0 */
    public int f2039r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public C0585pl f2040s0 = this.f1689I;

    /* JADX INFO: renamed from: t0 */
    public int f2041t0 = 0;

    /* JADX INFO: renamed from: u0 */
    public boolean f2042u0;

    public ea0() {
        this.f1697Q.clear();
        this.f1697Q.add(this.f2040s0);
        int length = this.f1696P.length;
        for (int i = 0; i < length; i++) {
            this.f1696P[i] = this.f2040s0;
        }
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: M */
    public final void mo1247M(gi0 gi0Var, boolean z) {
        if (this.f1699S == null) {
            return;
        }
        C0585pl c0585pl = this.f2040s0;
        gi0Var.getClass();
        int iM2079n = gi0.m2079n(c0585pl);
        if (this.f2041t0 == 1) {
            this.f1704X = iM2079n;
            this.f1705Y = 0;
            m1242H(this.f1699S.m1256i());
            m1245K(0);
            return;
        }
        this.f1704X = 0;
        this.f1705Y = iM2079n;
        m1245K(this.f1699S.m1260o());
        m1242H(0);
    }

    /* JADX INFO: renamed from: N */
    public final void m1397N(int i) {
        this.f2040s0.m3962i(i);
        this.f2042u0 = true;
    }

    /* JADX INFO: renamed from: O */
    public final void m1398O(int i) {
        if (this.f2041t0 == i) {
            return;
        }
        this.f2041t0 = i;
        ArrayList arrayList = this.f1697Q;
        arrayList.clear();
        if (this.f2041t0 == 1) {
            this.f2040s0 = this.f1688H;
        } else {
            this.f2040s0 = this.f1689I;
        }
        arrayList.add(this.f2040s0);
        C0585pl[] c0585plArr = this.f1696P;
        int length = c0585plArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c0585plArr[i2] = this.f2040s0;
        }
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: b */
    public final void mo1249b(gi0 gi0Var, boolean z) {
        C0179em c0179em = (C0179em) this.f1699S;
        if (c0179em == null) {
            return;
        }
        Object objMo1254g = c0179em.mo1254g(2);
        Object objMo1254g2 = c0179em.mo1254g(4);
        C0143dm c0143dm = this.f1699S;
        boolean z2 = c0143dm != null && c0143dm.f1736o0[0] == 2;
        if (this.f2041t0 == 0) {
            objMo1254g = c0179em.mo1254g(3);
            objMo1254g2 = c0179em.mo1254g(5);
            C0143dm c0143dm2 = this.f1699S;
            z2 = c0143dm2 != null && c0143dm2.f1736o0[1] == 2;
        }
        if (this.f2042u0) {
            C0585pl c0585pl = this.f2040s0;
            if (c0585pl.f6194c) {
                a91 a91VarM2090k = gi0Var.m2090k(c0585pl);
                gi0Var.m2083d(a91VarM2090k, this.f2040s0.m3956c());
                if (this.f2038q0 != -1) {
                    if (z2) {
                        gi0Var.m2085f(gi0Var.m2090k(objMo1254g2), a91VarM2090k, 0, 5);
                    }
                } else if (this.f2039r0 != -1 && z2) {
                    a91 a91VarM2090k2 = gi0Var.m2090k(objMo1254g2);
                    gi0Var.m2085f(a91VarM2090k, gi0Var.m2090k(objMo1254g), 0, 5);
                    gi0Var.m2085f(a91VarM2090k2, a91VarM2090k, 0, 5);
                }
                this.f2042u0 = false;
                return;
            }
        }
        if (this.f2038q0 != -1) {
            a91 a91VarM2090k3 = gi0Var.m2090k(this.f2040s0);
            gi0Var.m2084e(a91VarM2090k3, gi0Var.m2090k(objMo1254g), this.f2038q0, 8);
            if (z2) {
                gi0Var.m2085f(gi0Var.m2090k(objMo1254g2), a91VarM2090k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f2039r0 != -1) {
            a91 a91VarM2090k4 = gi0Var.m2090k(this.f2040s0);
            a91 a91VarM2090k5 = gi0Var.m2090k(objMo1254g2);
            gi0Var.m2084e(a91VarM2090k4, a91VarM2090k5, -this.f2039r0, 8);
            if (z2) {
                gi0Var.m2085f(a91VarM2090k4, gi0Var.m2090k(objMo1254g), 0, 5);
                gi0Var.m2085f(a91VarM2090k5, a91VarM2090k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f2037p0 != -1.0f) {
            a91 a91VarM2090k6 = gi0Var.m2090k(this.f2040s0);
            a91 a91VarM2090k7 = gi0Var.m2090k(objMo1254g2);
            float f = this.f2037p0;
            C0129d8 c0129d8M2091l = gi0Var.m2091l();
            c0129d8M2091l.f1579d.m5110g(a91VarM2090k6, -1.0f);
            c0129d8M2091l.f1579d.m5110g(a91VarM2090k7, f);
            gi0Var.m2082c(c0129d8M2091l);
        }
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: c */
    public final boolean mo1250c() {
        return true;
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: g */
    public final C0585pl mo1254g(int i) {
        int iM292o = AbstractC0024an.m292o(i);
        if (iM292o != 1) {
            if (iM292o != 2) {
                if (iM292o != 3) {
                    if (iM292o != 4) {
                        return null;
                    }
                }
            }
            if (this.f2041t0 == 0) {
                return this.f2040s0;
            }
            return null;
        }
        if (this.f2041t0 == 1) {
            return this.f2040s0;
        }
        return null;
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: y */
    public final boolean mo1270y() {
        return this.f2042u0;
    }

    @Override // p000.C0143dm
    /* JADX INFO: renamed from: z */
    public final boolean mo1271z() {
        return this.f2042u0;
    }
}
