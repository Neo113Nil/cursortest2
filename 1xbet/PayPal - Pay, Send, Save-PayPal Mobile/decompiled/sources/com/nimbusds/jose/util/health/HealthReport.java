package com.nimbusds.jose.util.health;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class HealthReport<S, C extends com.nimbusds.jose.proc.SecurityContext> implements com.nimbusds.jose.util.events.Event<S, C> {
    private final C context;
    private final java.lang.Exception exception;
    private final S source;
    private final com.nimbusds.jose.util.health.HealthStatus status;
    private final long timestamp;

    public HealthReport(S s, com.nimbusds.jose.util.health.HealthStatus healthStatus, long j, C c) {
        this(s, healthStatus, null, j, c);
    }

    public HealthReport(S s, com.nimbusds.jose.util.health.HealthStatus healthStatus, java.lang.Exception exc, long j, C c) {
        java.util.Objects.requireNonNull(s);
        this.source = s;
        java.util.Objects.requireNonNull(healthStatus);
        this.status = healthStatus;
        if (exc != null && com.nimbusds.jose.util.health.HealthStatus.HEALTHY.equals(healthStatus)) {
            throw new java.lang.IllegalArgumentException("Exception not accepted for a healthy status");
        }
        this.exception = exc;
        this.timestamp = j;
        this.context = c;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public S getSource() {
        return this.source;
    }

    @Override // com.nimbusds.jose.util.events.Event
    public C getContext() {
        return this.context;
    }

    public com.nimbusds.jose.util.health.HealthStatus getHealthStatus() {
        return this.status;
    }

    public java.lang.Exception getException() {
        return this.exception;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("HealthReport{source=");
        sb.append(this.source);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", exception=");
        sb.append(this.exception);
        sb.append(", timestamp=");
        sb.append(this.timestamp);
        sb.append(", context=");
        sb.append(this.context);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
