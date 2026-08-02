package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class XAesGcmParameters extends com.google.crypto.tink.aead.AeadParameters {
    private final int saltSizeBytes;
    private final com.google.crypto.tink.aead.XAesGcmParameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3878name;
        public static final com.google.crypto.tink.aead.XAesGcmParameters.Variant TINK = new com.google.crypto.tink.aead.XAesGcmParameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.XAesGcmParameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.XAesGcmParameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3878name = str;
        }

        public final java.lang.String toString() {
            return this.f3878name;
        }
    }

    public static com.google.crypto.tink.aead.XAesGcmParameters create(com.google.crypto.tink.aead.XAesGcmParameters.Variant variant, int i) throws java.security.GeneralSecurityException {
        if (i < 8 || i > 12) {
            throw new java.security.GeneralSecurityException("Salt size must be between 8 and 12 bytes");
        }
        return new com.google.crypto.tink.aead.XAesGcmParameters(variant, i);
    }

    private XAesGcmParameters(com.google.crypto.tink.aead.XAesGcmParameters.Variant variant, int i) {
        this.variant = variant;
        this.saltSizeBytes = i;
    }

    public final com.google.crypto.tink.aead.XAesGcmParameters.Variant getVariant() {
        return this.variant;
    }

    public final int getSaltSizeBytes() {
        return this.saltSizeBytes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.aead.XAesGcmParameters)) {
            return false;
        }
        com.google.crypto.tink.aead.XAesGcmParameters xAesGcmParameters = (com.google.crypto.tink.aead.XAesGcmParameters) obj;
        return xAesGcmParameters.getVariant() == getVariant() && xAesGcmParameters.getSaltSizeBytes() == getSaltSizeBytes();
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.aead.XAesGcmParameters.class, this.variant, java.lang.Integer.valueOf(this.saltSizeBytes));
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.XAesGcmParameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("X-AES-GCM Parameters (variant: ");
        sb.append(this.variant);
        sb.append("salt_size_bytes: ");
        sb.append(this.saltSizeBytes);
        sb.append(")");
        return sb.toString();
    }
}
