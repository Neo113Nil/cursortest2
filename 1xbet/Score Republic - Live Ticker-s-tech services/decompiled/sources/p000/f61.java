package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f61 {

    /* JADX INFO: renamed from: a */
    public final byte[] f2319a;

    /* JADX INFO: renamed from: b */
    public int f2320b;

    /* JADX INFO: renamed from: c */
    public int f2321c;

    /* JADX INFO: renamed from: d */
    public boolean f2322d;

    /* JADX INFO: renamed from: e */
    public final boolean f2323e;

    /* JADX INFO: renamed from: f */
    public f61 f2324f;

    /* JADX INFO: renamed from: g */
    public f61 f2325g;

    public f61(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.f2319a = bArr;
        this.f2320b = i;
        this.f2321c = i2;
        this.f2322d = z;
        this.f2323e = false;
    }

    /* JADX INFO: renamed from: a */
    public final f61 m1642a() {
        f61 f61Var = this.f2324f;
        if (f61Var == this) {
            f61Var = null;
        }
        f61 f61Var2 = this.f2325g;
        f61Var2.getClass();
        f61Var2.f2324f = this.f2324f;
        f61 f61Var3 = this.f2324f;
        f61Var3.getClass();
        f61Var3.f2325g = this.f2325g;
        this.f2324f = null;
        this.f2325g = null;
        return f61Var;
    }

    /* JADX INFO: renamed from: b */
    public final void m1643b(f61 f61Var) {
        f61Var.getClass();
        f61Var.f2325g = this;
        f61Var.f2324f = this.f2324f;
        f61 f61Var2 = this.f2324f;
        f61Var2.getClass();
        f61Var2.f2325g = f61Var;
        this.f2324f = f61Var;
    }

    /* JADX INFO: renamed from: c */
    public final f61 m1644c() {
        this.f2322d = true;
        return new f61(this.f2319a, this.f2320b, this.f2321c, true);
    }

    /* JADX INFO: renamed from: d */
    public final void m1645d(f61 f61Var, int i) {
        f61Var.getClass();
        byte[] bArr = f61Var.f2319a;
        if (!f61Var.f2323e) {
            C0270h1.m2191g("only owner can write");
            return;
        }
        int i2 = f61Var.f2321c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (f61Var.f2322d) {
                throw new IllegalArgumentException();
            }
            int i4 = f61Var.f2320b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC0202f8.m1742s(0, i4, i2, bArr, bArr);
            f61Var.f2321c -= f61Var.f2320b;
            f61Var.f2320b = 0;
        }
        int i5 = f61Var.f2321c;
        int i6 = this.f2320b;
        AbstractC0202f8.m1742s(i5, i6, i6 + i, this.f2319a, bArr);
        f61Var.f2321c += i;
        this.f2320b += i;
    }

    public f61() {
        this.f2319a = new byte[8192];
        this.f2323e = true;
        this.f2322d = false;
    }
}
