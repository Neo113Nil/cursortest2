package com.vungle.ads.internal.network;

/* compiled from: VungleApi.kt */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&JL\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014H&J(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH&J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&J&\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0014H&¨\u0006\u0019"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApi;", "", "ads", "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/AdPayload;", com.ironsource.M6.d0, "", "path", "body", "Lcom/vungle/ads/internal/model/CommonRequestBody;", com.helpshift.proactive.InAppViewConstants.CONFIG, "Lcom/vungle/ads/internal/model/ConfigPayload;", "pingTPAT", "Ljava/lang/Void;", "url", "requestType", "Lcom/vungle/ads/internal/network/HttpMethod;", "headers", "", "requestBody", "Lokhttp3/RequestBody;", "ri", "sendAdMarkup", "sendErrors", "sendMetrics", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public interface VungleApi {
    com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.AdPayload> ads(java.lang.String ua, java.lang.String path, com.vungle.ads.internal.model.CommonRequestBody body);

    com.vungle.ads.internal.network.Call<com.vungle.ads.internal.model.ConfigPayload> config(java.lang.String ua, java.lang.String path, com.vungle.ads.internal.model.CommonRequestBody body);

    com.vungle.ads.internal.network.Call<java.lang.Void> pingTPAT(java.lang.String ua, java.lang.String url, com.vungle.ads.internal.network.HttpMethod requestType, java.util.Map<java.lang.String, java.lang.String> headers, okhttp3.RequestBody requestBody);

    com.vungle.ads.internal.network.Call<java.lang.Void> ri(java.lang.String ua, java.lang.String path, com.vungle.ads.internal.model.CommonRequestBody body);

    com.vungle.ads.internal.network.Call<java.lang.Void> sendAdMarkup(java.lang.String path, okhttp3.RequestBody requestBody);

    com.vungle.ads.internal.network.Call<java.lang.Void> sendErrors(java.lang.String ua, java.lang.String path, okhttp3.RequestBody requestBody);

    com.vungle.ads.internal.network.Call<java.lang.Void> sendMetrics(java.lang.String ua, java.lang.String path, okhttp3.RequestBody requestBody);

    /* compiled from: VungleApi.kt */
    @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ com.vungle.ads.internal.network.Call pingTPAT$default(com.vungle.ads.internal.network.VungleApi vungleApi, java.lang.String str, java.lang.String str2, com.vungle.ads.internal.network.HttpMethod httpMethod, java.util.Map map, okhttp3.RequestBody requestBody, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pingTPAT");
            }
            if ((i & 4) != 0) {
                httpMethod = com.vungle.ads.internal.network.HttpMethod.GET;
            }
            return vungleApi.pingTPAT(str, str2, httpMethod, (i & 8) != 0 ? null : map, (i & 16) != 0 ? null : requestBody);
        }
    }
}
