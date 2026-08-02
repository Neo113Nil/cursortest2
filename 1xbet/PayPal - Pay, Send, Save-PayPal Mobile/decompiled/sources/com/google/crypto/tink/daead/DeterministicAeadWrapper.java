package com.google.crypto.tink.daead;

/* loaded from: classes4.dex */
public class DeterministicAeadWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.DeterministicAead, com.google.crypto.tink.DeterministicAead> {
    private static final com.google.crypto.tink.daead.DeterministicAeadWrapper WRAPPER = new com.google.crypto.tink.daead.DeterministicAeadWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.DeterministicAead> LEGACY_FULL_DAEAD_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.daead.DeterministicAeadWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.daead.internal.LegacyFullDeterministicAead.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.DeterministicAead.class);

    static class DeterministicAeadWithId {
        public final com.google.crypto.tink.DeterministicAead daead;
        public final int id;

        public DeterministicAeadWithId(com.google.crypto.tink.DeterministicAead deterministicAead, int i) {
            this.daead = deterministicAead;
            this.id = i;
        }
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.Key key) throws java.security.GeneralSecurityException {
        if (key instanceof com.google.crypto.tink.daead.DeterministicAeadKey) {
            return ((com.google.crypto.tink.daead.DeterministicAeadKey) key).getOutputPrefix();
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

    static class WrappedDeterministicAead implements com.google.crypto.tink.DeterministicAead {
        private final com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.daead.DeterministicAeadWrapper.DeterministicAeadWithId> allDaeads;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger decLogger;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger encLogger;
        private final com.google.crypto.tink.daead.DeterministicAeadWrapper.DeterministicAeadWithId primary;

        public WrappedDeterministicAead(com.google.crypto.tink.daead.DeterministicAeadWrapper.DeterministicAeadWithId deterministicAeadWithId, com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.daead.DeterministicAeadWrapper.DeterministicAeadWithId> prefixMap, com.google.crypto.tink.internal.MonitoringClient.Logger logger, com.google.crypto.tink.internal.MonitoringClient.Logger logger2) {
            this.primary = deterministicAeadWithId;
            this.allDaeads = prefixMap;
            this.encLogger = logger;
            this.decLogger = logger2;
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] encryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            try {
                byte[] encryptDeterministically = this.primary.daead.encryptDeterministically(bArr, bArr2);
                this.encLogger.log(this.primary.id, bArr.length);
                return encryptDeterministically;
            } catch (java.security.GeneralSecurityException e) {
                this.encLogger.logFailure();
                throw e;
            }
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public byte[] decryptDeterministically(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            for (com.google.crypto.tink.daead.DeterministicAeadWrapper.DeterministicAeadWithId deterministicAeadWithId : this.allDaeads.getAllWithMatchingPrefix(bArr)) {
                try {
                    byte[] decryptDeterministically = deterministicAeadWithId.daead.decryptDeterministically(bArr, bArr2);
                    this.decLogger.log(deterministicAeadWithId.id, bArr.length);
                    return decryptDeterministically;
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
            this.decLogger.logFailure();
            throw new java.security.GeneralSecurityException("decryption failed");
        }
    }

    DeterministicAeadWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.DeterministicAead wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.DeterministicAead> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        com.google.crypto.tink.internal.MonitoringClient.Logger logger2;
        com.google.crypto.tink.internal.PrefixMap.Builder builder = new com.google.crypto.tink.internal.PrefixMap.Builder();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                builder.put(getOutputPrefix(at.getKey()), new com.google.crypto.tink.daead.DeterministicAeadWrapper.DeterministicAeadWithId(primitiveFactory.create(at), at.getId()));
            }
        }
        if (!monitoringAnnotations.isEmpty()) {
            com.google.crypto.tink.internal.MonitoringClient monitoringClient = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient();
            logger = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "daead", "encrypt");
            logger2 = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "daead", "decrypt");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
            logger2 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        return new com.google.crypto.tink.daead.DeterministicAeadWrapper.WrappedDeterministicAead(new com.google.crypto.tink.daead.DeterministicAeadWrapper.DeterministicAeadWithId(primitiveFactory.create(keysetHandleInterface.getPrimary()), keysetHandleInterface.getPrimary().getId()), builder.build(), logger, logger2);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.DeterministicAead> getPrimitiveClass() {
        return com.google.crypto.tink.DeterministicAead.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.DeterministicAead> getInputPrimitiveClass() {
        return com.google.crypto.tink.DeterministicAead.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_FULL_DAEAD_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
