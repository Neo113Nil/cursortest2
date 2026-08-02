package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2nPolynomialElement extends org.bouncycastle.pqc.math.linearalgebra.GF2nElement {
    private static final int[] getHighSpeedVideoFpsRangesFor = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE, 268435456, 536870912, 1073741824, Integer.MIN_VALUE, 0};
    private org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial getHighResolutionOutputSizeshNQ4ISI;

    public GF2nPolynomialElement(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField gF2nPolynomialField, java.util.Random random) {
        this.mField = gF2nPolynomialField;
        this.mDegree = this.mField.getDegree();
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree);
        this.getHighResolutionOutputSizeshNQ4ISI = gF2Polynomial;
        gF2Polynomial.expandN(this.mDegree);
        this.getHighResolutionOutputSizeshNQ4ISI.randomize(random);
    }

    private void getHighSpeedVideoFpsRanges() {
        if (this.getHighResolutionOutputSizeshNQ4ISI.getLength() <= this.mDegree) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.getLength() < this.mDegree) {
                this.getHighResolutionOutputSizeshNQ4ISI.expandN(this.mDegree);
                return;
            }
            return;
        }
        long j = 4294967295L;
        boolean z = false;
        if (((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField).isTrinomial()) {
            try {
                int tc = ((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField).getTc();
                if (this.mDegree - tc <= 32 || this.getHighResolutionOutputSizeshNQ4ISI.getLength() > (this.mDegree << 1)) {
                    int i = this.mDegree;
                    for (int length = this.getHighResolutionOutputSizeshNQ4ISI.getLength() - 1; length >= this.mDegree; length--) {
                        if (this.getHighResolutionOutputSizeshNQ4ISI.testBit(length)) {
                            this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length);
                            this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length - (i - tc));
                            this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length - this.mDegree);
                        }
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI.reduceN();
                    this.getHighResolutionOutputSizeshNQ4ISI.expandN(this.mDegree);
                    return;
                }
                org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = this.mDegree;
                int i3 = i2 >>> 5;
                int i4 = i2 & 31;
                int i5 = 32 - i4;
                int i6 = i2 - tc;
                int i7 = i6 >>> 5;
                int i8 = 32 - (i6 & 31);
                int i9 = ((i2 << 1) - 2) >>> 5;
                while (i9 > i3) {
                    int[] iArr = gF2Polynomial.getHighSpeedVideoFpsRangesFor;
                    long j2 = iArr[i9] & j;
                    int i10 = i9 - i3;
                    int i11 = i10 - 1;
                    iArr[i11] = ((int) (j2 << i5)) ^ iArr[i11];
                    iArr[i10] = (int) (iArr[i10] ^ (j2 >>> (32 - i5)));
                    int i12 = i9 - i7;
                    int i13 = i12 - 1;
                    iArr[i13] = ((int) (j2 << i8)) ^ iArr[i13];
                    iArr[i12] = (int) ((j2 >>> (32 - i8)) ^ iArr[i12]);
                    iArr[i9] = 0;
                    i9--;
                    i5 = i5;
                    i7 = i7;
                    j = 4294967295L;
                }
                int[] iArr2 = gF2Polynomial.getHighSpeedVideoFpsRangesFor;
                long j3 = 4294967295L & iArr2[i3] & (4294967295 << i4);
                iArr2[0] = (int) (iArr2[0] ^ (j3 >>> (32 - i5)));
                int i14 = i3 - i7;
                int i15 = i14 - 1;
                if (i15 >= 0) {
                    iArr2[i15] = iArr2[i15] ^ ((int) (j3 << i8));
                }
                iArr2[i14] = (int) ((j3 >>> (32 - i8)) ^ iArr2[i14]);
                iArr2[i3] = iArr2[i3] & org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial.getHighSpeedVideoFpsRanges[i4];
                gF2Polynomial.getHighSpeedVideoSizes = ((i2 - 1) >>> 5) + 1;
                gF2Polynomial.Camera2StreamConfigurationMap = i2;
                return;
            } catch (java.lang.RuntimeException unused) {
                throw new java.lang.RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a trinomial");
            }
        }
        if (!((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField).isPentanomial()) {
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial remainder = this.getHighResolutionOutputSizeshNQ4ISI.remainder(this.mField.getFieldPolynomial());
            this.getHighResolutionOutputSizeshNQ4ISI = remainder;
            remainder.expandN(this.mDegree);
            return;
        }
        try {
            int[] pc = ((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField).getPc();
            if (this.mDegree - pc[2] <= 32 || this.getHighResolutionOutputSizeshNQ4ISI.getLength() > (this.mDegree << 1)) {
                int i16 = this.mDegree;
                int i17 = pc[2];
                int i18 = this.mDegree;
                int i19 = pc[1];
                int i20 = this.mDegree;
                int i21 = pc[0];
                for (int length2 = this.getHighResolutionOutputSizeshNQ4ISI.getLength() - 1; length2 >= this.mDegree; length2--) {
                    if (this.getHighResolutionOutputSizeshNQ4ISI.testBit(length2)) {
                        this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length2);
                        this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length2 - (i16 - i17));
                        this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length2 - (i18 - i19));
                        this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length2 - (i20 - i21));
                        this.getHighResolutionOutputSizeshNQ4ISI.xorBit(length2 - this.mDegree);
                    }
                }
                this.getHighResolutionOutputSizeshNQ4ISI.reduceN();
                this.getHighResolutionOutputSizeshNQ4ISI.expandN(this.mDegree);
                return;
            }
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial2 = this.getHighResolutionOutputSizeshNQ4ISI;
            int i22 = this.mDegree;
            int i23 = i22 >>> 5;
            int i24 = i22 & 31;
            int i25 = 32 - i24;
            int i26 = i22 - pc[0];
            int i27 = i26 >>> 5;
            int i28 = 32 - (i26 & 31);
            int i29 = i22 - pc[1];
            int i30 = i29 >>> 5;
            int i31 = 32 - (i29 & 31);
            int i32 = i22 - pc[2];
            int i33 = i32 >>> 5;
            int i34 = 32 - (i32 & 31);
            int i35 = ((i22 << 1) - 2) >>> 5;
            while (i35 > i23) {
                int[] iArr3 = gF2Polynomial2.getHighSpeedVideoFpsRangesFor;
                org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial3 = gF2Polynomial2;
                long j4 = iArr3[i35] & 4294967295L;
                int i36 = i35 - i23;
                int i37 = i36 - 1;
                int i38 = i23;
                iArr3[i37] = iArr3[i37] ^ ((int) (j4 << i25));
                iArr3[i36] = (int) (iArr3[i36] ^ (j4 >>> (32 - i25)));
                int i39 = i35 - i27;
                int i40 = i39 - 1;
                iArr3[i40] = ((int) (j4 << i28)) ^ iArr3[i40];
                iArr3[i39] = (int) (iArr3[i39] ^ (j4 >>> (32 - i28)));
                int i41 = i35 - i30;
                int i42 = i41 - 1;
                iArr3[i42] = iArr3[i42] ^ ((int) (j4 << i31));
                iArr3[i41] = (int) (iArr3[i41] ^ (j4 >>> (32 - i31)));
                int i43 = i35 - i33;
                int i44 = i43 - 1;
                iArr3[i44] = iArr3[i44] ^ ((int) (j4 << i34));
                iArr3[i43] = (int) ((j4 >>> (32 - i34)) ^ iArr3[i43]);
                iArr3[i35] = 0;
                i35--;
                z = false;
                i28 = i28;
                gF2Polynomial2 = gF2Polynomial3;
                i22 = i22;
                i24 = i24;
                i25 = i25;
                i23 = i38;
            }
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
            int i45 = i22;
            boolean z2 = z;
            int i46 = i23;
            int i47 = i24;
            int i48 = i28;
            int[] iArr4 = gF2Polynomial4.getHighSpeedVideoFpsRangesFor;
            long j5 = iArr4[i46] & 4294967295L & (4294967295 << i47);
            iArr4[z2 ? 1 : 0] = (int) (iArr4[z2 ? 1 : 0] ^ (j5 >>> (32 - i25)));
            int i49 = i46 - i27;
            int i50 = i49 - 1;
            if (i50 >= 0) {
                iArr4[i50] = iArr4[i50] ^ ((int) (j5 << i48));
            }
            iArr4[i49] = (int) (iArr4[i49] ^ (j5 >>> (32 - i48)));
            int i51 = i46 - i30;
            int i52 = i51 - 1;
            if (i52 >= 0) {
                iArr4[i52] = iArr4[i52] ^ ((int) (j5 << i31));
            }
            iArr4[i51] = (int) (iArr4[i51] ^ (j5 >>> (32 - i31)));
            int i53 = i46 - i33;
            int i54 = i53 - 1;
            if (i54 >= 0) {
                iArr4[i54] = iArr4[i54] ^ ((int) (j5 << i34));
            }
            iArr4[i53] = (int) ((j5 >>> (32 - i34)) ^ iArr4[i53]);
            iArr4[i46] = iArr4[i46] & org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial.getHighSpeedVideoFpsRanges[i47];
            gF2Polynomial4.getHighSpeedVideoSizes = ((i45 - 1) >>> 5) + 1;
            gF2Polynomial4.Camera2StreamConfigurationMap = i45;
        } catch (java.lang.RuntimeException unused2) {
            throw new java.lang.RuntimeException("GF2nPolynomialElement.reduce: the field polynomial is not a pentanomial");
        }
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement invertEEA() throws java.lang.ArithmeticException {
        if (isZero()) {
            throw new java.lang.ArithmeticException();
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 32, "ONE");
        gF2Polynomial.reduceN();
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 32);
        gF2Polynomial2.reduceN();
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial3 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        gF2Polynomial3.reduceN();
        while (!gF2Polynomial3.isOne()) {
            gF2Polynomial3.reduceN();
            fieldPolynomial.reduceN();
            int length = gF2Polynomial3.getLength() - fieldPolynomial.getLength();
            if (length < 0) {
                length = -length;
                gF2Polynomial.reduceN();
                org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                gF2Polynomial2 = gF2Polynomial;
                gF2Polynomial = gF2Polynomial4;
                org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                fieldPolynomial = gF2Polynomial3;
                gF2Polynomial3 = gF2Polynomial5;
            }
            gF2Polynomial3.shiftLeftAddThis(fieldPolynomial, length);
            gF2Polynomial.shiftLeftAddThis(gF2Polynomial2, length);
        }
        gF2Polynomial.reduceN();
        return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField, gF2Polynomial);
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement invertMAIA() throws java.lang.ArithmeticException {
        if (isZero()) {
            throw new java.lang.ArithmeticException();
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree, "ONE");
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree);
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial3 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.getHighResolutionOutputSizeshNQ4ISI);
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial fieldPolynomial = this.mField.getFieldPolynomial();
        while (true) {
            if (!gF2Polynomial3.testBit(0)) {
                gF2Polynomial3.shiftRightThis();
                if (gF2Polynomial.testBit(0)) {
                    gF2Polynomial.addToThis(this.mField.getFieldPolynomial());
                }
                gF2Polynomial.shiftRightThis();
            } else {
                if (gF2Polynomial3.isOne()) {
                    return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField, gF2Polynomial);
                }
                gF2Polynomial3.reduceN();
                fieldPolynomial.reduceN();
                if (gF2Polynomial3.getLength() < fieldPolynomial.getLength()) {
                    org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial4 = gF2Polynomial2;
                    gF2Polynomial2 = gF2Polynomial;
                    gF2Polynomial = gF2Polynomial4;
                    org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial5 = fieldPolynomial;
                    fieldPolynomial = gF2Polynomial3;
                    gF2Polynomial3 = gF2Polynomial5;
                }
                gF2Polynomial3.addToThis(fieldPolynomial);
                gF2Polynomial.addToThis(gF2Polynomial2);
            }
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement solveQuadraticEquation() throws java.lang.RuntimeException {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement ZERO;
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement;
        if (isZero()) {
            return ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField);
        }
        if ((this.mDegree & 1) == 1) {
            if ((this.mDegree & 1) == 0) {
                throw new java.lang.RuntimeException();
            }
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
            for (int i = 1; i <= ((this.mDegree - 1) >> 1); i++) {
                gF2nPolynomialElement2.squareThis();
                gF2nPolynomialElement2.squareThis();
                gF2nPolynomialElement2.addToThis(this);
            }
            return gF2nPolynomialElement2;
        }
        do {
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement3 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField, new java.util.Random());
            ZERO = ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField);
            gF2nPolynomialElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement) gF2nPolynomialElement3.clone();
            for (int i2 = 1; i2 < this.mDegree; i2++) {
                ZERO.squareThis();
                gF2nPolynomialElement.squareThis();
                ZERO.addToThis(gF2nPolynomialElement.multiply(this));
                gF2nPolynomialElement.addToThis(gF2nPolynomialElement3);
            }
        } while (gF2nPolynomialElement.isZero());
        if (equals(ZERO.square().add(ZERO))) {
            return ZERO;
        }
        throw new java.lang.RuntimeException();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public int trace() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        for (int i = 1; i < this.mDegree; i++) {
            gF2nPolynomialElement.squareThis();
            gF2nPolynomialElement.addToThis(this);
        }
        return gF2nPolynomialElement.isOne() ? 1 : 0;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.lang.String toString(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString(i);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.lang.String toString() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toString(16);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.math.BigInteger toFlexiBigInt() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toFlexiBigInt();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        return this.getHighResolutionOutputSizeshNQ4ISI.toByteArray();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return this.getHighResolutionOutputSizeshNQ4ISI.testBit(0);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    final boolean getHighSpeedVideoFpsRangesFor(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI.testBit(i);
    }

    public void squareThisPreCalc() {
        this.getHighResolutionOutputSizeshNQ4ISI.squareThisPreCalc();
        getHighSpeedVideoFpsRanges();
    }

    public void squareThisMatrix() {
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree);
        for (int i = 0; i < this.mDegree; i++) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.vectorMult(((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField).getHighSpeedVideoFpsRangesFor[(this.mDegree - i) - 1])) {
                gF2Polynomial.setBit(i);
            }
        }
        this.getHighResolutionOutputSizeshNQ4ISI = gF2Polynomial;
    }

    public void squareThisBitwise() {
        this.getHighResolutionOutputSizeshNQ4ISI.squareThisBitwise();
        getHighSpeedVideoFpsRanges();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareThis() {
        squareThisPreCalc();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        this.getHighResolutionOutputSizeshNQ4ISI.expandN((this.mDegree << 1) + 32);
        this.getHighResolutionOutputSizeshNQ4ISI.reduceN();
        for (int i = 0; i < this.mField.getDegree() - 1; i++) {
            squareThis();
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement squareRoot() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareRootThis();
        return gF2nPolynomialElement;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement squarePreCalc() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisPreCalc();
        gF2nPolynomialElement.getHighSpeedVideoFpsRanges();
        return gF2nPolynomialElement;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement squareMatrix() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisMatrix();
        gF2nPolynomialElement.getHighSpeedVideoFpsRanges();
        return gF2nPolynomialElement;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement squareBitwise() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.squareThisBitwise();
        gF2nPolynomialElement.getHighSpeedVideoFpsRanges();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement square() {
        return squarePreCalc();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement power(int i) {
        if (i == 1) {
            return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement ONE = ONE((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) this.mField);
        if (i != 0) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
            gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI.expandN((gF2nPolynomialElement.mDegree << 1) + 32);
            gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI.reduceN();
            for (int i2 = 0; i2 < this.mDegree; i2++) {
                if (((1 << i2) & i) != 0) {
                    ONE.multiplyThisBy(gF2nPolynomialElement);
                }
                gF2nPolynomialElement.square();
            }
        }
        return ONE;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void multiplyThisBy(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        if (!(gFElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement)) {
            throw new java.lang.RuntimeException();
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement) gFElement;
        if (!this.mField.equals(gF2nPolynomialElement.mField)) {
            throw new java.lang.RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI.multiply(gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI);
            getHighSpeedVideoFpsRanges();
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public org.bouncycastle.pqc.math.linearalgebra.GFElement multiply(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.multiplyThisBy(gFElement);
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isZero() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isZero();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean isOne() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isOne();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement invertSquare() throws java.lang.ArithmeticException {
        if (isZero()) {
            throw new java.lang.ArithmeticException();
        }
        int degree = this.mField.getDegree() - 1;
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI.expandN((this.mDegree << 1) + 32);
        gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI.reduceN();
        int i = 1;
        for (int floorLog = org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.floorLog(degree) - 1; floorLog >= 0; floorLog--) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(gF2nPolynomialElement);
            for (int i2 = 1; i2 <= i; i2++) {
                gF2nPolynomialElement2.squareThisPreCalc();
            }
            gF2nPolynomialElement.multiplyThisBy(gF2nPolynomialElement2);
            i <<= 1;
            if ((getHighSpeedVideoFpsRangesFor[floorLog] & degree) != 0) {
                gF2nPolynomialElement.squareThisPreCalc();
                gF2nPolynomialElement.multiplyThisBy(this);
                i++;
            }
        }
        gF2nPolynomialElement.squareThisPreCalc();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public org.bouncycastle.pqc.math.linearalgebra.GFElement invert() throws java.lang.ArithmeticException {
        return invertMAIA();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public void increaseThis() {
        this.getHighResolutionOutputSizeshNQ4ISI.increaseThis();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    public org.bouncycastle.pqc.math.linearalgebra.GF2nElement increase() {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.increaseThis();
        return gF2nPolynomialElement;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public int hashCode() {
        return this.mField.hashCode() + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement) obj;
        if (this.mField == gF2nPolynomialElement.mField || this.mField.getFieldPolynomial().equals(gF2nPolynomialElement.mField.getFieldPolynomial())) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.math.linearalgebra.GFElement
    public java.lang.Object clone() {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nElement
    final void Camera2StreamConfigurationMap() {
        this.getHighResolutionOutputSizeshNQ4ISI.assignZero();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public void addToThis(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        if (!(gFElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement)) {
            throw new java.lang.RuntimeException();
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement) gFElement;
        if (!this.mField.equals(gF2nPolynomialElement.mField)) {
            throw new java.lang.RuntimeException();
        }
        this.getHighResolutionOutputSizeshNQ4ISI.addToThis(gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GFElement
    public org.bouncycastle.pqc.math.linearalgebra.GFElement add(org.bouncycastle.pqc.math.linearalgebra.GFElement gFElement) throws java.lang.RuntimeException {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this);
        gF2nPolynomialElement.addToThis(gFElement);
        return gF2nPolynomialElement;
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement ZERO(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField gF2nPolynomialField) {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(gF2nPolynomialField, new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(gF2nPolynomialField.getDegree()));
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement ONE(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField gF2nPolynomialField) {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(gF2nPolynomialField, new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(gF2nPolynomialField.getDegree(), new int[]{1}));
    }

    public GF2nPolynomialElement(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField gF2nPolynomialField, int[] iArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = this.mField.getDegree();
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree, iArr);
        this.getHighResolutionOutputSizeshNQ4ISI = gF2Polynomial;
        gF2Polynomial.expandN(gF2nPolynomialField.mDegree);
    }

    public GF2nPolynomialElement(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField gF2nPolynomialField, byte[] bArr) {
        this.mField = gF2nPolynomialField;
        this.mDegree = this.mField.getDegree();
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree, bArr);
        this.getHighResolutionOutputSizeshNQ4ISI = gF2Polynomial;
        gF2Polynomial.expandN(this.mDegree);
    }

    public GF2nPolynomialElement(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField gF2nPolynomialField, org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial) {
        this.mField = gF2nPolynomialField;
        this.mDegree = this.mField.getDegree();
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(gF2Polynomial);
        this.getHighResolutionOutputSizeshNQ4ISI = gF2Polynomial2;
        gF2Polynomial2.expandN(this.mDegree);
    }

    public GF2nPolynomialElement(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement) {
        this.mField = gF2nPolynomialElement.mField;
        this.mDegree = gF2nPolynomialElement.mDegree;
        this.getHighResolutionOutputSizeshNQ4ISI = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(gF2nPolynomialElement.getHighResolutionOutputSizeshNQ4ISI);
    }
}
