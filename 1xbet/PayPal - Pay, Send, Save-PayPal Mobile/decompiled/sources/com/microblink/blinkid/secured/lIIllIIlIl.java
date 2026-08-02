package com.microblink.blinkid.secured;

/* loaded from: classes10.dex */
public abstract class lIIllIIlIl {
    public static final java.util.Random IlIllIlIIl = new java.util.Random();
    public static java.security.PublicKey llIIlIlIIl;

    public static javax.crypto.SecretKey llIIlIlIIl() {
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(org.jose4j.keys.AesKey.ALGORITHM);
        keyGenerator.init(256);
        return keyGenerator.generateKey();
    }

    public static void llIIlIlIIl(java.io.InputStream inputStream, javax.crypto.SecretKey secretKey, java.io.ByteArrayOutputStream byteArrayOutputStream) {
        byte[] bArr;
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, secretKey);
        try {
            bArr = ((javax.crypto.spec.IvParameterSpec) cipher.getParameters().getParameterSpec(javax.crypto.spec.IvParameterSpec.class)).getIV();
        } catch (java.lang.NullPointerException unused) {
            bArr = new byte[16];
            IlIllIlIIl.nextBytes(bArr);
        }
        byteArrayOutputStream.write(bArr);
        llIIlIlIIl(inputStream, new javax.crypto.CipherOutputStream(byteArrayOutputStream, cipher));
    }

    public static byte[] llIIlIlIIl(android.content.Context context, javax.crypto.SecretKey secretKey) {
        java.security.PublicKey publicKey;
        javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding");
        synchronized (com.microblink.blinkid.secured.lIIllIIlIl.class) {
            if (llIIlIlIIl == null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                llIIlIlIIl(context.getAssets().open("microblink/public.der"), byteArrayOutputStream);
                llIIlIlIIl = java.security.KeyFactory.getInstance("RSA").generatePublic(new java.security.spec.X509EncodedKeySpec(byteArrayOutputStream.toByteArray()));
            }
            publicKey = llIIlIlIIl;
        }
        cipher.init(1, publicKey);
        return cipher.doFinal(secretKey.getEncoded());
    }

    public static void llIIlIlIIl(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (java.lang.Exception e) {
                        e.printStackTrace();
                    }
                }
            } finally {
            }
        }
        outputStream.close();
        try {
            inputStream.close();
        } catch (java.lang.Exception e2) {
            e2.printStackTrace();
        }
    }
}
