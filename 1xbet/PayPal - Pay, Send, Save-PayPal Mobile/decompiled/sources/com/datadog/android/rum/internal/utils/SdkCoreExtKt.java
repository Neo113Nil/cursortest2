package com.datadog.android.rum.internal.utils;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001ae\u0010\u0010\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\"\u0010\u0007\u001a\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011*.\b\u0000\u0010\u0014\"\u0013\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u00050\u00032\u0013\u0012\t\u0012\u00070\u0012¢\u0006\u0002\b\u0013\u0012\u0004\u0012\u00020\u00050\u0003"}, d2 = {"Lcom/datadog/android/api/feature/FeatureSdkCore;", "Lcom/datadog/android/api/context/DatadogContext;", "datadogContext", "Lkotlin/Function1;", "Lcom/datadog/android/api/storage/EventBatchWriter;", "", "Lcom/datadog/android/api/feature/EventWriteScope;", "writeScope", "Lcom/datadog/android/api/storage/DataWriter;", "", "rumDataWriter", "Lcom/datadog/android/api/storage/EventType;", "eventType", "Lkotlin/Function0;", "eventSource", "Lcom/datadog/android/rum/internal/utils/WriteOperation;", "newRumEventWriteOperation", "(Lcom/datadog/android/api/feature/FeatureSdkCore;Lcom/datadog/android/api/context/DatadogContext;Lkotlin/jvm/functions/Function1;Lcom/datadog/android/api/storage/DataWriter;Lcom/datadog/android/api/storage/EventType;Lkotlin/jvm/functions/Function0;)Lcom/datadog/android/rum/internal/utils/WriteOperation;", "Lcom/datadog/android/rum/internal/monitor/AdvancedRumMonitor;", "Lkotlin/ParameterName;", "EventOutcomeAction"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SdkCoreExtKt {
    public static /* synthetic */ com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation$default(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1 function1, com.datadog.android.api.storage.DataWriter dataWriter, com.datadog.android.api.storage.EventType eventType, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 8) != 0) {
            eventType = com.datadog.android.api.storage.EventType.DEFAULT;
        }
        return newRumEventWriteOperation(featureSdkCore, datadogContext, function1, dataWriter, eventType, function0);
    }

    public static final com.datadog.android.rum.internal.utils.WriteOperation newRumEventWriteOperation(com.datadog.android.api.feature.FeatureSdkCore featureSdkCore, com.datadog.android.api.context.DatadogContext datadogContext, kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function1<? super com.datadog.android.api.storage.EventBatchWriter, kotlin.Unit>, kotlin.Unit> function1, com.datadog.android.api.storage.DataWriter<java.lang.Object> dataWriter, com.datadog.android.api.storage.EventType eventType, kotlin.jvm.functions.Function0<? extends java.lang.Object> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureSdkCore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(datadogContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataWriter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        return new com.datadog.android.rum.internal.utils.WriteOperation(featureSdkCore, datadogContext, function1, dataWriter, eventType, function0);
    }
}
