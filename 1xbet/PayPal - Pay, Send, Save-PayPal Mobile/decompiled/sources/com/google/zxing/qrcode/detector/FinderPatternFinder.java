package com.google.zxing.qrcode.detector;

/* loaded from: classes9.dex */
public class FinderPatternFinder {
    private static final int CENTER_QUORUM = 2;
    protected static final int MAX_MODULES = 97;
    protected static final int MIN_SKIP = 3;
    private static final com.google.zxing.qrcode.detector.FinderPatternFinder.EstimatedModuleComparator moduleComparator = new com.google.zxing.qrcode.detector.FinderPatternFinder.EstimatedModuleComparator();
    private final int[] crossCheckStateCount;
    private boolean hasSkipped;
    private final com.google.zxing.common.BitMatrix image;
    private final java.util.List<com.google.zxing.qrcode.detector.FinderPattern> possibleCenters;
    private final com.google.zxing.ResultPointCallback resultPointCallback;

    public FinderPatternFinder(com.google.zxing.common.BitMatrix bitMatrix) {
        this(bitMatrix, null);
    }

    public FinderPatternFinder(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPointCallback resultPointCallback) {
        this.image = bitMatrix;
        this.possibleCenters = new java.util.ArrayList();
        this.crossCheckStateCount = new int[5];
        this.resultPointCallback = resultPointCallback;
    }

    protected final com.google.zxing.common.BitMatrix getImage() {
        return this.image;
    }

    protected final java.util.List<com.google.zxing.qrcode.detector.FinderPattern> getPossibleCenters() {
        return this.possibleCenters;
    }

    final com.google.zxing.qrcode.detector.FinderPatternInfo find(java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        boolean z = map != null && map.containsKey(com.google.zxing.DecodeHintType.TRY_HARDER);
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i = (height * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        int i2 = i - 1;
        boolean z2 = false;
        while (i2 < height && !z2) {
            doClearCounts(iArr);
            int i3 = 0;
            int i4 = 0;
            while (i3 < width) {
                if (this.image.get(i3, i2)) {
                    if ((i4 & 1) == 1) {
                        i4++;
                    }
                    iArr[i4] = iArr[i4] + 1;
                } else {
                    if ((i4 & 1) == 0) {
                        if (i4 == 4) {
                            if (foundPatternCross(iArr)) {
                                if (handlePossibleCenter(iArr, i2, i3)) {
                                    if (this.hasSkipped) {
                                        z2 = haveMultiplyConfirmedCenters();
                                    } else {
                                        int findRowSkip = findRowSkip();
                                        int i5 = iArr[2];
                                        if (findRowSkip > i5) {
                                            i2 += (findRowSkip - i5) - 2;
                                            i3 = width - 1;
                                        }
                                    }
                                    doClearCounts(iArr);
                                    i = 2;
                                    i4 = 0;
                                } else {
                                    doShiftCounts2(iArr);
                                }
                            } else {
                                doShiftCounts2(iArr);
                            }
                            i4 = 3;
                        } else {
                            i4++;
                        }
                    }
                    iArr[i4] = iArr[i4] + 1;
                }
                i3++;
            }
            if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i2, width)) {
                i = iArr[0];
                if (this.hasSkipped) {
                    z2 = haveMultiplyConfirmedCenters();
                }
            }
            i2 += i;
        }
        com.google.zxing.qrcode.detector.FinderPattern[] selectBestPatterns = selectBestPatterns();
        com.google.zxing.ResultPoint.orderBestPatterns(selectBestPatterns);
        return new com.google.zxing.qrcode.detector.FinderPatternInfo(selectBestPatterns);
    }

    private static float centerFromEnd(int[] iArr, int i) {
        return ((i - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    protected static boolean foundPatternCross(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 2.0f;
        if (java.lang.Math.abs(f - iArr[0]) < f2 && java.lang.Math.abs(f - iArr[1]) < f2) {
            if (java.lang.Math.abs((f * 3.0f) - iArr[2]) < 3.0f * f2 && java.lang.Math.abs(f - iArr[3]) < f2 && java.lang.Math.abs(f - iArr[4]) < f2) {
                return true;
            }
        }
        return false;
    }

    protected static boolean foundPatternDiagonal(int[] iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 5; i2++) {
            int i3 = iArr[i2];
            if (i3 == 0) {
                return false;
            }
            i += i3;
        }
        if (i < 7) {
            return false;
        }
        float f = i / 7.0f;
        float f2 = f / 1.333f;
        if (java.lang.Math.abs(f - iArr[0]) < f2 && java.lang.Math.abs(f - iArr[1]) < f2) {
            if (java.lang.Math.abs((f * 3.0f) - iArr[2]) < 3.0f * f2 && java.lang.Math.abs(f - iArr[3]) < f2 && java.lang.Math.abs(f - iArr[4]) < f2) {
                return true;
            }
        }
        return false;
    }

    private int[] getCrossCheckStateCount() {
        doClearCounts(this.crossCheckStateCount);
        return this.crossCheckStateCount;
    }

    @java.lang.Deprecated
    protected final void clearCounts(int[] iArr) {
        doClearCounts(iArr);
    }

    @java.lang.Deprecated
    protected final void shiftCounts2(int[] iArr) {
        doShiftCounts2(iArr);
    }

    protected static void doClearCounts(int[] iArr) {
        java.util.Arrays.fill(iArr, 0);
    }

    protected static void doShiftCounts2(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }

    private boolean crossCheckDiagonal(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i6 = 0;
        while (i >= i6 && i2 >= i6 && this.image.get(i2 - i6, i - i6)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i6++;
        }
        if (crossCheckStateCount[2] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && !this.image.get(i2 - i6, i - i6)) {
            crossCheckStateCount[1] = crossCheckStateCount[1] + 1;
            i6++;
        }
        if (crossCheckStateCount[1] == 0) {
            return false;
        }
        while (i >= i6 && i2 >= i6 && this.image.get(i2 - i6, i - i6)) {
            crossCheckStateCount[0] = crossCheckStateCount[0] + 1;
            i6++;
        }
        if (crossCheckStateCount[0] == 0) {
            return false;
        }
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i7 = 1;
        while (true) {
            int i8 = i + i7;
            if (i8 >= height || (i5 = i2 + i7) >= width || !this.image.get(i5, i8)) {
                break;
            }
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i7++;
        }
        while (true) {
            int i9 = i + i7;
            if (i9 >= height || (i4 = i2 + i7) >= width || this.image.get(i4, i9)) {
                break;
            }
            crossCheckStateCount[3] = crossCheckStateCount[3] + 1;
            i7++;
        }
        if (crossCheckStateCount[3] == 0) {
            return false;
        }
        while (true) {
            int i10 = i + i7;
            if (i10 >= height || (i3 = i2 + i7) >= width || !this.image.get(i3, i10)) {
                break;
            }
            crossCheckStateCount[4] = crossCheckStateCount[4] + 1;
            i7++;
        }
        if (crossCheckStateCount[4] == 0) {
            return false;
        }
        return foundPatternDiagonal(crossCheckStateCount);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0080, code lost:
    
        if (r2[3] >= r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r11 >= r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0089, code lost:
    
        if (r0.get(r12, r11) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008b, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008d, code lost:
    
        if (r9 >= r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008f, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0096, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
    
        if (r12 < r13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009a, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00af, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < (r14 * 2)) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b1, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
    
        if (foundPatternCross(r2) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bc, code lost:
    
        return centerFromEnd(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float crossCheckVertical(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        com.google.zxing.common.BitMatrix bitMatrix = this.image;
        int height = bitMatrix.getHeight();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i7 = i;
        while (i7 >= 0 && bitMatrix.get(i2, i7)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i7--;
        }
        if (i7 < 0) {
            return Float.NaN;
        }
        while (i7 >= 0 && !bitMatrix.get(i2, i7)) {
            int i8 = crossCheckStateCount[1];
            if (i8 > i3) {
                break;
            }
            crossCheckStateCount[1] = i8 + 1;
            i7--;
        }
        if (i7 >= 0 && crossCheckStateCount[1] <= i3) {
            while (i7 >= 0 && bitMatrix.get(i2, i7) && (i6 = crossCheckStateCount[0]) <= i3) {
                crossCheckStateCount[0] = i6 + 1;
                i7--;
            }
            if (crossCheckStateCount[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < height && bitMatrix.get(i2, i9)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i9++;
            }
            if (i9 == height) {
                return Float.NaN;
            }
            while (i9 < height && !bitMatrix.get(i2, i9) && (i5 = crossCheckStateCount[3]) < i3) {
                crossCheckStateCount[3] = i5 + 1;
                i9++;
            }
        }
        return Float.NaN;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0080, code lost:
    
        if (r2[3] >= r13) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0083, code lost:
    
        if (r11 >= r1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0089, code lost:
    
        if (r0.get(r11, r12) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008b, code lost:
    
        r9 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x008d, code lost:
    
        if (r9 >= r13) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008f, code lost:
    
        r2[4] = r9 + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0096, code lost:
    
        r12 = r2[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0098, code lost:
    
        if (r12 < r13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x009a, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ae, code lost:
    
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r12) - r14) * 5) < r14) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00b0, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b5, code lost:
    
        if (foundPatternCross(r2) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00bb, code lost:
    
        return centerFromEnd(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private float crossCheckHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        com.google.zxing.common.BitMatrix bitMatrix = this.image;
        int width = bitMatrix.getWidth();
        int[] crossCheckStateCount = getCrossCheckStateCount();
        int i7 = i;
        while (i7 >= 0 && bitMatrix.get(i7, i2)) {
            crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
            i7--;
        }
        if (i7 < 0) {
            return Float.NaN;
        }
        while (i7 >= 0 && !bitMatrix.get(i7, i2)) {
            int i8 = crossCheckStateCount[1];
            if (i8 > i3) {
                break;
            }
            crossCheckStateCount[1] = i8 + 1;
            i7--;
        }
        if (i7 >= 0 && crossCheckStateCount[1] <= i3) {
            while (i7 >= 0 && bitMatrix.get(i7, i2) && (i6 = crossCheckStateCount[0]) <= i3) {
                crossCheckStateCount[0] = i6 + 1;
                i7--;
            }
            if (crossCheckStateCount[0] > i3) {
                return Float.NaN;
            }
            int i9 = i + 1;
            while (i9 < width && bitMatrix.get(i9, i2)) {
                crossCheckStateCount[2] = crossCheckStateCount[2] + 1;
                i9++;
            }
            if (i9 == width) {
                return Float.NaN;
            }
            while (i9 < width && !bitMatrix.get(i9, i2) && (i5 = crossCheckStateCount[3]) < i3) {
                crossCheckStateCount[3] = i5 + 1;
                i9++;
            }
        }
        return Float.NaN;
    }

    @java.lang.Deprecated
    protected final boolean handlePossibleCenter(int[] iArr, int i, int i2, boolean z) {
        return handlePossibleCenter(iArr, i, i2);
    }

    protected final boolean handlePossibleCenter(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int centerFromEnd = (int) centerFromEnd(iArr, i2);
        float crossCheckVertical = crossCheckVertical(i, centerFromEnd, iArr[2], i4);
        if (!java.lang.Float.isNaN(crossCheckVertical)) {
            int i5 = (int) crossCheckVertical;
            float crossCheckHorizontal = crossCheckHorizontal(centerFromEnd, i5, iArr[2], i4);
            if (!java.lang.Float.isNaN(crossCheckHorizontal) && crossCheckDiagonal(i5, (int) crossCheckHorizontal)) {
                float f = i4 / 7.0f;
                while (true) {
                    if (i3 < this.possibleCenters.size()) {
                        com.google.zxing.qrcode.detector.FinderPattern finderPattern = this.possibleCenters.get(i3);
                        if (finderPattern.aboutEquals(f, crossCheckVertical, crossCheckHorizontal)) {
                            this.possibleCenters.set(i3, finderPattern.combineEstimate(crossCheckVertical, crossCheckHorizontal, f));
                            break;
                        }
                        i3++;
                    } else {
                        com.google.zxing.qrcode.detector.FinderPattern finderPattern2 = new com.google.zxing.qrcode.detector.FinderPattern(crossCheckHorizontal, crossCheckVertical, f);
                        this.possibleCenters.add(finderPattern2);
                        com.google.zxing.ResultPointCallback resultPointCallback = this.resultPointCallback;
                        if (resultPointCallback != null) {
                            resultPointCallback.foundPossibleResultPoint(finderPattern2);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    private int findRowSkip() {
        if (this.possibleCenters.size() <= 1) {
            return 0;
        }
        com.google.zxing.qrcode.detector.FinderPattern finderPattern = null;
        for (com.google.zxing.qrcode.detector.FinderPattern finderPattern2 : this.possibleCenters) {
            if (finderPattern2.getCount() >= 2) {
                if (finderPattern != null) {
                    this.hasSkipped = true;
                    return ((int) (java.lang.Math.abs(finderPattern.getX() - finderPattern2.getX()) - java.lang.Math.abs(finderPattern.getY() - finderPattern2.getY()))) / 2;
                }
                finderPattern = finderPattern2;
            }
        }
        return 0;
    }

    private boolean haveMultiplyConfirmedCenters() {
        int size = this.possibleCenters.size();
        float f = 0.0f;
        float f2 = 0.0f;
        int i = 0;
        for (com.google.zxing.qrcode.detector.FinderPattern finderPattern : this.possibleCenters) {
            if (finderPattern.getCount() >= 2) {
                i++;
                f2 += finderPattern.getEstimatedModuleSize();
            }
        }
        if (i < 3) {
            return false;
        }
        float f3 = f2 / size;
        java.util.Iterator<com.google.zxing.qrcode.detector.FinderPattern> it = this.possibleCenters.iterator();
        while (it.hasNext()) {
            f += java.lang.Math.abs(it.next().getEstimatedModuleSize() - f3);
        }
        return f <= f2 * 0.05f;
    }

    private static double squaredDistance(com.google.zxing.qrcode.detector.FinderPattern finderPattern, com.google.zxing.qrcode.detector.FinderPattern finderPattern2) {
        double x = finderPattern.getX() - finderPattern2.getX();
        double y = finderPattern.getY() - finderPattern2.getY();
        return (x * x) + (y * y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        if (r14 < r18) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b3, code lost:
    
        r20 = r18;
        r18 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b1, code lost:
    
        if (r14 < r18) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.google.zxing.qrcode.detector.FinderPattern[] selectBestPatterns() throws com.google.zxing.NotFoundException {
        double d;
        double abs;
        if (this.possibleCenters.size() < 3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        java.util.Iterator<com.google.zxing.qrcode.detector.FinderPattern> it = this.possibleCenters.iterator();
        while (it.hasNext()) {
            if (it.next().getCount() < 2) {
                it.remove();
            }
        }
        java.util.Collections.sort(this.possibleCenters, moduleComparator);
        com.google.zxing.qrcode.detector.FinderPattern[] finderPatternArr = new com.google.zxing.qrcode.detector.FinderPattern[3];
        int i = 0;
        double d2 = Double.MAX_VALUE;
        while (i < this.possibleCenters.size() - 2) {
            com.google.zxing.qrcode.detector.FinderPattern finderPattern = this.possibleCenters.get(i);
            float estimatedModuleSize = finderPattern.getEstimatedModuleSize();
            i++;
            int i2 = i;
            while (i2 < this.possibleCenters.size() - 1) {
                com.google.zxing.qrcode.detector.FinderPattern finderPattern2 = this.possibleCenters.get(i2);
                double squaredDistance = squaredDistance(finderPattern, finderPattern2);
                i2++;
                for (int i3 = i2; i3 < this.possibleCenters.size(); i3++) {
                    com.google.zxing.qrcode.detector.FinderPattern finderPattern3 = this.possibleCenters.get(i3);
                    if (finderPattern3.getEstimatedModuleSize() <= 1.4f * estimatedModuleSize) {
                        double squaredDistance2 = squaredDistance(finderPattern2, finderPattern3);
                        double squaredDistance3 = squaredDistance(finderPattern, finderPattern3);
                        if (squaredDistance < squaredDistance2) {
                            if (squaredDistance2 <= squaredDistance3) {
                                squaredDistance2 = squaredDistance3;
                                squaredDistance3 = squaredDistance2;
                            }
                            d = squaredDistance;
                            abs = java.lang.Math.abs(squaredDistance2 - (squaredDistance3 * 2.0d)) + java.lang.Math.abs(squaredDistance2 - (d * 2.0d));
                            if (abs >= d2) {
                                finderPatternArr[0] = finderPattern;
                                finderPatternArr[1] = finderPattern2;
                                finderPatternArr[2] = finderPattern3;
                                d2 = abs;
                            }
                        } else {
                            if (squaredDistance2 < squaredDistance3) {
                                squaredDistance2 = squaredDistance3;
                                squaredDistance3 = squaredDistance2;
                            }
                            d = squaredDistance3;
                            squaredDistance3 = squaredDistance2;
                            squaredDistance2 = squaredDistance;
                            abs = java.lang.Math.abs(squaredDistance2 - (squaredDistance3 * 2.0d)) + java.lang.Math.abs(squaredDistance2 - (d * 2.0d));
                            if (abs >= d2) {
                            }
                        }
                    }
                }
            }
        }
        if (d2 != Double.MAX_VALUE) {
            return finderPatternArr;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    static final class EstimatedModuleComparator implements java.util.Comparator<com.google.zxing.qrcode.detector.FinderPattern>, java.io.Serializable {
        private EstimatedModuleComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(com.google.zxing.qrcode.detector.FinderPattern finderPattern, com.google.zxing.qrcode.detector.FinderPattern finderPattern2) {
            return java.lang.Float.compare(finderPattern.getEstimatedModuleSize(), finderPattern2.getEstimatedModuleSize());
        }
    }
}
