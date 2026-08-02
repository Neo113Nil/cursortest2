package com.paypal.oslo.feature.qrc.data.scanner;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0012\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/scanner/QRCodePreprocessing;", "", "<init>", "()V", "", "pixel", "getGrayscale$qrc_prodRelease", "(I)I", "", "pixels", "calculateOtsuThreshold$qrc_prodRelease", "([I)I", "grayscalePixels", "threshold", "binarizePixels$qrc_prodRelease", "([II)[I", "enhanceContrastAggressive$qrc_prodRelease", "([I)[I", "convertToGrayscale$qrc_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QRCodePreprocessing {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.qrc.data.scanner.QRCodePreprocessing INSTANCE = new com.paypal.oslo.feature.qrc.data.scanner.QRCodePreprocessing();

    public final int getGrayscale$qrc_prodRelease(int pixel) {
        return (int) ((((pixel >> 16) & 255) * 0.299d) + (((pixel >> 8) & 255) * 0.587d) + ((pixel & 255) * 0.114d));
    }

    private QRCodePreprocessing() {
    }

    public final int[] binarizePixels$qrc_prodRelease(int[] grayscalePixels, int threshold) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grayscalePixels, "");
        int[] iArr = new int[grayscalePixels.length];
        int length = grayscalePixels.length;
        for (int i = 0; i < length; i++) {
            iArr[i] = getGrayscale$qrc_prodRelease(grayscalePixels[i]) > threshold ? -1 : -16777216;
        }
        return iArr;
    }

    public final int[] enhanceContrastAggressive$qrc_prodRelease(int[] grayscalePixels) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(grayscalePixels, "");
        int[] iArr = new int[grayscalePixels.length];
        int length = grayscalePixels.length;
        for (int i = 0; i < length; i++) {
            int i2 = getGrayscale$qrc_prodRelease(grayscalePixels[i]) > 128 ? 255 : 0;
            iArr[i] = i2 | (i2 << 16) | (-16777216) | (i2 << 8);
        }
        return iArr;
    }

    public final int[] convertToGrayscale$qrc_prodRelease(int[] pixels) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pixels, "");
        int[] iArr = new int[pixels.length];
        int length = pixels.length;
        for (int i = 0; i < length; i++) {
            int grayscale$qrc_prodRelease = getGrayscale$qrc_prodRelease(pixels[i]);
            iArr[i] = grayscale$qrc_prodRelease | (grayscale$qrc_prodRelease << 16) | (-16777216) | (grayscale$qrc_prodRelease << 8);
        }
        return iArr;
    }

    public final int calculateOtsuThreshold$qrc_prodRelease(int[] pixels) {
        int[] iArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pixels, "");
        int[] iArr2 = new int[256];
        int i = 0;
        for (int i2 : pixels) {
            int grayscale$qrc_prodRelease = getGrayscale$qrc_prodRelease(i2);
            iArr2[grayscale$qrc_prodRelease] = iArr2[grayscale$qrc_prodRelease] + 1;
        }
        int length = pixels.length;
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            i3 += iArr2[i4] * i4;
        }
        int i5 = 0;
        int i6 = 0;
        double d = 0.0d;
        int i7 = 0;
        for (int i8 = 256; i < i8; i8 = 256) {
            int i9 = iArr2[i];
            i5 += i9;
            if (i5 > 0) {
                int i10 = length - i5;
                if (i10 <= 0) {
                    break;
                }
                int i11 = i7 + (i9 * i);
                iArr = iArr2;
                double d2 = i5;
                double d3 = i10;
                double d4 = (i11 / d2) - ((i3 - i11) / d3);
                double d5 = d2 * d3 * d4 * d4;
                if (d5 > d) {
                    d = d5;
                    i6 = i;
                }
                i7 = i11;
            } else {
                iArr = iArr2;
            }
            i++;
            iArr2 = iArr;
        }
        return i6;
    }
}
