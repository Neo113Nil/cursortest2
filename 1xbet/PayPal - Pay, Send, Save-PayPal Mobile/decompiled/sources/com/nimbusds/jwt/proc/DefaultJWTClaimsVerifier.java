package com.nimbusds.jwt.proc;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class DefaultJWTClaimsVerifier<C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jwt.proc.JWTClaimsSetVerifier<C>, com.nimbusds.jwt.proc.ClockSkewAware {
    public static final int DEFAULT_MAX_CLOCK_SKEW_SECONDS = 60;
    private final java.util.Set<java.lang.String> Camera2StreamConfigurationMap;
    private final java.util.Set<java.lang.String> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.Set<java.lang.String> getHighSpeedVideoFpsRanges;
    private final com.nimbusds.jwt.JWTClaimsSet getHighSpeedVideoFpsRangesFor;
    private int getHighSpeedVideoSizes;

    @java.lang.Deprecated
    public DefaultJWTClaimsVerifier() {
        this(null, null, null, null);
    }

    public DefaultJWTClaimsVerifier(com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet, java.util.Set<java.lang.String> set) {
        this(null, jWTClaimsSet, set, null);
    }

    public DefaultJWTClaimsVerifier(java.lang.String str, com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet, java.util.Set<java.lang.String> set) {
        this(str != null ? java.util.Collections.singleton(str) : null, jWTClaimsSet, set, null);
    }

    public DefaultJWTClaimsVerifier(java.util.Set<java.lang.String> set, com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet, java.util.Set<java.lang.String> set2, java.util.Set<java.lang.String> set3) {
        this.getHighSpeedVideoSizes = 60;
        java.util.Set<java.lang.String> unmodifiableSet = set != null ? java.util.Collections.unmodifiableSet(set) : null;
        this.getHighSpeedVideoFpsRanges = unmodifiableSet;
        jWTClaimsSet = jWTClaimsSet == null ? new com.nimbusds.jwt.JWTClaimsSet.Builder().build() : jWTClaimsSet;
        this.getHighSpeedVideoFpsRangesFor = jWTClaimsSet;
        java.util.HashSet hashSet = new java.util.HashSet(jWTClaimsSet.getClaims().keySet());
        if (unmodifiableSet != null && !unmodifiableSet.contains(null)) {
            hashSet.add("aud");
        }
        if (set2 != null) {
            hashSet.addAll(set2);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableSet(hashSet);
        this.Camera2StreamConfigurationMap = set3 != null ? java.util.Collections.unmodifiableSet(set3) : java.util.Collections.emptySet();
    }

    public java.util.Set<java.lang.String> getAcceptedAudienceValues() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.nimbusds.jwt.JWTClaimsSet getExactMatchClaims() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Set<java.lang.String> getRequiredClaims() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.Set<java.lang.String> getProhibitedClaims() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.nimbusds.jwt.proc.ClockSkewAware
    public int getMaxClockSkew() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.nimbusds.jwt.proc.ClockSkewAware
    public void setMaxClockSkew(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    @Override // com.nimbusds.jwt.proc.JWTClaimsSetVerifier
    public void verify(com.nimbusds.jwt.JWTClaimsSet jWTClaimsSet, C c) throws com.nimbusds.jwt.proc.BadJWTException {
        if (this.getHighSpeedVideoFpsRanges != null) {
            java.util.List<java.lang.String> audience = jWTClaimsSet.getAudience();
            if (audience != null && !audience.isEmpty()) {
                java.util.Iterator<java.lang.String> it = audience.iterator();
                while (it.hasNext()) {
                    if (this.getHighSpeedVideoFpsRanges.contains(it.next())) {
                    }
                }
                throw new com.nimbusds.jwt.proc.BadJWTException("JWT audience rejected: ".concat(java.lang.String.valueOf(audience)));
            }
            if (!this.getHighSpeedVideoFpsRanges.contains(null)) {
                throw new com.nimbusds.jwt.proc.BadJWTException("JWT missing required audience");
            }
        }
        if (!jWTClaimsSet.getClaims().keySet().containsAll(this.getHighResolutionOutputSizeshNQ4ISI)) {
            java.util.TreeSet treeSet = new java.util.TreeSet(this.getHighResolutionOutputSizeshNQ4ISI);
            treeSet.removeAll(jWTClaimsSet.getClaims().keySet());
            throw new com.nimbusds.jwt.proc.BadJWTException("JWT missing required claims: ".concat(java.lang.String.valueOf(treeSet)));
        }
        java.util.TreeSet treeSet2 = new java.util.TreeSet();
        for (java.lang.String str : this.Camera2StreamConfigurationMap) {
            if (jWTClaimsSet.getClaims().containsKey(str)) {
                treeSet2.add(str);
            }
        }
        if (!treeSet2.isEmpty()) {
            throw new com.nimbusds.jwt.proc.BadJWTException("JWT has prohibited claims: ".concat(java.lang.String.valueOf(treeSet2)));
        }
        for (java.lang.String str2 : this.getHighSpeedVideoFpsRangesFor.getClaims().keySet()) {
            java.lang.Object claim = jWTClaimsSet.getClaim(str2);
            java.lang.Object claim2 = this.getHighSpeedVideoFpsRangesFor.getClaim(str2);
            if (!claim.equals(claim2)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("JWT ");
                sb.append(str2);
                sb.append(" claim has value ");
                sb.append(claim);
                sb.append(", must be ");
                sb.append(claim2);
                throw new com.nimbusds.jwt.proc.BadJWTException(sb.toString());
            }
        }
        java.util.Date currentTime = currentTime();
        if (currentTime != null) {
            java.util.Date expirationTime = jWTClaimsSet.getExpirationTime();
            if (expirationTime != null && !com.nimbusds.jwt.util.DateUtils.isAfter(expirationTime, currentTime, this.getHighSpeedVideoSizes)) {
                throw new com.nimbusds.jwt.proc.BadJWTException("Expired JWT");
            }
            java.util.Date notBeforeTime = jWTClaimsSet.getNotBeforeTime();
            if (notBeforeTime != null && !com.nimbusds.jwt.util.DateUtils.isBefore(notBeforeTime, currentTime, this.getHighSpeedVideoSizes)) {
                throw new com.nimbusds.jwt.proc.BadJWTException("JWT before use time");
            }
        }
    }

    protected java.util.Date currentTime() {
        return new java.util.Date();
    }
}
