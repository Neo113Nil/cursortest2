package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class AuthHpkeHelperForAndroidKeystore {
    private static final byte[] EMPTY_ASSOCIATED_DATA = new byte[0];
    private final com.google.crypto.tink.hybrid.internal.HpkeAead aead;
    private final com.google.crypto.tink.hybrid.internal.HpkeKdf kdf;
    private final com.google.crypto.tink.hybrid.internal.HpkeKem kem;
    private final byte[] ourPublicKeyByteArray;
    private final byte[] theirPublicKeyByteArray;

    private AuthHpkeHelperForAndroidKeystore(com.google.crypto.tink.hybrid.internal.HpkeKem hpkeKem, com.google.crypto.tink.hybrid.internal.HpkeKdf hpkeKdf, com.google.crypto.tink.hybrid.internal.HpkeAead hpkeAead, byte[] bArr, byte[] bArr2) {
        this.kem = hpkeKem;
        this.kdf = hpkeKdf;
        this.aead = hpkeAead;
        this.ourPublicKeyByteArray = bArr;
        this.theirPublicKeyByteArray = bArr2;
    }

    public static com.google.crypto.tink.hybrid.internal.AuthHpkeHelperForAndroidKeystore create(com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey, com.google.crypto.tink.hybrid.HpkePublicKey hpkePublicKey2) throws java.security.GeneralSecurityException {
        if (!hpkePublicKey.getParameters().equals(hpkePublicKey2.getParameters())) {
            throw new java.security.GeneralSecurityException("ourPublicKey.getParameters() must be equal to theirPublicKey.getParameters()");
        }
        com.google.crypto.tink.hybrid.HpkeParameters parameters = hpkePublicKey.getParameters();
        validateParameters(parameters);
        return new com.google.crypto.tink.hybrid.internal.AuthHpkeHelperForAndroidKeystore(com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKem(parameters.getKemId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createKdf(parameters.getKdfId()), com.google.crypto.tink.hybrid.internal.HpkePrimitiveFactory.createAead(parameters.getAeadId()), hpkePublicKey.getPublicKeyBytes().toByteArray(), hpkePublicKey2.getPublicKeyBytes().toByteArray());
    }

    private static void validateParameters(com.google.crypto.tink.hybrid.HpkeParameters hpkeParameters) throws java.security.GeneralSecurityException {
        if (!hpkeParameters.getKemId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256)) {
            throw new java.security.GeneralSecurityException("AuthHpkeHelperForAndroidKeystore currently only supports KemId.DHKEM_P256_HKDF_SHA256.");
        }
        if (!hpkeParameters.getKdfId().equals(com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256)) {
            throw new java.security.GeneralSecurityException("AuthHpkeHelperForAndroidKeystore currently only supports KdfId.HKDF_SHA256.");
        }
        if (!hpkeParameters.getAeadId().equals(com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM)) {
            throw new java.security.GeneralSecurityException("AuthHpkeHelperForAndroidKeystore currently only supports AeadId.AES_128_GCM.");
        }
        if (!hpkeParameters.getVariant().equals(com.google.crypto.tink.hybrid.HpkeParameters.Variant.NO_PREFIX)) {
            throw new java.security.GeneralSecurityException("AuthHpkeHelperForAndroidKeystore currently only supports Variant.NO_PREFIX");
        }
    }

    public final byte[] decryptAuthenticatedWithEncapsulatedKeyAndP256SharedSecret(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i, byte[] bArr5) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.hybrid.internal.HpkeContext.createContext(com.google.crypto.tink.hybrid.internal.HpkeUtil.AUTH_MODE, bArr, com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256).deriveKemSharedSecret(com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr3), bArr, this.ourPublicKeyByteArray, this.theirPublicKeyByteArray), this.kem, this.kdf, this.aead, bArr5).open(bArr4, i, EMPTY_ASSOCIATED_DATA);
    }

    public final byte[] encryptAuthenticatedWithEncapsulatedKeyAndP256SharedSecret(java.security.spec.ECPoint eCPoint, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws java.security.GeneralSecurityException {
        byte[] pointEncode = com.google.crypto.tink.subtle.EllipticCurves.pointEncode(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256, com.google.crypto.tink.subtle.EllipticCurves.PointFormatType.UNCOMPRESSED, eCPoint);
        return com.google.crypto.tink.subtle.Bytes.concat(pointEncode, com.google.crypto.tink.hybrid.internal.HpkeContext.createContext(com.google.crypto.tink.hybrid.internal.HpkeUtil.AUTH_MODE, pointEncode, com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256).deriveKemSharedSecret(com.google.crypto.tink.subtle.Bytes.concat(bArr, bArr2), pointEncode, this.theirPublicKeyByteArray, this.ourPublicKeyByteArray), this.kem, this.kdf, this.aead, bArr4).seal(bArr3, EMPTY_ASSOCIATED_DATA));
    }
}
