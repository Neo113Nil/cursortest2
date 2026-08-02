package com.google.crypto.tink.aead;

/* loaded from: classes4.dex */
public final class LegacyKmsEnvelopeAeadKey extends com.google.crypto.tink.aead.AeadKey {

    @javax.annotation.Nullable
    private final java.lang.Integer idRequirement;
    private final com.google.crypto.tink.util.Bytes outputPrefix;
    private final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters parameters;

    private LegacyKmsEnvelopeAeadKey(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters, com.google.crypto.tink.util.Bytes bytes, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = legacyKmsEnvelopeAeadParameters;
        this.outputPrefix = bytes;
        this.idRequirement = num;
    }

    public static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey create(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.util.Bytes tinkOutputPrefix;
        if (legacyKmsEnvelopeAeadParameters.getVariant() == com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.NO_PREFIX) {
            if (num != null) {
                throw new java.security.GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            tinkOutputPrefix = com.google.crypto.tink.internal.OutputPrefixUtil.EMPTY_PREFIX;
        } else {
            if (legacyKmsEnvelopeAeadParameters.getVariant() != com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters.Variant.TINK) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown Variant: ");
                sb.append(legacyKmsEnvelopeAeadParameters.getVariant());
                throw new java.security.GeneralSecurityException(sb.toString());
            }
            if (num == null) {
                throw new java.security.GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            tinkOutputPrefix = com.google.crypto.tink.internal.OutputPrefixUtil.getTinkOutputPrefix(num.intValue());
        }
        return new com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey(legacyKmsEnvelopeAeadParameters, tinkOutputPrefix, num);
    }

    public static com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey create(com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters legacyKmsEnvelopeAeadParameters) throws java.security.GeneralSecurityException {
        return create(legacyKmsEnvelopeAeadParameters, null);
    }

    @Override // com.google.crypto.tink.aead.AeadKey
    public final com.google.crypto.tink.util.Bytes getOutputPrefix() {
        return this.outputPrefix;
    }

    @Override // com.google.crypto.tink.aead.AeadKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirement;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey)) {
            return false;
        }
        com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey legacyKmsEnvelopeAeadKey = (com.google.crypto.tink.aead.LegacyKmsEnvelopeAeadKey) key;
        return legacyKmsEnvelopeAeadKey.parameters.equals(this.parameters) && java.util.Objects.equals(legacyKmsEnvelopeAeadKey.idRequirement, this.idRequirement);
    }
}
