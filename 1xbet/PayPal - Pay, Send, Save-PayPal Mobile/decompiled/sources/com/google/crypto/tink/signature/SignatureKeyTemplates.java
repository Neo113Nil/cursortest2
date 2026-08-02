package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class SignatureKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P256 = createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.proto.EllipticCurveType.NIST_P256, com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P384 = createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.proto.EllipticCurveType.NIST_P384, com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P521 = createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.proto.EllipticCurveType.NIST_P521, com.google.crypto.tink.proto.EcdsaSignatureEncoding.DER, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P256_IEEE_P1363 = createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.proto.EllipticCurveType.NIST_P256, com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P384_IEEE_P1363 = createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.proto.EllipticCurveType.NIST_P384, com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P256_IEEE_P1363_WITHOUT_PREFIX = createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.proto.EllipticCurveType.NIST_P256, com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363, com.google.crypto.tink.proto.OutputPrefixType.RAW);
    public static final com.google.crypto.tink.proto.KeyTemplate ECDSA_P521_IEEE_P1363 = createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.proto.EllipticCurveType.NIST_P521, com.google.crypto.tink.proto.EcdsaSignatureEncoding.IEEE_P1363, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate ED25519 = com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(com.google.crypto.tink.signature.Ed25519PrivateKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    public static final com.google.crypto.tink.proto.KeyTemplate ED25519WithRawOutput = com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(com.google.crypto.tink.signature.Ed25519PrivateKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build();
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PKCS1_3072_SHA256_F4 = createRsaSsaPkcs1KeyTemplate(com.google.crypto.tink.proto.HashType.SHA256, 3072, java.security.spec.RSAKeyGenParameterSpec.F4, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PKCS1_3072_SHA256_F4_WITHOUT_PREFIX = createRsaSsaPkcs1KeyTemplate(com.google.crypto.tink.proto.HashType.SHA256, 3072, java.security.spec.RSAKeyGenParameterSpec.F4, com.google.crypto.tink.proto.OutputPrefixType.RAW);
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PKCS1_4096_SHA512_F4 = createRsaSsaPkcs1KeyTemplate(com.google.crypto.tink.proto.HashType.SHA512, 4096, java.security.spec.RSAKeyGenParameterSpec.F4, com.google.crypto.tink.proto.OutputPrefixType.TINK);
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PSS_3072_SHA256_SHA256_32_F4 = createRsaSsaPssKeyTemplate(com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.proto.HashType.SHA256, 32, 3072, java.security.spec.RSAKeyGenParameterSpec.F4);
    public static final com.google.crypto.tink.proto.KeyTemplate RSA_SSA_PSS_4096_SHA512_SHA512_64_F4 = createRsaSsaPssKeyTemplate(com.google.crypto.tink.proto.HashType.SHA512, com.google.crypto.tink.proto.HashType.SHA512, 64, 4096, java.security.spec.RSAKeyGenParameterSpec.F4);

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyTemplate createEcdsaKeyTemplate(com.google.crypto.tink.proto.HashType hashType, com.google.crypto.tink.proto.EllipticCurveType ellipticCurveType, com.google.crypto.tink.proto.EcdsaSignatureEncoding ecdsaSignatureEncoding, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.EcdsaKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.EcdsaParams.newBuilder().setHashType(hashType).setCurve(ellipticCurveType).setEncoding(ecdsaSignatureEncoding).build()).build().toByteString()).setTypeUrl(com.google.crypto.tink.signature.EcdsaSignKeyManager.getKeyType()).setOutputPrefixType(outputPrefixType).build();
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyTemplate createRsaSsaPkcs1KeyTemplate(com.google.crypto.tink.proto.HashType hashType, int i, java.math.BigInteger bigInteger, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.RsaSsaPkcs1KeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.RsaSsaPkcs1Params.newBuilder().setHashType(hashType).build()).setModulusSizeInBits(i).setPublicExponent(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(bigInteger.toByteArray())).build().toByteString()).setTypeUrl(com.google.crypto.tink.signature.RsaSsaPkcs1SignKeyManager.getKeyType()).setOutputPrefixType(outputPrefixType).build();
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyTemplate createRsaSsaPssKeyTemplate(com.google.crypto.tink.proto.HashType hashType, com.google.crypto.tink.proto.HashType hashType2, int i, int i2, java.math.BigInteger bigInteger) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setValue(com.google.crypto.tink.proto.RsaSsaPssKeyFormat.newBuilder().setParams(com.google.crypto.tink.proto.RsaSsaPssParams.newBuilder().setSigHash(hashType).setMgf1Hash(hashType2).setSaltLength(i).build()).setModulusSizeInBits(i2).setPublicExponent(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(bigInteger.toByteArray())).build().toByteString()).setTypeUrl(com.google.crypto.tink.signature.RsaSsaPssSignKeyManager.getKeyType()).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.TINK).build();
    }

    private SignatureKeyTemplates() {
    }
}
