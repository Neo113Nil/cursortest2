package com.google.zxing.qrcode.detector;

/* loaded from: classes9.dex */
public class Detector {
    private final com.google.zxing.common.BitMatrix image;
    private com.google.zxing.ResultPointCallback resultPointCallback;

    public Detector(com.google.zxing.common.BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    protected final com.google.zxing.common.BitMatrix getImage() {
        return this.image;
    }

    protected final com.google.zxing.ResultPointCallback getResultPointCallback() {
        return this.resultPointCallback;
    }

    public com.google.zxing.common.DetectorResult detect() throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        return detect(null);
    }

    public final com.google.zxing.common.DetectorResult detect(java.util.Map<com.google.zxing.DecodeHintType, ?> map) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        this.resultPointCallback = map == null ? null : (com.google.zxing.ResultPointCallback) map.get(com.google.zxing.DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        return processFinderPatternInfo(new com.google.zxing.qrcode.detector.FinderPatternFinder(this.image, this.resultPointCallback).find(map));
    }

    protected final com.google.zxing.common.DetectorResult processFinderPatternInfo(com.google.zxing.qrcode.detector.FinderPatternInfo finderPatternInfo) throws com.google.zxing.NotFoundException, com.google.zxing.FormatException {
        com.google.zxing.qrcode.detector.AlignmentPattern alignmentPattern;
        com.google.zxing.ResultPoint[] resultPointArr;
        com.google.zxing.qrcode.detector.FinderPattern topLeft = finderPatternInfo.getTopLeft();
        com.google.zxing.qrcode.detector.FinderPattern topRight = finderPatternInfo.getTopRight();
        com.google.zxing.qrcode.detector.FinderPattern bottomLeft = finderPatternInfo.getBottomLeft();
        float calculateModuleSize = calculateModuleSize(topLeft, topRight, bottomLeft);
        if (calculateModuleSize < 1.0f) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int computeDimension = computeDimension(topLeft, topRight, bottomLeft, calculateModuleSize);
        com.google.zxing.qrcode.decoder.Version provisionalVersionForDimension = com.google.zxing.qrcode.decoder.Version.getProvisionalVersionForDimension(computeDimension);
        int dimensionForVersion = provisionalVersionForDimension.getDimensionForVersion();
        if (provisionalVersionForDimension.getAlignmentPatternCenters().length > 0) {
            float x = topRight.getX();
            float x2 = topLeft.getX();
            float x3 = bottomLeft.getX();
            float y = topRight.getY();
            float y2 = topLeft.getY();
            float y3 = bottomLeft.getY();
            float f = 1.0f - (3.0f / (dimensionForVersion - 7));
            int x4 = (int) (topLeft.getX() + ((((x - x2) + x3) - topLeft.getX()) * f));
            int y4 = (int) (topLeft.getY() + (f * (((y - y2) + y3) - topLeft.getY())));
            for (int i = 4; i <= 16; i <<= 1) {
                try {
                    alignmentPattern = findAlignmentInRegion(calculateModuleSize, x4, y4, i);
                    break;
                } catch (com.google.zxing.NotFoundException unused) {
                }
            }
        }
        alignmentPattern = null;
        com.google.zxing.common.BitMatrix sampleGrid = sampleGrid(this.image, createTransform(topLeft, topRight, bottomLeft, alignmentPattern, computeDimension), computeDimension);
        if (alignmentPattern == null) {
            resultPointArr = new com.google.zxing.ResultPoint[]{bottomLeft, topLeft, topRight};
        } else {
            resultPointArr = new com.google.zxing.ResultPoint[]{bottomLeft, topLeft, topRight, alignmentPattern};
        }
        return new com.google.zxing.common.DetectorResult(sampleGrid, resultPointArr);
    }

    private static com.google.zxing.common.PerspectiveTransform createTransform(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4, int i) {
        float x;
        float y;
        float f;
        float f2 = i - 3.5f;
        if (resultPoint4 != null) {
            x = resultPoint4.getX();
            y = resultPoint4.getY();
            f = f2 - 3.0f;
        } else {
            x = (resultPoint2.getX() - resultPoint.getX()) + resultPoint3.getX();
            y = (resultPoint2.getY() - resultPoint.getY()) + resultPoint3.getY();
            f = f2;
        }
        return com.google.zxing.common.PerspectiveTransform.quadrilateralToQuadrilateral(3.5f, 3.5f, f2, 3.5f, f, f, 3.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), x, y, resultPoint3.getX(), resultPoint3.getY());
    }

    private static com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.common.PerspectiveTransform perspectiveTransform, int i) throws com.google.zxing.NotFoundException {
        return com.google.zxing.common.GridSampler.getInstance().sampleGrid(bitMatrix, i, i, perspectiveTransform);
    }

    private static int computeDimension(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, float f) throws com.google.zxing.NotFoundException {
        int round = (com.google.zxing.common.detector.MathUtils.round(com.google.zxing.ResultPoint.distance(resultPoint, resultPoint2) / f) + com.google.zxing.common.detector.MathUtils.round(com.google.zxing.ResultPoint.distance(resultPoint, resultPoint3) / f)) / 2;
        int i = round + 7;
        int i2 = i & 3;
        return i2 != 0 ? i2 != 2 ? i2 != 3 ? i : round + 5 : round + 6 : round + 8;
    }

    protected final float calculateModuleSize(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3) {
        return (calculateModuleSizeOneWay(resultPoint, resultPoint2) + calculateModuleSizeOneWay(resultPoint, resultPoint3)) / 2.0f;
    }

    private float calculateModuleSizeOneWay(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2) {
        float sizeOfBlackWhiteBlackRunBothWays = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint.getX(), (int) resultPoint.getY(), (int) resultPoint2.getX(), (int) resultPoint2.getY());
        float sizeOfBlackWhiteBlackRunBothWays2 = sizeOfBlackWhiteBlackRunBothWays((int) resultPoint2.getX(), (int) resultPoint2.getY(), (int) resultPoint.getX(), (int) resultPoint.getY());
        return java.lang.Float.isNaN(sizeOfBlackWhiteBlackRunBothWays) ? sizeOfBlackWhiteBlackRunBothWays2 / 7.0f : java.lang.Float.isNaN(sizeOfBlackWhiteBlackRunBothWays2) ? sizeOfBlackWhiteBlackRunBothWays / 7.0f : (sizeOfBlackWhiteBlackRunBothWays + sizeOfBlackWhiteBlackRunBothWays2) / 14.0f;
    }

    private float sizeOfBlackWhiteBlackRunBothWays(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float sizeOfBlackWhiteBlackRun = sizeOfBlackWhiteBlackRun(i, i2, i3, i4);
        int i5 = i - (i3 - i);
        int i6 = 0;
        if (i5 < 0) {
            f = i / (i - i5);
            i5 = 0;
        } else if (i5 >= this.image.getWidth()) {
            f = ((this.image.getWidth() - 1) - i) / (i5 - i);
            i5 = this.image.getWidth() - 1;
        } else {
            f = 1.0f;
        }
        float f3 = i2;
        int i7 = (int) (f3 - ((i4 - i2) * f));
        if (i7 < 0) {
            f2 = f3 / (i2 - i7);
        } else if (i7 >= this.image.getHeight()) {
            f2 = ((this.image.getHeight() - 1) - i2) / (i7 - i2);
            i6 = this.image.getHeight() - 1;
        } else {
            i6 = i7;
            f2 = 1.0f;
        }
        return (sizeOfBlackWhiteBlackRun + sizeOfBlackWhiteBlackRun(i, i2, (int) (i + ((i5 - i) * f2)), i6)) - 1.0f;
    }

    private float sizeOfBlackWhiteBlackRun(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        com.google.zxing.qrcode.detector.Detector detector;
        boolean z;
        int i11;
        int i12 = 1;
        boolean z2 = java.lang.Math.abs(i4 - i2) > java.lang.Math.abs(i3 - i);
        if (z2) {
            i6 = i;
            i5 = i2;
            i8 = i3;
            i7 = i4;
        } else {
            i5 = i;
            i6 = i2;
            i7 = i3;
            i8 = i4;
        }
        int abs = java.lang.Math.abs(i7 - i5);
        int abs2 = java.lang.Math.abs(i8 - i6);
        int i13 = 2;
        int i14 = (-abs) / 2;
        int i15 = i5 < i7 ? 1 : -1;
        int i16 = i6 < i8 ? 1 : -1;
        int i17 = i7 + i15;
        int i18 = i5;
        int i19 = i6;
        int i20 = 0;
        while (true) {
            if (i18 == i17) {
                i9 = i17;
                i10 = i13;
                break;
            }
            int i21 = z2 ? i19 : i18;
            int i22 = z2 ? i18 : i19;
            if (i20 == i12) {
                z = z2;
                i11 = i12;
                i9 = i17;
                detector = this;
            } else {
                detector = this;
                z = z2;
                i9 = i17;
                i11 = 0;
            }
            if (i11 == detector.image.get(i21, i22)) {
                if (i20 == 2) {
                    return com.google.zxing.common.detector.MathUtils.distance(i18, i19, i5, i6);
                }
                i20++;
            }
            i14 += abs2;
            if (i14 > 0) {
                if (i19 == i8) {
                    i10 = 2;
                    break;
                }
                i19 += i16;
                i14 -= abs;
            }
            i18 += i15;
            i17 = i9;
            z2 = z;
            i12 = 1;
            i13 = 2;
        }
        if (i20 == i10) {
            return com.google.zxing.common.detector.MathUtils.distance(i9, i8, i5, i6);
        }
        return Float.NaN;
    }

    protected final com.google.zxing.qrcode.detector.AlignmentPattern findAlignmentInRegion(float f, int i, int i2, float f2) throws com.google.zxing.NotFoundException {
        int i3 = (int) (f2 * f);
        int max = java.lang.Math.max(0, i - i3);
        int min = java.lang.Math.min(this.image.getWidth() - 1, i + i3) - max;
        float f3 = 3.0f * f;
        if (min < f3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int max2 = java.lang.Math.max(0, i2 - i3);
        int min2 = java.lang.Math.min(this.image.getHeight() - 1, i2 + i3) - max2;
        if (min2 < f3) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        return new com.google.zxing.qrcode.detector.AlignmentPatternFinder(this.image, max, max2, min, min2, f, this.resultPointCallback).find();
    }
}
