package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class KeyTransRecipientId extends org.bouncycastle.cms.RecipientId {
    private org.bouncycastle.cert.selector.X509CertificateHolderSelector getHighSpeedVideoFpsRangesFor;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.cms.KeyTransRecipientInformation ? ((org.bouncycastle.cms.KeyTransRecipientInformation) obj).getRID().equals(this) : this.getHighSpeedVideoFpsRangesFor.match(obj);
    }

    public int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public byte[] getSubjectKeyIdentifier() {
        return this.getHighSpeedVideoFpsRangesFor.getSubjectKeyIdentifier();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.getHighSpeedVideoFpsRangesFor.getSerialNumber();
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.getHighSpeedVideoFpsRangesFor.getIssuer();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.cms.KeyTransRecipientId) {
            return this.getHighSpeedVideoFpsRangesFor.equals(((org.bouncycastle.cms.KeyTransRecipientId) obj).getHighSpeedVideoFpsRangesFor);
        }
        return false;
    }

    @Override // org.bouncycastle.cms.RecipientId, org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cms.KeyTransRecipientId(this.getHighSpeedVideoFpsRangesFor);
    }

    public KeyTransRecipientId(byte[] bArr) {
        this(null, null, bArr);
    }

    private KeyTransRecipientId(org.bouncycastle.cert.selector.X509CertificateHolderSelector x509CertificateHolderSelector) {
        super(0);
        this.getHighSpeedVideoFpsRangesFor = x509CertificateHolderSelector;
    }

    public KeyTransRecipientId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, byte[] bArr) {
        this(new org.bouncycastle.cert.selector.X509CertificateHolderSelector(x500Name, bigInteger, bArr));
    }

    public KeyTransRecipientId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this(x500Name, bigInteger, null);
    }
}
