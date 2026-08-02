package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public class MacWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.Mac, com.google.crypto.tink.Mac> {
    private static final com.google.crypto.tink.mac.MacWrapper WRAPPER = new com.google.crypto.tink.mac.MacWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.Mac> LEGACY_FULL_MAC_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.mac.internal.LegacyFullMac.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.Mac.class);

    static class MacWithId {
        public final int id;
        public final com.google.crypto.tink.Mac mac;

        public MacWithId(com.google.crypto.tink.Mac mac, int i) {
            this.mac = mac;
            this.id = i;
        }
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.Key key) throws java.security.GeneralSecurityException {
        if (key instanceof com.google.crypto.tink.mac.MacKey) {
            return ((com.google.crypto.tink.mac.MacKey) key).getOutputPrefix();
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

    static class WrappedMac implements com.google.crypto.tink.Mac {
        private final com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.mac.MacWrapper.MacWithId> allMacs;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger computeLogger;
        private final com.google.crypto.tink.mac.MacWrapper.MacWithId primary;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger verifyLogger;

        private WrappedMac(com.google.crypto.tink.mac.MacWrapper.MacWithId macWithId, com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.mac.MacWrapper.MacWithId> prefixMap, com.google.crypto.tink.internal.MonitoringClient.Logger logger, com.google.crypto.tink.internal.MonitoringClient.Logger logger2) {
            this.primary = macWithId;
            this.allMacs = prefixMap;
            this.computeLogger = logger;
            this.verifyLogger = logger2;
        }

        @Override // com.google.crypto.tink.Mac
        public byte[] computeMac(byte[] bArr) throws java.security.GeneralSecurityException {
            try {
                byte[] computeMac = this.primary.mac.computeMac(bArr);
                this.computeLogger.log(this.primary.id, bArr.length);
                return computeMac;
            } catch (java.security.GeneralSecurityException e) {
                this.computeLogger.logFailure();
                throw e;
            }
        }

        @Override // com.google.crypto.tink.Mac
        public void verifyMac(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            for (com.google.crypto.tink.mac.MacWrapper.MacWithId macWithId : this.allMacs.getAllWithMatchingPrefix(bArr)) {
                try {
                    macWithId.mac.verifyMac(bArr, bArr2);
                    this.verifyLogger.log(macWithId.id, bArr2.length);
                    return;
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
            this.verifyLogger.logFailure();
            throw new java.security.GeneralSecurityException("invalid MAC");
        }
    }

    MacWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.Mac wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.Mac> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        com.google.crypto.tink.internal.MonitoringClient.Logger logger2;
        com.google.crypto.tink.internal.PrefixMap.Builder builder = new com.google.crypto.tink.internal.PrefixMap.Builder();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                builder.put(getOutputPrefix(at.getKey()), new com.google.crypto.tink.mac.MacWrapper.MacWithId(primitiveFactory.create(at), at.getId()));
            }
        }
        if (!monitoringAnnotations.isEmpty()) {
            com.google.crypto.tink.internal.MonitoringClient monitoringClient = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient();
            logger = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "mac", "compute");
            logger2 = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "mac", "verify");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
            logger2 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        com.google.crypto.tink.internal.MonitoringClient.Logger logger3 = logger2;
        return new com.google.crypto.tink.mac.MacWrapper.WrappedMac(new com.google.crypto.tink.mac.MacWrapper.MacWithId(primitiveFactory.create(keysetHandleInterface.getPrimary()), keysetHandleInterface.getPrimary().getId()), builder.build(), logger, logger3);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Mac> getPrimitiveClass() {
        return com.google.crypto.tink.Mac.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.Mac> getInputPrimitiveClass() {
        return com.google.crypto.tink.Mac.class;
    }

    static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_FULL_MAC_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
