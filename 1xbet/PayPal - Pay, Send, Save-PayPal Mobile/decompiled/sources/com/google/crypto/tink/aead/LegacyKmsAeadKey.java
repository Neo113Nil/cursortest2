package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class LegacyKmsAeadKey extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.LegacyKmsAeadParameters parameters;

    private LegacyKmsAeadKey(com.google.crypto.tink.aead.LegacyKmsAeadParameters legacyKmsAeadParameters, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = legacyKmsAeadParameters;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.aead.LegacyKmsAeadKey create(com.google.crypto.tink.aead.LegacyKmsAeadParameters legacyKmsAeadParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.util.Bytes copyFrom;
        if (legacyKmsAeadParameters.variant() == com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant.TINK) {
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            copyFrom = com.google.crypto.tink.util.Bytes.copyFrom(java.nio.ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (legacyKmsAeadParameters.variant() != com.google.crypto.tink.aead.LegacyKmsAeadParameters.Variant.NO_PREFIX) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Variant: ");
                sb.append(legacyKmsAeadParameters.variant());
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            copyFrom = com.google.crypto.tink.util.Bytes.copyFrom(new byte[0]);
        }
        return new com.google.crypto.tink.aead.LegacyKmsAeadKey(legacyKmsAeadParameters, copyFrom, num);
    }

    public static com.google.crypto.tink.aead.LegacyKmsAeadKey create(com.google.crypto.tink.aead.LegacyKmsAeadParameters legacyKmsAeadParameters) throws java.security.GeneralSecurityException {
        return create(legacyKmsAeadParameters, null);
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.aead.LegacyKmsAeadParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.aead.LegacyKmsAeadKey)) {
            return false;
        }
        com.google.crypto.tink.aead.LegacyKmsAeadKey legacyKmsAeadKey = (com.google.crypto.tink.aead.LegacyKmsAeadKey) key;
        return legacyKmsAeadKey.parameters.equals(this.parameters) && java.util.Objects.equals(legacyKmsAeadKey.idRequirement, this.idRequirement);
    }
}
