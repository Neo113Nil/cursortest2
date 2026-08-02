package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPssSignConscrypt implements com.google.crypto.tink.PublicKeySign {
    private final java.security.Provider conscrypt;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final java.security.spec.PSSParameterSpec parameterSpec;
    private final java.security.interfaces.RSAPrivateCrtKey privateKey;
    private final java.lang.String signatureAlgorithm;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.RsaSsaPssPrivateKey rsaSsaPssPrivateKey) throws java.security.GeneralSecurityException {
        return createWithProvider(rsaSsaPssPrivateKey, com.google.crypto.tink.signature.internal.RsaSsaPssVerifyConscrypt.conscryptProviderOrNull());
    }

    public static com.google.crypto.tink.PublicKeySign createWithProvider(com.google.crypto.tink.signature.RsaSsaPssPrivateKey rsaSsaPssPrivateKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        byte[] bArr;
        if (provider == null) {
            throw new java.security.NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("RSA", provider);
        com.google.crypto.tink.signature.RsaSsaPssParameters parameters = rsaSsaPssPrivateKey.getParameters();
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) keyFactory.generatePrivate(new java.security.spec.RSAPrivateCrtKeySpec(rsaSsaPssPrivateKey.getPublicKey().getModulus(), parameters.getPublicExponent(), rsaSsaPssPrivateKey.getPrivateExponent().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeP().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeQ().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeExponentP().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getPrimeExponentQ().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPssPrivateKey.getCrtCoefficient().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get())));
        com.google.crypto.tink.signature.RsaSsaPssParameters.HashType sigHashType = parameters.getSigHashType();
        com.google.crypto.tink.signature.RsaSsaPssParameters.HashType mgf1HashType = parameters.getMgf1HashType();
        int saltLengthBytes = parameters.getSaltLengthBytes();
        byte[] byteArray = rsaSsaPssPrivateKey.getOutputPrefix().toByteArray();
        if (parameters.getVariant().equals(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.LEGACY)) {
            bArr = legacyMessageSuffix;
        } else {
            bArr = EMPTY;
        }
        return new com.google.crypto.tink.signature.internal.RsaSsaPssSignConscrypt(rSAPrivateCrtKey, sigHashType, mgf1HashType, saltLengthBytes, byteArray, bArr, provider);
    }

    private RsaSsaPssSignConscrypt(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType2, int i, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Cannot use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
        com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
        this.privateKey = rSAPrivateCrtKey;
        this.signatureAlgorithm = com.google.crypto.tink.signature.internal.RsaSsaPssVerifyConscrypt.getConscryptRsaSsaPssAlgo(hashType);
        this.parameterSpec = com.google.crypto.tink.signature.internal.RsaSsaPssVerifyConscrypt.getPssParameterSpec(hashType, hashType2, i);
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
        this.conscrypt = provider;
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        java.security.Signature signature = java.security.Signature.getInstance(this.signatureAlgorithm, this.conscrypt);
        signature.initSign(this.privateKey);
        signature.setParameter(this.parameterSpec);
        signature.update(bArr);
        byte[] bArr2 = this.messageSuffix;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        byte[] bArr3 = this.outputPrefix;
        return bArr3.length == 0 ? sign : com.google.crypto.tink.subtle.Bytes.concat(bArr3, sign);
    }
}
