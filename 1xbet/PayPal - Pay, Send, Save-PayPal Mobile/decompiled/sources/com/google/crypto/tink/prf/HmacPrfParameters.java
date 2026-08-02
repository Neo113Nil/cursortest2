package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public final class HmacPrfParameters extends com.google.crypto.tink.prf.PrfParameters {
    private static final int MIN_KEY_SIZE = 16;
    private final com.google.crypto.tink.prf.HmacPrfParameters.HashType hashType;
    private final int keySizeBytes;

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return false;
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.prf.HmacPrfParameters.HashType SHA1 = new com.google.crypto.tink.prf.HmacPrfParameters.HashType("SHA1");
        public static final com.google.crypto.tink.prf.HmacPrfParameters.HashType SHA224 = new com.google.crypto.tink.prf.HmacPrfParameters.HashType("SHA224");
        public static final com.google.crypto.tink.prf.HmacPrfParameters.HashType SHA256 = new com.google.crypto.tink.prf.HmacPrfParameters.HashType("SHA256");
        public static final com.google.crypto.tink.prf.HmacPrfParameters.HashType SHA384 = new com.google.crypto.tink.prf.HmacPrfParameters.HashType("SHA384");
        public static final com.google.crypto.tink.prf.HmacPrfParameters.HashType SHA512 = new com.google.crypto.tink.prf.HmacPrfParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3899name;

        private HashType(java.lang.String str) {
            this.f3899name = str;
        }

        public final java.lang.String toString() {
            return this.f3899name;
        }
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.prf.HmacPrfParameters.HashType hashType;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        private Builder() {
            this.keySizeBytes = null;
            this.hashType = null;
        }

        public final com.google.crypto.tink.prf.HmacPrfParameters.Builder setKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 16) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit or larger are supported", java.lang.Integer.valueOf(i * 8)));
            }
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.prf.HmacPrfParameters.Builder setHashType(com.google.crypto.tink.prf.HmacPrfParameters.HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.prf.HmacPrfParameters build() throws java.security.GeneralSecurityException {
            if (this.keySizeBytes == null) {
                throw new java.security.GeneralSecurityException("key size is not set");
            }
            if (this.hashType == null) {
                throw new java.security.GeneralSecurityException("hash type is not set");
            }
            return new com.google.crypto.tink.prf.HmacPrfParameters(this.keySizeBytes.intValue(), this.hashType);
        }
    }

    private HmacPrfParameters(int i, com.google.crypto.tink.prf.HmacPrfParameters.HashType hashType) {
        this.keySizeBytes = i;
        this.hashType = hashType;
    }

    public static com.google.crypto.tink.prf.HmacPrfParameters.Builder builder() {
        return new com.google.crypto.tink.prf.HmacPrfParameters.Builder();
    }

    public final int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public final com.google.crypto.tink.prf.HmacPrfParameters.HashType getHashType() {
        return this.hashType;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.prf.HmacPrfParameters)) {
            return false;
        }
        com.google.crypto.tink.prf.HmacPrfParameters hmacPrfParameters = (com.google.crypto.tink.prf.HmacPrfParameters) obj;
        return hmacPrfParameters.getKeySizeBytes() == getKeySizeBytes() && hmacPrfParameters.getHashType() == getHashType();
    }

    public final int hashCode() {
        int i = this.keySizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.prf.HmacPrfParameters.class, java.lang.Integer.valueOf(i), this.hashType);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HMAC PRF Parameters (hashType: ");
        sb.append(this.hashType);
        sb.append(" and ");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
