package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/datadog/android/profiling/internal/ProfilingRequestFactory;", "Lcom/datadog/android/api/net/RequestFactory;", "", "customEndpointUrl", "<init>", "(Ljava/lang/String;)V", "Lcom/datadog/android/api/context/DatadogContext;", "context", "Lcom/datadog/android/api/net/RequestExecutionContext;", "executionContext", "", "Lcom/datadog/android/api/storage/RawBatchEvent;", "batchData", "", "batchMetadata", "Lcom/datadog/android/api/net/Request;", "create", "(Lcom/datadog/android/api/context/DatadogContext;Lcom/datadog/android/api/net/RequestExecutionContext;Ljava/util/List;[B)Lcom/datadog/android/api/net/Request;", "Ljava/lang/String;", "getCustomEndpointUrl$dd_sdk_android_profiling_release", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfilingRequestFactory implements com.datadog.android.api.net.RequestFactory {
    private final java.lang.String customEndpointUrl;
    private static final okhttp3.MediaType getHighSpeedVideoFpsRanges = okhttp3.MediaType.INSTANCE.parse(com.paypal.oslo.downloads.impl.util.ResponseMetadataExtractor.MIME_TYPE_OCTET_STREAM);
    private static final okhttp3.MediaType getHighResolutionOutputSizeshNQ4ISI = okhttp3.MediaType.INSTANCE.parse("application/json");

    public ProfilingRequestFactory(java.lang.String str) {
        this.customEndpointUrl = str;
    }

    /* renamed from: getCustomEndpointUrl$dd_sdk_android_profiling_release, reason: from getter */
    public final java.lang.String getCustomEndpointUrl() {
        return this.customEndpointUrl;
    }

    @Override // com.datadog.android.api.net.RequestFactory
    public final com.datadog.android.api.net.Request create(com.datadog.android.api.context.DatadogContext context, com.datadog.android.api.net.RequestExecutionContext executionContext, java.util.List<com.datadog.android.api.storage.RawBatchEvent> batchData, byte[] batchMetadata) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(batchData, "");
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        okhttp3.MultipartBody.Builder type = new okhttp3.MultipartBody.Builder(null, 1, null).setType(okhttp3.MultipartBody.FORM);
        for (com.datadog.android.api.storage.RawBatchEvent rawBatchEvent : batchData) {
            type.addFormDataPart("perfetto.proto", "perfetto.proto", okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, rawBatchEvent.getMetadata(), getHighSpeedVideoFpsRanges, 0, 0, 6, (java.lang.Object) null));
            type.addFormDataPart("event", "event.json", okhttp3.RequestBody.Companion.create$default(okhttp3.RequestBody.INSTANCE, rawBatchEvent.getData(), getHighResolutionOutputSizeshNQ4ISI, 0, 0, 6, (java.lang.Object) null));
        }
        okhttp3.MultipartBody build = type.build();
        java.lang.String str = this.customEndpointUrl;
        if (str == null) {
            java.lang.String intakeEndpoint = context.getSite().getIntakeEndpoint();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(intakeEndpoint);
            sb.append("/api/v2/profile");
            str = sb.toString();
        }
        java.lang.String str2 = str;
        java.util.Map mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("DD-API-KEY", context.getClientToken()), kotlin.TuplesKt.to("DD-EVP-ORIGIN", context.getSource()), kotlin.TuplesKt.to("DD-EVP-ORIGIN-VERSION", context.getSdkVersion()), kotlin.TuplesKt.to("DD-REQUEST-ID", obj));
        okio.Buffer buffer = new okio.Buffer();
        build.writeTo(buffer);
        return new com.datadog.android.api.net.Request(obj, "Profiling Request", str2, mapOf, buffer.readByteArray(), java.lang.String.valueOf(build.getContentType()));
    }
}
