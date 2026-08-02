package com.google.zxing.common;

/* loaded from: classes9.dex */
public abstract class GridSampler {
    private static com.google.zxing.common.GridSampler gridSampler = new com.google.zxing.common.DefaultGridSampler();

    public abstract com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16) throws com.google.zxing.NotFoundException;

    public abstract com.google.zxing.common.BitMatrix sampleGrid(com.google.zxing.common.BitMatrix bitMatrix, int i, int i2, com.google.zxing.common.PerspectiveTransform perspectiveTransform) throws com.google.zxing.NotFoundException;

    public static void setGridSampler(com.google.zxing.common.GridSampler gridSampler2) {
        gridSampler = gridSampler2;
    }

    public static com.google.zxing.common.GridSampler getInstance() {
        return gridSampler;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected static void checkAndNudgePoints(com.google.zxing.common.BitMatrix bitMatrix, float[] fArr) throws com.google.zxing.NotFoundException {
        int width = bitMatrix.getWidth();
        int height = bitMatrix.getHeight();
        int length = fArr.length;
        boolean z = true;
        for (int i = 0; i < length - 1 && z; i += 2) {
            int i2 = (int) fArr[i];
            int i3 = i + 1;
            int i4 = (int) fArr[i3];
            if (i2 < -1 || i2 > width || i4 < -1 || i4 > height) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            if (i2 == -1) {
                fArr[i] = 0.0f;
            } else if (i2 == width) {
                fArr[i] = width - 1;
            } else {
                z = false;
                if (i4 != -1) {
                    fArr[i3] = 0.0f;
                } else if (i4 == height) {
                    fArr[i3] = height - 1;
                }
                z = true;
            }
            z = true;
            if (i4 != -1) {
            }
            z = true;
        }
        boolean z2 = true;
        for (int length2 = fArr.length - 2; length2 >= 0 && z2; length2 -= 2) {
            int i5 = (int) fArr[length2];
            int i6 = length2 + 1;
            int i7 = (int) fArr[i6];
            if (i5 < -1 || i5 > width || i7 < -1 || i7 > height) {
                throw com.google.zxing.NotFoundException.getNotFoundInstance();
            }
            if (i5 == -1) {
                fArr[length2] = 0.0f;
            } else if (i5 == width) {
                fArr[length2] = width - 1;
            } else {
                z2 = false;
                if (i7 != -1) {
                    fArr[i6] = 0.0f;
                } else if (i7 == height) {
                    fArr[i6] = height - 1;
                }
                z2 = true;
            }
            z2 = true;
            if (i7 != -1) {
            }
            z2 = true;
        }
    }
}
