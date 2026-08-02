package com.paypal.oslo.feature.userprofile.domain.utils;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00128\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/utils/PhotoValidationUtils;", "", "<init>", "()V", "Landroid/net/Uri;", "photoUri", "Landroid/content/Context;", "context", "Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "validateFileFormat", "(Landroid/net/Uri;Landroid/content/Context;)Lcom/paypal/oslo/feature/userprofile/domain/model/PhotoUploadError;", "validateFileSize", "uri", "", "getMimeType", "(Landroid/net/Uri;Landroid/content/Context;)Ljava/lang/String;", "getPhotoSizeExceededMessage", "(Landroid/content/Context;)Ljava/lang/String;", "", "getFileSize", "(Landroid/net/Uri;Landroid/content/Context;)J", "", "MAX_FILE_SIZE_MB", com.visa.cbp.getEncExpo.warmup, "MAX_FILE_SIZE_BYTES", "J", "", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhotoValidationUtils {
    public static final long MAX_FILE_SIZE_BYTES = 4194304;
    public static final int MAX_FILE_SIZE_MB = 4;
    public static final com.paypal.oslo.feature.userprofile.domain.utils.PhotoValidationUtils INSTANCE = new com.paypal.oslo.feature.userprofile.domain.utils.PhotoValidationUtils();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.String[]{"image/jpeg", "image/jpg", androidx.media3.common.MimeTypes.IMAGE_PNG, "image/webp"});
    public static final int $stable = 8;

    private PhotoValidationUtils() {
    }

    public final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError validateFileFormat(android.net.Uri photoUri, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String mimeType = getMimeType(photoUri, context);
        if (mimeType == null || !getHighSpeedVideoFpsRanges.contains(mimeType)) {
            return com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.InvalidFileFormat.INSTANCE;
        }
        return null;
    }

    public final com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError validateFileSize(android.net.Uri photoUri, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        long fileSize = getFileSize(photoUri, context);
        if (fileSize > 4194304) {
            return new com.paypal.oslo.feature.userprofile.domain.model.PhotoUploadError.FileTooLarge(fileSize / 1048576.0d);
        }
        return null;
    }

    public final java.lang.String getMimeType(android.net.Uri uri, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(uri.getScheme(), "content")) {
            return context.getContentResolver().getType(uri);
        }
        java.lang.String fileExtensionFromUrl = android.webkit.MimeTypeMap.getFileExtensionFromUrl(uri.toString());
        android.webkit.MimeTypeMap singleton = android.webkit.MimeTypeMap.getSingleton();
        kotlin.jvm.internal.Intrinsics.checkNotNull(fileExtensionFromUrl);
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = fileExtensionFromUrl.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    public final java.lang.String getPhotoSizeExceededMessage(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String string = context.getString(com.paypal.oslo.feature.userprofile.R.string.feature_user_profile_image_size_exceeded, "4");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long getFileSize(android.net.Uri uri, android.content.Context context) {
        java.lang.Object m23436constructorimpl;
        java.lang.String scheme;
        long j;
        java.lang.String path;
        android.database.Cursor query;
        int columnIndex;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.paypal.oslo.feature.userprofile.domain.utils.PhotoValidationUtils photoValidationUtils = this;
            scheme = uri.getScheme();
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (scheme != null) {
            int hashCode = scheme.hashCode();
            if (hashCode != 3143036) {
                if (hashCode == 951530617 && scheme.equals("content") && (query = context.getContentResolver().query(uri, new java.lang.String[]{"_size"}, null, null, null)) != null) {
                    android.database.Cursor cursor = query;
                    try {
                        android.database.Cursor cursor2 = cursor;
                        j = (!cursor2.moveToFirst() || (columnIndex = cursor2.getColumnIndex("_size")) == -1) ? 0L : cursor2.getLong(columnIndex);
                        kotlin.io.CloseableKt.closeFinally(cursor, null);
                    } finally {
                    }
                }
            } else if (scheme.equals("file") && (path = uri.getPath()) != null) {
                j = new java.io.File(path).length();
            }
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Long.valueOf(j));
            if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
                m23436constructorimpl = 0L;
            }
            return ((java.lang.Number) m23436constructorimpl).longValue();
        }
        j = 0;
        m23436constructorimpl = kotlin.Result.m23436constructorimpl(java.lang.Long.valueOf(j));
        if (kotlin.Result.m23439exceptionOrNullimpl(m23436constructorimpl) != null) {
        }
        return ((java.lang.Number) m23436constructorimpl).longValue();
    }
}
