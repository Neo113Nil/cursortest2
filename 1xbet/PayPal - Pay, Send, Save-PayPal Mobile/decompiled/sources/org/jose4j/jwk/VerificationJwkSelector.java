package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class VerificationJwkSelector {
    private static final java.lang.String[] getHighSpeedVideoSizes = {"Ed25519", "Ed448"};

    public org.jose4j.jwk.JsonWebKey select(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.Collection<org.jose4j.jwk.JsonWebKey> collection) throws org.jose4j.lang.JoseException {
        java.util.List<org.jose4j.jwk.JsonWebKey> selectList = selectList(jsonWebSignature, collection);
        if (selectList.isEmpty()) {
            return null;
        }
        return selectList.get(0);
    }

    public java.util.List<org.jose4j.jwk.JsonWebKey> selectList(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.Collection<org.jose4j.jwk.JsonWebKey> collection) throws org.jose4j.lang.JoseException {
        org.jose4j.jwk.SimpleJwkFilter highResolutionOutputSizeshNQ4ISI = org.jose4j.jwk.SelectorSupport.getHighResolutionOutputSizeshNQ4ISI(jsonWebSignature);
        java.util.List<org.jose4j.jwk.JsonWebKey> filter = highResolutionOutputSizeshNQ4ISI.filter(collection);
        if (filter.size() > 1) {
            highResolutionOutputSizeshNQ4ISI.setAlg(jsonWebSignature.getAlgorithmHeaderValue(), org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
            filter = highResolutionOutputSizeshNQ4ISI.filter(filter);
        }
        if (filter.size() > 1) {
            java.lang.String keyType = jsonWebSignature.getKeyType();
            if ("EC".equals(keyType)) {
                highResolutionOutputSizeshNQ4ISI.setCrv(((org.jose4j.jws.EcdsaUsingShaAlgorithm) jsonWebSignature.getAlgorithmNoConstraintCheck()).getCurveName(), org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
                return highResolutionOutputSizeshNQ4ISI.filter(filter);
            }
            if (org.jose4j.jwk.OctetKeyPairJsonWebKey.KEY_TYPE.equals(keyType)) {
                highResolutionOutputSizeshNQ4ISI.setCrvs(getHighSpeedVideoSizes, org.jose4j.jwk.SimpleJwkFilter.OMITTED_OKAY);
                return highResolutionOutputSizeshNQ4ISI.filter(filter);
            }
        }
        return filter;
    }

    public org.jose4j.jwk.JsonWebKey selectWithVerifySignatureDisambiguate(org.jose4j.jws.JsonWebSignature jsonWebSignature, java.util.Collection<org.jose4j.jwk.JsonWebKey> collection) throws org.jose4j.lang.JoseException {
        java.util.List<org.jose4j.jwk.JsonWebKey> selectList = selectList(jsonWebSignature, collection);
        if (selectList.isEmpty()) {
            return null;
        }
        if (selectList.size() == 1) {
            return selectList.get(0);
        }
        for (org.jose4j.jwk.JsonWebKey jsonWebKey : selectList) {
            jsonWebSignature.setKey(jsonWebKey.getKey());
            if (jsonWebSignature.verifySignature()) {
                return jsonWebKey;
            }
        }
        return null;
    }
}
