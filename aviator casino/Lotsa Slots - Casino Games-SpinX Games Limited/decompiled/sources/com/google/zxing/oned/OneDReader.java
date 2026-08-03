package com.google.zxing.oned;

/* loaded from: classes4.dex */
public abstract class OneDReader implements com.google.zxing.Reader {
    public abstract com.google.zxing.Result decodeRow(int i, com.google.zxing.common.BitArray bitArray, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.ChecksumException, com.google.zxing.FormatException;

    @Override // com.google.zxing.Reader
    public void reset() {
    }

    @Override // com.google.zxing.Reader
    public com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        return decode(binaryBitmap, null);
    }

    @Override // com.google.zxing.Reader
    public com.google.zxing.Result decode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        try {
            return doDecode(binaryBitmap, map);
        } catch (com.google.zxing.NotFoundException e) {
            if (map != null && map.containsKey(com.google.zxing.DecodeHintType.TRY_HARDER) && binaryBitmap.isRotateSupported()) {
                com.google.zxing.BinaryBitmap rotateCounterClockwise = binaryBitmap.rotateCounterClockwise();
                com.google.zxing.Result doDecode = doDecode(rotateCounterClockwise, map);
                java.util.Map<com.google.zxing.ResultMetadataType, java.lang.Object> resultMetadata = doDecode.getResultMetadata();
                int i = 270;
                if (resultMetadata != null && resultMetadata.containsKey(com.google.zxing.ResultMetadataType.ORIENTATION)) {
                    i = (((java.lang.Integer) resultMetadata.get(com.google.zxing.ResultMetadataType.ORIENTATION)).intValue() + 270) % 360;
                }
                doDecode.putMetadata(com.google.zxing.ResultMetadataType.ORIENTATION, java.lang.Integer.valueOf(i));
                com.google.zxing.ResultPoint[] resultPoints = doDecode.getResultPoints();
                if (resultPoints != null) {
                    int height = rotateCounterClockwise.getHeight();
                    for (int i2 = 0; i2 < resultPoints.length; i2++) {
                        resultPoints[i2] = new com.google.zxing.ResultPoint((height - resultPoints[i2].getY()) - 1.0f, resultPoints[i2].getX());
                    }
                }
                return doDecode;
            }
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        r3 = r22.getBlackRow(r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00db, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.google.zxing.Result doDecode(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        int i;
        int i2;
        int i3;
        java.util.Map<com.google.zxing.DecodeHintType, ?> map2;
        int i4;
        java.util.Map<com.google.zxing.DecodeHintType, ?> map3 = map;
        int width = binaryBitmap.getWidth();
        int height = binaryBitmap.getHeight();
        com.google.zxing.common.BitArray bitArray = new com.google.zxing.common.BitArray(width);
        char c = 0;
        int i5 = 1;
        boolean z = map3 != null && map3.containsKey(com.google.zxing.DecodeHintType.TRY_HARDER);
        int max = java.lang.Math.max(1, height >> (z ? 8 : 5));
        int i6 = z ? height : 15;
        int i7 = height / 2;
        int i8 = 0;
        while (i8 < i6) {
            i = i8 + 1;
            int i9 = i / 2;
            if ((i8 & 1) != 0) {
                i9 = -i9;
            }
            i2 = (i9 * max) + i7;
            if (i2 < 0 || i2 >= height) {
                break;
            }
            i8 = i;
            width = width;
            c = 0;
            i5 = 1;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
        while (i3 < 2) {
            if (i3 == i5) {
                bitArray.reverse();
                if (map3 != null && map3.containsKey(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK)) {
                    java.util.EnumMap enumMap = new java.util.EnumMap(com.google.zxing.DecodeHintType.class);
                    enumMap.putAll(map3);
                    enumMap.remove(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK);
                    map3 = enumMap;
                }
            }
            try {
                com.google.zxing.Result decodeRow = decodeRow(i2, bitArray, map3);
                if (i3 == i5) {
                    decodeRow.putMetadata(com.google.zxing.ResultMetadataType.ORIENTATION, 180);
                    com.google.zxing.ResultPoint[] resultPoints = decodeRow.getResultPoints();
                    if (resultPoints != null) {
                        map2 = map3;
                        float f = width;
                        try {
                            i4 = width;
                        } catch (com.google.zxing.ReaderException unused) {
                            i4 = width;
                            i3++;
                            map3 = map2;
                            width = i4;
                            c = 0;
                            i5 = 1;
                        }
                        try {
                            resultPoints[0] = new com.google.zxing.ResultPoint((f - resultPoints[c].getX()) - 1.0f, resultPoints[c].getY());
                            try {
                                resultPoints[1] = new com.google.zxing.ResultPoint((f - resultPoints[1].getX()) - 1.0f, resultPoints[1].getY());
                            } catch (com.google.zxing.ReaderException unused2) {
                                continue;
                                i3++;
                                map3 = map2;
                                width = i4;
                                c = 0;
                                i5 = 1;
                            }
                        } catch (com.google.zxing.ReaderException unused3) {
                            i3++;
                            map3 = map2;
                            width = i4;
                            c = 0;
                            i5 = 1;
                        }
                    }
                }
                return decodeRow;
            } catch (com.google.zxing.ReaderException unused4) {
                map2 = map3;
            }
        }
        continue;
        i8 = i;
        width = width;
        c = 0;
        i5 = 1;
    }

    protected static void recordPattern(com.google.zxing.common.BitArray bitArray, int i, int[] iArr) throws com.google.zxing.NotFoundException {
        int length = iArr.length;
        int i2 = 0;
        java.util.Arrays.fill(iArr, 0, length, 0);
        int size = bitArray.getSize();
        if (i >= size) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        boolean z = !bitArray.get(i);
        while (i < size) {
            if (bitArray.get(i) == z) {
                i2++;
                if (i2 == length) {
                    break;
                }
                iArr[i2] = 1;
                z = !z;
            } else {
                iArr[i2] = iArr[i2] + 1;
            }
            i++;
        }
        if (i2 != length) {
            if (i2 != length - 1 || i != size) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
        }
    }

    protected static void recordPatternInReverse(com.google.zxing.common.BitArray bitArray, int i, int[] iArr) throws com.google.zxing.NotFoundException {
        int length = iArr.length;
        boolean z = bitArray.get(i);
        while (i > 0 && length >= 0) {
            i--;
            if (bitArray.get(i) != z) {
                length--;
                z = !z;
            }
        }
        if (length >= 0) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        recordPattern(bitArray, i + 1, iArr);
    }

    protected static float patternMatchVariance(int[] iArr, int[] iArr2, float f) {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i += iArr[i3];
            i2 += iArr2[i3];
        }
        if (i < i2) {
            return Float.POSITIVE_INFINITY;
        }
        float f2 = i;
        float f3 = f2 / i2;
        float f4 = f * f3;
        float f5 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f6 = iArr2[i4] * f3;
            float f7 = iArr[i4];
            float f8 = f7 > f6 ? f7 - f6 : f6 - f7;
            if (f8 > f4) {
                return Float.POSITIVE_INFINITY;
            }
            f5 += f8;
        }
        return f5 / f2;
    }
}
