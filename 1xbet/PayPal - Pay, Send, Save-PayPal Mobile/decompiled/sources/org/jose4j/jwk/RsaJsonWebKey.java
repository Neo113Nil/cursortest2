package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class RsaJsonWebKey extends org.jose4j.jwk.PublicJsonWebKey {
    public static final java.lang.String EXPONENT_MEMBER_NAME = "e";
    public static final java.lang.String FACTOR_CRT_COEFFICIENT = "t";
    public static final java.lang.String FACTOR_CRT_EXPONENT_OTHER_MEMBER_NAME = "d";
    public static final java.lang.String FIRST_CRT_COEFFICIENT_MEMBER_NAME = "qi";
    public static final java.lang.String FIRST_FACTOR_CRT_EXPONENT_MEMBER_NAME = "dp";
    public static final java.lang.String FIRST_PRIME_FACTOR_MEMBER_NAME = "p";
    public static final java.lang.String KEY_TYPE = "RSA";
    public static final java.lang.String MODULUS_MEMBER_NAME = "n";
    public static final java.lang.String OTHER_PRIMES_INFO_MEMBER_NAME = "oth";
    public static final java.lang.String PRIME_FACTOR_OTHER_MEMBER_NAME = "r";
    public static final java.lang.String PRIVATE_EXPONENT_MEMBER_NAME = "d";
    public static final java.lang.String SECOND_FACTOR_CRT_EXPONENT_MEMBER_NAME = "dq";
    public static final java.lang.String SECOND_PRIME_FACTOR_MEMBER_NAME = "q";

    public RsaJsonWebKey(java.security.interfaces.RSAPublicKey rSAPublicKey) {
        super(rSAPublicKey);
    }

    public RsaJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
        this(map, null);
    }

    public RsaJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
        super(map, str);
        java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(map, "n", true);
        java.math.BigInteger highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(map, "e", true);
        org.jose4j.keys.RsaKeyUtil rsaKeyUtil = new org.jose4j.keys.RsaKeyUtil(str, null);
        this.key = rsaKeyUtil.publicKey(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2);
        Camera2StreamConfigurationMap();
        if (map.containsKey("d")) {
            java.math.BigInteger highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(map, "d", false);
            if (map.containsKey("p")) {
                this.privateKey = rsaKeyUtil.privateKey(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, highSpeedVideoFpsRanges3, getHighSpeedVideoFpsRanges(map, "p", false), getHighSpeedVideoFpsRanges(map, "q", false), getHighSpeedVideoFpsRanges(map, "dp", false), getHighSpeedVideoFpsRanges(map, "dq", false), getHighSpeedVideoFpsRanges(map, "qi", false));
            } else {
                this.privateKey = rsaKeyUtil.privateKey(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges3);
            }
        }
        removeFromOtherParams("n", "e", "d", "p", "q", "dp", "dq", "qi");
    }

    @Override // org.jose4j.jwk.JsonWebKey
    public java.lang.String getKeyType() {
        return "RSA";
    }

    public java.security.interfaces.RSAPublicKey getRsaPublicKey() {
        return (java.security.interfaces.RSAPublicKey) this.key;
    }

    public java.security.interfaces.RSAPublicKey getRSAPublicKey() {
        return getRsaPublicKey();
    }

    public java.security.interfaces.RSAPrivateKey getRsaPrivateKey() {
        return (java.security.interfaces.RSAPrivateKey) this.privateKey;
    }

    @Override // org.jose4j.jwk.PublicJsonWebKey
    protected void fillPublicTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.security.interfaces.RSAPublicKey rsaPublicKey = getRsaPublicKey();
        map.put("n", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rsaPublicKey.getModulus()));
        map.put("e", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rsaPublicKey.getPublicExponent()));
    }

    @Override // org.jose4j.jwk.PublicJsonWebKey
    protected void fillPrivateTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.security.interfaces.RSAPrivateKey rsaPrivateKey = getRsaPrivateKey();
        if (rsaPrivateKey != null) {
            map.put("d", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rsaPrivateKey.getPrivateExponent()));
            if (rsaPrivateKey instanceof java.security.interfaces.RSAPrivateCrtKey) {
                java.security.interfaces.RSAPrivateCrtKey rSAPrivateCrtKey = (java.security.interfaces.RSAPrivateCrtKey) rsaPrivateKey;
                map.put("p", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rSAPrivateCrtKey.getPrimeP()));
                map.put("q", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rSAPrivateCrtKey.getPrimeQ()));
                map.put("dp", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rSAPrivateCrtKey.getPrimeExponentP()));
                map.put("dq", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rSAPrivateCrtKey.getPrimeExponentQ()));
                map.put("qi", org.jose4j.keys.BigEndianBigInteger.toBase64Url(rSAPrivateCrtKey.getCrtCoefficient()));
            }
        }
    }

    @Override // org.jose4j.jwk.JsonWebKey
    protected java.lang.String produceThumbprintHashInput() {
        java.util.HashMap hashMap = new java.util.HashMap();
        fillPublicTypeSpecificParams(hashMap);
        return java.lang.String.format("{\"e\":\"%s\",\"kty\":\"RSA\",\"n\":\"%s\"}", hashMap.get("e"), hashMap.get("n"));
    }
}
