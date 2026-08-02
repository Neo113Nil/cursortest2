package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EcdsaSignJce implements com.google.crypto.tink.PublicKeySign {
    private final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding encoding;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final java.security.interfaces.ECPrivateKey privateKey;

    @javax.annotation.Nullable
    private final java.security.Provider provider;
    private final java.lang.String signatureAlgorithm;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};

    private EcdsaSignJce(java.security.interfaces.ECPrivateKey eCPrivateKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding ecdsaEncoding, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.privateKey = eCPrivateKey;
        this.signatureAlgorithm = com.google.crypto.tink.subtle.SubtleUtil.toEcdsaAlgo(hashType);
        this.encoding = ecdsaEncoding;
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
        this.provider = provider;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EcdsaSignJce(java.security.interfaces.ECPrivateKey eCPrivateKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding ecdsaEncoding) throws java.security.GeneralSecurityException {
        this(eCPrivateKey, hashType, ecdsaEncoding, r5, r5, com.google.crypto.tink.internal.ConscryptUtil.providerOrNull());
        byte[] bArr = EMPTY;
    }

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.EcdsaPrivateKey ecdsaPrivateKey) throws java.security.GeneralSecurityException {
        return createWithProviderOrNull(ecdsaPrivateKey, com.google.crypto.tink.internal.ConscryptUtil.providerOrNull());
    }

    public static com.google.crypto.tink.PublicKeySign createWithProvider(com.google.crypto.tink.signature.EcdsaPrivateKey ecdsaPrivateKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (provider == null) {
            throw new java.lang.NullPointerException("provider must not be null");
        }
        return createWithProviderOrNull(ecdsaPrivateKey, provider);
    }

    private static com.google.crypto.tink.PublicKeySign createWithProviderOrNull(com.google.crypto.tink.signature.EcdsaPrivateKey ecdsaPrivateKey, @javax.annotation.Nullable java.security.Provider provider) throws java.security.GeneralSecurityException {
        java.security.KeyFactory engineFactory;
        byte[] bArr;
        com.google.crypto.tink.subtle.Enums.HashType protoEnum = com.google.crypto.tink.signature.internal.EcdsaVerifyJce.HASH_TYPE_CONVERTER.toProtoEnum(ecdsaPrivateKey.getParameters().getHashType());
        com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding protoEnum2 = com.google.crypto.tink.signature.internal.EcdsaVerifyJce.ENCODING_CONVERTER.toProtoEnum(ecdsaPrivateKey.getParameters().getSignatureEncoding());
        java.security.spec.ECPrivateKeySpec eCPrivateKeySpec = new java.security.spec.ECPrivateKeySpec(ecdsaPrivateKey.getPrivateValue().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.subtle.EllipticCurves.getCurveSpec(com.google.crypto.tink.signature.internal.EcdsaVerifyJce.CURVE_TYPE_CONVERTER.toProtoEnum(ecdsaPrivateKey.getParameters().getCurveType())));
        if (provider == null) {
            engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC");
        } else {
            engineFactory = java.security.KeyFactory.getInstance("EC", provider);
        }
        java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) engineFactory.generatePrivate(eCPrivateKeySpec);
        byte[] byteArray = ecdsaPrivateKey.getOutputPrefix().toByteArray();
        if (ecdsaPrivateKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY)) {
            bArr = legacyMessageSuffix;
        } else {
            bArr = EMPTY;
        }
        return new com.google.crypto.tink.signature.internal.EcdsaSignJce(eCPrivateKey, protoEnum, protoEnum2, byteArray, bArr, provider);
    }

    private java.security.Signature getInstance(java.lang.String str) throws java.security.GeneralSecurityException {
        java.security.Provider provider = this.provider;
        if (provider != null) {
            return java.security.Signature.getInstance(str, provider);
        }
        return com.google.crypto.tink.subtle.EngineFactory.SIGNATURE.getInstance(str);
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        java.security.Signature ecdsaSignJce = getInstance(this.signatureAlgorithm);
        ecdsaSignJce.initSign(this.privateKey);
        ecdsaSignJce.update(bArr);
        byte[] bArr2 = this.messageSuffix;
        if (bArr2.length > 0) {
            ecdsaSignJce.update(bArr2);
        }
        byte[] sign = ecdsaSignJce.sign();
        if (this.encoding == com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363) {
            sign = com.google.crypto.tink.subtle.EllipticCurves.ecdsaDer2Ieee(sign, com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBytes(this.privateKey.getParams().getCurve()) * 2);
        }
        byte[] bArr3 = this.outputPrefix;
        return bArr3.length == 0 ? sign : com.google.crypto.tink.subtle.Bytes.concat(bArr3, sign);
    }
}
