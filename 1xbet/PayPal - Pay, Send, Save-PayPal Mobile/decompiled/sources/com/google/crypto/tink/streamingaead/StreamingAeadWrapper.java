package com.google.crypto.tink.streamingaead;

/* loaded from: classes9.dex */
public class StreamingAeadWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.StreamingAead, com.google.crypto.tink.StreamingAead> {
    private static final com.google.crypto.tink.streamingaead.StreamingAeadWrapper WRAPPER = new com.google.crypto.tink.streamingaead.StreamingAeadWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.StreamingAead> LEGACY_FULL_STREAMING_AEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.streamingaead.StreamingAeadWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.streamingaead.internal.LegacyFullStreamingAead.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.StreamingAead.class);

    StreamingAeadWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.StreamingAead wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.StreamingAead> primitiveFactory) throws java.security.GeneralSecurityException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                arrayList.add(primitiveFactory.create(at));
            }
        }
        com.google.crypto.tink.internal.KeysetHandleInterface.Entry primary = keysetHandleInterface.getPrimary();
        if (primary == null) {
            throw new java.security.GeneralSecurityException("No primary set");
        }
        com.google.crypto.tink.StreamingAead create = primitiveFactory.create(primary);
        if (create == null) {
            throw new java.security.GeneralSecurityException("No primary set");
        }
        return new com.google.crypto.tink.streamingaead.StreamingAeadHelper(arrayList, create);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.StreamingAead> getPrimitiveClass() {
        return com.google.crypto.tink.StreamingAead.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.StreamingAead> getInputPrimitiveClass() {
        return com.google.crypto.tink.StreamingAead.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_FULL_STREAMING_AEAD_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
