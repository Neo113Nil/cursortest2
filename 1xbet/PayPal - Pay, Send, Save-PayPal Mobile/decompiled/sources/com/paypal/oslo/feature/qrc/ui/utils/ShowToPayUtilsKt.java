package com.paypal.oslo.feature.qrc.ui.utils;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0005\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a;\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0012\u0010\u0011"}, d2 = {"", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Landroid/graphics/Bitmap;", "generateQrCodeBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "generateBarcodeBitmap", "Lcom/google/zxing/common/BitMatrix;", "bitMatrix", "", "onColor", "offColor", "xOffset", "outputWidth", "", "bitMatrixToPixels", "(Lcom/google/zxing/common/BitMatrix;IIII)[I", "findLeftBound", "(Lcom/google/zxing/common/BitMatrix;)I", "findRightBound"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ShowToPayUtilsKt {
    public static final android.graphics.Bitmap generateQrCodeBitmap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            com.google.zxing.common.BitMatrix encode = new com.google.zxing.qrcode.QRCodeWriter().encode(str, com.google.zxing.BarcodeFormat.QR_CODE, 512, 512, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.google.zxing.EncodeHintType.MARGIN, 1)));
            kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
            int[] bitMatrixToPixels$default = bitMatrixToPixels$default(encode, -16777216, -1, 0, 0, 24, null);
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(encode.getWidth(), encode.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(bitMatrixToPixels$default, 0, encode.getWidth(), 0, 0, encode.getWidth(), encode.getHeight());
            return createBitmap;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static final android.graphics.Bitmap generateBarcodeBitmap(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            com.google.zxing.common.BitMatrix encode = new com.google.zxing.oned.Code128Writer().encode(str, com.google.zxing.BarcodeFormat.CODE_128, 600, 200);
            kotlin.jvm.internal.Intrinsics.checkNotNull(encode);
            int findLeftBound = findLeftBound(encode);
            int findRightBound = (findRightBound(encode) - findLeftBound) + 1;
            int[] bitMatrixToPixels = bitMatrixToPixels(encode, -16777216, 0, findLeftBound, findRightBound);
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(findRightBound, encode.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(bitMatrixToPixels, 0, findRightBound, 0, 0, findRightBound, encode.getHeight());
            return createBitmap;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public static /* synthetic */ int[] bitMatrixToPixels$default(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, int i3, int i4, int i5, java.lang.Object obj) {
        if ((i5 & 8) != 0) {
            i3 = 0;
        }
        if ((i5 & 16) != 0) {
            i4 = bitMatrix.getWidth();
        }
        return bitMatrixToPixels(bitMatrix, i, i2, i3, i4);
    }

    public static final int[] bitMatrixToPixels(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, int i3, int i4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitMatrix, "");
        int height = bitMatrix.getHeight();
        int[] iArr = new int[i4 * height];
        for (int i5 = 0; i5 < height; i5++) {
            for (int i6 = 0; i6 < i4; i6++) {
                iArr[(i5 * i4) + i6] = bitMatrix.get(i6 + i3, i5) ? i : i2;
            }
        }
        return iArr;
    }

    public static final int findLeftBound(com.google.zxing.common.BitMatrix bitMatrix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitMatrix, "");
        int width = bitMatrix.getWidth();
        for (int i = 0; i < width; i++) {
            int height = bitMatrix.getHeight();
            for (int i2 = 0; i2 < height; i2++) {
                if (bitMatrix.get(i, i2)) {
                    return i;
                }
            }
        }
        return 0;
    }

    public static final int findRightBound(com.google.zxing.common.BitMatrix bitMatrix) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitMatrix, "");
        for (int width = bitMatrix.getWidth() - 1; width >= 0; width--) {
            int height = bitMatrix.getHeight();
            for (int i = 0; i < height; i++) {
                if (bitMatrix.get(width, i)) {
                    return width;
                }
            }
        }
        return bitMatrix.getWidth() - 1;
    }
}
