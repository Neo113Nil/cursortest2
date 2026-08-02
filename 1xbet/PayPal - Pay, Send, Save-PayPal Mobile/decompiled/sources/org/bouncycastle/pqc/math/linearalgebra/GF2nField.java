package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public abstract class GF2nField {
    protected org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial fieldPolynomial;
    protected java.util.Vector fields;
    protected int mDegree;
    protected java.util.Vector matrices;
    protected final java.security.SecureRandom random;

    protected abstract void computeCOBMatrix(org.bouncycastle.pqc.math.linearalgebra.GF2nField gF2nField);

    protected abstract void computeFieldPolynomial();

    protected abstract org.bouncycastle.pqc.math.linearalgebra.GF2nElement getRandomRoot(org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial);

    protected final org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] invertMatrix(org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr) {
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[gF2PolynomialArr.length];
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr3 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[gF2PolynomialArr.length];
        int i = 0;
        for (int i2 = 0; i2 < this.mDegree; i2++) {
            gF2PolynomialArr2[i2] = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(gF2PolynomialArr[i2]);
            org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree);
            gF2PolynomialArr3[i2] = gF2Polynomial;
            gF2Polynomial.setBit((this.mDegree - 1) - i2);
        }
        while (true) {
            int i3 = this.mDegree - 1;
            if (i >= i3) {
                while (i3 > 0) {
                    for (int i4 = i3 - 1; i4 >= 0; i4--) {
                        if (gF2PolynomialArr2[i4].testBit((this.mDegree - 1) - i3)) {
                            gF2PolynomialArr2[i4].addToThis(gF2PolynomialArr2[i3]);
                            gF2PolynomialArr3[i4].addToThis(gF2PolynomialArr3[i3]);
                        }
                    }
                    i3--;
                }
                return gF2PolynomialArr3;
            }
            int i5 = i;
            while (true) {
                int i6 = this.mDegree;
                if (i5 >= i6 || gF2PolynomialArr2[i5].testBit((i6 - 1) - i)) {
                    break;
                }
                i5++;
            }
            if (i5 >= this.mDegree) {
                throw new java.lang.RuntimeException("GF2nField.invertMatrix: Matrix cannot be inverted!");
            }
            if (i != i5) {
                org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial2 = gF2PolynomialArr2[i];
                gF2PolynomialArr2[i] = gF2PolynomialArr2[i5];
                gF2PolynomialArr2[i5] = gF2Polynomial2;
                org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial3 = gF2PolynomialArr3[i];
                gF2PolynomialArr3[i] = gF2PolynomialArr3[i5];
                gF2PolynomialArr3[i5] = gF2Polynomial3;
            }
            int i7 = i + 1;
            int i8 = i7;
            while (true) {
                int i9 = this.mDegree;
                if (i8 < i9) {
                    if (gF2PolynomialArr2[i8].testBit((i9 - 1) - i)) {
                        gF2PolynomialArr2[i8].addToThis(gF2PolynomialArr2[i]);
                        gF2PolynomialArr3[i8].addToThis(gF2PolynomialArr3[i]);
                    }
                    i8++;
                }
            }
            i = i7;
        }
    }

    public int hashCode() {
        return this.mDegree + this.fieldPolynomial.hashCode();
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial getFieldPolynomial() {
        if (this.fieldPolynomial == null) {
            computeFieldPolynomial();
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.fieldPolynomial);
    }

    public final int getDegree() {
        return this.mDegree;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nField)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nField gF2nField = (org.bouncycastle.pqc.math.linearalgebra.GF2nField) obj;
        if (gF2nField.mDegree != this.mDegree || !this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return false;
        }
        if (!(this instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) || (gF2nField instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField)) {
            return !(this instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) || (gF2nField instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBField);
        }
        return false;
    }

    public final org.bouncycastle.pqc.math.linearalgebra.GF2nElement convert(org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement, org.bouncycastle.pqc.math.linearalgebra.GF2nField gF2nField) throws java.lang.RuntimeException {
        if (gF2nField == this || this.fieldPolynomial.equals(gF2nField.fieldPolynomial)) {
            return (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nElement.clone();
        }
        if (this.mDegree != gF2nField.mDegree) {
            throw new java.lang.RuntimeException("GF2nField.convert: B1 has a different degree and thus cannot be coverted to!");
        }
        int indexOf = this.fields.indexOf(gF2nField);
        if (indexOf == -1) {
            computeCOBMatrix(gF2nField);
            indexOf = this.fields.indexOf(gF2nField);
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[] gF2PolynomialArr = (org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial[]) this.matrices.elementAt(indexOf);
        org.bouncycastle.pqc.math.linearalgebra.GF2nElement gF2nElement2 = (org.bouncycastle.pqc.math.linearalgebra.GF2nElement) gF2nElement.clone();
        if (gF2nElement2 instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) {
            ((org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement) gF2nElement2).getHighSpeedVideoFpsRangesFor();
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree, gF2nElement2.toFlexiBigInt());
        gF2Polynomial.expandN(this.mDegree);
        org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial gF2Polynomial2 = new org.bouncycastle.pqc.math.linearalgebra.GF2Polynomial(this.mDegree);
        for (int i = 0; i < this.mDegree; i++) {
            if (gF2Polynomial.vectorMult(gF2PolynomialArr[i])) {
                gF2Polynomial2.setBit((this.mDegree - 1) - i);
            }
        }
        if (gF2nField instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) {
            return new org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialElement((org.bouncycastle.pqc.math.linearalgebra.GF2nPolynomialField) gF2nField, gF2Polynomial2);
        }
        if (!(gF2nField instanceof org.bouncycastle.pqc.math.linearalgebra.GF2nONBField)) {
            throw new java.lang.RuntimeException("GF2nField.convert: B1 must be an instance of GF2nPolynomialField or GF2nONBField!");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement gF2nONBElement = new org.bouncycastle.pqc.math.linearalgebra.GF2nONBElement((org.bouncycastle.pqc.math.linearalgebra.GF2nONBField) gF2nField, gF2Polynomial2.toFlexiBigInt());
        gF2nONBElement.getHighSpeedVideoFpsRangesFor();
        return gF2nONBElement;
    }

    protected GF2nField(java.security.SecureRandom secureRandom) {
        this.random = secureRandom;
    }
}
