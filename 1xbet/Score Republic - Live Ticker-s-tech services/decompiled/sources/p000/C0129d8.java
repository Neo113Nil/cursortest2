package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: d8 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class C0129d8 {

    /* JADX INFO: renamed from: d */
    public final C0793v7 f1579d;

    /* JADX INFO: renamed from: a */
    public a91 f1576a = null;

    /* JADX INFO: renamed from: b */
    public float f1577b = 0.0f;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1578c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public boolean f1580e = false;

    public C0129d8(qd0 qd0Var) {
        this.f1579d = new C0793v7(this, qd0Var);
    }

    /* JADX INFO: renamed from: a */
    public final void m1130a(gi0 gi0Var, int i) {
        a91 a91VarM2089j = gi0Var.m2089j(i);
        C0793v7 c0793v7 = this.f1579d;
        c0793v7.m5110g(a91VarM2089j, 1.0f);
        c0793v7.m5110g(gi0Var.m2089j(i), -1.0f);
    }

    /* JADX INFO: renamed from: b */
    public final void m1131b(a91 a91Var, a91 a91Var2, a91 a91Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1577b = i;
        }
        C0793v7 c0793v7 = this.f1579d;
        if (z) {
            c0793v7.m5110g(a91Var, 1.0f);
            c0793v7.m5110g(a91Var2, -1.0f);
            c0793v7.m5110g(a91Var3, -1.0f);
        } else {
            c0793v7.m5110g(a91Var, -1.0f);
            c0793v7.m5110g(a91Var2, 1.0f);
            c0793v7.m5110g(a91Var3, 1.0f);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m1132c(a91 a91Var, a91 a91Var2, a91 a91Var3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f1577b = i;
        }
        C0793v7 c0793v7 = this.f1579d;
        if (z) {
            c0793v7.m5110g(a91Var, 1.0f);
            c0793v7.m5110g(a91Var2, -1.0f);
            c0793v7.m5110g(a91Var3, 1.0f);
        } else {
            c0793v7.m5110g(a91Var, -1.0f);
            c0793v7.m5110g(a91Var2, 1.0f);
            c0793v7.m5110g(a91Var3, -1.0f);
        }
    }

    /* JADX INFO: renamed from: d */
    public a91 mo1133d(boolean[] zArr) {
        return m1135f(zArr, null);
    }

    /* JADX INFO: renamed from: e */
    public boolean mo1134e() {
        return this.f1576a == null && this.f1577b == 0.0f && this.f1579d.m5107d() == 0;
    }

    /* JADX INFO: renamed from: f */
    public final a91 m1135f(boolean[] zArr, a91 a91Var) {
        int i;
        C0793v7 c0793v7 = this.f1579d;
        int iM5107d = c0793v7.m5107d();
        a91 a91Var2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < iM5107d; i2++) {
            float fM5109f = c0793v7.m5109f(i2);
            if (fM5109f < 0.0f) {
                a91 a91VarM5108e = c0793v7.m5108e(i2);
                if ((zArr == null || !zArr[a91VarM5108e.f85k]) && a91VarM5108e != a91Var && (((i = a91VarM5108e.f95u) == 3 || i == 4) && fM5109f < f)) {
                    f = fM5109f;
                    a91Var2 = a91VarM5108e;
                }
            }
        }
        return a91Var2;
    }

    /* JADX INFO: renamed from: g */
    public final void m1136g(a91 a91Var) {
        a91 a91Var2 = this.f1576a;
        C0793v7 c0793v7 = this.f1579d;
        if (a91Var2 != null) {
            c0793v7.m5110g(a91Var2, -1.0f);
            this.f1576a.f86l = -1;
            this.f1576a = null;
        }
        float fM5111h = c0793v7.m5111h(a91Var, true) * (-1.0f);
        this.f1576a = a91Var;
        if (fM5111h == 1.0f) {
            return;
        }
        this.f1577b /= fM5111h;
        int i = c0793v7.f8121h;
        for (int i2 = 0; i != -1 && i2 < c0793v7.f8114a; i2++) {
            float[] fArr = c0793v7.f8120g;
            fArr[i] = fArr[i] / fM5111h;
            i = c0793v7.f8119f[i];
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1137h(gi0 gi0Var, a91 a91Var, boolean z) {
        if (a91Var.f89o) {
            C0793v7 c0793v7 = this.f1579d;
            float fM5106c = c0793v7.m5106c(a91Var);
            this.f1577b = (a91Var.f88n * fM5106c) + this.f1577b;
            c0793v7.m5111h(a91Var, z);
            if (z) {
                a91Var.m144b(this);
            }
            if (c0793v7.m5107d() == 0) {
                this.f1580e = true;
                gi0Var.f2744b = true;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public void mo1138i(gi0 gi0Var, C0129d8 c0129d8, boolean z) {
        C0793v7 c0793v7 = this.f1579d;
        c0793v7.getClass();
        float fM5106c = c0793v7.m5106c(c0129d8.f1576a);
        c0793v7.m5111h(c0129d8.f1576a, z);
        C0793v7 c0793v8 = c0129d8.f1579d;
        int iM5107d = c0793v8.m5107d();
        for (int i = 0; i < iM5107d; i++) {
            a91 a91VarM5108e = c0793v8.m5108e(i);
            c0793v7.m5104a(a91VarM5108e, c0793v8.m5106c(a91VarM5108e) * fM5106c, z);
        }
        this.f1577b = (c0129d8.f1577b * fM5106c) + this.f1577b;
        if (z) {
            c0129d8.f1576a.m144b(this);
        }
        if (this.f1576a == null || c0793v7.m5107d() != 0) {
            return;
        }
        this.f1580e = true;
        gi0Var.f2744b = true;
    }

    public String toString() {
        boolean z;
        String strConcat = (this.f1576a == null ? "0" : "" + this.f1576a).concat(" = ");
        if (this.f1577b != 0.0f) {
            strConcat = strConcat + this.f1577b;
            z = true;
        } else {
            z = false;
        }
        C0793v7 c0793v7 = this.f1579d;
        int iM5107d = c0793v7.m5107d();
        for (int i = 0; i < iM5107d; i++) {
            a91 a91VarM5108e = c0793v7.m5108e(i);
            if (a91VarM5108e != null) {
                float fM5109f = c0793v7.m5109f(i);
                if (fM5109f != 0.0f) {
                    String string = a91VarM5108e.toString();
                    if (z) {
                        if (fM5109f > 0.0f) {
                            strConcat = strConcat.concat(" + ");
                        } else {
                            strConcat = strConcat.concat(" - ");
                            fM5109f *= -1.0f;
                        }
                    } else if (fM5109f < 0.0f) {
                        strConcat = strConcat.concat("- ");
                        fM5109f *= -1.0f;
                    }
                    strConcat = fM5109f == 1.0f ? strConcat.concat(string) : strConcat + fM5109f + " " + string;
                    z = true;
                }
            }
        }
        return !z ? strConcat.concat("0.0") : strConcat;
    }
}
