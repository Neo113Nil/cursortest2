package com.datadog.android.sessionreplay.internal.net;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ7\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/SegmentRequestFactory;", "Lcom/datadog/android/api/net/RequestFactory;", "", "customEndpointUrl", "Lcom/datadog/android/sessionreplay/internal/net/BatchesToSegmentsMapper;", "batchToSegmentsMapper", "Lcom/datadog/android/sessionreplay/internal/net/SegmentRequestBodyFactory;", "segmentRequestBodyFactory", "<init>", "(Ljava/lang/String;Lcom/datadog/android/sessionreplay/internal/net/BatchesToSegmentsMapper;Lcom/datadog/android/sessionreplay/internal/net/SegmentRequestBodyFactory;)V", "Lcom/datadog/android/api/context/DatadogContext;", "context", "Lcom/datadog/android/api/net/RequestExecutionContext;", "executionContext", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchData", "", "batchMetadata", "Lcom/datadog/android/api/net/Request;", "create", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/net/RequestExecutionContext;Ljava/util/List;[B)Lcom/datadog/android/api/net/Request;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/internal/net/BatchesToSegmentsMapper;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_session_replay_release", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/net/SegmentRequestBodyFactory;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SegmentRequestFactory implements com.datadog.android.api.net.RequestFactory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper getHighSpeedVideoFpsRangesFor;
    private final java.lang.String customEndpointUrl;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory getHighSpeedVideoFpsRanges;

    public SegmentRequestFactory(java.lang.String str, com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper batchesToSegmentsMapper, com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory segmentRequestBodyFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchesToSegmentsMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(segmentRequestBodyFactory, "");
        this.customEndpointUrl = str;
        this.getHighSpeedVideoFpsRangesFor = batchesToSegmentsMapper;
        this.getHighSpeedVideoFpsRanges = segmentRequestBodyFactory;
    }

    /* renamed from: getCustomEndpointUrl$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    public /* synthetic */ SegmentRequestFactory(java.lang.String str, com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper batchesToSegmentsMapper, com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory segmentRequestBodyFactory, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, batchesToSegmentsMapper, (i & 4) != 0 ? new com.datadog.android.sessionreplay.internal.net.SegmentRequestBodyFactory(null, 1, null) : segmentRequestBodyFactory);
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public final com.datadog.android.api.net.Request create(com.datadog.android.api.context.DatadogContext context, com.datadog.android.api.net.RequestExecutionContext executionContext, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batchData, byte[] batchMetadata) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchData, "");
        com.datadog.android.sessionreplay.internal.net.BatchesToSegmentsMapper batchesToSegmentsMapper = this.getHighSpeedVideoFpsRangesFor;
        java.util.List<com.datadog.android.api.storage.RawBatchEvent> list = batchData;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.datadog.android.api.storage.RawBatchEvent) it.next()).getData());
        }
        java.util.List<kotlin.Pair<com.datadog.android.sessionreplay.model.MobileSegment, com.google.gson.JsonObject>> map = batchesToSegmentsMapper.map(context, arrayList);
        if (map.isEmpty()) {
            throw new com.datadog.android.sessionreplay.internal.exception.InvalidPayloadFormatException("The payload format was broken and an upload request could not be created");
        }
        okhttp3.RequestBody create = this.getHighSpeedVideoFpsRanges.create(map);
        okio.Buffer buffer = new okio.Buffer();
        create.writeTo(buffer);
        byte[] readByteArray = buffer.readByteArray();
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("DD-API-KEY", context.getClientToken()), kotlin.TuplesKt.to("DD-EVP-ORIGIN", context.getSource()), kotlin.TuplesKt.to("DD-EVP-ORIGIN-VERSION", context.getSdkVersion()), kotlin.TuplesKt.to("DD-REQUEST-ID", obj));
        java.lang.String str2 = this.customEndpointUrl;
        if (str2 == null) {
            java.lang.String intakeEndpoint = context.getSite().getIntakeEndpoint();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(intakeEndpoint);
            sb.append("/api/v2/replay");
            str = sb.toString();
        } else {
            str = str2;
        }
        return new com.datadog.android.api.net.Request(obj, "Session Replay Segment Upload Request", str, mapOf, readByteArray, java.lang.String.valueOf(create.getContentType()));
    }
}
