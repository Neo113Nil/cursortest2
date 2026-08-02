package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2Matrix extends org.bouncycastle.pqc.math.linearalgebra.Matrix {
    private int[][] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;

    public GF2Matrix(int i, char c, java.security.SecureRandom secureRandom) {
        int i2;
        if (i <= 0) {
            throw new java.lang.ArithmeticException("Size of matrix is non-positive.");
        }
        if (c == 'I') {
            this.numRows = i;
            this.numColumns = i;
            this.getHighSpeedVideoFpsRanges = (i + 31) >>> 5;
            this.Camera2StreamConfigurationMap = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
            for (int i3 = 0; i3 < this.numRows; i3++) {
                for (int i4 = 0; i4 < this.getHighSpeedVideoFpsRanges; i4++) {
                    this.Camera2StreamConfigurationMap[i3][i4] = 0;
                }
            }
            for (int i5 = 0; i5 < this.numRows; i5++) {
                this.Camera2StreamConfigurationMap[i5][i5 >>> 5] = 1 << (i5 & 31);
            }
            return;
        }
        if (c == 'L') {
            this.numRows = i;
            this.numColumns = i;
            this.getHighSpeedVideoFpsRanges = (i + 31) >>> 5;
            this.Camera2StreamConfigurationMap = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
            for (int i6 = 0; i6 < this.numRows; i6++) {
                int i7 = i6 >>> 5;
                int i8 = i6 & 31;
                for (int i9 = 0; i9 < i7; i9++) {
                    this.Camera2StreamConfigurationMap[i6][i9] = secureRandom.nextInt();
                }
                this.Camera2StreamConfigurationMap[i6][i7] = (secureRandom.nextInt() >>> (31 - i8)) | (1 << i8);
                while (true) {
                    i7++;
                    if (i7 < this.getHighSpeedVideoFpsRanges) {
                        this.Camera2StreamConfigurationMap[i6][i7] = 0;
                    }
                }
            }
            return;
        }
        if (c == 'R') {
            this.numRows = i;
            this.numColumns = i;
            this.getHighSpeedVideoFpsRanges = (i + 31) >>> 5;
            this.Camera2StreamConfigurationMap = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
            org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom).rightMultiply(new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom));
            int[] vector = new org.bouncycastle.pqc.math.linearalgebra.Permutation(i, secureRandom).getVector();
            for (int i10 = 0; i10 < i; i10++) {
                java.lang.System.arraycopy(gF2Matrix.Camera2StreamConfigurationMap[i10], 0, this.Camera2StreamConfigurationMap[vector[i10]], 0, this.getHighSpeedVideoFpsRanges);
            }
            return;
        }
        if (c != 'U') {
            if (c != 'Z') {
                throw new java.lang.ArithmeticException("Unknown matrix type.");
            }
            getHighSpeedVideoSizes(i, i);
            return;
        }
        this.numRows = i;
        this.numColumns = i;
        this.getHighSpeedVideoFpsRanges = (i + 31) >>> 5;
        this.Camera2StreamConfigurationMap = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
        int i11 = i & 31;
        int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int i14 = i13 >>> 5;
            for (int i15 = 0; i15 < i14; i15++) {
                this.Camera2StreamConfigurationMap[i13][i15] = 0;
            }
            this.Camera2StreamConfigurationMap[i13][i14] = (secureRandom.nextInt() | 1) << (i13 & 31);
            while (true) {
                i14++;
                i2 = this.getHighSpeedVideoFpsRanges;
                if (i14 < i2) {
                    this.Camera2StreamConfigurationMap[i13][i14] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.Camera2StreamConfigurationMap[i13];
            int i16 = i2 - 1;
            iArr[i16] = iArr[i16] & i12;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public org.bouncycastle.pqc.math.linearalgebra.Matrix computeInverse() {
        if (this.numRows != this.numColumns) {
            throw new java.lang.ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
        for (int i = this.numRows - 1; i >= 0; i--) {
            iArr[i] = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(this.Camera2StreamConfigurationMap[i]);
        }
        int[][] iArr2 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
        for (int i2 = this.numRows - 1; i2 >= 0; i2--) {
            iArr2[i2][i2 >> 5] = 1 << (i2 & 31);
        }
        for (int i3 = 0; i3 < this.numRows; i3++) {
            int i4 = i3 >> 5;
            int i5 = 1 << (i3 & 31);
            if ((iArr[i3][i4] & i5) == 0) {
                int i6 = i3 + 1;
                boolean z = false;
                while (i6 < this.numRows) {
                    int[] iArr3 = iArr[i6];
                    if ((iArr3[i4] & i5) != 0) {
                        int[] iArr4 = iArr[i3];
                        iArr[i3] = iArr3;
                        iArr[i6] = iArr4;
                        int[] iArr5 = iArr2[i3];
                        iArr2[i3] = iArr2[i6];
                        iArr2[i6] = iArr5;
                        i6 = this.numRows;
                        z = true;
                    }
                    i6++;
                }
                if (!z) {
                    throw new java.lang.ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int i7 = this.numRows - 1; i7 >= 0; i7--) {
                if (i7 != i3) {
                    int[] iArr6 = iArr[i7];
                    if ((iArr6[i4] & i5) != 0) {
                        int[] iArr7 = iArr[i3];
                        for (int length = iArr6.length - 1; length >= i4; length--) {
                            iArr6[length] = iArr7[length] ^ iArr6[length];
                        }
                        int[] iArr8 = iArr2[i3];
                        int[] iArr9 = iArr2[i7];
                        for (int length2 = iArr9.length - 1; length2 >= 0; length2--) {
                            iArr9[length2] = iArr8[length2] ^ iArr9[length2];
                        }
                    }
                }
            }
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numColumns, iArr2);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public java.lang.String toString() {
        int i = this.numColumns & 31;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            i2--;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i3 = 0; i3 < this.numRows; i3++) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i3);
            sb.append(": ");
            stringBuffer.append(sb.toString());
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.Camera2StreamConfigurationMap[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    if (((i5 >>> i6) & 1) == 0) {
                        stringBuffer.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i7 = this.Camera2StreamConfigurationMap[i3][this.getHighSpeedVideoFpsRanges - 1];
            for (int i8 = 0; i8 < i; i8++) {
                if (((i7 >>> i8) & 1) == 0) {
                    stringBuffer.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public org.bouncycastle.pqc.math.linearalgebra.Vector rightMultiplyRightCompactForm(org.bouncycastle.pqc.math.linearalgebra.Vector vector) {
        int i;
        if (!(vector instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Vector)) {
            throw new java.lang.ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns + this.numRows) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        int[] vecArray = ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        int i2 = this.numRows;
        int i3 = this.numRows & 31;
        for (int i4 = 0; i4 < this.numRows; i4++) {
            int i5 = i4 >> 5;
            int i6 = i4 & 31;
            int i7 = (vecArray[i5] >>> i6) & 1;
            int i8 = i2 >> 5;
            int i9 = 0;
            if (i3 != 0) {
                while (true) {
                    i = this.getHighSpeedVideoFpsRanges - 1;
                    if (i9 >= i) {
                        break;
                    }
                    int i10 = i8 + 1;
                    i7 ^= ((vecArray[i8] >>> i3) | (vecArray[i10] << (32 - i3))) & this.Camera2StreamConfigurationMap[i4][i9];
                    i9++;
                    i8 = i10;
                }
                int i11 = i8 + 1;
                int i12 = vecArray[i8] >>> i3;
                if (i11 < vecArray.length) {
                    i12 |= vecArray[i11] << (32 - i3);
                }
                i7 ^= i12 & this.Camera2StreamConfigurationMap[i4][i];
            } else {
                while (i9 < this.getHighSpeedVideoFpsRanges) {
                    i7 ^= this.Camera2StreamConfigurationMap[i4][i9] & vecArray[i8];
                    i9++;
                    i8++;
                }
            }
            int i13 = 0;
            for (int i14 = 0; i14 < 32; i14++) {
                i13 ^= i7 & 1;
                i7 >>>= 1;
            }
            if (i13 == 1) {
                iArr[i5] = iArr[i5] | (1 << i6);
            }
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(iArr, this.numRows);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public org.bouncycastle.pqc.math.linearalgebra.Vector rightMultiply(org.bouncycastle.pqc.math.linearalgebra.Vector vector) {
        if (!(vector instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Vector)) {
            throw new java.lang.ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numColumns) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        int[] vecArray = ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) vector).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        for (int i = 0; i < this.numRows; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.getHighSpeedVideoFpsRanges; i3++) {
                i2 ^= this.Camera2StreamConfigurationMap[i][i3] & vecArray[i3];
            }
            int i4 = 0;
            for (int i5 = 0; i5 < 32; i5++) {
                i4 ^= (i2 >>> i5) & 1;
            }
            if (i4 == 1) {
                int i6 = i >>> 5;
                iArr[i6] = iArr[i6] | (1 << (i & 31));
            }
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(iArr, this.numRows);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public org.bouncycastle.pqc.math.linearalgebra.Matrix rightMultiply(org.bouncycastle.pqc.math.linearalgebra.Permutation permutation) {
        int[] vector = permutation.getVector();
        if (vector.length != this.numColumns) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, this.numColumns);
        for (int i = this.numColumns - 1; i >= 0; i--) {
            int i2 = i >>> 5;
            int i3 = vector[i];
            for (int i4 = this.numRows - 1; i4 >= 0; i4--) {
                int[] iArr = gF2Matrix.Camera2StreamConfigurationMap[i4];
                iArr[i2] = iArr[i2] | (((this.Camera2StreamConfigurationMap[i4][i3 >>> 5] >>> (i3 & 31)) & 1) << (i & 31));
            }
        }
        return gF2Matrix;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public org.bouncycastle.pqc.math.linearalgebra.Matrix rightMultiply(org.bouncycastle.pqc.math.linearalgebra.Matrix matrix) {
        if (!(matrix instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Matrix)) {
            throw new java.lang.ArithmeticException("matrix is not defined over GF(2)");
        }
        if (matrix.numRows != this.numColumns) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) matrix;
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, matrix.numColumns);
        int i = this.numColumns & 31;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            i2--;
        }
        for (int i3 = 0; i3 < this.numRows; i3++) {
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                int i6 = this.Camera2StreamConfigurationMap[i3][i5];
                for (int i7 = 0; i7 < 32; i7++) {
                    if (((1 << i7) & i6) != 0) {
                        for (int i8 = 0; i8 < gF2Matrix.getHighSpeedVideoFpsRanges; i8++) {
                            int[] iArr = gF2Matrix2.Camera2StreamConfigurationMap[i3];
                            iArr[i8] = iArr[i8] ^ gF2Matrix.Camera2StreamConfigurationMap[i4][i8];
                        }
                    }
                    i4++;
                }
            }
            int i9 = this.Camera2StreamConfigurationMap[i3][this.getHighSpeedVideoFpsRanges - 1];
            for (int i10 = 0; i10 < i; i10++) {
                if (((1 << i10) & i9) != 0) {
                    for (int i11 = 0; i11 < gF2Matrix.getHighSpeedVideoFpsRanges; i11++) {
                        int[] iArr2 = gF2Matrix2.Camera2StreamConfigurationMap[i3];
                        iArr2[i11] = iArr2[i11] ^ gF2Matrix.Camera2StreamConfigurationMap[i4][i11];
                    }
                }
                i4++;
            }
        }
        return gF2Matrix2;
    }

    public org.bouncycastle.pqc.math.linearalgebra.Vector leftMultiplyLeftCompactForm(org.bouncycastle.pqc.math.linearalgebra.Vector vector) {
        if (!(vector instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Vector)) {
            throw new java.lang.ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        int[] vecArray = ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) vector).getVecArray();
        int[] iArr = new int[((this.numRows + this.numColumns) + 31) >>> 5];
        int i = this.numRows >>> 5;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = 1;
            do {
                if ((vecArray[i3] & i4) != 0) {
                    for (int i5 = 0; i5 < this.getHighSpeedVideoFpsRanges; i5++) {
                        iArr[i5] = iArr[i5] ^ this.Camera2StreamConfigurationMap[i2][i5];
                    }
                    int i6 = (this.numColumns + i2) >>> 5;
                    iArr[i6] = (1 << ((this.numColumns + i2) & 31)) | iArr[i6];
                }
                i2++;
                i4 <<= 1;
            } while (i4 != 0);
        }
        int i7 = this.numRows;
        for (int i8 = 1; i8 != (1 << (i7 & 31)); i8 <<= 1) {
            if ((vecArray[i] & i8) != 0) {
                for (int i9 = 0; i9 < this.getHighSpeedVideoFpsRanges; i9++) {
                    iArr[i9] = iArr[i9] ^ this.Camera2StreamConfigurationMap[i2][i9];
                }
                int i10 = (this.numColumns + i2) >>> 5;
                iArr[i10] = (1 << ((this.numColumns + i2) & 31)) | iArr[i10];
            }
            i2++;
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(iArr, this.numRows + this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public org.bouncycastle.pqc.math.linearalgebra.Vector leftMultiply(org.bouncycastle.pqc.math.linearalgebra.Vector vector) {
        if (!(vector instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Vector)) {
            throw new java.lang.ArithmeticException("vector is not defined over GF(2)");
        }
        if (vector.length != this.numRows) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        int[] vecArray = ((org.bouncycastle.pqc.math.linearalgebra.GF2Vector) vector).getVecArray();
        int[] iArr = new int[this.getHighSpeedVideoFpsRanges];
        int i = this.numRows >> 5;
        int i2 = this.numRows;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (i4 >= i) {
                break;
            }
            do {
                if ((vecArray[i4] & i5) != 0) {
                    for (int i6 = 0; i6 < this.getHighSpeedVideoFpsRanges; i6++) {
                        iArr[i6] = iArr[i6] ^ this.Camera2StreamConfigurationMap[i3][i6];
                    }
                }
                i3++;
                i5 <<= 1;
            } while (i5 != 0);
            i4++;
        }
        for (int i7 = 1; i7 != (1 << (i2 & 31)); i7 <<= 1) {
            if ((vecArray[i] & i7) != 0) {
                for (int i8 = 0; i8 < this.getHighSpeedVideoFpsRanges; i8++) {
                    iArr[i8] = iArr[i8] ^ this.Camera2StreamConfigurationMap[i3][i8];
                }
            }
            i3++;
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(iArr, this.numColumns);
    }

    public org.bouncycastle.pqc.math.linearalgebra.Matrix leftMultiply(org.bouncycastle.pqc.math.linearalgebra.Permutation permutation) {
        int[] vector = permutation.getVector();
        if (vector.length != this.numRows) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        int[][] iArr = new int[this.numRows][];
        for (int i = this.numRows - 1; i >= 0; i--) {
            iArr[i] = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(this.Camera2StreamConfigurationMap[vector[i]]);
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public boolean isZero() {
        for (int i = 0; i < this.numRows; i++) {
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRanges; i2++) {
                if (this.Camera2StreamConfigurationMap[i][i2] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int i = (((this.numRows * 31) + this.numColumns) * 31) + this.getHighSpeedVideoFpsRanges;
        for (int i2 = 0; i2 < this.numRows; i2++) {
            i = (i * 31) + org.bouncycastle.util.Arrays.hashCode(this.Camera2StreamConfigurationMap[i2]);
        }
        return i;
    }

    public int[] getRow(int i) {
        return this.Camera2StreamConfigurationMap[i];
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getRightSubMatrix() {
        int i;
        if (this.numColumns <= this.numRows) {
            throw new java.lang.ArithmeticException("empty submatrix");
        }
        int i2 = this.numRows >> 5;
        int i3 = this.numRows & 31;
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, this.numColumns - this.numRows);
        for (int i4 = this.numRows - 1; i4 >= 0; i4--) {
            int i5 = 0;
            if (i3 != 0) {
                int i6 = i2;
                while (true) {
                    i = gF2Matrix.getHighSpeedVideoFpsRanges - 1;
                    if (i5 >= i) {
                        break;
                    }
                    int[] iArr = gF2Matrix.Camera2StreamConfigurationMap[i4];
                    int[] iArr2 = this.Camera2StreamConfigurationMap[i4];
                    int i7 = i6 + 1;
                    iArr[i5] = (iArr2[i6] >>> i3) | (iArr2[i7] << (32 - i3));
                    i5++;
                    i6 = i7;
                }
                int[] iArr3 = gF2Matrix.Camera2StreamConfigurationMap[i4];
                int[] iArr4 = this.Camera2StreamConfigurationMap[i4];
                int i8 = i6 + 1;
                int i9 = iArr4[i6] >>> i3;
                iArr3[i] = i9;
                if (i8 < this.getHighSpeedVideoFpsRanges) {
                    iArr3[i] = i9 | (iArr4[i8] << (32 - i3));
                }
            } else {
                java.lang.System.arraycopy(this.Camera2StreamConfigurationMap[i4], i2, gF2Matrix.Camera2StreamConfigurationMap[i4], 0, gF2Matrix.getHighSpeedVideoFpsRanges);
            }
        }
        return gF2Matrix;
    }

    public int getLength() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getLeftSubMatrix() {
        if (this.numColumns <= this.numRows) {
            throw new java.lang.ArithmeticException("empty submatrix");
        }
        int i = (this.numRows + 31) >> 5;
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, i);
        int i2 = (1 << (this.numRows & 31)) - 1;
        if (i2 == 0) {
            i2 = -1;
        }
        for (int i3 = this.numRows - 1; i3 >= 0; i3--) {
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap[i3], 0, iArr[i3], 0, i);
            int[] iArr2 = iArr[i3];
            int i4 = i - 1;
            iArr2[i4] = iArr2[i4] & i2;
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, iArr);
    }

    public int[][] getIntArray() {
        return this.Camera2StreamConfigurationMap;
    }

    public double getHammingWeight() {
        int i = this.numColumns & 31;
        int i2 = this.getHighSpeedVideoFpsRanges;
        if (i != 0) {
            i2--;
        }
        double d = 0.0d;
        double d2 = 0.0d;
        for (int i3 = 0; i3 < this.numRows; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = this.Camera2StreamConfigurationMap[i3][i4];
                for (int i6 = 0; i6 < 32; i6++) {
                    d += (i5 >>> i6) & 1;
                    d2 += 1.0d;
                }
            }
            int i7 = this.Camera2StreamConfigurationMap[i3][this.getHighSpeedVideoFpsRanges - 1];
            for (int i8 = 0; i8 < i; i8++) {
                d += (i7 >>> i8) & 1;
                d2 += 1.0d;
            }
        }
        return d / d2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Matrix
    public byte[] getEncoded() {
        int i = 8;
        byte[] bArr = new byte[(((this.numColumns + 7) >>> 3) * this.numRows) + 8];
        org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.I2OSP(this.numRows, bArr, 0);
        org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.I2OSP(this.numColumns, bArr, 4);
        int i2 = this.numColumns >>> 5;
        int i3 = this.numColumns;
        for (int i4 = 0; i4 < this.numRows; i4++) {
            int i5 = 0;
            while (i5 < i2) {
                org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.I2OSP(this.Camera2StreamConfigurationMap[i4][i5], bArr, i);
                i5++;
                i += 4;
            }
            int i6 = 0;
            while (i6 < (i3 & 31)) {
                bArr[i] = (byte) ((this.Camera2StreamConfigurationMap[i4][i2] >>> i6) & 255);
                i6 += 8;
                i++;
            }
        }
        return bArr;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix extendRightCompactForm() {
        int i;
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, this.numRows + this.numColumns);
        int i2 = this.numRows >> 5;
        int i3 = this.numRows & 31;
        for (int i4 = this.numRows - 1; i4 >= 0; i4--) {
            int[] iArr = gF2Matrix.Camera2StreamConfigurationMap[i4];
            int i5 = i4 >> 5;
            iArr[i5] = iArr[i5] | (1 << (i4 & 31));
            int i6 = 0;
            if (i3 != 0) {
                int i7 = i2;
                while (true) {
                    i = this.getHighSpeedVideoFpsRanges - 1;
                    if (i6 >= i) {
                        break;
                    }
                    int i8 = this.Camera2StreamConfigurationMap[i4][i6];
                    int[] iArr2 = gF2Matrix.Camera2StreamConfigurationMap[i4];
                    int i9 = i7 + 1;
                    iArr2[i7] = iArr2[i7] | (i8 << i3);
                    iArr2[i9] = iArr2[i9] | (i8 >>> (32 - i3));
                    i6++;
                    i7 = i9;
                }
                int i10 = this.Camera2StreamConfigurationMap[i4][i];
                int[] iArr3 = gF2Matrix.Camera2StreamConfigurationMap[i4];
                int i11 = i7 + 1;
                iArr3[i7] = iArr3[i7] | (i10 << i3);
                if (i11 < gF2Matrix.getHighSpeedVideoFpsRanges) {
                    iArr3[i11] = iArr3[i11] | (i10 >>> (32 - i3));
                }
            } else {
                java.lang.System.arraycopy(this.Camera2StreamConfigurationMap[i4], 0, iArr, i2, this.getHighSpeedVideoFpsRanges);
            }
        }
        return gF2Matrix;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix extendLeftCompactForm() {
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, this.numColumns + this.numRows);
        int i = (this.numRows - 1) + this.numColumns;
        int i2 = this.numRows - 1;
        while (i2 >= 0) {
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap[i2], 0, gF2Matrix.Camera2StreamConfigurationMap[i2], 0, this.getHighSpeedVideoFpsRanges);
            int[] iArr = gF2Matrix.Camera2StreamConfigurationMap[i2];
            int i3 = i >> 5;
            iArr[i3] = iArr[i3] | (1 << (i & 31));
            i2--;
            i--;
        }
        return gF2Matrix;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Matrix)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) obj;
        if (this.numRows != gF2Matrix.numRows || this.numColumns != gF2Matrix.numColumns || this.getHighSpeedVideoFpsRanges != gF2Matrix.getHighSpeedVideoFpsRanges) {
            return false;
        }
        for (int i = 0; i < this.numRows; i++) {
            if (!org.bouncycastle.pqc.math.linearalgebra.IntUtils.equals(this.Camera2StreamConfigurationMap[i], gF2Matrix.Camera2StreamConfigurationMap[i])) {
                return false;
            }
        }
        return true;
    }

    public org.bouncycastle.pqc.math.linearalgebra.Matrix computeTranspose() {
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numColumns, (this.numRows + 31) >>> 5);
        for (int i = 0; i < this.numRows; i++) {
            for (int i2 = 0; i2 < this.numColumns; i2++) {
                int i3 = i >>> 5;
                if (((this.Camera2StreamConfigurationMap[i][i2 >>> 5] >>> (i2 & 31)) & 1) == 1) {
                    int[] iArr2 = iArr[i2];
                    iArr2[i3] = (1 << (i & 31)) | iArr2[i3];
                }
            }
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(this.numRows, iArr);
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Matrix[] createRandomRegularMatrixAndItsInverse(int i, java.security.SecureRandom secureRandom) {
        int i2 = i;
        int i3 = (i2 + 31) >> 5;
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i2, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, secureRandom);
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i2, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, secureRandom);
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix3 = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) gF2Matrix.rightMultiply(gF2Matrix2);
        org.bouncycastle.pqc.math.linearalgebra.Permutation permutation = new org.bouncycastle.pqc.math.linearalgebra.Permutation(i2, secureRandom);
        int[] vector = permutation.getVector();
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, i2, i3);
        for (int i4 = 0; i4 < i2; i4++) {
            java.lang.System.arraycopy(gF2Matrix3.Camera2StreamConfigurationMap[vector[i4]], 0, iArr[i4], 0, i3);
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix4 = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i2, iArr);
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix5 = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i2, 'I');
        int i5 = 0;
        while (i5 < i2) {
            int i6 = i5 >>> 5;
            int i7 = i5 + 1;
            for (int i8 = i7; i8 < i2; i8++) {
                if ((gF2Matrix.Camera2StreamConfigurationMap[i8][i6] & (1 << (i5 & 31))) != 0) {
                    for (int i9 = 0; i9 <= i6; i9++) {
                        int[][] iArr2 = gF2Matrix5.Camera2StreamConfigurationMap;
                        int[] iArr3 = iArr2[i8];
                        iArr3[i9] = iArr3[i9] ^ iArr2[i5][i9];
                    }
                }
            }
            i5 = i7;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix6 = new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i2, 'I');
        while (true) {
            i2--;
            if (i2 < 0) {
                return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix[]{gF2Matrix4, (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) gF2Matrix6.rightMultiply(gF2Matrix5.rightMultiply(permutation))};
            }
            int i10 = i2 >>> 5;
            for (int i11 = i2 - 1; i11 >= 0; i11--) {
                if ((gF2Matrix2.Camera2StreamConfigurationMap[i11][i10] & (1 << (i2 & 31))) != 0) {
                    for (int i12 = i10; i12 < i3; i12++) {
                        int[][] iArr4 = gF2Matrix6.Camera2StreamConfigurationMap;
                        int[] iArr5 = iArr4[i11];
                        iArr5[i12] = iArr4[i2][i12] ^ iArr5[i12];
                    }
                }
            }
        }
    }

    private void getHighSpeedVideoSizes(int i, int i2) {
        this.numRows = i;
        this.numColumns = i2;
        this.getHighSpeedVideoFpsRanges = (i2 + 31) >>> 5;
        this.Camera2StreamConfigurationMap = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
        for (int i3 = 0; i3 < this.numRows; i3++) {
            for (int i4 = 0; i4 < this.getHighSpeedVideoFpsRanges; i4++) {
                this.Camera2StreamConfigurationMap[i3][i4] = 0;
            }
        }
    }

    public GF2Matrix(byte[] bArr) {
        if (bArr.length < 9) {
            throw new java.lang.ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.numRows = org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.OS2IP(bArr, 0);
        this.numColumns = org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.OS2IP(bArr, 4);
        int i = this.numColumns;
        int i2 = this.numRows;
        if (this.numRows > 0) {
            int i3 = ((i + 7) >>> 3) * i2;
            int i4 = 8;
            if (i3 == bArr.length - 8) {
                this.getHighSpeedVideoFpsRanges = (this.numColumns + 31) >>> 5;
                this.Camera2StreamConfigurationMap = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.numRows, this.getHighSpeedVideoFpsRanges);
                int i5 = this.numColumns >> 5;
                int i6 = this.numColumns;
                for (int i7 = 0; i7 < this.numRows; i7++) {
                    int i8 = 0;
                    while (i8 < i5) {
                        this.Camera2StreamConfigurationMap[i7][i8] = org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.OS2IP(bArr, i4);
                        i8++;
                        i4 += 4;
                    }
                    int i9 = 0;
                    while (i9 < (i6 & 31)) {
                        int[] iArr = this.Camera2StreamConfigurationMap[i7];
                        iArr[i5] = iArr[i5] ^ ((bArr[i4] & 255) << i9);
                        i9 += 8;
                        i4++;
                    }
                }
                return;
            }
        }
        throw new java.lang.ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    public GF2Matrix(org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix) {
        this.numColumns = gF2Matrix.getNumColumns();
        this.numRows = gF2Matrix.getNumRows();
        this.getHighSpeedVideoFpsRanges = gF2Matrix.getHighSpeedVideoFpsRanges;
        this.Camera2StreamConfigurationMap = new int[gF2Matrix.Camera2StreamConfigurationMap.length][];
        int i = 0;
        while (true) {
            int[][] iArr = this.Camera2StreamConfigurationMap;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(gF2Matrix.Camera2StreamConfigurationMap[i]);
            i++;
        }
    }

    public GF2Matrix(int i, int[][] iArr) {
        if (iArr[0].length != ((i + 31) >> 5)) {
            throw new java.lang.ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i;
        this.numRows = iArr.length;
        this.getHighSpeedVideoFpsRanges = iArr[0].length;
        int i2 = i & 31;
        int i3 = i2 == 0 ? -1 : (1 << i2) - 1;
        for (int i4 = 0; i4 < this.numRows; i4++) {
            int[] iArr2 = iArr[i4];
            int i5 = this.getHighSpeedVideoFpsRanges - 1;
            iArr2[i5] = iArr2[i5] & i3;
        }
        this.Camera2StreamConfigurationMap = iArr;
    }

    private GF2Matrix(int i, int i2) {
        if (i2 <= 0 || i <= 0) {
            throw new java.lang.ArithmeticException("size of matrix is non-positive");
        }
        getHighSpeedVideoSizes(i, i2);
    }

    public GF2Matrix(int i, char c) {
        this(i, c, new java.security.SecureRandom());
    }
}
