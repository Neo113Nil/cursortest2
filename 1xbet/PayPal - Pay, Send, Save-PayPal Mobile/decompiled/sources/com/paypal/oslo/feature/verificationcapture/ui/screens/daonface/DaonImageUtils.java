package com.paypal.oslo.feature.verificationcapture.ui.screens.daonface;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/ui/screens/daonface/DaonImageUtils;", "", "<init>", "()V", "Lcom/daon/sdk/face/YUV;", "image", "Landroid/content/Context;", "context", "", "mirror", "Landroid/graphics/Bitmap;", "rotate", "(Lcom/daon/sdk/face/YUV;Landroid/content/Context;Z)Landroid/graphics/Bitmap;", "bitmap", "", "compressBitmapToJPEG", "(Landroid/graphics/Bitmap;)[B", "processImage", "(Lcom/daon/sdk/face/YUV;Landroid/content/Context;)[B"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DaonImageUtils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonImageUtils INSTANCE = new com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonImageUtils();

    private DaonImageUtils() {
    }

    public static /* synthetic */ android.graphics.Bitmap rotate$default(com.paypal.oslo.feature.verificationcapture.ui.screens.daonface.DaonImageUtils daonImageUtils, com.daon.sdk.face.YUV yuv, android.content.Context context, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return daonImageUtils.rotate(yuv, context, z);
    }

    public final byte[] compressBitmapToJPEG(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 80;
        do {
            byteArrayOutputStream.reset();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray.length <= 307200 || i <= 10) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonImageUtils] Compressed image", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("compressed_size_bytes", java.lang.Integer.valueOf(byteArray.length)), kotlin.TuplesKt.to(com.daon.sdk.face.license.License.FEATURE_QUALITY, java.lang.Integer.valueOf(i)), kotlin.TuplesKt.to("target_size_bytes", 307200)), null, 4, null);
                kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray);
                return byteArray;
            }
            i -= 10;
        } while (i > 10);
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonImageUtils] Could not compress image to target size", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("target_size_bytes", 307200)), null, 4, null);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray2, "");
        return byteArray2;
    }

    public final byte[] processImage(com.daon.sdk.face.YUV image, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonImageUtils] Processing image for upload", null, null, 6, null);
        return compressBitmapToJPEG(rotate(image, context, true));
    }

    public final android.graphics.Bitmap rotate(com.daon.sdk.face.YUV image, android.content.Context context, boolean mirror) {
        float f;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService(com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNull(systemService, "");
        int rotation = ((android.view.WindowManager) systemService).getDefaultDisplay().getRotation();
        if (rotation != 0) {
            if (rotation == 1) {
                f = 90.0f;
            } else if (rotation == 2) {
                f = 180.0f;
            } else if (rotation == 3) {
                f = 270.0f;
            }
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonImageUtils] Rotating image", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rotation_degrees", java.lang.Float.valueOf(f)), kotlin.TuplesKt.to("mirror", java.lang.Boolean.valueOf(mirror))), null, 4, null);
            android.graphics.Bitmap rotate = com.daon.sdk.face.BitmapTools.rotate(image.toBitmap(), f, mirror);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rotate, "");
            return rotate;
        }
        f = 0.0f;
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[DaonImageUtils] Rotating image", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("rotation_degrees", java.lang.Float.valueOf(f)), kotlin.TuplesKt.to("mirror", java.lang.Boolean.valueOf(mirror))), null, 4, null);
        android.graphics.Bitmap rotate2 = com.daon.sdk.face.BitmapTools.rotate(image.toBitmap(), f, mirror);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rotate2, "");
        return rotate2;
    }
}
