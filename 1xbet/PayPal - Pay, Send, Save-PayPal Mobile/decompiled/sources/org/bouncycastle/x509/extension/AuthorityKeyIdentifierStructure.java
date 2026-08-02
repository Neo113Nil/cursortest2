package org.bouncycastle.x509.extension;

/* loaded from: classes17.dex */
public class AuthorityKeyIdentifierStructure extends org.bouncycastle.asn1.x509.AuthorityKeyIdentifier {
    private static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        try {
            return (org.bouncycastle.asn1.ASN1Sequence) new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())).toASN1Primitive();
        } catch (java.lang.Exception e) {
            throw new java.security.InvalidKeyException("can't process key: ".concat(java.lang.String.valueOf(e)));
        }
    }

    private static org.bouncycastle.asn1.ASN1Sequence getHighSpeedVideoSizes(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        org.bouncycastle.asn1.x509.AuthorityKeyIdentifier authorityKeyIdentifier;
        try {
            if (x509Certificate.getVersion() != 3) {
                authorityKeyIdentifier = new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()), new org.bouncycastle.asn1.x509.GeneralNames(new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.jce.PrincipalUtil.getIssuerX509Principal(x509Certificate))), x509Certificate.getSerialNumber());
            } else {
                org.bouncycastle.asn1.x509.GeneralName generalName = new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.jce.PrincipalUtil.getIssuerX509Principal(x509Certificate));
                byte[] extensionValue = x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.subjectKeyIdentifier.getId());
                authorityKeyIdentifier = extensionValue != null ? new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier(((org.bouncycastle.asn1.ASN1OctetString) org.bouncycastle.x509.extension.X509ExtensionUtil.fromExtensionValue(extensionValue)).getOctets(), new org.bouncycastle.asn1.x509.GeneralNames(generalName), x509Certificate.getSerialNumber()) : new org.bouncycastle.asn1.x509.AuthorityKeyIdentifier(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(x509Certificate.getPublicKey().getEncoded()), new org.bouncycastle.asn1.x509.GeneralNames(generalName), x509Certificate.getSerialNumber());
            }
            return (org.bouncycastle.asn1.ASN1Sequence) authorityKeyIdentifier.toASN1Primitive();
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Exception extracting certificate details: ");
            sb.append(e.toString());
            throw new java.security.cert.CertificateParsingException(sb.toString());
        }
    }

    public AuthorityKeyIdentifierStructure(byte[] bArr) throws java.io.IOException {
        super((org.bouncycastle.asn1.ASN1Sequence) org.bouncycastle.x509.extension.X509ExtensionUtil.fromExtensionValue(bArr));
    }

    public AuthorityKeyIdentifierStructure(org.bouncycastle.asn1.x509.X509Extension x509Extension) {
        super((org.bouncycastle.asn1.ASN1Sequence) x509Extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(org.bouncycastle.asn1.x509.Extension extension) {
        super((org.bouncycastle.asn1.ASN1Sequence) extension.getParsedValue());
    }

    public AuthorityKeyIdentifierStructure(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateParsingException {
        super(getHighSpeedVideoSizes(x509Certificate));
    }

    public AuthorityKeyIdentifierStructure(java.security.PublicKey publicKey) throws java.security.InvalidKeyException {
        super(getHighSpeedVideoSizes(publicKey));
    }
}
