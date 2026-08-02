package com.google.zxing.multi.qrcode.detector;

/* loaded from: classes9.dex */
public final class MultiFinderPatternFinder extends com.google.zxing.qrcode.detector.FinderPatternFinder {
    private static final float DIFF_MODSIZE_CUTOFF = 0.5f;
    private static final float DIFF_MODSIZE_CUTOFF_PERCENT = 0.05f;
    private static final float MAX_MODULE_COUNT_PER_EDGE = 180.0f;
    private static final float MIN_MODULE_COUNT_PER_EDGE = 9.0f;
    private static final com.google.zxing.qrcode.detector.FinderPatternInfo[] EMPTY_RESULT_ARRAY = new com.google.zxing.qrcode.detector.FinderPatternInfo[0];
    private static final com.google.zxing.qrcode.detector.FinderPattern[] EMPTY_FP_ARRAY = new com.google.zxing.qrcode.detector.FinderPattern[0];
    private static final com.google.zxing.qrcode.detector.FinderPattern[][] EMPTY_FP_2D_ARRAY = new com.google.zxing.qrcode.detector.FinderPattern[0][];

    static final class ModuleSizeComparator implements java.util.Comparator<com.google.zxing.qrcode.detector.FinderPattern>, java.io.Serializable {
        private ModuleSizeComparator() {
        }

        @Override // java.util.Comparator
        public final int compare(com.google.zxing.qrcode.detector.FinderPattern finderPattern, com.google.zxing.qrcode.detector.FinderPattern finderPattern2) {
            double estimatedModuleSize = finderPattern2.getEstimatedModuleSize() - finderPattern.getEstimatedModuleSize();
            if (estimatedModuleSize < 0.0d) {
                return -1;
            }
            return estimatedModuleSize > 0.0d ? 1 : 0;
        }
    }

    public MultiFinderPatternFinder(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPointCallback resultPointCallback) {
        super(bitMatrix, resultPointCallback);
    }

    private com.google.zxing.qrcode.detector.FinderPattern[][] selectMultipleBestPatterns() throws com.google.zxing.NotFoundException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.zxing.qrcode.detector.FinderPattern finderPattern : getPossibleCenters()) {
            if (finderPattern.getCount() >= 2) {
                arrayList.add(finderPattern);
            }
        }
        int size = arrayList.size();
        if (size < 3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        if (size == 3) {
            return new com.google.zxing.qrcode.detector.FinderPattern[][]{(com.google.zxing.qrcode.detector.FinderPattern[]) arrayList.toArray(EMPTY_FP_ARRAY)};
        }
        java.util.Collections.sort(arrayList, new com.google.zxing.multi.qrcode.detector.MultiFinderPatternFinder.ModuleSizeComparator());
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i = 0; i < size - 2; i++) {
            com.google.zxing.qrcode.detector.FinderPattern finderPattern2 = (com.google.zxing.qrcode.detector.FinderPattern) arrayList.get(i);
            if (finderPattern2 != null) {
                for (int i2 = i + 1; i2 < size - 1; i2++) {
                    com.google.zxing.qrcode.detector.FinderPattern finderPattern3 = (com.google.zxing.qrcode.detector.FinderPattern) arrayList.get(i2);
                    if (finderPattern3 != null) {
                        float estimatedModuleSize = (finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) / java.lang.Math.min(finderPattern2.getEstimatedModuleSize(), finderPattern3.getEstimatedModuleSize());
                        float f = 0.5f;
                        float f2 = 0.05f;
                        if (java.lang.Math.abs(finderPattern2.getEstimatedModuleSize() - finderPattern3.getEstimatedModuleSize()) <= 0.5f || estimatedModuleSize < 0.05f) {
                            int i3 = i2 + 1;
                            while (i3 < size) {
                                com.google.zxing.qrcode.detector.FinderPattern finderPattern4 = (com.google.zxing.qrcode.detector.FinderPattern) arrayList.get(i3);
                                if (finderPattern4 != null) {
                                    float estimatedModuleSize2 = (finderPattern3.getEstimatedModuleSize() - finderPattern4.getEstimatedModuleSize()) / java.lang.Math.min(finderPattern3.getEstimatedModuleSize(), finderPattern4.getEstimatedModuleSize());
                                    if (java.lang.Math.abs(finderPattern3.getEstimatedModuleSize() - finderPattern4.getEstimatedModuleSize()) <= f || estimatedModuleSize2 < f2) {
                                        com.google.zxing.qrcode.detector.FinderPattern[] finderPatternArr = {finderPattern2, finderPattern3, finderPattern4};
                                        com.google.zxing.ResultPoint.orderBestPatterns(finderPatternArr);
                                        com.google.zxing.qrcode.detector.FinderPatternInfo finderPatternInfo = new com.google.zxing.qrcode.detector.FinderPatternInfo(finderPatternArr);
                                        float distance = com.google.zxing.ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getBottomLeft());
                                        float distance2 = com.google.zxing.ResultPoint.distance(finderPatternInfo.getTopRight(), finderPatternInfo.getBottomLeft());
                                        float distance3 = com.google.zxing.ResultPoint.distance(finderPatternInfo.getTopLeft(), finderPatternInfo.getTopRight());
                                        float estimatedModuleSize3 = (distance + distance3) / (finderPattern2.getEstimatedModuleSize() * 2.0f);
                                        if (estimatedModuleSize3 <= 180.0f && estimatedModuleSize3 >= MIN_MODULE_COUNT_PER_EDGE && java.lang.Math.abs((distance - distance3) / java.lang.Math.min(distance, distance3)) < 0.1f) {
                                            double d = distance;
                                            double d2 = distance3;
                                            float sqrt = (float) java.lang.Math.sqrt((d * d) + (d2 * d2));
                                            if (java.lang.Math.abs((distance2 - sqrt) / java.lang.Math.min(distance2, sqrt)) < 0.1f) {
                                                arrayList2.add(finderPatternArr);
                                            }
                                        }
                                    }
                                }
                                i3++;
                                f = 0.5f;
                                f2 = 0.05f;
                            }
                        }
                    }
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return (com.google.zxing.qrcode.detector.FinderPattern[][]) arrayList2.toArray(EMPTY_FP_2D_ARRAY);
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    public final com.google.zxing.qrcode.detector.FinderPatternInfo[] findMulti(java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException {
        boolean z = map != null && map.containsKey(com.google.zxing.DecodeHintType.TRY_HARDER);
        com.google.zxing.common.BitMatrix image = getImage();
        int height = image.getHeight();
        int width = image.getWidth();
        int i = (height * 3) / 388;
        if (i < 3 || z) {
            i = 3;
        }
        int[] iArr = new int[5];
        for (int i2 = i - 1; i2 < height; i2 += i) {
            doClearCounts(iArr);
            int i3 = 0;
            for (int i4 = 0; i4 < width; i4++) {
                if (image.get(i4, i2)) {
                    if ((i3 & 1) == 1) {
                        i3++;
                    }
                    iArr[i3] = iArr[i3] + 1;
                } else {
                    if ((i3 & 1) == 0) {
                        if (i3 != 4) {
                            i3++;
                        } else if (foundPatternCross(iArr) && handlePossibleCenter(iArr, i2, i4)) {
                            doClearCounts(iArr);
                            i3 = 0;
                        } else {
                            doShiftCounts2(iArr);
                            i3 = 3;
                        }
                    }
                    iArr[i3] = iArr[i3] + 1;
                }
            }
            if (foundPatternCross(iArr)) {
                handlePossibleCenter(iArr, i2, width);
            }
        }
        com.google.zxing.qrcode.detector.FinderPattern[][] selectMultipleBestPatterns = selectMultipleBestPatterns();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.google.zxing.qrcode.detector.FinderPattern[] finderPatternArr : selectMultipleBestPatterns) {
            com.google.zxing.ResultPoint.orderBestPatterns(finderPatternArr);
            arrayList.add(new com.google.zxing.qrcode.detector.FinderPatternInfo(finderPatternArr));
        }
        if (arrayList.isEmpty()) {
            return EMPTY_RESULT_ARRAY;
        }
        return (com.google.zxing.qrcode.detector.FinderPatternInfo[]) arrayList.toArray(EMPTY_RESULT_ARRAY);
    }
}
