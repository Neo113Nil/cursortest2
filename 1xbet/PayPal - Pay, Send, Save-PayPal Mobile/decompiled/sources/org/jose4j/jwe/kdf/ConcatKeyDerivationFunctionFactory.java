package org.jose4j.jwe.kdf;

/* loaded from: classes18.dex */
class ConcatKeyDerivationFunctionFactory {
    private static java.lang.Class<org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256> getHighResolutionOutputSizeshNQ4ISI;
    private static final org.slf4j.Logger getHighSpeedVideoSizes;

    ConcatKeyDerivationFunctionFactory() {
    }

    static {
        org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwe.kdf.ConcatKeyDerivationFunctionFactory.class);
        getHighSpeedVideoSizes = logger;
        java.lang.String property = java.lang.System.getProperty("org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256");
        if (property != null) {
            try {
                java.lang.Class cls = java.lang.Class.forName(property);
                getHighResolutionOutputSizeshNQ4ISI = cls;
                org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256 concatenationKeyDerivationFunctionWithSha256 = (org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256) cls.newInstance();
                concatenationKeyDerivationFunctionWithSha256.kdf(new byte[]{124, -81, 43, 14, -71, -72, -84, 75, 115, 73, -52, -39, 74, -58, 77, -83}, 512, new byte[8]);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Using custom ConcatenationKeyDerivationFunctionWithSha256 implementation: ");
                sb.append(concatenationKeyDerivationFunctionWithSha256.getClass());
                logger.debug(sb.toString());
            } catch (java.lang.Throwable th) {
                getHighResolutionOutputSizeshNQ4ISI = null;
                getHighSpeedVideoSizes.debug("Using jose4j's concatenation key derivation function implementation because of problems with ".concat(java.lang.String.valueOf(property)), th);
            }
        }
    }

    static org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256 getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.Class<org.jose4j.jwe.kdf.ConcatenationKeyDerivationFunctionWithSha256> cls = getHighResolutionOutputSizeshNQ4ISI;
        if (cls != null) {
            try {
                return cls.newInstance();
            } catch (java.lang.Exception e) {
                org.slf4j.Logger logger = getHighSpeedVideoSizes;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to create new instance of ");
                sb.append(getHighResolutionOutputSizeshNQ4ISI);
                logger.debug(sb.toString(), (java.lang.Throwable) e);
            }
        }
        return new org.jose4j.jwe.kdf.ConcatKeyDerivationFunction("SHA-256", str);
    }
}
