package com.google.crypto.tink.integration.android;

/* loaded from: classes4.dex */
public final class AndroidKeystore {
    private static boolean isAtLeastM() {
        return true;
    }

    public static void generateNewAes256GcmKey(java.lang.String str) throws java.security.GeneralSecurityException {
        generateNewKeyWithSpec(new android.security.keystore.KeyGenParameterSpec.Builder(str, 3).setKeySize(256).setBlockModes(com.google.android.gms.stats.CodePackage.GCM).setEncryptionPaddings("NoPadding").build());
    }

    public static void generateNewKeyWithSpec(android.security.keystore.KeyGenParameterSpec keyGenParameterSpec) throws java.security.GeneralSecurityException {
        javax.crypto.KeyGenerator keyGenerator = javax.crypto.KeyGenerator.getInstance(org.jose4j.keys.AesKey.ALGORITHM, "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpec);
        keyGenerator.generateKey();
    }

    public static com.google.crypto.tink.Aead getAead(java.lang.String str) throws java.security.GeneralSecurityException {
        return new com.google.crypto.tink.integration.android.AndroidKeystore.AeadImpl(str, getAndroidKeyStore());
    }

    public static void deleteKey(java.lang.String str) throws java.security.GeneralSecurityException {
        getAndroidKeyStore().deleteEntry(str);
    }

    public static boolean hasKey(java.lang.String str) throws java.security.GeneralSecurityException {
        return getAndroidKeyStore().containsAlias(str);
    }

    private static java.security.KeyStore getAndroidKeyStore() throws java.security.GeneralSecurityException {
        if (!isAtLeastM()) {
            throw new java.lang.IllegalStateException("Need Android Keystore on Android M or newer");
        }
        try {
            java.security.KeyStore keyStore = java.security.KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (java.io.IOException e) {
            throw new java.security.GeneralSecurityException(e);
        }
    }

    static final class AeadImpl implements com.google.crypto.tink.Aead {
        private static final int IV_SIZE_IN_BYTES = 12;
        private static final int TAG_SIZE_IN_BYTES = 16;
        private final javax.crypto.SecretKey key;

        public AeadImpl(java.lang.String str, java.security.KeyStore keyStore) throws java.security.GeneralSecurityException {
            javax.crypto.SecretKey secretKey = (javax.crypto.SecretKey) keyStore.getKey(str, null);
            this.key = secretKey;
            if (secretKey == null) {
                throw new java.security.InvalidKeyException("Keystore cannot load the key with ID: ".concat(java.lang.String.valueOf(str)));
            }
        }

        @Override // com.google.crypto.tink.Aead
        public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            if (bArr.length > 2147483619) {
                throw new java.security.GeneralSecurityException("plaintext too long");
            }
            byte[] bArr3 = new byte[bArr.length + 28];
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
            cipher.init(1, this.key);
            cipher.updateAAD(bArr2);
            if (cipher.doFinal(bArr, 0, bArr.length, bArr3, 12) != bArr.length + 16) {
                throw new java.security.GeneralSecurityException("encryption failed: bytesWritten is wrong");
            }
            byte[] iv = cipher.getIV();
            if (iv.length != 12) {
                throw new java.security.GeneralSecurityException("IV has unexpected length");
            }
            java.lang.System.arraycopy(iv, 0, bArr3, 0, 12);
            return bArr3;
        }

        @Override // com.google.crypto.tink.Aead
        public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
            if (bArr.length < 28) {
                throw new javax.crypto.BadPaddingException("ciphertext too short");
            }
            javax.crypto.spec.GCMParameterSpec gCMParameterSpec = new javax.crypto.spec.GCMParameterSpec(128, bArr, 0, 12);
            javax.crypto.Cipher cipher = javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
            cipher.init(2, this.key, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
    }

    private AndroidKeystore() {
    }
}
