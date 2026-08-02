package com.google.crypto.tink.keyderivation;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class PrfBasedKeyDerivationParameters extends com.google.crypto.tink.keyderivation.KeyDerivationParameters {
    private final com.google.crypto.tink.Parameters derivedKeyParameters;
    private final com.google.crypto.tink.prf.PrfParameters prfParameters;

    public static class Builder {

        @javax.annotation.Nullable
        private com.google.crypto.tink.prf.PrfParameters prfParameters = null;

        @javax.annotation.Nullable
        private com.google.crypto.tink.Parameters derivedKeyParameters = null;

        public com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.Builder setPrfParameters(com.google.crypto.tink.prf.PrfParameters prfParameters) {
            this.prfParameters = prfParameters;
            return this;
        }

        public com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.Builder setDerivedKeyParameters(com.google.crypto.tink.Parameters parameters) {
            this.derivedKeyParameters = parameters;
            return this;
        }

        public com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters build() throws java.security.GeneralSecurityException {
            if (this.prfParameters == null) {
                throw new java.security.GeneralSecurityException("PrfParameters must be set.");
            }
            if (this.derivedKeyParameters == null) {
                throw new java.security.GeneralSecurityException("DerivedKeyParameters must be set.");
            }
            return new com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters(this.prfParameters, this.derivedKeyParameters);
        }
    }

    private PrfBasedKeyDerivationParameters(com.google.crypto.tink.prf.PrfParameters prfParameters, com.google.crypto.tink.Parameters parameters) {
        this.prfParameters = prfParameters;
        this.derivedKeyParameters = parameters;
    }

    public static com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.Builder builder() {
        return new com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.Builder();
    }

    public final com.google.crypto.tink.prf.PrfParameters getPrfParameters() {
        return this.prfParameters;
    }

    @Override // com.google.crypto.tink.keyderivation.KeyDerivationParameters
    public final com.google.crypto.tink.Parameters getDerivedKeyParameters() {
        return this.derivedKeyParameters;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters)) {
            return false;
        }
        com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters prfBasedKeyDerivationParameters = (com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters) obj;
        return prfBasedKeyDerivationParameters.getPrfParameters().equals(getPrfParameters()) && prfBasedKeyDerivationParameters.getDerivedKeyParameters().equals(getDerivedKeyParameters());
    }

    public final int hashCode() {
        return java.util.Objects.hash(com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationParameters.class, this.prfParameters, this.derivedKeyParameters);
    }

    public final java.lang.String toString() {
        return java.lang.String.format("PrfBasedKeyDerivationParameters(%s, %s)", this.prfParameters, this.derivedKeyParameters);
    }
}
