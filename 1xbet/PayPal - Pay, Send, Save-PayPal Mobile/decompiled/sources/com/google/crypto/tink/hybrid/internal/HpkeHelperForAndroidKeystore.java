package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class HpkeHelperForAndroidKeystore {
    private static final byte[] EMPTY_ASSOCIATED_DATA = new byte[0];
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final byte[] publicKeyByteArray;

    private HpkeHelperForAndroidKeystore(com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, byte[] bArr) {
        this.kem = hpkeKem;
        this.kdf = hpkeKdf;
        this.aead = hpkeAead;
        this.publicKeyByteArray = bArr;
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeHelperForAndroidKeystore create(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.HpkeParameters parameters = hpkePublicKey.getParameters();
        validateParameters(parameters);
        return new com.google.crypto.tink.hybrid.internal.HpkeHelperForAndroidKeystore(com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(parameters.getKemId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(parameters.getKdfId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(parameters.getAeadId()), hpkePublicKey.getPublicKeyBytes().toByteArray());
    }

    private static void validateParameters(com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters) throws java.security.GeneralSecurityException {
        if (!hpkeParameters.getKemId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256)) {
            throw new java.security.GeneralSecurityException("HpkeHelperForAndroidKeystore currently only supports DHKEM_P256_HKDF_SHA256.");
        }
        if (!hpkeParameters.getKdfId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256)) {
            throw new java.security.GeneralSecurityException("HpkeHelperForAndroidKeystore currently only supports HKDF_SHA256.");
        }
        if (!hpkeParameters.getAeadId().equals(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM)) {
            throw new java.security.GeneralSecurityException("HpkeHelperForAndroidKeystore currently only supports AES_128_GCM.");
        }
        if (!hpkeParameters.getVariant().equals(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX)) {
            throw new java.security.GeneralSecurityException("HpkeHelperForAndroidKeystore currently only supports Variant.NO_PREFIX");
        }
    }

    public final byte[] decryptUnauthenticatedWithEncapsulatedKeyAndP256SharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException {
        if (bArr4 == null) {
            bArr4 = new byte[0];
        }
        byte[] bArr5 = bArr4;
        return com.google.crypto.tink.hybrid.internal.HpkeContext.createContext(com.google.crypto.tink.hybrid.internal.HpkeUtil.BASE_MODE, bArr, com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256).deriveKemSharedSecret(bArr2, bArr, this.publicKeyByteArray), this.kem, this.kdf, this.aead, bArr5).open(bArr3, i, EMPTY_ASSOCIATED_DATA);
    }
}
