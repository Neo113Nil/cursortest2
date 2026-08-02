package com.google.crypto.tink.hybrid.internal;

/* loaded from: classes9.dex */
public final class HpkeUtil {
    public static final byte[] BASE_MODE = intToByteArray(1, 0);
    public static final byte[] AUTH_MODE = intToByteArray(1, 2);
    public static final byte[] X25519_HKDF_SHA256_KEM_ID = intToByteArray(2, 32);
    public static final byte[] P256_HKDF_SHA256_KEM_ID = intToByteArray(2, 16);
    public static final byte[] P384_HKDF_SHA384_KEM_ID = intToByteArray(2, 17);
    public static final byte[] P521_HKDF_SHA512_KEM_ID = intToByteArray(2, 18);
    public static final byte[] HKDF_SHA256_KDF_ID = intToByteArray(2, 1);
    public static final byte[] HKDF_SHA384_KDF_ID = intToByteArray(2, 2);
    public static final byte[] HKDF_SHA512_KDF_ID = intToByteArray(2, 3);
    public static final byte[] AES_128_GCM_AEAD_ID = intToByteArray(2, 1);
    public static final byte[] AES_256_GCM_AEAD_ID = intToByteArray(2, 2);
    public static final byte[] CHACHA20_POLY1305_AEAD_ID = intToByteArray(2, 3);
    public static final byte[] EMPTY_SALT = new byte[0];
    private static final byte[] KEM = "KEM".getBytes(com.google.crypto.tink.internal.Util.UTF_8);
    private static final byte[] HPKE = "HPKE".getBytes(com.google.crypto.tink.internal.Util.UTF_8);
    private static final byte[] HPKE_V1 = "HPKE-v1".getBytes(com.google.crypto.tink.internal.Util.UTF_8);

    public static byte[] intToByteArray(int i, int i2) {
        if (i > 4 || i < 0) {
            throw new java.lang.IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i2 < 0 || (i < 4 && i2 >= (1 << (i * 8)))) {
            throw new java.lang.IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    static byte[] kemSuiteId(byte[] bArr) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.Bytes.concat(KEM, bArr);
    }

    static byte[] hpkeSuiteId(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.Bytes.concat(HPKE, bArr, bArr2, bArr3);
    }

    static byte[] labelIkm(java.lang.String str, byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.Bytes.concat(HPKE_V1, bArr2, str.getBytes(com.google.crypto.tink.internal.Util.UTF_8), bArr);
    }

    static byte[] labelInfo(java.lang.String str, byte[] bArr, byte[] bArr2, int i) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.subtle.Bytes.concat(intToByteArray(2, i), HPKE_V1, bArr2, str.getBytes(com.google.crypto.tink.internal.Util.UTF_8), bArr);
    }

    static com.google.crypto.tink.subtle.EllipticCurves.CurveType nistHpkeKemToCurve(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) throws java.security.GeneralSecurityException {
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P256;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P384;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return com.google.crypto.tink.subtle.EllipticCurves.CurveType.NIST_P521;
        }
        throw new java.security.GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    public static int getEncodedPublicKeyLength(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) throws java.security.GeneralSecurityException {
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
            return 32;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return 65;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return 97;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int encodingSizeInBytes(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) {
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256) {
            return 32;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return 65;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return 97;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE;
        }
        throw new java.lang.IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(java.lang.String.valueOf(kemId)));
    }

    public static int getEncodedPrivateKeyLength(com.google.crypto.tink.hybrid.HpkeParameters.KemId kemId) throws java.security.GeneralSecurityException {
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_X25519_HKDF_SHA256 || kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P256_HKDF_SHA256) {
            return 32;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P384_HKDF_SHA384) {
            return 48;
        }
        if (kemId == com.google.crypto.tink.hybrid.HpkeParameters.KemId.DHKEM_P521_HKDF_SHA512) {
            return 66;
        }
        throw new java.security.GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    private HpkeUtil() {
    }
}
