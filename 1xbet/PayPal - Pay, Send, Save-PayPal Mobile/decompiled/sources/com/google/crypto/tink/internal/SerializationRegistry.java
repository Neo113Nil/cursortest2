package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public final class SerializationRegistry {
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> keyParserMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> keySerializerMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> parametersParserMap;
    private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> parametersSerializerMap;

    public static final class Builder {
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.KeyParser<?>> keyParserMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.KeySerializer<?, ?>> keySerializerMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.ParserIndex, com.google.crypto.tink.internal.ParametersParser<?>> parametersParserMap;
        private final java.util.Map<com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex, com.google.crypto.tink.internal.ParametersSerializer<?, ?>> parametersSerializerMap;

        public Builder() {
            this.keySerializerMap = new java.util.HashMap();
            this.keyParserMap = new java.util.HashMap();
            this.parametersSerializerMap = new java.util.HashMap();
            this.parametersParserMap = new java.util.HashMap();
        }

        public Builder(com.google.crypto.tink.internal.SerializationRegistry serializationRegistry) {
            this.keySerializerMap = new java.util.HashMap(serializationRegistry.keySerializerMap);
            this.keyParserMap = new java.util.HashMap(serializationRegistry.keyParserMap);
            this.parametersSerializerMap = new java.util.HashMap(serializationRegistry.parametersSerializerMap);
            this.parametersParserMap = new java.util.HashMap(serializationRegistry.parametersParserMap);
        }

        public final <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerKeySerializer(com.google.crypto.tink.internal.KeySerializer<KeyT, SerializationT> keySerializer) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex serializerIndex = new com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex(keySerializer.getKeyClass(), keySerializer.getSerializationClass());
            if (this.keySerializerMap.containsKey(serializerIndex)) {
                com.google.crypto.tink.internal.KeySerializer<?, ?> keySerializer2 = this.keySerializerMap.get(serializerIndex);
                if (keySerializer2.equals(keySerializer) && keySerializer.equals(keySerializer2)) {
                    return this;
                }
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(java.lang.String.valueOf(serializerIndex)));
            }
            this.keySerializerMap.put(serializerIndex, keySerializer);
            return this;
        }

        public final <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerKeyParser(com.google.crypto.tink.internal.KeyParser<SerializationT> keyParser) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.SerializationRegistry.ParserIndex parserIndex = new com.google.crypto.tink.internal.SerializationRegistry.ParserIndex(keyParser.getSerializationClass(), keyParser.getObjectIdentifier());
            if (this.keyParserMap.containsKey(parserIndex)) {
                com.google.crypto.tink.internal.KeyParser<?> keyParser2 = this.keyParserMap.get(parserIndex);
                if (keyParser2.equals(keyParser) && keyParser.equals(keyParser2)) {
                    return this;
                }
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(java.lang.String.valueOf(parserIndex)));
            }
            this.keyParserMap.put(parserIndex, keyParser);
            return this;
        }

        public final <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerParametersSerializer(com.google.crypto.tink.internal.ParametersSerializer<ParametersT, SerializationT> parametersSerializer) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex serializerIndex = new com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex(parametersSerializer.getParametersClass(), parametersSerializer.getSerializationClass());
            if (this.parametersSerializerMap.containsKey(serializerIndex)) {
                com.google.crypto.tink.internal.ParametersSerializer<?, ?> parametersSerializer2 = this.parametersSerializerMap.get(serializerIndex);
                if (parametersSerializer2.equals(parametersSerializer) && parametersSerializer.equals(parametersSerializer2)) {
                    return this;
                }
                throw new java.security.GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(java.lang.String.valueOf(serializerIndex)));
            }
            this.parametersSerializerMap.put(serializerIndex, parametersSerializer);
            return this;
        }

        public final <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.internal.SerializationRegistry.Builder registerParametersParser(com.google.crypto.tink.internal.ParametersParser<SerializationT> parametersParser) throws java.security.GeneralSecurityException {
            com.google.crypto.tink.internal.SerializationRegistry.ParserIndex parserIndex = new com.google.crypto.tink.internal.SerializationRegistry.ParserIndex(parametersParser.getSerializationClass(), parametersParser.getObjectIdentifier());
            if (this.parametersParserMap.containsKey(parserIndex)) {
                com.google.crypto.tink.internal.ParametersParser<?> parametersParser2 = this.parametersParserMap.get(parserIndex);
                if (parametersParser2.equals(parametersParser) && parametersParser.equals(parametersParser2)) {
                    return this;
                }
                throw new java.security.GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(java.lang.String.valueOf(parserIndex)));
            }
            this.parametersParserMap.put(parserIndex, parametersParser);
            return this;
        }

        public final com.google.crypto.tink.internal.SerializationRegistry build() {
            return new com.google.crypto.tink.internal.SerializationRegistry(this);
        }
    }

    private SerializationRegistry(com.google.crypto.tink.internal.SerializationRegistry.Builder builder) {
        this.keySerializerMap = new java.util.HashMap(builder.keySerializerMap);
        this.keyParserMap = new java.util.HashMap(builder.keyParserMap);
        this.parametersSerializerMap = new java.util.HashMap(builder.parametersSerializerMap);
        this.parametersParserMap = new java.util.HashMap(builder.parametersParserMap);
    }

    static class SerializerIndex {
        private final java.lang.Class<?> keyClass;
        private final java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> keySerializationClass;

        private SerializerIndex(java.lang.Class<?> cls, java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> cls2) {
            this.keyClass = cls;
            this.keySerializationClass = cls2;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex)) {
                return false;
            }
            com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex serializerIndex = (com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex) obj;
            return serializerIndex.keyClass.equals(this.keyClass) && serializerIndex.keySerializationClass.equals(this.keySerializationClass);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.keyClass, this.keySerializationClass);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.keyClass.getSimpleName());
            sb.append(" with serialization type: ");
            sb.append(this.keySerializationClass.getSimpleName());
            return sb.toString();
        }
    }

    static class ParserIndex {
        private final java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> keySerializationClass;
        private final com.google.crypto.tink.util.Bytes serializationIdentifier;

        private ParserIndex(java.lang.Class<? extends com.google.crypto.tink.internal.Serialization> cls, com.google.crypto.tink.util.Bytes bytes) {
            this.keySerializationClass = cls;
            this.serializationIdentifier = bytes;
        }

        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.crypto.tink.internal.SerializationRegistry.ParserIndex)) {
                return false;
            }
            com.google.crypto.tink.internal.SerializationRegistry.ParserIndex parserIndex = (com.google.crypto.tink.internal.SerializationRegistry.ParserIndex) obj;
            return parserIndex.keySerializationClass.equals(this.keySerializationClass) && parserIndex.serializationIdentifier.equals(this.serializationIdentifier);
        }

        public int hashCode() {
            return java.util.Objects.hash(this.keySerializationClass, this.serializationIdentifier);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.keySerializationClass.getSimpleName());
            sb.append(", object identifier: ");
            sb.append(this.serializationIdentifier);
            return sb.toString();
        }
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForKey(SerializationT serializationt) {
        return this.keyParserMap.containsKey(new com.google.crypto.tink.internal.SerializationRegistry.ParserIndex(serializationt.getClass(), serializationt.getObjectIdentifier()));
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Key parseKey(SerializationT serializationt, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.SerializationRegistry.ParserIndex parserIndex = new com.google.crypto.tink.internal.SerializationRegistry.ParserIndex(serializationt.getClass(), serializationt.getObjectIdentifier());
        if (!this.keyParserMap.containsKey(parserIndex)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No Key Parser for requested key type ");
            sb.append(parserIndex);
            sb.append(" available");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return this.keyParserMap.get(parserIndex).parseKey(serializationt, secretKeyAccess);
    }

    public final <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForKey(KeyT keyt, java.lang.Class<SerializationT> cls) {
        return this.keySerializerMap.containsKey(new com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex(keyt.getClass(), cls));
    }

    public final <KeyT extends com.google.crypto.tink.Key, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeKey(KeyT keyt, java.lang.Class<SerializationT> cls, @javax.annotation.Nullable com.google.crypto.tink.SecretKeyAccess secretKeyAccess) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex serializerIndex = new com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex(keyt.getClass(), cls);
        if (!this.keySerializerMap.containsKey(serializerIndex)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No Key serializer for ");
            sb.append(serializerIndex);
            sb.append(" available");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return (SerializationT) this.keySerializerMap.get(serializerIndex).serializeKey(keyt, secretKeyAccess);
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasParserForParameters(SerializationT serializationt) {
        return this.parametersParserMap.containsKey(new com.google.crypto.tink.internal.SerializationRegistry.ParserIndex(serializationt.getClass(), serializationt.getObjectIdentifier()));
    }

    public final <SerializationT extends com.google.crypto.tink.internal.Serialization> com.google.crypto.tink.Parameters parseParameters(SerializationT serializationt) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.SerializationRegistry.ParserIndex parserIndex = new com.google.crypto.tink.internal.SerializationRegistry.ParserIndex(serializationt.getClass(), serializationt.getObjectIdentifier());
        if (!this.parametersParserMap.containsKey(parserIndex)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No Parameters Parser for requested key type ");
            sb.append(parserIndex);
            sb.append(" available");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return this.parametersParserMap.get(parserIndex).parseParameters(serializationt);
    }

    public final <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> boolean hasSerializerForParameters(ParametersT parameterst, java.lang.Class<SerializationT> cls) {
        return this.parametersSerializerMap.containsKey(new com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex(parameterst.getClass(), cls));
    }

    public final <ParametersT extends com.google.crypto.tink.Parameters, SerializationT extends com.google.crypto.tink.internal.Serialization> SerializationT serializeParameters(ParametersT parameterst, java.lang.Class<SerializationT> cls) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex serializerIndex = new com.google.crypto.tink.internal.SerializationRegistry.SerializerIndex(parameterst.getClass(), cls);
        if (!this.parametersSerializerMap.containsKey(serializerIndex)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No Key Format serializer for ");
            sb.append(serializerIndex);
            sb.append(" available");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return (SerializationT) this.parametersSerializerMap.get(serializerIndex).serializeParameters(parameterst);
    }
}
