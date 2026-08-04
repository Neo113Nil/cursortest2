package H;

import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f3144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f3145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f3146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f3147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f3149f;

    public a(float f7, float f8, float f9, float f10, float f11, float f12) {
        this.f3144a = f7;
        this.f3145b = f8;
        this.f3146c = f9;
        this.f3147d = f10;
        this.f3148e = f11;
        this.f3149f = f12;
    }

    public static a b(int i7) {
        n nVar = n.f3177k;
        float fD = b.d(Color.red(i7));
        float fD2 = b.d(Color.green(i7));
        float fD3 = b.d(Color.blue(i7));
        float[][] fArr = b.f3153d;
        float[] fArr2 = fArr[0];
        float f7 = (fArr2[2] * fD3) + (fArr2[1] * fD2) + (fArr2[0] * fD);
        float[] fArr3 = fArr[1];
        float f8 = (fArr3[2] * fD3) + (fArr3[1] * fD2) + (fArr3[0] * fD);
        float[] fArr4 = fArr[2];
        float f9 = (fD3 * fArr4[2]) + (fD2 * fArr4[1]) + (fD * fArr4[0]);
        float[][] fArr5 = b.f3150a;
        float[] fArr6 = fArr5[0];
        float f10 = (fArr6[2] * f9) + (fArr6[1] * f8) + (fArr6[0] * f7);
        float[] fArr7 = fArr5[1];
        float f11 = (fArr7[2] * f9) + (fArr7[1] * f8) + (fArr7[0] * f7);
        float[] fArr8 = fArr5[2];
        float f12 = (f9 * fArr8[2]) + (f8 * fArr8[1]) + (f7 * fArr8[0]);
        float[] fArr9 = nVar.f3184g;
        float f13 = fArr9[0] * f10;
        float f14 = fArr9[1] * f11;
        float f15 = fArr9[2] * f12;
        float fAbs = Math.abs(f13);
        float f16 = nVar.f3185h;
        float fPow = (float) Math.pow(((double) (fAbs * f16)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f14) * f16)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f15) * f16)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f13) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f14) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f15) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d7 = fSignum3;
        float f17 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d7)) / 11.0f;
        float f18 = ((float) (((double) (fSignum + fSignum2)) - (d7 * 2.0d))) / 9.0f;
        float f19 = fSignum2 * 20.0f;
        float f20 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f19)) / 20.0f;
        float f21 = (((fSignum * 40.0f) + f19) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f22 = fAtan2;
        float f23 = (3.1415927f * f22) / 180.0f;
        float f24 = f21 * nVar.f3179b;
        float f25 = nVar.f3178a;
        float f26 = nVar.f3181d;
        float fPow4 = ((float) Math.pow(f24 / f25, nVar.j * f26)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f27 = f25 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, nVar.f3183f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) f22) < 20.14d ? 360.0f + f22 : f22)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * nVar.f3182e) * nVar.f3180c) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        float f28 = nVar.f3186i * fSqrt;
        Math.sqrt((fPow5 * f26) / f27);
        float f29 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f28 * 0.0228f) + 1.0f)) * 43.85965f;
        double d8 = f23;
        return new a(f22, fSqrt, fPow4, f29, fLog * ((float) Math.cos(d8)), fLog * ((float) Math.sin(d8)));
    }

    public static a c(float f7, float f8, float f9) {
        n nVar = n.f3177k;
        float f10 = nVar.f3181d;
        double d7 = ((double) f7) / 100.0d;
        Math.sqrt(d7);
        float f11 = nVar.f3178a + 4.0f;
        float f12 = nVar.f3186i * f8;
        Math.sqrt(((f8 / ((float) Math.sqrt(d7))) * nVar.f3181d) / f11);
        float f13 = (1.7f * f7) / ((0.007f * f7) + 1.0f);
        float fLog = ((float) Math.log((((double) f12) * 0.0228d) + 1.0d)) * 43.85965f;
        double d8 = (3.1415927f * f9) / 180.0f;
        return new a(f9, f8, f7, f13, fLog * ((float) Math.cos(d8)), fLog * ((float) Math.sin(d8)));
    }

    public void a(float f7, float f8, int i7, int i8, float[] fArr) {
        float f9 = fArr[0];
        float f10 = fArr[1];
        float f11 = (f7 - 0.5f) * 2.0f;
        float f12 = (f8 - 0.5f) * 2.0f;
        float f13 = f9 + this.f3146c;
        float f14 = f10 + this.f3147d;
        float f15 = (this.f3144a * f11) + f13;
        float f16 = (this.f3145b * f12) + f14;
        float radians = (float) Math.toRadians(this.f3149f);
        float radians2 = (float) Math.toRadians(this.f3148e);
        double d7 = radians;
        double d8 = i8 * f12;
        float fSin = (((float) ((Math.sin(d7) * ((double) ((-i7) * f11))) - (Math.cos(d7) * d8))) * radians2) + f15;
        float fCos = (radians2 * ((float) ((Math.cos(d7) * ((double) (i7 * f11))) - (Math.sin(d7) * d8)))) + f16;
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    public int d(n nVar) {
        float fSqrt;
        float f7 = this.f3145b;
        double d7 = f7;
        float f8 = this.f3146c;
        if (d7 != 0.0d) {
            double d8 = f8;
            if (d8 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f7 / ((float) Math.sqrt(d8 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, nVar.f3183f), 0.73d), 1.1111111111111112d);
        double d9 = (this.f3144a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d9) + 3.8d)) * 0.25f;
        float fPow2 = nVar.f3178a * ((float) Math.pow(((double) f8) / 100.0d, (1.0d / ((double) nVar.f3181d)) / ((double) nVar.j)));
        float f9 = fCos * 3846.1538f * nVar.f3182e * nVar.f3180c;
        float f10 = fPow2 / nVar.f3179b;
        float fSin = (float) Math.sin(d9);
        float fCos2 = (float) Math.cos(d9);
        float f11 = (((0.305f + f10) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f9 * 23.0f)));
        float f12 = fCos2 * f11;
        float f13 = f11 * fSin;
        float f14 = f10 * 460.0f;
        float f15 = ((288.0f * f13) + ((451.0f * f12) + f14)) / 1403.0f;
        float f16 = ((f14 - (891.0f * f12)) - (261.0f * f13)) / 1403.0f;
        float f17 = ((f14 - (f12 * 220.0f)) - (f13 * 6300.0f)) / 1403.0f;
        float fMax = (float) Math.max(0.0d, (((double) Math.abs(f15)) * 27.13d) / (400.0d - ((double) Math.abs(f15))));
        float fSignum = Math.signum(f15);
        float f18 = 100.0f / nVar.f3185h;
        float fPow3 = fSignum * f18 * ((float) Math.pow(fMax, 2.380952380952381d));
        float fSignum2 = Math.signum(f16) * f18 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f16)) * 27.13d) / (400.0d - ((double) Math.abs(f16)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f17) * f18 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f17)) * 27.13d) / (400.0d - ((double) Math.abs(f17)))), 2.380952380952381d));
        float[] fArr = nVar.f3184g;
        float f19 = fPow3 / fArr[0];
        float f20 = fSignum2 / fArr[1];
        float f21 = fSignum3 / fArr[2];
        float[][] fArr2 = b.f3151b;
        float[] fArr3 = fArr2[0];
        float f22 = (fArr3[2] * f21) + (fArr3[1] * f20) + (fArr3[0] * f19);
        float[] fArr4 = fArr2[1];
        float f23 = (fArr4[2] * f21) + (fArr4[1] * f20) + (fArr4[0] * f19);
        float[] fArr5 = fArr2[2];
        return I.a.a(f22, f23, (f21 * fArr5[2]) + (f20 * fArr5[1]) + (f19 * fArr5[0]));
    }
}
