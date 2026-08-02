package com.paypal.oslo.feature.verificationcapture.util;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/util/ImageCompressionUtil;", "", "<init>", "()V", "Landroid/graphics/Bitmap;", "bitmap", "Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;", "metadata", "", "totalCaptureCount", "", "compressForBinder", "(Landroid/graphics/Bitmap;Lcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;I)[B", "compressForFileStorage", "(Landroid/graphics/Bitmap;I)[B", "Ljava/io/File;", "cacheDir", "", com.paypal.oslo.core.network.graphql.interceptor.StepupChallengeInterceptor.FIELD_FLOW_NAME, "compressManualCaptureWithExif", "(Landroid/graphics/Bitmap;Ljava/io/File;Ljava/lang/String;I)[B", "p0", "p1", "getHighSpeedVideoFpsRanges", "([BLcom/paypal/oslo/feature/verificationcapture/navigation/DocumentCaptureNavResult$Success;)I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ImageCompressionUtil {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil INSTANCE = new com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil();

    private ImageCompressionUtil() {
    }

    public static /* synthetic */ byte[] compressForBinder$default(com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil imageCompressionUtil, android.graphics.Bitmap bitmap, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success success, int i, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return imageCompressionUtil.compressForBinder(bitmap, success, i);
    }

    public final byte[] compressForBinder(android.graphics.Bitmap bitmap, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success metadata, int totalCaptureCount) {
        byte[] byteArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadata, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i = 95;
        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 95, byteArrayOutputStream);
        byte[] byteArray2 = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.Intrinsics.checkNotNull(byteArray2);
        if (getHighSpeedVideoFpsRanges(byteArray2, metadata) <= 1048576) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Using default SDK compression", null, null, 6, null);
            return byteArray2;
        }
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] ⚠️ Payload exceeds Binder limit! Applying fallback compression...", null, null, 6, null);
        int max = java.lang.Math.max(1, totalCaptureCount);
        int i2 = (894976 - (max * 1024)) / max;
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        do {
            byteArrayOutputStream2.reset();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream2);
            byteArray = byteArrayOutputStream2.toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            if (getHighSpeedVideoFpsRanges(byteArray, metadata) <= i2) {
                return byteArray;
            }
            i -= 5;
        } while (i >= 50);
        int highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(byteArray, metadata) / 1024;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to compress image to fit Binder limit. Final size: ");
        sb.append(highSpeedVideoFpsRanges);
        sb.append("KB, Target: ");
        sb.append(i2 / 1024);
        sb.append("KB. This should never happen with ID documents.");
        throw new java.lang.IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ byte[] compressForFileStorage$default(com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil imageCompressionUtil, android.graphics.Bitmap bitmap, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        return imageCompressionUtil.compressForFileStorage(bitmap, i);
    }

    public static /* synthetic */ byte[] compressManualCaptureWithExif$default(com.paypal.oslo.feature.verificationcapture.util.ImageCompressionUtil imageCompressionUtil, android.graphics.Bitmap bitmap, java.io.File file, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 8) != 0) {
            i = 1;
        }
        return imageCompressionUtil.compressManualCaptureWithExif(bitmap, file, str, i);
    }

    private static int getHighSpeedVideoFpsRanges(byte[] p0, com.paypal.oslo.feature.verificationcapture.navigation.DocumentCaptureNavResult.Success p1) {
        int length = p0.length;
        byte[] bytes = p1.getDocumentType().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        int length2 = bytes.length;
        byte[] bytes2 = p1.getDocumentSide().getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
        int length3 = length + length2 + bytes2.length;
        java.lang.String documentId = p1.getDocumentId();
        if (documentId != null) {
            byte[] bytes3 = documentId.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes3, "");
            length3 += bytes3.length;
        }
        java.lang.String verificationPlatformId = p1.getVerificationPlatformId();
        if (verificationPlatformId != null) {
            byte[] bytes4 = verificationPlatformId.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes4, "");
            length3 += bytes4.length;
        }
        java.lang.String barcode = p1.getBarcode();
        if (barcode != null) {
            byte[] bytes5 = barcode.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes5, "");
            length3 += bytes5.length;
        }
        java.lang.String extractedData = p1.getExtractedData();
        if (extractedData != null) {
            byte[] bytes6 = extractedData.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes6, "");
            length3 += bytes6.length;
        }
        java.lang.String metaData = p1.getMetaData();
        if (metaData != null) {
            byte[] bytes7 = metaData.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes7, "");
            length3 += bytes7.length;
        }
        return length3 + org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_GLOBAL_ANGLE;
    }

    public final byte[] compressForFileStorage(android.graphics.Bitmap bitmap, int totalCaptureCount) {
        byte[] byteArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int max = java.lang.Math.max(1, totalCaptureCount);
        int i = (894976 - (max * 1024)) / max;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        int i2 = 80;
        do {
            byteArrayOutputStream.reset();
            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            if (byteArray.length <= i) {
                return byteArray;
            }
            i2 -= 10;
        } while (i2 > 0);
        com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] ⚠️ Could not reach target, using quality 10%", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("target_kb", java.lang.Integer.valueOf(i / 1024)), kotlin.TuplesKt.to("actual_size_kb", java.lang.Integer.valueOf(byteArray.length / 1024))), null, 4, null);
        return byteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] compressManualCaptureWithExif(android.graphics.Bitmap bitmap, java.io.File cacheDir, java.lang.String flowName, int totalCaptureCount) {
        java.io.File file;
        java.io.BufferedInputStream bufferedInputStream;
        java.io.FileOutputStream fileOutputStream;
        byte[] byteArray;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheDir, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flowName, "");
        int max = java.lang.Math.max(1, totalCaptureCount);
        int i = (894976 - (max * 1024)) / max;
        try {
            file = java.io.File.createTempFile("TID", ".jpeg", cacheDir);
            try {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Created temp file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("file_name", file.getName())), null, 4, null);
                fileOutputStream = new java.io.FileOutputStream(file);
                try {
                    java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                    int i2 = 80;
                    do {
                        byteArrayOutputStream.reset();
                        bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
                        if (byteArray.length <= i) {
                            break;
                        }
                        i2 -= 10;
                    } while (i2 > 0);
                    fileOutputStream.write(byteArray);
                    fileOutputStream.close();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("flow_name", flowName);
                    jSONObject.put("sdk_info", "TID Document Capture Manual Android Camera 2 API V1.0.0");
                    androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(file.getAbsolutePath());
                    exifInterface.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_USER_COMMENT, jSONObject.toString());
                    exifInterface.saveAttributes();
                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Added EXIF metadata", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("metadata", jSONObject.toString())), null, 4, null);
                    int length = (int) file.length();
                    byte[] bArr = new byte[length];
                    bufferedInputStream = new java.io.BufferedInputStream(new java.io.FileInputStream(file));
                    try {
                        bufferedInputStream.read(bArr, 0, length);
                        bufferedInputStream.close();
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] ✅ Manual capture complete with EXIF", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("size_kb", java.lang.Integer.valueOf(length / 1024))), null, 4, null);
                        if (file != null && !file.delete()) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Failed to delete temp file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", file != null ? file.getAbsolutePath() : null)), null, 4, null);
                            return bArr;
                        }
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Cleaned up temp file", null, null, 6, null);
                        return bArr;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        fileOutputStream = null;
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        if (bufferedInputStream != null) {
                            bufferedInputStream.close();
                        }
                        if (file == null && !file.delete()) {
                            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Failed to delete temp file", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("path", file != null ? file.getAbsolutePath() : null)), null, 4, null);
                        } else {
                            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Cleaned up temp file", null, null, 6, null);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    bufferedInputStream = null;
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bufferedInputStream = null;
                fileOutputStream = null;
                if (fileOutputStream != null) {
                }
                if (bufferedInputStream != null) {
                }
                if (file == null) {
                }
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.LoggerKt.log, "[ImageCompression] Cleaned up temp file", null, null, 6, null);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            th = th4;
            file = null;
        }
    }
}
