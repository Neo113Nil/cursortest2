package com.google.zxing.aztec.detector;

/* loaded from: classes9.dex */
public final class Detector {
    private static final int[] EXPECTED_CORNER_BITS = {3808, 476, 2107, 1799};
    private boolean compact;
    private final com.google.zxing.common.BitMatrix image;
    private int nbCenterLayers;
    private int nbDataBlocks;
    private int nbLayers;
    private int shift;

    public Detector(com.google.zxing.common.BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    public final com.google.zxing.aztec.AztecDetectorResult detect() throws com.google.zxing.NotFoundException {
        return detect(false);
    }

    public final com.google.zxing.aztec.AztecDetectorResult detect(boolean z) throws com.google.zxing.NotFoundException {
        com.google.zxing.ResultPoint[] bullsEyeCorners = getBullsEyeCorners(getMatrixCenter());
        if (z) {
            com.google.zxing.ResultPoint resultPoint = bullsEyeCorners[0];
            bullsEyeCorners[0] = bullsEyeCorners[2];
            bullsEyeCorners[2] = resultPoint;
        }
        int extractParameters = extractParameters(bullsEyeCorners);
        com.google.zxing.common.BitMatrix bitMatrix = this.image;
        int i = this.shift;
        return new com.google.zxing.aztec.AztecDetectorResult(sampleGrid(bitMatrix, bullsEyeCorners[i % 4], bullsEyeCorners[(i + 1) % 4], bullsEyeCorners[(i + 2) % 4], bullsEyeCorners[(i + 3) % 4]), getMatrixCornerPoints(bullsEyeCorners), this.compact, this.nbDataBlocks, this.nbLayers, extractParameters);
    }

    private int extractParameters(com.google.zxing.ResultPoint[] resultPointArr) throws com.google.zxing.NotFoundException {
        long j;
        long j2;
        if (!isValid(resultPointArr[0]) || !isValid(resultPointArr[1]) || !isValid(resultPointArr[2]) || !isValid(resultPointArr[3])) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        int i = this.nbCenterLayers * 2;
        int[] iArr = {sampleLine(resultPointArr[0], resultPointArr[1], i), sampleLine(resultPointArr[1], resultPointArr[2], i), sampleLine(resultPointArr[2], resultPointArr[3], i), sampleLine(resultPointArr[3], resultPointArr[0], i)};
        this.shift = getRotation(iArr, i);
        long j3 = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = iArr[(this.shift + i2) % 4];
            if (this.compact) {
                j = j3 << 7;
                j2 = (i3 >> 1) & 127;
            } else {
                j = j3 << 10;
                j2 = ((i3 >> 2) & 992) + ((i3 >> 1) & 31);
            }
            j3 = j + j2;
        }
        com.google.zxing.aztec.detector.Detector.CorrectedParameter correctedParameterData = getCorrectedParameterData(j3, this.compact);
        int data = correctedParameterData.getData();
        if (this.compact) {
            this.nbLayers = (data >> 6) + 1;
            this.nbDataBlocks = (data & 63) + 1;
        } else {
            this.nbLayers = (data >> 11) + 1;
            this.nbDataBlocks = (data & 2047) + 1;
        }
        return correctedParameterData.getErrorsCorrected();
    }

    private static int getRotation(int[] iArr, int i) throws com.google.zxing.NotFoundException {
        int i2 = 0;
        for (int i3 : iArr) {
            i2 = (i2 << 3) + ((i3 >> (i - 2)) << 1) + (i3 & 1);
        }
        for (int i4 = 0; i4 < 4; i4++) {
            if (java.lang.Integer.bitCount(EXPECTED_CORNER_BITS[i4] ^ (((i2 & 1) << 11) + (i2 >> 1))) <= 2) {
                return i4;
            }
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    private static com.google.zxing.aztec.detector.Detector.CorrectedParameter getCorrectedParameterData(long j, boolean z) throws com.google.zxing.NotFoundException {
        int i;
        int i2;
        if (z) {
            i = 7;
            i2 = 2;
        } else {
            i = 10;
            i2 = 4;
        }
        int[] iArr = new int[i];
        for (int i3 = i - 1; i3 >= 0; i3--) {
            iArr[i3] = ((int) j) & 15;
            j >>= 4;
        }
        try {
            int decodeWithECCount = new com.google.zxing.common.reedsolomon.ReedSolomonDecoder(com.google.zxing.common.reedsolomon.GenericGF.AZTEC_PARAM).decodeWithECCount(iArr, i - i2);
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                i4 = (i4 << 4) + iArr[i5];
            }
            return new com.google.zxing.aztec.detector.Detector.CorrectedParameter(i4, decodeWithECCount);
        } catch (com.google.zxing.common.reedsolomon.ReedSolomonException unused) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
    }

    private com.google.zxing.ResultPoint[] getBullsEyeCorners(com.google.zxing.aztec.detector.Detector.Point point) throws com.google.zxing.NotFoundException {
        this.nbCenterLayers = 1;
        com.google.zxing.aztec.detector.Detector.Point point2 = point;
        com.google.zxing.aztec.detector.Detector.Point point3 = point2;
        com.google.zxing.aztec.detector.Detector.Point point4 = point3;
        boolean z = true;
        while (this.nbCenterLayers < 9) {
            com.google.zxing.aztec.detector.Detector.Point firstDifferent = getFirstDifferent(point, z, 1, -1);
            com.google.zxing.aztec.detector.Detector.Point firstDifferent2 = getFirstDifferent(point2, z, 1, 1);
            com.google.zxing.aztec.detector.Detector.Point firstDifferent3 = getFirstDifferent(point3, z, -1, 1);
            com.google.zxing.aztec.detector.Detector.Point firstDifferent4 = getFirstDifferent(point4, z, -1, -1);
            if (this.nbCenterLayers > 2) {
                double distance = (distance(firstDifferent4, firstDifferent) * this.nbCenterLayers) / (distance(point4, point) * (this.nbCenterLayers + 2));
                if (distance < 0.75d || distance > 1.25d || !isWhiteOrBlackRectangle(firstDifferent, firstDifferent2, firstDifferent3, firstDifferent4)) {
                    break;
                }
            }
            z = !z;
            this.nbCenterLayers++;
            point4 = firstDifferent4;
            point = firstDifferent;
            point2 = firstDifferent2;
            point3 = firstDifferent3;
        }
        int i = this.nbCenterLayers;
        if (i != 5 && i != 7) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        this.compact = i == 5;
        com.google.zxing.ResultPoint[] resultPointArr = {new com.google.zxing.ResultPoint(point.getX() + 0.5f, point.getY() - 0.5f), new com.google.zxing.ResultPoint(point2.getX() + 0.5f, point2.getY() + 0.5f), new com.google.zxing.ResultPoint(point3.getX() - 0.5f, point3.getY() + 0.5f), new com.google.zxing.ResultPoint(point4.getX() - 0.5f, point4.getY() - 0.5f)};
        int i2 = this.nbCenterLayers * 2;
        return expandSquare(resultPointArr, i2 - 3, i2);
    }

    private com.google.zxing.aztec.detector.Detector.Point getMatrixCenter() {
        com.google.zxing.ResultPoint resultPoint;
        com.google.zxing.ResultPoint resultPoint2;
        com.google.zxing.ResultPoint resultPoint3;
        com.google.zxing.ResultPoint resultPoint4;
        com.google.zxing.ResultPoint resultPoint5;
        com.google.zxing.ResultPoint resultPoint6;
        com.google.zxing.ResultPoint resultPoint7;
        com.google.zxing.ResultPoint resultPoint8;
        try {
            com.google.zxing.ResultPoint[] detect = new com.google.zxing.common.detector.WhiteRectangleDetector(this.image).detect();
            resultPoint4 = detect[0];
            resultPoint = detect[1];
            resultPoint3 = detect[2];
            resultPoint2 = detect[3];
        } catch (com.google.zxing.NotFoundException unused) {
            int width = this.image.getWidth() / 2;
            int height = this.image.getHeight() / 2;
            int i = width + 7;
            int i2 = height - 7;
            com.google.zxing.ResultPoint resultPoint9 = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i, i2), false, 1, -1).toResultPoint();
            int i3 = height + 7;
            resultPoint = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i, i3), false, 1, 1).toResultPoint();
            int i4 = width - 7;
            com.google.zxing.ResultPoint resultPoint10 = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i4, i3), false, -1, 1).toResultPoint();
            resultPoint2 = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i4, i2), false, -1, -1).toResultPoint();
            resultPoint3 = resultPoint10;
            resultPoint4 = resultPoint9;
        }
        int round = com.google.zxing.common.detector.MathUtils.round((((resultPoint4.getX() + resultPoint2.getX()) + resultPoint.getX()) + resultPoint3.getX()) / 4.0f);
        int round2 = com.google.zxing.common.detector.MathUtils.round((((resultPoint4.getY() + resultPoint2.getY()) + resultPoint.getY()) + resultPoint3.getY()) / 4.0f);
        try {
            com.google.zxing.ResultPoint[] detect2 = new com.google.zxing.common.detector.WhiteRectangleDetector(this.image, 15, round, round2).detect();
            resultPoint5 = detect2[0];
            resultPoint6 = detect2[1];
            resultPoint7 = detect2[2];
            resultPoint8 = detect2[3];
        } catch (com.google.zxing.NotFoundException unused2) {
            int i5 = round + 7;
            int i6 = round2 - 7;
            resultPoint5 = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i5, i6), false, 1, -1).toResultPoint();
            int i7 = round2 + 7;
            resultPoint6 = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i5, i7), false, 1, 1).toResultPoint();
            int i8 = round - 7;
            com.google.zxing.ResultPoint resultPoint11 = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i8, i7), false, -1, 1).toResultPoint();
            com.google.zxing.ResultPoint resultPoint12 = getFirstDifferent(new com.google.zxing.aztec.detector.Detector.Point(i8, i6), false, -1, -1).toResultPoint();
            resultPoint7 = resultPoint11;
            resultPoint8 = resultPoint12;
        }
        return new com.google.zxing.aztec.detector.Detector.Point(com.google.zxing.common.detector.MathUtils.round((((resultPoint5.getX() + resultPoint8.getX()) + resultPoint6.getX()) + resultPoint7.getX()) / 4.0f), com.google.zxing.common.detector.MathUtils.round((((resultPoint5.getY() + resultPoint8.getY()) + resultPoint6.getY()) + resultPoint7.getY()) / 4.0f));
    }

    private com.google.zxing.ResultPoint[] getMatrixCornerPoints(com.google.zxing.ResultPoint[] resultPointArr) {
        return expandSquare(resultPointArr, this.nbCenterLayers * 2, getDimension());
    }

    private com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4) throws com.google.zxing.NotFoundException {
        com.google.zxing.common.GridSampler gridSampler = com.google.zxing.common.GridSampler.getInstance();
        int dimension = getDimension();
        float f = dimension / 2.0f;
        float f2 = this.nbCenterLayers;
        float f3 = f - f2;
        float f4 = f + f2;
        return gridSampler.sampleGrid(bitMatrix, dimension, dimension, f3, f3, f4, f3, f4, f4, f3, f4, resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint4.getX(), resultPoint4.getY());
    }

    private int sampleLine(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, int i) {
        float distance = distance(resultPoint, resultPoint2);
        float f = distance / i;
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        float x2 = ((resultPoint2.getX() - resultPoint.getX()) * f) / distance;
        float y2 = (f * (resultPoint2.getY() - resultPoint.getY())) / distance;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            float f2 = i3;
            if (this.image.get(com.google.zxing.common.detector.MathUtils.round((f2 * x2) + x), com.google.zxing.common.detector.MathUtils.round((f2 * y2) + y))) {
                i2 |= 1 << ((i - i3) - 1);
            }
        }
        return i2;
    }

    private boolean isWhiteOrBlackRectangle(com.google.zxing.aztec.detector.Detector.Point point, com.google.zxing.aztec.detector.Detector.Point point2, com.google.zxing.aztec.detector.Detector.Point point3, com.google.zxing.aztec.detector.Detector.Point point4) {
        com.google.zxing.aztec.detector.Detector.Point point5 = new com.google.zxing.aztec.detector.Detector.Point(java.lang.Math.max(0, point.getX() - 3), java.lang.Math.min(this.image.getHeight() - 1, point.getY() + 3));
        com.google.zxing.aztec.detector.Detector.Point point6 = new com.google.zxing.aztec.detector.Detector.Point(java.lang.Math.max(0, point2.getX() - 3), java.lang.Math.max(0, point2.getY() - 3));
        com.google.zxing.aztec.detector.Detector.Point point7 = new com.google.zxing.aztec.detector.Detector.Point(java.lang.Math.min(this.image.getWidth() - 1, point3.getX() + 3), java.lang.Math.max(0, java.lang.Math.min(this.image.getHeight() - 1, point3.getY() - 3)));
        com.google.zxing.aztec.detector.Detector.Point point8 = new com.google.zxing.aztec.detector.Detector.Point(java.lang.Math.min(this.image.getWidth() - 1, point4.getX() + 3), java.lang.Math.min(this.image.getHeight() - 1, point4.getY() + 3));
        int color = getColor(point8, point5);
        return color != 0 && getColor(point5, point6) == color && getColor(point6, point7) == color && getColor(point7, point8) == color;
    }

    private int getColor(com.google.zxing.aztec.detector.Detector.Point point, com.google.zxing.aztec.detector.Detector.Point point2) {
        float distance = distance(point, point2);
        if (distance == 0.0f) {
            return 0;
        }
        float x = (point2.getX() - point.getX()) / distance;
        float y = (point2.getY() - point.getY()) / distance;
        float x2 = point.getX();
        float y2 = point.getY();
        boolean z = this.image.get(point.getX(), point.getY());
        int floor = (int) java.lang.Math.floor(distance);
        int i = 0;
        for (int i2 = 0; i2 < floor; i2++) {
            if (this.image.get(com.google.zxing.common.detector.MathUtils.round(x2), com.google.zxing.common.detector.MathUtils.round(y2)) != z) {
                i++;
            }
            x2 += x;
            y2 += y;
        }
        float f = i / distance;
        if (f <= 0.1f || f >= 0.9f) {
            return (f <= 0.1f) == z ? 1 : -1;
        }
        return 0;
    }

    private com.google.zxing.aztec.detector.Detector.Point getFirstDifferent(com.google.zxing.aztec.detector.Detector.Point point, boolean z, int i, int i2) {
        int x = point.getX() + i;
        int y = point.getY();
        while (true) {
            y += i2;
            if (!isValid(x, y) || this.image.get(x, y) != z) {
                break;
            }
            x += i;
        }
        int i3 = x - i;
        int i4 = y - i2;
        while (isValid(i3, i4) && this.image.get(i3, i4) == z) {
            i3 += i;
        }
        int i5 = i3 - i;
        while (isValid(i5, i4) && this.image.get(i5, i4) == z) {
            i4 += i2;
        }
        return new com.google.zxing.aztec.detector.Detector.Point(i5, i4 - i2);
    }

    private static com.google.zxing.ResultPoint[] expandSquare(com.google.zxing.ResultPoint[] resultPointArr, int i, int i2) {
        float f = i2 / (i * 2.0f);
        float x = resultPointArr[0].getX();
        float x2 = resultPointArr[2].getX();
        float y = resultPointArr[0].getY();
        float y2 = resultPointArr[2].getY();
        float x3 = (resultPointArr[0].getX() + resultPointArr[2].getX()) / 2.0f;
        float y3 = (resultPointArr[0].getY() + resultPointArr[2].getY()) / 2.0f;
        float f2 = (x - x2) * f;
        float f3 = (y - y2) * f;
        com.google.zxing.ResultPoint resultPoint = new com.google.zxing.ResultPoint(x3 + f2, y3 + f3);
        com.google.zxing.ResultPoint resultPoint2 = new com.google.zxing.ResultPoint(x3 - f2, y3 - f3);
        float x4 = resultPointArr[1].getX();
        float x5 = resultPointArr[3].getX();
        float y4 = resultPointArr[1].getY();
        float y5 = resultPointArr[3].getY();
        float x6 = (resultPointArr[1].getX() + resultPointArr[3].getX()) / 2.0f;
        float y6 = (resultPointArr[1].getY() + resultPointArr[3].getY()) / 2.0f;
        float f4 = (x4 - x5) * f;
        float f5 = f * (y4 - y5);
        return new com.google.zxing.ResultPoint[]{resultPoint, new com.google.zxing.ResultPoint(x6 + f4, y6 + f5), resultPoint2, new com.google.zxing.ResultPoint(x6 - f4, y6 - f5)};
    }

    private boolean isValid(int i, int i2) {
        return i >= 0 && i < this.image.getWidth() && i2 >= 0 && i2 < this.image.getHeight();
    }

    private boolean isValid(com.google.zxing.ResultPoint resultPoint) {
        return isValid(com.google.zxing.common.detector.MathUtils.round(resultPoint.getX()), com.google.zxing.common.detector.MathUtils.round(resultPoint.getY()));
    }

    private static float distance(com.google.zxing.aztec.detector.Detector.Point point, com.google.zxing.aztec.detector.Detector.Point point2) {
        return com.google.zxing.common.detector.MathUtils.distance(point.getX(), point.getY(), point2.getX(), point2.getY());
    }

    private static float distance(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2) {
        return com.google.zxing.common.detector.MathUtils.distance(resultPoint.getX(), resultPoint.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private int getDimension() {
        if (this.compact) {
            return (this.nbLayers * 4) + 11;
        }
        int i = this.nbLayers;
        return (i * 4) + ((((i * 2) + 6) / 15) * 2) + 15;
    }

    static final class Point {
        private final int x;
        private final int y;

        final com.google.zxing.ResultPoint toResultPoint() {
            return new com.google.zxing.ResultPoint(this.x, this.y);
        }

        Point(int i, int i2) {
            this.x = i;
            this.y = i2;
        }

        final int getX() {
            return this.x;
        }

        final int getY() {
            return this.y;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("<");
            sb.append(this.x);
            sb.append(' ');
            sb.append(this.y);
            sb.append(kotlin.text.Typography.greater);
            return sb.toString();
        }
    }

    static final class CorrectedParameter {
        private final int data;
        private final int errorsCorrected;

        CorrectedParameter(int i, int i2) {
            this.data = i;
            this.errorsCorrected = i2;
        }

        final int getData() {
            return this.data;
        }

        final int getErrorsCorrected() {
            return this.errorsCorrected;
        }
    }
}
