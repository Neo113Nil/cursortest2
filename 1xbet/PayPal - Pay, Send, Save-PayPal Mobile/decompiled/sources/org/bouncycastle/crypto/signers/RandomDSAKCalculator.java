package org.bouncycastle.crypto.signers;

/* loaded from: classes17.dex */
public class RandomDSAKCalculator implements org.bouncycastle.crypto.signers.DSAKCalculator {
    private static final java.math.BigInteger getHighSpeedVideoSizes = java.math.BigInteger.valueOf(0);
    private java.security.SecureRandom getHighSpeedVideoFpsRanges;
    private java.math.BigInteger getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public boolean isDeterministic() {
        return false;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public java.math.BigInteger nextK() {
        int bitLength = this.getHighSpeedVideoFpsRangesFor.bitLength();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(bitLength, this.getHighSpeedVideoFpsRanges);
            if (!createRandomBigInteger.equals(getHighSpeedVideoSizes) && createRandomBigInteger.compareTo(this.getHighSpeedVideoFpsRangesFor) < 0) {
                return createRandomBigInteger;
            }
        }
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom) {
        this.getHighSpeedVideoFpsRangesFor = bigInteger;
        this.getHighSpeedVideoFpsRanges = secureRandom;
    }

    @Override // org.bouncycastle.crypto.signers.DSAKCalculator
    public void init(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, byte[] bArr) {
        throw new java.lang.IllegalStateException("Operation not supported");
    }
}
