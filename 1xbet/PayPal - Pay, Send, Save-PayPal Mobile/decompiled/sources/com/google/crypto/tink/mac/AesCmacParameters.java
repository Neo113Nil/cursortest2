package com.google.crypto.tink.mac;

/* loaded from: classes4.dex */
public final class AesCmacParameters extends com.google.crypto.tink.mac.MacParameters {
    private final int keySizeBytes;
    private final int tagSizeBytes;
    private final com.google.crypto.tink.mac.AesCmacParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3895name;
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant TINK = new com.google.crypto.tink.mac.AesCmacParameters.Variant("TINK");
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant CRUNCHY = new com.google.crypto.tink.mac.AesCmacParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant LEGACY = new com.google.crypto.tink.mac.AesCmacParameters.Variant("LEGACY");
        public static final com.google.crypto.tink.mac.AesCmacParameters.Variant NO_PREFIX = new com.google.crypto.tink.mac.AesCmacParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3895name = str;
        }

        public final java.lang.String toString() {
            return this.f3895name;
        }
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;

        @javax.annotation.Nullable
        private java.lang.Integer tagSizeBytes;
        private com.google.crypto.tink.mac.AesCmacParameters.Variant variant;

        private Builder() {
            this.keySizeBytes = null;
            this.tagSizeBytes = null;
            this.variant = com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.mac.AesCmacParameters.Builder setKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i * 8)));
            }
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.mac.AesCmacParameters.Builder setTagSizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i < 10 || 16 < i) {
                throw new java.security.GeneralSecurityException("Invalid tag size for AesCmacParameters: ".concat(java.lang.String.valueOf(i)));
            }
            this.tagSizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.mac.AesCmacParameters.Builder setVariant(com.google.crypto.tink.mac.AesCmacParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.mac.AesCmacParameters build() throws java.security.GeneralSecurityException {
            java.lang.Integer num = this.keySizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("key size not set");
            }
            if (this.tagSizeBytes == null) {
                throw new java.security.GeneralSecurityException("tag size not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("variant not set");
            }
            return new com.google.crypto.tink.mac.AesCmacParameters(num.intValue(), this.tagSizeBytes.intValue(), this.variant);
        }
    }

    private AesCmacParameters(int i, int i2, com.google.crypto.tink.mac.AesCmacParameters.Variant variant) {
        this.keySizeBytes = i;
        this.tagSizeBytes = i2;
        this.variant = variant;
    }

    public static com.google.crypto.tink.mac.AesCmacParameters.Builder builder() {
        return new com.google.crypto.tink.mac.AesCmacParameters.Builder();
    }

    public final int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public final int getCryptographicTagSizeBytes() {
        return this.tagSizeBytes;
    }

    public final int getTotalTagSizeBytes() {
        int cryptographicTagSizeBytes;
        if (this.variant == com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX) {
            return getCryptographicTagSizeBytes();
        }
        if (this.variant == com.google.crypto.tink.mac.AesCmacParameters.Variant.TINK) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (this.variant == com.google.crypto.tink.mac.AesCmacParameters.Variant.CRUNCHY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else if (this.variant == com.google.crypto.tink.mac.AesCmacParameters.Variant.LEGACY) {
            cryptographicTagSizeBytes = getCryptographicTagSizeBytes();
        } else {
            throw new java.lang.IllegalStateException("Unknown variant");
        }
        return cryptographicTagSizeBytes + 5;
    }

    public final com.google.crypto.tink.mac.AesCmacParameters.Variant getVariant() {
        return this.variant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.mac.AesCmacParameters)) {
            return false;
        }
        com.google.crypto.tink.mac.AesCmacParameters aesCmacParameters = (com.google.crypto.tink.mac.AesCmacParameters) obj;
        return aesCmacParameters.getKeySizeBytes() == getKeySizeBytes() && aesCmacParameters.getTotalTagSizeBytes() == getTotalTagSizeBytes() && aesCmacParameters.getVariant() == getVariant();
    }

    public final int hashCode() {
        int i = this.keySizeBytes;
        int i2 = this.tagSizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.mac.AesCmacParameters.class, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.mac.AesCmacParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AES-CMAC Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.tagSizeBytes);
        sb.append("-byte tags, and ");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
