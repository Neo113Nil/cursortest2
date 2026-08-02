package com.nimbusds.jwt;

@net.jcip.annotations.Immutable
/* loaded from: classes4.dex */
public final class JWTClaimsSet implements java.io.Serializable {
    private static final java.util.Set<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private static final long serialVersionUID = 1;
    private final java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    /* synthetic */ JWTClaimsSet(java.util.Map map, byte b) {
        this(map);
    }

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("iss");
        hashSet.add("sub");
        hashSet.add("aud");
        hashSet.add("exp");
        hashSet.add("nbf");
        hashSet.add("iat");
        hashSet.add("jti");
        getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableSet(hashSet);
    }

    public static class Builder {
        private final java.util.Map<java.lang.String, java.lang.Object> getHighSpeedVideoFpsRangesFor;

        public Builder() {
            this.getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();
        }

        public Builder(com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            this.getHighSpeedVideoFpsRangesFor = linkedHashMap;
            linkedHashMap.putAll(jWTClaimsSet.getHighResolutionOutputSizeshNQ4ISI);
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder issuer(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.put("iss", str);
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder subject(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.put("sub", str);
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder audience(java.util.List<java.lang.String> list) {
            this.getHighSpeedVideoFpsRangesFor.put("aud", list);
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder audience(java.lang.String str) {
            if (str == null) {
                this.getHighSpeedVideoFpsRangesFor.put("aud", null);
                return this;
            }
            this.getHighSpeedVideoFpsRangesFor.put("aud", java.util.Collections.singletonList(str));
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder expirationTime(java.util.Date date) {
            this.getHighSpeedVideoFpsRangesFor.put("exp", date);
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder notBeforeTime(java.util.Date date) {
            this.getHighSpeedVideoFpsRangesFor.put("nbf", date);
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder issueTime(java.util.Date date) {
            this.getHighSpeedVideoFpsRangesFor.put("iat", date);
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder jwtID(java.lang.String str) {
            this.getHighSpeedVideoFpsRangesFor.put("jti", str);
            return this;
        }

        public com.nimbusds.jwt.JWTClaimsSet.Builder claim(java.lang.String str, java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor.put(str, obj);
            return this;
        }

        public java.util.Map<java.lang.String, java.lang.Object> getClaims() {
            return java.util.Collections.unmodifiableMap(this.getHighSpeedVideoFpsRangesFor);
        }

        public com.nimbusds.jwt.JWTClaimsSet build() {
            return new com.nimbusds.jwt.JWTClaimsSet(this.getHighSpeedVideoFpsRangesFor, (byte) 0);
        }
    }

    private JWTClaimsSet(java.util.Map<java.lang.String, java.lang.Object> map) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.getHighResolutionOutputSizeshNQ4ISI = linkedHashMap;
        linkedHashMap.putAll(map);
    }

    public static java.util.Set<java.lang.String> getRegisteredNames() {
        return getHighSpeedVideoFpsRangesFor;
    }

    public final java.lang.String getIssuer() {
        try {
            return getStringClaim("iss");
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.lang.String getSubject() {
        try {
            return getStringClaim("sub");
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.util.List<java.lang.String> getAudience() {
        java.lang.Object claim = getClaim("aud");
        if (claim instanceof java.lang.String) {
            return java.util.Collections.singletonList((java.lang.String) claim);
        }
        try {
            java.util.List<java.lang.String> stringListClaim = getStringListClaim("aud");
            return stringListClaim != null ? stringListClaim : java.util.Collections.emptyList();
        } catch (java.text.ParseException unused) {
            return java.util.Collections.emptyList();
        }
    }

    public final java.util.Date getExpirationTime() {
        try {
            return getDateClaim("exp");
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.util.Date getNotBeforeTime() {
        try {
            return getDateClaim("nbf");
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.util.Date getIssueTime() {
        try {
            return getDateClaim("iat");
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.lang.String getJWTID() {
        try {
            return getStringClaim("jti");
        } catch (java.text.ParseException unused) {
            return null;
        }
    }

    public final java.lang.Object getClaim(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str);
    }

    public final java.lang.String getStringClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null || (claim instanceof java.lang.String)) {
            return (java.lang.String) claim;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
        sb.append(str);
        sb.append(" claim is not a String");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.util.List<java.lang.Object> getListClaim(java.lang.String str) throws java.text.ParseException {
        if (getClaim(str) == null) {
            return null;
        }
        try {
            return (java.util.List) getClaim(str);
        } catch (java.lang.ClassCastException unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
            sb.append(str);
            sb.append(" claim is not a list / JSON array");
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }

    public final java.lang.String[] getStringArrayClaim(java.lang.String str) throws java.text.ParseException {
        java.util.List<java.lang.Object> listClaim = getListClaim(str);
        if (listClaim == null) {
            return null;
        }
        int size = listClaim.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i = 0; i < size; i++) {
            try {
                strArr[i] = (java.lang.String) listClaim.get(i);
            } catch (java.lang.ClassCastException unused) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The ");
                sb.append(str);
                sb.append(" claim is not a list / JSON array of strings");
                throw new java.text.ParseException(sb.toString(), 0);
            }
        }
        return strArr;
    }

    public final java.util.List<java.lang.String> getStringListClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.String[] stringArrayClaim = getStringArrayClaim(str);
        if (stringArrayClaim == null) {
            return null;
        }
        return java.util.Collections.unmodifiableList(java.util.Arrays.asList(stringArrayClaim));
    }

    public final java.net.URI getURIClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.String stringClaim = getStringClaim(str);
        if (stringClaim == null) {
            return null;
        }
        try {
            return new java.net.URI(stringClaim);
        } catch (java.net.URISyntaxException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
            sb.append(str);
            sb.append("\" claim is not a URI: ");
            sb.append(e.getMessage());
            throw new java.text.ParseException(sb.toString(), 0);
        }
    }

    public final java.lang.Boolean getBooleanClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null || (claim instanceof java.lang.Boolean)) {
            return (java.lang.Boolean) claim;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
        sb.append(str);
        sb.append("\" claim is not a Boolean");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.lang.Integer getIntegerClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof java.lang.Number) {
            return java.lang.Integer.valueOf(((java.lang.Number) claim).intValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
        sb.append(str);
        sb.append("\" claim is not an Integer");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.lang.Long getLongClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof java.lang.Number) {
            return java.lang.Long.valueOf(((java.lang.Number) claim).longValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
        sb.append(str);
        sb.append("\" claim is not a Number");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.util.Date getDateClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof java.util.Date) {
            return (java.util.Date) claim;
        }
        if (claim instanceof java.lang.Number) {
            return com.nimbusds.jwt.util.DateUtils.fromSecondsSinceEpoch(((java.lang.Number) claim).longValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
        sb.append(str);
        sb.append("\" claim is not a Date");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.lang.Float getFloatClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof java.lang.Number) {
            return java.lang.Float.valueOf(((java.lang.Number) claim).floatValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
        sb.append(str);
        sb.append("\" claim is not a Float");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.lang.Double getDoubleClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof java.lang.Number) {
            return java.lang.Double.valueOf(((java.lang.Number) claim).doubleValue());
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
        sb.append(str);
        sb.append("\" claim is not a Double");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getJSONObjectClaim(java.lang.String str) throws java.text.ParseException {
        java.lang.Object claim = getClaim(str);
        if (claim == null) {
            return null;
        }
        if (claim instanceof java.util.Map) {
            java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
            for (java.util.Map.Entry entry : ((java.util.Map) claim).entrySet()) {
                if (entry.getKey() instanceof java.lang.String) {
                    newJSONObject.put((java.lang.String) entry.getKey(), entry.getValue());
                }
            }
            return newJSONObject;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("The \"");
        sb.append(str);
        sb.append("\" claim is not a JSON object or Map");
        throw new java.text.ParseException(sb.toString(), 0);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> getClaims() {
        return java.util.Collections.unmodifiableMap(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final com.nimbusds.jose.Payload toPayload() {
        return new com.nimbusds.jose.Payload(toJSONObject());
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject() {
        return toJSONObject(false);
    }

    public final java.util.Map<java.lang.String, java.lang.Object> toJSONObject(boolean z) {
        java.util.Map<java.lang.String, java.lang.Object> newJSONObject = com.nimbusds.jose.util.JSONObjectUtils.newJSONObject();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            if (entry.getValue() instanceof java.util.Date) {
                newJSONObject.put(entry.getKey(), java.lang.Long.valueOf(com.nimbusds.jwt.util.DateUtils.toSecondsSinceEpoch((java.util.Date) entry.getValue())));
            } else if ("aud".equals(entry.getKey())) {
                java.util.List<java.lang.String> audience = getAudience();
                if (audience == null || audience.isEmpty()) {
                    if (z) {
                        newJSONObject.put("aud", null);
                    }
                } else if (audience.size() == 1) {
                    newJSONObject.put("aud", audience.get(0));
                } else {
                    java.util.List<java.lang.Object> newJSONArray = com.nimbusds.jose.util.JSONArrayUtils.newJSONArray();
                    newJSONArray.addAll(audience);
                    newJSONObject.put("aud", newJSONArray);
                }
            } else if (entry.getValue() != null) {
                newJSONObject.put(entry.getKey(), entry.getValue());
            } else if (z) {
                newJSONObject.put(entry.getKey(), null);
            }
        }
        return newJSONObject;
    }

    public final java.lang.String toString() {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toJSONObject());
    }

    public final java.lang.String toString(boolean z) {
        return com.nimbusds.jose.util.JSONObjectUtils.toJSONString(toJSONObject(z));
    }

    public final <T> T toType(com.nimbusds.jwt.JWTClaimsSetTransformer<T> jWTClaimsSetTransformer) {
        return jWTClaimsSetTransformer.transform(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.nimbusds.jwt.JWTClaimsSet parse(java.util.Map<java.lang.String, java.lang.Object> map) throws java.text.ParseException {
        char c;
        com.nimbusds.jwt.JWTClaimsSet.Builder builder = new com.nimbusds.jwt.JWTClaimsSet.Builder();
        for (java.lang.String str : map.keySet()) {
            str.hashCode();
            switch (str.hashCode()) {
                case 96944:
                    if (str.equals("aud")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 100893:
                    if (str.equals("exp")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 104028:
                    if (str.equals("iat")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 104585:
                    if (str.equals("iss")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 105567:
                    if (str.equals("jti")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 108850:
                    if (str.equals("nbf")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 114240:
                    if (str.equals("sub")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    java.lang.Object obj = map.get("aud");
                    if (obj instanceof java.lang.String) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "aud"));
                        builder.audience(arrayList);
                        break;
                    } else if (obj instanceof java.util.List) {
                        builder.audience(com.nimbusds.jose.util.JSONObjectUtils.getStringList(map, "aud"));
                        break;
                    } else if (obj == null) {
                        builder.audience((java.lang.String) null);
                        break;
                    } else {
                        throw new java.text.ParseException("Unexpected type of aud claim", 0);
                    }
                case 1:
                    builder.expirationTime(new java.util.Date(com.nimbusds.jose.util.JSONObjectUtils.getLong(map, "exp") * 1000));
                    break;
                case 2:
                    builder.issueTime(new java.util.Date(com.nimbusds.jose.util.JSONObjectUtils.getLong(map, "iat") * 1000));
                    break;
                case 3:
                    builder.issuer(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "iss"));
                    break;
                case 4:
                    builder.jwtID(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "jti"));
                    break;
                case 5:
                    builder.notBeforeTime(new java.util.Date(com.nimbusds.jose.util.JSONObjectUtils.getLong(map, "nbf") * 1000));
                    break;
                case 6:
                    java.lang.Object obj2 = map.get("sub");
                    if (obj2 instanceof java.lang.String) {
                        builder.subject(com.nimbusds.jose.util.JSONObjectUtils.getString(map, "sub"));
                        break;
                    } else if (obj2 instanceof java.lang.Number) {
                        builder.subject(java.lang.String.valueOf(obj2));
                        break;
                    } else if (obj2 == null) {
                        builder.subject(null);
                        break;
                    } else {
                        throw new java.text.ParseException("Unexpected type of sub claim", 0);
                    }
                default:
                    builder.claim(str, map.get(str));
                    break;
            }
        }
        return builder.build();
    }

    public static com.nimbusds.jwt.JWTClaimsSet parse(java.lang.String str) throws java.text.ParseException {
        return parse(com.nimbusds.jose.util.JSONObjectUtils.parse(str));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.nimbusds.jwt.JWTClaimsSet) {
            return java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, ((com.nimbusds.jwt.JWTClaimsSet) obj).getHighResolutionOutputSizeshNQ4ISI);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
