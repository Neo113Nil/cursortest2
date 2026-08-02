package org.jose4j.jwe;

/* loaded from: classes18.dex */
public class CipherUtil {
    static javax.crypto.Cipher getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2) throws org.jose4j.lang.JoseException {
        try {
            return str2 == null ? javax.crypto.Cipher.getInstance(str) : javax.crypto.Cipher.getInstance(str, str2);
        } catch (java.security.NoSuchAlgorithmException e) {
            e = e;
            throw new org.jose4j.lang.JoseException(e.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to get a Cipher implementation of ");
            sb.append(str);
            sb.append(" using provider ");
            sb.append(str2);
            throw new org.jose4j.lang.JoseException(sb.toString(), e2);
        } catch (javax.crypto.NoSuchPaddingException e3) {
            e = e3;
            throw new org.jose4j.lang.JoseException(e.toString(), e);
        }
    }
}
