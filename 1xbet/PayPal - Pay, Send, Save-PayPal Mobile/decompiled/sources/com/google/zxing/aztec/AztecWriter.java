package com.google.zxing.aztec;

/* loaded from: classes9.dex */
public final class AztecWriter implements com.google.zxing.Writer {
    @Override // com.google.zxing.Writer
    public final com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2) {
        return encode(str, barcodeFormat, i, i2, null);
    }

    @Override // com.google.zxing.Writer
    public final com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.util.Map<com.google.zxing.EncodeHintType, ?> map) {
        int i3 = 0;
        if (map != null) {
            r0 = map.containsKey(com.google.zxing.EncodeHintType.CHARACTER_SET) ? java.nio.charset.Charset.forName(map.get(com.google.zxing.EncodeHintType.CHARACTER_SET).toString()) : null;
            r1 = map.containsKey(com.google.zxing.EncodeHintType.ERROR_CORRECTION) ? java.lang.Integer.parseInt(map.get(com.google.zxing.EncodeHintType.ERROR_CORRECTION).toString()) : 33;
            if (map.containsKey(com.google.zxing.EncodeHintType.AZTEC_LAYERS)) {
                i3 = java.lang.Integer.parseInt(map.get(com.google.zxing.EncodeHintType.AZTEC_LAYERS).toString());
            }
        }
        return encode(str, barcodeFormat, i, i2, r0, r1, i3);
    }

    private static com.google.zxing.common.BitMatrix encode(java.lang.String str, com.google.zxing.BarcodeFormat barcodeFormat, int i, int i2, java.nio.charset.Charset charset, int i3, int i4) {
        if (barcodeFormat != com.google.zxing.BarcodeFormat.AZTEC) {
            throw new java.lang.IllegalArgumentException("Can only encode AZTEC, but got ".concat(java.lang.String.valueOf(barcodeFormat)));
        }
        return renderResult(com.google.zxing.aztec.encoder.Encoder.encode(str, i3, i4, charset), i, i2);
    }

    private static com.google.zxing.common.BitMatrix renderResult(com.google.zxing.aztec.encoder.AztecCode aztecCode, int i, int i2) {
        com.google.zxing.common.BitMatrix matrix = aztecCode.getMatrix();
        if (matrix == null) {
            throw new java.lang.IllegalStateException();
        }
        int width = matrix.getWidth();
        int height = matrix.getHeight();
        int max = java.lang.Math.max(i, width);
        int max2 = java.lang.Math.max(i2, height);
        int min = java.lang.Math.min(max / width, max2 / height);
        int i3 = (max - (width * min)) / 2;
        int i4 = (max2 - (height * min)) / 2;
        com.google.zxing.common.BitMatrix bitMatrix = new com.google.zxing.common.BitMatrix(max, max2);
        int i5 = 0;
        while (i5 < height) {
            int i6 = 0;
            int i7 = i3;
            while (i6 < width) {
                if (matrix.get(i6, i5)) {
                    bitMatrix.setRegion(i7, i4, min, min);
                }
                i6++;
                i7 += min;
            }
            i5++;
            i4 += min;
        }
        return bitMatrix;
    }
}
