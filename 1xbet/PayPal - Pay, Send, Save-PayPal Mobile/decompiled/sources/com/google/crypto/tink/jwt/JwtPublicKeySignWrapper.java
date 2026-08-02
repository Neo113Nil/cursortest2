package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
class JwtPublicKeySignWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtPublicKeySign, com.google.crypto.tink.jwt.JwtPublicKeySign> {
    private static final com.google.crypto.tink.jwt.JwtPublicKeySignWrapper WRAPPER = new com.google.crypto.tink.jwt.JwtPublicKeySignWrapper();

    JwtPublicKeySignWrapper() {
    }

    @com.google.errorprone.annotations.Immutable
    static class WrappedJwtPublicKeySign implements com.google.crypto.tink.jwt.JwtPublicKeySign {
        private final com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        private final com.google.crypto.tink.jwt.JwtPublicKeySign primary;
        private final int primaryKeyId;

        public WrappedJwtPublicKeySign(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.jwt.JwtPublicKeySign> primitiveFactory) throws java.security.GeneralSecurityException {
            this.primary = primitiveFactory.create(keysetHandleInterface.getPrimary());
            this.primaryKeyId = keysetHandleInterface.getPrimary().getId();
            if (!monitoringAnnotations.isEmpty()) {
                this.logger = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(keysetHandleInterface, monitoringAnnotations, "jwtsign", "sign");
            } else {
                this.logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
            }
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeySign
        public java.lang.String signAndEncode(com.google.crypto.tink.jwt.RawJwt rawJwt) throws java.security.GeneralSecurityException {
            try {
                java.lang.String signAndEncode = this.primary.signAndEncode(rawJwt);
                this.logger.log(this.primaryKeyId, 1L);
                return signAndEncode;
            } catch (java.security.GeneralSecurityException e) {
                this.logger.logFailure();
                throw e;
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtPublicKeySign wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.jwt.JwtPublicKeySign> primitiveFactory) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.jwt.JwtPublicKeySignWrapper.WrappedJwtPublicKeySign(keysetHandleInterface, monitoringAnnotations, primitiveFactory);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySign> getPrimitiveClass() {
        return com.google.crypto.tink.jwt.JwtPublicKeySign.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeySign> getInputPrimitiveClass() {
        return com.google.crypto.tink.jwt.JwtPublicKeySign.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
    }
}
