package androidx.core.graphics;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<double[]> f42124a = new ThreadLocal<>();

    public static int a(double d11, double d12, double d13) {
        double d14 = (((-0.4986d) * d13) + (((-1.5372d) * d12) + (3.2406d * d11))) / 100.0d;
        double d15 = ((0.0415d * d13) + ((1.8758d * d12) + ((-0.9689d) * d11))) / 100.0d;
        double d16 = ((1.057d * d13) + (((-0.204d) * d12) + (0.0557d * d11))) / 100.0d;
        double pow = d14 > 0.0031308d ? (Math.pow(d14, 0.4166666666666667d) * 1.055d) - 0.055d : d14 * 12.92d;
        double pow2 = d15 > 0.0031308d ? (Math.pow(d15, 0.4166666666666667d) * 1.055d) - 0.055d : d15 * 12.92d;
        double pow3 = d16 > 0.0031308d ? (Math.pow(d16, 0.4166666666666667d) * 1.055d) - 0.055d : d16 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(float f7, int i11, int i12) {
        float f11 = 1.0f - f7;
        return Color.argb((int) ((Color.alpha(i12) * f7) + (Color.alpha(i11) * f11)), (int) ((Color.red(i12) * f7) + (Color.red(i11) * f11)), (int) ((Color.green(i12) * f7) + (Color.green(i11) * f11)), (int) ((Color.blue(i12) * f7) + (Color.blue(i11) * f11)));
    }

    public static double c(int i11) {
        ThreadLocal<double[]> threadLocal = f42124a;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d11 = red / 255.0d;
        double pow = d11 < 0.04045d ? d11 / 12.92d : Math.pow((d11 + 0.055d) / 1.055d, 2.4d);
        double d12 = green / 255.0d;
        double pow2 = d12 < 0.04045d ? d12 / 12.92d : Math.pow((d12 + 0.055d) / 1.055d, 2.4d);
        double d13 = blue / 255.0d;
        double pow3 = d13 < 0.04045d ? d13 / 12.92d : Math.pow((d13 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        double d14 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[1] = d14;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
        return d14 / 100.0d;
    }

    public static int d(int i11, int i12) {
        int alpha = Color.alpha(i12);
        int alpha2 = Color.alpha(i11);
        int i13 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i13, e(Color.red(i11), alpha2, Color.red(i12), alpha, i13), e(Color.green(i11), alpha2, Color.green(i12), alpha, i13), e(Color.blue(i11), alpha2, Color.blue(i12), alpha, i13));
    }

    private static int e(int i11, int i12, int i13, int i14, int i15) {
        if (i15 == 0) {
            return 0;
        }
        return (((255 - i12) * (i13 * i14)) + ((i11 * 255) * i12)) / (i15 * 255);
    }

    public static int f(int i11, int i12) {
        if (i12 < 0 || i12 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i11 & 16777215) | (i12 << 24);
    }
}
