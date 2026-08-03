package com.digitalturbine.ignite.encryption;

/* loaded from: classes2.dex */
public final class d {
    public static android.util.Pair a(javax.crypto.SecretKey secretKey, java.lang.String str) {
        byte[] generateSeed = new java.security.SecureRandom().generateSeed(12);
        javax.crypto.Cipher a2 = com.digitalturbine.ignite.encryption.a.a(1, generateSeed, secretKey);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        javax.crypto.CipherOutputStream cipherOutputStream = new javax.crypto.CipherOutputStream(byteArrayOutputStream, a2);
        cipherOutputStream.write(str.getBytes("UTF-8"));
        cipherOutputStream.close();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return new android.util.Pair(android.util.Base64.encodeToString(generateSeed, 0), android.util.Base64.encodeToString(byteArray, 0));
    }
}
