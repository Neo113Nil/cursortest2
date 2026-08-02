package androidx.core.content.res;

import android.graphics.Color;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final float f42069a;

    /* renamed from: b, reason: collision with root package name */
    private final float f42070b;

    /* renamed from: c, reason: collision with root package name */
    private final float f42071c;

    /* renamed from: d, reason: collision with root package name */
    private final float f42072d;

    /* renamed from: e, reason: collision with root package name */
    private final float f42073e;

    /* renamed from: f, reason: collision with root package name */
    private final float f42074f;

    a(float f7, float f11, float f12, float f13, float f14, float f15) {
        this.f42069a = f7;
        this.f42070b = f11;
        this.f42071c = f12;
        this.f42072d = f13;
        this.f42073e = f14;
        this.f42074f = f15;
    }

    @NonNull
    static a a(int i11) {
        l lVar = l.f42112k;
        float b11 = b.b(Color.red(i11));
        float b12 = b.b(Color.green(i11));
        float b13 = b.b(Color.blue(i11));
        float[][] fArr = b.f42078d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * b13) + (fArr2[1] * b12) + (fArr2[0] * b11);
        float[] fArr3 = fArr[1];
        float f11 = (fArr3[2] * b13) + (fArr3[1] * b12) + (fArr3[0] * b11);
        float[] fArr4 = fArr[2];
        float f12 = (b13 * fArr4[2]) + (b12 * fArr4[1]) + (b11 * fArr4[0]);
        float[][] fArr5 = b.f42075a;
        float[] fArr6 = fArr5[0];
        float f13 = (fArr6[2] * f12) + (fArr6[1] * f11) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f14 = (fArr7[2] * f12) + (fArr7[1] * f11) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f15 = (f12 * fArr8[2]) + (f11 * fArr8[1]) + (f7 * fArr8[0]);
        float f16 = lVar.i()[0] * f13;
        float f17 = lVar.i()[1] * f14;
        float f18 = lVar.i()[2] * f15;
        float pow = (float) Math.pow((Math.abs(f16) * lVar.c()) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f17) * lVar.c()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f18) * lVar.c()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f16) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f17) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f18) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d11 = signum3;
        float f19 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d11)) / 11.0f;
        float f21 = ((float) ((signum + signum2) - (d11 * 2.0d))) / 9.0f;
        float f22 = signum2 * 20.0f;
        float f23 = ((21.0f * signum3) + ((signum * 20.0f) + f22)) / 20.0f;
        float f24 = (((signum * 40.0f) + f22) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f21, f19)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f25 = atan2;
        float f26 = (3.1415927f * f25) / 180.0f;
        float pow4 = ((float) Math.pow((f24 * lVar.f()) / lVar.a(), lVar.b() * lVar.j())) * 100.0f;
        Math.sqrt(pow4 / 100.0f);
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f25) < 20.14d ? 360.0f + f25 : f25) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * lVar.g()) * lVar.h()) * ((float) Math.sqrt((f21 * f21) + (f19 * f19)))) / (f23 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d12 = lVar.d() * pow5;
        Math.sqrt((r3 * lVar.b()) / (lVar.a() + 4.0f));
        float f27 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((d12 * 0.0228f) + 1.0f)) * 43.85965f;
        double d13 = f26;
        return new a(f25, pow5, pow4, f27, log * ((float) Math.cos(d13)), log * ((float) Math.sin(d13)));
    }

    @NonNull
    private static a b(float f7, float f11, float f12) {
        l lVar = l.f42112k;
        lVar.b();
        Math.sqrt(f7 / 100.0d);
        float d11 = lVar.d() * f11;
        Math.sqrt(((f11 / ((float) Math.sqrt(r1))) * lVar.b()) / (lVar.a() + 4.0f));
        float f13 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float log = ((float) Math.log((d11 * 0.0228d) + 1.0d)) * 43.85965f;
        double d12 = (3.1415927f * f12) / 180.0f;
        return new a(f12, f11, f7, f13, log * ((float) Math.cos(d12)), log * ((float) Math.sin(d12)));
    }

    public static int e(float f7, float f11, float f12) {
        float f13;
        float f14;
        float f15;
        float f16;
        float cbrt;
        float f17;
        float f18;
        l lVar = l.f42112k;
        float f19 = f11;
        if (f19 < 1.0d || Math.round(f12) <= 0.0d || Math.round(f12) >= 100.0d) {
            return b.a(f12);
        }
        float f21 = 0.0f;
        float min = f7 < 0.0f ? 0.0f : Math.min(360.0f, f7);
        float f22 = f19;
        float f23 = 0.0f;
        a aVar = null;
        boolean z11 = true;
        while (Math.abs(f23 - f19) >= 0.4f) {
            float f24 = 100.0f;
            float f25 = 1000.0f;
            float f26 = f21;
            float f27 = 100.0f;
            float f28 = 1000.0f;
            a aVar2 = null;
            while (true) {
                if (Math.abs(f26 - f27) <= 0.01f) {
                    f13 = min;
                    f14 = f19;
                    f15 = f21;
                    break;
                }
                f15 = f21;
                float f29 = ((f27 - f26) / 2.0f) + f26;
                int f31 = b(f29, f22, min).f(l.f42112k);
                float b11 = b.b(Color.red(f31));
                float b12 = b.b(Color.green(f31));
                float b13 = b.b(Color.blue(f31));
                float[] fArr = b.f42078d[1];
                float f32 = ((b13 * fArr[2]) + ((b12 * fArr[1]) + (b11 * fArr[0]))) / f24;
                if (f32 <= 0.008856452f) {
                    cbrt = f32 * 903.2963f;
                    f16 = f25;
                } else {
                    f16 = f25;
                    cbrt = (((float) Math.cbrt(f32)) * 116.0f) - 16.0f;
                }
                float abs = Math.abs(f12 - cbrt);
                if (abs < 0.2f) {
                    a a11 = a(f31);
                    f14 = f19;
                    a b14 = b(a11.f42071c, a11.f42070b, min);
                    f13 = min;
                    float f33 = a11.f42072d - b14.f42072d;
                    float f34 = a11.f42073e - b14.f42073e;
                    float f35 = a11.f42074f - b14.f42074f;
                    float f36 = (f35 * f35) + (f34 * f34) + (f33 * f33);
                    f17 = f29;
                    double sqrt = Math.sqrt(f36);
                    f18 = cbrt;
                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                    if (pow <= 1.0f) {
                        f28 = pow;
                        f16 = abs;
                        aVar2 = a11;
                    }
                } else {
                    f13 = min;
                    f14 = f19;
                    f17 = f29;
                    f18 = cbrt;
                }
                if (f16 == f15 && f28 == f15) {
                    break;
                }
                if (f18 < f12) {
                    f26 = f17;
                } else {
                    f27 = f17;
                }
                f21 = f15;
                f25 = f16;
                f19 = f14;
                min = f13;
                f24 = 100.0f;
            }
            if (!z11) {
                if (aVar2 == null) {
                    f19 = f22;
                } else {
                    f23 = f22;
                    aVar = aVar2;
                    f19 = f14;
                }
                f22 = ((f19 - f23) / 2.0f) + f23;
                f21 = f15;
            } else {
                if (aVar2 != null) {
                    return aVar2.f(lVar);
                }
                f22 = ((f14 - f23) / 2.0f) + f23;
                z11 = false;
                f21 = f15;
                f19 = f14;
            }
            min = f13;
        }
        return aVar == null ? b.a(f12) : aVar.f(lVar);
    }

    final float c() {
        return this.f42070b;
    }

    final float d() {
        return this.f42069a;
    }

    final int f(@NonNull l lVar) {
        float f7;
        float f11 = this.f42070b;
        double d11 = f11;
        float f12 = this.f42071c;
        if (d11 != 0.0d) {
            double d12 = f12;
            if (d12 != 0.0d) {
                f7 = f11 / ((float) Math.sqrt(d12 / 100.0d));
                float pow = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
                double d13 = (this.f42069a * 3.1415927f) / 180.0f;
                float cos = ((float) (Math.cos(2.0d + d13) + 3.8d)) * 0.25f;
                float a11 = lVar.a() * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.b()) / lVar.j()));
                float g10 = cos * 3846.1538f * lVar.g() * lVar.h();
                float f13 = a11 / lVar.f();
                float sin = (float) Math.sin(d13);
                float cos2 = (float) Math.cos(d13);
                float f14 = (((0.305f + f13) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (g10 * 23.0f)));
                float f15 = cos2 * f14;
                float f16 = f14 * sin;
                float f17 = f13 * 460.0f;
                float f18 = ((288.0f * f16) + ((451.0f * f15) + f17)) / 1403.0f;
                float f19 = ((f17 - (891.0f * f15)) - (261.0f * f16)) / 1403.0f;
                float f21 = ((f17 - (f15 * 220.0f)) - (f16 * 6300.0f)) / 1403.0f;
                float c11 = (100.0f / lVar.c()) * Math.signum(f18) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f18) * 27.13d) / (400.0d - Math.abs(f18))), 2.380952380952381d));
                float c12 = (100.0f / lVar.c()) * Math.signum(f19) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f19) * 27.13d) / (400.0d - Math.abs(f19))), 2.380952380952381d));
                float c13 = (100.0f / lVar.c()) * Math.signum(f21) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f21) * 27.13d) / (400.0d - Math.abs(f21))), 2.380952380952381d));
                float f22 = c11 / lVar.i()[0];
                float f23 = c12 / lVar.i()[1];
                float f24 = c13 / lVar.i()[2];
                float[][] fArr = b.f42076b;
                float[] fArr2 = fArr[0];
                float f25 = (fArr2[2] * f24) + (fArr2[1] * f23) + (fArr2[0] * f22);
                float[] fArr3 = fArr[1];
                float f26 = (fArr3[2] * f24) + (fArr3[1] * f23) + (fArr3[0] * f22);
                float[] fArr4 = fArr[2];
                return androidx.core.graphics.c.a(f25, f26, (f24 * fArr4[2]) + (f23 * fArr4[1]) + (f22 * fArr4[0]));
            }
        }
        f7 = 0.0f;
        float pow2 = (float) Math.pow(f7 / Math.pow(1.64d - Math.pow(0.29d, lVar.e()), 0.73d), 1.1111111111111112d);
        double d132 = (this.f42069a * 3.1415927f) / 180.0f;
        float cos3 = ((float) (Math.cos(2.0d + d132) + 3.8d)) * 0.25f;
        float a112 = lVar.a() * ((float) Math.pow(f12 / 100.0d, (1.0d / lVar.b()) / lVar.j()));
        float g102 = cos3 * 3846.1538f * lVar.g() * lVar.h();
        float f132 = a112 / lVar.f();
        float sin2 = (float) Math.sin(d132);
        float cos22 = (float) Math.cos(d132);
        float f142 = (((0.305f + f132) * 23.0f) * pow2) / (((pow2 * 108.0f) * sin2) + (((11.0f * pow2) * cos22) + (g102 * 23.0f)));
        float f152 = cos22 * f142;
        float f162 = f142 * sin2;
        float f172 = f132 * 460.0f;
        float f182 = ((288.0f * f162) + ((451.0f * f152) + f172)) / 1403.0f;
        float f192 = ((f172 - (891.0f * f152)) - (261.0f * f162)) / 1403.0f;
        float f212 = ((f172 - (f152 * 220.0f)) - (f162 * 6300.0f)) / 1403.0f;
        float c112 = (100.0f / lVar.c()) * Math.signum(f182) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f182) * 27.13d) / (400.0d - Math.abs(f182))), 2.380952380952381d));
        float c122 = (100.0f / lVar.c()) * Math.signum(f192) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f192) * 27.13d) / (400.0d - Math.abs(f192))), 2.380952380952381d));
        float c132 = (100.0f / lVar.c()) * Math.signum(f212) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f212) * 27.13d) / (400.0d - Math.abs(f212))), 2.380952380952381d));
        float f222 = c112 / lVar.i()[0];
        float f232 = c122 / lVar.i()[1];
        float f242 = c132 / lVar.i()[2];
        float[][] fArr5 = b.f42076b;
        float[] fArr22 = fArr5[0];
        float f252 = (fArr22[2] * f242) + (fArr22[1] * f232) + (fArr22[0] * f222);
        float[] fArr32 = fArr5[1];
        float f262 = (fArr32[2] * f242) + (fArr32[1] * f232) + (fArr32[0] * f222);
        float[] fArr42 = fArr5[2];
        return androidx.core.graphics.c.a(f252, f262, (f242 * fArr42[2]) + (f232 * fArr42[1]) + (f222 * fArr42[0]));
    }
}
