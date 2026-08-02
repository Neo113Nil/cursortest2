package org.bouncycastle.math.field;

/* loaded from: classes17.dex */
public abstract class FiniteFields {
    static final org.bouncycastle.math.field.FiniteField getHighSpeedVideoFpsRangesFor = new org.bouncycastle.math.field.PrimeField(java.math.BigInteger.valueOf(2));
    static final org.bouncycastle.math.field.FiniteField getHighSpeedVideoFpsRanges = new org.bouncycastle.math.field.PrimeField(java.math.BigInteger.valueOf(3));

    public static org.bouncycastle.math.field.FiniteField getPrimeField(java.math.BigInteger bigInteger) {
        int bitLength = bigInteger.bitLength();
        if (bigInteger.signum() <= 0 || bitLength < 2) {
            throw new java.lang.IllegalArgumentException("'characteristic' must be >= 2");
        }
        if (bitLength < 3) {
            int intValue = bigInteger.intValue();
            if (intValue == 2) {
                return getHighSpeedVideoFpsRangesFor;
            }
            if (intValue == 3) {
                return getHighSpeedVideoFpsRanges;
            }
        }
        return new org.bouncycastle.math.field.PrimeField(bigInteger);
    }

    public static org.bouncycastle.math.field.PolynomialExtensionField getBinaryExtensionField(int[] iArr) {
        if (iArr[0] != 0) {
            throw new java.lang.IllegalArgumentException("Irreducible polynomials in GF(2) must have constant term");
        }
        for (int i = 1; i < iArr.length; i++) {
            if (iArr[i] <= iArr[i - 1]) {
                throw new java.lang.IllegalArgumentException("Polynomial exponents must be monotonically increasing");
            }
        }
        return new org.bouncycastle.math.field.GenericPolynomialExtensionField(getHighSpeedVideoFpsRangesFor, new org.bouncycastle.math.field.GF2Polynomial(iArr));
    }
}
