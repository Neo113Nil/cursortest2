package com.datadog.android.trace.internal.net;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/trace/internal/net/TracesRequestFactory;", "Lcom/datadog/android/api/net/RequestFactory;", "", "customEndpointUrl", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/api/context/DatadogContext;", "context", "Lcom/datadog/android/api/net/RequestExecutionContext;", "executionContext", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchData", "", "batchMetadata", "Lcom/datadog/android/api/net/Request;", "create", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/net/RequestExecutionContext;Ljava/util/List;[B)Lcom/datadog/android/api/net/Request;", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_trace_release", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TracesRequestFactory implements com.datadog.android.api.net.RequestFactory {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI;
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;
    private final java.lang.String customEndpointUrl;

    public TracesRequestFactory(java.lang.String str, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.customEndpointUrl = str;
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    /* renamed from: getCustomEndpointUrl$dd_sdk_android_trace_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public final com.datadog.android.api.net.Request create(com.datadog.android.api.context.DatadogContext context, com.datadog.android.api.net.RequestExecutionContext executionContext, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batchData, byte[] batchMetadata) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchData, "");
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.lang.String str = this.customEndpointUrl;
        if (str == null) {
            java.lang.String intakeEndpoint = context.getSite().getIntakeEndpoint();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(intakeEndpoint);
            sb.append("/api/v2/spans");
            str = sb.toString();
        }
        java.lang.String str2 = str;
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("DD-API-KEY", context.getClientToken()), kotlin.TuplesKt.to("DD-EVP-ORIGIN", context.getSource()), kotlin.TuplesKt.to("DD-EVP-ORIGIN-VERSION", context.getSdkVersion()), kotlin.TuplesKt.to("DD-REQUEST-ID", obj));
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> list = batchData;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.datadog.android.api.storage.RawBatchEvent) it.next()).getData());
        }
        return new com.datadog.android.api.net.Request(obj, "Traces Request", str2, mapOf, com.datadog.android.core.internal.utils.ByteArrayExtKt.join$default(arrayList, getHighResolutionOutputSizeshNQ4ISI, null, null, this.Camera2StreamConfigurationMap, 6, null), "text/plain;charset=UTF-8");
    }

    static {
        byte[] bytes = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        getHighResolutionOutputSizeshNQ4ISI = bytes;
    }
}
