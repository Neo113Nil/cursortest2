package org.jose4j.lang;

/* loaded from: classes18.dex */
public class HashUtil {
    public static final java.lang.String SHA_256 = "SHA-256";

    public static java.security.MessageDigest getMessageDigest(java.lang.String str) {
        return getMessageDigest(str, null);
    }

    public static java.security.MessageDigest getMessageDigest(java.lang.String str, java.lang.String str2) {
        try {
            return str2 == null ? java.security.MessageDigest.getInstance(str) : java.security.MessageDigest.getInstance(str, str2);
        } catch (java.security.NoSuchAlgorithmException unused) {
            throw new org.jose4j.lang.UncheckedJoseException("Unable to get MessageDigest instance with ".concat(java.lang.String.valueOf(str)));
        } catch (java.security.NoSuchProviderException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to get a MessageDigest implementation of algorithm name: ");
            sb.append(str);
            sb.append(" using provider ");
            sb.append(str2);
            throw new org.jose4j.lang.UncheckedJoseException(sb.toString(), e);
        }
    }
}
