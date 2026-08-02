package com.nimbusds.jose.jwk;

/* loaded from: classes10.dex */
public class KeyConverter {
    public static java.util.List<java.security.Key> toJavaKeys(java.util.List<com.nimbusds.jose.jwk.JWK> list) {
        if (list == null) {
            return java.util.Collections.emptyList();
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (java.lang.Object obj : list) {
            if (obj instanceof com.nimbusds.jose.jwk.AsymmetricJWK) {
                try {
                    java.security.KeyPair keyPair = ((com.nimbusds.jose.jwk.AsymmetricJWK) obj).toKeyPair();
                    linkedList.add(keyPair.getPublic());
                    if (keyPair.getPrivate() != null) {
                        linkedList.add(keyPair.getPrivate());
                    }
                } catch (com.nimbusds.jose.JOSEException unused) {
                }
            } else if (obj instanceof com.nimbusds.jose.jwk.SecretJWK) {
                linkedList.add(((com.nimbusds.jose.jwk.SecretJWK) obj).toSecretKey());
            }
        }
        return linkedList;
    }
}
