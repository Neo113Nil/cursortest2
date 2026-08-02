package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public abstract class ParametersSerializer<ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> {
    private final java.lang.Class<ParametersT> parametersClass;
    private final java.lang.Class<SerializationT> serializationClass;

    public interface ParametersSerializationFunction<ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> {
        SerializationT serializeParameters(ParametersT parameterst) throws java.security.GeneralSecurityException;
    }

    public abstract SerializationT serializeParameters(ParametersT parameterst) throws java.security.GeneralSecurityException;

    private ParametersSerializer(java.lang.Class<ParametersT> cls, java.lang.Class<SerializationT> cls2) {
        this.parametersClass = cls;
        this.serializationClass = cls2;
    }

    public java.lang.Class<ParametersT> getParametersClass() {
        return this.parametersClass;
    }

    public java.lang.Class<SerializationT> getSerializationClass() {
        return this.serializationClass;
    }

    public static <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT> create(final com.google.crypto.tink.internal.ParametersSerializer.ParametersSerializationFunction<ParametersT, SerializationT> parametersSerializationFunction, java.lang.Class<ParametersT> cls, java.lang.Class<SerializationT> cls2) {
        return (com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT>) new com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT>(cls, cls2) { // from class: com.google.crypto.tink.internal.ParametersSerializer.1
            @Override // com.google.crypto.tink.internal.ParametersSerializer
            public SerializationT serializeParameters(ParametersT parameterst) throws java.security.GeneralSecurityException {
                return (SerializationT) parametersSerializationFunction.serializeParameters(parameterst);
            }
        };
    }
}
