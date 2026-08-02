package org.bouncycastle.pqc.crypto.newhope;

/* loaded from: classes17.dex */
public class NHExchangePairGenerator implements org.bouncycastle.pqc.crypto.ExchangePairGenerator {
    private final java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;

    @Override // org.bouncycastle.pqc.crypto.ExchangePairGenerator
    public org.bouncycastle.pqc.crypto.ExchangePair generateExchange(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[2048];
        org.bouncycastle.pqc.crypto.newhope.NewHope.getHighSpeedVideoFpsRangesFor(this.getHighResolutionOutputSizeshNQ4ISI, bArr, bArr2, ((org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters) asymmetricKeyParameter).Camera2StreamConfigurationMap);
        return new org.bouncycastle.pqc.crypto.ExchangePair(new org.bouncycastle.pqc.crypto.newhope.NHPublicKeyParameters(bArr2), bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.ExchangePairGenerator
    public org.bouncycastle.pqc.crypto.ExchangePair GenerateExchange(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) {
        return generateExchange(asymmetricKeyParameter);
    }

    public NHExchangePairGenerator(java.security.SecureRandom secureRandom) {
        this.getHighResolutionOutputSizeshNQ4ISI = secureRandom;
    }
}
