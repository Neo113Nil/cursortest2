package com.datadog.android.trace.internal.domain.event;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003J\u001f\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/trace/internal/domain/event/ContextAwareMapper;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "T", "", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "model", "map", "(Lcom/datadog/android/api/context/DatadogContext;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ContextAwareMapper<R, T> {
    T map(com.datadog.android.api.context.DatadogContext datadogContext, R model);
}
