package com.google.crypto.tink.keyderivation;

/* loaded from: classes9.dex */
public final class PrfBasedKeyDerivationKey extends com.google.crypto.tink.keyderivation.KeyDerivationKey {
    private final java.lang.Integer idRequirementOrNull;
    private final com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters parameters;
    private final com.google.crypto.tink.prf.PrfKey prfKey;

    public static com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey create(com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters prfBasedKeyDerivationParameters, com.google.crypto.tink.prf.PrfKey prfKey, @javax.annotation.Nullable java.lang.Integer num) throws java.security.GeneralSecurityException {
        if (!prfBasedKeyDerivationParameters.getPrfParameters().equals(prfKey.getParameters())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("PrfParameters of passed in PrfBasedKeyDerivationParameters and passed in prfKey parameters object must match. DerivationParameters gave: ");
            sb.append(prfBasedKeyDerivationParameters.getPrfParameters());
            sb.append(", key gives: ");
            sb.append(prfKey.getParameters());
            throw new java.security.GeneralSecurityException(sb.toString());
        }
        if (prfBasedKeyDerivationParameters.getDerivedKeyParameters().hasIdRequirement() && num == null) {
            throw new java.security.GeneralSecurityException("Derived key has an ID requirement, but no idRequirement was passed in on creation of this key");
        }
        if (!prfBasedKeyDerivationParameters.getDerivedKeyParameters().hasIdRequirement() && num != null) {
            throw new java.security.GeneralSecurityException("Derived key has no ID requirement, but idRequirement was passed in on creation of this key");
        }
        return new com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey(prfBasedKeyDerivationParameters, prfKey, num);
    }

    private PrfBasedKeyDerivationKey(com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters prfBasedKeyDerivationParameters, com.google.crypto.tink.prf.PrfKey prfKey, @javax.annotation.Nullable java.lang.Integer num) {
        this.parameters = prfBasedKeyDerivationParameters;
        this.prfKey = prfKey;
        this.idRequirementOrNull = num;
    }

    public final com.google.crypto.tink.prf.PrfKey getPrfKey() {
        return this.prfKey;
    }

    @Override // com.google.crypto.tink.keyderivation.KeyDerivationKey, com.google.crypto.tink.Key
    public final com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters getParameters() {
        return this.parameters;
    }

    @Override // com.google.crypto.tink.Key
    @javax.annotation.Nullable
    public final java.lang.Integer getIdRequirementOrNull() {
        return this.idRequirementOrNull;
    }

    @Override // com.google.crypto.tink.Key
    public final boolean equalsKey(com.google.crypto.tink.Key key) {
        if (!(key instanceof com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey)) {
            return false;
        }
        com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey prfBasedKeyDerivationKey = (com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey) key;
        return prfBasedKeyDerivationKey.getParameters().equals(getParameters()) && prfBasedKeyDerivationKey.prfKey.equalsKey(this.prfKey) && java.util.Objects.equals(prfBasedKeyDerivationKey.idRequirementOrNull, this.idRequirementOrNull);
    }
}
