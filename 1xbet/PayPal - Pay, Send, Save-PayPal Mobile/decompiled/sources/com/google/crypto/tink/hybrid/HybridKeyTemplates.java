package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public final class HybridKeyTemplates {
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256;
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM;
    public static final com.google.crypto.tink.proto.KeyTemplate ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX;
    private static final byte[] EMPTY_SALT;

    static {
        byte[] bArr = new byte[0];
        EMPTY_SALT = bArr;
        ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM = createEciesAeadHkdfKeyTemplate(com.google.crypto.tink.proto.EllipticCurveType.NIST_P256, com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED, com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM, com.google.crypto.tink.proto.OutputPrefixType.TINK, bArr);
        ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX = createEciesAeadHkdfKeyTemplate(com.google.crypto.tink.proto.EllipticCurveType.NIST_P256, com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.proto.EcPointFormat.COMPRESSED, com.google.crypto.tink.aead.AeadKeyTemplates.AES128_GCM, com.google.crypto.tink.proto.OutputPrefixType.RAW, bArr);
        ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256 = createEciesAeadHkdfKeyTemplate(com.google.crypto.tink.proto.EllipticCurveType.NIST_P256, com.google.crypto.tink.proto.HashType.SHA256, com.google.crypto.tink.proto.EcPointFormat.UNCOMPRESSED, com.google.crypto.tink.aead.AeadKeyTemplates.AES128_CTR_HMAC_SHA256, com.google.crypto.tink.proto.OutputPrefixType.TINK, bArr);
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.KeyTemplate createEciesAeadHkdfKeyTemplate(com.google.crypto.tink.proto.EllipticCurveType ellipticCurveType, com.google.crypto.tink.proto.HashType hashType, com.google.crypto.tink.proto.EcPointFormat ecPointFormat, com.google.crypto.tink.proto.KeyTemplate keyTemplate, com.google.crypto.tink.proto.OutputPrefixType outputPrefixType, byte[] bArr) {
        return com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.getKeyType()).setOutputPrefixType(outputPrefixType).setValue(com.google.crypto.tink.proto.EciesAeadHkdfKeyFormat.newBuilder().setParams(createEciesAeadHkdfParams(ellipticCurveType, hashType, ecPointFormat, keyTemplate, bArr)).build().toByteString()).build();
    }

    @java.lang.Deprecated
    public static com.google.crypto.tink.proto.EciesAeadHkdfParams createEciesAeadHkdfParams(com.google.crypto.tink.proto.EllipticCurveType ellipticCurveType, com.google.crypto.tink.proto.HashType hashType, com.google.crypto.tink.proto.EcPointFormat ecPointFormat, com.google.crypto.tink.proto.KeyTemplate keyTemplate, byte[] bArr) {
        com.google.crypto.tink.proto.EciesHkdfKemParams build = com.google.crypto.tink.proto.EciesHkdfKemParams.newBuilder().setCurveType(ellipticCurveType).setHkdfHashType(hashType).setHkdfSalt(com.google.crypto.tink.shaded.protobuf.ByteString.copyFrom(bArr)).build();
        return com.google.crypto.tink.proto.EciesAeadHkdfParams.newBuilder().setKemParams(build).setDemParams(com.google.crypto.tink.proto.EciesAeadDemParams.newBuilder().setAeadDem(keyTemplate).build()).setEcPointFormat(ecPointFormat).build();
    }

    private HybridKeyTemplates() {
    }
}
