package com.google.crypto.tink.subtle;

/* loaded from: classes9.dex */
public final class X25519 {
    public static byte[] generatePrivateKey() {
        byte[] randBytes = com.google.crypto.tink.subtle.Random.randBytes(32);
        randBytes[0] = (byte) (randBytes[0] | 7);
        byte b = (byte) (randBytes[31] & 63);
        randBytes[31] = b;
        randBytes[31] = (byte) (b | 128);
        return randBytes;
    }

    public static byte[] computeSharedSecret(byte[] bArr, byte[] bArr2) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = java.util.Arrays.copyOf(bArr, 32);
        copyOf[0] = (byte) (copyOf[0] & 248);
        byte b = (byte) (copyOf[31] & Byte.MAX_VALUE);
        copyOf[31] = b;
        copyOf[31] = (byte) (b | 64);
        com.google.crypto.tink.internal.Curve25519.curveMult(jArr, copyOf, bArr2);
        return com.google.crypto.tink.internal.Field25519.contract(jArr);
    }

    public static byte[] publicFromPrivate(byte[] bArr) throws java.security.InvalidKeyException {
        if (bArr.length != 32) {
            throw new java.security.InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return computeSharedSecret(bArr, bArr2);
    }

    private X25519() {
    }
}
