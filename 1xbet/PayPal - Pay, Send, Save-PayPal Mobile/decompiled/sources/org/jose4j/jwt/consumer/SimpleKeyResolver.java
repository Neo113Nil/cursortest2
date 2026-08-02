package org.jose4j.jwt.consumer;

/* loaded from: classes18.dex */
class SimpleKeyResolver implements org.jose4j.keys.resolvers.VerificationKeyResolver, org.jose4j.keys.resolvers.DecryptionKeyResolver {
    private java.security.Key Camera2StreamConfigurationMap;

    SimpleKeyResolver(java.security.Key key) {
        this.Camera2StreamConfigurationMap = key;
    }

    @Override // org.jose4j.keys.resolvers.DecryptionKeyResolver
    public java.security.Key resolveKey(org.jose4j.jwe.JsonWebEncryption jsonWebEncryption, java.util.List<org.jose4j.jwx.JsonWebStructure> list) {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // org.jose4j.keys.resolvers.VerificationKeyResolver
    public java.security.Key resolveKey(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.List<org.jose4j.jwx.JsonWebStructure> list) {
        return this.Camera2StreamConfigurationMap;
    }
}
