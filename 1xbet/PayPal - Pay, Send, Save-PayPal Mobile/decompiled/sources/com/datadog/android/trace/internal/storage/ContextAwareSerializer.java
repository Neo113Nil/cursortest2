package com.datadog.android.trace.internal.storage;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001J!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/trace/internal/storage/ContextAwareSerializer;", "", "T", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "model", "", "serialize", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/lang/Object;)Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ContextAwareSerializer<T> {
    java.lang.String serialize(com.datadog.android.api.context.DatadogContext datadogContext, T model);
}
