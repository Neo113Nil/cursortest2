package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public class AeadWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.Aead, com.google.crypto.tink.Aead> {
    private static final com.google.crypto.tink.aead.AeadWrapper WRAPPER = new com.google.crypto.tink.aead.AeadWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.Aead> LEGACY_FULL_AEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.aead.AeadWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.aead.internal.LegacyFullAead.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.Aead.class);

    static class AeadWithId {
        public final com.google.crypto.tink.Aead aead;
        public final int id;

        public AeadWithId(com.google.crypto.tink.Aead aead, int i) {
            this.aead = aead;
            this.id = i;
        }
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.Key key) throws java.security.GeneralSecurityException {
        if (key instanceof com.google.crypto.tink.aead.AeadKey) {
            return ((com.google.crypto.tink.aead.AeadKey) key).getOutputPrefix();
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

    static class WrappedAead implements com.google.crypto.tink.Aead {
        private final com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.aead.AeadWrapper.AeadWithId> allAeads;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger decLogger;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger encLogger;
        private final com.google.crypto.tink.aead.AeadWrapper.AeadWithId primary;

        private WrappedAead(com.google.crypto.tink.aead.AeadWrapper.AeadWithId aeadWithId, com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.aead.AeadWrapper.AeadWithId> prefixMap, com.google.crypto.tink.internal.MonitoringClient.Logger logger, com.google.crypto.tink.internal.MonitoringClient.Logger logger2) {
            this.primary = aeadWithId;
            this.allAeads = prefixMap;
            this.encLogger = logger;
            this.decLogger = logger2;
        }

        @Override // com.google.crypto.tink.Aead
        public byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            try {
                byte[] encrypt = this.primary.aead.encrypt(bArr, bArr2);
                this.encLogger.log(this.primary.id, bArr.length);
                return encrypt;
            } catch (java.security.GeneralSecurityException e) {
                this.encLogger.logFailure();
                throw e;
            }
        }

        @Override // com.google.crypto.tink.Aead
        public byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            for (com.google.crypto.tink.aead.AeadWrapper.AeadWithId aeadWithId : this.allAeads.getAllWithMatchingPrefix(bArr)) {
                try {
                    byte[] decrypt = aeadWithId.aead.decrypt(bArr, bArr2);
                    this.decLogger.log(aeadWithId.id, bArr.length);
                    return decrypt;
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
            this.decLogger.logFailure();
            throw new java.security.GeneralSecurityException("decryption failed");
        }
    }

    AeadWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.Aead wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.Aead> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        com.google.crypto.tink.internal.MonitoringClient.Logger logger2;
        com.google.crypto.tink.internal.PrefixMap.Builder builder = new com.google.crypto.tink.internal.PrefixMap.Builder();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                builder.put(getOutputPrefix(at.getKey()), new com.google.crypto.tink.aead.AeadWrapper.AeadWithId(primitiveFactory.create(at), at.getId()));
            }
        }
        if (!monitoringAnnotations.isEmpty()) {
            com.google.crypto.tink.internal.MonitoringClient monitoringClient = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient();
            logger = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "aead", "encrypt");
            logger2 = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "aead", "decrypt");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
            logger2 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        com.google.crypto.tink.internal.MonitoringClient.Logger logger3 = logger2;
        return new com.google.crypto.tink.aead.AeadWrapper.WrappedAead(new com.google.crypto.tink.aead.AeadWrapper.AeadWithId(primitiveFactory.create(keysetHandleInterface.getPrimary()), keysetHandleInterface.getPrimary().getId()), builder.build(), logger, logger3);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Aead> getPrimitiveClass() {
        return com.google.crypto.tink.Aead.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Aead> getInputPrimitiveClass() {
        return com.google.crypto.tink.Aead.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_FULL_AEAD_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
