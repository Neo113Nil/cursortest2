package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
public final class QTESLAKeyPairGenerator implements org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator {
    private java.security.SecureRandom getHighResolutionOutputSizeshNQ4ISI;
    private int getHighSpeedVideoSizes;

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public final org.bouncycastle.crypto.AsymmetricCipherKeyPair generateKeyPair() {
        byte[] bArr = new byte[org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes)];
        byte[] bArr2 = new byte[org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes)];
        int i = this.getHighSpeedVideoSizes;
        if (i == 5) {
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.getHighSpeedVideoFpsRanges(bArr2, bArr, this.getHighResolutionOutputSizeshNQ4ISI);
        } else {
            if (i != 6) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown security category: ");
                sb.append(this.getHighSpeedVideoSizes);
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            org.bouncycastle.pqc.crypto.qtesla.QTesla3p.getHighSpeedVideoFpsRanges(bArr2, bArr, this.getHighResolutionOutputSizeshNQ4ISI);
        }
        return new org.bouncycastle.crypto.AsymmetricCipherKeyPair((org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters(this.getHighSpeedVideoSizes, bArr2), (org.bouncycastle.crypto.params.AsymmetricKeyParameter) new org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters(this.getHighSpeedVideoSizes, bArr));
    }

    @Override // org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator
    public final void init(org.bouncycastle.crypto.KeyGenerationParameters keyGenerationParameters) {
        org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters qTESLAKeyGenerationParameters = (org.bouncycastle.pqc.crypto.qtesla.QTESLAKeyGenerationParameters) keyGenerationParameters;
        this.getHighResolutionOutputSizeshNQ4ISI = qTESLAKeyGenerationParameters.getRandom();
        this.getHighSpeedVideoSizes = qTESLAKeyGenerationParameters.getSecurityCategory();
    }
}
