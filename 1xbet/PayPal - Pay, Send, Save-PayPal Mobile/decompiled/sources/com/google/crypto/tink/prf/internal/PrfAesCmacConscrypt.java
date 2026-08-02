package com.google.crypto.tink.prf.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class PrfAesCmacConscrypt implements com.google.crypto.tink.prf.Prf {
    private static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private final java.security.Provider conscrypt;
    private final java.security.Key key;

    public static com.google.crypto.tink.prf.Prf create(com.google.crypto.tink.prf.AesCmacPrfKey aesCmacPrfKey) throws java.security.GeneralSecurityException {
        java.security.Provider providerOrNull = com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        if (providerOrNull == null) {
            throw new java.security.GeneralSecurityException("Conscrypt not available");
        }
        javax.crypto.Mac.getInstance("AESCMAC", providerOrNull);
        return new com.google.crypto.tink.prf.internal.PrfAesCmacConscrypt(aesCmacPrfKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), providerOrNull);
    }

    private PrfAesCmacConscrypt(byte[] bArr, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode, as BoringCrypto module is not available");
        }
        this.key = new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM);
        this.conscrypt = provider;
    }

    @Override // com.google.crypto.tink.prf.Prf
    public final byte[] compute(byte[] bArr, int i) throws java.security.GeneralSecurityException {
        if (i > 16) {
            throw new java.security.InvalidAlgorithmParameterException("outputLength must not be larger than 16");
        }
        javax.crypto.Mac mac = javax.crypto.Mac.getInstance("AESCMAC", this.conscrypt);
        mac.init(this.key);
        byte[] doFinal = mac.doFinal(bArr);
        return i == doFinal.length ? doFinal : java.util.Arrays.copyOf(doFinal, i);
    }
}
