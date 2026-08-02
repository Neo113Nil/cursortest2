package com.google.crypto.tink.prf;

/* loaded from: classes9.dex */
public final class HkdfPrfParameters extends com.google.crypto.tink.prf.PrfParameters {
    private static final int MIN_KEY_SIZE = 16;
    private final com.google.crypto.tink.prf.HkdfPrfParameters.HashType hashType;
    private final int keySizeBytes;

    @javax.annotation.Nullable
    private final com.google.crypto.tink.util.Bytes salt;

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return false;
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA1 = new com.google.crypto.tink.prf.HkdfPrfParameters.HashType("SHA1");
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA224 = new com.google.crypto.tink.prf.HkdfPrfParameters.HashType("SHA224");
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA256 = new com.google.crypto.tink.prf.HkdfPrfParameters.HashType("SHA256");
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA384 = new com.google.crypto.tink.prf.HkdfPrfParameters.HashType("SHA384");
        public static final com.google.crypto.tink.prf.HkdfPrfParameters.HashType SHA512 = new com.google.crypto.tink.prf.HkdfPrfParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3898name;

        private HashType(java.lang.String str) {
            this.f3898name = str;
        }

        public final java.lang.String toString() {
            return this.f3898name;
        }
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.prf.HkdfPrfParameters.HashType hashType;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private com.google.crypto.tink.util.Bytes salt;

        private Builder() {
            this.keySizeBytes = null;
            this.hashType = null;
            this.salt = null;
        }

        public final com.google.crypto.tink.prf.HkdfPrfParameters.Builder setKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 16) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit or larger are supported", java.lang.Integer.valueOf(i * 8)));
            }
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.prf.HkdfPrfParameters.Builder setHashType(com.google.crypto.tink.prf.HkdfPrfParameters.HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        public final com.google.crypto.tink.prf.HkdfPrfParameters.Builder setSalt(com.google.crypto.tink.util.Bytes bytes) {
            if (bytes.size() == 0) {
                this.salt = null;
                return this;
            }
            this.salt = bytes;
            return this;
        }

        public final com.google.crypto.tink.prf.HkdfPrfParameters build() throws java.security.GeneralSecurityException {
            if (this.keySizeBytes == null) {
                throw new java.security.GeneralSecurityException("key size is not set");
            }
            if (this.hashType == null) {
                throw new java.security.GeneralSecurityException("hash type is not set");
            }
            return new com.google.crypto.tink.prf.HkdfPrfParameters(this.keySizeBytes.intValue(), this.hashType, this.salt);
        }
    }

    private HkdfPrfParameters(int i, com.google.crypto.tink.prf.HkdfPrfParameters.HashType hashType, com.google.crypto.tink.util.Bytes bytes) {
        this.keySizeBytes = i;
        this.hashType = hashType;
        this.salt = bytes;
    }

    public static com.google.crypto.tink.prf.HkdfPrfParameters.Builder builder() {
        return new com.google.crypto.tink.prf.HkdfPrfParameters.Builder();
    }

    public final int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public final com.google.crypto.tink.prf.HkdfPrfParameters.HashType getHashType() {
        return this.hashType;
    }

    @javax.annotation.Nullable
    public final com.google.crypto.tink.util.Bytes getSalt() {
        return this.salt;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.prf.HkdfPrfParameters)) {
            return false;
        }
        com.google.crypto.tink.prf.HkdfPrfParameters hkdfPrfParameters = (com.google.crypto.tink.prf.HkdfPrfParameters) obj;
        return hkdfPrfParameters.getKeySizeBytes() == getKeySizeBytes() && hkdfPrfParameters.getHashType() == getHashType() && java.util.Objects.equals(hkdfPrfParameters.getSalt(), getSalt());
    }

    public final int hashCode() {
        int i = this.keySizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.prf.HkdfPrfParameters.class, java.lang.Integer.valueOf(i), this.hashType, this.salt);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HKDF PRF Parameters (hashType: ");
        sb.append(this.hashType);
        sb.append(", salt: ");
        sb.append(this.salt);
        sb.append(", and ");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
