package org.bouncycastle.pkcs;

/* loaded from: classes17.dex */
public class PKCS8EncryptedPrivateKeyInfo {
    private org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo getHighSpeedVideoFpsRanges;

    public org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo toASN1Structure() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.bouncycastle.asn1.x509.AlgorithmIdentifier getEncryptionAlgorithm() {
        return this.getHighSpeedVideoFpsRanges.getEncryptionAlgorithm();
    }

    public byte[] getEncryptedData() {
        return this.getHighSpeedVideoFpsRanges.getEncryptedData();
    }

    public byte[] getEncoded() throws java.io.IOException {
        return this.getHighSpeedVideoFpsRanges.getEncoded();
    }

    public org.bouncycastle.asn1.pkcs.PrivateKeyInfo decryptPrivateKeyInfo(org.bouncycastle.operator.InputDecryptorProvider inputDecryptorProvider) throws org.bouncycastle.pkcs.PKCSException {
        try {
            return org.bouncycastle.asn1.pkcs.PrivateKeyInfo.getInstance(org.bouncycastle.util.io.Streams.readAll(inputDecryptorProvider.get(this.getHighSpeedVideoFpsRanges.getEncryptionAlgorithm()).getInputStream(new java.io.ByteArrayInputStream(this.getHighSpeedVideoFpsRanges.getEncryptedData()))));
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("unable to read encrypted data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSException(sb.toString(), e);
        }
    }

    private static org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo getHighSpeedVideoFpsRanges(byte[] bArr) throws java.io.IOException {
        try {
            return org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo.getInstance(org.bouncycastle.asn1.ASN1Primitive.fromByteArray(bArr));
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("malformed data: ");
            sb.append(e.getMessage());
            throw new org.bouncycastle.pkcs.PKCSIOException(sb.toString(), e);
        } catch (java.lang.IllegalArgumentException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("malformed data: ");
            sb2.append(e2.getMessage());
            throw new org.bouncycastle.pkcs.PKCSIOException(sb2.toString(), e2);
        }
    }

    public PKCS8EncryptedPrivateKeyInfo(byte[] bArr) throws java.io.IOException {
        this(getHighSpeedVideoFpsRanges(bArr));
    }

    public PKCS8EncryptedPrivateKeyInfo(org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo encryptedPrivateKeyInfo) {
        this.getHighSpeedVideoFpsRanges = encryptedPrivateKeyInfo;
    }
}
