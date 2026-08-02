package com.paypal.oslo.feature.qrc.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/usecase/GenerateQrCodeUseCase;", "", "<init>", "()V", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "logoBitmap", "", io.ktor.http.ContentDisposition.Parameters.Size, "invoke", "(Ljava/lang/String;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;I)Landroid/graphics/Bitmap;", "p2", "p3", "Lkotlin/Pair;", "", "Camera2StreamConfigurationMap", "(IIII)Lkotlin/Pair;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GenerateQrCodeUseCase {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase.Companion Companion = new com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase.Companion(null);

    @java.lang.Deprecated
    public static final int DEFAULT_QR_CODE_SIZE = 512;

    @java.lang.Deprecated
    public static final double FINDER_CENTER_RATIO = 0.43d;

    @java.lang.Deprecated
    public static final double FINDER_REGION_RATIO = 0.2d;

    @java.lang.Deprecated
    public static final float LOGO_PADDING = 20.0f;

    @java.lang.Deprecated
    public static final float LOGO_SIZE_RATIO = 0.15f;

    @java.lang.Deprecated
    public static final int PAYPAL_BLUE = -16776825;

    @java.lang.Deprecated
    public static final int PAYPAL_LIGHT_BLUE = -16735778;

    @java.lang.Deprecated
    public static final int QR_CODE_MARGIN = 0;

    @javax.inject.Inject
    public GenerateQrCodeUseCase() {
    }

    public static /* synthetic */ android.graphics.Bitmap invoke$default(com.paypal.oslo.feature.qrc.domain.usecase.GenerateQrCodeUseCase generateQrCodeUseCase, java.lang.String str, android.graphics.Bitmap bitmap, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            bitmap = null;
        }
        if ((i2 & 4) != 0) {
            i = 512;
        }
        return generateQrCodeUseCase.invoke(str, bitmap, i);
    }

    public final android.graphics.Bitmap invoke(java.lang.String data, android.graphics.Bitmap logoBitmap, int size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        try {
            if (data.length() == 0) {
                com.paypal.android.logger.Logger.e$default(com.paypal.oslo.feature.qrc.LoggerKt.log, "Failed to generate QR code: data string is empty", null, null, null, 14, null);
                return null;
            }
            android.graphics.Bitmap highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(data, size);
            if (highSpeedVideoFpsRanges == null) {
                return null;
            }
            if (logoBitmap != null) {
                android.graphics.Canvas canvas = new android.graphics.Canvas(highSpeedVideoFpsRanges);
                float width = highSpeedVideoFpsRanges.getWidth() / 2.0f;
                float height = highSpeedVideoFpsRanges.getHeight() / 2.0f;
                int width2 = (int) (highSpeedVideoFpsRanges.getWidth() * 0.15f);
                android.graphics.Paint paint = new android.graphics.Paint();
                paint.setColor(-1);
                paint.setAntiAlias(true);
                paint.setStyle(android.graphics.Paint.Style.FILL);
                float f = (width2 + 40.0f) / 2.0f;
                canvas.drawRect(width - f, height - f, width + f, f + height, paint);
                canvas.drawBitmap(android.graphics.Bitmap.createScaledBitmap(logoBitmap, width2, width2, true), (highSpeedVideoFpsRanges.getWidth() - width2) / 2.0f, (highSpeedVideoFpsRanges.getHeight() - width2) / 2.0f, (android.graphics.Paint) null);
            }
            return highSpeedVideoFpsRanges;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Failed to generate QR code", e);
            return null;
        }
    }

    private final android.graphics.Bitmap getHighSpeedVideoFpsRanges(java.lang.String p0, int p1) {
        kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pair;
        int i;
        try {
            com.google.zxing.common.BitMatrix encode = new com.google.zxing.qrcode.QRCodeWriter().encode(p0, com.google.zxing.BarcodeFormat.QR_CODE, p1, p1, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.zxing.EncodeHintType.CHARACTER_SET, "UTF-8"), kotlin.TuplesKt.to(com.google.zxing.EncodeHintType.ERROR_CORRECTION, com.google.zxing.qrcode.decoder.ErrorCorrectionLevel.H), kotlin.TuplesKt.to(com.google.zxing.EncodeHintType.MARGIN, 0)));
            int width = encode.getWidth();
            int height = encode.getHeight();
            kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
            int[] iArr = new int[width * height];
            int i2 = (int) (width * 0.2d);
            int i3 = (int) (i2 * 0.43d);
            int i4 = (i2 - i3) / 2;
            for (int i5 = 0; i5 < height; i5++) {
                for (int i6 = 0; i6 < width; i6++) {
                    boolean z = encode.get(i6, i5);
                    if (i6 >= i2 || i5 >= i2) {
                        int i7 = width - i2;
                        if (i6 >= i7 && i5 < i2) {
                            pair = Camera2StreamConfigurationMap(i6 - i7, i5, i3, i4);
                        } else if (i6 < i2 && i5 >= (i = height - i2)) {
                            pair = Camera2StreamConfigurationMap(i6, i5 - i, i3, i4);
                        } else {
                            java.lang.Boolean bool = java.lang.Boolean.FALSE;
                            pair = new kotlin.Pair<>(bool, bool);
                        }
                    } else {
                        pair = Camera2StreamConfigurationMap(i6, i5, i3, i4);
                    }
                    boolean booleanValue = pair.component1().booleanValue();
                    boolean booleanValue2 = pair.component2().booleanValue();
                    iArr[(i5 * width) + i6] = (booleanValue && booleanValue2 && z) ? PAYPAL_LIGHT_BLUE : (booleanValue && !booleanValue2 && z) ? PAYPAL_BLUE : z ? -16777216 : -1;
                }
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width, height, android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return createBitmap;
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.qrc.LoggerKt.log.e("Failed to generate QR code bitmap", e);
            return null;
        }
    }

    private static kotlin.Pair<java.lang.Boolean, java.lang.Boolean> Camera2StreamConfigurationMap(int p0, int p1, int p2, int p3) {
        return new kotlin.Pair<>(java.lang.Boolean.TRUE, java.lang.Boolean.valueOf((p0 >= p3 && p0 < p3 + p2) && (p1 >= p3 && p1 < p3 + p2)));
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/usecase/GenerateQrCodeUseCase$Companion;", "", "<init>", "()V", "", "DEFAULT_QR_CODE_SIZE", com.visa.cbp.getEncExpo.warmup, "QR_CODE_MARGIN", "", "LOGO_SIZE_RATIO", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.FLUTTER, "LOGO_PADDING", "PAYPAL_BLUE", "PAYPAL_LIGHT_BLUE", "", "FINDER_REGION_RATIO", "D", "FINDER_CENTER_RATIO"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
