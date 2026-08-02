package androidx.compose.material3.internal.colorUtil;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\u0013\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0017R\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e8\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00180\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010%\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020)0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020)0\u001e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010+"}, d2 = {"Landroidx/compose/material3/internal/colorUtil/CamUtils;", "", "<init>", "()V", "", "num", "", "signum", "(D)I", "lstar", "argbFromLstar", "r", "g", util.h.xy.cb.b.f1091, "argbFromLinrgbComponents", "(DDD)I", "p0", "getHighSpeedVideoSizes", "", "intFromLstar", "(F)I", "argb", "lstarFromInt", "(I)F", "", "xyzFromInt", "(I)[F", "yFromLstar", "(D)D", "getHighSpeedVideoFpsRangesFor", "", "XYZ_TO_CAM16RGB", "[[F", "getXYZ_TO_CAM16RGB", "()[[F", "CAM16RGB_TO_XYZ", "getCAM16RGB_TO_XYZ", "WHITE_POINT_D65", "[F", "getWHITE_POINT_D65", "()[F", "", "Camera2StreamConfigurationMap", "[[D", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CamUtils {
    public static final androidx.compose.material3.internal.colorUtil.CamUtils INSTANCE = new androidx.compose.material3.internal.colorUtil.CamUtils();
    private static final float[][] XYZ_TO_CAM16RGB = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    private static final float[][] CAM16RGB_TO_XYZ = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    private static final float[] WHITE_POINT_D65 = {95.047f, 100.0f, 108.883f};

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final double[][] getHighResolutionOutputSizeshNQ4ISI = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final double[][] getHighSpeedVideoSizes = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final int $stable = 8;

    public final int signum(double num) {
        if (num < 0.0d) {
            return -1;
        }
        return num == 0.0d ? 0 : 1;
    }

    private CamUtils() {
    }

    public final float[][] getXYZ_TO_CAM16RGB() {
        return XYZ_TO_CAM16RGB;
    }

    public final float[][] getCAM16RGB_TO_XYZ() {
        return CAM16RGB_TO_XYZ;
    }

    public final float[] getWHITE_POINT_D65() {
        return WHITE_POINT_D65;
    }

    public final int argbFromLstar(double lstar) {
        double d = (lstar + 16.0d) / 116.0d;
        double d2 = lstar > 8.0d ? d * d * d : lstar / 903.2962962962963d;
        double d3 = d * d * d;
        boolean z = d3 > 0.008856451679035631d;
        double d4 = z ? d3 : lstar / 903.2962962962963d;
        if (!z) {
            d3 = lstar / 903.2962962962963d;
        }
        float[] fArr = WHITE_POINT_D65;
        double d5 = d4 * fArr[0];
        double d6 = d2 * fArr[1];
        double d7 = d3 * fArr[2];
        double[][] dArr = getHighSpeedVideoSizes;
        double[] dArr2 = dArr[0];
        double d8 = dArr2[0];
        double d9 = dArr2[1];
        double d10 = dArr2[2];
        double[] dArr3 = dArr[1];
        double d11 = dArr3[0];
        double d12 = dArr3[1];
        double d13 = dArr3[2];
        double[] dArr4 = dArr[2];
        return ((getHighSpeedVideoSizes(((d8 * d5) + (d9 * d6)) + (d10 * d7)) & 255) << 16) | (-16777216) | ((getHighSpeedVideoSizes(((d11 * d5) + (d12 * d6)) + (d13 * d7)) & 255) << 8) | (getHighSpeedVideoSizes((dArr4[0] * d5) + (dArr4[1] * d6) + (dArr4[2] * d7)) & 255);
    }

    public final int argbFromLinrgbComponents(double r, double g, double b) {
        return ((getHighSpeedVideoSizes(r) & 255) << 16) | (-16777216) | ((getHighSpeedVideoSizes(g) & 255) << 8) | (getHighSpeedVideoSizes(b) & 255);
    }

    private static int getHighSpeedVideoSizes(double p0) {
        double d = p0 / 100.0d;
        int round = (int) java.lang.Math.round((d <= 0.0031308d ? d * 12.92d : (java.lang.Math.pow(d, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public final int intFromLstar(float lstar) {
        if (lstar < 1.0f) {
            return -16777216;
        }
        if (lstar > 99.0f) {
            return -1;
        }
        float f = (lstar + 16.0f) / 116.0f;
        float f2 = lstar > 8.0f ? f * f * f : lstar / 903.2963f;
        float f3 = f * f * f;
        boolean z = f3 > 0.008856452f;
        float f4 = z ? f3 : ((f * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f3 = ((f * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = WHITE_POINT_D65;
        return androidx.core.graphics.ColorUtils.XYZToColor(f4 * fArr[0], f2 * fArr[1], f3 * fArr[2]);
    }

    public final float[] xyzFromInt(int argb) {
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((argb >> 16) & 255);
        float highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor((argb >> 8) & 255);
        float highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(argb & 255);
        double[][] dArr = getHighResolutionOutputSizeshNQ4ISI;
        double d = highSpeedVideoFpsRangesFor;
        double[] dArr2 = dArr[0];
        double d2 = dArr2[0];
        double d3 = highSpeedVideoFpsRangesFor2;
        double d4 = dArr2[1];
        double d5 = highSpeedVideoFpsRangesFor3;
        double d6 = dArr2[2];
        double[] dArr3 = dArr[1];
        double d7 = dArr3[0];
        double d8 = dArr3[1];
        double d9 = dArr3[2];
        double[] dArr4 = dArr[2];
        return new float[]{(float) ((d2 * d) + (d4 * d3) + (d6 * d5)), (float) ((d7 * d) + (d8 * d3) + (d9 * d5)), (float) ((d * dArr4[0]) + (d3 * dArr4[1]) + (d5 * dArr4[2]))};
    }

    public final double yFromLstar(double lstar) {
        return (lstar > 8.0d ? java.lang.Math.pow((lstar + 16.0d) / 116.0d, 3.0d) : lstar / 903.2962962962963d) * 100.0d;
    }

    private static float getHighSpeedVideoFpsRangesFor(int p0) {
        float f = p0 / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) java.lang.Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public final float lstarFromInt(int argb) {
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor((argb >> 16) & 255);
        float highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor((argb >> 8) & 255);
        float highSpeedVideoFpsRangesFor3 = getHighSpeedVideoFpsRangesFor(argb & 255);
        double[] dArr = getHighResolutionOutputSizeshNQ4ISI[1];
        float f = ((float) (((highSpeedVideoFpsRangesFor * dArr[0]) + (highSpeedVideoFpsRangesFor2 * dArr[1])) + (highSpeedVideoFpsRangesFor3 * dArr[2]))) / 100.0f;
        return f <= 0.008856452f ? f * 903.2963f : (((float) java.lang.Math.cbrt(f)) * 116.0f) - 16.0f;
    }
}
