package com.nimbusds.jwt;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes4.dex */
public class SignedJWT extends com.nimbusds.jose.JWSObject implements com.nimbusds.jwt.JWT {
    private static final long serialVersionUID = 1;
    private com.nimbusds.jwt.JWTClaimsSet Camera2StreamConfigurationMap;

    public SignedJWT(com.nimbusds.jose.JWSHeader jWSHeader, com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet) {
        super(jWSHeader, jWTClaimsSet.toPayload());
        this.Camera2StreamConfigurationMap = jWTClaimsSet;
    }

    public SignedJWT(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3) throws java.text.ParseException {
        super(base64URL, base64URL2, base64URL3);
    }

    @Override // com.nimbusds.jwt.JWT
    public com.nimbusds.jwt.JWTClaimsSet getJWTClaimsSet() throws java.text.ParseException {
        com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet = this.Camera2StreamConfigurationMap;
        if (jWTClaimsSet != null) {
            return jWTClaimsSet;
        }
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = getPayload().toJSONObject();
        if (jSONObject == null) {
            throw new java.text.ParseException("Payload of JWS object is not a valid JSON object", 0);
        }
        com.nimbusds.jwt.JWTClaimsSet parse = com.nimbusds.jwt.JWTClaimsSet.parse(jSONObject);
        this.Camera2StreamConfigurationMap = parse;
        return parse;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public void setPayload(com.nimbusds.jose.Payload payload) {
        this.Camera2StreamConfigurationMap = null;
        super.setPayload(payload);
    }

    public static com.nimbusds.jwt.SignedJWT parse(java.lang.String str) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL[] split = com.nimbusds.jose.JOSEObject.split(str);
        if (split.length != 3) {
            throw new java.text.ParseException("Unexpected number of Base64URL parts, must be three", 0);
        }
        return new com.nimbusds.jwt.SignedJWT(split[0], split[1], split[2]);
    }
}
