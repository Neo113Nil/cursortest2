package org.apache.commons.codec.digest;

/* loaded from: classes17.dex */
public enum HmacAlgorithms {
    HMAC_MD5("HmacMD5"),
    HMAC_SHA_1("HmacSHA1"),
    HMAC_SHA_224("HmacSHA224"),
    HMAC_SHA_256(org.jose4j.mac.MacUtil.HMAC_SHA256),
    HMAC_SHA_384(org.jose4j.mac.MacUtil.HMAC_SHA384),
    HMAC_SHA_512(org.jose4j.mac.MacUtil.HMAC_SHA512);

    private final java.lang.String Camera2StreamConfigurationMap;

    HmacAlgorithms(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public final java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.Camera2StreamConfigurationMap;
    }
}
