package androidx.camera.core.internal;

/* loaded from: classes6.dex */
public class ViewPorts {
    private ViewPorts() {
    }

    public static java.util.Map<androidx.camera.core.UseCase, android.graphics.Rect> calculateViewPortRects(android.graphics.Rect rect, boolean z, android.util.Rational rational, int i, int i2, int i3, java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> map) {
        androidx.core.util.Preconditions.checkArgument(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        android.graphics.RectF rectF = new android.graphics.RectF(rect);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.graphics.RectF rectF2 = new android.graphics.RectF(rect);
        for (java.util.Map.Entry<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> entry : map.entrySet()) {
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            android.graphics.RectF rectF3 = new android.graphics.RectF(0.0f, 0.0f, entry.getValue().getResolution().getWidth(), entry.getValue().getResolution().getHeight());
            matrix.setRectToRect(rectF3, rectF, android.graphics.Matrix.ScaleToFit.CENTER);
            hashMap.put(entry.getKey(), matrix);
            android.graphics.RectF rectF4 = new android.graphics.RectF();
            matrix.mapRect(rectF4, rectF3);
            rectF2.intersect(rectF4);
        }
        android.graphics.RectF scaledRect = getScaledRect(rectF2, androidx.camera.core.internal.utils.ImageUtil.getRotatedAspectRatio(i, rational), i2, z, i3, i);
        java.util.HashMap hashMap2 = new java.util.HashMap();
        android.graphics.RectF rectF5 = new android.graphics.RectF();
        android.graphics.Matrix matrix2 = new android.graphics.Matrix();
        for (java.util.Map.Entry entry2 : hashMap.entrySet()) {
            ((android.graphics.Matrix) entry2.getValue()).invert(matrix2);
            matrix2.mapRect(rectF5, scaledRect);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            rectF5.round(rect2);
            hashMap2.put((androidx.camera.core.UseCase) entry2.getKey(), rect2);
        }
        return hashMap2;
    }

    public static android.graphics.RectF getScaledRect(android.graphics.RectF rectF, android.util.Rational rational, int i, boolean z, int i2, int i3) {
        if (i == 3) {
            return rectF;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.RectF rectF2 = new android.graphics.RectF(0.0f, 0.0f, rational.getNumerator(), rational.getDenominator());
        if (i == 0) {
            matrix.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.START);
        } else if (i == 1) {
            matrix.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.CENTER);
        } else if (i == 2) {
            matrix.setRectToRect(rectF2, rectF, android.graphics.Matrix.ScaleToFit.END);
        } else {
            throw new java.lang.IllegalStateException("Unexpected scale type: ".concat(java.lang.String.valueOf(i)));
        }
        android.graphics.RectF rectF3 = new android.graphics.RectF();
        matrix.mapRect(rectF3, rectF2);
        boolean z2 = z ^ (i2 == 1);
        boolean z3 = i3 == 0 && !z2;
        boolean z4 = i3 == 90 && z2;
        if (z3 || z4) {
            return rectF3;
        }
        boolean z5 = i3 == 0 && z2;
        boolean z6 = i3 == 270 && !z2;
        if (z5 || z6) {
            return getHighSpeedVideoFpsRanges(rectF3, rectF.centerX());
        }
        boolean z7 = i3 == 90 && !z2;
        boolean z8 = i3 == 180 && z2;
        if (z7 || z8) {
            return getHighSpeedVideoFpsRangesFor(rectF3, rectF.centerY());
        }
        boolean z9 = i3 == 180 && !z2;
        boolean z10 = i3 == 270 && z2;
        if (z9 || z10) {
            return getHighSpeedVideoFpsRanges(getHighSpeedVideoFpsRangesFor(rectF3, rectF.centerY()), rectF.centerX());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid argument: mirrored ");
        sb.append(z2);
        sb.append(" rotation ");
        sb.append(i3);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static android.graphics.RectF getHighSpeedVideoFpsRanges(android.graphics.RectF rectF, float f) {
        float f2 = f + f;
        return new android.graphics.RectF(f2 - rectF.right, rectF.top, f2 - rectF.left, rectF.bottom);
    }

    private static android.graphics.RectF getHighSpeedVideoFpsRangesFor(android.graphics.RectF rectF, float f) {
        float f2 = f + f;
        return new android.graphics.RectF(rectF.left, f2 - rectF.bottom, rectF.right, f2 - rectF.top);
    }
}
