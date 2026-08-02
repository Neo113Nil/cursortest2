package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class OctetSequenceJsonWebKey extends org.jose4j.jwk.JsonWebKey {
    public static final java.lang.String KEY_TYPE = "oct";
    public static final java.lang.String KEY_VALUE_MEMBER_NAME = "k";
    private byte[] getHighSpeedVideoFpsRangesFor;

    public OctetSequenceJsonWebKey(java.security.Key key) {
        super(key);
        this.getHighSpeedVideoFpsRangesFor = key.getEncoded();
    }

    public OctetSequenceJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
        super(map);
        this.getHighSpeedVideoFpsRangesFor = new org.jose4j.base64url.Base64Url().base64UrlDecode(getStringRequired(map, "k"));
        this.key = new javax.crypto.spec.SecretKeySpec(this.getHighSpeedVideoFpsRangesFor, org.jose4j.keys.AesKey.ALGORITHM);
        removeFromOtherParams("k");
    }

    @Override // org.jose4j.jwk.JsonWebKey
    public java.lang.String getKeyType() {
        return KEY_TYPE;
    }

    public byte[] getOctetSequence() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // org.jose4j.jwk.JsonWebKey
    protected void fillTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map, org.jose4j.jwk.JsonWebKey.OutputControlLevel outputControlLevel) {
        if (org.jose4j.jwk.JsonWebKey.OutputControlLevel.INCLUDE_SYMMETRIC.compareTo(outputControlLevel) >= 0) {
            map.put("k", org.jose4j.base64url.Base64Url.encode(this.getHighSpeedVideoFpsRangesFor));
        }
    }

    @Override // org.jose4j.jwk.JsonWebKey
    protected java.lang.String produceThumbprintHashInput() {
        return java.lang.String.format("{\"k\":\"%s\",\"kty\":\"oct\"}", org.jose4j.base64url.Base64Url.encode(this.getHighSpeedVideoFpsRangesFor));
    }
}
