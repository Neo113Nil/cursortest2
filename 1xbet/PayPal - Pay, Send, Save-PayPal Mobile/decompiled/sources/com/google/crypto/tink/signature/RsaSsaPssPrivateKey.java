package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class RsaSsaPssPrivateKey extends com.google.crypto.tink.signature.SignaturePrivateKey {
    private final com.google.crypto.tink.util.SecretBigInteger d;
    private final com.google.crypto.tink.util.SecretBigInteger dP;
    private final com.google.crypto.tink.util.SecretBigInteger dQ;
    private final com.google.crypto.tink.util.SecretBigInteger p;
    private final com.google.crypto.tink.signature.RsaSsaPssPublicKey publicKey;
    private final com.google.crypto.tink.util.SecretBigInteger q;
    private final com.google.crypto.tink.util.SecretBigInteger qInv;

    public static class Builder {
        private static final int PRIME_CERTAINTY = 10;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBigInteger d;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBigInteger dP;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBigInteger dQ;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBigInteger p;

        @javax.annotation.Nullable
        private com.google.crypto.tink.signature.RsaSsaPssPublicKey publicKey;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBigInteger q;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.SecretBigInteger qInv;

        private Builder() {
            this.publicKey = null;
            this.d = null;
            this.p = null;
            this.q = null;
            this.dP = null;
            this.dQ = null;
            this.qInv = null;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPrivateKey.Builder setPublicKey(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey) {
            this.publicKey = rsaSsaPssPublicKey;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPrivateKey.Builder setPrimes(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.util.SecretBigInteger secretBigInteger2) {
            this.p = secretBigInteger;
            this.q = secretBigInteger2;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPrivateKey.Builder setPrivateExponent(com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
            this.d = secretBigInteger;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPrivateKey.Builder setPrimeExponents(com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.util.SecretBigInteger secretBigInteger2) {
            this.dP = secretBigInteger;
            this.dQ = secretBigInteger2;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPrivateKey.Builder setCrtCoefficient(com.google.crypto.tink.util.SecretBigInteger secretBigInteger) {
            this.qInv = secretBigInteger;
            return this;
        }

        public com.google.crypto.tink.signature.RsaSsaPssPrivateKey build() throws java.security.GeneralSecurityException {
            com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey = this.publicKey;
            if (rsaSsaPssPublicKey == null) {
                throw new java.security.GeneralSecurityException("Cannot build without a RSA SSA PKCS1 public key");
            }
            if (this.p == null || this.q == null) {
                throw new java.security.GeneralSecurityException("Cannot build without prime factors");
            }
            if (this.d == null) {
                throw new java.security.GeneralSecurityException("Cannot build without private exponent");
            }
            if (this.dP == null || this.dQ == null) {
                throw new java.security.GeneralSecurityException("Cannot build without prime exponents");
            }
            if (this.qInv == null) {
                throw new java.security.GeneralSecurityException("Cannot build without CRT coefficient");
            }
            java.math.BigInteger publicExponent = rsaSsaPssPublicKey.getParameters().getPublicExponent();
            java.math.BigInteger modulus = this.publicKey.getModulus();
            java.math.BigInteger bigInteger = this.p.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger2 = this.q.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger3 = this.d.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger4 = this.dP.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger5 = this.dQ.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            java.math.BigInteger bigInteger6 = this.qInv.getBigInteger(com.google.crypto.tink.InsecureSecretKeyAccess.get());
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
            return new com.google.crypto.tink.signature.RsaSsaPssPrivateKey(this.publicKey, this.p, this.q, this.d, this.dP, this.dQ, this.qInv);
        }
    }

    private RsaSsaPssPrivateKey(com.google.crypto.tink.signature.RsaSsaPssPublicKey rsaSsaPssPublicKey, com.google.crypto.tink.util.SecretBigInteger secretBigInteger, com.google.crypto.tink.util.SecretBigInteger secretBigInteger2, com.google.crypto.tink.util.SecretBigInteger secretBigInteger3, com.google.crypto.tink.util.SecretBigInteger secretBigInteger4, com.google.crypto.tink.util.SecretBigInteger secretBigInteger5, com.google.crypto.tink.util.SecretBigInteger secretBigInteger6) {
        this.publicKey = rsaSsaPssPublicKey;
        this.p = secretBigInteger;
        this.q = secretBigInteger2;
        this.d = secretBigInteger3;
        this.dP = secretBigInteger4;
        this.dQ = secretBigInteger5;
        this.qInv = secretBigInteger6;
    }

    public static com.google.crypto.tink.signature.RsaSsaPssPrivateKey.Builder builder() {
        return new com.google.crypto.tink.signature.RsaSsaPssPrivateKey.Builder();
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.signature.RsaSsaPssParameters getParameters() {
        return this.publicKey.getParameters();
    }

    @Override // com.google.crypto.tink.signature.SignaturePrivateKey, com.google.crypto.tink.PrivateKey
    public final com.google.crypto.tink.signature.RsaSsaPssPublicKey getPublicKey() {
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
        if (!(key instanceof com.google.crypto.tink.signature.RsaSsaPssPrivateKey)) {
            return false;
        }
        com.google.crypto.tink.signature.RsaSsaPssPrivateKey rsaSsaPssPrivateKey = (com.google.crypto.tink.signature.RsaSsaPssPrivateKey) key;
        return rsaSsaPssPrivateKey.publicKey.equalsKey(this.publicKey) && this.p.equalsSecretBigInteger(rsaSsaPssPrivateKey.p) && this.q.equalsSecretBigInteger(rsaSsaPssPrivateKey.q) && this.d.equalsSecretBigInteger(rsaSsaPssPrivateKey.d) && this.dP.equalsSecretBigInteger(rsaSsaPssPrivateKey.dP) && this.dQ.equalsSecretBigInteger(rsaSsaPssPrivateKey.dQ) && this.qInv.equalsSecretBigInteger(rsaSsaPssPrivateKey.qInv);
    }
}
