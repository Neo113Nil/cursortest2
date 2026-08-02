package com.google.zxing.pdf417.detector;

/* loaded from: classes9.dex */
public final class Detector {
    private static final int BARCODE_MIN_HEIGHT = 10;
    private static final float MAX_AVG_VARIANCE = 0.42f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.8f;
    private static final int MAX_PATTERN_DRIFT = 5;
    private static final int MAX_PIXEL_DRIFT = 3;
    private static final float MAX_STOP_PATTERN_HEIGHT_VARIANCE = 0.5f;
    private static final int ROW_STEP = 5;
    private static final int SKIPPED_ROW_COUNT_MAX = 25;
    private static final int[] INDEXES_START_PATTERN = {0, 4, 1, 5};
    private static final int[] INDEXES_STOP_PATTERN = {6, 2, 7, 3};
    private static final int[] START_PATTERN = {8, 1, 1, 1, 1, 1, 1, 3};
    private static final int[] STOP_PATTERN = {7, 1, 1, 3, 1, 1, 1, 2, 1};
    private static final int[] ROTATIONS = {0, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 270, 90};

    private Detector() {
    }

    public static com.google.zxing.pdf417.detector.PDF417DetectorResult detect(com.google.zxing.BinaryBitmap binaryBitmap, java.util.Map<com.google.zxing.DecodeHintType, ?> map, boolean z) throws com.google.zxing.NotFoundException {
        com.google.zxing.common.BitMatrix blackMatrix = binaryBitmap.getBlackMatrix();
        for (int i : ROTATIONS) {
            com.google.zxing.common.BitMatrix applyRotation = applyRotation(blackMatrix, i);
            java.util.List<com.google.zxing.ResultPoint[]> detect = detect(z, applyRotation);
            if (!detect.isEmpty()) {
                return new com.google.zxing.pdf417.detector.PDF417DetectorResult(applyRotation, detect, i);
            }
        }
        return new com.google.zxing.pdf417.detector.PDF417DetectorResult(blackMatrix, new java.util.ArrayList(), 0);
    }

    private static com.google.zxing.common.BitMatrix applyRotation(com.google.zxing.common.BitMatrix bitMatrix, int i) {
        if (i % 360 == 0) {
            return bitMatrix;
        }
        com.google.zxing.common.BitMatrix m10600clone = bitMatrix.m10600clone();
        m10600clone.rotate(i);
        return m10600clone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        if (r4 == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        if (r3.hasNext() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        r4 = (com.google.zxing.ResultPoint[]) r3.next();
        r7 = r4[1];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        if (r7 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0033, code lost:
    
        r2 = (int) java.lang.Math.max(r2, r7.getY());
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003d, code lost:
    
        r4 = r4[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r4 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r2 = java.lang.Math.max(r2, (int) r4.getY());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.util.List<com.google.zxing.ResultPoint[]> detect(boolean z, com.google.zxing.common.BitMatrix bitMatrix) {
        int x;
        float y;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        loop0: while (true) {
            int i2 = 0;
            boolean z2 = false;
            while (true) {
                if (i >= bitMatrix.getHeight()) {
                    break loop0;
                }
                com.google.zxing.ResultPoint[] findVertices = findVertices(bitMatrix, i, i2);
                if (findVertices[0] != null || findVertices[3] != null) {
                    arrayList.add(findVertices);
                    if (!z) {
                        break loop0;
                    }
                    com.google.zxing.ResultPoint resultPoint = findVertices[2];
                    if (resultPoint != null) {
                        x = (int) resultPoint.getX();
                        y = findVertices[2].getY();
                    } else {
                        x = (int) findVertices[4].getX();
                        y = findVertices[4].getY();
                    }
                    i2 = x;
                    i = (int) y;
                    z2 = true;
                } else {
                    break;
                }
            }
            i += 5;
        }
        return arrayList;
    }

    private static com.google.zxing.ResultPoint[] findVertices(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int height = bitMatrix.getHeight();
        int width = bitMatrix.getWidth();
        com.google.zxing.ResultPoint[] resultPointArr = new com.google.zxing.ResultPoint[8];
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i, i2, 10, START_PATTERN), INDEXES_START_PATTERN);
        com.google.zxing.ResultPoint resultPoint = resultPointArr[4];
        if (resultPoint != null) {
            i2 = (int) resultPoint.getX();
            i = (int) resultPointArr[4].getY();
            if (resultPointArr[5] != null) {
                i3 = i;
                i4 = i2;
                i5 = (int) java.lang.Math.max((((int) r0.getY()) - i) * 0.5f, 10.0f);
                copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i3, i4, i5, STOP_PATTERN), INDEXES_STOP_PATTERN);
                return resultPointArr;
            }
        }
        i3 = i;
        i4 = i2;
        i5 = 10;
        copyToResult(resultPointArr, findRowsWithPattern(bitMatrix, height, width, i3, i4, i5, STOP_PATTERN), INDEXES_STOP_PATTERN);
        return resultPointArr;
    }

    private static void copyToResult(com.google.zxing.ResultPoint[] resultPointArr, com.google.zxing.ResultPoint[] resultPointArr2, int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            resultPointArr[iArr[i]] = resultPointArr2[i];
        }
    }

    private static com.google.zxing.ResultPoint[] findRowsWithPattern(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z;
        com.google.zxing.ResultPoint[] resultPointArr = new com.google.zxing.ResultPoint[4];
        int[] iArr2 = new int[iArr.length];
        int i6 = i3;
        while (true) {
            if (i6 >= i) {
                z = false;
                break;
            }
            int[] findGuardPattern = findGuardPattern(bitMatrix, i4, i6, i2, iArr, iArr2);
            if (findGuardPattern != null) {
                int i7 = i6;
                int[] iArr3 = findGuardPattern;
                while (i7 > 0) {
                    int i8 = i7 - 1;
                    int[] findGuardPattern2 = findGuardPattern(bitMatrix, i4, i8, i2, iArr, iArr2);
                    if (findGuardPattern2 == null) {
                        break;
                    }
                    iArr3 = findGuardPattern2;
                    i7 = i8;
                }
                float f = i7;
                resultPointArr[0] = new com.google.zxing.ResultPoint(iArr3[0], f);
                resultPointArr[1] = new com.google.zxing.ResultPoint(iArr3[1], f);
                z = true;
                i6 = i7;
            } else {
                i6 += 5;
            }
        }
        int i9 = i6 + 1;
        if (z) {
            int[] iArr4 = {(int) resultPointArr[0].getX(), (int) resultPointArr[1].getX()};
            int i10 = i9;
            int i11 = 0;
            while (i10 < i) {
                int[] findGuardPattern3 = findGuardPattern(bitMatrix, iArr4[0], i10, i2, iArr, iArr2);
                if (findGuardPattern3 != null && java.lang.Math.abs(iArr4[0] - findGuardPattern3[0]) < 5 && java.lang.Math.abs(iArr4[1] - findGuardPattern3[1]) < 5) {
                    iArr4 = findGuardPattern3;
                    i11 = 0;
                } else {
                    if (i11 > 25) {
                        break;
                    }
                    i11++;
                }
                i10++;
            }
            i9 = i10 - (i11 + 1);
            float f2 = i9;
            resultPointArr[2] = new com.google.zxing.ResultPoint(iArr4[0], f2);
            resultPointArr[3] = new com.google.zxing.ResultPoint(iArr4[1], f2);
        }
        if (i9 - i6 < i5) {
            java.util.Arrays.fill(resultPointArr, (java.lang.Object) null);
        }
        return resultPointArr;
    }

    private static int[] findGuardPattern(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, int i3, int[] iArr, int[] iArr2) {
        java.util.Arrays.fill(iArr2, 0, iArr2.length, 0);
        for (int i4 = 0; bitMatrix.get(i, i2) && i > 0 && i4 < 3; i4++) {
            i--;
        }
        int length = iArr.length;
        int i5 = i;
        int i6 = 0;
        boolean z = false;
        while (i < i3) {
            if (bitMatrix.get(i, i2) != z) {
                iArr2[i6] = iArr2[i6] + 1;
            } else {
                if (i6 != length - 1) {
                    i6++;
                } else {
                    if (patternMatchVariance(iArr2, iArr) < 0.42f) {
                        return new int[]{i5, i};
                    }
                    i5 += iArr2[0] + iArr2[1];
                    int i7 = i6 - 1;
                    java.lang.System.arraycopy(iArr2, 2, iArr2, 0, i7);
                    iArr2[i7] = 0;
                    iArr2[i6] = 0;
                    i6--;
                }
                iArr2[i6] = 1;
                z = !z;
            }
            i++;
        }
        if (i6 != length - 1 || patternMatchVariance(iArr2, iArr) >= 0.42f) {
            return null;
        }
        return new int[]{i5, i - 1};
    }

    private static float patternMatchVariance(int[] iArr, int[] iArr2) {
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
        float f = i;
        float f2 = f / i2;
        float f3 = 0.0f;
        for (int i4 = 0; i4 < length; i4++) {
            float f4 = iArr2[i4] * f2;
            float f5 = iArr[i4];
            float f6 = f5 > f4 ? f5 - f4 : f4 - f5;
            if (f6 > 0.8f * f2) {
                return Float.POSITIVE_INFINITY;
            }
            f3 += f6;
        }
        return f3 / f;
    }
}
