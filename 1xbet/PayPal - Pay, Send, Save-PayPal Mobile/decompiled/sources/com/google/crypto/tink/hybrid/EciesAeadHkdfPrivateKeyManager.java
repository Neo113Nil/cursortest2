package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public final class EciesAeadHkdfPrivateKeyManager {
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.hybrid.EciesPrivateKey, com.google.crypto.tink.HybridDecrypt> HYBRID_DECRYPT_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda16(), com.google.crypto.tink.hybrid.EciesPrivateKey.class, com.google.crypto.tink.HybridDecrypt.class);
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.hybrid.EciesPublicKey, com.google.crypto.tink.HybridEncrypt> HYBRID_ENCRYPT_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda15(), com.google.crypto.tink.hybrid.EciesPublicKey.class, com.google.crypto.tink.HybridEncrypt.class);
    private static final com.google.crypto.tink.PrivateKeyManager<com.google.crypto.tink.HybridDecrypt> legacyPrivateKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.createPrivateKeyManager(getKeyType(), com.google.crypto.tink.HybridDecrypt.class, com.google.crypto.tink.proto.EciesAeadHkdfPrivateKey.parser());
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.HybridEncrypt> legacyPublicKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(com.google.crypto.tink.hybrid.EciesAeadHkdfPublicKeyManager.getKeyType(), com.google.crypto.tink.HybridEncrypt.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PUBLIC, com.google.crypto.tink.proto.EciesAeadHkdfPublicKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.hybrid.EciesParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$$ExternalSyntheticLambda4
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.hybrid.EciesPrivateKey createKey;
            createKey = com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager.createKey((com.google.crypto.tink.hybrid.EciesParameters) parameters, num);
            return createKey;
        }
    };

    private static final java.security.spec.ECParameterSpec toParameterSpec(com.google.crypto.tink.hybrid.EciesParameters.CurveType curveType) throws java.security.GeneralSecurityException {
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256) {
            return com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P256_PARAMS;
        }
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P384) {
            return com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P384_PARAMS;
        }
        if (curveType == com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P521) {
            return com.google.crypto.tink.internal.EllipticCurvesUtil.NIST_P521_PARAMS;
        }
        throw new java.security.GeneralSecurityException("Unsupported curve type: ".concat(java.lang.String.valueOf(curveType)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.hybrid.EciesPrivateKey createKey(com.google.crypto.tink.hybrid.EciesParameters eciesParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        java.security.KeyPair generateKeyPair = com.google.crypto.tink.subtle.EllipticCurves.generateKeyPair(toParameterSpec(eciesParameters.getCurveType()));
        return com.google.crypto.tink.hybrid.EciesPrivateKey.createForNistCurve(com.google.crypto.tink.hybrid.EciesPublicKey.createForNistCurve(eciesParameters, ((java.security.interfaces.ECPublicKey) generateKeyPair.getPublic()).getW(), num), com.google.crypto.tink.util.SecretBigInteger.fromBigInteger(((java.security.interfaces.ECPrivateKey) generateKeyPair.getPrivate()).getS(), com.google.crypto.tink.InsecureSecretKeyAccess.get()));
    }

    static java.lang.String getKeyType() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() throws java.security.GeneralSecurityException {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build()).build());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build()).build());
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    public static void registerPair(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        }
        com.google.crypto.tink.hybrid.internal.EciesProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(HYBRID_DECRYPT_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(HYBRID_ENCRYPT_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.hybrid.EciesParameters.class);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyPrivateKeyManager, z);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyPublicKeyManager, false);
    }

    public static final com.google.crypto.tink.KeyTemplate eciesP256HkdfHmacSha256Aes128GcmTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawEciesP256HkdfHmacSha256Aes128GcmCompressedTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(12).setKeySizeBytes(16).setTagSizeBytes(16).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build()).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate eciesP256HkdfHmacSha256Aes128CtrHmacSha256Template() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.UNCOMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.TINK).setDemParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build()).build());
                return createFrom;
            }
        });
    }

    public static final com.google.crypto.tink.KeyTemplate rawEciesP256HkdfHmacSha256Aes128CtrHmacSha256CompressedTemplate() {
        return (com.google.crypto.tink.KeyTemplate) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.hybrid.EciesAeadHkdfPrivateKeyManager$$ExternalSyntheticLambda3
            @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
            public final java.lang.Object get() {
                com.google.crypto.tink.KeyTemplate createFrom;
                createFrom = com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.hybrid.EciesParameters.builder().setCurveType(com.google.crypto.tink.hybrid.EciesParameters.CurveType.NIST_P256).setHashType(com.google.crypto.tink.hybrid.EciesParameters.HashType.SHA256).setNistCurvePointFormat(com.google.crypto.tink.hybrid.EciesParameters.PointFormat.COMPRESSED).setVariant(com.google.crypto.tink.hybrid.EciesParameters.Variant.NO_PREFIX).setDemParameters(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(16).setHmacKeySizeBytes(32).setTagSizeBytes(16).setIvSizeBytes(16).setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build()).build());
                return createFrom;
            }
        });
    }

    private EciesAeadHkdfPrivateKeyManager() {
    }
}
