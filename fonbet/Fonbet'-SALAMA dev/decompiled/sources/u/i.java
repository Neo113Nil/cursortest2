package u;

/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a, reason: collision with root package name */
    public double f16513a;

    /* renamed from: b, reason: collision with root package name */
    public double f16514b;

    /* renamed from: c, reason: collision with root package name */
    public double f16515c;

    /* renamed from: d, reason: collision with root package name */
    public float f16516d;

    /* renamed from: e, reason: collision with root package name */
    public float f16517e;

    /* renamed from: f, reason: collision with root package name */
    public float f16518f;

    /* renamed from: g, reason: collision with root package name */
    public float f16519g;

    /* renamed from: h, reason: collision with root package name */
    public float f16520h;

    /* renamed from: i, reason: collision with root package name */
    public int f16521i;

    @Override // u.k
    public final boolean a() {
        double d7 = this.f16517e - this.f16515c;
        double d8 = this.f16514b;
        double d9 = this.f16518f;
        return Math.sqrt((((d8 * d7) * d7) + ((d9 * d9) * ((double) this.f16519g))) / d8) <= ((double) this.f16520h);
    }

    @Override // u.k
    public final float b() {
        return 0.0f;
    }

    @Override // u.k
    public final float getInterpolation(float f7) {
        i iVar = this;
        float f8 = f7;
        double d7 = f8 - iVar.f16516d;
        double d8 = iVar.f16514b;
        double d9 = iVar.f16513a;
        int sqrt = (int) ((9.0d / ((Math.sqrt(d8 / iVar.f16519g) * d7) * 4.0d)) + 1.0d);
        double d10 = d7 / sqrt;
        int i7 = 0;
        while (i7 < sqrt) {
            double d11 = iVar.f16517e;
            double d12 = iVar.f16515c;
            int i8 = sqrt;
            int i9 = i7;
            double d13 = iVar.f16518f;
            double d14 = iVar.f16519g;
            double d15 = ((((((-d8) * (d11 - d12)) - (d9 * d13)) / d14) * d10) / 2.0d) + d13;
            double d16 = ((((-((((d10 * d15) / 2.0d) + d11) - d12)) * d8) - (d15 * d9)) / d14) * d10;
            float f9 = (float) (d13 + d16);
            this.f16518f = f9;
            float f10 = (float) ((((d16 / 2.0d) + d13) * d10) + d11);
            this.f16517e = f10;
            int i10 = this.f16521i;
            if (i10 > 0) {
                if (f10 < 0.0f && (i10 & 1) == 1) {
                    this.f16517e = -f10;
                    this.f16518f = -f9;
                }
                float f11 = this.f16517e;
                if (f11 > 1.0f && (i10 & 2) == 2) {
                    this.f16517e = 2.0f - f11;
                    this.f16518f = -this.f16518f;
                }
            }
            f8 = f7;
            sqrt = i8;
            i7 = i9 + 1;
            iVar = this;
        }
        i iVar2 = iVar;
        iVar2.f16516d = f8;
        return iVar2.f16517e;
    }
}
