package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public class LegacyKeyManagerImpl<P> implements com.google.crypto.tink.KeyManager<P> {
    final com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType;
    final java.lang.Class<P> primitiveClass;
    final com.google.crypto.tink.shaded.protobuf.Parser<? extends com.google.crypto.tink.shaded.protobuf.MessageLite> protobufKeyParser;
    final java.lang.String typeUrl;

    @Override // com.google.crypto.tink.KeyManager
    public int getVersion() {
        return 0;
    }

    public static <P> com.google.crypto.tink.KeyManager<P> create(java.lang.String str, java.lang.Class<P> cls, com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType, com.google.crypto.tink.shaded.protobuf.Parser<? extends com.google.crypto.tink.shaded.protobuf.MessageLite> parser) {
        return new com.google.crypto.tink.internal.LegacyKeyManagerImpl(str, cls, keyMaterialType, parser);
    }

    LegacyKeyManagerImpl(java.lang.String str, java.lang.Class<P> cls, com.google.crypto.tink.proto.KeyData.KeyMaterialType keyMaterialType, com.google.crypto.tink.shaded.protobuf.Parser<? extends com.google.crypto.tink.shaded.protobuf.MessageLite> parser) {
        this.protobufKeyParser = parser;
        this.typeUrl = str;
        this.primitiveClass = cls;
        this.keyMaterialType = keyMaterialType;
    }

    @Override // com.google.crypto.tink.KeyManager
    public P getPrimitive(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        return (P) com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().getPrimitive(com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(com.google.crypto.tink.internal.ProtoKeySerialization.create(this.typeUrl, byteString, this.keyMaterialType, com.google.crypto.tink.proto.OutputPrefixType.RAW, null), com.google.crypto.tink.InsecureSecretKeyAccess.get()), this.primitiveClass);
    }

    @Override // com.google.crypto.tink.KeyManager
    public final P getPrimitive(com.google.crypto.tink.shaded.protobuf.MessageLite messageLite) throws java.security.GeneralSecurityException {
        return getPrimitive(messageLite.toByteString());
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.shaded.protobuf.MessageLite newKey(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        try {
            return this.protobufKeyParser.parseFrom(newKeyData(byteString).getValue(), com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite.getEmptyRegistry());
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
        return this.typeUrl;
    }

    @Override // com.google.crypto.tink.KeyManager
    public final com.google.crypto.tink.proto.KeyData newKeyData(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization = (com.google.crypto.tink.internal.ProtoKeySerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeKey(com.google.crypto.tink.internal.MutableKeyCreationRegistry.globalInstance().createKey(com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseParameters(com.google.crypto.tink.internal.ProtoParametersSerialization.checkedCreate(com.google.crypto.tink.proto.KeyTemplate.newBuilder().setTypeUrl(this.typeUrl).setValue(byteString).setOutputPrefixType(com.google.crypto.tink.proto.OutputPrefixType.RAW).build())), null), com.google.crypto.tink.internal.ProtoKeySerialization.class, com.google.crypto.tink.InsecureSecretKeyAccess.get());
        return com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(protoKeySerialization.getTypeUrl()).setValue(protoKeySerialization.getValue()).setKeyMaterialType(protoKeySerialization.getKeyMaterialType()).build();
    }

    @Override // com.google.crypto.tink.KeyManager
    public final java.lang.Class<P> getPrimitiveClass() {
        return this.primitiveClass;
    }

    /* loaded from: classes9.dex */
    static class LegacyPrivateKeyManagerImpl<P> extends com.google.crypto.tink.internal.LegacyKeyManagerImpl<P> implements com.google.crypto.tink.PrivateKeyManager<P> {
        protected LegacyPrivateKeyManagerImpl(java.lang.String str, java.lang.Class<P> cls, com.google.crypto.tink.shaded.protobuf.Parser<? extends com.google.crypto.tink.shaded.protobuf.MessageLite> parser) {
            super(str, cls, com.google.crypto.tink.proto.KeyData.KeyMaterialType.ASYMMETRIC_PRIVATE, parser);
        }

        @Override // com.google.crypto.tink.PrivateKeyManager
        public com.google.crypto.tink.proto.KeyData getPublicKeyData(com.google.crypto.tink.shaded.protobuf.ByteString byteString) throws java.security.GeneralSecurityException {
            java.lang.Object parseKey = com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().parseKey(com.google.crypto.tink.internal.ProtoKeySerialization.create(this.typeUrl, byteString, this.keyMaterialType, com.google.crypto.tink.proto.OutputPrefixType.RAW, null), com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (!(parseKey instanceof com.google.crypto.tink.PrivateKey)) {
                throw new java.security.GeneralSecurityException("Key not private key");
            }
            com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization = (com.google.crypto.tink.internal.ProtoKeySerialization) com.google.crypto.tink.internal.MutableSerializationRegistry.globalInstance().serializeKey(((com.google.crypto.tink.PrivateKey) parseKey).getPublicKey(), com.google.crypto.tink.internal.ProtoKeySerialization.class, com.google.crypto.tink.InsecureSecretKeyAccess.get());
            return com.google.crypto.tink.proto.KeyData.newBuilder().setTypeUrl(protoKeySerialization.getTypeUrl()).setValue(protoKeySerialization.getValue()).setKeyMaterialType(protoKeySerialization.getKeyMaterialType()).build();
        }
    }

    public static <P> com.google.crypto.tink.PrivateKeyManager<P> createPrivateKeyManager(java.lang.String str, java.lang.Class<P> cls, com.google.crypto.tink.shaded.protobuf.Parser<? extends com.google.crypto.tink.shaded.protobuf.MessageLite> parser) {
        return new com.google.crypto.tink.internal.LegacyKeyManagerImpl.LegacyPrivateKeyManagerImpl(str, cls, parser);
    }
}
