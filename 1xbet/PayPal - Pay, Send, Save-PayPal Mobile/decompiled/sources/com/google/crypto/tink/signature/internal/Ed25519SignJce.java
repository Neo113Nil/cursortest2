package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class Ed25519SignJce implements com.google.crypto.tink.PublicKeySign {
    private static final java.lang.String ALGORITHM_NAME = "Ed25519";
    public static final int SECRET_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final java.security.PrivateKey privateKey;
    private final java.security.Provider provider;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final byte[] ed25519Pkcs8Prefix = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 4, 34, 4, 32};

    static byte[] pkcs8EncodePrivateKey(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Given private key's length is not %s", 32));
        }
        return com.google.crypto.tink.subtle.Bytes.concat(ed25519Pkcs8Prefix, bArr);
    }

    static java.security.Provider conscryptProvider() throws java.security.GeneralSecurityException {
        java.security.Provider providerOrNull = com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        if (providerOrNull != null) {
            return providerOrNull;
        }
        throw new java.security.NoSuchProviderException("Ed25519SignJce requires the Conscrypt provider.");
    }

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.Ed25519PrivateKey ed25519PrivateKey) throws java.security.GeneralSecurityException {
        return createWithProvider(ed25519PrivateKey, conscryptProvider());
    }

    public static com.google.crypto.tink.PublicKeySign createWithProvider(com.google.crypto.tink.signature.Ed25519PrivateKey ed25519PrivateKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        byte[] bArr;
        byte[] byteArray = ed25519PrivateKey.getPrivateKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get());
        byte[] byteArray2 = ed25519PrivateKey.getOutputPrefix().toByteArray();
        if (ed25519PrivateKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.Ed25519Parameters.Variant.LEGACY)) {
            bArr = new byte[]{0};
        } else {
            bArr = new byte[0];
        }
        return new com.google.crypto.tink.signature.internal.Ed25519SignJce(byteArray, byteArray2, bArr, provider);
    }

    private Ed25519SignJce(byte[] bArr, byte[] bArr2, byte[] bArr3, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        this.outputPrefix = bArr2;
        this.messageSuffix = bArr3;
        this.provider = provider;
        this.privateKey = java.security.KeyFactory.getInstance("Ed25519", provider).generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(pkcs8EncodePrivateKey(bArr)));
    }

    public Ed25519SignJce(byte[] bArr) throws java.security.GeneralSecurityException {
        this(bArr, new byte[0], new byte[0], conscryptProvider());
    }

    public static boolean isSupported() {
        java.security.Provider providerOrNull = com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        if (providerOrNull == null) {
            return false;
        }
        try {
            java.security.KeyFactory.getInstance("Ed25519", providerOrNull);
            java.security.Signature.getInstance("Ed25519", providerOrNull);
            return true;
        } catch (java.security.GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        java.security.Signature signature = java.security.Signature.getInstance("Ed25519", this.provider);
        signature.initSign(this.privateKey);
        signature.update(bArr);
        signature.update(this.messageSuffix);
        byte[] sign = signature.sign();
        byte[] bArr2 = this.outputPrefix;
        return bArr2.length == 0 ? sign : com.google.crypto.tink.subtle.Bytes.concat(bArr2, sign);
    }
}
