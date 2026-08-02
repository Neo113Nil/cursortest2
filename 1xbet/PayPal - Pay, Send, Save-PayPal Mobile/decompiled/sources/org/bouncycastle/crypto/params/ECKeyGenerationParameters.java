package org.bouncycastle.crypto.params;

/* loaded from: classes17.dex */
public class ECKeyGenerationParameters extends org.bouncycastle.crypto.KeyGenerationParameters {
    private org.bouncycastle.crypto.params.ECDomainParameters getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.crypto.params.ECDomainParameters getDomainParameters() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public ECKeyGenerationParameters(org.bouncycastle.crypto.params.ECDomainParameters eCDomainParameters, java.security.SecureRandom secureRandom) {
        super(secureRandom, eCDomainParameters.getN().bitLength());
        this.getHighSpeedVideoFpsRangesFor = eCDomainParameters;
    }
}
