package org.bouncycastle.pqc.crypto.qtesla;

/* loaded from: classes17.dex */
public class QTESLASigner implements org.bouncycastle.pqc.crypto.MessageSigner {
    private org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters Camera2StreamConfigurationMap;
    private org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters getHighResolutionOutputSizeshNQ4ISI;
    private java.security.SecureRandom getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        int Camera2StreamConfigurationMap;
        int securityCategory = this.Camera2StreamConfigurationMap.getSecurityCategory();
        if (securityCategory == 5) {
            Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.qtesla.QTesla1p.Camera2StreamConfigurationMap(bArr, bArr2, bArr2.length, this.Camera2StreamConfigurationMap.getPublicData());
        } else {
            if (securityCategory != 6) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown security category: ");
                sb.append(this.Camera2StreamConfigurationMap.getSecurityCategory());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            Camera2StreamConfigurationMap = org.bouncycastle.pqc.crypto.qtesla.QTesla3p.getHighSpeedVideoFpsRangesFor(bArr, bArr2, bArr2.length, this.Camera2StreamConfigurationMap.getPublicData());
        }
        return Camera2StreamConfigurationMap == 0;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z, org.bouncycastle.crypto.CipherParameters cipherParameters) {
        int securityCategory;
        if (z) {
            if (cipherParameters instanceof org.bouncycastle.crypto.params.ParametersWithRandom) {
                org.bouncycastle.crypto.params.ParametersWithRandom parametersWithRandom = (org.bouncycastle.crypto.params.ParametersWithRandom) cipherParameters;
                this.getHighSpeedVideoFpsRangesFor = parametersWithRandom.getRandom();
                this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters) parametersWithRandom.getParameters();
            } else {
                this.getHighSpeedVideoFpsRangesFor = org.bouncycastle.crypto.CryptoServicesRegistrar.getSecureRandom();
                this.getHighResolutionOutputSizeshNQ4ISI = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPrivateKeyParameters) cipherParameters;
            }
            this.Camera2StreamConfigurationMap = null;
            securityCategory = this.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory();
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = null;
            org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters qTESLAPublicKeyParameters = (org.bouncycastle.pqc.crypto.qtesla.QTESLAPublicKeyParameters) cipherParameters;
            this.Camera2StreamConfigurationMap = qTESLAPublicKeyParameters;
            securityCategory = qTESLAPublicKeyParameters.getSecurityCategory();
        }
        org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.Camera2StreamConfigurationMap(securityCategory);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        byte[] bArr2 = new byte[org.bouncycastle.pqc.crypto.qtesla.QTESLASecurityCategory.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory())];
        int securityCategory = this.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory();
        if (securityCategory == 5) {
            org.bouncycastle.pqc.crypto.qtesla.QTesla1p.getHighSpeedVideoFpsRanges(bArr2, bArr, bArr.length, this.getHighResolutionOutputSizeshNQ4ISI.getSecret(), this.getHighSpeedVideoFpsRangesFor);
            return bArr2;
        }
        if (securityCategory == 6) {
            org.bouncycastle.pqc.crypto.qtesla.QTesla3p.getHighSpeedVideoFpsRanges(bArr2, bArr, bArr.length, this.getHighResolutionOutputSizeshNQ4ISI.getSecret(), this.getHighSpeedVideoFpsRangesFor);
            return bArr2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("unknown security category: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getSecurityCategory());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
