package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ9\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n2\u0006\u0010\u0005\u001a\u00020\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\r\u0010\u0011"}, d2 = {"Lcom/datadog/android/rum/NoOpRumResourceAttributesProvider;", "Lcom/datadog/android/rum/RumResourceAttributesProvider;", "<init>", "()V", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "request", "Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;", "response", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "", "", "onProvideAttributes", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;Ljava/lang/Throwable;)Ljava/util/Map;", "Lokhttp3/Request;", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;Ljava/lang/Throwable;)Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NoOpRumResourceAttributesProvider implements com.datadog.android.rum.RumResourceAttributesProvider {
    @Override // com.datadog.android.rum.RumResourceAttributesProvider
    @kotlin.Deprecated(message = "Use the variant with HttpRequestInfo/HttpResponseInfo instead")
    public final java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(okhttp3.Request request, okhttp3.Response response, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return kotlin.collections.MapsKt.emptyMap();
    }

    @Override // com.datadog.android.rum.RumResourceAttributesProvider
    public final java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(com.datadog.android.api.instrumentation.network.HttpRequestInfo request, com.datadog.android.api.instrumentation.network.HttpResponseInfo response, java.lang.Throwable throwable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(request, "");
        return kotlin.collections.MapsKt.emptyMap();
    }
}
