package com.google.crypto.tink.hybrid;

/* loaded from: classes9.dex */
public final class HpkeParameters extends com.google.crypto.tink.hybrid.HybridParameters {
    private final com.google.crypto.tink.hybrid.HpkeParameters.AeadId aead;
    private final com.google.crypto.tink.hybrid.HpkeParameters.KdfId kdf;
    private final com.google.crypto.tink.hybrid.HpkeParameters.KemId kem;
    private final com.google.crypto.tink.hybrid.HpkeParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3886name;
        public static final com.google.crypto.tink.hybrid.HpkeParameters.Variant TINK = new com.google.crypto.tink.hybrid.HpkeParameters.Variant("TINK");
        public static final com.google.crypto.tink.hybrid.HpkeParameters.Variant CRUNCHY = new com.google.crypto.tink.hybrid.HpkeParameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.hybrid.HpkeParameters.Variant NO_PREFIX = new com.google.crypto.tink.hybrid.HpkeParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3886name = str;
        }

        public final java.lang.String toString() {
            return this.f3886name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    static class AlgorithmIdentifier {

        /* renamed from: name, reason: collision with root package name */
        protected final java.lang.String f3885name;
        protected final int value;

        private AlgorithmIdentifier(java.lang.String str, int i) {
            this.f3885name = str;
            this.value = i;
        }

        public int getValue() {
            return this.value;
        }

        public java.lang.String toString() {
            return java.lang.String.format("%s(0x%04x)", this.f3885name, java.lang.Integer.valueOf(this.value));
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class KemId extends com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier {
        public static final com.google.crypto.tink.hybrid.HpkeParameters.KemId DHKEM_P256_HKDF_SHA256 = new com.google.crypto.tink.hybrid.HpkeParameters.KemId("DHKEM_P256_HKDF_SHA256", 16);
        public static final com.google.crypto.tink.hybrid.HpkeParameters.KemId DHKEM_P384_HKDF_SHA384 = new com.google.crypto.tink.hybrid.HpkeParameters.KemId("DHKEM_P384_HKDF_SHA384", 17);
        public static final com.google.crypto.tink.hybrid.HpkeParameters.KemId DHKEM_P521_HKDF_SHA512 = new com.google.crypto.tink.hybrid.HpkeParameters.KemId("DHKEM_P521_HKDF_SHA512", 18);
        public static final com.google.crypto.tink.hybrid.HpkeParameters.KemId DHKEM_X25519_HKDF_SHA256 = new com.google.crypto.tink.hybrid.HpkeParameters.KemId("DHKEM_X25519_HKDF_SHA256", 32);

        @Override // com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier
        public final /* bridge */ /* synthetic */ int getValue() {
            return super.getValue();
        }

        @Override // com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier
        public final /* bridge */ /* synthetic */ java.lang.String toString() {
            return super.toString();
        }

        private KemId(java.lang.String str, int i) {
            super(str, i);
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class KdfId extends com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier {
        public static final com.google.crypto.tink.hybrid.HpkeParameters.KdfId HKDF_SHA256 = new com.google.crypto.tink.hybrid.HpkeParameters.KdfId("HKDF_SHA256", 1);
        public static final com.google.crypto.tink.hybrid.HpkeParameters.KdfId HKDF_SHA384 = new com.google.crypto.tink.hybrid.HpkeParameters.KdfId("HKDF_SHA384", 2);
        public static final com.google.crypto.tink.hybrid.HpkeParameters.KdfId HKDF_SHA512 = new com.google.crypto.tink.hybrid.HpkeParameters.KdfId("HKDF_SHA512", 3);

        @Override // com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier
        public final /* bridge */ /* synthetic */ int getValue() {
            return super.getValue();
        }

        @Override // com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier
        public final /* bridge */ /* synthetic */ java.lang.String toString() {
            return super.toString();
        }

        private KdfId(java.lang.String str, int i) {
            super(str, i);
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class AeadId extends com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier {
        public static final com.google.crypto.tink.hybrid.HpkeParameters.AeadId AES_128_GCM = new com.google.crypto.tink.hybrid.HpkeParameters.AeadId("AES_128_GCM", 1);
        public static final com.google.crypto.tink.hybrid.HpkeParameters.AeadId AES_256_GCM = new com.google.crypto.tink.hybrid.HpkeParameters.AeadId("AES_256_GCM", 2);
        public static final com.google.crypto.tink.hybrid.HpkeParameters.AeadId CHACHA20_POLY1305 = new com.google.crypto.tink.hybrid.HpkeParameters.AeadId("CHACHA20_POLY1305", 3);

        @Override // com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier
        public final /* bridge */ /* synthetic */ int getValue() {
            return super.getValue();
        }

        @Override // com.google.crypto.tink.hybrid.HpkeParameters.AlgorithmIdentifier
        public final /* bridge */ /* synthetic */ java.lang.String toString() {
            return super.toString();
        }

        private AeadId(java.lang.String str, int i) {
            super(str, i);
        }
    }

    public static final class Builder {
        private com.google.crypto.tink.hybrid.HpkeParameters.AeadId aead;
        private com.google.crypto.tink.hybrid.HpkeParameters.KdfId kdf;
        private com.google.crypto.tink.hybrid.HpkeParameters.KemId kem;
        private com.google.crypto.tink.hybrid.HpkeParameters.Variant variant;

        private Builder() {
            this.kem = null;
            this.kdf = null;
            this.aead = null;
            this.variant = com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX;
        }

        public final com.google.crypto.tink.hybrid.HpkeParameters.Builder setKemId(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) {
            this.kem = kemId;
            return this;
        }

        public final com.google.crypto.tink.hybrid.HpkeParameters.Builder setKdfId(com.google.crypto.tink.hybrid.HpkeParameters.KdfId kdfId) {
            this.kdf = kdfId;
            return this;
        }

        public final com.google.crypto.tink.hybrid.HpkeParameters.Builder setAeadId(com.google.crypto.tink.hybrid.HpkeParameters.AeadId aeadId) {
            this.aead = aeadId;
            return this;
        }

        public final com.google.crypto.tink.hybrid.HpkeParameters.Builder setVariant(com.google.crypto.tink.hybrid.HpkeParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public final com.google.crypto.tink.hybrid.HpkeParameters build() throws java.security.GeneralSecurityException {
            if (this.kem == null) {
                throw new java.security.GeneralSecurityException("HPKE KEM parameter is not set");
            }
            if (this.kdf == null) {
                throw new java.security.GeneralSecurityException("HPKE KDF parameter is not set");
            }
            if (this.aead == null) {
                throw new java.security.GeneralSecurityException("HPKE AEAD parameter is not set");
            }
            if (this.variant == null) {
                throw new java.security.GeneralSecurityException("HPKE variant is not set");
            }
            return new com.google.crypto.tink.hybrid.HpkeParameters(this.kem, this.kdf, this.aead, this.variant);
        }
    }

    private HpkeParameters(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId, com.google.crypto.tink.hybrid.HpkeParameters.KdfId kdfId, com.google.crypto.tink.hybrid.HpkeParameters.AeadId aeadId, com.google.crypto.tink.hybrid.HpkeParameters.Variant variant) {
        this.kem = kemId;
        this.kdf = kdfId;
        this.aead = aeadId;
        this.variant = variant;
    }

    public static com.google.crypto.tink.hybrid.HpkeParameters.Builder builder() {
        return new com.google.crypto.tink.hybrid.HpkeParameters.Builder();
    }

    public final com.google.crypto.tink.hybrid.HpkeParameters.KemId getKemId() {
        return this.kem;
    }

    public final com.google.crypto.tink.hybrid.HpkeParameters.KdfId getKdfId() {
        return this.kdf;
    }

    public final com.google.crypto.tink.hybrid.HpkeParameters.AeadId getAeadId() {
        return this.aead;
    }

    public final com.google.crypto.tink.hybrid.HpkeParameters.Variant getVariant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.hybrid.HpkeParameters)) {
            return false;
        }
        com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters = (com.google.crypto.tink.hybrid.HpkeParameters) obj;
        return this.kem == hpkeParameters.kem && this.kdf == hpkeParameters.kdf && this.aead == hpkeParameters.aead && this.variant == hpkeParameters.variant;
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.hybrid.HpkeParameters.class, this.kem, this.kdf, this.aead, this.variant);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HPKE Parameters (Variant: ");
        sb.append(this.variant);
        sb.append(", KemId: ");
        sb.append(this.kem);
        sb.append(", KdfId: ");
        sb.append(this.kdf);
        sb.append(", AeadId: ");
        sb.append(this.aead);
        sb.append(")");
        return sb.toString();
    }
}
