package com.datadog.android.rum.internal.domain.scope;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u001d\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJS\u0010\u0014\u001a\u0004\u0018\u00010\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0011\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r\u0012\u0004\u0012\u00020\u000f0\rj\u0002`\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "", "", "", "getCustomAttributes", "()Ljava/util/Map;", "Lcom/datadog/android/rum/internal/domain/RumContext;", "getRumContext", "()Lcom/datadog/android/rum/internal/domain/RumContext;", "Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;", "event", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "writeScope", "Lcom/datadog/android/api/storage/DataWriter;", "writer", "handleEvent", "(Lcom/datadog/android/rum/internal/domain/scope/RumRawEvent;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;)Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "", "isActive", "()Z", "getParentScope", "()Lcom/datadog/android/rum/internal/domain/scope/RumScope;", "parentScope"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RumScope {
    java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes();

    com.datadog.android.rum.internal.domain.scope.RumScope getParentScope();

    com.datadog.android.rum.internal.domain.RumContext getRumContext();

    com.datadog.android.rum.internal.domain.scope.RumScope handleEvent(com.datadog.android.rum.internal.domain.scope.RumRawEvent event, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> writeScope, com.datadog.android.api.storage.DataWriter<java.lang.Object> writer);

    boolean isActive();

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.util.Map<java.lang.String, java.lang.Object> getCustomAttributes(com.datadog.android.rum.internal.domain.scope.RumScope rumScope) {
            java.util.Map<java.lang.String, java.lang.Object> customAttributes;
            com.datadog.android.rum.internal.domain.scope.RumScope parentScope = rumScope.getParentScope();
            return (parentScope == null || (customAttributes = parentScope.getCustomAttributes()) == null) ? kotlin.collections.MapsKt.emptyMap() : customAttributes;
        }
    }
}
