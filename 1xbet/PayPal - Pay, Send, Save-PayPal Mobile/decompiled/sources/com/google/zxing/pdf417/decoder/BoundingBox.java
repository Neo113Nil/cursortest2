package com.google.zxing.pdf417.decoder;

/* loaded from: classes9.dex */
final class BoundingBox {
    private final com.google.zxing.ResultPoint bottomLeft;
    private final com.google.zxing.ResultPoint bottomRight;
    private final com.google.zxing.common.BitMatrix image;
    private final int maxX;
    private final int maxY;
    private final int minX;
    private final int minY;
    private final com.google.zxing.ResultPoint topLeft;
    private final com.google.zxing.ResultPoint topRight;

    BoundingBox(com.google.zxing.common.BitMatrix bitMatrix, com.google.zxing.ResultPoint resultPoint, com.google.zxing.ResultPoint resultPoint2, com.google.zxing.ResultPoint resultPoint3, com.google.zxing.ResultPoint resultPoint4) throws com.google.zxing.NotFoundException {
        boolean z = resultPoint == null || resultPoint2 == null;
        boolean z2 = resultPoint3 == null || resultPoint4 == null;
        if (z && z2) {
            throw com.google.zxing.NotFoundException.getNotFoundInstance();
        }
        if (z) {
            resultPoint = new com.google.zxing.ResultPoint(0.0f, resultPoint3.getY());
            resultPoint2 = new com.google.zxing.ResultPoint(0.0f, resultPoint4.getY());
        } else if (z2) {
            resultPoint3 = new com.google.zxing.ResultPoint(bitMatrix.getWidth() - 1, resultPoint.getY());
            resultPoint4 = new com.google.zxing.ResultPoint(bitMatrix.getWidth() - 1, resultPoint2.getY());
        }
        this.image = bitMatrix;
        this.topLeft = resultPoint;
        this.bottomLeft = resultPoint2;
        this.topRight = resultPoint3;
        this.bottomRight = resultPoint4;
        this.minX = (int) java.lang.Math.min(resultPoint.getX(), resultPoint2.getX());
        this.maxX = (int) java.lang.Math.max(resultPoint3.getX(), resultPoint4.getX());
        this.minY = (int) java.lang.Math.min(resultPoint.getY(), resultPoint3.getY());
        this.maxY = (int) java.lang.Math.max(resultPoint2.getY(), resultPoint4.getY());
    }

    BoundingBox(com.google.zxing.pdf417.decoder.BoundingBox boundingBox) {
        this.image = boundingBox.image;
        this.topLeft = boundingBox.topLeft;
        this.bottomLeft = boundingBox.bottomLeft;
        this.topRight = boundingBox.topRight;
        this.bottomRight = boundingBox.bottomRight;
        this.minX = boundingBox.minX;
        this.maxX = boundingBox.maxX;
        this.minY = boundingBox.minY;
        this.maxY = boundingBox.maxY;
    }

    static com.google.zxing.pdf417.decoder.BoundingBox merge(com.google.zxing.pdf417.decoder.BoundingBox boundingBox, com.google.zxing.pdf417.decoder.BoundingBox boundingBox2) throws com.google.zxing.NotFoundException {
        return boundingBox == null ? boundingBox2 : boundingBox2 == null ? boundingBox : new com.google.zxing.pdf417.decoder.BoundingBox(boundingBox.image, boundingBox.topLeft, boundingBox.bottomLeft, boundingBox2.topRight, boundingBox2.bottomRight);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.google.zxing.pdf417.decoder.BoundingBox addMissingRows(int i, int i2, boolean z) throws com.google.zxing.NotFoundException {
        com.google.zxing.ResultPoint resultPoint;
        com.google.zxing.ResultPoint resultPoint2;
        com.google.zxing.ResultPoint resultPoint3;
        com.google.zxing.ResultPoint resultPoint4;
        com.google.zxing.ResultPoint resultPoint5 = this.topLeft;
        com.google.zxing.ResultPoint resultPoint6 = this.bottomLeft;
        com.google.zxing.ResultPoint resultPoint7 = this.topRight;
        com.google.zxing.ResultPoint resultPoint8 = this.bottomRight;
        if (i > 0) {
            com.google.zxing.ResultPoint resultPoint9 = z ? resultPoint5 : resultPoint7;
            int y = ((int) resultPoint9.getY()) - i;
            if (y < 0) {
                y = 0;
            }
            com.google.zxing.ResultPoint resultPoint10 = new com.google.zxing.ResultPoint(resultPoint9.getX(), y);
            if (!z) {
                resultPoint2 = resultPoint10;
                resultPoint = resultPoint5;
                if (i2 > 0) {
                    com.google.zxing.ResultPoint resultPoint11 = z ? this.bottomLeft : this.bottomRight;
                    int y2 = ((int) resultPoint11.getY()) + i2;
                    if (y2 >= this.image.getHeight()) {
                        y2 = this.image.getHeight() - 1;
                    }
                    com.google.zxing.ResultPoint resultPoint12 = new com.google.zxing.ResultPoint(resultPoint11.getX(), y2);
                    if (!z) {
                        resultPoint4 = resultPoint12;
                        resultPoint3 = resultPoint6;
                        return new com.google.zxing.pdf417.decoder.BoundingBox(this.image, resultPoint, resultPoint3, resultPoint2, resultPoint4);
                    }
                    resultPoint6 = resultPoint12;
                }
                resultPoint3 = resultPoint6;
                resultPoint4 = resultPoint8;
                return new com.google.zxing.pdf417.decoder.BoundingBox(this.image, resultPoint, resultPoint3, resultPoint2, resultPoint4);
            }
            resultPoint5 = resultPoint10;
        }
        resultPoint = resultPoint5;
        resultPoint2 = resultPoint7;
        if (i2 > 0) {
        }
        resultPoint3 = resultPoint6;
        resultPoint4 = resultPoint8;
        return new com.google.zxing.pdf417.decoder.BoundingBox(this.image, resultPoint, resultPoint3, resultPoint2, resultPoint4);
    }

    final int getMinX() {
        return this.minX;
    }

    final int getMaxX() {
        return this.maxX;
    }

    final int getMinY() {
        return this.minY;
    }

    final int getMaxY() {
        return this.maxY;
    }

    final com.google.zxing.ResultPoint getTopLeft() {
        return this.topLeft;
    }

    final com.google.zxing.ResultPoint getTopRight() {
        return this.topRight;
    }

    final com.google.zxing.ResultPoint getBottomLeft() {
        return this.bottomLeft;
    }

    final com.google.zxing.ResultPoint getBottomRight() {
        return this.bottomRight;
    }
}
