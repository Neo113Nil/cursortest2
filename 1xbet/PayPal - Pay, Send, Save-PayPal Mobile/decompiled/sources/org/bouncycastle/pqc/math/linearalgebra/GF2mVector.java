package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2mVector extends org.bouncycastle.pqc.math.linearalgebra.Vector {
    private org.bouncycastle.pqc.math.linearalgebra.GF2mField getHighSpeedVideoFpsRangesFor;
    private int[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < this.getHighSpeedVideoSizes.length; i++) {
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor.getDegree(); i2++) {
                stringBuffer.append(((1 << (i2 & 31)) & this.getHighSpeedVideoSizes[i]) != 0 ? '1' : com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
            }
            stringBuffer.append(' ');
        }
        return stringBuffer.toString();
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public org.bouncycastle.pqc.math.linearalgebra.Vector multiply(org.bouncycastle.pqc.math.linearalgebra.Permutation permutation) {
        int[] vector = permutation.getVector();
        if (this.length != vector.length) {
            throw new java.lang.ArithmeticException("permutation size and vector size mismatch");
        }
        int[] iArr = new int[this.length];
        for (int i = 0; i < vector.length; i++) {
            iArr[i] = this.getHighSpeedVideoSizes[vector[i]];
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2mVector(this.getHighSpeedVideoFpsRangesFor, iArr);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean isZero() {
        for (int length = this.getHighSpeedVideoSizes.length - 1; length >= 0; length--) {
            if (this.getHighSpeedVideoSizes[length] != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public int hashCode() {
        return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes);
    }

    public int[] getIntArrayForm() {
        return org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(this.getHighSpeedVideoSizes);
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mField getField() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        int i = 8;
        int i2 = 1;
        while (this.getHighSpeedVideoFpsRangesFor.getDegree() > i) {
            i2++;
            i += 8;
        }
        byte[] bArr = new byte[this.getHighSpeedVideoSizes.length * i2];
        int i3 = 0;
        for (int i4 = 0; i4 < this.getHighSpeedVideoSizes.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                bArr[i3] = (byte) (this.getHighSpeedVideoSizes[i4] >>> i5);
                i5 += 8;
                i3++;
            }
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2mVector)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2mVector gF2mVector = (org.bouncycastle.pqc.math.linearalgebra.GF2mVector) obj;
        if (this.getHighSpeedVideoFpsRangesFor.equals(gF2mVector.getHighSpeedVideoFpsRangesFor)) {
            return org.bouncycastle.pqc.math.linearalgebra.IntUtils.equals(this.getHighSpeedVideoSizes, gF2mVector.getHighSpeedVideoSizes);
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public org.bouncycastle.pqc.math.linearalgebra.Vector add(org.bouncycastle.pqc.math.linearalgebra.Vector vector) {
        throw new java.lang.RuntimeException("not implemented");
    }

    public GF2mVector(org.bouncycastle.pqc.math.linearalgebra.GF2mVector gF2mVector) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.math.linearalgebra.GF2mField(gF2mVector.getHighSpeedVideoFpsRangesFor);
        this.length = gF2mVector.length;
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(gF2mVector.getHighSpeedVideoSizes);
    }

    public GF2mVector(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, int[] iArr) {
        this.getHighSpeedVideoFpsRangesFor = gF2mField;
        this.length = iArr.length;
        for (int length = iArr.length - 1; length >= 0; length--) {
            if (!gF2mField.isElementOfThisField(iArr[length])) {
                throw new java.lang.ArithmeticException("Element array is not specified over the given finite field.");
            }
        }
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(iArr);
    }

    public GF2mVector(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField, byte[] bArr) {
        this.getHighSpeedVideoFpsRangesFor = new org.bouncycastle.pqc.math.linearalgebra.GF2mField(gF2mField);
        int i = 8;
        int i2 = 1;
        while (gF2mField.getDegree() > i) {
            i2++;
            i += 8;
        }
        if (bArr.length % i2 != 0) {
            throw new java.lang.IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
        }
        this.length = bArr.length / i2;
        this.getHighSpeedVideoSizes = new int[this.length];
        int i3 = 0;
        for (int i4 = 0; i4 < this.getHighSpeedVideoSizes.length; i4++) {
            int i5 = 0;
            while (i5 < i) {
                int[] iArr = this.getHighSpeedVideoSizes;
                iArr[i4] = iArr[i4] | ((bArr[i3] & 255) << i5);
                i5 += 8;
                i3++;
            }
            if (!gF2mField.isElementOfThisField(this.getHighSpeedVideoSizes[i4])) {
                throw new java.lang.IllegalArgumentException("Byte array is not an encoded vector over the given finite field.");
            }
        }
    }
}
