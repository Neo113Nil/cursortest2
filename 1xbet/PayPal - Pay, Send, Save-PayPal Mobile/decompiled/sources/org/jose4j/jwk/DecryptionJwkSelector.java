package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class DecryptionJwkSelector {
    private static final org.slf4j.Logger getHighSpeedVideoFpsRanges = org.slf4j.LoggerFactory.getLogger((java.lang.Class<?>) org.jose4j.jwk.DecryptionJwkSelector.class);

    public org.jose4j.jwk.JsonWebKey select(org.jose4j.jwe.JsonWebEncryption jsonWebEncryption, java.util.Collection<org.jose4j.jwk.JsonWebKey> collection) throws org.jose4j.lang.JoseException {
        java.util.List<org.jose4j.jwk.JsonWebKey> selectList = selectList(jsonWebEncryption, collection);
        if (selectList.isEmpty()) {
            return null;
        }
        return selectList.get(0);
    }

    public java.util.List<org.jose4j.jwk.JsonWebKey> selectList(org.jose4j.jwe.JsonWebEncryption jsonWebEncryption, java.util.Collection<org.jose4j.jwk.JsonWebKey> collection) throws org.jose4j.lang.JoseException {
        return org.jose4j.jwk.SelectorSupport.Camera2StreamConfigurationMap(jsonWebEncryption).filter(collection);
    }

    public org.jose4j.jwk.JsonWebKey attemptDecryptDisambiguate(org.jose4j.jwe.JsonWebEncryption jsonWebEncryption, java.util.List<org.jose4j.jwk.JsonWebKey> list) {
        java.security.Key key;
        for (org.jose4j.jwk.JsonWebKey jsonWebKey : list) {
            if (jsonWebKey instanceof org.jose4j.jwk.PublicJsonWebKey) {
                key = ((org.jose4j.jwk.PublicJsonWebKey) jsonWebKey).getPrivateKey();
            } else {
                key = jsonWebKey.getKey();
            }
            if (key != null) {
                jsonWebEncryption.setKey(key);
                try {
                    if (jsonWebEncryption.getPlaintextBytes() != null) {
                        return jsonWebKey;
                    }
                } catch (org.jose4j.lang.JoseException e) {
                    getHighSpeedVideoFpsRanges.debug("Not using key (kid={}) b/c attempt to decrypt failed trying to disambiguate ({}).", jsonWebKey.getKeyId(), org.jose4j.lang.ExceptionHelp.toStringWithCauses(e));
                }
            }
        }
        return null;
    }
}
