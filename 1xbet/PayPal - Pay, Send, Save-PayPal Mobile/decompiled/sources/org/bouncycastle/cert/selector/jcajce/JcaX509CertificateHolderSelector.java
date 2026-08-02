package org.bouncycastle.cert.selector.jcajce;

/* loaded from: classes17.dex */
public class JcaX509CertificateHolderSelector extends org.bouncycastle.cert.selector.X509CertificateHolderSelector {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JcaX509CertificateHolderSelector(java.security.cert.X509Certificate x509Certificate) {
        super(r0, r2, r5 != null ? org.bouncycastle.asn1.ASN1OctetString.getInstance(org.bouncycastle.asn1.ASN1OctetString.getInstance(r5).getOctets()).getOctets() : null);
        javax.security.auth.x500.X500Principal issuerX500Principal = x509Certificate.getIssuerX500Principal();
        org.bouncycastle.asn1.x500.X500Name x500Name = issuerX500Principal == null ? null : org.bouncycastle.asn1.x500.X500Name.getInstance(issuerX500Principal.getEncoded());
        java.math.BigInteger serialNumber = x509Certificate.getSerialNumber();
        byte[] extensionValue = x509Certificate.getExtensionValue(org.bouncycastle.asn1.x509.Extension.subjectKeyIdentifier.getId());
    }

    public JcaX509CertificateHolderSelector(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger) {
        super(x500Principal == null ? null : org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), bigInteger);
    }

    public JcaX509CertificateHolderSelector(javax.security.auth.x500.X500Principal x500Principal, java.math.BigInteger bigInteger, byte[] bArr) {
        super(x500Principal == null ? null : org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), bigInteger, bArr);
    }
}
