package org.bouncycastle.cert.crmf.jcajce;

/* loaded from: classes17.dex */
public class JcaPKIArchiveControlBuilder extends org.bouncycastle.cert.crmf.PKIArchiveControlBuilder {
    public JcaPKIArchiveControlBuilder(java.security.PrivateKey privateKey, org.bouncycastle.asn1.x509.GeneralName generalName) {
        super(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(privateKey.getEncoded()), generalName);
    }

    public JcaPKIArchiveControlBuilder(java.security.PrivateKey privateKey, org.bouncycastle.asn1.x500.X500Name x500Name) {
        this(privateKey, new org.bouncycastle.asn1.x509.GeneralName(x500Name));
    }

    public JcaPKIArchiveControlBuilder(java.security.PrivateKey privateKey, javax.security.auth.x500.X500Principal x500Principal) {
        this(privateKey, org.bouncycastle.asn1.x500.X500Name.getInstance(x500Principal.getEncoded()));
    }
}
