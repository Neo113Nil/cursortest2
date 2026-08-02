package org.bouncycastle.pkix;

/* loaded from: classes17.dex */
public class PKIXIdentity {
    private final org.bouncycastle.asn1.pkcs.PrivateKeyInfo getHighResolutionOutputSizeshNQ4ISI;
    private final org.bouncycastle.cert.X509CertificateHolder[] getHighSpeedVideoFpsRanges;

    public org.bouncycastle.cms.RecipientId getRecipientId() {
        org.bouncycastle.asn1.x500.X500Name issuer = this.getHighSpeedVideoFpsRanges[0].getIssuer();
        java.math.BigInteger serialNumber = this.getHighSpeedVideoFpsRanges[0].getSerialNumber();
        org.bouncycastle.asn1.x509.SubjectKeyIdentifier fromExtensions = org.bouncycastle.asn1.x509.SubjectKeyIdentifier.fromExtensions(this.getHighSpeedVideoFpsRanges[0].getExtensions());
        return new org.bouncycastle.cms.KeyTransRecipientId(issuer, serialNumber, fromExtensions == null ? null : fromExtensions.getKeyIdentifier());
    }

    public org.bouncycastle.asn1.pkcs.PrivateKeyInfo getPrivateKeyInfo() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.bouncycastle.cert.X509CertificateHolder[] getCertificateChain() {
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr = this.getHighSpeedVideoFpsRanges;
        int length = x509CertificateHolderArr.length;
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr2 = new org.bouncycastle.cert.X509CertificateHolder[length];
        java.lang.System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, length);
        return x509CertificateHolderArr2;
    }

    public org.bouncycastle.cert.X509CertificateHolder getCertificate() {
        return this.getHighSpeedVideoFpsRanges[0];
    }

    public PKIXIdentity(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr) {
        this.getHighResolutionOutputSizeshNQ4ISI = privateKeyInfo;
        org.bouncycastle.cert.X509CertificateHolder[] x509CertificateHolderArr2 = new org.bouncycastle.cert.X509CertificateHolder[x509CertificateHolderArr.length];
        this.getHighSpeedVideoFpsRanges = x509CertificateHolderArr2;
        java.lang.System.arraycopy(x509CertificateHolderArr, 0, x509CertificateHolderArr2, 0, x509CertificateHolderArr.length);
    }

    public PKIXIdentity(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo, org.bouncycastle.cert.X509CertificateHolder x509CertificateHolder) {
        this(privateKeyInfo, new org.bouncycastle.cert.X509CertificateHolder[]{x509CertificateHolder});
    }
}
