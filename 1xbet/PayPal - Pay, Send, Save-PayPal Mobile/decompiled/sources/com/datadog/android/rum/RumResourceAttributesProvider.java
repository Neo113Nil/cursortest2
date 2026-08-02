package com.datadog.android.rum;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b2\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H'¢\u0006\u0004\b\n\u0010\u000e"}, d2 = {"Lcom/datadog/android/rum/RumResourceAttributesProvider;", "", "Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;", "request", "Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;", "response", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "", "onProvideAttributes", "(Lcom/datadog/android/api/instrumentation/network/HttpRequestInfo;Lcom/datadog/android/api/instrumentation/network/HttpResponseInfo;Ljava/lang/Throwable;)Ljava/util/Map;", "Lokhttp3/Request;", "Lokhttp3/Response;", "(Lokhttp3/Request;Lokhttp3/Response;Ljava/lang/Throwable;)Ljava/util/Map;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface RumResourceAttributesProvider {
    java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(com.datadog.android.api.instrumentation.network.HttpRequestInfo request, com.datadog.android.api.instrumentation.network.HttpResponseInfo response, java.lang.Throwable throwable);

    @kotlin.Deprecated(message = "Use the variant with HttpRequestInfo/HttpResponseInfo instead")
    java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(okhttp3.Request request, okhttp3.Response response, java.lang.Throwable throwable);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static java.util.Map<java.lang.String, java.lang.Object> onProvideAttributes(com.datadog.android.rum.RumResourceAttributesProvider rumResourceAttributesProvider, com.datadog.android.api.instrumentation.network.HttpRequestInfo httpRequestInfo, com.datadog.android.api.instrumentation.network.HttpResponseInfo httpResponseInfo, java.lang.Throwable th) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpRequestInfo, "");
            return kotlin.collections.MapsKt.emptyMap();
        }
    }
}
