package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcaSelectorConverter {
    public org.bouncycastle.cms.SignerId getSignerId(java.security.cert.X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new org.bouncycastle.cms.SignerId(org.bouncycastle.asn1.x500.X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), org.bouncycastle.asn1.ASN1OctetString.getInstance(x509CertSelector.getSubjectKeyIdentifier()).getOctets()) : new org.bouncycastle.cms.SignerId(org.bouncycastle.asn1.x500.X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to convert issuer: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    public org.bouncycastle.cms.KeyTransRecipientId getKeyTransRecipientId(java.security.cert.X509CertSelector x509CertSelector) {
        try {
            return x509CertSelector.getSubjectKeyIdentifier() != null ? new org.bouncycastle.cms.KeyTransRecipientId(org.bouncycastle.asn1.x500.X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber(), org.bouncycastle.asn1.ASN1OctetString.getInstance(x509CertSelector.getSubjectKeyIdentifier()).getOctets()) : new org.bouncycastle.cms.KeyTransRecipientId(org.bouncycastle.asn1.x500.X500Name.getInstance(x509CertSelector.getIssuerAsBytes()), x509CertSelector.getSerialNumber());
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to convert issuer: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }
}
