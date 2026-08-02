package com.google.zxing.maxicode;

/* loaded from: classes9.dex */
public final class MaxiCodeReader implements com.google.zxing.Reader {
    private static final int MATRIX_HEIGHT = 33;
    private static final int MATRIX_WIDTH = 30;
    private static final com.google.zxing.ResultPoint[] NO_POINTS = new com.google.zxing.ResultPoint[0];
    private final com.google.zxing.maxicode.decoder.Decoder decoder = new com.google.zxing.maxicode.decoder.Decoder();

    @Override // com.google.zxing.Reader
    public final void reset() {
    }

    @Override // com.google.zxing.Reader
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        com.google.zxing.common.DecoderResult decode = this.decoder.decode(extractPureBits(binaryBitmap.getBlackMatrix()), map);
        com.google.zxing.Result result = new com.google.zxing.Result(decode.getText(), decode.getRawBytes(), NO_POINTS, com.google.zxing.BarcodeFormat.MAXICODE);
        result.putMetadata(com.google.zxing.ResultMetadataType.ERRORS_CORRECTED, decode.getErrorsCorrected());
        java.lang.String eCLevel = decode.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(com.google.zxing.ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return result;
    }

    private static com.google.zxing.common.BitMatrix extractPureBits(com.google.zxing.common.BitMatrix bitMatrix) throws com.google.zxing.NotFoundException {
        int[] enclosingRectangle = bitMatrix.getEnclosingRectangle();
        if (enclosingRectangle == null) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i = enclosingRectangle[0];
        int i2 = enclosingRectangle[1];
        int i3 = enclosingRectangle[2];
        int i4 = enclosingRectangle[3];
        com.google.zxing.common.BitMatrix bitMatrix2 = new com.google.zxing.common.BitMatrix(30, 33);
        for (int i5 = 0; i5 < 33; i5++) {
            int min = java.lang.Math.min(((i5 * i4) + (i4 / 2)) / 33, i4 - 1);
            for (int i6 = 0; i6 < 30; i6++) {
                if (bitMatrix.get(java.lang.Math.min((((i6 * i3) + (i3 / 2)) + (((i5 & 1) * i3) / 2)) / 30, i3 - 1) + i, min + i2)) {
                    bitMatrix2.set(i6, i5);
                }
            }
        }
        return bitMatrix2;
    }
}
