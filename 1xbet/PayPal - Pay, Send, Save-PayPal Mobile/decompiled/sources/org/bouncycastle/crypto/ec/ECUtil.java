package org.bouncycastle.crypto.ec;

/* loaded from: classes17.dex */
class ECUtil {
    static java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom) {
        int bitLength = bigInteger.bitLength();
        while (true) {
            java.math.BigInteger createRandomBigInteger = org.bouncycastle.util.BigIntegers.createRandomBigInteger(bitLength, secureRandom);
            if (!createRandomBigInteger.equals(org.bouncycastle.math.ec.ECConstants.ZERO) && createRandomBigInteger.compareTo(bigInteger) < 0) {
                return createRandomBigInteger;
            }
        }
    }

    ECUtil() {
    }
}
