package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class AesGcmContentEncryptionAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.ContentEncryptionAlgorithm {
    private org.jose4j.jwe.SimpleAeadCipher getHighSpeedVideoFpsRanges;
    private org.jose4j.jwe.ContentEncryptionKeyDescriptor getHighSpeedVideoFpsRangesFor;

    public AesGcmContentEncryptionAlgorithm(java.lang.String str, int i) {
        setAlgorithmIdentifier(str);
        setJavaAlgorithm(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.SYMMETRIC);
        setKeyType(org.jose4j.keys.AesKey.ALGORITHM);
        this.getHighSpeedVideoFpsRangesFor = new org.jose4j.jwe.ContentEncryptionKeyDescriptor(org.jose4j.lang.ByteUtil.byteLength(i), org.jose4j.keys.AesKey.ALGORITHM);
        this.getHighSpeedVideoFpsRanges = new org.jose4j.jwe.SimpleAeadCipher(getJavaAlgorithm(), 16);
    }

    @Override // org.jose4j.jwe.ContentEncryptionAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeyDescriptor getContentEncryptionKeyDescriptor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.jose4j.jwe.ContentEncryptionAlgorithm
    public org.jose4j.jwe.ContentEncryptionParts encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, org.jose4j.jwx.Headers headers, byte[] bArr4, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return encrypt(bArr, bArr2, bArr3, org.jose4j.jwe.InitializationVectorHelp.Camera2StreamConfigurationMap(12, bArr4, providerContext.getSecureRandom()), org.jose4j.jwe.ContentEncryptionHelp.getHighSpeedVideoSizes(headers, providerContext));
    }

    public org.jose4j.jwe.ContentEncryptionParts encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.lang.String str) throws org.jose4j.lang.JoseException {
        org.jose4j.jwe.SimpleAeadCipher.CipherOutput encrypt = this.getHighSpeedVideoFpsRanges.encrypt(new org.jose4j.keys.AesKey(bArr3), bArr4, bArr, bArr2, str);
        return new org.jose4j.jwe.ContentEncryptionParts(bArr4, encrypt.getCiphertext(), encrypt.getTag());
    }

    @Override // org.jose4j.jwe.ContentEncryptionAlgorithm
    public byte[] decrypt(org.jose4j.jwe.ContentEncryptionParts contentEncryptionParts, byte[] bArr, byte[] bArr2, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        byte[] iv = contentEncryptionParts.getIv();
        return this.getHighSpeedVideoFpsRanges.decrypt(new org.jose4j.keys.AesKey(bArr2), iv, contentEncryptionParts.getCiphertext(), contentEncryptionParts.getAuthenticationTag(), bArr, org.jose4j.jwe.ContentEncryptionHelp.getHighSpeedVideoSizes(headers, providerContext));
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return this.getHighSpeedVideoFpsRanges.isAvailable(this.log, getContentEncryptionKeyDescriptor().getContentEncryptionKeyByteLength(), 12, getAlgorithmIdentifier());
    }

    public static class Aes256Gcm extends org.jose4j.jwe.AesGcmContentEncryptionAlgorithm {
        public Aes256Gcm() {
            super(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_256_GCM, 256);
        }
    }

    public static class Aes192Gcm extends org.jose4j.jwe.AesGcmContentEncryptionAlgorithm {
        public Aes192Gcm() {
            super(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_192_GCM, 192);
        }
    }

    public static class Aes128Gcm extends org.jose4j.jwe.AesGcmContentEncryptionAlgorithm {
        public Aes128Gcm() {
            super(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_128_GCM, 128);
        }
    }
}
