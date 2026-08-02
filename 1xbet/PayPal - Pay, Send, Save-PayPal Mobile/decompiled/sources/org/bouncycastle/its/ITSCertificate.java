package org.bouncycastle.its;

/* loaded from: classes17.dex */
public class ITSCertificate implements org.bouncycastle.util.Encodable {
    private final org.bouncycastle.oer.its.Certificate getHighSpeedVideoFpsRangesFor;

    public org.bouncycastle.oer.its.Certificate toASN1Structure() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isSignatureValid(org.bouncycastle.its.operator.ITSContentVerifierProvider iTSContentVerifierProvider) throws java.lang.Exception {
        org.bouncycastle.operator.ContentVerifier contentVerifier = iTSContentVerifierProvider.get(this.getHighSpeedVideoFpsRangesFor.getCertificateBase().getSignature().getChoice());
        java.io.OutputStream outputStream = contentVerifier.getOutputStream();
        outputStream.write(org.bouncycastle.oer.OEREncoder.toByteArray(this.getHighSpeedVideoFpsRangesFor.getCertificateBase().getToBeSignedCertificate(), org.bouncycastle.oer.its.template.IEEE1609dot2.tbsCertificate));
        outputStream.close();
        return contentVerifier.verify(org.bouncycastle.its.operator.ECDSAEncoder.toX962(this.getHighSpeedVideoFpsRangesFor.getCertificateBase().getSignature()));
    }

    public org.bouncycastle.its.ITSValidityPeriod getValidityPeriod() {
        return new org.bouncycastle.its.ITSValidityPeriod(this.getHighSpeedVideoFpsRangesFor.getCertificateBase().getToBeSignedCertificate().getValidityPeriod());
    }

    public org.bouncycastle.its.ITSPublicEncryptionKey getPublicEncryptionKey() {
        org.bouncycastle.oer.its.PublicEncryptionKey encryptionKey = this.getHighSpeedVideoFpsRangesFor.getCertificateBase().getToBeSignedCertificate().getEncryptionKey();
        if (encryptionKey != null) {
            return new org.bouncycastle.its.ITSPublicEncryptionKey(encryptionKey);
        }
        return null;
    }

    public org.bouncycastle.oer.its.IssuerIdentifier getIssuer() {
        return this.getHighSpeedVideoFpsRangesFor.getCertificateBase().getIssuer();
    }

    @Override // org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws java.io.IOException {
        return org.bouncycastle.oer.OEREncoder.toByteArray(this.getHighSpeedVideoFpsRangesFor.getCertificateBase(), org.bouncycastle.oer.its.template.IEEE1609dot2.certificate);
    }

    public ITSCertificate(org.bouncycastle.oer.its.Certificate certificate) {
        this.getHighSpeedVideoFpsRangesFor = certificate;
    }
}
