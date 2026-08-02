package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class RSAKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private java.math.BigInteger Camera2StreamConfigurationMap;
    private int getHighSpeedVideoFpsRanges;

    public java.math.BigInteger getPublicExponent() {
        return this.Camera2StreamConfigurationMap;
    }

    public int getCertainty() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public RSAKeyGenerationParameters(java.math.BigInteger bigInteger, java.security.SecureRandom secureRandom, int i, int i2) {
        super(secureRandom, i);
        if (i < 12) {
            throw new java.lang.IllegalArgumentException("key strength too small");
        }
        if (!bigInteger.testBit(0)) {
            throw new java.lang.IllegalArgumentException("public exponent cannot be even");
        }
        this.Camera2StreamConfigurationMap = bigInteger;
        this.getHighSpeedVideoFpsRanges = i2;
    }
}
