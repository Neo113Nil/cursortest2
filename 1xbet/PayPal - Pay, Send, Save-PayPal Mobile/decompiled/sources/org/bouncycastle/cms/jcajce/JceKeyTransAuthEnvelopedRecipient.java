package org.bouncycastle.cms.jcajce;

/* loaded from: classes17.dex */
public class JceKeyTransAuthEnvelopedRecipient extends org.bouncycastle.cms.jcajce.JceKeyTransRecipient {

    static class AADStream extends java.io.OutputStream {
        private javax.crypto.Cipher getHighResolutionOutputSizeshNQ4ISI;
        private byte[] getHighSpeedVideoSizes = new byte[1];

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws java.io.IOException {
            this.getHighResolutionOutputSizeshNQ4ISI.updateAAD(bArr, i, i2);
        }

        @Override // java.io.OutputStream
        public void write(int i) throws java.io.IOException {
            byte[] bArr = this.getHighSpeedVideoSizes;
            bArr[0] = (byte) i;
            this.getHighResolutionOutputSizeshNQ4ISI.updateAAD(bArr);
        }

        public AADStream(javax.crypto.Cipher cipher) {
            this.getHighResolutionOutputSizeshNQ4ISI = cipher;
        }
    }

    @Override // org.bouncycastle.cms.KeyTransRecipient
    public org.bouncycastle.cms.RecipientOperator getRecipientOperator(org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier, final org.bouncycastle.asn1.x509.AlgorithmIdentifier algorithmIdentifier2, byte[] bArr) throws org.bouncycastle.cms.CMSException {
        final javax.crypto.Cipher createContentCipher = this.contentHelper.createContentCipher(extractSecretKey(algorithmIdentifier, algorithmIdentifier2, bArr), algorithmIdentifier2);
        return new org.bouncycastle.cms.RecipientOperator(new org.bouncycastle.operator.InputAEADDecryptor() { // from class: org.bouncycastle.cms.jcajce.JceKeyTransAuthEnvelopedRecipient.1
            @Override // org.bouncycastle.operator.AADProcessor
            public byte[] getMAC() {
                return new byte[0];
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public java.io.InputStream getInputStream(java.io.InputStream inputStream) {
                return new org.bouncycastle.jcajce.io.CipherInputStream(inputStream, createContentCipher);
            }

            @Override // org.bouncycastle.operator.InputDecryptor
            public org.bouncycastle.asn1.x509.AlgorithmIdentifier getAlgorithmIdentifier() {
                return algorithmIdentifier2;
            }

            @Override // org.bouncycastle.operator.AADProcessor
            public java.io.OutputStream getAADStream() {
                return new org.bouncycastle.cms.jcajce.JceKeyTransAuthEnvelopedRecipient.AADStream(createContentCipher);
            }
        });
    }

    public JceKeyTransAuthEnvelopedRecipient(java.security.PrivateKey privateKey) {
        super(privateKey);
    }
}
