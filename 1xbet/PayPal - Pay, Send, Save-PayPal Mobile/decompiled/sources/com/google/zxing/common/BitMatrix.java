package com.google.zxing.common;

/* loaded from: classes9.dex */
public final class BitMatrix implements java.lang.Cloneable {
    private int[] bits;
    private int height;
    private int rowSize;
    private int width;

    public BitMatrix(int i) {
        this(i, i);
    }

    public BitMatrix(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new java.lang.IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.width = i;
        this.height = i2;
        int i3 = (i + 31) / 32;
        this.rowSize = i3;
        this.bits = new int[i3 * i2];
    }

    private BitMatrix(int i, int i2, int i3, int[] iArr) {
        this.width = i;
        this.height = i2;
        this.rowSize = i3;
        this.bits = iArr;
    }

    public static com.google.zxing.common.BitMatrix parse(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        com.google.zxing.common.BitMatrix bitMatrix = new com.google.zxing.common.BitMatrix(length2, length);
        for (int i = 0; i < length; i++) {
            boolean[] zArr2 = zArr[i];
            for (int i2 = 0; i2 < length2; i2++) {
                if (zArr2[i2]) {
                    bitMatrix.set(i2, i);
                }
            }
        }
        return bitMatrix;
    }

    public static com.google.zxing.common.BitMatrix parse(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (str == null) {
            throw new java.lang.IllegalArgumentException();
        }
        boolean[] zArr = new boolean[str.length()];
        int i = -1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < str.length()) {
            if (str.charAt(i2) == '\n' || str.charAt(i2) == '\r') {
                if (i4 > i5) {
                    if (i == -1) {
                        i = i4 - i5;
                    } else if (i4 - i5 != i) {
                        throw new java.lang.IllegalArgumentException("row lengths do not match");
                    }
                    i3++;
                    i5 = i4;
                }
                i2++;
            } else {
                if (str.startsWith(str2, i2)) {
                    i2 += str2.length();
                    zArr[i4] = true;
                } else if (str.startsWith(str3, i2)) {
                    i2 += str3.length();
                    zArr[i4] = false;
                } else {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("illegal character encountered: ");
                    sb.append(str.substring(i2));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                i4++;
            }
        }
        if (i4 > i5) {
            int i6 = i4 - i5;
            if (i == -1) {
                i = i6;
            } else if (i6 != i) {
                throw new java.lang.IllegalArgumentException("row lengths do not match");
            }
            i3++;
        }
        com.google.zxing.common.BitMatrix bitMatrix = new com.google.zxing.common.BitMatrix(i, i3);
        for (int i7 = 0; i7 < i4; i7++) {
            if (zArr[i7]) {
                bitMatrix.set(i7 % i, i7 / i);
            }
        }
        return bitMatrix;
    }

    public final boolean get(int i, int i2) {
        return ((this.bits[(i2 * this.rowSize) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public final void set(int i, int i2) {
        int i3 = (i2 * this.rowSize) + (i / 32);
        int[] iArr = this.bits;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public final void unset(int i, int i2) {
        int i3 = (i2 * this.rowSize) + (i / 32);
        int[] iArr = this.bits;
        iArr[i3] = (~(1 << (i & 31))) & iArr[i3];
    }

    public final void flip(int i, int i2) {
        int i3 = (i2 * this.rowSize) + (i / 32);
        int[] iArr = this.bits;
        iArr[i3] = (1 << (i & 31)) ^ iArr[i3];
    }

    public final void flip() {
        int length = this.bits.length;
        for (int i = 0; i < length; i++) {
            int[] iArr = this.bits;
            iArr[i] = ~iArr[i];
        }
    }

    public final void xor(com.google.zxing.common.BitMatrix bitMatrix) {
        if (this.width != bitMatrix.width || this.height != bitMatrix.height || this.rowSize != bitMatrix.rowSize) {
            throw new java.lang.IllegalArgumentException("input matrix dimensions do not match");
        }
        com.google.zxing.common.BitArray bitArray = new com.google.zxing.common.BitArray(this.width);
        for (int i = 0; i < this.height; i++) {
            int i2 = this.rowSize;
            int[] bitArray2 = bitMatrix.getRow(i, bitArray).getBitArray();
            for (int i3 = 0; i3 < this.rowSize; i3++) {
                int[] iArr = this.bits;
                int i4 = (i2 * i) + i3;
                iArr[i4] = iArr[i4] ^ bitArray2[i3];
            }
        }
    }

    public final void clear() {
        int length = this.bits.length;
        for (int i = 0; i < length; i++) {
            this.bits[i] = 0;
        }
    }

    public final void setRegion(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new java.lang.IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new java.lang.IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.height || i5 > this.width) {
            throw new java.lang.IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.rowSize;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.bits;
                int i9 = (i8 / 32) + (i7 * i2);
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final com.google.zxing.common.BitArray getRow(int i, com.google.zxing.common.BitArray bitArray) {
        if (bitArray == null || bitArray.getSize() < this.width) {
            bitArray = new com.google.zxing.common.BitArray(this.width);
        } else {
            bitArray.clear();
        }
        int i2 = this.rowSize;
        for (int i3 = 0; i3 < this.rowSize; i3++) {
            bitArray.setBulk(i3 * 32, this.bits[(i * i2) + i3]);
        }
        return bitArray;
    }

    public final void setRow(int i, com.google.zxing.common.BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int[] iArr = this.bits;
        int i2 = this.rowSize;
        java.lang.System.arraycopy(bitArray2, 0, iArr, i * i2, i2);
    }

    public final void rotate(int i) {
        int i2 = i % 360;
        if (i2 != 0) {
            if (i2 == 90) {
                rotate90();
                return;
            }
            if (i2 == 180) {
                rotate180();
            } else {
                if (i2 == 270) {
                    rotate90();
                    rotate180();
                    return;
                }
                throw new java.lang.IllegalArgumentException("degrees must be a multiple of 0, 90, 180, or 270");
            }
        }
    }

    public final void rotate180() {
        com.google.zxing.common.BitArray bitArray = new com.google.zxing.common.BitArray(this.width);
        com.google.zxing.common.BitArray bitArray2 = new com.google.zxing.common.BitArray(this.width);
        int i = (this.height + 1) / 2;
        for (int i2 = 0; i2 < i; i2++) {
            bitArray = getRow(i2, bitArray);
            int i3 = (this.height - 1) - i2;
            bitArray2 = getRow(i3, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            setRow(i2, bitArray2);
            setRow(i3, bitArray);
        }
    }

    public final void rotate90() {
        int i = this.height;
        int i2 = this.width;
        int i3 = (i + 31) / 32;
        int[] iArr = new int[i3 * i2];
        for (int i4 = 0; i4 < this.height; i4++) {
            for (int i5 = 0; i5 < this.width; i5++) {
                if (((this.bits[(this.rowSize * i4) + (i5 / 32)] >>> (i5 & 31)) & 1) != 0) {
                    int i6 = (((i2 - 1) - i5) * i3) + (i4 / 32);
                    iArr[i6] = (1 << (i4 & 31)) | iArr[i6];
                }
            }
        }
        this.width = i;
        this.height = i2;
        this.rowSize = i3;
        this.bits = iArr;
    }

    public final int[] getEnclosingRectangle() {
        int i = this.width;
        int i2 = this.height;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < this.height; i5++) {
            int i6 = 0;
            while (true) {
                int i7 = this.rowSize;
                if (i6 < i7) {
                    int i8 = this.bits[(i7 * i5) + i6];
                    if (i8 != 0) {
                        if (i5 < i2) {
                            i2 = i5;
                        }
                        if (i5 > i4) {
                            i4 = i5;
                        }
                        int i9 = i6 * 32;
                        if (i9 < i) {
                            int i10 = 0;
                            while ((i8 << (31 - i10)) == 0) {
                                i10++;
                            }
                            int i11 = i10 + i9;
                            if (i11 < i) {
                                i = i11;
                            }
                        }
                        if (i9 + 31 > i3) {
                            int i12 = 31;
                            while ((i8 >>> i12) == 0) {
                                i12--;
                            }
                            int i13 = i9 + i12;
                            if (i13 > i3) {
                                i3 = i13;
                            }
                        }
                    }
                    i6++;
                }
            }
        }
        if (i3 < i || i4 < i2) {
            return null;
        }
        return new int[]{i, i2, (i3 - i) + 1, (i4 - i2) + 1};
    }

    public final int[] getTopLeftOnBit() {
        int[] iArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.bits;
            if (i2 >= iArr.length || iArr[i2] != 0) {
                break;
            }
            i2++;
        }
        if (i2 == iArr.length) {
            return null;
        }
        int i3 = this.rowSize;
        int i4 = i2 / i3;
        while ((iArr[i2] << (31 - i)) == 0) {
            i++;
        }
        return new int[]{((i2 % i3) * 32) + i, i4};
    }

    public final int[] getBottomRightOnBit() {
        int length = this.bits.length - 1;
        while (length >= 0 && this.bits[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i = this.rowSize;
        int i2 = length / i;
        int i3 = 31;
        while ((this.bits[length] >>> i3) == 0) {
            i3--;
        }
        return new int[]{((length % i) * 32) + i3, i2};
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getRowSize() {
        return this.rowSize;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.zxing.common.BitMatrix)) {
            return false;
        }
        com.google.zxing.common.BitMatrix bitMatrix = (com.google.zxing.common.BitMatrix) obj;
        return this.width == bitMatrix.width && this.height == bitMatrix.height && this.rowSize == bitMatrix.rowSize && java.util.Arrays.equals(this.bits, bitMatrix.bits);
    }

    public final int hashCode() {
        int i = this.width;
        return (((((((i * 31) + i) * 31) + this.height) * 31) + this.rowSize) * 31) + java.util.Arrays.hashCode(this.bits);
    }

    public final java.lang.String toString() {
        return toString("X ", "  ");
    }

    public final java.lang.String toString(java.lang.String str, java.lang.String str2) {
        return buildToString(str, str2, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
    }

    @java.lang.Deprecated
    public final java.lang.String toString(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return buildToString(str, str2, str3);
    }

    private java.lang.String buildToString(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(this.height * (this.width + 1));
        for (int i = 0; i < this.height; i++) {
            for (int i2 = 0; i2 < this.width; i2++) {
                sb.append(get(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final com.google.zxing.common.BitMatrix m10600clone() {
        return new com.google.zxing.common.BitMatrix(this.width, this.height, this.rowSize, (int[]) this.bits.clone());
    }
}
