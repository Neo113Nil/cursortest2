package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
public class JcaCertificateRequestMessageBuilder extends org.bouncycastle.cert.crmf.CertificateRequestMessageBuilder {
    public org.bouncycastle.cert.crmf.jcajce.JcaCertificateRequestMessageBuilder setSubject(javax.security.auth.x500.X500Principal x500Principal) {
        if (x500Principal != null) {
            setSubject(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()));
        }
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JcaCertificateRequestMessageBuilder setPublicKey(java.security.PublicKey publicKey) {
        setPublicKey(org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JcaCertificateRequestMessageBuilder setIssuer(javax.security.auth.x500.X500Principal x500Principal) {
        if (x500Principal != null) {
            setIssuer(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()));
        }
        return this;
    }

    public org.bouncycastle.cert.crmf.jcajce.JcaCertificateRequestMessageBuilder setAuthInfoSender(javax.security.auth.x500.X500Principal x500Principal) {
        if (x500Principal != null) {
            setAuthInfoSender(new org.bouncycastle.asn1.x509.GeneralName(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded())));
        }
        return this;
    }

    public JcaCertificateRequestMessageBuilder(java.math.BigInteger bigInteger) {
        super(bigInteger);
    }
}
