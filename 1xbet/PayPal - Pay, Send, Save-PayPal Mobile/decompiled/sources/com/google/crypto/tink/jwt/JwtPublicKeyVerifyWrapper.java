package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
class JwtPublicKeyVerifyWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtPublicKeyVerify, com.google.crypto.tink.jwt.JwtPublicKeyVerify> {
    private static final com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper WRAPPER = new com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper();

    JwtPublicKeyVerifyWrapper() {
    }

    static class JwtPublicKeyVerifyWithId {
        final int id;
        final com.google.crypto.tink.jwt.JwtPublicKeyVerify verify;

        JwtPublicKeyVerifyWithId(com.google.crypto.tink.jwt.JwtPublicKeyVerify jwtPublicKeyVerify, int i) {
            this.verify = jwtPublicKeyVerify;
            this.id = i;
        }
    }

    @com.google.errorprone.annotations.Immutable
    static class WrappedJwtPublicKeyVerify implements com.google.crypto.tink.jwt.JwtPublicKeyVerify {
        private final java.util.List<com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.JwtPublicKeyVerifyWithId> allVerifiers;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger logger;

        public WrappedJwtPublicKeyVerify(com.google.crypto.tink.internal.MonitoringClient.Logger logger, java.util.List<com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.JwtPublicKeyVerifyWithId> list) {
            this.logger = logger;
            this.allVerifiers = list;
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerify
        public com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException {
            java.security.GeneralSecurityException generalSecurityException = null;
            for (com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.JwtPublicKeyVerifyWithId jwtPublicKeyVerifyWithId : this.allVerifiers) {
                try {
                    com.google.crypto.tink.jwt.VerifiedJwt verifyAndDecode = jwtPublicKeyVerifyWithId.verify.verifyAndDecode(str, jwtValidator);
                    this.logger.log(jwtPublicKeyVerifyWithId.id, 1L);
                    return verifyAndDecode;
                } catch (java.security.GeneralSecurityException e) {
                    if (e instanceof com.google.crypto.tink.jwt.JwtInvalidException) {
                        generalSecurityException = e;
                    }
                }
            }
            this.logger.logFailure();
            if (generalSecurityException != null) {
                throw generalSecurityException;
            }
            throw new java.security.GeneralSecurityException("invalid JWT");
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtPublicKeyVerify wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.jwt.JwtPublicKeyVerify> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        java.util.ArrayList arrayList = new java.util.ArrayList(keysetHandleInterface.size());
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                arrayList.add(new com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.JwtPublicKeyVerifyWithId(primitiveFactory.create(at), at.getId()));
            }
        }
        if (!monitoringAnnotations.isEmpty()) {
            logger = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(keysetHandleInterface, monitoringAnnotations, "jwtverify", "verify");
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        return new com.google.crypto.tink.jwt.JwtPublicKeyVerifyWrapper.WrappedJwtPublicKeyVerify(logger, arrayList);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerify> getPrimitiveClass() {
        return com.google.crypto.tink.jwt.JwtPublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtPublicKeyVerify> getInputPrimitiveClass() {
        return com.google.crypto.tink.jwt.JwtPublicKeyVerify.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
    }
}
