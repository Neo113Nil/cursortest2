package org.bouncycastle.cms;

/* loaded from: classes17.dex */
public class KeyAgreeRecipientId extends org.bouncycastle.cms.RecipientId {
    private org.bouncycastle.cert.selector.X509CertificateHolderSelector Camera2StreamConfigurationMap;

    @Override // org.bouncycastle.util.Selector
    public boolean match(java.lang.Object obj) {
        return obj instanceof org.bouncycastle.cms.KeyAgreeRecipientInformation ? ((org.bouncycastle.cms.KeyAgreeRecipientInformation) obj).getRID().equals(this) : this.Camera2StreamConfigurationMap.match(obj);
    }

    public int hashCode() {
        return this.Camera2StreamConfigurationMap.hashCode();
    }

    public byte[] getSubjectKeyIdentifier() {
        return this.Camera2StreamConfigurationMap.getSubjectKeyIdentifier();
    }

    public java.math.BigInteger getSerialNumber() {
        return this.Camera2StreamConfigurationMap.getSerialNumber();
    }

    public org.bouncycastle.asn1.x500.X500Name getIssuer() {
        return this.Camera2StreamConfigurationMap.getIssuer();
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof org.bouncycastle.cms.KeyAgreeRecipientId) {
            return this.Camera2StreamConfigurationMap.equals(((org.bouncycastle.cms.KeyAgreeRecipientId) obj).Camera2StreamConfigurationMap);
        }
        return false;
    }

    @Override // org.bouncycastle.cms.RecipientId, org.bouncycastle.util.Selector
    public java.lang.Object clone() {
        return new org.bouncycastle.cms.KeyAgreeRecipientId(this.Camera2StreamConfigurationMap);
    }

    public KeyAgreeRecipientId(byte[] bArr) {
        this(null, null, bArr);
    }

    private KeyAgreeRecipientId(org.bouncycastle.cert.selector.X509CertificateHolderSelector x509CertificateHolderSelector) {
        super(2);
        this.Camera2StreamConfigurationMap = x509CertificateHolderSelector;
    }

    public KeyAgreeRecipientId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, byte[] bArr) {
        this(new org.bouncycastle.cert.selector.X509CertificateHolderSelector(x500Name, bigInteger, bArr));
    }

    public KeyAgreeRecipientId(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger) {
        this(x500Name, bigInteger, null);
    }
}
