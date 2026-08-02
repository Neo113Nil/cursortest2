package com.paypal.oslo.feature.cashin.ui.barcode.util;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cashin/ui/barcode/util/BarcodeGenerator;", "", "<init>", "()V", "", "content", "", "width", "height", "Lcom/google/zxing/BarcodeFormat;", "format", "Landroid/graphics/Bitmap;", "generateBarcode", "(Ljava/lang/String;IILcom/google/zxing/BarcodeFormat;)Landroid/graphics/Bitmap;", "DEFAULT_WIDTH", com.visa.cbp.getEncExpo.warmup, "DEFAULT_HEIGHT"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BarcodeGenerator {
    public static final int $stable = 0;
    public static final int DEFAULT_HEIGHT = 200;
    public static final int DEFAULT_WIDTH = 600;
    public static final com.paypal.oslo.feature.cashin.ui.barcode.util.BarcodeGenerator INSTANCE = new com.paypal.oslo.feature.cashin.ui.barcode.util.BarcodeGenerator();

    private BarcodeGenerator() {
    }

    public static /* synthetic */ android.graphics.Bitmap generateBarcode$default(com.paypal.oslo.feature.cashin.ui.barcode.util.BarcodeGenerator barcodeGenerator, java.lang.String str, int i, int i2, com.google.zxing.BarcodeFormat barcodeFormat, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            barcodeFormat = com.google.zxing.BarcodeFormat.CODE_128;
        }
        return barcodeGenerator.generateBarcode(str, i, i2, barcodeFormat);
    }

    public final android.graphics.Bitmap generateBarcode(java.lang.String content, int width, int height, com.google.zxing.BarcodeFormat format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(content, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "");
        if (kotlin.text.StringsKt.isBlank(content)) {
            return null;
        }
        try {
            com.google.zxing.common.BitMatrix encode = new com.google.zxing.MultiFormatWriter().encode(content, format, width, height);
            kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
            int width2 = encode.getWidth();
            int height2 = encode.getHeight();
            int[] iArr = new int[width2 * height2];
            for (int i = 0; i < height2; i++) {
                for (int i2 = 0; i2 < width2; i2++) {
                    iArr[(i * width2) + i2] = encode.get(i2, i) ? -16777216 : -1;
                }
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(width2, height2, android.graphics.Bitmap.Config.ARGB_8888);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
            createBitmap.setPixels(iArr, 0, width2, 0, 0, width2, height2);
            return createBitmap;
        } catch (com.google.zxing.WriterException e) {
            com.paypal.oslo.feature.cashin.LoggerKt.log.e("Error generating barcode for content: ".concat(java.lang.String.valueOf(content)), e);
            return null;
        } catch (java.lang.IllegalArgumentException e2) {
            com.paypal.oslo.feature.cashin.LoggerKt.log.e("Error generating barcode for content: ".concat(java.lang.String.valueOf(content)), e2);
            return null;
        }
    }
}
