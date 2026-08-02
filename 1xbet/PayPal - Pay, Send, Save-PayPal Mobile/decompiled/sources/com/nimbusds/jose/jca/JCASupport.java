package com.nimbusds.jose.jca;

/* loaded from: classes10.dex */
public final class JCASupport {
    public static boolean isUnlimitedStrength() {
        return javax.crypto.Cipher.getMaxAllowedKeyLength(org.jose4j.keys.AesKey.ALGORITHM) >= 256;
    }

    public static boolean isSupported(com.nimbusds.jose.Algorithm algorithm) {
        if (algorithm instanceof com.nimbusds.jose.JWSAlgorithm) {
            return isSupported((com.nimbusds.jose.JWSAlgorithm) algorithm);
        }
        if (algorithm instanceof com.nimbusds.jose.JWEAlgorithm) {
            return isSupported((com.nimbusds.jose.JWEAlgorithm) algorithm);
        }
        if (algorithm instanceof com.nimbusds.jose.EncryptionMethod) {
            return isSupported((com.nimbusds.jose.EncryptionMethod) algorithm);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected algorithm class: ");
        sb.append(algorithm.getClass().getCanonicalName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static boolean isSupported(com.nimbusds.jose.Algorithm algorithm, java.security.Provider provider) {
        if (algorithm instanceof com.nimbusds.jose.JWSAlgorithm) {
            return isSupported((com.nimbusds.jose.JWSAlgorithm) algorithm, provider);
        }
        if (algorithm instanceof com.nimbusds.jose.JWEAlgorithm) {
            return isSupported((com.nimbusds.jose.JWEAlgorithm) algorithm, provider);
        }
        if (algorithm instanceof com.nimbusds.jose.EncryptionMethod) {
            return isSupported((com.nimbusds.jose.EncryptionMethod) algorithm, provider);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected algorithm class: ");
        sb.append(algorithm.getClass().getCanonicalName());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static boolean isSupported(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm) {
        if (jWSAlgorithm.getName().equals(com.nimbusds.jose.Algorithm.NONE.getName())) {
            return true;
        }
        for (java.security.Provider provider : java.security.Security.getProviders()) {
            if (isSupported(jWSAlgorithm, provider)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupported(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, java.security.Provider provider) {
        java.lang.String str;
        if (com.nimbusds.jose.JWSAlgorithm.Family.HMAC_SHA.contains(jWSAlgorithm)) {
            if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.HS256)) {
                str = "HMACSHA256";
            } else if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.HS384)) {
                str = "HMACSHA384";
            } else {
                if (jWSAlgorithm.equals(com.nimbusds.jose.JWSAlgorithm.HS512)) {
                    str = "HMACSHA512";
                }
                return false;
            }
            try {
                javax.crypto.Mac.getInstance(str, provider);
                return true;
            } catch (java.security.NoSuchAlgorithmException unused) {
            }
        } else {
            if (com.nimbusds.jose.JWSAlgorithm.Family.RSA.contains(jWSAlgorithm)) {
                try {
                    com.nimbusds.jose.crypto.impl.RSASSA.getSignerAndVerifier(jWSAlgorithm, provider);
                    return true;
                } catch (com.nimbusds.jose.JOSEException unused2) {
                    return false;
                }
            }
            if (com.nimbusds.jose.JWSAlgorithm.Family.EC.contains(jWSAlgorithm)) {
                try {
                    com.nimbusds.jose.crypto.impl.ECDSA.getSignerAndVerifier(jWSAlgorithm, provider);
                    return true;
                } catch (com.nimbusds.jose.JOSEException unused3) {
                }
            }
            return false;
        }
    }

    public static boolean isSupported(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm) {
        for (java.security.Provider provider : java.security.Security.getProviders()) {
            if (isSupported(jWEAlgorithm, provider)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupported(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, java.security.Provider provider) {
        java.lang.String str;
        java.lang.String str2;
        if (com.nimbusds.jose.JWEAlgorithm.Family.RSA.contains(jWEAlgorithm)) {
            if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.RSA1_5)) {
                str2 = "RSA/ECB/PKCS1Padding";
            } else if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP)) {
                str2 = "RSA/ECB/OAEPWithSHA-1AndMGF1Padding";
            } else if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256)) {
                str2 = "RSA/ECB/OAEPWithSHA-256AndMGF1Padding";
            } else {
                if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_512)) {
                    str2 = "RSA/ECB/OAEPWithSHA-512AndMGF1Padding";
                }
                return false;
            }
            try {
                javax.crypto.Cipher.getInstance(str2, provider);
                return true;
            } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
            }
        } else {
            if (com.nimbusds.jose.JWEAlgorithm.Family.AES_KW.contains(jWEAlgorithm)) {
                return provider.getService("Cipher", "AESWrap") != null;
            }
            if (com.nimbusds.jose.JWEAlgorithm.Family.ECDH_ES.contains(jWEAlgorithm)) {
                return provider.getService("KeyAgreement", "ECDH") != null;
            }
            if (com.nimbusds.jose.JWEAlgorithm.Family.AES_GCM_KW.contains(jWEAlgorithm)) {
                try {
                    javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME, provider);
                    return true;
                } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused2) {
                    return false;
                }
            }
            if (com.nimbusds.jose.JWEAlgorithm.Family.PBES2.contains(jWEAlgorithm)) {
                if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.PBES2_HS256_A128KW)) {
                    str = org.jose4j.mac.MacUtil.HMAC_SHA256;
                } else if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.PBES2_HS384_A192KW)) {
                    str = org.jose4j.mac.MacUtil.HMAC_SHA384;
                } else {
                    str = org.jose4j.mac.MacUtil.HMAC_SHA512;
                }
                return provider.getService("KeyGenerator", str) != null;
            }
            return com.nimbusds.jose.JWEAlgorithm.DIR.equals(jWEAlgorithm);
        }
    }

    public static boolean isSupported(com.nimbusds.jose.EncryptionMethod encryptionMethod) {
        for (java.security.Provider provider : java.security.Security.getProviders()) {
            if (isSupported(encryptionMethod, provider)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSupported(com.nimbusds.jose.EncryptionMethod encryptionMethod, java.security.Provider provider) {
        java.lang.String str;
        if (com.nimbusds.jose.EncryptionMethod.Family.AES_CBC_HMAC_SHA.contains(encryptionMethod)) {
            try {
                javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding", provider);
                if (encryptionMethod.equals(com.nimbusds.jose.EncryptionMethod.A128CBC_HS256)) {
                    str = org.jose4j.mac.MacUtil.HMAC_SHA256;
                } else if (encryptionMethod.equals(com.nimbusds.jose.EncryptionMethod.A192CBC_HS384)) {
                    str = org.jose4j.mac.MacUtil.HMAC_SHA384;
                } else {
                    str = org.jose4j.mac.MacUtil.HMAC_SHA512;
                }
            } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused) {
            }
            return provider.getService("KeyGenerator", str) != null;
        }
        if (com.nimbusds.jose.EncryptionMethod.Family.AES_GCM.contains(encryptionMethod)) {
            try {
                javax.crypto.Cipher.getInstance(org.jose4j.jwe.SimpleAeadCipher.GCM_TRANSFORMATION_NAME, provider);
                return true;
            } catch (java.security.NoSuchAlgorithmException | javax.crypto.NoSuchPaddingException unused2) {
            }
        }
        return false;
    }

    private JCASupport() {
    }
}
