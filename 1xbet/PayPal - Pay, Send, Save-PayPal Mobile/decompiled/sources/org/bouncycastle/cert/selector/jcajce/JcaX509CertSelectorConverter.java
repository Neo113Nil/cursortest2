package org.bouncycastle.cert.selector.jcajce;

/* loaded from: classes17.dex */
public class JcaX509CertSelectorConverter {
    public java.security.cert.X509CertSelector getCertSelector(org.bouncycastle.cert.selector.X509CertificateHolderSelector x509CertificateHolderSelector) {
        return doConversion(x509CertificateHolderSelector.getIssuer(), x509CertificateHolderSelector.getSerialNumber(), x509CertificateHolderSelector.getSubjectKeyIdentifier());
    }

    protected java.security.cert.X509CertSelector doConversion(org.bouncycastle.asn1.x500.X500Name x500Name, java.math.BigInteger bigInteger, byte[] bArr) {
        java.security.cert.X509CertSelector x509CertSelector = new java.security.cert.X509CertSelector();
        if (x500Name != null) {
            try {
                x509CertSelector.setIssuer(x500Name.getEncoded());
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to convert issuer: ");
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        if (bigInteger != null) {
            x509CertSelector.setSerialNumber(bigInteger);
        }
        if (bArr == null) {
            return x509CertSelector;
        }
        try {
            x509CertSelector.setSubjectKeyIdentifier(new org.bouncycastle.asn1.DEROctetString(bArr).getEncoded());
            return x509CertSelector;
        } catch (java.io.IOException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("unable to convert issuer: ");
            sb2.append(e2.getMessage());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }
}
