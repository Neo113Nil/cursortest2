package com.google.crypto.tink.subtle;

/* loaded from: classes4.dex */
public final class EncryptThenAuthenticate implements com.google.crypto.tink.Aead {
    private final com.google.crypto.tink.subtle.IndCpaCipher cipher;
    private final com.google.crypto.tink.Mac mac;
    private final int macLength;
    private final byte[] outputPrefix;

    public EncryptThenAuthenticate(com.google.crypto.tink.subtle.IndCpaCipher indCpaCipher, com.google.crypto.tink.Mac mac, int i) {
        this(indCpaCipher, mac, i, new byte[0]);
    }

    private EncryptThenAuthenticate(com.google.crypto.tink.subtle.IndCpaCipher indCpaCipher, com.google.crypto.tink.Mac mac, int i, byte[] bArr) {
        this.cipher = indCpaCipher;
        this.mac = mac;
        this.macLength = i;
        this.outputPrefix = bArr;
    }

    public static com.google.crypto.tink.Aead create(com.google.crypto.tink.aead.AesCtrHmacAeadKey aesCtrHmacAeadKey) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.AesCtrJceCipher aesCtrJceCipher = new com.google.crypto.tink.subtle.AesCtrJceCipher(aesCtrHmacAeadKey.getAesKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), aesCtrHmacAeadKey.getParameters().getIvSizeBytes());
        java.lang.StringBuilder sb = new java.lang.StringBuilder(org.jose4j.keys.HmacKey.ALGORITHM);
        sb.append(aesCtrHmacAeadKey.getParameters().getHashType());
        return new com.google.crypto.tink.subtle.EncryptThenAuthenticate(aesCtrJceCipher, new com.google.crypto.tink.subtle.PrfMac(new com.google.crypto.tink.subtle.PrfHmacJce(sb.toString(), new javax.crypto.spec.SecretKeySpec(aesCtrHmacAeadKey.getHmacKeyBytes().toByteArray(com.google.crypto.tink.InsecureSecretKeyAccess.get()), org.jose4j.keys.HmacKey.ALGORITHM)), aesCtrHmacAeadKey.getParameters().getTagSizeBytes()), aesCtrHmacAeadKey.getParameters().getTagSizeBytes(), aesCtrHmacAeadKey.getOutputPrefix().toByteArray());
    }

    public static com.google.crypto.tink.Aead newAesCtrHmac(byte[] bArr, int i, java.lang.String str, byte[] bArr2, int i2) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.subtle.EncryptThenAuthenticate(new com.google.crypto.tink.subtle.AesCtrJceCipher(bArr, i), new com.google.crypto.tink.subtle.PrfMac(new com.google.crypto.tink.subtle.PrfHmacJce(str, new javax.crypto.spec.SecretKeySpec(bArr2, org.jose4j.keys.HmacKey.ALGORITHM)), i2), i2);
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] encrypt = this.cipher.encrypt(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return com.google.crypto.tink.subtle.Bytes.concat(this.outputPrefix, encrypt, this.mac.computeMac(com.google.crypto.tink.subtle.Bytes.concat(bArr2, encrypt, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // com.google.crypto.tink.Aead
    public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        int length = bArr.length;
        int i = this.macLength;
        byte[] bArr3 = this.outputPrefix;
        if (length < i + bArr3.length) {
            throw new java.security.GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr3, bArr)) {
            throw new java.security.GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = java.util.Arrays.copyOfRange(bArr, this.outputPrefix.length, bArr.length - this.macLength);
        byte[] copyOfRange2 = java.util.Arrays.copyOfRange(bArr, bArr.length - this.macLength, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.mac.verifyMac(copyOfRange2, com.google.crypto.tink.subtle.Bytes.concat(bArr2, copyOfRange, java.util.Arrays.copyOf(java.nio.ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.cipher.decrypt(copyOfRange);
    }
}
