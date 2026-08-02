package com.google.crypto.tink.aead;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class XAesGcmKey extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.SecretBytes keyBytes;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.XAesGcmParameters parameters;

    private XAesGcmKey(com.google.crypto.tink.aead.XAesGcmParameters xAesGcmParameters, com.google.crypto.tink.util.SecretBytes secretBytes, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = xAesGcmParameters;
        this.keyBytes = secretBytes;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    private static com.google.crypto.tink.util.Bytes getOutputPrefix(com.google.crypto.tink.aead.XAesGcmParameters xAesGcmParameters, @javax.annotation.Nullable java.lang.Integer num) {
        if (xAesGcmParameters.getVariant() == com.google.crypto.tink.aead.XAesGcmParameters.Variant.NO_PREFIX) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
        }
        if (xAesGcmParameters.getVariant() == com.google.crypto.tink.aead.XAesGcmParameters.Variant.TINK) {
            return com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Variant: ");
        sb.append(xAesGcmParameters.getVariant());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    public static com.google.crypto.tink.aead.XAesGcmKey create(com.google.crypto.tink.aead.XAesGcmParameters xAesGcmParameters, com.google.crypto.tink.util.SecretBytes secretBytes, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (xAesGcmParameters.getVariant() != com.google.crypto.tink.aead.XAesGcmParameters.Variant.NO_PREFIX && num == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("For given Variant ");
            sb.append(xAesGcmParameters.getVariant());
            sb.append(" the value of idRequirement must be non-null");
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (xAesGcmParameters.getVariant() == com.google.crypto.tink.aead.XAesGcmParameters.Variant.NO_PREFIX && num != null) {
            throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (secretBytes.size() != 32) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("XAesGcmKey key must be constructed with key of length 32 bytes, not ");
            sb2.append(secretBytes.size());
            throw new java.security.GeneralSecurityException(sb2.toString());
        }
        return new com.google.crypto.tink.aead.XAesGcmKey(xAesGcmParameters, secretBytes, getOutputPrefix(xAesGcmParameters, num), num);
    }

    public final com.google.crypto.tink.util.SecretBytes getKeyBytes() {
        return this.keyBytes;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.aead.XAesGcmParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.aead.XAesGcmKey)) {
            return false;
        }
        com.google.crypto.tink.aead.XAesGcmKey xAesGcmKey = (com.google.crypto.tink.aead.XAesGcmKey) key;
        return xAesGcmKey.parameters.equals(this.parameters) && xAesGcmKey.keyBytes.equalsSecretBytes(this.keyBytes) && java.util.Objects.equals(xAesGcmKey.idRequirement, this.idRequirement);
    }
}
