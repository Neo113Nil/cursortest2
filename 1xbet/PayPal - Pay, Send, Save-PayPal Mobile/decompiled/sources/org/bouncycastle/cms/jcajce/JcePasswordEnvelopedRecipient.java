package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JcePasswordEnvelopedRecipient extends org.bouncycastle.cms.jcajce.JcePasswordRecipient {
    @Override // org.bouncycastle.cms.PasswordRecipient
    public org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws org.bouncycastle.cms.CMSException {
        final javax.crypto.Cipher createContentCipher = this.helper.createContentCipher(extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr, bArr2), algorithmIdentifier2);
        return new org.bouncycastle.cms.RecipientOperator(new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.cms.jcajce.JcePasswordEnvelopedRecipient.1
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

    public JcePasswordEnvelopedRecipient(char[] cArr) {
        super(cArr);
    }
}
