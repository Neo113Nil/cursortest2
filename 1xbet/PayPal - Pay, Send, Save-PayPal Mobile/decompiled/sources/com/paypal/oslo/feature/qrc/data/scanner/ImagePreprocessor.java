package com.paypal.oslo.feature.qrc.data.scanner;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001d\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0000¢\u0006\u0004\b\u001e\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/scanner/ImagePreprocessor;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "uri", "Landroid/graphics/Bitmap;", "preprocessImage", "(Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBitmap$qrc_prodRelease", "(Landroid/net/Uri;)Landroid/graphics/Bitmap;", "Landroid/graphics/BitmapFactory$Options;", "options", "", "calculateInSampleSize$qrc_prodRelease", "(Landroid/graphics/BitmapFactory$Options;)I", "bitmap", "correctedForExifRotation$qrc_prodRelease", "(Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "getExifRotation$qrc_prodRelease", "(Landroid/net/Uri;)I", "degrees", "rotateBitmap$qrc_prodRelease", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "optimizeForMlKit$qrc_prodRelease", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "convertToGrayscale$qrc_prodRelease", "adaptiveBinarization$qrc_prodRelease", "enhanceContrastAggressive$qrc_prodRelease", "getHighSpeedVideoSizes", "Landroid/content/Context;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ImagePreprocessor {
    public static final int $stable = 8;
    private final android.content.Context getHighSpeedVideoSizes;

    public ImagePreprocessor(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoSizes = context;
    }

    public final java.lang.Object preprocessImage(android.net.Uri uri, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getDefault(), new com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor$preprocessImage$2(this, uri, null), continuation);
    }

    public final android.graphics.Bitmap loadBitmap$qrc_prodRelease(android.net.Uri uri) {
        android.graphics.Bitmap bitmap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.io.InputStream openInputStream = this.getHighSpeedVideoSizes.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return null;
            }
            java.io.InputStream inputStream = openInputStream;
            try {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                android.graphics.BitmapFactory.decodeStream(inputStream, null, options);
                options.inSampleSize = calculateInSampleSize$qrc_prodRelease(options);
                options.inJustDecodeBounds = false;
                java.io.InputStream openInputStream2 = this.getHighSpeedVideoSizes.getContentResolver().openInputStream(uri);
                if (openInputStream2 != null) {
                    inputStream = openInputStream2;
                    try {
                        bitmap = android.graphics.BitmapFactory.decodeStream(inputStream, null, options);
                        kotlin.io.CloseableKt.closeFinally(inputStream, null);
                    } finally {
                    }
                } else {
                    bitmap = null;
                }
                kotlin.io.CloseableKt.closeFinally(inputStream, null);
                return bitmap;
            } finally {
            }
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final int calculateInSampleSize$qrc_prodRelease(android.graphics.BitmapFactory.Options options) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(options, "");
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (i <= 2000 && i2 <= 2000) {
            return 1;
        }
        int i4 = i / 2;
        int i5 = i2 / 2;
        while (i4 / i3 >= 2000 && i5 / i3 >= 2000) {
            i3 *= 2;
        }
        return i3;
    }

    public final android.graphics.Bitmap correctedForExifRotation$qrc_prodRelease(android.net.Uri uri, android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        try {
            int exifRotation$qrc_prodRelease = getExifRotation$qrc_prodRelease(uri);
            if (exifRotation$qrc_prodRelease != 0) {
                return rotateBitmap$qrc_prodRelease(bitmap, exifRotation$qrc_prodRelease);
            }
        } catch (java.lang.Exception unused) {
        }
        return bitmap;
    }

    public final int getExifRotation$qrc_prodRelease(android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        try {
            java.io.InputStream openInputStream = this.getHighSpeedVideoSizes.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            androidx.exifinterface.media.ExifInterface exifInterface = new androidx.exifinterface.media.ExifInterface(openInputStream);
            openInputStream.close();
            int attributeInt = exifInterface.getAttributeInt(androidx.exifinterface.media.ExifInterface.TAG_ORIENTATION, 1);
            if (attributeInt == 3) {
                return com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE;
            }
            if (attributeInt != 6) {
                return attributeInt != 8 ? 0 : 270;
            }
            return 90;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public final android.graphics.Bitmap rotateBitmap$qrc_prodRelease(android.graphics.Bitmap bitmap, int degrees) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        if (degrees == 0) {
            return bitmap;
        }
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.postRotate(degrees);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
        return createBitmap;
    }

    public final android.graphics.Bitmap optimizeForMlKit$qrc_prodRelease(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int max = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
        if (400 <= max && max < 1501) {
            return bitmap;
        }
        float f = (max < 1000 ? 1000.0f : 1500.0f) / max;
        return android.graphics.Bitmap.createScaledBitmap(bitmap, kotlin.math.MathKt.roundToInt(bitmap.getWidth() * f), kotlin.math.MathKt.roundToInt(bitmap.getHeight() * f), true);
    }

    public final android.graphics.Bitmap convertToGrayscale$qrc_prodRelease(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] convertToGrayscale$qrc_prodRelease = com.paypal.oslo.feature.qrc.data.scanner.QRCodePreprocessing.INSTANCE.convertToGrayscale$qrc_prodRelease(iArr);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(convertToGrayscale$qrc_prodRelease, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    public final android.graphics.Bitmap adaptiveBinarization$qrc_prodRelease(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] binarizePixels$qrc_prodRelease = com.paypal.oslo.feature.qrc.data.scanner.QRCodePreprocessing.INSTANCE.binarizePixels$qrc_prodRelease(iArr, com.paypal.oslo.feature.qrc.data.scanner.QRCodePreprocessing.INSTANCE.calculateOtsuThreshold$qrc_prodRelease(iArr));
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(binarizePixels$qrc_prodRelease, 0, width, 0, 0, width, height);
        return createBitmap;
    }

    public final android.graphics.Bitmap enhanceContrastAggressive$qrc_prodRelease(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int[] iArr = new int[width * height];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] enhanceContrastAggressive$qrc_prodRelease = com.paypal.oslo.feature.qrc.data.scanner.QRCodePreprocessing.INSTANCE.enhanceContrastAggressive$qrc_prodRelease(iArr);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(enhanceContrastAggressive$qrc_prodRelease, 0, width, 0, 0, width, height);
        return createBitmap;
    }
}
