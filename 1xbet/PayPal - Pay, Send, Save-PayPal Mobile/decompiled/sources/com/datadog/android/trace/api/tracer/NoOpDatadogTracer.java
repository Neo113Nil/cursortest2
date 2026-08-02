package com.datadog.android.trace.api.tracer;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/trace/api/tracer/NoOpDatadogTracer;", "Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "<init>", "()V", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "Lcom/datadog/android/trace/api/scope/DatadogScope;", "activateSpan", "(Lcom/datadog/android/trace/api/span/DatadogSpan;)Lcom/datadog/android/trace/api/scope/DatadogScope;", "activeSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/android/trace/api/scope/DatadogScopeListener;", "scopeListener", "", "addScopeListener", "(Lcom/datadog/android/trace/api/scope/DatadogScopeListener;)V", "", "spanName", "Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "buildSpan", "(Ljava/lang/CharSequence;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "instrumentationName", "(Ljava/lang/String;Ljava/lang/CharSequence;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/android/trace/api/propagation/DatadogPropagation;", "propagate", "()Lcom/datadog/android/trace/api/propagation/DatadogPropagation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NoOpDatadogTracer implements com.datadog.android.trace.api.tracer.DatadogTracer {
    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.span.DatadogSpan activeSpan() {
        return null;
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.propagation.DatadogPropagation propagate() {
        return new com.datadog.android.trace.api.propagation.NoOpDatadogPropagation();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder buildSpan(java.lang.CharSequence spanName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanName, "");
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.span.DatadogSpanBuilder buildSpan(java.lang.String instrumentationName, java.lang.CharSequence spanName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instrumentationName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(spanName, "");
        return new com.datadog.android.trace.api.span.NoOpDatadogSpanBuilder();
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final void addScopeListener(com.datadog.android.trace.api.scope.DatadogScopeListener scopeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scopeListener, "");
    }

    @Override // com.datadog.android.trace.api.tracer.DatadogTracer
    public final com.datadog.android.trace.api.scope.DatadogScope activateSpan(com.datadog.android.trace.api.span.DatadogSpan span) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(span, "");
        return null;
    }
}
