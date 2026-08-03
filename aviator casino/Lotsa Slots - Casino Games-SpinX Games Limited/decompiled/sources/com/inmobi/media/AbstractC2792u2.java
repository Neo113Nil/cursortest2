package com.inmobi.media;

/* renamed from: com.inmobi.media.u2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2792u2 implements com.inmobi.media.M0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.core.config.models.AdConfig.AdQualityConfig f5477a;

    public AbstractC2792u2(com.inmobi.media.core.config.models.AdConfig.AdQualityConfig adQualityConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adQualityConfig, "adQualityConfig");
        this.f5477a = adQualityConfig;
    }

    public final android.graphics.Bitmap a(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        double resizedPercentage = (this.f5477a.getResizedPercentage() / 100.0d) * bitmap.getWidth();
        double resizedPercentage2 = (this.f5477a.getResizedPercentage() / 100.0d) * bitmap.getHeight();
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, (int) resizedPercentage, (int) resizedPercentage2, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int length = byteArrayOutputStream.toByteArray().length;
        if (length <= this.f5477a.getMaxImageSize()) {
            return createScaledBitmap;
        }
        while (length > this.f5477a.getMaxImageSize()) {
            double sqrt = java.lang.Math.sqrt(this.f5477a.getMaxImageSize() / length);
            resizedPercentage *= sqrt;
            resizedPercentage2 *= sqrt;
            if (java.lang.Math.floor(resizedPercentage) <= 0.0d && java.lang.Math.floor(resizedPercentage2) <= 0.0d) {
                return createScaledBitmap;
            }
            createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(createScaledBitmap, (int) java.lang.Math.floor(resizedPercentage), (int) java.lang.Math.floor(resizedPercentage2), true);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            byteArrayOutputStream.reset();
            createScaledBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            length = byteArrayOutputStream.toByteArray().length;
        }
        byteArrayOutputStream.size();
        return createScaledBitmap;
    }
}
