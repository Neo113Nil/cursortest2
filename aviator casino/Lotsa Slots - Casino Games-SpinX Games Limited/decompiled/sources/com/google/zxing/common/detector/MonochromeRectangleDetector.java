package com.google.zxing.common.detector;

@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class MonochromeRectangleDetector {
    private static final int MAX_MODULES = 32;
    private final com.google.zxing.common.BitMatrix image;

    public MonochromeRectangleDetector(com.google.zxing.common.BitMatrix bitMatrix) {
        this.image = bitMatrix;
    }

    public com.google.zxing.ResultPoint[] detect() throws com.google.zxing.NotFoundException {
        int height = this.image.getHeight();
        int width = this.image.getWidth();
        int i = height / 2;
        int i2 = width / 2;
        int max = java.lang.Math.max(1, height / 256);
        int max2 = java.lang.Math.max(1, width / 256);
        int i3 = -max;
        int i4 = i2 / 2;
        int y = ((int) findCornerFromCenter(i2, 0, 0, width, i, i3, 0, height, i4).getY()) - 1;
        int i5 = i / 2;
        com.google.zxing.ResultPoint findCornerFromCenter = findCornerFromCenter(i2, -max2, 0, width, i, 0, y, height, i5);
        int x = ((int) findCornerFromCenter.getX()) - 1;
        com.google.zxing.ResultPoint findCornerFromCenter2 = findCornerFromCenter(i2, max2, x, width, i, 0, y, height, i5);
        int x2 = ((int) findCornerFromCenter2.getX()) + 1;
        com.google.zxing.ResultPoint findCornerFromCenter3 = findCornerFromCenter(i2, 0, x, x2, i, max, y, height, i4);
        return new com.google.zxing.ResultPoint[]{findCornerFromCenter(i2, 0, x, x2, i, i3, y, ((int) findCornerFromCenter3.getY()) + 1, i2 / 4), findCornerFromCenter, findCornerFromCenter2, findCornerFromCenter3};
    }

    private com.google.zxing.ResultPoint findCornerFromCenter(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) throws com.google.zxing.NotFoundException {
        int[] blackWhiteRange;
        int[] iArr = null;
        int i10 = i;
        int i11 = i5;
        while (i11 < i8 && i11 >= i7 && i10 < i4 && i10 >= i3) {
            if (i2 == 0) {
                blackWhiteRange = blackWhiteRange(i11, i9, i3, i4, true);
            } else {
                blackWhiteRange = blackWhiteRange(i10, i9, i7, i8, false);
            }
            if (blackWhiteRange == null) {
                if (iArr == null) {
                    throw com.google.zxing.NotFoundException.getNotFoundInstance();
                }
                if (i2 == 0) {
                    int i12 = i11 - i6;
                    int i13 = iArr[0];
                    if (i13 < i) {
                        if (iArr[1] > i) {
                            return new com.google.zxing.ResultPoint(iArr[i6 <= 0 ? (char) 1 : (char) 0], i12);
                        }
                        return new com.google.zxing.ResultPoint(i13, i12);
                    }
                    return new com.google.zxing.ResultPoint(iArr[1], i12);
                }
                int i14 = i10 - i2;
                int i15 = iArr[0];
                if (i15 < i5) {
                    if (iArr[1] > i5) {
                        return new com.google.zxing.ResultPoint(i14, iArr[i2 >= 0 ? (char) 1 : (char) 0]);
                    }
                    return new com.google.zxing.ResultPoint(i14, i15);
                }
                return new com.google.zxing.ResultPoint(i14, iArr[1]);
            }
            i11 += i6;
            i10 += i2;
            iArr = blackWhiteRange;
        }
        throw com.google.zxing.NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0068 A[EDGE_INSN: B:67:0x0068->B:47:0x0068 BREAK  A[LOOP:3: B:39:0x0053->B:61:0x0053], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0031 A[EDGE_INSN: B:81:0x0031->B:21:0x0031 BREAK  A[LOOP:1: B:13:0x001c->B:75:0x001c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int[] blackWhiteRange(int i, int i2, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7 = (i3 + i4) / 2;
        int i8 = i7;
        while (i8 >= i3) {
            com.google.zxing.common.BitMatrix bitMatrix = this.image;
            if (z) {
                if (!bitMatrix.get(i8, i)) {
                    i6 = i8;
                    while (true) {
                        i6--;
                        if (i6 >= i3) {
                            break;
                        }
                        com.google.zxing.common.BitMatrix bitMatrix2 = this.image;
                        if (z) {
                            if (bitMatrix2.get(i6, i)) {
                                break;
                            }
                        } else if (bitMatrix2.get(i, i6)) {
                            break;
                        }
                    }
                    int i9 = i8 - i6;
                    if (i6 >= i3 || i9 > i2) {
                        break;
                        break;
                    }
                    i8 = i6;
                } else {
                    i8--;
                }
            } else if (bitMatrix.get(i, i8)) {
                i8--;
            } else {
                i6 = i8;
                while (true) {
                    i6--;
                    if (i6 >= i3) {
                    }
                }
                int i92 = i8 - i6;
                if (i6 >= i3) {
                    break;
                }
                i8 = i6;
            }
        }
        int i10 = i8 + 1;
        while (i7 < i4) {
            com.google.zxing.common.BitMatrix bitMatrix3 = this.image;
            if (z) {
                if (!bitMatrix3.get(i7, i)) {
                    i5 = i7;
                    while (true) {
                        i5++;
                        if (i5 < i4) {
                            break;
                        }
                        com.google.zxing.common.BitMatrix bitMatrix4 = this.image;
                        if (z) {
                            if (bitMatrix4.get(i5, i)) {
                                break;
                            }
                        } else if (bitMatrix4.get(i, i5)) {
                            break;
                        }
                    }
                    int i11 = i5 - i7;
                    if (i5 < i4 || i11 > i2) {
                        break;
                        break;
                    }
                    i7 = i5;
                } else {
                    i7++;
                }
            } else if (bitMatrix3.get(i, i7)) {
                i7++;
            } else {
                i5 = i7;
                while (true) {
                    i5++;
                    if (i5 < i4) {
                    }
                }
                int i112 = i5 - i7;
                if (i5 < i4) {
                    break;
                }
                i7 = i5;
            }
        }
        int i12 = i7 - 1;
        if (i12 > i10) {
            return new int[]{i10, i12};
        }
        return null;
    }
}
