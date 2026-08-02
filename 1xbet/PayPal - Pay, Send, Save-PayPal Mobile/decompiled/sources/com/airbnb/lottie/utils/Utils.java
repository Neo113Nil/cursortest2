package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public final class Utils {
    public static final int SECOND_IN_NANOS = 1000000000;
    public static final android.graphics.Matrix IDENTITY_MATRIX = new android.graphics.Matrix();
    private static final java.lang.ThreadLocal<android.graphics.PathMeasure> getHighSpeedVideoFpsRanges = new java.lang.ThreadLocal<android.graphics.PathMeasure>() { // from class: com.airbnb.lottie.utils.Utils.1
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ android.graphics.PathMeasure initialValue() {
            return new android.graphics.PathMeasure();
        }
    };
    private static final java.lang.ThreadLocal<android.graphics.Path> getHighSpeedVideoSizes = new java.lang.ThreadLocal<android.graphics.Path>() { // from class: com.airbnb.lottie.utils.Utils.2
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ android.graphics.Path initialValue() {
            return new android.graphics.Path();
        }
    };
    private static final java.lang.ThreadLocal<android.graphics.Path> getHighSpeedVideoFpsRangesFor = new java.lang.ThreadLocal<android.graphics.Path>() { // from class: com.airbnb.lottie.utils.Utils.3
        @Override // java.lang.ThreadLocal
        protected /* synthetic */ android.graphics.Path initialValue() {
            return new android.graphics.Path();
        }
    };
    private static final java.lang.ThreadLocal<float[]> getHighResolutionOutputSizeshNQ4ISI = new java.lang.ThreadLocal<float[]>() { // from class: com.airbnb.lottie.utils.Utils.4
        @Override // java.lang.ThreadLocal
        protected /* bridge */ /* synthetic */ float[] initialValue() {
            return new float[4];
        }
    };
    private static final float Camera2StreamConfigurationMap = (float) (java.lang.Math.sqrt(2.0d) / 2.0d);

    public static int hashFor(float f, float f2, float f3, float f4) {
        int i = f != 0.0f ? (int) (f * 527.0f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        return f4 != 0.0f ? (int) (i * 31 * f4) : i;
    }

    public static boolean isAtLeastVersion(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static int mixOpacities(int i, int i2) {
        return (int) ((((i / 255.0f) * i2) / 255.0f) * 255.0f);
    }

    private Utils() {
    }

    public static android.graphics.Path createPath(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3, android.graphics.PointF pointF4) {
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 != null && pointF4 != null && (pointF3.length() != 0.0f || pointF4.length() != 0.0f)) {
            path.cubicTo(pointF3.x + pointF.x, pointF.y + pointF3.y, pointF2.x + pointF4.x, pointF2.y + pointF4.y, pointF2.x, pointF2.y);
            return path;
        }
        path.lineTo(pointF2.x, pointF2.y);
        return path;
    }

    public static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public static float getScale(android.graphics.Matrix matrix) {
        float[] fArr = getHighResolutionOutputSizeshNQ4ISI.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f = Camera2StreamConfigurationMap;
        fArr[2] = f;
        fArr[3] = f;
        matrix.mapPoints(fArr);
        return (float) java.lang.Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean hasZeroScaleAxis(android.graphics.Matrix matrix) {
        float[] fArr = getHighResolutionOutputSizeshNQ4ISI.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static void applyTrimPathIfNeeded(android.graphics.Path path, com.airbnb.lottie.animation.content.TrimPathContent trimPathContent) {
        if (trimPathContent == null || trimPathContent.isHidden()) {
            return;
        }
        applyTrimPathIfNeeded(path, ((com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation) trimPathContent.getStart()).getFloatValue() / 100.0f, ((com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation) trimPathContent.getEnd()).getFloatValue() / 100.0f, ((com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation) trimPathContent.getOffset()).getFloatValue() / 360.0f);
    }

    public static void applyTrimPathIfNeeded(android.graphics.Path path, float f, float f2, float f3) {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("applyTrimPathIfNeeded");
        }
        android.graphics.PathMeasure pathMeasure = getHighSpeedVideoFpsRanges.get();
        android.graphics.Path path2 = getHighSpeedVideoSizes.get();
        android.graphics.Path path3 = getHighSpeedVideoFpsRangesFor.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f == 1.0f && f2 == 0.0f) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (length < 1.0f || java.lang.Math.abs((f2 - f) - 1.0f) < 0.01d) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        float f4 = f * length;
        float f5 = f2 * length;
        float f6 = f3 * length;
        float min = java.lang.Math.min(f4, f5) + f6;
        float max = java.lang.Math.max(f4, f5) + f6;
        if (min >= length && max >= length) {
            min = com.airbnb.lottie.utils.MiscUtils.Camera2StreamConfigurationMap(min, length);
            max = com.airbnb.lottie.utils.MiscUtils.Camera2StreamConfigurationMap(max, length);
        }
        if (min < 0.0f) {
            min = com.airbnb.lottie.utils.MiscUtils.Camera2StreamConfigurationMap(min, length);
        }
        if (max < 0.0f) {
            max = com.airbnb.lottie.utils.MiscUtils.Camera2StreamConfigurationMap(max, length);
        }
        if (min == max) {
            path.reset();
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("applyTrimPathIfNeeded");
                return;
            }
            return;
        }
        if (min >= max) {
            min -= length;
        }
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
            path2.addPath(path3);
        } else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("applyTrimPathIfNeeded");
        }
    }

    public static float dpScale() {
        return android.content.res.Resources.getSystem().getDisplayMetrics().density;
    }

    public static float getAnimationScale(android.content.Context context) {
        return android.provider.Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
    }

    public static android.graphics.Bitmap resizeBitmapIfNeeded(android.graphics.Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static boolean isNetworkException(java.lang.Throwable th) {
        return (th instanceof java.net.SocketException) || (th instanceof java.nio.channels.ClosedChannelException) || (th instanceof java.io.InterruptedIOException) || (th instanceof java.net.ProtocolException) || (th instanceof javax.net.ssl.SSLException) || (th instanceof java.net.UnknownHostException) || (th instanceof java.net.UnknownServiceException);
    }

    public static void saveLayerCompat(android.graphics.Canvas canvas, android.graphics.RectF rectF, android.graphics.Paint paint) {
        saveLayerCompat(canvas, rectF, paint, 31);
    }

    public static void saveLayerCompat(android.graphics.Canvas canvas, android.graphics.RectF rectF, android.graphics.Paint paint, int i) {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("Utils#saveLayer");
        }
        canvas.saveLayer(rectF, paint);
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("Utils#saveLayer");
        }
    }

    public static android.graphics.Bitmap renderPath(android.graphics.Path path) {
        android.graphics.RectF rectF = new android.graphics.RectF();
        path.computeBounds(rectF, false);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, android.graphics.Bitmap.Config.ARGB_8888);
        android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
        com.airbnb.lottie.animation.LPaint lPaint = new com.airbnb.lottie.animation.LPaint();
        lPaint.setAntiAlias(true);
        lPaint.setColor(-16776961);
        canvas.drawPath(path, lPaint);
        return createBitmap;
    }
}
