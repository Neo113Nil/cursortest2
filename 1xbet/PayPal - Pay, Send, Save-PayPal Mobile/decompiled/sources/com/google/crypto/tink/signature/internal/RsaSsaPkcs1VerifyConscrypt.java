package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPkcs1VerifyConscrypt implements com.google.crypto.tink.PublicKeyVerify {
    private final java.security.Provider conscrypt;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final java.lang.String signatureAlgorithm;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};

    @javax.annotation.Nullable
    static java.security.Provider conscryptProviderOrNull() {
        if (!com.google.crypto.tink.internal.Util.isAndroid() || com.google.crypto.tink.internal.Util.getAndroidApiLevel().intValue() > 21) {
            return com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        }
        return null;
    }

    public static java.lang.String toRsaSsaPkcs1Algo(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType) throws java.security.GeneralSecurityException {
        if (hashType == com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA256) {
            return "SHA256withRSA";
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA384) {
            return "SHA384withRSA";
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType.SHA512) {
            return "SHA512withRSA";
        }
        throw new java.security.GeneralSecurityException("unknown hash type");
    }

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        java.security.Provider conscryptProviderOrNull = conscryptProviderOrNull();
        if (conscryptProviderOrNull == null) {
            throw new java.security.NoSuchProviderException("RSA-PKCS1.5 using Conscrypt is not supported.");
        }
        return createWithProvider(rsaSsaPkcs1PublicKey, conscryptProviderOrNull);
    }

    public static com.google.crypto.tink.PublicKeyVerify createWithProvider(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        byte[] bArr;
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA", provider).generatePublic(new java.security.spec.RSAPublicKeySpec(rsaSsaPkcs1PublicKey.getModulus(), rsaSsaPkcs1PublicKey.getParameters().getPublicExponent()));
        com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType = rsaSsaPkcs1PublicKey.getParameters().getHashType();
        byte[] byteArray = rsaSsaPkcs1PublicKey.getOutputPrefix().toByteArray();
        if (rsaSsaPkcs1PublicKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.Variant.LEGACY)) {
            bArr = legacyMessageSuffix;
        } else {
            bArr = EMPTY;
        }
        return new com.google.crypto.tink.signature.internal.RsaSsaPkcs1VerifyConscrypt(rSAPublicKey, hashType, byteArray, bArr, provider);
    }

    private RsaSsaPkcs1VerifyConscrypt(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.signature.RsaSsaPkcs1Parameters.HashType hashType, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.publicKey = rSAPublicKey;
        this.signatureAlgorithm = toRsaSsaPkcs1Algo(hashType);
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
        this.conscrypt = provider;
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.internal.Util.isPrefix(this.outputPrefix, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        java.security.Signature signature = java.security.Signature.getInstance(this.signatureAlgorithm, this.conscrypt);
        signature.initVerify(this.publicKey);
        signature.update(bArr2);
        byte[] bArr3 = this.messageSuffix;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        try {
            if (signature.verify(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length))) {
                return;
            }
        } catch (java.lang.RuntimeException unused) {
        }
        throw new java.security.GeneralSecurityException("Invalid signature");
    }
}
