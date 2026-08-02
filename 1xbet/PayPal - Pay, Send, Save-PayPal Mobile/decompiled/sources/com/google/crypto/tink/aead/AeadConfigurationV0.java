package com.google.crypto.tink.aead;

/* loaded from: classes9.dex */
class AeadConfigurationV0 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private AeadConfigurationV0() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.aead.AeadWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda4(), com.google.crypto.tink.aead.AesCtrHmacAeadKey.class, com.google.crypto.tink.Aead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda5(), com.google.crypto.tink.aead.AesGcmKey.class, com.google.crypto.tink.Aead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda10(), com.google.crypto.tink.aead.AesGcmSivKey.class, com.google.crypto.tink.Aead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda9(), com.google.crypto.tink.aead.AesEaxKey.class, com.google.crypto.tink.Aead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.aead.AeadConfigurationV0$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.Aead createChaCha20Poly1305;
                    createChaCha20Poly1305 = com.google.crypto.tink.aead.AeadConfigurationV0.createChaCha20Poly1305((com.google.crypto.tink.aead.ChaCha20Poly1305Key) key);
                    return createChaCha20Poly1305;
                }
            }, com.google.crypto.tink.aead.ChaCha20Poly1305Key.class, com.google.crypto.tink.Aead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.aead.AeadConfigurationV0$$ExternalSyntheticLambda1
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.Aead createXChaCha20Poly1305;
                    createXChaCha20Poly1305 = com.google.crypto.tink.aead.AeadConfigurationV0.createXChaCha20Poly1305((com.google.crypto.tink.aead.XChaCha20Poly1305Key) key);
                    return createXChaCha20Poly1305;
                }
            }, com.google.crypto.tink.aead.XChaCha20Poly1305Key.class, com.google.crypto.tink.Aead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.aead.AeadConfigurationV0$$ExternalSyntheticLambda2(), com.google.crypto.tink.aead.XAesGcmKey.class, com.google.crypto.tink.Aead.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.aead.AeadConfigurationV0$$ExternalSyntheticLambda3
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.Aead createAeadFromLegacyProtoKey;
                    createAeadFromLegacyProtoKey = com.google.crypto.tink.aead.AeadConfigurationV0.createAeadFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createAeadFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.Aead.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV0 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Aead createChaCha20Poly1305(com.google.crypto.tink.aead.ChaCha20Poly1305Key chaCha20Poly1305Key) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.isSupported()) {
            return com.google.crypto.tink.aead.internal.ChaCha20Poly1305Jce.create(chaCha20Poly1305Key);
        }
        return com.google.crypto.tink.subtle.ChaCha20Poly1305.create(chaCha20Poly1305Key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Aead createXChaCha20Poly1305(com.google.crypto.tink.aead.XChaCha20Poly1305Key xChaCha20Poly1305Key) throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.aead.internal.XChaCha20Poly1305Jce.isSupported()) {
            return com.google.crypto.tink.aead.internal.XChaCha20Poly1305Jce.create(xChaCha20Poly1305Key);
        }
        return com.google.crypto.tink.subtle.XChaCha20Poly1305.create(xChaCha20Poly1305Key);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Aead createAeadFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.aead.AesCtrHmacAeadKey) {
                return com.google.crypto.tink.subtle.EncryptThenAuthenticate.create((com.google.crypto.tink.aead.AesCtrHmacAeadKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.aead.AesEaxKey) {
                return com.google.crypto.tink.subtle.AesEaxJce.create((com.google.crypto.tink.aead.AesEaxKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.aead.AesGcmKey) {
                return com.google.crypto.tink.subtle.AesGcmJce.create((com.google.crypto.tink.aead.AesGcmKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.aead.AesGcmSivKey) {
                return com.google.crypto.tink.aead.subtle.AesGcmSiv.create((com.google.crypto.tink.aead.AesGcmSivKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Key) {
                return createChaCha20Poly1305((com.google.crypto.tink.aead.ChaCha20Poly1305Key) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.aead.XChaCha20Poly1305Key) {
                return createXChaCha20Poly1305((com.google.crypto.tink.aead.XChaCha20Poly1305Key) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for Aead: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected one of: AesCtrHmacKey, AesEaxKey, AesGcmKey, AesGcmSivKey, ChaCha20Poly1305Key, XChaCha20Poly1305Key.");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for Aead", e);
        }
    }
}
