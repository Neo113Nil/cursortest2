package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS8EncryptedPrivateKeyInfoBuilder {
    private org.bouncycastle.asn1.pkcs.PrivateKeyInfo getHighSpeedVideoFpsRanges;

    public org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo build(org.bouncycastle.operator.OutputEncryptor outputEncryptor) {
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            java.io.OutputStream outputStream = outputEncryptor.getOutputStream(byteArrayOutputStream);
            outputStream.write(this.getHighSpeedVideoFpsRanges.getEncoded());
            outputStream.close();
            return new org.bouncycastle.pkcs.PKCS8EncryptedPrivateKeyInfo(new org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo(outputEncryptor.getAlgorithmIdentifier(), byteArrayOutputStream.toByteArray()));
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("cannot encode privateKeyInfo");
        }
    }

    public PKCS8EncryptedPrivateKeyInfoBuilder(byte[] bArr) {
        this(org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(bArr));
    }

    public PKCS8EncryptedPrivateKeyInfoBuilder(org.bouncycastle.asn1.pkcs.PrivateKeyInfo privateKeyInfo) {
        this.getHighSpeedVideoFpsRanges = privateKeyInfo;
    }
}
