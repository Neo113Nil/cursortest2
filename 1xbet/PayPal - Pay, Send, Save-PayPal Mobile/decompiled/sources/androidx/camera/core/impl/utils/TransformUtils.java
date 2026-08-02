package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public class TransformUtils {
    public static final android.graphics.RectF NORMALIZED_RECT = new android.graphics.RectF(-1.0f, -1.0f, 1.0f, 1.0f);

    private TransformUtils() {
    }

    public static android.util.Size rectToSize(android.graphics.Rect rect) {
        return new android.util.Size(rect.width(), rect.height());
    }

    public static java.lang.String rectToString(android.graphics.Rect rect) {
        return java.lang.String.format(java.util.Locale.US, "%s(%dx%d)", rect, java.lang.Integer.valueOf(rect.width()), java.lang.Integer.valueOf(rect.height()));
    }

    public static android.graphics.Rect sizeToRect(android.util.Size size) {
        return sizeToRect(size, 0, 0);
    }

    public static android.graphics.Rect sizeToRect(android.util.Size size, int i, int i2) {
        return new android.graphics.Rect(i, i2, size.getWidth() + i, size.getHeight() + i2);
    }

    public static boolean hasCropping(android.graphics.Rect rect, android.util.Size size) {
        return (rect.left == 0 && rect.top == 0 && rect.width() == size.getWidth() && rect.height() == size.getHeight()) ? false : true;
    }

    public static android.graphics.RectF sizeToRectF(android.util.Size size) {
        return sizeToRectF(size, 0, 0);
    }

    public static android.graphics.RectF sizeToRectF(android.util.Size size, int i, int i2) {
        return new android.graphics.RectF(i, i2, i + size.getWidth(), i2 + size.getHeight());
    }

    public static android.util.Size reverseSize(android.util.Size size) {
        return new android.util.Size(size.getHeight(), size.getWidth());
    }

    public static android.util.SizeF reverseSizeF(android.util.SizeF sizeF) {
        return new android.util.SizeF(sizeF.getHeight(), sizeF.getWidth());
    }

    public static android.util.Size rotateSize(android.util.Size size, int i) {
        androidx.core.util.Preconditions.checkArgument(i % 90 == 0, "Invalid rotation degrees: ".concat(java.lang.String.valueOf(i)));
        return is90or270(within360(i)) ? reverseSize(size) : size;
    }

    public static android.graphics.RectF rotateRect(android.graphics.RectF rectF, int i) {
        androidx.core.util.Preconditions.checkArgument(i % 90 == 0, "Invalid rotation degrees: ".concat(java.lang.String.valueOf(i)));
        return is90or270(within360(i)) ? new android.graphics.RectF(0.0f, 0.0f, rectF.height(), rectF.width()) : rectF;
    }

    public static boolean isMirrored(android.graphics.Matrix matrix) {
        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
        matrix.mapVectors(fArr);
        return calculateSignedAngle(fArr[0], fArr[1], fArr[2], fArr[3]) > 0.0f;
    }

    public static float calculateSignedAngle(float f, float f2, float f3, float f4) {
        double sqrt = java.lang.Math.sqrt((f * f) + (f2 * f2)) * java.lang.Math.sqrt((f3 * f3) + (f4 * f4));
        return (float) java.lang.Math.toDegrees(java.lang.Math.atan2(((f * f4) - (f2 * f3)) / sqrt, ((f * f3) + (f2 * f4)) / sqrt));
    }

    public static android.util.Size getRotatedSize(android.graphics.Rect rect, int i) {
        return rotateSize(rectToSize(rect), i);
    }

    public static int within360(int i) {
        return ((i % 360) + 360) % 360;
    }

    public static android.graphics.RectF verticesToRect(float[] fArr) {
        return new android.graphics.RectF(min(fArr[0], fArr[2], fArr[4], fArr[6]), min(fArr[1], fArr[3], fArr[5], fArr[7]), max(fArr[0], fArr[2], fArr[4], fArr[6]), max(fArr[1], fArr[3], fArr[5], fArr[7]));
    }

    public static float max(float f, float f2, float f3, float f4) {
        return java.lang.Math.max(java.lang.Math.max(f, f2), java.lang.Math.max(f3, f4));
    }

    public static float min(float f, float f2, float f3, float f4) {
        return java.lang.Math.min(java.lang.Math.min(f, f2), java.lang.Math.min(f3, f4));
    }

    public static boolean is90or270(int i) {
        if (i == 90 || i == 270) {
            return true;
        }
        if (i == 0 || i == 180) {
            return false;
        }
        throw new java.lang.IllegalArgumentException("Invalid rotation degrees: ".concat(java.lang.String.valueOf(i)));
    }

    public static float[] sizeToVertices(android.util.Size size) {
        return new float[]{0.0f, 0.0f, size.getWidth(), 0.0f, size.getWidth(), size.getHeight(), 0.0f, size.getHeight()};
    }

    public static float[] rectToVertices(android.graphics.RectF rectF) {
        return new float[]{rectF.left, rectF.top, rectF.right, rectF.top, rectF.right, rectF.bottom, rectF.left, rectF.bottom};
    }

    public static boolean isAspectRatioMatchingWithRoundingError(android.util.Size size, android.util.Size size2) {
        return isAspectRatioMatchingWithRoundingError(size, false, size2, false);
    }

    public static boolean isAspectRatioMatchingWithRoundingError(android.util.Size size, boolean z, android.util.Size size2, boolean z2) {
        float width;
        float width2;
        float width3;
        float width4;
        if (z) {
            width = size.getWidth() / size.getHeight();
            width2 = width;
        } else {
            width = (size.getWidth() + 1.0f) / (size.getHeight() - 1.0f);
            width2 = (size.getWidth() - 1.0f) / (size.getHeight() + 1.0f);
        }
        if (z2) {
            width3 = size2.getWidth() / size2.getHeight();
            width4 = width3;
        } else {
            width3 = (size2.getWidth() - 1.0f) / (size2.getHeight() + 1.0f);
            width4 = (size2.getWidth() + 1.0f) / (size2.getHeight() - 1.0f);
        }
        return width >= width3 && width4 >= width2;
    }

    public static android.graphics.Matrix getRectToRect(android.graphics.RectF rectF, android.graphics.RectF rectF2, int i) {
        return getRectToRect(rectF, rectF2, i, false);
    }

    public static android.graphics.Matrix getRectToRect(android.graphics.RectF rectF, android.graphics.RectF rectF2, int i, boolean z) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(rectF, NORMALIZED_RECT, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        matrix.postConcat(getNormalizedToBuffer(rectF2));
        return matrix;
    }

    public static android.graphics.Matrix getNormalizedToBuffer(android.graphics.Rect rect) {
        return getNormalizedToBuffer(new android.graphics.RectF(rect));
    }

    public static android.graphics.Matrix updateSensorToBufferTransform(android.graphics.Matrix matrix, android.graphics.Rect rect) {
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(matrix);
        matrix2.postTranslate(-rect.left, -rect.top);
        return matrix2;
    }

    public static android.graphics.Matrix getNormalizedToBuffer(android.graphics.RectF rectF) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setRectToRect(NORMALIZED_RECT, rectF, android.graphics.Matrix.ScaleToFit.FILL);
        return matrix;
    }

    public static android.graphics.Matrix getExifTransform(int i, int i2, int i3) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float f = i2;
        float f2 = i3;
        android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, f, f2);
        android.graphics.RectF rectF2 = NORMALIZED_RECT;
        matrix.setRectToRect(rectF, rectF2, android.graphics.Matrix.ScaleToFit.FILL);
        switch (i) {
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postScale(1.0f, -1.0f);
                break;
            case 5:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(270.0f);
                rectF = new android.graphics.RectF(0.0f, 0.0f, f2, f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                rectF = new android.graphics.RectF(0.0f, 0.0f, f2, f);
                break;
            case 7:
                matrix.postScale(-1.0f, 1.0f);
                matrix.postRotate(90.0f);
                rectF = new android.graphics.RectF(0.0f, 0.0f, f2, f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                rectF = new android.graphics.RectF(0.0f, 0.0f, f2, f);
                break;
        }
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        matrix2.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    public static int getRotationDegrees(android.graphics.Matrix matrix) {
        matrix.getValues(new float[9]);
        return within360((int) java.lang.Math.round(java.lang.Math.atan2(r0[3], r0[0]) * 57.29577951308232d));
    }
}
