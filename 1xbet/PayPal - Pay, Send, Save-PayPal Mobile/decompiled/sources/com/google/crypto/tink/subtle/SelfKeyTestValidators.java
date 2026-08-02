package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class SelfKeyTestValidators {
    private static final com.google.crypto.tink.shaded.protobuf.ByteString TEST_MESSAGE = com.google.crypto.tink.shaded.protobuf.ByteString.copyFromUtf8("Tink and Wycheproof.");

    private SelfKeyTestValidators() {
    }

    public static final void validateRsaSsaPss(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.Enums.HashType hashType2, int i) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.RsaSsaPssSignJce rsaSsaPssSignJce = new com.google.crypto.tink.subtle.RsaSsaPssSignJce(rSAPrivateCrtKey, hashType, hashType2, i);
        com.google.crypto.tink.subtle.RsaSsaPssVerifyJce rsaSsaPssVerifyJce = new com.google.crypto.tink.subtle.RsaSsaPssVerifyJce(rSAPublicKey, hashType, hashType2, i);
        try {
            com.google.crypto.tink.shaded.protobuf.ByteString byteString = TEST_MESSAGE;
            rsaSsaPssVerifyJce.verify(rsaSsaPssSignJce.sign(byteString.toByteArray()), byteString.toByteArray());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("RSA PSS signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    public static final void validateRsaSsaPkcs1(java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey, java.security.interfaces.RSAPublicKey rSAPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce rsaSsaPkcs1SignJce = new com.google.crypto.tink.subtle.RsaSsaPkcs1SignJce(rSAPrivateCrtKey, hashType);
        com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce rsaSsaPkcs1VerifyJce = new com.google.crypto.tink.subtle.RsaSsaPkcs1VerifyJce(rSAPublicKey, hashType);
        try {
            com.google.crypto.tink.shaded.protobuf.ByteString byteString = TEST_MESSAGE;
            rsaSsaPkcs1VerifyJce.verify(rsaSsaPkcs1SignJce.sign(byteString.toByteArray()), byteString.toByteArray());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("RSA PKCS1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }

    public static final void validateEcdsa(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey, com.google.crypto.tink.subtle.Enums.HashType hashType, com.google.crypto.tink.subtle.EllipticCurves.EcdsaEncoding ecdsaEncoding) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.EcdsaSignJce ecdsaSignJce = new com.google.crypto.tink.subtle.EcdsaSignJce(eCPrivateKey, hashType, ecdsaEncoding);
        com.google.crypto.tink.subtle.EcdsaVerifyJce ecdsaVerifyJce = new com.google.crypto.tink.subtle.EcdsaVerifyJce(eCPublicKey, hashType, ecdsaEncoding);
        try {
            com.google.crypto.tink.shaded.protobuf.ByteString byteString = TEST_MESSAGE;
            ecdsaVerifyJce.verify(ecdsaSignJce.sign(byteString.toByteArray()), byteString.toByteArray());
        } catch (java.security.GeneralSecurityException e) {
            throw new java.security.GeneralSecurityException("ECDSA signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }
}
