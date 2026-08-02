package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class MutableSerializationRegistry {
    private static final com.google.crypto.tink.internal.MutableSerializationRegistry GLOBAL_INSTANCE = (com.google.crypto.tink.internal.MutableSerializationRegistry) com.google.crypto.tink.internal.TinkBugException.exceptionIsBug(new com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier() { // from class: com.google.crypto.tink.internal.MutableSerializationRegistry$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.TinkBugException.ThrowingSupplier
        public final java.lang.Object get() {
            com.google.crypto.tink.internal.MutableSerializationRegistry createGlobalInstance;
            createGlobalInstance = com.google.crypto.tink.internal.MutableSerializationRegistry.createGlobalInstance();
            return createGlobalInstance;
        }
    });
    private final java.util.concurrent.atomic.AtomicReference<com.google.crypto.tink.internal.SerializationRegistry> registry = new java.util.concurrent.atomic.AtomicReference<>(new com.google.crypto.tink.internal.SerializationRegistry.Builder().build());

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.crypto.tink.internal.MutableSerializationRegistry createGlobalInstance() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutableSerializationRegistry mutableSerializationRegistry = new com.google.crypto.tink.internal.MutableSerializationRegistry();
        mutableSerializationRegistry.registerKeySerializer(com.google.crypto.tink.internal.KeySerializer.create(new com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction() { // from class: com.google.crypto.tink.internal.MutableSerializationRegistry$$ExternalSyntheticLambda1
            @Override // com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction
            public final com.google.crypto.tink.internal.Serialization serializeKey(com.google.crypto.tink.Key key, com.google.crypto.tink.SecretKeyAccess secretKeyAccess) {
                return ((com.google.crypto.tink.internal.LegacyProtoKey) key).getSerialization(secretKeyAccess);
            }
        }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.internal.ProtoKeySerialization.class));
        return mutableSerializationRegistry;
    }

    public static com.google.crypto.tink.internal.MutableSerializationRegistry globalInstance() {
        return GLOBAL_INSTANCE;
    }

    public final <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> void registerKeySerializer(com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT> keySerializer) throws java.security.GeneralSecurityException {
        synchronized (this) {
            this.registry.set(new com.google.crypto.tink.internal.SerializationRegistry.Builder(this.registry.get()).registerKeySerializer(keySerializer).build());
        }
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> void registerKeyParser(com.google.crypto.tink.internal.KeyParser<SerializationT> keyParser) throws java.security.GeneralSecurityException {
        synchronized (this) {
            this.registry.set(new com.google.crypto.tink.internal.SerializationRegistry.Builder(this.registry.get()).registerKeyParser(keyParser).build());
        }
    }

    public final <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> void registerParametersSerializer(com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT> parametersSerializer) throws java.security.GeneralSecurityException {
        synchronized (this) {
            this.registry.set(new com.google.crypto.tink.internal.SerializationRegistry.Builder(this.registry.get()).registerParametersSerializer(parametersSerializer).build());
        }
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> void registerParametersParser(com.google.crypto.tink.internal.ParametersParser<SerializationT> parametersParser) throws java.security.GeneralSecurityException {
        synchronized (this) {
            this.registry.set(new com.google.crypto.tink.internal.SerializationRegistry.Builder(this.registry.get()).registerParametersParser(parametersParser).build());
        }
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForKey(SerializationT serializationt) {
        return this.registry.get().hasParserForKey(serializationt);
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Key parseKey(SerializationT serializationt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return this.registry.get().parseKey(serializationt, secretKeyAccess);
    }

    public final com.google.crypto.tink.Key parseKeyWithLegacyFallback(com.google.crypto.tink.internal.ProtoKeySerialization protoKeySerialization, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        if (!hasParserForKey(protoKeySerialization)) {
            return new com.google.crypto.tink.internal.LegacyProtoKey(protoKeySerialization, secretKeyAccess);
        }
        return parseKey(protoKeySerialization, secretKeyAccess);
    }

    public final <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForKey(KeyT keyt, java.lang.Class<SerializationT> cls) {
        return this.registry.get().hasSerializerForKey(keyt, cls);
    }

    public final <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeKey(KeyT keyt, java.lang.Class<SerializationT> cls, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        return (SerializationT) this.registry.get().serializeKey(keyt, cls, secretKeyAccess);
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForParameters(SerializationT serializationt) {
        return this.registry.get().hasParserForParameters(serializationt);
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Parameters parseParameters(SerializationT serializationt) throws java.security.GeneralSecurityException {
        return this.registry.get().parseParameters(serializationt);
    }

    public final com.google.crypto.tink.Parameters parseParametersWithLegacyFallback(com.google.crypto.tink.internal.ProtoParametersSerialization protoParametersSerialization) throws java.security.GeneralSecurityException {
        if (!hasParserForParameters(protoParametersSerialization)) {
            return new com.google.crypto.tink.internal.LegacyProtoParameters(protoParametersSerialization);
        }
        return parseParameters(protoParametersSerialization);
    }

    public final <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForParameters(ParametersT parameterst, java.lang.Class<SerializationT> cls) {
        return this.registry.get().hasSerializerForParameters(parameterst, cls);
    }

    public final <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeParameters(ParametersT parameterst, java.lang.Class<SerializationT> cls) throws java.security.GeneralSecurityException {
        return (SerializationT) this.registry.get().serializeParameters(parameterst, cls);
    }
}
