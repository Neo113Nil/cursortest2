package f1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: k, reason: collision with root package name */
    public static final k f16964k;

    /* renamed from: a, reason: collision with root package name */
    public final float f16965a;

    /* renamed from: b, reason: collision with root package name */
    public final float f16966b;

    /* renamed from: c, reason: collision with root package name */
    public final float f16967c;

    /* renamed from: d, reason: collision with root package name */
    public final float f16968d;

    /* renamed from: e, reason: collision with root package name */
    public final float f16969e;
    public final float f;

    /* renamed from: g, reason: collision with root package name */
    public final float[] f16970g;

    /* renamed from: h, reason: collision with root package name */
    public final float f16971h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final float f16972j;

    static {
        float[] fArr = AbstractC1940b.f16943c;
        float j5 = (float) ((AbstractC1940b.j() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = AbstractC1940b.f16941a;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f5 = fArr3[0] * f;
        float f6 = fArr[1];
        float f7 = (fArr3[1] * f6) + f5;
        float f8 = fArr[2];
        float f9 = (fArr3[2] * f8) + f7;
        float[] fArr4 = fArr2[1];
        float f10 = (fArr4[2] * f8) + (fArr4[1] * f6) + (fArr4[0] * f);
        float[] fArr5 = fArr2[2];
        float f11 = (f8 * fArr5[2]) + (f6 * fArr5[1]) + (f * fArr5[0]);
        float f12 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-j5) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d5 = exp;
        if (d5 > 1.0d) {
            exp = 1.0f;
        } else if (d5 < 0.0d) {
            exp = 0.0f;
        }
        float f13 = 1.0f / ((5.0f * j5) + 1.0f);
        float f14 = f13 * f13 * f13 * f13;
        float f15 = 1.0f - f14;
        float cbrt = (0.1f * f15 * f15 * ((float) Math.cbrt(j5 * 5.0d))) + (f14 * j5);
        float j6 = AbstractC1940b.j() / fArr[1];
        double d6 = j6;
        float sqrt = ((float) Math.sqrt(d6)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d6, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * cbrt) * f9) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * cbrt) * f10) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * cbrt) * f11) / 100.0d, 0.42d)};
        float f16 = fArr6[0];
        float f17 = (f16 * 400.0f) / (f16 + 27.13f);
        float f18 = fArr6[1];
        float f19 = (f18 * 400.0f) / (f18 + 27.13f);
        float f20 = fArr6[2];
        float[] fArr7 = {f17, f19, (400.0f * f20) / (f20 + 27.13f)};
        f16964k = new k(j6, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f12, 1.0f, new float[]{(((100.0f / f9) * exp) + 1.0f) - exp, (((100.0f / f10) * exp) + 1.0f) - exp, (((100.0f / f11) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public k(float f, float f5, float f6, float f7, float f8, float f9, float[] fArr, float f10, float f11, float f12) {
        this.f = f;
        this.f16965a = f5;
        this.f16966b = f6;
        this.f16967c = f7;
        this.f16968d = f8;
        this.f16969e = f9;
        this.f16970g = fArr;
        this.f16971h = f10;
        this.i = f11;
        this.f16972j = f12;
    }
}
