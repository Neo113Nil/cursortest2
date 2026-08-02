package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public abstract class o1 {
    public static final android.graphics.Bitmap a(android.graphics.Bitmap bitmap, int i, android.graphics.Rect rect, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preRotate(i);
        if (z) {
            if (i == 90 || i == 270) {
                matrix.postScale(454.0f / rect.width(), 454.0f / rect.width());
            } else {
                matrix.postScale(454.0f / rect.height(), 454.0f / rect.height());
            }
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height(), matrix, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
        return createBitmap;
    }
}
