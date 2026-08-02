package com.google.crypto.tink;

/* loaded from: classes9.dex */
public class ConfigurationV0 {
    private static final int AES_CMAC_KEY_SIZE_BYTES = 32;

    private ConfigurationV0() {
    }

    public static com.google.crypto.tink.Configuration get() throws java.security.GeneralSecurityException {
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips()) {
            throw new java.security.GeneralSecurityException("Cannot use non-FIPS-compliant ConfigurationV0 in FIPS mode");
        }
        com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder = com.google.crypto.tink.internal.PrimitiveRegistry.builder();
        com.google.crypto.tink.mac.MacWrapper.registerToInternalPrimitiveRegistry(builder);
        com.google.crypto.tink.mac.ChunkedMacWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.Mac createAesCmac;
                createAesCmac = com.google.crypto.tink.ConfigurationV0.createAesCmac((com.google.crypto.tink.mac.AesCmacKey) key);
                return createAesCmac;
            }
        }, com.google.crypto.tink.mac.AesCmacKey.class, com.google.crypto.tink.Mac.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda0(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.Mac.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda8
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.mac.ChunkedMac createChunkedAesCmac;
                createChunkedAesCmac = com.google.crypto.tink.ConfigurationV0.createChunkedAesCmac((com.google.crypto.tink.mac.AesCmacKey) key);
                return createChunkedAesCmac;
            }
        }, com.google.crypto.tink.mac.AesCmacKey.class, com.google.crypto.tink.mac.ChunkedMac.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda3(), com.google.crypto.tink.mac.HmacKey.class, com.google.crypto.tink.mac.ChunkedMac.class));
        com.google.crypto.tink.aead.AeadWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda4(), com.google.crypto.tink.aead.AesCtrHmacAeadKey.class, com.google.crypto.tink.Aead.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda9(), com.google.crypto.tink.aead.AesEaxKey.class, com.google.crypto.tink.Aead.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda5(), com.google.crypto.tink.aead.AesGcmKey.class, com.google.crypto.tink.Aead.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda10(), com.google.crypto.tink.aead.AesGcmSivKey.class, com.google.crypto.tink.Aead.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda11
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.Aead createChaCha20Poly1305;
                createChaCha20Poly1305 = com.google.crypto.tink.ConfigurationV0.createChaCha20Poly1305((com.google.crypto.tink.aead.ChaCha20Poly1305Key) key);
                return createChaCha20Poly1305;
            }
        }, com.google.crypto.tink.aead.ChaCha20Poly1305Key.class, com.google.crypto.tink.Aead.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda12
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.Aead createXChaCha20Poly1305;
                createXChaCha20Poly1305 = com.google.crypto.tink.ConfigurationV0.createXChaCha20Poly1305((com.google.crypto.tink.aead.XChaCha20Poly1305Key) key);
                return createXChaCha20Poly1305;
            }
        }, com.google.crypto.tink.aead.XChaCha20Poly1305Key.class, com.google.crypto.tink.Aead.class));
        com.google.crypto.tink.daead.DeterministicAeadWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda7
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.DeterministicAead createAesSiv;
                createAesSiv = com.google.crypto.tink.ConfigurationV0.createAesSiv((com.google.crypto.tink.daead.AesSivKey) key);
                return createAesSiv;
            }
        }, com.google.crypto.tink.daead.AesSivKey.class, com.google.crypto.tink.DeterministicAead.class));
        com.google.crypto.tink.streamingaead.StreamingAeadWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda13(), com.google.crypto.tink.streamingaead.AesCtrHmacStreamingKey.class, com.google.crypto.tink.StreamingAead.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda14(), com.google.crypto.tink.streamingaead.AesGcmHkdfStreamingKey.class, com.google.crypto.tink.StreamingAead.class));
        com.google.crypto.tink.hybrid.HybridEncryptWrapper.registerToInternalPrimitiveRegistry(builder);
        com.google.crypto.tink.hybrid.HybridDecryptWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda15(), com.google.crypto.tink.hybrid.EciesPublicKey.class, com.google.crypto.tink.HybridEncrypt.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda16(), com.google.crypto.tink.hybrid.EciesPrivateKey.class, com.google.crypto.tink.HybridDecrypt.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda17(), com.google.crypto.tink.hybrid.HpkePublicKey.class, com.google.crypto.tink.HybridEncrypt.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda18(), com.google.crypto.tink.hybrid.HpkePrivateKey.class, com.google.crypto.tink.HybridDecrypt.class));
        com.google.crypto.tink.prf.PrfSetWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda19
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.prf.Prf createAesCmacPrf;
                createAesCmacPrf = com.google.crypto.tink.ConfigurationV0.createAesCmacPrf((com.google.crypto.tink.prf.AesCmacPrfKey) key);
                return createAesCmacPrf;
            }
        }, com.google.crypto.tink.prf.AesCmacPrfKey.class, com.google.crypto.tink.prf.Prf.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda20
            @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
            public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
                com.google.crypto.tink.prf.Prf createHkdfPrf;
                createHkdfPrf = com.google.crypto.tink.ConfigurationV0.createHkdfPrf((com.google.crypto.tink.prf.HkdfPrfKey) key);
                return createHkdfPrf;
            }
        }, com.google.crypto.tink.prf.HkdfPrfKey.class, com.google.crypto.tink.prf.Prf.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda6(), com.google.crypto.tink.prf.HmacPrfKey.class, com.google.crypto.tink.prf.Prf.class));
        com.google.crypto.tink.signature.PublicKeySignWrapper.registerToInternalPrimitiveRegistry(builder);
        com.google.crypto.tink.signature.PublicKeyVerifyWrapper.registerToInternalPrimitiveRegistry(builder);
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda7(), com.google.crypto.tink.signature.EcdsaPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationFips140v2$$ExternalSyntheticLambda8(), com.google.crypto.tink.signature.EcdsaPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda1(), com.google.crypto.tink.signature.Ed25519PrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda2(), com.google.crypto.tink.signature.Ed25519PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda3(), com.google.crypto.tink.signature.RsaSsaPkcs1PrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda4(), com.google.crypto.tink.signature.RsaSsaPkcs1PublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda5(), com.google.crypto.tink.signature.RsaSsaPssPrivateKey.class, com.google.crypto.tink.PublicKeySign.class));
        builder.registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.ConfigurationV0$$ExternalSyntheticLambda6(), com.google.crypto.tink.signature.RsaSsaPssPublicKey.class, com.google.crypto.tink.PublicKeyVerify.class));
        return com.google.crypto.tink.internal.InternalConfiguration.createFromPrimitiveRegistry(builder.build());
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
    public static com.google.crypto.tink.DeterministicAead createAesSiv(com.google.crypto.tink.daead.AesSivKey aesSivKey) throws java.security.GeneralSecurityException {
        if (aesSivKey.getParameters().getKeySizeBytes() != 64) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid key size: ");
            sb.append(aesSivKey.getParameters().getKeySizeBytes());
            sb.append(". Valid keys must have 64 bytes.");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return com.google.crypto.tink.subtle.AesSiv.create(aesSivKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.Prf createHkdfPrf(com.google.crypto.tink.prf.HkdfPrfKey hkdfPrfKey) throws java.security.GeneralSecurityException {
        if (hkdfPrfKey.getParameters().getKeySizeBytes() < 32) {
            throw new java.security.GeneralSecurityException("Key size must be at least 32");
        }
        if (hkdfPrfKey.getParameters().getHashType() != com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA256 && hkdfPrfKey.getParameters().getHashType() != com.google.crypto.tink.prf.HkdfPrfParameters.HashType.SHA512) {
            throw new java.security.GeneralSecurityException("Hash type must be SHA256 or SHA512");
        }
        return com.google.crypto.tink.subtle.prf.PrfImpl.wrap(com.google.crypto.tink.subtle.prf.HkdfStreamingPrf.create(hkdfPrfKey));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.prf.Prf createAesCmacPrf(com.google.crypto.tink.prf.AesCmacPrfKey aesCmacPrfKey) throws java.security.GeneralSecurityException {
        if (aesCmacPrfKey.getParameters().getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("Key size must be 32 bytes");
        }
        return com.google.crypto.tink.subtle.PrfAesCmac.create(aesCmacPrfKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.mac.ChunkedMac createChunkedAesCmac(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        if (aesCmacKey.getParameters().getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("AesCmac key size is not 32 bytes");
        }
        return new com.google.crypto.tink.mac.internal.ChunkedAesCmacImpl(aesCmacKey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.Mac createAesCmac(com.google.crypto.tink.mac.AesCmacKey aesCmacKey) throws java.security.GeneralSecurityException {
        if (aesCmacKey.getParameters().getKeySizeBytes() != 32) {
            throw new java.security.GeneralSecurityException("AesCmac key size is not 32 bytes");
        }
        return com.google.crypto.tink.subtle.PrfMac.create(aesCmacKey);
    }
}
