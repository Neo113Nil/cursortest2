package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2nPolynomial {
    private org.bouncycastle.pqc.math.linearalgebra.GF2nElement[] Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRangesFor;

    public final int size() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final void shrink() {
        int i = this.getHighSpeedVideoFpsRangesFor;
        do {
            i--;
            if (!this.Camera2StreamConfigurationMap[i].isZero()) {
                break;
            }
        } while (i > 0);
        int i2 = i + 1;
        if (i2 < this.getHighSpeedVideoFpsRangesFor) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nElement[] gF2nElementArr = new org.bouncycastle.pqc.math.linearalgebra.GF2nElement[i2];
            java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, gF2nElementArr, 0, i2);
            this.Camera2StreamConfigurationMap = gF2nElementArr;
            this.getHighSpeedVideoFpsRangesFor = i2;
        }
    }

    public final void shiftThisLeft(int i) {
        if (i <= 0) {
            return;
        }
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        org.bouncycastle.pqc.math.linearalgebra.GF2nField field = this.Camera2StreamConfigurationMap[0].getField();
        enlarge(this.getHighSpeedVideoFpsRangesFor + i);
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            org.bouncycastle.pqc.math.linearalgebra.GF2nElement[] gF2nElementArr = this.Camera2StreamConfigurationMap;
            gF2nElementArr[i2 + i] = gF2nElementArr[i2];
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement = this.Camera2StreamConfigurationMap[0];
        if (gF2nElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement) {
            while (true) {
                i--;
                if (i < 0) {
                    return;
                } else {
                    this.Camera2StreamConfigurationMap[i] = org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement.ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) field);
                }
            }
        } else {
            if (!(gF2nElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement)) {
                return;
            }
            while (true) {
                i--;
                if (i < 0) {
                    return;
                } else {
                    this.Camera2StreamConfigurationMap[i] = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) field);
                }
            }
        }
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial shiftLeft(int i) {
        if (i <= 0) {
            return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(this);
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(this.getHighSpeedVideoFpsRangesFor + i, this.Camera2StreamConfigurationMap[0]);
        gF2nPolynomial.assignZeroToElements();
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor; i2++) {
            gF2nPolynomial.Camera2StreamConfigurationMap[i2 + i] = this.Camera2StreamConfigurationMap[i2];
        }
        return gF2nPolynomial;
    }

    public final void set(int i, org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement) {
        if (!(gF2nElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement) && !(gF2nElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement)) {
            throw new java.lang.IllegalArgumentException("PolynomialGF2n.set f must be an instance of either GF2nPolynomialElement or GF2nONBElement!");
        }
        this.Camera2StreamConfigurationMap[i] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nElement.clone();
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial scalarMultiply(org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement) {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(size());
        for (int i = 0; i < size(); i++) {
            gF2nPolynomial.Camera2StreamConfigurationMap[i] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) this.Camera2StreamConfigurationMap[i].multiply(gF2nElement);
        }
        return gF2nPolynomial;
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial remainder(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) throws java.lang.RuntimeException, java.lang.ArithmeticException {
        return divide(gF2nPolynomial)[1];
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial reduce(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) throws java.lang.RuntimeException, java.lang.ArithmeticException {
        return remainder(gF2nPolynomial);
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial quotient(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) throws java.lang.RuntimeException, java.lang.ArithmeticException {
        return divide(gF2nPolynomial)[0];
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial multiplyAndReduce(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial, org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial2) {
        return multiply(gF2nPolynomial).reduce(gF2nPolynomial2);
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial multiply(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) {
        if (size() != gF2nPolynomial.size()) {
            throw new java.lang.IllegalArgumentException("PolynomialGF2n.multiply: this and b must have the same size!");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial((r0 << 1) - 1);
        for (int i = 0; i < size(); i++) {
            for (int i2 = 0; i2 < gF2nPolynomial.size(); i2++) {
                org.bouncycastle.pqc.math.linearalgebra.GF2nElement[] gF2nElementArr = gF2nPolynomial2.Camera2StreamConfigurationMap;
                int i3 = i + i2;
                org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement = gF2nElementArr[i3];
                if (gF2nElement == null) {
                    gF2nElementArr[i3] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) this.Camera2StreamConfigurationMap[i].multiply(gF2nPolynomial.Camera2StreamConfigurationMap[i2]);
                } else {
                    gF2nElementArr[i3] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nElement.add(this.Camera2StreamConfigurationMap[i].multiply(gF2nPolynomial.Camera2StreamConfigurationMap[i2]));
                }
            }
        }
        return gF2nPolynomial2;
    }

    public final boolean isZero() {
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor; i++) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement = this.Camera2StreamConfigurationMap[i];
            if (gF2nElement != null && !gF2nElement.isZero()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return getDegree() + this.Camera2StreamConfigurationMap.hashCode();
    }

    public final int getDegree() {
        for (int i = this.getHighSpeedVideoFpsRangesFor - 1; i >= 0; i--) {
            if (!this.Camera2StreamConfigurationMap[i].isZero()) {
                return i;
            }
        }
        return -1;
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gcd(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(this);
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial3 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(gF2nPolynomial);
        gF2nPolynomial2.shrink();
        gF2nPolynomial3.shrink();
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial4 = gF2nPolynomial2;
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial5 = gF2nPolynomial3;
        while (!gF2nPolynomial5.isZero()) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial6 = gF2nPolynomial5;
            gF2nPolynomial5 = gF2nPolynomial4.remainder(gF2nPolynomial5);
            gF2nPolynomial4 = gF2nPolynomial6;
        }
        return gF2nPolynomial4.scalarMultiply((org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nPolynomial4.Camera2StreamConfigurationMap[gF2nPolynomial4.getDegree()].invert());
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial = (org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial) obj;
        if (getDegree() != gF2nPolynomial.getDegree()) {
            return false;
        }
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor; i++) {
            if (!this.Camera2StreamConfigurationMap[i].equals(gF2nPolynomial.Camera2StreamConfigurationMap[i])) {
                return false;
            }
        }
        return true;
    }

    public final void enlarge(int i) {
        int i2 = this.getHighSpeedVideoFpsRangesFor;
        if (i <= i2) {
            return;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement[] gF2nElementArr = new org.bouncycastle.pqc.math.linearalgebra.GF2nElement[i];
        java.lang.System.arraycopy(this.Camera2StreamConfigurationMap, 0, gF2nElementArr, 0, i2);
        org.bouncycastle.pqc.math.linearalgebra.GF2nField field = this.Camera2StreamConfigurationMap[0].getField();
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement = this.Camera2StreamConfigurationMap[0];
        if (gF2nElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement) {
            for (int i3 = this.getHighSpeedVideoFpsRangesFor; i3 < i; i3++) {
                gF2nElementArr[i3] = org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement.ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) field);
            }
        } else if (gF2nElement instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) {
            for (int i4 = this.getHighSpeedVideoFpsRangesFor; i4 < i; i4++) {
                gF2nElementArr[i4] = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) field);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = gF2nElementArr;
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial[] divide(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) {
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial2;
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial[] gF2nPolynomialArr = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial[2];
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial3 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(this);
        gF2nPolynomial3.shrink();
        int degree = gF2nPolynomial.getDegree();
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nPolynomial.Camera2StreamConfigurationMap[degree].invert();
        if (gF2nPolynomial3.getDegree() < degree) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial4 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(this);
            gF2nPolynomialArr[0] = gF2nPolynomial4;
            gF2nPolynomial4.assignZeroToElements();
            gF2nPolynomialArr[0].shrink();
            gF2nPolynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(this);
            gF2nPolynomialArr[1] = gF2nPolynomial2;
        } else {
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial5 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(this);
            gF2nPolynomialArr[0] = gF2nPolynomial5;
            gF2nPolynomial5.assignZeroToElements();
            while (true) {
                int degree2 = gF2nPolynomial3.getDegree() - degree;
                if (degree2 < 0) {
                    break;
                }
                org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement2 = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nPolynomial3.Camera2StreamConfigurationMap[gF2nPolynomial3.getDegree()].multiply(gF2nElement);
                org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial scalarMultiply = gF2nPolynomial.scalarMultiply(gF2nElement2);
                scalarMultiply.shiftThisLeft(degree2);
                gF2nPolynomial3 = gF2nPolynomial3.add(scalarMultiply);
                gF2nPolynomial3.shrink();
                gF2nPolynomialArr[0].Camera2StreamConfigurationMap[degree2] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nElement2.clone();
            }
            gF2nPolynomialArr[1] = gF2nPolynomial3;
            gF2nPolynomial2 = gF2nPolynomialArr[0];
        }
        gF2nPolynomial2.shrink();
        return gF2nPolynomialArr;
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nElement at(int i) {
        return this.Camera2StreamConfigurationMap[i];
    }

    public final void assignZeroToElements() {
        for (int i = 0; i < this.getHighSpeedVideoFpsRangesFor; i++) {
            this.Camera2StreamConfigurationMap[i].Camera2StreamConfigurationMap();
        }
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial add(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) {
        int i = 0;
        if (size() >= gF2nPolynomial.size()) {
            org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(size());
            while (i < gF2nPolynomial.size()) {
                gF2nPolynomial2.Camera2StreamConfigurationMap[i] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) this.Camera2StreamConfigurationMap[i].add(gF2nPolynomial.Camera2StreamConfigurationMap[i]);
                i++;
            }
            while (i < size()) {
                gF2nPolynomial2.Camera2StreamConfigurationMap[i] = this.Camera2StreamConfigurationMap[i];
                i++;
            }
            return gF2nPolynomial2;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial3 = new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial(gF2nPolynomial.size());
        while (i < size()) {
            gF2nPolynomial3.Camera2StreamConfigurationMap[i] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) this.Camera2StreamConfigurationMap[i].add(gF2nPolynomial.Camera2StreamConfigurationMap[i]);
            i++;
        }
        while (i < gF2nPolynomial.size()) {
            gF2nPolynomial3.Camera2StreamConfigurationMap[i] = gF2nPolynomial.Camera2StreamConfigurationMap[i];
            i++;
        }
        return gF2nPolynomial3;
    }

    public GF2nPolynomial(org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomial gF2nPolynomial) {
        int i = gF2nPolynomial.getHighSpeedVideoFpsRangesFor;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.math.linearalgebra.GF2nElement[i];
        this.getHighSpeedVideoFpsRangesFor = i;
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor; i2++) {
            this.Camera2StreamConfigurationMap[i2] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nPolynomial.Camera2StreamConfigurationMap[i2].clone();
        }
    }

    public GF2nPolynomial(org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial, org.bouncycastle.pqc.math.linearalgebra.GF2nField gF2nField) {
        int degree = gF2nField.getDegree() + 1;
        this.getHighSpeedVideoFpsRangesFor = degree;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.math.linearalgebra.GF2nElement[degree];
        int i = 0;
        if (gF2nField instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) {
            while (i < this.getHighSpeedVideoFpsRangesFor) {
                if (gF2Polynomial.testBit(i)) {
                    this.Camera2StreamConfigurationMap[i] = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.ONE((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) gF2nField);
                } else {
                    this.Camera2StreamConfigurationMap[i] = org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement.ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) gF2nField);
                }
                i++;
            }
            return;
        }
        if (!(gF2nField instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField)) {
            throw new java.lang.IllegalArgumentException("PolynomialGF2n(Bitstring, GF2nField): B1 must be an instance of GF2nONBField or GF2nPolynomialField!");
        }
        while (i < this.getHighSpeedVideoFpsRangesFor) {
            if (gF2Polynomial.testBit(i)) {
                this.Camera2StreamConfigurationMap[i] = org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement.ONE((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) gF2nField);
            } else {
                this.Camera2StreamConfigurationMap[i] = org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement.ZERO((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) gF2nField);
            }
            i++;
        }
    }

    public GF2nPolynomial(int i, org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.math.linearalgebra.GF2nElement[i];
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor; i2++) {
            this.Camera2StreamConfigurationMap[i2] = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nElement.clone();
        }
    }

    private GF2nPolynomial(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.Camera2StreamConfigurationMap = new org.bouncycastle.pqc.math.linearalgebra.GF2nElement[i];
    }
}
