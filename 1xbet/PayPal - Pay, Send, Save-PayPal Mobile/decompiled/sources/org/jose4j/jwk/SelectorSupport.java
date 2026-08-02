package org.jose4j.jwk;

/* loaded from: classes18.dex */
class SelectorSupport {
    private static final java.lang.String[] getHighSpeedVideoFpsRanges = {org.jose4j.jwk.KeyOperations.VERIFY};
    private static final java.lang.String[] getHighSpeedVideoFpsRangesFor = {org.jose4j.jwk.KeyOperations.DECRYPT, org.jose4j.jwk.KeyOperations.DERIVE_KEY, org.jose4j.jwk.KeyOperations.UNWRAP_KEY};

    SelectorSupport() {
    }

    public static org.jose4j.jwk.SimpleJwkFilter getHighResolutionOutputSizeshNQ4ISI(org.jose4j.jws.JsonWebSignature jsonWebSignature) throws org.jose4j.lang.JoseException {
        org.jose4j.jwk.SimpleJwkFilter Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(jsonWebSignature);
        Camera2StreamConfigurationMap.setUse(org.jose4j.jwk.Use.SIGNATURE, org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
        Camera2StreamConfigurationMap.setKeyOperations(getHighSpeedVideoFpsRanges, org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
        return Camera2StreamConfigurationMap;
    }

    public static org.jose4j.jwk.SimpleJwkFilter Camera2StreamConfigurationMap(org.jose4j.jwe.JsonWebEncryption jsonWebEncryption) throws org.jose4j.lang.JoseException {
        org.jose4j.jwk.SimpleJwkFilter Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((org.jose4j.jwx.JsonWebStructure) jsonWebEncryption);
        Camera2StreamConfigurationMap.setUse("enc", org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
        Camera2StreamConfigurationMap.setKeyOperations(getHighSpeedVideoFpsRangesFor, org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
        return Camera2StreamConfigurationMap;
    }

    private static org.jose4j.jwk.SimpleJwkFilter Camera2StreamConfigurationMap(org.jose4j.jwx.JsonWebStructure jsonWebStructure) throws org.jose4j.lang.JoseException {
        org.jose4j.jwk.SimpleJwkFilter simpleJwkFilter = new org.jose4j.jwk.SimpleJwkFilter();
        java.lang.String keyIdHeaderValue = jsonWebStructure.getKeyIdHeaderValue();
        if (keyIdHeaderValue != null) {
            simpleJwkFilter.setKid(keyIdHeaderValue, org.jose4j.jwk.SimpleJwkFilter.VALUE_REQUIRED);
        }
        java.lang.String x509CertSha1ThumbprintHeaderValue = jsonWebStructure.getX509CertSha1ThumbprintHeaderValue();
        java.lang.String x509CertSha256ThumbprintHeaderValue = jsonWebStructure.getX509CertSha256ThumbprintHeaderValue();
        simpleJwkFilter.setAllowFallbackDeriveFromX5cForX5Thumbs(true);
        if (x509CertSha1ThumbprintHeaderValue != null) {
            simpleJwkFilter.setX5t(x509CertSha1ThumbprintHeaderValue, org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
        }
        if (x509CertSha256ThumbprintHeaderValue != null) {
            simpleJwkFilter.setX5tS256(x509CertSha256ThumbprintHeaderValue, org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
        }
        simpleJwkFilter.setKty(jsonWebStructure.getAlgorithmNoConstraintCheck().getKeyType());
        return simpleJwkFilter;
    }
}
