package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EcdsaVerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    private final com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding encoding;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;

    @javax.annotation.Nullable
    private final java.security.Provider provider;
    private final java.security.interfaces.ECPublicKey publicKey;
    private final java.lang.String signatureAlgorithm;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_REQUIRES_BORINGCRYPTO;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] legacyMessageSuffix = {0};
    static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.Enums.HashType, com.google.crypto.tink.signature.EcdsaParameters.HashType> HASH_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.Enums.HashType.SHA256, com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA256).add(com.google.crypto.tink.subtle.Enums.HashType.SHA384, com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA384).add(com.google.crypto.tink.subtle.Enums.HashType.SHA512, com.google.crypto.tink.signature.EcdsaParameters.HashType.SHA512).build();
    static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding, com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding> ENCODING_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363, com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.IEEE_P1363).add(com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.DER, com.google.crypto.tink.signature.EcdsaParameters.SignatureEncoding.DER).build();
    static final com.google.crypto.tink.internal.EnumTypeProtoConverter<com.google.crypto.tink.subtle.EllipticCurves.CurveType, com.google.crypto.tink.signature.EcdsaParameters.CurveType> CURVE_TYPE_CONVERTER = com.google.crypto.tink.internal.EnumTypeProtoConverter.builder().add(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256, com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P256).add(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384, com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P384).add(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521, com.google.crypto.tink.signature.EcdsaParameters.CurveType.NIST_P521).build();

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey) throws java.security.GeneralSecurityException {
        return createWithProviderOrNull(ecdsaPublicKey, com.google.crypto.tink.internal.ConscryptUtil.providerOrNull());
    }

    public static com.google.crypto.tink.PublicKeyVerify createWithProvider(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (provider == null) {
            throw new java.lang.NullPointerException("provider must not be null");
        }
        return createWithProviderOrNull(ecdsaPublicKey, provider);
    }

    public static com.google.crypto.tink.PublicKeyVerify createWithProviderOrNull(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey, @javax.annotation.Nullable java.security.Provider provider) throws java.security.GeneralSecurityException {
        java.security.KeyFactory engineFactory;
        byte[] bArr;
        java.security.spec.ECPublicKeySpec eCPublicKeySpec = new java.security.spec.ECPublicKeySpec(ecdsaPublicKey.getPublicPoint(), com.google.crypto.tink.subtle.EllipticCurves.getCurveSpec(CURVE_TYPE_CONVERTER.toProtoEnum(ecdsaPublicKey.getParameters().getCurveType())));
        if (provider == null) {
            engineFactory = com.google.crypto.tink.subtle.EngineFactory.KEY_FACTORY.getInstance("EC");
        } else {
            engineFactory = java.security.KeyFactory.getInstance("EC", provider);
        }
        java.security.interfaces.ECPublicKey eCPublicKey = (java.security.interfaces.ECPublicKey) engineFactory.generatePublic(eCPublicKeySpec);
        com.google.crypto.tink.subtle.Enums.HashType protoEnum = HASH_TYPE_CONVERTER.toProtoEnum(ecdsaPublicKey.getParameters().getHashType());
        com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding protoEnum2 = ENCODING_CONVERTER.toProtoEnum(ecdsaPublicKey.getParameters().getSignatureEncoding());
        byte[] byteArray = ecdsaPublicKey.getOutputPrefix().toByteArray();
        if (ecdsaPublicKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.EcdsaParameters.Variant.LEGACY)) {
            bArr = legacyMessageSuffix;
        } else {
            bArr = EMPTY;
        }
        return new com.google.crypto.tink.signature.internal.EcdsaVerifyJce(eCPublicKey, protoEnum, protoEnum2, byteArray, bArr, provider);
    }

    private EcdsaVerifyJce(java.security.interfaces.ECPublicKey eCPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding ecdsaEncoding, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use ECDSA in FIPS-mode, as BoringCrypto is not available.");
        }
        this.signatureAlgorithm = com.google.crypto.tink.subtle.SubtleUtil.toEcdsaAlgo(hashType);
        this.publicKey = eCPublicKey;
        this.encoding = ecdsaEncoding;
        this.outputPrefix = bArr;
        this.messageSuffix = bArr2;
        this.provider = provider;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EcdsaVerifyJce(java.security.interfaces.ECPublicKey eCPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding ecdsaEncoding) throws java.security.GeneralSecurityException {
        this(eCPublicKey, hashType, ecdsaEncoding, r5, r5, com.google.crypto.tink.internal.ConscryptUtil.providerOrNull());
        byte[] bArr = EMPTY;
        com.google.crypto.tink.internal.EllipticCurvesUtil.checkPointOnCurve(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
    }

    private java.security.Signature getInstance(java.lang.String str) throws java.security.GeneralSecurityException {
        java.security.Provider provider = this.provider;
        if (provider != null) {
            return java.security.Signature.getInstance(str, provider);
        }
        return com.google.crypto.tink.subtle.EngineFactory.SIGNATURE.getInstance(str);
    }

    private void noPrefixVerify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (this.encoding == com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding.IEEE_P1363) {
            if (bArr.length != com.google.crypto.tink.subtle.EllipticCurves.fieldSizeInBytes(this.publicKey.getParams().getCurve()) * 2) {
                throw new java.security.GeneralSecurityException("Invalid signature");
            }
            bArr = com.google.crypto.tink.subtle.EllipticCurves.ecdsaIeee2Der(bArr);
        }
        if (!com.google.crypto.tink.subtle.EllipticCurves.isValidDerEncoding(bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature");
        }
        java.security.Signature ecdsaVerifyJce = getInstance(this.signatureAlgorithm);
        ecdsaVerifyJce.initVerify(this.publicKey);
        ecdsaVerifyJce.update(bArr2);
        byte[] bArr3 = this.messageSuffix;
        if (bArr3.length > 0) {
            ecdsaVerifyJce.update(bArr3);
        }
        try {
            if (ecdsaVerifyJce.verify(bArr)) {
                return;
            }
        } catch (java.lang.RuntimeException unused) {
        }
        throw new java.security.GeneralSecurityException("Invalid signature");
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.outputPrefix;
        if (bArr3.length == 0) {
            noPrefixVerify(bArr, bArr2);
        } else {
            if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
                throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            noPrefixVerify(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length), bArr2);
        }
    }
}
