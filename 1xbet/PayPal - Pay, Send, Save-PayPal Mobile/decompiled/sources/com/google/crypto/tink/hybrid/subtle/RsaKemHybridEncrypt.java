package com.google.crypto.tink.hybrid.subtle;

/* loaded from: classes9.dex */
public final class RsaKemHybridEncrypt implements com.google.crypto.tink.HybridEncrypt {
    private final com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory;
    private final java.lang.String hkdfHmacAlgo;
    private final byte[] hkdfSalt;
    private final java.security.interfaces.RSAPublicKey recipientPublicKey;

    public RsaKemHybridEncrypt(java.security.interfaces.RSAPublicKey rSAPublicKey, java.lang.String str, byte[] bArr, com.google.crypto.tink.aead.subtle.AeadFactory aeadFactory) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.hybrid.subtle.RsaKem.validateRsaModulus(rSAPublicKey.getModulus());
        this.recipientPublicKey = rSAPublicKey;
        this.hkdfHmacAlgo = str;
        this.hkdfSalt = bArr;
        this.aeadFactory = aeadFactory;
    }

    @Override // com.google.crypto.tink.HybridEncrypt
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] generateSecret = com.google.crypto.tink.hybrid.subtle.RsaKem.generateSecret(this.recipientPublicKey.getModulus());
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/NoPadding");
        cipher.init(1, this.recipientPublicKey);
        byte[] doFinal = cipher.doFinal(generateSecret);
        byte[] encrypt = this.aeadFactory.createAead(com.google.crypto.tink.subtle.Hkdf.computeHkdf(this.hkdfHmacAlgo, generateSecret, this.hkdfSalt, bArr2, this.aeadFactory.getKeySizeInBytes())).encrypt(bArr, com.google.crypto.tink.hybrid.subtle.RsaKem.EMPTY_AAD);
        return java.nio.ByteBuffer.allocate(doFinal.length + encrypt.length).put(doFinal).put(encrypt).array();
    }
}
