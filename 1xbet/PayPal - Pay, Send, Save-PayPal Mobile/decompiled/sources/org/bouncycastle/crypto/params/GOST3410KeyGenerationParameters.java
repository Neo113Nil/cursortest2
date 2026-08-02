package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class GOST3410KeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.crypto.params.GOST3410Parameters getHighSpeedVideoFpsRanges;

    public org.bouncycastle.crypto.params.GOST3410Parameters getParameters() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public GOST3410KeyGenerationParameters(java.security.SecureRandom secureRandom, org.bouncycastle.crypto.params.GOST3410Parameters gOST3410Parameters) {
        super(secureRandom, gOST3410Parameters.getP().bitLength() - 1);
        this.getHighSpeedVideoFpsRanges = gOST3410Parameters;
    }
}
