package com.google.crypto.tink.internal;

/* loaded from: classes4.dex */
public class PrimitiveRegistry {
    private final java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> primitiveConstructorMap;
    private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveWrapper<?, ?>> primitiveWrapperMap;

    public static final class Builder {
        private final java.util.Map<com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex, com.google.crypto.tink.internal.PrimitiveConstructor<?, ?>> primitiveConstructorMap;
        private final java.util.Map<java.lang.Class<?>, com.google.crypto.tink.internal.PrimitiveWrapper<?, ?>> primitiveWrapperMap;

        private Builder() {
            this.primitiveConstructorMap = new java.util.HashMap();
            this.primitiveWrapperMap = new java.util.HashMap();
        }

        private Builder(com.google.crypto.tink.internal.PrimitiveRegistry primitiveRegistry) {
            this.primitiveConstructorMap = new java.util.HashMap(primitiveRegistry.primitiveConstructorMap);
            this.primitiveWrapperMap = new java.util.HashMap(primitiveRegistry.primitiveWrapperMap);
        }

        public final <KeyT extends com.google.crypto.tink.Key, PrimitiveT> com.google.crypto.tink.internal.PrimitiveRegistry.Builder registerPrimitiveConstructor(com.google.crypto.tink.internal.PrimitiveConstructor<KeyT, PrimitiveT> primitiveConstructor) throws java.security.GeneralSecurityException {
            if (primitiveConstructor == null) {
                throw new java.lang.NullPointerException("primitive constructor must be non-null");
            }
            com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex primitiveConstructorIndex = new com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex(primitiveConstructor.getKeyClass(), primitiveConstructor.getPrimitiveClass());
            if (this.primitiveConstructorMap.containsKey(primitiveConstructorIndex)) {
                com.google.crypto.tink.internal.PrimitiveConstructor<?, ?> primitiveConstructor2 = this.primitiveConstructorMap.get(primitiveConstructorIndex);
                if (primitiveConstructor2.equals(primitiveConstructor) && primitiveConstructor.equals(primitiveConstructor2)) {
                    return this;
                }
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(java.lang.String.valueOf(primitiveConstructorIndex)));
            }
            this.primitiveConstructorMap.put(primitiveConstructorIndex, primitiveConstructor);
            return this;
        }

        public final <InputPrimitiveT, WrapperPrimitiveT> com.google.crypto.tink.internal.PrimitiveRegistry.Builder registerPrimitiveWrapper(com.google.crypto.tink.internal.PrimitiveWrapper<InputPrimitiveT, WrapperPrimitiveT> primitiveWrapper) throws java.security.GeneralSecurityException {
            if (primitiveWrapper == null) {
                throw new java.lang.NullPointerException("wrapper must be non-null");
            }
            java.lang.Class<WrapperPrimitiveT> primitiveClass = primitiveWrapper.getPrimitiveClass();
            if (this.primitiveWrapperMap.containsKey(primitiveClass)) {
                com.google.crypto.tink.internal.PrimitiveWrapper<?, ?> primitiveWrapper2 = this.primitiveWrapperMap.get(primitiveClass);
                if (primitiveWrapper2.equals(primitiveWrapper) && primitiveWrapper.equals(primitiveWrapper2)) {
                    return this;
                }
                throw new java.security.GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(java.lang.String.valueOf(primitiveClass)));
            }
            this.primitiveWrapperMap.put(primitiveClass, primitiveWrapper);
            return this;
        }

        public final com.google.crypto.tink.internal.PrimitiveRegistry build() {
            return new com.google.crypto.tink.internal.PrimitiveRegistry(this);
        }
    }

    public static com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder() {
        return new com.google.crypto.tink.internal.PrimitiveRegistry.Builder();
    }

    public static com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder(com.google.crypto.tink.internal.PrimitiveRegistry primitiveRegistry) {
        return new com.google.crypto.tink.internal.PrimitiveRegistry.Builder();
    }

    private PrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) {
        this.primitiveConstructorMap = new java.util.HashMap(builder.primitiveConstructorMap);
        this.primitiveWrapperMap = new java.util.HashMap(builder.primitiveWrapperMap);
    }

    public <KeyT extends com.google.crypto.tink.Key, PrimitiveT> PrimitiveT getPrimitive(KeyT keyt, java.lang.Class<PrimitiveT> cls) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex primitiveConstructorIndex = new com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex(keyt.getClass(), cls);
        if (!this.primitiveConstructorMap.containsKey(primitiveConstructorIndex)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No PrimitiveConstructor for ");
            sb.append(primitiveConstructorIndex);
            sb.append(" available, see https://developers.google.com/tink/faq/registration_errors");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        return (PrimitiveT) this.primitiveConstructorMap.get(primitiveConstructorIndex).constructPrimitive(keyt);
    }

    private <InnerPrimitiveT, WrappedPrimitiveT> WrappedPrimitiveT wrapWithPrimitiveWrapper(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, final com.google.crypto.tink.internal.PrimitiveWrapper<InnerPrimitiveT, WrappedPrimitiveT> primitiveWrapper) throws java.security.GeneralSecurityException {
        return primitiveWrapper.wrap(keysetHandleInterface, monitoringAnnotations, new com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory() { // from class: com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0
            @Override // com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory
            public final java.lang.Object create(com.google.crypto.tink.internal.KeysetHandleInterface.Entry entry) {
                return com.google.crypto.tink.internal.PrimitiveRegistry.this.m10387x82d2bc2c(primitiveWrapper, entry);
            }
        });
    }

    /* renamed from: lambda$wrapWithPrimitiveWrapper$0$com-google-crypto-tink-internal-PrimitiveRegistry, reason: not valid java name */
    /* synthetic */ java.lang.Object m10387x82d2bc2c(com.google.crypto.tink.internal.PrimitiveWrapper primitiveWrapper, com.google.crypto.tink.internal.KeysetHandleInterface.Entry entry) throws java.security.GeneralSecurityException {
        return getPrimitive(entry.getKey(), primitiveWrapper.getInputPrimitiveClass());
    }

    public <WrappedPrimitiveT> WrappedPrimitiveT wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, java.lang.Class<WrappedPrimitiveT> cls) throws java.security.GeneralSecurityException {
        if (!this.primitiveWrapperMap.containsKey(cls)) {
            throw new java.security.GeneralSecurityException("No wrapper found for ".concat(java.lang.String.valueOf(cls)));
        }
        return (WrappedPrimitiveT) wrapWithPrimitiveWrapper(keysetHandleInterface, monitoringAnnotations, this.primitiveWrapperMap.get(cls));
    }

    static final class PrimitiveConstructorIndex {
        private final java.lang.Class<?> keyClass;
        private final java.lang.Class<?> primitiveClass;

        private PrimitiveConstructorIndex(java.lang.Class<?> cls, java.lang.Class<?> cls2) {
            this.keyClass = cls;
            this.primitiveClass = cls2;
        }

        public final boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex)) {
                return false;
            }
            com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex primitiveConstructorIndex = (com.google.crypto.tink.internal.PrimitiveRegistry.PrimitiveConstructorIndex) obj;
            return primitiveConstructorIndex.keyClass.equals(this.keyClass) && primitiveConstructorIndex.primitiveClass.equals(this.primitiveClass);
        }

        public final int hashCode() {
            return java.util.Objects.hash(this.keyClass, this.primitiveClass);
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.keyClass.getSimpleName());
            sb.append(" with primitive type: ");
            sb.append(this.primitiveClass.getSimpleName());
            return sb.toString();
        }
    }
}
