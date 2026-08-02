package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public final class GoppaCode {

    public static class MaMaPe {
        private org.bouncycastle.pqc.math.linearalgebra.Permutation getHighResolutionOutputSizeshNQ4ISI;
        private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighSpeedVideoFpsRanges;
        private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighSpeedVideoFpsRangesFor;

        public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getSecondMatrix() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public org.bouncycastle.pqc.math.linearalgebra.Permutation getPermutation() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getFirstMatrix() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public MaMaPe(org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix, org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix2, org.bouncycastle.pqc.math.linearalgebra.Permutation permutation) {
            this.getHighSpeedVideoFpsRanges = gF2Matrix;
            this.getHighSpeedVideoFpsRangesFor = gF2Matrix2;
            this.getHighResolutionOutputSizeshNQ4ISI = permutation;
        }
    }

    public static class MatrixSet {
        private int[] getHighSpeedVideoFpsRanges;
        private org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getHighSpeedVideoSizes;

        public int[] getSetJ() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public org.bouncycastle.pqc.math.linearalgebra.GF2Matrix getG() {
            return this.getHighSpeedVideoSizes;
        }

        public MatrixSet(org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix, int[] iArr) {
            this.getHighSpeedVideoSizes = gF2Matrix;
            this.getHighSpeedVideoFpsRanges = iArr;
        }
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Vector syndromeDecode(org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector, org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] polynomialGF2mSmallMArr) {
        int degree = 1 << gF2mField.getDegree();
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(degree);
        if (!gF2Vector.isZero()) {
            org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] modPolynomialToFracton = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(gF2Vector.toExtensionFieldVector(gF2mField)).modInverse(polynomialGF2mSmallM).addMonomial(1).modSquareRootMatrix(polynomialGF2mSmallMArr).modPolynomialToFracton(polynomialGF2mSmallM);
            org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM2 = modPolynomialToFracton[0];
            org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM multiply = polynomialGF2mSmallM2.multiply(polynomialGF2mSmallM2);
            org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM3 = modPolynomialToFracton[1];
            org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM add = multiply.add(polynomialGF2mSmallM3.multiply(polynomialGF2mSmallM3).multWithMonomial(1));
            org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM multWithElement = add.multWithElement(gF2mField.inverse(add.getHeadCoefficient()));
            for (int i = 0; i < degree; i++) {
                if (multWithElement.evaluateAt(i) == 0) {
                    gF2Vector2.setBit(i);
                }
            }
        }
        return gF2Vector2;
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Matrix createCanonicalCheckMatrix(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int degree = gF2mField.getDegree();
        int i = 1 << degree;
        int degree2 = polynomialGF2mSmallM.getDegree();
        int[][] iArr = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, degree2, i);
        int[][] iArr2 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, degree2, i);
        for (int i2 = 0; i2 < i; i2++) {
            iArr2[0][i2] = gF2mField.inverse(polynomialGF2mSmallM.evaluateAt(i2));
        }
        for (int i3 = 1; i3 < degree2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i3][i4] = gF2mField.mult(iArr2[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < degree2; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    int[] iArr3 = iArr[i5];
                    iArr3[i6] = gF2mField.add(iArr3[i6], gF2mField.mult(iArr2[i7][i6], polynomialGF2mSmallM.getCoefficient((degree2 + i7) - i5)));
                }
            }
        }
        int[][] iArr4 = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, degree2 * degree, (i + 31) >>> 5);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            for (int i10 = 0; i10 < degree2; i10++) {
                int i11 = iArr[i10][i8];
                for (int i12 = 0; i12 < degree; i12++) {
                    if (((i11 >>> i12) & 1) != 0) {
                        int[] iArr5 = iArr4[(((i10 + 1) * degree) - i12) - 1];
                        iArr5[i9] = iArr5[i9] ^ (1 << (i8 & 31));
                    }
                }
            }
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Matrix(i, iArr4);
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GoppaCode.MaMaPe computeSystematicForm(org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix, java.security.SecureRandom secureRandom) {
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix2;
        boolean z;
        int numColumns = gF2Matrix.getNumColumns();
        org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix3 = null;
        while (true) {
            org.bouncycastle.pqc.math.linearalgebra.Permutation permutation = new org.bouncycastle.pqc.math.linearalgebra.Permutation(numColumns, secureRandom);
            org.bouncycastle.pqc.math.linearalgebra.GF2Matrix gF2Matrix4 = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) gF2Matrix.rightMultiply(permutation);
            org.bouncycastle.pqc.math.linearalgebra.GF2Matrix leftSubMatrix = gF2Matrix4.getLeftSubMatrix();
            try {
                gF2Matrix2 = (org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) leftSubMatrix.computeInverse();
                z = true;
            } catch (java.lang.ArithmeticException unused) {
                gF2Matrix2 = gF2Matrix3;
                z = false;
            }
            if (z) {
                return new org.bouncycastle.pqc.math.linearalgebra.GoppaCode.MaMaPe(leftSubMatrix, ((org.bouncycastle.pqc.math.linearalgebra.GF2Matrix) gF2Matrix2.rightMultiply(gF2Matrix4)).getRightSubMatrix(), permutation);
            }
            gF2Matrix3 = gF2Matrix2;
        }
    }

    private GoppaCode() {
    }
}
