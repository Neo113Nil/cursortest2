package org.bouncycastle.crypto.agreement.jpake;

/* loaded from: classes17.dex */
public class JPAKEPrimeOrderGroup {
    private final java.math.BigInteger getHighSpeedVideoFpsRanges;
    private final java.math.BigInteger getHighSpeedVideoFpsRangesFor;
    private final java.math.BigInteger getHighSpeedVideoSizes;

    public java.math.BigInteger getQ() {
        return this.getHighSpeedVideoSizes;
    }

    public java.math.BigInteger getP() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.math.BigInteger getG() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    JPAKEPrimeOrderGroup(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3, boolean z) {
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigInteger, "p");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigInteger2, "q");
        org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.validateNotNull(bigInteger3, "g");
        if (!z) {
            if (!bigInteger.subtract(org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.getHighSpeedVideoSizes).mod(bigInteger2).equals(org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.getHighSpeedVideoFpsRanges)) {
                throw new java.lang.IllegalArgumentException("p-1 must be evenly divisible by q");
            }
            if (bigInteger3.compareTo(java.math.BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.getHighSpeedVideoSizes)) == 1) {
                throw new java.lang.IllegalArgumentException("g must be in [2, p-1]");
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(org.bouncycastle.crypto.agreement.jpake.JPAKEUtil.getHighSpeedVideoSizes)) {
                throw new java.lang.IllegalArgumentException("g^q mod p must equal 1");
            }
            if (!bigInteger.isProbablePrime(20)) {
                throw new java.lang.IllegalArgumentException("p must be prime");
            }
            if (!bigInteger2.isProbablePrime(20)) {
                throw new java.lang.IllegalArgumentException("q must be prime");
            }
        }
        this.getHighSpeedVideoFpsRanges = bigInteger;
        this.getHighSpeedVideoSizes = bigInteger2;
        this.getHighSpeedVideoFpsRangesFor = bigInteger3;
    }

    public JPAKEPrimeOrderGroup(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.math.BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }
}
