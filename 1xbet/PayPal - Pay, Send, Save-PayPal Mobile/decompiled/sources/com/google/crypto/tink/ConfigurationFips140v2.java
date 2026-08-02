package com.google.crypto.tink;

/* loaded from: classes9.dex */
public class ConfigurationFips140v2 {
    private ConfigurationFips140v2() {
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (!com.google.crypto.tink.config.internal.TinkFipsUtil.fipsModuleAvailable()) {
            throw new java.security.GeneralSecurityException("Conscrypt is not available or does not support checking for FIPS build.");
        }
        com.google.crypto.tink.internal.Random.validateUsesConscrypt();
        com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
        com.google.crypto.tink.mac.MacWrapper.registerToInternalPrimitiveRegistry(builder);
        com.google.crypto.tink.mac.ChunkedMacWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda0(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.Mac.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda3(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.mac.ChunkedMac.class));
        com.google.crypto.tink.aead.AeadWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda4(), com.google.crypto.tink.aead.AesCtrHmacAeadKey.class, com.google.crypto.tink.Aead.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda5(), com.google.crypto.tink.aead.AesGcmKey.class, com.google.crypto.tink.Aead.class));
        com.google.crypto.tink.prf.PrfSetWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda6(), com.google.crypto.tink.prf.HmacPrfKey.class, com.google.crypto.tink.prf.Prf.class));
        com.google.crypto.tink.signature.PublicKeySignWrapper.registerToInternalPrimitiveRegistry(builder);
        com.google.crypto.tink.signature.PublicKeyVerifyWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda7(), com.google.crypto.tink.signature.EcdsaPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda8(), com.google.crypto.tink.signature.EcdsaPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda9
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.PublicKeySign rsaSsaPkcs1SignCreate;
                rsaSsaPkcs1SignCreate = com.google.crypto.tink.ConfigurationFips140v2.rsaSsaPkcs1SignCreate((com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey) key);
                return rsaSsaPkcs1SignCreate;
            }
        }, com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda10
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.PublicKeyVerify rsaSsaPkcs1VerifyCreate;
                rsaSsaPkcs1VerifyCreate = com.google.crypto.tink.ConfigurationFips140v2.rsaSsaPkcs1VerifyCreate((com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey) key);
                return rsaSsaPkcs1VerifyCreate;
            }
        }, com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.PublicKeySign rsaSsaPssSignCreate;
                rsaSsaPssSignCreate = com.google.crypto.tink.ConfigurationFips140v2.rsaSsaPssSignCreate((com.google.crypto.tink.signature.RsaSsaPssPrivateKey) key);
                return rsaSsaPssSignCreate;
            }
        }, com.google.crypto.tink.signature.RsaSsaPssPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda2
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.PublicKeyVerify rsaSsaPssVerifyCreate;
                rsaSsaPssVerifyCreate = com.google.crypto.tink.ConfigurationFips140v2.rsaSsaPssVerifyCreate((com.google.crypto.tink.signature.RsaSsaPssPublicKey) key);
                return rsaSsaPssVerifyCreate;
            }
        }, com.google.crypto.tink.signature.RsaSsaPssPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
        return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.PublicKeySign rsaSsaPkcs1SignCreate(com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey rsaSsaPkcs1PrivateKey) throws java.security.GeneralSecurityException {
        if (rsaSsaPkcs1PrivateKey.getParameters().getModulusSizeBits() != 2048 && rsaSsaPkcs1PrivateKey.getParameters().getModulusSizeBits() != 3072) {
            throw new java.security.GeneralSecurityException("Cannot create FIPS-compliant PublicKeySign: wrong RsaSsaPkcs1 key modulus size");
        }
        return com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce.create(rsaSsaPkcs1PrivateKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.PublicKeyVerify rsaSsaPkcs1VerifyCreate(com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey rsaSsaPkcs1PublicKey) throws java.security.GeneralSecurityException {
        if (rsaSsaPkcs1PublicKey.getParameters().getModulusSizeBits() != 2048 && rsaSsaPkcs1PublicKey.getParameters().getModulusSizeBits() != 3072) {
            throw new java.security.GeneralSecurityException("Cannot create FIPS-compliant PublicKeyVerify: wrong RsaSsaPkcs1 key modulus size");
        }
        return com.google.crypto.tink.signature.internal.RsaSsaPkcs1VerifyConscrypt.create(rsaSsaPkcs1PublicKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.PublicKeySign rsaSsaPssSignCreate(com.google.crypto.tink.signature.RsaSsaPssPrivateKey rsaSsaPssPrivateKey) throws java.security.GeneralSecurityException {
        if (rsaSsaPssPrivateKey.getParameters().getModulusSizeBits() != 2048 && rsaSsaPssPrivateKey.getParameters().getModulusSizeBits() != 3072) {
            throw new java.security.GeneralSecurityException("Cannot create FIPS-compliant PublicKeySign: wrong RsaSsaPss key modulus size");
        }
        return com.google.crypto.tink.signature.internal.RsaSsaPssSignConscrypt.create(rsaSsaPssPrivateKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.PublicKeyVerify rsaSsaPssVerifyCreate(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey) throws java.security.GeneralSecurityException {
        if (rsaSsaPssPublicKey.getParameters().getModulusSizeBits() != 2048 && rsaSsaPssPublicKey.getParameters().getModulusSizeBits() != 3072) {
            throw new java.security.GeneralSecurityException("Cannot create FIPS-compliant PublicKeyVerify: wrong RsaSsaPss key modulus size");
        }
        return com.google.crypto.tink.signature.internal.RsaSsaPssVerifyConscrypt.create(rsaSsaPssPublicKey);
    }
}
