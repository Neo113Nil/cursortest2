package org.bouncycastle.cert.crmf.bc;

/* loaded from: classes17.dex */
public class BcEncryptedValueBuilder extends org.bouncycastle.cert.crmf.EncryptedValueBuilder {
    public org.bouncycastle.asn1.crmf.EncryptedValue build(org.bouncycastle.crypto.params.AsymmetricKeyParameter asymmetricKeyParameter) throws org.bouncycastle.cert.crmf.CRMFException, java.io.IOException {
        return build(org.bouncycastle.crypto.util.PrivateKeyInfoFactory.createPrivateKeyInfo(asymmetricKeyParameter));
    }

    public org.bouncycastle.asn1.crmf.EncryptedValue build(java.security.cert.X509Certificate x509Certificate) throws java.security.cert.CertificateEncodingException, org.bouncycastle.cert.crmf.CRMFException {
        return build(new org.bouncycastle.cert.jcajce.JcaX509CertificateHolder(x509Certificate));
    }

    public BcEncryptedValueBuilder(org.bouncycastle.operator.KeyWrapper keyWrapper, org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
        super(keyWrapper, outputEncryptor);
    }
}
