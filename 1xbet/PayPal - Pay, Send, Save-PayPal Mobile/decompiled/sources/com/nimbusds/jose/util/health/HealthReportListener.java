package com.nimbusds.jose.util.health;

/* loaded from: classes10.dex */
public interface HealthReportListener<S, C extends com.nimbusds.jose.proc.SecurityContext> {
    void notify(com.nimbusds.jose.util.health.HealthReport<S, C> healthReport);
}
