package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes4.dex */
public class HMAC {
    public static javax.crypto.Mac getInitMac(javax.crypto.SecretKey secretKey, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        return getInitMac(secretKey.getAlgorithm(), secretKey, provider);
    }

    public static javax.crypto.Mac getInitMac(java.lang.String str, javax.crypto.SecretKey secretKey, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        javax.crypto.Mac mac;
        try {
            if (provider != null) {
                mac = javax.crypto.Mac.getInstance(str, provider);
            } else {
                mac = javax.crypto.Mac.getInstance(str);
            }
            mac.init(secretKey);
            return mac;
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid HMAC key: ");
            sb.append(e.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unsupported HMAC algorithm: ");
            sb2.append(e2.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e2);
        }
    }

    @java.lang.Deprecated
    public static byte[] compute(java.lang.String str, byte[] bArr, byte[] bArr2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        return compute(str, new javax.crypto.spec.SecretKeySpec(bArr, str), bArr2, provider);
    }

    public static byte[] compute(java.lang.String str, javax.crypto.SecretKey secretKey, byte[] bArr, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        javax.crypto.Mac initMac = getInitMac(str, secretKey, provider);
        initMac.update(bArr);
        return initMac.doFinal();
    }

    public static byte[] compute(javax.crypto.SecretKey secretKey, byte[] bArr, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        return compute(secretKey.getAlgorithm(), secretKey, bArr, provider);
    }
}
