package org.jose4j.jwa;

/* loaded from: classes18.dex */
public class AlgorithmFactoryFactory {
    private static final org.slf4j.Logger Camera2StreamConfigurationMap = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwa.AlgorithmFactoryFactory.class);
    private static final org.jose4j.jwa.AlgorithmFactoryFactory getHighSpeedVideoSizes = new org.jose4j.jwa.AlgorithmFactoryFactory();
    private org.jose4j.jwa.AlgorithmFactory<org.jose4j.jwe.ContentEncryptionAlgorithm> getHighResolutionOutputSizeshNQ4ISI;
    private org.jose4j.jwa.AlgorithmFactory<org.jose4j.jwe.KeyManagementAlgorithm> getHighSpeedVideoFpsRanges;
    private org.jose4j.jwa.AlgorithmFactory<org.jose4j.zip.CompressionAlgorithm> getHighSpeedVideoFpsRangesFor;
    private org.jose4j.jwa.AlgorithmFactory<org.jose4j.jws.JsonWebSignatureAlgorithm> getHighSpeedVideoSizesFor;

    private AlgorithmFactoryFactory() {
        java.lang.String property = java.lang.System.getProperty("java.version");
        java.lang.String property2 = java.lang.System.getProperty("java.vendor");
        java.lang.String property3 = java.lang.System.getProperty("java.home");
        java.lang.String arrays = java.util.Arrays.toString(java.security.Security.getProviders());
        org.slf4j.Logger logger = Camera2StreamConfigurationMap;
        logger.debug("Initializing jose4j (running with Java {} from {} at {} with {} security providers installed)...", property, property2, property3, arrays);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        org.jose4j.jwa.AlgorithmFactory<org.jose4j.jws.JsonWebSignatureAlgorithm> algorithmFactory = new org.jose4j.jwa.AlgorithmFactory<>("alg", org.jose4j.jws.JsonWebSignatureAlgorithm.class);
        this.getHighSpeedVideoSizesFor = algorithmFactory;
        algorithmFactory.registerAlgorithm(new org.jose4j.jws.UnsecuredNoneAlgorithm());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.HmacUsingShaAlgorithm.HmacSha256());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.HmacUsingShaAlgorithm.HmacSha384());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.HmacUsingShaAlgorithm.HmacSha512());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.EdDsaAlgorithm());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.EcdsaUsingShaAlgorithm.EcdsaP256UsingSha256());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.EcdsaUsingShaAlgorithm.EcdsaP384UsingSha384());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.EcdsaUsingShaAlgorithm.EcdsaP521UsingSha512());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.EcdsaUsingShaAlgorithm.EcdsaSECP256K1UsingSha256());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.RsaUsingShaAlgorithm.RsaSha256());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.RsaUsingShaAlgorithm.RsaSha384());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.RsaUsingShaAlgorithm.RsaSha512());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.RsaUsingShaAlgorithm.RsaPssSha256());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.RsaUsingShaAlgorithm.RsaPssSha384());
        this.getHighSpeedVideoSizesFor.registerAlgorithm(new org.jose4j.jws.RsaUsingShaAlgorithm.RsaPssSha512());
        logger.debug("JWS signature algorithms: {}", this.getHighSpeedVideoSizesFor.getSupportedAlgorithms());
        org.jose4j.jwa.AlgorithmFactory<org.jose4j.jwe.KeyManagementAlgorithm> algorithmFactory2 = new org.jose4j.jwa.AlgorithmFactory<>("alg", org.jose4j.jwe.KeyManagementAlgorithm.class);
        this.getHighSpeedVideoFpsRanges = algorithmFactory2;
        algorithmFactory2.registerAlgorithm(new org.jose4j.jwe.RsaKeyManagementAlgorithm.Rsa1_5());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.RsaKeyManagementAlgorithm.RsaOaep());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.RsaKeyManagementAlgorithm.RsaOaep256());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.DirectKeyManagementAlgorithm());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes128());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes192());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.AesKeyWrapManagementAlgorithm.Aes256());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.EcdhKeyAgreementAlgorithm());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm.EcdhKeyAgreementWithAes128KeyWrapAlgorithm());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm.EcdhKeyAgreementWithAes192KeyWrapAlgorithm());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.EcdhKeyAgreementWithAesKeyWrapAlgorithm.EcdhKeyAgreementWithAes256KeyWrapAlgorithm());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm.HmacSha256Aes128());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm.HmacSha384Aes192());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.Pbes2HmacShaWithAesKeyWrapAlgorithm.HmacSha512Aes256());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm.Aes128Gcm());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm.Aes192Gcm());
        this.getHighSpeedVideoFpsRanges.registerAlgorithm(new org.jose4j.jwe.AesGcmKeyEncryptionAlgorithm.Aes256Gcm());
        logger.debug("JWE key management algorithms: {}", this.getHighSpeedVideoFpsRanges.getSupportedAlgorithms());
        org.jose4j.jwa.AlgorithmFactory<org.jose4j.jwe.ContentEncryptionAlgorithm> algorithmFactory3 = new org.jose4j.jwa.AlgorithmFactory<>("enc", org.jose4j.jwe.ContentEncryptionAlgorithm.class);
        this.getHighResolutionOutputSizeshNQ4ISI = algorithmFactory3;
        algorithmFactory3.registerAlgorithm(new org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm.Aes128CbcHmacSha256());
        this.getHighResolutionOutputSizeshNQ4ISI.registerAlgorithm(new org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm.Aes192CbcHmacSha384());
        this.getHighResolutionOutputSizeshNQ4ISI.registerAlgorithm(new org.jose4j.jwe.AesCbcHmacSha2ContentEncryptionAlgorithm.Aes256CbcHmacSha512());
        this.getHighResolutionOutputSizeshNQ4ISI.registerAlgorithm(new org.jose4j.jwe.AesGcmContentEncryptionAlgorithm.Aes128Gcm());
        this.getHighResolutionOutputSizeshNQ4ISI.registerAlgorithm(new org.jose4j.jwe.AesGcmContentEncryptionAlgorithm.Aes192Gcm());
        this.getHighResolutionOutputSizeshNQ4ISI.registerAlgorithm(new org.jose4j.jwe.AesGcmContentEncryptionAlgorithm.Aes256Gcm());
        logger.debug("JWE content encryption algorithms: {}", this.getHighResolutionOutputSizeshNQ4ISI.getSupportedAlgorithms());
        org.jose4j.jwa.AlgorithmFactory<org.jose4j.zip.CompressionAlgorithm> algorithmFactory4 = new org.jose4j.jwa.AlgorithmFactory<>("zip", org.jose4j.zip.CompressionAlgorithm.class);
        this.getHighSpeedVideoFpsRangesFor = algorithmFactory4;
        algorithmFactory4.registerAlgorithm(new org.jose4j.zip.DeflateRFC1951CompressionAlgorithm());
        logger.debug("JWE compression algorithms: {}", this.getHighSpeedVideoFpsRangesFor.getSupportedAlgorithms());
        logger.debug("Initialized jose4j in {}ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    public static org.jose4j.jwa.AlgorithmFactoryFactory getInstance() {
        return getHighSpeedVideoSizes;
    }

    public org.jose4j.jwa.AlgorithmFactory<org.jose4j.jws.JsonWebSignatureAlgorithm> getJwsAlgorithmFactory() {
        return this.getHighSpeedVideoSizesFor;
    }

    public org.jose4j.jwa.AlgorithmFactory<org.jose4j.jwe.KeyManagementAlgorithm> getJweKeyManagementAlgorithmFactory() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public org.jose4j.jwa.AlgorithmFactory<org.jose4j.jwe.ContentEncryptionAlgorithm> getJweContentEncryptionAlgorithmFactory() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public org.jose4j.jwa.AlgorithmFactory<org.jose4j.zip.CompressionAlgorithm> getCompressionAlgorithmFactory() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
