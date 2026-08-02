package com.datadog.trace.api.scopemanager;

/* loaded from: classes3.dex */
public interface ExtendedScopeListener extends com.datadog.trace.api.scopemanager.ScopeListener {
    void afterScopeActivated(com.datadog.trace.api.DDTraceId dDTraceId, long j, long j2, com.datadog.trace.api.TraceConfig traceConfig);

    @Override // com.datadog.trace.api.scopemanager.ScopeListener
    void afterScopeClosed();
}
