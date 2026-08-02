package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class Transform3D {
    public static void applyTransform(android.graphics.Matrix matrix, android.graphics.PointF pointF, android.graphics.PointF pointF2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        matrix.reset();
        if (pointF2 != null && (pointF2.x != 0.0f || pointF2.y != 0.0f)) {
            matrix.preTranslate(pointF2.x, pointF2.y);
        }
        if (f5 != 0.0f) {
            matrix.preRotate(f5);
        }
        if (f4 != 0.0f) {
            matrix.preScale(f7, 1.0f);
        }
        if (f3 != 0.0f) {
            matrix.preScale(1.0f, f6);
        }
        if (f != 1.0f || f2 != 1.0f) {
            matrix.preScale(f, f2);
        }
        if (pointF != null) {
            if (pointF.x == 0.0f && pointF.y == 0.0f) {
                return;
            }
            matrix.preTranslate(-pointF.x, -pointF.y);
        }
    }

    public static void apply3DRotations(android.graphics.Matrix matrix, float f, float f2, float f3, float f4, float f5) {
        if (f3 != 0.0f) {
            matrix.preRotate(f3);
        }
        if (f2 != 0.0f) {
            matrix.preScale(f5, 1.0f);
        }
        if (f != 0.0f) {
            matrix.preScale(1.0f, f4);
        }
    }

    public static boolean has3DRotation(java.lang.Float f, java.lang.Float f2, java.lang.Float f3) {
        if (f != null && f.floatValue() != 0.0f) {
            return true;
        }
        if (f2 == null || f2.floatValue() == 0.0f) {
            return (f3 == null || f3.floatValue() == 0.0f) ? false : true;
        }
        return true;
    }
}
