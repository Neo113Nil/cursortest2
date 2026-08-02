package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class MatrixExt {
    private static final float[] getHighSpeedVideoFpsRangesFor = new float[16];

    private MatrixExt() {
    }

    public static void setRotate(float[] fArr, float f, float f2, float f3) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        preRotate(fArr, f, f2, f3);
    }

    public static void postRotate(float[] fArr, float f, float f2, float f3) {
        float[] fArr2 = getHighSpeedVideoFpsRangesFor;
        synchronized (fArr2) {
            android.opengl.Matrix.setIdentityM(fArr2, 0);
            android.opengl.Matrix.translateM(fArr2, 0, f2, f3, 0.0f);
            android.opengl.Matrix.rotateM(fArr2, 0, f, 0.0f, 0.0f, 1.0f);
            android.opengl.Matrix.translateM(fArr2, 0, -f2, -f3, 0.0f);
            android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    public static java.lang.String toString(float[] fArr, int i) {
        return java.lang.String.format(java.util.Locale.US, "Matrix:\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f\n%2.1f %2.1f %2.1f %2.1f", java.lang.Float.valueOf(fArr[i]), java.lang.Float.valueOf(fArr[i + 4]), java.lang.Float.valueOf(fArr[i + 8]), java.lang.Float.valueOf(fArr[i + 12]), java.lang.Float.valueOf(fArr[i + 1]), java.lang.Float.valueOf(fArr[i + 5]), java.lang.Float.valueOf(fArr[i + 9]), java.lang.Float.valueOf(fArr[i + 13]), java.lang.Float.valueOf(fArr[i + 2]), java.lang.Float.valueOf(fArr[i + 6]), java.lang.Float.valueOf(fArr[i + 10]), java.lang.Float.valueOf(fArr[i + 14]), java.lang.Float.valueOf(fArr[i + 3]), java.lang.Float.valueOf(fArr[i + 7]), java.lang.Float.valueOf(fArr[i + 11]), java.lang.Float.valueOf(fArr[i + 15]));
    }

    public static void preRotate(float[] fArr, float f, float f2, float f3) {
        android.opengl.Matrix.translateM(fArr, 0, f2, f3, 0.0f);
        android.opengl.Matrix.rotateM(fArr, 0, f, 0.0f, 0.0f, 1.0f);
        android.opengl.Matrix.translateM(fArr, 0, -f2, -f3, 0.0f);
    }

    public static void preVerticalFlip(float[] fArr, float f) {
        android.opengl.Matrix.translateM(fArr, 0, 0.0f, f, 0.0f);
        android.opengl.Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        android.opengl.Matrix.translateM(fArr, 0, -0.0f, -f, 0.0f);
    }
}
