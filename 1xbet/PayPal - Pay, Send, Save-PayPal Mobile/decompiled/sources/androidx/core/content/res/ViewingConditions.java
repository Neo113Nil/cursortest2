package androidx.core.content.res;

/* loaded from: classes3.dex */
final class ViewingConditions {
    static final androidx.core.content.res.ViewingConditions getHighSpeedVideoSizes;
    final float Camera2StreamConfigurationMap;
    final float getHighResolutionOutputSizeshNQ4ISI;
    final float getHighSpeedVideoFpsRanges;
    final float getHighSpeedVideoFpsRangesFor;
    final float getHighSpeedVideoSizesFor;
    final float getInputFormats;
    final float getInputSizeshNQ4ISI = 1.0f;
    final float getOutputFormats;
    final float[] getOutputMinFrameDuration;
    final float getOutputSizes;

    static {
        float[] fArr = androidx.core.content.res.CamUtils.getHighSpeedVideoFpsRanges;
        float highSpeedVideoSizes = (float) ((androidx.core.content.res.CamUtils.getHighSpeedVideoSizes(50.0f) * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = androidx.core.content.res.CamUtils.getHighResolutionOutputSizeshNQ4ISI;
        float f = fArr[0];
        float[] fArr3 = fArr2[0];
        float f2 = fArr3[0];
        float f3 = fArr[1];
        float f4 = fArr3[1];
        float f5 = fArr[2];
        float f6 = (f2 * f) + (f4 * f3) + (fArr3[2] * f5);
        float[] fArr4 = fArr2[1];
        float f7 = (fArr4[0] * f) + (fArr4[1] * f3) + (fArr4[2] * f5);
        float[] fArr5 = fArr2[2];
        float f8 = (f * fArr5[0]) + (f3 * fArr5[1]) + (f5 * fArr5[2]);
        float highSpeedVideoFpsRanges = androidx.core.content.res.CamUtils.getHighSpeedVideoFpsRanges(0.59f, 0.69f, 1.0000002f);
        float exp = (1.0f - (((float) java.lang.Math.exp(((-highSpeedVideoSizes) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f6) * exp) + 1.0f) - exp, (((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp};
        float f9 = 1.0f / ((5.0f * highSpeedVideoSizes) + 1.0f);
        float f10 = f9 * f9 * f9 * f9;
        float f11 = 1.0f - f10;
        float cbrt = (0.1f * f11 * f11 * ((float) java.lang.Math.cbrt(highSpeedVideoSizes * 5.0d))) + (f10 * highSpeedVideoSizes);
        float highSpeedVideoSizes2 = androidx.core.content.res.CamUtils.getHighSpeedVideoSizes(50.0f) / fArr[1];
        double d2 = highSpeedVideoSizes2;
        float sqrt = (float) java.lang.Math.sqrt(d2);
        float pow = 0.725f / ((float) java.lang.Math.pow(d2, 0.2d));
        float[] fArr7 = {(float) java.lang.Math.pow(((fArr6[0] * cbrt) * f6) / 100.0d, 0.42d), (float) java.lang.Math.pow(((fArr6[1] * cbrt) * f7) / 100.0d, 0.42d), (float) java.lang.Math.pow(((fArr6[2] * cbrt) * f8) / 100.0d, 0.42d)};
        float f12 = fArr7[0];
        float f13 = (f12 * 400.0f) / (f12 + 27.13f);
        float f14 = fArr7[1];
        float f15 = (f14 * 400.0f) / (f14 + 27.13f);
        float f16 = fArr7[2];
        float[] fArr8 = {f13, f15, (400.0f * f16) / (f16 + 27.13f)};
        getHighSpeedVideoSizes = new androidx.core.content.res.ViewingConditions(highSpeedVideoSizes2, ((fArr8[0] * 2.0f) + fArr8[1] + (fArr8[2] * 0.05f)) * pow, pow, pow, highSpeedVideoFpsRanges, 1.0f, fArr6, cbrt, (float) java.lang.Math.pow(cbrt, 0.25d), sqrt + 1.48f);
    }

    private ViewingConditions(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.getInputFormats = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getOutputFormats = f3;
        this.getHighSpeedVideoSizesFor = f4;
        this.getHighSpeedVideoFpsRanges = f5;
        this.getOutputMinFrameDuration = fArr;
        this.Camera2StreamConfigurationMap = f7;
        this.getHighResolutionOutputSizeshNQ4ISI = f8;
        this.getOutputSizes = f9;
    }
}
