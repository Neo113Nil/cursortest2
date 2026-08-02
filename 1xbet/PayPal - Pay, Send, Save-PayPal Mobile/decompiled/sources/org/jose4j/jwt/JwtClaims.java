package org.jose4j.jwt;

/* loaded from: classes18.dex */
public class JwtClaims {
    private java.lang.String Camera2StreamConfigurationMap;
    private java.util.Map<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI;

    public JwtClaims() {
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap();
    }

    private JwtClaims(java.lang.String str, org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.consumer.InvalidJwtException {
        this.Camera2StreamConfigurationMap = str;
        try {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.LinkedHashMap(org.jose4j.json.JsonUtil.parseJson(str));
        } catch (org.jose4j.lang.JoseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to parse what was expected to be the JWT Claim Set JSON: \"");
            sb.append(str);
            sb.append("\"");
            throw new org.jose4j.jwt.consumer.InvalidJwtException(sb.toString(), new org.jose4j.jwt.consumer.ErrorCodeValidator.Error(16, "Invalid JSON."), e, jwtContext);
        }
    }

    public static org.jose4j.jwt.JwtClaims parse(java.lang.String str, org.jose4j.jwt.consumer.JwtContext jwtContext) throws org.jose4j.jwt.consumer.InvalidJwtException {
        return new org.jose4j.jwt.JwtClaims(str, jwtContext);
    }

    public static org.jose4j.jwt.JwtClaims parse(java.lang.String str) throws org.jose4j.jwt.consumer.InvalidJwtException {
        return new org.jose4j.jwt.JwtClaims(str, null);
    }

    public java.lang.String getIssuer() throws org.jose4j.jwt.MalformedClaimException {
        return (java.lang.String) getClaimValue("iss", java.lang.String.class);
    }

    public void setIssuer(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.put("iss", str);
    }

    public java.lang.String getSubject() throws org.jose4j.jwt.MalformedClaimException {
        return (java.lang.String) getClaimValue("sub", java.lang.String.class);
    }

    public void setSubject(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.put("sub", str);
    }

    public void setAudience(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.put("aud", str);
    }

    public void setAudience(java.lang.String... strArr) {
        setAudience(java.util.Arrays.asList(strArr));
    }

    public void setAudience(java.util.List<java.lang.String> list) {
        if (list.size() == 1) {
            setAudience(list.get(0));
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.put("aud", list);
        }
    }

    public boolean hasAudience() {
        return hasClaim("aud");
    }

    public java.util.List<java.lang.String> getAudience() throws org.jose4j.jwt.MalformedClaimException {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get("aud");
        if (obj instanceof java.lang.String) {
            return java.util.Collections.singletonList((java.lang.String) obj);
        }
        if ((obj instanceof java.util.List) || obj == null) {
            return getHighSpeedVideoFpsRanges((java.util.List) obj, "aud");
        }
        throw new org.jose4j.jwt.MalformedClaimException("The value of the 'aud' claim is not an array of strings or a single string value.");
    }

    private static java.util.List<java.lang.String> getHighSpeedVideoFpsRanges(java.util.List list, java.lang.String str) throws org.jose4j.jwt.MalformedClaimException {
        if (list == null) {
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            try {
                arrayList.add((java.lang.String) obj);
            } catch (java.lang.ClassCastException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("The array value of the '");
                sb.append(str);
                sb.append("' claim contains non string values ");
                sb.append(getHighSpeedVideoFpsRanges(e, obj));
                throw new org.jose4j.jwt.MalformedClaimException(sb.toString(), e);
            }
        }
        return arrayList;
    }

    public org.jose4j.jwt.NumericDate getExpirationTime() throws org.jose4j.jwt.MalformedClaimException {
        return getNumericDateClaimValue("exp");
    }

    public void setExpirationTime(org.jose4j.jwt.NumericDate numericDate) {
        setNumericDateClaim("exp", numericDate);
    }

    public org.jose4j.jwt.NumericDate getNotBefore() throws org.jose4j.jwt.MalformedClaimException {
        return getNumericDateClaimValue("nbf");
    }

    public void setNotBefore(org.jose4j.jwt.NumericDate numericDate) {
        setNumericDateClaim("nbf", numericDate);
    }

    public org.jose4j.jwt.NumericDate getIssuedAt() throws org.jose4j.jwt.MalformedClaimException {
        return getNumericDateClaimValue("iat");
    }

    public void setIssuedAt(org.jose4j.jwt.NumericDate numericDate) {
        setNumericDateClaim("iat", numericDate);
    }

    public void setIssuedAtToNow() {
        setIssuedAt(org.jose4j.jwt.NumericDate.now());
    }

    public java.lang.String getJwtId() throws org.jose4j.jwt.MalformedClaimException {
        return (java.lang.String) getClaimValue("jti", java.lang.String.class);
    }

    public void setJwtId(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.put("jti", str);
    }

    public void setGeneratedJwtId(int i) {
        setJwtId(org.jose4j.base64url.Base64Url.encode(org.jose4j.lang.ByteUtil.randomBytes(i)));
    }

    public void setGeneratedJwtId() {
        setGeneratedJwtId(16);
    }

    public void unsetClaim(java.lang.String str) {
        this.getHighResolutionOutputSizeshNQ4ISI.remove(str);
    }

    public <T> T getClaimValue(java.lang.String str, java.lang.Class<T> cls) throws org.jose4j.jwt.MalformedClaimException {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.get(str);
        try {
            return cls.cast(obj);
        } catch (java.lang.ClassCastException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("The value of the '");
            sb.append(str);
            sb.append("' claim is not the expected type ");
            sb.append(getHighSpeedVideoFpsRanges(e, obj));
            throw new org.jose4j.jwt.MalformedClaimException(sb.toString(), e);
        }
    }

    public java.lang.Object getClaimValue(java.lang.String str) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(str);
    }

    public boolean hasClaim(java.lang.String str) {
        return getClaimValue(str) != null;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.ClassCastException classCastException, java.lang.Object obj) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(obj);
        sb.append(" - ");
        sb.append(classCastException.getMessage());
        sb.append(")");
        return sb.toString();
    }

    public org.jose4j.jwt.NumericDate getNumericDateClaimValue(java.lang.String str) throws org.jose4j.jwt.MalformedClaimException {
        java.lang.Number number = (java.lang.Number) getClaimValue(str, java.lang.Number.class);
        if (!(number instanceof java.math.BigInteger)) {
            if (number != null) {
                return org.jose4j.jwt.NumericDate.fromSeconds(number.longValue());
            }
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(number);
        sb.append(" is unreasonable for a NumericDate");
        throw new org.jose4j.jwt.MalformedClaimException(sb.toString());
    }

    public java.lang.String getStringClaimValue(java.lang.String str) throws org.jose4j.jwt.MalformedClaimException {
        return (java.lang.String) getClaimValue(str, java.lang.String.class);
    }

    public java.lang.String getClaimValueAsString(java.lang.String str) {
        java.lang.Object claimValue = getClaimValue(str);
        if (claimValue != null) {
            return claimValue.toString();
        }
        return null;
    }

    public java.util.List<java.lang.String> getStringListClaimValue(java.lang.String str) throws org.jose4j.jwt.MalformedClaimException {
        return getHighSpeedVideoFpsRanges((java.util.List) getClaimValue(str, java.util.List.class), str);
    }

    public void setNumericDateClaim(java.lang.String str, org.jose4j.jwt.NumericDate numericDate) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(str, numericDate != null ? java.lang.Long.valueOf(numericDate.getValue()) : null);
    }

    public void setStringClaim(java.lang.String str, java.lang.String str2) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(str, str2);
    }

    public void setStringListClaim(java.lang.String str, java.util.List<java.lang.String> list) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(str, list);
    }

    public void setStringListClaim(java.lang.String str, java.lang.String... strArr) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(str, java.util.Arrays.asList(strArr));
    }

    public void setClaim(java.lang.String str, java.lang.Object obj) {
        this.getHighResolutionOutputSizeshNQ4ISI.put(str, obj);
    }

    public boolean isClaimValueOfType(java.lang.String str, java.lang.Class cls) {
        try {
            return getClaimValue(str, cls) != null;
        } catch (org.jose4j.jwt.MalformedClaimException unused) {
            return false;
        }
    }

    public boolean isClaimValueString(java.lang.String str) {
        return isClaimValueOfType(str, java.lang.String.class);
    }

    public boolean isClaimValueStringList(java.lang.String str) {
        try {
            if (hasClaim(str)) {
                return getStringListClaimValue(str) != null;
            }
            return false;
        } catch (org.jose4j.jwt.MalformedClaimException unused) {
            return false;
        }
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> flattenClaims() {
        return flattenClaims(null);
    }

    public java.util.Map<java.lang.String, java.util.List<java.lang.Object>> flattenClaims(java.util.Set<java.lang.String> set) {
        if (set == null) {
            set = java.util.Collections.emptySet();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.getHighResolutionOutputSizeshNQ4ISI.entrySet()) {
            java.lang.String key = entry.getKey();
            if (!set.contains(key)) {
                getHighSpeedVideoSizes(null, key, entry.getValue(), linkedHashMap);
            }
        }
        return linkedHashMap;
    }

    private void getHighSpeedVideoSizes(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.util.Map<java.lang.String, java.util.List<java.lang.Object>> map) {
        java.lang.String obj2;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (str == null) {
            obj2 = "";
        } else {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(str);
            sb2.append(".");
            obj2 = sb2.toString();
        }
        sb.append(obj2);
        sb.append(str2);
        java.lang.String obj3 = sb.toString();
        if (obj instanceof java.util.List) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj4 : (java.util.List) obj) {
                if (obj4 instanceof java.util.Map) {
                    for (java.util.Map.Entry entry : ((java.util.Map) obj4).entrySet()) {
                        getHighSpeedVideoSizes(obj3, entry.getKey().toString(), entry.getValue(), map);
                    }
                } else {
                    arrayList.add(obj4);
                }
            }
            map.put(obj3, arrayList);
            return;
        }
        if (obj instanceof java.util.Map) {
            for (java.util.Map.Entry entry2 : ((java.util.Map) obj).entrySet()) {
                getHighSpeedVideoSizes(obj3, entry2.getKey().toString(), entry2.getValue(), map);
            }
            return;
        }
        map.put(obj3, java.util.Collections.singletonList(obj));
    }

    public java.util.Map<java.lang.String, java.lang.Object> getClaimsMap(java.util.Set<java.lang.String> set) {
        if (set == null) {
            set = java.util.Collections.emptySet();
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(this.getHighResolutionOutputSizeshNQ4ISI);
        java.util.Iterator<java.lang.String> it = set.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove(it.next());
        }
        return linkedHashMap;
    }

    public java.util.Map<java.lang.String, java.lang.Object> getClaimsMap() {
        return getClaimsMap(null);
    }

    public java.util.Collection<java.lang.String> getClaimNames(java.util.Set<java.lang.String> set) {
        return getClaimsMap(set).keySet();
    }

    public java.util.Collection<java.lang.String> getClaimNames() {
        return getClaimNames(null);
    }

    public java.lang.String toJson() {
        return org.jose4j.json.JsonUtil.toJson(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public java.lang.String getRawJson() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("JWT Claims Set:");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        return sb.toString();
    }

    public void setExpirationTimeMinutesInTheFuture(float f) {
        org.jose4j.jwt.NumericDate now = org.jose4j.jwt.NumericDate.now();
        now.addSeconds((long) (f * 60.0f));
        setExpirationTime(now);
    }

    public void setNotBeforeMinutesInThePast(float f) {
        org.jose4j.jwt.NumericDate now = org.jose4j.jwt.NumericDate.now();
        now.addSeconds((long) (f * (-1.0f) * 60.0f));
        setNotBefore(now);
    }
}
