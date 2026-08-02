package com.google.crypto.tink.jwt;

@com.google.errorprone.annotations.Immutable
/* loaded from: classes9.dex */
public final class VerifiedJwt {
    private final com.google.crypto.tink.jwt.RawJwt rawJwt;

    VerifiedJwt(com.google.crypto.tink.jwt.RawJwt rawJwt) {
        this.rawJwt = rawJwt;
    }

    public final java.lang.String getTypeHeader() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getTypeHeader();
    }

    public final boolean hasTypeHeader() {
        return this.rawJwt.hasTypeHeader();
    }

    public final java.lang.String getIssuer() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getIssuer();
    }

    public final boolean hasIssuer() {
        return this.rawJwt.hasIssuer();
    }

    public final java.lang.String getSubject() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getSubject();
    }

    public final boolean hasSubject() {
        return this.rawJwt.hasSubject();
    }

    public final java.util.List<java.lang.String> getAudiences() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getAudiences();
    }

    public final boolean hasAudiences() {
        return this.rawJwt.hasAudiences();
    }

    public final java.lang.String getJwtId() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getJwtId();
    }

    public final boolean hasJwtId() {
        return this.rawJwt.hasJwtId();
    }

    public final java.time.Instant getExpiration() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getExpiration();
    }

    public final boolean hasExpiration() {
        return this.rawJwt.hasExpiration();
    }

    public final java.time.Instant getNotBefore() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getNotBefore();
    }

    public final boolean hasNotBefore() {
        return this.rawJwt.hasNotBefore();
    }

    public final java.time.Instant getIssuedAt() throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getIssuedAt();
    }

    public final boolean hasIssuedAt() {
        return this.rawJwt.hasIssuedAt();
    }

    public final java.lang.Boolean getBooleanClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getBooleanClaim(str);
    }

    public final java.lang.Double getNumberClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getNumberClaim(str);
    }

    public final java.lang.String getStringClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getStringClaim(str);
    }

    public final boolean isNullClaim(java.lang.String str) {
        return this.rawJwt.isNullClaim(str);
    }

    public final java.lang.String getJsonObjectClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getJsonObjectClaim(str);
    }

    public final java.lang.String getJsonArrayClaim(java.lang.String str) throws com.google.crypto.tink.jwt.JwtInvalidException {
        return this.rawJwt.getJsonArrayClaim(str);
    }

    public final boolean hasBooleanClaim(java.lang.String str) {
        return this.rawJwt.hasBooleanClaim(str);
    }

    public final boolean hasNumberClaim(java.lang.String str) {
        return this.rawJwt.hasNumberClaim(str);
    }

    public final boolean hasStringClaim(java.lang.String str) {
        return this.rawJwt.hasStringClaim(str);
    }

    public final boolean hasJsonObjectClaim(java.lang.String str) {
        return this.rawJwt.hasJsonObjectClaim(str);
    }

    public final boolean hasJsonArrayClaim(java.lang.String str) {
        return this.rawJwt.hasJsonArrayClaim(str);
    }

    public final java.util.Set<java.lang.String> customClaimNames() {
        return this.rawJwt.customClaimNames();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("verified{");
        sb.append(this.rawJwt);
        sb.append("}");
        return sb.toString();
    }
}
