package com.google.zxing.oned;

/* loaded from: classes9.dex */
public final class UPCAWriter implements com.google.zxing.Writer {
    private final com.google.zxing.oned.EAN13Writer subWriter = new com.google.zxing.oned.EAN13Writer();

    @Override // com.google.zxing.Writer
    public final com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.google.zxing.Writer
    public final com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        if (barcodeFormat != com.google.zxing.BarcodeFormat.UPC_A) {
            throw new java.lang.IllegalArgumentException("Can only encode UPC-A, but got ".concat(java.lang.String.valueOf(barcodeFormat)));
        }
        return this.subWriter.encode("0".concat(java.lang.String.valueOf(str)), com.google.zxing.BarcodeFormat.EAN_13, i, i2, map);
    }
}
