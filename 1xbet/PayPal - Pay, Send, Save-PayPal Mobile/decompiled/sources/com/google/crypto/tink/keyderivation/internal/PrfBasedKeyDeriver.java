package com.google.crypto.tink.keyderivation.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class PrfBasedKeyDeriver implements com.google.crypto.tink.keyderivation.internal.KeyDeriver {
    final com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey key;
    final com.google.crypto.tink.subtle.prf.StreamingPrf prf;

    private PrfBasedKeyDeriver(com.google.crypto.tink.subtle.prf.StreamingPrf streamingPrf, com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey prfBasedKeyDerivationKey) {
        this.prf = streamingPrf;
        this.key = prfBasedKeyDerivationKey;
    }

    public static com.google.crypto.tink.keyderivation.internal.KeyDeriver create(com.google.crypto.tink.keyderivation.PrfBasedKeyDerivationKey prfBasedKeyDerivationKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDeriver prfBasedKeyDeriver = new com.google.crypto.tink.keyderivation.internal.PrfBasedKeyDeriver((com.google.crypto.tink.subtle.prf.StreamingPrf) com.google.crypto.tink.internal.MutablePrimitiveRegistry.globalInstance().getPrimitive(prfBasedKeyDerivationKey.getPrfKey(), com.google.crypto.tink.subtle.prf.StreamingPrf.class), prfBasedKeyDerivationKey);
        prfBasedKeyDeriver.deriveKey(new byte[]{1});
        return prfBasedKeyDeriver;
    }

    @Override // com.google.crypto.tink.keyderivation.internal.KeyDeriver
    public final com.google.crypto.tink.Key deriveKey(byte[] bArr) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.MutableKeyDerivationRegistry.globalInstance().createKeyFromRandomness(this.key.getParameters().getDerivedKeyParameters(), this.prf.computePrf(bArr), this.key.getIdRequirementOrNull(), com.google.crypto.tink.InsecureSecretKeyAccess.get());
    }
}
