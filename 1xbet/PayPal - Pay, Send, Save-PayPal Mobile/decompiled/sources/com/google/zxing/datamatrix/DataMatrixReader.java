package com.google.zxing.datamatrix;

/* loaded from: classes9.dex */
public final class DataMatrixReader implements com.google.zxing.Reader {
    private static final com.google.zxing.ResultPoint[] NO_POINTS = new com.google.zxing.ResultPoint[0];
    private final com.google.zxing.datamatrix.decoder.Decoder decoder = new com.google.zxing.datamatrix.decoder.Decoder();

    @Override // com.google.zxing.Reader
    public final void reset() {
    }

    @Override // com.google.zxing.Reader
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException {
        com.google.zxing.ResultPoint[] points;
        com.google.zxing.common.DecoderResult decoderResult;
        if (map != null && map.containsKey(com.google.zxing.DecodeHintType.PURE_BARCODE)) {
            decoderResult = this.decoder.decode(extractPureBits(binaryBitmap.getBlackMatrix()));
            points = NO_POINTS;
        } else {
            com.google.zxing.common.DetectorResult detect = new com.google.zxing.datamatrix.detector.Detector(binaryBitmap.getBlackMatrix()).detect();
            com.google.zxing.common.DecoderResult decode = this.decoder.decode(detect.getBits());
            points = detect.getPoints();
            decoderResult = decode;
        }
        com.google.zxing.Result result = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), points, com.google.zxing.BarcodeFormat.DATA_MATRIX);
        java.util.List<byte[]> byteSegments = decoderResult.getByteSegments();
        if (byteSegments != null) {
            result.putMetadata(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        java.lang.String eCLevel = decoderResult.getECLevel();
        if (eCLevel != null) {
            result.putMetadata(com.google.zxing.ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        result.putMetadata(com.google.zxing.ResultMetadataType.ERRORS_CORRECTED, decoderResult.getErrorsCorrected());
        com.google.zxing.ResultMetadataType resultMetadataType = com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("]d");
        sb.append(decoderResult.getSymbologyModifier());
        result.putMetadata(resultMetadataType, sb.toString());
        return result;
    }

    private static com.google.zxing.common.BitMatrix extractPureBits(com.google.zxing.common.BitMatrix bitMatrix) throws com.google.zxing.NotFoundException {
        int[] topLeftOnBit = bitMatrix.getTopLeftOnBit();
        int[] bottomRightOnBit = bitMatrix.getBottomRightOnBit();
        if (topLeftOnBit == null || bottomRightOnBit == null) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int moduleSize = moduleSize(topLeftOnBit, bitMatrix);
        int i = topLeftOnBit[1];
        int i2 = bottomRightOnBit[1];
        int i3 = topLeftOnBit[0];
        int i4 = ((bottomRightOnBit[0] - i3) + 1) / moduleSize;
        int i5 = ((i2 - i) + 1) / moduleSize;
        if (i4 <= 0 || i5 <= 0) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i6 = moduleSize / 2;
        com.google.zxing.common.BitMatrix bitMatrix2 = new com.google.zxing.common.BitMatrix(i4, i5);
        for (int i7 = 0; i7 < i5; i7++) {
            for (int i8 = 0; i8 < i4; i8++) {
                if (bitMatrix.get((i8 * moduleSize) + i3 + i6, (i7 * moduleSize) + i + i6)) {
                    bitMatrix2.set(i8, i7);
                }
            }
        }
        return bitMatrix2;
    }

    private static int moduleSize(int[] iArr, com.google.zxing.common.BitMatrix bitMatrix) throws com.google.zxing.NotFoundException {
        int width = bitMatrix.getWidth();
        int i = iArr[0];
        int i2 = iArr[1];
        while (i < width && bitMatrix.get(i, i2)) {
            i++;
        }
        if (i == width) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i3 = i - iArr[0];
        if (i3 != 0) {
            return i3;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }
}
