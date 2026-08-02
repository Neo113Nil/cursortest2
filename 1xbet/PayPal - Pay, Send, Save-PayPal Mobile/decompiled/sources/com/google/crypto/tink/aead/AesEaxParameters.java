package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesEaxParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final int ivSizeBytes;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.aead.AesEaxParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3871name;
        public static final com.google.crypto.tink.aead.AesEaxParameters.Variant TINK = new com.google.crypto.tink.aead.AesEaxParameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.AesEaxParameters.Variant CRUNCHY = new com.google.crypto.tink.aead.AesEaxParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.aead.AesEaxParameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.AesEaxParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3871name = str;
        }

        public final java.lang.String toString() {
            return this.f3871name;
        }
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer ivSizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.aead.AesEaxParameters.Variant variant;

        private Builder() {
            this.keySizeBytes = null;
            this.ivSizeBytes = null;
            this.tagSizeBytes = null;
            this.variant = com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.aead.AesEaxParameters.Builder setKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
            }
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesEaxParameters.Builder setIvSizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i != 12 && i != 16) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", java.lang.Integer.valueOf(i)));
            }
            this.ivSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesEaxParameters.Builder setTagSizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 0 || i > 16) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", java.lang.Integer.valueOf(i)));
            }
            this.tagSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesEaxParameters.Builder setVariant(com.google.crypto.tink.aead.AesEaxParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.aead.AesEaxParameters build() throws java.security.GeneralSecurityException {
            java.lang.Integer num = this.keySizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("Key size is not set");
            }
            if (this.ivSizeBytes == null) {
                throw new java.security.GeneralSecurityException("IV size is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("Variant is not set");
            }
            if (this.tagSizeBytes == null) {
                throw new java.security.GeneralSecurityException("Tag size is not set");
            }
            return new com.google.crypto.tink.aead.AesEaxParameters(num.intValue(), this.ivSizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant);
        }
    }

    private AesEaxParameters(int i, int i2, int i3, com.google.crypto.tink.aead.AesEaxParameters.Variant variant) {
        this.keySizeBytes = i;
        this.ivSizeBytes = i2;
        this.tagSizeBytes = i3;
        this.variant = variant;
    }

    public static com.google.crypto.tink.aead.AesEaxParameters.Builder builder() {
        return new com.google.crypto.tink.aead.AesEaxParameters.Builder();
    }

    public final int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public final int getIvSizeBytes() {
        return this.ivSizeBytes;
    }

    public final int getTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public final com.google.crypto.tink.aead.AesEaxParameters.Variant getVariant() {
        return this.variant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.aead.AesEaxParameters)) {
            return false;
        }
        com.google.crypto.tink.aead.AesEaxParameters aesEaxParameters = (com.google.crypto.tink.aead.AesEaxParameters) obj;
        return aesEaxParameters.getKeySizeBytes() == getKeySizeBytes() && aesEaxParameters.getIvSizeBytes() == getIvSizeBytes() && aesEaxParameters.getTagSizeBytes() == getTagSizeBytes() && aesEaxParameters.getVariant() == getVariant();
    }

    public final int hashCode() {
        int i = this.keySizeBytes;
        int i2 = this.ivSizeBytes;
        int i3 = this.tagSizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.aead.AesEaxParameters.class, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.AesEaxParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesEax Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.ivSizeBytes);
        sb.append("-byte IV, ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tag, and ");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
