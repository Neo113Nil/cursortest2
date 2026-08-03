package com.unity3d.services.core.network.model;

/* compiled from: HttpResponse.kt */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0002*\u00020\u0004¨\u0006\u0005"}, d2 = {"isSuccessful", "", "Lcom/unity3d/services/core/network/model/HttpResponse;", "toHttpResponse", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HttpResponseKt {
    public static final boolean isSuccessful(com.unity3d.services.core.network.model.HttpResponse httpResponse) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(httpResponse, "<this>");
        int statusCode = httpResponse.getStatusCode();
        return 200 <= statusCode && statusCode < 300;
    }

    public static final com.unity3d.services.core.network.model.HttpResponse toHttpResponse(com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException unityAdsNetworkException) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unityAdsNetworkException, "<this>");
        java.lang.Integer code = unityAdsNetworkException.getCode();
        int intValue = code != null ? code.intValue() : com.ironsource.mediationsdk.logger.IronSourceError.ERROR_NO_INTERNET_CONNECTION;
        java.util.Map emptyMap = kotlin.collections.MapsKt.emptyMap();
        java.lang.String url = unityAdsNetworkException.getUrl();
        java.lang.String str = url == null ? "" : url;
        java.lang.String protocol = unityAdsNetworkException.getProtocol();
        java.lang.String str2 = protocol == null ? "" : protocol;
        java.lang.String client = unityAdsNetworkException.getClient();
        if (client == null) {
            client = "unknown";
        }
        return new com.unity3d.services.core.network.model.HttpResponse("", intValue, emptyMap, str, str2, client, 0L, 64, null);
    }
}
