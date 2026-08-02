package com.google.crypto.tink.signature;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class EcdsaPrivateKey extends com.google.crypto.tink.signature.SignaturePrivateKey {
    private final com.google.crypto.tink.util.SecretBigInteger privateValue;
    private final com.google.crypto.tink.signature.EcdsaPublicKey publicKey;

    public static class Builder {
        private com.google.crypto.tink.util.SecretBigInteger privateValue;
        private com.google.crypto.tink.signature.EcdsaPublicKey publicKey;

        private Builder() {
            this.publicKey = null;
            this.privateValue = null;
        }

        public com.google.crypto.tink.signature.EcdsaPrivateKey.Builder setPublicKey(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey) {
            this.publicKey = ecdsaPublicKey;
            return this;
        }

        public com.google.crypto.tink.signature.EcdsaPrivateKey.Builder setPrivateValue(com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
            this.privateValue = secretBigInteger;
            return this;
        }

        private static void validatePrivateValue(java.math.BigInteger bigInteger, java.security.spec.ECPoint eCPoint, com.google.crypto.tink.signature.EcdsaParameters.CurveType curveType) throws java.security.GeneralSecurityException {
            java.math.BigInteger order = curveType.toParameterSpec().getOrder();
            if (bigInteger.signum() <= 0 || bigInteger.compareTo(order) >= 0) {
                throw new java.security.GeneralSecurityException("Invalid private value");
            }
            if (!com.google.crypto.tink.internal.EllipticCurvesUtil.multiplyByGenerator(bigInteger, curveType.toParameterSpec()).equals(eCPoint)) {
                throw new java.security.GeneralSecurityException("Invalid private value");
            }
        }

        public com.google.crypto.tink.signature.EcdsaPrivateKey build() throws java.security.GeneralSecurityException {
            if (this.publicKey == null) {
                throw new java.security.GeneralSecurityException("Cannot build without a ecdsa public key");
            }
            com.google.crypto.tink.util.SecretBigInteger secretBigInteger = this.privateValue;
            if (secretBigInteger == null) {
                throw new java.security.GeneralSecurityException("Cannot build without a private value");
            }
            validatePrivateValue(secretBigInteger.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get()), this.publicKey.getPublicPoint(), this.publicKey.getParameters().getCurveType());
            return new com.google.crypto.tink.signature.EcdsaPrivateKey(this.publicKey, this.privateValue);
        }
    }

    private EcdsaPrivateKey(com.google.crypto.tink.signature.EcdsaPublicKey ecdsaPublicKey, com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
        this.publicKey = ecdsaPublicKey;
        this.privateValue = secretBigInteger;
    }

    public static com.google.crypto.tink.signature.EcdsaPrivateKey.Builder builder() {
        return new com.google.crypto.tink.signature.EcdsaPrivateKey.Builder();
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.signature.EcdsaParameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public final com.google.crypto.tink.signature.EcdsaPublicKey getPublicKey() {
        return this.publicKey;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getPrivateValue() {
        return this.privateValue;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.signature.EcdsaPrivateKey)) {
            return false;
        }
        com.google.crypto.tink.signature.EcdsaPrivateKey ecdsaPrivateKey = (com.google.crypto.tink.signature.EcdsaPrivateKey) key;
        return ecdsaPrivateKey.publicKey.equalsKey(this.publicKey) && this.privateValue.equalsSecretBigInteger(ecdsaPrivateKey.privateValue);
    }
}
