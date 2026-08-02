package androidx.core.content.res;

/* loaded from: classes3.dex */
final class CamUtils {
    static final float[][] getHighResolutionOutputSizeshNQ4ISI = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    static final float[][] getHighSpeedVideoSizes = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    static final float[] getHighSpeedVideoFpsRanges = {95.047f, 100.0f, 108.883f};
    static final float[][] getHighSpeedVideoFpsRangesFor = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};

    static float getHighSpeedVideoFpsRanges(float f, float f2, float f3) {
        return 0.69f;
    }

    private CamUtils() {
    }

    static int getHighSpeedVideoFpsRangesFor(float f) {
        if (f < 1.0f) {
            return -16777216;
        }
        if (f > 99.0f) {
            return -1;
        }
        float f2 = (f + 16.0f) / 116.0f;
        float f3 = f > 8.0f ? f2 * f2 * f2 : f / 903.2963f;
        float f4 = f2 * f2 * f2;
        boolean z = f4 > 0.008856452f;
        float f5 = z ? f4 : ((f2 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f4 = ((f2 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = getHighSpeedVideoFpsRanges;
        return androidx.core.graphics.ColorUtils.XYZToColor(f5 * fArr[0], f3 * fArr[1], f4 * fArr[2]);
    }

    static void getHighSpeedVideoFpsRangesFor(int i, float[] fArr) {
        float Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(android.graphics.Color.red(i));
        float Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(android.graphics.Color.green(i));
        float Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(android.graphics.Color.blue(i));
        float[][] fArr2 = getHighSpeedVideoFpsRangesFor;
        float[] fArr3 = fArr2[0];
        fArr[0] = (fArr3[0] * Camera2StreamConfigurationMap) + (fArr3[1] * Camera2StreamConfigurationMap2) + (fArr3[2] * Camera2StreamConfigurationMap3);
        float[] fArr4 = fArr2[1];
        fArr[1] = (fArr4[0] * Camera2StreamConfigurationMap) + (fArr4[1] * Camera2StreamConfigurationMap2) + (fArr4[2] * Camera2StreamConfigurationMap3);
        float[] fArr5 = fArr2[2];
        fArr[2] = (Camera2StreamConfigurationMap * fArr5[0]) + (Camera2StreamConfigurationMap2 * fArr5[1]) + (Camera2StreamConfigurationMap3 * fArr5[2]);
    }

    static float getHighSpeedVideoSizes(float f) {
        return ((float) java.lang.Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    private static float Camera2StreamConfigurationMap(int i) {
        float f = i / 255.0f;
        return (f <= 0.04045f ? f / 12.92f : (float) java.lang.Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    static float getHighResolutionOutputSizeshNQ4ISI(int i) {
        float Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(android.graphics.Color.red(i));
        float Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(android.graphics.Color.green(i));
        float Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(android.graphics.Color.blue(i));
        float[] fArr = getHighSpeedVideoFpsRangesFor[1];
        float f = (((Camera2StreamConfigurationMap * fArr[0]) + (Camera2StreamConfigurationMap2 * fArr[1])) + (Camera2StreamConfigurationMap3 * fArr[2])) / 100.0f;
        return f <= 0.008856452f ? f * 903.2963f : (((float) java.lang.Math.cbrt(f)) * 116.0f) - 16.0f;
    }
}
