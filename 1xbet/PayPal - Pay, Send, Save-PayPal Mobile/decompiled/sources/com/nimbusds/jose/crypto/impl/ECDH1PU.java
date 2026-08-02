package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class ECDH1PU {
    public static com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm) throws com.nimbusds.jose.JOSEException {
        java.util.Objects.requireNonNull(jWEAlgorithm, "The parameter \"alg\" must not be null");
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU)) {
            return com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT;
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A128KW) || jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A192KW) || jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A256KW)) {
            return com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW;
        }
        throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, com.nimbusds.jose.crypto.impl.ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
    }

    public static int sharedKeyLength(com.nimbusds.jose.JWEAlgorithm jWEAlgorithm, com.nimbusds.jose.EncryptionMethod encryptionMethod) throws com.nimbusds.jose.JOSEException {
        java.util.Objects.requireNonNull(jWEAlgorithm, "The parameter \"alg\" must not be null");
        java.util.Objects.requireNonNull(encryptionMethod, "The parameter \"enc\" must not be null");
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU)) {
            int cekBitLength = encryptionMethod.cekBitLength();
            if (cekBitLength != 0) {
                return cekBitLength;
            }
            throw new com.nimbusds.jose.JOSEException("Unsupported JWE encryption method ".concat(java.lang.String.valueOf(encryptionMethod)));
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A128KW)) {
            return 128;
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A192KW)) {
            return 192;
        }
        if (jWEAlgorithm.equals(com.nimbusds.jose.JWEAlgorithm.ECDH_1PU_A256KW)) {
            return 256;
        }
        throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(jWEAlgorithm, com.nimbusds.jose.crypto.impl.ECDHCryptoProvider.SUPPORTED_ALGORITHMS));
    }

    public static javax.crypto.SecretKey deriveSharedKey(com.nimbusds.jose.JWEHeader jWEHeader, javax.crypto.SecretKey secretKey, com.nimbusds.jose.crypto.impl.ConcatKDF concatKDF) throws com.nimbusds.jose.JOSEException {
        java.lang.String name2;
        java.util.Objects.requireNonNull(jWEHeader, "The parameter \"header\" must not be null");
        java.util.Objects.requireNonNull(secretKey, "The parameter \"Z\" must not be null");
        java.util.Objects.requireNonNull(concatKDF, "The parameter \"concatKDF\" must not be null");
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

    public static javax.crypto.SecretKey deriveSharedKey(com.nimbusds.jose.JWEHeader jWEHeader, javax.crypto.SecretKey secretKey, com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.crypto.impl.ConcatKDF concatKDF) throws com.nimbusds.jose.JOSEException {
        java.lang.String name2;
        java.util.Objects.requireNonNull(jWEHeader, "The parameter \"header\" must not be null");
        java.util.Objects.requireNonNull(secretKey, "The parameter \"Z\" must not be null");
        java.util.Objects.requireNonNull(base64URL, "The parameter \"tag\" must not be null");
        java.util.Objects.requireNonNull(concatKDF, "The parameter \"concatKDF\" must not be null");
        int sharedKeyLength = sharedKeyLength(jWEHeader.getAlgorithm(), jWEHeader.getEncryptionMethod());
        com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode resolveAlgorithmMode = resolveAlgorithmMode(jWEHeader.getAlgorithm());
        if (resolveAlgorithmMode == com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.DIRECT) {
            name2 = jWEHeader.getEncryptionMethod().getName();
        } else if (resolveAlgorithmMode == com.nimbusds.jose.crypto.impl.ECDH.AlgorithmMode.KW) {
            name2 = jWEHeader.getAlgorithm().getName();
        } else {
            throw new com.nimbusds.jose.JOSEException("Unsupported JWE ECDH algorithm mode: ".concat(java.lang.String.valueOf(resolveAlgorithmMode)));
        }
        return concatKDF.deriveKey(secretKey, sharedKeyLength, com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(name2.getBytes(java.nio.charset.StandardCharsets.US_ASCII)), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyUInfo()), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(jWEHeader.getAgreementPartyVInfo()), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeIntData(sharedKeyLength), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeNoData(), com.nimbusds.jose.crypto.impl.ConcatKDF.encodeDataWithLength(base64URL));
    }

    public static javax.crypto.SecretKey deriveZ(javax.crypto.SecretKey secretKey, javax.crypto.SecretKey secretKey2) {
        java.util.Objects.requireNonNull(secretKey, "The parameter \"Ze\" must not be null");
        java.util.Objects.requireNonNull(secretKey2, "The parameter \"Zs\" must not be null");
        byte[] concat = com.nimbusds.jose.util.ByteUtils.concat(secretKey.getEncoded(), secretKey2.getEncoded());
        return new javax.crypto.spec.SecretKeySpec(concat, 0, concat.length, org.jose4j.keys.AesKey.ALGORITHM);
    }

    public static javax.crypto.SecretKey deriveSenderZ(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPrivateKey eCPrivateKey2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        validateSameCurve(eCPrivateKey, eCPublicKey);
        validateSameCurve(eCPrivateKey2, eCPublicKey);
        return deriveZ(com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(eCPublicKey, eCPrivateKey2, provider), com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(eCPublicKey, eCPrivateKey, provider));
    }

    public static javax.crypto.SecretKey deriveSenderZ(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair3) throws com.nimbusds.jose.JOSEException {
        validateSameCurve(octetKeyPair, octetKeyPair2);
        validateSameCurve(octetKeyPair3, octetKeyPair2);
        return deriveZ(com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(octetKeyPair2, octetKeyPair3), com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(octetKeyPair2, octetKeyPair));
    }

    public static javax.crypto.SecretKey deriveRecipientZ(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey, java.security.interfaces.ECPublicKey eCPublicKey2, java.security.Provider provider) throws com.nimbusds.jose.JOSEException {
        validateSameCurve(eCPrivateKey, eCPublicKey);
        validateSameCurve(eCPrivateKey, eCPublicKey2);
        return deriveZ(com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(eCPublicKey2, eCPrivateKey, provider), com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(eCPublicKey, eCPrivateKey, provider));
    }

    public static javax.crypto.SecretKey deriveRecipientZ(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair3) throws com.nimbusds.jose.JOSEException {
        validateSameCurve(octetKeyPair, octetKeyPair2);
        validateSameCurve(octetKeyPair, octetKeyPair3);
        return deriveZ(com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(octetKeyPair3, octetKeyPair), com.nimbusds.jose.crypto.impl.ECDH.deriveSharedSecret(octetKeyPair2, octetKeyPair));
    }

    public static void validateSameCurve(java.security.interfaces.ECPrivateKey eCPrivateKey, java.security.interfaces.ECPublicKey eCPublicKey) throws com.nimbusds.jose.JOSEException {
        java.util.Objects.requireNonNull(eCPrivateKey, "The parameter \"privateKey\" must not be null");
        java.util.Objects.requireNonNull(eCPublicKey, "The parameter \"publicKey\" must not be null");
        if (!eCPrivateKey.getParams().getCurve().equals(eCPublicKey.getParams().getCurve())) {
            throw new com.nimbusds.jose.JOSEException("Curve of public key does not match curve of private key");
        }
        if (!com.nimbusds.jose.crypto.utils.ECChecks.isPointOnCurve(eCPublicKey, eCPrivateKey)) {
            throw new com.nimbusds.jose.JOSEException("Invalid public EC key: Point(s) not on the expected curve");
        }
    }

    public static void validateSameCurve(com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair, com.nimbusds.jose.jwk.OctetKeyPair octetKeyPair2) throws com.nimbusds.jose.JOSEException {
        java.util.Objects.requireNonNull(octetKeyPair, "The parameter \"privateKey\" must not be null");
        java.util.Objects.requireNonNull(octetKeyPair2, "The parameter \"publicKey\" must not be null");
        if (!octetKeyPair.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("OKP private key should be a private key");
        }
        if (octetKeyPair2.isPrivate()) {
            throw new com.nimbusds.jose.JOSEException("OKP public key should not be a private key");
        }
        if (!octetKeyPair2.getCurve().equals(com.nimbusds.jose.jwk.Curve.X25519)) {
            throw new com.nimbusds.jose.JOSEException("Only supports OctetKeyPairs with crv=X25519");
        }
        if (!octetKeyPair.getCurve().equals(octetKeyPair2.getCurve())) {
            throw new com.nimbusds.jose.JOSEException("Curve of public key does not match curve of private key");
        }
    }

    private ECDH1PU() {
    }
}
