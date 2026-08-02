package p000;

import android.graphics.Color;

/* JADX INFO: renamed from: le */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0430le {

    /* JADX INFO: renamed from: a */
    public final float f4766a;

    /* JADX INFO: renamed from: b */
    public final float f4767b;

    /* JADX INFO: renamed from: c */
    public final float f4768c;

    /* JADX INFO: renamed from: d */
    public final float f4769d;

    /* JADX INFO: renamed from: e */
    public final float f4770e;

    /* JADX INFO: renamed from: f */
    public final float f4771f;

    public C0430le(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f4766a = f;
        this.f4767b = f2;
        this.f4768c = f3;
        this.f4769d = f4;
        this.f4770e = f5;
        this.f4771f = f6;
    }

    /* JADX INFO: renamed from: a */
    public static C0430le m3213a(int i) {
        oi1 oi1Var = oi1.f5739k;
        float fM5984m = AbstractC0959zp.m5984m(Color.red(i));
        float fM5984m2 = AbstractC0959zp.m5984m(Color.green(i));
        float fM5984m3 = AbstractC0959zp.m5984m(Color.blue(i));
        float[][] fArr = AbstractC0959zp.f9882m;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * fM5984m3) + (fArr2[1] * fM5984m2) + (fArr2[0] * fM5984m);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * fM5984m3) + (fArr3[1] * fM5984m2) + (fArr3[0] * fM5984m);
        float[] fArr4 = fArr[2];
        float f3 = (fM5984m3 * fArr4[2]) + (fM5984m2 * fArr4[1]) + (fM5984m * fArr4[0]);
        float[][] fArr5 = AbstractC0959zp.f9879j;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = (fArr7[2] * f3) + (fArr7[1] * f2) + (fArr7[0] * f);
        float[] fArr8 = fArr5[2];
        float f6 = (f3 * fArr8[2]) + (f2 * fArr8[1]) + (f * fArr8[0]);
        float[] fArr9 = oi1Var.f5746g;
        float f7 = oi1Var.f5748i;
        float f8 = oi1Var.f5743d;
        float f9 = oi1Var.f5740a;
        float f10 = fArr9[0] * f4;
        float f11 = fArr9[1] * f5;
        float f12 = fArr9[2] * f6;
        float f13 = oi1Var.f5747h;
        float fPow = (float) Math.pow(((double) (Math.abs(f10) * f13)) / 100.0d, 0.42d);
        float fPow2 = (float) Math.pow(((double) (Math.abs(f11) * f13)) / 100.0d, 0.42d);
        float fPow3 = (float) Math.pow(((double) (Math.abs(f12) * f13)) / 100.0d, 0.42d);
        float fSignum = ((Math.signum(f10) * 400.0f) * fPow) / (fPow + 27.13f);
        float fSignum2 = ((Math.signum(f11) * 400.0f) * fPow2) / (fPow2 + 27.13f);
        float fSignum3 = ((Math.signum(f12) * 400.0f) * fPow3) / (fPow3 + 27.13f);
        double d = fSignum3;
        float f14 = ((float) (((((double) fSignum2) * (-12.0d)) + (((double) fSignum) * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) (((double) (fSignum + fSignum2)) - (d * 2.0d))) / 9.0f;
        float f16 = fSignum2 * 20.0f;
        float f17 = ((21.0f * fSignum3) + ((fSignum * 20.0f) + f16)) / 20.0f;
        float f18 = (((fSignum * 40.0f) + f16) + fSignum3) / 20.0f;
        float fAtan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 360.0f;
        } else if (fAtan2 >= 360.0f) {
            fAtan2 -= 360.0f;
        }
        float f19 = (3.1415927f * fAtan2) / 180.0f;
        float fPow4 = ((float) Math.pow((f18 * oi1Var.f5741b) / f9, oi1Var.f5749j * f8)) * 100.0f;
        Math.sqrt(fPow4 / 100.0f);
        float f20 = f9 + 4.0f;
        float fPow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, oi1Var.f5745f), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((((double) (((double) fAtan2) < 20.14d ? 360.0f + fAtan2 : fAtan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oi1Var.f5744e) * oi1Var.f5742c) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        float fSqrt = fPow5 * ((float) Math.sqrt(((double) fPow4) / 100.0d));
        Math.sqrt((fPow5 * f8) / f20);
        float f21 = (1.7f * fPow4) / ((0.007f * fPow4) + 1.0f);
        float fLog = ((float) Math.log((f7 * fSqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d2 = f19;
        return new C0430le(fAtan2, fSqrt, fPow4, f21, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX INFO: renamed from: b */
    public static C0430le m3214b(float f, float f2, float f3) {
        oi1 oi1Var = oi1.f5739k;
        float f4 = oi1Var.f5743d;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        float f5 = oi1Var.f5740a + 4.0f;
        float f6 = oi1Var.f5748i * f2;
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * oi1Var.f5743d) / f5);
        float f7 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float fLog = ((float) Math.log((((double) f6) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new C0430le(f3, f2, f, f7, fLog * ((float) Math.cos(d2)), fLog * ((float) Math.sin(d2)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX INFO: renamed from: c */
    public final int m3215c(oi1 oi1Var) {
        float fSqrt;
        float f = this.f4767b;
        double d = f;
        float f2 = this.f4768c;
        if (d != 0.0d) {
            double d2 = f2;
            if (d2 == 0.0d) {
                fSqrt = 0.0f;
            } else {
                fSqrt = f / ((float) Math.sqrt(d2 / 100.0d));
            }
        } else {
            fSqrt = 0.0f;
        }
        float f3 = oi1Var.f5745f;
        float f4 = oi1Var.f5747h;
        float fPow = (float) Math.pow(((double) fSqrt) / Math.pow(1.64d - Math.pow(0.29d, f3), 0.73d), 1.1111111111111112d);
        double d3 = (this.f4766a * 3.1415927f) / 180.0f;
        float fCos = ((float) (Math.cos(2.0d + d3) + 3.8d)) * 0.25f;
        float fPow2 = oi1Var.f5740a * ((float) Math.pow(((double) f2) / 100.0d, (1.0d / ((double) oi1Var.f5743d)) / ((double) oi1Var.f5749j)));
        float f5 = fCos * 3846.1538f * oi1Var.f5744e * oi1Var.f5742c;
        float f6 = fPow2 / oi1Var.f5741b;
        float fSin = (float) Math.sin(d3);
        float fCos2 = (float) Math.cos(d3);
        float f7 = (((0.305f + f6) * 23.0f) * fPow) / (((fPow * 108.0f) * fSin) + (((11.0f * fPow) * fCos2) + (f5 * 23.0f)));
        float f8 = fCos2 * f7;
        float f9 = f7 * fSin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float f14 = 100.0f / f4;
        float fSignum = Math.signum(f11) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11)))), 2.380952380952381d));
        float fSignum2 = Math.signum(f12) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f12)) * 27.13d) / (400.0d - ((double) Math.abs(f12)))), 2.380952380952381d));
        float fSignum3 = Math.signum(f13) * f14 * ((float) Math.pow((float) Math.max(0.0d, (((double) Math.abs(f13)) * 27.13d) / (400.0d - ((double) Math.abs(f13)))), 2.380952380952381d));
        float[] fArr = oi1Var.f5746g;
        float f15 = fSignum / fArr[0];
        float f16 = fSignum2 / fArr[1];
        float f17 = fSignum3 / fArr[2];
        float[][] fArr2 = AbstractC0959zp.f9880k;
        float[] fArr3 = fArr2[0];
        float f18 = (fArr3[2] * f17) + (fArr3[1] * f16) + (fArr3[0] * f15);
        float[] fArr4 = fArr2[1];
        float f19 = (fArr4[2] * f17) + (fArr4[1] * f16) + (fArr4[0] * f15);
        float[] fArr5 = fArr2[2];
        return AbstractC0767ui.m4922a(f18, f19, (f17 * fArr5[2]) + (f16 * fArr5[1]) + (f15 * fArr5[0]));
    }
}
