package com.nimbusds.jose;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public final class PlainHeader extends com.nimbusds.jose.Header {
    private static final java.util.Set<java.lang.String> REGISTERED_PARAMETER_NAMES;
    private static final long serialVersionUID = 1;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("alg");
        hashSet.add("typ");
        hashSet.add("cty");
        hashSet.add("crit");
        REGISTERED_PARAMETER_NAMES = java.util.Collections.unmodifiableSet(hashSet);
    }

    public static class Builder {
        private java.util.Set<java.lang.String> crit;
        private java.lang.String cty;
        private java.util.Map<java.lang.String, java.lang.Object> customParams;
        private com.nimbusds.jose.util.Base64URL parsedBase64URL;
        private com.nimbusds.jose.JOSEObjectType typ;

        public Builder() {
        }

        public Builder(com.nimbusds.jose.PlainHeader plainHeader) {
            this.typ = plainHeader.getType();
            this.cty = plainHeader.getContentType();
            this.crit = plainHeader.getCriticalParams();
            this.customParams = plainHeader.getCustomParams();
        }

        public com.nimbusds.jose.PlainHeader.Builder type(com.nimbusds.jose.JOSEObjectType jOSEObjectType) {
            this.typ = jOSEObjectType;
            return this;
        }

        public com.nimbusds.jose.PlainHeader.Builder contentType(java.lang.String str) {
            this.cty = str;
            return this;
        }

        public com.nimbusds.jose.PlainHeader.Builder criticalParams(java.util.Set<java.lang.String> set) {
            this.crit = set;
            return this;
        }

        public com.nimbusds.jose.PlainHeader.Builder customParam(java.lang.String str, java.lang.Object obj) {
            if (com.nimbusds.jose.PlainHeader.getRegisteredParameterNames().contains(str)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The parameter name \"");
                sb.append(str);
                sb.append("\" matches a registered name");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            if (this.customParams == null) {
                this.customParams = new java.util.HashMap();
            }
            this.customParams.put(str, obj);
            return this;
        }

        public com.nimbusds.jose.PlainHeader.Builder customParams(java.util.Map<java.lang.String, java.lang.Object> map) {
            this.customParams = map;
            return this;
        }

        public com.nimbusds.jose.PlainHeader.Builder parsedBase64URL(com.nimbusds.jose.util.Base64URL base64URL) {
            this.parsedBase64URL = base64URL;
            return this;
        }

        public com.nimbusds.jose.PlainHeader build() {
            return new com.nimbusds.jose.PlainHeader(this.typ, this.cty, this.crit, this.customParams, this.parsedBase64URL);
        }
    }

    public PlainHeader() {
        this(null, null, null, null, null);
    }

    public PlainHeader(com.nimbusds.jose.JOSEObjectType jOSEObjectType, java.lang.String str, java.util.Set<java.lang.String> set, java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL) {
        super(com.nimbusds.jose.Algorithm.NONE, jOSEObjectType, str, set, map, base64URL);
    }

    public PlainHeader(com.nimbusds.jose.PlainHeader plainHeader) {
        this(plainHeader.getType(), plainHeader.getContentType(), plainHeader.getCriticalParams(), plainHeader.getCustomParams(), plainHeader.getParsedBase64URL());
    }

    public static java.util.Set<java.lang.String> getRegisteredParameterNames() {
        return REGISTERED_PARAMETER_NAMES;
    }

    @Override // com.nimbusds.jose.Header
    public final com.nimbusds.jose.Algorithm getAlgorithm() {
        return com.nimbusds.jose.Algorithm.NONE;
    }

    public static com.nimbusds.jose.PlainHeader parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        return parse(map, (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.PlainHeader parse(java.util.Map<java.lang.String, java.lang.Object> map, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        if (com.nimbusds.jose.Header.parseAlgorithm(map) != com.nimbusds.jose.Algorithm.NONE) {
            throw new java.text.ParseException("The algorithm \"alg\" header parameter must be \"none\"", 0);
        }
        com.nimbusds.jose.PlainHeader.Builder parsedBase64URL = new com.nimbusds.jose.PlainHeader.Builder().parsedBase64URL(base64URL);
        for (java.lang.String str : map.keySet()) {
            if (!"alg".equals(str)) {
                if ("typ".equals(str)) {
                    java.lang.String string = com.nimbusds.jose.util.JSONObjectUtils.getString(map, str);
                    if (string != null) {
                        parsedBase64URL = parsedBase64URL.type(new com.nimbusds.jose.JOSEObjectType(string));
                    }
                } else if ("cty".equals(str)) {
                    parsedBase64URL = parsedBase64URL.contentType(com.nimbusds.jose.util.JSONObjectUtils.getString(map, str));
                } else if ("crit".equals(str)) {
                    java.util.List<java.lang.String> stringList = com.nimbusds.jose.util.JSONObjectUtils.getStringList(map, str);
                    if (stringList != null) {
                        parsedBase64URL = parsedBase64URL.criticalParams(new java.util.HashSet(stringList));
                    }
                } else {
                    parsedBase64URL = parsedBase64URL.customParam(str, map.get(str));
                }
            }
        }
        return parsedBase64URL.build();
    }

    public static com.nimbusds.jose.PlainHeader parse(java.lang.String str) throws java.text.ParseException {
        return parse(str, (com.nimbusds.jose.util.Base64URL) null);
    }

    public static com.nimbusds.jose.PlainHeader parse(java.lang.String str, com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str, 20000), base64URL);
    }

    public static com.nimbusds.jose.PlainHeader parse(com.nimbusds.jose.util.Base64URL base64URL) throws java.text.ParseException {
        return parse(base64URL.decodeToString(), base64URL);
    }
}
