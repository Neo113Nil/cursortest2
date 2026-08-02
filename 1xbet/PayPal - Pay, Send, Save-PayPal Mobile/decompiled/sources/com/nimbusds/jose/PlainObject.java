package com.nimbusds.jose;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class PlainObject extends com.nimbusds.jose.JOSEObject {
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.PlainHeader header;

    public PlainObject(com.nimbusds.jose.Payload payload) {
        if (payload == null) {
            throw new java.lang.IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
        this.header = new com.nimbusds.jose.PlainHeader();
    }

    public PlainObject(com.nimbusds.jose.PlainHeader plainHeader, com.nimbusds.jose.Payload payload) {
        if (plainHeader == null) {
            throw new java.lang.IllegalArgumentException("The unsecured header must not be null");
        }
        this.header = plainHeader;
        if (payload == null) {
            throw new java.lang.IllegalArgumentException("The payload must not be null");
        }
        setPayload(payload);
    }

    public PlainObject(com.nimbusds.jose.util.Base64URL base64URL, com.nimbusds.jose.util.Base64URL base64URL2) throws java.text.ParseException {
        if (base64URL == null) {
            throw new java.lang.IllegalArgumentException("The first part must not be null");
        }
        try {
            this.header = com.nimbusds.jose.PlainHeader.parse(base64URL);
            if (base64URL2 == null) {
                throw new java.lang.IllegalArgumentException("The second part must not be null");
            }
            setPayload(new com.nimbusds.jose.Payload(base64URL2));
            setParsedParts(base64URL, base64URL2, null);
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid unsecured header: ");
            sb.append(e.getMessage());
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }

    @Override // com.nimbusds.jose.JOSEObject
    public com.nimbusds.jose.PlainHeader getHeader() {
        return this.header;
    }

    @Override // com.nimbusds.jose.JOSEObject
    public java.lang.String serialize() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.header.toBase64URL().toString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        sb.append(getPayload().toBase64URL().toString());
        sb.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
        return sb.toString();
    }

    public static com.nimbusds.jose.PlainObject parse(java.lang.String str) throws java.text.ParseException {
        com.nimbusds.jose.util.Base64URL[] split = com.nimbusds.jose.JOSEObject.split(str);
        if (!split[2].toString().isEmpty()) {
            throw new java.text.ParseException("Unexpected third Base64URL part", 0);
        }
        return new com.nimbusds.jose.PlainObject(split[0], split[1]);
    }
}
