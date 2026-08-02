package com.nimbusds.jose.crypto.impl;

/* loaded from: classes4.dex */
public class AlgorithmSupportMessage {
    private static java.lang.String itemize(java.util.Collection collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] array = collection.toArray();
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (i < array.length - 1) {
                    sb.append(", ");
                } else if (i == array.length - 1) {
                    sb.append(" or ");
                }
            }
            sb.append(array[i].toString());
        }
        return sb.toString();
    }

    public static java.lang.String unsupportedJWSAlgorithm(com.nimbusds.jose.JWSAlgorithm jWSAlgorithm, java.util.Collection<com.nimbusds.jose.JWSAlgorithm> collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported JWS algorithm ");
        sb.append(jWSAlgorithm);
        sb.append(", must be ");
        sb.append(itemize(collection));
        return sb.toString();
    }

    public static java.lang.String unsupportedJWEAlgorithm(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, java.util.Collection<com.nimbusds.jose.JWEAlgorithm> collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported JWE algorithm ");
        sb.append(jWEAlgorithm);
        sb.append(", must be ");
        sb.append(itemize(collection));
        return sb.toString();
    }

    public static java.lang.String unsupportedEncryptionMethod(com.nimbusds.jose.EncryptionMethod encryptionMethod, java.util.Collection<com.nimbusds.jose.EncryptionMethod> collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported JWE encryption method ");
        sb.append(encryptionMethod);
        sb.append(", must be ");
        sb.append(itemize(collection));
        return sb.toString();
    }

    public static java.lang.String unsupportedEllipticCurve(com.nimbusds.jose.jwk.Curve curve, java.util.Collection<com.nimbusds.jose.jwk.Curve> collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported elliptic curve ");
        sb.append(curve);
        sb.append(", must be ");
        sb.append(itemize(collection));
        return sb.toString();
    }

    private AlgorithmSupportMessage() {
    }
}
