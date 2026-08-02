package com.google.zxing.datamatrix.detector;

/* loaded from: classes9.dex */
public final class Detector {
    private final com.google.zxing.common.BitMatrix image;
    private final com.google.zxing.common.detector.WhiteRectangleDetector rectangleDetector;

    public Detector(com.google.zxing.common.BitMatrix bitMatrix) throws com.google.zxing.NotFoundException {
        this.image = bitMatrix;
        this.rectangleDetector = new com.google.zxing.common.detector.WhiteRectangleDetector(bitMatrix);
    }

    public final com.google.zxing.common.DetectorResult detect() throws com.google.zxing.NotFoundException {
        int i;
        int i2;
        com.google.zxing.ResultPoint[] detectSolid2 = detectSolid2(detectSolid1(this.rectangleDetector.detect()));
        com.google.zxing.ResultPoint correctTopRight = correctTopRight(detectSolid2);
        detectSolid2[3] = correctTopRight;
        if (correctTopRight == null) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        com.google.zxing.ResultPoint[] shiftToModuleCenter = shiftToModuleCenter(detectSolid2);
        com.google.zxing.ResultPoint resultPoint = shiftToModuleCenter[0];
        com.google.zxing.ResultPoint resultPoint2 = shiftToModuleCenter[1];
        com.google.zxing.ResultPoint resultPoint3 = shiftToModuleCenter[2];
        com.google.zxing.ResultPoint resultPoint4 = shiftToModuleCenter[3];
        int transitionsBetween = transitionsBetween(resultPoint, resultPoint4);
        int i3 = transitionsBetween + 1;
        int transitionsBetween2 = transitionsBetween(resultPoint3, resultPoint4);
        int i4 = transitionsBetween2 + 1;
        if ((i3 & 1) == 1) {
            i3 = transitionsBetween + 2;
        }
        if ((i4 & 1) == 1) {
            i4 = transitionsBetween2 + 2;
        }
        if (i3 * 4 >= i4 * 6 || i4 * 4 >= i3 * 6) {
            i = i3;
            i2 = i4;
        } else {
            i = java.lang.Math.max(i3, i4);
            i2 = i;
        }
        return new com.google.zxing.common.DetectorResult(sampleGrid(this.image, resultPoint, resultPoint2, resultPoint3, resultPoint4, i, i2), new com.google.zxing.ResultPoint[]{resultPoint, resultPoint2, resultPoint3, resultPoint4});
    }

    private static com.google.zxing.ResultPoint shiftPoint(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, int i) {
        float f = i + 1;
        return new com.google.zxing.ResultPoint(resultPoint.getX() + ((resultPoint2.getX() - resultPoint.getX()) / f), resultPoint.getY() + ((resultPoint2.getY() - resultPoint.getY()) / f));
    }

    private static com.google.zxing.ResultPoint moveAway(com.google.zxing.ResultPoint resultPoint, float f, float f2) {
        float x = resultPoint.getX();
        float y = resultPoint.getY();
        return new com.google.zxing.ResultPoint(x < f ? x - 1.0f : x + 1.0f, y < f2 ? y - 1.0f : y + 1.0f);
    }

    private com.google.zxing.ResultPoint[] detectSolid1(com.google.zxing.ResultPoint[] resultPointArr) {
        com.google.zxing.ResultPoint resultPoint = resultPointArr[0];
        com.google.zxing.ResultPoint resultPoint2 = resultPointArr[1];
        com.google.zxing.ResultPoint resultPoint3 = resultPointArr[3];
        com.google.zxing.ResultPoint resultPoint4 = resultPointArr[2];
        int transitionsBetween = transitionsBetween(resultPoint, resultPoint2);
        int transitionsBetween2 = transitionsBetween(resultPoint2, resultPoint3);
        int transitionsBetween3 = transitionsBetween(resultPoint3, resultPoint4);
        int transitionsBetween4 = transitionsBetween(resultPoint4, resultPoint);
        com.google.zxing.ResultPoint[] resultPointArr2 = {resultPoint4, resultPoint, resultPoint2, resultPoint3};
        if (transitionsBetween > transitionsBetween2) {
            resultPointArr2[0] = resultPoint;
            resultPointArr2[1] = resultPoint2;
            resultPointArr2[2] = resultPoint3;
            resultPointArr2[3] = resultPoint4;
            transitionsBetween = transitionsBetween2;
        }
        if (transitionsBetween > transitionsBetween3) {
            resultPointArr2[0] = resultPoint2;
            resultPointArr2[1] = resultPoint3;
            resultPointArr2[2] = resultPoint4;
            resultPointArr2[3] = resultPoint;
        } else {
            transitionsBetween3 = transitionsBetween;
        }
        if (transitionsBetween3 > transitionsBetween4) {
            resultPointArr2[0] = resultPoint3;
            resultPointArr2[1] = resultPoint4;
            resultPointArr2[2] = resultPoint;
            resultPointArr2[3] = resultPoint2;
        }
        return resultPointArr2;
    }

    private com.google.zxing.ResultPoint[] detectSolid2(com.google.zxing.ResultPoint[] resultPointArr) {
        com.google.zxing.ResultPoint resultPoint = resultPointArr[0];
        com.google.zxing.ResultPoint resultPoint2 = resultPointArr[1];
        com.google.zxing.ResultPoint resultPoint3 = resultPointArr[2];
        com.google.zxing.ResultPoint resultPoint4 = resultPointArr[3];
        int transitionsBetween = (transitionsBetween(resultPoint, resultPoint4) + 1) * 4;
        if (transitionsBetween(shiftPoint(resultPoint2, resultPoint3, transitionsBetween), resultPoint) < transitionsBetween(shiftPoint(resultPoint3, resultPoint2, transitionsBetween), resultPoint4)) {
            resultPointArr[0] = resultPoint;
            resultPointArr[1] = resultPoint2;
            resultPointArr[2] = resultPoint3;
            resultPointArr[3] = resultPoint4;
            return resultPointArr;
        }
        resultPointArr[0] = resultPoint2;
        resultPointArr[1] = resultPoint3;
        resultPointArr[2] = resultPoint4;
        resultPointArr[3] = resultPoint;
        return resultPointArr;
    }

    private com.google.zxing.ResultPoint correctTopRight(com.google.zxing.ResultPoint[] resultPointArr) {
        com.google.zxing.ResultPoint resultPoint = resultPointArr[0];
        com.google.zxing.ResultPoint resultPoint2 = resultPointArr[1];
        com.google.zxing.ResultPoint resultPoint3 = resultPointArr[2];
        com.google.zxing.ResultPoint resultPoint4 = resultPointArr[3];
        int transitionsBetween = transitionsBetween(resultPoint, resultPoint4);
        com.google.zxing.ResultPoint shiftPoint = shiftPoint(resultPoint, resultPoint2, (transitionsBetween(resultPoint2, resultPoint4) + 1) * 4);
        com.google.zxing.ResultPoint shiftPoint2 = shiftPoint(resultPoint3, resultPoint2, (transitionsBetween + 1) * 4);
        int transitionsBetween2 = transitionsBetween(shiftPoint, resultPoint4);
        int transitionsBetween3 = transitionsBetween(shiftPoint2, resultPoint4);
        float f = transitionsBetween2 + 1;
        com.google.zxing.ResultPoint resultPoint5 = new com.google.zxing.ResultPoint(resultPoint4.getX() + ((resultPoint3.getX() - resultPoint2.getX()) / f), resultPoint4.getY() + ((resultPoint3.getY() - resultPoint2.getY()) / f));
        float f2 = transitionsBetween3 + 1;
        com.google.zxing.ResultPoint resultPoint6 = new com.google.zxing.ResultPoint(resultPoint4.getX() + ((resultPoint.getX() - resultPoint2.getX()) / f2), resultPoint4.getY() + ((resultPoint.getY() - resultPoint2.getY()) / f2));
        if (!isValid(resultPoint5)) {
            if (!isValid(resultPoint6)) {
                return null;
            }
        } else if (!isValid(resultPoint6) || transitionsBetween(shiftPoint, resultPoint5) + transitionsBetween(shiftPoint2, resultPoint5) > transitionsBetween(shiftPoint, resultPoint6) + transitionsBetween(shiftPoint2, resultPoint6)) {
            return resultPoint5;
        }
        return resultPoint6;
    }

    private com.google.zxing.ResultPoint[] shiftToModuleCenter(com.google.zxing.ResultPoint[] resultPointArr) {
        com.google.zxing.ResultPoint resultPoint = resultPointArr[0];
        com.google.zxing.ResultPoint resultPoint2 = resultPointArr[1];
        com.google.zxing.ResultPoint resultPoint3 = resultPointArr[2];
        com.google.zxing.ResultPoint resultPoint4 = resultPointArr[3];
        int transitionsBetween = transitionsBetween(resultPoint, resultPoint4);
        com.google.zxing.ResultPoint shiftPoint = shiftPoint(resultPoint, resultPoint2, (transitionsBetween(resultPoint3, resultPoint4) + 1) * 4);
        com.google.zxing.ResultPoint shiftPoint2 = shiftPoint(resultPoint3, resultPoint2, (transitionsBetween + 1) * 4);
        int transitionsBetween2 = transitionsBetween(shiftPoint, resultPoint4);
        int i = transitionsBetween2 + 1;
        int transitionsBetween3 = transitionsBetween(shiftPoint2, resultPoint4);
        int i2 = transitionsBetween3 + 1;
        if ((i & 1) == 1) {
            i = transitionsBetween2 + 2;
        }
        if ((i2 & 1) == 1) {
            i2 = transitionsBetween3 + 2;
        }
        float x = (((resultPoint.getX() + resultPoint2.getX()) + resultPoint3.getX()) + resultPoint4.getX()) / 4.0f;
        float y = (((resultPoint.getY() + resultPoint2.getY()) + resultPoint3.getY()) + resultPoint4.getY()) / 4.0f;
        com.google.zxing.ResultPoint moveAway = moveAway(resultPoint, x, y);
        com.google.zxing.ResultPoint moveAway2 = moveAway(resultPoint2, x, y);
        com.google.zxing.ResultPoint moveAway3 = moveAway(resultPoint3, x, y);
        com.google.zxing.ResultPoint moveAway4 = moveAway(resultPoint4, x, y);
        int i3 = i2 * 4;
        int i4 = i * 4;
        return new com.google.zxing.ResultPoint[]{shiftPoint(shiftPoint(moveAway, moveAway2, i3), moveAway4, i4), shiftPoint(shiftPoint(moveAway2, moveAway, i3), moveAway3, i4), shiftPoint(shiftPoint(moveAway3, moveAway4, i3), moveAway2, i4), shiftPoint(shiftPoint(moveAway4, moveAway3, i3), moveAway, i4)};
    }

    private boolean isValid(com.google.zxing.ResultPoint resultPoint) {
        return resultPoint.getX() >= 0.0f && resultPoint.getX() <= ((float) (this.image.getWidth() - 1)) && resultPoint.getY() > 0.0f && resultPoint.getY() <= ((float) (this.image.getHeight() - 1));
    }

    private static com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4, int i, int i2) throws com.google.zxing.NotFoundException {
        float f = i - 0.5f;
        float f2 = i2 - 0.5f;
        return com.google.zxing.common.GridSampler.getInstance().sampleGrid(bitMatrix, i, i2, 0.5f, 0.5f, f, 0.5f, f, f2, 0.5f, f2, resultPoint.getX(), resultPoint.getY(), resultPoint4.getX(), resultPoint4.getY(), resultPoint3.getX(), resultPoint3.getY(), resultPoint2.getX(), resultPoint2.getY());
    }

    private int transitionsBetween(com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2) {
        int x = (int) resultPoint.getX();
        int y = (int) resultPoint.getY();
        int x2 = (int) resultPoint2.getX();
        int min = java.lang.Math.min(this.image.getHeight() - 1, (int) resultPoint2.getY());
        int i = 0;
        boolean z = java.lang.Math.abs(min - y) > java.lang.Math.abs(x2 - x);
        if (z) {
            y = x;
            x = y;
            min = x2;
            x2 = min;
        }
        int abs = java.lang.Math.abs(x2 - x);
        int abs2 = java.lang.Math.abs(min - y);
        int i2 = (-abs) / 2;
        int i3 = y < min ? 1 : -1;
        int i4 = x >= x2 ? -1 : 1;
        boolean z2 = this.image.get(z ? y : x, z ? x : y);
        while (x != x2) {
            boolean z3 = this.image.get(z ? y : x, z ? x : y);
            if (z3 != z2) {
                i++;
                z2 = z3;
            }
            i2 += abs2;
            if (i2 > 0) {
                if (y == min) {
                    return i;
                }
                y += i3;
                i2 -= abs;
            }
            x += i4;
        }
        return i;
    }
}
