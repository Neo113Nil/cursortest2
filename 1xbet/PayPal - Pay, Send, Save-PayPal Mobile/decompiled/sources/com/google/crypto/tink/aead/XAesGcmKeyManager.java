package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class XAesGcmKeyManager {
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.aead.XAesGcmParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.aead.XAesGcmKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.aead.XAesGcmKey createXAesGcmKey;
            createXAesGcmKey = com.google.crypto.tink.aead.XAesGcmKeyManager.createXAesGcmKey((com.google.crypto.tink.aead.XAesGcmParameters) parameters, num);
            return createXAesGcmKey;
        }
    };
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.aead.XAesGcmKey, com.google.crypto.tink.Aead> X_AES_GCM_PRIMITVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.aead.AeadConfigurationV0$$ExternalSyntheticLambda2(), com.google.crypto.tink.aead.XAesGcmKey.class, com.google.crypto.tink.Aead.class);

    private static java.util.Map<java.lang.String, com.google.crypto.tink.Parameters> namedParameters() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", com.google.crypto.tink.aead.PredefinedAeadParameters.XAES_256_GCM_192_BIT_NONCE);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", com.google.crypto.tink.aead.PredefinedAeadParameters.XAES_256_GCM_192_BIT_NONCE_NO_PREFIX);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", com.google.crypto.tink.aead.PredefinedAeadParameters.XAES_256_GCM_160_BIT_NONCE_NO_PREFIX);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", com.google.crypto.tink.aead.PredefinedAeadParameters.X_AES_GCM_8_BYTE_SALT_NO_PREFIX);
        return java.util.Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.aead.XAesGcmKey createXAesGcmKey(com.google.crypto.tink.aead.XAesGcmParameters xAesGcmParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.aead.XAesGcmKey.create(xAesGcmParameters, com.google.crypto.tink.util.SecretBytes.randomBytes(32), num);
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.aead.internal.XAesGcmProtoSerialization.register();
        com.google.crypto.tink.internal.MutableParametersRegistry.globalInstance().putAll(namedParameters());
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(X_AES_GCM_PRIMITVE_CONSTRUCTOR);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.aead.XAesGcmParameters.class);
    }

    private XAesGcmKeyManager() {
    }
}
