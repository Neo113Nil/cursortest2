package org.jose4j.keys.resolvers;

/* loaded from: classes18.dex */
public class HttpsJwksVerificationKeyResolver implements org.jose4j.keys.resolvers.VerificationKeyResolver {
    private static final org.slf4j.Logger getHighSpeedVideoSizes = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.keys.resolvers.HttpsJwksVerificationKeyResolver.class);
    private org.jose4j.jwk.VerificationJwkSelector Camera2StreamConfigurationMap = new org.jose4j.jwk.VerificationJwkSelector();
    private org.jose4j.jwk.HttpsJwks getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;

    public HttpsJwksVerificationKeyResolver(org.jose4j.jwk.HttpsJwks httpsJwks) {
        this.getHighResolutionOutputSizeshNQ4ISI = httpsJwks;
    }

    @Override // org.jose4j.keys.resolvers.VerificationKeyResolver
    public java.security.Key resolveKey(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwx.JsonWebStructure> list) throws org.jose4j.lang.UnresolvableKeyException {
        try {
            java.util.List<org.jose4j.jwk.JsonWebKey> jsonWebKeys = this.getHighResolutionOutputSizeshNQ4ISI.getJsonWebKeys();
            org.jose4j.jwk.JsonWebKey select = select(jsonWebSignature, jsonWebKeys);
            if (select == null) {
                getHighSpeedVideoSizes.debug("Refreshing JWKs from {} as no suitable verification key for JWS w/ header {} was found in {}", this.getHighResolutionOutputSizeshNQ4ISI.getLocation(), jsonWebSignature.getHeaders().getFullHeaderAsJsonString(), jsonWebKeys);
                this.getHighResolutionOutputSizeshNQ4ISI.refresh();
                jsonWebKeys = this.getHighResolutionOutputSizeshNQ4ISI.getJsonWebKeys();
                select = select(jsonWebSignature, jsonWebKeys);
            }
            if (select == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find a suitable verification key for JWS w/ header ");
                sb.append(jsonWebSignature.getHeaders().getFullHeaderAsJsonString());
                sb.append(" from JWKs ");
                sb.append(jsonWebKeys);
                sb.append(" obtained from ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI.getLocation());
                throw new org.jose4j.lang.UnresolvableKeyException(sb.toString());
            }
            return select.getKey();
        } catch (java.io.IOException | org.jose4j.lang.JoseException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to find a suitable verification key for JWS w/ header ");
            sb2.append(jsonWebSignature.getHeaders().getFullHeaderAsJsonString());
            sb2.append(" due to an unexpected exception (");
            sb2.append(e);
            sb2.append(") while obtaining or using keys from JWKS endpoint at ");
            sb2.append(this.getHighResolutionOutputSizeshNQ4ISI.getLocation());
            throw new org.jose4j.lang.UnresolvableKeyException(sb2.toString(), e);
        }
    }

    protected org.jose4j.jwk.JsonWebKey select(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwk.JsonWebKey> list) throws org.jose4j.lang.JoseException {
        if (this.getHighSpeedVideoFpsRanges) {
            return this.Camera2StreamConfigurationMap.selectWithVerifySignatureDisambiguate(jsonWebSignature, list);
        }
        return this.Camera2StreamConfigurationMap.select(jsonWebSignature, list);
    }

    public void setDisambiguateWithVerifySignature(boolean z) {
        this.getHighSpeedVideoFpsRanges = z;
    }
}
