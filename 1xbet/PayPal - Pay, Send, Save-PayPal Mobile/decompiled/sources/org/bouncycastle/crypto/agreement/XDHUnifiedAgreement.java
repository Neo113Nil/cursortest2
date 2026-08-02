package org.bouncycastle.crypto.agreement;

/* loaded from: classes17.dex */
public class XDHUnifiedAgreement implements org.bouncycastle.crypto.RawAgreement {
    private final org.bouncycastle.crypto.RawAgreement Camera2StreamConfigurationMap;
    private org.bouncycastle.crypto.params.XDHUPrivateParameters getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.crypto.RawAgreement
    public void init(org.bouncycastle.crypto.CipherParameters cipherParameters) {
        this.getHighSpeedVideoFpsRangesFor = (org.bouncycastle.crypto.params.XDHUPrivateParameters) cipherParameters;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public int getAgreementSize() {
        return this.Camera2StreamConfigurationMap.getAgreementSize() * 2;
    }

    @Override // org.bouncycastle.crypto.RawAgreement
    public void calculateAgreement(org.bouncycastle.crypto.CipherParameters cipherParameters, byte[] bArr, int i) {
        org.bouncycastle.crypto.params.XDHUPublicParameters xDHUPublicParameters = (org.bouncycastle.crypto.params.XDHUPublicParameters) cipherParameters;
        this.Camera2StreamConfigurationMap.init(this.getHighSpeedVideoFpsRangesFor.getEphemeralPrivateKey());
        this.Camera2StreamConfigurationMap.calculateAgreement(xDHUPublicParameters.getEphemeralPublicKey(), bArr, i);
        this.Camera2StreamConfigurationMap.init(this.getHighSpeedVideoFpsRangesFor.getStaticPrivateKey());
        this.Camera2StreamConfigurationMap.calculateAgreement(xDHUPublicParameters.getStaticPublicKey(), bArr, i + this.Camera2StreamConfigurationMap.getAgreementSize());
    }

    public XDHUnifiedAgreement(org.bouncycastle.crypto.RawAgreement rawAgreement) {
        this.Camera2StreamConfigurationMap = rawAgreement;
    }
}
