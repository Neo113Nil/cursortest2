package com.nimbusds.jose.crypto;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class MultiEncrypter extends com.nimbusds.jose.crypto.impl.MultiCryptoProvider implements com.nimbusds.jose.JWEEncrypter {
    private static final java.lang.String[] RECIPIENT_HEADER_PARAMS = {"kid", "alg", "x5u", "x5t", "x5t#S256", "x5c"};
    private final com.nimbusds.jose.jwk.JWKSet keys;

    public MultiEncrypter(com.nimbusds.jose.jwk.JWKSet jWKSet) throws com.nimbusds.jose.KeyLengthException {
        this(jWKSet, findDirectCEK(jWKSet));
    }

    public MultiEncrypter(com.nimbusds.jose.jwk.JWKSet jWKSet, javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        super(secretKey);
        if (jWKSet == null) {
            throw new java.lang.IllegalArgumentException("The JWK set must not be null");
        }
        for (com.nimbusds.jose.jwk.JWK jwk : jWKSet.getKeys()) {
            com.nimbusds.jose.jwk.KeyType keyType = jwk.getKeyType();
            if (jwk.getAlgorithm() == null) {
                throw new java.lang.IllegalArgumentException("Each JWK must specify a key encryption algorithm");
            }
            com.nimbusds.jose.JWEAlgorithm parse = com.nimbusds.jose.JWEAlgorithm.parse(jwk.getAlgorithm().toString());
            if (com.nimbusds.jose.JWEAlgorithm.DIR.equals(parse) && com.nimbusds.jose.jwk.KeyType.OCT.equals(keyType) && !jwk.toOctetSequenceKey().toSecretKey(org.jose4j.keys.AesKey.ALGORITHM).equals(secretKey)) {
                throw new java.lang.IllegalArgumentException("Bad CEK");
            }
            if (!com.nimbusds.jose.jwk.KeyType.RSA.equals(keyType) || !com.nimbusds.jose.crypto.RSAEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                if (!com.nimbusds.jose.jwk.KeyType.EC.equals(keyType) || !com.nimbusds.jose.crypto.ECDHEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                    if (!com.nimbusds.jose.jwk.KeyType.OCT.equals(keyType) || !com.nimbusds.jose.crypto.AESEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                        if (!com.nimbusds.jose.jwk.KeyType.OCT.equals(keyType) || !com.nimbusds.jose.crypto.DirectEncrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                            if (!com.nimbusds.jose.jwk.KeyType.OKP.equals(keyType) || !com.nimbusds.jose.crypto.X25519Encrypter.SUPPORTED_ALGORITHMS.contains(parse)) {
                                throw new java.lang.IllegalArgumentException("Unsupported key encryption algorithm: ".concat(java.lang.String.valueOf(parse)));
                            }
                        }
                    }
                }
            }
        }
        this.keys = jWKSet;
    }

    private static javax.crypto.SecretKey findDirectCEK(com.nimbusds.jose.jwk.JWKSet jWKSet) {
        if (jWKSet == null) {
            return null;
        }
        for (com.nimbusds.jose.jwk.JWK jwk : jWKSet.getKeys()) {
            if (com.nimbusds.jose.JWEAlgorithm.DIR.equals(jwk.getAlgorithm()) && com.nimbusds.jose.jwk.KeyType.OCT.equals(jwk.getKeyType())) {
                return jwk.toOctetSequenceKey().toSecretKey(org.jose4j.keys.AesKey.ALGORITHM);
            }
        }
        return null;
    }

    @java.lang.Deprecated
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr) throws com.nimbusds.jose.JOSEException {
        return encrypt(jWEHeader, bArr, com.nimbusds.jose.crypto.impl.AAD.compute(jWEHeader));
    }

    @Override // com.nimbusds.jose.JWEEncrypter
    public com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader jWEHeader, byte[] bArr, byte[] bArr2) throws com.nimbusds.jose.JOSEException {
        com.nimbusds.jose.util.Base64URL base64URL;
        com.nimbusds.jose.JWEEncrypter x25519Encrypter;
        com.nimbusds.jose.util.Base64URL base64URL2;
        if (bArr2 == null) {
            throw new com.nimbusds.jose.JOSEException("Missing JWE additional authenticated data (AAD)");
        }
        javax.crypto.SecretKey cek = getCEK(jWEHeader.getEncryptionMethod());
        com.nimbusds.jose.Payload payload = new com.nimbusds.jose.Payload(bArr);
        java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
        java.util.Iterator<com.nimbusds.jose.jwk.JWK> it = this.keys.getKeys().iterator();
        com.nimbusds.jose.util.Base64URL base64URL3 = null;
        com.nimbusds.jose.util.Base64URL base64URL4 = null;
        com.nimbusds.jose.util.Base64URL base64URL5 = null;
        com.nimbusds.jose.util.Base64URL base64URL6 = null;
        while (it.hasNext()) {
            com.nimbusds.jose.jwk.JWK next = it.next();
            com.nimbusds.jose.jwk.KeyType keyType = next.getKeyType();
            java.util.Map<java.lang.String, java.lang.Object> jSONObject = next.toJSONObject();
            com.nimbusds.jose.UnprotectedHeader.Builder builder = new com.nimbusds.jose.UnprotectedHeader.Builder();
            java.lang.String[] strArr = RECIPIENT_HEADER_PARAMS;
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                java.util.Iterator<com.nimbusds.jose.jwk.JWK> it2 = it;
                java.lang.String str = strArr[i];
                if (jSONObject.containsKey(str)) {
                    base64URL2 = base64URL3;
                    builder.param(str, jSONObject.get(str));
                } else {
                    base64URL2 = base64URL3;
                }
                i++;
                it = it2;
                base64URL3 = base64URL2;
            }
            java.util.Iterator<com.nimbusds.jose.jwk.JWK> it3 = it;
            com.nimbusds.jose.util.Base64URL base64URL7 = base64URL3;
            try {
                com.nimbusds.jose.JWEHeader jWEHeader2 = (com.nimbusds.jose.JWEHeader) jWEHeader.join(builder.build());
                com.nimbusds.jose.JWEAlgorithm algorithmAndEnsureNotNull = com.nimbusds.jose.crypto.impl.JWEHeaderValidation.getAlgorithmAndEnsureNotNull(jWEHeader2);
                if (com.nimbusds.jose.jwk.KeyType.RSA.equals(keyType) && com.nimbusds.jose.crypto.RSAEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new com.nimbusds.jose.crypto.RSAEncrypter(next.toRSAKey().toRSAPublicKey(), cek);
                } else if (com.nimbusds.jose.jwk.KeyType.EC.equals(keyType) && com.nimbusds.jose.crypto.ECDHEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new com.nimbusds.jose.crypto.ECDHEncrypter(next.toECKey().toECPublicKey(), cek);
                } else if (com.nimbusds.jose.jwk.KeyType.OCT.equals(keyType) && com.nimbusds.jose.crypto.AESEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new com.nimbusds.jose.crypto.AESEncrypter(next.toOctetSequenceKey().toSecretKey(org.jose4j.keys.AesKey.ALGORITHM), cek);
                } else if (com.nimbusds.jose.jwk.KeyType.OCT.equals(keyType) && com.nimbusds.jose.crypto.DirectEncrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new com.nimbusds.jose.crypto.DirectEncrypter(next.toOctetSequenceKey().toSecretKey(org.jose4j.keys.AesKey.ALGORITHM));
                } else if (com.nimbusds.jose.jwk.KeyType.OKP.equals(keyType) && com.nimbusds.jose.crypto.X25519Encrypter.SUPPORTED_ALGORITHMS.contains(algorithmAndEnsureNotNull)) {
                    x25519Encrypter = new com.nimbusds.jose.crypto.X25519Encrypter(next.toOctetKeyPair().toPublicJWK(), cek);
                } else {
                    it = it3;
                    base64URL3 = base64URL7;
                }
                com.nimbusds.jose.JWECryptoParts encrypt = x25519Encrypter.encrypt(jWEHeader2, payload.toBytes(), bArr2);
                java.util.Map<java.lang.String, java.lang.Object> jSONObject2 = encrypt.getHeader().toJSONObject();
                java.util.Iterator<java.lang.String> it4 = jWEHeader.getIncludedParams().iterator();
                while (it4.hasNext()) {
                    jSONObject2.remove(it4.next());
                }
                java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
                newJSONObject.put(com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, jSONObject2);
                if (!com.nimbusds.jose.JWEAlgorithm.DIR.equals(algorithmAndEnsureNotNull)) {
                    newJSONObject.put("encrypted_key", encrypt.getEncryptedKey().toString());
                }
                newJSONArray.add(newJSONObject);
                if (newJSONArray.size() == 1) {
                    payload = new com.nimbusds.jose.Payload("");
                    base64URL3 = encrypt.getEncryptedKey();
                    com.nimbusds.jose.util.Base64URL initializationVector = encrypt.getInitializationVector();
                    com.nimbusds.jose.util.Base64URL cipherText = encrypt.getCipherText();
                    base64URL6 = encrypt.getAuthenticationTag();
                    base64URL4 = initializationVector;
                    base64URL5 = cipherText;
                } else {
                    base64URL3 = base64URL7;
                }
                it = it3;
            } catch (java.lang.Exception e) {
                throw new com.nimbusds.jose.JOSEException(e.getMessage(), e);
            }
        }
        com.nimbusds.jose.util.Base64URL base64URL8 = base64URL3;
        if (newJSONArray.size() > 1) {
            java.util.Map<java.lang.String, java.lang.Object> newJSONObject2 = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
            newJSONObject2.put("recipients", newJSONArray);
            base64URL = com.nimbusds.jose.util.Base64URL.encode(com.nimbusds.jose.util.JSONObjectUtils.toJSONString(newJSONObject2));
        } else {
            base64URL = base64URL8;
        }
        return new com.nimbusds.jose.JWECryptoParts(jWEHeader, base64URL, base64URL4, base64URL5, base64URL6);
    }
}
