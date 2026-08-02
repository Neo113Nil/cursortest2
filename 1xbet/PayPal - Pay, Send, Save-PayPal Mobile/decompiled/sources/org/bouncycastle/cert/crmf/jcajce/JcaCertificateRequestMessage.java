package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
public class JcaCertificateRequestMessage extends org.bouncycastle.cert.crmf.CertificateRequestMessage {
    private org.bouncycastle.cert.crmf.jcajce.CRMFHelper getHighSpeedVideoSizes;

    public org.bouncycastle.cert.crmf.jcajce.JcaCertificateRequestMessage setProvider(java.security.Provider provider) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.ProviderJcaJceHelper(provider));
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JcaCertificateRequestMessage setProvider(java.lang.String str) {
        this.getHighSpeedVideoSizes = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.NamedJcaJceHelper(str));
        return this;
    }

    public javax.security.auth.x500.X500Principal getSubjectX500Principal() {
        org.bouncycastle.asn1.x500.X500Name subject = getCertTemplate().getSubject();
        if (subject == null) {
            return null;
        }
        try {
            return new javax.security.auth.x500.X500Principal(subject.getEncoded(org.bouncycastle.asn1.ASN1Encoding.DER));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to construct DER encoding of name: ");
            sb.append(e.getMessage());
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    public java.security.PublicKey getPublicKey() throws org.bouncycastle.cert.crmf.CRMFException {
        org.bouncycastle.asn1.x509.SubjectPublicKeyInfo publicKey = getCertTemplate().getPublicKey();
        if (publicKey != null) {
            return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(publicKey);
        }
        return null;
    }

    public JcaCertificateRequestMessage(byte[] bArr) {
        this(org.bouncycastle.asn1.crmf.CertReqMsg.getInstance(bArr));
    }

    public JcaCertificateRequestMessage(org.bouncycastle.cert.crmf.CertificateRequestMessage certificateRequestMessage) {
        this(certificateRequestMessage.toASN1Structure());
    }

    public JcaCertificateRequestMessage(org.bouncycastle.asn1.crmf.CertReqMsg certReqMsg) {
        super(certReqMsg);
        this.getHighSpeedVideoSizes = new org.bouncycastle.cert.crmf.jcajce.CRMFHelper(new org.bouncycastle.jcajce.util.DefaultJcaJceHelper());
    }
}
