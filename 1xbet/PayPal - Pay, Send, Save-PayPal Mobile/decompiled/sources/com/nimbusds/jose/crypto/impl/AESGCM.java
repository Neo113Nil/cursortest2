package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class AESGCM {
    public static final int AUTH_TAG_BIT_LENGTH = 128;
    public static final int IV_BIT_LENGTH = 96;

    public static byte[] generateIV(java.security.SecureRandom secureRandom) {
        byte[] bArr = new byte[12];
        secureRandom.nextBytes(bArr);
        return bArr;
    }

    public static com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encrypt(javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Container<byte[]> container, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        javax.crypto.Cipher cipher;
        javax.crypto.SecretKey aESKey = com.nimbusds.jose.util.KeyUtils.toAESKey(secretKey);
        byte[] bArr3 = container.get();
        try {
            if (provider != null) {
                cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME, provider);
            } else {
                cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
            }
            cipher.init(1, aESKey, new javax.crypto.spec.GCMParameterSpec(128, bArr3));
            cipher.updateAAD(bArr2);
            try {
                byte[] doFinal = cipher.doFinal(bArr);
                int length = doFinal.length - com.nimbusds.jose.util.ByteUtils.byteLength(128);
                byte[] subArray = com.nimbusds.jose.util.ByteUtils.subArray(doFinal, 0, length);
                byte[] subArray2 = com.nimbusds.jose.util.ByteUtils.subArray(doFinal, length, com.nimbusds.jose.util.ByteUtils.byteLength(128));
                container.set(actualIVOf(cipher));
                return new com.nimbusds.jose.crypto.impl.AuthenticatedCipherText(subArray, subArray2);
            } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't encrypt with AES/GCM/NoPadding: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        } catch (java.lang.NoClassDefFoundError unused) {
            return com.nimbusds.jose.crypto.impl.LegacyAESGCM.encrypt(aESKey, bArr3, bArr, bArr2);
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            e = e2;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb2.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e);
        } catch (java.security.InvalidKeyException e3) {
            e = e3;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb22.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb22.toString(), e);
        } catch (java.security.NoSuchAlgorithmException e4) {
            e = e4;
            java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb222.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb222.toString(), e);
        } catch (javax.crypto.NoSuchPaddingException e5) {
            e = e5;
            java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb2222.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2222.toString(), e);
        }
    }

    private static byte[] actualIVOf(javax.crypto.Cipher cipher) throws com.nimbusds.jose.JOSEException {
        javax.crypto.spec.GCMParameterSpec actualParamsOf = actualParamsOf(cipher);
        byte[] iv = actualParamsOf.getIV();
        validate(iv, actualParamsOf.getTLen());
        return iv;
    }

    private static void validate(byte[] bArr, int i) throws com.nimbusds.jose.JOSEException {
        if (com.nimbusds.jose.util.ByteUtils.safeBitLength(bArr) != 96) {
            throw new com.nimbusds.jose.JOSEException(java.lang.String.format("IV length of %d bits is required, got %d", 96, java.lang.Integer.valueOf(com.nimbusds.jose.util.ByteUtils.safeBitLength(bArr))));
        }
        if (i != 128) {
            throw new com.nimbusds.jose.JOSEException(java.lang.String.format("Authentication tag length of %d bits is required, got %d", 128, java.lang.Integer.valueOf(i)));
        }
    }

    private static javax.crypto.spec.GCMParameterSpec actualParamsOf(javax.crypto.Cipher cipher) throws com.nimbusds.jose.JOSEException {
        java.security.AlgorithmParameters parameters = cipher.getParameters();
        if (parameters == null) {
            throw new com.nimbusds.jose.JOSEException("AES GCM ciphers are expected to make use of algorithm parameters");
        }
        try {
            return (javax.crypto.spec.GCMParameterSpec) parameters.getParameterSpec(javax.crypto.spec.GCMParameterSpec.class);
        } catch (java.security.spec.InvalidParameterSpecException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public static byte[] decrypt(javax.crypto.SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        javax.crypto.Cipher cipher;
        javax.crypto.SecretKey aESKey = com.nimbusds.jose.util.KeyUtils.toAESKey(secretKey);
        try {
            if (provider != null) {
                cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME, provider);
            } else {
                cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
            }
            cipher.init(2, aESKey, new javax.crypto.spec.GCMParameterSpec(128, bArr));
            cipher.updateAAD(bArr3);
            try {
                return cipher.doFinal(com.nimbusds.jose.util.ByteUtils.concat(bArr2, bArr4));
            } catch (javax.crypto.BadPaddingException | javax.crypto.IllegalBlockSizeException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AES/GCM/NoPadding decryption failed: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        } catch (java.lang.NoClassDefFoundError unused) {
            return com.nimbusds.jose.crypto.impl.LegacyAESGCM.decrypt(aESKey, bArr, bArr2, bArr3, bArr4);
        } catch (java.security.InvalidAlgorithmParameterException e2) {
            e = e2;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb2.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e);
        } catch (java.security.InvalidKeyException e3) {
            e = e3;
            java.lang.StringBuilder sb22 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb22.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb22.toString(), e);
        } catch (java.security.NoSuchAlgorithmException e4) {
            e = e4;
            java.lang.StringBuilder sb222 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb222.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb222.toString(), e);
        } catch (javax.crypto.NoSuchPaddingException e5) {
            e = e5;
            java.lang.StringBuilder sb2222 = new java.lang.StringBuilder("Couldn't create AES/GCM/NoPadding cipher: ");
            sb2222.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2222.toString(), e);
        }
    }

    private AESGCM() {
    }
}
