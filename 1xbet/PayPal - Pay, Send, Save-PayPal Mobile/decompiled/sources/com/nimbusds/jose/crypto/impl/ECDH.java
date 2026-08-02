package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class ECDH {

    public enum AlgorithmMode {
        DIRECT,
        KW
    }

    public static com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm) throws com.nimbusds.jose.JOSEException {
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES)) {
            return com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT;
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A128KW) || jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A192KW) || jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A256KW)) {
            return com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW;
        }
        throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, com.nimbusds.jose.crypto.impl.ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
    }

    public static int sharedKeyLength(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, com.nimbusds.jose.EncryptionMethod encryptionMethod) throws com.nimbusds.jose.JOSEException {
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES)) {
            int cekBitLength = encryptionMethod.cekBitLength();
            if (cekBitLength != 0) {
                return cekBitLength;
            }
            throw new com.nimbusds.jose.JOSEException("Unsupported JWE encryption method ".concat(java.lang.String.valueOf(encryptionMethod)));
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A128KW)) {
            return 128;
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A192KW)) {
            return 192;
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_ES_A256KW)) {
            return 256;
        }
        throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, com.nimbusds.jose.crypto.impl.ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
    }

    public static javax.crypto.SecretKey deriveSharedSecret(java.security.interfaces.ECPublicKey eCPublicKey, java.security.PrivateKey privateKey, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        javax.crypto.KeyAgreement keyAgreement;
        try {
            if (provider != null) {
                keyAgreement = javax.crypto.KeyAgreement.getInstance("ECDH", provider);
            } else {
                keyAgreement = javax.crypto.KeyAgreement.getInstance("ECDH");
            }
            try {
                keyAgreement.init(privateKey);
                keyAgreement.doPhase(eCPublicKey, true);
                return new javax.crypto.spec.SecretKeySpec(keyAgreement.generateSecret(), org.jose4j.keys.AesKey.ALGORITHM);
            } catch (java.security.InvalidKeyException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid key for ECDH key agreement: ");
                sb.append(e.getMessage());
                throw new com.nimbusds.jose.JOSEException(sb.toString(), e);
            }
        } catch (java.security.NoSuchAlgorithmException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Couldn't get an ECDH key agreement instance: ");
            sb2.append(e2.getMessage());
            throw new com.nimbusds.jose.JOSEException(sb2.toString(), e2);
        }
    }

    public static javax.crypto.SecretKey deriveSharedSecret(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2) throws com.nimbusds.jose.JOSEException {
        if (octetKeyPair.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("Expected public key but received OKP with 'd' value");
        }
        if (!com.nimbusds.jose.jwk.Curve.X25519.equals(octetKeyPair.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("Expected public key OKP with crv=X25519");
        }
        if (!octetKeyPair2.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("Expected private key but received OKP without 'd' value");
        }
        if (!com.nimbusds.jose.jwk.Curve.X25519.equals(octetKeyPair2.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("Expected private key OKP with crv=X25519");
        }
        try {
            return new javax.crypto.spec.SecretKeySpec(com.google.crypto.tink.subtle.X25519.computeSharedSecret(octetKeyPair2.getDecodedD(), octetKeyPair.getDecodedX()), org.jose4j.keys.AesKey.ALGORITHM);
        } catch (java.security.InvalidKeyException e) {
            throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
        }
    }

    public static javax.crypto.SecretKey deriveSharedKey(com.nimbusds.jose.JWEHeader jWEHeader, javax.crypto.SecretKey secretKey, com.nimbusds.jose.crypto.impl.ConcatKDF concatKDF) throws com.nimbusds.jose.JOSEException {
        java.lang.String name2;
        int sharedKeyLength = sharedKeyLength(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod());
        com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode = resolveAlgorithmMode(jWEHeader.getAlgorithm());
        if (resolveAlgorithmMode == com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT) {
            name2 = jWEHeader.getEncryptionMethod().getName();
        } else if (resolveAlgorithmMode == com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW) {
            name2 = jWEHeader.getAlgorithm().getName();
        } else {
            throw new com.nimbusds.jose.JOSEException("Unsupported JWE ECDH algorithm mode: ".concat(java.lang.String.valueOf(resolveAlgorithmMode)));
        }
        return concatKDF.deriveKey(secretKey, sharedKeyLength, com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(name2.getBytes(java.nio.charset.StandardCharsets.US_ASCII)), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyUInfo()), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyVInfo()), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeIntData(sharedKeyLength), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeNoData());
    }

    private ECDH() {
    }
}
