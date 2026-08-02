package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public class HybridEncryptWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.HybridEncrypt, com.google.crypto.tink.HybridEncrypt> {
    private static final com.google.crypto.tink.hybrid.HybridEncryptWrapper WRAPPER = new com.google.crypto.tink.hybrid.HybridEncryptWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.HybridEncrypt> LEGACY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.hybrid.HybridEncryptWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.hybrid.internal.LegacyFullHybridEncrypt.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.HybridEncrypt.class);

    static class HybridEncryptWithId {
        public final com.google.crypto.tink.HybridEncrypt hybridEncrypt;
        public final int id;

        public HybridEncryptWithId(com.google.crypto.tink.HybridEncrypt hybridEncrypt, int i) {
            this.hybridEncrypt = hybridEncrypt;
            this.id = i;
        }
    }

    static class WrappedHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
        private final com.google.crypto.tink.internal.MonitoringClient.Logger encLogger;
        private final com.google.crypto.tink.hybrid.HybridEncryptWrapper.HybridEncryptWithId primary;

        public WrappedHybridEncrypt(com.google.crypto.tink.hybrid.HybridEncryptWrapper.HybridEncryptWithId hybridEncryptWithId, com.google.crypto.tink.internal.MonitoringClient.Logger logger) {
            this.primary = hybridEncryptWithId;
            this.encLogger = logger;
        }

        @Override // com.google.crypto.tink.HybridEncrypt
        public byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            if (this.primary.hybridEncrypt == null) {
                this.encLogger.logFailure();
                throw new java.security.GeneralSecurityException("keyset without primary key");
            }
            try {
                byte[] encrypt = this.primary.hybridEncrypt.encrypt(bArr, bArr2);
                this.encLogger.log(this.primary.id, bArr.length);
                return encrypt;
            } catch (java.security.GeneralSecurityException e) {
                this.encLogger.logFailure();
                throw e;
            }
        }
    }

    HybridEncryptWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.HybridEncrypt wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.HybridEncrypt> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        if (!monitoringAnnotations.isEmpty()) {
            logger = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(keysetHandleInterface, monitoringAnnotations, "hybrid_encrypt", "encrypt");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        com.google.crypto.tink.internal.KeysetHandleInterface.Entry primary = keysetHandleInterface.getPrimary();
        return new com.google.crypto.tink.hybrid.HybridEncryptWrapper.WrappedHybridEncrypt(new com.google.crypto.tink.hybrid.HybridEncryptWrapper.HybridEncryptWithId(primitiveFactory.create(primary), primary.getId()), logger);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridEncrypt> getPrimitiveClass() {
        return com.google.crypto.tink.HybridEncrypt.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.HybridEncrypt> getInputPrimitiveClass() {
        return com.google.crypto.tink.HybridEncrypt.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
