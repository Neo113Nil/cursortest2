package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class JwtValidator {
    private static final java.time.Duration MAX_CLOCK_SKEW = java.time.Duration.ofMinutes(10);
    private final boolean allowMissingExpiration;
    private final java.time.Clock clock;
    private final java.time.Duration clockSkew;
    private final boolean expectIssuedInThePast;
    private final java.util.Optional<java.lang.String> expectedAudience;
    private final java.util.Optional<java.lang.String> expectedIssuer;
    private final java.util.Optional<java.lang.String> expectedTypeHeader;
    private final boolean ignoreAudiences;
    private final boolean ignoreIssuer;
    private final boolean ignoreTypeHeader;

    private JwtValidator(com.google.crypto.tink.jwt.JwtValidator.Builder builder) {
        this.expectedTypeHeader = builder.expectedTypeHeader;
        this.ignoreTypeHeader = builder.ignoreTypeHeader;
        this.expectedIssuer = builder.expectedIssuer;
        this.ignoreIssuer = builder.ignoreIssuer;
        this.expectedAudience = builder.expectedAudience;
        this.ignoreAudiences = builder.ignoreAudiences;
        this.allowMissingExpiration = builder.allowMissingExpiration;
        this.expectIssuedInThePast = builder.expectIssuedInThePast;
        this.clock = builder.clock;
        this.clockSkew = builder.clockSkew;
    }

    public static com.google.crypto.tink.jwt.JwtValidator.Builder newBuilder() {
        return new com.google.crypto.tink.jwt.JwtValidator.Builder();
    }

    public static final class Builder {
        private boolean allowMissingExpiration;
        private java.time.Clock clock;
        private java.time.Duration clockSkew;
        private boolean expectIssuedInThePast;
        private java.util.Optional<java.lang.String> expectedAudience;
        private java.util.Optional<java.lang.String> expectedIssuer;
        private java.util.Optional<java.lang.String> expectedTypeHeader;
        private boolean ignoreAudiences;
        private boolean ignoreIssuer;
        private boolean ignoreTypeHeader;

        private Builder() {
            this.clock = java.time.Clock.systemUTC();
            this.clockSkew = java.time.Duration.ZERO;
            this.expectedTypeHeader = java.util.Optional.empty();
            this.ignoreTypeHeader = false;
            this.expectedIssuer = java.util.Optional.empty();
            this.ignoreIssuer = false;
            this.expectedAudience = java.util.Optional.empty();
            this.ignoreAudiences = false;
            this.allowMissingExpiration = false;
            this.expectIssuedInThePast = false;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder expectTypeHeader(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("typ header cannot be null");
            }
            this.expectedTypeHeader = java.util.Optional.of(str);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder ignoreTypeHeader() {
            this.ignoreTypeHeader = true;
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder expectIssuer(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("issuer cannot be null");
            }
            this.expectedIssuer = java.util.Optional.of(str);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder ignoreIssuer() {
            this.ignoreIssuer = true;
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder expectAudience(java.lang.String str) {
            if (str == null) {
                throw new java.lang.NullPointerException("audience cannot be null");
            }
            this.expectedAudience = java.util.Optional.of(str);
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder ignoreAudiences() {
            this.ignoreAudiences = true;
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder expectIssuedInThePast() {
            this.expectIssuedInThePast = true;
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder setClock(java.time.Clock clock) {
            if (clock == null) {
                throw new java.lang.NullPointerException("clock cannot be null");
            }
            this.clock = clock;
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder setClockSkew(java.time.Duration duration) {
            if (duration.compareTo(com.google.crypto.tink.jwt.JwtValidator.MAX_CLOCK_SKEW) > 0) {
                throw new java.lang.IllegalArgumentException("Clock skew too large, max is 10 minutes");
            }
            this.clockSkew = duration;
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator.Builder allowMissingExpiration() {
            this.allowMissingExpiration = true;
            return this;
        }

        public final com.google.crypto.tink.jwt.JwtValidator build() {
            if (this.ignoreTypeHeader && this.expectedTypeHeader.isPresent()) {
                throw new java.lang.IllegalArgumentException("ignoreTypeHeader() and expectedTypeHeader() cannot be used together.");
            }
            if (this.ignoreIssuer && this.expectedIssuer.isPresent()) {
                throw new java.lang.IllegalArgumentException("ignoreIssuer() and expectedIssuer() cannot be used together.");
            }
            if (this.ignoreAudiences && this.expectedAudience.isPresent()) {
                throw new java.lang.IllegalArgumentException("ignoreAudiences() and expectedAudience() cannot be used together.");
            }
            return new com.google.crypto.tink.jwt.JwtValidator(this);
        }
    }

    private void validateTypeHeader(com.google.crypto.tink.jwt.RawJwt rawJwt) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (this.expectedTypeHeader.isPresent()) {
            if (!rawJwt.hasTypeHeader()) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException(java.lang.String.format("invalid JWT; missing expected type header %s.", this.expectedTypeHeader.get()));
            }
            if (!rawJwt.getTypeHeader().equals(this.expectedTypeHeader.get())) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException(java.lang.String.format("invalid JWT; expected type header %s, but got %s", this.expectedTypeHeader.get(), rawJwt.getTypeHeader()));
            }
            return;
        }
        if (rawJwt.hasTypeHeader() && !this.ignoreTypeHeader) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid JWT; token has type header set, but validator not.");
        }
    }

    private void validateIssuer(com.google.crypto.tink.jwt.RawJwt rawJwt) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (this.expectedIssuer.isPresent()) {
            if (!rawJwt.hasIssuer()) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException(java.lang.String.format("invalid JWT; missing expected issuer %s.", this.expectedIssuer.get()));
            }
            if (!rawJwt.getIssuer().equals(this.expectedIssuer.get())) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException(java.lang.String.format("invalid JWT; expected issuer %s, but got %s", this.expectedIssuer.get(), rawJwt.getIssuer()));
            }
            return;
        }
        if (rawJwt.hasIssuer() && !this.ignoreIssuer) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid JWT; token has issuer set, but validator not.");
        }
    }

    private void validateAudiences(com.google.crypto.tink.jwt.RawJwt rawJwt) throws com.google.crypto.tink.jwt.JwtInvalidException {
        if (this.expectedAudience.isPresent()) {
            if (!rawJwt.hasAudiences() || !rawJwt.getAudiences().contains(this.expectedAudience.get())) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException(java.lang.String.format("invalid JWT; missing expected audience %s.", this.expectedAudience.get()));
            }
        } else if (rawJwt.hasAudiences() && !this.ignoreAudiences) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("invalid JWT; token has audience set, but validator not.");
        }
    }

    final com.google.crypto.tink.jwt.VerifiedJwt validate(com.google.crypto.tink.jwt.RawJwt rawJwt) throws com.google.crypto.tink.jwt.JwtInvalidException {
        validateTimestampClaims(rawJwt);
        validateTypeHeader(rawJwt);
        validateIssuer(rawJwt);
        validateAudiences(rawJwt);
        return new com.google.crypto.tink.jwt.VerifiedJwt(rawJwt);
    }

    private void validateTimestampClaims(com.google.crypto.tink.jwt.RawJwt rawJwt) throws com.google.crypto.tink.jwt.JwtInvalidException {
        java.time.Instant instant = this.clock.instant();
        if (!rawJwt.hasExpiration() && !this.allowMissingExpiration) {
            throw new com.google.crypto.tink.jwt.JwtInvalidException("token does not have an expiration set");
        }
        if (rawJwt.hasExpiration() && !rawJwt.getExpiration().isAfter(instant.minus((java.time.temporal.TemporalAmount) this.clockSkew))) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("token has expired since ");
            sb.append(rawJwt.getExpiration());
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb.toString());
        }
        if (rawJwt.hasNotBefore() && rawJwt.getNotBefore().isAfter(instant.plus((java.time.temporal.TemporalAmount) this.clockSkew))) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("token cannot be used before ");
            sb2.append(rawJwt.getNotBefore());
            throw new com.google.crypto.tink.jwt.JwtInvalidException(sb2.toString());
        }
        if (this.expectIssuedInThePast) {
            if (!rawJwt.hasIssuedAt()) {
                throw new com.google.crypto.tink.jwt.JwtInvalidException("token does not have an iat claim");
            }
            if (rawJwt.getIssuedAt().isAfter(instant.plus((java.time.temporal.TemporalAmount) this.clockSkew))) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("token has a invalid iat claim in the future: ");
                sb3.append(rawJwt.getIssuedAt());
                throw new com.google.crypto.tink.jwt.JwtInvalidException(sb3.toString());
            }
        }
    }

    public final java.lang.String toString() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList();
        if (this.expectedTypeHeader.isPresent()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("expectedTypeHeader=");
            sb.append(this.expectedTypeHeader.get());
            arrayList.add(sb.toString());
        }
        if (this.ignoreTypeHeader) {
            arrayList.add("ignoreTypeHeader");
        }
        if (this.expectedIssuer.isPresent()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("expectedIssuer=");
            sb2.append(this.expectedIssuer.get());
            arrayList.add(sb2.toString());
        }
        if (this.ignoreIssuer) {
            arrayList.add("ignoreIssuer");
        }
        if (this.expectedAudience.isPresent()) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("expectedAudience=");
            sb3.append(this.expectedAudience.get());
            arrayList.add(sb3.toString());
        }
        if (this.ignoreAudiences) {
            arrayList.add("ignoreAudiences");
        }
        if (this.allowMissingExpiration) {
            arrayList.add("allowMissingExpiration");
        }
        if (this.expectIssuedInThePast) {
            arrayList.add("expectIssuedInThePast");
        }
        if (!this.clockSkew.isZero()) {
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("clockSkew=");
            sb4.append(this.clockSkew);
            arrayList.add(sb4.toString());
        }
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("JwtValidator{");
        java.lang.String str = "";
        for (java.lang.String str2 : arrayList) {
            sb5.append(str);
            sb5.append(str2);
            str = ",";
        }
        sb5.append("}");
        return sb5.toString();
    }
}
