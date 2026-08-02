package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class XChaCha20Poly1305Parameters extends com.google.crypto.tink.aead.AeadParameters {
    private final com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3879name;
        public static final com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant TINK = new com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant("TINK");
        public static final com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant CRUNCHY = new com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant NO_PREFIX = new com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3879name = str;
        }

        public final java.lang.String toString() {
            return this.f3879name;
        }
    }

    public static com.google.crypto.tink.aead.XChaCha20Poly1305Parameters create() {
        return new com.google.crypto.tink.aead.XChaCha20Poly1305Parameters(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX);
    }

    public static com.google.crypto.tink.aead.XChaCha20Poly1305Parameters create(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant variant) {
        return new com.google.crypto.tink.aead.XChaCha20Poly1305Parameters(variant);
    }

    private XChaCha20Poly1305Parameters(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant variant) {
        this.variant = variant;
    }

    public final com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant getVariant() {
        return this.variant;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) && ((com.google.crypto.tink.aead.XChaCha20Poly1305Parameters) obj).getVariant() == getVariant();
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.class, this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.aead.XChaCha20Poly1305Parameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("XChaCha20Poly1305 Parameters (variant: ");
        sb.append(this.variant);
        sb.append(")");
        return sb.toString();
    }
}
