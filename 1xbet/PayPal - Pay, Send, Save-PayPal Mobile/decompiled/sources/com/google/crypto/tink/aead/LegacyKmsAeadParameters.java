package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class LegacyKmsAeadParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final java.lang.String keyUri;
    private final com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3875name;
        public static final com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant TINK = new com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3875name = str;
        }

        public final java.lang.String toString() {
            return this.f3875name;
        }
    }

    private LegacyKmsAeadParameters(java.lang.String str, com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant variant) {
        this.keyUri = str;
        this.variant = variant;
    }

    public static com.google.crypto.tink.aead.LegacyKmsAeadParameters create(java.lang.String str) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.aead.LegacyKmsAeadParameters(str, com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant.NO_PREFIX);
    }

    public static com.google.crypto.tink.aead.LegacyKmsAeadParameters create(java.lang.String str, com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant variant) {
        return new com.google.crypto.tink.aead.LegacyKmsAeadParameters(str, variant);
    }

    public final java.lang.String keyUri() {
        return this.keyUri;
    }

    public final com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant variant() {
        return this.variant;
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant.NO_PREFIX;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.aead.LegacyKmsAeadParameters)) {
            return false;
        }
        com.google.crypto.tink.aead.LegacyKmsAeadParameters legacyKmsAeadParameters = (com.google.crypto.tink.aead.LegacyKmsAeadParameters) obj;
        return legacyKmsAeadParameters.keyUri.equals(this.keyUri) && legacyKmsAeadParameters.variant.equals(this.variant);
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.aead.LegacyKmsAeadParameters.class, this.keyUri, this.variant);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LegacyKmsAead Parameters (keyUri: ");
        sb.append(this.keyUri);
        sb.append(", variant: ");
        sb.append(this.variant);
        sb.append(")");
        return sb.toString();
    }
}
