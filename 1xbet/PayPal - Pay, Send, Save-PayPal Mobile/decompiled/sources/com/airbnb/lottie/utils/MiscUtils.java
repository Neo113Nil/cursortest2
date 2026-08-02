package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class MiscUtils {
    private static final android.graphics.PointF getHighSpeedVideoFpsRangesFor = new android.graphics.PointF();

    public static boolean contains(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static double lerp(double d, double d2, double d3) {
        return d + (d3 * (d2 - d));
    }

    public static float lerp(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int lerp(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static android.graphics.PointF addPoints(android.graphics.PointF pointF, android.graphics.PointF pointF2) {
        return new android.graphics.PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void getPathFromData(com.airbnb.lottie.model.content.ShapeData shapeData, android.graphics.Path path) {
        path.reset();
        android.graphics.PointF initialPoint = shapeData.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        getHighSpeedVideoFpsRangesFor.set(initialPoint.x, initialPoint.y);
        for (int i = 0; i < shapeData.getCurves().size(); i++) {
            com.airbnb.lottie.model.CubicCurveData cubicCurveData = shapeData.getCurves().get(i);
            android.graphics.PointF controlPoint1 = cubicCurveData.getControlPoint1();
            android.graphics.PointF controlPoint2 = cubicCurveData.getControlPoint2();
            android.graphics.PointF vertex = cubicCurveData.getVertex();
            android.graphics.PointF pointF = getHighSpeedVideoFpsRangesFor;
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
            } else {
                path.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
        }
        if (shapeData.isClosed()) {
            path.close();
        }
    }

    public static int clamp(int i, int i2, int i3) {
        return java.lang.Math.max(i2, java.lang.Math.min(i3, i));
    }

    public static float clamp(float f, float f2, float f3) {
        return java.lang.Math.max(f2, java.lang.Math.min(f3, f));
    }

    public static double clamp(double d, double d2, double d3) {
        return java.lang.Math.max(d2, java.lang.Math.min(d3, d));
    }

    public static void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2, com.airbnb.lottie.animation.content.KeyPathElementContent keyPathElementContent) {
        if (keyPath.fullyResolvesTo(keyPathElementContent.getName(), i)) {
            list.add(keyPath2.addKey(keyPathElementContent.getName()).resolve(keyPathElementContent));
        }
    }

    static int Camera2StreamConfigurationMap(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i % i2 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }
}
