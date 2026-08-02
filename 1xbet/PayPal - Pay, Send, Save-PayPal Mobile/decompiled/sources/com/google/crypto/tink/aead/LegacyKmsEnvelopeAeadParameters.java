package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class LegacyKmsEnvelopeAeadParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final com.google.crypto.tink.aead.AeadParameters dekParametersForNewKeys;
    private final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy dekParsingStrategy;
    private final java.lang.String kekUri;
    private final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3877name;
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant TINK = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3877name = str;
        }

        public final java.lang.String toString() {
            return this.f3877name;
        }
    }

    @com.google.errorprone.annotations.Immutable
    public static final class DekParsingStrategy {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3876name;
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy ASSUME_AES_GCM = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy("ASSUME_AES_GCM");
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy ASSUME_XCHACHA20POLY1305 = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy("ASSUME_XCHACHA20POLY1305");
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy ASSUME_CHACHA20POLY1305 = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy("ASSUME_CHACHA20POLY1305");
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy ASSUME_AES_CTR_HMAC = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy("ASSUME_AES_CTR_HMAC");
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy ASSUME_AES_EAX = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy("ASSUME_AES_EAX");
        public static final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy ASSUME_AES_GCM_SIV = new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy("ASSUME_AES_GCM_SIV");

        private DekParsingStrategy(java.lang.String str) {
            this.f3876name = str;
        }

        public final java.lang.String toString() {
            return this.f3876name;
        }
    }

    private LegacyKmsEnvelopeAeadParameters(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant variant, java.lang.String str, com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy dekParsingStrategy, com.google.crypto.tink.aead.AeadParameters aeadParameters) {
        this.variant = variant;
        this.kekUri = str;
        this.dekParsingStrategy = dekParsingStrategy;
        this.dekParametersForNewKeys = aeadParameters;
    }

    public static class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.aead.AeadParameters dekParametersForNewKeys;

        @javax.annotation.Nullable
        private com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy dekParsingStrategy;

        @javax.annotation.Nullable
        private java.lang.String kekUri;

        @javax.annotation.Nullable
        private com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant variant;

        private Builder() {
        }

        public com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Builder setVariant(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant variant) {
            this.variant = variant;
            return this;
        }

        public com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Builder setKekUri(java.lang.String str) {
            this.kekUri = str;
            return this;
        }

        public com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Builder setDekParsingStrategy(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy dekParsingStrategy) {
            this.dekParsingStrategy = dekParsingStrategy;
            return this;
        }

        public com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Builder setDekParametersForNewKeys(com.google.crypto.tink.aead.AeadParameters aeadParameters) {
            this.dekParametersForNewKeys = aeadParameters;
            return this;
        }

        private static boolean parsingStrategyAllowed(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy dekParsingStrategy, com.google.crypto.tink.aead.AeadParameters aeadParameters) {
            if (dekParsingStrategy.equals(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_GCM) && (aeadParameters instanceof com.google.crypto.tink.aead.AesGcmParameters)) {
                return true;
            }
            if (dekParsingStrategy.equals(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_CHACHA20POLY1305) && (aeadParameters instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Parameters)) {
                return true;
            }
            if (dekParsingStrategy.equals(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_XCHACHA20POLY1305) && (aeadParameters instanceof com.google.crypto.tink.aead.XChaCha20Poly1305Parameters)) {
                return true;
            }
            if (dekParsingStrategy.equals(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_CTR_HMAC) && (aeadParameters instanceof com.google.crypto.tink.aead.AesCtrHmacAeadParameters)) {
                return true;
            }
            if (dekParsingStrategy.equals(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_EAX) && (aeadParameters instanceof com.google.crypto.tink.aead.AesEaxParameters)) {
                return true;
            }
            return dekParsingStrategy.equals(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy.ASSUME_AES_GCM_SIV) && (aeadParameters instanceof com.google.crypto.tink.aead.AesGcmSivParameters);
        }

        public com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters build() throws java.security.GeneralSecurityException {
            if (this.variant == null) {
                this.variant = com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.NO_PREFIX;
            }
            if (this.kekUri == null) {
                throw new java.security.GeneralSecurityException("kekUri must be set");
            }
            if (this.dekParsingStrategy == null) {
                throw new java.security.GeneralSecurityException("dekParsingStrategy must be set");
            }
            com.google.crypto.tink.aead.AeadParameters aeadParameters = this.dekParametersForNewKeys;
            if (aeadParameters == null) {
                throw new java.security.GeneralSecurityException("dekParametersForNewKeys must be set");
            }
            if (aeadParameters.hasIdRequirement()) {
                throw new java.security.GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
            }
            if (!parsingStrategyAllowed(this.dekParsingStrategy, this.dekParametersForNewKeys)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot use parsing strategy ");
                sb.append(this.dekParsingStrategy.toString());
                sb.append(" when new keys are picked according to ");
                sb.append(this.dekParametersForNewKeys);
                sb.append(".");
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            return new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters(this.variant, this.kekUri, this.dekParsingStrategy, this.dekParametersForNewKeys);
        }
    }

    public static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Builder builder() {
        return new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Builder();
    }

    public final java.lang.String getKekUri() {
        return this.kekUri;
    }

    public final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant getVariant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.NO_PREFIX;
    }

    public final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.DekParsingStrategy getDekParsingStrategy() {
        return this.dekParsingStrategy;
    }

    public final com.google.crypto.tink.aead.AeadParameters getDekParametersForNewKeys() {
        return this.dekParametersForNewKeys;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters)) {
            return false;
        }
        com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters = (com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters) obj;
        return legacyKmsEnvelopeAeadParameters.dekParsingStrategy.equals(this.dekParsingStrategy) && legacyKmsEnvelopeAeadParameters.dekParametersForNewKeys.equals(this.dekParametersForNewKeys) && legacyKmsEnvelopeAeadParameters.kekUri.equals(this.kekUri) && legacyKmsEnvelopeAeadParameters.variant.equals(this.variant);
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.class, this.kekUri, this.dekParsingStrategy, this.dekParametersForNewKeys, this.variant);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        sb.append(this.kekUri);
        sb.append(", dekParsingStrategy: ");
        sb.append(this.dekParsingStrategy);
        sb.append(", dekParametersForNewKeys: ");
        sb.append(this.dekParametersForNewKeys);
        sb.append(", variant: ");
        sb.append(this.variant);
        sb.append(")");
        return sb.toString();
    }
}
