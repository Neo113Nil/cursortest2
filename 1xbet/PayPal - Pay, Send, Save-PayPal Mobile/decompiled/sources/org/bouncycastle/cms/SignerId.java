package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class SignerId implements org.bouncycastle.util.Selector {
    private org.bouncycastle.cert.selector.X509CertificateHolderSelector getHighSpeedVideoSizes;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.cms.SignerInformation ? ((org.bouncycastle.cms.SignerInformation) obj).getSID().equals(this) : this.getHighSpeedVideoSizes.match(obj);
    }

    public int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public byte[] getSubjectKeyIdentifier() {
        return this.getHighSpeedVideoSizes.getSubjectKeyIdentifier();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoSizes.getSerialNumber();
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighSpeedVideoSizes.getIssuer();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.cms.SignerId) {
            return this.getHighSpeedVideoSizes.equals(((org.bouncycastle.cms.SignerId) obj).getHighSpeedVideoSizes);
        }
        return false;
    }

    @Override // org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cms.SignerId(this.getHighSpeedVideoSizes);
    }

    public SignerId(byte[] bArr) {
        this(null, null, bArr);
    }

    private SignerId(org.bouncycastle.cert.selector.X509CertificateHolderSelector x509CertificateHolderSelector) {
        this.getHighSpeedVideoSizes = x509CertificateHolderSelector;
    }

    public SignerId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, byte[] bArr) {
        this(new org.bouncycastle.cert.selector.X509CertificateHolderSelector(x500Name, bigInteger, bArr));
    }

    public SignerId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this(x500Name, bigInteger, null);
    }
}
