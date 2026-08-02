package com.nimbusds.jose.jwk.source;

@net.jcip.annotations.ThreadSafe
/* loaded from: classes10.dex */
public class JWKSetSourceWithHealthStatusReporting<C extends com.nimbusds.jose.proc.SecurityContext> extends com.nimbusds.jose.jwk.source.JWKSetSourceWrapper<C> {
    private final com.nimbusds.jose.util.health.HealthReportListener<com.nimbusds.jose.jwk.source.JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener;

    public JWKSetSourceWithHealthStatusReporting(com.nimbusds.jose.jwk.source.JWKSetSource<C> jWKSetSource, com.nimbusds.jose.util.health.HealthReportListener<com.nimbusds.jose.jwk.source.JWKSetSourceWithHealthStatusReporting<C>, C> healthReportListener) {
        super(jWKSetSource);
        java.util.Objects.requireNonNull(healthReportListener);
        this.healthReportListener = healthReportListener;
    }

    @Override // com.nimbusds.jose.jwk.source.JWKSetSource
    public com.nimbusds.jose.jwk.JWKSet getJWKSet(com.nimbusds.jose.jwk.source.JWKSetCacheRefreshEvaluator jWKSetCacheRefreshEvaluator, long j, C c) throws com.nimbusds.jose.KeySourceException {
        try {
            com.nimbusds.jose.jwk.JWKSet jWKSet = getSource().getJWKSet(jWKSetCacheRefreshEvaluator, j, c);
            this.healthReportListener.notify(new com.nimbusds.jose.util.health.HealthReport<>(this, com.nimbusds.jose.util.health.HealthStatus.HEALTHY, j, c));
            return jWKSet;
        } catch (java.lang.Exception e) {
            this.healthReportListener.notify(new com.nimbusds.jose.util.health.HealthReport<>(this, com.nimbusds.jose.util.health.HealthStatus.NOT_HEALTHY, e, j, c));
            throw e;
        }
    }
}
