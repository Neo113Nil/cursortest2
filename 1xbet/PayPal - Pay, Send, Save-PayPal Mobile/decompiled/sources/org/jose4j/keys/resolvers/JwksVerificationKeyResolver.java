package org.jose4j.keys.resolvers;

/* loaded from: classes18.dex */
public class JwksVerificationKeyResolver implements org.jose4j.keys.resolvers.VerificationKeyResolver {
    private boolean Camera2StreamConfigurationMap;
    private org.jose4j.jwk.VerificationJwkSelector getHighResolutionOutputSizeshNQ4ISI = new org.jose4j.jwk.VerificationJwkSelector();
    private java.util.List<org.jose4j.jwk.JsonWebKey> getHighSpeedVideoFpsRangesFor;

    public JwksVerificationKeyResolver(java.util.List<org.jose4j.jwk.JsonWebKey> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    @Override // org.jose4j.keys.resolvers.VerificationKeyResolver
    public java.security.Key resolveKey(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwx.JsonWebStructure> list) throws org.jose4j.lang.UnresolvableKeyException {
        org.jose4j.jwk.JsonWebKey select;
        try {
            if (this.Camera2StreamConfigurationMap) {
                select = this.getHighResolutionOutputSizeshNQ4ISI.selectWithVerifySignatureDisambiguate(jsonWebSignature, this.getHighSpeedVideoFpsRangesFor);
            } else {
                select = this.getHighResolutionOutputSizeshNQ4ISI.select(jsonWebSignature, this.getHighSpeedVideoFpsRangesFor);
            }
            if (select == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find a suitable verification key for JWS w/ header ");
                sb.append(jsonWebSignature.getHeaders().getFullHeaderAsJsonString());
                sb.append(" from JWKs ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                throw new org.jose4j.lang.UnresolvableKeyException(sb.toString());
            }
            return select.getKey();
        } catch (org.jose4j.lang.JoseException e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to find a suitable verification key for JWS w/ header ");
            sb2.append(jsonWebSignature.getHeaders().getFullHeaderAsJsonString());
            sb2.append(" due to an unexpected exception (");
            sb2.append(e);
            sb2.append(") selecting from keys: ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            throw new org.jose4j.lang.UnresolvableKeyException(sb2.toString(), e);
        }
    }

    public void setDisambiguateWithVerifySignature(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }
}
