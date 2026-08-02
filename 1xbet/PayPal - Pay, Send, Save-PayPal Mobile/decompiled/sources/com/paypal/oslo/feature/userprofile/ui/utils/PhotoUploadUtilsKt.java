package com.paypal.oslo.feature.userprofile.ui.utils;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a!\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a?\u0010 \u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!\u001a\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\"\u0010#"}, d2 = {"", "success", "Ljava/io/File;", "photoFile", "Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;", "viewModel", "", "handleCameraCaptureResult", "(ZLjava/io/File;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;)V", "Landroid/net/Uri;", "uri", "handlePhotoPickerResult", "(Landroid/net/Uri;Lcom/paypal/oslo/feature/userprofile/ui/viewmodel/PhotoUploadViewModel;)V", "Landroid/content/Context;", "context", "compressIfRequired", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/net/Uri;", "originalUri", "compressedUri", "deleteCompressedPhoto", "(Landroid/net/Uri;Landroid/net/Uri;)V", "p0", "p1", "Landroid/graphics/BitmapFactory$Options;", "Camera2StreamConfigurationMap", "(Landroid/content/Context;Landroid/net/Uri;)Landroid/graphics/BitmapFactory$Options;", "p2", "", "p3", "p4", "", "p5", "getHighSpeedVideoSizes", "(Landroid/content/Context;Landroid/net/Uri;Landroid/graphics/BitmapFactory$Options;FZJ)Landroid/net/Uri;", "createImageFile", "(Landroid/content/Context;)Ljava/io/File;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PhotoUploadUtilsKt {
    public static final void handlePhotoPickerResult(android.net.Uri uri, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUploadViewModel, "");
        if (uri != null) {
            photoUploadViewModel.handleAction(new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto(uri));
        }
    }

    public static final void deleteCompressedPhoto(android.net.Uri uri, android.net.Uri uri2) {
        java.lang.String path;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri2, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(uri2, uri) || (path = uri2.getPath()) == null || new java.io.File(path).delete()) {
            return;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to delete compressed photo", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", path)), null, 4, null);
    }

    private static final android.graphics.BitmapFactory.Options Camera2StreamConfigurationMap(android.content.Context context, android.net.Uri uri) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream == null) {
            return options;
        }
        java.io.InputStream inputStream = openInputStream;
        try {
            android.graphics.BitmapFactory.decodeStream(inputStream, null, options);
            kotlin.io.CloseableKt.closeFinally(inputStream, null);
            return options;
        } finally {
        }
    }

    private static final android.net.Uri getHighSpeedVideoSizes(android.content.Context context, android.net.Uri uri, android.graphics.BitmapFactory.Options options, float f, boolean z, long j) {
        int i;
        android.graphics.Bitmap createScaledBitmap;
        android.graphics.BitmapFactory.Options options2 = new android.graphics.BitmapFactory.Options();
        if (f < 0.25f) {
            long j2 = options.outWidth * options.outHeight;
            long j3 = (long) (j2 * f);
            i = 1;
            while (j2 / (i * i) > j3 && i < 16) {
                i *= 2;
            }
        } else {
            i = 1;
        }
        options2.inSampleSize = i;
        java.io.InputStream openInputStream = context.getContentResolver().openInputStream(uri);
        if (openInputStream != null) {
            java.io.FileOutputStream fileOutputStream = openInputStream;
            try {
                java.io.File file = null;
                android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(fileOutputStream, null, options2);
                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                if (decodeStream != null) {
                    int i2 = 95;
                    if (z) {
                        try {
                            i2 = kotlin.ranges.RangesKt.coerceIn((int) (95.0f * f), 10, 95);
                        } catch (java.lang.Throwable th) {
                            th = th;
                            createScaledBitmap = decodeStream;
                            createScaledBitmap.recycle();
                            if (decodeStream != createScaledBitmap) {
                                decodeStream.recycle();
                            }
                            if (file != null) {
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to delete temp compressed file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", file.getAbsolutePath())), null, 4, null);
                            }
                            throw th;
                        }
                    }
                    float min = java.lang.Math.min((decodeStream.getWidth() > 4096 || decodeStream.getHeight() > 4096) ? 4096.0f / java.lang.Math.max(decodeStream.getWidth(), decodeStream.getHeight()) : 1.0f, (!z || f >= 0.25f) ? 1.0f : (float) java.lang.Math.sqrt(f / 0.25f));
                    if (min >= 1.0f) {
                        createScaledBitmap = decodeStream;
                    } else {
                        createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(decodeStream, kotlin.ranges.RangesKt.coerceAtLeast((int) (decodeStream.getWidth() * min), 1), kotlin.ranges.RangesKt.coerceAtLeast((int) (decodeStream.getHeight() * min), 1), true);
                        decodeStream.recycle();
                    }
                    try {
                        java.io.File createTempFile = java.io.File.createTempFile("compressed_profile_photo_", com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX, context.getCacheDir());
                        try {
                            fileOutputStream = new java.io.FileOutputStream(createTempFile);
                            try {
                                createScaledBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i2, fileOutputStream);
                                kotlin.io.CloseableKt.closeFinally(fileOutputStream, null);
                                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.userprofile.LoggerKt.log;
                                int i3 = options.outWidth;
                                int i4 = options.outHeight;
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                sb.append(i3);
                                sb.append("x");
                                sb.append(i4);
                                int width = createScaledBitmap.getWidth();
                                int height = createScaledBitmap.getHeight();
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                sb2.append(width);
                                sb2.append("x");
                                sb2.append(height);
                                com.paypal.android.logger.Logger.d$default(logger, "Photo compressed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("originalSizeKB", java.lang.Long.valueOf(j / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)), kotlin.TuplesKt.to("originalResolution", sb.toString()), kotlin.TuplesKt.to("compressedSizeKB", java.lang.Long.valueOf(createTempFile.length() / okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE)), kotlin.TuplesKt.to("compressedResolution", sb2.toString())), null, 4, null);
                                kotlin.jvm.internal.Intrinsics.checkNotNull(createTempFile);
                                android.net.Uri fromFile = android.net.Uri.fromFile(createTempFile);
                                createScaledBitmap.recycle();
                                if (decodeStream != createScaledBitmap && !decodeStream.isRecycled()) {
                                    decodeStream.recycle();
                                }
                                return fromFile;
                            } finally {
                            }
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            file = createTempFile;
                            createScaledBitmap.recycle();
                            if (decodeStream != createScaledBitmap && !decodeStream.isRecycled()) {
                                decodeStream.recycle();
                            }
                            if (file != null && !file.delete()) {
                                com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Failed to delete temp compressed file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", file.getAbsolutePath())), null, 4, null);
                            }
                            throw th;
                        }
                    } catch (java.lang.Throwable th3) {
                        th = th3;
                    }
                }
            } finally {
            }
        }
        return uri;
    }

    public static final java.io.File createImageFile(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.String format = new java.text.SimpleDateFormat(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_DATE_FORMAT, java.util.Locale.getDefault()).format(new java.util.Date());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PROFILE_");
        sb.append(format);
        sb.append(com.paypal.oslo.feature.revolvingcreditacquisition.utils.FileNameConstants.IMAGE_FILE_SUFFIX);
        java.lang.String obj = sb.toString();
        java.io.File file = new java.io.File(context.getCacheDir(), "camera_images");
        if (!file.exists()) {
            file.mkdirs();
        }
        return new java.io.File(file, obj);
    }

    public static final void handleCameraCaptureResult(boolean z, java.io.File file, com.paypal.oslo.feature.userprofile.ui.viewmodel.PhotoUploadViewModel photoUploadViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(file, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photoUploadViewModel, "");
        if (z) {
            photoUploadViewModel.handleAction(new com.paypal.oslo.feature.userprofile.ui.model.PhotoUploadAction.UploadPhoto(android.net.Uri.fromFile(file)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044 A[Catch: Exception -> 0x003b, CancellationException -> 0x006d, TryCatch #2 {CancellationException -> 0x006d, Exception -> 0x003b, blocks: (B:3:0x0008, B:5:0x0014, B:7:0x001c, B:10:0x0030, B:12:0x0036, B:18:0x0044, B:19:0x004b), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.net.Uri compressIfRequired(android.content.Context context, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        try {
            long fileSize = com.paypal.oslo.feature.userprofile.domain.utils.PhotoValidationUtils.INSTANCE.getFileSize(uri, context);
            java.lang.Long valueOf = fileSize > 0 ? java.lang.Long.valueOf(fileSize) : null;
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                android.graphics.BitmapFactory.Options Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, uri);
                boolean z = false;
                boolean z2 = longValue > 4194304;
                if (Camera2StreamConfigurationMap.outWidth <= 4096) {
                    if (Camera2StreamConfigurationMap.outHeight > 4096) {
                    }
                    if (!z2 || z) {
                        return getHighSpeedVideoSizes(context, uri, Camera2StreamConfigurationMap, !z2 ? 4194304.0f / longValue : 1.0f, z2, longValue);
                    }
                }
                z = true;
                if (!z2) {
                }
                return getHighSpeedVideoSizes(context, uri, Camera2StreamConfigurationMap, !z2 ? 4194304.0f / longValue : 1.0f, z2, longValue);
            }
            return uri;
        } catch (java.util.concurrent.CancellationException e) {
            throw e;
        } catch (java.lang.Exception e2) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.userprofile.LoggerKt.log, "Photo compression failed, using original uri", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error", e2.getMessage())), null, 4, null);
            return uri;
        }
    }
}
