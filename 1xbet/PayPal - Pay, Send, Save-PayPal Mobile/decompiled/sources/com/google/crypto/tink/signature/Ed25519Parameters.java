package com.google.crypto.tink.signature;

/* loaded from: classes9.dex */
public final class Ed25519Parameters extends com.google.crypto.tink.signature.SignatureParameters {
    private final com.google.crypto.tink.signature.Ed25519Parameters.Variant variant;

    @com.google.errorprone.annotations.Immutable
    public static final class Variant {

        /* renamed from: name, reason: collision with root package name */
        private final java.lang.String f3904name;
        public static final com.google.crypto.tink.signature.Ed25519Parameters.Variant TINK = new com.google.crypto.tink.signature.Ed25519Parameters.Variant("TINK");
        public static final com.google.crypto.tink.signature.Ed25519Parameters.Variant CRUNCHY = new com.google.crypto.tink.signature.Ed25519Parameters.Variant("CRUNCHY");
        public static final com.google.crypto.tink.signature.Ed25519Parameters.Variant LEGACY = new com.google.crypto.tink.signature.Ed25519Parameters.Variant("LEGACY");
        public static final com.google.crypto.tink.signature.Ed25519Parameters.Variant NO_PREFIX = new com.google.crypto.tink.signature.Ed25519Parameters.Variant("NO_PREFIX");

        private Variant(java.lang.String str) {
            this.f3904name = str;
        }

        public final java.lang.String toString() {
            return this.f3904name;
        }
    }

    public static com.google.crypto.tink.signature.Ed25519Parameters create() {
        return new com.google.crypto.tink.signature.Ed25519Parameters(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX);
    }

    public static com.google.crypto.tink.signature.Ed25519Parameters create(com.google.crypto.tink.signature.Ed25519Parameters.Variant variant) {
        return new com.google.crypto.tink.signature.Ed25519Parameters(variant);
    }

    private Ed25519Parameters(com.google.crypto.tink.signature.Ed25519Parameters.Variant variant) {
        this.variant = variant;
    }

    public final com.google.crypto.tink.signature.Ed25519Parameters.Variant getVariant() {
        return this.variant;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.crypto.tink.signature.Ed25519Parameters) && ((com.google.crypto.tink.signature.Ed25519Parameters) obj).getVariant() == getVariant();
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.signature.Ed25519Parameters.class, this.variant);
    }

    @Override // com.google.crypto.tink.Parameters
    public final boolean hasIdRequirement() {
        return this.variant != com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Ed25519 Parameters (variant: ");
        sb.append(this.variant);
        sb.append(")");
        return sb.toString();
    }
}
