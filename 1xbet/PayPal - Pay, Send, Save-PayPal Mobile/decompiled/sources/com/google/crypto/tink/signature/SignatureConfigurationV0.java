package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
class SignatureConfigurationV0 {
    private static final com.google.crypto.tink.internal.InternalConfiguration INTERNAL_CONFIGURATION = create();

    private SignatureConfigurationV0() {
    }

    private static com.google.crypto.tink.internal.InternalConfiguration create() {
        try {
            com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
            com.google.crypto.tink.signature.PublicKeySignWrapper.registerToInternalPrimitiveRegistry(builder);
            com.google.crypto.tink.signature.PublicKeyVerifyWrapper.registerToInternalPrimitiveRegistry(builder);
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda7(), com.google.crypto.tink.signature.EcdsaPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda8(), com.google.crypto.tink.signature.EcdsaPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda5(), com.google.crypto.tink.signature.RsaSsaPssPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda6(), com.google.crypto.tink.signature.RsaSsaPssPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda3(), com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda4(), com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda1(), com.google.crypto.tink.signature.Ed25519PrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda2(), com.google.crypto.tink.signature.Ed25519PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.signature.SignatureConfigurationV0$$ExternalSyntheticLambda0
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.PublicKeySign createPublicKeySignFromLegacyProtoKey;
                    createPublicKeySignFromLegacyProtoKey = com.google.crypto.tink.signature.SignatureConfigurationV0.createPublicKeySignFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createPublicKeySignFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.PublicKeySign.class));
            builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.signature.SignatureConfigurationV0$$ExternalSyntheticLambda1
                @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
                public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                    com.google.crypto.tink.PublicKeyVerify createPublicKeyVerifyFromLegacyProtoKey;
                    createPublicKeyVerifyFromLegacyProtoKey = com.google.crypto.tink.signature.SignatureConfigurationV0.createPublicKeyVerifyFromLegacyProtoKey((com.google.crypto.tink.internal.LegacyProtoKey) key);
                    return createPublicKeyVerifyFromLegacyProtoKey;
                }
            }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.PublicKeyVerify.class));
            return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.PublicKeySign createPublicKeySignFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.signature.EcdsaPrivateKey) {
                return com.google.crypto.tink.subtle.EcdsaSignJce.create((com.google.crypto.tink.signature.EcdsaPrivateKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.signature.Ed25519PrivateKey) {
                return com.google.crypto.tink.subtle.Ed25519Sign.create((com.google.crypto.tink.signature.Ed25519PrivateKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey) {
                return com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.create((com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.signature.RsaSsaPssPrivateKey) {
                return com.google.crypto.tink.subtle.RsaSsaPssSignJce.create((com.google.crypto.tink.signature.RsaSsaPssPrivateKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for PublicKeySign: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected one of: EcdsaPrivateKey, Ed25519PrivateKey, RsaSsaPkcs1PrivateKey, RsaSsaPssPrivateKey.");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for PublicKeySign", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.PublicKeyVerify createPublicKeyVerifyFromLegacyProtoKey(com.google.crypto.tink.internal.LegacyProtoKey legacyProtoKey) throws java.security.GeneralSecurityException {
        try {
            com.google.crypto.tink.Key parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(legacyProtoKey.getSerialization(com.google.crypto.tink.InsecureSecretKeyAccess.get()), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (parseKey instanceof com.google.crypto.tink.signature.EcdsaPublicKey) {
                return com.google.crypto.tink.subtle.EcdsaVerifyJce.create((com.google.crypto.tink.signature.EcdsaPublicKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.signature.Ed25519PublicKey) {
                return com.google.crypto.tink.subtle.Ed25519Verify.create((com.google.crypto.tink.signature.Ed25519PublicKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey) {
                return com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce.create((com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey) parseKey);
            }
            if (parseKey instanceof com.google.crypto.tink.signature.RsaSsaPssPublicKey) {
                return com.google.crypto.tink.subtle.RsaSsaPssVerifyJce.create((com.google.crypto.tink.signature.RsaSsaPssPublicKey) parseKey);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to re-parse LegacyProtoKey for PublicKeyVerify: the parsed key type is");
            sb.append(parseKey.getClass().getName());
            sb.append(", expected one of: EcdsaPublicKey, Ed25519PublicKey, RsaSsaPkcs1PublicKey, RsaSsaPssPublicKey.");
            throw new java.security.GeneralSecurityException(sb.toString());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("Failed to re-parse LegacyProtoKey for PublicKeyVerify", e);
        }
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant SignatureConfigurationV0 in FIPS mode");
        }
        return INTERNAL_CONFIGURATION;
    }
}
