package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public class PublicKeyVerifyWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.PublicKeyVerify, com.google.crypto.tink.PublicKeyVerify> {
    private static final com.google.crypto.tink.signature.PublicKeyVerifyWrapper WRAPPER = new com.google.crypto.tink.signature.PublicKeyVerifyWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.PublicKeyVerify> LEGACY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.signature.PublicKeyVerifyWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.signature.internal.LegacyFullVerify.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.PublicKeyVerify.class);

    static class PublicKeyVerifyWithId {
        public final int id;
        public final com.google.crypto.tink.PublicKeyVerify publicKeyVerify;

        public PublicKeyVerifyWithId(com.google.crypto.tink.PublicKeyVerify publicKeyVerify, int i) {
            this.publicKeyVerify = publicKeyVerify;
            this.id = i;
        }
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.Key key) throws java.security.GeneralSecurityException {
        if (key instanceof com.google.crypto.tink.signature.SignaturePublicKey) {
            return ((com.google.crypto.tink.signature.SignaturePublicKey) key).getOutputPrefix();
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

    static class WrappedPublicKeyVerify implements com.google.crypto.tink.PublicKeyVerify {
        private final com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.signature.PublicKeyVerifyWrapper.PublicKeyVerifyWithId> allPublicKeyVerifys;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger monitoringLogger;

        public WrappedPublicKeyVerify(com.google.crypto.tink.internal.PrefixMap<com.google.crypto.tink.signature.PublicKeyVerifyWrapper.PublicKeyVerifyWithId> prefixMap, com.google.crypto.tink.internal.MonitoringClient.Logger logger) {
            this.allPublicKeyVerifys = prefixMap;
            this.monitoringLogger = logger;
        }

        @Override // com.google.crypto.tink.PublicKeyVerify
        public void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            for (com.google.crypto.tink.signature.PublicKeyVerifyWrapper.PublicKeyVerifyWithId publicKeyVerifyWithId : this.allPublicKeyVerifys.getAllWithMatchingPrefix(bArr)) {
                try {
                    publicKeyVerifyWithId.publicKeyVerify.verify(bArr, bArr2);
                    this.monitoringLogger.log(publicKeyVerifyWithId.id, bArr2.length);
                    return;
                } catch (java.security.GeneralSecurityException unused) {
                }
            }
            this.monitoringLogger.logFailure();
            throw new java.security.GeneralSecurityException("invalid signature");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.PublicKeyVerify wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.PublicKeyVerify> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        com.google.crypto.tink.internal.PrefixMap.Builder builder = new com.google.crypto.tink.internal.PrefixMap.Builder();
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                builder.put(getOutputPrefix(at.getKey()), new com.google.crypto.tink.signature.PublicKeyVerifyWrapper.PublicKeyVerifyWithId(primitiveFactory.create(at), at.getId()));
            }
        }
        if (!monitoringAnnotations.isEmpty()) {
            logger = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(keysetHandleInterface, monitoringAnnotations, "public_key_verify", "verify");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        return new com.google.crypto.tink.signature.PublicKeyVerifyWrapper.WrappedPublicKeyVerify(builder.build(), logger);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeyVerify> getPrimitiveClass() {
        return com.google.crypto.tink.PublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeyVerify> getInputPrimitiveClass() {
        return com.google.crypto.tink.PublicKeyVerify.class;
    }

    static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
