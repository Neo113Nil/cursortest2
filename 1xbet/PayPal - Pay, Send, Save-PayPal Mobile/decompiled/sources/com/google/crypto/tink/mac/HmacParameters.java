package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public final class HmacParameters extends com.google.crypto.tink.mac.MacParameters {
    private final com.google.crypto.tink.mac.HmacParameters.HashType hashType;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.mac.HmacParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3897name;
        public static final com.google.crypto.tink.mac.HmacParameters.Variant TINK = new com.google.crypto.tink.mac.HmacParameters.Variant("TINK");
        public static final com.google.crypto.tink.mac.HmacParameters.Variant CRUNCHY = new com.google.crypto.tink.mac.HmacParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.mac.HmacParameters.Variant LEGACY = new com.google.crypto.tink.mac.HmacParameters.Variant("LEGACY");
        public static final com.google.crypto.tink.mac.HmacParameters.Variant NO_PREFIX = new com.google.crypto.tink.mac.HmacParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3897name = str;
        }

        public final java.lang.String toString() {
            return this.f3897name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class HashType {
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA1 = new com.google.crypto.tink.mac.HmacParameters.HashType("SHA1");
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA224 = new com.google.crypto.tink.mac.HmacParameters.HashType("SHA224");
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA256 = new com.google.crypto.tink.mac.HmacParameters.HashType("SHA256");
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA384 = new com.google.crypto.tink.mac.HmacParameters.HashType("SHA384");
        public static final com.google.crypto.tink.mac.HmacParameters.HashType SHA512 = new com.google.crypto.tink.mac.HmacParameters.HashType("SHA512");

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3896name;

        private HashType(java.lang.String str) {
            this.f3896name = str;
        }

        public final java.lang.String toString() {
            return this.f3896name;
        }
    }

    public static final class Builder {
        private com.google.crypto.tink.mac.HmacParameters.HashType hashType;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.mac.HmacParameters.Variant variant;

        private Builder() {
            this.keySizeBytes = null;
            this.tagSizeBytes = null;
            this.hashType = null;
            this.variant = com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.mac.HmacParameters.Builder setKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.mac.HmacParameters.Builder setTagSizeBytes(int i) throws java.security.GeneralSecurityException {
            this.tagSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.mac.HmacParameters.Builder setVariant(com.google.crypto.tink.mac.HmacParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.mac.HmacParameters.Builder setHashType(com.google.crypto.tink.mac.HmacParameters.HashType hashType) {
            this.hashType = hashType;
            return this;
        }

        private static void validateTagSizeBytes(int i, com.google.crypto.tink.mac.HmacParameters.HashType hashType) throws java.security.GeneralSecurityException {
            if (i < 10) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; must be at least 10 bytes", java.lang.Integer.valueOf(i)));
            }
            if (hashType == com.google.crypto.tink.mac.HmacParameters.HashType.SHA1) {
                if (i > 20) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", java.lang.Integer.valueOf(i)));
                }
                return;
            }
            if (hashType == com.google.crypto.tink.mac.HmacParameters.HashType.SHA224) {
                if (i > 28) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", java.lang.Integer.valueOf(i)));
                }
                return;
            }
            if (hashType == com.google.crypto.tink.mac.HmacParameters.HashType.SHA256) {
                if (i > 32) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", java.lang.Integer.valueOf(i)));
                }
            } else if (hashType == com.google.crypto.tink.mac.HmacParameters.HashType.SHA384) {
                if (i > 48) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", java.lang.Integer.valueOf(i)));
                }
            } else {
                if (hashType != com.google.crypto.tink.mac.HmacParameters.HashType.SHA512) {
                    throw new java.security.GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i > 64) {
                    throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", java.lang.Integer.valueOf(i)));
                }
            }
        }

        public final com.google.crypto.tink.mac.HmacParameters build() throws java.security.GeneralSecurityException {
            java.lang.Integer num = this.keySizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("key size is not set");
            }
            if (this.tagSizeBytes == null) {
                throw new java.security.GeneralSecurityException("tag size is not set");
            }
            if (this.hashType == null) {
                throw new java.security.GeneralSecurityException("hash type is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.keySizeBytes));
            }
            validateTagSizeBytes(this.tagSizeBytes.intValue(), this.hashType);
            return new com.google.crypto.tink.mac.HmacParameters(this.keySizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant, this.hashType);
        }
    }

    private HmacParameters(int i, int i2, com.google.crypto.tink.mac.HmacParameters.Variant variant, com.google.crypto.tink.mac.HmacParameters.HashType hashType) {
        this.keySizeBytes = i;
        this.tagSizeBytes = i2;
        this.variant = variant;
        this.hashType = hashType;
    }

    public static com.google.crypto.tink.mac.HmacParameters.Builder builder() {
        return new com.google.crypto.tink.mac.HmacParameters.Builder();
    }

    public final int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public final int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public final int getTotalTagSizeBytes() {
        int cryptographicTagSizeBytes;
        if (this.variant == com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX) {
            return getCryptographicTagSizeBytes();
        }
        if (this.variant == com.google.crypto.tink.mac.HmacParameters.Variant.TINK) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (this.variant == com.google.crypto.tink.mac.HmacParameters.Variant.CRUNCHY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (this.variant == com.google.crypto.tink.mac.HmacParameters.Variant.LEGACY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else {
            throw new java.lang.IllegalStateException("Unknown variant");
        }
        return cryptographicTagSizeBytes + 5;
    }

    public final com.google.crypto.tink.mac.HmacParameters.Variant getVariant() {
        return this.variant;
    }

    public final com.google.crypto.tink.mac.HmacParameters.HashType getHashType() {
        return this.hashType;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.mac.HmacParameters)) {
            return false;
        }
        com.google.crypto.tink.mac.HmacParameters hmacParameters = (com.google.crypto.tink.mac.HmacParameters) obj;
        return hmacParameters.getKeySizeBytes() == getKeySizeBytes() && hmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && hmacParameters.getVariant() == getVariant() && hmacParameters.getHashType() == getHashType();
    }

    public final int hashCode() {
        int i = this.keySizeBytes;
        int i2 = this.tagSizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.mac.HmacParameters.class, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), this.variant, this.hashType);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.mac.HmacParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HMAC Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", hashType: ");
        sb.append(this.hashType);
        sb.append(", ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
