package com.datadog.android.sessionreplay.internal.net;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\"B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/net/ResourcesRequestFactory;", "Lcom/datadog/android/api/net/RequestFactory;", "", "customEndpointUrl", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/internal/net/ResourceRequestBodyFactory;", "resourceRequestBodyFactory", "<init>", "(Ljava/lang/String;Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/internal/net/ResourceRequestBodyFactory;)V", "Lokhttp3/RequestBody;", "p0", "", "getHighResolutionOutputSizeshNQ4ISI", "(Lokhttp3/RequestBody;)[B", "Lcom/datadog/android/api/context/DatadogContext;", "context", "Lcom/datadog/android/api/net/RequestExecutionContext;", "executionContext", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchData", "batchMetadata", "Lcom/datadog/android/api/net/Request;", "create", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/net/RequestExecutionContext;Ljava/util/List;[B)Lcom/datadog/android/api/net/Request;", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_session_replay_release", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/net/ResourceRequestBodyFactory;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourcesRequestFactory implements com.datadog.android.api.net.RequestFactory {
    public static final java.lang.String APPLICATION_ID = "application_id";
    public static final java.lang.String ERROR_CONVERTING_BODY_TO_BYTEARRAY = "Error converting request body to bytearray";
    public static final java.lang.String UPLOAD_DESCRIPTION = "Session Replay Resource Upload Request";
    private final java.lang.String customEndpointUrl;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory getHighSpeedVideoFpsRanges;

    public ResourcesRequestFactory(java.lang.String str, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory resourceRequestBodyFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resourceRequestBodyFactory, "");
        this.customEndpointUrl = str;
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.getHighSpeedVideoFpsRanges = resourceRequestBodyFactory;
    }

    /* renamed from: getCustomEndpointUrl$dd_sdk_android_session_replay_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    public /* synthetic */ ResourcesRequestFactory(java.lang.String str, com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory resourceRequestBodyFactory, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, internalLogger, (i & 4) != 0 ? new com.datadog.android.sessionreplay.internal.net.ResourceRequestBodyFactory(internalLogger) : resourceRequestBodyFactory);
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public final com.datadog.android.api.net.Request create(com.datadog.android.api.context.DatadogContext context, com.datadog.android.api.net.RequestExecutionContext executionContext, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batchData, byte[] batchMetadata) {
        byte[] highResolutionOutputSizeshNQ4ISI;
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchData, "");
        okhttp3.RequestBody create$dd_sdk_android_session_replay_release = this.getHighSpeedVideoFpsRanges.create$dd_sdk_android_session_replay_release(batchData);
        if (create$dd_sdk_android_session_replay_release == null || (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(create$dd_sdk_android_session_replay_release)) == null) {
            return null;
        }
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
        return new com.datadog.android.api.net.Request(obj, UPLOAD_DESCRIPTION, str, mapOf, highResolutionOutputSizeshNQ4ISI, java.lang.String.valueOf(create$dd_sdk_android_session_replay_release.getContentType()));
    }

    private final byte[] getHighResolutionOutputSizeshNQ4ISI(okhttp3.RequestBody p0) {
        okio.Buffer buffer = new okio.Buffer();
        try {
            p0.writeTo(buffer);
        } catch (java.io.IOException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourcesRequestFactory$convertBodyToByteArray$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.sessionreplay.internal.net.ResourcesRequestFactory.ERROR_CONVERTING_BODY_TO_BYTEARRAY;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
        try {
            return buffer.readByteArray();
        } catch (java.io.EOFException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.net.ResourcesRequestFactory$convertBodyToByteArray$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.sessionreplay.internal.net.ResourcesRequestFactory.ERROR_CONVERTING_BODY_TO_BYTEARRAY;
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }
}
