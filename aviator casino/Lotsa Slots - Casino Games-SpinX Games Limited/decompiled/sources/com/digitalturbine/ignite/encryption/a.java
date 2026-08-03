package com.digitalturbine.ignite.encryption;

/* loaded from: classes2.dex */
public abstract class a {
    public static javax.crypto.Cipher a(int i, byte[] bArr, javax.crypto.SecretKey secretKey) {
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i, secretKey, new javax.crypto.spec.GCMParameterSpec(128, bArr));
        return cipher;
    }

    public static java.lang.String a(javax.crypto.Cipher cipher, java.lang.String str) {
        javax.crypto.CipherInputStream cipherInputStream = new javax.crypto.CipherInputStream(new java.io.ByteArrayInputStream(android.util.Base64.decode(str, 0)), cipher);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            int read = cipherInputStream.read();
            if (read == -1) {
                break;
            }
            arrayList.add(java.lang.Byte.valueOf((byte) read));
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = ((java.lang.Byte) arrayList.get(i)).byteValue();
        }
        return new java.lang.String(bArr, "UTF-8");
    }
}
