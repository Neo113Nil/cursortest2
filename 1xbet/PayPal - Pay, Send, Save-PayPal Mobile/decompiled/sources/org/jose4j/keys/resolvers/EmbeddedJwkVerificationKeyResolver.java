package org.jose4j.keys.resolvers;

/* loaded from: classes18.dex */
public class EmbeddedJwkVerificationKeyResolver implements org.jose4j.keys.resolvers.VerificationKeyResolver {
    private org.jose4j.jwk.PublicJsonWebKey getHighSpeedVideoFpsRangesFor;

    @Override // org.jose4j.keys.resolvers.VerificationKeyResolver
    public java.security.Key resolveKey(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwx.JsonWebStructure> list) throws org.jose4j.lang.UnresolvableKeyException {
        try {
            org.jose4j.jwk.PublicJsonWebKey jwkHeader = jsonWebSignature.getJwkHeader();
            this.getHighSpeedVideoFpsRangesFor = jwkHeader;
            if (jwkHeader == null) {
                throw new org.jose4j.lang.UnresolvableKeyException("No jwk in JWS header");
            }
            return jwkHeader.getKey();
        } catch (org.jose4j.lang.JoseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Problem processing jwk from JWS header (");
            sb.append(e.getMessage());
            sb.append(")");
            throw new org.jose4j.lang.UnresolvableKeyException(sb.toString(), e);
        }
    }

    public org.jose4j.jwk.PublicJsonWebKey getJwk() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
