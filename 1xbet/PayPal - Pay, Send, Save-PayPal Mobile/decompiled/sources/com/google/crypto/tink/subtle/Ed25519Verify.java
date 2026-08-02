package com.google.crypto.tink.subtle;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class Ed25519Verify implements com.google.crypto.tink.PublicKeyVerify {
    public static final com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility FIPS = com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;
    public static final int PUBLIC_KEY_LEN = 32;
    public static final int SIGNATURE_LEN = 64;
    private final byte[] messageSuffix;
    private final byte[] outputPrefix;
    private final com.google.crypto.tink.util.Bytes publicKey;

    public static com.google.crypto.tink.PublicKeyVerify create(com.google.crypto.tink.signature.Ed25519PublicKey ed25519PublicKey) throws java.security.GeneralSecurityException {
        byte[] bArr;
        if (!FIPS.isCompatible()) {
            throw new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return com.google.crypto.tink.signature.internal.Ed25519VerifyJce.create(ed25519PublicKey);
        } catch (java.security.GeneralSecurityException unused) {
            byte[] byteArray = ed25519PublicKey.getPublicKeyBytes().toByteArray();
            byte[] byteArray2 = ed25519PublicKey.getOutputPrefix().toByteArray();
            if (ed25519PublicKey.getParameters().getVariant().equals(com.google.crypto.tink.signature.Ed25519Parameters.Variant.LEGACY)) {
                bArr = new byte[]{0};
            } else {
                bArr = new byte[0];
            }
            return new com.google.crypto.tink.subtle.Ed25519Verify(byteArray, byteArray2, bArr);
        }
    }

    public Ed25519Verify(byte[] bArr) {
        this(bArr, new byte[0], new byte[0]);
    }

    private Ed25519Verify(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!FIPS.isCompatible()) {
            throw new java.lang.IllegalStateException(new java.security.GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Given public key's length is not %s.", 32));
        }
        this.publicKey = com.google.crypto.tink.util.Bytes.copyFrom(bArr);
        this.outputPrefix = bArr2;
        this.messageSuffix = bArr3;
        com.google.crypto.tink.internal.Ed25519.init();
    }

    private void noPrefixVerify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr.length != 64) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("The length of the signature is not %s.", 64));
        }
        if (!com.google.crypto.tink.internal.Ed25519.verify(bArr2, bArr, this.publicKey.toByteArray())) {
            throw new java.security.GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // com.google.crypto.tink.PublicKeyVerify
    public final void verify(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.outputPrefix;
        if (bArr3.length == 0 && this.messageSuffix.length == 0) {
            noPrefixVerify(bArr, bArr2);
        } else {
            if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
                throw new java.security.GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.messageSuffix;
            if (bArr4.length != 0) {
                bArr2 = com.google.crypto.tink.subtle.Bytes.concat(bArr2, bArr4);
            }
            noPrefixVerify(java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length), bArr2);
        }
    }
}
