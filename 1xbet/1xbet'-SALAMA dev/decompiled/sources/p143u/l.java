package p143u;

/* JADX INFO: loaded from: classes.dex */
public final class l implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f16529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f16531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f16537i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f16538k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f16539l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f16540m;

    @Override // p143u.k
    public final boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f16537i - this.f16540m) < 1.0E-5f;
    }

    @Override // p143u.k
    public final float b() {
        return this.f16538k ? -c(this.f16540m) : c(this.f16540m);
    }

    public final float c(float f7) {
        float f8;
        float f9;
        float f10 = this.f16532d;
        if (f7 <= f10) {
            f8 = this.f16529a;
            f9 = this.f16530b;
        } else {
            int i7 = this.j;
            if (i7 == 1) {
                return 0.0f;
            }
            f7 -= f10;
            f10 = this.f16533e;
            if (f7 >= f10) {
                if (i7 == 2) {
                    return this.f16536h;
                }
                float f11 = f7 - f10;
                float f12 = this.f16534f;
                if (f11 >= f12) {
                    return this.f16537i;
                }
                float f13 = this.f16531c;
                return f13 - ((f11 * f13) / f12);
            }
            f8 = this.f16530b;
            f9 = this.f16531c;
        }
        return (((f9 - f8) * f7) / f10) + f8;
    }

    public final void d(float f7, float f8, float f9, float f10, float f11) {
        if (f7 == 0.0f) {
            f7 = 1.0E-4f;
        }
        this.f16529a = f7;
        float f12 = f7 / f9;
        float f13 = (f12 * f7) / 2.0f;
        if (f7 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f8 - ((((-f7) / f9) * f7) / 2.0f)) * f9);
            if (fSqrt < f10) {
                this.j = 2;
                this.f16529a = f7;
                this.f16530b = fSqrt;
                this.f16531c = 0.0f;
                float f14 = (fSqrt - f7) / f9;
                this.f16532d = f14;
                this.f16533e = fSqrt / f9;
                this.f16535g = ((f7 + fSqrt) * f14) / 2.0f;
                this.f16536h = f8;
                this.f16537i = f8;
                return;
            }
            this.j = 3;
            this.f16529a = f7;
            this.f16530b = f10;
            this.f16531c = f10;
            float f15 = (f10 - f7) / f9;
            this.f16532d = f15;
            float f16 = f10 / f9;
            this.f16534f = f16;
            float f17 = ((f7 + f10) * f15) / 2.0f;
            float f18 = (f16 * f10) / 2.0f;
            this.f16533e = ((f8 - f17) - f18) / f10;
            this.f16535g = f17;
            this.f16536h = f8 - f18;
            this.f16537i = f8;
            return;
        }
        if (f13 >= f8) {
            this.j = 1;
            this.f16529a = f7;
            this.f16530b = 0.0f;
            this.f16535g = f8;
            this.f16532d = (2.0f * f8) / f7;
            return;
        }
        float f19 = f8 - f13;
        float f20 = f19 / f7;
        if (f20 + f12 < f11) {
            this.j = 2;
            this.f16529a = f7;
            this.f16530b = f7;
            this.f16531c = 0.0f;
            this.f16535g = f19;
            this.f16536h = f8;
            this.f16532d = f20;
            this.f16533e = f12;
            return;
        }
        float fSqrt2 = (float) Math.sqrt(((f7 * f7) / 2.0f) + (f9 * f8));
        float f21 = (fSqrt2 - f7) / f9;
        this.f16532d = f21;
        float f22 = fSqrt2 / f9;
        this.f16533e = f22;
        if (fSqrt2 < f10) {
            this.j = 2;
            this.f16529a = f7;
            this.f16530b = fSqrt2;
            this.f16531c = 0.0f;
            this.f16532d = f21;
            this.f16533e = f22;
            this.f16535g = ((f7 + fSqrt2) * f21) / 2.0f;
            this.f16536h = f8;
            return;
        }
        this.j = 3;
        this.f16529a = f7;
        this.f16530b = f10;
        this.f16531c = f10;
        float f23 = (f10 - f7) / f9;
        this.f16532d = f23;
        float f24 = f10 / f9;
        this.f16534f = f24;
        float f25 = ((f7 + f10) * f23) / 2.0f;
        float f26 = (f24 * f10) / 2.0f;
        this.f16533e = ((f8 - f25) - f26) / f10;
        this.f16535g = f25;
        this.f16536h = f8 - f26;
        this.f16537i = f8;
    }

    @Override // p143u.k
    public final float getInterpolation(float f7) {
        float f8;
        float f9 = this.f16532d;
        if (f7 <= f9) {
            float f10 = this.f16529a;
            f8 = ((((this.f16530b - f10) * f7) * f7) / (f9 * 2.0f)) + (f10 * f7);
        } else {
            int i7 = this.j;
            if (i7 == 1) {
                f8 = this.f16535g;
            } else {
                float f11 = f7 - f9;
                float f12 = this.f16533e;
                if (f11 < f12) {
                    float f13 = this.f16535g;
                    float f14 = this.f16530b;
                    f8 = ((((this.f16531c - f14) * f11) * f11) / (f12 * 2.0f)) + (f14 * f11) + f13;
                } else if (i7 == 2) {
                    f8 = this.f16536h;
                } else {
                    float f15 = f11 - f12;
                    float f16 = this.f16534f;
                    if (f15 <= f16) {
                        float f17 = this.f16536h;
                        float f18 = this.f16531c * f15;
                        f8 = (f17 + f18) - ((f18 * f15) / (f16 * 2.0f));
                    } else {
                        f8 = this.f16537i;
                    }
                }
            }
        }
        this.f16540m = f7;
        return this.f16538k ? this.f16539l - f8 : this.f16539l + f8;
    }
}
