package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class AesCbcHmacSha2ContentEncryptionAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.ContentEncryptionAlgorithm {
    public static final int IV_BYTE_LENGTH = 16;
    private final int Camera2StreamConfigurationMap;
    private final org.jose4j.jwe.ContentEncryptionKeyDescriptor getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public AesCbcHmacSha2ContentEncryptionAlgorithm(java.lang.String str, int i, java.lang.String str2, int i2) {
        setAlgorithmIdentifier(str);
        this.getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwe.ContentEncryptionKeyDescriptor(i, org.jose4j.keys.AesKey.ALGORITHM);
        this.getHighSpeedVideoFpsRangesFor = str2;
        this.Camera2StreamConfigurationMap = i2;
        setJavaAlgorithm("AES/CBC/PKCS5Padding");
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.SYMMETRIC);
        setKeyType(org.jose4j.keys.AesKey.ALGORITHM);
    }

    public java.lang.String getHmacJavaAlgorithm() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public int getTagTruncationLength() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.jose4j.jwe.ContentEncryptionAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeyDescriptor getContentEncryptionKeyDescriptor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // org.jose4j.jwe.ContentEncryptionAlgorithm
    public org.jose4j.jwe.ContentEncryptionParts encrypt(byte[] bArr, byte[] bArr2, byte[] bArr3, org.jose4j.jwx.Headers headers, byte[] bArr4, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return getHighSpeedVideoFpsRanges(bArr, bArr2, bArr3, org.jose4j.jwe.InitializationVectorHelp.Camera2StreamConfigurationMap(16, bArr4, providerContext.getSecureRandom()), headers, providerContext);
    }

    private org.jose4j.jwe.ContentEncryptionParts getHighSpeedVideoFpsRanges(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        org.jose4j.keys.HmacKey hmacKey = new org.jose4j.keys.HmacKey(org.jose4j.lang.ByteUtil.leftHalf(bArr3));
        org.jose4j.keys.AesKey aesKey = new org.jose4j.keys.AesKey(org.jose4j.lang.ByteUtil.rightHalf(bArr3));
        javax.crypto.Cipher highResolutionOutputSizeshNQ4ISI = org.jose4j.jwe.CipherUtil.getHighResolutionOutputSizeshNQ4ISI(getJavaAlgorithm(), org.jose4j.jwe.ContentEncryptionHelp.getHighSpeedVideoSizes(headers, providerContext));
        try {
            highResolutionOutputSizeshNQ4ISI.init(1, aesKey, new javax.crypto.spec.IvParameterSpec(bArr4));
            try {
                byte[] doFinal = highResolutionOutputSizeshNQ4ISI.doFinal(bArr);
                return new org.jose4j.jwe.ContentEncryptionParts(bArr4, doFinal, org.jose4j.lang.ByteUtil.subArray(org.jose4j.mac.MacUtil.getInitializedMac(getHmacJavaAlgorithm(), hmacKey, org.jose4j.jwe.ContentEncryptionHelp.getHighSpeedVideoFpsRangesFor(headers, providerContext)).doFinal(org.jose4j.lang.ByteUtil.concat(bArr2, bArr4, doFinal, org.jose4j.lang.ByteUtil.getBytes(org.jose4j.lang.ByteUtil.bitLength(bArr2)))), 0, getTagTruncationLength()));
            } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException e) {
                throw new org.jose4j.lang.JoseException(e.toString(), e);
            }
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            throw new org.jose4j.lang.JoseException(e2.toString(), e2);
        } catch (java.security.InvalidKeyException e3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid key for ");
            sb.append(getJavaAlgorithm());
            throw new org.jose4j.lang.JoseException(sb.toString(), e3);
        }
    }

    @Override // org.jose4j.jwe.ContentEncryptionAlgorithm
    public byte[] decrypt(org.jose4j.jwe.ContentEncryptionParts contentEncryptionParts, byte[] bArr, byte[] bArr2, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        java.lang.String highSpeedVideoSizes = org.jose4j.jwe.ContentEncryptionHelp.getHighSpeedVideoSizes(headers, providerContext);
        java.lang.String highSpeedVideoFpsRangesFor = org.jose4j.jwe.ContentEncryptionHelp.getHighSpeedVideoFpsRangesFor(headers, providerContext);
        byte[] iv = contentEncryptionParts.getIv();
        byte[] ciphertext = contentEncryptionParts.getCiphertext();
        byte[] authenticationTag = contentEncryptionParts.getAuthenticationTag();
        if (!org.jose4j.lang.ByteUtil.secureEquals(authenticationTag, org.jose4j.lang.ByteUtil.subArray(org.jose4j.mac.MacUtil.getInitializedMac(getHmacJavaAlgorithm(), new org.jose4j.keys.HmacKey(org.jose4j.lang.ByteUtil.leftHalf(bArr2)), highSpeedVideoFpsRangesFor).doFinal(org.jose4j.lang.ByteUtil.concat(bArr, iv, ciphertext, org.jose4j.lang.ByteUtil.getBytes(org.jose4j.lang.ByteUtil.bitLength(bArr)))), 0, getTagTruncationLength()))) {
            throw new org.jose4j.lang.IntegrityException("Authentication tag check failed. Message=".concat(java.lang.String.valueOf(new org.jose4j.base64url.Base64Url().base64UrlEncode(authenticationTag))));
        }
        org.jose4j.keys.AesKey aesKey = new org.jose4j.keys.AesKey(org.jose4j.lang.ByteUtil.rightHalf(bArr2));
        javax.crypto.Cipher highResolutionOutputSizeshNQ4ISI = org.jose4j.jwe.CipherUtil.getHighResolutionOutputSizeshNQ4ISI(getJavaAlgorithm(), highSpeedVideoSizes);
        try {
            highResolutionOutputSizeshNQ4ISI.init(2, aesKey, new javax.crypto.spec.IvParameterSpec(iv));
            try {
                return highResolutionOutputSizeshNQ4ISI.doFinal(ciphertext);
            } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException e) {
                throw new org.jose4j.lang.JoseException(e.toString(), e);
            }
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            throw new org.jose4j.lang.JoseException(e2.toString(), e2);
        } catch (java.security.InvalidKeyException e3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid key for ");
            sb.append(getJavaAlgorithm());
            throw new org.jose4j.lang.JoseException(sb.toString(), e3);
        }
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return org.jose4j.jwe.CipherStrengthSupport.isAvailable(getJavaAlgorithm(), getContentEncryptionKeyDescriptor().getContentEncryptionKeyByteLength() / 2);
    }

    public static class Aes128CbcHmacSha256 extends org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm implements org.jose4j.jwe.ContentEncryptionAlgorithm {
        public Aes128CbcHmacSha256() {
            super(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_128_CBC_HMAC_SHA_256, 32, org.jose4j.mac.MacUtil.HMAC_SHA256, 16);
        }
    }

    public static class Aes192CbcHmacSha384 extends org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm implements org.jose4j.jwe.ContentEncryptionAlgorithm {
        public Aes192CbcHmacSha384() {
            super(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_192_CBC_HMAC_SHA_384, 48, org.jose4j.mac.MacUtil.HMAC_SHA384, 24);
        }
    }

    public static class Aes256CbcHmacSha512 extends org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm implements org.jose4j.jwe.ContentEncryptionAlgorithm {
        public Aes256CbcHmacSha512() {
            super(org.jose4j.jwe.ContentEncryptionAlgorithmIdentifiers.AES_256_CBC_HMAC_SHA_512, 64, org.jose4j.mac.MacUtil.HMAC_SHA512, 32);
        }
    }
}
