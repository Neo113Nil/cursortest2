package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class EcdhKeyAgreementWithAesKeyWrapAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jwe.KeyManagementAlgorithm {
    private org.jose4j.jwe.AesKeyWrapManagementAlgorithm getHighResolutionOutputSizeshNQ4ISI;
    private org.jose4j.jwe.EcdhKeyAgreementAlgorithm getHighSpeedVideoFpsRanges;
    private org.jose4j.jwe.ContentEncryptionKeyDescriptor getHighSpeedVideoFpsRangesFor;

    public EcdhKeyAgreementWithAesKeyWrapAlgorithm(java.lang.String str, org.jose4j.jwe.AesKeyWrapManagementAlgorithm aesKeyWrapManagementAlgorithm) {
        setAlgorithmIdentifier(str);
        setJavaAlgorithm(com.paypal.oslo.feature.identity.connect.shared.utils.AnalyticsConstants.NA);
        setKeyType("EC");
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.ASYMMETRIC);
        this.getHighResolutionOutputSizeshNQ4ISI = aesKeyWrapManagementAlgorithm;
        this.getHighSpeedVideoFpsRanges = new org.jose4j.jwe.EcdhKeyAgreementAlgorithm("alg");
        this.getHighSpeedVideoFpsRangesFor = new org.jose4j.jwe.ContentEncryptionKeyDescriptor(aesKeyWrapManagementAlgorithm.getHighSpeedVideoFpsRangesFor, org.jose4j.keys.AesKey.ALGORITHM);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt(java.security.Key key, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, byte[] bArr, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        org.jose4j.jwe.ContentEncryptionKeys manageForEncrypt = this.getHighSpeedVideoFpsRanges.manageForEncrypt(key, this.getHighSpeedVideoFpsRangesFor, headers, null, providerContext);
        return this.getHighResolutionOutputSizeshNQ4ISI.manageForEncrypt(new javax.crypto.spec.SecretKeySpec(manageForEncrypt.getContentEncryptionKey(), this.getHighSpeedVideoFpsRangesFor.getContentEncryptionKeyAlgorithm()), contentEncryptionKeyDescriptor, headers, bArr, providerContext);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForDecrypt(java.security.Key key, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return this.getHighSpeedVideoFpsRanges.prepareForDecrypt(key, headers, providerContext);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public java.security.Key manageForDecrypt(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr, org.jose4j.jwe.ContentEncryptionKeyDescriptor contentEncryptionKeyDescriptor, org.jose4j.jwx.Headers headers, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return this.getHighResolutionOutputSizeshNQ4ISI.manageForDecrypt(this.getHighResolutionOutputSizeshNQ4ISI.prepareForDecrypt(this.getHighSpeedVideoFpsRanges.manageForDecrypt(cryptoPrimitive, org.jose4j.lang.ByteUtil.EMPTY_BYTES, this.getHighSpeedVideoFpsRangesFor, headers, providerContext), headers, providerContext), bArr, contentEncryptionKeyDescriptor, headers, providerContext);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateEncryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        this.getHighSpeedVideoFpsRanges.validateEncryptionKey(key, contentEncryptionAlgorithm);
    }

    @Override // org.jose4j.jwe.KeyManagementAlgorithm
    public void validateDecryptionKey(java.security.Key key, org.jose4j.jwe.ContentEncryptionAlgorithm contentEncryptionAlgorithm) throws org.jose4j.lang.InvalidKeyException {
        this.getHighSpeedVideoFpsRanges.validateDecryptionKey(key, contentEncryptionAlgorithm);
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        return this.getHighSpeedVideoFpsRanges.isAvailable() && this.getHighResolutionOutputSizeshNQ4ISI.isAvailable();
    }

    public static class EcdhKeyAgreementWithAes128KeyWrapAlgorithm extends org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm implements org.jose4j.jwe.KeyManagementAlgorithm {
        public EcdhKeyAgreementWithAes128KeyWrapAlgorithm() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES_A128KW, new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes128().getHighSpeedVideoFpsRanges());
        }
    }

    public static class EcdhKeyAgreementWithAes192KeyWrapAlgorithm extends org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm implements org.jose4j.jwe.KeyManagementAlgorithm {
        public EcdhKeyAgreementWithAes192KeyWrapAlgorithm() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES_A192KW, new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes192().getHighSpeedVideoFpsRanges());
        }
    }

    public static class EcdhKeyAgreementWithAes256KeyWrapAlgorithm extends org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm implements org.jose4j.jwe.KeyManagementAlgorithm {
        public EcdhKeyAgreementWithAes256KeyWrapAlgorithm() {
            super(org.jose4j.jwe.KeyManagementAlgorithmIdentifiers.ECDH_ES_A256KW, new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes256().getHighSpeedVideoFpsRanges());
        }
    }
}
