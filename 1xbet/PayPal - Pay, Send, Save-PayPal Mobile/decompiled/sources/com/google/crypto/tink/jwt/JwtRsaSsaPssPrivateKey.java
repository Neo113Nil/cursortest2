package com.google.crypto.tink.jwt;

/* loaded from: classes9.dex */
public final class JwtRsaSsaPssPrivateKey extends com.google.crypto.tink.jwt.JwtSignaturePrivateKey {
    private final com.google.crypto.tink.util.SecretBigInteger d;
    private final com.google.crypto.tink.util.SecretBigInteger dP;
    private final com.google.crypto.tink.util.SecretBigInteger dQ;
    private final com.google.crypto.tink.util.SecretBigInteger p;
    private final com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey publicKey;
    private final com.google.crypto.tink.util.SecretBigInteger q;
    private final com.google.crypto.tink.util.SecretBigInteger qInv;

    public static class Builder {
        private static final int PRIME_CERTAINTY = 10;
        private java.util.Optional<com.google.crypto.tink.util.SecretBigInteger> d;
        private java.util.Optional<com.google.crypto.tink.util.SecretBigInteger> dP;
        private java.util.Optional<com.google.crypto.tink.util.SecretBigInteger> dQ;
        private java.util.Optional<com.google.crypto.tink.util.SecretBigInteger> p;
        private java.util.Optional<com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey> publicKey;
        private java.util.Optional<com.google.crypto.tink.util.SecretBigInteger> q;
        private java.util.Optional<com.google.crypto.tink.util.SecretBigInteger> qInv;

        private Builder() {
            this.publicKey = java.util.Optional.empty();
            this.d = java.util.Optional.empty();
            this.p = java.util.Optional.empty();
            this.q = java.util.Optional.empty();
            this.dP = java.util.Optional.empty();
            this.dQ = java.util.Optional.empty();
            this.qInv = java.util.Optional.empty();
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.Builder setPublicKey(com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey) {
            this.publicKey = java.util.Optional.of(jwtRsaSsaPssPublicKey);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.Builder setPrimes(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.util.SecretBigInteger secretBigInteger2) {
            this.p = java.util.Optional.of(secretBigInteger);
            this.q = java.util.Optional.of(secretBigInteger2);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.Builder setPrivateExponent(com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
            this.d = java.util.Optional.of(secretBigInteger);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.Builder setPrimeExponents(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.util.SecretBigInteger secretBigInteger2) {
            this.dP = java.util.Optional.of(secretBigInteger);
            this.dQ = java.util.Optional.of(secretBigInteger2);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.Builder setCrtCoefficient(com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
            this.qInv = java.util.Optional.of(secretBigInteger);
            return this;
        }

        public com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey build() throws java.security.GeneralSecurityException {
            if (!this.publicKey.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without a RSA SSA PSS public key");
            }
            if (!this.p.isPresent() || !this.q.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without prime factors");
            }
            if (!this.d.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without private exponent");
            }
            if (!this.dP.isPresent() || !this.dQ.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without prime exponents");
            }
            if (!this.qInv.isPresent()) {
                throw new java.security.GeneralSecurityException("Cannot build without CRT coefficient");
            }
            java.math.BigInteger publicExponent = this.publicKey.get().getParameters().getPublicExponent();
            java.math.BigInteger modulus = this.publicKey.get().getModulus();
            java.math.BigInteger bigInteger = this.p.get().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger2 = this.q.get().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger3 = this.d.get().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger4 = this.dP.get().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger5 = this.dQ.get().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger6 = this.qInv.get().getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            if (!bigInteger.isProbablePrime(10)) {
                throw new java.security.GeneralSecurityException("p is not a prime");
            }
            if (!bigInteger2.isProbablePrime(10)) {
                throw new java.security.GeneralSecurityException("q is not a prime");
            }
            if (!bigInteger.multiply(bigInteger2).equals(modulus)) {
                throw new java.security.GeneralSecurityException("Prime p times prime q is not equal to the public key's modulus");
            }
            java.math.BigInteger subtract = bigInteger.subtract(java.math.BigInteger.ONE);
            java.math.BigInteger subtract2 = bigInteger2.subtract(java.math.BigInteger.ONE);
            if (!publicExponent.multiply(bigInteger3).mod(subtract.divide(subtract.gcd(subtract2)).multiply(subtract2)).equals(java.math.BigInteger.ONE)) {
                throw new java.security.GeneralSecurityException("D is invalid.");
            }
            if (!publicExponent.multiply(bigInteger4).mod(subtract).equals(java.math.BigInteger.ONE)) {
                throw new java.security.GeneralSecurityException("dP is invalid.");
            }
            if (!publicExponent.multiply(bigInteger5).mod(subtract2).equals(java.math.BigInteger.ONE)) {
                throw new java.security.GeneralSecurityException("dQ is invalid.");
            }
            if (!bigInteger2.multiply(bigInteger6).mod(bigInteger).equals(java.math.BigInteger.ONE)) {
                throw new java.security.GeneralSecurityException("qInv is invalid.");
            }
            return new com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey(this.publicKey.get(), this.p.get(), this.q.get(), this.d.get(), this.dP.get(), this.dQ.get(), this.qInv.get());
        }
    }

    private JwtRsaSsaPssPrivateKey(com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey jwtRsaSsaPssPublicKey, com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.util.SecretBigInteger secretBigInteger2, com.google.crypto.tink.util.SecretBigInteger secretBigInteger3, com.google.crypto.tink.util.SecretBigInteger secretBigInteger4, com.google.crypto.tink.util.SecretBigInteger secretBigInteger5, com.google.crypto.tink.util.SecretBigInteger secretBigInteger6) {
        this.publicKey = jwtRsaSsaPssPublicKey;
        this.p = secretBigInteger;
        this.q = secretBigInteger2;
        this.d = secretBigInteger3;
        this.dP = secretBigInteger4;
        this.dQ = secretBigInteger5;
        this.qInv = secretBigInteger6;
    }

    public static com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.Builder builder() {
        return new com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey.Builder();
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePrivateKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.jwt.JwtRsaSsaPssParameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.jwt.JwtSignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public final com.google.crypto.tink.jwt.JwtRsaSsaPssPublicKey getPublicKey() {
        return this.publicKey;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getPrimeP() {
        return this.p;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getPrimeQ() {
        return this.q;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getPrivateExponent() {
        return this.d;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getPrimeExponentP() {
        return this.dP;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getPrimeExponentQ() {
        return this.dQ;
    }

    public final com.google.crypto.tink.util.SecretBigInteger getCrtCoefficient() {
        return this.qInv;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey)) {
            return false;
        }
        com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey jwtRsaSsaPssPrivateKey = (com.google.crypto.tink.jwt.JwtRsaSsaPssPrivateKey) key;
        return jwtRsaSsaPssPrivateKey.publicKey.equalsKey(this.publicKey) && this.p.equalsSecretBigInteger(jwtRsaSsaPssPrivateKey.p) && this.q.equalsSecretBigInteger(jwtRsaSsaPssPrivateKey.q) && this.d.equalsSecretBigInteger(jwtRsaSsaPssPrivateKey.d) && this.dP.equalsSecretBigInteger(jwtRsaSsaPssPrivateKey.dP) && this.dQ.equalsSecretBigInteger(jwtRsaSsaPssPrivateKey.dQ) && this.qInv.equalsSecretBigInteger(jwtRsaSsaPssPrivateKey.qInv);
    }
}
