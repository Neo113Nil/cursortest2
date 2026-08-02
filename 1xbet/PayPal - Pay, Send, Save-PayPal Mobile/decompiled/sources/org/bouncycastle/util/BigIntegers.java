package org.bouncycastle.util;

/* loaded from: classes17.dex */
public final class BigIntegers {
    public static final java.math.BigInteger ZERO = java.math.BigInteger.valueOf(0);
    public static final java.math.BigInteger ONE = java.math.BigInteger.valueOf(1);
    public static final java.math.BigInteger TWO = java.math.BigInteger.valueOf(2);
    private static final java.math.BigInteger getHighResolutionOutputSizeshNQ4ISI = java.math.BigInteger.valueOf(3);
    private static final java.math.BigInteger getHighSpeedVideoSizes = new java.math.BigInteger("8138e8a0fcf3a4e84a771d40fd305d7f4aa59306d7251de54d98af8fe95729a1f73d893fa424cd2edc8636a6c3285e022b0e3866a565ae8108eed8591cd4fe8d2ce86165a978d719ebf647f362d33fca29cd179fb42401cbaf3df0c614056f9c8f3cfd51e474afb6bc6974f78db8aba8e9e517fded658591ab7502bd41849462f", 16);
    private static final int Camera2StreamConfigurationMap = java.math.BigInteger.valueOf(743).bitLength();

    public static short shortValueExact(java.math.BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 15) {
            return bigInteger.shortValue();
        }
        throw new java.lang.ArithmeticException("BigInteger out of int range");
    }

    public static java.math.BigInteger modOddInverseVar(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new java.lang.IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new java.lang.ArithmeticException("BigInteger: modulus not positive");
        }
        java.math.BigInteger bigInteger3 = ONE;
        if (bigInteger.equals(bigInteger3)) {
            return ZERO;
        }
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        if (bigInteger2.equals(bigInteger3)) {
            return bigInteger3;
        }
        int bitLength = bigInteger.bitLength();
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat.fromBigInteger(bitLength, bigInteger);
        int[] fromBigInteger2 = org.bouncycastle.math.raw.Nat.fromBigInteger(bitLength, bigInteger2);
        int length = fromBigInteger.length;
        int[] create = org.bouncycastle.math.raw.Nat.create(length);
        if (org.bouncycastle.math.raw.Mod.modOddInverseVar(fromBigInteger, fromBigInteger2, create)) {
            return org.bouncycastle.math.raw.Nat.toBigInteger(length, create);
        }
        throw new java.lang.ArithmeticException("BigInteger not invertible.");
    }

    public static java.math.BigInteger modOddInverse(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        if (!bigInteger.testBit(0)) {
            throw new java.lang.IllegalArgumentException("'M' must be odd");
        }
        if (bigInteger.signum() != 1) {
            throw new java.lang.ArithmeticException("BigInteger: modulus not positive");
        }
        if (bigInteger2.signum() < 0 || bigInteger2.compareTo(bigInteger) >= 0) {
            bigInteger2 = bigInteger2.mod(bigInteger);
        }
        int bitLength = bigInteger.bitLength();
        int[] fromBigInteger = org.bouncycastle.math.raw.Nat.fromBigInteger(bitLength, bigInteger);
        int[] fromBigInteger2 = org.bouncycastle.math.raw.Nat.fromBigInteger(bitLength, bigInteger2);
        int length = fromBigInteger.length;
        int[] create = org.bouncycastle.math.raw.Nat.create(length);
        if (org.bouncycastle.math.raw.Mod.modOddInverse(fromBigInteger, fromBigInteger2, create) != 0) {
            return org.bouncycastle.math.raw.Nat.toBigInteger(length, create);
        }
        throw new java.lang.ArithmeticException("BigInteger not invertible.");
    }

    public static long longValueExact(java.math.BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 63) {
            return bigInteger.longValue();
        }
        throw new java.lang.ArithmeticException("BigInteger out of long range");
    }

    public static int intValueExact(java.math.BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 31) {
            return bigInteger.intValue();
        }
        throw new java.lang.ArithmeticException("BigInteger out of int range");
    }

    public static int getUnsignedByteLength(java.math.BigInteger bigInteger) {
        if (bigInteger.equals(ZERO)) {
            return 1;
        }
        return (bigInteger.bitLength() + 7) / 8;
    }

    public static java.math.BigInteger fromUnsignedByteArray(byte[] bArr, int i, int i2) {
        if (i != 0 || i2 != bArr.length) {
            byte[] bArr2 = new byte[i2];
            java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
            bArr = bArr2;
        }
        return new java.math.BigInteger(1, bArr);
    }

    public static java.math.BigInteger fromUnsignedByteArray(byte[] bArr) {
        return new java.math.BigInteger(1, bArr);
    }

    public static java.math.BigInteger createRandomPrime(int i, int i2, java.security.SecureRandom secureRandom) {
        java.math.BigInteger bigInteger;
        if (i < 2) {
            throw new java.lang.IllegalArgumentException("bitLength < 2");
        }
        if (i == 2) {
            return secureRandom.nextInt() < 0 ? TWO : getHighResolutionOutputSizeshNQ4ISI;
        }
        do {
            byte[] highSpeedVideoSizes = getHighSpeedVideoSizes(i, secureRandom);
            highSpeedVideoSizes[0] = (byte) (((byte) (1 << (7 - ((highSpeedVideoSizes.length * 8) - i)))) | highSpeedVideoSizes[0]);
            int length = highSpeedVideoSizes.length - 1;
            highSpeedVideoSizes[length] = (byte) (highSpeedVideoSizes[length] | 1);
            bigInteger = new java.math.BigInteger(1, highSpeedVideoSizes);
            if (i > Camera2StreamConfigurationMap) {
                while (!bigInteger.gcd(getHighSpeedVideoSizes).equals(ONE)) {
                    bigInteger = bigInteger.add(TWO);
                }
            }
        } while (!bigInteger.isProbablePrime(i2));
        return bigInteger;
    }

    public static java.math.BigInteger createRandomInRange(java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2, java.security.SecureRandom secureRandom) {
        java.math.BigInteger createRandomBigInteger;
        int compareTo = bigInteger.compareTo(bigInteger2);
        if (compareTo >= 0) {
            if (compareTo <= 0) {
                return bigInteger;
            }
            throw new java.lang.IllegalArgumentException("'min' may not be greater than 'max'");
        }
        if (bigInteger.bitLength() > bigInteger2.bitLength() / 2) {
            createRandomBigInteger = createRandomInRange(ZERO, bigInteger2.subtract(bigInteger), secureRandom);
        } else {
            for (int i = 0; i < 1000; i++) {
                java.math.BigInteger createRandomBigInteger2 = createRandomBigInteger(bigInteger2.bitLength(), secureRandom);
                if (createRandomBigInteger2.compareTo(bigInteger) >= 0 && createRandomBigInteger2.compareTo(bigInteger2) <= 0) {
                    return createRandomBigInteger2;
                }
            }
            createRandomBigInteger = createRandomBigInteger(bigInteger2.subtract(bigInteger).bitLength() - 1, secureRandom);
        }
        return createRandomBigInteger.add(bigInteger);
    }

    public static java.math.BigInteger createRandomBigInteger(int i, java.security.SecureRandom secureRandom) {
        return new java.math.BigInteger(1, getHighSpeedVideoSizes(i, secureRandom));
    }

    private static byte[] getHighSpeedVideoSizes(int i, java.security.SecureRandom secureRandom) throws java.lang.IllegalArgumentException {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("bitLength must be at least 1");
        }
        int i2 = (i + 7) / 8;
        byte[] bArr = new byte[i2];
        secureRandom.nextBytes(bArr);
        bArr[0] = (byte) (((byte) (255 >>> ((i2 * 8) - i))) & bArr[0]);
        return bArr;
    }

    public static byte byteValueExact(java.math.BigInteger bigInteger) {
        if (bigInteger.bitLength() <= 7) {
            return bigInteger.byteValue();
        }
        throw new java.lang.ArithmeticException("BigInteger out of int range");
    }

    public static byte[] asUnsignedByteArray(java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray[0] != 0 || byteArray.length == 1) {
            return byteArray;
        }
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        java.lang.System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }

    public static byte[] asUnsignedByteArray(int i, java.math.BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i) {
            return byteArray;
        }
        int i2 = 0;
        if (byteArray[0] == 0 && byteArray.length != 1) {
            i2 = 1;
        }
        int length = byteArray.length - i2;
        if (length > i) {
            throw new java.lang.IllegalArgumentException("standard length exceeded for value");
        }
        byte[] bArr = new byte[i];
        java.lang.System.arraycopy(byteArray, i2, bArr, i - length, length);
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        if (r3.length == 1) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void asUnsignedByteArray(java.math.BigInteger bigInteger, byte[] bArr, int i, int i2) {
        int i3;
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i2) {
            java.lang.System.arraycopy(byteArray, 0, bArr, i, i2);
            return;
        }
        if (byteArray[0] == 0) {
            i3 = 1;
        }
        i3 = 0;
        int length = byteArray.length - i3;
        if (length > i2) {
            throw new java.lang.IllegalArgumentException("standard length exceeded for value");
        }
        int i4 = (i2 - length) + i;
        org.bouncycastle.util.Arrays.fill(bArr, i, i4, (byte) 0);
        java.lang.System.arraycopy(byteArray, i3, bArr, i4, length);
    }
}
