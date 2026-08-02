package com.google.crypto.tink.hybrid.internal;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class X25519Conscrypt implements com.google.crypto.tink.hybrid.internal.X25519 {
    private static final int PRIVATE_KEY_LEN = 32;
    private static final int PUBLIC_KEY_LEN = 32;
    private static final byte[] x25519Pkcs8Prefix = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] x25519X509Prefix = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    final java.security.Provider provider;

    private X25519Conscrypt(java.security.Provider provider) {
        this.provider = provider;
    }

    public static com.google.crypto.tink.hybrid.internal.X25519 create() throws java.security.GeneralSecurityException {
        java.security.Provider providerOrNull = com.google.crypto.tink.internal.ConscryptUtil.providerOrNull();
        if (providerOrNull == null) {
            throw new java.security.GeneralSecurityException("Conscrypt is not available.");
        }
        java.security.KeyFactory.getInstance("XDH", providerOrNull);
        javax.crypto.KeyAgreement.getInstance("XDH", providerOrNull);
        com.google.crypto.tink.hybrid.internal.X25519Conscrypt x25519Conscrypt = new com.google.crypto.tink.hybrid.internal.X25519Conscrypt(providerOrNull);
        x25519Conscrypt.generateKeyPair();
        return x25519Conscrypt;
    }

    @Override // com.google.crypto.tink.hybrid.internal.X25519
    public final com.google.crypto.tink.hybrid.internal.X25519.KeyPair generateKeyPair() throws java.security.GeneralSecurityException {
        java.security.KeyPairGenerator keyPairGenerator = java.security.KeyPairGenerator.getInstance("XDH", this.provider);
        keyPairGenerator.initialize(255);
        java.security.KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = generateKeyPair.getPrivate().getEncoded();
        int length = encoded.length;
        byte[] bArr = x25519Pkcs8Prefix;
        if (length != bArr.length + 32) {
            throw new java.security.GeneralSecurityException("Invalid encoded private key length");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr, encoded)) {
            throw new java.security.GeneralSecurityException("Invalid encoded private key prefix");
        }
        byte[] copyOfRange = java.util.Arrays.copyOfRange(encoded, bArr.length, encoded.length);
        byte[] encoded2 = generateKeyPair.getPublic().getEncoded();
        int length2 = encoded2.length;
        byte[] bArr2 = x25519X509Prefix;
        if (length2 != bArr2.length + 32) {
            throw new java.security.GeneralSecurityException("Invalid encoded public key length");
        }
        if (!com.google.crypto.tink.internal.Util.isPrefix(bArr2, encoded2)) {
            throw new java.security.GeneralSecurityException("Invalid encoded public key prefix");
        }
        return new com.google.crypto.tink.hybrid.internal.X25519.KeyPair(copyOfRange, java.util.Arrays.copyOfRange(encoded2, bArr2.length, encoded2.length));
    }

    @Override // com.google.crypto.tink.hybrid.internal.X25519
    public final byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        java.security.KeyFactory keyFactory = java.security.KeyFactory.getInstance("XDH", this.provider);
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("Invalid X25519 private key");
        }
        java.security.PrivateKey generatePrivate = keyFactory.generatePrivate(new java.security.spec.PKCS8EncodedKeySpec(com.google.crypto.tink.subtle.Bytes.concat(x25519Pkcs8Prefix, bArr)));
        if (bArr2.length != 32) {
            throw new java.security.InvalidKeyException("Invalid X25519 public key");
        }
        java.security.PublicKey generatePublic = keyFactory.generatePublic(new java.security.spec.X509EncodedKeySpec(com.google.crypto.tink.subtle.Bytes.concat(x25519X509Prefix, bArr2)));
        javax.crypto.KeyAgreement keyAgreement = javax.crypto.KeyAgreement.getInstance("XDH", this.provider);
        keyAgreement.init(generatePrivate);
        keyAgreement.doPhase(generatePublic, true);
        return keyAgreement.generateSecret();
    }
}
