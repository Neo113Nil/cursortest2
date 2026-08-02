package org.bouncycastle.cms.bc;

/* loaded from: classes17.dex */
public class BcPasswordEnvelopedRecipient extends org.bouncycastle.cms.bc.BcPasswordRecipient {
    @Override // org.bouncycastle.cms.PasswordRecipient
    public org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr, byte[] bArr2) throws org.bouncycastle.cms.CMSException {
        final java.lang.Object highSpeedVideoFpsRanges = org.bouncycastle.cms.bc.EnvelopedDataHelper.getHighSpeedVideoFpsRanges(false, extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr, bArr2), algorithmIdentifier2);
        return new org.bouncycastle.cms.RecipientOperator(new org.bouncycastle.operator.InputDecryptor() { // from class: org.bouncycastle.cms.bc.BcPasswordEnvelopedRecipient.1
            @Override // org.bouncycastle.operator.InputDecryptor
            public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                return highSpeedVideoFpsRanges instanceof org.bouncycastle.crypto.BufferedBlockCipher ? new org.bouncycastle.crypto.io.CipherInputStream(inputStream, (org.bouncycastle.crypto.BufferedBlockCipher) highSpeedVideoFpsRanges) : new org.bouncycastle.crypto.io.CipherInputStream(inputStream, (org.bouncycastle.crypto.StreamCipher) highSpeedVideoFpsRanges);
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }
        });
    }

    public BcPasswordEnvelopedRecipient(char[] cArr) {
        super(cArr);
    }
}
