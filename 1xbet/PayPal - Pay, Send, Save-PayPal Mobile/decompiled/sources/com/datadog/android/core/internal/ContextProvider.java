package com.datadog.android.core.internal;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/datadog/android/core/internal/ContextProvider;", "", "", "", "withFeatureContexts", "Lcom/datadog/android/api/context/DatadogContext;", "getContext", "(Ljava/util/Set;)Lcom/datadog/android/api/context/DatadogContext;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ContextProvider {
    com.datadog.android.api.context.DatadogContext getContext(java.util.Set<java.lang.String> withFeatureContexts);
}
