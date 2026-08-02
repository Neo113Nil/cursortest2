package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class CipherHelper {
    public static javax.crypto.Cipher getInstance(java.lang.String str, java.security.Provider provider) throws java.security.NoSuchAlgorithmException, javax.crypto.NoSuchPaddingException {
        if (provider == null) {
            return javax.crypto.Cipher.getInstance(str);
        }
        return javax.crypto.Cipher.getInstance(str, provider);
    }
}
