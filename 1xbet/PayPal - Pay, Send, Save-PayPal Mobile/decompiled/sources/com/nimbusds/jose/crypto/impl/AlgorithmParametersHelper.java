package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class AlgorithmParametersHelper {
    public static java.security.AlgorithmParameters getInstance(java.lang.String str, java.security.Provider provider) throws java.security.NoSuchAlgorithmException {
        if (provider == null) {
            return java.security.AlgorithmParameters.getInstance(str);
        }
        return java.security.AlgorithmParameters.getInstance(str, provider);
    }
}
