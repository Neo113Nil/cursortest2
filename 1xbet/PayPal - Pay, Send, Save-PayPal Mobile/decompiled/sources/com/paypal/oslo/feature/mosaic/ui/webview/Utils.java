package com.paypal.oslo.feature.mosaic.ui.webview;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/mosaic/ui/webview/Utils;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/io/File;", "createImageFile$mosaic_prodRelease", "(Landroid/content/Context;)Ljava/io/File;", "", "isCameraAvailable$mosaic_prodRelease", "(Landroid/content/Context;)Z", "isMicroPhoneAvailable$mosaic_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Utils {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.mosaic.ui.webview.Utils INSTANCE = new com.paypal.oslo.feature.mosaic.ui.webview.Utils();

    private Utils() {
    }

    public final java.io.File createImageFile$mosaic_prodRelease(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String format = new java.text.SimpleDateFormat(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_DATE_FORMAT, java.util.Locale.getDefault()).format(new java.util.Date());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        java.io.File externalFilesDir = context.getExternalFilesDir(android.os.Environment.DIRECTORY_PICTURES);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JPEG_");
        sb.append(format);
        sb.append("_");
        java.io.File createTempFile = java.io.File.createTempFile(sb.toString(), com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX, externalFilesDir);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createTempFile, "");
        return createTempFile;
    }

    public final boolean isCameraAvailable$mosaic_prodRelease(android.content.Context context) {
        android.content.pm.PackageManager packageManager;
        return (context == null || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.hardware.camera.any")) ? false : true;
    }

    public final boolean isMicroPhoneAvailable$mosaic_prodRelease(android.content.Context context) {
        android.content.pm.PackageManager packageManager;
        return (context == null || (packageManager = context.getPackageManager()) == null || !packageManager.hasSystemFeature("android.hardware.microphone")) ? false : true;
    }
}
