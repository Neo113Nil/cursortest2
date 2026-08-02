package com.nimbusds.jose.crypto.impl;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class CompositeKey {
    private final javax.crypto.SecretKey encKey;
    private final javax.crypto.SecretKey inputKey;
    private final javax.crypto.SecretKey macKey;
    private final int truncatedMacLength;

    public CompositeKey(javax.crypto.SecretKey secretKey) throws com.nimbusds.jose.KeyLengthException {
        this.inputKey = secretKey;
        byte[] encoded = secretKey.getEncoded();
        if (encoded.length == 32) {
            this.macKey = new javax.crypto.spec.SecretKeySpec(encoded, 0, 16, "HMACSHA256");
            this.encKey = new javax.crypto.spec.SecretKeySpec(encoded, 16, 16, org.jose4j.keys.AesKey.ALGORITHM);
            this.truncatedMacLength = 16;
        } else if (encoded.length == 48) {
            this.macKey = new javax.crypto.spec.SecretKeySpec(encoded, 0, 24, "HMACSHA384");
            this.encKey = new javax.crypto.spec.SecretKeySpec(encoded, 24, 24, org.jose4j.keys.AesKey.ALGORITHM);
            this.truncatedMacLength = 24;
        } else {
            if (encoded.length == 64) {
                this.macKey = new javax.crypto.spec.SecretKeySpec(encoded, 0, 32, "HMACSHA512");
                this.encKey = new javax.crypto.spec.SecretKeySpec(encoded, 32, 32, org.jose4j.keys.AesKey.ALGORITHM);
                this.truncatedMacLength = 32;
                return;
            }
            throw new com.nimbusds.jose.KeyLengthException("Unsupported AES/CBC/PKCS5Padding/HMAC-SHA2 key length, must be 256, 384 or 512 bits");
        }
    }

    public final javax.crypto.SecretKey getInputKey() {
        return this.inputKey;
    }

    public final javax.crypto.SecretKey getMACKey() {
        return this.macKey;
    }

    public final int getTruncatedMACByteLength() {
        return this.truncatedMacLength;
    }

    public final javax.crypto.SecretKey getAESKey() {
        return this.encKey;
    }
}
