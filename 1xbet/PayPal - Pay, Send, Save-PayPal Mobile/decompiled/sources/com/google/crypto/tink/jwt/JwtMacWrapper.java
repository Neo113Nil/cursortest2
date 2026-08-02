package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
class JwtMacWrapper implements com.google.crypto.tink.internal.PrimitiveWrapper<com.google.crypto.tink.jwt.JwtMac, com.google.crypto.tink.jwt.JwtMac> {
    private static final com.google.crypto.tink.jwt.JwtMacWrapper WRAPPER = new com.google.crypto.tink.jwt.JwtMacWrapper();

    static class JwtMacWithId {
        final int id;
        final com.google.crypto.tink.jwt.JwtMac jwtMac;

        JwtMacWithId(com.google.crypto.tink.jwt.JwtMac jwtMac, int i) {
            this.jwtMac = jwtMac;
            this.id = i;
        }
    }

    private static void validate(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface) throws java.security.GeneralSecurityException {
        if (keysetHandleInterface.getPrimary() == null) {
            throw new java.security.GeneralSecurityException("Primitive set has no primary.");
        }
    }

    @com.google.errorprone.annotations.Immutable
    static class WrappedJwtMac implements com.google.crypto.tink.jwt.JwtMac {
        private final java.util.List<com.google.crypto.tink.jwt.JwtMacWrapper.JwtMacWithId> allMacs;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger computeLogger;
        private final com.google.crypto.tink.jwt.JwtMacWrapper.JwtMacWithId primary;
        private final com.google.crypto.tink.internal.MonitoringClient.Logger verifyLogger;

        private WrappedJwtMac(com.google.crypto.tink.jwt.JwtMacWrapper.JwtMacWithId jwtMacWithId, java.util.List<com.google.crypto.tink.jwt.JwtMacWrapper.JwtMacWithId> list, com.google.crypto.tink.internal.MonitoringClient.Logger logger, com.google.crypto.tink.internal.MonitoringClient.Logger logger2) {
            this.primary = jwtMacWithId;
            this.allMacs = list;
            this.computeLogger = logger;
            this.verifyLogger = logger2;
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public java.lang.String computeMacAndEncode(com.google.crypto.tink.jwt.RawJwt rawJwt) throws java.security.GeneralSecurityException {
            try {
                java.lang.String computeMacAndEncode = this.primary.jwtMac.computeMacAndEncode(rawJwt);
                this.computeLogger.log(this.primary.id, 1L);
                return computeMacAndEncode;
            } catch (java.security.GeneralSecurityException e) {
                this.computeLogger.logFailure();
                throw e;
            }
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecode(java.lang.String str, com.google.crypto.tink.jwt.JwtValidator jwtValidator) throws java.security.GeneralSecurityException {
            java.security.GeneralSecurityException generalSecurityException = null;
            for (com.google.crypto.tink.jwt.JwtMacWrapper.JwtMacWithId jwtMacWithId : this.allMacs) {
                try {
                    com.google.crypto.tink.jwt.VerifiedJwt verifyMacAndDecode = jwtMacWithId.jwtMac.verifyMacAndDecode(str, jwtValidator);
                    this.verifyLogger.log(jwtMacWithId.id, 1L);
                    return verifyMacAndDecode;
                } catch (java.security.GeneralSecurityException e) {
                    if (e instanceof com.google.crypto.tink.jwt.JwtInvalidException) {
                        generalSecurityException = e;
                    }
                }
            }
            this.verifyLogger.logFailure();
            if (generalSecurityException != null) {
                throw generalSecurityException;
            }
            throw new java.security.GeneralSecurityException("invalid MAC");
        }
    }

    JwtMacWrapper() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public com.google.crypto.tink.jwt.JwtMac wrap(com.google.crypto.tink.internal.KeysetHandleInterface keysetHandleInterface, com.google.crypto.tink.internal.MonitoringAnnotations monitoringAnnotations, com.google.crypto.tink.internal.PrimitiveWrapper.PrimitiveFactory<com.google.crypto.tink.jwt.JwtMac> primitiveFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MonitoringClient.Logger logger;
        com.google.crypto.tink.internal.MonitoringClient.Logger logger2;
        validate(keysetHandleInterface);
        java.util.ArrayList arrayList = new java.util.ArrayList(keysetHandleInterface.size());
        for (int i = 0; i < keysetHandleInterface.size(); i++) {
            com.google.crypto.tink.internal.KeysetHandleInterface.Entry at = keysetHandleInterface.getAt(i);
            if (at.getStatus().equals(com.google.crypto.tink.KeyStatus.ENABLED)) {
                arrayList.add(new com.google.crypto.tink.jwt.JwtMacWrapper.JwtMacWithId(primitiveFactory.create(at), at.getId()));
            }
        }
        if (!monitoringAnnotations.isEmpty()) {
            com.google.crypto.tink.internal.MonitoringClient monitoringClient = com.google.crypto.tink.internal.MutableMonitoringRegistry.globalInstance().getMonitoringClient();
            com.google.crypto.tink.internal.MonitoringClient.Logger createLogger = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "jwtmac", "compute");
            logger2 = monitoringClient.createLogger(keysetHandleInterface, monitoringAnnotations, "jwtmac", "verify");
            logger = createLogger;
        } else {
            logger = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
            logger2 = com.google.crypto.tink.internal.MonitoringUtil.DO_NOTHING_LOGGER;
        }
        return new com.google.crypto.tink.jwt.JwtMacWrapper.WrappedJwtMac(new com.google.crypto.tink.jwt.JwtMacWrapper.JwtMacWithId(primitiveFactory.create(keysetHandleInterface.getPrimary()), keysetHandleInterface.getPrimary().getId()), arrayList, logger, logger2);
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtMac> getPrimitiveClass() {
        return com.google.crypto.tink.jwt.JwtMac.class;
    }

    @Override // com.google.crypto.tink.internal.PrimitiveWrapper
    public java.lang.Class<com.google.crypto.tink.jwt.JwtMac> getInputPrimitiveClass() {
        return com.google.crypto.tink.jwt.JwtMac.class;
    }

    public static void register() throws java.security.GeneralSecurityException {
        com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().registerPrimitiveWrapper(WRAPPER);
    }
}
