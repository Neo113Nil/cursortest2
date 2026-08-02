package androidx.core.graphics;

/* loaded from: classes3.dex */
public final class ColorUtils {
    private static final java.lang.ThreadLocal<double[]> getHighSpeedVideoSizes = new java.lang.ThreadLocal<>();

    private ColorUtils() {
    }

    public static int compositeColors(int i, int i2) {
        int alpha = android.graphics.Color.alpha(i2);
        int alpha2 = android.graphics.Color.alpha(i);
        int i3 = 255 - alpha2;
        int i4 = 255 - (((255 - alpha) * i3) / 255);
        return android.graphics.Color.argb(i4, i4 == 0 ? 0 : (((android.graphics.Color.red(i) * 255) * alpha2) + ((android.graphics.Color.red(i2) * alpha) * i3)) / (i4 * 255), i4 == 0 ? 0 : (((android.graphics.Color.green(i) * 255) * alpha2) + ((android.graphics.Color.green(i2) * alpha) * i3)) / (i4 * 255), i4 != 0 ? (((android.graphics.Color.blue(i) * 255) * alpha2) + ((android.graphics.Color.blue(i2) * alpha) * i3)) / (i4 * 255) : 0);
    }

    public static android.graphics.Color compositeColors(android.graphics.Color color, android.graphics.Color color2) {
        return androidx.core.graphics.ColorUtils.Api26Impl.getHighSpeedVideoFpsRanges(color, color2);
    }

    /* loaded from: classes7.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        static android.graphics.Color getHighSpeedVideoFpsRanges(android.graphics.Color color, android.graphics.Color color2) {
            if (!java.util.Objects.equals(color.getModel(), color2.getModel())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Color models must match (");
                sb.append(color.getModel());
                sb.append(" vs. ");
                sb.append(color2.getModel());
                sb.append(")");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (!java.util.Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = color2.alpha() * (1.0f - alpha);
            int componentCount = color2.getComponentCount() - 1;
            float f = alpha + alpha2;
            components2[componentCount] = f;
            if (f > 0.0f) {
                alpha /= f;
                alpha2 /= f;
            }
            for (int i = 0; i < componentCount; i++) {
                components2[i] = (components[i] * alpha) + (components2[i] * alpha2);
            }
            return android.graphics.Color.valueOf(components2, color2.getColorSpace());
        }
    }

    public static double calculateContrast(int i, int i2) {
        if (android.graphics.Color.alpha(i2) != 255) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("background can not be translucent: #");
            sb.append(java.lang.Integer.toHexString(i2));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (android.graphics.Color.alpha(i) < 255) {
            i = compositeColors(i, i2);
        }
        double calculateLuminance = calculateLuminance(i) + 0.05d;
        double calculateLuminance2 = calculateLuminance(i2) + 0.05d;
        return java.lang.Math.max(calculateLuminance, calculateLuminance2) / java.lang.Math.min(calculateLuminance, calculateLuminance2);
    }

    public static int calculateMinimumAlpha(int i, int i2, float f) {
        int i3 = 255;
        if (android.graphics.Color.alpha(i2) != 255) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("background can not be translucent: #");
            sb.append(java.lang.Integer.toHexString(i2));
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        double d = f;
        if (calculateContrast(setAlphaComponent(i, 255), i2) < d) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 <= 10 && i3 - i4 > 1; i5++) {
            int i6 = (i4 + i3) / 2;
            if (calculateContrast(setAlphaComponent(i, i6), i2) < d) {
                i4 = i6;
            } else {
                i3 = i6;
            }
        }
        return i3;
    }

    public static void RGBToHSL(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = java.lang.Math.max(f2, java.lang.Math.max(f3, f4));
        float min = java.lang.Math.min(f2, java.lang.Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - java.lang.Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = (f * 60.0f) % 360.0f;
        if (f7 < 0.0f) {
            f7 += 360.0f;
        }
        fArr[0] = f7 < 0.0f ? 0.0f : java.lang.Math.min(f7, 360.0f);
        fArr[1] = abs < 0.0f ? 0.0f : java.lang.Math.min(abs, 1.0f);
        fArr[2] = f6 >= 0.0f ? java.lang.Math.min(f6, 1.0f) : 0.0f;
    }

    public static void colorToHSL(int i, float[] fArr) {
        RGBToHSL(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), fArr);
    }

    public static int HSLToColor(float[] fArr) {
        int round;
        int round2;
        int round3;
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float abs = (1.0f - java.lang.Math.abs((f3 * 2.0f) - 1.0f)) * f2;
        float f4 = f3 - (0.5f * abs);
        float abs2 = (1.0f - java.lang.Math.abs(((f / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f) / 60) {
            case 0:
                round = java.lang.Math.round((abs + f4) * 255.0f);
                round2 = java.lang.Math.round((abs2 + f4) * 255.0f);
                round3 = java.lang.Math.round(f4 * 255.0f);
                break;
            case 1:
                round = java.lang.Math.round((abs2 + f4) * 255.0f);
                round2 = java.lang.Math.round((abs + f4) * 255.0f);
                round3 = java.lang.Math.round(f4 * 255.0f);
                break;
            case 2:
                round = java.lang.Math.round(f4 * 255.0f);
                round2 = java.lang.Math.round((abs + f4) * 255.0f);
                round3 = java.lang.Math.round((abs2 + f4) * 255.0f);
                break;
            case 3:
                round = java.lang.Math.round(f4 * 255.0f);
                round2 = java.lang.Math.round((abs2 + f4) * 255.0f);
                round3 = java.lang.Math.round((abs + f4) * 255.0f);
                break;
            case 4:
                round = java.lang.Math.round((abs2 + f4) * 255.0f);
                round2 = java.lang.Math.round(f4 * 255.0f);
                round3 = java.lang.Math.round((abs + f4) * 255.0f);
                break;
            case 5:
            case 6:
                round = java.lang.Math.round((abs + f4) * 255.0f);
                round2 = java.lang.Math.round(f4 * 255.0f);
                round3 = java.lang.Math.round((abs2 + f4) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return android.graphics.Color.rgb(round < 0 ? 0 : java.lang.Math.min(round, 255), round2 < 0 ? 0 : java.lang.Math.min(round2, 255), round3 >= 0 ? java.lang.Math.min(round3, 255) : 0);
    }

    public static int setAlphaComponent(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static void colorToLAB(int i, double[] dArr) {
        RGBToLAB(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), dArr);
    }

    public static void RGBToLAB(int i, int i2, int i3, double[] dArr) {
        RGBToXYZ(i, i2, i3, dArr);
        XYZToLAB(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void colorToXYZ(int i, double[] dArr) {
        RGBToXYZ(android.graphics.Color.red(i), android.graphics.Color.green(i), android.graphics.Color.blue(i), dArr);
    }

    public static void RGBToXYZ(int i, int i2, int i3, double[] dArr) {
        if (dArr.length != 3) {
            throw new java.lang.IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = i / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : java.lang.Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = i2 / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : java.lang.Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = i3 / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : java.lang.Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    public static void XYZToLAB(double d, double d2, double d3, double[] dArr) {
        double d4;
        double d5;
        if (dArr.length != 3) {
            throw new java.lang.IllegalArgumentException("outLab must have a length of 3.");
        }
        double d6 = d / 95.047d;
        double pow = d6 > 0.008856d ? java.lang.Math.pow(d6, 0.3333333333333333d) : ((d6 * 903.3d) + 16.0d) / 116.0d;
        double d7 = d2 / 100.0d;
        double pow2 = d7 > 0.008856d ? java.lang.Math.pow(d7, 0.3333333333333333d) : ((d7 * 903.3d) + 16.0d) / 116.0d;
        double d8 = d3 / 108.883d;
        if (d8 > 0.008856d) {
            d5 = java.lang.Math.pow(d8, 0.3333333333333333d);
            d4 = 116.0d;
        } else {
            d4 = 116.0d;
            d5 = ((d8 * 903.3d) + 16.0d) / 116.0d;
        }
        dArr[0] = java.lang.Math.max(0.0d, (pow2 * d4) - 16.0d);
        dArr[1] = (pow - pow2) * 500.0d;
        dArr[2] = (pow2 - d5) * 200.0d;
    }

    public static void LABToXYZ(double d, double d2, double d3, double[] dArr) {
        double d4 = (d + 16.0d) / 116.0d;
        double d5 = (d2 / 500.0d) + d4;
        double d6 = d4 - (d3 / 200.0d);
        double pow = java.lang.Math.pow(d5, 3.0d);
        if (pow <= 0.008856d) {
            pow = ((d5 * 116.0d) - 16.0d) / 903.3d;
        }
        double pow2 = d > 7.9996247999999985d ? java.lang.Math.pow(d4, 3.0d) : d / 903.3d;
        double pow3 = java.lang.Math.pow(d6, 3.0d);
        if (pow3 <= 0.008856d) {
            pow3 = ((d6 * 116.0d) - 16.0d) / 903.3d;
        }
        dArr[0] = pow * 95.047d;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * 108.883d;
    }

    public static int XYZToColor(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        double pow = d4 > 0.0031308d ? (java.lang.Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double pow2 = d5 > 0.0031308d ? (java.lang.Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow3 = d6 > 0.0031308d ? (java.lang.Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int round = (int) java.lang.Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : java.lang.Math.min(round, 255);
        int round2 = (int) java.lang.Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : java.lang.Math.min(round2, 255);
        int round3 = (int) java.lang.Math.round(pow3 * 255.0d);
        return android.graphics.Color.rgb(min, min2, round3 >= 0 ? java.lang.Math.min(round3, 255) : 0);
    }

    public static double distanceEuclidean(double[] dArr, double[] dArr2) {
        return java.lang.Math.sqrt(java.lang.Math.pow(dArr[0] - dArr2[0], 2.0d) + java.lang.Math.pow(dArr[1] - dArr2[1], 2.0d) + java.lang.Math.pow(dArr[2] - dArr2[2], 2.0d));
    }

    public static int blendARGB(int i, int i2, float f) {
        float f2 = 1.0f - f;
        return android.graphics.Color.argb((int) ((android.graphics.Color.alpha(i) * f2) + (android.graphics.Color.alpha(i2) * f)), (int) ((android.graphics.Color.red(i) * f2) + (android.graphics.Color.red(i2) * f)), (int) ((android.graphics.Color.green(i) * f2) + (android.graphics.Color.green(i2) * f)), (int) ((android.graphics.Color.blue(i) * f2) + (android.graphics.Color.blue(i2) * f)));
    }

    public static void blendHSL(float[] fArr, float[] fArr2, float f, float[] fArr3) {
        if (fArr3.length != 3) {
            throw new java.lang.IllegalArgumentException("result must have a length of 3.");
        }
        float f2 = 1.0f - f;
        float f3 = fArr[0];
        float f4 = fArr2[0];
        if (java.lang.Math.abs(f4 - f3) > 180.0f) {
            if (f4 > f3) {
                f3 += 360.0f;
            } else {
                f4 += 360.0f;
            }
        }
        fArr3[0] = (f3 + ((f4 - f3) * f)) % 360.0f;
        fArr3[1] = (fArr[1] * f2) + (fArr2[1] * f);
        fArr3[2] = (fArr[2] * f2) + (fArr2[2] * f);
    }

    public static void blendLAB(double[] dArr, double[] dArr2, double d, double[] dArr3) {
        if (dArr3.length != 3) {
            throw new java.lang.IllegalArgumentException("outResult must have a length of 3.");
        }
        double d2 = 1.0d - d;
        dArr3[0] = (dArr[0] * d2) + (dArr2[0] * d);
        dArr3[1] = (dArr[1] * d2) + (dArr2[1] * d);
        dArr3[2] = (dArr[2] * d2) + (dArr2[2] * d);
    }

    public static int M3HCTToColor(float f, float f2, float f3) {
        return androidx.core.content.res.CamColor.toColor(f, f2, f3);
    }

    public static void colorToM3HCT(int i, float[] fArr) {
        androidx.core.content.res.CamColor.getM3HCTfromColor(i, fArr);
    }

    public static int LABToColor(double d, double d2, double d3) {
        java.lang.ThreadLocal<double[]> threadLocal = getHighSpeedVideoSizes;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        LABToXYZ(d, d2, d3, dArr);
        return XYZToColor(dArr[0], dArr[1], dArr[2]);
    }

    public static double calculateLuminance(int i) {
        java.lang.ThreadLocal<double[]> threadLocal = getHighSpeedVideoSizes;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        colorToXYZ(i, dArr);
        return dArr[1] / 100.0d;
    }
}
