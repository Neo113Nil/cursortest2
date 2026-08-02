package com.paypal.oslo.feature.revolvingcreditacquisition.utils;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroid/content/Context;", "", "phoneNumber", "", "launchDialer", "(Landroid/content/Context;Ljava/lang/String;)V", "context", "Ljava/io/File;", "createImageFile", "(Landroid/content/Context;)Ljava/io/File;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ContextExtensionsKt {
    public static final void launchDialer(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL");
        intent.setData(android.net.Uri.parse("tel:".concat(java.lang.String.valueOf(str))));
        try {
            context.startActivity(intent);
        } catch (android.content.ActivityNotFoundException e) {
            com.paypal.oslo.feature.revolvingcreditacquisition.LoggerKt.log.e("Error launching dialer", e);
        }
    }

    public static final java.io.File createImageFile(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String concat = com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_PREFIX.concat(java.lang.String.valueOf(new java.text.SimpleDateFormat(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_DATE_FORMAT, java.util.Locale.getDefault()).format(new java.util.Date())));
        java.io.File file = new java.io.File(context.getFilesDir(), "downloads");
        if (!file.exists()) {
            file.mkdirs();
        }
        java.io.File createTempFile = java.io.File.createTempFile(concat, com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX, file);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createTempFile, "");
        return createTempFile;
    }
}
