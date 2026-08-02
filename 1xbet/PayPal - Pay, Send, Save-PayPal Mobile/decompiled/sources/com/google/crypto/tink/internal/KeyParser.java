package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public abstract class KeyParser<SerializationT extends com.google.crypto.tink.internal.Serialization> {
    private final com.google.crypto.tink.util.Bytes objectIdentifier;
    private final java.lang.Class<SerializationT> serializationClass;

    public interface KeyParsingFunction<SerializationT extends com.google.crypto.tink.internal.Serialization> {
        com.google.crypto.tink.Key parseKey(SerializationT serializationt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException;
    }

    public abstract com.google.crypto.tink.Key parseKey(SerializationT serializationt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException;

    private KeyParser(com.google.crypto.tink.util.Bytes bytes, java.lang.Class<SerializationT> cls) {
        this.objectIdentifier = bytes;
        this.serializationClass = cls;
    }

    public final com.google.crypto.tink.util.Bytes getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public final java.lang.Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public static <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.KeyParser<SerializationT> create(final com.google.crypto.tink.internal.KeyParser.KeyParsingFunction<SerializationT> keyParsingFunction, com.google.crypto.tink.util.Bytes bytes, java.lang.Class<SerializationT> cls) {
        return (com.google.crypto.tink.internal.KeyParser<SerializationT>) new com.google.crypto.tink.internal.KeyParser<SerializationT>(bytes, cls) { // from class: com.google.crypto.tink.internal.KeyParser.1
            @Override // com.google.crypto.tink.internal.KeyParser
            public com.google.crypto.tink.Key parseKey(SerializationT serializationt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
                return keyParsingFunction.parseKey(serializationt, secretKeyAccess);
            }
        };
    }
}
