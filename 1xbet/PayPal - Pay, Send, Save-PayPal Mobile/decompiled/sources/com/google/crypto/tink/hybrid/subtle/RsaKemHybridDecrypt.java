package com.google.crypto.tink.hybrid.subtle;

/* loaded from: classes9.dex */
public final class RsaKemHybridDecrypt implements com.google.crypto.tink.HybridDecrypt {
    private final com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final java.security.interfaces.RSAPrivateKey recipientPrivateKey;

    public RsaKemHybridDecrypt(java.security.interfaces.RSAPrivateKey rSAPrivateKey, java.lang.String str, byte[] bArr, com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.subtle.RsaKem.validateRsaModulus(rSAPrivateKey.getModulus());
        this.recipientPrivateKey = rSAPrivateKey;
        this.hkdfSalt = bArr;
        this.hkdfHmacAlgo = str;
        this.aeadFactory = aeadFactory;
    }

    @Override // com.google.crypto.tink.HybridDecrypt
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int bigIntSizeInBytes = com.google.crypto.tink.hybrid.subtle.RsaKem.bigIntSizeInBytes(this.recipientPrivateKey.getModulus());
        if (bArr.length < bigIntSizeInBytes) {
            throw new java.security.GeneralSecurityException(java.lang.String.format("Ciphertext must be of at least size %d bytes, but got %d", java.lang.Integer.valueOf(bigIntSizeInBytes), java.lang.Integer.valueOf(bArr.length)));
        }
        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr);
        byte[] bArr3 = new byte[bigIntSizeInBytes];
        wrap.get(bArr3);
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(2, this.recipientPrivateKey);
        com.google.crypto.tink.Aead createAead = this.aeadFactory.createAead(com.google.crypto.tink.subtle.Hkdf.computeHkdf(this.hkdfHmacAlgo, cipher.doFinal(bArr3), this.hkdfSalt, bArr2, this.aeadFactory.getKeySizeInBytes()));
        byte[] bArr4 = new byte[wrap.remaining()];
        wrap.get(bArr4);
        return createAead.decrypt(bArr4, com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD);
    }
}
