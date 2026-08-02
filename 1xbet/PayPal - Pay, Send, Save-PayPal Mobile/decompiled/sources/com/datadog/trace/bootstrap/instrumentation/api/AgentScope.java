package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface AgentScope extends com.datadog.trace.context.TraceScope, java.io.Closeable {

    /* loaded from: classes8.dex */
    public interface Continuation extends com.datadog.trace.context.TraceScope.Continuation {
        @Override // com.datadog.trace.context.TraceScope.Continuation
        com.datadog.trace.bootstrap.instrumentation.api.AgentScope activate();

        com.datadog.trace.bootstrap.instrumentation.api.AgentSpan getSpan();
    }

    @Override // com.datadog.trace.context.TraceScope
    com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation capture();

    @Override // com.datadog.trace.context.TraceScope
    com.datadog.trace.bootstrap.instrumentation.api.AgentScope.Continuation captureConcurrent();

    @Override // com.datadog.trace.context.TraceScope, java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // com.datadog.trace.context.TraceScope
    void setAsyncPropagation(boolean z);

    byte source();

    com.datadog.trace.bootstrap.instrumentation.api.AgentSpan span();
}
