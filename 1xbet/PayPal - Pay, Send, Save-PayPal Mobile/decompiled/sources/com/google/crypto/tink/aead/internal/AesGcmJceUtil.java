package com.google.crypto.tink.aead.internal;

/* loaded from: classes4.dex */
public final class AesGcmJceUtil {
    public static final int IV_SIZE_IN_BYTES = 12;
    public static final int TAG_SIZE_IN_BYTES = 16;
    private static final java.lang.ThreadLocal<javax.crypto.Cipher> localCipher = new java.lang.ThreadLocal<javax.crypto.Cipher>() { // from class: com.google.crypto.tink.aead.internal.AesGcmJceUtil.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        public javax.crypto.Cipher initialValue() {
            try {
                return com.google.crypto.tink.subtle.EngineFactory.CIPHER.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME);
            } catch (java.security.GeneralSecurityException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
    };

    public static javax.crypto.Cipher getThreadLocalCipher() {
        return localCipher.get();
    }

    public static javax.crypto.SecretKey getSecretKey(byte[] bArr) throws java.security.GeneralSecurityException {
        com.google.crypto.tink.subtle.Validators.validateAesKeySize(bArr.length);
        return new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM);
    }

    public static java.security.spec.AlgorithmParameterSpec getParams(byte[] bArr) {
        return getParams(bArr, 0, bArr.length);
    }

    public static java.security.spec.AlgorithmParameterSpec getParams(byte[] bArr, int i, int i2) {
        java.lang.Integer androidApiLevel = com.google.crypto.tink.internal.Util.getAndroidApiLevel();
        if (androidApiLevel != null && androidApiLevel.intValue() <= 19) {
            return new javax.crypto.spec.IvParameterSpec(bArr, i, i2);
        }
        return new javax.crypto.spec.GCMParameterSpec(128, bArr, i, i2);
    }

    private AesGcmJceUtil() {
    }
}
