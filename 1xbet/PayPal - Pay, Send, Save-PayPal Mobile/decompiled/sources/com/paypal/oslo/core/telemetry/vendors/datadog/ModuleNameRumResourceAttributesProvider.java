package com.paypal.oslo.core.telemetry.vendors.datadog;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/datadog/ModuleNameRumResourceAttributesProvider;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "", "appVersion", "<init>", "(Ljava/lang/String;)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "response", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "", "onProvideAttributes", "(Lokhttp3/Request;Lokhttp3/Response;Ljava/lang/Throwable;)Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ModuleNameRumResourceAttributesProvider implements com.datadog.android.rum.RumResourceAttributesProvider {
    public static final int $stable = 0;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoFpsRanges;

    public ModuleNameRumResourceAttributesProvider(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.getHighSpeedVideoFpsRanges = str;
    }

    @Override // com.datadog.android.rum.RumResourceAttributesProvider
    public final /* bridge */ java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, com.datadog.android.api.instrumentation.network.HttpResponseInfo httpResponseInfo, java.lang.Throwable th) {
        return com.datadog.android.rum.RumResourceAttributesProvider.DefaultImpls.onProvideAttributes(this, httpRequestInfo, httpResponseInfo, th);
    }

    @Override // com.datadog.android.rum.RumResourceAttributesProvider
    public final java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(okhttp3.Request request, okhttp3.Response response, java.lang.Throwable throwable) {
        java.lang.String header$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("appVersion", this.getHighSpeedVideoFpsRanges);
        linkedHashMap.put("clientName", com.paypal.oslo.core.telemetry.vendors.fpti.FPTIClient.COMPONENT);
        java.lang.String str = "ERROR";
        if (throwable == null) {
            kotlin.ranges.IntRange intRange = new kotlin.ranges.IntRange(400, 599);
            java.lang.Integer valueOf = response != null ? java.lang.Integer.valueOf(response.code()) : null;
            if (valueOf == null || !intRange.contains(valueOf.intValue())) {
                str = "INFO";
            }
        }
        linkedHashMap.put("level", str);
        java.lang.String header = request.header(com.paypal.oslo.core.network.http.NetworkConstants.MODULE_NAME_HEADER);
        if (header != null) {
            java.util.List split$default = kotlin.text.StringsKt.split$default((java.lang.CharSequence) header, new java.lang.String[]{"."}, false, 0, 6, (java.lang.Object) null);
            if (split$default.size() >= 3) {
                header = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.CollectionsKt.takeLast(split$default, 3), io.ktor.sse.ServerSentEventKt.COLON, null, null, 0, null, null, 62, null);
            }
            linkedHashMap.put("logger", header);
        }
        if (response != null && (header$default = okhttp3.Response.header$default(response, com.paypal.oslo.core.network.http.NetworkConstants.PAYPAL_DEBUG_ID_HEADER, null, 2, null)) != null) {
            linkedHashMap.put("pp_correlation_id", header$default);
        }
        java.lang.String header2 = request.header(com.paypal.oslo.core.network.graphql.interceptor.OperationTrackingInterceptor.HEADER_OPERATION_NAME);
        if (header2 != null) {
            if (kotlin.text.StringsKt.isBlank(header2)) {
                header2 = null;
            }
            if (header2 != null) {
                linkedHashMap.put("graphql.operation.name", header2);
            }
        }
        java.lang.String header3 = request.header(com.paypal.oslo.core.network.graphql.interceptor.OperationTrackingInterceptor.HEADER_OPERATION_TYPE);
        if (header3 != null) {
            java.lang.String str2 = kotlin.text.StringsKt.isBlank(header3) ? null : header3;
            if (str2 != null) {
                linkedHashMap.put("graphql.operation.type", str2);
            }
        }
        return linkedHashMap;
    }
}
