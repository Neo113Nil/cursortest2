package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public abstract class KeySerializer<KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> {
    private final java.lang.Class<KeyT> keyClass;
    private final java.lang.Class<SerializationT> serializationClass;

    public interface KeySerializationFunction<KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> {
        SerializationT serializeKey(KeyT keyt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException;
    }

    public abstract SerializationT serializeKey(KeyT keyt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException;

    private KeySerializer(java.lang.Class<KeyT> cls, java.lang.Class<SerializationT> cls2) {
        this.keyClass = cls;
        this.serializationClass = cls2;
    }

    public java.lang.Class<KeyT> getKeyClass() {
        return this.keyClass;
    }

    public java.lang.Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public static <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT> create(final com.google.crypto.tink.internal.KeySerializer.KeySerializationFunction<KeyT, SerializationT> keySerializationFunction, java.lang.Class<KeyT> cls, java.lang.Class<SerializationT> cls2) {
        return (com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT>) new com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT>(cls, cls2) { // from class: com.google.crypto.tink.internal.KeySerializer.1
            @Override // com.google.crypto.tink.internal.KeySerializer
            public SerializationT serializeKey(KeyT keyt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
                return (SerializationT) keySerializationFunction.serializeKey(keyt, secretKeyAccess);
            }
        };
    }
}
