package androidx.core.content.res;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class l {

    /* renamed from: k, reason: collision with root package name */
    static final l f42112k;

    /* renamed from: a, reason: collision with root package name */
    private final float f42113a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42114b;

    /* renamed from: c, reason: collision with root package name */
    private final float f42115c;

    /* renamed from: d, reason: collision with root package name */
    private final float f42116d;

    /* renamed from: e, reason: collision with root package name */
    private final float f42117e;

    /* renamed from: f, reason: collision with root package name */
    private final float f42118f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f42119g;

    /* renamed from: h, reason: collision with root package name */
    private final float f42120h;

    /* renamed from: i, reason: collision with root package name */
    private final float f42121i;

    /* renamed from: j, reason: collision with root package name */
    private final float f42122j;

    static {
        float[] fArr = b.f42077c;
        float c11 = (float) ((b.c() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = b.f42075a;
        float f7 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f11 = fArr3[0] * f7;
        float f12 = fArr[1];
        float f13 = (fArr3[1] * f12) + f11;
        float f14 = fArr[2];
        float f15 = (fArr3[2] * f14) + f13;
        float[] fArr4 = fArr2[1];
        float f16 = (fArr4[2] * f14) + (fArr4[1] * f12) + (fArr4[0] * f7);
        float[] fArr5 = fArr2[2];
        float f17 = (f14 * fArr5[2]) + (f12 * fArr5[1]) + (f7 * fArr5[0]);
        float f18 = ((double) 1.0f) >= 0.9d ? 0.69f : 0.655f;
        float exp = (1.0f - (((float) Math.exp(((-c11) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d11 = exp;
        if (d11 > 1.0d) {
            exp = 1.0f;
        } else if (d11 < 0.0d) {
            exp = 0.0f;
        }
        float f19 = 1.0f / ((5.0f * c11) + 1.0f);
        float f21 = f19 * f19 * f19 * f19;
        float f22 = 1.0f - f21;
        float cbrt = (0.1f * f22 * f22 * ((float) Math.cbrt(c11 * 5.0d))) + (f21 * c11);
        float c12 = b.c() / fArr[1];
        double d12 = c12;
        float sqrt = ((float) Math.sqrt(d12)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d12, 0.2d));
        float[] fArr6 = {(float) Math.pow(((r9[0] * cbrt) * f15) / 100.0d, 0.42d), (float) Math.pow(((r9[1] * cbrt) * f16) / 100.0d, 0.42d), (float) Math.pow(((r9[2] * cbrt) * f17) / 100.0d, 0.42d)};
        float f23 = fArr6[0];
        float f24 = (f23 * 400.0f) / (f23 + 27.13f);
        float f25 = fArr6[1];
        float f26 = (f25 * 400.0f) / (f25 + 27.13f);
        float f27 = fArr6[2];
        float[] fArr7 = {f24, f26, (400.0f * f27) / (f27 + 27.13f)};
        f42112k = new l(c12, ((fArr7[2] * 0.05f) + (fArr7[0] * 2.0f) + fArr7[1]) * pow, pow, pow, f18, 1.0f, new float[]{(((100.0f / f15) * exp) + 1.0f) - exp, (((100.0f / f16) * exp) + 1.0f) - exp, (((100.0f / f17) * exp) + 1.0f) - exp}, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    private l(float f7, float f11, float f12, float f13, float f14, float f15, float[] fArr, float f16, float f17, float f18) {
        this.f42118f = f7;
        this.f42113a = f11;
        this.f42114b = f12;
        this.f42115c = f13;
        this.f42116d = f14;
        this.f42117e = f15;
        this.f42119g = fArr;
        this.f42120h = f16;
        this.f42121i = f17;
        this.f42122j = f18;
    }

    final float a() {
        return this.f42113a;
    }

    final float b() {
        return this.f42116d;
    }

    final float c() {
        return this.f42120h;
    }

    final float d() {
        return this.f42121i;
    }

    final float e() {
        return this.f42118f;
    }

    final float f() {
        return this.f42114b;
    }

    final float g() {
        return this.f42117e;
    }

    final float h() {
        return this.f42115c;
    }

    @NonNull
    final float[] i() {
        return this.f42119g;
    }

    final float j() {
        return this.f42122j;
    }
}
