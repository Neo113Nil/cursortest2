package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesCtrHmacAeadParameters extends com.google.crypto.tink.aead.AeadParameters {
    private static final int PREFIX_SIZE_IN_BYTES = 5;
    private final int aesKeySizeBytes;
    private final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType hashType;
    private final int hmacKeySizeBytes;
    private final int ivSizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3870name;
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant TINK = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant CRUNCHY = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3870name = str;
        }

        public final java.lang.String toString() {
            return this.f3870name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType SHA1 = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType("SHA1");
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType SHA224 = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType("SHA224");
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType SHA256 = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType("SHA256");
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType SHA384 = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType("SHA384");
        public static final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType SHA512 = new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3869name;

        private HashType(java.lang.String str) {
            this.f3869name = str;
        }

        public final java.lang.String toString() {
            return this.f3869name;
        }
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer aesKeySizeBytes;
        private com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType hashType;

        @javax.annotation.Nullable
        private java.lang.Integer hmacKeySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer ivSizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant variant;

        private Builder() {
            this.aesKeySizeBytes = null;
            this.hmacKeySizeBytes = null;
            this.ivSizeBytes = null;
            this.tagSizeBytes = null;
            this.hashType = null;
            this.variant = com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder setAesKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
            }
            this.aesKeySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder setHmacKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 16) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", java.lang.Integer.valueOf(i)));
            }
            this.hmacKeySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder setIvSizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 12 || i > 16) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", java.lang.Integer.valueOf(i)));
            }
            this.ivSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder setTagSizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 10) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", java.lang.Integer.valueOf(i)));
            }
            this.tagSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder setVariant(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder setHashType(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        private static void validateTagSizeBytes(int i, com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType hashType) throws java.security.GeneralSecurityException {
            if (hashType == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA1) {
                if (i > 20) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", java.lang.Integer.valueOf(i)));
                }
                return;
            }
            if (hashType == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA224) {
                if (i > 28) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", java.lang.Integer.valueOf(i)));
                }
                return;
            }
            if (hashType == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA256) {
                if (i > 32) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", java.lang.Integer.valueOf(i)));
                }
            } else if (hashType == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA384) {
                if (i > 48) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", java.lang.Integer.valueOf(i)));
                }
            } else {
                if (hashType != com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType.SHA512) {
                    throw new java.security.GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                }
                if (i > 64) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", java.lang.Integer.valueOf(i)));
                }
            }
        }

        public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters build() throws java.security.GeneralSecurityException {
            if (this.aesKeySizeBytes == null) {
                throw new java.security.GeneralSecurityException("AES key size is not set");
            }
            if (this.hmacKeySizeBytes == null) {
                throw new java.security.GeneralSecurityException("HMAC key size is not set");
            }
            if (this.ivSizeBytes == null) {
                throw new java.security.GeneralSecurityException("iv size is not set");
            }
            java.lang.Integer num = this.tagSizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("tag size is not set");
            }
            if (this.hashType == null) {
                throw new java.security.GeneralSecurityException("hash type is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("variant is not set");
            }
            validateTagSizeBytes(num.intValue(), this.hashType);
            return new com.google.crypto.tink.aead.AesCtrHmacAeadParameters(this.aesKeySizeBytes.intValue(), this.hmacKeySizeBytes.intValue(), this.ivSizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant, this.hashType);
        }
    }

    private AesCtrHmacAeadParameters(int i, int i2, int i3, int i4, com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant variant, com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType hashType) {
        this.aesKeySizeBytes = i;
        this.hmacKeySizeBytes = i2;
        this.ivSizeBytes = i3;
        this.tagSizeBytes = i4;
        this.variant = variant;
        this.hashType = hashType;
    }

    public static com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder builder() {
        return new com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Builder();
    }

    public final int getAesKeySizeBytes() {
        return this.aesKeySizeBytes;
    }

    public final int getHmacKeySizeBytes() {
        return this.hmacKeySizeBytes;
    }

    public final int getTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public final int getIvSizeBytes() {
        return this.ivSizeBytes;
    }

    public final int getCiphertextOverheadSizeBytes() {
        if (this.variant == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX) {
            return getTagSizeBytes() + getIvSizeBytes();
        }
        if (this.variant == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.TINK || this.variant == com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.CRUNCHY) {
            return getTagSizeBytes() + getIvSizeBytes() + 5;
        }
        throw new java.lang.IllegalStateException("Unknown variant");
    }

    public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant getVariant() {
        return this.variant;
    }

    public final com.google.crypto.tink.aead.AesCtrHmacAeadParameters.HashType getHashType() {
        return this.hashType;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.aead.AesCtrHmacAeadParameters)) {
            return false;
        }
        com.google.crypto.tink.aead.AesCtrHmacAeadParameters aesCtrHmacAeadParameters = (com.google.crypto.tink.aead.AesCtrHmacAeadParameters) obj;
        return aesCtrHmacAeadParameters.getAesKeySizeBytes() == getAesKeySizeBytes() && aesCtrHmacAeadParameters.getHmacKeySizeBytes() == getHmacKeySizeBytes() && aesCtrHmacAeadParameters.getIvSizeBytes() == getIvSizeBytes() && aesCtrHmacAeadParameters.getTagSizeBytes() == getTagSizeBytes() && aesCtrHmacAeadParameters.getVariant() == getVariant() && aesCtrHmacAeadParameters.getHashType() == getHashType();
    }

    public final int hashCode() {
        int i = this.aesKeySizeBytes;
        int i2 = this.hmacKeySizeBytes;
        int i3 = this.ivSizeBytes;
        int i4 = this.tagSizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.aead.AesCtrHmacAeadParameters.class, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf(i4), this.variant, this.hashType);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.AesCtrHmacAeadParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesCtrHmacAead Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", hashType: ");
        sb.append(this.hashType);
        sb.append(", ");
        sb.append(this.ivSizeBytes);
        sb.append("-byte IV, and ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        sb.append(this.aesKeySizeBytes);
        sb.append("-byte AES key, and ");
        sb.append(this.hmacKeySizeBytes);
        sb.append("-byte HMAC key)");
        return sb.toString();
    }
}
