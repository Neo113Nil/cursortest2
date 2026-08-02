package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcaPKCS10CertificationRequestBuilder extends org.bouncycastle.pkcs.PKCS10CertificationRequestBuilder {
    public JcaPKCS10CertificationRequestBuilder(org.bouncycastle.asn1.x500.X500Name x500Name, java.security.PublicKey publicKey) {
        super(x500Name, org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }

    public JcaPKCS10CertificationRequestBuilder(javax.security.auth.x500.X500Principal x500Principal, java.security.PublicKey publicKey) {
        super(org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()), org.bouncycastle.asn1.x509.SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
    }
}
