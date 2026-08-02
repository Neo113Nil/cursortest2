package org.jose4j.jws;

/* loaded from: classes18.dex */
public class HmacUsingShaAlgorithm extends org.jose4j.jwa.AlgorithmInfo implements org.jose4j.jws.JsonWebSignatureAlgorithm {
    private int getHighSpeedVideoFpsRangesFor;

    public HmacUsingShaAlgorithm(java.lang.String str, java.lang.String str2, int i) {
        setAlgorithmIdentifier(str);
        setJavaAlgorithm(str2);
        setKeyPersuasion(org.jose4j.keys.KeyPersuasion.SYMMETRIC);
        setKeyType(org.jose4j.jwk.OctetSequenceJsonWebKey.KEY_TYPE);
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public boolean verifySignature(byte[] bArr, java.security.Key key, byte[] bArr2, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        if (!(key instanceof javax.crypto.SecretKey)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(key.getClass());
            sb.append(" cannot be used for HMAC verification.");
            throw new org.jose4j.lang.InvalidKeyException(sb.toString());
        }
        return org.jose4j.lang.ByteUtil.secureEquals(bArr, org.jose4j.mac.MacUtil.getInitializedMac(getJavaAlgorithm(), key, providerContext.getSuppliedKeyProviderContext().getMacProvider()).doFinal(bArr2));
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public byte[] sign(org.jose4j.jwa.CryptoPrimitive cryptoPrimitive, byte[] bArr) throws org.jose4j.lang.JoseException {
        return cryptoPrimitive.getMac().doFinal(bArr);
    }

    private void getHighSpeedVideoFpsRangesFor(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        int bitLength;
        if (key == null) {
            throw new org.jose4j.lang.InvalidKeyException("key is null");
        }
        if (key.getEncoded() == null || (bitLength = org.jose4j.lang.ByteUtil.bitLength(key.getEncoded())) >= this.getHighSpeedVideoFpsRangesFor) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("A key of the same size as the hash output (i.e. ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(" bits for ");
        sb.append(getAlgorithmIdentifier());
        sb.append(") or larger MUST be used with the HMAC SHA algorithms but this key is only ");
        sb.append(bitLength);
        sb.append(" bits");
        throw new org.jose4j.lang.InvalidKeyException(sb.toString());
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public void validateSigningKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        getHighSpeedVideoFpsRangesFor(key);
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public void validateVerificationKey(java.security.Key key) throws org.jose4j.lang.InvalidKeyException {
        getHighSpeedVideoFpsRangesFor(key);
    }

    @Override // org.jose4j.jwa.Algorithm
    public boolean isAvailable() {
        try {
            javax.crypto.Mac.getInstance(getJavaAlgorithm());
            return true;
        } catch (java.security.NoSuchAlgorithmException unused) {
            return false;
        }
    }

    public static class HmacSha256 extends org.jose4j.jws.HmacUsingShaAlgorithm {
        public HmacSha256() {
            super(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA256, org.jose4j.mac.MacUtil.HMAC_SHA256, 256);
        }
    }

    public static class HmacSha384 extends org.jose4j.jws.HmacUsingShaAlgorithm {
        public HmacSha384() {
            super(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA384, org.jose4j.mac.MacUtil.HMAC_SHA384, 384);
        }
    }

    public static class HmacSha512 extends org.jose4j.jws.HmacUsingShaAlgorithm {
        public HmacSha512() {
            super(org.jose4j.jws.AlgorithmIdentifiers.HMAC_SHA512, org.jose4j.mac.MacUtil.HMAC_SHA512, 512);
        }
    }

    @Override // org.jose4j.jws.JsonWebSignatureAlgorithm
    public org.jose4j.jwa.CryptoPrimitive prepareForSign(java.security.Key key, org.jose4j.jca.ProviderContext providerContext) throws org.jose4j.lang.JoseException {
        return new org.jose4j.jwa.CryptoPrimitive(org.jose4j.mac.MacUtil.getInitializedMac(getJavaAlgorithm(), key, providerContext.getSuppliedKeyProviderContext().getMacProvider()));
    }
}
