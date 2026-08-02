package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2nONBField extends org.bouncycastle.pqc.math.linearalgebra.GF2nField {
    int[][] getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    public GF2nONBField(int i, java.security.SecureRandom secureRandom) throws java.lang.RuntimeException {
        super(secureRandom);
        int order;
        int i2;
        int i3;
        if (i < 3) {
            throw new java.lang.IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i;
        this.getHighSpeedVideoFpsRangesFor = this.mDegree / 64;
        int i4 = this.mDegree & 63;
        this.getHighSpeedVideoSizes = i4;
        if (i4 == 0) {
            this.getHighSpeedVideoSizes = 64;
        } else {
            this.getHighSpeedVideoFpsRangesFor++;
        }
        if ((this.mDegree & 7) == 0) {
            throw new java.lang.RuntimeException("The extension degree is divisible by 8!");
        }
        this.getHighSpeedVideoFpsRanges = 1;
        int i5 = 0;
        while (i5 != 1) {
            int i6 = (this.getHighSpeedVideoFpsRanges * this.mDegree) + 1;
            if (org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.isPrime(i6)) {
                i5 = org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.gcd((this.getHighSpeedVideoFpsRanges * this.mDegree) / org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.order(2, i6), this.mDegree);
            }
            this.getHighSpeedVideoFpsRanges++;
        }
        int i7 = this.getHighSpeedVideoFpsRanges - 1;
        this.getHighSpeedVideoFpsRanges = i7;
        if (i7 == 1) {
            int i8 = (this.mDegree << 1) + 1;
            if (org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.isPrime(i8)) {
                if (org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.gcd((this.mDegree << 1) / org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.order(2, i8), this.mDegree) == 1) {
                    this.getHighSpeedVideoFpsRanges++;
                }
            }
        }
        if (this.getHighSpeedVideoFpsRanges >= 3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\nThe type of this field is ");
            sb.append(this.getHighSpeedVideoFpsRanges);
            throw new java.lang.RuntimeException(sb.toString());
        }
        this.getHighResolutionOutputSizeshNQ4ISI = (int[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) java.lang.Integer.TYPE, this.mDegree, 2);
        for (int i9 = 0; i9 < this.mDegree; i9++) {
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI[i9];
            iArr[0] = -1;
            iArr[1] = -1;
        }
        int i10 = this.getHighSpeedVideoFpsRanges;
        if ((i10 & 7) == 0) {
            throw new java.lang.RuntimeException("bisher nur fuer Gausssche Normalbasen implementiert");
        }
        int i11 = i10 * this.mDegree;
        int i12 = i11 + 1;
        int[] iArr2 = new int[i12];
        int i13 = this.getHighSpeedVideoFpsRanges;
        if (i13 == 1) {
            i2 = 1;
        } else if (i13 == 2) {
            i2 = i11;
        } else {
            java.util.Random random = new java.util.Random();
            int i14 = 0;
            while (i14 == 0) {
                i14 = random.nextInt() % i11;
                if (i14 < 0) {
                    i14 += i11;
                }
            }
            while (true) {
                order = org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.order(i14, i12);
                if (order % i13 == 0 && order != 0) {
                    break;
                }
                while (i14 == 0) {
                    i14 = random.nextInt() % i11;
                    if (i14 < 0) {
                        i14 += i11;
                    }
                }
            }
            int i15 = i13 / order;
            i2 = i14;
            for (int i16 = 2; i16 <= i15; i16++) {
                i2 *= i14;
            }
        }
        int i17 = 0;
        int i18 = 1;
        while (true) {
            i3 = this.getHighSpeedVideoFpsRanges;
            if (i17 >= i3) {
                break;
            }
            int i19 = i18;
            for (int i20 = 0; i20 < this.mDegree; i20++) {
                iArr2[i19] = i20;
                i19 = (i19 << 1) % i12;
                if (i19 < 0) {
                    i19 += i12;
                }
            }
            i18 = (i18 * i2) % i12;
            if (i18 < 0) {
                i18 += i12;
            }
            i17++;
        }
        if (i3 == 1) {
            int i21 = 1;
            while (i21 < i11) {
                int i22 = i21 + 1;
                int[] iArr3 = this.getHighResolutionOutputSizeshNQ4ISI[iArr2[i22]];
                int i23 = i12 - i21;
                if (iArr3[0] == -1) {
                    iArr3[0] = iArr2[i23];
                } else {
                    iArr3[1] = iArr2[i23];
                }
                i21 = i22;
            }
            int i24 = this.mDegree >> 1;
            for (int i25 = 1; i25 <= i24; i25++) {
                int[][] iArr4 = this.getHighResolutionOutputSizeshNQ4ISI;
                int i26 = i25 - 1;
                int[] iArr5 = iArr4[i26];
                if (iArr5[0] == -1) {
                    iArr5[0] = (i24 + i25) - 1;
                } else {
                    iArr5[1] = (i24 + i25) - 1;
                }
                int[] iArr6 = iArr4[(i24 + i25) - 1];
                if (iArr6[0] == -1) {
                    iArr6[0] = i26;
                } else {
                    iArr6[1] = i26;
                }
            }
        } else {
            if (i3 != 2) {
                throw new java.lang.RuntimeException("only type 1 or type 2 implemented");
            }
            int i27 = 1;
            while (i27 < i11) {
                int i28 = i27 + 1;
                int[] iArr7 = this.getHighResolutionOutputSizeshNQ4ISI[iArr2[i28]];
                int i29 = i12 - i27;
                if (iArr7[0] == -1) {
                    iArr7[0] = iArr2[i29];
                } else {
                    iArr7[1] = iArr2[i29];
                }
                i27 = i28;
            }
        }
        computeFieldPolynomial();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected org.bouncycastle.pqc.math.linearalgebra.GF2nElement getRandomRoot(org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial) {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gcd;
        int degree;
        int degree2;
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement(this, this.random);
                org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(2, org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nONBElement);
                org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial3 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(gF2nPolynomial2);
                for (int i = 1; i <= this.mDegree - 1; i++) {
                    gF2nPolynomial3 = gF2nPolynomial3.multiplyAndReduce(gF2nPolynomial3, gF2nPolynomial).add(gF2nPolynomial2);
                }
                gcd = gF2nPolynomial3.gcd(gF2nPolynomial);
                degree = gcd.getDegree();
                degree2 = gF2nPolynomial.getDegree();
                if (degree != 0 && degree != degree2) {
                    break;
                }
            }
            gF2nPolynomial = (degree << 1) > degree2 ? gF2nPolynomial.quotient(gcd) : new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(gcd);
        }
        return gF2nPolynomial.at(0);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected void computeFieldPolynomial() {
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 1) {
            this.fieldPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 1, "ALL");
            return;
        }
        if (i == 2) {
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 1, "ONE");
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 1, com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.XAMARIN);
            gF2Polynomial2.addToThis(gF2Polynomial);
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial3 = gF2Polynomial;
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            int i2 = 1;
            while (i2 < this.mDegree) {
                org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial shiftLeft = gF2Polynomial4.shiftLeft();
                shiftLeft.addToThis(gF2Polynomial3);
                i2++;
                gF2Polynomial3 = gF2Polynomial4;
                gF2Polynomial4 = shiftLeft;
            }
            this.fieldPolynomial = gF2Polynomial4;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(org.bouncycastle.pqc.math.linearalgebra.GF2nField gF2nField) {
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement randomRoot;
        if (this.mDegree != gF2nField.mDegree) {
            throw new java.lang.IllegalArgumentException("GF2nField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[this.mDegree];
        for (int i = 0; i < this.mDegree; i++) {
            gF2PolynomialArr[i] = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement[] gF2nElementArr = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement[this.mDegree];
        gF2nElementArr[0] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) randomRoot.clone();
        for (int i2 = 1; i2 < this.mDegree; i2++) {
            gF2nElementArr[i2] = gF2nElementArr[i2 - 1].square();
        }
        for (int i3 = 0; i3 < this.mDegree; i3++) {
            for (int i4 = 0; i4 < this.mDegree; i4++) {
                if (gF2nElementArr[i3].getHighSpeedVideoFpsRangesFor(i4)) {
                    gF2PolynomialArr[(this.mDegree - i4) - 1].setBit((this.mDegree - i3) - 1);
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }
}
