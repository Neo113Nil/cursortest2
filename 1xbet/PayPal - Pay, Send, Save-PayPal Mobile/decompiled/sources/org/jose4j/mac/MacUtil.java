package org.jose4j.mac;

/* loaded from: classes18.dex */
public class MacUtil {
    public static final java.lang.String HMAC_SHA256 = "HmacSHA256";
    public static final java.lang.String HMAC_SHA384 = "HmacSHA384";
    public static final java.lang.String HMAC_SHA512 = "HmacSHA512";

    public static javax.crypto.Mac getInitializedMac(java.lang.String str, java.security.Key key) throws org.jose4j.lang.JoseException {
        return getInitializedMac(str, key, null);
    }

    public static javax.crypto.Mac getInitializedMac(java.lang.String str, java.security.Key key, java.lang.String str2) throws org.jose4j.lang.JoseException {
        javax.crypto.Mac mac = getMac(str, str2);
        initMacWithKey(mac, key);
        return mac;
    }

    public static javax.crypto.Mac getMac(java.lang.String str) throws org.jose4j.lang.JoseException {
        return getMac(str, null);
    }

    public static javax.crypto.Mac getMac(java.lang.String str, java.lang.String str2) throws org.jose4j.lang.JoseException {
        try {
            return str2 == null ? javax.crypto.Mac.getInstance(str) : javax.crypto.Mac.getInstance(str, str2);
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new org.jose4j.lang.JoseException("Unable to get a MAC implementation of algorithm name: ".concat(java.lang.String.valueOf(str)), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to get a MAC implementation of algorithm name: ");
            sb.append(str);
            sb.append(" using provider ");
            sb.append(str2);
            throw new org.jose4j.lang.JoseException(sb.toString(), e2);
        }
    }

    public static void initMacWithKey(javax.crypto.Mac mac, java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        try {
            mac.init(key);
        } catch (java.security.InvalidKeyException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Key is not valid for ");
            sb.append(mac.getAlgorithm());
            sb.append(" - ");
            sb.append(e);
            throw new org.jose4j.lang.InvalidKeyException(sb.toString(), e);
        }
    }
}
