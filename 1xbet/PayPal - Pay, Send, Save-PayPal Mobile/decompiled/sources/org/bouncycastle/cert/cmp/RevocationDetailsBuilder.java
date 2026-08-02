package org.bouncycastle.cert.cmp;

/* loaded from: classes17.dex */
public class RevocationDetailsBuilder {
    private org.bouncycastle.asn1.crmf.CertTemplateBuilder getHighSpeedVideoSizes = new org.bouncycastle.asn1.crmf.CertTemplateBuilder();

    public org.bouncycastle.cert.cmp.RevocationDetailsBuilder setSubject(org.bouncycastle.asn1.x500.X500Name x500Name) {
        if (x500Name != null) {
            this.getHighSpeedVideoSizes.setSubject(x500Name);
        }
        return this;
    }

    public org.bouncycastle.cert.cmp.RevocationDetailsBuilder setSerialNumber(java.math.BigInteger bigInteger) {
        if (bigInteger != null) {
            this.getHighSpeedVideoSizes.setSerialNumber(new org.bouncycastle.asn1.ASN1Integer(bigInteger));
        }
        return this;
    }

    public org.bouncycastle.cert.cmp.RevocationDetailsBuilder setPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo subjectPublicKeyInfo) {
        if (subjectPublicKeyInfo != null) {
            this.getHighSpeedVideoSizes.setPublicKey(subjectPublicKeyInfo);
        }
        return this;
    }

    public org.bouncycastle.cert.cmp.RevocationDetailsBuilder setIssuer(org.bouncycastle.asn1.x500.X500Name x500Name) {
        if (x500Name != null) {
            this.getHighSpeedVideoSizes.setIssuer(x500Name);
        }
        return this;
    }

    public org.bouncycastle.cert.cmp.RevocationDetails build() {
        return new org.bouncycastle.cert.cmp.RevocationDetails(new org.bouncycastle.asn1.cmp.RevDetails(this.getHighSpeedVideoSizes.build()));
    }
}
