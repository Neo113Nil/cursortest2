package com.google.zxing.aztec;

/* loaded from: classes9.dex */
public final class AztecReader implements com.google.zxing.Reader {
    @Override // com.google.zxing.Reader
    public final void reset() {
    }

    @Override // com.google.zxing.Reader
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        return decode(binaryBitmap, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[LOOP:0: B:27:0x006e->B:28:0x0070, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    @Override // com.google.zxing.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        com.google.zxing.ResultPoint[] resultPointArr;
        int i;
        int i2;
        com.google.zxing.ResultPoint[] resultPointArr2;
        com.google.zxing.FormatException formatException;
        com.google.zxing.ResultPoint[] resultPointArr3;
        java.util.List<byte[]> byteSegments;
        java.lang.String eCLevel;
        com.google.zxing.ResultPointCallback resultPointCallback;
        com.google.zxing.aztec.AztecDetectorResult detect;
        com.google.zxing.aztec.detector.Detector detector = new com.google.zxing.aztec.detector.Detector(binaryBitmap.getBlackMatrix());
        com.google.zxing.common.DecoderResult decoderResult = null;
        try {
            detect = detector.detect(false);
            resultPointArr = detect.getPoints();
            try {
                i = detect.getErrorsCorrected();
            } catch (com.google.zxing.FormatException e) {
                e = e;
                i = 0;
                i2 = i;
                resultPointArr2 = resultPointArr;
                formatException = e;
                e = null;
                if (decoderResult == null) {
                }
                resultPointArr3 = resultPointArr2;
                int i3 = i2;
                if (map != null) {
                    while (r1 < r2) {
                    }
                }
                com.google.zxing.Result result = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
                byteSegments = decoderResult.getByteSegments();
                if (byteSegments != null) {
                }
                eCLevel = decoderResult.getECLevel();
                if (eCLevel != null) {
                }
                result.putMetadata(com.google.zxing.ResultMetadataType.ERRORS_CORRECTED, java.lang.Integer.valueOf(i3 + decoderResult.getErrorsCorrected().intValue()));
                com.google.zxing.ResultMetadataType resultMetadataType = com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("]z");
                sb.append(decoderResult.getSymbologyModifier());
                result.putMetadata(resultMetadataType, sb.toString());
                return result;
            } catch (com.google.zxing.NotFoundException e2) {
                e = e2;
                i = 0;
                i2 = i;
                resultPointArr2 = resultPointArr;
                formatException = null;
                if (decoderResult == null) {
                }
                resultPointArr3 = resultPointArr2;
                int i32 = i2;
                if (map != null) {
                }
                com.google.zxing.Result result2 = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
                byteSegments = decoderResult.getByteSegments();
                if (byteSegments != null) {
                }
                eCLevel = decoderResult.getECLevel();
                if (eCLevel != null) {
                }
                result2.putMetadata(com.google.zxing.ResultMetadataType.ERRORS_CORRECTED, java.lang.Integer.valueOf(i32 + decoderResult.getErrorsCorrected().intValue()));
                com.google.zxing.ResultMetadataType resultMetadataType2 = com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER;
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("]z");
                sb2.append(decoderResult.getSymbologyModifier());
                result2.putMetadata(resultMetadataType2, sb2.toString());
                return result2;
            }
        } catch (com.google.zxing.FormatException e3) {
            e = e3;
            resultPointArr = null;
        } catch (com.google.zxing.NotFoundException e4) {
            e = e4;
            resultPointArr = null;
        }
        try {
            i2 = i;
            resultPointArr2 = resultPointArr;
            formatException = null;
            decoderResult = new com.google.zxing.aztec.decoder.Decoder().decode(detect);
            e = null;
        } catch (com.google.zxing.FormatException e5) {
            e = e5;
            i2 = i;
            resultPointArr2 = resultPointArr;
            formatException = e;
            e = null;
            if (decoderResult == null) {
            }
            resultPointArr3 = resultPointArr2;
            int i322 = i2;
            if (map != null) {
            }
            com.google.zxing.Result result22 = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
            byteSegments = decoderResult.getByteSegments();
            if (byteSegments != null) {
            }
            eCLevel = decoderResult.getECLevel();
            if (eCLevel != null) {
            }
            result22.putMetadata(com.google.zxing.ResultMetadataType.ERRORS_CORRECTED, java.lang.Integer.valueOf(i322 + decoderResult.getErrorsCorrected().intValue()));
            com.google.zxing.ResultMetadataType resultMetadataType22 = com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("]z");
            sb22.append(decoderResult.getSymbologyModifier());
            result22.putMetadata(resultMetadataType22, sb22.toString());
            return result22;
        } catch (com.google.zxing.NotFoundException e6) {
            e = e6;
            i2 = i;
            resultPointArr2 = resultPointArr;
            formatException = null;
            if (decoderResult == null) {
            }
            resultPointArr3 = resultPointArr2;
            int i3222 = i2;
            if (map != null) {
            }
            com.google.zxing.Result result222 = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
            byteSegments = decoderResult.getByteSegments();
            if (byteSegments != null) {
            }
            eCLevel = decoderResult.getECLevel();
            if (eCLevel != null) {
            }
            result222.putMetadata(com.google.zxing.ResultMetadataType.ERRORS_CORRECTED, java.lang.Integer.valueOf(i3222 + decoderResult.getErrorsCorrected().intValue()));
            com.google.zxing.ResultMetadataType resultMetadataType222 = com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER;
            java.lang.StringBuilder sb222 = new java.lang.StringBuilder("]z");
            sb222.append(decoderResult.getSymbologyModifier());
            result222.putMetadata(resultMetadataType222, sb222.toString());
            return result222;
        }
        if (decoderResult == null) {
            try {
                com.google.zxing.aztec.AztecDetectorResult detect2 = detector.detect(true);
                resultPointArr2 = detect2.getPoints();
                i2 = detect2.getErrorsCorrected();
                decoderResult = new com.google.zxing.aztec.decoder.Decoder().decode(detect2);
            } catch (com.google.zxing.FormatException | com.google.zxing.NotFoundException e7) {
                if (e != null) {
                    throw e;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e7;
            }
        }
        resultPointArr3 = resultPointArr2;
        int i32222 = i2;
        if (map != null && (resultPointCallback = (com.google.zxing.ResultPointCallback) map.get(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (com.google.zxing.ResultPoint resultPoint : resultPointArr3) {
                resultPointCallback.foundPossibleResultPoint(resultPoint);
            }
        }
        com.google.zxing.Result result2222 = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
        byteSegments = decoderResult.getByteSegments();
        if (byteSegments != null) {
            result2222.putMetadata(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        eCLevel = decoderResult.getECLevel();
        if (eCLevel != null) {
            result2222.putMetadata(com.google.zxing.ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        result2222.putMetadata(com.google.zxing.ResultMetadataType.ERRORS_CORRECTED, java.lang.Integer.valueOf(i32222 + decoderResult.getErrorsCorrected().intValue()));
        com.google.zxing.ResultMetadataType resultMetadataType2222 = com.google.zxing.ResultMetadataType.SYMBOLOGY_IDENTIFIER;
        java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("]z");
        sb2222.append(decoderResult.getSymbologyModifier());
        result2222.putMetadata(resultMetadataType2222, sb2222.toString());
        return result2222;
    }
}
