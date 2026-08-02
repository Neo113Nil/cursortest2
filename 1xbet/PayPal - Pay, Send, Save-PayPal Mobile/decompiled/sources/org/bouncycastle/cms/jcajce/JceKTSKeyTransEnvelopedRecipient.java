package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKTSKeyTransEnvelopedRecipient extends org.bouncycastle.cms.jcajce.JceKTSKeyTransRecipient {
    @Override // org.bouncycastle.cms.KeyTransRecipient
    public org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        final javax.crypto.Cipher createContentCipher = this.contentHelper.createContentCipher(extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr), algorithmIdentifier2);
        return new org.bouncycastle.cms.RecipientOperator(new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.cms.jcajce.JceKTSKeyTransEnvelopedRecipient.1
            @Override // org.bouncycastle.operator.InputDecryptor
            public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                return new org.bouncycastle.jcajce.io.CipherInputStream(inputStream, createContentCipher);
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }
        });
    }

    public JceKTSKeyTransEnvelopedRecipient(java.security.PrivateKey privateKey, org.bouncycastle.cms.KeyTransRecipientId keyTransRecipientId) throws java.io.IOException {
        super(privateKey, getPartyVInfoFromRID(keyTransRecipientId));
    }
}
