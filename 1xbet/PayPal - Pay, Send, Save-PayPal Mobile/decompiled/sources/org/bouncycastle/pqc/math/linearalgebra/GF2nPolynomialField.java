package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2nPolynomialField extends org.bouncycastle.pqc.math.linearalgebra.GF2nField {
    private boolean Camera2StreamConfigurationMap;
    private int[] getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    public boolean isTrinomial() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isPentanomial() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public int getTc() throws java.lang.RuntimeException {
        if (this.Camera2StreamConfigurationMap) {
            return this.getHighSpeedVideoSizes;
        }
        throw new java.lang.RuntimeException();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial getSquaringVector(int i) {
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.getHighSpeedVideoFpsRangesFor[i]);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected org.bouncycastle.pqc.math.linearalgebra.GF2nElement getRandomRoot(org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial) {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gcd;
        int degree;
        int degree2;
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(gF2Polynomial, this);
        while (gF2nPolynomial.getDegree() > 1) {
            while (true) {
                org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement gF2nPolynomialElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement(this, this.random);
                org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(2, org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement.ZERO(this));
                gF2nPolynomial2.set(1, gF2nPolynomialElement);
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

    public int[] getPc() throws java.lang.RuntimeException {
        if (!this.getHighSpeedVideoFpsRanges) {
            throw new java.lang.RuntimeException();
        }
        int[] iArr = new int[3];
        java.lang.System.arraycopy(this.getHighResolutionOutputSizeshNQ4ISI, 0, iArr, 0, 3);
        return iArr;
    }

    protected void computeFieldPolynomial2() {
        if (getHighSpeedVideoFpsRangesFor() || getHighSpeedVideoSizes()) {
            return;
        }
        Camera2StreamConfigurationMap();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected void computeFieldPolynomial() {
        if (getHighSpeedVideoFpsRangesFor() || getHighSpeedVideoSizes()) {
            return;
        }
        Camera2StreamConfigurationMap();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.GF2nField
    protected void computeCOBMatrix(org.bouncycastle.pqc.math.linearalgebra.GF2nField gF2nField) {
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement randomRoot;
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement[] gF2nElementArr;
        if (this.mDegree != gF2nField.mDegree) {
            throw new java.lang.IllegalArgumentException("GF2nPolynomialField.computeCOBMatrix: B1 has a different degree and thus cannot be coverted to!");
        }
        boolean z = gF2nField instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBField;
        if (z) {
            gF2nField.computeCOBMatrix(this);
            return;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[this.mDegree];
        for (int i = 0; i < this.mDegree; i++) {
            gF2PolynomialArr[i] = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree);
        }
        do {
            randomRoot = gF2nField.getRandomRoot(this.fieldPolynomial);
        } while (randomRoot.isZero());
        if (randomRoot instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) {
            gF2nElementArr = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement[this.mDegree];
            gF2nElementArr[this.mDegree - 1] = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.ONE((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) gF2nField);
        } else {
            gF2nElementArr = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement[this.mDegree];
            gF2nElementArr[this.mDegree - 1] = org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement.ONE((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) gF2nField);
        }
        gF2nElementArr[this.mDegree - 2] = randomRoot;
        for (int i2 = this.mDegree - 3; i2 >= 0; i2--) {
            gF2nElementArr[i2] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nElementArr[i2 + 1].multiply(randomRoot);
        }
        if (z) {
            for (int i3 = 0; i3 < this.mDegree; i3++) {
                for (int i4 = 0; i4 < this.mDegree; i4++) {
                    if (gF2nElementArr[i3].getHighSpeedVideoFpsRangesFor((this.mDegree - i4) - 1)) {
                        gF2PolynomialArr[(this.mDegree - i4) - 1].setBit((this.mDegree - i3) - 1);
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.mDegree; i5++) {
                for (int i6 = 0; i6 < this.mDegree; i6++) {
                    if (gF2nElementArr[i5].getHighSpeedVideoFpsRangesFor(i6)) {
                        gF2PolynomialArr[(this.mDegree - i6) - 1].setBit((this.mDegree - i5) - 1);
                    }
                }
            }
        }
        this.fields.addElement(gF2nField);
        this.matrices.addElement(gF2PolynomialArr);
        gF2nField.fields.addElement(this);
        gF2nField.matrices.addElement(invertMatrix(gF2PolynomialArr));
    }

    private boolean getHighSpeedVideoFpsRangesFor() {
        this.fieldPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 1);
        boolean z = false;
        this.fieldPolynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        for (int i = 1; i < this.mDegree && !z; i++) {
            this.fieldPolynomial.setBit(i);
            boolean isIrreducible = this.fieldPolynomial.isIrreducible();
            if (isIrreducible) {
                this.Camera2StreamConfigurationMap = true;
                this.getHighSpeedVideoSizes = i;
                return isIrreducible;
            }
            this.fieldPolynomial.resetBit(i);
            z = this.fieldPolynomial.isIrreducible();
        }
        return z;
    }

    private boolean Camera2StreamConfigurationMap() {
        this.fieldPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 1);
        do {
            this.fieldPolynomial.randomize();
            this.fieldPolynomial.setBit(this.mDegree);
            this.fieldPolynomial.setBit(0);
        } while (!this.fieldPolynomial.isIrreducible());
        return true;
    }

    private boolean getHighSpeedVideoSizes() {
        this.fieldPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree + 1);
        this.fieldPolynomial.setBit(0);
        this.fieldPolynomial.setBit(this.mDegree);
        boolean z = false;
        int i = 1;
        while (i <= this.mDegree - 3 && !z) {
            this.fieldPolynomial.setBit(i);
            int i2 = i + 1;
            int i3 = i2;
            while (i3 <= this.mDegree - 2 && !z) {
                this.fieldPolynomial.setBit(i3);
                int i4 = i3 + 1;
                for (int i5 = i4; i5 <= this.mDegree - 1 && !z; i5++) {
                    this.fieldPolynomial.setBit(i5);
                    if (((((this.mDegree & 1) != 0) | ((i & 1) != 0) | ((i3 & 1) != 0)) || ((i5 & 1) != 0)) && (z = this.fieldPolynomial.isIrreducible())) {
                        this.getHighSpeedVideoFpsRanges = true;
                        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
                        iArr[0] = i;
                        iArr[1] = i3;
                        iArr[2] = i5;
                        return z;
                    }
                    this.fieldPolynomial.resetBit(i5);
                }
                this.fieldPolynomial.resetBit(i3);
                i3 = i4;
            }
            this.fieldPolynomial.resetBit(i);
            i = i2;
        }
        return z;
    }

    private void getHighResolutionOutputSizeshNQ4ISI() {
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[this.mDegree - 1];
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[this.mDegree];
        int i = 0;
        while (true) {
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr2 = this.getHighSpeedVideoFpsRangesFor;
            if (i >= gF2PolynomialArr2.length) {
                break;
            }
            gF2PolynomialArr2[i] = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree, "ZERO");
            i++;
        }
        for (int i2 = 0; i2 < this.mDegree - 1; i2++) {
            gF2PolynomialArr[i2] = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(1, "ONE").shiftLeft(this.mDegree + i2).remainder(this.fieldPolynomial);
        }
        for (int i3 = 1; i3 <= java.lang.Math.abs(this.mDegree >> 1); i3++) {
            for (int i4 = 1; i4 <= this.mDegree; i4++) {
                if (gF2PolynomialArr[this.mDegree - (i3 << 1)].testBit(this.mDegree - i4)) {
                    this.getHighSpeedVideoFpsRangesFor[i4 - 1].setBit(this.mDegree - i3);
                }
            }
        }
        for (int abs = java.lang.Math.abs(this.mDegree >> 1) + 1; abs <= this.mDegree; abs++) {
            this.getHighSpeedVideoFpsRangesFor[((abs << 1) - this.mDegree) - 1].setBit(this.mDegree - abs);
        }
    }

    public GF2nPolynomialField(int i, java.security.SecureRandom secureRandom, boolean z) {
        super(secureRandom);
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighResolutionOutputSizeshNQ4ISI = new int[3];
        if (i < 3) {
            throw new java.lang.IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i;
        if (z) {
            computeFieldPolynomial();
        } else {
            computeFieldPolynomial2();
        }
        getHighResolutionOutputSizeshNQ4ISI();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i, java.security.SecureRandom secureRandom, org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial) throws java.lang.RuntimeException {
        super(secureRandom);
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighResolutionOutputSizeshNQ4ISI = new int[3];
        if (i < 3) {
            throw new java.lang.IllegalArgumentException("degree must be at least 3");
        }
        if (gF2Polynomial.getLength() != i + 1) {
            throw new java.lang.RuntimeException();
        }
        if (!gF2Polynomial.isIrreducible()) {
            throw new java.lang.RuntimeException();
        }
        this.mDegree = i;
        this.fieldPolynomial = gF2Polynomial;
        getHighResolutionOutputSizeshNQ4ISI();
        int i2 = 2;
        for (int i3 = 1; i3 < this.fieldPolynomial.getLength() - 1; i3++) {
            if (this.fieldPolynomial.testBit(i3)) {
                int i4 = i2 + 1;
                if (i4 == 3) {
                    this.getHighSpeedVideoSizes = i3;
                }
                if (i4 <= 5) {
                    this.getHighResolutionOutputSizeshNQ4ISI[i2 - 2] = i3;
                }
                i2 = i4;
            }
        }
        if (i2 == 3) {
            this.Camera2StreamConfigurationMap = true;
        }
        if (i2 == 5) {
            this.getHighSpeedVideoFpsRanges = true;
        }
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }

    public GF2nPolynomialField(int i, java.security.SecureRandom secureRandom) {
        super(secureRandom);
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighResolutionOutputSizeshNQ4ISI = new int[3];
        if (i < 3) {
            throw new java.lang.IllegalArgumentException("k must be at least 3");
        }
        this.mDegree = i;
        computeFieldPolynomial();
        getHighResolutionOutputSizeshNQ4ISI();
        this.fields = new java.util.Vector();
        this.matrices = new java.util.Vector();
    }
}
