package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class HpkePrimitiveFactory {
    public static com.google.crypto.tink.hybrid.internal.HpkeKem createKem(byte[] bArr) throws java.security.GeneralSecurityException {
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.X25519_HKDF_SHA256_KEM_ID)) {
            return new com.google.crypto.tink.hybrid.internal.X25519HpkeKem(new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha256"));
        }
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.P256_HKDF_SHA256_KEM_ID)) {
            return com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256);
        }
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.P384_HKDF_SHA384_KEM_ID)) {
            return com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384);
        }
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.P521_HKDF_SHA512_KEM_ID)) {
            return com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521);
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeKem createKem(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) throws java.security.GeneralSecurityException {
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
            return new com.google.crypto.tink.hybrid.internal.X25519HpkeKem(new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha256"));
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256);
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384);
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return com.google.crypto.tink.hybrid.internal.NistCurvesHpkeKem.fromCurve(com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521);
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeKdf createKdf(byte[] bArr) {
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA256_KDF_ID)) {
            return new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha256");
        }
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA384_KDF_ID)) {
            return new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha384");
        }
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.HKDF_SHA512_KDF_ID)) {
            return new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha512");
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeKdf createKdf(com.google.crypto.tink.hybrid.HpkeParameters.KdfId kdfId) {
        if (kdfId == com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA256) {
            return new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha256");
        }
        if (kdfId == com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA384) {
            return new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha384");
        }
        if (kdfId == com.google.crypto.tink.hybrid.HpkeParameters.KdfId.HKDF_SHA512) {
            return new com.google.crypto.tink.hybrid.internal.HkdfHpkeKdf("HmacSha512");
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeAead createAead(byte[] bArr) throws java.security.GeneralSecurityException {
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_128_GCM_AEAD_ID)) {
            return new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead(16);
        }
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_256_GCM_AEAD_ID)) {
            return new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead(32);
        }
        if (java.util.Arrays.equals(bArr, com.google.crypto.tink.hybrid.internal.HpkeUtil.CHACHA20_POLY1305_AEAD_ID)) {
            return new com.google.crypto.tink.hybrid.internal.ChaCha20Poly1305HpkeAead();
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static com.google.crypto.tink.hybrid.internal.HpkeAead createAead(com.google.crypto.tink.hybrid.HpkeParameters.AeadId aeadId) throws java.security.GeneralSecurityException {
        if (aeadId == com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_128_GCM) {
            return new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead(16);
        }
        if (aeadId == com.google.crypto.tink.hybrid.HpkeParameters.AeadId.AES_256_GCM) {
            return new com.google.crypto.tink.hybrid.internal.AesGcmHpkeAead(32);
        }
        if (aeadId == com.google.crypto.tink.hybrid.HpkeParameters.AeadId.CHACHA20_POLY1305) {
            return new com.google.crypto.tink.hybrid.internal.ChaCha20Poly1305HpkeAead();
        }
        throw new java.lang.IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    private HpkePrimitiveFactory() {
    }
}
