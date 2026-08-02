package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class AESEncrypter extends com.nimbusds.jose.crypto.impl.AESCryptoProvider implements com.nimbusds.jose.JWEEncrypter {

    enum AlgFamily {
        AESKW,
        AESGCMKW
    }

    public AESEncrypter(javax.crypto.SecretKey secretKey, javax.crypto.SecretKey secretKey2) throws com.nimbusds.jose.KeyLengthException {
        super(secretKey, secretKey2);
    }

    public AESEncrypter(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        this(secretKey, null);
    }

    public AESEncrypter(byte[] bArr) throws com.nimbusds.jose.KeyLengthException {
        this(new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM));
    }

    public AESEncrypter(com.nimbusds.jose.jwk.OctetSequenceKey octetSequenceKey) throws com.nimbusds.jose.KeyLengthException {
        this(octetSequenceKey.toSecretKey(org.jose4j.keys.AesKey.ALGORITHM));
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.crypto.AESEncrypter.AlgFamily algFamily;
        com.nimbusds.jose.JWEHeader build;
        com.nimbusds.jose.util.Base64URL base64URL;
        com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader);
        com.nimbusds.jose.EncryptionMethod encryptionMethod = jWEHeader.getEncryptionMethod();
        if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A128KW)) {
            if (com.nimbusds.jose.util.ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
                throw new com.nimbusds.jose.KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128KW encryption");
            }
            algFamily = com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESKW;
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A192KW)) {
            if (com.nimbusds.jose.util.ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
                throw new com.nimbusds.jose.KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192KW encryption");
            }
            algFamily = com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESKW;
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A256KW)) {
            if (com.nimbusds.jose.util.ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
                throw new com.nimbusds.jose.KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256KW encryption");
            }
            algFamily = com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESKW;
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A128GCMKW)) {
            if (com.nimbusds.jose.util.ByteUtils.safeBitLength(getKey().getEncoded()) != 128) {
                throw new com.nimbusds.jose.KeyLengthException("The Key Encryption Key (KEK) length must be 128 bits for A128GCMKW encryption");
            }
            algFamily = com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESGCMKW;
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A192GCMKW)) {
            if (com.nimbusds.jose.util.ByteUtils.safeBitLength(getKey().getEncoded()) != 192) {
                throw new com.nimbusds.jose.KeyLengthException("The Key Encryption Key (KEK) length must be 192 bits for A192GCMKW encryption");
            }
            algFamily = com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESGCMKW;
        } else if (algorithmAndEnsureNotNull.equals(com.nimbusds.jose.JWEAlgorithm.A256GCMKW)) {
            if (com.nimbusds.jose.util.ByteUtils.safeBitLength(getKey().getEncoded()) != 256) {
                throw new com.nimbusds.jose.KeyLengthException("The Key Encryption Key (KEK) length must be 256 bits for A256GCMKW encryption");
            }
            algFamily = com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESGCMKW;
        } else {
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedJWEAlgorithm(algorithmAndEnsureNotNull, SUPPORTED_ALGORITHMS));
        }
        javax.crypto.SecretKey cek = getCEK(encryptionMethod);
        if (com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESKW.equals(algFamily)) {
            build = jWEHeader;
            base64URL = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.crypto.impl.AESKW.wrapCEK(cek, getKey(), getJCAContext().getKeyEncryptionProvider()));
        } else if (com.nimbusds.jose.crypto.AESEncrypter.AlgFamily.AESGCMKW.equals(algFamily)) {
            com.nimbusds.jose.util.Container container = new com.nimbusds.jose.util.Container(com.nimbusds.jose.crypto.impl.AESGCM.generateIV(getJCAContext().getSecureRandom()));
            com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encryptCEK = com.nimbusds.jose.crypto.impl.AESGCMKW.encryptCEK(cek, container, getKey(), getJCAContext().getKeyEncryptionProvider());
            com.nimbusds.jose.util.Base64URL encode = com.nimbusds.jose.util.Base64URL.encode(encryptCEK.getCipherText());
            build = new com.nimbusds.jose.JWEHeader.Builder(jWEHeader).iv(com.nimbusds.jose.util.Base64URL.encode((byte[]) container.get())).authTag(com.nimbusds.jose.util.Base64URL.encode(encryptCEK.getAuthenticationTag())).build();
            base64URL = encode;
        } else {
            throw new com.nimbusds.jose.JOSEException("Unexpected JWE algorithm: ".concat(java.lang.String.valueOf(algorithmAndEnsureNotNull)));
        }
        if (java.util.Arrays.equals(com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader), bArr2)) {
            bArr2 = com.nimbusds.jose.crypto.impl.AAD.compute(build);
        }
        return com.nimbusds.jose.crypto.impl.ContentCryptoProvider.encrypt(build, bArr, bArr2, cek, base64URL, getJCAContext());
    }
}
