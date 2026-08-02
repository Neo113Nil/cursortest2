package org.jose4j.jws;

/* loaded from: classes18.dex */
public class EdDsaAlgorithm extends org.jose4j.jws.BaseSignatureAlgorithm {
    public EdDsaAlgorithm() {
        super(org.jose4j.jws.AlgorithmIdentifiers.EDDSA, org.jose4j.jws.AlgorithmIdentifiers.EDDSA, org.jose4j.jwk.OctetKeyPairJsonWebKey.KEY_TYPE);
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm
    public void validatePrivateKey(java.security.PrivateKey privateKey) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.castKey(privateKey, java.security.interfaces.EdECPrivateKey.class);
    }

    @Override // org.jose4j.jws.BaseSignatureAlgorithm
    public void validatePublicKey(java.security.PublicKey publicKey) throws org.jose4j.lang.InvalidKeyException {
        org.jose4j.jwx.KeyValidationSupport.castKey(publicKey, java.security.interfaces.EdECPublicKey.class);
    }
}
