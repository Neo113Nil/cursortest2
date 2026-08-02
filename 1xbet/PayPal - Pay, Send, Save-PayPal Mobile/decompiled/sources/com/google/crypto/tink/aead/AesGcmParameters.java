package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesGcmParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final int ivSizeBytes;
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.aead.AesGcmParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3872name;
        public static final com.google.crypto.tink.aead.AesGcmParameters.Variant TINK = new com.google.crypto.tink.aead.AesGcmParameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.AesGcmParameters.Variant CRUNCHY = new com.google.crypto.tink.aead.AesGcmParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.aead.AesGcmParameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.AesGcmParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3872name = str;
        }

        public final java.lang.String toString() {
            return this.f3872name;
        }
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer ivSizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.aead.AesGcmParameters.Variant variant;

        private Builder() {
            this.keySizeBytes = null;
            this.ivSizeBytes = null;
            this.tagSizeBytes = null;
            this.variant = com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.aead.AesGcmParameters.Builder setKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i != 16 && i != 24 && i != 32) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
            }
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesGcmParameters.Builder setIvSizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i <= 0) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid IV size in bytes %d; IV size must be positive", java.lang.Integer.valueOf(i)));
            }
            this.ivSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesGcmParameters.Builder setTagSizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 12 || i > 16) {
                throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid tag size in bytes %d; value must be between 12 and 16 bytes", java.lang.Integer.valueOf(i)));
            }
            this.tagSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesGcmParameters.Builder setVariant(com.google.crypto.tink.aead.AesGcmParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.aead.AesGcmParameters build() throws java.security.GeneralSecurityException {
            java.lang.Integer num = this.keySizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("Key size is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("Variant is not set");
            }
            if (this.ivSizeBytes == null) {
                throw new java.security.GeneralSecurityException("IV size is not set");
            }
            if (this.tagSizeBytes == null) {
                throw new java.security.GeneralSecurityException("Tag size is not set");
            }
            return new com.google.crypto.tink.aead.AesGcmParameters(num.intValue(), this.ivSizeBytes.intValue(), this.tagSizeBytes.intValue(), this.variant);
        }
    }

    private AesGcmParameters(int i, int i2, int i3, com.google.crypto.tink.aead.AesGcmParameters.Variant variant) {
        this.keySizeBytes = i;
        this.ivSizeBytes = i2;
        this.tagSizeBytes = i3;
        this.variant = variant;
    }

    public static com.google.crypto.tink.aead.AesGcmParameters.Builder builder() {
        return new com.google.crypto.tink.aead.AesGcmParameters.Builder();
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

    public final com.google.crypto.tink.aead.AesGcmParameters.Variant getVariant() {
        return this.variant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.aead.AesGcmParameters)) {
            return false;
        }
        com.google.crypto.tink.aead.AesGcmParameters aesGcmParameters = (com.google.crypto.tink.aead.AesGcmParameters) obj;
        return aesGcmParameters.getKeySizeBytes() == getKeySizeBytes() && aesGcmParameters.getIvSizeBytes() == getIvSizeBytes() && aesGcmParameters.getTagSizeBytes() == getTagSizeBytes() && aesGcmParameters.getVariant() == getVariant();
    }

    public final int hashCode() {
        int i = this.keySizeBytes;
        int i2 = this.ivSizeBytes;
        int i3 = this.tagSizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.aead.AesGcmParameters.class, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.AesGcmParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesGcm Parameters (variant: ");
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
