package codec.digest;

/* loaded from: classes7.dex */
public enum HmacAlgorithms {
    HMAC_MD5("HmacMD5"),
    HMAC_SHA_1("HmacSHA1"),
    HMAC_SHA_224("HmacSHA224"),
    HMAC_SHA_256(org.jose4j.mac.MacUtil.HMAC_SHA256),
    HMAC_SHA_384(org.jose4j.mac.MacUtil.HMAC_SHA384),
    HMAC_SHA_512(org.jose4j.mac.MacUtil.HMAC_SHA512);


    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f2771a;

    HmacAlgorithms(java.lang.String str) {
        this.f2771a = str;
    }

    public final java.lang.String getName() {
        return this.f2771a;
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        return this.f2771a;
    }
}
