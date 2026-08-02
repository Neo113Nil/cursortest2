package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class AesGcmSivParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final int keySizeBytes;
    private final com.google.crypto.tink.aead.AesGcmSivParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3873name;
        public static final com.google.crypto.tink.aead.AesGcmSivParameters.Variant TINK = new com.google.crypto.tink.aead.AesGcmSivParameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.AesGcmSivParameters.Variant CRUNCHY = new com.google.crypto.tink.aead.AesGcmSivParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.aead.AesGcmSivParameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.AesGcmSivParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3873name = str;
        }

        public final java.lang.String toString() {
            return this.f3873name;
        }
    }

    public static final class Builder {

        @javax.annotation.Nullable
        private java.lang.Integer keySizeBytes;
        private com.google.crypto.tink.aead.AesGcmSivParameters.Variant variant;

        private Builder() {
            this.keySizeBytes = null;
            this.variant = com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.aead.AesGcmSivParameters.Builder setKeySizeBytes(int i) throws java.security.GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", java.lang.Integer.valueOf(i)));
            }
            this.keySizeBytes = java.lang.Integer.valueOf(i);
            return this;
        }

        public final com.google.crypto.tink.aead.AesGcmSivParameters.Builder setVariant(com.google.crypto.tink.aead.AesGcmSivParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.aead.AesGcmSivParameters build() throws java.security.GeneralSecurityException {
            java.lang.Integer num = this.keySizeBytes;
            if (num == null) {
                throw new java.security.GeneralSecurityException("Key size is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("Variant is not set");
            }
            return new com.google.crypto.tink.aead.AesGcmSivParameters(num.intValue(), this.variant);
        }
    }

    private AesGcmSivParameters(int i, com.google.crypto.tink.aead.AesGcmSivParameters.Variant variant) {
        this.keySizeBytes = i;
        this.variant = variant;
    }

    public static com.google.crypto.tink.aead.AesGcmSivParameters.Builder builder() {
        return new com.google.crypto.tink.aead.AesGcmSivParameters.Builder();
    }

    public final int getKeySizeBytes() {
        return this.keySizeBytes;
    }

    public final com.google.crypto.tink.aead.AesGcmSivParameters.Variant getVariant() {
        return this.variant;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.aead.AesGcmSivParameters)) {
            return false;
        }
        com.google.crypto.tink.aead.AesGcmSivParameters aesGcmSivParameters = (com.google.crypto.tink.aead.AesGcmSivParameters) obj;
        return aesGcmSivParameters.getKeySizeBytes() == getKeySizeBytes() && aesGcmSivParameters.getVariant() == getVariant();
    }

    public final int hashCode() {
        int i = this.keySizeBytes;
        return java.util.Objects.hash(com.google.crypto.tink.aead.AesGcmSivParameters.class, java.lang.Integer.valueOf(i), this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.AesGcmSivParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AesGcmSiv Parameters (variant: ");
        sb.append(this.variant);
        sb.append(", ");
        sb.append(this.keySizeBytes);
        sb.append("-byte key)");
        return sb.toString();
    }
}
