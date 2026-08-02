package com.nimbusds.jose;

/* loaded from: classes4.dex */
public abstract class Header implements java.io.Serializable {
    private static final java.util.Map<java.lang.String, java.lang.Object> EMPTY_CUSTOM_PARAMS = java.util.Collections.unmodifiableMap(new java.util.HashMap());
    public static final int MAX_HEADER_STRING_LENGTH = 20000;
    private static final long serialVersionUID = 1;
    private final com.nimbusds.jose.Algorithm alg;
    private final java.util.Set<java.lang.String> crit;
    private final java.lang.String cty;
    private final java.util.Map<java.lang.String, java.lang.Object> customParams;
    private final com.nimbusds.jose.util.Base64URL parsedBase64URL;
    private final com.nimbusds.jose.JOSEObjectType typ;

    protected Header(com.nimbusds.jose.Algorithm algorithm, com.nimbusds.jose.JOSEObjectType jOSEObjectType, java.lang.String str, java.util.Set<java.lang.String> set, java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL) {
        this.alg = algorithm;
        this.typ = jOSEObjectType;
        this.cty = str;
        if (set != null) {
            this.crit = java.util.Collections.unmodifiableSet(new java.util.HashSet(set));
        } else {
            this.crit = null;
        }
        if (map != null) {
            this.customParams = java.util.Collections.unmodifiableMap(new java.util.HashMap(map));
        } else {
            this.customParams = EMPTY_CUSTOM_PARAMS;
        }
        this.parsedBase64URL = base64URL;
    }

    protected Header(com.nimbusds.jose.Header header) {
        this(header.getAlgorithm(), header.getType(), header.getContentType(), header.getCriticalParams(), header.getCustomParams(), header.getParsedBase64URL());
    }

    public com.nimbusds.jose.Algorithm getAlgorithm() {
        return this.alg;
    }

    public com.nimbusds.jose.JOSEObjectType getType() {
        return this.typ;
    }

    public java.lang.String getContentType() {
        return this.cty;
    }

    public java.util.Set<java.lang.String> getCriticalParams() {
        return this.crit;
    }

    public java.lang.Object getCustomParam(java.lang.String str) {
        return this.customParams.get(str);
    }

    public java.util.Map<java.lang.String, java.lang.Object> getCustomParams() {
        return this.customParams;
    }

    public com.nimbusds.jose.util.Base64URL getParsedBase64URL() {
        return this.parsedBase64URL;
    }

    public java.util.Set<java.lang.String> getIncludedParams() {
        java.util.HashSet hashSet = new java.util.HashSet(getCustomParams().keySet());
        if (getAlgorithm() != null) {
            hashSet.add("alg");
        }
        if (getType() != null) {
            hashSet.add("typ");
        }
        if (getContentType() != null) {
            hashSet.add("cty");
        }
        if (getCriticalParams() != null && !getCriticalParams().isEmpty()) {
            hashSet.add("crit");
        }
        return hashSet;
    }

    public java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        newJSONObject.putAll(this.customParams);
        com.nimbusds.jose.Algorithm algorithm = this.alg;
        if (algorithm != null) {
            newJSONObject.put("alg", algorithm.toString());
        }
        com.nimbusds.jose.JOSEObjectType jOSEObjectType = this.typ;
        if (jOSEObjectType != null) {
            newJSONObject.put("typ", jOSEObjectType.toString());
        }
        java.lang.String str = this.cty;
        if (str != null) {
            newJSONObject.put("cty", str);
        }
        java.util.Set<java.lang.String> set = this.crit;
        if (set != null && !set.isEmpty()) {
            newJSONObject.put("crit", new java.util.ArrayList(this.crit));
        }
        return newJSONObject;
    }

    public java.lang.String toString() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toJSONObject());
    }

    public com.nimbusds.jose.util.Base64URL toBase64URL() {
        com.nimbusds.jose.util.Base64URL base64URL = this.parsedBase64URL;
        return base64URL == null ? com.nimbusds.jose.util.Base64URL.encode(toString()) : base64URL;
    }

    public static com.nimbusds.jose.Algorithm parseAlgorithm(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        java.lang.String string = com.nimbusds.jose.util.JSONObjectUtils.getString(map, "alg");
        if (string == null) {
            throw new java.text.ParseException("Missing \"alg\" in header JSON object", 0);
        }
        if (string.equals(com.nimbusds.jose.Algorithm.NONE.getName())) {
            return com.nimbusds.jose.Algorithm.NONE;
        }
        if (map.containsKey("enc")) {
            return com.nimbusds.jose.JWEAlgorithm.parse(string);
        }
        return com.nimbusds.jose.JWSAlgorithm.parse(string);
    }

    public com.nimbusds.jose.Header join(com.nimbusds.jose.UnprotectedHeader unprotectedHeader) throws java.text.ParseException {
        java.util.Map<java.lang.String, java.lang.Object> jSONObject = toJSONObject();
        try {
            com.nimbusds.jose.HeaderValidation.ensureDisjoint(this, unprotectedHeader);
            if (unprotectedHeader != null) {
                jSONObject.putAll(unprotectedHeader.toJSONObject());
            }
            return parse(jSONObject, (com.nimbusds.jose.util.Base64URL) null);
        } catch (com.nimbusds.jose.IllegalHeaderException e) {
            throw new java.text.ParseException(e.getMessage(), 0);
        }
    }

    public static com.nimbusds.jose.Header parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return parse(map, (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.Header parse(java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        java.lang.String string = com.nimbusds.jose.util.JSONObjectUtils.getString(map, "alg");
        if (map.containsKey("enc")) {
            return com.nimbusds.jose.JWEHeader.parse(map, base64URL);
        }
        if (com.nimbusds.jose.Algorithm.NONE.getName().equals(string)) {
            return com.nimbusds.jose.PlainHeader.parse(map, base64URL);
        }
        if (map.containsKey("alg")) {
            return com.nimbusds.jose.JWSHeader.parse(map, base64URL);
        }
        throw new java.text.ParseException("Missing \"alg\" in header JSON object", 0);
    }

    public static com.nimbusds.jose.Header parse(java.lang.String str) throws java.text.ParseException {
        return parse(str, (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.Header parse(java.lang.String str, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str, 20000), base64URL);
    }

    public static com.nimbusds.jose.Header parse(com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
