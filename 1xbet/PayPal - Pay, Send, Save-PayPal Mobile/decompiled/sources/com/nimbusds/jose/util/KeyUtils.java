package com.nimbusds.jose.util;

/* loaded from: classes10.dex */
public class KeyUtils {
    public static javax.crypto.SecretKey toAESKey(final javax.crypto.SecretKey secretKey) {
        return (secretKey == null || secretKey.getAlgorithm().equals(org.jose4j.keys.AesKey.ALGORITHM)) ? secretKey : new javax.crypto.SecretKey() { // from class: com.nimbusds.jose.util.KeyUtils.1
            @Override // java.security.Key
            public java.lang.String getAlgorithm() {
                return org.jose4j.keys.AesKey.ALGORITHM;
            }

            @Override // java.security.Key
            public java.lang.String getFormat() {
                return secretKey.getFormat();
            }

            @Override // java.security.Key
            public byte[] getEncoded() {
                return secretKey.getEncoded();
            }
        };
    }

    private KeyUtils() {
    }
}
