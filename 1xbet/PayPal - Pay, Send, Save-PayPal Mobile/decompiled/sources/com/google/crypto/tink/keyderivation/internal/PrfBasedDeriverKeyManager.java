package com.google.crypto.tink.keyderivation.internal;

/* loaded from: classes9.dex */
public final class PrfBasedDeriverKeyManager implements com.google.crypto.tink.KeyManager<java.lang.Void> {
    private static final java.lang.String TYPE_URL = "type.googleapis.com/google.crypto.tink.PrfBasedDeriverKey";
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey, com.google.crypto.tink.keyderivation.internal.KeyDeriver> PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.keyderivation.internal.PrfBasedDeriverKeyManager$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDeriver.create((com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey) key);
        }
    }, com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey.class, com.google.crypto.tink.keyderivation.internal.KeyDeriver.class);
    private static final com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator<com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters> KEY_CREATOR = new com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator() { // from class: com.google.crypto.tink.keyderivation.internal.PrfBasedDeriverKeyManager$$ExternalSyntheticLambda1
        @Override // com.google.crypto.tink.internal.MutableKeyCreationRegistry.KeyCreator
        public final com.google.crypto.tink.Key createKey(com.google.crypto.tink.Parameters parameters, java.lang.Integer num) {
            com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey createNewKey;
            createNewKey = com.google.crypto.tink.keyderivation.internal.PrfBasedDeriverKeyManager.createNewKey((com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters) parameters, num);
            return createNewKey;
        }
    };

    @Override // com.google.crypto.tink.KeyManager
    public final int getVersion() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey createNewKey(com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters prfBasedKeyDerivationParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.Key createKey = com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().createKey(prfBasedKeyDerivationParameters.getPrfParameters(), null);
        if (!(createKey instanceof com.google.crypto.tink.prf.PrfKey)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Failed to create PrfKey from parameters");
            sb.append(prfBasedKeyDerivationParameters.getPrfParameters());
            sb.append(", instead got ");
            sb.append(createKey.getClass());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey.create(prfBasedKeyDerivationParameters, (com.google.crypto.tink.prf.PrfKey) createKey, num);
    }

    PrfBasedDeriverKeyManager() {
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.Void getPrimitive(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        throw new java.security.GeneralSecurityException("Cannot use the KeyManager to get a primitive for KeyDerivation");
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.Void getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) throws java.security.GeneralSecurityException {
        throw new java.security.GeneralSecurityException("Cannot use the KeyManager to get a primitive for KeyDerivation");
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.proto.PrfBasedDeriverKey.parseFrom(newKeyData(byteString).getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException unused) {
            throw new java.security.GeneralSecurityException("Unexpectedly failed to parse key");
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) throws java.security.GeneralSecurityException {
        return newKey(messageLite.toByteString());
    }

    @Override // com.google.crypto.tink.KeyManager
    public final boolean doesSupport(java.lang.String str) {
        return str.equals(getKeyType());
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.String getKeyType() {
        return TYPE_URL;
    }

    private static com.google.crypto.tink.proto.OutputPrefixType getOutputPrefixTypeFromSerializedKeyFormat(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        try {
            return com.google.crypto.tink.proto.PrfBasedDeriverKeyFormat.parseFrom(byteString, com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry()).getParams().getDerivedKeyTemplate().getOutputPrefixType();
        } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
            throw new java.security.GeneralSecurityException("Unexpectedly failed to parse key format", e);
        }
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.proto.OutputPrefixType outputPrefixTypeFromSerializedKeyFormat = getOutputPrefixTypeFromSerializedKeyFormat(byteString);
        com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization = (com.google.crypto.tink.internal.ProtoKeySerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeKey(com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().createKey(com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization.checkedCreate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(TYPE_URL).setValue(byteString).setOutputPrefixType(outputPrefixTypeFromSerializedKeyFormat).build())), !outputPrefixTypeFromSerializedKeyFormat.equals(com.google.crypto.tink.proto.OutputPrefixType.RAW) ? java.lang.Integer.valueOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) : null), com.google.crypto.tink.internal.ProtoKeySerialization.class, com.google.crypto.tink.InsecureSecretKeyAccess.get());
        return com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(protoKeySerialization.getTypeUrl()).setValue(protoKeySerialization.getValue()).setKeyMaterialType(protoKeySerialization.getKeyMaterialType()).build();
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.Class<java.lang.Void> getPrimitiveClass() {
        return java.lang.Void.class;
    }

    public static void register(boolean z) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.KeyManagerRegistry.globalInstance().registerKeyManager(new com.google.crypto.tink.keyderivation.internal.PrfBasedDeriverKeyManager(), z);
        com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().add(KEY_CREATOR, com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.class);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(PRIMITIVE_CONSTRUCTOR);
        com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDerivationKeyProtoSerialization.register();
    }
}
