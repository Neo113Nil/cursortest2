package org.bouncycastle.crypto.generators;

/* loaded from: classes17.dex */
public class RSAKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = java.math.BigInteger.valueOf(1);
    private org.bouncycastle.crypto.params.RSAKeyGenerationParameters getHighSpeedVideoSizes;

    protected boolean isProbablePrime(java.math.BigInteger bigInteger) {
        int i;
        int bitLength = bigInteger.bitLength();
        int certainty = this.getHighSpeedVideoSizes.getCertainty();
        int i2 = 4;
        if (bitLength >= 1536) {
            if (certainty <= 100) {
                i2 = 3;
            } else if (certainty > 128) {
                i = certainty + androidx.compose.runtime.ComposerKt.defaultsKey;
                i2 += i / 2;
            }
        } else if (bitLength >= 1024) {
            if (certainty > 100) {
                if (certainty > 112) {
                    i2 = ((certainty - 111) / 2) + 5;
                }
                i2 = 5;
            }
        } else if (bitLength >= 512) {
            if (certainty > 80) {
                i2 = 7;
                if (certainty > 100) {
                    i = certainty - 99;
                    i2 += i / 2;
                }
            }
            i2 = 5;
        } else {
            i2 = certainty <= 80 ? 40 : ((certainty - 79) / 2) + 40;
        }
        return !org.bouncycastle.math.Primes.hasAnySmallFactors(bigInteger) && org.bouncycastle.math.Primes.isMRProbablePrime(bigInteger, this.getHighSpeedVideoSizes.getRandom(), i2);
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        this.getHighSpeedVideoSizes = (org.bouncycastle.crypto.params.RSAKeyGenerationParameters) keyGenerationParameters;
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        java.math.BigInteger chooseRandomPrime;
        java.math.BigInteger chooseRandomPrime2;
        java.math.BigInteger multiply;
        java.math.BigInteger bigInteger;
        int strength = this.getHighSpeedVideoSizes.getStrength();
        int i = (strength + 1) / 2;
        int i2 = strength / 2;
        int i3 = i2 - 100;
        int i4 = strength / 3;
        if (i3 < i4) {
            i3 = i4;
        }
        java.math.BigInteger pow = java.math.BigInteger.valueOf(2L).pow(i2);
        java.math.BigInteger bigInteger2 = getHighSpeedVideoFpsRangesFor;
        java.math.BigInteger shiftLeft = bigInteger2.shiftLeft(strength - 1);
        java.math.BigInteger shiftLeft2 = bigInteger2.shiftLeft(i3);
        org.bouncycastle.crypto.AsymmetricCipherKeyPair asymmetricCipherKeyPair = null;
        boolean z = false;
        while (!z) {
            java.math.BigInteger publicExponent = this.getHighSpeedVideoSizes.getPublicExponent();
            do {
                chooseRandomPrime = chooseRandomPrime(i, publicExponent, shiftLeft);
                while (true) {
                    chooseRandomPrime2 = chooseRandomPrime(strength - i, publicExponent, shiftLeft);
                    java.math.BigInteger abs = chooseRandomPrime2.subtract(chooseRandomPrime).abs();
                    if (abs.bitLength() >= i3 && abs.compareTo(shiftLeft2) > 0) {
                        multiply = chooseRandomPrime.multiply(chooseRandomPrime2);
                        if (multiply.bitLength() == strength) {
                            break;
                        }
                        chooseRandomPrime = chooseRandomPrime.max(chooseRandomPrime2);
                    }
                }
            } while (org.bouncycastle.math.ec.WNafUtil.getNafWeight(multiply) < (strength >> 2));
            if (chooseRandomPrime.compareTo(chooseRandomPrime2) < 0) {
                bigInteger = chooseRandomPrime2;
            } else {
                bigInteger = chooseRandomPrime;
                chooseRandomPrime = chooseRandomPrime2;
            }
            java.math.BigInteger bigInteger3 = getHighSpeedVideoFpsRangesFor;
            java.math.BigInteger subtract = bigInteger.subtract(bigInteger3);
            java.math.BigInteger subtract2 = chooseRandomPrime.subtract(bigInteger3);
            java.math.BigInteger modInverse = publicExponent.modInverse(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2));
            if (modInverse.compareTo(pow) > 0) {
                asymmetricCipherKeyPair = new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.RSAKeyParameters(false, multiply, publicExponent), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters(multiply, publicExponent, modInverse, bigInteger, chooseRandomPrime, modInverse.remainder(subtract), modInverse.remainder(subtract2), org.bouncycastle.util.BigIntegers.modOddInverse(bigInteger, chooseRandomPrime)));
                z = true;
            }
        }
        return asymmetricCipherKeyPair;
    }

    protected java.math.BigInteger chooseRandomPrime(int i, java.math.BigInteger bigInteger, java.math.BigInteger bigInteger2) {
        for (int i2 = 0; i2 != i * 5; i2++) {
            java.math.BigInteger createRandomPrime = org.bouncycastle.util.BigIntegers.createRandomPrime(i, 1, this.getHighSpeedVideoSizes.getRandom());
            java.math.BigInteger mod = createRandomPrime.mod(bigInteger);
            java.math.BigInteger bigInteger3 = getHighSpeedVideoFpsRangesFor;
            if (!mod.equals(bigInteger3) && createRandomPrime.multiply(createRandomPrime).compareTo(bigInteger2) >= 0 && isProbablePrime(createRandomPrime) && bigInteger.gcd(createRandomPrime.subtract(bigInteger3)).equals(bigInteger3)) {
                return createRandomPrime;
            }
        }
        throw new java.lang.IllegalStateException("unable to generate prime number for RSA key");
    }
}
