package org.bouncycastle.pqc.crypto.mceliece;

/* loaded from: classes17.dex */
final class Conversions {
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(0);
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(1);

    public static org.bouncycastle.pqc.math.linearalgebra.GF2Vector getHighResolutionOutputSizeshNQ4ISI(int i, int i2, byte[] bArr) {
        if (i < i2) {
            throw new java.lang.IllegalArgumentException("n < t");
        }
        java.math.BigInteger binomial = org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.binomial(i, i2);
        java.math.BigInteger bigInteger = new java.math.BigInteger(1, bArr);
        if (bigInteger.compareTo(binomial) >= 0) {
            throw new java.lang.IllegalArgumentException("Encoded number too large.");
        }
        org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector = new org.bouncycastle.pqc.math.linearalgebra.GF2Vector(i);
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            binomial = binomial.multiply(java.math.BigInteger.valueOf(i3 - i2)).divide(java.math.BigInteger.valueOf(i3));
            i3--;
            if (binomial.compareTo(bigInteger) <= 0) {
                gF2Vector.setBit(i4);
                bigInteger = bigInteger.subtract(binomial);
                int i5 = i2 - 1;
                binomial = i3 == i5 ? getHighSpeedVideoSizes : binomial.multiply(java.math.BigInteger.valueOf(i2)).divide(java.math.BigInteger.valueOf(i3 - i5));
                i2 = i5;
            }
        }
        return gF2Vector;
    }

    public static byte[] Camera2StreamConfigurationMap(int i, int i2, org.bouncycastle.pqc.math.linearalgebra.GF2Vector gF2Vector) {
        if (gF2Vector.getLength() != i || gF2Vector.getHammingWeight() != i2) {
            throw new java.lang.IllegalArgumentException("vector has wrong length or hamming weight");
        }
        int[] vecArray = gF2Vector.getVecArray();
        java.math.BigInteger binomial = org.bouncycastle.pqc.math.linearalgebra.IntegerFunctions.binomial(i, i2);
        java.math.BigInteger bigInteger = getHighResolutionOutputSizeshNQ4ISI;
        int i3 = i;
        for (int i4 = 0; i4 < i; i4++) {
            binomial = binomial.multiply(java.math.BigInteger.valueOf(i3 - i2)).divide(java.math.BigInteger.valueOf(i3));
            i3--;
            if ((vecArray[i4 >> 5] & (1 << (i4 & 31))) != 0) {
                bigInteger = bigInteger.add(binomial);
                int i5 = i2 - 1;
                binomial = i3 == i5 ? getHighSpeedVideoSizes : binomial.multiply(java.math.BigInteger.valueOf(i2)).divide(java.math.BigInteger.valueOf(i3 - i5));
                i2 = i5;
            }
        }
        return org.bouncycastle.pqc.math.linearalgebra.BigIntUtils.toMinimalByteArray(bigInteger);
    }

    private Conversions() {
    }
}
