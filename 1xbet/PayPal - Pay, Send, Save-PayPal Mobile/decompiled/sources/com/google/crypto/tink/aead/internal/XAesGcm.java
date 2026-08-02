package com.google.crypto.tink.aead.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes4.dex */
public final class XAesGcm implements com.google.crypto.tink.Aead {
    private static final int DERIVED_KEY_SIZE_IN_BYTES = 32;
    private static final int IV_SIZE_IN_BYTES = 12;
    private static final int MAX_SALT_SIZE_IN_BYTES = 12;
    private static final int MIN_SALT_SIZE_IN_BYTES = 8;
    private static final int TAG_SIZE_IN_BYTES = 16;
    private final com.google.crypto.tink.prf.Prf cmac;
    private final byte[] outputPrefix;
    private final int saltSize;

    private XAesGcm(byte[] bArr, com.google.crypto.tink.util.Bytes bytes, int i) throws java.security.GeneralSecurityException {
        this.cmac = new com.google.crypto.tink.subtle.PrfAesCmac(bArr);
        this.outputPrefix = bytes.toByteArray();
        this.saltSize = i;
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.XAesGcmKey xAesGcmKey) throws java.security.GeneralSecurityException {
        if (xAesGcmKey.getParameters().getSaltSizeBytes() < 8 || xAesGcmKey.getParameters().getSaltSizeBytes() > 12) {
            throw new java.security.GeneralSecurityException("invalid salt size");
        }
        return new com.google.crypto.tink.aead.internal.XAesGcm(xAesGcmKey.getKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), xAesGcmKey.getOutputPrefix(), xAesGcmKey.getParameters().getSaltSizeBytes());
    }

    private byte[] derivePerMessageKey(byte[] bArr) throws java.security.GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new java.security.GeneralSecurityException("invalid salt size");
        }
        java.lang.System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        java.lang.System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        java.lang.System.arraycopy(this.cmac.compute(bArr2, 16), 0, bArr4, 0, 16);
        java.lang.System.arraycopy(this.cmac.compute(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("plaintext is null");
        }
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(this.saltSize + 12);
        byte[] copyOf = java.util.Arrays.copyOf(randBytes, this.saltSize);
        int i = this.saltSize;
        byte[] copyOfRange = java.util.Arrays.copyOfRange(randBytes, i, i + 12);
        byte[] encrypt = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce(derivePerMessageKey(copyOf)).encrypt(copyOfRange, bArr, this.outputPrefix.length + this.saltSize + copyOfRange.length, bArr2);
        byte[] bArr3 = this.outputPrefix;
        java.lang.System.arraycopy(bArr3, 0, encrypt, 0, bArr3.length);
        java.lang.System.arraycopy(randBytes, 0, encrypt, this.outputPrefix.length, randBytes.length);
        return encrypt;
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        if (bArr == null) {
            throw new java.lang.NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.outputPrefix;
        if (length < bArr3.length + this.saltSize + 28) {
            throw new java.security.GeneralSecurityException("ciphertext too short");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.outputPrefix;
        int length2 = bArr4.length + this.saltSize;
        com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce insecureNonceAesGcmJce = new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce(derivePerMessageKey(java.util.Arrays.copyOfRange(bArr, bArr4.length, length2)));
        int i = length2 + 12;
        return insecureNonceAesGcmJce.decrypt(java.util.Arrays.copyOfRange(bArr, length2, i), bArr, i, bArr2);
    }
}
