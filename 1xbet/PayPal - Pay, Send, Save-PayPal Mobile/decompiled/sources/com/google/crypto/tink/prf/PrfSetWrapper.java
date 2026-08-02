package com.google.crypto.tink.prf;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public class PrfSetWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.prf.Prf, com.google.crypto.tink.prf.PrfSet> {
    private static final com.google.crypto.tink.prf.PrfSetWrapper WRAPPER = new com.google.crypto.tink.prf.PrfSetWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.prf.Prf> LEGACY_FULL_PRF_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.prf.PrfSetWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.prf.internal.LegacyFullPrf.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.prf.Prf.class);

    static class WrappedPrfSet extends com.google.crypto.tink.prf.PrfSet {
        private final java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> keyIdToPrfMap;
        private final int primaryKeyId;

        @com.google.errorprone.annotations.Immutable
        static class PrfWithMonitoring implements com.google.crypto.tink.prf.Prf {
            private final int keyId;
            private final com.google.crypto.tink.internal.MonitoringClient.Logger logger;
            private final com.google.crypto.tink.prf.Prf prf;

            @Override // com.google.crypto.tink.prf.Prf
            public byte[] compute(byte[] bArr, int i) throws java.security.GeneralSecurityException {
                try {
                    byte[] compute = this.prf.compute(bArr, i);
                    this.logger.log(this.keyId, bArr.length);
                    return compute;
                } catch (java.security.GeneralSecurityException e) {
                    this.logger.logFailure();
                    throw e;
                }
            }

            public PrfWithMonitoring(com.google.crypto.tink.prf.Prf prf, int i, com.google.crypto.tink.internal.MonitoringClient.Logger logger) {
                this.prf = prf;
                this.keyId = i;
                this.logger = logger;
            }
        }

        private WrappedPrfSet(java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> map, int i) {
            this.keyIdToPrfMap = map;
            this.primaryKeyId = i;
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public int getPrimaryId() {
            return this.primaryKeyId;
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public java.util.Map<java.lang.Integer, com.google.crypto.tink.prf.Prf> getPrfs() throws java.security.GeneralSecurityException {
            return this.keyIdToPrfMap;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.prf.PrfSet wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.prf.Prf> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        if (!monitoringAnnotations.isEmpty()) {
            logger = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(keysetHandleInterface, monitoringAnnotations, "prf", "compute");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                if ((at.getKey() instanceof com.google.crypto.tink.internal.LegacyProtoKey) && ((com.google.crypto.tink.internal.LegacyProtoKey) at.getKey()).getOutputPrefix().size() != 0) {
                    throw new java.security.GeneralSecurityException("Cannot build PrfSet with keys with non-empty output prefix");
                }
                com.google.crypto.tink.prf.Prf create = primitiveFactory.create(at);
                int id = at.getId();
                hashMap.put(java.lang.Integer.valueOf(id), new com.google.crypto.tink.prf.PrfSetWrapper.WrappedPrfSet.PrfWithMonitoring(create, at.getId(), logger));
            }
        }
        return new com.google.crypto.tink.prf.PrfSetWrapper.WrappedPrfSet(hashMap, keysetHandleInterface.getPrimary().getId());
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.prf.PrfSet> getPrimitiveClass() {
        return com.google.crypto.tink.prf.PrfSet.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.prf.Prf> getInputPrimitiveClass() {
        return com.google.crypto.tink.prf.Prf.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_FULL_PRF_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
