package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class Validators {
    private static final int MIN_RSA_MODULUS_SIZE = 2048;
    private static final java.lang.String TYPE_URL_PREFIX = "type.googleapis.com/";
    private static final java.lang.String URI_UNRESERVED_CHARS = "([0-9a-zA-Z\\-\\.\\_~])+";
    private static final java.util.regex.Pattern GCP_KMS_CRYPTO_KEY_PATTERN = java.util.regex.Pattern.compile(java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS), 2);
    private static final java.util.regex.Pattern GCP_KMS_CRYPTO_KEY_VERSION_PATTERN = java.util.regex.Pattern.compile(java.lang.String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS, URI_UNRESERVED_CHARS), 2);

    private Validators() {
    }

    public static void validateTypeUrl(java.lang.String str) throws java.security.GeneralSecurityException {
        if (!str.startsWith(TYPE_URL_PREFIX)) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Error: type URL %s is invalid; it must start with %s.\n", str, TYPE_URL_PREFIX));
        }
        if (str.length() == 20) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Error: type URL %s is invalid; it has no message name.\n", str));
        }
    }

    public static void validateAesKeySize(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException(java.lang.String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", java.lang.Integer.valueOf(i * 8)));
        }
    }

    public static void validateVersion(int i, int i2) throws java.security.GeneralSecurityException {
        if (i < 0 || i > i2) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("key has version %d; only keys with version in range [0..%d] are supported", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2)));
        }
    }

    /* renamed from: com.google.crypto.tink.subtle.Validators$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType;

        static {
            int[] iArr = new int[com.google.crypto.tink.subtle.Enums.HashType.values().length];
            $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType = iArr;
            try {
                iArr[com.google.crypto.tink.subtle.Enums.HashType.SHA256.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA384.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[com.google.crypto.tink.subtle.Enums.HashType.SHA512.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public static void validateSignatureHash(com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        int i = com.google.crypto.tink.subtle.Validators.AnonymousClass1.$SwitchMap$com$google$crypto$tink$subtle$Enums$HashType[hashType.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported hash: ");
        sb.append(hashType.name());
        throw new java.security.GeneralSecurityException(sb.toString());
    }

    public static void validateRsaModulusSize(int i) throws java.security.GeneralSecurityException {
        if (i < 2048) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", java.lang.Integer.valueOf(i)));
        }
        if (com.google.crypto.tink.config.internal.TinkFipsUtil.useOnlyFips() && i != 2048 && i != 3072) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", java.lang.Integer.valueOf(i)));
        }
    }

    public static void validateRsaPublicExponent(java.math.BigInteger bigInteger) throws java.security.GeneralSecurityException {
        if (!bigInteger.testBit(0)) {
            throw new java.security.GeneralSecurityException("Public exponent must be odd.");
        }
        if (bigInteger.compareTo(java.math.BigInteger.valueOf(65536L)) <= 0) {
            throw new java.security.GeneralSecurityException("Public exponent must be greater than 65536.");
        }
    }

    public static void validateNotExists(java.io.File file) throws java.io.IOException {
        if (file.exists()) {
            throw new java.io.IOException(java.lang.String.format("%s exists, please choose another file\n", file));
        }
    }

    public static void validateExists(java.io.File file) throws java.io.IOException {
        if (!file.exists()) {
            throw new java.io.IOException(java.lang.String.format("Error: %s doesn't exist, please choose another file\n", file));
        }
    }

    public static java.lang.String validateKmsKeyUriAndRemovePrefix(java.lang.String str, java.lang.String str2) {
        if (!str2.toLowerCase(java.util.Locale.US).startsWith(str)) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("key URI must start with %s", str));
        }
        return str2.substring(str.length());
    }

    public static void validateCryptoKeyUri(java.lang.String str) throws java.security.GeneralSecurityException {
        if (GCP_KMS_CRYPTO_KEY_PATTERN.matcher(str).matches()) {
            return;
        }
        if (GCP_KMS_CRYPTO_KEY_VERSION_PATTERN.matcher(str).matches()) {
            throw new java.security.GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey, not a CryptoKeyVersion");
        }
        throw new java.security.GeneralSecurityException("Invalid Google Cloud KMS Key URI. The URI must point to a CryptoKey in the format projects/*/locations/*/keyRings/*/cryptoKeys/*. See https://cloud.google.com/kms/docs/reference/rest/v1/projects.locations.keyRings.cryptoKeys#CryptoKey");
    }
}
