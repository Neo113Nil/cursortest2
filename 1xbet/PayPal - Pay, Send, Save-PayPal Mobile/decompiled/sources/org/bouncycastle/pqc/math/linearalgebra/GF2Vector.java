package org.bouncycastle.pqc.math.linearalgebra;

/* loaded from: classes17.dex */
public class GF2Vector extends org.bouncycastle.pqc.math.linearalgebra.Vector {
    private int[] getHighSpeedVideoSizes;

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i = 0; i < this.length; i++) {
            if (i != 0 && (i & 31) == 0) {
                stringBuffer.append(' ');
            }
            stringBuffer.append((this.getHighSpeedVideoSizes[i >> 5] & (1 << (i & 31))) == 0 ? com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask : '1');
        }
        return stringBuffer.toString();
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2mVector toExtensionFieldVector(org.bouncycastle.pqc.math.linearalgebra.GF2mField gF2mField) {
        int degree = gF2mField.getDegree();
        if (this.length % degree != 0) {
            throw new java.lang.ArithmeticException("conversion is impossible");
        }
        int i = this.length / degree;
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = i - 1; i3 >= 0; i3--) {
            for (int degree2 = gF2mField.getDegree() - 1; degree2 >= 0; degree2--) {
                if (((this.getHighSpeedVideoSizes[i2 >>> 5] >>> (i2 & 31)) & 1) == 1) {
                    iArr[i3] = iArr[i3] ^ (1 << degree2);
                }
                i2++;
            }
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2mVector(gF2mField, iArr);
    }

    public void setBit(int i) {
        if (i >= this.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int[] iArr = this.getHighSpeedVideoSizes;
        int i2 = i >> 5;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public org.bouncycastle.pqc.math.linearalgebra.Vector multiply(org.bouncycastle.pqc.math.linearalgebra.Permutation permutation) {
        int[] vector = permutation.getVector();
        if (this.length != vector.length) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(this.length);
        for (int i = 0; i < vector.length; i++) {
            int[] iArr = this.getHighSpeedVideoSizes;
            int i2 = vector[i];
            if ((iArr[i2 >> 5] & (1 << (i2 & 31))) != 0) {
                int[] iArr2 = gF2Vector.getHighSpeedVideoSizes;
                int i3 = i >> 5;
                iArr2[i3] = (1 << (i & 31)) | iArr2[i3];
            }
        }
        return gF2Vector;
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
        return (this.length * 31) + org.bouncycastle.util.Arrays.hashCode(this.getHighSpeedVideoSizes);
    }

    public int[] getVecArray() {
        return this.getHighSpeedVideoSizes;
    }

    public int getHammingWeight() {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.getHighSpeedVideoSizes;
            if (i >= iArr.length) {
                return i2;
            }
            int i3 = iArr[i];
            for (int i4 = 0; i4 < 32; i4++) {
                if ((i3 & 1) != 0) {
                    i2++;
                }
                i3 >>>= 1;
            }
            i++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public byte[] getEncoded() {
        return org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.toByteArray(this.getHighSpeedVideoSizes, (this.length + 7) >> 3);
    }

    public int getBit(int i) {
        if (i >= this.length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        int i2 = i & 31;
        return (this.getHighSpeedVideoSizes[i >> 5] & (1 << i2)) >>> i2;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Vector extractVector(int[] iArr) {
        int length = iArr.length;
        if (iArr[length - 1] > this.length) {
            throw new java.lang.ArithmeticException("invalid index set");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(length);
        for (int i = 0; i < length; i++) {
            int[] iArr2 = this.getHighSpeedVideoSizes;
            int i2 = iArr[i];
            if ((iArr2[i2 >> 5] & (1 << (i2 & 31))) != 0) {
                int[] iArr3 = gF2Vector.getHighSpeedVideoSizes;
                int i3 = i >> 5;
                iArr3[i3] = (1 << (i & 31)) | iArr3[i3];
            }
        }
        return gF2Vector;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Vector extractRightVector(int i) {
        int i2;
        if (i > this.length) {
            throw new java.lang.ArithmeticException("invalid length");
        }
        if (i == this.length) {
            return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(this);
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(i);
        int i3 = (this.length - i) >> 5;
        int i4 = (this.length - i) & 31;
        int i5 = (i + 31) >> 5;
        int i6 = 0;
        if (i4 == 0) {
            java.lang.System.arraycopy(this.getHighSpeedVideoSizes, i3, gF2Vector.getHighSpeedVideoSizes, 0, i5);
            return gF2Vector;
        }
        while (true) {
            i2 = i5 - 1;
            if (i6 >= i2) {
                break;
            }
            int[] iArr = gF2Vector.getHighSpeedVideoSizes;
            int[] iArr2 = this.getHighSpeedVideoSizes;
            int i7 = i3 + 1;
            iArr[i6] = (iArr2[i3] >>> i4) | (iArr2[i7] << (32 - i4));
            i6++;
            i3 = i7;
        }
        int[] iArr3 = gF2Vector.getHighSpeedVideoSizes;
        int[] iArr4 = this.getHighSpeedVideoSizes;
        int i8 = i3 + 1;
        int i9 = iArr4[i3] >>> i4;
        iArr3[i2] = i9;
        if (i8 < iArr4.length) {
            iArr3[i2] = i9 | (iArr4[i8] << (32 - i4));
        }
        return gF2Vector;
    }

    public org.bouncycastle.pqc.math.linearalgebra.GF2Vector extractLeftVector(int i) {
        if (i > this.length) {
            throw new java.lang.ArithmeticException("invalid length");
        }
        if (i == this.length) {
            return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(this);
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(i);
        int i2 = i >> 5;
        int i3 = i & 31;
        java.lang.System.arraycopy(this.getHighSpeedVideoSizes, 0, gF2Vector.getHighSpeedVideoSizes, 0, i2);
        if (i3 != 0) {
            gF2Vector.getHighSpeedVideoSizes[i2] = ((1 << i3) - 1) & this.getHighSpeedVideoSizes[i2];
        }
        return gF2Vector;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Vector)) {
            return false;
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) obj;
        return this.length == gF2Vector.length && org.bouncycastle.pqc.math.linearalgebra.IntUtils.equals(this.getHighSpeedVideoSizes, gF2Vector.getHighSpeedVideoSizes);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.Vector
    public org.bouncycastle.pqc.math.linearalgebra.Vector add(org.bouncycastle.pqc.math.linearalgebra.Vector vector) {
        if (!(vector instanceof org.bouncycastle.pqc.math.linearalgebra.GF2Vector)) {
            throw new java.lang.ArithmeticException("vector is not defined over GF(2)");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = (org.bouncycastle.pqc.math.linearalgebra.GF2Vector) vector;
        if (this.length != gF2Vector.length) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        int[] clone = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(gF2Vector.getHighSpeedVideoSizes);
        for (int length = clone.length - 1; length >= 0; length--) {
            clone[length] = clone[length] ^ this.getHighSpeedVideoSizes[length];
        }
        return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(this.length, clone);
    }

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Vector OS2VP(int i, byte[] bArr) {
        if (i < 0) {
            throw new java.lang.ArithmeticException("negative length");
        }
        if (bArr.length <= ((i + 7) >> 3)) {
            return new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(i, org.bouncycastle.pqc.math.linearalgebra.LittleEndianConversions.toIntArray(bArr));
        }
        throw new java.lang.ArithmeticException("length mismatch");
    }

    protected GF2Vector(int[] iArr, int i) {
        this.getHighSpeedVideoSizes = iArr;
        this.length = i;
    }

    public GF2Vector(org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector) {
        this.length = gF2Vector.length;
        this.getHighSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(gF2Vector.getHighSpeedVideoSizes);
    }

    public GF2Vector(int i, int[] iArr) {
        if (i < 0) {
            throw new java.lang.ArithmeticException("negative length");
        }
        this.length = i;
        int i2 = (i + 31) >> 5;
        if (iArr.length != i2) {
            throw new java.lang.ArithmeticException("length mismatch");
        }
        int[] clone = org.bouncycastle.pqc.math.linearalgebra.IntUtils.clone(iArr);
        this.getHighSpeedVideoSizes = clone;
        int i3 = i & 31;
        if (i3 != 0) {
            int i4 = i2 - 1;
            clone[i4] = ((1 << i3) - 1) & clone[i4];
        }
    }

    public GF2Vector(int i, java.security.SecureRandom secureRandom) {
        this.length = i;
        int i2 = (i + 31) >> 5;
        this.getHighSpeedVideoSizes = new int[i2];
        int i3 = i2 - 1;
        for (int i4 = i3; i4 >= 0; i4--) {
            this.getHighSpeedVideoSizes[i4] = secureRandom.nextInt();
        }
        int i5 = i & 31;
        if (i5 != 0) {
            int[] iArr = this.getHighSpeedVideoSizes;
            iArr[i3] = ((1 << i5) - 1) & iArr[i3];
        }
    }

    public GF2Vector(int i, int i2, java.security.SecureRandom secureRandom) {
        if (i2 > i) {
            throw new java.lang.ArithmeticException("The hamming weight is greater than the length of vector.");
        }
        this.length = i;
        this.getHighSpeedVideoSizes = new int[(i + 31) >> 5];
        int[] iArr = new int[i];
        for (int i3 = 0; i3 < i; i3++) {
            iArr[i3] = i3;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int highSpeedVideoSizes = org.bouncycastle.pqc.math.linearalgebra.RandUtils.getHighSpeedVideoSizes(secureRandom, i);
            setBit(iArr[highSpeedVideoSizes]);
            i--;
            iArr[highSpeedVideoSizes] = iArr[i];
        }
    }

    public GF2Vector(int i) {
        if (i < 0) {
            throw new java.lang.ArithmeticException("Negative length.");
        }
        this.length = i;
        this.getHighSpeedVideoSizes = new int[(i + 31) >> 5];
    }
}
