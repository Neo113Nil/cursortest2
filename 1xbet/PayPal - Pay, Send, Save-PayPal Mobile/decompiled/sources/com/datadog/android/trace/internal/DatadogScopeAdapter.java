package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogScopeAdapter;", "Lcom/datadog/android/trace/api/scope/DatadogScope;", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentScope;", "delegate", "<init>", "(Lcom/datadog/trace/bootstrap/instrumentation/api/AgentScope;)V", "", "close", "()V", "Lcom/datadog/trace/bootstrap/instrumentation/api/AgentScope;", "getDelegate$dd_sdk_android_trace_release", "()Lcom/datadog/trace/bootstrap/instrumentation/api/AgentScope;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DatadogScopeAdapter implements com.datadog.android.trace.api.scope.DatadogScope {
    private final com.datadog.trace.bootstrap.instrumentation.api.AgentScope delegate;

    public DatadogScopeAdapter(com.datadog.trace.bootstrap.instrumentation.api.AgentScope agentScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(agentScope, "");
        this.delegate = agentScope;
    }

    /* renamed from: getDelegate$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.trace.bootstrap.instrumentation.api.AgentScope getDelegate() {
        return this.delegate;
    }

    @Override // com.datadog.android.trace.api.scope.DatadogScope, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }
}
