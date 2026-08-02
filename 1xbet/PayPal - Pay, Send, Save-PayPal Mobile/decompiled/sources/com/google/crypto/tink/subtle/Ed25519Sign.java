package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class Ed25519Sign implements com.google.crypto.tink.PublicKeySign {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public static final int SECRET_KEY_LEN = 32;
    private final byte[] hashedPrivateKey;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final byte[] publicKey;

    public static com.google.crypto.tink.PublicKeySign create(com.google.crypto.tink.signature.Ed25519PrivateKey ed25519PrivateKey) throws java.security.GeneralSecurityException {
        byte[] bArr;
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return com.google.crypto.tink.signature.internal.Ed25519SignJce.create(ed25519PrivateKey);
        } catch (java.security.GeneralSecurityException unused) {
            byte[] byteArray = ed25519PrivateKey.getPrivateKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get());
            byte[] byteArray2 = ed25519PrivateKey.getOutputPrefix().toByteArray();
            if (ed25519PrivateKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.Ed25519Parameters.Variant.LEGACY)) {
                bArr = new byte[]{0};
            } else {
                bArr = new byte[0];
            }
            return new com.google.crypto.tink.subtle.Ed25519Sign(byteArray, byteArray2, bArr);
        }
    }

    private Ed25519Sign(byte[] bArr, byte[] bArr2, byte[] bArr3) throws java.security.GeneralSecurityException {
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Given private key's length is not %s", 32));
        }
        byte[] hashedScalar = com.google.crypto.tink.internal.Ed25519.getHashedScalar(bArr);
        this.hashedPrivateKey = hashedScalar;
        this.publicKey = com.google.crypto.tink.internal.Ed25519.scalarMultWithBaseToBytes(hashedScalar);
        this.outputPrefix = bArr2;
        this.messageSuffix = bArr3;
    }

    public Ed25519Sign(byte[] bArr) throws java.security.GeneralSecurityException {
        this(bArr, new byte[0], new byte[0]);
    }

    private byte[] noPrefixSign(byte[] bArr) throws java.security.GeneralSecurityException {
        return com.google.crypto.tink.internal.Ed25519.sign(bArr, this.publicKey, this.hashedPrivateKey);
    }

    @Override // com.google.crypto.tink.PublicKeySign
    public final byte[] sign(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] noPrefixSign;
        byte[] bArr2 = this.messageSuffix;
        if (bArr2.length == 0) {
            noPrefixSign = noPrefixSign(bArr);
        } else {
            noPrefixSign = noPrefixSign(com.google.crypto.tink.subtle.Bytes.concat(bArr, bArr2));
        }
        byte[] bArr3 = this.outputPrefix;
        return bArr3.length == 0 ? noPrefixSign : com.google.crypto.tink.subtle.Bytes.concat(bArr3, noPrefixSign);
    }

    public static final class KeyPair {
        private final byte[] privateKey;
        private final byte[] publicKey;

        private KeyPair(byte[] bArr, byte[] bArr2) {
            this.publicKey = bArr;
            this.privateKey = bArr2;
        }

        public final byte[] getPublicKey() {
            byte[] bArr = this.publicKey;
            return java.util.Arrays.copyOf(bArr, bArr.length);
        }

        public final byte[] getPrivateKey() {
            byte[] bArr = this.privateKey;
            return java.util.Arrays.copyOf(bArr, bArr.length);
        }

        public static com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPair() throws java.security.GeneralSecurityException {
            return newKeyPairFromSeed(com.google.crypto.tink.subtle.Random.randBytes(32));
        }

        public static com.google.crypto.tink.subtle.Ed25519Sign.KeyPair newKeyPairFromSeed(byte[] bArr) throws java.security.GeneralSecurityException {
            if (bArr.length != 32) {
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Given secret seed length is not %s", 32));
            }
            return new com.google.crypto.tink.subtle.Ed25519Sign.KeyPair(com.google.crypto.tink.internal.Ed25519.scalarMultWithBaseToBytes(com.google.crypto.tink.internal.Ed25519.getHashedScalar(bArr)), bArr);
        }
    }
}
