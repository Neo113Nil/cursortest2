package org.bouncycastle.openssl.jcajce;

/* loaded from: classes17.dex */
public class JcaPKCS8Generator extends org.bouncycastle.openssl.PKCS8Generator {
    public JcaPKCS8Generator(java.security.PrivateKey privateKey, org.bouncycastle.operator.OutputEncryptor outputEncryptor) throws org.bouncycastle.util.io.pem.PemGenerationException {
        super(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(privateKey.getEncoded()), outputEncryptor);
    }
}
