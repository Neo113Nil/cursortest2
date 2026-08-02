package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class HpkePrivateKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.hybrid.HpkePrivateKey, com.google.crypto.tink.HybridDecrypt> HYBRID_DECRYPT_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda18(), com.google.crypto.tink.hybrid.HpkePrivateKey.class, com.google.crypto.tink.HybridDecrypt.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.hybrid.HpkePublicKey, com.google.crypto.tink.HybridEncrypt> HYBRID_ENCRYPT_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda17(), com.google.crypto.tink.hybrid.HpkePublicKey.class, com.google.crypto.tink.HybridEncrypt.class);
    private static final com.google.crypto.tink.PrivateKeyManager<com.google.crypto.tink.HybridDecrypt> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), com.google.crypto.tink.HybridDecrypt.class, com.google.crypto.tink.proto.HpkePrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.HybridEncrypt> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.hybrid.internal.HpkePublicKeyManager.getKeyType(), com.google.crypto.tink.HybridEncrypt.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.HpkePublicKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.hybrid.HpkeParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.hybrid.HpkePrivateKey createKey;
            createKey = com.google.crypto.tink.hybrid.internal.HpkePrivateKeyManager.createKey((com.google.crypto.tink.hybrid.HpkeParameters) parameters, num);
            return createKey;
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.HpkePrivateKey createKey(com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.util.Bytes copyFrom;
        com.google.crypto.tink.util.SecretBytes copyFrom2;
        if (hpkeParameters.getKemId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256)) {
            byte[] generatePrivateKey = com.google.crypto.tink.subtle.X25519.generatePrivateKey();
            copyFrom2 = com.google.crypto.tink.util.SecretBytes.copyFrom(generatePrivateKey, com.google.crypto.tink.InsecureSecretKeyAccess.get());
            copyFrom = com.google.crypto.tink.util.Bytes.copyFrom(com.google.crypto.tink.subtle.X25519.publicFromPrivate(generatePrivateKey));
        } else if (hpkeParameters.getKemId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) || hpkeParameters.getKemId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) || hpkeParameters.getKemId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512)) {
            com.google.crypto.tink.subtle.EllipticCurves.CurveType nistHpkeKemToCurve = com.google.crypto.tink.hybrid.internal.HpkeUtil.nistHpkeKemToCurve(hpkeParameters.getKemId());
            java.security.KeyPair generateKeyPair = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(nistHpkeKemToCurve);
            copyFrom = com.google.crypto.tink.util.Bytes.copyFrom(com.google.crypto.tink.subtle.EllipticCurves.pointEncode(nistHpkeKemToCurve, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, ((java.security.interfaces.ECPublicKey) generateKeyPair.getPublic()).getW()));
            copyFrom2 = com.google.crypto.tink.util.SecretBytes.copyFrom(com.google.crypto.tink.internal.BigIntegerEncoding.toBigEndianBytesOfFixedLength(((java.security.interfaces.ECPrivateKey) generateKeyPair.getPrivate()).getS(), com.google.crypto.tink.hybrid.internal.HpkeUtil.getEncodedPrivateKeyLength(hpkeParameters.getKemId())), com.google.crypto.tink.InsecureSecretKeyAccess.get());
        } else {
            throw new java.security.GeneralSecurityException("Unknown KEM ID");
        }
        return com.google.crypto.tink.hybrid.HpkePrivateKey.create(com.google.crypto.tink.hybrid.HpkePublicKey.create(hpkeParameters, copyFrom, num), copyFrom2);
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering HPKE Hybrid Encryption is not supported in FIPS mode");
        }
        com.google.crypto.tink.hybrid.HpkeProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(HYBRID_DECRYPT_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(HYBRID_ENCRYPT_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.hybrid.HpkeParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyPrivateKeyManager, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyPublicKeyManager, false);
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.CHACHA20_POLY1305).build());
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.CHACHA20_POLY1305).build());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA384).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA384).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA384).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA384).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA512).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA512).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM).build());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.TINK).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA512).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", com.google.crypto.tink.hybrid.HpkeParameters.builder().setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX).setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512).setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA512).setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    private HpkePrivateKeyManager() {
    }
}
