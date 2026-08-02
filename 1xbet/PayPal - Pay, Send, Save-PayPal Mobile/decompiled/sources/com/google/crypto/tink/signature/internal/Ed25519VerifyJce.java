package com.google.crypto.tink.signature.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class Ed25519VerifyJce implements com.google.crypto.tink.PublicKeyVerify {
    private static final java.lang.String ALGORITHM_NAME = "Ed25519";
    private static final int PUBLIC_KEY_LEN = 32;
    private static final int SIGNATURE_LEN = 64;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final java.security.Provider provider;
    private final java.security.PublicKey publicKey;
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    private static final byte[] ed25519X509Prefix = {48, 42, 48, 5, 6, 3, 43, 101, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 3, 33, 0};

    static byte[] x509EncodePublicKey(byte[] bArr) throws java.security.GeneralSecurityException {
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Given public key's length is not %s.", 32));
        }
        return com.google.crypto.tink.subtle.Bytes.concat(ed25519X509Prefix, bArr);
    }

    static java.security.Provider conscryptProvider() throws java.security.GeneralSecurityException {
        java.security.Provider providerOrNull = com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        if (providerOrNull != null) {
            return providerOrNull;
        }
        throw new java.security.NoSuchProviderException("Ed25519VerifyJce requires the Conscrypt provider.");
    }

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.Ed25519PublicKey ed25519PublicKey) throws java.security.GeneralSecurityException {
        return createWithProvider(ed25519PublicKey, conscryptProvider());
    }

    public static com.google.crypto.tink.PublicKeyVerify createWithProvider(com.google.crypto.tink.signature.Ed25519PublicKey ed25519PublicKey, java.security.Provider provider) throws java.security.GeneralSecurityException {
        byte[] bArr;
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        byte[] byteArray = ed25519PublicKey.getPublicKeyBytes().toByteArray();
        byte[] byteArray2 = ed25519PublicKey.getOutputPrefix().toByteArray();
        if (ed25519PublicKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.Ed25519Parameters.Variant.LEGACY)) {
            bArr = new byte[]{0};
        } else {
            bArr = new byte[0];
        }
        return new com.google.crypto.tink.signature.internal.Ed25519VerifyJce(byteArray, byteArray2, bArr, provider);
    }

    Ed25519VerifyJce(byte[] bArr) throws java.security.GeneralSecurityException {
        this(bArr, new byte[0], new byte[0], conscryptProvider());
    }

    private Ed25519VerifyJce(byte[] bArr, byte[] bArr2, byte[] bArr3, java.security.Provider provider) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        this.publicKey = java.security.KeyFactory.getInstance("Ed25519", provider).generatePublic(new java.security.spec.X509EncodedKeySpec(x509EncodePublicKey(bArr)));
        this.outputPrefix = bArr2;
        this.messageSuffix = bArr3;
        this.provider = provider;
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

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        if (length != bArr3.length + 64) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Invalid signature length: %s", 64));
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        java.security.Signature signature = java.security.Signature.getInstance("Ed25519", this.provider);
        signature.initVerify(this.publicKey);
        signature.update(bArr2);
        signature.update(this.messageSuffix);
        try {
            if (signature.verify(bArr, this.outputPrefix.length, 64)) {
                return;
            }
        } catch (java.lang.RuntimeException unused) {
        }
        throw new java.security.GeneralSecurityException("Signature check failed.");
    }
}
