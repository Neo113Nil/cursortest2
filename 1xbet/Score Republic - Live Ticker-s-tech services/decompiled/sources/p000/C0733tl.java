package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: tl */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0733tl extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public int f7461A;

    /* JADX INFO: renamed from: B */
    public int f7462B;

    /* JADX INFO: renamed from: C */
    public int f7463C;

    /* JADX INFO: renamed from: D */
    public int f7464D;

    /* JADX INFO: renamed from: E */
    public float f7465E;

    /* JADX INFO: renamed from: F */
    public float f7466F;

    /* JADX INFO: renamed from: G */
    public String f7467G;

    /* JADX INFO: renamed from: H */
    public float f7468H;

    /* JADX INFO: renamed from: I */
    public float f7469I;

    /* JADX INFO: renamed from: J */
    public int f7470J;

    /* JADX INFO: renamed from: K */
    public int f7471K;

    /* JADX INFO: renamed from: L */
    public int f7472L;

    /* JADX INFO: renamed from: M */
    public int f7473M;

    /* JADX INFO: renamed from: N */
    public int f7474N;

    /* JADX INFO: renamed from: O */
    public int f7475O;

    /* JADX INFO: renamed from: P */
    public int f7476P;

    /* JADX INFO: renamed from: Q */
    public int f7477Q;

    /* JADX INFO: renamed from: R */
    public float f7478R;

    /* JADX INFO: renamed from: S */
    public float f7479S;

    /* JADX INFO: renamed from: T */
    public int f7480T;

    /* JADX INFO: renamed from: U */
    public int f7481U;

    /* JADX INFO: renamed from: V */
    public int f7482V;

    /* JADX INFO: renamed from: W */
    public boolean f7483W;

    /* JADX INFO: renamed from: X */
    public boolean f7484X;

    /* JADX INFO: renamed from: Y */
    public String f7485Y;

    /* JADX INFO: renamed from: Z */
    public int f7486Z;

    /* JADX INFO: renamed from: a */
    public int f7487a;

    /* JADX INFO: renamed from: a0 */
    public boolean f7488a0;

    /* JADX INFO: renamed from: b */
    public int f7489b;

    /* JADX INFO: renamed from: b0 */
    public boolean f7490b0;

    /* JADX INFO: renamed from: c */
    public float f7491c;

    /* JADX INFO: renamed from: c0 */
    public boolean f7492c0;

    /* JADX INFO: renamed from: d */
    public boolean f7493d;

    /* JADX INFO: renamed from: d0 */
    public boolean f7494d0;

    /* JADX INFO: renamed from: e */
    public int f7495e;

    /* JADX INFO: renamed from: e0 */
    public boolean f7496e0;

    /* JADX INFO: renamed from: f */
    public int f7497f;

    /* JADX INFO: renamed from: f0 */
    public int f7498f0;

    /* JADX INFO: renamed from: g */
    public int f7499g;

    /* JADX INFO: renamed from: g0 */
    public int f7500g0;

    /* JADX INFO: renamed from: h */
    public int f7501h;

    /* JADX INFO: renamed from: h0 */
    public int f7502h0;

    /* JADX INFO: renamed from: i */
    public int f7503i;

    /* JADX INFO: renamed from: i0 */
    public int f7504i0;

    /* JADX INFO: renamed from: j */
    public int f7505j;

    /* JADX INFO: renamed from: j0 */
    public int f7506j0;

    /* JADX INFO: renamed from: k */
    public int f7507k;

    /* JADX INFO: renamed from: k0 */
    public int f7508k0;

    /* JADX INFO: renamed from: l */
    public int f7509l;

    /* JADX INFO: renamed from: l0 */
    public float f7510l0;

    /* JADX INFO: renamed from: m */
    public int f7511m;

    /* JADX INFO: renamed from: m0 */
    public int f7512m0;

    /* JADX INFO: renamed from: n */
    public int f7513n;

    /* JADX INFO: renamed from: n0 */
    public int f7514n0;

    /* JADX INFO: renamed from: o */
    public int f7515o;

    /* JADX INFO: renamed from: o0 */
    public float f7516o0;

    /* JADX INFO: renamed from: p */
    public int f7517p;

    /* JADX INFO: renamed from: p0 */
    public C0143dm f7518p0;

    /* JADX INFO: renamed from: q */
    public int f7519q;

    /* JADX INFO: renamed from: r */
    public float f7520r;

    /* JADX INFO: renamed from: s */
    public int f7521s;

    /* JADX INFO: renamed from: t */
    public int f7522t;

    /* JADX INFO: renamed from: u */
    public int f7523u;

    /* JADX INFO: renamed from: v */
    public int f7524v;

    /* JADX INFO: renamed from: w */
    public int f7525w;

    /* JADX INFO: renamed from: x */
    public int f7526x;

    /* JADX INFO: renamed from: y */
    public int f7527y;

    /* JADX INFO: renamed from: z */
    public int f7528z;

    /* JADX INFO: renamed from: a */
    public final void m4793a() {
        this.f7494d0 = false;
        this.f7488a0 = true;
        this.f7490b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f7483W) {
            this.f7488a0 = false;
            if (this.f7472L == 0) {
                this.f7472L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f7484X) {
            this.f7490b0 = false;
            if (this.f7473M == 0) {
                this.f7473M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f7488a0 = false;
            if (i == 0 && this.f7472L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f7483W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f7490b0 = false;
            if (i2 == 0 && this.f7473M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f7484X = true;
            }
        }
        if (this.f7491c == -1.0f && this.f7487a == -1 && this.f7489b == -1) {
            return;
        }
        this.f7494d0 = true;
        this.f7488a0 = true;
        this.f7490b0 = true;
        if (!(this.f7518p0 instanceof ea0)) {
            this.f7518p0 = new ea0();
        }
        ((ea0) this.f7518p0).m1398O(this.f7482V);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f7502h0 = -1;
        this.f7504i0 = -1;
        this.f7498f0 = -1;
        this.f7500g0 = -1;
        this.f7506j0 = this.f7525w;
        this.f7508k0 = this.f7527y;
        float f = this.f7465E;
        this.f7510l0 = f;
        int i8 = this.f7487a;
        this.f7512m0 = i8;
        int i9 = this.f7489b;
        this.f7514n0 = i9;
        float f2 = this.f7491c;
        this.f7516o0 = f2;
        int i10 = this.f7521s;
        if (z2) {
            if (i10 != -1) {
                this.f7502h0 = i10;
            } else {
                int i11 = this.f7522t;
                if (i11 != -1) {
                    this.f7504i0 = i11;
                } else {
                    i2 = this.f7523u;
                    if (i2 != -1) {
                        this.f7500g0 = i2;
                        z = true;
                    }
                    i3 = this.f7524v;
                    if (i3 != -1) {
                        this.f7498f0 = i3;
                        z = true;
                    }
                    i4 = this.f7461A;
                    if (i4 != Integer.MIN_VALUE) {
                        this.f7508k0 = i4;
                    }
                    i5 = this.f7462B;
                    if (i5 != Integer.MIN_VALUE) {
                        this.f7506j0 = i5;
                    }
                    if (z) {
                        this.f7510l0 = 1.0f - f;
                    }
                    if (this.f7494d0 && this.f7482V == 1 && this.f7493d) {
                        if (f2 != -1.0f) {
                            this.f7516o0 = 1.0f - f2;
                            this.f7512m0 = -1;
                            this.f7514n0 = -1;
                        } else if (i8 != -1) {
                            this.f7514n0 = i8;
                            this.f7512m0 = -1;
                            this.f7516o0 = -1.0f;
                        } else if (i9 != -1) {
                            this.f7512m0 = i9;
                            this.f7514n0 = -1;
                            this.f7516o0 = -1.0f;
                        }
                    }
                }
            }
            z = true;
            i2 = this.f7523u;
            if (i2 != -1) {
                this.f7500g0 = i2;
                z = true;
            }
            i3 = this.f7524v;
            if (i3 != -1) {
                this.f7498f0 = i3;
                z = true;
            }
            i4 = this.f7461A;
            if (i4 != Integer.MIN_VALUE) {
                this.f7508k0 = i4;
            }
            i5 = this.f7462B;
            if (i5 != Integer.MIN_VALUE) {
                this.f7506j0 = i5;
            }
            if (z) {
                this.f7510l0 = 1.0f - f;
            }
            if (this.f7494d0) {
                if (f2 != -1.0f) {
                    this.f7516o0 = 1.0f - f2;
                    this.f7512m0 = -1;
                    this.f7514n0 = -1;
                } else if (i8 != -1) {
                    this.f7514n0 = i8;
                    this.f7512m0 = -1;
                    this.f7516o0 = -1.0f;
                } else if (i9 != -1) {
                    this.f7512m0 = i9;
                    this.f7514n0 = -1;
                    this.f7516o0 = -1.0f;
                }
            }
        } else {
            if (i10 != -1) {
                this.f7500g0 = i10;
            }
            int i12 = this.f7522t;
            if (i12 != -1) {
                this.f7498f0 = i12;
            }
            int i13 = this.f7523u;
            if (i13 != -1) {
                this.f7502h0 = i13;
            }
            int i14 = this.f7524v;
            if (i14 != -1) {
                this.f7504i0 = i14;
            }
            int i15 = this.f7461A;
            if (i15 != Integer.MIN_VALUE) {
                this.f7506j0 = i15;
            }
            int i16 = this.f7462B;
            if (i16 != Integer.MIN_VALUE) {
                this.f7508k0 = i16;
            }
        }
        if (this.f7523u == -1 && this.f7524v == -1 && this.f7522t == -1 && i10 == -1) {
            int i17 = this.f7499g;
            if (i17 != -1) {
                this.f7502h0 = i17;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i18 = this.f7501h;
                if (i18 != -1) {
                    this.f7504i0 = i18;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i19 = this.f7495e;
            if (i19 != -1) {
                this.f7498f0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i20 = this.f7497f;
            if (i20 != -1) {
                this.f7500g0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
