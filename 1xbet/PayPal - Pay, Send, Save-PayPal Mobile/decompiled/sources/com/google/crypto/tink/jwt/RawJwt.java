package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class RawJwt {
    private static final long MAX_TIMESTAMP_VALUE = 253402300799L;
    private final com.google.gson.JsonObject payload;
    private final java.util.Optional<java.lang.String> typeHeader;

    private RawJwt(com.google.crypto.tink.jwt.RawJwt.Builder builder) {
        if (!builder.payload.has("exp") && !builder.withoutExpiration) {
            throw new java.lang.IllegalArgumentException("neither setExpiration() nor withoutExpiration() was called");
        }
        if (builder.payload.has("exp") && builder.withoutExpiration) {
            throw new java.lang.IllegalArgumentException("setExpiration() and withoutExpiration() must not be called together");
        }
        this.typeHeader = builder.typeHeader;
        this.payload = builder.payload.deepCopy();
    }

    private RawJwt(java.util.Optional<java.lang.String> optional, java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        this.typeHeader = optional;
        this.payload = com.google.crypto.tink.jwt.JsonUtil.parseJson(str);
        validateStringClaim("iss");
        validateStringClaim("sub");
        validateStringClaim("jti");
        validateTimestampClaim("exp");
        validateTimestampClaim("nbf");
        validateTimestampClaim("iat");
        validateAudienceClaim();
    }

    private void validateStringClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (this.payload.has(str)) {
            if (this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isString()) {
                return;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid JWT payload: claim ");
            sb.append(str);
            sb.append(" is not a string.");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
    }

    private void validateTimestampClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (this.payload.has(str)) {
            if (!this.payload.get(str).isJsonPrimitive() || !this.payload.get(str).getAsJsonPrimitive().isNumber()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid JWT payload: claim ");
                sb.append(str);
                sb.append(" is not a number.");
                throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
            }
            double asDouble = this.payload.get(str).getAsJsonPrimitive().getAsDouble();
            if (asDouble > 2.53402300799E11d || asDouble < 0.0d) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("invalid JWT payload: claim ");
                sb2.append(str);
                sb2.append(" has an invalid timestamp");
                throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
            }
        }
    }

    private void validateAudienceClaim() throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (this.payload.has("aud")) {
            if (!(this.payload.get("aud").isJsonPrimitive() && this.payload.get("aud").getAsJsonPrimitive().isString()) && getAudiences().size() <= 0) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid JWT payload: claim aud is present but empty.");
            }
        }
    }

    static com.google.crypto.tink.jwt.RawJwt fromJsonPayload(java.util.Optional<java.lang.String> optional, java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        return new com.google.crypto.tink.jwt.RawJwt(optional, str);
    }

    public static com.google.crypto.tink.jwt.RawJwt.Builder newBuilder() {
        return new com.google.crypto.tink.jwt.RawJwt.Builder();
    }

    public static final class Builder {
        private final com.google.gson.JsonObject payload;
        private java.util.Optional<java.lang.String> typeHeader;
        private boolean withoutExpiration;

        private Builder() {
            this.typeHeader = java.util.Optional.empty();
            this.withoutExpiration = false;
            this.payload = new com.google.gson.JsonObject();
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setTypeHeader(java.lang.String str) {
            this.typeHeader = java.util.Optional.of(str);
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setIssuer(java.lang.String str) {
            if (!com.google.crypto.tink.jwt.JsonUtil.isValidString(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            this.payload.add("iss", new com.google.gson.JsonPrimitive(str));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setSubject(java.lang.String str) {
            if (!com.google.crypto.tink.jwt.JsonUtil.isValidString(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            this.payload.add("sub", new com.google.gson.JsonPrimitive(str));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setAudience(java.lang.String str) {
            if (this.payload.has("aud") && this.payload.get("aud").isJsonArray()) {
                throw new java.lang.IllegalArgumentException("setAudience can't be used together with setAudiences or addAudience");
            }
            if (!com.google.crypto.tink.jwt.JsonUtil.isValidString(str)) {
                throw new java.lang.IllegalArgumentException("invalid string");
            }
            this.payload.add("aud", new com.google.gson.JsonPrimitive(str));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setAudiences(java.util.List<java.lang.String> list) {
            if (this.payload.has("aud") && !this.payload.get("aud").isJsonArray()) {
                throw new java.lang.IllegalArgumentException("setAudiences can't be used together with setAudience");
            }
            if (list.isEmpty()) {
                throw new java.lang.IllegalArgumentException("audiences must not be empty");
            }
            com.google.gson.JsonArray jsonArray = new com.google.gson.JsonArray();
            for (java.lang.String str : list) {
                if (!com.google.crypto.tink.jwt.JsonUtil.isValidString(str)) {
                    throw new java.lang.IllegalArgumentException("invalid string");
                }
                jsonArray.add(str);
            }
            this.payload.add("aud", jsonArray);
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addAudience(java.lang.String str) {
            com.google.gson.JsonArray jsonArray;
            if (!com.google.crypto.tink.jwt.JsonUtil.isValidString(str)) {
                throw new java.lang.IllegalArgumentException("invalid string");
            }
            if (this.payload.has("aud")) {
                com.google.gson.JsonElement jsonElement = this.payload.get("aud");
                if (!jsonElement.isJsonArray()) {
                    throw new java.lang.IllegalArgumentException("addAudience can't be used together with setAudience");
                }
                jsonArray = jsonElement.getAsJsonArray();
            } else {
                jsonArray = new com.google.gson.JsonArray();
            }
            jsonArray.add(str);
            this.payload.add("aud", jsonArray);
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setJwtId(java.lang.String str) {
            if (!com.google.crypto.tink.jwt.JsonUtil.isValidString(str)) {
                throw new java.lang.IllegalArgumentException();
            }
            this.payload.add("jti", new com.google.gson.JsonPrimitive(str));
            return this;
        }

        private void setTimestampClaim(java.lang.String str, java.time.Instant instant) {
            long epochSecond = instant.getEpochSecond();
            if (epochSecond > com.google.crypto.tink.jwt.RawJwt.MAX_TIMESTAMP_VALUE || epochSecond < 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("timestamp of claim ");
                sb.append(str);
                sb.append(" is out of range");
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
            this.payload.add(str, new com.google.gson.JsonPrimitive(java.lang.Long.valueOf(epochSecond)));
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setExpiration(java.time.Instant instant) {
            setTimestampClaim("exp", instant);
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder withoutExpiration() {
            this.withoutExpiration = true;
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setNotBefore(java.time.Instant instant) {
            setTimestampClaim("nbf", instant);
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder setIssuedAt(java.time.Instant instant) {
            setTimestampClaim("iat", instant);
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addBooleanClaim(java.lang.String str, boolean z) {
            com.google.crypto.tink.jwt.JwtNames.validate(str);
            this.payload.add(str, new com.google.gson.JsonPrimitive(java.lang.Boolean.valueOf(z)));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addNumberClaim(java.lang.String str, long j) {
            com.google.crypto.tink.jwt.JwtNames.validate(str);
            this.payload.add(str, new com.google.gson.JsonPrimitive(java.lang.Long.valueOf(j)));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addNumberClaim(java.lang.String str, double d) {
            com.google.crypto.tink.jwt.JwtNames.validate(str);
            this.payload.add(str, new com.google.gson.JsonPrimitive(java.lang.Double.valueOf(d)));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addStringClaim(java.lang.String str, java.lang.String str2) {
            if (!com.google.crypto.tink.jwt.JsonUtil.isValidString(str2)) {
                throw new java.lang.IllegalArgumentException();
            }
            com.google.crypto.tink.jwt.JwtNames.validate(str);
            this.payload.add(str, new com.google.gson.JsonPrimitive(str2));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addNullClaim(java.lang.String str) {
            com.google.crypto.tink.jwt.JwtNames.validate(str);
            this.payload.add(str, com.google.gson.JsonNull.INSTANCE);
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addJsonObjectClaim(java.lang.String str, java.lang.String str2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.crypto.tink.jwt.JwtNames.validate(str);
            this.payload.add(str, com.google.crypto.tink.jwt.JsonUtil.parseJson(str2));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt.Builder addJsonArrayClaim(java.lang.String str, java.lang.String str2) throws com.google.crypto.tink.jwt.JwtInvalidException {
            com.google.crypto.tink.jwt.JwtNames.validate(str);
            this.payload.add(str, com.google.crypto.tink.jwt.JsonUtil.parseJsonArray(str2));
            return this;
        }

        public final com.google.crypto.tink.jwt.RawJwt build() {
            return new com.google.crypto.tink.jwt.RawJwt(this);
        }
    }

    public final java.lang.String getJsonPayload() {
        return this.payload.toString();
    }

    final boolean hasBooleanClaim(java.lang.String str) {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        return this.payload.has(str) && this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isBoolean();
    }

    final java.lang.Boolean getBooleanClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        if (!this.payload.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("claim ");
            sb.append(str);
            sb.append(" does not exist");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (!this.payload.get(str).isJsonPrimitive() || !this.payload.get(str).getAsJsonPrimitive().isBoolean()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("claim ");
            sb2.append(str);
            sb2.append(" is not a boolean");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        return java.lang.Boolean.valueOf(this.payload.get(str).getAsBoolean());
    }

    final boolean hasNumberClaim(java.lang.String str) {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        return this.payload.has(str) && this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isNumber();
    }

    final java.lang.Double getNumberClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        if (!this.payload.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("claim ");
            sb.append(str);
            sb.append(" does not exist");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (!this.payload.get(str).isJsonPrimitive() || !this.payload.get(str).getAsJsonPrimitive().isNumber()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("claim ");
            sb2.append(str);
            sb2.append(" is not a number");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        return java.lang.Double.valueOf(this.payload.get(str).getAsDouble());
    }

    final boolean hasStringClaim(java.lang.String str) {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        return this.payload.has(str) && this.payload.get(str).isJsonPrimitive() && this.payload.get(str).getAsJsonPrimitive().isString();
    }

    final java.lang.String getStringClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        return getStringClaimInternal(str);
    }

    private java.lang.String getStringClaimInternal(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (!this.payload.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("claim ");
            sb.append(str);
            sb.append(" does not exist");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (!this.payload.get(str).isJsonPrimitive() || !this.payload.get(str).getAsJsonPrimitive().isString()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("claim ");
            sb2.append(str);
            sb2.append(" is not a string");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        return this.payload.get(str).getAsString();
    }

    final boolean isNullClaim(java.lang.String str) {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        try {
            return com.google.gson.JsonNull.INSTANCE.equals(this.payload.get(str));
        } catch (com.google.gson.JsonParseException unused) {
            return false;
        }
    }

    final boolean hasJsonObjectClaim(java.lang.String str) {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        return this.payload.has(str) && this.payload.get(str).isJsonObject();
    }

    final java.lang.String getJsonObjectClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        if (!this.payload.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("claim ");
            sb.append(str);
            sb.append(" does not exist");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (!this.payload.get(str).isJsonObject()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("claim ");
            sb2.append(str);
            sb2.append(" is not a JSON object");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        return this.payload.get(str).getAsJsonObject().toString();
    }

    final boolean hasJsonArrayClaim(java.lang.String str) {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        return this.payload.has(str) && this.payload.get(str).isJsonArray();
    }

    final java.lang.String getJsonArrayClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        com.google.crypto.tink.jwt.JwtNames.validate(str);
        if (!this.payload.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("claim ");
            sb.append(str);
            sb.append(" does not exist");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (!this.payload.get(str).isJsonArray()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("claim ");
            sb2.append(str);
            sb2.append(" is not a JSON array");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        return this.payload.get(str).getAsJsonArray().toString();
    }

    final boolean hasTypeHeader() {
        return this.typeHeader.isPresent();
    }

    final java.lang.String getTypeHeader() throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (!this.typeHeader.isPresent()) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("type header is not set");
        }
        return this.typeHeader.get();
    }

    final boolean hasIssuer() {
        return this.payload.has("iss");
    }

    final java.lang.String getIssuer() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return getStringClaimInternal("iss");
    }

    final boolean hasSubject() {
        return this.payload.has("sub");
    }

    final java.lang.String getSubject() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return getStringClaimInternal("sub");
    }

    final boolean hasJwtId() {
        return this.payload.has("jti");
    }

    final java.lang.String getJwtId() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return getStringClaimInternal("jti");
    }

    final boolean hasAudiences() {
        return this.payload.has("aud");
    }

    final java.util.List<java.lang.String> getAudiences() throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (!hasAudiences()) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("claim aud does not exist");
        }
        com.google.gson.JsonElement jsonElement = this.payload.get("aud");
        if (jsonElement.isJsonPrimitive()) {
            if (!jsonElement.getAsJsonPrimitive().isString()) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException(java.lang.String.format("invalid audience: got %s; want a string", jsonElement));
            }
            return java.util.Collections.unmodifiableList(java.util.Arrays.asList(jsonElement.getAsString()));
        }
        if (!jsonElement.isJsonArray()) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("claim aud is not a string or a JSON array");
        }
        com.google.gson.JsonArray asJsonArray = jsonElement.getAsJsonArray();
        java.util.ArrayList arrayList = new java.util.ArrayList(asJsonArray.size());
        for (int i = 0; i < asJsonArray.size(); i++) {
            if (!asJsonArray.get(i).isJsonPrimitive() || !asJsonArray.get(i).getAsJsonPrimitive().isString()) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException(java.lang.String.format("invalid audience: got %s; want a string", asJsonArray.get(i)));
            }
            arrayList.add(asJsonArray.get(i).getAsString());
        }
        return java.util.Collections.unmodifiableList(arrayList);
    }

    private java.time.Instant getInstant(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (!this.payload.has(str)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("claim ");
            sb.append(str);
            sb.append(" does not exist");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (!this.payload.get(str).isJsonPrimitive() || !this.payload.get(str).getAsJsonPrimitive().isNumber()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("claim ");
            sb2.append(str);
            sb2.append(" is not a timestamp");
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        try {
            return java.time.Instant.ofEpochMilli((long) (this.payload.get(str).getAsJsonPrimitive().getAsDouble() * 1000.0d));
        } catch (java.lang.NumberFormatException e) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("claim ");
            sb3.append(str);
            sb3.append(" is not a timestamp: ");
            sb3.append(e);
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb3.toString());
        }
    }

    final boolean hasExpiration() {
        return this.payload.has("exp");
    }

    final java.time.Instant getExpiration() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return getInstant("exp");
    }

    final boolean hasNotBefore() {
        return this.payload.has("nbf");
    }

    final java.time.Instant getNotBefore() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return getInstant("nbf");
    }

    final boolean hasIssuedAt() {
        return this.payload.has("iat");
    }

    final java.time.Instant getIssuedAt() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return getInstant("iat");
    }

    final java.util.Set<java.lang.String> customClaimNames() {
        java.util.HashSet hashSet = new java.util.HashSet();
        for (java.lang.String str : this.payload.keySet()) {
            if (!com.google.crypto.tink.jwt.JwtNames.isRegisteredName(str)) {
                hashSet.add(str);
            }
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    public final java.lang.String toString() {
        com.google.gson.JsonObject jsonObject = new com.google.gson.JsonObject();
        if (this.typeHeader.isPresent()) {
            jsonObject.add("typ", new com.google.gson.JsonPrimitive(this.typeHeader.get()));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(jsonObject);
        sb.append(".");
        sb.append(this.payload);
        return sb.toString();
    }
}
