package u;

/* loaded from: classes.dex */
public final class l implements k {

    /* renamed from: a, reason: collision with root package name */
    public float f16523a;

    /* renamed from: b, reason: collision with root package name */
    public float f16524b;

    /* renamed from: c, reason: collision with root package name */
    public float f16525c;

    /* renamed from: d, reason: collision with root package name */
    public float f16526d;

    /* renamed from: e, reason: collision with root package name */
    public float f16527e;

    /* renamed from: f, reason: collision with root package name */
    public float f16528f;

    /* renamed from: g, reason: collision with root package name */
    public float f16529g;

    /* renamed from: h, reason: collision with root package name */
    public float f16530h;

    /* renamed from: i, reason: collision with root package name */
    public float f16531i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16532k;

    /* renamed from: l, reason: collision with root package name */
    public float f16533l;

    /* renamed from: m, reason: collision with root package name */
    public float f16534m;

    @Override // u.k
    public final boolean a() {
        return b() < 1.0E-5f && Math.abs(this.f16531i - this.f16534m) < 1.0E-5f;
    }

    @Override // u.k
    public final float b() {
        return this.f16532k ? -c(this.f16534m) : c(this.f16534m);
    }

    public final float c(float f7) {
        float f8;
        float f9;
        float f10 = this.f16526d;
        if (f7 <= f10) {
            f8 = this.f16523a;
            f9 = this.f16524b;
        } else {
            int i7 = this.j;
            if (i7 == 1) {
                return 0.0f;
            }
            f7 -= f10;
            f10 = this.f16527e;
            if (f7 >= f10) {
                if (i7 == 2) {
                    return this.f16530h;
                }
                float f11 = f7 - f10;
                float f12 = this.f16528f;
                if (f11 >= f12) {
                    return this.f16531i;
                }
                float f13 = this.f16525c;
                return f13 - ((f11 * f13) / f12);
            }
            f8 = this.f16524b;
            f9 = this.f16525c;
        }
        return (((f9 - f8) * f7) / f10) + f8;
    }

    public final void d(float f7, float f8, float f9, float f10, float f11) {
        if (f7 == 0.0f) {
            f7 = 1.0E-4f;
        }
        this.f16523a = f7;
        float f12 = f7 / f9;
        float f13 = (f12 * f7) / 2.0f;
        if (f7 < 0.0f) {
            float sqrt = (float) Math.sqrt((f8 - ((((-f7) / f9) * f7) / 2.0f)) * f9);
            if (sqrt < f10) {
                this.j = 2;
                this.f16523a = f7;
                this.f16524b = sqrt;
                this.f16525c = 0.0f;
                float f14 = (sqrt - f7) / f9;
                this.f16526d = f14;
                this.f16527e = sqrt / f9;
                this.f16529g = ((f7 + sqrt) * f14) / 2.0f;
                this.f16530h = f8;
                this.f16531i = f8;
                return;
            }
            this.j = 3;
            this.f16523a = f7;
            this.f16524b = f10;
            this.f16525c = f10;
            float f15 = (f10 - f7) / f9;
            this.f16526d = f15;
            float f16 = f10 / f9;
            this.f16528f = f16;
            float f17 = ((f7 + f10) * f15) / 2.0f;
            float f18 = (f16 * f10) / 2.0f;
            this.f16527e = ((f8 - f17) - f18) / f10;
            this.f16529g = f17;
            this.f16530h = f8 - f18;
            this.f16531i = f8;
            return;
        }
        if (f13 >= f8) {
            this.j = 1;
            this.f16523a = f7;
            this.f16524b = 0.0f;
            this.f16529g = f8;
            this.f16526d = (2.0f * f8) / f7;
            return;
        }
        float f19 = f8 - f13;
        float f20 = f19 / f7;
        if (f20 + f12 < f11) {
            this.j = 2;
            this.f16523a = f7;
            this.f16524b = f7;
            this.f16525c = 0.0f;
            this.f16529g = f19;
            this.f16530h = f8;
            this.f16526d = f20;
            this.f16527e = f12;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f7 * f7) / 2.0f) + (f9 * f8));
        float f21 = (sqrt2 - f7) / f9;
        this.f16526d = f21;
        float f22 = sqrt2 / f9;
        this.f16527e = f22;
        if (sqrt2 < f10) {
            this.j = 2;
            this.f16523a = f7;
            this.f16524b = sqrt2;
            this.f16525c = 0.0f;
            this.f16526d = f21;
            this.f16527e = f22;
            this.f16529g = ((f7 + sqrt2) * f21) / 2.0f;
            this.f16530h = f8;
            return;
        }
        this.j = 3;
        this.f16523a = f7;
        this.f16524b = f10;
        this.f16525c = f10;
        float f23 = (f10 - f7) / f9;
        this.f16526d = f23;
        float f24 = f10 / f9;
        this.f16528f = f24;
        float f25 = ((f7 + f10) * f23) / 2.0f;
        float f26 = (f24 * f10) / 2.0f;
        this.f16527e = ((f8 - f25) - f26) / f10;
        this.f16529g = f25;
        this.f16530h = f8 - f26;
        this.f16531i = f8;
    }

    @Override // u.k
    public final float getInterpolation(float f7) {
        float f8;
        float f9 = this.f16526d;
        if (f7 <= f9) {
            float f10 = this.f16523a;
            f8 = ((((this.f16524b - f10) * f7) * f7) / (f9 * 2.0f)) + (f10 * f7);
        } else {
            int i7 = this.j;
            if (i7 == 1) {
                f8 = this.f16529g;
            } else {
                float f11 = f7 - f9;
                float f12 = this.f16527e;
                if (f11 < f12) {
                    float f13 = this.f16529g;
                    float f14 = this.f16524b;
                    f8 = ((((this.f16525c - f14) * f11) * f11) / (f12 * 2.0f)) + (f14 * f11) + f13;
                } else if (i7 == 2) {
                    f8 = this.f16530h;
                } else {
                    float f15 = f11 - f12;
                    float f16 = this.f16528f;
                    if (f15 <= f16) {
                        float f17 = this.f16530h;
                        float f18 = this.f16525c * f15;
                        f8 = (f17 + f18) - ((f18 * f15) / (f16 * 2.0f));
                    } else {
                        f8 = this.f16531i;
                    }
                }
            }
        }
        this.f16534m = f7;
        return this.f16532k ? this.f16533l - f8 : this.f16533l + f8;
    }
}
