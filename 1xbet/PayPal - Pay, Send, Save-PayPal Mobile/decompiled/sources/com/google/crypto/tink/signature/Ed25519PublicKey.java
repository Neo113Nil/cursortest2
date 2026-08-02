package com.google.crypto.tink.signature;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class Ed25519PublicKey extends com.google.crypto.tink.signature.SignaturePublicKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.signature.Ed25519Parameters parameters;
    private final com.google.crypto.tink.util.Bytes publicKeyBytes;

    private Ed25519PublicKey(com.google.crypto.tink.signature.Ed25519Parameters ed25519Parameters, com.google.crypto.tink.util.Bytes bytes, com.google.crypto.tink.util.Bytes bytes2, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = ed25519Parameters;
        this.publicKeyBytes = bytes;
        this.outputPrefix = bytes2;
        this.idRequirement = num;
    }

    private static com.google.crypto.tink.util.Bytes createOutputPrefix(com.google.crypto.tink.signature.Ed25519Parameters ed25519Parameters, @javax.annotation.Nullable java.lang.Integer num) {
        if (ed25519Parameters.getVariant() == com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
        }
        if (ed25519Parameters.getVariant() == com.google.crypto.tink.signature.Ed25519Parameters.Variant.CRUNCHY || ed25519Parameters.getVariant() == com.google.crypto.tink.signature.Ed25519Parameters.Variant.LEGACY) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
        }
        if (ed25519Parameters.getVariant() == com.google.crypto.tink.signature.Ed25519Parameters.Variant.TINK) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Variant: ");
        sb.append(ed25519Parameters.getVariant());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    public static com.google.crypto.tink.signature.Ed25519PublicKey create(com.google.crypto.tink.util.Bytes bytes) throws java.security.GeneralSecurityException {
        return create(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX, bytes, null);
    }

    public static com.google.crypto.tink.signature.Ed25519PublicKey create(com.google.crypto.tink.signature.Ed25519Parameters.Variant variant, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.signature.Ed25519Parameters create = com.google.crypto.tink.signature.Ed25519Parameters.create(variant);
        if (!variant.equals(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX) && num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("For given Variant ");
            sb.append(variant);
            sb.append(" the value of idRequirement must be non-null");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (variant.equals(com.google.crypto.tink.signature.Ed25519Parameters.Variant.NO_PREFIX) && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (bytes.size() != 32) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Ed25519 key must be constructed with key of length 32 bytes, not ");
            sb2.append(bytes.size());
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return new com.google.crypto.tink.signature.Ed25519PublicKey(create, bytes, createOutputPrefix(create, num), num);
    }

    public final com.google.crypto.tink.util.Bytes getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    @Override // com.google.crypto.tink.signature.SignaturePublicKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.signature.Ed25519Parameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.signature.Ed25519PublicKey)) {
            return false;
        }
        com.google.crypto.tink.signature.Ed25519PublicKey ed25519PublicKey = (com.google.crypto.tink.signature.Ed25519PublicKey) key;
        return ed25519PublicKey.parameters.equals(this.parameters) && ed25519PublicKey.publicKeyBytes.equals(this.publicKeyBytes) && java.util.Objects.equals(ed25519PublicKey.idRequirement, this.idRequirement);
    }
}
