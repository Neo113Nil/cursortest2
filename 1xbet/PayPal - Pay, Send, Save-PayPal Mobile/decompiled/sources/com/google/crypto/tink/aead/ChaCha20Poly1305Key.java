package com.google.crypto.tink.aead;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class ChaCha20Poly1305Key extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters parameters;

    private ChaCha20Poly1305Key(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters chaCha20Poly1305Parameters, com.google.crypto.tink.util.SecretBytes secretBytes, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = chaCha20Poly1305Parameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters chaCha20Poly1305Parameters, @javax.annotation.Nullable java.lang.Integer num) {
        if (chaCha20Poly1305Parameters.getVariant() == com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
        }
        if (chaCha20Poly1305Parameters.getVariant() == com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.CRUNCHY) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getLegacyOutputPrefix(num.intValue());
        }
        if (chaCha20Poly1305Parameters.getVariant() == com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.TINK) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Variant: ");
        sb.append(chaCha20Poly1305Parameters.getVariant());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    public static com.google.crypto.tink.aead.ChaCha20Poly1305Key create(com.google.crypto.tink.util.SecretBytes secretBytes) throws java.security.GeneralSecurityException {
        return create(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX, secretBytes, null);
    }

    public static com.google.crypto.tink.aead.ChaCha20Poly1305Key create(com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant variant, com.google.crypto.tink.util.SecretBytes secretBytes, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (variant != com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX && num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("For given Variant ");
            sb.append(variant);
            sb.append(" the value of idRequirement must be non-null");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (variant == com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.Variant.NO_PREFIX && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (secretBytes.size() != 32) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ");
            sb2.append(secretBytes.size());
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        com.google.crypto.tink.aead.ChaCha20Poly1305Parameters create = com.google.crypto.tink.aead.ChaCha20Poly1305Parameters.create(variant);
        return new com.google.crypto.tink.aead.ChaCha20Poly1305Key(create, secretBytes, getOutputPrefix(create, num), num);
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.aead.ChaCha20Poly1305Parameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.aead.ChaCha20Poly1305Key)) {
            return false;
        }
        com.google.crypto.tink.aead.ChaCha20Poly1305Key chaCha20Poly1305Key = (com.google.crypto.tink.aead.ChaCha20Poly1305Key) key;
        return chaCha20Poly1305Key.parameters.equals(this.parameters) && chaCha20Poly1305Key.keyBytes.equalsSecretBytes(this.keyBytes) && java.util.Objects.equals(chaCha20Poly1305Key.idRequirement, this.idRequirement);
    }
}
