package org.bouncycastle.pkcs.jcajce;

/* loaded from: classes17.dex */
public class JcaPKCS8EncryptedPrivateKeyInfoBuilder extends org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfoBuilder {
    public JcaPKCS8EncryptedPrivateKeyInfoBuilder(java.security.PrivateKey privateKey) {
        super(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(privateKey.getEncoded()));
    }
}
