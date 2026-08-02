package com.nimbusds.jwt;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class PlainJWT extends com.nimbusds.jose.PlainObject implements com.nimbusds.jwt.JWT {
    private static final long serialVersionUID = 1;
    private com.nimbusds.jwt.JWTClaimsSet getHighSpeedVideoSizes;

    public PlainJWT(com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet) {
        super(jWTClaimsSet.toPayload());
        this.getHighSpeedVideoSizes = jWTClaimsSet;
    }

    public PlainJWT(com.nimbusds.jose.PlainHeader plainHeader, com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet) {
        super(plainHeader, jWTClaimsSet.toPayload());
        this.getHighSpeedVideoSizes = jWTClaimsSet;
    }

    public PlainJWT(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2) throws java.text.ParseException {
        super(base64URL, base64URL2);
    }

    @Override // com.nimbusds.jwt.JWT
    public com.nimbusds.jwt.JWTClaimsSet getJWTClaimsSet() throws java.text.ParseException {
        com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet = this.getHighSpeedVideoSizes;
        if (jWTClaimsSet != null) {
            return jWTClaimsSet;
        }
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = getPayload().toJSONObject();
        if (jSONObject == null) {
            throw new java.text.ParseException("Payload of unsecured JOSE object is not a valid JSON object", 0);
        }
        com.nimbusds.jwt.JWTClaimsSet parse = com.nimbusds.jwt.JWTClaimsSet.parse(jSONObject);
        this.getHighSpeedVideoSizes = parse;
        return parse;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public void setPayload(com.nimbusds.jose.Payload payload) {
        this.getHighSpeedVideoSizes = null;
        super.setPayload(payload);
    }

    public static com.nimbusds.jwt.PlainJWT parse(java.lang.String str) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL[] split = com.nimbusds.jose.JOSEObject.split(str);
        if (!split[2].toString().isEmpty()) {
            throw new java.text.ParseException("Unexpected third Base64URL part in the unsecured JWT object", 0);
        }
        return new com.nimbusds.jwt.PlainJWT(split[0], split[1]);
    }
}
