package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class JwtEcdsaPrivateKey extends com.google.crypto.tink.jwt.JwtSignaturePrivateKey {
    public final com.google.crypto.tink.util.SecretBigInteger privateKeyValue;
    public final com.google.crypto.tink.jwt.JwtEcdsaPublicKey publicKey;

    private static void validatePrivateValue(java.math.BigInteger bigInteger, java.security.spec.ECPoint eCPoint, com.google.crypto.tink.jwt.JwtEcdsaParameters.Algorithm algorithm) throws java.security.GeneralSecurityException {
        java.math.BigInteger order = algorithm.getECParameterSpec().getOrder();
        if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
            throw new java.security.GeneralSecurityException("Invalid private value");
        }
        if (!com.google.crypto.tink.internal.EllipticCurvesUtil.multiplyByGenerator(bigInteger, algorithm.getECParameterSpec()).equals(eCPoint)) {
            throw new java.security.GeneralSecurityException("Invalid private value");
        }
    }

    public static com.google.crypto.tink.jwt.JwtEcdsaPrivateKey create(com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey, com.google.crypto.tink.util.SecretBigInteger secretBigInteger) throws java.security.GeneralSecurityException {
        validatePrivateValue(secretBigInteger.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), jwtEcdsaPublicKey.getPublicPoint(), jwtEcdsaPublicKey.getParameters().getAlgorithm());
        return new com.google.crypto.tink.jwt.JwtEcdsaPrivateKey(jwtEcdsaPublicKey, secretBigInteger);
    }

    private JwtEcdsaPrivateKey(com.google.crypto.tink.jwt.JwtEcdsaPublicKey jwtEcdsaPublicKey, com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
        this.publicKey = jwtEcdsaPublicKey;
        this.privateKeyValue = secretBigInteger;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getPrivateValue() {
        return this.privateKeyValue;
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePrivateKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.jwt.JwtEcdsaParameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public final com.google.crypto.tink.jwt.JwtEcdsaPublicKey getPublicKey() {
        return this.publicKey;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.jwt.JwtEcdsaPrivateKey)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtEcdsaPrivateKey jwtEcdsaPrivateKey = (com.google.crypto.tink.jwt.JwtEcdsaPrivateKey) key;
        return jwtEcdsaPrivateKey.publicKey.equalsKey(this.publicKey) && this.privateKeyValue.equalsSecretBigInteger(jwtEcdsaPrivateKey.privateKeyValue);
    }
}
