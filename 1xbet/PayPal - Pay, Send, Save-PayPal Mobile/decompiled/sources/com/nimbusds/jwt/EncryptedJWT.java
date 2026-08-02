package com.nimbusds.jwt;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class EncryptedJWT extends com.nimbusds.jose.JWEObject implements com.nimbusds.jwt.JWT {
    private static final long serialVersionUID = 1;
    private com.nimbusds.jwt.JWTClaimsSet getHighResolutionOutputSizeshNQ4ISI;

    public EncryptedJWT(com.nimbusds.jose.JWEHeader jWEHeader, com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet) {
        super(jWEHeader, jWTClaimsSet.toPayload());
        this.getHighResolutionOutputSizeshNQ4ISI = jWTClaimsSet;
    }

    public EncryptedJWT(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2, com.nimbusds.jose.util.Base64URL base64URL3, com.nimbusds.jose.util.Base64URL base64URL4, com.nimbusds.jose.util.Base64URL base64URL5) throws java.text.ParseException {
        super(base64URL, base64URL2, base64URL3, base64URL4, base64URL5);
    }

    @Override // com.nimbusds.jwt.JWT
    public com.nimbusds.jwt.JWTClaimsSet getJWTClaimsSet() throws java.text.ParseException {
        com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet = this.getHighResolutionOutputSizeshNQ4ISI;
        if (jWTClaimsSet != null) {
            return jWTClaimsSet;
        }
        com.nimbusds.jose.Payload payload = getPayload();
        if (payload == null) {
            return null;
        }
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = payload.toJSONObject();
        if (jSONObject == null) {
            throw new java.text.ParseException("Payload of JWE object is not a valid JSON object", 0);
        }
        com.nimbusds.jwt.JWTClaimsSet parse = com.nimbusds.jwt.JWTClaimsSet.parse(jSONObject);
        this.getHighResolutionOutputSizeshNQ4ISI = parse;
        return parse;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public void setPayload(com.nimbusds.jose.Payload payload) {
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        super.setPayload(payload);
    }

    public static com.nimbusds.jwt.EncryptedJWT parse(java.lang.String str) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL[] split = com.nimbusds.jose.JOSEObject.split(str);
        if (split.length != 5) {
            throw new java.text.ParseException("Unexpected number of Base64URL parts, must be five", 0);
        }
        return new com.nimbusds.jwt.EncryptedJWT(split[0], split[1], split[2], split[3], split[4]);
    }
}
