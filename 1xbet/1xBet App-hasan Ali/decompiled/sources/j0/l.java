package j0;

import i0.F;

/* loaded from: classes.dex */
public final class l extends c {

    /* renamed from: d, reason: collision with root package name */
    public static final float[] f17451d;

    /* renamed from: e, reason: collision with root package name */
    public static final float[] f17452e;
    public static final float[] f;

    /* renamed from: g, reason: collision with root package name */
    public static final float[] f17453g;

    static {
        float[] g5 = j.g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, j.c(C2016a.f17405b.f17406a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f17451d = g5;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f17452e = fArr;
        f = j.f(g5);
        f17453g = j.f(fArr);
    }

    @Override // j0.c
    public final float a(int i) {
        return i == 0 ? 1.0f : 0.5f;
    }

    @Override // j0.c
    public final float b(int i) {
        return i == 0 ? 0.0f : -0.5f;
    }

    @Override // j0.c
    public final long d(float f5, float f6, float f7) {
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 < -0.5f) {
            f6 = -0.5f;
        }
        if (f6 > 0.5f) {
            f6 = 0.5f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        float f8 = f7 <= 0.5f ? f7 : 0.5f;
        float[] fArr = f17453g;
        float f9 = (fArr[6] * f8) + (fArr[3] * f6) + (fArr[0] * f5);
        float f10 = (fArr[7] * f8) + (fArr[4] * f6) + (fArr[1] * f5);
        float f11 = (fArr[8] * f8) + (fArr[5] * f6) + (fArr[2] * f5);
        float f12 = f10 * f10 * f10;
        float f13 = f11 * f11 * f11;
        float[] fArr2 = f;
        float f14 = (fArr2[6] * f13) + (fArr2[3] * f12) + (fArr2[0] * f9 * f9 * f9);
        return (Float.floatToRawIntBits((fArr2[7] * f13) + (fArr2[4] * f12) + (fArr2[1] * r11)) & 4294967295L) | (Float.floatToRawIntBits(f14) << 32);
    }

    @Override // j0.c
    public final float e(float f5, float f6, float f7) {
        if (f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        if (f6 < -0.5f) {
            f6 = -0.5f;
        }
        if (f6 > 0.5f) {
            f6 = 0.5f;
        }
        if (f7 < -0.5f) {
            f7 = -0.5f;
        }
        float f8 = f7 <= 0.5f ? f7 : 0.5f;
        float[] fArr = f17453g;
        float f9 = (fArr[6] * f8) + (fArr[3] * f6) + (fArr[0] * f5);
        float f10 = (fArr[7] * f8) + (fArr[4] * f6) + (fArr[1] * f5);
        float f11 = (fArr[8] * f8) + (fArr[5] * f6) + (fArr[2] * f5);
        float f12 = f9 * f9 * f9;
        float f13 = f10 * f10 * f10;
        float f14 = f11 * f11 * f11;
        float[] fArr2 = f;
        return (fArr2[8] * f14) + (fArr2[5] * f13) + (fArr2[2] * f12);
    }

    @Override // j0.c
    public final long f(float f5, float f6, float f7, float f8, c cVar) {
        float[] fArr = f17451d;
        float f9 = (fArr[6] * f7) + (fArr[3] * f6) + (fArr[0] * f5);
        float f10 = (fArr[7] * f7) + (fArr[4] * f6) + (fArr[1] * f5);
        float f11 = (fArr[8] * f7) + (fArr[5] * f6) + (fArr[2] * f5);
        float q5 = G4.d.q(f9);
        float q6 = G4.d.q(f10);
        float q7 = G4.d.q(f11);
        float[] fArr2 = f17452e;
        return F.b((fArr2[6] * q7) + (fArr2[3] * q6) + (fArr2[0] * q5), (fArr2[7] * q7) + (fArr2[4] * q6) + (fArr2[1] * q5), (fArr2[8] * q7) + (fArr2[5] * q6) + (fArr2[2] * q5), f8, cVar);
    }
}
