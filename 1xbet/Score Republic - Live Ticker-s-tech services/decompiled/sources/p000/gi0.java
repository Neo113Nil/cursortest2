package p000;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class gi0 {

    /* JADX INFO: renamed from: q */
    public static boolean f2742q = false;

    /* JADX INFO: renamed from: d */
    public final fx0 f2746d;

    /* JADX INFO: renamed from: m */
    public final qd0 f2755m;

    /* JADX INFO: renamed from: p */
    public C0129d8 f2758p;

    /* JADX INFO: renamed from: a */
    public int f2743a = 1000;

    /* JADX INFO: renamed from: b */
    public boolean f2744b = false;

    /* JADX INFO: renamed from: c */
    public int f2745c = 0;

    /* JADX INFO: renamed from: e */
    public int f2747e = 32;

    /* JADX INFO: renamed from: f */
    public int f2748f = 32;

    /* JADX INFO: renamed from: h */
    public boolean f2750h = false;

    /* JADX INFO: renamed from: i */
    public boolean[] f2751i = new boolean[32];

    /* JADX INFO: renamed from: j */
    public int f2752j = 1;

    /* JADX INFO: renamed from: k */
    public int f2753k = 0;

    /* JADX INFO: renamed from: l */
    public int f2754l = 32;

    /* JADX INFO: renamed from: n */
    public a91[] f2756n = new a91[1000];

    /* JADX INFO: renamed from: o */
    public int f2757o = 0;

    /* JADX INFO: renamed from: g */
    public C0129d8[] f2749g = new C0129d8[32];

    public gi0() {
        m2097s();
        qd0 qd0Var = new qd0(6);
        qd0Var.f6471k = new C0678s3(4);
        qd0Var.f6472l = new C0678s3(4);
        qd0Var.f6473m = new a91[32];
        this.f2755m = qd0Var;
        fx0 fx0Var = new fx0(qd0Var);
        fx0Var.f2528f = new a91[128];
        fx0Var.f2529g = new a91[128];
        fx0Var.f2530h = 0;
        fx0Var.f2531i = new f50(20, (Object) fx0Var, false);
        this.f2746d = fx0Var;
        this.f2758p = new C0129d8(qd0Var);
    }

    /* JADX INFO: renamed from: n */
    public static int m2079n(Object obj) {
        a91 a91Var = ((C0585pl) obj).f6200i;
        if (a91Var != null) {
            return (int) (a91Var.f88n + 0.5f);
        }
        return 0;
    }

    /* JADX INFO: renamed from: a */
    public final a91 m2080a(int i) {
        C0678s3 c0678s3 = (C0678s3) this.f2755m.f6472l;
        int i2 = c0678s3.f7021j;
        Object obj = null;
        if (i2 > 0) {
            int i3 = i2 - 1;
            Object[] objArr = (Object[]) c0678s3.f7022k;
            Object obj2 = objArr[i3];
            objArr[i3] = null;
            c0678s3.f7021j = i3;
            obj = obj2;
        }
        a91 a91Var = (a91) obj;
        if (a91Var == null) {
            a91Var = new a91(i);
            a91Var.f95u = i;
        } else {
            a91Var.m145c();
            a91Var.f95u = i;
        }
        int i4 = this.f2757o;
        int i5 = this.f2743a;
        if (i4 >= i5) {
            int i6 = i5 * 2;
            this.f2743a = i6;
            this.f2756n = (a91[]) Arrays.copyOf(this.f2756n, i6);
        }
        a91[] a91VarArr = this.f2756n;
        int i7 = this.f2757o;
        this.f2757o = i7 + 1;
        a91VarArr[i7] = a91Var;
        return a91Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m2081b(a91 a91Var, a91 a91Var2, int i, float f, a91 a91Var3, a91 a91Var4, int i2, int i3) {
        C0129d8 c0129d8M2091l = m2091l();
        if (a91Var2 == a91Var3) {
            c0129d8M2091l.f1579d.m5110g(a91Var, 1.0f);
            c0129d8M2091l.f1579d.m5110g(a91Var4, 1.0f);
            c0129d8M2091l.f1579d.m5110g(a91Var2, -2.0f);
        } else {
            C0793v7 c0793v7 = c0129d8M2091l.f1579d;
            if (f == 0.5f) {
                c0793v7.m5110g(a91Var, 1.0f);
                c0129d8M2091l.f1579d.m5110g(a91Var2, -1.0f);
                c0129d8M2091l.f1579d.m5110g(a91Var3, -1.0f);
                c0129d8M2091l.f1579d.m5110g(a91Var4, 1.0f);
                if (i > 0 || i2 > 0) {
                    c0129d8M2091l.f1577b = (-i) + i2;
                }
            } else if (f <= 0.0f) {
                c0793v7.m5110g(a91Var, -1.0f);
                c0129d8M2091l.f1579d.m5110g(a91Var2, 1.0f);
                c0129d8M2091l.f1577b = i;
            } else if (f >= 1.0f) {
                c0793v7.m5110g(a91Var4, -1.0f);
                c0129d8M2091l.f1579d.m5110g(a91Var3, 1.0f);
                c0129d8M2091l.f1577b = -i2;
            } else {
                float f2 = 1.0f - f;
                c0793v7.m5110g(a91Var, f2 * 1.0f);
                c0129d8M2091l.f1579d.m5110g(a91Var2, f2 * (-1.0f));
                c0129d8M2091l.f1579d.m5110g(a91Var3, (-1.0f) * f);
                c0129d8M2091l.f1579d.m5110g(a91Var4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    c0129d8M2091l.f1577b = (i2 * f) + ((-i) * f2);
                }
            }
        }
        if (i3 != 8) {
            c0129d8M2091l.m1130a(this, i3);
        }
        m2082c(c0129d8M2091l);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f5  */
    /* JADX INFO: renamed from: c */
    public final void m2082c(C0129d8 c0129d8) {
        boolean z;
        boolean z2;
        a91 a91VarM1135f;
        if (this.f2753k + 1 >= this.f2754l || this.f2752j + 1 >= this.f2748f) {
            m2093o();
        }
        if (c0129d8.f1580e) {
            z = false;
        } else {
            ArrayList arrayList = c0129d8.f1578c;
            if (this.f2749g.length != 0) {
                boolean z3 = false;
                while (!z3) {
                    int iM5107d = c0129d8.f1579d.m5107d();
                    for (int i = 0; i < iM5107d; i++) {
                        a91 a91VarM5108e = c0129d8.f1579d.m5108e(i);
                        if (a91VarM5108e.f86l != -1 || a91VarM5108e.f89o) {
                            arrayList.add(a91VarM5108e);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i2 = 0; i2 < size; i2++) {
                            a91 a91Var = (a91) arrayList.get(i2);
                            if (a91Var.f89o) {
                                c0129d8.m1137h(this, a91Var, true);
                            } else {
                                c0129d8.mo1138i(this, this.f2749g[a91Var.f86l], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z3 = true;
                    }
                }
                if (c0129d8.f1576a != null && c0129d8.f1579d.m5107d() == 0) {
                    c0129d8.f1580e = true;
                    this.f2744b = true;
                }
            }
            if (c0129d8.mo1134e()) {
                return;
            }
            float f = c0129d8.f1577b;
            float f2 = 0.0f;
            if (f < 0.0f) {
                c0129d8.f1577b = f * (-1.0f);
                C0793v7 c0793v7 = c0129d8.f1579d;
                int i3 = c0793v7.f8121h;
                for (int i4 = 0; i3 != -1 && i4 < c0793v7.f8114a; i4++) {
                    float[] fArr = c0793v7.f8120g;
                    fArr[i3] = fArr[i3] * (-1.0f);
                    i3 = c0793v7.f8119f[i3];
                }
            }
            int iM5107d2 = c0129d8.f1579d.m5107d();
            float f3 = 0.0f;
            float f4 = 0.0f;
            a91 a91Var2 = null;
            a91 a91Var3 = null;
            int i5 = 0;
            boolean z4 = false;
            boolean z5 = false;
            while (i5 < iM5107d2) {
                float fM5109f = c0129d8.f1579d.m5109f(i5);
                a91 a91VarM5108e2 = c0129d8.f1579d.m5108e(i5);
                float f5 = f2;
                if (a91VarM5108e2.f95u == 1) {
                    if (a91Var2 == null) {
                        if (a91VarM5108e2.f94t <= 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        a91Var2 = a91VarM5108e2;
                        f3 = fM5109f;
                    } else {
                        if (f3 > fM5109f) {
                            if (a91VarM5108e2.f94t > 1) {
                                z4 = false;
                            }
                            a91Var2 = a91VarM5108e2;
                            f3 = fM5109f;
                        } else if (z4 || a91VarM5108e2.f94t > 1) {
                        }
                        z4 = true;
                        a91Var2 = a91VarM5108e2;
                        f3 = fM5109f;
                    }
                } else if (a91Var2 == null && fM5109f < f5) {
                    if (a91Var3 == null) {
                        if (a91VarM5108e2.f94t <= 1) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        a91Var3 = a91VarM5108e2;
                        f4 = fM5109f;
                    } else {
                        if (f4 > fM5109f) {
                            if (a91VarM5108e2.f94t > 1) {
                                z5 = false;
                            }
                            a91Var3 = a91VarM5108e2;
                            f4 = fM5109f;
                        } else if (z5 || a91VarM5108e2.f94t > 1) {
                        }
                        z5 = true;
                        a91Var3 = a91VarM5108e2;
                        f4 = fM5109f;
                    }
                }
                i5++;
                f2 = f5;
            }
            float f6 = f2;
            if (a91Var2 == null) {
                a91Var2 = a91Var3;
            }
            if (a91Var2 == null) {
                z2 = true;
            } else {
                c0129d8.m1136g(a91Var2);
                z2 = false;
            }
            if (c0129d8.f1579d.m5107d() == 0) {
                c0129d8.f1580e = true;
            }
            if (z2) {
                if (this.f2752j + 1 >= this.f2748f) {
                    m2093o();
                }
                a91 a91VarM2080a = m2080a(3);
                int i6 = this.f2745c + 1;
                this.f2745c = i6;
                this.f2752j++;
                a91VarM2080a.f85k = i6;
                qd0 qd0Var = this.f2755m;
                ((a91[]) qd0Var.f6473m)[i6] = a91VarM2080a;
                c0129d8.f1576a = a91VarM2080a;
                int i7 = this.f2753k;
                m2087h(c0129d8);
                if (this.f2753k == i7 + 1) {
                    C0129d8 c0129d9 = this.f2758p;
                    c0129d9.f1576a = null;
                    c0129d9.f1579d.m5105b();
                    for (int i8 = 0; i8 < c0129d8.f1579d.m5107d(); i8++) {
                        c0129d9.f1579d.m5104a(c0129d8.f1579d.m5108e(i8), c0129d8.f1579d.m5109f(i8), true);
                    }
                    m2096r(this.f2758p);
                    if (a91VarM2080a.f86l == -1) {
                        if (c0129d8.f1576a == a91VarM2080a && (a91VarM1135f = c0129d8.m1135f(null, a91VarM2080a)) != null) {
                            c0129d8.m1136g(a91VarM1135f);
                        }
                        if (!c0129d8.f1580e) {
                            c0129d8.f1576a.m147e(this, c0129d8);
                        }
                        ((C0678s3) qd0Var.f6471k).m4473c(c0129d8);
                        this.f2753k--;
                    }
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            a91 a91Var4 = c0129d8.f1576a;
            if (a91Var4 == null) {
                return;
            }
            if (a91Var4.f95u != 1 && c0129d8.f1577b < f6) {
                return;
            }
        }
        if (z) {
            return;
        }
        m2087h(c0129d8);
    }

    /* JADX INFO: renamed from: d */
    public final void m2083d(a91 a91Var, int i) {
        int i2 = a91Var.f86l;
        if (i2 == -1) {
            a91Var.m146d(this, i);
            for (int i3 = 0; i3 < this.f2745c + 1; i3++) {
                a91 a91Var2 = ((a91[]) this.f2755m.f6473m)[i3];
            }
            return;
        }
        if (i2 == -1) {
            C0129d8 c0129d8M2091l = m2091l();
            c0129d8M2091l.f1576a = a91Var;
            float f = i;
            a91Var.f88n = f;
            c0129d8M2091l.f1577b = f;
            c0129d8M2091l.f1580e = true;
            m2082c(c0129d8M2091l);
            return;
        }
        C0129d8 c0129d8 = this.f2749g[i2];
        if (c0129d8.f1580e) {
            c0129d8.f1577b = i;
            return;
        }
        if (c0129d8.f1579d.m5107d() == 0) {
            c0129d8.f1580e = true;
            c0129d8.f1577b = i;
            return;
        }
        C0129d8 c0129d8M2091l2 = m2091l();
        if (i < 0) {
            c0129d8M2091l2.f1577b = i * (-1);
            c0129d8M2091l2.f1579d.m5110g(a91Var, 1.0f);
        } else {
            c0129d8M2091l2.f1577b = i;
            c0129d8M2091l2.f1579d.m5110g(a91Var, -1.0f);
        }
        m2082c(c0129d8M2091l2);
    }

    /* JADX INFO: renamed from: e */
    public final void m2084e(a91 a91Var, a91 a91Var2, int i, int i2) {
        if (i2 == 8 && a91Var2.f89o && a91Var.f86l == -1) {
            a91Var.m146d(this, a91Var2.f88n + i);
            return;
        }
        C0129d8 c0129d8M2091l = m2091l();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            c0129d8M2091l.f1577b = i;
        }
        C0793v7 c0793v7 = c0129d8M2091l.f1579d;
        if (z) {
            c0793v7.m5110g(a91Var, 1.0f);
            c0129d8M2091l.f1579d.m5110g(a91Var2, -1.0f);
        } else {
            c0793v7.m5110g(a91Var, -1.0f);
            c0129d8M2091l.f1579d.m5110g(a91Var2, 1.0f);
        }
        if (i2 != 8) {
            c0129d8M2091l.m1130a(this, i2);
        }
        m2082c(c0129d8M2091l);
    }

    /* JADX INFO: renamed from: f */
    public final void m2085f(a91 a91Var, a91 a91Var2, int i, int i2) {
        C0129d8 c0129d8M2091l = m2091l();
        a91 a91VarM2092m = m2092m();
        a91VarM2092m.f87m = 0;
        c0129d8M2091l.m1131b(a91Var, a91Var2, a91VarM2092m, i);
        if (i2 != 8) {
            c0129d8M2091l.f1579d.m5110g(m2089j(i2), (int) (c0129d8M2091l.f1579d.m5106c(a91VarM2092m) * (-1.0f)));
        }
        m2082c(c0129d8M2091l);
    }

    /* JADX INFO: renamed from: g */
    public final void m2086g(a91 a91Var, a91 a91Var2, int i, int i2) {
        C0129d8 c0129d8M2091l = m2091l();
        a91 a91VarM2092m = m2092m();
        a91VarM2092m.f87m = 0;
        c0129d8M2091l.m1132c(a91Var, a91Var2, a91VarM2092m, i);
        if (i2 != 8) {
            c0129d8M2091l.f1579d.m5110g(m2089j(i2), (int) (c0129d8M2091l.f1579d.m5106c(a91VarM2092m) * (-1.0f)));
        }
        m2082c(c0129d8M2091l);
    }

    /* JADX INFO: renamed from: h */
    public final void m2087h(C0129d8 c0129d8) {
        int i;
        if (c0129d8.f1580e) {
            c0129d8.f1576a.m146d(this, c0129d8.f1577b);
        } else {
            C0129d8[] c0129d8Arr = this.f2749g;
            int i2 = this.f2753k;
            c0129d8Arr[i2] = c0129d8;
            a91 a91Var = c0129d8.f1576a;
            a91Var.f86l = i2;
            this.f2753k = i2 + 1;
            a91Var.m147e(this, c0129d8);
        }
        if (this.f2744b) {
            int i3 = 0;
            while (i3 < this.f2753k) {
                if (this.f2749g[i3] == null) {
                    System.out.println("WTF");
                }
                C0129d8 c0129d9 = this.f2749g[i3];
                if (c0129d9 != null && c0129d9.f1580e) {
                    c0129d9.f1576a.m146d(this, c0129d9.f1577b);
                    ((C0678s3) this.f2755m.f6471k).m4473c(c0129d9);
                    this.f2749g[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f2753k;
                        if (i4 >= i) {
                            break;
                        }
                        C0129d8[] c0129d8Arr2 = this.f2749g;
                        int i6 = i4 - 1;
                        C0129d8 c0129d10 = c0129d8Arr2[i4];
                        c0129d8Arr2[i6] = c0129d10;
                        a91 a91Var2 = c0129d10.f1576a;
                        if (a91Var2.f86l == i4) {
                            a91Var2.f86l = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f2749g[i5] = null;
                    }
                    this.f2753k = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f2744b = false;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2088i() {
        for (int i = 0; i < this.f2753k; i++) {
            C0129d8 c0129d8 = this.f2749g[i];
            c0129d8.f1576a.f88n = c0129d8.f1577b;
        }
    }

    /* JADX INFO: renamed from: j */
    public final a91 m2089j(int i) {
        if (this.f2752j + 1 >= this.f2748f) {
            m2093o();
        }
        a91 a91VarM2080a = m2080a(4);
        float[] fArr = a91VarM2080a.f91q;
        int i2 = this.f2745c + 1;
        this.f2745c = i2;
        this.f2752j++;
        a91VarM2080a.f85k = i2;
        a91VarM2080a.f87m = i;
        ((a91[]) this.f2755m.f6473m)[i2] = a91VarM2080a;
        fx0 fx0Var = this.f2746d;
        fx0Var.f2531i.f2313k = a91VarM2080a;
        Arrays.fill(fArr, 0.0f);
        fArr[a91VarM2080a.f87m] = 1.0f;
        fx0Var.m1896j(a91VarM2080a);
        return a91VarM2080a;
    }

    /* JADX INFO: renamed from: k */
    public final a91 m2090k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.f2752j + 1 >= this.f2748f) {
            m2093o();
        }
        if (!(obj instanceof C0585pl)) {
            return null;
        }
        C0585pl c0585pl = (C0585pl) obj;
        a91 a91Var = c0585pl.f6200i;
        if (a91Var == null) {
            c0585pl.m3961h();
            a91Var = c0585pl.f6200i;
        }
        int i = a91Var.f85k;
        qd0 qd0Var = this.f2755m;
        if (i != -1 && i <= this.f2745c && ((a91[]) qd0Var.f6473m)[i] != null) {
            return a91Var;
        }
        if (i != -1) {
            a91Var.m145c();
        }
        int i2 = this.f2745c + 1;
        this.f2745c = i2;
        this.f2752j++;
        a91Var.f85k = i2;
        a91Var.f95u = 1;
        ((a91[]) qd0Var.f6473m)[i2] = a91Var;
        return a91Var;
    }

    /* JADX INFO: renamed from: l */
    public final C0129d8 m2091l() {
        Object obj;
        qd0 qd0Var = this.f2755m;
        C0678s3 c0678s3 = (C0678s3) qd0Var.f6471k;
        int i = c0678s3.f7021j;
        if (i > 0) {
            int i2 = i - 1;
            Object[] objArr = (Object[]) c0678s3.f7022k;
            obj = objArr[i2];
            objArr[i2] = null;
            c0678s3.f7021j = i2;
        } else {
            obj = null;
        }
        C0129d8 c0129d8 = (C0129d8) obj;
        if (c0129d8 == null) {
            return new C0129d8(qd0Var);
        }
        c0129d8.f1576a = null;
        c0129d8.f1579d.m5105b();
        c0129d8.f1577b = 0.0f;
        c0129d8.f1580e = false;
        return c0129d8;
    }

    /* JADX INFO: renamed from: m */
    public final a91 m2092m() {
        if (this.f2752j + 1 >= this.f2748f) {
            m2093o();
        }
        a91 a91VarM2080a = m2080a(3);
        int i = this.f2745c + 1;
        this.f2745c = i;
        this.f2752j++;
        a91VarM2080a.f85k = i;
        ((a91[]) this.f2755m.f6473m)[i] = a91VarM2080a;
        return a91VarM2080a;
    }

    /* JADX INFO: renamed from: o */
    public final void m2093o() {
        int i = this.f2747e * 2;
        this.f2747e = i;
        this.f2749g = (C0129d8[]) Arrays.copyOf(this.f2749g, i);
        qd0 qd0Var = this.f2755m;
        qd0Var.f6473m = (a91[]) Arrays.copyOf((a91[]) qd0Var.f6473m, this.f2747e);
        int i2 = this.f2747e;
        this.f2751i = new boolean[i2];
        this.f2748f = i2;
        this.f2754l = i2;
    }

    /* JADX INFO: renamed from: p */
    public final void m2094p() {
        fx0 fx0Var = this.f2746d;
        if (fx0Var.mo1134e()) {
            m2088i();
            return;
        }
        if (!this.f2750h) {
            m2095q(fx0Var);
            return;
        }
        for (int i = 0; i < this.f2753k; i++) {
            if (!this.f2749g[i].f1580e) {
                m2095q(fx0Var);
                return;
            }
        }
        m2088i();
    }

    /* JADX INFO: renamed from: q */
    public final void m2095q(fx0 fx0Var) {
        for (int i = 0; i < this.f2753k; i++) {
            C0129d8 c0129d8 = this.f2749g[i];
            int i2 = 1;
            if (c0129d8.f1576a.f95u != 1) {
                float f = 0.0f;
                if (c0129d8.f1577b < 0.0f) {
                    boolean z = false;
                    int i3 = 0;
                    while (!z) {
                        i3 += i2;
                        float f2 = Float.MAX_VALUE;
                        int i4 = -1;
                        int i5 = -1;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < this.f2753k) {
                            C0129d8 c0129d9 = this.f2749g[i6];
                            if (c0129d9.f1576a.f95u != i2 && !c0129d9.f1580e && c0129d9.f1577b < f) {
                                int iM5107d = c0129d9.f1579d.m5107d();
                                int i8 = 0;
                                while (i8 < iM5107d) {
                                    a91 a91VarM5108e = c0129d9.f1579d.m5108e(i8);
                                    float fM5106c = c0129d9.f1579d.m5106c(a91VarM5108e);
                                    if (fM5106c > f) {
                                        for (int i9 = 0; i9 < 9; i9++) {
                                            float f3 = a91VarM5108e.f90p[i9] / fM5106c;
                                            if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                                i7 = i9;
                                                i5 = a91VarM5108e.f85k;
                                                i4 = i6;
                                                f2 = f3;
                                            }
                                        }
                                    }
                                    i8++;
                                    f = 0.0f;
                                }
                            }
                            i6++;
                            f = 0.0f;
                            i2 = 1;
                        }
                        if (i4 != -1) {
                            C0129d8 c0129d10 = this.f2749g[i4];
                            c0129d10.f1576a.f86l = -1;
                            c0129d10.m1136g(((a91[]) this.f2755m.f6473m)[i5]);
                            a91 a91Var = c0129d10.f1576a;
                            a91Var.f86l = i4;
                            a91Var.m147e(this, c0129d10);
                        } else {
                            z = true;
                        }
                        if (i3 > this.f2752j / 2) {
                            z = true;
                        }
                        f = 0.0f;
                        i2 = 1;
                    }
                    break;
                }
            }
        }
        m2096r(fx0Var);
        m2088i();
    }

    /* JADX INFO: renamed from: r */
    public final void m2096r(C0129d8 c0129d8) {
        boolean z;
        int i = 0;
        for (int i2 = 0; i2 < this.f2752j; i2++) {
            this.f2751i[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f2752j * 2) {
                return;
            }
            a91 a91Var = c0129d8.f1576a;
            if (a91Var != null) {
                this.f2751i[a91Var.f85k] = true;
            }
            a91 a91VarMo1133d = c0129d8.mo1133d(this.f2751i);
            if (a91VarMo1133d != null) {
                boolean[] zArr = this.f2751i;
                int i4 = a91VarMo1133d.f85k;
                if (zArr[i4]) {
                    return;
                } else {
                    zArr[i4] = true;
                }
            }
            if (a91VarMo1133d != null) {
                float f = Float.MAX_VALUE;
                int i5 = i;
                int i6 = -1;
                while (i5 < this.f2753k) {
                    C0129d8 c0129d9 = this.f2749g[i5];
                    if (c0129d9.f1576a.f95u != 1 && !c0129d9.f1580e) {
                        C0793v7 c0793v7 = c0129d9.f1579d;
                        int i7 = c0793v7.f8121h;
                        if (i7 == -1) {
                            z = false;
                            break;
                        }
                        int i8 = i;
                        while (true) {
                            if (i7 == -1 || i8 >= c0793v7.f8114a) {
                                z = false;
                                break;
                            } else if (c0793v7.f8118e[i7] == a91VarMo1133d.f85k) {
                                z = true;
                                break;
                            } else {
                                i7 = c0793v7.f8119f[i7];
                                i8++;
                            }
                        }
                        if (z) {
                            float fM5106c = c0129d9.f1579d.m5106c(a91VarMo1133d);
                            if (fM5106c < 0.0f) {
                                float f2 = (-c0129d9.f1577b) / fM5106c;
                                if (f2 < f) {
                                    i6 = i5;
                                    f = f2;
                                }
                            }
                        }
                    }
                    i5++;
                    i = 0;
                }
                if (i6 > -1) {
                    C0129d8 c0129d10 = this.f2749g[i6];
                    c0129d10.f1576a.f86l = -1;
                    c0129d10.m1136g(a91VarMo1133d);
                    a91 a91Var2 = c0129d10.f1576a;
                    a91Var2.f86l = i6;
                    a91Var2.m147e(this, c0129d10);
                }
            } else {
                z2 = true;
            }
            i = 0;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m2097s() {
        for (int i = 0; i < this.f2753k; i++) {
            C0129d8 c0129d8 = this.f2749g[i];
            if (c0129d8 != null) {
                ((C0678s3) this.f2755m.f6471k).m4473c(c0129d8);
            }
            this.f2749g[i] = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m2098t() {
        qd0 qd0Var;
        int i = 0;
        while (true) {
            qd0Var = this.f2755m;
            a91[] a91VarArr = (a91[]) qd0Var.f6473m;
            if (i >= a91VarArr.length) {
                break;
            }
            a91 a91Var = a91VarArr[i];
            if (a91Var != null) {
                a91Var.m145c();
            }
            i++;
        }
        C0678s3 c0678s3 = (C0678s3) qd0Var.f6472l;
        a91[] a91VarArr2 = this.f2756n;
        int length = this.f2757o;
        c0678s3.getClass();
        if (length > a91VarArr2.length) {
            length = a91VarArr2.length;
        }
        for (int i2 = 0; i2 < length; i2++) {
            a91 a91Var2 = a91VarArr2[i2];
            int i3 = c0678s3.f7021j;
            Object[] objArr = (Object[]) c0678s3.f7022k;
            if (i3 < objArr.length) {
                objArr[i3] = a91Var2;
                c0678s3.f7021j = i3 + 1;
            }
        }
        this.f2757o = 0;
        Arrays.fill((a91[]) qd0Var.f6473m, (Object) null);
        this.f2745c = 0;
        fx0 fx0Var = this.f2746d;
        fx0Var.f2530h = 0;
        fx0Var.f1577b = 0.0f;
        this.f2752j = 1;
        for (int i4 = 0; i4 < this.f2753k; i4++) {
            C0129d8 c0129d8 = this.f2749g[i4];
        }
        m2097s();
        this.f2753k = 0;
        this.f2758p = new C0129d8(qd0Var);
    }
}
