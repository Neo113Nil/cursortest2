package androidx.core.content.res;

/* loaded from: classes3.dex */
public class CamColor {
    private final float Camera2StreamConfigurationMap;
    private final float getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoFpsRanges;
    final float getHighSpeedVideoFpsRangesFor;
    final float getHighSpeedVideoSizes;
    private final float getHighSpeedVideoSizesFor;
    private final float getInputSizeshNQ4ISI;
    private final float getOutputFormats;
    private final float getOutputMinFrameDuration;

    private CamColor(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.getHighResolutionOutputSizeshNQ4ISI = f3;
        this.getOutputMinFrameDuration = f4;
        this.getOutputFormats = f5;
        this.getHighSpeedVideoSizesFor = f6;
        this.getInputSizeshNQ4ISI = f7;
        this.Camera2StreamConfigurationMap = f8;
        this.getHighSpeedVideoFpsRanges = f9;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int toColor(float f, float f2, float f3) {
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        androidx.core.content.res.ViewingConditions viewingConditions = androidx.core.content.res.ViewingConditions.getHighSpeedVideoSizes;
        float f9 = f2;
        if (f9 >= 1.0d && java.lang.Math.round(f3) > 0.0d && java.lang.Math.round(f3) < 100.0d) {
            float f10 = 0.0f;
            float min = f < 0.0f ? 0.0f : java.lang.Math.min(360.0f, f);
            float f11 = 0.0f;
            boolean z = true;
            androidx.core.content.res.CamColor camColor = null;
            float f12 = f9;
            while (java.lang.Math.abs(f11 - f9) >= 0.4f) {
                float f13 = 1000.0f;
                float f14 = f10;
                float f15 = 100.0f;
                androidx.core.content.res.CamColor camColor2 = null;
                float f16 = 1000.0f;
                while (true) {
                    if (java.lang.Math.abs(f14 - f15) <= 0.01f) {
                        f4 = min;
                        f5 = f10;
                        f6 = f12;
                        break;
                    }
                    float f17 = ((f15 - f14) / 2.0f) + f14;
                    int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(f17, f12, min, androidx.core.content.res.ViewingConditions.getHighSpeedVideoSizes).Camera2StreamConfigurationMap(androidx.core.content.res.ViewingConditions.getHighSpeedVideoSizes);
                    float highResolutionOutputSizeshNQ4ISI = androidx.core.content.res.CamUtils.getHighResolutionOutputSizeshNQ4ISI(Camera2StreamConfigurationMap);
                    float abs = java.lang.Math.abs(f3 - highResolutionOutputSizeshNQ4ISI);
                    if (abs < 0.2f) {
                        androidx.core.content.res.CamColor highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap);
                        f6 = f12;
                        f7 = f13;
                        androidx.core.content.res.CamColor Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(highSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI, highSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor, min, androidx.core.content.res.ViewingConditions.getHighSpeedVideoSizes);
                        float f18 = highSpeedVideoFpsRanges.getInputSizeshNQ4ISI - Camera2StreamConfigurationMap2.getInputSizeshNQ4ISI;
                        f4 = min;
                        float f19 = highSpeedVideoFpsRanges.Camera2StreamConfigurationMap - Camera2StreamConfigurationMap2.Camera2StreamConfigurationMap;
                        float f20 = highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges - Camera2StreamConfigurationMap2.getHighSpeedVideoFpsRanges;
                        double sqrt = java.lang.Math.sqrt((f18 * f18) + (f19 * f19) + (f20 * f20));
                        f8 = f16;
                        float pow = (float) (java.lang.Math.pow(sqrt, 0.63d) * 1.41d);
                        if (pow <= 1.0f) {
                            camColor2 = highSpeedVideoFpsRanges;
                            f16 = pow;
                            f13 = abs;
                            f5 = 0.0f;
                            if (f13 != 0.0f && f16 == 0.0f) {
                                break;
                            }
                            if (highResolutionOutputSizeshNQ4ISI >= f3) {
                                f10 = 0.0f;
                                f14 = f17;
                            } else {
                                f10 = 0.0f;
                                f15 = f17;
                            }
                            f12 = f6;
                            min = f4;
                        }
                    } else {
                        f4 = min;
                        f6 = f12;
                        f7 = f13;
                        f8 = f16;
                    }
                    f16 = f8;
                    f13 = f7;
                    f5 = 0.0f;
                    if (f13 != 0.0f) {
                    }
                    if (highResolutionOutputSizeshNQ4ISI >= f3) {
                    }
                    f12 = f6;
                    min = f4;
                }
                if (!z) {
                    if (camColor2 == null) {
                        f9 = f6;
                    } else {
                        camColor = camColor2;
                        f11 = f6;
                    }
                    f12 = ((f9 - f11) / 2.0f) + f11;
                } else {
                    if (camColor2 != null) {
                        return camColor2.Camera2StreamConfigurationMap(viewingConditions);
                    }
                    f12 = ((f9 - f11) / 2.0f) + f11;
                    z = false;
                }
                f10 = f5;
                min = f4;
            }
            if (camColor != null) {
                return camColor.Camera2StreamConfigurationMap(viewingConditions);
            }
        }
        return androidx.core.content.res.CamUtils.getHighSpeedVideoFpsRangesFor(f3);
    }

    static androidx.core.content.res.CamColor getHighSpeedVideoFpsRanges(int i) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        getHighResolutionOutputSizeshNQ4ISI(i, androidx.core.content.res.ViewingConditions.getHighSpeedVideoSizes, fArr, fArr2);
        return new androidx.core.content.res.CamColor(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void getM3HCTfromColor(int i, float[] fArr) {
        getHighResolutionOutputSizeshNQ4ISI(i, androidx.core.content.res.ViewingConditions.getHighSpeedVideoSizes, null, fArr);
        fArr[2] = androidx.core.content.res.CamUtils.getHighResolutionOutputSizeshNQ4ISI(i);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, androidx.core.content.res.ViewingConditions viewingConditions, float[] fArr, float[] fArr2) {
        androidx.core.content.res.CamUtils.getHighSpeedVideoFpsRangesFor(i, fArr2);
        float[][] fArr3 = androidx.core.content.res.CamUtils.getHighResolutionOutputSizeshNQ4ISI;
        float f = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f2 = fArr4[0];
        float f3 = fArr2[1];
        float f4 = fArr4[1];
        float f5 = fArr2[2];
        float f6 = fArr4[2];
        float[] fArr5 = fArr3[1];
        float f7 = fArr5[0];
        float f8 = fArr5[1];
        float f9 = fArr5[2];
        float[] fArr6 = fArr3[2];
        float f10 = fArr6[0];
        float f11 = fArr6[1];
        float f12 = fArr6[2];
        float f13 = viewingConditions.getOutputMinFrameDuration[0] * ((f2 * f) + (f4 * f3) + (f6 * f5));
        float f14 = viewingConditions.getOutputMinFrameDuration[1] * ((f7 * f) + (f8 * f3) + (f9 * f5));
        float f15 = viewingConditions.getOutputMinFrameDuration[2] * ((f * f10) + (f3 * f11) + (f5 * f12));
        float pow = (float) java.lang.Math.pow((viewingConditions.Camera2StreamConfigurationMap * java.lang.Math.abs(f13)) / 100.0d, 0.42d);
        float pow2 = (float) java.lang.Math.pow((viewingConditions.Camera2StreamConfigurationMap * java.lang.Math.abs(f14)) / 100.0d, 0.42d);
        float pow3 = (float) java.lang.Math.pow((viewingConditions.Camera2StreamConfigurationMap * java.lang.Math.abs(f15)) / 100.0d, 0.42d);
        float signum = ((java.lang.Math.signum(f13) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((java.lang.Math.signum(f14) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((java.lang.Math.signum(f15) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = signum3;
        float f16 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d)) / 11.0f;
        float f17 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = (((signum * 20.0f) + f18) + (21.0f * signum3)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) java.lang.Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) java.lang.Math.pow((f20 * viewingConditions.getOutputFormats) / viewingConditions.getHighSpeedVideoFpsRangesFor, viewingConditions.getHighSpeedVideoFpsRanges * viewingConditions.getOutputSizes)) * 100.0f;
        float f22 = 4.0f / viewingConditions.getHighSpeedVideoFpsRanges;
        float sqrt = (float) java.lang.Math.sqrt(pow4 / 100.0f);
        float f23 = viewingConditions.getHighSpeedVideoFpsRangesFor;
        float f24 = viewingConditions.getHighResolutionOutputSizeshNQ4ISI;
        float sqrt2 = ((float) java.lang.Math.sqrt(pow4 / 100.0d)) * ((float) java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, viewingConditions.getInputFormats), 0.73d)) * ((float) java.lang.Math.pow((((((((float) (java.lang.Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * viewingConditions.getInputSizeshNQ4ISI) * viewingConditions.getHighSpeedVideoSizesFor) * ((float) java.lang.Math.sqrt((f16 * f16) + (f17 * f17)))) / (f19 + 0.305f), 0.9d));
        float f25 = viewingConditions.getHighResolutionOutputSizeshNQ4ISI * sqrt2;
        float sqrt3 = (float) java.lang.Math.sqrt((r5 * viewingConditions.getHighSpeedVideoFpsRanges) / (viewingConditions.getHighSpeedVideoFpsRangesFor + 4.0f));
        float f26 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) java.lang.Math.log((0.0228f * f25) + 1.0f)) * 43.85965f;
        double d2 = f21;
        float cos = (float) java.lang.Math.cos(d2);
        float sin = (float) java.lang.Math.sin(d2);
        fArr2[0] = atan2;
        fArr2[1] = sqrt2;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = f22 * sqrt * (f23 + 4.0f) * f24;
            fArr[2] = f25;
            fArr[3] = sqrt3 * 50.0f;
            fArr[4] = f26;
            fArr[5] = cos * log;
            fArr[6] = log * sin;
        }
    }

    private static androidx.core.content.res.CamColor Camera2StreamConfigurationMap(float f, float f2, float f3, androidx.core.content.res.ViewingConditions viewingConditions) {
        float f4 = 4.0f / viewingConditions.getHighSpeedVideoFpsRanges;
        float sqrt = (float) java.lang.Math.sqrt(f / 100.0d);
        float f5 = viewingConditions.getHighSpeedVideoFpsRangesFor;
        float f6 = viewingConditions.getHighResolutionOutputSizeshNQ4ISI;
        float f7 = viewingConditions.getHighResolutionOutputSizeshNQ4ISI * f2;
        float sqrt2 = (float) java.lang.Math.sqrt(((f2 / ((float) java.lang.Math.sqrt(r4))) * viewingConditions.getHighSpeedVideoFpsRanges) / (viewingConditions.getHighSpeedVideoFpsRangesFor + 4.0f));
        float f8 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) java.lang.Math.log((f7 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new androidx.core.content.res.CamColor(f3, f2, f, f4 * sqrt * (f5 + 4.0f) * f6, f7, sqrt2 * 50.0f, f8, ((float) java.lang.Math.cos(d)) * log, ((float) java.lang.Math.sin(d)) * log);
    }

    private int Camera2StreamConfigurationMap(androidx.core.content.res.ViewingConditions viewingConditions) {
        float f;
        float f2 = this.getHighSpeedVideoFpsRangesFor;
        if (f2 != 0.0d) {
            float f3 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (f3 != 0.0d) {
                f = f2 / ((float) java.lang.Math.sqrt(f3 / 100.0d));
                float pow = (float) java.lang.Math.pow(f / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, viewingConditions.getInputFormats), 0.73d), 1.1111111111111112d);
                double d = (this.getHighSpeedVideoSizes * 3.1415927f) / 180.0f;
                float cos = (float) (java.lang.Math.cos(2.0d + d) + 3.8d);
                float f4 = viewingConditions.getHighSpeedVideoFpsRangesFor;
                float pow2 = (float) java.lang.Math.pow(this.getHighResolutionOutputSizeshNQ4ISI / 100.0d, (1.0d / viewingConditions.getHighSpeedVideoFpsRanges) / viewingConditions.getOutputSizes);
                float f5 = viewingConditions.getInputSizeshNQ4ISI;
                float f6 = viewingConditions.getHighSpeedVideoSizesFor;
                float f7 = (f4 * pow2) / viewingConditions.getOutputFormats;
                float sin = (float) java.lang.Math.sin(d);
                float cos2 = (float) java.lang.Math.cos(d);
                float f8 = (((0.305f + f7) * 23.0f) * pow) / (((((((cos * 0.25f) * 3846.1538f) * f5) * f6) * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
                float f9 = cos2 * f8;
                float f10 = f8 * sin;
                float f11 = f7 * 460.0f;
                float f12 = (((451.0f * f9) + f11) + (288.0f * f10)) / 1403.0f;
                float f13 = ((f11 - (891.0f * f9)) - (261.0f * f10)) / 1403.0f;
                float f14 = ((f11 - (f9 * 220.0f)) - (f10 * 6300.0f)) / 1403.0f;
                float max = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f12) * 27.13d) / (400.0d - java.lang.Math.abs(f12)));
                float signum = java.lang.Math.signum(f12);
                float f15 = 100.0f / viewingConditions.Camera2StreamConfigurationMap;
                float pow3 = (float) java.lang.Math.pow(max, 2.380952380952381d);
                float max2 = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f13) * 27.13d) / (400.0d - java.lang.Math.abs(f13)));
                float signum2 = java.lang.Math.signum(f13);
                float f16 = 100.0f / viewingConditions.Camera2StreamConfigurationMap;
                float pow4 = (float) java.lang.Math.pow(max2, 2.380952380952381d);
                float max3 = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f14) * 27.13d) / (400.0d - java.lang.Math.abs(f14)));
                float signum3 = java.lang.Math.signum(f14);
                float f17 = 100.0f / viewingConditions.Camera2StreamConfigurationMap;
                float pow5 = (float) java.lang.Math.pow(max3, 2.380952380952381d);
                float f18 = ((signum * f15) * pow3) / viewingConditions.getOutputMinFrameDuration[0];
                float f19 = ((signum2 * f16) * pow4) / viewingConditions.getOutputMinFrameDuration[1];
                float f20 = ((signum3 * f17) * pow5) / viewingConditions.getOutputMinFrameDuration[2];
                float[][] fArr = androidx.core.content.res.CamUtils.getHighSpeedVideoSizes;
                float[] fArr2 = fArr[0];
                float f21 = fArr2[0];
                float f22 = fArr2[1];
                float f23 = fArr2[2];
                float[] fArr3 = fArr[1];
                float f24 = fArr3[0];
                float f25 = fArr3[1];
                float f26 = fArr3[2];
                float[] fArr4 = fArr[2];
                return androidx.core.graphics.ColorUtils.XYZToColor((f21 * f18) + (f22 * f19) + (f23 * f20), (f24 * f18) + (f25 * f19) + (f26 * f20), (f18 * fArr4[0]) + (f19 * fArr4[1]) + (f20 * fArr4[2]));
            }
        }
        f = 0.0f;
        float pow6 = (float) java.lang.Math.pow(f / java.lang.Math.pow(1.64d - java.lang.Math.pow(0.29d, viewingConditions.getInputFormats), 0.73d), 1.1111111111111112d);
        double d2 = (this.getHighSpeedVideoSizes * 3.1415927f) / 180.0f;
        float cos3 = (float) (java.lang.Math.cos(2.0d + d2) + 3.8d);
        float f42 = viewingConditions.getHighSpeedVideoFpsRangesFor;
        float pow22 = (float) java.lang.Math.pow(this.getHighResolutionOutputSizeshNQ4ISI / 100.0d, (1.0d / viewingConditions.getHighSpeedVideoFpsRanges) / viewingConditions.getOutputSizes);
        float f52 = viewingConditions.getInputSizeshNQ4ISI;
        float f62 = viewingConditions.getHighSpeedVideoSizesFor;
        float f72 = (f42 * pow22) / viewingConditions.getOutputFormats;
        float sin2 = (float) java.lang.Math.sin(d2);
        float cos22 = (float) java.lang.Math.cos(d2);
        float f82 = (((0.305f + f72) * 23.0f) * pow6) / (((((((cos3 * 0.25f) * 3846.1538f) * f52) * f62) * 23.0f) + ((11.0f * pow6) * cos22)) + ((pow6 * 108.0f) * sin2));
        float f92 = cos22 * f82;
        float f102 = f82 * sin2;
        float f112 = f72 * 460.0f;
        float f122 = (((451.0f * f92) + f112) + (288.0f * f102)) / 1403.0f;
        float f132 = ((f112 - (891.0f * f92)) - (261.0f * f102)) / 1403.0f;
        float f142 = ((f112 - (f92 * 220.0f)) - (f102 * 6300.0f)) / 1403.0f;
        float max4 = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f122) * 27.13d) / (400.0d - java.lang.Math.abs(f122)));
        float signum4 = java.lang.Math.signum(f122);
        float f152 = 100.0f / viewingConditions.Camera2StreamConfigurationMap;
        float pow32 = (float) java.lang.Math.pow(max4, 2.380952380952381d);
        float max22 = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f132) * 27.13d) / (400.0d - java.lang.Math.abs(f132)));
        float signum22 = java.lang.Math.signum(f132);
        float f162 = 100.0f / viewingConditions.Camera2StreamConfigurationMap;
        float pow42 = (float) java.lang.Math.pow(max22, 2.380952380952381d);
        float max32 = (float) java.lang.Math.max(0.0d, (java.lang.Math.abs(f142) * 27.13d) / (400.0d - java.lang.Math.abs(f142)));
        float signum32 = java.lang.Math.signum(f142);
        float f172 = 100.0f / viewingConditions.Camera2StreamConfigurationMap;
        float pow52 = (float) java.lang.Math.pow(max32, 2.380952380952381d);
        float f182 = ((signum4 * f152) * pow32) / viewingConditions.getOutputMinFrameDuration[0];
        float f192 = ((signum22 * f162) * pow42) / viewingConditions.getOutputMinFrameDuration[1];
        float f202 = ((signum32 * f172) * pow52) / viewingConditions.getOutputMinFrameDuration[2];
        float[][] fArr5 = androidx.core.content.res.CamUtils.getHighSpeedVideoSizes;
        float[] fArr22 = fArr5[0];
        float f212 = fArr22[0];
        float f222 = fArr22[1];
        float f232 = fArr22[2];
        float[] fArr32 = fArr5[1];
        float f242 = fArr32[0];
        float f252 = fArr32[1];
        float f262 = fArr32[2];
        float[] fArr42 = fArr5[2];
        return androidx.core.graphics.ColorUtils.XYZToColor((f212 * f182) + (f222 * f192) + (f232 * f202), (f242 * f182) + (f252 * f192) + (f262 * f202), (f182 * fArr42[0]) + (f192 * fArr42[1]) + (f202 * fArr42[2]));
    }
}
