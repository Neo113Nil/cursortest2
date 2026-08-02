package com.datadog.android.trace.internal;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/datadog/android/trace/internal/DatadogScopeListenerAdapter;", "Lcom/datadog/trace/api/scopemanager/ScopeListener;", "Lcom/datadog/android/trace/api/scope/DatadogScopeListener;", "delegate", "<init>", "(Lcom/datadog/android/trace/api/scope/DatadogScopeListener;)V", "", "afterScopeActivated", "()V", "afterScopeClosed", "Lcom/datadog/android/trace/api/scope/DatadogScopeListener;", "getDelegate$dd_sdk_android_trace_release", "()Lcom/datadog/android/trace/api/scope/DatadogScopeListener;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DatadogScopeListenerAdapter implements com.datadog.trace.api.scopemanager.ScopeListener {
    private final com.datadog.android.trace.api.scope.DatadogScopeListener delegate;

    public DatadogScopeListenerAdapter(com.datadog.android.trace.api.scope.DatadogScopeListener datadogScopeListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogScopeListener, "");
        this.delegate = datadogScopeListener;
    }

    /* renamed from: getDelegate$dd_sdk_android_trace_release, reason: from getter */
    public final com.datadog.android.trace.api.scope.DatadogScopeListener getDelegate() {
        return this.delegate;
    }

    @Override // com.datadog.trace.api.scopemanager.ScopeListener
    public final void afterScopeClosed() {
        this.delegate.afterScopeClosed();
    }

    @Override // com.datadog.trace.api.scopemanager.ScopeListener
    public final void afterScopeActivated() {
        this.delegate.afterScopeActivated();
    }
}
