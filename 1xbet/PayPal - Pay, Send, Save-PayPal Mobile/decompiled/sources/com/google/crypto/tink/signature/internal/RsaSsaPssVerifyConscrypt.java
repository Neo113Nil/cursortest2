package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RsaSsaPssVerifyConscrypt implements com.google.crypto.tink.PublicKeyVerify {
    private static final java.lang.String MGF_1 = "MGF1";
    private static final int TRAILER_FIELD_BC = 1;
    private final java.security.Provider conscrypt;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final java.security.spec.PSSParameterSpec parameterSpec;
    private final java.security.interfaces.RSAPublicKey publicKey;
    private final java.lang.String signatureAlgorithm;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};

    @javax.annotation.Nullable
    static java.security.Provider conscryptProviderOrNull() {
        if (!com.google.crypto.tink.internal.Util.isAndroid() || com.google.crypto.tink.internal.Util.getAndroidApiLevel().intValue() > 23) {
            return com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        }
        return null;
    }

    static java.lang.String getConscryptRsaSsaPssAlgo(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType) {
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256) {
            return "SHA256withRSA/PSS";
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA384) {
            return "SHA384withRSA/PSS";
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512) {
            return "SHA512withRSA/PSS";
        }
        throw new java.lang.IllegalArgumentException("Unsupported hash: ".concat(java.lang.String.valueOf(hashType)));
    }

    private static java.lang.String getMdName(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType) {
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256) {
            return "SHA-256";
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA384) {
            return "SHA-384";
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512) {
            return "SHA-512";
        }
        throw new java.lang.IllegalArgumentException("Unsupported MD hash: ".concat(java.lang.String.valueOf(hashType)));
    }

    private static java.security.spec.MGF1ParameterSpec getMgf1Hash(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType) {
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA256) {
            return java.security.spec.MGF1ParameterSpec.SHA256;
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA384) {
            return java.security.spec.MGF1ParameterSpec.SHA384;
        }
        if (hashType == com.google.crypto.tink.signature.RsaSsaPssParameters.HashType.SHA512) {
            return java.security.spec.MGF1ParameterSpec.SHA512;
        }
        throw new java.lang.IllegalArgumentException("Unsupported MGF1 hash: ".concat(java.lang.String.valueOf(hashType)));
    }

    static java.security.spec.PSSParameterSpec getPssParameterSpec(com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType2, int i) {
        return new java.security.spec.PSSParameterSpec(getMdName(hashType), MGF_1, getMgf1Hash(hashType2), i, 1);
    }

    private RsaSsaPssVerifyConscrypt(java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType, com.google.crypto.tink.signature.RsaSsaPssParameters.HashType hashType2, int i, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!hashType.equals(hashType2)) {
            throw new java.security.GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        com.google.crypto.tink.subtle.Validators.validateRsaModulusSize(rSAPublicKey.getModulus().bitLength());
        com.google.crypto.tink.subtle.Validators.validateRsaPublicExponent(rSAPublicKey.getPublicExponent());
        this.publicKey = rSAPublicKey;
        this.signatureAlgorithm = getConscryptRsaSsaPssAlgo(hashType);
        this.parameterSpec = getPssParameterSpec(hashType, hashType2, i);
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
        this.conscrypt = provider;
    }

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        return createWithProvider(rsaSsaPssPublicKey, conscryptProviderOrNull());
    }

    public static com.google.crypto.tink.PublicKeyVerify createWithProvider(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        byte[] bArr;
        if (provider == null) {
            throw new java.security.NoSuchProviderException("RSA SSA PSS using Conscrypt is not supported.");
        }
        java.security.interfaces.RSAPublicKey rSAPublicKey = (java.security.interfaces.RSAPublicKey) java.security.KeyFactory.getInstance("RSA", provider).generatePublic(new java.security.spec.RSAPublicKeySpec(rsaSsaPssPublicKey.getModulus(), rsaSsaPssPublicKey.getParameters().getPublicExponent()));
        com.google.crypto.tink.signature.RsaSsaPssParameters parameters = rsaSsaPssPublicKey.getParameters();
        com.google.crypto.tink.signature.RsaSsaPssParameters.HashType sigHashType = parameters.getSigHashType();
        com.google.crypto.tink.signature.RsaSsaPssParameters.HashType mgf1HashType = parameters.getMgf1HashType();
        int saltLengthBytes = parameters.getSaltLengthBytes();
        byte[] byteArray = rsaSsaPssPublicKey.getOutputPrefix().toByteArray();
        if (rsaSsaPssPublicKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.RsaSsaPssParameters.Variant.LEGACY)) {
            bArr = legacyMessageSuffix;
        } else {
            bArr = EMPTY;
        }
        return new com.google.crypto.tink.signature.internal.RsaSsaPssVerifyConscrypt(rSAPublicKey, sigHashType, mgf1HashType, saltLengthBytes, byteArray, bArr, provider);
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.internal.Util.isPrefix(this.outputPrefix, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        java.security.Signature signature = java.security.Signature.getInstance(this.signatureAlgorithm, this.conscrypt);
        signature.initVerify(this.publicKey);
        signature.setParameter(this.parameterSpec);
        signature.update(bArr2);
        byte[] bArr3 = this.messageSuffix;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        byte[] bArr4 = this.outputPrefix;
        if (!signature.verify(bArr, bArr4.length, bArr.length - bArr4.length)) {
            throw new java.security.GeneralSecurityException("signature verification failed");
        }
    }
}
