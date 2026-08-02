package com.google.zxing.multi;

/* loaded from: classes9.dex */
public final class GenericMultipleBarcodeReader implements com.google.zxing.multi.MultipleBarcodeReader {
    static final com.google.zxing.Result[] EMPTY_RESULT_ARRAY = new com.google.zxing.Result[0];
    private static final int MAX_DEPTH = 4;
    private static final int MIN_DIMENSION_TO_RECUR = 100;
    private final com.google.zxing.Reader delegate;

    public GenericMultipleBarcodeReader(com.google.zxing.Reader reader) {
        this.delegate = reader;
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public final com.google.zxing.Result[] decodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException {
        return decodeMultiple(binaryBitmap, null);
    }

    @Override // com.google.zxing.multi.MultipleBarcodeReader
    public final com.google.zxing.Result[] decodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        doDecodeMultiple(binaryBitmap, map, arrayList, 0, 0, 0);
        if (arrayList.isEmpty()) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        return (com.google.zxing.Result[]) arrayList.toArray(EMPTY_RESULT_ARRAY);
    }

    private void doDecodeMultiple(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map, java.util.List<com.google.zxing.Result> list, int i, int i2, int i3) {
        float f;
        float f2;
        float f3;
        int i4;
        com.google.zxing.BinaryBitmap binaryBitmap2 = binaryBitmap;
        int i5 = i2;
        for (int i6 = i3; i6 <= 4; i6++) {
            try {
                com.google.zxing.Result decode = this.delegate.decode(binaryBitmap2, map);
                java.util.Iterator<com.google.zxing.Result> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().getText().equals(decode.getText())) {
                            break;
                        }
                    } else {
                        list.add(translateResultPoints(decode, i, i5));
                        break;
                    }
                }
                com.google.zxing.ResultPoint[] resultPoints = decode.getResultPoints();
                if (resultPoints == null || resultPoints.length == 0) {
                    return;
                }
                int width = binaryBitmap2.getWidth();
                int height = binaryBitmap2.getHeight();
                float f4 = width;
                float f5 = 0.0f;
                float f6 = height;
                float f7 = 0.0f;
                for (com.google.zxing.ResultPoint resultPoint : resultPoints) {
                    if (resultPoint != null) {
                        float x = resultPoint.getX();
                        float y = resultPoint.getY();
                        if (x < f4) {
                            f4 = x;
                        }
                        if (y < f6) {
                            f6 = y;
                        }
                        if (x > f7) {
                            f7 = x;
                        }
                        if (y > f5) {
                            f5 = y;
                        }
                    }
                }
                if (f4 > 100.0f) {
                    f = f7;
                    f3 = f6;
                    f2 = f5;
                    i4 = 0;
                    doDecodeMultiple(binaryBitmap2.crop(0, 0, (int) f4, height), map, list, i, i5, i6 + 1);
                } else {
                    f = f7;
                    f2 = f5;
                    f3 = f6;
                    i4 = 0;
                }
                if (f3 > 100.0f) {
                    doDecodeMultiple(binaryBitmap2.crop(i4, i4, width, (int) f3), map, list, i, i5, i6 + 1);
                }
                if (f < width - 100) {
                    int i7 = (int) f;
                    doDecodeMultiple(binaryBitmap2.crop(i7, i4, width - i7, height), map, list, i + i7, i5, i6 + 1);
                }
                if (f2 >= height - 100) {
                    return;
                }
                int i8 = (int) f2;
                binaryBitmap2 = binaryBitmap2.crop(i4, i8, width, height - i8);
                i5 += i8;
            } catch (com.google.zxing.ReaderException unused) {
                return;
            }
        }
    }

    private static com.google.zxing.Result translateResultPoints(com.google.zxing.Result result, int i, int i2) {
        com.google.zxing.ResultPoint[] resultPoints = result.getResultPoints();
        if (resultPoints == null) {
            return result;
        }
        com.google.zxing.ResultPoint[] resultPointArr = new com.google.zxing.ResultPoint[resultPoints.length];
        for (int i3 = 0; i3 < resultPoints.length; i3++) {
            com.google.zxing.ResultPoint resultPoint = resultPoints[i3];
            if (resultPoint != null) {
                resultPointArr[i3] = new com.google.zxing.ResultPoint(resultPoint.getX() + i, resultPoint.getY() + i2);
            }
        }
        com.google.zxing.Result result2 = new com.google.zxing.Result(result.getText(), result.getRawBytes(), result.getNumBits(), resultPointArr, result.getBarcodeFormat(), result.getTimestamp());
        result2.putAllMetadata(result.getResultMetadata());
        return result2;
    }
}
