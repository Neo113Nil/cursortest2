package com.google.crypto.tink.config.internal;

/* loaded from: classes4.dex */
public final class TinkFipsUtil {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(com.google.crypto.tink.config.internal.TinkFipsUtil.class.getName());
    private static final java.util.concurrent.atomic.AtomicBoolean isRestrictedToFips = new java.util.concurrent.atomic.AtomicBoolean(false);

    public enum AlgorithmFipsCompatibility {
        ALGORITHM_NOT_FIPS { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.1
            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility
            public final boolean isCompatible() {
                return !com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips();
            }
        },
        ALGORITHM_REQUIRES_BORINGCRYPTO { // from class: com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.2
            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility
            public final boolean isCompatible() {
                return !com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips() || com.google.crypto.tink.config.internal.TinkFipsUtil.fipsModuleAvailable();
            }
        };

        public abstract boolean isCompatible();
    }

    public static void setFipsRestricted() throws java.security.GeneralSecurityException {
        if (!checkConscryptIsAvailableAndUsesFipsBoringSsl().booleanValue()) {
            throw new java.security.GeneralSecurityException("Conscrypt is not available or does not support checking for FIPS build.");
        }
        com.google.crypto.tink.internal.Random.validateUsesConscrypt();
        isRestrictedToFips.set(true);
    }

    public static void unsetFipsRestricted() {
        isRestrictedToFips.set(false);
    }

    public static boolean useOnlyFips() {
        return com.google.crypto.tink.config.internal.TinkFipsStatus.useOnlyFips() || isRestrictedToFips.get();
    }

    public static boolean fipsModuleAvailable() {
        return checkConscryptIsAvailableAndUsesFipsBoringSsl().booleanValue();
    }

    static java.lang.Boolean checkConscryptIsAvailableAndUsesFipsBoringSsl() {
        try {
            return (java.lang.Boolean) java.lang.Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            logger.info("Conscrypt is not available or does not support checking for FIPS build.");
            return java.lang.Boolean.FALSE;
        }
    }

    private TinkFipsUtil() {
    }
}
