package com.ingo.sdk.android.core.ux.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\t"}, d2 = {"Lcom/ingo/sdk/android/core/ux/utils/ImageResizer;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "", "MAX_SIZE", "reduceBitmapSize", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "THUMB_SIZE", "generateThumb"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ImageResizer {
    public static final com.ingo.sdk.android.core.ux.utils.ImageResizer INSTANCE = new com.ingo.sdk.android.core.ux.utils.ImageResizer();

    private ImageResizer() {
    }

    public final android.graphics.Bitmap reduceBitmapSize(android.graphics.Bitmap bitmap, int MAX_SIZE) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        double d = (height * width) / MAX_SIZE;
        if (d <= 1.0d) {
            return bitmap;
        }
        double sqrt = java.lang.Math.sqrt(d);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Image Ratio: ".concat(java.lang.String.valueOf(sqrt)), null, 2, null);
        return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.round(width / sqrt), (int) java.lang.Math.round(height / sqrt), true);
    }

    public final android.graphics.Bitmap generateThumb(android.graphics.Bitmap bitmap, int THUMB_SIZE) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        double d = (height * width) / THUMB_SIZE;
        if (d <= 1.0d) {
            return bitmap;
        }
        double sqrt = java.lang.Math.sqrt(d);
        com.ingo.sdk.kotlin.common.core.logging.IngoLogger.d$default(com.ingo.sdk.kotlin.ux.IngoCoreKt.getIngoLogging(), "Image Ratio: ".concat(java.lang.String.valueOf(sqrt)), null, 2, null);
        return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.round(width / sqrt), (int) java.lang.Math.round(height / sqrt), true);
    }
}
