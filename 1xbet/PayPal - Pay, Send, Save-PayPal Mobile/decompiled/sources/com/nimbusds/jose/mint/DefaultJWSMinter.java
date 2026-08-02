package com.nimbusds.jose.mint;

/* loaded from: classes10.dex */
public class DefaultJWSMinter<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.mint.ConfigurableJWSMinter<C> {
    private com.nimbusds.jose.jwk.source.JWKSource<C> jwkSource;
    private com.nimbusds.jose.produce.JWSSignerFactory jwsSignerFactory = new com.nimbusds.jose.crypto.factories.DefaultJWSSignerFactory();

    @Override // com.nimbusds.jose.mint.JWSMinter
    public com.nimbusds.jose.JWSObject mint(com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jose.Payload payload, C c) throws com.nimbusds.jose.JOSEException {
        java.util.List<com.nimbusds.jose.jwk.JWK> jwks = jwks(jWSHeader, c);
        if (jwks.isEmpty()) {
            throw new com.nimbusds.jose.JOSEException("No JWKs found for signing");
        }
        com.nimbusds.jose.jwk.JWK jwk = jwks.get(0);
        com.nimbusds.jose.JWSObject jWSObject = new com.nimbusds.jose.JWSObject(new com.nimbusds.jose.JWSHeader.Builder(jWSHeader).keyID(jwk.getKeyID()).x509CertURL(jwk.getX509CertURL()).x509CertChain(jwk.getX509CertChain()).x509CertSHA256Thumbprint(jwk.getX509CertSHA256Thumbprint()).x509CertThumbprint(jwk.getX509CertThumbprint()).build(), payload);
        com.nimbusds.jose.produce.JWSSignerFactory jWSSignerFactory = this.jwsSignerFactory;
        if (jWSSignerFactory == null) {
            throw new com.nimbusds.jose.JOSEException("No JWS signer factory configured");
        }
        jWSObject.sign(jWSSignerFactory.createJWSSigner(jwk));
        return jWSObject;
    }

    private java.util.List<com.nimbusds.jose.jwk.JWK> jwks(com.nimbusds.jose.JWSHeader jWSHeader, C c) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.jwk.JWKSelector jWKSelector = new com.nimbusds.jose.jwk.JWKSelector(com.nimbusds.jose.jwk.JWKMatcher.forJWSHeader(jWSHeader));
        if (c instanceof com.nimbusds.jose.proc.JWKSecurityContext) {
            return jWKSelector.select(new com.nimbusds.jose.jwk.JWKSet(((com.nimbusds.jose.proc.JWKSecurityContext) c).getKeys()));
        }
        com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource = this.jwkSource;
        if (jWKSource == null) {
            throw new com.nimbusds.jose.JOSEException("No JWK source configured");
        }
        return jWKSource.get(jWKSelector, c);
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public com.nimbusds.jose.jwk.source.JWKSource<C> getJWKSource() {
        return this.jwkSource;
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public void setJWKSource(com.nimbusds.jose.jwk.source.JWKSource<C> jWKSource) {
        this.jwkSource = jWKSource;
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public com.nimbusds.jose.produce.JWSSignerFactory getJWSSignerFactory() {
        return this.jwsSignerFactory;
    }

    @Override // com.nimbusds.jose.mint.JWSMinterConfiguration
    public void setJWSSignerFactory(com.nimbusds.jose.produce.JWSSignerFactory jWSSignerFactory) {
        this.jwsSignerFactory = jWSSignerFactory;
    }
}
