package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public class KmsEnvelopeAeadKeyManager {
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    private static final com.google.crypto.tink.KeyManager<com.google.crypto.tink.Aead> legacyKeyManager = com.google.crypto.tink.internal.LegacyKeyManagerImpl.create(getKeyType(), com.google.crypto.tink.Aead.class, com.google.crypto.tink.proto.KeyData.KeyMaterialType.SYMMETRIC, com.google.crypto.tink.proto.KmsEnvelopeAeadKey.parser());
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey newKey;
            newKey = com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager.newKey((com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters) parameters, num);
            return newKey;
        }
    };
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey, com.google.crypto.tink.Aead> LEGACY_KMS_ENVELOPE_AEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            com.google.crypto.tink.Aead create;
            create = com.google.crypto.tink.aead.KmsEnvelopeAeadKeyManager.create((com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey) key);
            return create;
        }
    }, com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey.class, com.google.crypto.tink.Aead.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey newKey(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey.create(legacyKmsEnvelopeAeadParameters, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey legacyKmsEnvelopeAeadKey) throws java.security.GeneralSecurityException {
        java.lang.String kekUri = legacyKmsEnvelopeAeadKey.getParameters().getKekUri();
        return com.google.crypto.tink.aead.internal.LegacyFullAead.create(com.google.crypto.tink.aead.KmsEnvelopeAead.create(legacyKmsEnvelopeAeadKey.getParameters().getDekParametersForNewKeys(), com.google.crypto.tink.KmsClients.get(kekUri).getAead(kekUri)), legacyKmsEnvelopeAeadKey.getOutputPrefix());
    }

    static java.lang.String getKeyType() {
        return TYPE_URL;
    }

    private static com.google.crypto.tink.aead.AeadParameters makeRawAesGcm(com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.AesGcmParameters.builder().setIvSizeBytes(aesGcmParameters.getIvSizeBytes()).setKeySizeBytes(aesGcmParameters.getKeySizeBytes()).setTagSizeBytes(aesGcmParameters.getTagSizeBytes()).setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX).build();
    }

    private static com.google.crypto.tink.aead.AeadParameters makeRawChaCha20Poly1305() {
        return com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX);
    }

    private static com.google.crypto.tink.aead.AeadParameters makeRawXChaCha20Poly1305() {
        return com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX);
    }

    private static com.google.crypto.tink.aead.AeadParameters makeRawAesCtrHmacAead(com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.AesCtrHmacAeadParameters.builder().setAesKeySizeBytes(aesCtrHmacAeadParameters.getAesKeySizeBytes()).setHmacKeySizeBytes(aesCtrHmacAeadParameters.getHmacKeySizeBytes()).setTagSizeBytes(aesCtrHmacAeadParameters.getTagSizeBytes()).setIvSizeBytes(aesCtrHmacAeadParameters.getIvSizeBytes()).setHashType(aesCtrHmacAeadParameters.getHashType()).setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX).build();
    }

    private static com.google.crypto.tink.aead.AeadParameters makeRawAesEax(com.google.crypto.tink.aead.AesEaxParameters aesEaxParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.AesEaxParameters.builder().setIvSizeBytes(aesEaxParameters.getIvSizeBytes()).setKeySizeBytes(aesEaxParameters.getKeySizeBytes()).setTagSizeBytes(aesEaxParameters.getTagSizeBytes()).setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX).build();
    }

    private static com.google.crypto.tink.aead.AeadParameters makeRawAesGcmSiv(com.google.crypto.tink.aead.AesGcmSivParameters aesGcmSivParameters) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.AesGcmSivParameters.builder().setKeySizeBytes(aesGcmSivParameters.getKeySizeBytes()).setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX).build();
    }

    private static com.google.crypto.tink.aead.AeadParameters makeRaw(com.google.crypto.tink.Parameters parameters) throws java.security.GeneralSecurityException {
        if (parameters instanceof com.google.crypto.tink.aead.AesGcmParameters) {
            return makeRawAesGcm((com.google.crypto.tink.aead.AesGcmParameters) parameters);
        }
        if (parameters instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Parameters) {
            return makeRawChaCha20Poly1305();
        }
        if (parameters instanceof com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) {
            return makeRawXChaCha20Poly1305();
        }
        if (parameters instanceof com.google.crypto.tink.aead.AesCtrHmacAeadParameters) {
            return makeRawAesCtrHmacAead((com.google.crypto.tink.aead.AesCtrHmacAeadParameters) parameters);
        }
        if (parameters instanceof com.google.crypto.tink.aead.AesEaxParameters) {
            return makeRawAesEax((com.google.crypto.tink.aead.AesEaxParameters) parameters);
        }
        if (parameters instanceof com.google.crypto.tink.aead.AesGcmSivParameters) {
            return makeRawAesGcmSiv((com.google.crypto.tink.aead.AesGcmSivParameters) parameters);
        }
        throw new java.lang.IllegalArgumentException("Illegal parameters".concat(java.lang.String.valueOf(parameters)));
    }

    private static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy getRequiredParsingStrategy(com.google.crypto.tink.aead.AeadParameters aeadParameters) {
        if (aeadParameters instanceof com.google.crypto.tink.aead.AesGcmParameters) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_GCM;
        }
        if (aeadParameters instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Parameters) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_CHACHA20POLY1305;
        }
        if (aeadParameters instanceof com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_XCHACHA20POLY1305;
        }
        if (aeadParameters instanceof com.google.crypto.tink.aead.AesCtrHmacAeadParameters) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_CTR_HMAC;
        }
        if (aeadParameters instanceof com.google.crypto.tink.aead.AesEaxParameters) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_EAX;
        }
        if (aeadParameters instanceof com.google.crypto.tink.aead.AesGcmSivParameters) {
            return com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_GCM_SIV;
        }
        throw new java.lang.IllegalArgumentException("Illegal parameters".concat(java.lang.String.valueOf(aeadParameters)));
    }

    public static com.google.crypto.tink.KeyTemplate createKeyTemplate(java.lang.String str, com.google.crypto.tink.KeyTemplate keyTemplate) {
        try {
            com.google.crypto.tink.aead.AeadParameters makeRaw = makeRaw(keyTemplate.toParameters());
            return com.google.crypto.tink.KeyTemplate.createFrom(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.builder().setKekUri(str).setDekParsingStrategy(getRequiredParsingStrategy(makeRaw)).setDekParametersForNewKeys(makeRaw).build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalArgumentException("Cannot create LegacyKmsEnvelopeAeadParameters for template: ".concat(java.lang.String.valueOf(keyTemplate)), e);
        }
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Registering KMS Envelope AEAD is not supported in FIPS mode");
        }
        com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadProtoSerialization.register();
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_KMS_ENVELOPE_AEAD_PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(legacyKeyManager, z);
    }

    private KmsEnvelopeAeadKeyManager() {
    }
}
