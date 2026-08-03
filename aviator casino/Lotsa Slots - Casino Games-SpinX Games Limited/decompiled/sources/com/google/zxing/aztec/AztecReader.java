package com.google.zxing.aztec;

/* loaded from: classes4.dex */
public final class AztecReader implements com.google.zxing.Reader {
    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        return decode(binaryBitmap, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e A[LOOP:0: B:24:0x005c->B:25:0x005e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // com.google.zxing.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        com.google.zxing.ResultPoint[] resultPointArr;
        com.google.zxing.ResultPoint[] resultPointArr2;
        com.google.zxing.FormatException formatException;
        com.google.zxing.ResultPoint[] resultPointArr3;
        java.util.List<byte[]> byteSegments;
        java.lang.String eCLevel;
        com.google.zxing.ResultPointCallback resultPointCallback;
        com.google.zxing.aztec.detector.Detector detector = new com.google.zxing.aztec.detector.Detector(binaryBitmap.getBlackMatrix());
        com.google.zxing.common.DecoderResult decoderResult = null;
        try {
            com.google.zxing.aztec.AztecDetectorResult detect = detector.detect(false);
            resultPointArr = detect.getPoints();
            try {
                resultPointArr2 = resultPointArr;
                formatException = null;
                decoderResult = new com.google.zxing.aztec.decoder.Decoder().decode(detect);
                e = null;
            } catch (com.google.zxing.FormatException e) {
                e = e;
                resultPointArr2 = resultPointArr;
                formatException = e;
                e = null;
                if (decoderResult == null) {
                }
                resultPointArr3 = resultPointArr2;
                if (map != null) {
                    while (r11 < r0) {
                    }
                }
                com.google.zxing.Result result = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
                byteSegments = decoderResult.getByteSegments();
                if (byteSegments != null) {
                }
                eCLevel = decoderResult.getECLevel();
                if (eCLevel != null) {
                }
                return result;
            } catch (com.google.zxing.NotFoundException e2) {
                e = e2;
                resultPointArr2 = resultPointArr;
                formatException = null;
                if (decoderResult == null) {
                }
                resultPointArr3 = resultPointArr2;
                if (map != null) {
                }
                com.google.zxing.Result result2 = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
                byteSegments = decoderResult.getByteSegments();
                if (byteSegments != null) {
                }
                eCLevel = decoderResult.getECLevel();
                if (eCLevel != null) {
                }
                return result2;
            }
        } catch (com.google.zxing.FormatException e3) {
            e = e3;
            resultPointArr = null;
        } catch (com.google.zxing.NotFoundException e4) {
            e = e4;
            resultPointArr = null;
        }
        if (decoderResult == null) {
            try {
                com.google.zxing.aztec.AztecDetectorResult detect2 = detector.detect(true);
                resultPointArr2 = detect2.getPoints();
                decoderResult = new com.google.zxing.aztec.decoder.Decoder().decode(detect2);
            } catch (com.google.zxing.FormatException | com.google.zxing.NotFoundException e5) {
                if (e != null) {
                    throw e;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e5;
            }
        }
        resultPointArr3 = resultPointArr2;
        if (map != null && (resultPointCallback = (com.google.zxing.ResultPointCallback) map.get(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (com.google.zxing.ResultPoint resultPoint : resultPointArr3) {
                resultPointCallback.foundPossibleResultPoint(resultPoint);
            }
        }
        com.google.zxing.Result result22 = new com.google.zxing.Result(decoderResult.getText(), decoderResult.getRawBytes(), decoderResult.getNumBits(), resultPointArr3, com.google.zxing.BarcodeFormat.AZTEC, java.lang.System.currentTimeMillis());
        byteSegments = decoderResult.getByteSegments();
        if (byteSegments != null) {
            result22.putMetadata(com.google.zxing.ResultMetadataType.BYTE_SEGMENTS, byteSegments);
        }
        eCLevel = decoderResult.getECLevel();
        if (eCLevel != null) {
            result22.putMetadata(com.google.zxing.ResultMetadataType.ERROR_CORRECTION_LEVEL, eCLevel);
        }
        return result22;
    }
}
