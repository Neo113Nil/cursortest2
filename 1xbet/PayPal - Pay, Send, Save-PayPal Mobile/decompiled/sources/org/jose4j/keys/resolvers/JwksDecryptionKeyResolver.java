package org.jose4j.keys.resolvers;

/* loaded from: classes18.dex */
public class JwksDecryptionKeyResolver implements org.jose4j.keys.resolvers.DecryptionKeyResolver {
    boolean Camera2StreamConfigurationMap;
    private final org.jose4j.jwk.DecryptionJwkSelector getHighSpeedVideoFpsRanges = new org.jose4j.jwk.DecryptionJwkSelector();
    private final java.util.List<org.jose4j.jwk.JsonWebKey> getHighSpeedVideoFpsRangesFor;

    public JwksDecryptionKeyResolver(java.util.List<org.jose4j.jwk.JsonWebKey> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    @Override // org.jose4j.keys.resolvers.DecryptionKeyResolver
    public java.security.Key resolveKey(org.jose4j.jwe.JsonWebEncryption jsonWebEncryption, java.util.List<org.jose4j.jwx.JsonWebStructure> list) throws org.jose4j.lang.UnresolvableKeyException {
        org.jose4j.jwk.JsonWebKey jsonWebKey;
        try {
            java.util.List<org.jose4j.jwk.JsonWebKey> selectList = this.getHighSpeedVideoFpsRanges.selectList(jsonWebEncryption, this.getHighSpeedVideoFpsRangesFor);
            if (selectList.isEmpty()) {
                jsonWebKey = null;
            } else {
                if (selectList.size() != 1 && this.Camera2StreamConfigurationMap) {
                    jsonWebKey = this.getHighSpeedVideoFpsRanges.attemptDecryptDisambiguate(jsonWebEncryption, selectList);
                    if (jsonWebKey == null) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to find a suitable key for JWE w/ header ");
                        sb.append(jsonWebEncryption.getHeaders().getFullHeaderAsJsonString());
                        sb.append(" using attempted decryption to disambiguate from filtered candidate JWKs ");
                        sb.append(this.getHighSpeedVideoFpsRangesFor);
                        throw new org.jose4j.lang.UnresolvableKeyException(sb.toString());
                    }
                }
                jsonWebKey = selectList.get(0);
            }
            if (jsonWebKey != null) {
                return jsonWebKey instanceof org.jose4j.jwk.PublicJsonWebKey ? ((org.jose4j.jwk.PublicJsonWebKey) jsonWebKey).getPrivateKey() : jsonWebKey.getKey();
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unable to find a suitable key for JWE w/ header ");
            sb2.append(jsonWebEncryption.getHeaders().getFullHeaderAsJsonString());
            sb2.append(" from JWKs ");
            sb2.append(this.getHighSpeedVideoFpsRangesFor);
            throw new org.jose4j.lang.UnresolvableKeyException(sb2.toString());
        } catch (org.jose4j.lang.JoseException e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to find a suitable key for JWE w/ header ");
            sb3.append(jsonWebEncryption.getHeaders().getFullHeaderAsJsonString());
            sb3.append(" due to an unexpected exception (");
            sb3.append(e);
            sb3.append(") selecting from keys: ");
            sb3.append(this.getHighSpeedVideoFpsRangesFor);
            throw new org.jose4j.lang.UnresolvableKeyException(sb3.toString(), e);
        }
    }

    public void setDisambiguateWithAttemptDecrypt(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }
}
