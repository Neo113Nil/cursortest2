package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class PolynomialRingGF2m {
    private org.bouncycastle.pqc.math.linearalgebra.GF2mField Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM getHighSpeedVideoSizes;
    protected org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] sqMatrix;
    protected org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] sqRootMatrix;

    public PolynomialRingGF2m(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM) {
        int i;
        int coefficient;
        this.Camera2StreamConfigurationMap = gF2mField;
        this.getHighSpeedVideoSizes = polynomialGF2mSmallM;
        int degree = polynomialGF2mSmallM.getDegree();
        this.sqMatrix = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[degree];
        int i2 = 0;
        while (true) {
            i = degree >> 1;
            if (i2 >= i) {
                break;
            }
            int i3 = i2 << 1;
            int[] iArr = new int[i3 + 1];
            iArr[i3] = 1;
            this.sqMatrix[i2] = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.Camera2StreamConfigurationMap, iArr);
            i2++;
        }
        while (i < degree) {
            int i4 = i << 1;
            int[] iArr2 = new int[i4 + 1];
            iArr2[i4] = 1;
            this.sqMatrix[i] = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.Camera2StreamConfigurationMap, iArr2).mod(this.getHighSpeedVideoSizes);
            i++;
        }
        int degree2 = this.getHighSpeedVideoSizes.getDegree();
        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] polynomialGF2mSmallMArr = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[degree2];
        int i5 = degree2 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            polynomialGF2mSmallMArr[i6] = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.sqMatrix[i6]);
        }
        this.sqRootMatrix = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[degree2];
        while (i5 >= 0) {
            this.sqRootMatrix[i5] = new org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM(this.Camera2StreamConfigurationMap, i5);
            i5--;
        }
        for (int i7 = 0; i7 < degree2; i7++) {
            if (polynomialGF2mSmallMArr[i7].getCoefficient(i7) == 0) {
                int i8 = i7 + 1;
                boolean z = false;
                while (i8 < degree2) {
                    if (polynomialGF2mSmallMArr[i8].getCoefficient(i7) != 0) {
                        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM2 = polynomialGF2mSmallMArr[i7];
                        polynomialGF2mSmallMArr[i7] = polynomialGF2mSmallMArr[i8];
                        polynomialGF2mSmallMArr[i8] = polynomialGF2mSmallM2;
                        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] polynomialGF2mSmallMArr2 = this.sqRootMatrix;
                        org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM polynomialGF2mSmallM3 = polynomialGF2mSmallMArr2[i7];
                        polynomialGF2mSmallMArr2[i7] = polynomialGF2mSmallMArr2[i8];
                        polynomialGF2mSmallMArr2[i8] = polynomialGF2mSmallM3;
                        i8 = degree2;
                        z = true;
                    }
                    i8++;
                }
                if (!z) {
                    throw new java.lang.ArithmeticException("Squaring matrix is not invertible.");
                }
            }
            int inverse = this.Camera2StreamConfigurationMap.inverse(polynomialGF2mSmallMArr[i7].getCoefficient(i7));
            polynomialGF2mSmallMArr[i7].multThisWithElement(inverse);
            this.sqRootMatrix[i7].multThisWithElement(inverse);
            for (int i9 = 0; i9 < degree2; i9++) {
                if (i9 != i7 && (coefficient = polynomialGF2mSmallMArr[i9].getCoefficient(i7)) != 0) {
                    org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM multWithElement = polynomialGF2mSmallMArr[i7].multWithElement(coefficient);
                    org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM multWithElement2 = this.sqRootMatrix[i7].multWithElement(coefficient);
                    polynomialGF2mSmallMArr[i9].addToThis(multWithElement);
                    this.sqRootMatrix[i9].addToThis(multWithElement2);
                }
            }
        }
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getSquaringMatrix() {
        return this.sqMatrix;
    }

    public org.bouncycastle.pqc.math.linearalgebra.PolynomialGF2mSmallM[] getSquareRootMatrix() {
        return this.sqRootMatrix;
    }
}
