package com.datadog.android.okhttp.internal;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J9\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J9\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\r2\u0006\u0010\b\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0017¢\u0006\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u00018\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/datadog/android/okhttp/internal/RumResourceAttributesProviderCompatibilityAdapter;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "delegate", "Lcom/datadog/android/core/SdkReference;", "sdkReference", "<init>", "(Lcom/datadog/android/rum/RumResourceAttributesProvider;Lcom/datadog/android/core/SdkReference;)V", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "request", "Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;", "response", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "", "", "onProvideAttributes", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;Ljava/lang/Throwable;)Ljava/util/Map;", "Lokhttp3/Request;", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;Ljava/lang/Throwable;)Ljava/util/Map;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "getDelegate$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/rum/RumResourceAttributesProvider;", "Lcom/datadog/android/core/SdkReference;", "getSdkReference$dd_sdk_android_okhttp_release", "()Lcom/datadog/android/core/SdkReference;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RumResourceAttributesProviderCompatibilityAdapter implements com.datadog.android.rum.RumResourceAttributesProvider {
    private final com.datadog.android.rum.RumResourceAttributesProvider delegate;
    private final com.datadog.android.core.SdkReference sdkReference;

    public RumResourceAttributesProviderCompatibilityAdapter(com.datadog.android.rum.RumResourceAttributesProvider rumResourceAttributesProvider, com.datadog.android.core.SdkReference sdkReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rumResourceAttributesProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkReference, "");
        this.delegate = rumResourceAttributesProvider;
        this.sdkReference = sdkReference;
    }

    /* renamed from: getDelegate$dd_sdk_android_okhttp_release, reason: from getter */
    public final com.datadog.android.rum.RumResourceAttributesProvider getDelegate() {
        return this.delegate;
    }

    /* renamed from: getSdkReference$dd_sdk_android_okhttp_release, reason: from getter */
    public final com.datadog.android.core.SdkReference getSdkReference() {
        return this.sdkReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo] */
    @Override // com.datadog.android.rum.RumResourceAttributesProvider
    @kotlin.Deprecated(message = "Use the variant with HttpRequestInfo/HttpResponseInfo instead", replaceWith = @kotlin.ReplaceWith(expression = "onProvideAttributes(OkHttpHttpRequestInfo(request), OkHttpHttpResponseInfo(response, internalLogger), throwable)", imports = {}))
    public final java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(okhttp3.Request request, okhttp3.Response response, java.lang.Throwable throwable) {
        com.datadog.android.api.InternalLogger unbound;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes = this.delegate.onProvideAttributes(request, response, throwable);
        if (!onProvideAttributes.isEmpty()) {
            return onProvideAttributes;
        }
        com.datadog.android.rum.RumResourceAttributesProvider rumResourceAttributesProvider = this.delegate;
        com.datadog.android.okhttp.internal.OkHttpRequestInfo okHttpRequestInfo = new com.datadog.android.okhttp.internal.OkHttpRequestInfo(request);
        if (response != null) {
            com.datadog.android.api.SdkCore sdkCore = this.sdkReference.get();
            r6 = sdkCore instanceof com.datadog.android.api.feature.FeatureSdkCore ? (com.datadog.android.api.feature.FeatureSdkCore) sdkCore : null;
            if (r6 == null || (unbound = r6.getInternalLogger()) == null) {
                unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
            }
            r6 = new com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo(response, unbound);
        }
        return rumResourceAttributesProvider.onProvideAttributes(okHttpRequestInfo, (com.datadog.android.api.instrumentation.network.HttpResponseInfo) r6, throwable);
    }

    @Override // com.datadog.android.rum.RumResourceAttributesProvider
    public final java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(com.datadog.android.api.instrumentation.network.HttpRequestInfo request, com.datadog.android.api.instrumentation.network.HttpResponseInfo response, java.lang.Throwable throwable) {
        okhttp3.Request request2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes = this.delegate.onProvideAttributes(request, response, throwable);
        if (!onProvideAttributes.isEmpty()) {
            return onProvideAttributes;
        }
        com.datadog.android.rum.RumResourceAttributesProvider rumResourceAttributesProvider = this.delegate;
        com.datadog.android.okhttp.internal.OkHttpRequestInfo okHttpRequestInfo = request instanceof com.datadog.android.okhttp.internal.OkHttpRequestInfo ? (com.datadog.android.okhttp.internal.OkHttpRequestInfo) request : null;
        if (okHttpRequestInfo == null || (request2 = okHttpRequestInfo.getRequest()) == null) {
            return kotlin.collections.MapsKt.emptyMap();
        }
        com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo okHttpHttpResponseInfo = response instanceof com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo ? (com.datadog.android.okhttp.internal.OkHttpHttpResponseInfo) response : null;
        return rumResourceAttributesProvider.onProvideAttributes(request2, okHttpHttpResponseInfo != null ? okHttpHttpResponseInfo.getResponse() : null, throwable);
    }
}
