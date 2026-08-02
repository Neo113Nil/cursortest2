package com.datadog.trace.bootstrap.instrumentation.api;

/* loaded from: classes3.dex */
public interface AgentPropagation {

    /* loaded from: classes8.dex */
    public interface BinaryContextVisitor<C> extends com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> {
        void forEachKey(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.BinaryKeyClassifier binaryKeyClassifier);
    }

    /* loaded from: classes8.dex */
    public interface BinaryKeyClassifier {
        boolean accept(java.lang.String str, byte[] bArr);
    }

    /* loaded from: classes8.dex */
    public interface BinarySetter<C> extends com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> {
        void set(C c, java.lang.String str, byte[] bArr);
    }

    public interface ContextVisitor<C> {
        void forEachKey(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.KeyClassifier keyClassifier);
    }

    public interface KeyClassifier {
        boolean accept(java.lang.String str, java.lang.String str2);
    }

    public interface Setter<C> {
        void set(C c, java.lang.String str, java.lang.String str2);
    }

    <C> com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context.Extracted extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor);

    <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan.Context context, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter);

    <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter);

    <C> void inject(com.datadog.trace.bootstrap.instrumentation.api.AgentSpan agentSpan, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter, com.datadog.trace.api.TracePropagationStyle tracePropagationStyle);
}
