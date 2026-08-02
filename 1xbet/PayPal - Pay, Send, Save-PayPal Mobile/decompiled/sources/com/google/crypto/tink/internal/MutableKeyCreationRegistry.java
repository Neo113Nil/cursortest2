package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class MutableKeyCreationRegistry {
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.internal.LegacyProtoParameters> LEGACY_PROTO_KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.internal.MutableKeyCreationRegistry$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.internal.LegacyProtoKey createProtoKeyFromProtoParameters;
            createProtoKeyFromProtoParameters = com.google.crypto.tink.internal.MutableKeyCreationRegistry.createProtoKeyFromProtoParameters((com.google.crypto.tink.internal.LegacyProtoParameters) parameters, num);
            return createProtoKeyFromProtoParameters;
        }
    };
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry globalInstance = newRegistryWithLegacyFallback();
    private final java.util.Map<java.lang.Class<? extends com.google.crypto.tink.Parameters>, com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<? extends com.google.crypto.tink.Parameters>> creators = new java.util.HashMap();

    public interface KeyCreator<ParametersT extends com.google.crypto.tink.Parameters> {
        com.google.crypto.tink.Key createKey(ParametersT parameterst, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.LegacyProtoKey createProtoKeyFromProtoParameters(com.google.crypto.tink.internal.LegacyProtoParameters legacyProtoParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.KeyTemplate keyTemplate = legacyProtoParameters.getSerialization().getKeyTemplate();
        com.google.crypto.tink.KeyManager<?> untypedKeyManager = com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().getUntypedKeyManager(keyTemplate.getTypeUrl());
        if (!com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().isNewKeyAllowed(keyTemplate.getTypeUrl())) {
            throw new java.security.GeneralSecurityException("Creating new keys is not allowed.");
        }
        com.google.crypto.tink.proto.KeyData newKeyData = untypedKeyManager.newKeyData(keyTemplate.getValue());
        return new com.google.crypto.tink.internal.LegacyProtoKey(com.google.crypto.tink.internal.ProtoKeySerialization.create(newKeyData.getTypeUrl(), newKeyData.getValue(), newKeyData.getKeyMaterialType(), keyTemplate.getOutputPrefixType(), num), com.google.crypto.tink.InsecureSecretKeyAccess.get());
    }

    private static com.google.crypto.tink.internal.MutableKeyCreationRegistry newRegistryWithLegacyFallback() {
        com.google.crypto.tink.internal.MutableKeyCreationRegistry mutableKeyCreationRegistry = new com.google.crypto.tink.internal.MutableKeyCreationRegistry();
        try {
            mutableKeyCreationRegistry.add(LEGACY_PROTO_KEY_CREATOR, com.google.crypto.tink.internal.LegacyProtoParameters.class);
            return mutableKeyCreationRegistry;
        } catch (java.security.GeneralSecurityException e) {
            throw new java.lang.IllegalStateException("unexpected error.", e);
        }
    }

    public static com.google.crypto.tink.internal.MutableKeyCreationRegistry globalInstance() {
        return globalInstance;
    }

    public final <ParametersT extends com.google.crypto.tink.Parameters> void add(com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<ParametersT> keyCreator, java.lang.Class<ParametersT> cls) throws java.security.GeneralSecurityException {
        synchronized (this) {
            com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<? extends com.google.crypto.tink.Parameters> keyCreator2 = this.creators.get(cls);
            if (keyCreator2 != null && !keyCreator2.equals(keyCreator)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Different key creator for parameters class ");
                sb.append(cls);
                sb.append(" already inserted");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            this.creators.put(cls, keyCreator);
        }
    }

    public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        return createKeyTyped(parameters, num);
    }

    private <ParametersT extends com.google.crypto.tink.Parameters> com.google.crypto.tink.Key createKeyTyped(ParametersT parameterst, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Key createKey;
        synchronized (this) {
            com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<? extends com.google.crypto.tink.Parameters> keyCreator = this.creators.get(parameterst.getClass());
            if (keyCreator == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot create a new key for parameters ");
                sb.append(parameterst);
                sb.append(": no key creator for this class was registered.");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            createKey = keyCreator.createKey(parameterst, num);
        }
        return createKey;
    }
}
