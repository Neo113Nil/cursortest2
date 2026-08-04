package p143u;

/* JADX INFO: loaded from: classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f16519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f16520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f16521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16523e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16524f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16525g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f16526h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f16527i;

    @Override // p143u.k
    public final boolean a() {
        double d7 = ((double) this.f16523e) - this.f16521c;
        double d8 = this.f16520b;
        double d9 = this.f16524f;
        return Math.sqrt((((d8 * d7) * d7) + ((d9 * d9) * ((double) this.f16525g))) / d8) <= ((double) this.f16526h);
    }

    @Override // p143u.k
    public final float b() {
        return 0.0f;
    }

    @Override // p143u.k
    public final float getInterpolation(float f7) {
        i iVar = this;
        float f8 = f7;
        double d7 = f8 - iVar.f16522d;
        double d8 = iVar.f16520b;
        double d9 = iVar.f16519a;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d8 / ((double) iVar.f16525g)) * d7) * 4.0d)) + 1.0d);
        double d10 = d7 / ((double) iSqrt);
        int i7 = 0;
        while (i7 < iSqrt) {
            double d11 = iVar.f16523e;
            double d12 = iVar.f16521c;
            int i8 = iSqrt;
            int i9 = i7;
            double d13 = iVar.f16524f;
            double d14 = iVar.f16525g;
            double d15 = ((((((-d8) * (d11 - d12)) - (d9 * d13)) / d14) * d10) / 2.0d) + d13;
            double d16 = ((((-((((d10 * d15) / 2.0d) + d11) - d12)) * d8) - (d15 * d9)) / d14) * d10;
            float f9 = (float) (d13 + d16);
            this.f16524f = f9;
            float f10 = (float) ((((d16 / 2.0d) + d13) * d10) + d11);
            this.f16523e = f10;
            int i10 = this.f16527i;
            if (i10 > 0) {
                if (f10 < 0.0f && (i10 & 1) == 1) {
                    this.f16523e = -f10;
                    this.f16524f = -f9;
                }
                float f11 = this.f16523e;
                if (f11 > 1.0f && (i10 & 2) == 2) {
                    this.f16523e = 2.0f - f11;
                    this.f16524f = -this.f16524f;
                }
            }
            f8 = f7;
            iSqrt = i8;
            i7 = i9 + 1;
            iVar = this;
        }
        i iVar2 = iVar;
        iVar2.f16522d = f8;
        return iVar2.f16523e;
    }
}
