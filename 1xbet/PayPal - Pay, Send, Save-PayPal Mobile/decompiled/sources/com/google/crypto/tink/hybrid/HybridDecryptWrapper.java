package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public class HybridDecryptWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.HybridDecrypt, com.google.crypto.tink.HybridDecrypt> {
    private static final com.google.crypto.tink.hybrid.HybridDecryptWrapper WRAPPER = new com.google.crypto.tink.hybrid.HybridDecryptWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.HybridDecrypt> LEGACY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.hybrid.HybridDecryptWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.hybrid.internal.LegacyFullHybridDecrypt.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.HybridDecrypt.class);

    static class HybridDecryptWithId {
        public final com.google.crypto.tink.HybridDecrypt hybridDecrypt;
        public final int id;

        public HybridDecryptWithId(com.google.crypto.tink.HybridDecrypt hybridDecrypt, int i) {
            this.hybridDecrypt = hybridDecrypt;
            this.id = i;
        }
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.Key key) throws java.security.GeneralSecurityException {
        if (key instanceof com.google.crypto.tink.hybrid.HybridPrivateKey) {
            return ((com.google.crypto.tink.hybrid.HybridPrivateKey) key).getOutputPrefix();
        }
        if (key instanceof com.google.crypto.tink.internal.LegacyProtoKey) {
            return ((com.google.crypto.tink.internal.LegacyProtoKey) key).getOutputPrefix();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot get output prefix for key of class ");
        sb.append(key.getClass().getName());
        sb.append(" with parameters ");
        sb.append(key.getParameters());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    static class WrappedHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
        private final com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.hybrid.HybridDecryptWrapper.HybridDecryptWithId> allHybridDecrypts;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger decLogger;

        public WrappedHybridDecrypt(com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.hybrid.HybridDecryptWrapper.HybridDecryptWithId> prefixMap, com.google.crypto.tink.internal.MonitoringClient.Logger logger) {
            this.allHybridDecrypts = prefixMap;
            this.decLogger = logger;
        }

        @Override // com.google.crypto.tink.HybridDecrypt
        public byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            for (com.google.crypto.tink.hybrid.HybridDecryptWrapper.HybridDecryptWithId hybridDecryptWithId : this.allHybridDecrypts.getAllWithMatchingPrefix(bArr)) {
                try {
                    byte[] decrypt = hybridDecryptWithId.hybridDecrypt.decrypt(bArr, bArr2);
                    this.decLogger.log(hybridDecryptWithId.id, bArr.length);
                    return decrypt;
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
            this.decLogger.logFailure();
            throw new java.security.GeneralSecurityException("decryption failed");
        }
    }

    HybridDecryptWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.HybridDecrypt wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.HybridDecrypt> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        com.google.crypto.tink.internal.PrefixMap.Builder builder = new com.google.crypto.tink.internal.PrefixMap.Builder();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                builder.put(getOutputPrefix(at.getKey()), new com.google.crypto.tink.hybrid.HybridDecryptWrapper.HybridDecryptWithId(primitiveFactory.create(at), at.getId()));
            }
        }
        if (!monitoringAnnotations.isEmpty()) {
            logger = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(keysetHandleInterface, monitoringAnnotations, "hybrid_decrypt", "decrypt");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        return new com.google.crypto.tink.hybrid.HybridDecryptWrapper.WrappedHybridDecrypt(builder.build(), logger);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridDecrypt> getPrimitiveClass() {
        return com.google.crypto.tink.HybridDecrypt.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridDecrypt> getInputPrimitiveClass() {
        return com.google.crypto.tink.HybridDecrypt.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
