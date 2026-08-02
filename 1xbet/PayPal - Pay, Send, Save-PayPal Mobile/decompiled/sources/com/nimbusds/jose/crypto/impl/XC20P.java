package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class XC20P {
    public static final int AUTH_TAG_BIT_LENGTH = 128;
    public static final int IV_BIT_LENGTH = 192;

    public static com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encryptAuthenticated(javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Container<byte[]> container, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        try {
            try {
                byte[] encrypt = new com.google.crypto.tink.subtle.XChaCha20Poly1305(secretKey.getEncoded()).encrypt(bArr, bArr2);
                int length = encrypt.length - com.nimbusds.jose.util.ByteUtils.byteLength(128);
                int byteLength = com.nimbusds.jose.util.ByteUtils.byteLength(192);
                byte[] subArray = com.nimbusds.jose.util.ByteUtils.subArray(encrypt, 0, byteLength);
                byte[] subArray2 = com.nimbusds.jose.util.ByteUtils.subArray(encrypt, byteLength, length - byteLength);
                byte[] subArray3 = com.nimbusds.jose.util.ByteUtils.subArray(encrypt, length, com.nimbusds.jose.util.ByteUtils.byteLength(128));
                container.set(subArray);
                return new com.nimbusds.jose.crypto.impl.AuthenticatedCipherText(subArray2, subArray3);
            } catch (java.security.GeneralSecurityException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't encrypt with XChaCha20Poly1305: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        } catch (java.security.GeneralSecurityException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid XChaCha20Poly1305 key: ");
            sb2.append(e2.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e2);
        }
    }

    public static byte[] decryptAuthenticated(javax.crypto.SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws com.nimbusds.jose.JOSEException {
        try {
            try {
                return new com.google.crypto.tink.subtle.XChaCha20Poly1305(secretKey.getEncoded()).decrypt(com.nimbusds.jose.util.ByteUtils.concat(bArr, bArr2, bArr4), bArr3);
            } catch (java.security.GeneralSecurityException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("XChaCha20Poly1305 decryption failed: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        } catch (java.security.GeneralSecurityException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid XChaCha20Poly1305 key: ");
            sb2.append(e2.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e2);
        }
    }
}
