package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPkcs1SignJce implements com.google.crypto.tink.PublicKeySign {

    @javax.annotation.Nullable
    java.security.Provider conscryptOrNull;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final java.security.interfaces.RSAPrivateCrtKey privateKey;
    private final java.lang.String signatureAlgorithm;
    private final com.google.crypto.tink.PublicKeyVerify verifier;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};
    private static final byte[] testData = {1, 2, 3};

    private static void validateHash(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType) throws java.security.GeneralSecurityException {
        if (hashType != com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256 && hashType != com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA384 && hashType != com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512) {
            throw new java.security.GeneralSecurityException("Unsupported hash: ".concat(java.lang.String.valueOf(hashType)));
        }
    }

    private RsaSsaPkcs1SignJce(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType, byte[] bArr, byte[] bArr2, com.google.crypto.tink.PublicKeyVerify publicKeyVerify, @javax.annotation.Nullable java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        validateHash(hashType);
        com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(rSAPrivateCrtKey.getModulus().bitLength());
        com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(rSAPrivateCrtKey.getPublicExponent());
        this.privateKey = rSAPrivateCrtKey;
        this.signatureAlgorithm = com.google.crypto.tink.signature.internal.RsaSsaPkcs1VerifyConscrypt.toRsaSsaPkcs1Algo(hashType);
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
        this.verifier = publicKeyVerify;
        this.conscryptOrNull = provider;
    }

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey) throws java.security.GeneralSecurityException {
        return createWithProviderOrNull(rsaSsaPkcs1PrivateKey, com.google.crypto.tink.signature.internal.RsaSsaPkcs1VerifyConscrypt.conscryptProviderOrNull());
    }

    public static com.google.crypto.tink.PublicKeySign createWithProvider(com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (provider == null) {
            throw new java.lang.NullPointerException("provider must not be null");
        }
        return createWithProviderOrNull(rsaSsaPkcs1PrivateKey, provider);
    }

    private static com.google.crypto.tink.PublicKeySign createWithProviderOrNull(com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey, @javax.annotation.Nullable java.security.Provider provider) throws java.security.GeneralSecurityException {
        java.security.KeyFactory engineFactory;
        com.google.crypto.tink.PublicKeyVerify create;
        byte[] bArr;
        if (provider == null) {
            engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("RSA");
        } else {
            engineFactory = java.security.KeyFactory.getInstance("RSA", provider);
        }
        java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) engineFactory.generatePrivate(new java.security.spec.RSAPrivateCrtKeySpec(rsaSsaPkcs1PrivateKey.getPublicKey().getModulus(), rsaSsaPkcs1PrivateKey.getParameters().getPublicExponent(), rsaSsaPkcs1PrivateKey.getPrivateExponent().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPkcs1PrivateKey.getPrimeP().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPkcs1PrivateKey.getPrimeQ().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPkcs1PrivateKey.getPrimeExponentP().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPkcs1PrivateKey.getPrimeExponentQ().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), rsaSsaPkcs1PrivateKey.getCrtCoefficient().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get())));
        if (provider != null) {
            create = com.google.crypto.tink.signature.internal.RsaSsaPkcs1VerifyConscrypt.createWithProvider(rsaSsaPkcs1PrivateKey.getPublicKey(), provider);
        } else {
            create = com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.create(rsaSsaPkcs1PrivateKey.getPublicKey());
        }
        com.google.crypto.tink.PublicKeyVerify publicKeyVerify = create;
        com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType = rsaSsaPkcs1PrivateKey.getParameters().getHashType();
        byte[] byteArray = rsaSsaPkcs1PrivateKey.getOutputPrefix().toByteArray();
        if (rsaSsaPkcs1PrivateKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.LEGACY)) {
            bArr = legacyMessageSuffix;
        } else {
            bArr = EMPTY;
        }
        com.google.crypto.tink.signature.internal.RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce = new com.google.crypto.tink.signature.internal.RsaSsaPkcs1SignJce(rSAPrivateCrtKey, hashType, byteArray, bArr, publicKeyVerify, provider);
        rsaSsaPkcs1SignJce.sign(testData);
        return rsaSsaPkcs1SignJce;
    }

    private java.security.Signature getSignature() throws java.security.GeneralSecurityException {
        java.security.Provider provider = this.conscryptOrNull;
        if (provider != null) {
            return java.security.Signature.getInstance(this.signatureAlgorithm, provider);
        }
        return com.google.crypto.tink.subtle.EngineFactory.SIGNATURE.getInstance(this.signatureAlgorithm);
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        java.security.Signature signature = getSignature();
        signature.initSign(this.privateKey);
        signature.update(bArr);
        byte[] bArr2 = this.messageSuffix;
        if (bArr2.length > 0) {
            signature.update(bArr2);
        }
        byte[] sign = signature.sign();
        byte[] bArr3 = this.outputPrefix;
        if (bArr3.length > 0) {
            sign = com.google.crypto.tink.subtle.Bytes.concat(bArr3, sign);
        }
        try {
            this.verifier.verify(sign, bArr);
            return sign;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException("RSA signature computation error", e);
        }
    }
}
