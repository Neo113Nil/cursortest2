package com.datadog.trace.core.propagation;

/* loaded from: classes3.dex */
public class NoneCodec {
    public static final com.datadog.trace.core.propagation.HttpCodec.Injector INJECTOR = new com.datadog.trace.core.propagation.HttpCodec.Injector() { // from class: com.datadog.trace.core.propagation.NoneCodec.1
        @Override // com.datadog.trace.core.propagation.HttpCodec.Injector
        public <C> void inject(com.datadog.trace.core.DDSpanContext dDSpanContext, C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.Setter<C> setter) {
        }
    };
    public static final com.datadog.trace.core.propagation.HttpCodec.Extractor EXTRACTOR = new com.datadog.trace.core.propagation.HttpCodec.Extractor() { // from class: com.datadog.trace.core.propagation.NoneCodec.2
        @Override // com.datadog.trace.core.propagation.HttpCodec.Extractor
        public <C> com.datadog.trace.bootstrap.instrumentation.api.TagContext extract(C c, com.datadog.trace.bootstrap.instrumentation.api.AgentPropagation.ContextVisitor<C> contextVisitor) {
            return null;
        }
    };
}
