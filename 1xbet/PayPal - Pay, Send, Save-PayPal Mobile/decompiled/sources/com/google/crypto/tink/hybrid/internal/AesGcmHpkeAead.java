package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
final class AesGcmHpkeAead implements com.google.crypto.tink.hybrid.internal.HpkeAead {
    private final int keyLength;

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final int getNonceLength() {
        return 12;
    }

    AesGcmHpkeAead(int i) throws java.security.InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new java.security.InvalidAlgorithmParameterException("Unsupported key length: ".concat(java.lang.String.valueOf(i)));
        }
        this.keyLength = i;
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final byte[] seal(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException {
        if (bArr.length != this.keyLength) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected key length: ");
            sb.append(bArr.length);
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        return new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce(bArr).encrypt(bArr2, bArr3, i, bArr4);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final byte[] open(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, byte[] bArr4) throws java.security.GeneralSecurityException {
        if (bArr.length != this.keyLength) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected key length: ");
            sb.append(bArr.length);
            throw new java.security.InvalidAlgorithmParameterException(sb.toString());
        }
        return new com.google.crypto.tink.aead.internal.InsecureNonceAesGcmJce(bArr).decrypt(bArr2, bArr3, i, bArr4);
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final byte[] getAeadId() throws java.security.GeneralSecurityException {
        int i = this.keyLength;
        if (i == 16) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_128_GCM_AEAD_ID;
        }
        if (i == 32) {
            return com.google.crypto.tink.hybrid.internal.HpkeUtil.AES_256_GCM_AEAD_ID;
        }
        throw new java.security.GeneralSecurityException("Could not determine HPKE AEAD ID");
    }

    @Override // com.google.crypto.tink.hybrid.internal.HpkeAead
    public final int getKeyLength() {
        return this.keyLength;
    }
}
