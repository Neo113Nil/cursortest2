package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public abstract class ParametersParser<SerializationT extends com.google.crypto.tink.internal.Serialization> {
    private final com.google.crypto.tink.util.Bytes objectIdentifier;
    private final java.lang.Class<SerializationT> serializationClass;

    public interface ParametersParsingFunction<SerializationT extends com.google.crypto.tink.internal.Serialization> {
        com.google.crypto.tink.Parameters parseParameters(SerializationT serializationt) throws java.security.GeneralSecurityException;
    }

    public abstract com.google.crypto.tink.Parameters parseParameters(SerializationT serializationt) throws java.security.GeneralSecurityException;

    private ParametersParser(com.google.crypto.tink.util.Bytes bytes, java.lang.Class<SerializationT> cls) {
        this.objectIdentifier = bytes;
        this.serializationClass = cls;
    }

    public final com.google.crypto.tink.util.Bytes getObjectIdentifier() {
        return this.objectIdentifier;
    }

    public final java.lang.Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public static <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.ParametersParser<SerializationT> create(final com.google.crypto.tink.internal.ParametersParser.ParametersParsingFunction<SerializationT> parametersParsingFunction, com.google.crypto.tink.util.Bytes bytes, java.lang.Class<SerializationT> cls) {
        return (com.google.crypto.tink.internal.ParametersParser<SerializationT>) new com.google.crypto.tink.internal.ParametersParser<SerializationT>(bytes, cls) { // from class: com.google.crypto.tink.internal.ParametersParser.1
            @Override // com.google.crypto.tink.internal.ParametersParser
            public com.google.crypto.tink.Parameters parseParameters(SerializationT serializationt) throws java.security.GeneralSecurityException {
                return parametersParsingFunction.parseParameters(serializationt);
            }
        };
    }
}
