package com.datadog.android.trace.api.scope;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003"}, d2 = {"Lcom/datadog/android/trace/api/scope/NoOpDatadogScope;", "Lcom/datadog/android/trace/api/scope/DatadogScope;", "<init>", "()V", "", "close"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NoOpDatadogScope implements com.datadog.android.trace.api.scope.DatadogScope {
    @Override // com.datadog.android.trace.api.scope.DatadogScope, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
