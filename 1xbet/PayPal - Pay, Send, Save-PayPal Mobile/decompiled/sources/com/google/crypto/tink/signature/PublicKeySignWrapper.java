package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public class PublicKeySignWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.PublicKeySign, com.google.crypto.tink.PublicKeySign> {
    private static final com.google.crypto.tink.signature.PublicKeySignWrapper WRAPPER = new com.google.crypto.tink.signature.PublicKeySignWrapper();
    private static final com.google.crypto.tink.internal.PrimitiveConstructor<com.google.crypto.tink.internal.LegacyProtoKey, com.google.crypto.tink.PublicKeySign> LEGACY_PRIMITIVE_CONSTRUCTOR = com.google.crypto.tink.internal.PrimitiveConstructor.create(new com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction() { // from class: com.google.crypto.tink.signature.PublicKeySignWrapper$$ExternalSyntheticLambda0
        @Override // com.google.crypto.tink.internal.PrimitiveConstructor.PrimitiveConstructionFunction
        public final java.lang.Object constructPrimitive(com.google.crypto.tink.Key key) {
            return com.google.crypto.tink.signature.internal.LegacyFullSign.create((com.google.crypto.tink.internal.LegacyProtoKey) key);
        }
    }, com.google.crypto.tink.internal.LegacyProtoKey.class, com.google.crypto.tink.PublicKeySign.class);

    static class PublicKeySignWithId {
        public final int id;
        public final com.google.crypto.tink.PublicKeySign publicKeySign;

        public PublicKeySignWithId(com.google.crypto.tink.PublicKeySign publicKeySign, int i) {
            this.publicKeySign = publicKeySign;
            this.id = i;
        }
    }

    static class WrappedPublicKeySign implements com.google.crypto.tink.PublicKeySign {
        private final com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        private final com.google.crypto.tink.signature.PublicKeySignWrapper.PublicKeySignWithId primary;

        public WrappedPublicKeySign(com.google.crypto.tink.signature.PublicKeySignWrapper.PublicKeySignWithId publicKeySignWithId, com.google.crypto.tink.internal.MonitoringClient.Logger logger) {
            this.primary = publicKeySignWithId;
            this.logger = logger;
        }

        @Override // com.google.crypto.tink.PublicKeySign
        public byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
            try {
                byte[] sign = this.primary.publicKeySign.sign(bArr);
                this.logger.log(this.primary.id, bArr.length);
                return sign;
            } catch (java.security.GeneralSecurityException e) {
                this.logger.logFailure();
                throw e;
            }
        }
    }

    PublicKeySignWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.PublicKeySign wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.PublicKeySign> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        if (!monitoringAnnotations.isEmpty()) {
            logger = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(keysetHandleInterface, monitoringAnnotations, "public_key_sign", "sign");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        return new com.google.crypto.tink.signature.PublicKeySignWrapper.WrappedPublicKeySign(new com.google.crypto.tink.signature.PublicKeySignWrapper.PublicKeySignWithId(primitiveFactory.create(keysetHandleInterface.getPrimary()), keysetHandleInterface.getPrimary().getId()), logger);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeySign> getPrimitiveClass() {
        return com.google.crypto.tink.PublicKeySign.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.PublicKeySign> getInputPrimitiveClass() {
        return com.google.crypto.tink.PublicKeySign.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveConstructor(LEGACY_PRIMITIVE_CONSTRUCTOR);
    }

    public static void registerToInternalPrimitiveRegistry(com.google.crypto.tink.internal.PrimitiveRegistry.Builder builder) throws java.security.GeneralSecurityException {
        builder.registerPrimitiveWrapper(WRAPPER);
    }
}
