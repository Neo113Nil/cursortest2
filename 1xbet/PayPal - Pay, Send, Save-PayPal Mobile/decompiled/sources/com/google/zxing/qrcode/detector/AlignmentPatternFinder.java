package com.google.zxing.qrcode.detector;

/* loaded from: classes9.dex */
final class AlignmentPatternFinder {
    private final int height;
    private final com.google.zxing.common.BitMatrix image;
    private final float moduleSize;
    private final com.google.zxing.ResultPointCallback resultPointCallback;
    private final int startX;
    private final int startY;
    private final int width;
    private final java.util.List<com.google.zxing.qrcode.detector.AlignmentPattern> possibleCenters = new java.util.ArrayList(5);
    private final int[] crossCheckStateCount = new int[3];

    AlignmentPatternFinder(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, int i3, int i4, float f, com.google.zxing.ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.startX = i;
        this.startY = i2;
        this.width = i3;
        this.height = i4;
        this.moduleSize = f;
        this.resultPointCallback = resultPointCallback;
    }

    final com.google.zxing.qrcode.detector.AlignmentPattern find() throws com.google.zxing.NotFoundException {
        com.google.zxing.qrcode.detector.AlignmentPattern handlePossibleCenter;
        com.google.zxing.qrcode.detector.AlignmentPattern handlePossibleCenter2;
        int i = this.startX;
        int i2 = this.height;
        int i3 = this.width + i;
        int i4 = this.startY;
        int i5 = i2 / 2;
        int[] iArr = new int[3];
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = ((i6 & 1) == 0 ? (i6 + 1) / 2 : -((i6 + 1) / 2)) + i4 + i5;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i8 = i;
            while (i8 < i3 && !this.image.get(i8, i7)) {
                i8++;
            }
            int i9 = 0;
            while (i8 < i3) {
                if (!this.image.get(i8, i7)) {
                    if (i9 == 1) {
                        i9++;
                    }
                    iArr[i9] = iArr[i9] + 1;
                } else if (i9 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i9 == 2) {
                    if (foundPatternCross(iArr) && (handlePossibleCenter2 = handlePossibleCenter(iArr, i7, i8)) != null) {
                        return handlePossibleCenter2;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i9 = 1;
                } else {
                    i9++;
                    iArr[i9] = iArr[i9] + 1;
                }
                i8++;
            }
            if (foundPatternCross(iArr) && (handlePossibleCenter = handlePossibleCenter(iArr, i7, i3)) != null) {
                return handlePossibleCenter;
            }
        }
        if (!this.possibleCenters.isEmpty()) {
            return this.possibleCenters.get(0);
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static float centerFromEnd(int[] iArr, int i) {
        return (i - iArr[2]) - (iArr[1] / 2.0f);
    }

    private boolean foundPatternCross(int[] iArr) {
        float f = this.moduleSize;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (java.lang.Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005b, code lost:
    
        if (r2[1] > r12) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005d, code lost:
    
        if (r10 >= r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0063, code lost:
    
        if (r0.get(r11, r10) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        r6 = r2[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        if (r6 > r12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0069, code lost:
    
        r2[2] = r6 + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0070, code lost:
    
        r11 = r2[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r11 <= r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0074, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0083, code lost:
    
        if ((java.lang.Math.abs(((r2[0] + r2[1]) + r11) - r13) * 5) < (r13 * 2)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x008a, code lost:
    
        if (foundPatternCross(r2) == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0090, code lost:
    
        return centerFromEnd(r2, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float crossCheckVertical(int i, int i2, int i3, int i4) {
        int i5;
        com.google.zxing.common.BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] iArr = this.crossCheckStateCount;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        int i6 = i;
        while (i6 >= 0 && bitMatrix.get(i2, i6)) {
            int i7 = iArr[1];
            if (i7 > i3) {
                break;
            }
            iArr[1] = i7 + 1;
            i6--;
        }
        if (i6 >= 0 && iArr[1] <= i3) {
            while (i6 >= 0 && !bitMatrix.get(i2, i6)) {
                int i8 = iArr[0];
                if (i8 > i3) {
                    break;
                }
                iArr[0] = i8 + 1;
                i6--;
            }
            if (iArr[0] > i3) {
                return Float.NaN;
            }
            while (true) {
                i++;
                if (i >= height || !bitMatrix.get(i2, i) || (i5 = iArr[1]) > i3) {
                    break;
                }
                iArr[1] = i5 + 1;
            }
        }
        return Float.NaN;
    }

    private com.google.zxing.qrcode.detector.AlignmentPattern handlePossibleCenter(int[] iArr, int i, int i2) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        float centerFromEnd = centerFromEnd(iArr, i2);
        float crossCheckVertical = crossCheckVertical(i, (int) centerFromEnd, iArr[1] * 2, i3 + i4 + i5);
        if (java.lang.Float.isNaN(crossCheckVertical)) {
            return null;
        }
        float f = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (com.google.zxing.qrcode.detector.AlignmentPattern alignmentPattern : this.possibleCenters) {
            if (alignmentPattern.aboutEquals(f, crossCheckVertical, centerFromEnd)) {
                return alignmentPattern.combineEstimate(crossCheckVertical, centerFromEnd, f);
            }
        }
        com.google.zxing.qrcode.detector.AlignmentPattern alignmentPattern2 = new com.google.zxing.qrcode.detector.AlignmentPattern(centerFromEnd, crossCheckVertical, f);
        this.possibleCenters.add(alignmentPattern2);
        com.google.zxing.ResultPointCallback resultPointCallback = this.resultPointCallback;
        if (resultPointCallback == null) {
            return null;
        }
        resultPointCallback.foundPossibleResultPoint(alignmentPattern2);
        return null;
    }
}
