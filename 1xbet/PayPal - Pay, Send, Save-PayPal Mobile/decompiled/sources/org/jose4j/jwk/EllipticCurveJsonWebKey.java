package org.jose4j.jwk;

/* loaded from: classes18.dex */
public class EllipticCurveJsonWebKey extends org.jose4j.jwk.PublicJsonWebKey {
    public static final java.lang.String CURVE_MEMBER_NAME = "crv";
    public static final java.lang.String KEY_TYPE = "EC";
    public static final java.lang.String PRIVATE_KEY_MEMBER_NAME = "d";
    public static final java.lang.String X_MEMBER_NAME = "x";
    public static final java.lang.String Y_MEMBER_NAME = "y";
    private java.lang.String getHighSpeedVideoFpsRanges;

    public EllipticCurveJsonWebKey(java.security.interfaces.ECPublicKey eCPublicKey) {
        super(eCPublicKey);
        this.getHighSpeedVideoFpsRanges = org.jose4j.keys.EllipticCurves.getName(eCPublicKey.getParams().getCurve());
    }

    public EllipticCurveJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map) throws org.jose4j.lang.JoseException {
        this(map, null);
    }

    public EllipticCurveJsonWebKey(java.util.Map<java.lang.String, java.lang.Object> map, java.lang.String str) throws org.jose4j.lang.JoseException {
        super(map, str);
        java.lang.String string = getString(map, "crv", true);
        this.getHighSpeedVideoFpsRanges = string;
        java.security.spec.ECParameterSpec spec = org.jose4j.keys.EllipticCurves.getSpec(string);
        if (spec == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append("\" is an unknown or unsupported value for the \"crv\" parameter.");
            throw new org.jose4j.lang.InvalidKeyException(sb.toString());
        }
        java.math.BigInteger highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(map, "x", true);
        java.math.BigInteger highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(map, "y", true);
        org.jose4j.keys.EcKeyUtil ecKeyUtil = new org.jose4j.keys.EcKeyUtil(str, null);
        this.key = ecKeyUtil.publicKey(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2, spec);
        Camera2StreamConfigurationMap();
        if (map.containsKey("d")) {
            this.privateKey = ecKeyUtil.privateKey(getHighSpeedVideoFpsRanges(map, "d", false), spec);
        }
        removeFromOtherParams("crv", "x", "y", "d");
    }

    public java.security.interfaces.ECPublicKey getECPublicKey() {
        return (java.security.interfaces.ECPublicKey) this.key;
    }

    public java.security.interfaces.ECPrivateKey getEcPrivateKey() {
        return (java.security.interfaces.ECPrivateKey) this.privateKey;
    }

    @Override // org.jose4j.jwk.JsonWebKey
    public java.lang.String getKeyType() {
        return "EC";
    }

    public java.lang.String getCurveName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // org.jose4j.jwk.PublicJsonWebKey
    protected void fillPublicTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.security.spec.ECPoint w = getECPublicKey().getW();
        int ceil = (int) java.lang.Math.ceil(org.jose4j.keys.EllipticCurves.getSpec(getCurveName()).getCurve().getField().getFieldSize() / 8.0d);
        map.put("x", org.jose4j.keys.BigEndianBigInteger.toBase64Url(w.getAffineX(), ceil));
        map.put("y", org.jose4j.keys.BigEndianBigInteger.toBase64Url(w.getAffineY(), ceil));
        map.put("crv", getCurveName());
    }

    @Override // org.jose4j.jwk.PublicJsonWebKey
    protected void fillPrivateTypeSpecificParams(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.security.interfaces.ECPrivateKey ecPrivateKey = getEcPrivateKey();
        if (ecPrivateKey != null) {
            map.put("d", org.jose4j.keys.BigEndianBigInteger.toBase64Url(ecPrivateKey.getS(), (int) java.lang.Math.ceil(org.jose4j.keys.EllipticCurves.getSpec(getCurveName()).getCurve().getField().getFieldSize() / 8.0d)));
        }
    }

    @Override // org.jose4j.jwk.JsonWebKey
    protected java.lang.String produceThumbprintHashInput() {
        java.util.HashMap hashMap = new java.util.HashMap();
        fillPublicTypeSpecificParams(hashMap);
        return java.lang.String.format("{\"crv\":\"%s\",\"kty\":\"EC\",\"x\":\"%s\",\"y\":\"%s\"}", hashMap.get("crv"), hashMap.get("x"), hashMap.get("y"));
    }
}
