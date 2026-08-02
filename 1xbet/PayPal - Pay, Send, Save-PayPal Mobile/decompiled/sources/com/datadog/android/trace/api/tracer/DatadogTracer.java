package com.datadog.android.trace.api.tracer;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/trace/api/tracer/DatadogTracer;", "", "Lcom/datadog/android/trace/api/span/DatadogSpan;", "span", "Lcom/datadog/android/trace/api/scope/DatadogScope;", "activateSpan", "(Lcom/datadog/android/trace/api/span/DatadogSpan;)Lcom/datadog/android/trace/api/scope/DatadogScope;", "activeSpan", "()Lcom/datadog/android/trace/api/span/DatadogSpan;", "Lcom/datadog/android/trace/api/scope/DatadogScopeListener;", "scopeListener", "", "addScopeListener", "(Lcom/datadog/android/trace/api/scope/DatadogScopeListener;)V", "", "spanName", "Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "buildSpan", "(Ljava/lang/CharSequence;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "", "instrumentationName", "(Ljava/lang/String;Ljava/lang/CharSequence;)Lcom/datadog/android/trace/api/span/DatadogSpanBuilder;", "Lcom/datadog/android/trace/api/propagation/DatadogPropagation;", "propagate", "()Lcom/datadog/android/trace/api/propagation/DatadogPropagation;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface DatadogTracer {
    com.datadog.android.trace.api.scope.DatadogScope activateSpan(com.datadog.android.trace.api.span.DatadogSpan span);

    com.datadog.android.trace.api.span.DatadogSpan activeSpan();

    void addScopeListener(com.datadog.android.trace.api.scope.DatadogScopeListener scopeListener);

    com.datadog.android.trace.api.span.DatadogSpanBuilder buildSpan(java.lang.CharSequence spanName);

    com.datadog.android.trace.api.span.DatadogSpanBuilder buildSpan(java.lang.String instrumentationName, java.lang.CharSequence spanName);

    com.datadog.android.trace.api.propagation.DatadogPropagation propagate();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static com.datadog.android.trace.api.propagation.DatadogPropagation propagate(com.datadog.android.trace.api.tracer.DatadogTracer datadogTracer) {
            return new com.datadog.android.trace.api.propagation.NoOpDatadogPropagation();
        }
    }
}
