package g1;

import android.graphics.Color;

/* renamed from: g1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1967a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f17071a = 0;

    static {
        new ThreadLocal();
    }

    public static int a(double d5, double d6, double d7) {
        double d8 = (((-0.4986d) * d7) + (((-1.5372d) * d6) + (3.2406d * d5))) / 100.0d;
        double d9 = ((0.0415d * d7) + ((1.8758d * d6) + ((-0.9689d) * d5))) / 100.0d;
        double d10 = ((1.057d * d7) + (((-0.204d) * d6) + (0.0557d * d5))) / 100.0d;
        double pow = d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d;
        double pow2 = d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d;
        double pow3 = d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round < 0 ? 0 : Math.min(round, 255);
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 < 0 ? 0 : Math.min(round2, 255);
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static int b(int i, int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i);
        int i6 = 255 - (((255 - alpha2) * (255 - alpha)) / 255);
        return Color.argb(i6, c(Color.red(i), alpha2, Color.red(i5), alpha, i6), c(Color.green(i), alpha2, Color.green(i5), alpha, i6), c(Color.blue(i), alpha2, Color.blue(i5), alpha, i6));
    }

    public static int c(int i, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((255 - i5) * (i6 * i7)) + ((i * 255) * i5)) / (i8 * 255);
    }
}
